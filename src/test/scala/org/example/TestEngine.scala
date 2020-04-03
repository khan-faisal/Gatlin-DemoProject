package org.example

import io.gatling.app.Gatling
import io.gatling.core.config.GatlingPropertiesBuilder

object TestEngine extends App {



    val props = new GatlingPropertiesBuilder()
      .resourcesDirectory(IDEPathHelper.mavenResourcesDirectory.toString)
      .resultsDirectory(IDEPathHelper.resultsDirectory.toString)
     // .binariesDirectory(IDEPathHelper.mavenBinariesDirectory.toString)


    Gatling.fromMap(props.build)
  }



