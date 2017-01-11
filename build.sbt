scalaVersion := "2.11.8"

name := "jmh-benchmark"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
	"com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.8.4",
	"com.fasterxml.jackson.core" % "jackson-core" % "2.8.5",
	"io.argonaut" %% "argonaut" % "6.2-RC2",
	"io.spray" %%  "spray-json" % "1.3.3",
  "org.scalactic" %% "scalactic" % "3.0.1",
  "org.scalatest" %% "scalatest" % "3.0.1" % "test"
)

val circeVersion = "0.6.1"

libraryDependencies ++= Seq(
  "io.circe" %% "circe-core",
  "io.circe" %% "circe-generic",
  "io.circe" %% "circe-parser",
  "io.circe" %% "circe-jackson"
).map(_ % circeVersion)

scalacOptions in Test ++= Seq("-Yrangepos")

enablePlugins(JmhPlugin)
