import P09.{packFunctional => pack}

object P10 {
  def encode(ls: List[_]): List[(Int, _)] = pack(ls).map(l => (l.size, l.head))
}
