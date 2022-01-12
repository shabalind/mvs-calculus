import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  @noinline
  def f0(v0: Vector[Vector[Double]], v1: Vector[Vector[Double]], v2: Vector[Vector[Double]], v3: Vector[Vector[Double]], v4: Double): Double = {
    var v6: Double = v4
    val v7: Double = v6 - v4
    var v12: Double = v7
    val v11: Vector[Double] = v0(0)
    var v15: Double = v12
    val v13: Double = v11(0)
    var v17: Vector[Double] = v11
    var v20: Double = v13
    v17 = v17.updated(0, v15)
    var v29: Vector[Double] = v17
    val v81: Double = v29(0)
    v17 = v11
    v17 = v17.updated(0, v20)
    v81
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[Double]] = Vector(Vector(0.0))
    val v1: Vector[Vector[Double]] = Vector(Vector(1.0))
    val v2: Vector[Vector[Double]] = Vector(Vector(2.0))
    val v3: Vector[Vector[Double]] = Vector(Vector(3.0))
    val v4: Double = 4.0
    val start = nanoTime()
    var result: Double = 4.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}