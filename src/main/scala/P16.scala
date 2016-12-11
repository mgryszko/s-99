object P16 {
  def dropNoTailRecursiveFunctional[A](nth: Int, ls: List[A]): List[A] = {
    if (ls.length < nth) ls
    else ls.take(nth - 1) ++ dropNoTailRecursiveFunctional(nth, ls.takeRight(ls.length - nth))
  }

  def dropPatternMatch[A](nth: Int, ls: List[A]): List[A] = (nth, ls) match {
    case (_, Nil) => Nil
    case (1, _ +: rest) => dropPatternMatch(nth, rest)
    case (n, h +: rest) => h +: dropPatternMatch(n - 1, rest)
  }
}

