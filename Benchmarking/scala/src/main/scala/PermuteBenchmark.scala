package permute


object PermuteBenchmark extends communitybench.Benchmark {

  def run(input: String): Int = {
    val arr = new Array[Int](6)
    val n = input.toInt
    return permute(arr, n)
  }

  def permute(arr: Array[Int], n: Int): Int = {
    var count = 0
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
    count
  }

  def swap(arr: Array[Int], i: Int, j: Int) {
    val tmp = arr(i)
    arr(i) = arr(j)
    arr(i) = tmp
  }
}
