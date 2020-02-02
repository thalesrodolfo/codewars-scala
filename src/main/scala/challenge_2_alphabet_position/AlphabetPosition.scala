package challenge_2_alphabet_position

object AlphabetPosition extends App {

  def getPosition(letter: Char) : String = {
    val alphabet = ('a' to 'z').toList
    val alphabetIndexed = alphabet.zipWithIndex

    if (!alphabet.contains(letter.toLower)) ""
    else " " + alphabetIndexed
      .filter(_._1 == letter.toLower)
      .map(_._2)
      .head
      .+(1)
      .toString;
  }

  def alphabetPosition(text: String): String =
    text.foldLeft("")(_ + getPosition(_)).tail

  val test1 = "The sunset sets at twelve o' clock."
  // should be 20 8 5 19 21 14 19 5 20 19 5 20 19 1 20 20 23 5 12 22 5 15 3 12 15 3 11

  println(test1)
  println(alphabetPosition(test1))

  println("\n")

  val test2 = "The narwhal bacons at midnight."
  // should be 20 8 5 14 1 18 23 8 1 12 2 1 3 15 14 19 1 20 13 9 4 14 9 7 8 20

  println(test2)
  println(alphabetPosition(test2))
}

