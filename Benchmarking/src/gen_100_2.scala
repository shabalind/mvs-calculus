import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  @noinline
  def f0(v0: Vector[s0], v1: s0, v2: Double): Double = {
    val v8: s0 = v0(0)
    val v21: Double = v2 * v2
    val v10: Vector[Vector[Double]] = v8.p1
    val v14: Double = v21 / v21
    val v15: Vector[Double] = v10(0)
    val v18: Double = v15(0)
    var v54: Vector[Double] = v15
    val v30: Double = v54(0)
    var v40: Double = v30
    val v66: Double = v30 / v2
    v54 = v54.updated(0, v40)
    val v32: Double = v66 + v14
    v54 = v54.updated(0, v18)
    v32
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0))))
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