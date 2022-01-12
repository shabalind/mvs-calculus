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
    val v2: s0 = v0.p0
    val v3: s0 = v0.p1
    val v5: Vector[Vector[Double]] = v3.p0
    val v15: Vector[Double] = v5(0)
    val v25: Double = v15(0)
    val v29: Vector[Vector[Double]] = v2.p1
    var v57: Double = v25
    val v48: Vector[Double] = v29(2)
    v57 = v1
    val v131: Double = v48(0)
    val v86: Double = v57 * v131
    v86
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