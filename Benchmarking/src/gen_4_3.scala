import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  @noinline
  def f0(v0: Vector[s0], v1: Double): Double = {
    val v6: s0 = v0(2)
    val v7: Vector[Vector[Double]] = v6.p0
    val v10: Vector[Vector[Double]] = v6.p0
    var v2: Vector[Vector[Double]] = v7
    val v9: Vector[Double] = v2(0)
    v2 = v2.updated(2, v9)
    val v59: Double = v9(0)
    val v36: Double = v1 * v59
    val v34: Double = v36 * v36
    val v62: Vector[Double] = v10(2)
    var v70: Double = v34
    v2 = v2.updated(1, v62)
    val v68: Double = v34 * v70
    v2 = v10
    v68
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0))), s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0))), s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0))))
    val v1: Double = 15.0
    val start = nanoTime()
    var result: Double = 15.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}