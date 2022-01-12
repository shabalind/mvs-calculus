import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  @noinline
  def f0(v0: Vector[s0], v1: Double): Double = {
    val v3: s0 = v0(0)
    val v6: Vector[Vector[Double]] = v3.p1
    val v5: s0 = v0(0)
    val v9: Vector[Vector[Double]] = v5.p0
    val v13: Vector[Double] = v9(0)
    val v34: Vector[Double] = v6(1)
    val v43: Double = v34(0)
    val v40: Double = v13(0)
    var v59: Double = v40
    val v26: Double = v59 * v43
    v26
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0))))
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