object P03 {
  def kth[A](k: Int, ls: List[A]): A = (k, ls) match {
    case (0, l :: _) => l
    case (n, _ :: rest) => kth(n - 1, rest)
    case (_, Nil) => throw new NoSuchElementException
  }
}
