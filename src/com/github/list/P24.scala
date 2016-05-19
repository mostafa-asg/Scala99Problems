package com.github.list

import scala.util.Random

/**
  *
  * @author Mostafa Asgari
  * Email : mostafa.asg@gmail.com
  * website https://bigdatacode.wordpress.com/
  * @since 5/14/16
  *
  // P24 (*) Lotto: Draw N different random numbers from the set 1..M.
  //     Example:
  //     scala> lotto(6, 49)
  //     res0: List[Int] = List(23, 1, 17, 33, 21, 37)
  *    */
object P24 {

  def lotto( n : Int , m : Int ) : List[Int] = {

    val rnd = new Random()

    List.fill(n)(0).map( zero => rnd.nextInt(m)+1 )

  }

  def main(args: Array[String]) {

    println( lotto(6, 49) )

  }

}
