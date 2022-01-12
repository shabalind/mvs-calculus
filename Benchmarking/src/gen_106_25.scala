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
    p0: s1,
    p1: Vector[s0]
  )
  case class s4 (
    p0: s1,
    p1: Vector[s2]
  )
  case class s5 (
    p0: Vector[s2],
    p1: s2
  )
  case class s6 (
    p0: s4,
    p1: s4,
    p2: Vector[Double]
  )
  case class s7 (
    p0: s6,
    p1: s0
  )
  case class s9 (
    p0: s5,
    p1: s6
  )
  @noinline
  def f0(v0: Vector[Vector[s1]], v1: s9, v2: Double): Double = {
    val v8: Vector[s1] = v0(1)
    val v4: s6 = v1.p1
    var v9: Vector[Vector[s1]] = v0
    val v5: Vector[s1] = v9(1)
    val v11: Vector[Vector[s1]] = Vector(v8, v5)
    val v15: Vector[s1] = v11(0)
    val v22: s1 = v15(0)
    val v71: s0 = v22.p1
    val v54: s7 = s7(v4, v71)
    val v59: s6 = v54.p0
    val v69: Vector[s1] = v11(0)
    val v63: Vector[s1] = v0(2)
    v9 = v9.updated(2, v63)
    val v86: Vector[Double] = v59.p2
    v9 = v9.updated(2, v69)
    val v215: Double = v86(1)
    v215
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s1]] = Vector(Vector(s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0))))), Vector(s1(s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0))))), Vector(s1(s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0))), s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))))))
    val v1: s9 = s9(s5(Vector(s2(s1(s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0))), s0(Vector(Vector(28.0)), Vector(Vector(29.0), Vector(30.0), Vector(31.0)))), Vector(s0(Vector(Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0))))), s2(s1(s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0))), s0(Vector(Vector(40.0)), Vector(Vector(41.0), Vector(42.0), Vector(43.0)))), Vector(s0(Vector(Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0))))), s2(s1(s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0), Vector(51.0))), s0(Vector(Vector(52.0)), Vector(Vector(53.0), Vector(54.0), Vector(55.0)))), Vector(s0(Vector(Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0)))))), s2(s1(s0(Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0), Vector(63.0))), s0(Vector(Vector(64.0)), Vector(Vector(65.0), Vector(66.0), Vector(67.0)))), Vector(s0(Vector(Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0)))))), s6(s4(s1(s0(Vector(Vector(72.0)), Vector(Vector(73.0), Vector(74.0), Vector(75.0))), s0(Vector(Vector(76.0)), Vector(Vector(77.0), Vector(78.0), Vector(79.0)))), Vector(s2(s1(s0(Vector(Vector(80.0)), Vector(Vector(81.0), Vector(82.0), Vector(83.0))), s0(Vector(Vector(84.0)), Vector(Vector(85.0), Vector(86.0), Vector(87.0)))), Vector(s0(Vector(Vector(88.0)), Vector(Vector(89.0), Vector(90.0), Vector(91.0))))), s2(s1(s0(Vector(Vector(92.0)), Vector(Vector(93.0), Vector(94.0), Vector(95.0))), s0(Vector(Vector(96.0)), Vector(Vector(97.0), Vector(98.0), Vector(99.0)))), Vector(s0(Vector(Vector(100.0)), Vector(Vector(101.0), Vector(102.0), Vector(103.0))))), s2(s1(s0(Vector(Vector(104.0)), Vector(Vector(105.0), Vector(106.0), Vector(107.0))), s0(Vector(Vector(108.0)), Vector(Vector(109.0), Vector(110.0), Vector(111.0)))), Vector(s0(Vector(Vector(112.0)), Vector(Vector(113.0), Vector(114.0), Vector(115.0))))))), s4(s1(s0(Vector(Vector(116.0)), Vector(Vector(117.0), Vector(118.0), Vector(119.0))), s0(Vector(Vector(120.0)), Vector(Vector(121.0), Vector(122.0), Vector(123.0)))), Vector(s2(s1(s0(Vector(Vector(124.0)), Vector(Vector(125.0), Vector(126.0), Vector(127.0))), s0(Vector(Vector(128.0)), Vector(Vector(129.0), Vector(130.0), Vector(131.0)))), Vector(s0(Vector(Vector(132.0)), Vector(Vector(133.0), Vector(134.0), Vector(135.0))))), s2(s1(s0(Vector(Vector(136.0)), Vector(Vector(137.0), Vector(138.0), Vector(139.0))), s0(Vector(Vector(140.0)), Vector(Vector(141.0), Vector(142.0), Vector(143.0)))), Vector(s0(Vector(Vector(144.0)), Vector(Vector(145.0), Vector(146.0), Vector(147.0))))), s2(s1(s0(Vector(Vector(148.0)), Vector(Vector(149.0), Vector(150.0), Vector(151.0))), s0(Vector(Vector(152.0)), Vector(Vector(153.0), Vector(154.0), Vector(155.0)))), Vector(s0(Vector(Vector(156.0)), Vector(Vector(157.0), Vector(158.0), Vector(159.0))))))), Vector(160.0, 161.0, 162.0)))
    val v2: Double = 163.0
    val start = nanoTime()
    var result: Double = 163.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}