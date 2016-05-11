package com.github

/**
  *
  * @author Mostafa Asgari
  * Email : mostafa.asg@gmail.com
  * website https://bigdatacode.wordpress.com/
  * @since 5/11/16
  *
  *
  // P11 (*) Modified run-length encoding.
  //     Modify the result of problem P10 in such a way that if an element has no
  //     duplicates it is simply copied into the result list.  Only elements with
  //     duplicates are transferred as (N, E) terms.
  //
  //     Example:
  //     scala> encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  //     res0: List[Any] = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))
  *  */
object P11 {

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

  def encodeModified[T]( ls : List[T] ) : List[Any] = {

    val xs = pack(ls)

    xs map {
      l => l match {
        case x if x.length == 1 => x.head
        case x => (x.length , x.head)
      }
    }

  }

  def main(args: Array[String]) {

    println( encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) )

  }

}
