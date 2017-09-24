scalacOptions ++= Seq("-unchecked", "-deprecation")
ivyLoggingLevel := UpdateLogging.Quiet
libraryDependencies += "org.scala-sbt" % "scripted-plugin" % sbtVersion.value

addSbtPlugin("com.fommil" % "sbt-sensible" % "1.2.3")
addSbtPlugin("org.scalariform" % "sbt-scalariform" % "1.6.0") // 1.7 has formatting regressions, prefer scalafmt if upgrading

// sbt-ensime is needed for the integration tests
addSbtPlugin("org.ensime" % "sbt-ensime" % "1.12.15")

addSbtPlugin("de.heikoseeberger" % "sbt-header" % "1.5.1") // 1.8.0 causes https://github.com/sbt/sbt-header/issues/56
addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.5" exclude("org.apache.maven", "maven-plugin-api"))
addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.7.0")
