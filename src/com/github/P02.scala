package com.github

/**
  *
  * @author Mostafa Asgari 
  * @since 5/10/16
  *
  **/
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
