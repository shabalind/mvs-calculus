import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  @noinline
  def f0(v0: Vector[s0], v1: s0, v2: Double): Double = {
    val v6: Vector[Vector[Double]] = v1.p1
    val v3: Vector[Double] = v6(0)
    val v11: Double = v3(0)
    val v10: Vector[Double] = v6(0)
    var v27: Double = v11
    val v24: Vector[Double] = v6(0)
    val v21: Vector[Vector[Double]] = Vector(v10, v24, v10, v3, v10)
    val v75: Vector[Double] = v21(1)
    val v117: Double = v75(0)
    val v148: Double = v117 * v27
    v148
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))), s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0))))
    val v1: s0 = s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0)))
    val v2: Double = 9.0
    val start = nanoTime()
    var result: Double = 9.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}