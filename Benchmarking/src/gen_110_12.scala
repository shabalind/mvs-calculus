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
    p1: s0
  )
  case class s3 (
    p0: s2,
    p1: s2
  )
  case class s4 (
    p0: Vector[s0],
    p1: s2
  )
  case class s5 (
    p0: Vector[s1],
    p1: Vector[s2]
  )
  case class s6 (
    p0: s3,
    p1: Vector[Vector[s1]]
  )
  case class s7 (
    p0: Vector[Vector[s5]],
    p1: s0,
    p2: Vector[Vector[s3]],
    p3: s3
  )
  case class s8 (
    p0: s2,
    p1: s4
  )
  case class s9 (
    p0: s1,
    p1: s7,
    p2: s1,
    p3: s8,
    p4: Vector[Vector[s0]],
    p5: s1,
    p6: s4
  )
  case class s11 (
    p0: Vector[s1],
    p1: Vector[s2]
  )
  case class s12 (
    p0: s7,
    p1: Vector[Vector[s2]]
  )
  def f50(v0: Vector[Double]): Vector[Double] = {
    var v3: Vector[Double] = v0
    var v5: Vector[Double] = v0
    val v1: Double = v3(0)
    var v2: Vector[Double] = v3
    var v7: Vector[Double] = v3
    var v4: Double = v1
    val v11: Double = v4 + v4
    v2 = v2.updated(0, v4)
    v7 = v7.updated(0, v11)
    val v12: Double = v5(0)
    var v8: Vector[Double] = v5
    v2 = v2.updated(0, v11)
    v8 = v8.updated(0, v4)
    v3 = v3.updated(0, v4)
    val v18: Vector[Vector[Double]] = Vector(v8, v5, v2)
    v2 = v2.updated(0, v11)
    v7 = v7.updated(0, v11)
    var v28: Vector[Double] = v5
    val v15: Double = v2(0)
    v8 = v8.updated(0, v4)
    val v16: Vector[Double] = v18(2)
    val v24: Vector[Vector[Vector[Double]]] = Vector(v18, v18, v18, v18)
    var v22: Vector[Vector[Vector[Double]]] = v24
    v22 = v22.updated(2, v18)
    val v26: Double = v16(0)
    var v53: Vector[Double] = v0
    var v34: Double = v4
    var v37: Vector[Vector[Vector[Double]]] = v22
    v7 = v7.updated(0, v12)
    v53 = v53.updated(0, v26)
    var v59: Vector[Double] = v28
    val v70: Double = v7(0)
    v2 = v2.updated(0, v34)
    val v143: Double = v59(0)
    val v82: Vector[Vector[Vector[Vector[Double]]]] = Vector(v37, v22, v24, v22, v24)
    var v133: Vector[Vector[Vector[Vector[Double]]]] = v82
    var v57: Double = v12
    var v51: Vector[Vector[Vector[Vector[Double]]]] = v133
    val v42: Double = v53(0)
    v28 = v28.updated(0, v12)
    val v97: Vector[Double] = Vector(v143, v42, v57)
    var v103: Vector[Vector[Vector[Vector[Double]]]] = v51
    val v109: Vector[Vector[Vector[Double]]] = v103(4)
    var v52: Vector[Double] = v59
    v7 = v52
    val v135: Vector[Vector[Double]] = v109(1)
    v5 = v5.updated(0, v70)
    val v212: Vector[Double] = v135(1)
    v5 = v5.updated(0, v15)
    val v171: Double = v97(0)
    v2 = v2.updated(0, v171)
    v212
  }
  def f26(v0: s0): s0 = {
    var v5: s0 = v0
    var v1: s0 = v0
    val v4: Vector[Vector[Double]] = v1.p0
    var v7: s0 = v1
    val v8: Vector[Double] = v4(0)
    var v3: s0 = v1
    v3 = v3.copy(p0 = v4)
    val v2: Vector[Double] = v4(2)
    var v11: Vector[Vector[Double]] = v4
    v3 = v7
    var v6: Vector[Vector[Double]] = v4
    val v15: Vector[Vector[Double]] = v5.p1
    v3 = v3.copy(p1 = v15)
    v5 = v5.copy(p0 = v11)
    var v19: Vector[Vector[Double]] = v15
    v3 = v3.copy(p1 = v19)
    val v13: Vector[Double] = f50(v2)
    v19 = v19.updated(0, v13)
    val v23: Vector[Vector[Double]] = v7.p0
    var v18: s0 = v1
    v3 = v18
    v1 = v7
    val v36: Vector[Double] = f50(v8)
    val v31: Vector[Double] = f50(v36)
    val v30: Vector[Vector[Double]] = v3.p0
    val v20: Vector[Double] = v15(0)
    val v71: Vector[Vector[Double]] = v7.p0
    v19 = v19.updated(0, v13)
    val v25: Vector[Vector[Double]] = v5.p1
    v19 = v19.updated(0, v31)
    v6 = v6.updated(0, v36)
    v5 = v5.copy(p0 = v4)
    v6 = v6.updated(2, v20)
    val v17: Vector[Vector[Double]] = v0.p0
    val v62: Vector[Vector[Double]] = v18.p1
    v5 = v5.copy(p0 = v30)
    val v58: Vector[Double] = v71(2)
    var v50: s0 = v0
    v3 = v3.copy(p1 = v15)
    val v53: Vector[Vector[Double]] = v50.p1
    val v150: s0 = s0(v17, v62)
    v3 = v0
    v5 = v5.copy(p1 = v62)
    v3 = v3.copy(p1 = v25)
    v11 = v11.updated(0, v58)
    v7 = v1
    v1 = v1.copy(p0 = v6)
    v1 = v1.copy(p0 = v11)
    v1 = v1.copy(p1 = v53)
    v50 = v50.copy(p0 = v23)
    v50 = v7
    v150
  }
  @noinline
  def f0(v0: s12, v1: s6, v2: Vector[s5], v3: s9, v4: s11, v5: s0, v6: Double): Double = {
    var v8: s0 = v5
    val v47: s0 = f26(v8)
    val v57: Vector[Vector[Double]] = v47.p0
    val v77: Vector[Double] = v57(1)
    v8 = v8.copy(p0 = v57)
    val v371: Double = v77(0)
    v371
  }
  def benchmark(): Unit = {
    val v0: s12 = s12(s7(Vector(Vector(s5(Vector(s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0))), Vector(s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0)))))), Vector(s2(Vector(Vector(s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0))))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0)))), s2(Vector(Vector(s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0))))), s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0)))), s2(Vector(Vector(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0))))), s0(Vector(Vector(28.0), Vector(29.0), Vector(30.0)), Vector(Vector(31.0))))))), Vector(s5(Vector(s1(s0(Vector(Vector(32.0), Vector(33.0), Vector(34.0)), Vector(Vector(35.0))), Vector(s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0)))))), Vector(s2(Vector(Vector(s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0))))), s0(Vector(Vector(44.0), Vector(45.0), Vector(46.0)), Vector(Vector(47.0)))), s2(Vector(Vector(s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0))))), s0(Vector(Vector(52.0), Vector(53.0), Vector(54.0)), Vector(Vector(55.0)))), s2(Vector(Vector(s0(Vector(Vector(56.0), Vector(57.0), Vector(58.0)), Vector(Vector(59.0))))), s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0)))))))), s0(Vector(Vector(64.0), Vector(65.0), Vector(66.0)), Vector(Vector(67.0))), Vector(Vector(s3(s2(Vector(Vector(s0(Vector(Vector(68.0), Vector(69.0), Vector(70.0)), Vector(Vector(71.0))))), s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)), Vector(Vector(75.0)))), s2(Vector(Vector(s0(Vector(Vector(76.0), Vector(77.0), Vector(78.0)), Vector(Vector(79.0))))), s0(Vector(Vector(80.0), Vector(81.0), Vector(82.0)), Vector(Vector(83.0)))))), Vector(s3(s2(Vector(Vector(s0(Vector(Vector(84.0), Vector(85.0), Vector(86.0)), Vector(Vector(87.0))))), s0(Vector(Vector(88.0), Vector(89.0), Vector(90.0)), Vector(Vector(91.0)))), s2(Vector(Vector(s0(Vector(Vector(92.0), Vector(93.0), Vector(94.0)), Vector(Vector(95.0))))), s0(Vector(Vector(96.0), Vector(97.0), Vector(98.0)), Vector(Vector(99.0)))))), Vector(s3(s2(Vector(Vector(s0(Vector(Vector(100.0), Vector(101.0), Vector(102.0)), Vector(Vector(103.0))))), s0(Vector(Vector(104.0), Vector(105.0), Vector(106.0)), Vector(Vector(107.0)))), s2(Vector(Vector(s0(Vector(Vector(108.0), Vector(109.0), Vector(110.0)), Vector(Vector(111.0))))), s0(Vector(Vector(112.0), Vector(113.0), Vector(114.0)), Vector(Vector(115.0))))))), s3(s2(Vector(Vector(s0(Vector(Vector(116.0), Vector(117.0), Vector(118.0)), Vector(Vector(119.0))))), s0(Vector(Vector(120.0), Vector(121.0), Vector(122.0)), Vector(Vector(123.0)))), s2(Vector(Vector(s0(Vector(Vector(124.0), Vector(125.0), Vector(126.0)), Vector(Vector(127.0))))), s0(Vector(Vector(128.0), Vector(129.0), Vector(130.0)), Vector(Vector(131.0)))))), Vector(Vector(s2(Vector(Vector(s0(Vector(Vector(132.0), Vector(133.0), Vector(134.0)), Vector(Vector(135.0))))), s0(Vector(Vector(136.0), Vector(137.0), Vector(138.0)), Vector(Vector(139.0)))))))
    val v1: s6 = s6(s3(s2(Vector(Vector(s0(Vector(Vector(140.0), Vector(141.0), Vector(142.0)), Vector(Vector(143.0))))), s0(Vector(Vector(144.0), Vector(145.0), Vector(146.0)), Vector(Vector(147.0)))), s2(Vector(Vector(s0(Vector(Vector(148.0), Vector(149.0), Vector(150.0)), Vector(Vector(151.0))))), s0(Vector(Vector(152.0), Vector(153.0), Vector(154.0)), Vector(Vector(155.0))))), Vector(Vector(s1(s0(Vector(Vector(156.0), Vector(157.0), Vector(158.0)), Vector(Vector(159.0))), Vector(s0(Vector(Vector(160.0), Vector(161.0), Vector(162.0)), Vector(Vector(163.0)))))), Vector(s1(s0(Vector(Vector(164.0), Vector(165.0), Vector(166.0)), Vector(Vector(167.0))), Vector(s0(Vector(Vector(168.0), Vector(169.0), Vector(170.0)), Vector(Vector(171.0)))))), Vector(s1(s0(Vector(Vector(172.0), Vector(173.0), Vector(174.0)), Vector(Vector(175.0))), Vector(s0(Vector(Vector(176.0), Vector(177.0), Vector(178.0)), Vector(Vector(179.0))))))))
    val v2: Vector[s5] = Vector(s5(Vector(s1(s0(Vector(Vector(180.0), Vector(181.0), Vector(182.0)), Vector(Vector(183.0))), Vector(s0(Vector(Vector(184.0), Vector(185.0), Vector(186.0)), Vector(Vector(187.0)))))), Vector(s2(Vector(Vector(s0(Vector(Vector(188.0), Vector(189.0), Vector(190.0)), Vector(Vector(191.0))))), s0(Vector(Vector(192.0), Vector(193.0), Vector(194.0)), Vector(Vector(195.0)))), s2(Vector(Vector(s0(Vector(Vector(196.0), Vector(197.0), Vector(198.0)), Vector(Vector(199.0))))), s0(Vector(Vector(200.0), Vector(201.0), Vector(202.0)), Vector(Vector(203.0)))), s2(Vector(Vector(s0(Vector(Vector(204.0), Vector(205.0), Vector(206.0)), Vector(Vector(207.0))))), s0(Vector(Vector(208.0), Vector(209.0), Vector(210.0)), Vector(Vector(211.0)))))), s5(Vector(s1(s0(Vector(Vector(212.0), Vector(213.0), Vector(214.0)), Vector(Vector(215.0))), Vector(s0(Vector(Vector(216.0), Vector(217.0), Vector(218.0)), Vector(Vector(219.0)))))), Vector(s2(Vector(Vector(s0(Vector(Vector(220.0), Vector(221.0), Vector(222.0)), Vector(Vector(223.0))))), s0(Vector(Vector(224.0), Vector(225.0), Vector(226.0)), Vector(Vector(227.0)))), s2(Vector(Vector(s0(Vector(Vector(228.0), Vector(229.0), Vector(230.0)), Vector(Vector(231.0))))), s0(Vector(Vector(232.0), Vector(233.0), Vector(234.0)), Vector(Vector(235.0)))), s2(Vector(Vector(s0(Vector(Vector(236.0), Vector(237.0), Vector(238.0)), Vector(Vector(239.0))))), s0(Vector(Vector(240.0), Vector(241.0), Vector(242.0)), Vector(Vector(243.0)))))), s5(Vector(s1(s0(Vector(Vector(244.0), Vector(245.0), Vector(246.0)), Vector(Vector(247.0))), Vector(s0(Vector(Vector(248.0), Vector(249.0), Vector(250.0)), Vector(Vector(251.0)))))), Vector(s2(Vector(Vector(s0(Vector(Vector(252.0), Vector(253.0), Vector(254.0)), Vector(Vector(255.0))))), s0(Vector(Vector(256.0), Vector(257.0), Vector(258.0)), Vector(Vector(259.0)))), s2(Vector(Vector(s0(Vector(Vector(260.0), Vector(261.0), Vector(262.0)), Vector(Vector(263.0))))), s0(Vector(Vector(264.0), Vector(265.0), Vector(266.0)), Vector(Vector(267.0)))), s2(Vector(Vector(s0(Vector(Vector(268.0), Vector(269.0), Vector(270.0)), Vector(Vector(271.0))))), s0(Vector(Vector(272.0), Vector(273.0), Vector(274.0)), Vector(Vector(275.0)))))))
    val v3: s9 = s9(s1(s0(Vector(Vector(276.0), Vector(277.0), Vector(278.0)), Vector(Vector(279.0))), Vector(s0(Vector(Vector(280.0), Vector(281.0), Vector(282.0)), Vector(Vector(283.0))))), s7(Vector(Vector(s5(Vector(s1(s0(Vector(Vector(284.0), Vector(285.0), Vector(286.0)), Vector(Vector(287.0))), Vector(s0(Vector(Vector(288.0), Vector(289.0), Vector(290.0)), Vector(Vector(291.0)))))), Vector(s2(Vector(Vector(s0(Vector(Vector(292.0), Vector(293.0), Vector(294.0)), Vector(Vector(295.0))))), s0(Vector(Vector(296.0), Vector(297.0), Vector(298.0)), Vector(Vector(299.0)))), s2(Vector(Vector(s0(Vector(Vector(300.0), Vector(301.0), Vector(302.0)), Vector(Vector(303.0))))), s0(Vector(Vector(304.0), Vector(305.0), Vector(306.0)), Vector(Vector(307.0)))), s2(Vector(Vector(s0(Vector(Vector(308.0), Vector(309.0), Vector(310.0)), Vector(Vector(311.0))))), s0(Vector(Vector(312.0), Vector(313.0), Vector(314.0)), Vector(Vector(315.0))))))), Vector(s5(Vector(s1(s0(Vector(Vector(316.0), Vector(317.0), Vector(318.0)), Vector(Vector(319.0))), Vector(s0(Vector(Vector(320.0), Vector(321.0), Vector(322.0)), Vector(Vector(323.0)))))), Vector(s2(Vector(Vector(s0(Vector(Vector(324.0), Vector(325.0), Vector(326.0)), Vector(Vector(327.0))))), s0(Vector(Vector(328.0), Vector(329.0), Vector(330.0)), Vector(Vector(331.0)))), s2(Vector(Vector(s0(Vector(Vector(332.0), Vector(333.0), Vector(334.0)), Vector(Vector(335.0))))), s0(Vector(Vector(336.0), Vector(337.0), Vector(338.0)), Vector(Vector(339.0)))), s2(Vector(Vector(s0(Vector(Vector(340.0), Vector(341.0), Vector(342.0)), Vector(Vector(343.0))))), s0(Vector(Vector(344.0), Vector(345.0), Vector(346.0)), Vector(Vector(347.0)))))))), s0(Vector(Vector(348.0), Vector(349.0), Vector(350.0)), Vector(Vector(351.0))), Vector(Vector(s3(s2(Vector(Vector(s0(Vector(Vector(352.0), Vector(353.0), Vector(354.0)), Vector(Vector(355.0))))), s0(Vector(Vector(356.0), Vector(357.0), Vector(358.0)), Vector(Vector(359.0)))), s2(Vector(Vector(s0(Vector(Vector(360.0), Vector(361.0), Vector(362.0)), Vector(Vector(363.0))))), s0(Vector(Vector(364.0), Vector(365.0), Vector(366.0)), Vector(Vector(367.0)))))), Vector(s3(s2(Vector(Vector(s0(Vector(Vector(368.0), Vector(369.0), Vector(370.0)), Vector(Vector(371.0))))), s0(Vector(Vector(372.0), Vector(373.0), Vector(374.0)), Vector(Vector(375.0)))), s2(Vector(Vector(s0(Vector(Vector(376.0), Vector(377.0), Vector(378.0)), Vector(Vector(379.0))))), s0(Vector(Vector(380.0), Vector(381.0), Vector(382.0)), Vector(Vector(383.0)))))), Vector(s3(s2(Vector(Vector(s0(Vector(Vector(384.0), Vector(385.0), Vector(386.0)), Vector(Vector(387.0))))), s0(Vector(Vector(388.0), Vector(389.0), Vector(390.0)), Vector(Vector(391.0)))), s2(Vector(Vector(s0(Vector(Vector(392.0), Vector(393.0), Vector(394.0)), Vector(Vector(395.0))))), s0(Vector(Vector(396.0), Vector(397.0), Vector(398.0)), Vector(Vector(399.0))))))), s3(s2(Vector(Vector(s0(Vector(Vector(400.0), Vector(401.0), Vector(402.0)), Vector(Vector(403.0))))), s0(Vector(Vector(404.0), Vector(405.0), Vector(406.0)), Vector(Vector(407.0)))), s2(Vector(Vector(s0(Vector(Vector(408.0), Vector(409.0), Vector(410.0)), Vector(Vector(411.0))))), s0(Vector(Vector(412.0), Vector(413.0), Vector(414.0)), Vector(Vector(415.0)))))), s1(s0(Vector(Vector(416.0), Vector(417.0), Vector(418.0)), Vector(Vector(419.0))), Vector(s0(Vector(Vector(420.0), Vector(421.0), Vector(422.0)), Vector(Vector(423.0))))), s8(s2(Vector(Vector(s0(Vector(Vector(424.0), Vector(425.0), Vector(426.0)), Vector(Vector(427.0))))), s0(Vector(Vector(428.0), Vector(429.0), Vector(430.0)), Vector(Vector(431.0)))), s4(Vector(s0(Vector(Vector(432.0), Vector(433.0), Vector(434.0)), Vector(Vector(435.0))), s0(Vector(Vector(436.0), Vector(437.0), Vector(438.0)), Vector(Vector(439.0)))), s2(Vector(Vector(s0(Vector(Vector(440.0), Vector(441.0), Vector(442.0)), Vector(Vector(443.0))))), s0(Vector(Vector(444.0), Vector(445.0), Vector(446.0)), Vector(Vector(447.0)))))), Vector(Vector(s0(Vector(Vector(448.0), Vector(449.0), Vector(450.0)), Vector(Vector(451.0))))), s1(s0(Vector(Vector(452.0), Vector(453.0), Vector(454.0)), Vector(Vector(455.0))), Vector(s0(Vector(Vector(456.0), Vector(457.0), Vector(458.0)), Vector(Vector(459.0))))), s4(Vector(s0(Vector(Vector(460.0), Vector(461.0), Vector(462.0)), Vector(Vector(463.0))), s0(Vector(Vector(464.0), Vector(465.0), Vector(466.0)), Vector(Vector(467.0)))), s2(Vector(Vector(s0(Vector(Vector(468.0), Vector(469.0), Vector(470.0)), Vector(Vector(471.0))))), s0(Vector(Vector(472.0), Vector(473.0), Vector(474.0)), Vector(Vector(475.0))))))
    val v4: s11 = s11(Vector(s1(s0(Vector(Vector(476.0), Vector(477.0), Vector(478.0)), Vector(Vector(479.0))), Vector(s0(Vector(Vector(480.0), Vector(481.0), Vector(482.0)), Vector(Vector(483.0)))))), Vector(s2(Vector(Vector(s0(Vector(Vector(484.0), Vector(485.0), Vector(486.0)), Vector(Vector(487.0))))), s0(Vector(Vector(488.0), Vector(489.0), Vector(490.0)), Vector(Vector(491.0))))))
    val v5: s0 = s0(Vector(Vector(492.0), Vector(493.0), Vector(494.0)), Vector(Vector(495.0)))
    val v6: Double = 496.0
    val start = nanoTime()
    var result: Double = 496.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4, v5, v6)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}