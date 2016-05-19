package com.github.list

/**
  *
  * @author Mostafa Asgari
  * Email : mostafa.asg@gmail.com
  * website https://bigdatacode.wordpress.com/
  * @since 5/11/16
  *
  *
  // P15 (**) Duplicate the elements of a list a given number of times.
  //     Example:
  //     scala> duplicateN(3, List('a, 'b, 'c, 'c, 'd))
  //     res0: List[Symbol] = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
  * */
object P15 {

  def duplicateN[T]( n : Int , ls : List[T] ) : List[T] = {

    ls.flatMap( i => List.fill(n)(i) )

  }

  def main(args: Array[String]) {

    println( duplicateN(3, List('a, 'b, 'c, 'c, 'd)) )

  }

}
