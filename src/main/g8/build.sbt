organization := "$organization$"

name := "$name$"

version := "$version$"

scalaVersion := "2.12.2"


libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.1" % "test"
)

scalacOptions ++= Seq("-deprecation", "-feature")

scalaSource in Compile <<= baseDirectory(_ / "src")

scalaSource in Test <<= baseDirectory(_ / "test")

