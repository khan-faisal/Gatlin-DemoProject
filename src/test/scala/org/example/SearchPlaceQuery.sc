package org.example
import io.gatling.core.Predef._
import io.gatling.http.Predef._

import scala.concurrent.duration._




class SearchPlaceQuery extends Simulation {

  // Http Conf
  val httpConf = http.baseUrl("https://maps.googleapis.com")

  // Scenario Def
  val scn = scenario("Sample Testing")
    .exec(http("Search Place Query")
      .get("/maps/api/place/findplacefromtext/json").queryParam("input", "+restaurant % delhi ").queryParam("inputtype", "textquery").queryParam("fields","formatted_address,name,rating,opening_hours").queryParam("key", "AIzaSyDrl7Qyos5Klo1KFzaEpzJlU5ym8P8dYCI"))

  setUp(scn.inject(atOnceUsers(2))).protocols(httpConf)
  //setUp(scn.inject(rampUsers(3) during(5 seconds))).protocols(httpConf)
  // setUp(scn.inject(rampUsersPerSec(3) to(5) during(5 seconds))).protocols(httpConf)
  // setUp(scn.inject(constantConcurrentUsers(2) during(5 seconds))).protocols(httpConf)
  // setUp(scn.inject(rampConcurrentUsers(2) to(5) during(5 seconds))).protocols(httpConf)






}