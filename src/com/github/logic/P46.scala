package com.github.logic

import S99Logic._

/**
  *
  * @author Mostafa Asgari
  * Email : mostafa.asg@gmail.com
  * website https://bigdatacode.wordpress.com/
  * @since 5/19/16
  *
  // P46 (**) Truth tables for logical expressions.
  //     Define functions and, or, nand, nor, xor, impl, and equ (for logical
  //     equivalence) which return true or false according to the result of their
  //     respective operations; e.g. and(A, B) is true if and only if both A and B
  //     are true.
  //
  //     scala> and(true, true)
  //     res0: Boolean = true
  //
  //     scala> xor(true. true)
  //     res1: Boolean = false
  //
  //     A logical expression in two variables can then be written as a function of
  //     two variables, e.g: (a: Boolean, b: Boolean) => and(or(a, b), nand(a, b))
  //
  //     Now, write a function called table2 which prints the truth table of a
  //     given logical expression in two variables.
  //
  //     scala> table2((a: Boolean, b: Boolean) => and(a, or(a, b)))
  //     A     B     result
  //     true  true  true
  //     true  false true
  //     false true  false
  //     false false false

  // The trick here is not using builtins.  We'll define `not`, `and`, and `or`
  // directly (using pattern matching), and the other functions in terms of those
  // three.
  *
  */
object P46 {

  def main(args: Array[String]) {

    println( and(true,true) )
    println( xor(true,true) )
    println("---------------")
    table2((a: Boolean, b: Boolean) => and(a, or(a, b)))

  }

}
