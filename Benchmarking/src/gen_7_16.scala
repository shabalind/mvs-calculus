import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]],
    p3: Vector[Vector[Double]],
    p4: Vector[Vector[Double]]
  )
  case class s2 (
    p0: s0,
    p1: s0
  )
  @noinline
  def f0(v0: s2, v1: Double): Double = {
    val v7: s0 = v0.p0
    val v6: Vector[s2] = Vector(v0)
    val v10: s2 = v6(0)
    val v12: Vector[Vector[Double]] = v7.p2
    val v2: s0 = v10.p0
    val v17: Vector[Double] = v12(2)
    val v13: Vector[Vector[Double]] = v2.p3
    var v43: Vector[Vector[Double]] = v13
    val v39: Vector[Double] = v43(0)
    v43 = v43.updated(0, v17)
    val v68: Double = v39(0)
    val v63: Double = v1 - v68
    v63
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0)), Vector(Vector(8.0))), s0(Vector(Vector(9.0), Vector(10.0), Vector(11.0)), Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0)), Vector(Vector(16.0)), Vector(Vector(17.0))))
    val v1: Double = 18.0
    val start = nanoTime()
    var result: Double = 18.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}