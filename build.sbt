name := "play-vue-quasar"
 
version := "1.0" 
      
lazy val `playjwtjsexample` = (project in file(".")).enablePlugins(PlayScala)

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"
      
resolvers += "Akka Snapshot Repository" at "https://repo.akka.io/snapshots/"
      
scalaVersion := "2.12.10"

libraryDependencies += guice