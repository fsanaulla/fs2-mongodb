scalaVersion := "2.11.12"

crossScalaVersions := List("2.11.12", "2.12.4")

organization := "org.lyranthe"

name := "fs2-mongodb"

libraryDependencies += "org.mongodb" % "mongodb-driver-async" % "3.6.3"
libraryDependencies += "co.fs2"      %% "fs2-core"            % "0.10.2"

enablePlugins(GitVersioning)

homepage in Global := Some(url("https://github.com/fiadliel/fs2-mongodb"))
licenses in Global += "MIT" -> url("https://github.com/fiadliel/fs2-mongodb/blob/master/LICENSE")
developers in Global += Developer("fiadliel",
                                  "Gary Coady",
                                  "gary@lyranthe.org",
                                  url("https://www.lyranthe.org/"))
