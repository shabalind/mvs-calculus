import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  @noinline
  def f0(v0: Vector[Double], v1: Double): Double = {
    var v2: Vector[Double] = v0
    val v6: Vector[Double] = Vector(v1, v1, v1, v1, v1, v1)
    val v13: Double = v6(5)
    val v5: Double = v2(0)
    var v9: Double = v13
    var v8: Vector[Double] = v6
    var v18: Vector[Double] = v8
    var v12: Vector[Double] = v8
    val v17: Double = v8(1)
    v12 = v12.updated(0, v5)
    var v21: Double = v17
    var v16: Vector[Double] = v12
    val v42: Double = v0(1)
    val v26: Double = v16(0)
    var v27: Vector[Double] = v12
    val v29: Double = v26 / v21
    var v47: Vector[Double] = v27
    var v30: Double = v5
    v12 = v12.updated(3, v9)
    var v39: Vector[Double] = v18
    val v31: Double = v27(4)
    v8 = v8.updated(4, v31)
    var v41: Double = v9
    v16 = v16.updated(2, v41)
    var v150: Vector[Double] = v6
    v16 = v150
    v12 = v12.updated(2, v5)
    v150 = v150.updated(3, v42)
    v12 = v12.updated(1, v30)
    val v192: Double = v47(2)
    val v134: Double = v39(5)
    v30 = v134
    v12 = v12.updated(2, v192)
    v8 = v8.updated(5, v41)
    v29
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