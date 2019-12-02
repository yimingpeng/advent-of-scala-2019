package io.github.yimingpeng.day1
import io.github.yimingpeng.Utilities.txtToList
import scala.math.floor

object Day1 {
  def calculate(mass: String): Int = {
    (floor(mass.toInt/3.0) - 2).toInt
  }
  def main(args: Array[String]): Unit = {
      println(txtToList("data.txt").map(calculate).sum)
  }
}
