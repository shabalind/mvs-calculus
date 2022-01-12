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
    p1: s1
  )
  case class s3 (
    p0: s2,
    p1: Double
  )
  case class s6 (
    p0: Vector[s2],
    p1: Vector[s1]
  )
  case class s7 (
    p0: Vector[Vector[s6]],
    p1: Vector[s6]
  )
  case class s9 (
    p0: s7,
    p1: Vector[s2]
  )
  case class s11 (
    p0: s3,
    p1: s3,
    p2: Vector[s6]
  )
  @noinline
  def f0(v0: s9, v1: s11, v2: Double): Double = {
    val v5: Vector[s2] = v0.p1
    var v13: Vector[s2] = v5
    val v15: s2 = v13(0)
    val v23: s1 = v15.p1
    val v14: s0 = v23.p0
    val v38: Vector[Vector[Double]] = v14.p1
    val v21: s2 = v13(0)
    val v64: Vector[Double] = v38(0)
    v13 = v13.updated(0, v21)
    val v142: Double = v64(0)
    v142
  }
  def benchmark(): Unit = {
    val v0: s9 = s9(s7(Vector(Vector(s6(Vector(s2(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0))), s1(s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0))), s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0))))), s2(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0))), s1(s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0))), s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0)))))), Vector(s1(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0))), s0(Vector(Vector(28.0), Vector(29.0), Vector(30.0)), Vector(Vector(31.0))))))), Vector(s6(Vector(s2(s0(Vector(Vector(32.0), Vector(33.0), Vector(34.0)), Vector(Vector(35.0))), s1(s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0))), s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0))))), s2(s0(Vector(Vector(44.0), Vector(45.0), Vector(46.0)), Vector(Vector(47.0))), s1(s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0))), s0(Vector(Vector(52.0), Vector(53.0), Vector(54.0)), Vector(Vector(55.0)))))), Vector(s1(s0(Vector(Vector(56.0), Vector(57.0), Vector(58.0)), Vector(Vector(59.0))), s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0))))))), Vector(s6(Vector(s2(s0(Vector(Vector(64.0), Vector(65.0), Vector(66.0)), Vector(Vector(67.0))), s1(s0(Vector(Vector(68.0), Vector(69.0), Vector(70.0)), Vector(Vector(71.0))), s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)), Vector(Vector(75.0))))), s2(s0(Vector(Vector(76.0), Vector(77.0), Vector(78.0)), Vector(Vector(79.0))), s1(s0(Vector(Vector(80.0), Vector(81.0), Vector(82.0)), Vector(Vector(83.0))), s0(Vector(Vector(84.0), Vector(85.0), Vector(86.0)), Vector(Vector(87.0)))))), Vector(s1(s0(Vector(Vector(88.0), Vector(89.0), Vector(90.0)), Vector(Vector(91.0))), s0(Vector(Vector(92.0), Vector(93.0), Vector(94.0)), Vector(Vector(95.0)))))))), Vector(s6(Vector(s2(s0(Vector(Vector(96.0), Vector(97.0), Vector(98.0)), Vector(Vector(99.0))), s1(s0(Vector(Vector(100.0), Vector(101.0), Vector(102.0)), Vector(Vector(103.0))), s0(Vector(Vector(104.0), Vector(105.0), Vector(106.0)), Vector(Vector(107.0))))), s2(s0(Vector(Vector(108.0), Vector(109.0), Vector(110.0)), Vector(Vector(111.0))), s1(s0(Vector(Vector(112.0), Vector(113.0), Vector(114.0)), Vector(Vector(115.0))), s0(Vector(Vector(116.0), Vector(117.0), Vector(118.0)), Vector(Vector(119.0)))))), Vector(s1(s0(Vector(Vector(120.0), Vector(121.0), Vector(122.0)), Vector(Vector(123.0))), s0(Vector(Vector(124.0), Vector(125.0), Vector(126.0)), Vector(Vector(127.0)))))), s6(Vector(s2(s0(Vector(Vector(128.0), Vector(129.0), Vector(130.0)), Vector(Vector(131.0))), s1(s0(Vector(Vector(132.0), Vector(133.0), Vector(134.0)), Vector(Vector(135.0))), s0(Vector(Vector(136.0), Vector(137.0), Vector(138.0)), Vector(Vector(139.0))))), s2(s0(Vector(Vector(140.0), Vector(141.0), Vector(142.0)), Vector(Vector(143.0))), s1(s0(Vector(Vector(144.0), Vector(145.0), Vector(146.0)), Vector(Vector(147.0))), s0(Vector(Vector(148.0), Vector(149.0), Vector(150.0)), Vector(Vector(151.0)))))), Vector(s1(s0(Vector(Vector(152.0), Vector(153.0), Vector(154.0)), Vector(Vector(155.0))), s0(Vector(Vector(156.0), Vector(157.0), Vector(158.0)), Vector(Vector(159.0)))))), s6(Vector(s2(s0(Vector(Vector(160.0), Vector(161.0), Vector(162.0)), Vector(Vector(163.0))), s1(s0(Vector(Vector(164.0), Vector(165.0), Vector(166.0)), Vector(Vector(167.0))), s0(Vector(Vector(168.0), Vector(169.0), Vector(170.0)), Vector(Vector(171.0))))), s2(s0(Vector(Vector(172.0), Vector(173.0), Vector(174.0)), Vector(Vector(175.0))), s1(s0(Vector(Vector(176.0), Vector(177.0), Vector(178.0)), Vector(Vector(179.0))), s0(Vector(Vector(180.0), Vector(181.0), Vector(182.0)), Vector(Vector(183.0)))))), Vector(s1(s0(Vector(Vector(184.0), Vector(185.0), Vector(186.0)), Vector(Vector(187.0))), s0(Vector(Vector(188.0), Vector(189.0), Vector(190.0)), Vector(Vector(191.0)))))))), Vector(s2(s0(Vector(Vector(192.0), Vector(193.0), Vector(194.0)), Vector(Vector(195.0))), s1(s0(Vector(Vector(196.0), Vector(197.0), Vector(198.0)), Vector(Vector(199.0))), s0(Vector(Vector(200.0), Vector(201.0), Vector(202.0)), Vector(Vector(203.0)))))))
    val v1: s11 = s11(s3(s2(s0(Vector(Vector(204.0), Vector(205.0), Vector(206.0)), Vector(Vector(207.0))), s1(s0(Vector(Vector(208.0), Vector(209.0), Vector(210.0)), Vector(Vector(211.0))), s0(Vector(Vector(212.0), Vector(213.0), Vector(214.0)), Vector(Vector(215.0))))), 216.0), s3(s2(s0(Vector(Vector(217.0), Vector(218.0), Vector(219.0)), Vector(Vector(220.0))), s1(s0(Vector(Vector(221.0), Vector(222.0), Vector(223.0)), Vector(Vector(224.0))), s0(Vector(Vector(225.0), Vector(226.0), Vector(227.0)), Vector(Vector(228.0))))), 229.0), Vector(s6(Vector(s2(s0(Vector(Vector(230.0), Vector(231.0), Vector(232.0)), Vector(Vector(233.0))), s1(s0(Vector(Vector(234.0), Vector(235.0), Vector(236.0)), Vector(Vector(237.0))), s0(Vector(Vector(238.0), Vector(239.0), Vector(240.0)), Vector(Vector(241.0))))), s2(s0(Vector(Vector(242.0), Vector(243.0), Vector(244.0)), Vector(Vector(245.0))), s1(s0(Vector(Vector(246.0), Vector(247.0), Vector(248.0)), Vector(Vector(249.0))), s0(Vector(Vector(250.0), Vector(251.0), Vector(252.0)), Vector(Vector(253.0)))))), Vector(s1(s0(Vector(Vector(254.0), Vector(255.0), Vector(256.0)), Vector(Vector(257.0))), s0(Vector(Vector(258.0), Vector(259.0), Vector(260.0)), Vector(Vector(261.0)))))), s6(Vector(s2(s0(Vector(Vector(262.0), Vector(263.0), Vector(264.0)), Vector(Vector(265.0))), s1(s0(Vector(Vector(266.0), Vector(267.0), Vector(268.0)), Vector(Vector(269.0))), s0(Vector(Vector(270.0), Vector(271.0), Vector(272.0)), Vector(Vector(273.0))))), s2(s0(Vector(Vector(274.0), Vector(275.0), Vector(276.0)), Vector(Vector(277.0))), s1(s0(Vector(Vector(278.0), Vector(279.0), Vector(280.0)), Vector(Vector(281.0))), s0(Vector(Vector(282.0), Vector(283.0), Vector(284.0)), Vector(Vector(285.0)))))), Vector(s1(s0(Vector(Vector(286.0), Vector(287.0), Vector(288.0)), Vector(Vector(289.0))), s0(Vector(Vector(290.0), Vector(291.0), Vector(292.0)), Vector(Vector(293.0)))))), s6(Vector(s2(s0(Vector(Vector(294.0), Vector(295.0), Vector(296.0)), Vector(Vector(297.0))), s1(s0(Vector(Vector(298.0), Vector(299.0), Vector(300.0)), Vector(Vector(301.0))), s0(Vector(Vector(302.0), Vector(303.0), Vector(304.0)), Vector(Vector(305.0))))), s2(s0(Vector(Vector(306.0), Vector(307.0), Vector(308.0)), Vector(Vector(309.0))), s1(s0(Vector(Vector(310.0), Vector(311.0), Vector(312.0)), Vector(Vector(313.0))), s0(Vector(Vector(314.0), Vector(315.0), Vector(316.0)), Vector(Vector(317.0)))))), Vector(s1(s0(Vector(Vector(318.0), Vector(319.0), Vector(320.0)), Vector(Vector(321.0))), s0(Vector(Vector(322.0), Vector(323.0), Vector(324.0)), Vector(Vector(325.0))))))))
    val v2: Double = 326.0
    val start = nanoTime()
    var result: Double = 326.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}