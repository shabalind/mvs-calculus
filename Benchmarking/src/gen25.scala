import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  @noinline
  def f0(v0: Vector[Vector[Double]], v1: Vector[Vector[Double]], v2: Double): Double = {
    var v5: Double = v2
    val v8: Double = v2 + v5
    val v14: Vector[Double] = Vector(v5, v8, v8, v5, v5, v5, v5)
    val v12: Double = v14(4)
    var v32: Vector[Double] = v14
    var v36: Vector[Double] = v32
    var v58: Double = v12
    val v73: Double = v36(5)
    v36 = v36.updated(6, v58)
    v36 = v36.updated(6, v5)
    v73
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[Double]] = Vector(Vector(0.0))
    val v1: Vector[Vector[Double]] = Vector(Vector(1.0), Vector(2.0), Vector(3.0))
    val v2: Double = 4.0
    val start = nanoTime()
    var result: Double = 4.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}