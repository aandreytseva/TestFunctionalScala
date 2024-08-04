package org.example

object Basics extends App {
  val meaningOfLife: Int = 42
  val ifexpression = if (meaningOfLife > 42) 50 else 100
  val expression = {
    if (meaningOfLife > 42) 50
    else if (meaningOfLife < 0) -1
    else 0
  }

  def myFunction(x: Int, y: String): String = y + " " + x

  def factorial(n: Int): Int =
    if (n <= 1) 1
    else n * factorial(n - 1)

  def myUnitReturningFunction(): Unit = {
    println(factorial(3))
  }
}
