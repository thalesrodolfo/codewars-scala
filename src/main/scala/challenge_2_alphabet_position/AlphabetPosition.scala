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
}

