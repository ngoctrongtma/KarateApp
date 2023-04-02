package examples.scenario_outline;

import com.intuit.karate.junit5.Karate;

public class ScenarioOutLineRunner {

    @Karate.Test
    Karate testDataInputFile() {
        return Karate.run("scenarioOutLine.feature").relativeTo(getClass());
    }
}
