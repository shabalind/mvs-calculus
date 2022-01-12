import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]]
  )
  def f82(v0: s0): s0 = {
    v0
  }
  @noinline
  def f0(v0: s0, v1: Double): Double = {
    val v9: Vector[Vector[Double]] = v0.p1
    val v7: Vector[Double] = v9(2)
    var v10: Vector[Vector[Double]] = v9
    val v18: s0 = f82(v0)
    val v15: Vector[Vector[Double]] = v18.p2
    val v27: Vector[Double] = v10(0)
    val v37: Vector[Double] = v15(0)
    v10 = v10.updated(1, v7)
    var v75: Vector[Double] = v37
    val v74: Double = v27(0)
    val v86: Double = v75(0)
    var v77: Double = v74
    val v82: Double = v77 - v86
    v82
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0)), Vector(Vector(4.0)))
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