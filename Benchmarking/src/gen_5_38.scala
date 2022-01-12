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
    p1: s0
  )
  case class s3 (
    p0: s2,
    p1: s1
  )
  case class s4 (
    p0: s3,
    p1: Double
  )
  case class s5 (
    p0: Vector[s2],
    p1: Vector[s0]
  )
  case class s6 (
    p0: Vector[s1],
    p1: s4
  )
  def f17(v0: Vector[s5], v1: Double): Double = {
    val v8: s5 = v0(0)
    val v2: Vector[s0] = v8.p1
    val v4: s0 = v2(0)
    val v23: Double = v1 - v1
    val v73: Vector[Vector[Double]] = v4.p1
    val v129: Vector[Double] = v73(0)
    var v45: Double = v23
    val v39: Double = v129(0)
    val v65: Double = v39 + v45
    val v114: Double = v65 * v23
    val v193: Double = v39 - v114
    v193
  }
  @noinline
  def f0(v0: Vector[s3], v1: Vector[s6], v2: Vector[Vector[s5]], v3: Double): Double = {
    val v15: Double = v3 * v3
    val v30: Vector[s5] = v2(1)
    val v73: Vector[s5] = v2(0)
    val v36: Double = f17(v30, v15)
    val v50: Double = f17(v73, v36)
    v50
  }
  def benchmark(): Unit = {
    val v0: Vector[s3] = Vector(s3(s2(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0))), s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0)))), s1(s0(Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0), Vector(14.0))), s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0))))), s3(s2(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0), Vector(24.0))), s0(Vector(Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0)))), s1(s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0), Vector(33.0), Vector(34.0))), s0(Vector(Vector(35.0), Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0))))), s3(s2(s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0), Vector(44.0))), s0(Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0), Vector(48.0), Vector(49.0)))), s1(s0(Vector(Vector(50.0), Vector(51.0)), Vector(Vector(52.0), Vector(53.0), Vector(54.0))), s0(Vector(Vector(55.0), Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0))))))
    val v1: Vector[s6] = Vector(s6(Vector(s1(s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0), Vector(63.0), Vector(64.0))), s0(Vector(Vector(65.0), Vector(66.0)), Vector(Vector(67.0), Vector(68.0), Vector(69.0)))), s1(s0(Vector(Vector(70.0), Vector(71.0)), Vector(Vector(72.0), Vector(73.0), Vector(74.0))), s0(Vector(Vector(75.0), Vector(76.0)), Vector(Vector(77.0), Vector(78.0), Vector(79.0))))), s4(s3(s2(s0(Vector(Vector(80.0), Vector(81.0)), Vector(Vector(82.0), Vector(83.0), Vector(84.0))), s0(Vector(Vector(85.0), Vector(86.0)), Vector(Vector(87.0), Vector(88.0), Vector(89.0)))), s1(s0(Vector(Vector(90.0), Vector(91.0)), Vector(Vector(92.0), Vector(93.0), Vector(94.0))), s0(Vector(Vector(95.0), Vector(96.0)), Vector(Vector(97.0), Vector(98.0), Vector(99.0))))), 100.0)), s6(Vector(s1(s0(Vector(Vector(101.0), Vector(102.0)), Vector(Vector(103.0), Vector(104.0), Vector(105.0))), s0(Vector(Vector(106.0), Vector(107.0)), Vector(Vector(108.0), Vector(109.0), Vector(110.0)))), s1(s0(Vector(Vector(111.0), Vector(112.0)), Vector(Vector(113.0), Vector(114.0), Vector(115.0))), s0(Vector(Vector(116.0), Vector(117.0)), Vector(Vector(118.0), Vector(119.0), Vector(120.0))))), s4(s3(s2(s0(Vector(Vector(121.0), Vector(122.0)), Vector(Vector(123.0), Vector(124.0), Vector(125.0))), s0(Vector(Vector(126.0), Vector(127.0)), Vector(Vector(128.0), Vector(129.0), Vector(130.0)))), s1(s0(Vector(Vector(131.0), Vector(132.0)), Vector(Vector(133.0), Vector(134.0), Vector(135.0))), s0(Vector(Vector(136.0), Vector(137.0)), Vector(Vector(138.0), Vector(139.0), Vector(140.0))))), 141.0)), s6(Vector(s1(s0(Vector(Vector(142.0), Vector(143.0)), Vector(Vector(144.0), Vector(145.0), Vector(146.0))), s0(Vector(Vector(147.0), Vector(148.0)), Vector(Vector(149.0), Vector(150.0), Vector(151.0)))), s1(s0(Vector(Vector(152.0), Vector(153.0)), Vector(Vector(154.0), Vector(155.0), Vector(156.0))), s0(Vector(Vector(157.0), Vector(158.0)), Vector(Vector(159.0), Vector(160.0), Vector(161.0))))), s4(s3(s2(s0(Vector(Vector(162.0), Vector(163.0)), Vector(Vector(164.0), Vector(165.0), Vector(166.0))), s0(Vector(Vector(167.0), Vector(168.0)), Vector(Vector(169.0), Vector(170.0), Vector(171.0)))), s1(s0(Vector(Vector(172.0), Vector(173.0)), Vector(Vector(174.0), Vector(175.0), Vector(176.0))), s0(Vector(Vector(177.0), Vector(178.0)), Vector(Vector(179.0), Vector(180.0), Vector(181.0))))), 182.0)))
    val v2: Vector[Vector[s5]] = Vector(Vector(s5(Vector(s2(s0(Vector(Vector(183.0), Vector(184.0)), Vector(Vector(185.0), Vector(186.0), Vector(187.0))), s0(Vector(Vector(188.0), Vector(189.0)), Vector(Vector(190.0), Vector(191.0), Vector(192.0)))), s2(s0(Vector(Vector(193.0), Vector(194.0)), Vector(Vector(195.0), Vector(196.0), Vector(197.0))), s0(Vector(Vector(198.0), Vector(199.0)), Vector(Vector(200.0), Vector(201.0), Vector(202.0)))), s2(s0(Vector(Vector(203.0), Vector(204.0)), Vector(Vector(205.0), Vector(206.0), Vector(207.0))), s0(Vector(Vector(208.0), Vector(209.0)), Vector(Vector(210.0), Vector(211.0), Vector(212.0))))), Vector(s0(Vector(Vector(213.0), Vector(214.0)), Vector(Vector(215.0), Vector(216.0), Vector(217.0))), s0(Vector(Vector(218.0), Vector(219.0)), Vector(Vector(220.0), Vector(221.0), Vector(222.0))), s0(Vector(Vector(223.0), Vector(224.0)), Vector(Vector(225.0), Vector(226.0), Vector(227.0)))))), Vector(s5(Vector(s2(s0(Vector(Vector(228.0), Vector(229.0)), Vector(Vector(230.0), Vector(231.0), Vector(232.0))), s0(Vector(Vector(233.0), Vector(234.0)), Vector(Vector(235.0), Vector(236.0), Vector(237.0)))), s2(s0(Vector(Vector(238.0), Vector(239.0)), Vector(Vector(240.0), Vector(241.0), Vector(242.0))), s0(Vector(Vector(243.0), Vector(244.0)), Vector(Vector(245.0), Vector(246.0), Vector(247.0)))), s2(s0(Vector(Vector(248.0), Vector(249.0)), Vector(Vector(250.0), Vector(251.0), Vector(252.0))), s0(Vector(Vector(253.0), Vector(254.0)), Vector(Vector(255.0), Vector(256.0), Vector(257.0))))), Vector(s0(Vector(Vector(258.0), Vector(259.0)), Vector(Vector(260.0), Vector(261.0), Vector(262.0))), s0(Vector(Vector(263.0), Vector(264.0)), Vector(Vector(265.0), Vector(266.0), Vector(267.0))), s0(Vector(Vector(268.0), Vector(269.0)), Vector(Vector(270.0), Vector(271.0), Vector(272.0)))))))
    val v3: Double = 273.0
    val start = nanoTime()
    var result: Double = 273.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}