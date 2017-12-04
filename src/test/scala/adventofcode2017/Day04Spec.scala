package adventofcode2017

import org.scalatest._

import Day04._

class Day04Spec extends FreeSpec {
  "Part 1" - {
    "aa bb cc dd ee = true" in { assert(part1Valid("aa bb cc dd ee") == true) }
    "aa bb cc dd aa = false" in { assert(part1Valid("aa bb cc dd aa") == false) }
    "aa bb cc dd aaa = true" in { assert(part1Valid("aa bb cc dd aaa") == true) }
  }

  "Part 2" - {
    "abcde fghij" in { assert(part2Valid("abcde fghij") == true) }
    "abcde xyz ecdab" in { assert(part2Valid("abcde xyz ecdab") == false) }
    "a ab abc abd abf abj" in { assert(part2Valid("a ab abc abd abf abj") == true) }
    "iiii oiii ooii oooi oooo" in { assert(part2Valid("iiii oiii ooii oooi oooo") == true) }
    "oiii ioii iioi iiio" in { assert(part2Valid("oiii ioii iioi iiio") == false) }
    "kdd itdyhe pvljizn cgi" in { assert(part2Valid("kdd itdyhe pvljizn cgi") == true) }
  }
}
