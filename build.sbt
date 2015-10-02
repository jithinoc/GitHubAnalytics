name := "GitHubAnalytics"

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies += "com.google.code.gson" % "gson" % "2.3.1"

libraryDependencies += "org.apache.spark" % "spark-core_2.10" % "1.5.0"

mainClass in assembly := some("com.qburst.GitHubAnalytics.MostPulledRepo.MPRJob")

assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case x => MergeStrategy.first
}
