package com.github

import com.github.arithmetic.S99Int._

/**
  *
  * @author Mostafa Asgari
  * Email : mostafa.asg@gmail.com
  * website https://bigdatacode.wordpress.com/
  * @since 5/16/16
  *
  // P33 (*) Determine whether two positive integer numbers are coprime.
  //     Two numbers are coprime if their greatest common divisor equals 1.
  //
  //     scala> 35.isCoprimeTo(64)
  //     res0: Boolean = true
  *     */
object P33 {

  def main(args: Array[String]) {

    println( 35.isCoprimeTo(64) )
    println( 12.isCoprimeTo(18) )

  }

}
