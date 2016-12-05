object P04 {
  def lengthNoTailRecursive(ls: List[_]): Int = ls match {
    case Nil => 0
    case _ :: rest => 1 + lengthNoTailRecursive(rest)
  }

  def lengthTailRecursive(ls: List[_]): Int = {
    def go(n: Int, ls: List[_]): Int = ls match {
      case Nil => n
      case _ :: rest => go(n + 1, rest)
    }

    go(0, ls)
  }
}
