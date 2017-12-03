package adventofcode2017

import scala.io.Source
import scala.collection.immutable.HashSet
import scala.annotation.tailrec

object Day03 {
  case class Coord(x: Int, y: Int)

  object Dir extends Enumeration {
    type Dir = Value
    val Left, Right, Up, Down = Value
  }

  import Dir._

  def move(dir: Dir, pos: Coord): Coord =
    dir match {
      case Right => pos.copy(x = pos.x + 1)
      case Left => pos.copy(x = pos.x - 1)
      case Up => pos.copy(y = pos.y + 1)
      case Down => pos.copy(y = pos.y - 1)
    }

  def neighbors(grid: HashSet[Coord], pos: Coord): HashSet[Coord] =
    HashSet(
      pos.copy(x = pos.x + 1),
      pos.copy(x = pos.x - 1),
      pos.copy(y = pos.y + 1),
      pos.copy(y = pos.y - 1)
    ).filter(grid.contains)

  def neighborsDiagonal(grid: HashSet[Coord], pos: Coord): HashSet[Coord] =
    HashSet(
      pos.copy(x = pos.x + 1),
      pos.copy(x = pos.x - 1),
      pos.copy(y = pos.y + 1),
      pos.copy(y = pos.y - 1),
      pos.copy(x = pos.x + 1, y = pos.y + 1),
      pos.copy(x = pos.x - 1, y = pos.y + 1),
      pos.copy(x = pos.x + 1, y = pos.y - 1),
      pos.copy(x = pos.x - 1, y = pos.y - 1)
    ).filter(grid.contains)

  def changeDir(grid: HashSet[Coord], last: Coord, dir: Dir): Dir =
    if (neighbors(grid, last).size == 1)
      dir match {
        case Right => Up
        case Up => Left
        case Left => Down
        case Down => Right
      }
    else
      dir

  @tailrec
  def buildGridRecur1(acc: HashSet[Coord], last: Coord, dir: Dir, until: Int): Coord =
    if (acc.size >= until)
      last
    else {
      val newLast = move(dir, last)
      buildGridRecur1(acc + newLast, newLast, changeDir(acc, newLast, dir), until)
    }

  def buildGrid1(until: Int): Coord =
    buildGridRecur1(HashSet(Coord(0, 0)), Coord(0, 0), Right, until)

  def lenToOrigo(last: Coord): Int =
    math.abs(last.x) + math.abs(last.y)

  def part1(i: Int): Int =
    lenToOrigo(buildGrid1(i))

  @tailrec
  def buildGridRecur2(acc: (HashSet[Coord], Map[Coord, Int]), last: Coord, dir: Dir, until: Int): Int = {
    val newLast = move(dir, last)
    val newVal =
      neighborsDiagonal(acc._1, newLast).toSeq.map(c => acc._2.get(c).getOrElse(0)).sum
    if (newVal > until)
      newVal
    else {
      buildGridRecur2((acc._1 + newLast, acc._2.updated(newLast, newVal)),
        newLast,
        changeDir(acc._1, newLast, dir), until)
    }
  }

  def buildGrid2(until: Int): Int =
    buildGridRecur2((HashSet(Coord(0, 0)), Map(Coord(0, 0) -> 1)), Coord(0, 0), Right, until)

  def part2(i: Int): Int = buildGrid2(i)

  def main(args: Array[String]): Unit = {
    val file: String = getClass.getResource("").getPath + "day03.txt"
    val input: Int = Source.fromFile(file).getLines.mkString.toInt
    println("Day 01 part 1: " + part1(input))
    println("Day 01 part 2: " + part2(input))
  }
}
