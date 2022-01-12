import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  @noinline
  def f0(v0: Vector[Vector[Double]], v1: Vector[Vector[Double]], v2: Double): Double = {
    var v4: Double = v2
    var v5: Double = v4
    v4 = v2
    val v22: Double = v4 + v5
    val v36: Double = v5 - v4
    v5 = v4
    var v27: Double = v22
    var v83: Double = v2
    val v34: Double = v27 - v83
    var v62: Double = v34
    v62 = v36
    v62
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[Double]] = Vector(Vector(0.0), Vector(1.0))
    val v1: Vector[Vector[Double]] = Vector(Vector(2.0))
    val v2: Double = 3.0
    val start = nanoTime()
    var result: Double = 3.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}