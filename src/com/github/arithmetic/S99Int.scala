package com.github.arithmetic

/**
  *
  * @author mostafa 
  * @since 5/15/16
  */
class S99Int(val num : Int) {

  import S99Int._

  def isPrime() : Boolean = {

    !List.range(2, Math.sqrt(num).ceil.toInt+1).exists( n => num!=n && num%n==0 )

  }

  def isCoprimeTo(other : Int) : Boolean = {

    gcd(num,other) match {
      case 1 => true
      case _ => false
    }

  }

  def totient() : Int = {

    List.range(1,num+1).map( k => gcd(num,k) ).count( _ == 1 )

  }

  def primeFactors() : List[Int] = {

    def internal( n:Int , primes : Stream[Int] ) : List[Int] = {

      (n,primes) match {

        case (n , _) if n == 1 => Nil
        case (n, head #:: tail) if (n%head==0) => head :: internal(n/head , primes)
        case (n, head #:: tail) => internal( n , tail)

      }

    }

    internal(num , primes)
  }

  def primeFactorMultiplicity_list() : List[(Int,Int)] = {

    def distinctList[T](ls : List[T]) : List[List[T]] = ls match {

      case Nil => Nil
      case head :: tail => {
        val sp = ls.span( i => i == head )
        sp._1 :: distinctList( sp._2 )
      }

    }

    val primeFactorList = primeFactors()

    val olagh = distinctList( primeFactorList )

    distinctList( primeFactorList ).map( ls => (ls.head,ls.size) )
  }

  def primeFactorMultiplicity_map() : Map[Int,Int] = {

    val primeFactorList = primeFactors()

    primeFactorList.groupBy( i => i ).map( kv => kv._1 -> kv._2.size )

  }

  def goldbach() : (Int,Int) = {

    def check[T]( num : T , ls : List[T] )(f : (T,T) => Boolean ) : Option[ (T,T) ] = {
      ls match {
        case Nil => None
        case head :: tail => {
          if ( f(num,head) )
            Some( (num,head) )
          else
            check( num , tail ) (f)
        }
      }
    }

    def primeBetween(a:Int,b:Int) : List[Int] = {
      List.range(a,b+1).filter( x=> x.isPrime )
    }

    def doGoldbach( ls : List[Int] ) : (Int,Int) = ls match {

      case head :: tail => {
        check(head,ls)( (a,b) => a+b == num) match {
          case Some(tuple) => (tuple._1,tuple._2)
          case None => doGoldbach( tail )
        }
      }

      case _ => throw new RuntimeException("could not find goldbach for " + num)

    }

    assert( num>2 &&  num % 2 == 0 )
    doGoldbach(primeBetween(2,num))
  }

}

object S99Int {

  implicit def intToS99Int(n : Int) : S99Int = new S99Int(n)

  val primes = Stream.cons(2, Stream.from(3, 2) filter { _.isPrime })

  def gcd( a : Int , b : Int ) : Int = {

    assert( a >= 0 )
    assert( b >= 0 )

    (a,b) match {
      case (_,0) => a
      case _ => gcd( b , a%b )
    }
  }

}
