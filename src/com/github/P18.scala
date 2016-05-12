package com.github

/**
  *
  * @author Mostafa Asgari
  * Email : mostafa.asg@gmail.com
  * website https://bigdatacode.wordpress.com/
  * @since 5/12/16
  *
  *
  // P18 (**) Extract a slice from a list.
  //     Given two indices, I and K, the slice is the list containing the elements
  //     from and including the Ith element up to but not including the Kth
  //     element of the original list.  Start counting the elements with 0.
  //
  //     Example:
  //     scala> slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  //     res0: List[Symbol] = List('d, 'e, 'f, 'g)
  * */
object P18 {

  def slice[T]( start : Int , end : Int , ls : List[T] ) : List[T] = {

    ls.take( end ).drop( start )

  }

  def main(args: Array[String]) {

    println( slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) )
    println( slice(0,3,List(1,2,3)) )
    println( slice(1,3,List(1,2,3)) )
    println( slice(1,2,List(1,2,3)) )

  }

}
