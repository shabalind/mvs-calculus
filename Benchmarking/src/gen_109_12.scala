import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f63(v0: Double, v1: s0): Double = {
    val v6: Double = v0 / v0
    var v16: Double = v6
    v16
  }
  @noinline
  def f0(v0: Vector[s0], v1: Double): Double = {
    var v7: Double = v1
    val v2: Double = v1 * v7
    var v3: Double = v1
    v3 = v7
    val v11: s0 = v0(0)
    val v15: Double = f63(v1, v11)
    val v17: Vector[Double] = Vector(v2, v1, v15, v7, v15, v1)
    v7 = v3
    val v49: Double = v17(4)
    v49
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0))))
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