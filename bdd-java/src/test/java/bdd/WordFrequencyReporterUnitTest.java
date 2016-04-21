package bdd;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class WordFrequencyReporterUnitTest {

    @Test
    public void testCalculate() {
        WordFrequencyReporter sut = new WordFrequencyReporter();
        ArrayList<String> testData = new ArrayList<String>();
        testData.add("one");
        testData.add("two");
        testData.add("two");

        assertEquals(sut.calculate(testData), "1 one,\r\n2 two");
    }

}
