package com.github.list

/**
  *
  * @author Mostafa Asgari
  * Email : mostafa.asg@gmail.com
  * website https://bigdatacode.wordpress.com/
  * @since 5/14/16
  *
  // P21 (*) Insert an element at a given position into a list.
  //     Example:
  //     scala> insertAt('new, 1, List('a, 'b, 'c, 'd))
  //     res0: List[Symbol] = List('a, 'new, 'b, 'c, 'd)  *
  *   */
object P21 {

  def insertAt[T]( newItem : T , index : Int , ls : List[T] ) : List[T] = {

    val split = ls.splitAt( index )

    split._1 ::: ( newItem :: split._2 )

  }

  def main(args: Array[String]) {

    println( insertAt('new, 3, List('a, 'b, 'c, 'd)) )

  }

}
