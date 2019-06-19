package lectures.part1basics

object ValuesVariablesType extends App {
  val x: Int = 42
  println(x)

  var y = 54 //generates side effects avoid usage of var
  y = y+x
  println(y)
}
