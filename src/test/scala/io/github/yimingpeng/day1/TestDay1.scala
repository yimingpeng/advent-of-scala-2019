package io.github.yimingpeng.day1

import org.scalatest.FunSuite
class TestDay1 extends FunSuite {
  val testCases1 = List((12, 2), (14, 2), (1969, 654), (100756, 33583))
  val testCases2 = List((14, 2), (1969, 966), (100756, 50346))

  testCases1.foreach{ valuePair =>
    test(s"Test of Day1.calculate1(${valuePair._1})") {
      assert(Day1.calculate1(valuePair._1) === valuePair._2)
    }
  }

  testCases2.foreach{ valuePair =>
    test(s"Test of Day1.calculate2(${valuePair._1})") {
      assert(Day1.calculate2(valuePair._1) === valuePair._2)
    }
  }
}

