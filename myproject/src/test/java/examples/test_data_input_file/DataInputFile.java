package examples.test_data_input_file;

import com.intuit.karate.junit5.Karate;

public class DataInputFile {

    @Karate.Test
    Karate testDataInputFile() {
        return Karate.run("dataInputFile.feature").relativeTo(getClass());
    }
}
