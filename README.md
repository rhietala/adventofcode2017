# adventofcode2017-scala

Advent of code 2017 with scala

## Running tests

Start `sbt` and run all tests with `test`, or just single day's tests with
`testOnly *Day01`

```
$ sbt
...
sbt:AdventOfCode2017> test
...
[info] Run completed in 343 milliseconds.
[info] Total number of tests run: 36
[info] Suites: completed 24, aborted 0
[info] Tests: succeeded 36, failed 0, canceled 0, ignored 0, pending 0
[info] All tests passed.
[success] Total time: 1 s, completed Nov 4, 2017 12:42:26 AM
```

## Running solutions

Actual solutions are run also in sbt, with commands `day01`, `day02`, etc.

```
sbt:AdventOfCode2017> day01
[info] Running adventofcode2017.Day01
Day 01 part 1: 138
Day 01 part 2: 1771
[success] Total time: 1 s, completed Nov 4, 2017 12:44:02 AM
```

Input is read from `src/main/resources/adventofcode2017/day01.txt`, etc.
