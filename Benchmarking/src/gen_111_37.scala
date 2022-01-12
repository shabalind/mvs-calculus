import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s2 (
    p0: s0,
    p1: s1
  )
  case class s7 (
    p0: Double,
    p1: s2
  )
  def f22(v0: Double, v1: s2): Double = {
    val v5: s0 = v1.p0
    val v7: Vector[Vector[Double]] = v5.p1
    val v12: Vector[Double] = v7(0)
    val v10: Double = v12(0)
    v10
  }
  @noinline
  def f0(v0: s2, v1: s7, v2: Double): Double = {
    val v4: Double = v2 - v2
    val v5: Double = f22(v2, v0)
    val v7: Double = v4 * v5
    val v14: Double = f22(v7, v0)
    v14
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(s0(Vector(Vector(0.0)), Vector(Vector(1.0))), s1(s0(Vector(Vector(2.0)), Vector(Vector(3.0))), Vector(s0(Vector(Vector(4.0)), Vector(Vector(5.0))), s0(Vector(Vector(6.0)), Vector(Vector(7.0))))))
    val v1: s7 = s7(8.0, s2(s0(Vector(Vector(9.0)), Vector(Vector(10.0))), s1(s0(Vector(Vector(11.0)), Vector(Vector(12.0))), Vector(s0(Vector(Vector(13.0)), Vector(Vector(14.0))), s0(Vector(Vector(15.0)), Vector(Vector(16.0)))))))
    val v2: Double = 17.0
    val start = nanoTime()
    var result: Double = 17.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}