package adventofcode2017

import org.scalatest._

import Day05._

class Day05Spec extends FreeSpec {
  "Part 1" - {
    "0 3 0 1 -3 = 5" in { assert(part1(Vector(0, 3, 0, 1, -3)) == 5) }
  }

  "Part 2" - {
    "0 3 0 1 -3 = 10" in { assert(part2(Vector(0, 3, 0, 1, -3)) == 10) }
  }
}
