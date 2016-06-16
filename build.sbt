scalaVersion := "2.11.8"

name := "jmh-benchmark"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
	"com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.5.2",
	"com.fasterxml.jackson.core" % "jackson-core" % "2.5.2"
)

val circeVersion = "0.4.1"

libraryDependencies ++= Seq(
  "io.circe" %% "circe-core",
  "io.circe" %% "circe-generic",
  "io.circe" %% "circe-parser",
  "io.circe" %% "circe-jackson"
).map(_ % circeVersion)

scalacOptions in Test ++= Seq("-Yrangepos")

enablePlugins(JmhPlugin)
