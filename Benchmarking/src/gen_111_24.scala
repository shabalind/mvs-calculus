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
  case class s4 (
    p0: s0,
    p1: s1
  )
  def f32(v0: s1): s1 = {
    val v1: s0 = v0.p1
    val v11: s4 = s4(v1, v0)
    val v26: s1 = v11.p1
    var v29: s1 = v26
    v29
  }
  @noinline
  def f0(v0: s1, v1: Double): Double = {
    val v2: s1 = f32(v0)
    val v6: s0 = v2.p0
    val v4: Vector[Vector[Double]] = v6.p1
    val v10: Vector[Double] = v4(0)
    val v11: Double = v10(0)
    v11
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0))))
    val v1: Double = 8.0
    val start = nanoTime()
    var result: Double = 8.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}