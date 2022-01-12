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
    p1: s0
  )
  case class s2 (
    p0: s1,
    p1: s0
  )
  case class s3 (
    p0: s2,
    p1: s1
  )
  case class s8 (
    p0: s1,
    p1: s3
  )
  @noinline
  def f0(v0: s3, v1: Vector[Vector[s8]], v2: Double): Double = {
    val v4: s1 = v0.p1
    val v9: s0 = v4.p1
    val v13: Vector[Vector[Double]] = v9.p2
    val v14: Vector[Vector[Double]] = v9.p1
    val v21: Vector[Double] = v13(0)
    val v22: Vector[Double] = v14(1)
    val v41: Double = v21(0)
    val v69: Vector[Double] = v14(0)
    val v90: Double = v22(0)
    val v46: Double = v2 / v90
    val v86: Double = v69(0)
    val v267: Double = v41 / v46
    val v211: Double = v86 * v267
    v211
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(s2(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0)), Vector(Vector(5.0))), s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0)))), s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0), Vector(16.0)), Vector(Vector(17.0)))), s1(s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0))), s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0), Vector(27.0), Vector(28.0)), Vector(Vector(29.0)))))
    val v1: Vector[Vector[s8]] = Vector(Vector(s8(s1(s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0), Vector(33.0), Vector(34.0)), Vector(Vector(35.0))), s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0), Vector(40.0)), Vector(Vector(41.0)))), s3(s2(s1(s0(Vector(Vector(42.0), Vector(43.0)), Vector(Vector(44.0), Vector(45.0), Vector(46.0)), Vector(Vector(47.0))), s0(Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0), Vector(51.0), Vector(52.0)), Vector(Vector(53.0)))), s0(Vector(Vector(54.0), Vector(55.0)), Vector(Vector(56.0), Vector(57.0), Vector(58.0)), Vector(Vector(59.0)))), s1(s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0), Vector(63.0), Vector(64.0)), Vector(Vector(65.0))), s0(Vector(Vector(66.0), Vector(67.0)), Vector(Vector(68.0), Vector(69.0), Vector(70.0)), Vector(Vector(71.0))))))))
    val v2: Double = 72.0
    val start = nanoTime()
    var result: Double = 72.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}