package com.dubswcraft.bdd

case class WordEntity(word: String, frequency: Int)

class WordFrequencyReporter {

  val join = (we: WordEntity) => we.frequency + " " + we.word

  def calculate(count: Int, listOfWords: String): String = {
    if (count <= 0) throw new IllegalArgumentException("count summary should not be negative")
    listOfWords match {
      case "" | null => ""
      case _ => calculateWordsFrequency(listOfWords).take(count).foldLeft(""){ (acc, we) =>
        if (acc == "") join(we) else acc + ", " + join(we)
      }
    }
  }

  def calculateWordsFrequency(listOfWords: String): Seq[WordEntity] = {
    val splitWordsList = listOfWords.split(",").toList
    val performCount = splitWordsList.map(_.trim).groupBy(identity).mapValues(_.size).toSeq.map {
      case (country, count) => WordEntity(country, count)
    }
    performCount.sortBy(we => (-we.frequency, we.word))
  }
}
