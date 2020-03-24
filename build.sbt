scalaVersion := "2.13.1"

resolvers += "JCenter Maven Repository" at "https://jcenter.bintray.com/"

scalafmtOnCompile := true

libraryDependencies ++= Seq(
  "org.apache.tuweni" % "tuweni-scuttlebutt-client-lib" % "1.0.0",
  "org.apache.tuweni" % "tuweni-scuttlebutt" % "1.0.0",
  "org.slf4j" % "slf4j-api" % "1.7.30",
  "org.slf4j" % "slf4j-simple" % "1.7.30",
  "org.scalatest" %% "scalatest" % "3.1.1" % "test"
)
