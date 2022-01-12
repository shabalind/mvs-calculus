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
    p0: Vector[Vector[s0]],
    p1: s1
  )
  case class s3 (
    p0: s1,
    p1: s2
  )
  case class s4 (
    p0: s0,
    p1: s2
  )
  case class s7 (
    p0: Double,
    p1: Vector[Vector[s0]]
  )
  case class s13 (
    p0: Vector[s7],
    p1: Vector[Vector[s1]]
  )
  @noinline
  def f0(v0: Vector[s4], v1: s13, v2: Vector[Vector[s3]], v3: Double): Double = {
    var v10: Double = v3
    val v13: Vector[s3] = v2(0)
    val v11: s3 = v13(0)
    val v21: s1 = v11.p0
    v10 = v3
    val v35: s0 = v21.p0
    val v27: Vector[Vector[Double]] = v35.p0
    val v22: Vector[Double] = v27(2)
    val v51: Double = v22(0)
    val v90: Double = v10 / v10
    val v98: Double = v10 + v51
    val v91: Double = v98 - v90
    v91
  }
  def benchmark(): Unit = {
    val v0: Vector[s4] = Vector(s4(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0))), s2(Vector(Vector(s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0)))), Vector(s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0)))), Vector(s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0))))), s1(s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0), Vector(24.0))), Vector(s0(Vector(Vector(25.0), Vector(26.0), Vector(27.0)), Vector(Vector(28.0), Vector(29.0))))))), s4(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0))), s2(Vector(Vector(s0(Vector(Vector(35.0), Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0)))), Vector(s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0), Vector(44.0)))), Vector(s0(Vector(Vector(45.0), Vector(46.0), Vector(47.0)), Vector(Vector(48.0), Vector(49.0))))), s1(s0(Vector(Vector(50.0), Vector(51.0), Vector(52.0)), Vector(Vector(53.0), Vector(54.0))), Vector(s0(Vector(Vector(55.0), Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0))))))), s4(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0), Vector(64.0))), s2(Vector(Vector(s0(Vector(Vector(65.0), Vector(66.0), Vector(67.0)), Vector(Vector(68.0), Vector(69.0)))), Vector(s0(Vector(Vector(70.0), Vector(71.0), Vector(72.0)), Vector(Vector(73.0), Vector(74.0)))), Vector(s0(Vector(Vector(75.0), Vector(76.0), Vector(77.0)), Vector(Vector(78.0), Vector(79.0))))), s1(s0(Vector(Vector(80.0), Vector(81.0), Vector(82.0)), Vector(Vector(83.0), Vector(84.0))), Vector(s0(Vector(Vector(85.0), Vector(86.0), Vector(87.0)), Vector(Vector(88.0), Vector(89.0))))))))
    val v1: s13 = s13(Vector(s7(90.0, Vector(Vector(s0(Vector(Vector(91.0), Vector(92.0), Vector(93.0)), Vector(Vector(94.0), Vector(95.0)))))), s7(96.0, Vector(Vector(s0(Vector(Vector(97.0), Vector(98.0), Vector(99.0)), Vector(Vector(100.0), Vector(101.0))))))), Vector(Vector(s1(s0(Vector(Vector(102.0), Vector(103.0), Vector(104.0)), Vector(Vector(105.0), Vector(106.0))), Vector(s0(Vector(Vector(107.0), Vector(108.0), Vector(109.0)), Vector(Vector(110.0), Vector(111.0)))))), Vector(s1(s0(Vector(Vector(112.0), Vector(113.0), Vector(114.0)), Vector(Vector(115.0), Vector(116.0))), Vector(s0(Vector(Vector(117.0), Vector(118.0), Vector(119.0)), Vector(Vector(120.0), Vector(121.0)))))), Vector(s1(s0(Vector(Vector(122.0), Vector(123.0), Vector(124.0)), Vector(Vector(125.0), Vector(126.0))), Vector(s0(Vector(Vector(127.0), Vector(128.0), Vector(129.0)), Vector(Vector(130.0), Vector(131.0))))))))
    val v2: Vector[Vector[s3]] = Vector(Vector(s3(s1(s0(Vector(Vector(132.0), Vector(133.0), Vector(134.0)), Vector(Vector(135.0), Vector(136.0))), Vector(s0(Vector(Vector(137.0), Vector(138.0), Vector(139.0)), Vector(Vector(140.0), Vector(141.0))))), s2(Vector(Vector(s0(Vector(Vector(142.0), Vector(143.0), Vector(144.0)), Vector(Vector(145.0), Vector(146.0)))), Vector(s0(Vector(Vector(147.0), Vector(148.0), Vector(149.0)), Vector(Vector(150.0), Vector(151.0)))), Vector(s0(Vector(Vector(152.0), Vector(153.0), Vector(154.0)), Vector(Vector(155.0), Vector(156.0))))), s1(s0(Vector(Vector(157.0), Vector(158.0), Vector(159.0)), Vector(Vector(160.0), Vector(161.0))), Vector(s0(Vector(Vector(162.0), Vector(163.0), Vector(164.0)), Vector(Vector(165.0), Vector(166.0)))))))))
    val v3: Double = 167.0
    val start = nanoTime()
    var result: Double = 167.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}