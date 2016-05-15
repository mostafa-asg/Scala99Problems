package com.github

/**
  *
  * @author Mostafa Asgari
  * Email : mostafa.asg@gmail.com
  * website https://bigdatacode.wordpress.com/
  * @since 5/14/16
  *
  *        // P26 (**) Generate the combinations of K distinct objects chosen from the N
  *        //          elements of a list.
  *        //     In how many ways can a committee of 3 be chosen from a group of 12
  *        //     people?  We all know that there are C(12,3) = 220 possibilities (C(N,K)
  *        //     denotes the well-known binomial coefficient).  For pure mathematicians,
  *        //     this result may be great.  But we want to really generate all the possibilities.
  *        //
  *        //     Example:
  *        //     scala> combinations(3, List('a, 'b, 'c, 'd, 'e, 'f))
  *        //     res0: List[List[Symbol]] = List(List('a, 'b, 'c), List('a, 'b, 'd), List('a, 'b, 'e), ...
  *    */
object P26 {

  def combinations[T](k : Int , ls : List[T]) : List[List[T]] = (k,ls) match {

      case (1, ls) => ls.map(List(_))
      case (k, ls) if k == ls.size => List(ls)
      case (k, head :: tail) => combinations(k - 1, tail).map( head :: _ ) ::: combinations(k,tail)

  }

  def main(args: Array[String]) {

    assert( 20 == combinations(3,List('a, 'b, 'c, 'd, 'e, 'f)).size )
    assert( 220 == combinations(3,List.range(1,13)).size )

    println( combinations(3, List(1,2,3,4,5)) )

  }

}
