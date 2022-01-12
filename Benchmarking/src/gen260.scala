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
    val v3: s0 = v0.p0
    val v10: Vector[Vector[Double]] = v3.p1
    val v17: Vector[Double] = v10(0)
    var v11: Vector[Double] = v17
    v11 = v11.updated(0, v1)
    v11 = v11.updated(0, v1)
    v11 = v11.updated(0, v1)
    v11 = v17
    v11 = v11.updated(0, v1)
    v11 = v11.updated(0, v1)
    val v76: Double = v11(0)
    v76
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