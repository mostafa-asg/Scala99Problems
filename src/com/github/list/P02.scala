package com.github.list

/**
  *
  * @author Mostafa Asgari
  * Email : mostafa.asg@gmail.com
  * website https://bigdatacode.wordpress.com/
  * @since 5/10/16
  *
  *
  *    P02 (*) Find the last but one element of a list.
  *    Example:
  *    scala> penultimate(List(1, 1, 2, 3, 5, 8))
  *   res0: Int = 5
  *
  *   **/
object P02 {

  def penultimate[T]( xs : List[T] ) : T = xs match {

    case x :: y :: Nil => x
    case _ :: xs => penultimate(xs)
    case Nil => throw new NoSuchElementException

  }

  def main(args: Array[String]) {

    println( penultimate(List(1,2)) )
    println( penultimate(List(1,2,3,4,5)) )

    // bellow line will throws NoSuchElementException
    // println( penultimate(List(1)) )
  }

}
