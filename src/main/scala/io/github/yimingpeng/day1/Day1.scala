package io.github.yimingpeng.day1
import io.github.yimingpeng.Utilities.txtToList
import io.github.yimingpeng.Utilities.stringToInt
import scala.math.floor

object Day1 {
  def calculate1(mass: Int): Int = {
    (floor(mass.toInt/3.0) - 2).toInt
  }

  def calculate2(mass: Int): Int = {
    var massNew = mass
    var result = 0
    while(0 <= calculate1(massNew)){
      massNew = calculate1(massNew)
      result += massNew
    }
    result
  }
  def main(args: Array[String]): Unit = {
      println(stringToInt(txtToList("day1.txt")).map(calculate1).sum)
      println(stringToInt(txtToList("day1.txt")).map(calculate2).sum)
  }
}
