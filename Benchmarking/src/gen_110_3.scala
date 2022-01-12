import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f88(v0: s0): s0 = {
    var v2: s0 = v0
    v2 = v0
    var v7: s0 = v0
    var v4: s0 = v2
    val v6: Vector[Vector[Double]] = v7.p0
    val v3: Vector[Double] = v6(1)
    v7 = v4
    var v8: Vector[Vector[Double]] = v6
    v8 = v8.updated(0, v3)
    val v5: Vector[Double] = v8(0)
    var v16: Vector[Double] = v5
    val v14: Vector[Double] = v8(1)
    val v12: Double = v16(0)
    val v10: Vector[Vector[Double]] = v4.p1
    v16 = v16.updated(0, v12)
    v4 = v2
    val v13: Double = v14(0)
    val v49: Vector[Vector[Double]] = v4.p0
    val v20: Vector[Double] = v6(0)
    val v19: Vector[Vector[Double]] = v7.p1
    v4 = v4.copy(p1 = v19)
    var v21: Vector[Vector[Double]] = v49
    val v36: Vector[s0] = Vector(v0)
    v8 = v8.updated(0, v14)
    v21 = v6
    var v59: Double = v13
    var v34: s0 = v4
    v16 = v16.updated(0, v59)
    val v105: Vector[Vector[Double]] = v34.p0
    var v61: s0 = v7
    val v64: Vector[Vector[Double]] = v61.p0
    v8 = v8.updated(0, v20)
    val v56: s0 = s0(v64, v10)
    v7 = v56
    v21 = v21.updated(0, v5)
    v34 = v34.copy(p0 = v21)
    v8 = v8.updated(0, v16)
    v34 = v34.copy(p0 = v105)
    v2 = v2.copy(p0 = v8)
    var v77: Vector[s0] = v36
    val v74: s0 = v77(0)
    v61 = v74
    v34
  }
  @noinline
  def f0(v0: s0, v1: Double): Double = {
    val v4: s0 = f88(v0)
    val v2: Vector[Vector[Double]] = v4.p0
    var v14: Double = v1
    val v17: Vector[Double] = v2(0)
    val v23: Double = v17(0)
    val v22: Double = v14 - v14
    val v28: Double = v22 * v23
    v28
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0)))
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