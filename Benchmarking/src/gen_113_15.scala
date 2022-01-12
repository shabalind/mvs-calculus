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
    p0: s0,
    p1: s1
  )
  case class s3 (
    p0: Vector[Vector[s2]],
    p1: Vector[Vector[s1]]
  )
  case class s4 (
    p0: s0,
    p1: Vector[s3]
  )
  case class s5 (
    p0: s2,
    p1: Vector[Vector[s0]]
  )
  def f39(v0: s0): s0 = {
    val v5: Vector[s0] = Vector(v0)
    val v6: s0 = v5(0)
    val v1: Vector[Vector[Double]] = v0.p0
    val v3: Vector[Vector[Double]] = v6.p1
    var v4: s0 = v0
    v4 = v4.copy(p0 = v3)
    var v12: Vector[Vector[Double]] = v1
    v4 = v4.copy(p0 = v12)
    v4 = v6
    v4
  }
  @noinline
  def f0(v0: s4, v1: Vector[s5], v2: Double): Double = {
    val v12: s0 = v0.p0
    val v10: s0 = f39(v12)
    val v4: s1 = s1(v10, v10)
    val v17: s0 = v4.p0
    val v19: Vector[Vector[Double]] = v17.p0
    val v81: Vector[Double] = v19(0)
    val v56: Double = v81(0)
    v56
  }
  def benchmark(): Unit = {
    val v0: s4 = s4(s0(Vector(Vector(0.0)), Vector(Vector(1.0))), Vector(s3(Vector(Vector(s2(s0(Vector(Vector(2.0)), Vector(Vector(3.0))), s1(s0(Vector(Vector(4.0)), Vector(Vector(5.0))), s0(Vector(Vector(6.0)), Vector(Vector(7.0)))))), Vector(s2(s0(Vector(Vector(8.0)), Vector(Vector(9.0))), s1(s0(Vector(Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0)))))), Vector(s2(s0(Vector(Vector(14.0)), Vector(Vector(15.0))), s1(s0(Vector(Vector(16.0)), Vector(Vector(17.0))), s0(Vector(Vector(18.0)), Vector(Vector(19.0))))))), Vector(Vector(s1(s0(Vector(Vector(20.0)), Vector(Vector(21.0))), s0(Vector(Vector(22.0)), Vector(Vector(23.0))))), Vector(s1(s0(Vector(Vector(24.0)), Vector(Vector(25.0))), s0(Vector(Vector(26.0)), Vector(Vector(27.0)))))))))
    val v1: Vector[s5] = Vector(s5(s2(s0(Vector(Vector(28.0)), Vector(Vector(29.0))), s1(s0(Vector(Vector(30.0)), Vector(Vector(31.0))), s0(Vector(Vector(32.0)), Vector(Vector(33.0))))), Vector(Vector(s0(Vector(Vector(34.0)), Vector(Vector(35.0)))), Vector(s0(Vector(Vector(36.0)), Vector(Vector(37.0)))))), s5(s2(s0(Vector(Vector(38.0)), Vector(Vector(39.0))), s1(s0(Vector(Vector(40.0)), Vector(Vector(41.0))), s0(Vector(Vector(42.0)), Vector(Vector(43.0))))), Vector(Vector(s0(Vector(Vector(44.0)), Vector(Vector(45.0)))), Vector(s0(Vector(Vector(46.0)), Vector(Vector(47.0)))))), s5(s2(s0(Vector(Vector(48.0)), Vector(Vector(49.0))), s1(s0(Vector(Vector(50.0)), Vector(Vector(51.0))), s0(Vector(Vector(52.0)), Vector(Vector(53.0))))), Vector(Vector(s0(Vector(Vector(54.0)), Vector(Vector(55.0)))), Vector(s0(Vector(Vector(56.0)), Vector(Vector(57.0)))))))
    val v2: Double = 58.0
    val start = nanoTime()
    var result: Double = 58.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}