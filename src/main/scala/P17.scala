object P17 {
  def split(onNth: Int, ls: List[_]): (List[_], List[_]) = (ls.take(onNth), ls.takeRight(ls.length - onNth))

  def splitRecursive(onNth: Int, ls: List[_]): (List[_], List[_]) = {
    if (onNth == 0) (Nil, ls)
    else {
      val nextSplit = splitRecursive(onNth - 1, ls.tail)
      (ls.head +: nextSplit._1, nextSplit._2)
    }
  }
}
