import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[Vector[s0]]
  )
  case class s3 (
    p0: s1,
    p1: Vector[Vector[s1]]
  )
  @noinline
  def f0(v0: Vector[s0], v1: s1, v2: Vector[s3], v3: Double): Double = {
    val v7: s3 = v2(1)
    val v6: s1 = v7.p0
    val v14: s0 = v6.p0
    val v28: Double = v3 / v3
    val v46: Vector[Vector[Double]] = v14.p1
    val v42: Vector[Double] = v46(0)
    val v45: Double = v28 + v28
    val v87: Double = v42(0)
    val v64: Vector[Double] = Vector(v3, v3, v87, v28, v45, v28)
    val v31: Vector[Vector[Double]] = Vector(v64, v64, v64)
    val v55: Vector[Double] = v31(0)
    val v495: Double = v55(3)
    var v143: Double = v495
    val v309: Double = v3 - v143
    v309
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0))), s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0))))
    val v1: s1 = s1(s0(Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0), Vector(14.0))), Vector(Vector(s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0)))), Vector(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0), Vector(24.0)))), Vector(s0(Vector(Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0))))))
    val v2: Vector[s3] = Vector(s3(s1(s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0), Vector(33.0), Vector(34.0))), Vector(Vector(s0(Vector(Vector(35.0), Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0)))), Vector(s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0), Vector(44.0)))), Vector(s0(Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0), Vector(48.0), Vector(49.0)))))), Vector(Vector(s1(s0(Vector(Vector(50.0), Vector(51.0)), Vector(Vector(52.0), Vector(53.0), Vector(54.0))), Vector(Vector(s0(Vector(Vector(55.0), Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0)))), Vector(s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0), Vector(63.0), Vector(64.0)))), Vector(s0(Vector(Vector(65.0), Vector(66.0)), Vector(Vector(67.0), Vector(68.0), Vector(69.0))))))), Vector(s1(s0(Vector(Vector(70.0), Vector(71.0)), Vector(Vector(72.0), Vector(73.0), Vector(74.0))), Vector(Vector(s0(Vector(Vector(75.0), Vector(76.0)), Vector(Vector(77.0), Vector(78.0), Vector(79.0)))), Vector(s0(Vector(Vector(80.0), Vector(81.0)), Vector(Vector(82.0), Vector(83.0), Vector(84.0)))), Vector(s0(Vector(Vector(85.0), Vector(86.0)), Vector(Vector(87.0), Vector(88.0), Vector(89.0))))))), Vector(s1(s0(Vector(Vector(90.0), Vector(91.0)), Vector(Vector(92.0), Vector(93.0), Vector(94.0))), Vector(Vector(s0(Vector(Vector(95.0), Vector(96.0)), Vector(Vector(97.0), Vector(98.0), Vector(99.0)))), Vector(s0(Vector(Vector(100.0), Vector(101.0)), Vector(Vector(102.0), Vector(103.0), Vector(104.0)))), Vector(s0(Vector(Vector(105.0), Vector(106.0)), Vector(Vector(107.0), Vector(108.0), Vector(109.0))))))))), s3(s1(s0(Vector(Vector(110.0), Vector(111.0)), Vector(Vector(112.0), Vector(113.0), Vector(114.0))), Vector(Vector(s0(Vector(Vector(115.0), Vector(116.0)), Vector(Vector(117.0), Vector(118.0), Vector(119.0)))), Vector(s0(Vector(Vector(120.0), Vector(121.0)), Vector(Vector(122.0), Vector(123.0), Vector(124.0)))), Vector(s0(Vector(Vector(125.0), Vector(126.0)), Vector(Vector(127.0), Vector(128.0), Vector(129.0)))))), Vector(Vector(s1(s0(Vector(Vector(130.0), Vector(131.0)), Vector(Vector(132.0), Vector(133.0), Vector(134.0))), Vector(Vector(s0(Vector(Vector(135.0), Vector(136.0)), Vector(Vector(137.0), Vector(138.0), Vector(139.0)))), Vector(s0(Vector(Vector(140.0), Vector(141.0)), Vector(Vector(142.0), Vector(143.0), Vector(144.0)))), Vector(s0(Vector(Vector(145.0), Vector(146.0)), Vector(Vector(147.0), Vector(148.0), Vector(149.0))))))), Vector(s1(s0(Vector(Vector(150.0), Vector(151.0)), Vector(Vector(152.0), Vector(153.0), Vector(154.0))), Vector(Vector(s0(Vector(Vector(155.0), Vector(156.0)), Vector(Vector(157.0), Vector(158.0), Vector(159.0)))), Vector(s0(Vector(Vector(160.0), Vector(161.0)), Vector(Vector(162.0), Vector(163.0), Vector(164.0)))), Vector(s0(Vector(Vector(165.0), Vector(166.0)), Vector(Vector(167.0), Vector(168.0), Vector(169.0))))))), Vector(s1(s0(Vector(Vector(170.0), Vector(171.0)), Vector(Vector(172.0), Vector(173.0), Vector(174.0))), Vector(Vector(s0(Vector(Vector(175.0), Vector(176.0)), Vector(Vector(177.0), Vector(178.0), Vector(179.0)))), Vector(s0(Vector(Vector(180.0), Vector(181.0)), Vector(Vector(182.0), Vector(183.0), Vector(184.0)))), Vector(s0(Vector(Vector(185.0), Vector(186.0)), Vector(Vector(187.0), Vector(188.0), Vector(189.0))))))))))
    val v3: Double = 190.0
    val start = nanoTime()
    var result: Double = 190.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}