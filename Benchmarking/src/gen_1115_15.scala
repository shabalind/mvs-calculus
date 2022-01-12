import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f13(v0: s0): s0 = {
    var v6: s0 = v0
    val v1: Vector[Vector[Double]] = v6.p0
    var v2: s0 = v6
    v2 = v2.copy(p1 = v1)
    val v9: Vector[Double] = v1(0)
    val v8: Vector[Vector[Double]] = v6.p1
    val v7: Vector[Double] = v8(0)
    val v13: Vector[Vector[Double]] = v0.p1
    var v4: s0 = v2
    val v12: Vector[Vector[Double]] = v2.p1
    val v16: Vector[Vector[Double]] = v0.p0
    v4 = v4.copy(p0 = v8)
    var v21: Vector[Double] = v9
    var v10: Vector[Vector[Double]] = v13
    v2 = v2.copy(p0 = v16)
    val v23: Double = v7(0)
    v10 = v10.updated(0, v21)
    v21 = v21.updated(0, v23)
    v2 = v4
    val v24: Vector[Double] = v1(0)
    val v54: Vector[Vector[Double]] = v2.p0
    val v55: s0 = s0(v8, v54)
    v4 = v4.copy(p1 = v16)
    v6 = v55
    val v34: s0 = s0(v12, v10)
    v2 = v2.copy(p0 = v10)
    v10 = v10.updated(0, v24)
    v34
  }
  @noinline
  def f0(v0: s0, v1: Vector[s0], v2: Double): Double = {
    val v7: s0 = v1(0)
    val v4: s0 = f13(v7)
    val v6: Vector[Vector[Double]] = v4.p0
    val v12: Vector[Double] = v6(0)
    val v40: Double = v12(0)
    v40
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0)), Vector(Vector(1.0)))
    val v1: Vector[s0] = Vector(s0(Vector(Vector(2.0)), Vector(Vector(3.0))))
    val v2: Double = 4.0
    val start = nanoTime()
    var result: Double = 4.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}