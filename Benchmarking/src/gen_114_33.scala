import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  @noinline
  def f0(v0: Vector[s0], v1: Double): Double = {
    val v2: s0 = v0(1)
    val v9: Vector[Vector[Double]] = v2.p1
    var v10: Double = v1
    val v29: Vector[Double] = v9(0)
    val v12: Double = v10 - v1
    val v15: Double = v29(0)
    val v55: Double = v12 / v10
    val v101: Vector[Double] = Vector(v1, v55, v1, v12, v10)
    val v35: Double = v101(0)
    val v158: Double = v15 - v35
    v158
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0))), s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0))))
    val v1: Double = 10.0
    val start = nanoTime()
    var result: Double = 10.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}