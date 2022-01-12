import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0],
    p2: s0
  )
  case class s3 (
    p0: s0,
    p1: s1
  )
  case class s4 (
    p0: s3,
    p1: Vector[s0]
  )
  case class s6 (
    p0: Vector[s4],
    p1: Vector[Double]
  )
  case class s8 (
    p0: Vector[s6],
    p1: s4
  )
  @noinline
  def f0(v0: s8, v1: s8, v2: Double): Double = {
    var v5: Double = v2
    var v11: Double = v5
    var v8: Double = v11
    val v3: Double = v8 / v2
    var v6: Double = v5
    val v15: s4 = v0.p1
    val v43: s3 = v15.p0
    val v53: s0 = v43.p0
    val v34: Vector[Vector[Double]] = v53.p0
    val v44: Vector[Double] = v34(0)
    val v100: Vector[Vector[Double]] = v53.p0
    val v36: Double = v5 * v3
    val v67: Double = v44(0)
    var v79: Vector[Vector[Double]] = v100
    val v102: Double = v36 + v6
    v79 = v79.updated(1, v44)
    val v194: Vector[Double] = v79(0)
    val v173: Double = v194(0)
    v8 = v173
    v6 = v67
    v11 = v67
    v102
  }
  def benchmark(): Unit = {
    val v0: s8 = s8(Vector(s6(Vector(s4(s3(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0))), s1(s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0))), Vector(s0(Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0), Vector(14.0))), s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0)))), s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0), Vector(24.0))))), Vector(s0(Vector(Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0))), s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0), Vector(33.0), Vector(34.0)))))), Vector(35.0, 36.0)), s6(Vector(s4(s3(s0(Vector(Vector(37.0), Vector(38.0)), Vector(Vector(39.0), Vector(40.0), Vector(41.0))), s1(s0(Vector(Vector(42.0), Vector(43.0)), Vector(Vector(44.0), Vector(45.0), Vector(46.0))), Vector(s0(Vector(Vector(47.0), Vector(48.0)), Vector(Vector(49.0), Vector(50.0), Vector(51.0))), s0(Vector(Vector(52.0), Vector(53.0)), Vector(Vector(54.0), Vector(55.0), Vector(56.0)))), s0(Vector(Vector(57.0), Vector(58.0)), Vector(Vector(59.0), Vector(60.0), Vector(61.0))))), Vector(s0(Vector(Vector(62.0), Vector(63.0)), Vector(Vector(64.0), Vector(65.0), Vector(66.0))), s0(Vector(Vector(67.0), Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0)))))), Vector(72.0, 73.0)), s6(Vector(s4(s3(s0(Vector(Vector(74.0), Vector(75.0)), Vector(Vector(76.0), Vector(77.0), Vector(78.0))), s1(s0(Vector(Vector(79.0), Vector(80.0)), Vector(Vector(81.0), Vector(82.0), Vector(83.0))), Vector(s0(Vector(Vector(84.0), Vector(85.0)), Vector(Vector(86.0), Vector(87.0), Vector(88.0))), s0(Vector(Vector(89.0), Vector(90.0)), Vector(Vector(91.0), Vector(92.0), Vector(93.0)))), s0(Vector(Vector(94.0), Vector(95.0)), Vector(Vector(96.0), Vector(97.0), Vector(98.0))))), Vector(s0(Vector(Vector(99.0), Vector(100.0)), Vector(Vector(101.0), Vector(102.0), Vector(103.0))), s0(Vector(Vector(104.0), Vector(105.0)), Vector(Vector(106.0), Vector(107.0), Vector(108.0)))))), Vector(109.0, 110.0))), s4(s3(s0(Vector(Vector(111.0), Vector(112.0)), Vector(Vector(113.0), Vector(114.0), Vector(115.0))), s1(s0(Vector(Vector(116.0), Vector(117.0)), Vector(Vector(118.0), Vector(119.0), Vector(120.0))), Vector(s0(Vector(Vector(121.0), Vector(122.0)), Vector(Vector(123.0), Vector(124.0), Vector(125.0))), s0(Vector(Vector(126.0), Vector(127.0)), Vector(Vector(128.0), Vector(129.0), Vector(130.0)))), s0(Vector(Vector(131.0), Vector(132.0)), Vector(Vector(133.0), Vector(134.0), Vector(135.0))))), Vector(s0(Vector(Vector(136.0), Vector(137.0)), Vector(Vector(138.0), Vector(139.0), Vector(140.0))), s0(Vector(Vector(141.0), Vector(142.0)), Vector(Vector(143.0), Vector(144.0), Vector(145.0))))))
    val v1: s8 = s8(Vector(s6(Vector(s4(s3(s0(Vector(Vector(146.0), Vector(147.0)), Vector(Vector(148.0), Vector(149.0), Vector(150.0))), s1(s0(Vector(Vector(151.0), Vector(152.0)), Vector(Vector(153.0), Vector(154.0), Vector(155.0))), Vector(s0(Vector(Vector(156.0), Vector(157.0)), Vector(Vector(158.0), Vector(159.0), Vector(160.0))), s0(Vector(Vector(161.0), Vector(162.0)), Vector(Vector(163.0), Vector(164.0), Vector(165.0)))), s0(Vector(Vector(166.0), Vector(167.0)), Vector(Vector(168.0), Vector(169.0), Vector(170.0))))), Vector(s0(Vector(Vector(171.0), Vector(172.0)), Vector(Vector(173.0), Vector(174.0), Vector(175.0))), s0(Vector(Vector(176.0), Vector(177.0)), Vector(Vector(178.0), Vector(179.0), Vector(180.0)))))), Vector(181.0, 182.0)), s6(Vector(s4(s3(s0(Vector(Vector(183.0), Vector(184.0)), Vector(Vector(185.0), Vector(186.0), Vector(187.0))), s1(s0(Vector(Vector(188.0), Vector(189.0)), Vector(Vector(190.0), Vector(191.0), Vector(192.0))), Vector(s0(Vector(Vector(193.0), Vector(194.0)), Vector(Vector(195.0), Vector(196.0), Vector(197.0))), s0(Vector(Vector(198.0), Vector(199.0)), Vector(Vector(200.0), Vector(201.0), Vector(202.0)))), s0(Vector(Vector(203.0), Vector(204.0)), Vector(Vector(205.0), Vector(206.0), Vector(207.0))))), Vector(s0(Vector(Vector(208.0), Vector(209.0)), Vector(Vector(210.0), Vector(211.0), Vector(212.0))), s0(Vector(Vector(213.0), Vector(214.0)), Vector(Vector(215.0), Vector(216.0), Vector(217.0)))))), Vector(218.0, 219.0)), s6(Vector(s4(s3(s0(Vector(Vector(220.0), Vector(221.0)), Vector(Vector(222.0), Vector(223.0), Vector(224.0))), s1(s0(Vector(Vector(225.0), Vector(226.0)), Vector(Vector(227.0), Vector(228.0), Vector(229.0))), Vector(s0(Vector(Vector(230.0), Vector(231.0)), Vector(Vector(232.0), Vector(233.0), Vector(234.0))), s0(Vector(Vector(235.0), Vector(236.0)), Vector(Vector(237.0), Vector(238.0), Vector(239.0)))), s0(Vector(Vector(240.0), Vector(241.0)), Vector(Vector(242.0), Vector(243.0), Vector(244.0))))), Vector(s0(Vector(Vector(245.0), Vector(246.0)), Vector(Vector(247.0), Vector(248.0), Vector(249.0))), s0(Vector(Vector(250.0), Vector(251.0)), Vector(Vector(252.0), Vector(253.0), Vector(254.0)))))), Vector(255.0, 256.0))), s4(s3(s0(Vector(Vector(257.0), Vector(258.0)), Vector(Vector(259.0), Vector(260.0), Vector(261.0))), s1(s0(Vector(Vector(262.0), Vector(263.0)), Vector(Vector(264.0), Vector(265.0), Vector(266.0))), Vector(s0(Vector(Vector(267.0), Vector(268.0)), Vector(Vector(269.0), Vector(270.0), Vector(271.0))), s0(Vector(Vector(272.0), Vector(273.0)), Vector(Vector(274.0), Vector(275.0), Vector(276.0)))), s0(Vector(Vector(277.0), Vector(278.0)), Vector(Vector(279.0), Vector(280.0), Vector(281.0))))), Vector(s0(Vector(Vector(282.0), Vector(283.0)), Vector(Vector(284.0), Vector(285.0), Vector(286.0))), s0(Vector(Vector(287.0), Vector(288.0)), Vector(Vector(289.0), Vector(290.0), Vector(291.0))))))
    val v2: Double = 292.0
    val start = nanoTime()
    var result: Double = 292.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}