import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0
  )
  case class s2 (
    p0: Vector[s0],
    p1: s1,
    p2: Vector[s0]
  )
  @noinline
  def f0(v0: Vector[Vector[s1]], v1: s2, v2: Double): Double = {
    val v5: Vector[s0] = v1.p0
    val v7: s0 = v5(0)
    val v11: Vector[Vector[Double]] = v7.p0
    val v26: Vector[Double] = Vector(v2, v2, v2)
    val v23: Vector[Double] = v11(1)
    var v25: Vector[Double] = v26
    v25 = v25.updated(2, v2)
    v25 = v25.updated(0, v2)
    val v20: Vector[s1] = v0(0)
    val v53: Double = v23(0)
    val v37: Double = v53 / v53
    val v36: s1 = v20(0)
    val v46: s0 = v36.p0
    v25 = v26
    v25 = v25.updated(2, v37)
    val v100: Vector[Vector[Double]] = v46.p1
    val v114: Double = v25(0)
    val v119: Vector[Double] = v100(0)
    val v64: Double = v119(0)
    val v158: Double = v114 / v64
    v158
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s1]] = Vector(Vector(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))))), Vector(s1(s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0))))))
    val v1: s2 = s2(Vector(s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0)))), s1(s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0)))), Vector(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0))), s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0)))))
    val v2: Double = 18.0
    val start = nanoTime()
    var result: Double = 18.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}