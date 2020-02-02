package challenge_1_split_strings

object SplitStrings extends App {
  def solution(s: String): List[String] = {
    s.length match {
      case 0 => List()
      case 1 => (s + "_") :: solution("")
      case _ => (s.take(2)) :: solution(s.drop(2))
    }
  }

}
