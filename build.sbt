import sbt.Keys.libraryDependencies

version := "0.1"

scalaVersion := "2.13.2"

ThisBuild / scalaVersion := "2.13.2"
ThisBuild / organization := "com.tcsalist"

lazy val Main = (project in file("."))
  .settings(
    name := "ScalaTraining",
    scalacOptions ++= Seq("-language:implicitConversions", "-deprecation"),
    testOptions in Test += Tests.Argument(TestFrameworks.JUnit, "-a", "-v", "-s"),
    libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % Test,
    libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.0",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.0" % Test,
  )

lazy val FP1Wk2 = (project in file("Fun1week2"))
  .settings(
      name := "funsets"
  )

lazy val Lectures = (project in file("lectures"))
  .settings(
    name := "lectures"
  )