package challenge_1_split_strings

import challenge_1_split_strings.SplitStrings.solution
import org.scalatest.FunSuite

class SplitStringsTests extends FunSuite {

  test("Split strings with input: 'abc'") {
    val input: String = "abc"
    assert(solution(input) == List("ab", "c_"))
  }

  test("Split string with input: '' (empty) ") {
    val input: String = ""
    assert(solution(input) == List())
  }

  test("Split strings with input: 'asdfads'") {
    val input: String = "asdfads"
    assert(solution(input) == List("as", "df", "ad", "s_"))
  }

  test("Split strings with input: 'asdfadsf'") {
    val input: String = "asdfadsf"
    assert(solution(input) == List("as", "df", "ad", "sf"))
  }

}
