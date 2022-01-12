import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: Vector[s1],
    p1: Vector[Vector[s0]]
  )
  case class s3 (
    p0: s0,
    p1: s1
  )
  case class s5 (
    p0: Vector[Double],
    p1: s3
  )
  case class s12 (
    p0: s1,
    p1: Vector[s0],
    p2: s5
  )
  @noinline
  def f0(v0: s12, v1: Vector[s2], v2: Double): Double = {
    val v8: s1 = v0.p0
    val v12: s0 = v8.p1
    val v21: Vector[Vector[Double]] = v12.p0
    val v30: Vector[Double] = v21(0)
    val v22: Vector[Double] = v21(0)
    val v23: Double = v22(0)
    val v44: Double = v2 * v23
    val v64: Double = v30(0)
    val v109: Double = v2 * v23
    var v34: Double = v44
    val v59: Double = v23 - v23
    val v46: Vector[Double] = Vector(v2, v2, v109, v59, v64, v64, v34)
    val v102: Double = v46(0)
    v102
  }
  def benchmark(): Unit = {
    val v0: s12 = s12(s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0))), s0(Vector(Vector(2.0)), Vector(Vector(3.0)))), Vector(s0(Vector(Vector(4.0)), Vector(Vector(5.0))), s0(Vector(Vector(6.0)), Vector(Vector(7.0)))), s5(Vector(8.0, 9.0), s3(s0(Vector(Vector(10.0)), Vector(Vector(11.0))), s1(s0(Vector(Vector(12.0)), Vector(Vector(13.0))), s0(Vector(Vector(14.0)), Vector(Vector(15.0)))))))
    val v1: Vector[s2] = Vector(s2(Vector(s1(s0(Vector(Vector(16.0)), Vector(Vector(17.0))), s0(Vector(Vector(18.0)), Vector(Vector(19.0)))), s1(s0(Vector(Vector(20.0)), Vector(Vector(21.0))), s0(Vector(Vector(22.0)), Vector(Vector(23.0)))), s1(s0(Vector(Vector(24.0)), Vector(Vector(25.0))), s0(Vector(Vector(26.0)), Vector(Vector(27.0))))), Vector(Vector(s0(Vector(Vector(28.0)), Vector(Vector(29.0)))), Vector(s0(Vector(Vector(30.0)), Vector(Vector(31.0)))), Vector(s0(Vector(Vector(32.0)), Vector(Vector(33.0)))))), s2(Vector(s1(s0(Vector(Vector(34.0)), Vector(Vector(35.0))), s0(Vector(Vector(36.0)), Vector(Vector(37.0)))), s1(s0(Vector(Vector(38.0)), Vector(Vector(39.0))), s0(Vector(Vector(40.0)), Vector(Vector(41.0)))), s1(s0(Vector(Vector(42.0)), Vector(Vector(43.0))), s0(Vector(Vector(44.0)), Vector(Vector(45.0))))), Vector(Vector(s0(Vector(Vector(46.0)), Vector(Vector(47.0)))), Vector(s0(Vector(Vector(48.0)), Vector(Vector(49.0)))), Vector(s0(Vector(Vector(50.0)), Vector(Vector(51.0)))))))
    val v2: Double = 52.0
    val start = nanoTime()
    var result: Double = 52.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}