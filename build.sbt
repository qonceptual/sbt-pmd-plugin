import bintray.Keys._

name := "sbt-pmd-plugin"

version := "1.0.0"

organization := "com.qonceptual.sbt"

bintrayPublishSettings

sbtPlugin := true

description := "Plugin to run PMD in sbt."

licenses += ("MIT", url("https://opensource.org/licenses/MIT)"))

publishMavenStyle := false

repository in bintray := "sbt-plugins"

bintrayOrganization in bintray := Some("qonceptual")

vcsUrl in bintray := Some("https://github.com/qonceptual/sbt-pmd-plugin.git")

libraryDependencies ++= Seq(
  "net.sourceforge.pmd" % "pmd-core" % "5.4.1",
  "net.sourceforge.pmd" % "pmd-java" % "5.4.1"
)

