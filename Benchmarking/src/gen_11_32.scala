import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[Vector[s0]]
  )
  case class s2 (
    p0: s1,
    p1: s1
  )
  case class s3 (
    p0: s2,
    p1: Vector[s2]
  )
  case class s4 (
    p0: s2,
    p1: Double
  )
  case class s5 (
    p0: Vector[Vector[s3]],
    p1: s0
  )
  case class s6 (
    p0: Vector[s0]
  )
  case class s7 (
    p0: Vector[s6],
    p1: s4
  )
  case class s8 (
    p0: s0,
    p1: s6
  )
  case class s9 (
    p0: s5,
    p1: s2
  )
  @noinline
  def f0(v0: s8, v1: s9, v2: Vector[s7], v3: Double): Double = {
    val v21: s2 = v1.p1
    val v36: s1 = v21.p1
    val v29: Vector[Vector[s0]] = v36.p1
    val v32: Vector[s0] = v29(2)
    val v41: s6 = s6(v32)
    val v25: Vector[s0] = v41.p0
    val v55: s0 = v25(0)
    val v71: Vector[Vector[Double]] = v55.p0
    val v236: Vector[Double] = v71(0)
    val v207: Double = v236(0)
    v207
  }
  def benchmark(): Unit = {
    val v0: s8 = s8(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0))), s6(Vector(s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))))))
    val v1: s9 = s9(s5(Vector(Vector(s3(s2(s1(Vector(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0)))), Vector(Vector(s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0)))), Vector(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0)))), Vector(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0)))))), s1(Vector(s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0), Vector(40.0), Vector(41.0)))), Vector(Vector(s0(Vector(Vector(42.0), Vector(43.0), Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0)))), Vector(s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0), Vector(52.0), Vector(53.0)))), Vector(s0(Vector(Vector(54.0), Vector(55.0), Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0))))))), Vector(s2(s1(Vector(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0), Vector(64.0), Vector(65.0)))), Vector(Vector(s0(Vector(Vector(66.0), Vector(67.0), Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0)))), Vector(s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)), Vector(Vector(75.0), Vector(76.0), Vector(77.0)))), Vector(s0(Vector(Vector(78.0), Vector(79.0), Vector(80.0)), Vector(Vector(81.0), Vector(82.0), Vector(83.0)))))), s1(Vector(s0(Vector(Vector(84.0), Vector(85.0), Vector(86.0)), Vector(Vector(87.0), Vector(88.0), Vector(89.0)))), Vector(Vector(s0(Vector(Vector(90.0), Vector(91.0), Vector(92.0)), Vector(Vector(93.0), Vector(94.0), Vector(95.0)))), Vector(s0(Vector(Vector(96.0), Vector(97.0), Vector(98.0)), Vector(Vector(99.0), Vector(100.0), Vector(101.0)))), Vector(s0(Vector(Vector(102.0), Vector(103.0), Vector(104.0)), Vector(Vector(105.0), Vector(106.0), Vector(107.0))))))), s2(s1(Vector(s0(Vector(Vector(108.0), Vector(109.0), Vector(110.0)), Vector(Vector(111.0), Vector(112.0), Vector(113.0)))), Vector(Vector(s0(Vector(Vector(114.0), Vector(115.0), Vector(116.0)), Vector(Vector(117.0), Vector(118.0), Vector(119.0)))), Vector(s0(Vector(Vector(120.0), Vector(121.0), Vector(122.0)), Vector(Vector(123.0), Vector(124.0), Vector(125.0)))), Vector(s0(Vector(Vector(126.0), Vector(127.0), Vector(128.0)), Vector(Vector(129.0), Vector(130.0), Vector(131.0)))))), s1(Vector(s0(Vector(Vector(132.0), Vector(133.0), Vector(134.0)), Vector(Vector(135.0), Vector(136.0), Vector(137.0)))), Vector(Vector(s0(Vector(Vector(138.0), Vector(139.0), Vector(140.0)), Vector(Vector(141.0), Vector(142.0), Vector(143.0)))), Vector(s0(Vector(Vector(144.0), Vector(145.0), Vector(146.0)), Vector(Vector(147.0), Vector(148.0), Vector(149.0)))), Vector(s0(Vector(Vector(150.0), Vector(151.0), Vector(152.0)), Vector(Vector(153.0), Vector(154.0), Vector(155.0))))))))))), s0(Vector(Vector(156.0), Vector(157.0), Vector(158.0)), Vector(Vector(159.0), Vector(160.0), Vector(161.0)))), s2(s1(Vector(s0(Vector(Vector(162.0), Vector(163.0), Vector(164.0)), Vector(Vector(165.0), Vector(166.0), Vector(167.0)))), Vector(Vector(s0(Vector(Vector(168.0), Vector(169.0), Vector(170.0)), Vector(Vector(171.0), Vector(172.0), Vector(173.0)))), Vector(s0(Vector(Vector(174.0), Vector(175.0), Vector(176.0)), Vector(Vector(177.0), Vector(178.0), Vector(179.0)))), Vector(s0(Vector(Vector(180.0), Vector(181.0), Vector(182.0)), Vector(Vector(183.0), Vector(184.0), Vector(185.0)))))), s1(Vector(s0(Vector(Vector(186.0), Vector(187.0), Vector(188.0)), Vector(Vector(189.0), Vector(190.0), Vector(191.0)))), Vector(Vector(s0(Vector(Vector(192.0), Vector(193.0), Vector(194.0)), Vector(Vector(195.0), Vector(196.0), Vector(197.0)))), Vector(s0(Vector(Vector(198.0), Vector(199.0), Vector(200.0)), Vector(Vector(201.0), Vector(202.0), Vector(203.0)))), Vector(s0(Vector(Vector(204.0), Vector(205.0), Vector(206.0)), Vector(Vector(207.0), Vector(208.0), Vector(209.0))))))))
    val v2: Vector[s7] = Vector(s7(Vector(s6(Vector(s0(Vector(Vector(210.0), Vector(211.0), Vector(212.0)), Vector(Vector(213.0), Vector(214.0), Vector(215.0)))))), s4(s2(s1(Vector(s0(Vector(Vector(216.0), Vector(217.0), Vector(218.0)), Vector(Vector(219.0), Vector(220.0), Vector(221.0)))), Vector(Vector(s0(Vector(Vector(222.0), Vector(223.0), Vector(224.0)), Vector(Vector(225.0), Vector(226.0), Vector(227.0)))), Vector(s0(Vector(Vector(228.0), Vector(229.0), Vector(230.0)), Vector(Vector(231.0), Vector(232.0), Vector(233.0)))), Vector(s0(Vector(Vector(234.0), Vector(235.0), Vector(236.0)), Vector(Vector(237.0), Vector(238.0), Vector(239.0)))))), s1(Vector(s0(Vector(Vector(240.0), Vector(241.0), Vector(242.0)), Vector(Vector(243.0), Vector(244.0), Vector(245.0)))), Vector(Vector(s0(Vector(Vector(246.0), Vector(247.0), Vector(248.0)), Vector(Vector(249.0), Vector(250.0), Vector(251.0)))), Vector(s0(Vector(Vector(252.0), Vector(253.0), Vector(254.0)), Vector(Vector(255.0), Vector(256.0), Vector(257.0)))), Vector(s0(Vector(Vector(258.0), Vector(259.0), Vector(260.0)), Vector(Vector(261.0), Vector(262.0), Vector(263.0))))))), 264.0)), s7(Vector(s6(Vector(s0(Vector(Vector(265.0), Vector(266.0), Vector(267.0)), Vector(Vector(268.0), Vector(269.0), Vector(270.0)))))), s4(s2(s1(Vector(s0(Vector(Vector(271.0), Vector(272.0), Vector(273.0)), Vector(Vector(274.0), Vector(275.0), Vector(276.0)))), Vector(Vector(s0(Vector(Vector(277.0), Vector(278.0), Vector(279.0)), Vector(Vector(280.0), Vector(281.0), Vector(282.0)))), Vector(s0(Vector(Vector(283.0), Vector(284.0), Vector(285.0)), Vector(Vector(286.0), Vector(287.0), Vector(288.0)))), Vector(s0(Vector(Vector(289.0), Vector(290.0), Vector(291.0)), Vector(Vector(292.0), Vector(293.0), Vector(294.0)))))), s1(Vector(s0(Vector(Vector(295.0), Vector(296.0), Vector(297.0)), Vector(Vector(298.0), Vector(299.0), Vector(300.0)))), Vector(Vector(s0(Vector(Vector(301.0), Vector(302.0), Vector(303.0)), Vector(Vector(304.0), Vector(305.0), Vector(306.0)))), Vector(s0(Vector(Vector(307.0), Vector(308.0), Vector(309.0)), Vector(Vector(310.0), Vector(311.0), Vector(312.0)))), Vector(s0(Vector(Vector(313.0), Vector(314.0), Vector(315.0)), Vector(Vector(316.0), Vector(317.0), Vector(318.0))))))), 319.0)), s7(Vector(s6(Vector(s0(Vector(Vector(320.0), Vector(321.0), Vector(322.0)), Vector(Vector(323.0), Vector(324.0), Vector(325.0)))))), s4(s2(s1(Vector(s0(Vector(Vector(326.0), Vector(327.0), Vector(328.0)), Vector(Vector(329.0), Vector(330.0), Vector(331.0)))), Vector(Vector(s0(Vector(Vector(332.0), Vector(333.0), Vector(334.0)), Vector(Vector(335.0), Vector(336.0), Vector(337.0)))), Vector(s0(Vector(Vector(338.0), Vector(339.0), Vector(340.0)), Vector(Vector(341.0), Vector(342.0), Vector(343.0)))), Vector(s0(Vector(Vector(344.0), Vector(345.0), Vector(346.0)), Vector(Vector(347.0), Vector(348.0), Vector(349.0)))))), s1(Vector(s0(Vector(Vector(350.0), Vector(351.0), Vector(352.0)), Vector(Vector(353.0), Vector(354.0), Vector(355.0)))), Vector(Vector(s0(Vector(Vector(356.0), Vector(357.0), Vector(358.0)), Vector(Vector(359.0), Vector(360.0), Vector(361.0)))), Vector(s0(Vector(Vector(362.0), Vector(363.0), Vector(364.0)), Vector(Vector(365.0), Vector(366.0), Vector(367.0)))), Vector(s0(Vector(Vector(368.0), Vector(369.0), Vector(370.0)), Vector(Vector(371.0), Vector(372.0), Vector(373.0))))))), 374.0)))
    val v3: Double = 375.0
    val start = nanoTime()
    var result: Double = 375.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}