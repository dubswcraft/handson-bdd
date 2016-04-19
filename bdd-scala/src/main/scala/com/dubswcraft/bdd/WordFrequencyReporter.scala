package com.dubswcraft.bdd

case class WordEntity(word: String, frequency: Int)

class WordFrequencyReporter {
  def calculate(count: Int, listOfWords: String): String = {
    if (count <= 0) throw new IllegalArgumentException("count summary should not be negative")
    calculateWordsFrequency(listOfWords).take(count)
    ""
  }

  def calculateWordsFrequency(listOfWords: String): Seq[WordEntity] = {
    val splitWordsList = listOfWords.split(",").toList
    splitWordsList.groupBy(identity).mapValues(_.size).toSeq.sortBy(-_._2).map {
      case (country, count) => WordEntity(country.trim, count)
    }
  }
}
