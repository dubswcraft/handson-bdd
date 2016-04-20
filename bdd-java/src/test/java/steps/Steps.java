package steps;

import bdd.WordFrequencyReporter;
import cucumber.api.java8.En;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Steps implements En {
    public Steps() {

        String wordList = "";
        HashMap<String, String> state = new HashMap<>();

        Given("a list of words (.*)", (String list) -> {
            state.put("list", list);
        });

        And("the number of top repeated words to print is (\\d+)", (Integer count) -> {
            state.put("count", "" + count);
        });

        When("the word frequency program is executed", () -> {
            List<String> list = new ArrayList<String>(Arrays.asList(state.get("list").split(",")));
            Integer count = Integer.parseInt(state.get("count"));
            state.put("results", new WordFrequencyReporter().calculate(list));
        });

        Then("the top (\\d+) most frequently occurring words and frequency are calculated", (Integer count) -> {
            System.out.println("Count : " + count);
        });

        And("the results should be (.*)", (String output) -> {
            assertEquals("should be equal", state.get("results"), output);
        });
    }
}