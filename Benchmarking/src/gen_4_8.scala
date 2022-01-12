import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  @noinline
  def f0(v0: Double): Double = {
    val v2: Vector[Double] = Vector(v0)
    var v1: Vector[Double] = v2
    val v3: Double = v2(0)
    val v5: Double = v1(0)
    v1 = v1.updated(0, v5)
    v1 = v1.updated(0, v3)
    v1 = v1.updated(0, v3)
    val v6: Vector[Double] = Vector(v5, v5, v3, v5)
    val v11: Double = v6(3)
    var v7: Vector[Double] = v6
    var v4: Vector[Double] = v6
    val v16: Vector[Vector[Double]] = Vector(v4, v4, v4)
    v4 = v4.updated(2, v0)
    val v8: Double = v7(0)
    v4 = v4.updated(2, v11)
    var v21: Double = v8
    v7 = v7.updated(0, v3)
    var v20: Vector[Vector[Double]] = v16
    val v12: Double = v2(0)
    val v43: Double = v7(1)
    val v39: Vector[Double] = v20(0)
    v4 = v4.updated(1, v43)
    val v35: Vector[Double] = v20(0)
    val v29: Double = v35(1)
    v4 = v4.updated(3, v12)
    v20 = v20.updated(2, v39)
    var v150: Double = v0
    val v53: Double = v150 + v21
    val v42: Vector[Double] = v16(1)
    v1 = v1.updated(0, v53)
    val v96: Double = v8 * v29
    v20 = v20.updated(1, v42)
    v96
  }
  def benchmark(): Unit = {
    val v0: Double = 0.0
    val start = nanoTime()
    var result: Double = 0.0
    (1 to 1000).foreach { _ =>
      result = f0(v0)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}