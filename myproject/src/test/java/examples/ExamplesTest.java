package examples;

import com.intuit.karate.junit5.Karate;
import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import static org.junit.Assert.*;
// import org.junit.Test;

class ExamplesTest {

    @Karate.Test
    Karate testSample() {
        return Karate.run("users/users").relativeTo(getClass());
    }

    @Karate.Test
    Karate testTags() {
        return Karate.run("tags").tags("@user").relativeTo(getClass());
    }

    @Karate.Test
    public void testParallel() {
        Results results = Runner.path("classpath:users/users").tags("~@deleteUser").parallel(5);
         assertTrue(results.getErrorMessages(), results.getFailCount() == 0);
    }
    
    // this will run all *.feature files that exist in sub-directories
    // see https://github.com/intuit/karate#naming-conventions   
    @Karate.Test
    Karate testAll() {
        return Karate.run().relativeTo(getClass());
    }
    
}
