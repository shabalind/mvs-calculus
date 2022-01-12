import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  @noinline
  def f0(v0: s0, v1: Double): Double = {
    val v3: Vector[Vector[Double]] = v0.p0
    val v4: Vector[Vector[Double]] = v0.p0
    var v5: Double = v1
    val v16: Vector[Double] = v4(2)
    val v10: Double = v16(0)
    val v12: Vector[Double] = v3(2)
    val v19: Double = v5 - v10
    val v11: Double = v12(0)
    val v63: Double = v19 - v11
    var v33: Double = v63
    val v130: Double = v12(0)
    val v137: Double = v33 * v130
    v137
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0)))
    val v1: Double = 5.0
    val start = nanoTime()
    var result: Double = 5.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}