package lectures.part1basics

object Functions extends App {
  def sayHelloTo(name: String): String = {
    "Hello " + name
  }

  println(sayHelloTo("Arnab"))

  def welcomeMessage(): String = {
    "Welcome To Scala Class"
  }

  println(welcomeMessage())
  println(welcomeMessage)

  def printWordNTimes(count: Int, word: String): String = {
    if (count == 0) count + word else count + word + "\n" + printWordNTimes(count - 1, word)
  }

  println(printWordNTimes(10, "hello scala"))


  //exercise
  def giveIntro(name: String, age: Int): String = {
    s"My name is $name and I am $age years old"
  }

  println(giveIntro("Arnab", 12))

  def calculateFactorial(number: Int): Int = {
    if (number <= 0) {
      return 1
    }
    number*calculateFactorial(number - 1)
  }
println(calculateFactorial(6))

  def getNthFiboTerm(termCount: Int): Int={
    if(termCount<=2){
      return 1
    }
    getNthFiboTerm(termCount-1)+ getNthFiboTerm(termCount-2)
  }
  println(getNthFiboTerm(6))
}

