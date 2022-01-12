import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f103(v0: s0): s0 = {
    var v7: s0 = v0
    val v3: Vector[Vector[Double]] = v7.p1
    val v4: Vector[Vector[Double]] = v0.p0
    v7 = v7.copy(p0 = v4)
    val v11: Vector[Vector[Double]] = v0.p0
    val v1: Vector[Vector[Double]] = v7.p1
    v7 = v7.copy(p1 = v3)
    v7 = v7.copy(p0 = v11)
    val v6: s0 = s0(v4, v1)
    v7 = v6
    v6
  }
  @noinline
  def f0(v0: s0, v1: Double): Double = {
    val v3: s0 = f103(v0)
    val v6: Vector[Vector[Double]] = v3.p0
    val v11: Vector[Vector[Double]] = v0.p1
    val v31: s0 = s0(v6, v11)
    val v13: Vector[Vector[Double]] = v31.p1
    val v12: Vector[Double] = v13(0)
    val v40: Double = v12(0)
    v40
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0)))
    val v1: Double = 3.0
    val start = nanoTime()
    var result: Double = 3.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}