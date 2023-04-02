package examples.post_request;

import com.intuit.karate.junit5.Karate;

public class PostRunner {

    @Karate.Test
    Karate testPostReques() {
        return Karate.run("postRequest.feature").relativeTo(getClass());
    }
}
