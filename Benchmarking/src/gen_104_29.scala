import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: Vector[s0],
    p2: Vector[s0],
    p3: s0,
    p4: s0
  )
  case class s3 (
    p0: s1,
    p1: Double
  )
  case class s4 (
    p0: Vector[s3],
    p1: s3
  )
  case class s5 (
    p0: s0,
    p1: s3
  )
  case class s7 (
    p0: Vector[s0],
    p1: s4
  )
  @noinline
  def f0(v0: s5, v1: Vector[s5], v2: Vector[s7], v3: Double): Double = {
    val v7: s0 = v0.p0
    val v12: Vector[Vector[Double]] = v7.p1
    val v31: Vector[Double] = v12(0)
    var v26: s0 = v7
    val v19: Double = v31(0)
    var v40: Double = v19
    val v39: Vector[Vector[Double]] = v26.p1
    val v46: Vector[Vector[Double]] = v7.p1
    val v34: Vector[Double] = v39(0)
    val v113: Double = v34(0)
    v26 = v26.copy(p1 = v46)
    val v205: Double = v113 / v40
    var v279: Double = v205
    v279
  }
  def benchmark(): Unit = {
    val v0: s5 = s5(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0))), s3(s1(Vector(Vector(s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0))))), Vector(s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0)))), Vector(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0))), s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0)))), s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0))), s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0)))), 28.0))
    val v1: Vector[s5] = Vector(s5(s0(Vector(Vector(29.0), Vector(30.0), Vector(31.0)), Vector(Vector(32.0))), s3(s1(Vector(Vector(s0(Vector(Vector(33.0), Vector(34.0), Vector(35.0)), Vector(Vector(36.0))))), Vector(s0(Vector(Vector(37.0), Vector(38.0), Vector(39.0)), Vector(Vector(40.0)))), Vector(s0(Vector(Vector(41.0), Vector(42.0), Vector(43.0)), Vector(Vector(44.0))), s0(Vector(Vector(45.0), Vector(46.0), Vector(47.0)), Vector(Vector(48.0)))), s0(Vector(Vector(49.0), Vector(50.0), Vector(51.0)), Vector(Vector(52.0))), s0(Vector(Vector(53.0), Vector(54.0), Vector(55.0)), Vector(Vector(56.0)))), 57.0)))
    val v2: Vector[s7] = Vector(s7(Vector(s0(Vector(Vector(58.0), Vector(59.0), Vector(60.0)), Vector(Vector(61.0))), s0(Vector(Vector(62.0), Vector(63.0), Vector(64.0)), Vector(Vector(65.0))), s0(Vector(Vector(66.0), Vector(67.0), Vector(68.0)), Vector(Vector(69.0)))), s4(Vector(s3(s1(Vector(Vector(s0(Vector(Vector(70.0), Vector(71.0), Vector(72.0)), Vector(Vector(73.0))))), Vector(s0(Vector(Vector(74.0), Vector(75.0), Vector(76.0)), Vector(Vector(77.0)))), Vector(s0(Vector(Vector(78.0), Vector(79.0), Vector(80.0)), Vector(Vector(81.0))), s0(Vector(Vector(82.0), Vector(83.0), Vector(84.0)), Vector(Vector(85.0)))), s0(Vector(Vector(86.0), Vector(87.0), Vector(88.0)), Vector(Vector(89.0))), s0(Vector(Vector(90.0), Vector(91.0), Vector(92.0)), Vector(Vector(93.0)))), 94.0), s3(s1(Vector(Vector(s0(Vector(Vector(95.0), Vector(96.0), Vector(97.0)), Vector(Vector(98.0))))), Vector(s0(Vector(Vector(99.0), Vector(100.0), Vector(101.0)), Vector(Vector(102.0)))), Vector(s0(Vector(Vector(103.0), Vector(104.0), Vector(105.0)), Vector(Vector(106.0))), s0(Vector(Vector(107.0), Vector(108.0), Vector(109.0)), Vector(Vector(110.0)))), s0(Vector(Vector(111.0), Vector(112.0), Vector(113.0)), Vector(Vector(114.0))), s0(Vector(Vector(115.0), Vector(116.0), Vector(117.0)), Vector(Vector(118.0)))), 119.0)), s3(s1(Vector(Vector(s0(Vector(Vector(120.0), Vector(121.0), Vector(122.0)), Vector(Vector(123.0))))), Vector(s0(Vector(Vector(124.0), Vector(125.0), Vector(126.0)), Vector(Vector(127.0)))), Vector(s0(Vector(Vector(128.0), Vector(129.0), Vector(130.0)), Vector(Vector(131.0))), s0(Vector(Vector(132.0), Vector(133.0), Vector(134.0)), Vector(Vector(135.0)))), s0(Vector(Vector(136.0), Vector(137.0), Vector(138.0)), Vector(Vector(139.0))), s0(Vector(Vector(140.0), Vector(141.0), Vector(142.0)), Vector(Vector(143.0)))), 144.0))), s7(Vector(s0(Vector(Vector(145.0), Vector(146.0), Vector(147.0)), Vector(Vector(148.0))), s0(Vector(Vector(149.0), Vector(150.0), Vector(151.0)), Vector(Vector(152.0))), s0(Vector(Vector(153.0), Vector(154.0), Vector(155.0)), Vector(Vector(156.0)))), s4(Vector(s3(s1(Vector(Vector(s0(Vector(Vector(157.0), Vector(158.0), Vector(159.0)), Vector(Vector(160.0))))), Vector(s0(Vector(Vector(161.0), Vector(162.0), Vector(163.0)), Vector(Vector(164.0)))), Vector(s0(Vector(Vector(165.0), Vector(166.0), Vector(167.0)), Vector(Vector(168.0))), s0(Vector(Vector(169.0), Vector(170.0), Vector(171.0)), Vector(Vector(172.0)))), s0(Vector(Vector(173.0), Vector(174.0), Vector(175.0)), Vector(Vector(176.0))), s0(Vector(Vector(177.0), Vector(178.0), Vector(179.0)), Vector(Vector(180.0)))), 181.0), s3(s1(Vector(Vector(s0(Vector(Vector(182.0), Vector(183.0), Vector(184.0)), Vector(Vector(185.0))))), Vector(s0(Vector(Vector(186.0), Vector(187.0), Vector(188.0)), Vector(Vector(189.0)))), Vector(s0(Vector(Vector(190.0), Vector(191.0), Vector(192.0)), Vector(Vector(193.0))), s0(Vector(Vector(194.0), Vector(195.0), Vector(196.0)), Vector(Vector(197.0)))), s0(Vector(Vector(198.0), Vector(199.0), Vector(200.0)), Vector(Vector(201.0))), s0(Vector(Vector(202.0), Vector(203.0), Vector(204.0)), Vector(Vector(205.0)))), 206.0)), s3(s1(Vector(Vector(s0(Vector(Vector(207.0), Vector(208.0), Vector(209.0)), Vector(Vector(210.0))))), Vector(s0(Vector(Vector(211.0), Vector(212.0), Vector(213.0)), Vector(Vector(214.0)))), Vector(s0(Vector(Vector(215.0), Vector(216.0), Vector(217.0)), Vector(Vector(218.0))), s0(Vector(Vector(219.0), Vector(220.0), Vector(221.0)), Vector(Vector(222.0)))), s0(Vector(Vector(223.0), Vector(224.0), Vector(225.0)), Vector(Vector(226.0))), s0(Vector(Vector(227.0), Vector(228.0), Vector(229.0)), Vector(Vector(230.0)))), 231.0))))
    val v3: Double = 232.0
    val start = nanoTime()
    var result: Double = 232.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}