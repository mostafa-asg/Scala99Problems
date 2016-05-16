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
