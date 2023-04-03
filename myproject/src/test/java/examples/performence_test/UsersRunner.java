package examples.performence_test;

import com.intuit.karate.junit5.Karate;

class UsersRunner {

    @Karate.Test
    Karate testUsers() {
        return Karate.run("User").relativeTo(getClass());
    }

}
