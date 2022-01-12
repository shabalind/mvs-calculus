import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  @noinline
  def f0(v0: Vector[Vector[Double]], v1: Vector[Double], v2: Double): Double = {
    val v9: Vector[Double] = v0(1)
    var v4: Vector[Double] = v1
    val v3: Double = v9(0)
    val v11: Double = v2 * v3
    val v8: Vector[Double] = v0(0)
    var v13: Double = v2
    val v18: Double = v3 - v11
    var v20: Vector[Double] = v1
    v4 = v4.updated(0, v3)
    v20 = v20.updated(2, v11)
    var v23: Double = v18
    val v45: Double = v20(0)
    val v24: Double = v1(2)
    v20 = v20.updated(0, v24)
    val v46: Double = v8(0)
    val v34: Vector[Vector[Double]] = Vector(v1, v20, v20, v20, v4)
    var v72: Vector[Vector[Double]] = v34
    var v43: Double = v23
    val v44: Double = v13 - v45
    v72 = v72.updated(3, v1)
    v20 = v20.updated(2, v13)
    v20 = v20.updated(0, v46)
    val v57: Vector[Double] = v72(0)
    var v48: Double = v11
    var v81: Double = v48
    v4 = v4.updated(2, v11)
    v20 = v20.updated(0, v81)
    v4 = v4.updated(1, v44)
    v20 = v20.updated(1, v43)
    val v161: Double = v57(2)
    v161
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[Double]] = Vector(Vector(0.0), Vector(1.0), Vector(2.0))
    val v1: Vector[Double] = Vector(3.0, 4.0, 5.0)
    val v2: Double = 6.0
    val start = nanoTime()
    var result: Double = 6.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}