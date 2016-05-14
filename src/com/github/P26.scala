package com.github

/**
  *
  * @author Mostafa Asgari
  * Email : mostafa.asg@gmail.com
  * website https://bigdatacode.wordpress.com/
  * @since 5/14/16
  *
  // P26 (**) Generate the combinations of K distinct objects chosen from the N
  //          elements of a list.
  //     In how many ways can a committee of 3 be chosen from a group of 12
  //     people?  We all know that there are C(12,3) = 220 possibilities (C(N,K)
  //     denotes the well-known binomial coefficient).  For pure mathematicians,
  //     this result may be great.  But we want to really generate all the possibilities.
  //
  //     Example:
  //     scala> combinations(3, List('a, 'b, 'c, 'd, 'e, 'f))
  //     res0: List[List[Symbol]] = List(List('a, 'b, 'c), List('a, 'b, 'd), List('a, 'b, 'e), ...
  *    */
object P26 {

  def combine[T]( ls1 : List[T] , ls2 : List[T] ) : List[List[T]] = (ls1,ls2) match {

    case (Nil,l) => l.map( i => List(i) )
    case (l1 , l2) => l2.map( i=> l1 ::: List(i) )

  }

  def combinations[T](k : Int , ls : List[T]) : List[List[T]] = ls match {

    case Nil => Nil
    case _ :: rest => combine( ls.take(k-1) , ls.drop(k-1) ) ::: combinations( k , rest )

  }

  def main(args: Array[String]) {

    println(combinations(3, List('a, 'b, 'c, 'd, 'e, 'f)))

  }

}
