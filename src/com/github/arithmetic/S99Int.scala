package com.github.arithmetic

/**
  *
  * @author mostafa 
  * @since 5/15/16
  */
class S99Int(val num : Int) {

  def isPrime() : Boolean = {

    !List.range(2, Math.sqrt(num).ceil.toInt+1).exists( n => num!=n && num%n==0 )

  }

}

object S99Int {

  implicit def intToS99Int(n : Int) : S99Int = new S99Int(n)

}
