import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  @noinline
  def f0(v0: Vector[s0], v1: Double): Double = {
    val v4: s0 = v0(0)
    val v6: Vector[Vector[Double]] = v4.p0
    val v8: Vector[Double] = v6(1)
    val v13: Vector[Vector[Double]] = v4.p0
    var v25: Vector[Vector[Double]] = v13
    val v48: Vector[Double] = v25(1)
    val v27: Double = v8(0)
    val v56: Double = v48(0)
    val v62: Double = v56 * v56
    val v51: Double = v27 * v62
    val v228: Double = v27 * v27
    val v155: Double = v228 / v51
    v155
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0))), s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0))))
    val v1: Double = 8.0
    val start = nanoTime()
    var result: Double = 8.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}