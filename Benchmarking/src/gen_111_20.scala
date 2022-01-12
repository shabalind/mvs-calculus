import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Double,
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: Vector[s1],
    p1: Vector[s1]
  )
  case class s3 (
    p0: s1,
    p1: Vector[s1],
    p2: Vector[s0],
    p3: s2,
    p4: s1,
    p5: s1
  )
  case class s4 (
    p0: Vector[Vector[s1]],
    p1: s3
  )
  case class s5 (
    p0: s0,
    p1: Vector[Vector[s3]]
  )
  case class s7 (
    p0: s2,
    p1: s5
  )
  case class s9 (
    p0: Vector[s7],
    p1: Vector[s1]
  )
  @noinline
  def f0(v0: s4, v1: Vector[Vector[s0]], v2: s9, v3: Double): Double = {
    val v5: Vector[s7] = v2.p0
    val v6: s7 = v5(1)
    val v17: Double = v3 + v3
    val v25: Double = v17 + v17
    var v13: Double = v25
    val v14: s2 = v6.p0
    val v49: Vector[s1] = v14.p1
    val v44: s1 = v49(1)
    val v39: s0 = v44.p1
    val v81: Vector[Vector[Double]] = v39.p1
    var v95: Double = v25
    val v119: Vector[Double] = v81(0)
    val v52: Double = v119(0)
    val v97: Double = v52 * v95
    val v88: Double = v97 - v13
    v88
  }
  def benchmark(): Unit = {
    val v0: s4 = s4(Vector(Vector(s1(s0(0.0, Vector(Vector(1.0))), s0(2.0, Vector(Vector(3.0))))), Vector(s1(s0(4.0, Vector(Vector(5.0))), s0(6.0, Vector(Vector(7.0)))))), s3(s1(s0(8.0, Vector(Vector(9.0))), s0(10.0, Vector(Vector(11.0)))), Vector(s1(s0(12.0, Vector(Vector(13.0))), s0(14.0, Vector(Vector(15.0)))), s1(s0(16.0, Vector(Vector(17.0))), s0(18.0, Vector(Vector(19.0)))), s1(s0(20.0, Vector(Vector(21.0))), s0(22.0, Vector(Vector(23.0))))), Vector(s0(24.0, Vector(Vector(25.0))), s0(26.0, Vector(Vector(27.0)))), s2(Vector(s1(s0(28.0, Vector(Vector(29.0))), s0(30.0, Vector(Vector(31.0))))), Vector(s1(s0(32.0, Vector(Vector(33.0))), s0(34.0, Vector(Vector(35.0)))), s1(s0(36.0, Vector(Vector(37.0))), s0(38.0, Vector(Vector(39.0)))), s1(s0(40.0, Vector(Vector(41.0))), s0(42.0, Vector(Vector(43.0)))))), s1(s0(44.0, Vector(Vector(45.0))), s0(46.0, Vector(Vector(47.0)))), s1(s0(48.0, Vector(Vector(49.0))), s0(50.0, Vector(Vector(51.0))))))
    val v1: Vector[Vector[s0]] = Vector(Vector(s0(52.0, Vector(Vector(53.0)))), Vector(s0(54.0, Vector(Vector(55.0)))))
    val v2: s9 = s9(Vector(s7(s2(Vector(s1(s0(56.0, Vector(Vector(57.0))), s0(58.0, Vector(Vector(59.0))))), Vector(s1(s0(60.0, Vector(Vector(61.0))), s0(62.0, Vector(Vector(63.0)))), s1(s0(64.0, Vector(Vector(65.0))), s0(66.0, Vector(Vector(67.0)))), s1(s0(68.0, Vector(Vector(69.0))), s0(70.0, Vector(Vector(71.0)))))), s5(s0(72.0, Vector(Vector(73.0))), Vector(Vector(s3(s1(s0(74.0, Vector(Vector(75.0))), s0(76.0, Vector(Vector(77.0)))), Vector(s1(s0(78.0, Vector(Vector(79.0))), s0(80.0, Vector(Vector(81.0)))), s1(s0(82.0, Vector(Vector(83.0))), s0(84.0, Vector(Vector(85.0)))), s1(s0(86.0, Vector(Vector(87.0))), s0(88.0, Vector(Vector(89.0))))), Vector(s0(90.0, Vector(Vector(91.0))), s0(92.0, Vector(Vector(93.0)))), s2(Vector(s1(s0(94.0, Vector(Vector(95.0))), s0(96.0, Vector(Vector(97.0))))), Vector(s1(s0(98.0, Vector(Vector(99.0))), s0(100.0, Vector(Vector(101.0)))), s1(s0(102.0, Vector(Vector(103.0))), s0(104.0, Vector(Vector(105.0)))), s1(s0(106.0, Vector(Vector(107.0))), s0(108.0, Vector(Vector(109.0)))))), s1(s0(110.0, Vector(Vector(111.0))), s0(112.0, Vector(Vector(113.0)))), s1(s0(114.0, Vector(Vector(115.0))), s0(116.0, Vector(Vector(117.0)))))), Vector(s3(s1(s0(118.0, Vector(Vector(119.0))), s0(120.0, Vector(Vector(121.0)))), Vector(s1(s0(122.0, Vector(Vector(123.0))), s0(124.0, Vector(Vector(125.0)))), s1(s0(126.0, Vector(Vector(127.0))), s0(128.0, Vector(Vector(129.0)))), s1(s0(130.0, Vector(Vector(131.0))), s0(132.0, Vector(Vector(133.0))))), Vector(s0(134.0, Vector(Vector(135.0))), s0(136.0, Vector(Vector(137.0)))), s2(Vector(s1(s0(138.0, Vector(Vector(139.0))), s0(140.0, Vector(Vector(141.0))))), Vector(s1(s0(142.0, Vector(Vector(143.0))), s0(144.0, Vector(Vector(145.0)))), s1(s0(146.0, Vector(Vector(147.0))), s0(148.0, Vector(Vector(149.0)))), s1(s0(150.0, Vector(Vector(151.0))), s0(152.0, Vector(Vector(153.0)))))), s1(s0(154.0, Vector(Vector(155.0))), s0(156.0, Vector(Vector(157.0)))), s1(s0(158.0, Vector(Vector(159.0))), s0(160.0, Vector(Vector(161.0))))))))), s7(s2(Vector(s1(s0(162.0, Vector(Vector(163.0))), s0(164.0, Vector(Vector(165.0))))), Vector(s1(s0(166.0, Vector(Vector(167.0))), s0(168.0, Vector(Vector(169.0)))), s1(s0(170.0, Vector(Vector(171.0))), s0(172.0, Vector(Vector(173.0)))), s1(s0(174.0, Vector(Vector(175.0))), s0(176.0, Vector(Vector(177.0)))))), s5(s0(178.0, Vector(Vector(179.0))), Vector(Vector(s3(s1(s0(180.0, Vector(Vector(181.0))), s0(182.0, Vector(Vector(183.0)))), Vector(s1(s0(184.0, Vector(Vector(185.0))), s0(186.0, Vector(Vector(187.0)))), s1(s0(188.0, Vector(Vector(189.0))), s0(190.0, Vector(Vector(191.0)))), s1(s0(192.0, Vector(Vector(193.0))), s0(194.0, Vector(Vector(195.0))))), Vector(s0(196.0, Vector(Vector(197.0))), s0(198.0, Vector(Vector(199.0)))), s2(Vector(s1(s0(200.0, Vector(Vector(201.0))), s0(202.0, Vector(Vector(203.0))))), Vector(s1(s0(204.0, Vector(Vector(205.0))), s0(206.0, Vector(Vector(207.0)))), s1(s0(208.0, Vector(Vector(209.0))), s0(210.0, Vector(Vector(211.0)))), s1(s0(212.0, Vector(Vector(213.0))), s0(214.0, Vector(Vector(215.0)))))), s1(s0(216.0, Vector(Vector(217.0))), s0(218.0, Vector(Vector(219.0)))), s1(s0(220.0, Vector(Vector(221.0))), s0(222.0, Vector(Vector(223.0)))))), Vector(s3(s1(s0(224.0, Vector(Vector(225.0))), s0(226.0, Vector(Vector(227.0)))), Vector(s1(s0(228.0, Vector(Vector(229.0))), s0(230.0, Vector(Vector(231.0)))), s1(s0(232.0, Vector(Vector(233.0))), s0(234.0, Vector(Vector(235.0)))), s1(s0(236.0, Vector(Vector(237.0))), s0(238.0, Vector(Vector(239.0))))), Vector(s0(240.0, Vector(Vector(241.0))), s0(242.0, Vector(Vector(243.0)))), s2(Vector(s1(s0(244.0, Vector(Vector(245.0))), s0(246.0, Vector(Vector(247.0))))), Vector(s1(s0(248.0, Vector(Vector(249.0))), s0(250.0, Vector(Vector(251.0)))), s1(s0(252.0, Vector(Vector(253.0))), s0(254.0, Vector(Vector(255.0)))), s1(s0(256.0, Vector(Vector(257.0))), s0(258.0, Vector(Vector(259.0)))))), s1(s0(260.0, Vector(Vector(261.0))), s0(262.0, Vector(Vector(263.0)))), s1(s0(264.0, Vector(Vector(265.0))), s0(266.0, Vector(Vector(267.0))))))))), s7(s2(Vector(s1(s0(268.0, Vector(Vector(269.0))), s0(270.0, Vector(Vector(271.0))))), Vector(s1(s0(272.0, Vector(Vector(273.0))), s0(274.0, Vector(Vector(275.0)))), s1(s0(276.0, Vector(Vector(277.0))), s0(278.0, Vector(Vector(279.0)))), s1(s0(280.0, Vector(Vector(281.0))), s0(282.0, Vector(Vector(283.0)))))), s5(s0(284.0, Vector(Vector(285.0))), Vector(Vector(s3(s1(s0(286.0, Vector(Vector(287.0))), s0(288.0, Vector(Vector(289.0)))), Vector(s1(s0(290.0, Vector(Vector(291.0))), s0(292.0, Vector(Vector(293.0)))), s1(s0(294.0, Vector(Vector(295.0))), s0(296.0, Vector(Vector(297.0)))), s1(s0(298.0, Vector(Vector(299.0))), s0(300.0, Vector(Vector(301.0))))), Vector(s0(302.0, Vector(Vector(303.0))), s0(304.0, Vector(Vector(305.0)))), s2(Vector(s1(s0(306.0, Vector(Vector(307.0))), s0(308.0, Vector(Vector(309.0))))), Vector(s1(s0(310.0, Vector(Vector(311.0))), s0(312.0, Vector(Vector(313.0)))), s1(s0(314.0, Vector(Vector(315.0))), s0(316.0, Vector(Vector(317.0)))), s1(s0(318.0, Vector(Vector(319.0))), s0(320.0, Vector(Vector(321.0)))))), s1(s0(322.0, Vector(Vector(323.0))), s0(324.0, Vector(Vector(325.0)))), s1(s0(326.0, Vector(Vector(327.0))), s0(328.0, Vector(Vector(329.0)))))), Vector(s3(s1(s0(330.0, Vector(Vector(331.0))), s0(332.0, Vector(Vector(333.0)))), Vector(s1(s0(334.0, Vector(Vector(335.0))), s0(336.0, Vector(Vector(337.0)))), s1(s0(338.0, Vector(Vector(339.0))), s0(340.0, Vector(Vector(341.0)))), s1(s0(342.0, Vector(Vector(343.0))), s0(344.0, Vector(Vector(345.0))))), Vector(s0(346.0, Vector(Vector(347.0))), s0(348.0, Vector(Vector(349.0)))), s2(Vector(s1(s0(350.0, Vector(Vector(351.0))), s0(352.0, Vector(Vector(353.0))))), Vector(s1(s0(354.0, Vector(Vector(355.0))), s0(356.0, Vector(Vector(357.0)))), s1(s0(358.0, Vector(Vector(359.0))), s0(360.0, Vector(Vector(361.0)))), s1(s0(362.0, Vector(Vector(363.0))), s0(364.0, Vector(Vector(365.0)))))), s1(s0(366.0, Vector(Vector(367.0))), s0(368.0, Vector(Vector(369.0)))), s1(s0(370.0, Vector(Vector(371.0))), s0(372.0, Vector(Vector(373.0)))))))))), Vector(s1(s0(374.0, Vector(Vector(375.0))), s0(376.0, Vector(Vector(377.0)))), s1(s0(378.0, Vector(Vector(379.0))), s0(380.0, Vector(Vector(381.0))))))
    val v3: Double = 382.0
    val start = nanoTime()
    var result: Double = 382.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}