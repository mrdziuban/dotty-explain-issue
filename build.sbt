lazy val root = project.in(file("."))
  .settings(
    name := "dotty-explain-test",
    organization := "com.example",
    scalaVersion := "3.3.1",
    version      := "0.1.0-SNAPSHOT",
    scalacOptions += "-explain",
  )
