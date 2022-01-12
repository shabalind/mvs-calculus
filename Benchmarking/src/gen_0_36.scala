import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]]
  )
  @noinline
  def f0(v0: Vector[s0], v1: s0, v2: Double): Double = {
    val v4: s0 = v0(0)
    val v3: Vector[Vector[Double]] = v4.p0
    val v8: s0 = v0(1)
    val v18: Vector[Double] = v3(1)
    val v15: Vector[Vector[Double]] = v8.p0
    val v49: Double = v18(0)
    val v56: Vector[Double] = Vector(v2, v2, v49, v2, v2)
    val v63: Vector[Double] = v15(1)
    val v66: Double = v63(0)
    val v84: Double = v56(3)
    val v217: Double = v66 - v84
    v217
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0), Vector(1.0))), s0(Vector(Vector(2.0), Vector(3.0))))
    val v1: s0 = s0(Vector(Vector(4.0), Vector(5.0)))
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