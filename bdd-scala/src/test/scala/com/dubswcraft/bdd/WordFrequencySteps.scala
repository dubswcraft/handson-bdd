package com.dubswcraft.bdd

import cucumber.api.scala.{ScalaDsl, EN}
import org.scalatest.Matchers


class WordFrequencySteps extends ScalaDsl with EN with Matchers {

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
    actualResults = new WordFrequencyReporter().calculate()
  }

  Then("""^the top (\d+) most frequently occurring words and frequency are printed$"""){ (count:Int) =>
    println("Count : " + count)
  }

  And( """^the results should be (.*)$""") { (output: String) =>
    actualResults shouldBe output
  }
}

