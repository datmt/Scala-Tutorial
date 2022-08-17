package com.datmt.scala

object ControlStructures {
  def main(args: Array[String]): Unit = {
    println(whatToEat("Monday"))
    println(whatToEat("Friday"))
    println(whatToEat("Tuesday"))
    println(whatToEat("Thursday"))
    println(whatToEat("Wednesday"))
    println(whatToEat("Sunday"))
    println(whatToEat("Invalid day"))
  }

  def isChargeable(isElectric: Boolean, capacity: Int): Boolean =
    if (!isElectric) then return false
    if (capacity < 11) then false else true

  def isChargeableImproved(isElectric: Boolean, capacity: Int): Boolean =
    isElectric && capacity > 11

  def rankPlayer(point: Int): String =
    if (point < 100) then "Rookie"
    else if (point < 1000) then "Amateur"
    else "Professional"

  def patternMatchingEat(isHungry: Boolean): Unit =
    isHungry match
      case true => println("Let's eat")
      case false => println("Let's not eat")

  def whatToEat(day: String): String =
    day match
      case "Monday" | "Friday" => "Meat"
      case "Tuesday" => "Fruits"
      case "Thursday" => "Vegetables"
      case otherDay => s"I don't eat nothing on $otherDay"
}
