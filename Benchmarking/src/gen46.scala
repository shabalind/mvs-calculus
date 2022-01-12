import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  @noinline
  def f0(v0: Vector[Vector[Double]], v1: Double): Double = {
    var v5: Double = v1
    val v13: Double = v5 + v1
    val v3: Vector[Double] = v0(0)
    val v6: Double = v3(0)
    var v10: Vector[Double] = v3
    var v21: Double = v6
    var v11: Vector[Double] = v10
    var v15: Vector[Double] = v3
    var v8: Vector[Vector[Double]] = v0
    v15 = v15.updated(0, v21)
    var v19: Vector[Double] = v15
    val v48: Vector[Double] = v8(0)
    v15 = v15.updated(0, v21)
    val v25: Double = v19(0)
    val v12: Double = v48(0)
    val v14: Double = v21 + v1
    v8 = v0
    var v23: Vector[Double] = v19
    v19 = v19.updated(0, v25)
    val v28: Vector[Double] = v0(1)
    var v43: Vector[Vector[Double]] = v8
    v21 = v12
    v43 = v43.updated(0, v23)
    v10 = v10.updated(0, v13)
    var v54: Double = v5
    v8 = v8.updated(0, v28)
    v15 = v15.updated(0, v14)
    val v41: Double = v10(0)
    var v45: Double = v54
    val v86: Vector[Double] = v43(0)
    v43 = v43.updated(0, v23)
    val v72: Double = v86(0)
    var v82: Double = v72
    v23 = v10
    v8 = v8.updated(0, v11)
    v15 = v15.updated(0, v45)
    v11 = v11.updated(0, v41)
    v82
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[Double]] = Vector(Vector(0.0), Vector(1.0))
    val v1: Double = 2.0
    val start = nanoTime()
    var result: Double = 2.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}