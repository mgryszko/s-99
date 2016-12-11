object P12 {
  def decode(ls: List[(Int, _)]): List[_] =  ls.flatMap { l => List.fill(l._1)(l._2) }
}

