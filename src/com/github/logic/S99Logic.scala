package com.github.logic

/**
  *
  * @author Mostafa Asgari
  * Email : mostafa.asg@gmail.com
  * website https://bigdatacode.wordpress.com/
  * @since 5/19/16
  */

class S99Logic(a:Boolean) {

  def and(b:Boolean) = S99Logic.and(a,b)
  def or(b:Boolean) = S99Logic.or(a,b)
  def xor(b:Boolean) = S99Logic.xor(a,b)
  def nand(b:Boolean) = S99Logic.nand(a,b)
  def nor(b:Boolean) = S99Logic.nand(a,b)
  def impl(b:Boolean) = S99Logic.impl(a,b)
  def equ(b:Boolean) = S99Logic.equ(a,b)

}

object S99Logic {

  implicit def booleanToS99Logic( a:Boolean ) : S99Logic = new S99Logic(a)

  def not( a : Boolean ) = a match {
    case true => false
    case _ => true
  }

  def and( a : Boolean , b : Boolean ) = (a,b) match {
    case (true,true) => true
    case _ => false
  }

  def or( a : Boolean , b : Boolean ) = (a,b) match {
    case (false,false) => false
    case _=> true
  }

  def xor( a : Boolean , b : Boolean ) = (a,b) match {
    case (x,y) if x==y => true
    case _ => false
  }

  def nand( a : Boolean , b : Boolean ) = not( and(a,b) )
  def nor( a : Boolean , b : Boolean ) = not( or(a,b) )
  def impl(a: Boolean, b: Boolean): Boolean = or(not(a), b)
  def equ(a: Boolean, b: Boolean): Boolean = or(and(a, b), and(not(a), not(b)))

  def table2( f2 : (Boolean,Boolean)=>Boolean ) = {

    println("A\t\tB\t\tResult")

    for( a <- List(false,true) ) {
      for( b <- List(false,true) )
        println( a + "\t" + b + "\t" + f2(a,b) )
    }


  }

}
