name := "dsl_demo_akka_scala"

version := "1.0"

scalaVersion := "2.11.8"

resolvers += "Typesafe Repository" at "http://192.168.7.83:6060/nexus/content/groups/public"


libraryDependencies ++= Seq(
  "com.typesafe.akka" % "akka-actor_2.11" % "2.4.14",
  "com.typesafe.akka" % "akka-remote_2.11" % "2.4.14",
  "com.typesafe.akka" % "akka-kernel_2.11" % "2.4.14"
)