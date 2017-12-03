package adventofcode2017

import scala.io.Source

object Day02 {
  def sToInts: String => Vector[Int] =
    _.split("\\s+").toVector.map(_.toInt)

  def minMaxDiff: Vector[Int] => Int =
    xs => xs.max - xs.min

  def calc2: Vector[Int] => Int =
    _.combinations(2)
      .toVector
      .map(xs => (xs.head, xs.last))
      .map(x => if (x._1 < x._2) x.swap else x)
      .filter { case (a, b) => a % b == 0 }
      .map { case (a, b) => a / b }
      .sum

  def part1: Vector[String] => Int =
    _.map(sToInts andThen minMaxDiff).sum

  def part2: Vector[String] => Int =
    _.map(sToInts andThen calc2).sum

  def main(args: Array[String]): Unit = {
    val file: String = getClass.getResource("").getPath + "day02.txt"
    val input: Vector[String] = Source.fromFile(file).getLines.toVector
    println("Day 01 part 1: " + part1(input))
    println("Day 01 part 2: " + part2(input))
  }
}
