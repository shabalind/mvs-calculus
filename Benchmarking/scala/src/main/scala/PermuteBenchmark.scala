package permute

object PermuteBenchmark {
  class Counter { var count = 0 }

  def run(n: Int): Int = {
    val arr = new Array[Int](n)
    val counter = new Counter
    permute(counter, arr, n)
    return counter.count
  }

  def permute(counter: Counter, arr: Array[Int], n: Int): Unit = {
    counter.count += 1
    if (n != 0) {
      val n1 = n - 1
      permute(counter, arr, n1)
      var i = n1
      while (i >= 0) {
        swap(arr, n1, i)
        permute(counter, arr, n1)
        swap(arr, n1, i)
        i -= 1
      }
    }
  }

  def swap(arr: Array[Int], i: Int, j: Int) {
    val tmp = arr(i)
    arr(i) = arr(j)
    arr(i) = tmp
  }

  def main(args: Array[String]): Unit =
    benchmark.Benchmark(args)(run) 
}
