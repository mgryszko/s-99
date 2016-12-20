object P20 {
  def removeAt(n: Int, ls: List[_]): List[_] = ls.take(n) ++ ls.drop(n + 1)

  def removeAtRecursive(n: Int, ls: List[_]): List[_] = (n, ls) match {
    case (x, xs) if x < 0 || x >= xs.length => xs
    case (0, _ +: tail) => tail
    case (x, head +: tail) => head +: removeAtRecursive(x - 1, tail)
  }
}

