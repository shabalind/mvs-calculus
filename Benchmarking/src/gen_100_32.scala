import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s2 (
    p0: s0,
    p1: s1
  )
  @noinline
  def f0(v0: s2, v1: Double): Double = {
    val v6: Vector[s2] = Vector(v0, v0, v0, v0, v0)
    val v3: s2 = v6(2)
    val v10: s0 = v3.p0
    val v36: s1 = v3.p1
    val v25: Vector[Vector[Double]] = v10.p2
    val v33: Vector[Double] = v25(2)
    val v21: Double = v33(0)
    val v40: s0 = v36.p0
    val v34: Vector[Vector[Double]] = v40.p0
    val v82: Vector[Double] = v34(0)
    val v44: Double = v82(0)
    val v53: Double = v44 / v21
    v53
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0)), Vector(Vector(4.0), Vector(5.0), Vector(6.0))), s1(s0(Vector(Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0), Vector(12.0), Vector(13.0))), Vector(s0(Vector(Vector(14.0), Vector(15.0)), Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0), Vector(20.0))))))
    val v1: Double = 21.0
    val start = nanoTime()
    var result: Double = 21.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}