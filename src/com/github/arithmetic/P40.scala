package com.github.arithmetic

import com.github.arithmetic.S99Int._

/**
  *
  * @author Mostafa Asgari
  * Email : mostafa.asg@gmail.com
  * website https://bigdatacode.wordpress.com/
  * @since 5/17/16
  *
  // P40 (**) Goldbach's conjecture.
  //     Goldbach's conjecture says that every positive even number greater than 2
  //     is the sum of two prime numbers.  E.g. 28 = 5 + 23.  It is one of the
  //     most famous facts in number theory that has not been proved to be correct
  //     in the general case.  It has been numerically confirmed up to very large
  //     numbers (much larger than Scala's Int can represent).  Write a function
  //     to find the two prime numbers that sum up to a given even integer.
  //
  //     scala> 28.goldbach
  //     res0: (Int, Int) = (5,23)
  **/
object P40 {

  def main(args: Array[String]) {

    for(i <- Range(4,100,2) ){

      val t = i.goldbach

      println( i + " = " + t._1 + "+" + t._2  )

    }


  }

}
