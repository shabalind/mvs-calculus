import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f67(v0: Double): Double = {
    val v2: Double = v0 * v0
    val v3: Vector[Double] = Vector(v2, v2, v2, v2, v2)
    val v19: Double = v3(0)
    v19
  }
  @noinline
  def f0(v0: s0, v1: Vector[s0], v2: Double): Double = {
    val v4: Double = f67(v2)
    val v7: s0 = v1(0)
    val v12: Double = f67(v4)
    val v9: Vector[Vector[Double]] = v7.p0
    val v11: Vector[Double] = Vector(v12, v12, v12, v2, v4)
    val v13: Vector[Double] = v9(0)
    val v14: Double = v13(0)
    val v34: Double = v11(2)
    val v64: Double = v34 * v34
    val v57: Double = v14 - v64
    v57
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0)), Vector(Vector(1.0)))
    val v1: Vector[s0] = Vector(s0(Vector(Vector(2.0)), Vector(Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0))), s0(Vector(Vector(6.0)), Vector(Vector(7.0))))
    val v2: Double = 8.0
    val start = nanoTime()
    var result: Double = 8.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}