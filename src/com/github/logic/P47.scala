package com.github.logic

import S99Logic._

/**
  *
  * @author Mostafa Asgari
  * Email : mostafa.asg@gmail.com
  * website https://bigdatacode.wordpress.com/
  * @since 5/19/16
  *
  // P47 (*) Truth tables for logical expressions (2).
  //     Continue problem P46 by redefining and, or, etc as operators.  (i.e. make
  //     them methods of a new class with an implicit conversion from Boolean.)
  //     not will have to be left as a object method.
  //
  //     scala> table2((a: Boolean, b: Boolean) => a and (a or not(b)))
  //     A     B     result
  //     true  true  true
  //     true  false true
  //     false true  false
  //     false false false
  *
  */
object P47 {

  def main(args: Array[String]) {

    println( table2( (a,b) => a and (a or not(b))))

  }

}
