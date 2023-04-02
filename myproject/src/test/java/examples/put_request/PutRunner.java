package examples.put_request;

import com.intuit.karate.junit5.Karate;

public class PutRunner {

    @Karate.Test
    Karate testPutReques() {
        return Karate.run("putRequest.feature").relativeTo(getClass());
    }
}
