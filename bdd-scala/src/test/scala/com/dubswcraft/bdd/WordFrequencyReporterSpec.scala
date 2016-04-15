package com.dubswcraft.bdd

import org.scalatest.{WordSpec, Matchers}

class WordFrequencyReporterSpec extends WordSpec with Matchers {

  "calculate" should {
    "return an empty report when an empty list and any valid top N is passed in" in {
      val topN = 3
      val wordsList = ""
      val wordsFrequencyBuilder = new WordFrequencyReporter()
      wordsFrequencyBuilder.calculate(topN, wordsList) shouldBe "";
    }

    "return a list of word frequencies ordered by alpha when frequencies repeat" in {
      val expectedList = "3 america, 2 england, 2 north, 2 south"
      val countSummary = 4
      val wordsList = "united, states, america, north, america, south, america, south, africa," +
        "north, korea, england, england"

      val wordsFrequencyReporter = new WordFrequencyReporter()
      wordsFrequencyReporter.calculate(countSummary, wordsList) shouldBe expectedList
    }
  }
}
