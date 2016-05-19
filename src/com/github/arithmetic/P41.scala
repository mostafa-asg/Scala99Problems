package com.github.arithmetic

import com.github.arithmetic.S99Int._

/**
  *
  * @author Mostafa Asgari
  * Email : mostafa.asg@gmail.com
  * website https://bigdatacode.wordpress.com/
  * @since 5/17/16
  *
  // P41 (**) A list of Goldbach compositions.
  //     Given a range of integers by its lower and upper limit, print a list of
  //     all even numbers and their Goldbach composition.
  //
  //     scala> printGoldbachList(9 to 20)
  //     10 = 3 + 7
  //     12 = 5 + 7
  //     14 = 3 + 11
  //     16 = 3 + 13
  //     18 = 5 + 13
  //     20 = 3 + 17
  //
  //     In most cases, if an even number is written as the sum of two prime
  //     numbers, one of them is very small.  Very rarely, the primes are both
  //     bigger than, say, 50.  Try to find out how many such cases there are in
  //     the range 2..3000.
  //
  //     Example (minimum value of 50 for the primes):
  //     scala> printGoldbachListLimited(1 to 2000, 50)
  //     992 = 73 + 919
  //     1382 = 61 + 1321
  //     1856 = 67 + 1789
  //     1928 = 61 + 1867
  **/
object P41 {

  def printGoldbachList(range : Range) : Unit = {

    range.filter( x => x>2 && x%2==0 ).foreach { x=>

      val g = x.goldbach

      println( x + " = " + g._1 + "+" + g._2 )

    }

  }

  def printGoldbachListLimited(range : Range , min : Int) : Unit = {

    range.filter( x => x>2 && x%2==0 ).foreach { x=>

      val g = x.goldbach

      if( g._1 > min && g._2 > min )
        println( x + " = " + g._1 + "+" + g._2 )

    }

  }

  def main(args: Array[String]) {

    printGoldbachList( 9 to 20 )
    println("-----------------------------")
    printGoldbachListLimited(1 to 2000, 50)

  }

}
