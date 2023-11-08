
ThisBuild / scalaVersion := "3.2.2"

lazy val core = (projectMatrix in file("core"))
  .settings(
    name := "core",
  )
  .jvmPlatform(scalaVersions = Seq("3.2.2"))
  .jsPlatform(scalaVersions = Seq("3.2.2"))
  .nativePlatform(scalaVersions = Seq("3.2.2"))
