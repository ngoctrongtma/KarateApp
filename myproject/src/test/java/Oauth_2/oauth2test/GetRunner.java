package Oauth_2.oauth2test;

import com.intuit.karate.junit5.Karate;

public class GetRunner {
    @Karate.Test
    Karate testGetRequest() {
        return Karate.run("getRequest.feature").relativeTo(getClass());
    }
}
