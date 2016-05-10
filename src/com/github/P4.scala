package com.github

/**
  *
  * @author Mostafa Asgari
  * Email : mostafa.asg@gmail.com
  * website https://bigdatacode.wordpress.com/
  * @since 5/10/16
  *
  *
  // P04 (*) Find the number of elements of a list.
  //     Example:
  //     scala> length(List(1, 1, 2, 3, 5, 8))
  //     res0: Int = 6
  **/
object P4 {

  def length[T]( ls : List[T] ) : Int = {

    def count( acc : Int , ls : List[T] ) : Int = ls match {
      case Nil => acc
      case _ :: tail => count( acc+1 , tail )
    }

    count(0,ls)
  }

  def main(args: Array[String]) {

    println( length(List(1, 1, 2, 3, 5, 8)) )
    println( length(List(85)) )
    println( length(List()) )

  }

}
