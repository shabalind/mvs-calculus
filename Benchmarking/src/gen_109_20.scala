import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s2 (
    p0: Vector[s0],
    p1: s0,
    p2: Vector[Vector[s1]],
    p3: Vector[s1],
    p4: Vector[Vector[s0]],
    p5: s0
  )
  case class s3 (
    p0: s0,
    p1: s0
  )
  case class s5 (
    p0: s0,
    p1: Vector[s2]
  )
  case class s6 (
    p0: s1,
    p1: s5
  )
  @noinline
  def f0(v0: s6, v1: Double): Double = {
    val v2: s1 = v0.p0
    val v12: s0 = v2.p0
    val v13: s3 = s3(v12, v12)
    val v14: s0 = v13.p1
    var v22: s0 = v14
    val v10: Vector[Vector[Double]] = v22.p1
    val v25: Vector[Double] = v10(0)
    val v63: Double = v25(0)
    var v39: Vector[Double] = v25
    val v27: Double = v39(0)
    v39 = v39.updated(0, v63)
    v27
  }
  def benchmark(): Unit = {
    val v0: s6 = s6(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))), Vector(s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0))))), s5(s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0))), Vector(s2(Vector(s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0)))), s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0))), Vector(Vector(s1(s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0))), Vector(s0(Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0)))))), Vector(s1(s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0))), Vector(s0(Vector(Vector(27.0), Vector(28.0)), Vector(Vector(29.0)))))), Vector(s1(s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0))), Vector(s0(Vector(Vector(33.0), Vector(34.0)), Vector(Vector(35.0))))))), Vector(s1(s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0))), Vector(s0(Vector(Vector(39.0), Vector(40.0)), Vector(Vector(41.0))))), s1(s0(Vector(Vector(42.0), Vector(43.0)), Vector(Vector(44.0))), Vector(s0(Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0))))), s1(s0(Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0))), Vector(s0(Vector(Vector(51.0), Vector(52.0)), Vector(Vector(53.0)))))), Vector(Vector(s0(Vector(Vector(54.0), Vector(55.0)), Vector(Vector(56.0)))), Vector(s0(Vector(Vector(57.0), Vector(58.0)), Vector(Vector(59.0)))), Vector(s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0))))), s0(Vector(Vector(63.0), Vector(64.0)), Vector(Vector(65.0)))))))
    val v1: Double = 66.0
    val start = nanoTime()
    var result: Double = 66.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}