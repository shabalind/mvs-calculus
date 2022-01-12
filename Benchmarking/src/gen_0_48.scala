import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  @noinline
  def f0(v0: Vector[s0], v1: Double): Double = {
    val v7: s0 = v0(0)
    var v13: Double = v1
    val v9: Vector[Vector[Double]] = v7.p0
    val v20: Vector[Double] = v9(1)
    v13 = v1
    val v41: Vector[Double] = Vector(v13, v1)
    var v49: Vector[Double] = v41
    val v37: Double = v1 + v13
    var v118: Vector[Double] = v49
    val v127: Double = v20(0)
    v118 = v118.updated(1, v127)
    var v128: Vector[Double] = v118
    val v179: Double = v128(0)
    v118 = v118.updated(1, v37)
    v179
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0))))
    val v1: Double = 5.0
    val start = nanoTime()
    var result: Double = 5.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}