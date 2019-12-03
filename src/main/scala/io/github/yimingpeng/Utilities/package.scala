package io.github.yimingpeng

import scala.io.Source

package object Utilities {
  def txtToList(file_path: String): List[String] = {
    Source.fromResource(file_path).getLines.toList
  }

  def stringToInt(values: List[String]): List[Int] = {
    values.map(_.toString.toInt)
  }
}
