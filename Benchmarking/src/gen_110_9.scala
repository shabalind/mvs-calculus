import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  @noinline
  def f0(v0: Vector[Double], v1: Double): Double = {
    var v5: Vector[Double] = v0
    v5 = v5.updated(1, v1)
    v5 = v5.updated(0, v1)
    val v2: Double = v5(1)
    var v6: Vector[Double] = v0
    val v9: Double = v0(0)
    val v7: Double = v0(0)
    v6 = v6.updated(1, v9)
    v6 = v6.updated(0, v9)
    v5 = v5.updated(0, v9)
    val v10: Vector[Vector[Double]] = Vector(v6)
    var v16: Vector[Vector[Double]] = v10
    v6 = v6.updated(1, v7)
    var v11: Vector[Double] = v6
    var v22: Vector[Vector[Double]] = v16
    v6 = v6.updated(0, v2)
    val v14: Vector[Double] = v16(0)
    v16 = v16.updated(0, v11)
    val v25: Vector[Vector[Vector[Double]]] = Vector(v22)
    var v21: Vector[Vector[Vector[Double]]] = v25
    v22 = v22.updated(0, v14)
    v16 = v16.updated(0, v14)
    var v35: Vector[Double] = v0
    val v49: Vector[Vector[Double]] = v21(0)
    v21 = v21.updated(0, v22)
    val v38: Double = v0(1)
    var v42: Vector[Double] = v35
    val v46: Vector[Double] = v49(0)
    v22 = v22.updated(0, v11)
    var v71: Double = v2
    v22 = v22.updated(0, v42)
    v6 = v6.updated(1, v38)
    var v57: Vector[Double] = v46
    v42 = v42.updated(0, v71)
    v5 = v5.updated(1, v38)
    v35 = v35.updated(0, v71)
    val v64: Double = v57(1)
    v64
  }
  def benchmark(): Unit = {
    val v0: Vector[Double] = Vector(0.0, 1.0)
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