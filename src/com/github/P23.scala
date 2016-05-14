package com.github

import scala.util.Random

/**
  *
  * @author Mostafa Asgari
  * Email : mostafa.asg@gmail.com
  * website https://bigdatacode.wordpress.com/
  * @since 5/14/16
  *
  // P23 (**) Extract a given number of randomly selected elements from a list.
  //     Example:
  //     scala> randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h))
  //     res0: List[Symbol] = List('e, 'd, 'a)
  //
  //     Hint: Use the answer to P20.
  *   */
object P23 {123

  def randomSelect[T](num : Int , ls : List[T]) : List[T] = {

    val rnd = new Random

    val indexes = List.fill(num)(0).map( zero => rnd.nextInt( ls.size ) )

    indexes.map( i => ls(i) )

  }

  def main(args: Array[String]) {

    println( randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h)) )

  }

}
