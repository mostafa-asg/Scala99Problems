package com.github

/**
  *
  * @author Mostafa Asgari
  * Email : mostafa.asg@gmail.com
  * website https://bigdatacode.wordpress.com/
  * @since 5/10/16
  *
  *
  // P06 (*) Find out whether a list is a palindrome.
  //     Example:
  //     scala> isPalindrome(List(1, 2, 3, 2, 1))
  //     res0: Boolean = true
  **/
object P06 {

//=======================================================================
// ONE WAY
// =======================================================================
//  def isPalindrome[T](ls : List[T]) : Boolean = {
//
//    val rev = ls.reverse
//
//    return ls == rev
//
//  }
// =======================================================================

  def isPalindrome[T](ls : List[T]) : Boolean = {

    def check( ls : List[T] ) : Boolean = ls match {
      case Nil => true
      case _ :: Nil => true
      case head :: tail if head == tail.last => check( tail.init )
      case _ => false
    }

    check( ls )
  }

  def main(args: Array[String]) {

    println( isPalindrome(List(1, 2, 3, 2, 1)) )
    println( isPalindrome(List(4, 5, 5, 4)) )
    println( isPalindrome(List(4, 4, 5, 4)) )
    println( isPalindrome(List(1)) )

  }

}
