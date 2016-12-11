object P14 {
  def duplicate[A](ls: List[A]): List[A] = ls.foldRight(Nil: List[A]) { (l, duplicated) => l +: l +: duplicated }
}

