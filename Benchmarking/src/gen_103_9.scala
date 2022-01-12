import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  def f39(v0: Double): Double = {
    var v1: Double = v0
    var v6: Double = v1
    val v3: Vector[Double] = Vector(v6)
    val v5: Double = v3(0)
    var v4: Vector[Double] = v3
    var v8: Double = v0
    val v10: Double = v4(0)
    var v2: Vector[Double] = v4
    val v12: Double = v4(0)
    var v14: Vector[Double] = v2
    var v26: Vector[Double] = v4
    var v20: Vector[Double] = v2
    val v13: Double = v14(0)
    v2 = v2.updated(0, v13)
    v2 = v2.updated(0, v10)
    val v16: Double = v2(0)
    v26 = v26.updated(0, v16)
    val v40: Vector[Vector[Double]] = Vector(v26, v20, v3)
    v20 = v20.updated(0, v12)
    v14 = v14.updated(0, v5)
    val v41: Vector[Double] = v40(1)
    val v49: Double = v41(0)
    v2 = v2.updated(0, v13)
    v14 = v14.updated(0, v8)
    v49
  }
  @noinline
  def f0(v0: Vector[Vector[Double]], v1: Double): Double = {
    val v7: Vector[Double] = v0(0)
    var v2: Double = v1
    var v10: Vector[Double] = v7
    v10 = v10.updated(0, v1)
    v10 = v10.updated(0, v1)
    v10 = v10.updated(0, v2)
    val v23: Double = v10(0)
    v10 = v10.updated(0, v23)
    val v17: Vector[Double] = v0(0)
    val v36: Double = v10(0)
    val v33: Double = v17(0)
    val v40: Double = v33 / v36
    val v50: Double = f39(v40)
    v50
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