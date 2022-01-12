import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  @noinline
  def f0(v0: s0, v1: Double): Double = {
    val v2: Vector[Vector[Double]] = v0.p1
    val v5: Vector[Double] = v2(0)
    val v8: Vector[Vector[Double]] = v0.p0
    val v4: s0 = s0(v8, v2)
    val v15: Double = v5(0)
    val v16: Vector[Vector[Double]] = v4.p1
    var v38: Vector[Vector[Double]] = v16
    val v88: Vector[Double] = v38(0)
    val v52: Double = v88(0)
    val v163: Double = v52 / v1
    val v105: Double = v15 * v163
    v105
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0)))
    val v1: Double = 4.0
    val start = nanoTime()
    var result: Double = 4.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}