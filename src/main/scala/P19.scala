object P19 {
  def rotate(n: Int, ls: List[_]): List[_] = {
    if (n >= 0) ls.drop(n) ++ ls.take(n)
    else ls.takeRight(-n) ++ ls.take(ls.length - (-n))
  }
}

