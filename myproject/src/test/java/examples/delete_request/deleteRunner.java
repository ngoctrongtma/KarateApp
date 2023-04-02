package examples.delete_request;

import com.intuit.karate.junit5.Karate;

public class deleteRunner {

    @Karate.Test
    Karate testDeleteReques() {
        return Karate.run("deleteRequest.feature").relativeTo(getClass());
    }
}
