package performence_test

import com.intuit.karate.gatling.PreDef._
import io.gatling.core.Predef.{Simulation, openInjectionProfileFactory, rampUsers, scenario}

import scala.concurrent.duration.DurationInt

class PetSimulation extends Simulation {

 val getUser = scenario("get request").exec(karateFeature("classpath:examples/performence_test/User.feature"))
//  val postUser = scenario("basic post").exec(karateFeature("classpath:pets/Pets.feature@name=post"))

//  val protocol = karateProtocol(
//    "/pets" -> pauseFor("get" -> 0, "post" -> 0)
//  )

 setUp(
   getUser.inject(rampUsers(30) during (10 seconds)).protocols(protocol)
  //  postUser.inject(rampUsers(30) during (10 seconds)).protocols(protocol)
 )
}