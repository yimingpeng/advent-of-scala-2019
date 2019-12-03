package io.github.yimingpeng.day2

import io.github.yimingpeng.Utilities.{stringToInt, txtToList}
import scala.collection.mutable.ListBuffer
import scala.math.floor

object Day2 {
  def add(pos1: Int, pos2: Int): Int = {
    pos1 + pos2
  }

  def multiply(pos1: Int, pos2: Int): Int = {
    pos1 * pos2
  }

  def runProgram(values: List[Int]): ListBuffer[Int] = {
    var i = 0
    var done = false
    var valuesBuffer = values.to(collection.mutable.ListBuffer)
    while (i < valuesBuffer.length && !done) {
        if (valuesBuffer(i) == 1 && i+3<valuesBuffer.length) {
          valuesBuffer.update(valuesBuffer(i+3), add(valuesBuffer(valuesBuffer(i+1)),
            valuesBuffer(valuesBuffer(i+2))))
          i += 4
        }else if (valuesBuffer(i) == 2 && i+3<valuesBuffer.length) {
          valuesBuffer.update(valuesBuffer(i+3), multiply(valuesBuffer(valuesBuffer(i+1)),
            valuesBuffer(valuesBuffer(i+2))))
          i += 4
        }else if (valuesBuffer(i) == 99) {
          done = true
        }
    }
    valuesBuffer
  }

  def main(args: Array[String]): Unit = {
    println(runProgram(stringToInt(txtToList("day2.txt"))))
  }
}
