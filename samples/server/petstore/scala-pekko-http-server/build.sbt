version := "1.0.0"
name := "openapi-scala-pekko-http-server"
organization := "org.openapitools"
scalaVersion := "2.13.11"

resolvers +=
  "Apache Snapshots" at "https://repository.apache.org/content/repositories/snapshots"

libraryDependencies ++= Seq(
  "org.apache.pekko" %% "pekko-stream" % "1.0.0-RC3+5-be45ac14-SNAPSHOT",
  "org.apache.pekko" %% "pekko-http" % "0.0.0+4455-91b6086b-SNAPSHOT"
)
