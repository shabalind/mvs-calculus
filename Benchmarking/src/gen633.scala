import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  def f71(v0: Vector[Double]): Vector[Double] = {
    val v6: Double = v0(0)
    var v2: Double = v6
    var v7: Double = v6
    var v8: Double = v7
    var v15: Vector[Double] = v0
    var v9: Vector[Double] = v15
    v9 = v9.updated(0, v2)
    v9 = v9.updated(0, v8)
    v15 = v15.updated(0, v6)
    var v76: Vector[Double] = v9
    v76
  }
  @noinline
  def f0(v0: Vector[Vector[Double]], v1: Double): Double = {
    val v3: Vector[Double] = v0(0)
    val v11: Vector[Double] = f71(v3)
    val v12: Double = v3(0)
    val v10: Double = v11(0)
    var v27: Double = v10
    var v23: Double = v12
    val v25: Double = v27 - v23
    v23 = v27
    var v220: Double = v25
    v220
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[Double]] = Vector(Vector(0.0))
    val v1: Double = 1.0
    val start = nanoTime()
    var result: Double = 1.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}