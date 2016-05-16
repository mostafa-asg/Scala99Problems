package com.github

import com.github.arithmetic.S99Int._

/**
  *
  * @author mostafa 
  * @since 5/15/16
  */
object P31 {

  def main(args: Array[String]) {

    for( i <- 2 to 100 )
      println( i + " is prime? : " + i.isPrime() )

  }

}
