resolvers += "Flyway" at "https://davidmweber.github.io/flyway-sbt.repo" // 追加

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.6.16")
addSbtPlugin("org.flywaydb" % "flyway-sbt" % "4.2.0") // 追加
