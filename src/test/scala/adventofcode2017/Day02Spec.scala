package adventofcode2017

import org.scalatest._

class Day02Spec extends FreeSpec {
  "Part 1" - {
    val input = """5 1 9 5
7 5 3
2 4 6 8""".split("\n").toVector
    "input = 18" in { assert(Day02.part1(input) == 18) }
  }

  "Part 2" - {
    val input = """5 9 2 8
9 4 7 3
3 8 6 5""".split("\n").toVector
    "input = 9" in { assert(Day02.part2(input) == 9) }
  }
}
