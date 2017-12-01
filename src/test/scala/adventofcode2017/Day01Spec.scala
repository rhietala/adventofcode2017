package adventofcode2017

import org.scalatest._

class Day01Spec extends FreeSpec {
  "Part 1" - {
    "1122 = 3" in { assert(Day01.part1("1122") == 3) }
    "1111 = 4" in { assert(Day01.part1("1111") == 4) }
    "1234 = 0" in { assert(Day01.part1("1234") == 0) }
    "91212129 = 9" in { assert(Day01.part1("91212129") == 9) }
  }

  "Part 2" - {
    "1212 = 6" in { assert(Day01.part2("1212") == 6) }
    "1221 = 0" in { assert(Day01.part2("1221") == 0) }
    "123425 = 4" in { assert(Day01.part2("123425") == 4) }
    "123123 = 12" in { assert(Day01.part2("123123") == 12) }
    "12131415 = 4" in { assert(Day01.part2("12131415") == 4) }
  }
}
