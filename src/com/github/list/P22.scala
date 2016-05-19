package com.github.list

/**
  *
  * @author Mostafa Asgari
  * Email : mostafa.asg@gmail.com
  * website https://bigdatacode.wordpress.com/
  * @since 5/14/16
  *
  // P22 (*) Create a list containing all integers within a given range.
  //     Example:
  //     scala> range(4, 9)
  //     res0: List[Int] = List(4, 5, 6, 7, 8, 9)
  *   */
object P22 {

  def range( begin : Int , end : Int ) : List[Int] = {

    def internal( curr : Int ) : List[Int] = {

      if ( curr > end )
        Nil
      else
        curr :: internal(curr+1)
    }

    internal( begin )
  }

  def main(args: Array[String]) {

    println( range(4,9) )
    println( range(-5,5) )

  }

}
