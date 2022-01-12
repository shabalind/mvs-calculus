import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  @noinline
  def f0(v0: s0, v1: Double): Double = {
    val v5: Vector[Vector[Double]] = v0.p1
    val v6: Vector[Vector[Double]] = v0.p1
    val v4: s0 = s0(v6, v5)
    var v3: s0 = v4
    v3 = v3.copy(p1 = v5)
    v3 = v3.copy(p1 = v5)
    val v11: Vector[Vector[Double]] = v4.p0
    v3 = v3.copy(p1 = v11)
    val v21: Vector[Vector[Double]] = v0.p0
    v3 = v3.copy(p1 = v21)
    v3 = v3.copy(p0 = v11)
    val v30: Vector[Vector[Double]] = v3.p0
    val v22: Vector[Double] = v30(0)
    val v17: Double = v22(0)
    v17
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0)), Vector(Vector(1.0)))
    val v1: Double = 2.0
    val start = nanoTime()
    var result: Double = 2.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}