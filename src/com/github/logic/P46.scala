package com.github.logic

import S99Logic._

/**
  *
  * @author Mostafa Asgari 
  * @since 5/19/16
  */
object P46 {

  def main(args: Array[String]) {

    println( and(true,true) )
    println( xor(true,true) )
    println("---------------")
    table2((a: Boolean, b: Boolean) => and(a, or(a, b)))

  }

}
