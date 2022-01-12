import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  @noinline
  def f0(v0: Vector[Vector[Double]], v1: Vector[Vector[Double]], v2: Vector[Vector[Double]], v3: Vector[Vector[Double]], v4: Double): Double = {
    val v12: Vector[Double] = v3(2)
    var v6: Double = v4
    val v8: Double = v6 - v6
    val v15: Double = v12(0)
    val v50: Vector[Double] = v3(1)
    val v14: Vector[Double] = Vector(v15, v4, v8)
    val v29: Double = v50(0)
    var v41: Vector[Double] = v14
    var v54: Vector[Double] = v41
    v54 = v54.updated(2, v29)
    val v84: Double = v54(1)
    v84
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[Double]] = Vector(Vector(0.0), Vector(1.0))
    val v1: Vector[Vector[Double]] = Vector(Vector(2.0), Vector(3.0))
    val v2: Vector[Vector[Double]] = Vector(Vector(4.0))
    val v3: Vector[Vector[Double]] = Vector(Vector(5.0), Vector(6.0), Vector(7.0))
    val v4: Double = 8.0
    val start = nanoTime()
    var result: Double = 8.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}