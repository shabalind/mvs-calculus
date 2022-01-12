import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  case class s2 (
    p0: Double,
    p1: s0
  )
  case class s3 (
    p0: s2,
    p1: s2
  )
  case class s4 (
    p0: Vector[s1],
    p1: Vector[s2]
  )
  case class s5 (
    p0: s1,
    p1: Vector[s3]
  )
  case class s6 (
    p0: s2,
    p1: Vector[s2],
    p2: Double
  )
  case class s10 (
    p0: Vector[s5],
    p1: s6
  )
  @noinline
  def f0(v0: s10, v1: Vector[s4], v2: Double): Double = {
    var v6: Double = v2
    val v7: Double = v6 / v6
    val v8: s4 = v1(0)
    var v23: s4 = v8
    var v15: Double = v7
    val v34: Vector[s2] = v23.p1
    val v48: s2 = v34(2)
    val v64: s2 = v34(1)
    val v26: s3 = s3(v48, v64)
    val v32: s2 = v26.p1
    val v107: Double = v32.p0
    val v106: Double = v107 - v15
    v106
  }
  def benchmark(): Unit = {
    val v0: s10 = s10(Vector(s5(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))), s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0)))), Vector(s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0))), s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0))))), Vector(s3(s2(12.0, s0(Vector(Vector(13.0), Vector(14.0)), Vector(Vector(15.0)))), s2(16.0, s0(Vector(Vector(17.0), Vector(18.0)), Vector(Vector(19.0)))))))), s6(s2(20.0, s0(Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0)))), Vector(s2(24.0, s0(Vector(Vector(25.0), Vector(26.0)), Vector(Vector(27.0)))), s2(28.0, s0(Vector(Vector(29.0), Vector(30.0)), Vector(Vector(31.0))))), 32.0))
    val v1: Vector[s4] = Vector(s4(Vector(s1(Vector(s0(Vector(Vector(33.0), Vector(34.0)), Vector(Vector(35.0))), s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0)))), Vector(s0(Vector(Vector(39.0), Vector(40.0)), Vector(Vector(41.0))), s0(Vector(Vector(42.0), Vector(43.0)), Vector(Vector(44.0))))), s1(Vector(s0(Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0))), s0(Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0)))), Vector(s0(Vector(Vector(51.0), Vector(52.0)), Vector(Vector(53.0))), s0(Vector(Vector(54.0), Vector(55.0)), Vector(Vector(56.0)))))), Vector(s2(57.0, s0(Vector(Vector(58.0), Vector(59.0)), Vector(Vector(60.0)))), s2(61.0, s0(Vector(Vector(62.0), Vector(63.0)), Vector(Vector(64.0)))), s2(65.0, s0(Vector(Vector(66.0), Vector(67.0)), Vector(Vector(68.0)))))), s4(Vector(s1(Vector(s0(Vector(Vector(69.0), Vector(70.0)), Vector(Vector(71.0))), s0(Vector(Vector(72.0), Vector(73.0)), Vector(Vector(74.0)))), Vector(s0(Vector(Vector(75.0), Vector(76.0)), Vector(Vector(77.0))), s0(Vector(Vector(78.0), Vector(79.0)), Vector(Vector(80.0))))), s1(Vector(s0(Vector(Vector(81.0), Vector(82.0)), Vector(Vector(83.0))), s0(Vector(Vector(84.0), Vector(85.0)), Vector(Vector(86.0)))), Vector(s0(Vector(Vector(87.0), Vector(88.0)), Vector(Vector(89.0))), s0(Vector(Vector(90.0), Vector(91.0)), Vector(Vector(92.0)))))), Vector(s2(93.0, s0(Vector(Vector(94.0), Vector(95.0)), Vector(Vector(96.0)))), s2(97.0, s0(Vector(Vector(98.0), Vector(99.0)), Vector(Vector(100.0)))), s2(101.0, s0(Vector(Vector(102.0), Vector(103.0)), Vector(Vector(104.0)))))))
    val v2: Double = 105.0
    val start = nanoTime()
    var result: Double = 105.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}