package com.github.arithmetic

import com.github.arithmetic.S99Int._

/**
  *
  * @author Mostafa Asgari
  * Email : mostafa.asg@gmail.com
  * website https://bigdatacode.wordpress.com/
  * @since 5/17/16
  *
  // P39 (*) A list of prime numbers.
  //     Given a range of integers by its lower and upper limit, construct a list
  //     of all prime numbers in that range.
  //
  //     scala> listPrimesinRange(7 to 31)
  //     res0: List[Int] = List(7, 11, 13, 17, 19, 23, 29, 31)
  *      */
object P39 {

  def listPrimesinRange(range: Range) : List[Int] = {

    range.filterNot( x => x%2 == 0 ).filter( x => x.isPrime ).toList

  }

  def main(args: Array[String]) {

    println( listPrimesinRange(7 to 31) )

  }

}
