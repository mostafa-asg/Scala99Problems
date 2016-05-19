package com.github.arithmetic

/**
  *
  * @author Mostafa Asgari
  * Email : mostafa.asg@gmail.com
  * website https://bigdatacode.wordpress.com/
  * @since 5/16/16
  *
  // P32 (**) Determine the greatest common divisor of two positive integer
  //          numbers.
  //     Use Euclid's algorithm.
  //
  //     scala> gcd(36, 63)
  //     res0: Int = 9
  *    */
object P32 {

  def gcd( a : Int , b : Int ) : Int = {

    assert( a >= 0 )
    assert( b >= 0 )

    (a,b) match {
      case (_,0) => a
      case _ => gcd( b , a%b )
    }
  }

  def main(args: Array[String]) {

    println( gcd(18,12) )
    println( gcd(36,63) )

  }

}
