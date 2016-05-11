package com.dubswcraft.bdd

import org.scalatest.{WordSpec, Matchers}

class WordFrequencyReporterSpec extends WordSpec with Matchers {

  "calculate" should {
    "return a list of word frequencies ordered by alpha when frequencies repeat" in {
      val expectedList = "3 america, 2 north, 1 africa"
      val countSummary = 3
      val wordsList = " america, north, america, south, america, africa, north, korea "

      val wordsFrequencyReporter = new WordFrequencyReporter()
      wordsFrequencyReporter.calculate(countSummary, wordsList) shouldBe expectedList
    }
  }
}

