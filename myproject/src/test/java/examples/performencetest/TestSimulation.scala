package examples.performencetest

import com.intuit.karate.gatling.PreDef.karateFeature
import io.gatling.core.Predef._

import scala.concurrent.duration._
import scala.language.postfixOps

class TestSimulation extends Simulation {
  val getUser = scenario("get request").exec(karateFeature("classpath:examples/performencetest/User.feature"))

  setUp(
    getUser.inject(rampUsers(10) during (5 seconds))
  )
}
