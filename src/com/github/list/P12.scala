package com.github.list

/**
  *
  * @author Mostafa Asgari
  * Email : mostafa.asg@gmail.com
  * website https://bigdatacode.wordpress.com/
  * @since 5/11/16
  *
  *
  // P12 (**) Decode a run-length encoded list.
  //     Given a run-length code list generated as specified in problem P10,
  //     construct its uncompressed version.
  //
  //     Example:
  //     scala> decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
  //     res0: List[Symbol] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
  *  */
object P12 {

  def decode[T]( ls : List[(Int,T)] ) : List[T] = {

     ls.flatMap( t => List.fill(t._1)(t._2) )

  }

  def main(args: Array[String]) {

    println( decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))) )

  }

}
