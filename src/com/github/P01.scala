package com.github

/**
  *
  * @author Mostafa Asgari
  * Email : mostafa.asg@gmail.com
  * website https://bigdatacode.wordpress.com/
  * @since 5/10/16
  *
  *
  *  P01 (*) Find the last element of a list.
  *  Example:
  *  scala> last(List(1, 1, 2, 3, 5, 8))
  *  res0: Int = 8
  **/
object P01 {

  def last[T]( ls : List[T] ) : T = ls match {

    case x :: Nil => x
    case x :: xs => last(xs)
    case Nil => throw new NoSuchMethodException()

  }

  def main(args: Array[String]) {

    println( last(List(1, 1, 2, 3, 5, 8)) )

  }

}
