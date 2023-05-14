package test

object T1 {
  def test(fun: (Int) => Int, low: Int, high: Int) =
    (low to high).map(x => (x, fun(x)))

  def main(args: Array[String]): Unit = {
    val n = test(x => x * x, -5, 5)
    n.foreach(print)
  }
}