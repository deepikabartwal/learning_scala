package lectures.part1basics

import scala.annotation.tailrec

object Functions extends App {
  def sayHelloTo(name: String): String = {
    "Hello " + name
  }


  def welcomeMessage(): String = {
    "Welcome To Scala Class"
  }


  def printWordNTimes(count: Int, word: String): String = {
    if (count == 0) count + word else count + word + "\n" + printWordNTimes(count - 1, word)
  }


  //exercise
  def giveIntro(name: String, age: Int): String = {
    s"My name is $name and I am $age years old"
  }

  def calculateFactorial(number: Int): Int = {
    if (number <= 0) {
      return 1
    }
    number * calculateFactorial(number - 1)
  }

  def getNthFiboTerm(termCount: Int): Int = {
    if (termCount <= 2) {
      return 1
    }
    getNthFiboTerm(termCount - 1) + getNthFiboTerm(termCount - 2)
  }

  println(printWordNTimes(10, "hello scala"))
  println(giveIntro("Arnab", 12))
  println(getNthFiboTerm(6))
  println(sayHelloTo("Arnab"))
  println(calculateFactorial(6))
  println(welcomeMessage())
  println(welcomeMessage)
}

