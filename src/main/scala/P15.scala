object P15 {
  def duplicateN[A](times: Int, ls: List[A]): List[A] = ls.flatMap(List.fill(times)(_))
}

