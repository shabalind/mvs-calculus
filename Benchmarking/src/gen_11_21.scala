import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  @noinline
  def f0(v0: s0, v1: s0, v2: Double): Double = {
    val v4: Vector[Vector[Double]] = v0.p1
    val v14: Vector[Double] = v4(0)
    var v6: Vector[Double] = v14
    var v20: Vector[Double] = v6
    val v23: Double = v6(0)
    val v18: Vector[Double] = v4(0)
    v20 = v20.updated(0, v23)
    var v29: Vector[Double] = v18
    val v22: Double = v20(0)
    val v30: Double = v29(0)
    v20 = v20.updated(0, v30)
    v22
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0)), Vector(Vector(1.0)))
    val v1: s0 = s0(Vector(Vector(2.0)), Vector(Vector(3.0)))
    val v2: Double = 4.0
    val start = nanoTime()
    var result: Double = 4.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}