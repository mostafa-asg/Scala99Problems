package com.github.list

/**
  *
  * @author Mostafa Asgari
  * Email : mostafa.asg@gmail.com
  * website https://bigdatacode.wordpress.com/
  * @since 5/11/16
  *
  *
  // P08 (**) Eliminate consecutive duplicates of list elements.
  //     If a list contains repeated elements they should be replaced with a
  //     single copy of the element.  The order of the elements should not be
  //     changed.
  //
  //     Example:
  //     scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  //     res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
  *  */
object P08 {

  def compress[T](ls : List[T]) : List[T] = {

    def doCompress( result : List[T] , current : List[T] , lastItem : Option[T] ) : List[T] = (lastItem,current) match {

      case ( _ , Nil ) => result
      case ( (ch:Some[T]) , h :: tail) if ch.get == h => doCompress( result , tail , Some(h) )
      case ( _ , h :: tail ) => doCompress( h::result , tail , Some(h) )

    }

    doCompress(List[T](),ls,None).reverse
  }

  def main(args: Array[String]) {

    println( compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) )
    println( compress(List(1,1,1,1,2,2,2,3,4,5,6,4,5,6,6,6)) )
    println( compress(List(1,1,1)) )

  }

}
