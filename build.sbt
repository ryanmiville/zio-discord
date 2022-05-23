ThisBuild / tlBaseVersion := "0.1"

ThisBuild / licenses := Seq(License.MIT)
ThisBuild / tlUntaggedAreSnapshots := false
ThisBuild / tlSonatypeUseLegacyHost := false

ThisBuild / scalaVersion := "3.1.2"

Global / onChangedBuildSource := ReloadOnSourceChanges

lazy val root = tlCrossRootProject.aggregate(core)

lazy val core = crossProject(JVMPlatform, JSPlatform)
  .crossType(CrossType.Pure)
  .in(file("core"))
  .settings(
    name := "core",
    libraryDependencies ++= Seq(
      "dev.zio" %%% "zio" % "2.0.0-RC6"
    )
  )
