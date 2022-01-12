import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  @noinline
  def f0(v0: Vector[Vector[Double]], v1: Vector[Vector[Double]], v2: Double): Double = {
    val v5: Vector[Double] = v0(1)
    val v8: Vector[Double] = v0(0)
    val v25: Double = v5(0)
    val v31: Double = v2 - v25
    val v36: Double = v8(0)
    val v42: Double = v5(0)
    val v34: Vector[Double] = Vector(v25, v31, v36)
    var v62: Vector[Double] = v34
    val v78: Double = v62(2)
    val v134: Double = v34(2)
    var v87: Double = v78
    val v122: Double = v134 * v42
    val v288: Double = v122 + v87
    v288
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