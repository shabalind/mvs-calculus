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
  @noinline
  def f0(v0: s1, v1: Double): Double = {
    val v8: s0 = v0.p0
    var v6: s0 = v8
    val v7: Vector[Vector[Double]] = v8.p1
    v6 = v6.copy(p1 = v7)
    v6 = v6.copy(p1 = v7)
    v6 = v6.copy(p1 = v7)
    val v19: Vector[Vector[Double]] = v6.p0
    v6 = v6.copy(p0 = v19)
    val v22: Vector[Double] = v19(1)
    val v23: Double = v22(0)
    v23
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))), s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0))))
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