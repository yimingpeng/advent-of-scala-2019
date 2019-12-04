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

  def calculate(valuesBuffer: ListBuffer[Int]): ListBuffer[Int] = {
    var i = 0
    var done = false
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

  def runProgram1(values: List[Int]): ListBuffer[Int] = {
    calculate(values.to(collection.mutable.ListBuffer))
  }

  def runProgram2(values: List[Int]): List[Int] = {
    var done = false
    var valuesBuffer = values.to(collection.mutable.ListBuffer)
    var val1 = 0
    var val2 = 0
    do{
      valuesBuffer = values.to(collection.mutable.ListBuffer)
      val1 = scala.util.Random.nextInt(100)
      val2 = scala.util.Random.nextInt(100)
      valuesBuffer.update(1, val1)
      valuesBuffer.update(2, val2)
      println(valuesBuffer.head, valuesBuffer(1), valuesBuffer(2))
      valuesBuffer = calculate(valuesBuffer)
      println(valuesBuffer.head, val1, val2)
    } while(valuesBuffer.head != 19690720)
    List(val1, val2)
  }

  def main(args: Array[String]): Unit = {
    println(runProgram1(stringToInt(txtToList("day2.txt"))))
    val result2 = runProgram2(stringToInt(txtToList("day2_original.txt")))
    print(100 * result2(0) + result2(1))
  }
}
