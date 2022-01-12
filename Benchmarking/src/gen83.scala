import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Double],
    p1: s0
  )
  case class s2 (
    p0: s0,
    p1: s0
  )
  @noinline
  def f0(v0: s0, v1: s1, v2: s1, v3: s2, v4: Double): Double = {
    val v7: Vector[Vector[Double]] = v0.p1
    val v6: Vector[Double] = v7(0)
    val v8: Vector[Vector[Double]] = v0.p1
    val v13: Double = v6(0)
    val v25: Vector[Double] = v8(0)
    val v56: Double = v25(0)
    val v49: Double = v13 * v56
    val v75: Double = v6(0)
    var v48: Double = v49
    v48 = v75
    v48
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0)))
    val v1: s1 = s1(Vector(3.0, 4.0), s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0))))
    val v2: s1 = s1(Vector(8.0, 9.0), s0(Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0))))
    val v3: s2 = s2(s0(Vector(Vector(13.0), Vector(14.0)), Vector(Vector(15.0))), s0(Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0))))
    val v4: Double = 19.0
    val start = nanoTime()
    var result: Double = 19.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}