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
    p1: Vector[s1],
    p2: s0,
    p3: s1
  )
  case class s3 (
    p0: s0,
    p1: Vector[s2]
  )
  case class s4 (
    p0: s0,
    p1: Vector[s1]
  )
  case class s5 (
    p0: s3,
    p1: Vector[Vector[s0]],
    p2: Vector[s2]
  )
  case class s6 (
    p0: Vector[s4],
    p1: s5
  )
  @noinline
  def f0(v0: s6, v1: Double): Double = {
    val v2: Vector[s4] = v0.p0
    val v8: s4 = v2(0)
    var v13: s4 = v8
    val v17: Vector[s1] = v13.p1
    val v15: s1 = v17(1)
    val v30: Vector[s0] = v15.p1
    val v29: s0 = v30(1)
    val v25: Vector[Vector[Double]] = v29.p0
    val v51: Vector[Double] = v25(0)
    val v83: Double = v51(0)
    v83
  }
  def benchmark(): Unit = {
    val v0: s6 = s6(Vector(s4(s0(Vector(Vector(0.0)), Vector(Vector(1.0))), Vector(s1(s0(Vector(Vector(2.0)), Vector(Vector(3.0))), Vector(s0(Vector(Vector(4.0)), Vector(Vector(5.0))), s0(Vector(Vector(6.0)), Vector(Vector(7.0))))), s1(s0(Vector(Vector(8.0)), Vector(Vector(9.0))), Vector(s0(Vector(Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0)))))))), s5(s3(s0(Vector(Vector(14.0)), Vector(Vector(15.0))), Vector(s2(Vector(s0(Vector(Vector(16.0)), Vector(Vector(17.0)))), Vector(s1(s0(Vector(Vector(18.0)), Vector(Vector(19.0))), Vector(s0(Vector(Vector(20.0)), Vector(Vector(21.0))), s0(Vector(Vector(22.0)), Vector(Vector(23.0))))), s1(s0(Vector(Vector(24.0)), Vector(Vector(25.0))), Vector(s0(Vector(Vector(26.0)), Vector(Vector(27.0))), s0(Vector(Vector(28.0)), Vector(Vector(29.0)))))), s0(Vector(Vector(30.0)), Vector(Vector(31.0))), s1(s0(Vector(Vector(32.0)), Vector(Vector(33.0))), Vector(s0(Vector(Vector(34.0)), Vector(Vector(35.0))), s0(Vector(Vector(36.0)), Vector(Vector(37.0)))))), s2(Vector(s0(Vector(Vector(38.0)), Vector(Vector(39.0)))), Vector(s1(s0(Vector(Vector(40.0)), Vector(Vector(41.0))), Vector(s0(Vector(Vector(42.0)), Vector(Vector(43.0))), s0(Vector(Vector(44.0)), Vector(Vector(45.0))))), s1(s0(Vector(Vector(46.0)), Vector(Vector(47.0))), Vector(s0(Vector(Vector(48.0)), Vector(Vector(49.0))), s0(Vector(Vector(50.0)), Vector(Vector(51.0)))))), s0(Vector(Vector(52.0)), Vector(Vector(53.0))), s1(s0(Vector(Vector(54.0)), Vector(Vector(55.0))), Vector(s0(Vector(Vector(56.0)), Vector(Vector(57.0))), s0(Vector(Vector(58.0)), Vector(Vector(59.0)))))))), Vector(Vector(s0(Vector(Vector(60.0)), Vector(Vector(61.0))))), Vector(s2(Vector(s0(Vector(Vector(62.0)), Vector(Vector(63.0)))), Vector(s1(s0(Vector(Vector(64.0)), Vector(Vector(65.0))), Vector(s0(Vector(Vector(66.0)), Vector(Vector(67.0))), s0(Vector(Vector(68.0)), Vector(Vector(69.0))))), s1(s0(Vector(Vector(70.0)), Vector(Vector(71.0))), Vector(s0(Vector(Vector(72.0)), Vector(Vector(73.0))), s0(Vector(Vector(74.0)), Vector(Vector(75.0)))))), s0(Vector(Vector(76.0)), Vector(Vector(77.0))), s1(s0(Vector(Vector(78.0)), Vector(Vector(79.0))), Vector(s0(Vector(Vector(80.0)), Vector(Vector(81.0))), s0(Vector(Vector(82.0)), Vector(Vector(83.0)))))))))
    val v1: Double = 84.0
    val start = nanoTime()
    var result: Double = 84.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}