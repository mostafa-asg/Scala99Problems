package com.github

/**
  *
  * @author Mostafa Asgari
  * Email : mostafa.asg@gmail.com
  * website https://bigdatacode.wordpress.com/
  * @since 5/10/16
  *
  *
  // P07 (**) Flatten a nested list structure.
  //     Example:
  //     scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
  //     res0: List[Any] = List(1, 1, 2, 3, 5, 8)
  * */
object P07 {

  def flatten[T]( ls : List[T] ) : List[T] = {

    def internal( result : List[T] , current : List[T] ) : List[T] = current match {
      case Nil => result
      case x :: xs => x match {
        case ys:List[T] => internal( internal( result , ys ) , xs )
        case y:T => internal( y :: result , xs )
      }
    }

    internal( List[T]() , ls ).reverse
  }

  def main(args: Array[String]) {

    println( flatten(List(List(1, 1), 2, List(3, List(5, 8)))) )
    println( flatten(List(List(1, 1), 4 , List('a','b',List(8.1,7.3)) , 2, List(3, List(5, 8)))) )

  }

}
