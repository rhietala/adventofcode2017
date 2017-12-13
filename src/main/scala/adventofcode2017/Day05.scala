package adventofcode2017

import scala.io.Source
import scala.annotation.tailrec

object Day05 {
  @tailrec
  def part1Recur(i: Int, xs: Vector[Int], steps: Int): Int =
    if (i >= xs.size || i < 0)
      steps
    else
      part1Recur(i + xs(i), xs.updated(i, xs(i) + 1), steps + 1)

  def part1(xs: Vector[Int]): Int =
    part1Recur(0, xs, 0)

  def part2Recur(i: Int, xs: Vector[Int], steps: Int): Int =
    if (i >= xs.size || i < 0)
      steps
    else if (xs(i) >= 3)
      part2Recur(i + xs(i), xs.updated(i, xs(i) - 1), steps + 1)
    else
      part2Recur(i + xs(i), xs.updated(i, xs(i) + 1), steps + 1)

  def part2(xs: Vector[Int]): Int =
    part2Recur(0, xs, 0)

  def main(args: Array[String]): Unit = {
    val file: String = getClass.getResource("").getPath + "day05.txt"
    val input: Vector[Int] = Source.fromFile(file).getLines.toVector.map(_.toInt)
    println("Day05 part 1: " + part1(input))
    println("Day05 part 2: " + part2(input))
  }
}
