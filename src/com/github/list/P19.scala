package com.github.list

/**
  *
  * @author Mostafa Asgari
  * Email : mostafa.asg@gmail.com
  * website https://bigdatacode.wordpress.com/
  * @since 5/12/16
  *
  *
  *        // P19 (**) Rotate a list N places to the left.
  *        //     Examples:
  *        //     scala> rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  *        //     res0: List[Symbol] = List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)
  *        //
  *        //     scala> rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  *        //     res1: List[Symbol] = List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)
  *  */
object P19 {

  def rotateLeft[T]( ls : List[T] ) : List[T] = {
    ls.drop(1) ::: List(ls.head)
  }

  def rotateRight[T]( ls : List[T] ) : List[T] = {
    ls.last :: ls.take( ls.size-1 )
  }

  def rotate[T]( n : Int , ls : List[T] ) = {

    var list = ls

    n match {

      case x if x > 0 => {
        for (i <- 1 to x)
          list = rotateLeft(list)
      }

      case x if x < 0 => {
        for (i <- 1 to Math.abs(x))
          list = rotateRight(list)
      }
    }

    list
  }

  def main(args: Array[String]) {

    println( rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) )
    println( rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) )

  }

}
