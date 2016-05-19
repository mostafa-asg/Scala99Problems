package com.github.list

/**
  *
  * @author Mostafa Asgari
  * Email : mostafa.asg@gmail.com
  * website https://bigdatacode.wordpress.com/
  * @since 5/12/16
  *
  *
  // P16 (**) Drop every Nth element from a list.
  //     Example:
  //     scala> drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  //     res0: List[Symbol] = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
  *  */
object P16 {

  def drop[T]( n : Int , ls : List[T] ) : List[T] = {

    ls.zipWithIndex.filterNot {
      case (item,index) if (index+1) % n == 0 => true
      case _ => false
    }.map( x => x._1 )

  }

  def main(args: Array[String]) {

    println( drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) )

  }

}
