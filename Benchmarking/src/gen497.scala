import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s2 (
    p0: s0,
    p1: Vector[s0]
  )
  def f32(v0: s2): s2 = {
    val v4: Vector[s0] = v0.p1
    var v2: s2 = v0
    val v6: s0 = v2.p0
    val v1: s2 = s2(v6, v4)
    v2 = v2.copy(p0 = v6)
    v2 = v2.copy(p1 = v4)
    v2 = v0
    var v55: s2 = v1
    v55
  }
  @noinline
  def f0(v0: s2, v1: Double): Double = {
    val v3: s2 = f32(v0)
    val v5: s0 = v3.p0
    val v6: Vector[Vector[Double]] = v5.p0
    val v13: Vector[Double] = v6(1)
    var v12: Vector[Vector[Double]] = v6
    v12 = v12.updated(0, v13)
    val v22: Vector[Double] = v12(0)
    val v29: Double = v22(0)
    val v47: Double = v29 * v1
    v47
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))), Vector(s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0)))))
    val v1: Double = 6.0
    val start = nanoTime()
    var result: Double = 6.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}