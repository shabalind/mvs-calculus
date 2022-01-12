import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  @noinline
  def f0(v0: Vector[Vector[Double]], v1: Double): Double = {
    var v7: Vector[Vector[Double]] = v0
    val v6: Vector[Double] = v7(0)
    var v4: Vector[Vector[Double]] = v7
    val v9: Vector[Double] = v0(0)
    v4 = v4.updated(0, v6)
    val v8: Vector[Double] = v7(0)
    v4 = v4.updated(0, v8)
    val v3: Vector[Double] = v4(0)
    val v11: Double = v3(0)
    v7 = v7.updated(0, v3)
    v7 = v7.updated(0, v9)
    val v17: Double = v11 - v11
    v4 = v4.updated(0, v6)
    val v28: Vector[Double] = v0(0)
    var v71: Vector[Double] = v28
    v4 = v4.updated(0, v71)
    v17
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