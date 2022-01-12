import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Double,
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: Vector[Vector[s0]],
    p2: Vector[Vector[s0]],
    p3: Vector[s0]
  )
  case class s2 (
    p0: Vector[s0],
    p1: Vector[Vector[s1]]
  )
  def f16(v0: s0): s0 = {
    val v2: Double = v0.p0
    val v7: Vector[Double] = Vector(v2, v2)
    val v8: Double = v7(0)
    var v9: Double = v8
    var v10: Double = v9
    val v5: Double = v7(0)
    var v4: s0 = v0
    val v1: Double = v7(1)
    var v11: s0 = v4
    v11 = v11.copy(p0 = v2)
    v4 = v4.copy(p0 = v10)
    val v43: Double = v2 - v2
    var v28: Double = v9
    val v25: Double = v11.p0
    val v22: Vector[Vector[Double]] = v0.p1
    v4 = v4.copy(p0 = v28)
    val v41: Double = v4.p0
    v11 = v4
    val v71: Vector[Double] = v22(0)
    val v27: Vector[Double] = v22(2)
    val v44: Double = v71(0)
    var v42: Double = v41
    v4 = v4.copy(p0 = v42)
    var v36: Vector[Vector[Double]] = v22
    val v89: Double = v1 / v1
    var v35: s0 = v4
    v35 = v35.copy(p0 = v89)
    val v33: Vector[Vector[Double]] = v4.p1
    val v83: Vector[Vector[Double]] = v35.p1
    var v69: Vector[Vector[Double]] = v22
    v4 = v4.copy(p0 = v42)
    v4 = v4.copy(p1 = v22)
    v11 = v11.copy(p0 = v9)
    val v93: Vector[Vector[Double]] = v35.p1
    v11 = v11.copy(p0 = v44)
    v4 = v4.copy(p0 = v42)
    var v87: Vector[Vector[Double]] = v83
    val v76: Vector[Vector[Double]] = v11.p1
    v35 = v35.copy(p0 = v5)
    v4 = v4.copy(p1 = v69)
    v4 = v4.copy(p1 = v36)
    v11 = v11.copy(p1 = v87)
    v11 = v11.copy(p0 = v25)
    v4 = v4.copy(p0 = v43)
    v4 = v4.copy(p0 = v44)
    val v113: s0 = s0(v42, v33)
    v35 = v35.copy(p1 = v76)
    v4 = v4.copy(p1 = v83)
    v11 = v11.copy(p1 = v93)
    v4 = v4.copy(p0 = v1)
    v35 = v113
    v36 = v36.updated(1, v27)
    v4 = v4.copy(p0 = v44)
    v113
  }
  @noinline
  def f0(v0: s2, v1: Vector[s2], v2: s2, v3: s1, v4: Double): Double = {
    val v5: Vector[Vector[s0]] = v3.p1
    val v22: Vector[s0] = v5(0)
    val v27: s0 = v22(0)
    val v79: s0 = f16(v27)
    val v19: Double = v27.p0
    val v52: s0 = f16(v79)
    val v32: Double = v79.p0
    val v40: Vector[Double] = Vector(v4, v19, v19, v4, v4)
    val v18: Double = v40(0)
    val v46: Vector[Double] = Vector(v32, v32, v4, v4)
    val v29: Double = v52.p0
    val v90: Double = v46(2)
    var v60: Double = v29
    v60 = v18
    val v102: Double = v60 - v90
    v102
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(Vector(s0(0.0, Vector(Vector(1.0), Vector(2.0), Vector(3.0)))), Vector(Vector(s1(Vector(Vector(s0(4.0, Vector(Vector(5.0), Vector(6.0), Vector(7.0))))), Vector(Vector(s0(8.0, Vector(Vector(9.0), Vector(10.0), Vector(11.0)))), Vector(s0(12.0, Vector(Vector(13.0), Vector(14.0), Vector(15.0))))), Vector(Vector(s0(16.0, Vector(Vector(17.0), Vector(18.0), Vector(19.0)))), Vector(s0(20.0, Vector(Vector(21.0), Vector(22.0), Vector(23.0)))), Vector(s0(24.0, Vector(Vector(25.0), Vector(26.0), Vector(27.0))))), Vector(s0(28.0, Vector(Vector(29.0), Vector(30.0), Vector(31.0))), s0(32.0, Vector(Vector(33.0), Vector(34.0), Vector(35.0)))))), Vector(s1(Vector(Vector(s0(36.0, Vector(Vector(37.0), Vector(38.0), Vector(39.0))))), Vector(Vector(s0(40.0, Vector(Vector(41.0), Vector(42.0), Vector(43.0)))), Vector(s0(44.0, Vector(Vector(45.0), Vector(46.0), Vector(47.0))))), Vector(Vector(s0(48.0, Vector(Vector(49.0), Vector(50.0), Vector(51.0)))), Vector(s0(52.0, Vector(Vector(53.0), Vector(54.0), Vector(55.0)))), Vector(s0(56.0, Vector(Vector(57.0), Vector(58.0), Vector(59.0))))), Vector(s0(60.0, Vector(Vector(61.0), Vector(62.0), Vector(63.0))), s0(64.0, Vector(Vector(65.0), Vector(66.0), Vector(67.0)))))), Vector(s1(Vector(Vector(s0(68.0, Vector(Vector(69.0), Vector(70.0), Vector(71.0))))), Vector(Vector(s0(72.0, Vector(Vector(73.0), Vector(74.0), Vector(75.0)))), Vector(s0(76.0, Vector(Vector(77.0), Vector(78.0), Vector(79.0))))), Vector(Vector(s0(80.0, Vector(Vector(81.0), Vector(82.0), Vector(83.0)))), Vector(s0(84.0, Vector(Vector(85.0), Vector(86.0), Vector(87.0)))), Vector(s0(88.0, Vector(Vector(89.0), Vector(90.0), Vector(91.0))))), Vector(s0(92.0, Vector(Vector(93.0), Vector(94.0), Vector(95.0))), s0(96.0, Vector(Vector(97.0), Vector(98.0), Vector(99.0))))))))
    val v1: Vector[s2] = Vector(s2(Vector(s0(100.0, Vector(Vector(101.0), Vector(102.0), Vector(103.0)))), Vector(Vector(s1(Vector(Vector(s0(104.0, Vector(Vector(105.0), Vector(106.0), Vector(107.0))))), Vector(Vector(s0(108.0, Vector(Vector(109.0), Vector(110.0), Vector(111.0)))), Vector(s0(112.0, Vector(Vector(113.0), Vector(114.0), Vector(115.0))))), Vector(Vector(s0(116.0, Vector(Vector(117.0), Vector(118.0), Vector(119.0)))), Vector(s0(120.0, Vector(Vector(121.0), Vector(122.0), Vector(123.0)))), Vector(s0(124.0, Vector(Vector(125.0), Vector(126.0), Vector(127.0))))), Vector(s0(128.0, Vector(Vector(129.0), Vector(130.0), Vector(131.0))), s0(132.0, Vector(Vector(133.0), Vector(134.0), Vector(135.0)))))), Vector(s1(Vector(Vector(s0(136.0, Vector(Vector(137.0), Vector(138.0), Vector(139.0))))), Vector(Vector(s0(140.0, Vector(Vector(141.0), Vector(142.0), Vector(143.0)))), Vector(s0(144.0, Vector(Vector(145.0), Vector(146.0), Vector(147.0))))), Vector(Vector(s0(148.0, Vector(Vector(149.0), Vector(150.0), Vector(151.0)))), Vector(s0(152.0, Vector(Vector(153.0), Vector(154.0), Vector(155.0)))), Vector(s0(156.0, Vector(Vector(157.0), Vector(158.0), Vector(159.0))))), Vector(s0(160.0, Vector(Vector(161.0), Vector(162.0), Vector(163.0))), s0(164.0, Vector(Vector(165.0), Vector(166.0), Vector(167.0)))))), Vector(s1(Vector(Vector(s0(168.0, Vector(Vector(169.0), Vector(170.0), Vector(171.0))))), Vector(Vector(s0(172.0, Vector(Vector(173.0), Vector(174.0), Vector(175.0)))), Vector(s0(176.0, Vector(Vector(177.0), Vector(178.0), Vector(179.0))))), Vector(Vector(s0(180.0, Vector(Vector(181.0), Vector(182.0), Vector(183.0)))), Vector(s0(184.0, Vector(Vector(185.0), Vector(186.0), Vector(187.0)))), Vector(s0(188.0, Vector(Vector(189.0), Vector(190.0), Vector(191.0))))), Vector(s0(192.0, Vector(Vector(193.0), Vector(194.0), Vector(195.0))), s0(196.0, Vector(Vector(197.0), Vector(198.0), Vector(199.0)))))))), s2(Vector(s0(200.0, Vector(Vector(201.0), Vector(202.0), Vector(203.0)))), Vector(Vector(s1(Vector(Vector(s0(204.0, Vector(Vector(205.0), Vector(206.0), Vector(207.0))))), Vector(Vector(s0(208.0, Vector(Vector(209.0), Vector(210.0), Vector(211.0)))), Vector(s0(212.0, Vector(Vector(213.0), Vector(214.0), Vector(215.0))))), Vector(Vector(s0(216.0, Vector(Vector(217.0), Vector(218.0), Vector(219.0)))), Vector(s0(220.0, Vector(Vector(221.0), Vector(222.0), Vector(223.0)))), Vector(s0(224.0, Vector(Vector(225.0), Vector(226.0), Vector(227.0))))), Vector(s0(228.0, Vector(Vector(229.0), Vector(230.0), Vector(231.0))), s0(232.0, Vector(Vector(233.0), Vector(234.0), Vector(235.0)))))), Vector(s1(Vector(Vector(s0(236.0, Vector(Vector(237.0), Vector(238.0), Vector(239.0))))), Vector(Vector(s0(240.0, Vector(Vector(241.0), Vector(242.0), Vector(243.0)))), Vector(s0(244.0, Vector(Vector(245.0), Vector(246.0), Vector(247.0))))), Vector(Vector(s0(248.0, Vector(Vector(249.0), Vector(250.0), Vector(251.0)))), Vector(s0(252.0, Vector(Vector(253.0), Vector(254.0), Vector(255.0)))), Vector(s0(256.0, Vector(Vector(257.0), Vector(258.0), Vector(259.0))))), Vector(s0(260.0, Vector(Vector(261.0), Vector(262.0), Vector(263.0))), s0(264.0, Vector(Vector(265.0), Vector(266.0), Vector(267.0)))))), Vector(s1(Vector(Vector(s0(268.0, Vector(Vector(269.0), Vector(270.0), Vector(271.0))))), Vector(Vector(s0(272.0, Vector(Vector(273.0), Vector(274.0), Vector(275.0)))), Vector(s0(276.0, Vector(Vector(277.0), Vector(278.0), Vector(279.0))))), Vector(Vector(s0(280.0, Vector(Vector(281.0), Vector(282.0), Vector(283.0)))), Vector(s0(284.0, Vector(Vector(285.0), Vector(286.0), Vector(287.0)))), Vector(s0(288.0, Vector(Vector(289.0), Vector(290.0), Vector(291.0))))), Vector(s0(292.0, Vector(Vector(293.0), Vector(294.0), Vector(295.0))), s0(296.0, Vector(Vector(297.0), Vector(298.0), Vector(299.0)))))))))
    val v2: s2 = s2(Vector(s0(300.0, Vector(Vector(301.0), Vector(302.0), Vector(303.0)))), Vector(Vector(s1(Vector(Vector(s0(304.0, Vector(Vector(305.0), Vector(306.0), Vector(307.0))))), Vector(Vector(s0(308.0, Vector(Vector(309.0), Vector(310.0), Vector(311.0)))), Vector(s0(312.0, Vector(Vector(313.0), Vector(314.0), Vector(315.0))))), Vector(Vector(s0(316.0, Vector(Vector(317.0), Vector(318.0), Vector(319.0)))), Vector(s0(320.0, Vector(Vector(321.0), Vector(322.0), Vector(323.0)))), Vector(s0(324.0, Vector(Vector(325.0), Vector(326.0), Vector(327.0))))), Vector(s0(328.0, Vector(Vector(329.0), Vector(330.0), Vector(331.0))), s0(332.0, Vector(Vector(333.0), Vector(334.0), Vector(335.0)))))), Vector(s1(Vector(Vector(s0(336.0, Vector(Vector(337.0), Vector(338.0), Vector(339.0))))), Vector(Vector(s0(340.0, Vector(Vector(341.0), Vector(342.0), Vector(343.0)))), Vector(s0(344.0, Vector(Vector(345.0), Vector(346.0), Vector(347.0))))), Vector(Vector(s0(348.0, Vector(Vector(349.0), Vector(350.0), Vector(351.0)))), Vector(s0(352.0, Vector(Vector(353.0), Vector(354.0), Vector(355.0)))), Vector(s0(356.0, Vector(Vector(357.0), Vector(358.0), Vector(359.0))))), Vector(s0(360.0, Vector(Vector(361.0), Vector(362.0), Vector(363.0))), s0(364.0, Vector(Vector(365.0), Vector(366.0), Vector(367.0)))))), Vector(s1(Vector(Vector(s0(368.0, Vector(Vector(369.0), Vector(370.0), Vector(371.0))))), Vector(Vector(s0(372.0, Vector(Vector(373.0), Vector(374.0), Vector(375.0)))), Vector(s0(376.0, Vector(Vector(377.0), Vector(378.0), Vector(379.0))))), Vector(Vector(s0(380.0, Vector(Vector(381.0), Vector(382.0), Vector(383.0)))), Vector(s0(384.0, Vector(Vector(385.0), Vector(386.0), Vector(387.0)))), Vector(s0(388.0, Vector(Vector(389.0), Vector(390.0), Vector(391.0))))), Vector(s0(392.0, Vector(Vector(393.0), Vector(394.0), Vector(395.0))), s0(396.0, Vector(Vector(397.0), Vector(398.0), Vector(399.0))))))))
    val v3: s1 = s1(Vector(Vector(s0(400.0, Vector(Vector(401.0), Vector(402.0), Vector(403.0))))), Vector(Vector(s0(404.0, Vector(Vector(405.0), Vector(406.0), Vector(407.0)))), Vector(s0(408.0, Vector(Vector(409.0), Vector(410.0), Vector(411.0))))), Vector(Vector(s0(412.0, Vector(Vector(413.0), Vector(414.0), Vector(415.0)))), Vector(s0(416.0, Vector(Vector(417.0), Vector(418.0), Vector(419.0)))), Vector(s0(420.0, Vector(Vector(421.0), Vector(422.0), Vector(423.0))))), Vector(s0(424.0, Vector(Vector(425.0), Vector(426.0), Vector(427.0))), s0(428.0, Vector(Vector(429.0), Vector(430.0), Vector(431.0)))))
    val v4: Double = 432.0
    val start = nanoTime()
    var result: Double = 432.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}