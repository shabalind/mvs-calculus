import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Double]
  )
  case class s2 (
    p0: s0,
    p1: s0
  )
  def f33(v0: s0): s0 = {
    val v5: Vector[Double] = v0.p1
    var v2: s0 = v0
    v2 = v2.copy(p1 = v5)
    v2 = v2.copy(p1 = v5)
    val v7: Vector[Double] = v0.p1
    v2 = v2.copy(p1 = v7)
    v2 = v2.copy(p1 = v5)
    val v21: Vector[Vector[Double]] = v2.p0
    v2 = v2.copy(p1 = v5)
    v2 = v0
    val v15: Vector[Vector[Double]] = v0.p0
    val v16: Vector[Vector[Double]] = v2.p0
    val v12: Vector[Double] = v0.p1
    val v18: s0 = s0(v16, v12)
    v2 = v2.copy(p0 = v21)
    v2 = v2.copy(p0 = v15)
    v18
  }
  @noinline
  def f0(v0: Vector[s2], v1: Double): Double = {
    val v2: s2 = v0(2)
    val v6: s0 = v2.p1
    val v8: s0 = f33(v6)
    val v11: Vector[Vector[Double]] = v8.p0
    val v32: Vector[Double] = v11(0)
    val v64: Double = v32(0)
    var v85: Double = v64
    v85
  }
  def benchmark(): Unit = {
    val v0: Vector[s2] = Vector(s2(s0(Vector(Vector(0.0)), Vector(1.0, 2.0)), s0(Vector(Vector(3.0)), Vector(4.0, 5.0))), s2(s0(Vector(Vector(6.0)), Vector(7.0, 8.0)), s0(Vector(Vector(9.0)), Vector(10.0, 11.0))), s2(s0(Vector(Vector(12.0)), Vector(13.0, 14.0)), s0(Vector(Vector(15.0)), Vector(16.0, 17.0))))
    val v1: Double = 18.0
    val start = nanoTime()
    var result: Double = 18.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}