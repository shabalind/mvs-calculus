import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  @noinline
  def f0(v0: Vector[s0], v1: Double): Double = {
    val v2: s0 = v0(0)
    val v5: Vector[Vector[Double]] = v2.p0
    val v4: Vector[Vector[Double]] = v2.p0
    val v3: s0 = s0(v5, v4)
    var v13: Double = v1
    val v14: Vector[Vector[Double]] = v3.p0
    var v10: Vector[Vector[Double]] = v4
    v10 = v14
    val v15: Vector[Double] = v10(0)
    val v26: Double = v15(0)
    v13 = v26
    v13
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0))))
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