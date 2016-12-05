object P09 {
  def packNoTailRecursive(ls: List[_]): List[List[_]] = {
    if (ls.isEmpty) Nil
    else {
      val (prefix, rest) = ls.span(_ == ls.head)
      prefix +: packNoTailRecursive(rest)
    }
  }

  def packFunctional(ls: List[_]): List[List[_]] = ls.foldRight(Nil: List[List[_]]) {
    (x, packed) => {
      if (packed.isEmpty || x != packed.head.head) List(x) +: packed
      else (x +: packed.head) +: packed.tail
    }
  }
}
