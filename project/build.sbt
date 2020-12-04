scalacOptions += "-deprecation"
scalacOptions += "-feature"

addSbtPlugin("com.typesafe" % "sbt-mima-plugin" % "0.8.1")
addSbtPlugin("com.typesafe.sbt" % "sbt-osgi" % "0.9.6")
addSbtPlugin("com.typesafe" % "sbt-sdlc" % "0.2")
addSbtPlugin("de.johoop" % "sbt-testng-plugin" % "3.1.1")
addSbtPlugin("com.novocode" % "sbt-ornate" % "0.6")
addSbtPlugin("com.jsuereth" % "sbt-pgp" % "2.0.1")
