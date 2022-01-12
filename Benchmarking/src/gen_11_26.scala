import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  @noinline
  def f0(v0: Vector[s0], v1: Double): Double = {
    val v3: s0 = v0(2)
    val v14: s0 = v0(0)
    val v8: Vector[Vector[Double]] = v3.p0
    val v29: Vector[Double] = v8(0)
    val v34: Vector[Vector[Double]] = v14.p1
    val v38: Double = v29(0)
    val v28: Vector[Double] = v34(0)
    var v69: Vector[Double] = v28
    v69 = v69.updated(0, v1)
    v69 = v69.updated(0, v1)
    val v64: Vector[Double] = Vector(v38, v1)
    var v106: Vector[Double] = v69
    val v146: Double = v64(0)
    val v238: Double = v106(0)
    val v196: Double = v238 - v146
    v196
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0))), s0(Vector(Vector(2.0)), Vector(Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0))))
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