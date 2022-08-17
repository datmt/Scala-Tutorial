package com.datmt.scala

object Functions {
  def main(args: Array[String]): Unit = {
    goToBed()
    goToBed(true)
    goToBed(isLate = true)
  }

  def sayHello(): Unit = println("Hello")

  def printNumber(number: Int): Unit =
    println(s"Hello $number")

  def goPicnic(isRaining: Boolean): String =
    if (isRaining) then "No way!" else "Let's go"

  def goToBed(isLate: Boolean = false): String =
    if (isLate) then "No way!" else "Let's go"
}
