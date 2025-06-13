import ReleaseTransformations._

scalaVersion := "3.7.0"

enablePlugins(JavaAppPackaging)

lazy val root = (project in file("."))
  .settings(
    name := "addition",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.17" % Test,
    releaseProcess := Seq[ReleaseStep](
    inquireVersions,           
    setReleaseVersion,
    commitReleaseVersion,
    tagRelease,
    setNextVersion,
    commitNextVersion,                   
    pushChanges
    )
  )
