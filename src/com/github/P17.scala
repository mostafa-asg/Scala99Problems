package com.github

/**
  *
  * @author Mostafa Asgari
  * Email : mostafa.asg@gmail.com
  * website https://bigdatacode.wordpress.com/
  * @since 5/12/16
  *
  *
  // P17 (*) Split a list into two parts.
  //     The length of the first part is given.  Use a Tuple for your result.
  //
  //     Example:
  //     scala> split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  //     res0: (List[Symbol], List[Symbol]) = (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))  *  */
object P17 {

  def split[T](n : Int , ls : List[T]) : (List[T],List[T]) = {

    def doSplit( start : Int , end : Int , ls : List[T] ) : List[T] = {

      def internal( start : Int , end : Int , currItem : Int , ls :List[T] ) : List[T] = (start,end,currItem,ls) match {
        case (_,_,_,Nil) => Nil
        case (s,e,c,head::tail) if c < s => internal( s , e , c+1 , tail )
        case (s,e,c,head::tail) if s<=e && c>=s && c<=e => head :: internal(s+1,e,c+1,tail)
        case _ => Nil
      }

      internal( start , end , 1 , ls )
    }

    val leftList = doSplit(1,n,ls)
    val rightList = doSplit(n+1,ls.size,ls)

    (leftList,rightList)
  }

  def main(args: Array[String]) {

    println( split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) )
    println( split(3, List('a, 'b, 'c)) )
    println( split(0, List('a, 'b, 'c)) )
    println( split(1, List('a, 'b, 'c)) )

  }

}
