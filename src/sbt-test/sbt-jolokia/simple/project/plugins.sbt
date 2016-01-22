addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.0.6")

{
  val pluginVersion = System.getProperty("plugin.version")
  if(pluginVersion == null)
    throw new RuntimeException("""|The system property 'plugin.version' is not defined.
                                 |Specify this property using the scriptedLaunchOpts -D.""".stripMargin)
  else addSbtPlugin("com.jatescher" % "sbt-jolokia" % pluginVersion)
}
