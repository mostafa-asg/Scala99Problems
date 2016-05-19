package com.github.list

/**
  *
  * @author Mostafa Asgari
  * Email : mostafa.asg@gmail.com
  * website https://bigdatacode.wordpress.com/
  * @since 5/11/16
  *
  *
  // P10 (*) Run-length encoding of a list.
  //     Use the result of problem P09 to implement the so-called run-length
  //     encoding data compression method.  Consecutive duplicates of elements are
  //     encoded as tuples (N, E) where N is the number of duplicates of the
  //     element E.
  //
  //     Example:
  //     scala> encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  //     res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
  *  */
object P10 {

  def pack[T]( ls : List[T] ) : List[List[T]] = {

    if( ls.isEmpty )
      List(List())
    else {
      val (packed , next) = ls.span(_ == ls.head)
      if( next == Nil )
        List(packed)
      else
        packed :: pack(next)
    }

  }

  def encode[T]( ls :List[T] ) : List[ (Int,T) ] = {

    val xs = pack(ls)

    xs.map( l => (l.length,l.head) )

  }

  def main(args: Array[String]) {

    println( encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) )

  }

}
