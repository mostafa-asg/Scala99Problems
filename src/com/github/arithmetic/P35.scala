package com.github.arithmetic

import com.github.arithmetic.S99Int._

/**
  *
  * @author Mostafa Asgari
  * Email : mostafa.asg@gmail.com
  * website https://bigdatacode.wordpress.com/
  * @since 5/16/16
  *
  // P35 (**) Determine the prime factors of a given positive integer.
  //     Construct a flat list containing the prime factors in ascending order.
  //
  //     scala> 315.primeFactors
  //     res0: List[Int] = List(3, 3, 5, 7)
  *     */
object P35 {

  def main(args: Array[String]) {

    println( 315.primeFactors )
    println( 85.primeFactors )
    println( 8585.primeFactors )
    println( 858585.primeFactors )
    println( 85858585.primeFactors )

  }

}
