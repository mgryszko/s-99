object P01 {
  def last[A](ls: List[A]): A = {
    // l.last
    ls match {
      case x :: Nil => x
      case _ :: rest => last(rest)
      case _ => throw new NoSuchElementException
    }
  }
}
