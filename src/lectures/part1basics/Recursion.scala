package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {
  @tailrec
  def factorial(number: Int, accumulator: BigInt): BigInt = {
    if (number <= 1) {
      return accumulator
    }
    factorial(number - 1, number * accumulator)
  }

  @tailrec
  def printWordNTime(word: String, count: Int, accumulator: String): String = {
    if (count <= 0) {
      return accumulator
    }
    printWordNTime(word, count - 1, word + "\n" + accumulator)
  }
  
  println(factorial(5000, 1))
  println(printWordNTime("hey hey", 10, ""))
}
