import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0,
    p2: s0
  )
  case class s2 (
    p0: s0,
    p1: s1
  )
  case class s3 (
    p0: Vector[s0],
    p1: s2
  )
  case class s7 (
    p0: s0,
    p1: s3
  )
  case class s9 (
    p0: s1,
    p1: s7
  )
  @noinline
  def f0(v0: s9, v1: Double): Double = {
    val v4: s1 = v0.p0
    val v8: Vector[s0] = v4.p0
    val v9: s0 = v8(0)
    val v30: Vector[Vector[Double]] = v9.p0
    val v42: Vector[Double] = v30(0)
    val v44: Vector[Vector[Double]] = v9.p1
    val v64: Vector[Double] = v44(0)
    var v47: Vector[Double] = v64
    val v49: Double = v42(0)
    var v80: Double = v49
    val v86: Double = v47(0)
    val v183: Double = v86 * v80
    v183
  }
  def benchmark(): Unit = {
    val v0: s9 = s9(s1(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0)))), s0(Vector(Vector(2.0)), Vector(Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0)))), s7(s0(Vector(Vector(6.0)), Vector(Vector(7.0))), s3(Vector(s0(Vector(Vector(8.0)), Vector(Vector(9.0))), s0(Vector(Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0)))), s2(s0(Vector(Vector(14.0)), Vector(Vector(15.0))), s1(Vector(s0(Vector(Vector(16.0)), Vector(Vector(17.0)))), s0(Vector(Vector(18.0)), Vector(Vector(19.0))), s0(Vector(Vector(20.0)), Vector(Vector(21.0))))))))
    val v1: Double = 22.0
    val start = nanoTime()
    var result: Double = 22.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}