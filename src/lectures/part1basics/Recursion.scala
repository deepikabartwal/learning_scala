package lectures.part1basics

object Recursion extends App {
  def factorial(number: Int,accumulator: BigInt): BigInt ={
    if(number<=1) {
     return accumulator
    }
    factorial(number-1,number*accumulator)
  }

 println( factorial(5000,1))
}
