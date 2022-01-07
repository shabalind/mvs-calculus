package permute

object PermuteBenchmark {
  var count = 0

  def run(n: Int): Int = {
    val arr = new Array[Int](n)
    count = 0
    permute(arr, n)
    return count
  }

  def permute(arr: Array[Int], n: Int): Unit = {
    count += 1
    if (n != 0) {
      val n1 = n - 1
      permute(arr, n1)
      var i = n1
      while (i >= 0) {
        swap(arr, n1, i)
        permute(arr, n1)
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
