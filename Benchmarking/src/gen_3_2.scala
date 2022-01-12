import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]]
  )
  @noinline
  def f0(v0: Vector[s0], v1: Vector[s0], v2: Double): Double = {
    val v3: s0 = v1(2)
    val v5: Vector[Vector[Double]] = v3.p0
    val v10: Vector[Double] = v5(0)
    val v12: Double = v10(0)
    var v17: Double = v12
    var v23: Vector[Double] = v10
    v23 = v23.updated(0, v17)
    val v45: Double = v23(0)
    v23 = v23.updated(0, v17)
    v23 = v23.updated(0, v12)
    v17 = v12
    v45
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0))), s0(Vector(Vector(1.0))), s0(Vector(Vector(2.0))))
    val v1: Vector[s0] = Vector(s0(Vector(Vector(3.0))), s0(Vector(Vector(4.0))), s0(Vector(Vector(5.0))))
    val v2: Double = 6.0
    val start = nanoTime()
    var result: Double = 6.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}