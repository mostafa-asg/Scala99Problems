package com.github.arithmetic

import com.github.arithmetic.S99Int._

/**
  *
  * @author Mostafa Asgari
  * Email : mostafa.asg@gmail.com
  * website https://bigdatacode.wordpress.com/
  * @since 5/16/16
  *
  // P34 (**) Calculate Euler's totient function phi(m).
  //     Euler's so-called totient function phi(m) is defined as the number of
  //     positive integers r (1 <= r < m) that are coprime to m.  As a special
  //     case, phi(1) is defined to be 1.
  //
  //     scala> 10.totient
  //     res0: Int = 4
  *    */
object P34 {

  def main(args: Array[String]) {

    println( 10.totient )

  }

}
