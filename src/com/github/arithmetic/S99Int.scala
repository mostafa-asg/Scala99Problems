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

}

object S99Int {

  implicit def intToS99Int(n : Int) : S99Int = new S99Int(n)

  def gcd( a : Int , b : Int ) : Int = {

    assert( a >= 0 )
    assert( b >= 0 )

    (a,b) match {
      case (_,0) => a
      case _ => gcd( b , a%b )
    }
  }

}
