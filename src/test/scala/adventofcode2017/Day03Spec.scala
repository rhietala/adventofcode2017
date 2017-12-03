package adventofcode2017

import org.scalatest._

import Day03._

class Day03Spec extends FreeSpec {
  "buildGrid" - {
    "1" in { assert(buildGrid1(1) == Coord(0, 0)) }
    "3" in { assert(buildGrid1(3) == Coord(1, 1)) }
    "4" in { assert(buildGrid1(4) == Coord(0, 1)) }
    "5" in { assert(buildGrid1(5) == Coord(-1, 1)) }
  }

  "Part 1" - {
    "1 = 0" in { assert(part1(1) == 0) }
    "12 = 3" in { assert(part1(12) == 3) }
    "23 = 2" in { assert(part1(23) == 2) }
    "1024 = 31" in { assert(part1(1024) == 31) }
  }

  "Part 2" - {
    "1 = 2" in { assert(part2(1) == 2) }
    "2 = 4" in { assert(part2(2) == 4) }
    "4 = 5" in { assert(part2(4) == 5) }
    "750 = 806" in { assert(part2(750) == 806) }
  }
}
