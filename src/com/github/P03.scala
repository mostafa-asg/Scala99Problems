package com.github

/**
  *
  * @author Mostafa Asgari
  * Email : mostafa.asg@gmail.com
  * website https://bigdatacode.wordpress.com/
  * @since 5/10/16
  *
  *
  //     P03 (*) Find the Kth element of a list.
  //     By convention, the first element in the list is element 0.
  //
  //     Example:
  //     scala> nth(2, List(1, 1, 2, 3, 5, 8))
  //     res0: Int = 2
  **/
object P03 {

  def nth[T]( n : Int , ls : List[T] ) : T = {

    def nth[T]( current : Int , head : T , tail : List[T] ) : T = {

      if( current > n || current >= ls.size )
        throw new NoSuchElementException

      if( current == n )
        head
      else {
        nth( current+1 , tail.head , tail.tail )
      }

    }

    if( ls.isEmpty )
      throw new NoSuchElementException

    nth( 0 , ls.head , ls.tail )
  }

  //==========================================
  // Using builtin Scala functions
  //==========================================
  //  def nth[T](n : Int , ls : List[T]) : T = {
  //    ls(n)
  //  }

  def main(args: Array[String]) {

    println( nth(2, List(1, 1, 2, 3, 5, 8)) )
    println( nth(0, List(25,14,17,85)) )
    println( nth(1, List(25,14,17,85)) )
    println( nth(2, List(25,14,17,85)) )
    println( nth(3, List(25,14,17,85)) )

    //must be throw NoSuchElementException
    //println( nth(4, List(25,14,17,85)) )

  }

}
