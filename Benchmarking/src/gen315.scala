import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Double,
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0,
    p2: s0,
    p3: s0
  )
  case class s2 (
    p0: s0,
    p1: s0
  )
  case class s3 (
    p0: s1,
    p1: s0
  )
  case class s4 (
    p0: s3,
    p1: Vector[Vector[s1]]
  )
  case class s6 (
    p0: Vector[s1],
    p1: s4
  )
  case class s7 (
    p0: Vector[s2],
    p1: Vector[s6]
  )
  case class s8 (
    p0: Vector[s7],
    p1: s2
  )
  def f11(v0: Vector[s8], v1: Double): Double = {
    val v2: s8 = v0(1)
    val v8: s2 = v2.p1
    var v3: Double = v1
    val v9: s0 = v8.p0
    val v5: s2 = v2.p1
    v3 = v1
    val v14: s0 = v5.p1
    v3 = v1
    val v15: Vector[Double] = Vector(v3, v3, v3, v1, v3, v3, v3)
    val v13: Double = v15(3)
    val v38: Vector[Vector[Double]] = v9.p1
    var v31: Vector[Vector[Double]] = v38
    var v49: Vector[Vector[Double]] = v31
    val v37: Double = v14.p0
    var v72: Vector[Vector[Double]] = v49
    val v48: Double = v37 * v13
    val v112: Vector[Double] = v72(0)
    var v86: Vector[Double] = v112
    var v35: Vector[Double] = v112
    v72 = v72.updated(0, v86)
    v35 = v35.updated(0, v48)
    val v69: Double = v35(0)
    v69
  }
  @noinline
  def f0(v0: Vector[s3], v1: Vector[s8], v2: s3, v3: Double): Double = {
    val v7: Vector[Vector[s8]] = Vector(v1, v1, v1, v1, v1, v1)
    val v9: Double = v3 / v3
    var v13: Vector[Vector[s8]] = v7
    v13 = v13.updated(4, v1)
    val v31: Vector[s8] = v13(4)
    val v37: Vector[s8] = v13(0)
    val v53: s8 = v1(0)
    val v32: Double = f11(v31, v9)
    var v35: Vector[s8] = v37
    v35 = v35.updated(1, v53)
    v13 = v13.updated(1, v35)
    v35 = v35.updated(1, v53)
    v32
  }
  def benchmark(): Unit = {
    val v0: Vector[s3] = Vector(s3(s1(Vector(s0(0.0, Vector(Vector(1.0)))), s0(2.0, Vector(Vector(3.0))), s0(4.0, Vector(Vector(5.0))), s0(6.0, Vector(Vector(7.0)))), s0(8.0, Vector(Vector(9.0)))), s3(s1(Vector(s0(10.0, Vector(Vector(11.0)))), s0(12.0, Vector(Vector(13.0))), s0(14.0, Vector(Vector(15.0))), s0(16.0, Vector(Vector(17.0)))), s0(18.0, Vector(Vector(19.0)))))
    val v1: Vector[s8] = Vector(s8(Vector(s7(Vector(s2(s0(20.0, Vector(Vector(21.0))), s0(22.0, Vector(Vector(23.0)))), s2(s0(24.0, Vector(Vector(25.0))), s0(26.0, Vector(Vector(27.0)))), s2(s0(28.0, Vector(Vector(29.0))), s0(30.0, Vector(Vector(31.0))))), Vector(s6(Vector(s1(Vector(s0(32.0, Vector(Vector(33.0)))), s0(34.0, Vector(Vector(35.0))), s0(36.0, Vector(Vector(37.0))), s0(38.0, Vector(Vector(39.0)))), s1(Vector(s0(40.0, Vector(Vector(41.0)))), s0(42.0, Vector(Vector(43.0))), s0(44.0, Vector(Vector(45.0))), s0(46.0, Vector(Vector(47.0)))), s1(Vector(s0(48.0, Vector(Vector(49.0)))), s0(50.0, Vector(Vector(51.0))), s0(52.0, Vector(Vector(53.0))), s0(54.0, Vector(Vector(55.0))))), s4(s3(s1(Vector(s0(56.0, Vector(Vector(57.0)))), s0(58.0, Vector(Vector(59.0))), s0(60.0, Vector(Vector(61.0))), s0(62.0, Vector(Vector(63.0)))), s0(64.0, Vector(Vector(65.0)))), Vector(Vector(s1(Vector(s0(66.0, Vector(Vector(67.0)))), s0(68.0, Vector(Vector(69.0))), s0(70.0, Vector(Vector(71.0))), s0(72.0, Vector(Vector(73.0))))), Vector(s1(Vector(s0(74.0, Vector(Vector(75.0)))), s0(76.0, Vector(Vector(77.0))), s0(78.0, Vector(Vector(79.0))), s0(80.0, Vector(Vector(81.0)))))))))), s7(Vector(s2(s0(82.0, Vector(Vector(83.0))), s0(84.0, Vector(Vector(85.0)))), s2(s0(86.0, Vector(Vector(87.0))), s0(88.0, Vector(Vector(89.0)))), s2(s0(90.0, Vector(Vector(91.0))), s0(92.0, Vector(Vector(93.0))))), Vector(s6(Vector(s1(Vector(s0(94.0, Vector(Vector(95.0)))), s0(96.0, Vector(Vector(97.0))), s0(98.0, Vector(Vector(99.0))), s0(100.0, Vector(Vector(101.0)))), s1(Vector(s0(102.0, Vector(Vector(103.0)))), s0(104.0, Vector(Vector(105.0))), s0(106.0, Vector(Vector(107.0))), s0(108.0, Vector(Vector(109.0)))), s1(Vector(s0(110.0, Vector(Vector(111.0)))), s0(112.0, Vector(Vector(113.0))), s0(114.0, Vector(Vector(115.0))), s0(116.0, Vector(Vector(117.0))))), s4(s3(s1(Vector(s0(118.0, Vector(Vector(119.0)))), s0(120.0, Vector(Vector(121.0))), s0(122.0, Vector(Vector(123.0))), s0(124.0, Vector(Vector(125.0)))), s0(126.0, Vector(Vector(127.0)))), Vector(Vector(s1(Vector(s0(128.0, Vector(Vector(129.0)))), s0(130.0, Vector(Vector(131.0))), s0(132.0, Vector(Vector(133.0))), s0(134.0, Vector(Vector(135.0))))), Vector(s1(Vector(s0(136.0, Vector(Vector(137.0)))), s0(138.0, Vector(Vector(139.0))), s0(140.0, Vector(Vector(141.0))), s0(142.0, Vector(Vector(143.0)))))))))), s7(Vector(s2(s0(144.0, Vector(Vector(145.0))), s0(146.0, Vector(Vector(147.0)))), s2(s0(148.0, Vector(Vector(149.0))), s0(150.0, Vector(Vector(151.0)))), s2(s0(152.0, Vector(Vector(153.0))), s0(154.0, Vector(Vector(155.0))))), Vector(s6(Vector(s1(Vector(s0(156.0, Vector(Vector(157.0)))), s0(158.0, Vector(Vector(159.0))), s0(160.0, Vector(Vector(161.0))), s0(162.0, Vector(Vector(163.0)))), s1(Vector(s0(164.0, Vector(Vector(165.0)))), s0(166.0, Vector(Vector(167.0))), s0(168.0, Vector(Vector(169.0))), s0(170.0, Vector(Vector(171.0)))), s1(Vector(s0(172.0, Vector(Vector(173.0)))), s0(174.0, Vector(Vector(175.0))), s0(176.0, Vector(Vector(177.0))), s0(178.0, Vector(Vector(179.0))))), s4(s3(s1(Vector(s0(180.0, Vector(Vector(181.0)))), s0(182.0, Vector(Vector(183.0))), s0(184.0, Vector(Vector(185.0))), s0(186.0, Vector(Vector(187.0)))), s0(188.0, Vector(Vector(189.0)))), Vector(Vector(s1(Vector(s0(190.0, Vector(Vector(191.0)))), s0(192.0, Vector(Vector(193.0))), s0(194.0, Vector(Vector(195.0))), s0(196.0, Vector(Vector(197.0))))), Vector(s1(Vector(s0(198.0, Vector(Vector(199.0)))), s0(200.0, Vector(Vector(201.0))), s0(202.0, Vector(Vector(203.0))), s0(204.0, Vector(Vector(205.0))))))))))), s2(s0(206.0, Vector(Vector(207.0))), s0(208.0, Vector(Vector(209.0))))), s8(Vector(s7(Vector(s2(s0(210.0, Vector(Vector(211.0))), s0(212.0, Vector(Vector(213.0)))), s2(s0(214.0, Vector(Vector(215.0))), s0(216.0, Vector(Vector(217.0)))), s2(s0(218.0, Vector(Vector(219.0))), s0(220.0, Vector(Vector(221.0))))), Vector(s6(Vector(s1(Vector(s0(222.0, Vector(Vector(223.0)))), s0(224.0, Vector(Vector(225.0))), s0(226.0, Vector(Vector(227.0))), s0(228.0, Vector(Vector(229.0)))), s1(Vector(s0(230.0, Vector(Vector(231.0)))), s0(232.0, Vector(Vector(233.0))), s0(234.0, Vector(Vector(235.0))), s0(236.0, Vector(Vector(237.0)))), s1(Vector(s0(238.0, Vector(Vector(239.0)))), s0(240.0, Vector(Vector(241.0))), s0(242.0, Vector(Vector(243.0))), s0(244.0, Vector(Vector(245.0))))), s4(s3(s1(Vector(s0(246.0, Vector(Vector(247.0)))), s0(248.0, Vector(Vector(249.0))), s0(250.0, Vector(Vector(251.0))), s0(252.0, Vector(Vector(253.0)))), s0(254.0, Vector(Vector(255.0)))), Vector(Vector(s1(Vector(s0(256.0, Vector(Vector(257.0)))), s0(258.0, Vector(Vector(259.0))), s0(260.0, Vector(Vector(261.0))), s0(262.0, Vector(Vector(263.0))))), Vector(s1(Vector(s0(264.0, Vector(Vector(265.0)))), s0(266.0, Vector(Vector(267.0))), s0(268.0, Vector(Vector(269.0))), s0(270.0, Vector(Vector(271.0)))))))))), s7(Vector(s2(s0(272.0, Vector(Vector(273.0))), s0(274.0, Vector(Vector(275.0)))), s2(s0(276.0, Vector(Vector(277.0))), s0(278.0, Vector(Vector(279.0)))), s2(s0(280.0, Vector(Vector(281.0))), s0(282.0, Vector(Vector(283.0))))), Vector(s6(Vector(s1(Vector(s0(284.0, Vector(Vector(285.0)))), s0(286.0, Vector(Vector(287.0))), s0(288.0, Vector(Vector(289.0))), s0(290.0, Vector(Vector(291.0)))), s1(Vector(s0(292.0, Vector(Vector(293.0)))), s0(294.0, Vector(Vector(295.0))), s0(296.0, Vector(Vector(297.0))), s0(298.0, Vector(Vector(299.0)))), s1(Vector(s0(300.0, Vector(Vector(301.0)))), s0(302.0, Vector(Vector(303.0))), s0(304.0, Vector(Vector(305.0))), s0(306.0, Vector(Vector(307.0))))), s4(s3(s1(Vector(s0(308.0, Vector(Vector(309.0)))), s0(310.0, Vector(Vector(311.0))), s0(312.0, Vector(Vector(313.0))), s0(314.0, Vector(Vector(315.0)))), s0(316.0, Vector(Vector(317.0)))), Vector(Vector(s1(Vector(s0(318.0, Vector(Vector(319.0)))), s0(320.0, Vector(Vector(321.0))), s0(322.0, Vector(Vector(323.0))), s0(324.0, Vector(Vector(325.0))))), Vector(s1(Vector(s0(326.0, Vector(Vector(327.0)))), s0(328.0, Vector(Vector(329.0))), s0(330.0, Vector(Vector(331.0))), s0(332.0, Vector(Vector(333.0)))))))))), s7(Vector(s2(s0(334.0, Vector(Vector(335.0))), s0(336.0, Vector(Vector(337.0)))), s2(s0(338.0, Vector(Vector(339.0))), s0(340.0, Vector(Vector(341.0)))), s2(s0(342.0, Vector(Vector(343.0))), s0(344.0, Vector(Vector(345.0))))), Vector(s6(Vector(s1(Vector(s0(346.0, Vector(Vector(347.0)))), s0(348.0, Vector(Vector(349.0))), s0(350.0, Vector(Vector(351.0))), s0(352.0, Vector(Vector(353.0)))), s1(Vector(s0(354.0, Vector(Vector(355.0)))), s0(356.0, Vector(Vector(357.0))), s0(358.0, Vector(Vector(359.0))), s0(360.0, Vector(Vector(361.0)))), s1(Vector(s0(362.0, Vector(Vector(363.0)))), s0(364.0, Vector(Vector(365.0))), s0(366.0, Vector(Vector(367.0))), s0(368.0, Vector(Vector(369.0))))), s4(s3(s1(Vector(s0(370.0, Vector(Vector(371.0)))), s0(372.0, Vector(Vector(373.0))), s0(374.0, Vector(Vector(375.0))), s0(376.0, Vector(Vector(377.0)))), s0(378.0, Vector(Vector(379.0)))), Vector(Vector(s1(Vector(s0(380.0, Vector(Vector(381.0)))), s0(382.0, Vector(Vector(383.0))), s0(384.0, Vector(Vector(385.0))), s0(386.0, Vector(Vector(387.0))))), Vector(s1(Vector(s0(388.0, Vector(Vector(389.0)))), s0(390.0, Vector(Vector(391.0))), s0(392.0, Vector(Vector(393.0))), s0(394.0, Vector(Vector(395.0))))))))))), s2(s0(396.0, Vector(Vector(397.0))), s0(398.0, Vector(Vector(399.0))))))
    val v2: s3 = s3(s1(Vector(s0(400.0, Vector(Vector(401.0)))), s0(402.0, Vector(Vector(403.0))), s0(404.0, Vector(Vector(405.0))), s0(406.0, Vector(Vector(407.0)))), s0(408.0, Vector(Vector(409.0))))
    val v3: Double = 410.0
    val start = nanoTime()
    var result: Double = 410.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}