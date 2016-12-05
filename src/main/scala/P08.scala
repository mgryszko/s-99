object P08 {
  def compressNoTailRecursive(ls: List[_]): List[_] = ls match {
    case x +: rest => x +: compressNoTailRecursive(rest.dropWhile(_ == x))
    case _ => Nil
  }

  def compressTailRecursive(ls: List[_]): List[_] = {
    def go(compressed: List[_], ls: List[_]): List[_] = ls match {
      case x +: rest => go(compressed ++ List(x), rest.dropWhile(_ == x))
      case _ => compressed
    }

    go(Nil, ls)
  }

  def compressFunctional[A](ls: List[A]): List[A] = ls.foldRight(Nil: List[A]) {
    (x, compressed) => if (compressed.isEmpty || compressed.head != x) x :: compressed else compressed
  }
}
