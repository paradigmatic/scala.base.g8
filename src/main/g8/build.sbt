organization := "$organization$"

name := "$name$"

version := "$version$"

scalaVersion := "2.12.8"


libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.8" % "test",
  "org.scalacheck" %% "scalacheck" % "1.14.0" % "test",

)

scalacOptions ++= Seq("-deprecation", "-feature")

scalaSource in Compile := baseDirectory(_ / "src").value

scalaSource in Test := baseDirectory(_ / "test").value

