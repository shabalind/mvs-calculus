import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: s0,
    p1: Vector[s1]
  )
  @noinline
  def f0(v0: Vector[s0], v1: Vector[s2], v2: Double): Double = {
    val v7: s0 = v0(0)
    val v6: Vector[Vector[Double]] = v7.p0
    val v8: Vector[Double] = v6(1)
    var v4: Vector[Vector[Double]] = v6
    val v20: Double = v8(0)
    v4 = v4.updated(1, v8)
    val v50: Vector[Double] = v4(0)
    val v71: Vector[Double] = v4(1)
    val v75: Double = v50(0)
    v4 = v4.updated(0, v71)
    var v150: Double = v75
    val v55: Double = v20 - v150
    v55
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0))))
    val v1: Vector[s2] = Vector(s2(s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0))), Vector(s1(s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0)))))))
    val v2: Double = 16.0
    val start = nanoTime()
    var result: Double = 16.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}