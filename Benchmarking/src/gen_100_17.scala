import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f16(v0: Double): Double = {
    var v5: Double = v0
    var v4: Double = v0
    var v2: Double = v0
    var v3: Double = v0
    v2 = v3
    var v7: Double = v5
    var v8: Double = v4
    var v13: Double = v3
    val v1: Double = v13 * v7
    v5 = v3
    var v14: Double = v4
    var v30: Double = v2
    var v16: Double = v8
    val v43: Vector[Double] = Vector(v14, v8, v8)
    var v39: Vector[Double] = v43
    val v25: Vector[Double] = Vector(v7)
    v39 = v39.updated(0, v1)
    val v19: Double = v25(0)
    v39 = v39.updated(1, v16)
    v39 = v39.updated(1, v19)
    v39 = v39.updated(0, v30)
    v39 = v39.updated(2, v3)
    val v81: Double = v39(1)
    v81
  }
  @noinline
  def f0(v0: s0, v1: Double): Double = {
    val v6: Vector[Vector[Double]] = v0.p0
    val v18: Vector[Double] = v6(2)
    val v14: Double = v18(0)
    val v24: Double = f16(v14)
    val v47: Double = v18(0)
    val v42: Vector[Double] = v6(1)
    val v95: Double = f16(v1)
    val v60: Vector[Double] = v6(1)
    var v57: Vector[Double] = v60
    v57 = v57.updated(0, v95)
    val v74: Double = f16(v47)
    val v121: Double = v57(0)
    var v116: Vector[Double] = v42
    val v92: Double = v47 + v121
    var v112: Vector[Double] = v116
    v57 = v57.updated(0, v92)
    val v101: Double = v112(0)
    v112 = v112.updated(0, v74)
    v57 = v57.updated(0, v24)
    val v232: Double = v92 + v101
    v232
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0)))
    val v1: Double = 4.0
    val start = nanoTime()
    var result: Double = 4.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}