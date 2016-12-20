object P18 {
  def slice(from: Int, to: Int, ls: List[_]): List[_] = ls.drop(from).take(to - from)

  def sliceRecursive(from: Int, to: Int, ls: List[_]): List[_] = {
    (from, to) match {
      case (_, 0) => Nil
      case (0, _) => ls.head +: sliceRecursive(0, to - 1, ls.tail)
      case (_, _) => sliceRecursive(from - 1, to - 1, ls.tail)
    }
  }
}

