package com.github.list

/**
  *
  * @author Mostafa Asgari
  * Email : mostafa.asg@gmail.com
  * website https://bigdatacode.wordpress.com/
  * @since 5/12/16
  *
  *
  // P20 (*) Remove the Kth element from a list.
  //     Return the list and the removed element in a Tuple.  Elements are
  //     numbered from 0.
  //
  //     Example:
  //     scala> removeAt(1, List('a, 'b, 'c, 'd))
  //     res0: (List[Symbol], Symbol) = (List('a, 'c, 'd),'b)
  *   */
object P20 {

  def removeAt[T]( index : Int , ls : List[T] ) : (List[T],T) = {

    assert( ls.isEmpty == false )
    assert( index>=0 && index<ls.size )

    def internal(currentIndex:Int,
                 originalList : List[T] ,
                 newList : List[T] ,
                 removedItem : Option[T]) : (List[T],T) = (currentIndex,originalList,newList,removedItem) match {

      case (_,Nil,newList,removedItem) => ( newList.reverse , removedItem.get )
      case (currentIndex,h::t,newList,removedItem) if currentIndex==index => internal( currentIndex+1 , t , newList , Some(h) )
      case (currentIndex,h::t,newList,removedItem) => internal( currentIndex+1 , t , h::newList , removedItem )

    }

    internal( 0 , ls , List[T]() , None )

  }

  def main(args: Array[String]) {

    println( removeAt(1, List('a, 'b, 'c, 'd)) )

  }

}
