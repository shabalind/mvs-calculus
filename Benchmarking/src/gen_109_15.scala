import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]],
    p3: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s4 (
    p0: Vector[Vector[s1]],
    p1: Vector[Vector[Double]]
  )
  @noinline
  def f0(v0: Vector[s4], v1: Double): Double = {
    val v3: s4 = v0(0)
    val v7: Vector[Vector[Double]] = v3.p1
    val v13: Double = v1 / v1
    var v30: Double = v13
    val v29: Double = v30 / v13
    var v41: Double = v29
    v30 = v1
    v30 = v1
    val v81: Vector[Double] = v7(0)
    val v71: Double = v81(0)
    val v67: Double = v1 * v41
    val v152: Double = v41 + v71
    val v73: Double = v152 * v67
    v73
  }
  def benchmark(): Unit = {
    val v0: Vector[s4] = Vector(s4(Vector(Vector(s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0), Vector(8.0))), s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0)))))), Vector(Vector(18.0), Vector(19.0))))
    val v1: Double = 20.0
    val start = nanoTime()
    var result: Double = 20.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}