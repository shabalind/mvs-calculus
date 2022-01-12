import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0,
    p2: Vector[s0],
    p3: s0
  )
  case class s2 (
    p0: s1
  )
  case class s4 (
    p0: s0,
    p1: s2
  )
  @noinline
  def f0(v0: Vector[s4], v1: Double): Double = {
    val v7: s4 = v0(0)
    var v5: Double = v1
    val v22: s0 = v7.p0
    val v57: Double = v1 + v5
    val v46: Vector[Vector[Double]] = v22.p1
    val v23: Vector[Double] = v46(0)
    val v31: Double = v23(0)
    var v112: Double = v31
    val v197: Double = v57 - v112
    val v61: Double = v31 / v197
    val v76: Double = v61 * v197
    v76
  }
  def benchmark(): Unit = {
    val v0: Vector[s4] = Vector(s4(s0(Vector(Vector(0.0)), Vector(Vector(1.0))), s2(s1(s0(Vector(Vector(2.0)), Vector(Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0))), Vector(s0(Vector(Vector(6.0)), Vector(Vector(7.0))), s0(Vector(Vector(8.0)), Vector(Vector(9.0))), s0(Vector(Vector(10.0)), Vector(Vector(11.0)))), s0(Vector(Vector(12.0)), Vector(Vector(13.0)))))))
    val v1: Double = 14.0
    val start = nanoTime()
    var result: Double = 14.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}