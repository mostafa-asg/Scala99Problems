package com.github

import com.github.arithmetic.S99Int._

/**
  *
  * @author Mostafa Asgari
  * Email : mostafa.asg@gmail.com
  * website https://bigdatacode.wordpress.com/
  * @since 5/16/16
  *
  // P36 (**) Determine the prime factors of a given positive integer (2).
  //     Construct a list containing the prime factors and their multiplicity.
  //
  //     scala> 315.primeFactorMultiplicity
  //     res0: List[(Int, Int)] = List((3,2), (5,1), (7,1))
  //
  //     Alternately, use a Map for the result.
  //     scala> 315.primeFactorMultiplicity
  //     res0: Map[Int,Int] = Map(3 -> 2, 5 -> 1, 7 -> 1)
  *     */
object P36 {

  def main(args: Array[String]) {

    println( 315.primeFactorMultiplicity_list )
    println( 315.primeFactorMultiplicity_map )

  }

}
