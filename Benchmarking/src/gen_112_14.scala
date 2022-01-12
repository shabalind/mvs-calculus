import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  @noinline
  def f0(v0: Vector[Vector[Double]], v1: Double): Double = {
    var v3: Vector[Vector[Double]] = v0
    var v4: Vector[Vector[Double]] = v3
    var v6: Vector[Vector[Double]] = v3
    val v13: Vector[Double] = v4(1)
    v3 = v3.updated(2, v13)
    var v14: Vector[Double] = v13
    v6 = v6.updated(2, v13)
    val v11: Vector[Vector[Vector[Double]]] = Vector(v3)
    v6 = v6.updated(2, v14)
    val v16: Vector[Vector[Double]] = v11(0)
    var v24: Vector[Vector[Double]] = v6
    val v19: Vector[Double] = v16(0)
    var v26: Double = v1
    v4 = v4.updated(2, v19)
    val v81: Vector[Double] = v24(1)
    v3 = v3.updated(2, v19)
    v6 = v6.updated(2, v81)
    v3 = v3.updated(2, v13)
    val v85: Double = v81(0)
    v14 = v14.updated(0, v26)
    v85
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[Double]] = Vector(Vector(0.0), Vector(1.0), Vector(2.0))
    val v1: Double = 3.0
    val start = nanoTime()
    var result: Double = 3.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}