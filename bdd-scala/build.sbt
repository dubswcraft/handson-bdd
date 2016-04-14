name := "cucumber-test"

organization := "com.dubswcraft.bdd"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq (
  "info.cukes" % "cucumber-core" % "1.2.4" % "test",
  "info.cukes" % "cucumber-scala_2.10" % "1.2.4" % "test",
  "info.cukes" % "cucumber-jvm" % "1.2.4" % "test",
  "info.cukes" % "cucumber-junit" % "1.2.4" % "test",
  "org.scalatest" %% "scalatest" % "2.2.4" % "test")

enablePlugins(CucumberPlugin)

CucumberPlugin.glue := "com/dubswcraft/bdd/"

