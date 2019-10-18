name := "SparkDeltaLakePlaybook"

version := "0.1"

scalaVersion := "2.11.12"


libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.4.3" % "provided"
libraryDependencies += "io.delta" %% "delta-core" % "0.4.0" % "provided"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"