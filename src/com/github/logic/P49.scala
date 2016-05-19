package com.github.logic

/**
  *
  * @author Mostafa Asgari
  * Email : mostafa.asg@gmail.com
  * website https://bigdatacode.wordpress.com/
  * @since 5/19/16
  *
  // P49 (**) Gray code.
  //     An n-bit Gray code is a sequence of n-bit strings constructed according
  //     to certain rules. For example,
  //     n = 1: C(1) = ("0", "1").
  //     n = 2: C(2) = ("00", "01", "11", "10").
  //     n = 3: C(3) = ("000", "001", "011", "010", "110", "111", "101", "100").
  //
  //     Find out the construction rules and write a function to generate Gray
  //     codes.
  //
  //     scala> gray(3)
  //     res0 List[String] = List(000, 001, 011, 010, 110, 111, 101, 100)
  //
  //     See if you can use memoization to make the function more
  //     efficient.
  *
  */
object P49 {

  def gray(n : Int) : List[String] = n match {

    case 1 => List("0","1")
    case x if x > 1 => {

      val grayPrev = gray(n-1)

      grayPrev.map( s => "0" + s ) ::: grayPrev.reverse.map( s => "1" + s)

    }

  }

  def main(args: Array[String]) {

    println( gray(1) )
    println( gray(2) )
    println( gray(3) )
    println( gray(4) )

  }

}
