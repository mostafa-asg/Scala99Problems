package com.github

/**
  *
  * @author Mostafa Asgari
  * Email : mostafa.asg@gmail.com
  * website https://bigdatacode.wordpress.com/
  * @since 5/11/16
  *
  *
  // P13 (**) Run-length encoding of a list (direct solution).
  //     Implement the so-called run-length encoding data compression method
  //     directly.  I.e. don't use other methods you've written (like P09's
  //     pack); do all the work directly.
  //
  //     Example:
  //     scala> encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  //     res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
  *  */

object P13 {

  def encodeDirect[T]( ls : List[T] ) : List[ (Int,T) ] = {

    if ( ls.isEmpty )
      List()
    else {

      val (packed , next) = ls.span( _ == ls.head )

      if( next == Nil )
        List( (packed.length,packed.head) )
      else
        (packed.length,packed.head) :: encodeDirect(next)
    }

  }

  def main(args: Array[String]) {

    println( encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) )

  }

}
