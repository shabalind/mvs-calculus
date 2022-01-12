import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  @noinline
  def f0(v0: Vector[Vector[Double]], v1: Vector[Vector[Double]], v2: Double): Double = {
    var v8: Vector[Vector[Double]] = v1
    val v5: Vector[Double] = v8(0)
    val v4: Double = v5(0)
    var v3: Double = v2
    val v13: Vector[Double] = v8(0)
    var v26: Double = v2
    var v20: Vector[Double] = v13
    val v36: Double = v20(0)
    var v46: Double = v26
    val v41: Double = v36 - v4
    var v28: Vector[Double] = v5
    v28 = v28.updated(0, v41)
    v28 = v28.updated(0, v46)
    v8 = v8.updated(0, v28)
    v20 = v20.updated(0, v3)
    var v178: Double = v41
    v178
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