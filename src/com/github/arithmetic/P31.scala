package com.github.arithmetic

import com.github.arithmetic.S99Int._

/**
  *
  * @author Mostafa Asgari
  * Email : mostafa.asg@gmail.com
  * website https://bigdatacode.wordpress.com/
  * @since 5/16/16
  *
  // P31 (**) Determine whether a given integer number is prime.
  //     scala> 7.isPrime
  //     res0: Boolean = true

  // A fairly naive implementation for primality testing is simply: a number is
  // prime if it it not divisible by any prime number less than or equal to its
  // square root.
  // Here, we use a Stream to create a lazy infinite list of prime numbers.  The
  // mutual recursion between `primes` and `isPrime` works because of the limit
  // on `isPrime` to the square root of the number being tested.
  *    */
object P31 {

  def main(args: Array[String]) {

    for( i <- 2 to 100 )
      println( i + " is prime? : " + i.isPrime() )

  }

}
