package examples.caller;

import com.intuit.karate.junit5.Karate;

public class CallerRunner {

    @Karate.Test
    Karate testDeleteReques() {
        return Karate.run("caller2.feature").relativeTo(getClass());
    }
}
