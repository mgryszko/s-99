import P05.{reversePurelyFunctional => reverse}

object P06 {
  def isPalindromeWithReverse(ls: List[_]): Boolean = ls == reverse(ls)

  def isPalindromeWithLast(ls: List[_]): Boolean = {
    if (ls.isEmpty) {
      true
    } else if (ls.head == ls.last) {
      isPalindromeWithLast(ls.tail.take(ls.tail.size - 1))
    } else {
      false
    }
  }
}
