object P02 {
  def penultimate[A](ls: List[A]): A = {
    ls match {
      case x :: _ :: List() => x
      case _ :: rest => penultimate(rest)
      case _ => throw new NoSuchElementException
    }
  }
}
