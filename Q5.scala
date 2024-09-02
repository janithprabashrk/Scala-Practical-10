object WordProcessor {
  def countLetterOccurrences(words: List[String]): Int = {
    val wordLengths = words.map(_.length)

    val totalLetterCount = wordLengths.reduce(_ + _)

    totalLetterCount
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val words = List("apple", "banana", "cherry", "date")
    val totalLetters = WordProcessor.countLetterOccurrences(words)

    println("Total count of letter occurrences: " + totalLetters)
  }
}
