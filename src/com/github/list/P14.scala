package com.github.list

/**
  *
  * @author Mostafa Asgari
  * Email : mostafa.asg@gmail.com
  * website https://bigdatacode.wordpress.com/
  * @since 5/11/16
  *
  *
  // P14 (*) Duplicate the elements of a list.
  //     Example:
  //     scala> duplicate(List('a, 'b, 'c, 'c, 'd))
  //     res0: List[Symbol] = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
  *   */
object P14 {

  def duplicate[T]( ls : List[T] ) : List[T] = ls match {
    case Nil => Nil
    case h :: t => h :: h :: duplicate(t)
  }

  def main(args: Array[String]) {
    println(duplicate(List('a, 'b, 'c, 'c, 'd)))
  }

}
