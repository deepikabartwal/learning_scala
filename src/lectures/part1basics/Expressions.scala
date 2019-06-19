package lectures.part1basics

object Expressions extends App {
  val x = 142 + 248
  println(x)
  //Code blocks
  val greetings = {
    if (x > 500) "Hello" else "Bye"
  }
  val someIntegerValue = {
    if (x > 500) x - 500 else x + 500
  }
  println(greetings)
  println(someIntegerValue)
}
