package com.dubswcraft.bdd.steps

import com.dubswcraft.bdd.WordFrequencyReporter
import cucumber.api.scala.{ScalaDsl, EN}
import org.scalatest.Matchers

class WordFrequencyReporterSteps extends ScalaDsl with EN with Matchers {

  var listOfWords = ""
  var countSummary = 0
  var output = ""
  var actualResults = ""

  Given( """^a list of words (.*)$""") { (list: String) =>
    println("List : " + list)
    listOfWords = list
  }

  And( """^the number of top repeated words to print is (\d+)$""") { (count: Int) =>
    countSummary = count
  }

  When( """^the word frequency program is executed""") { () =>
    actualResults = new WordFrequencyReporter().calculate(countSummary, listOfWords)
  }

  Then("""^the top (\d+) most frequently occurring words and frequency are printed$"""){ (count:Int) =>
    println("Count : " + count)
  }

  And( """^the results should be (.*)$""") { (output: String) =>
    actualResults shouldBe output
  }
}

