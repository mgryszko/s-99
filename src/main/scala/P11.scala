import P10.encode

object P11 {
  def encodeModified(ls: List[_]): List[_] = encode(ls).map {
    case (l: Int, elem) if l == 1 => elem
    case l => l
  }
}

