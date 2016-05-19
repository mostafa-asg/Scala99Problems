package com.github.list

/**
  *
  * @author Mostafa Asgari
  * Email : mostafa.asg@gmail.com
  * website https://bigdatacode.wordpress.com/
  * @since 5/10/16
  *
  *
  // P05 (*) Reverse a list.
  //     Example:
  //     scala> reverse(List(1, 1, 2, 3, 5, 8))
  //     res0: List[Int] = List(8, 5, 3, 2, 1, 1)
  **/
object P05 {

  def reverse[T](ls : List[T]) : List[T] = ls match {
    case Nil => Nil
    case x :: Nil => ls
    case x :: xs => reverse(xs) ::: List(x)
  }

  def main(args: Array[String]) {

    println( reverse(List(1, 1, 2, 3, 5, 8)) )
    println( reverse(List(1,2,3,4,5)) )
    println( reverse(List(1)) )
    println( reverse(List()) )

  }

}
