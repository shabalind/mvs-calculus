package benchmark

object Benchmark {
  @noinline
  def verify(results: Array[Int], expected: Int): Unit = {
    results.foreach { result =>
      assert(result == expected)
    }
  }

  @noinline
  def dump(times: Array[Long]): Unit = {
    var i = 0
    while (i < times.length) {
      System.out.println(times(i))
      i += 1
    }
  }

  def apply(args: Array[String])(f: Int => Int): Unit = {
    val measurements = args(0).toInt
    val input        = args(1).toInt
    val expected     = args(2).toInt

    assert(measurements >= 1)

    var i       = 0
    val times   = new Array[Long](measurements)
    val results = new Array[Int](measurements)

    while (i < measurements) {
      val start = System.nanoTime()
      val result = f(input)
      val end = System.nanoTime()
      results(i) = result
      times(i) = end - start
      i += 1
    }

    verify(results, expected)
    dump(times)
  }
}
