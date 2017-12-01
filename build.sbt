import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "org.hietala",
      scalaVersion := "2.12.3",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "AdventOfCode2017",
    libraryDependencies += scalaTest % Test
  )

lazy val day01 = taskKey[Unit]("Day 01")
fullRunTask(day01, Compile, "adventofcode2017.Day01")
