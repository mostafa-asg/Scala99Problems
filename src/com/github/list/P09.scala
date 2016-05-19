package com.github.list

/**
  *
  * @author Mostafa Asgari
  * Email : mostafa.asg@gmail.com
  * website https://bigdatacode.wordpress.com/
  * @since 5/11/16
  *
  *
  // P09 (**) Pack consecutive duplicates of list elements into sublists.
  //     If a list contains repeated elements they should be placed in separate
  //     sublists.
  //
  //     Example:
  //     scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  //     res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
  *  */
object P09 {

  def pack[T]( ls : List[T] ) : List[List[T]] = {

    def doPack( result : List[List[T]] , lsItem : List[T] , currentList : List[T] ) : List[List[T]] = currentList match {

      case Nil => result.reverse
      case head :: Nil => doPack( (head::lsItem) :: result , List[T]() , Nil )
      case head :: tail if head != tail.head => doPack( (head::lsItem) :: result , List[T]() , tail )
      case head :: tail => doPack( result , head::lsItem , tail )

    }

    doPack( List[List[T]]() , List[T]() , ls )
  }

  def main(args: Array[String]) {

    println(pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
    println(pack(List(1,2,3,4)))
    println(pack(List(1,1,1,1)))
    println(pack(List[Int]()))

  }

}
