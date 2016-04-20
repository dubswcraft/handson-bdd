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

    @Test
    public void testCountOccurances() {
        WordFrequencyReporter sut = new WordFrequencyReporter();
        ArrayList<String> testData = new ArrayList<String>();
        testData.add("one");
        testData.add("two");
        testData.add("two");

        HashMap<String, Integer> expectedResults = new HashMap<String, Integer>();
        expectedResults.put("one", 1);
        expectedResults.put("two", 2);

        assertEquals(sut.countOccurances(testData), expectedResults);
    }

    @Test
    public void testFormatForOutput() {
        WordFrequencyReporter sut = new WordFrequencyReporter();

        HashMap<String, Integer> testData = new HashMap<String, Integer>();
        testData.put("one", 1);
        testData.put("two", 2);

        assertEquals(sut.formatForOutput(testData), "1 one,\r\n2 two");
    }

}
