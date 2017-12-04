package adventofcode2017

import scala.io.Source

object Day04 {
  def part1Valid: String => Boolean =
    s => s.split(" ").deep == s.split(" ").distinct.deep

  def part1(xs: TraversableOnce[String]): Int =
    xs.count(part1Valid)

  def anagramsInVector(xs: TraversableOnce[String]): String => Boolean =
    s => xs.count(s.permutations.contains) > 1 // s itself is in xs

  def part2Valid: String => Boolean =
    s => s.split(" ").filter(anagramsInVector(s.split(" "))).isEmpty

  def part2(xs: TraversableOnce[String]): Int =
    xs.count(part2Valid)

  def main(args: Array[String]): Unit = {
    val file: String = getClass.getResource("").getPath + "day04.txt"
    val input: Vector[String] = Source.fromFile(file).getLines.toVector
    println("Day04 part 1: " + part1(input))
    println("Day04 part 2: " + part2(input))
  }
}
