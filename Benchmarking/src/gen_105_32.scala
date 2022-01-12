import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Double],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  case class s2 (
    p0: s1,
    p1: Vector[Double]
  )
  case class s3 (
    p0: Vector[s2],
    p1: s1
  )
  case class s4 (
    p0: s1,
    p1: s2
  )
  case class s5 (
    p0: s4,
    p1: s3
  )
  case class s6 (
    p0: Vector[Double],
    p1: s1
  )
  case class s8 (
    p0: Vector[Vector[s6]],
    p1: Vector[s5]
  )
  def f47(v0: s1): s1 = {
    val v7: s0 = v0.p1
    var v3: s1 = v0
    val v24: Vector[Double] = v7.p0
    val v37: s2 = s2(v3, v24)
    val v25: s1 = v37.p0
    v25
  }
  @noinline
  def f0(v0: Vector[Vector[s8]], v1: s1, v2: Double): Double = {
    val v6: s1 = f47(v1)
    val v10: s0 = v6.p1
    val v14: Vector[Double] = v10.p0
    val v60: Double = v14(0)
    v60
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s8]] = Vector(Vector(s8(Vector(Vector(s6(Vector(0.0, 1.0), s1(Vector(s0(Vector(2.0), Vector(Vector(3.0))), s0(Vector(4.0), Vector(Vector(5.0)))), s0(Vector(6.0), Vector(Vector(7.0)))))), Vector(s6(Vector(8.0, 9.0), s1(Vector(s0(Vector(10.0), Vector(Vector(11.0))), s0(Vector(12.0), Vector(Vector(13.0)))), s0(Vector(14.0), Vector(Vector(15.0)))))), Vector(s6(Vector(16.0, 17.0), s1(Vector(s0(Vector(18.0), Vector(Vector(19.0))), s0(Vector(20.0), Vector(Vector(21.0)))), s0(Vector(22.0), Vector(Vector(23.0))))))), Vector(s5(s4(s1(Vector(s0(Vector(24.0), Vector(Vector(25.0))), s0(Vector(26.0), Vector(Vector(27.0)))), s0(Vector(28.0), Vector(Vector(29.0)))), s2(s1(Vector(s0(Vector(30.0), Vector(Vector(31.0))), s0(Vector(32.0), Vector(Vector(33.0)))), s0(Vector(34.0), Vector(Vector(35.0)))), Vector(36.0))), s3(Vector(s2(s1(Vector(s0(Vector(37.0), Vector(Vector(38.0))), s0(Vector(39.0), Vector(Vector(40.0)))), s0(Vector(41.0), Vector(Vector(42.0)))), Vector(43.0)), s2(s1(Vector(s0(Vector(44.0), Vector(Vector(45.0))), s0(Vector(46.0), Vector(Vector(47.0)))), s0(Vector(48.0), Vector(Vector(49.0)))), Vector(50.0)), s2(s1(Vector(s0(Vector(51.0), Vector(Vector(52.0))), s0(Vector(53.0), Vector(Vector(54.0)))), s0(Vector(55.0), Vector(Vector(56.0)))), Vector(57.0))), s1(Vector(s0(Vector(58.0), Vector(Vector(59.0))), s0(Vector(60.0), Vector(Vector(61.0)))), s0(Vector(62.0), Vector(Vector(63.0))))))))), Vector(s8(Vector(Vector(s6(Vector(64.0, 65.0), s1(Vector(s0(Vector(66.0), Vector(Vector(67.0))), s0(Vector(68.0), Vector(Vector(69.0)))), s0(Vector(70.0), Vector(Vector(71.0)))))), Vector(s6(Vector(72.0, 73.0), s1(Vector(s0(Vector(74.0), Vector(Vector(75.0))), s0(Vector(76.0), Vector(Vector(77.0)))), s0(Vector(78.0), Vector(Vector(79.0)))))), Vector(s6(Vector(80.0, 81.0), s1(Vector(s0(Vector(82.0), Vector(Vector(83.0))), s0(Vector(84.0), Vector(Vector(85.0)))), s0(Vector(86.0), Vector(Vector(87.0))))))), Vector(s5(s4(s1(Vector(s0(Vector(88.0), Vector(Vector(89.0))), s0(Vector(90.0), Vector(Vector(91.0)))), s0(Vector(92.0), Vector(Vector(93.0)))), s2(s1(Vector(s0(Vector(94.0), Vector(Vector(95.0))), s0(Vector(96.0), Vector(Vector(97.0)))), s0(Vector(98.0), Vector(Vector(99.0)))), Vector(100.0))), s3(Vector(s2(s1(Vector(s0(Vector(101.0), Vector(Vector(102.0))), s0(Vector(103.0), Vector(Vector(104.0)))), s0(Vector(105.0), Vector(Vector(106.0)))), Vector(107.0)), s2(s1(Vector(s0(Vector(108.0), Vector(Vector(109.0))), s0(Vector(110.0), Vector(Vector(111.0)))), s0(Vector(112.0), Vector(Vector(113.0)))), Vector(114.0)), s2(s1(Vector(s0(Vector(115.0), Vector(Vector(116.0))), s0(Vector(117.0), Vector(Vector(118.0)))), s0(Vector(119.0), Vector(Vector(120.0)))), Vector(121.0))), s1(Vector(s0(Vector(122.0), Vector(Vector(123.0))), s0(Vector(124.0), Vector(Vector(125.0)))), s0(Vector(126.0), Vector(Vector(127.0))))))))))
    val v1: s1 = s1(Vector(s0(Vector(128.0), Vector(Vector(129.0))), s0(Vector(130.0), Vector(Vector(131.0)))), s0(Vector(132.0), Vector(Vector(133.0))))
    val v2: Double = 134.0
    val start = nanoTime()
    var result: Double = 134.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}