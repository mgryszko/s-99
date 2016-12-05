object P05 {
  def reverseNoTailRecursive[A](ls: List[A]): List[A] = ls match {
    case x +: Nil => List(x)
    case x +: rest => reverseNoTailRecursive(rest) ++ List(x)
  }

  def reverseTailRecursive[A](ls: List[A]): List[A] = {
    def go(reversed: List[A], remaining: List[A]): List[A] = remaining match {
      case x +: Nil => x +: reversed
      case x +: rest => go(x +: reversed, rest)
    }
    go(Nil, ls)
  }

  def reversePurelyFunctional[A](ls: List[A]): List[A] = ls.foldLeft(Nil: List[A])((reversed, x) => x +: reversed)
}
