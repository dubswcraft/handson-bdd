package steps;

import bdd.WordFrequencyReporter;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class StepsDefs {

    HashMap<String, String> state = new HashMap<>();

    @Given("^a list of words (.*)$")
    public void a_list_of_words(String list) throws Throwable {
        state.put("list", list);
    }

    @Given("^the number of top repeated words to print is (\\d+)$")
    public void the_number_of_top_repeated_words_to_print_is(int count) throws Throwable {
        state.put("count", "" + count);
    }

    @When("^the word frequency program is executed$")
    public void the_word_frequency_program_is_executed() throws Throwable {
        List<String> list = new ArrayList<String>(Arrays.asList(state.get("list").split(",")));
        Integer count = Integer.parseInt(state.get("count"));
        state.put("results", new WordFrequencyReporter().calculate(list));

    }

    @Then("^the top (\\d+) most frequently occurring words and frequency are calculated$")
    public void the_top_most_frequently_occurring_words_and_frequency_are_calculated(String expectedOutput) throws Throwable {
    }

    @Then("^the results should be (.*)$")
    public void the_results_should_be(String expectedOutput) throws Throwable {
        assertEquals("Expected output different from actual output", state.get("results"), expectedOutput);
    }
}
