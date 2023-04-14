package examples.get_request;

import com.intuit.karate.junit5.Karate;

public class GetRunner {
    @Karate.Test
    Karate testGetRequest() {
        return Karate.run("getRequest.feature").relativeTo(getClass());
    }
}
