package examples;

import com.intuit.karate.junit5.Karate;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.*;
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

    @Test
    public void testParallel() {
        Results results = Runner.path("classpath:examples/users").parallel(5);
        generateReport(results.getReportDir());
        // assertTrue(results.getErrorMessages(), results.getFailCount() == 0);
    }

    public static void generateReport(String karateOutputPath) {
        Collection jsonFiles = FileUtils.listFiles(new File(karateOutputPath), new String[] { "json" }, true);
        List jsonPaths = new ArrayList(jsonFiles.size());
        jsonFiles.forEach(file -> jsonPaths.add(((File) file).getAbsolutePath()));
        Configuration config = new Configuration(new File("target"), "KarateBaseFramework");
        ReportBuilder reportBuilder = new ReportBuilder(jsonPaths, config);
        reportBuilder.generateReports();
    }

    // this will run all *.feature files that exist in sub-directories
    // see https://github.com/intuit/karate#naming-conventions
    @Karate.Test
    Karate testAll() {
        return Karate.run().relativeTo(getClass());
    }

}
