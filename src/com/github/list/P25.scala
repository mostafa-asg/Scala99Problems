package com.github.list

import scala.util.Random

/**
  *
  * @author Mostafa Asgari
  * Email : mostafa.asg@gmail.com
  * website https://bigdatacode.wordpress.com/
  * @since 5/14/16
  *
  // P25 (*) Generate a random permutation of the elements of a list.
  //     Hint: Use the solution of problem P23.
  //
  //     Example:
  //     scala> randomPermute(List('a, 'b, 'c, 'd, 'e, 'f))
  //     res0: List[Symbol] = List('b, 'a, 'd, 'c, 'e, 'f)
  *    */
object P25 {

  def removeAt[A](n: Int, ls: List[A]): (List[A], A) = ls.splitAt(n) match {
    case (Nil, _) if n < 0 => throw new NoSuchElementException
    case (pre, e :: post)  => (pre ::: post, e)
    case (pre, Nil)        => throw new NoSuchElementException
  }

  def randomPermute[T]( ls : List[T] ) : List[T] = ls match {

    case Nil => Nil
    case _ => {

      val (rest , item) = removeAt( (new Random).nextInt( ls.size ) , ls )

      item :: randomPermute( rest )

    }

  }

  def main(args: Array[String]) {

    println( randomPermute(List('a, 'b, 'c, 'd, 'e, 'f)) )

  }

}
