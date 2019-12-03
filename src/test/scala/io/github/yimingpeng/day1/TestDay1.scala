package io.github.yimingpeng.day1

import org.scalatest.FunSuite
class TestDay1 extends FunSuite {
  val testCases = List(("12", 2), ("14", 2), ("1969", 654), ("100756", 33583))

  testCases.foreach{ valuePair =>
    test(s"Test of Day1.calculate(${valuePair._1})") {
      assert(Day1.calculate(valuePair._1) === valuePair._2)
    }
  }
}

