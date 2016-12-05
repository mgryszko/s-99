object P07 {
  def flatten(ls: List[_]): List[_] = ls flatMap {
    case ms: List[_] => flatten(ms)
    case e => List(e)
  }
}
