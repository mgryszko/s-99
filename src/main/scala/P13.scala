object P13 {
  def encodeDirect(ls: List[_]): List[(Int, _)] = ls.foldRight(Nil: List[(Int, _)]) { (l, encoded) =>
    if (encoded.isEmpty) List((1, l))
    else {
      val lastEncoded = encoded.head
      if (l != lastEncoded._2) (1, l) +: encoded
      else (lastEncoded._1 + 1, lastEncoded._2) +: encoded.tail
    }
  }
}

