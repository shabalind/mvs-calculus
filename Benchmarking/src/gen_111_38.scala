import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  @noinline
  def f0(v0: Vector[Vector[Double]], v1: Double): Double = {
    var v7: Double = v1
    val v5: Vector[Double] = Vector(v1, v7, v1)
    v7 = v1
    var v6: Vector[Double] = v5
    v6 = v6.updated(0, v1)
    v6 = v5
    val v13: Double = v6(1)
    v6 = v6.updated(2, v7)
    v6 = v6.updated(1, v13)
    v6 = v6.updated(1, v1)
    var v14: Vector[Double] = v6
    val v22: Double = v5(2)
    val v20: Double = v6(1)
    v6 = v6.updated(0, v1)
    val v34: Double = v6(0)
    v6 = v6.updated(2, v34)
    v7 = v20
    var v46: Vector[Double] = v14
    v6 = v6.updated(0, v22)
    val v62: Double = v46(0)
    v62
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