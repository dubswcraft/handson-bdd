Feature: Word and frequency sorter

  Scenario Outline: List of top repeated words sorted by frequency
    Given a list of words <list>
    And the number of top repeated words to print is <count>
    When the word frequency program is executed
    Then the top <count> most frequently occurring words and frequency are printed
    And the results should be <output>

  Examples:
    | list                                                          | count | output                       |
    | america, north, america, south, america, africa, north, korea | 3     | 3 america, 2 north, 1 africa |


