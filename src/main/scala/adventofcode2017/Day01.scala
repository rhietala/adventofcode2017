package adventofcode2017

import scala.io.Source

object Day01 {
  def sToInts: String => Vector[Int] =
    _.toVector.map(_.toString.toInt)

  def calc: (Vector[Int], Vector[Int]) => Int =
    (xs1, xs2) => (xs1 zip xs2)
      .filter(x => x._1 == x._2)
      .map(_._1)
      .sum


  def part1: String => Int =
    s => {
      val ints1 = sToInts(s)
      calc(ints1, ints1.tail :+ ints1.head)
    }

  def part2: String => Int =
    s => {
      val ints1 = sToInts(s)
      val (half1, half2) = ints1.splitAt(ints1.size / 2)
      calc(ints1, half2 ++: half1)
    }

  def main(args: Array[String]): Unit = {
    val file: String = getClass.getResource("").getPath + "day01.txt"
    val input: String = Source.fromFile(file).getLines.mkString
    println("Day 01 part 1: " + part1(input))
    println("Day 01 part 2: " + part2(input))
  }
}
