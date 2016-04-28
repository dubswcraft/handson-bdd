
from behave import given, when, then
from WordFrequencyReporter import WordFrequencyReporter

@given('a list of words {listOfWords}')
def given_a_list_of_words(context, listOfWords):
    print("List : " + listOfWords)
    context.listOfWords = listOfWords
 
@given('the number of top repeated words to print is {count:d}')
def the_number_is(context, count):
    context.countSummary = count

@when('the word frequency program is executed') 
def the_world_frequency_program_is_executed(context):
    context.actualResults = WordFrequencyReporter().calculate()

@then('the top {count:d} most frequently occurring words and frequency are printed')
def check_is_printed(context, count):
    print("Count : " + count)

@then('the results should be {output}') 
def check_results(context, output):
    assert context.actualResults is output
