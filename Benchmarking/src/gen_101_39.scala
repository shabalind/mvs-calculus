import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]]
  )
  @noinline
  def f0(v0: s0, v1: Double): Double = {
    val v6: Vector[Vector[Double]] = v0.p2
    val v4: Vector[Double] = v6(1)
    val v11: Double = v4(0)
    val v13: Double = v4(0)
    val v18: Vector[Double] = Vector(v11, v1)
    val v23: Vector[Double] = v6(0)
    val v10: Double = v18(1)
    val v35: Double = v23(0)
    val v74: Double = v13 + v10
    val v67: Double = v74 - v35
    v67
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0)), Vector(Vector(4.0), Vector(5.0)))
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