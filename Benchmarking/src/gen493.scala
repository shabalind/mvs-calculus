import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: Vector[s0]
  )
  case class s2 (
    p0: Vector[s0],
    p1: Vector[s1]
  )
  case class s3 (
    p0: s0,
    p1: Vector[s2]
  )
  case class s8 (
    p0: Vector[s0],
    p1: Vector[Vector[s2]],
    p2: s2,
    p3: s1,
    p4: Vector[Vector[s2]]
  )
  def f94(v0: s0): s0 = {
    val v7: Vector[Vector[Double]] = v0.p0
    val v2: Vector[Double] = v7(2)
    val v1: Vector[Vector[Double]] = v0.p1
    val v8: Double = v2(0)
    val v9: Double = v2(0)
    val v13: Vector[Double] = v1(1)
    val v5: Vector[Double] = v1(0)
    val v3: Vector[Vector[Double]] = v0.p0
    val v10: Double = v2(0)
    val v6: Vector[Vector[Double]] = v0.p0
    val v12: Vector[Vector[Double]] = v0.p1
    var v11: s0 = v0
    val v30: Vector[Vector[Double]] = v11.p0
    val v16: Double = v5(0)
    val v19: Vector[Vector[Double]] = v11.p0
    var v29: Vector[Vector[Double]] = v6
    val v18: Vector[Vector[Double]] = v11.p1
    val v17: Vector[Vector[Double]] = v0.p1
    var v24: Vector[Vector[Double]] = v1
    val v40: Vector[Vector[Double]] = v0.p1
    v11 = v11.copy(p1 = v17)
    val v22: Vector[Vector[Double]] = v0.p1
    val v34: Vector[Double] = v22(0)
    v29 = v29.updated(2, v5)
    val v20: Vector[Double] = v22(1)
    var v37: s0 = v0
    val v21: Vector[Double] = v17(1)
    v11 = v11.copy(p1 = v40)
    v37 = v37.copy(p1 = v1)
    val v36: Double = v10 * v10
    val v23: Vector[Vector[Double]] = v11.p0
    val v49: Vector[Double] = Vector(v8, v9, v16)
    v11 = v11.copy(p1 = v18)
    v11 = v11.copy(p0 = v19)
    val v78: Double = v49(2)
    v11 = v11.copy(p1 = v1)
    val v68: Double = v49(1)
    var v35: Vector[Vector[Double]] = v40
    val v43: Vector[Double] = v23(0)
    v11 = v11.copy(p1 = v35)
    v35 = v35.updated(0, v34)
    v24 = v24.updated(0, v43)
    v11 = v11.copy(p0 = v19)
    v37 = v37.copy(p0 = v29)
    v29 = v29.updated(1, v43)
    v11 = v11.copy(p0 = v30)
    v11 = v11.copy(p1 = v1)
    v35 = v35.updated(1, v20)
    v35 = v35.updated(1, v2)
    v37 = v37.copy(p0 = v19)
    val v125: Vector[Vector[Double]] = v37.p0
    v11 = v11.copy(p1 = v40)
    val v45: Vector[Vector[Double]] = v0.p1
    v29 = v29.updated(2, v13)
    val v66: Vector[Double] = v24(1)
    val v90: s0 = s0(v3, v45)
    v24 = v24.updated(1, v5)
    val v70: Vector[Vector[Double]] = v37.p1
    var v114: Vector[Double] = v66
    val v54: Vector[Double] = v70(1)
    v114 = v114.updated(0, v78)
    var v110: s0 = v90
    v35 = v35.updated(0, v21)
    v114 = v114.updated(0, v36)
    v29 = v29.updated(2, v114)
    v110 = v110.copy(p1 = v12)
    v110 = v110.copy(p0 = v23)
    var v130: s0 = v110
    v24 = v24.updated(1, v54)
    v130 = v130.copy(p0 = v125)
    v114 = v114.updated(0, v68)
    v130
  }
  def f92(v0: s2): s2 = {
    val v6: Vector[s2] = Vector(v0, v0, v0, v0)
    var v5: Vector[s2] = v6
    var v2: Vector[s2] = v6
    val v8: s2 = v5(0)
    val v11: s2 = v5(0)
    v2 = v2.updated(0, v0)
    var v3: s2 = v8
    var v7: Vector[s2] = v6
    val v4: Vector[s1] = v11.p1
    val v12: s2 = v5(1)
    val v13: Vector[s0] = v12.p0
    val v33: s2 = s2(v13, v4)
    var v1: Vector[s0] = v13
    v3 = v3.copy(p1 = v4)
    var v17: Vector[s1] = v4
    var v15: s2 = v3
    var v14: Vector[s0] = v13
    v3 = v3.copy(p1 = v4)
    val v24: Vector[s1] = v3.p1
    var v10: Vector[s0] = v1
    v3 = v3.copy(p1 = v17)
    val v20: s2 = s2(v10, v17)
    v15 = v15.copy(p0 = v13)
    val v35: Vector[s0] = v3.p0
    val v22: Vector[s0] = v33.p0
    v3 = v3.copy(p0 = v1)
    val v23: s2 = v6(3)
    v2 = v2.updated(3, v20)
    val v65: s0 = v1(1)
    val v41: s2 = v7(3)
    var v34: Vector[s0] = v1
    v10 = v10.updated(2, v65)
    v1 = v1.updated(1, v65)
    val v50: s0 = f94(v65)
    val v44: Vector[Vector[Double]] = v65.p1
    v3 = v3.copy(p0 = v13)
    val v26: s0 = f94(v50)
    val v99: s0 = f94(v65)
    v15 = v15.copy(p0 = v22)
    v3 = v3.copy(p0 = v34)
    val v72: s0 = v1(1)
    v34 = v34.updated(2, v26)
    v7 = v7.updated(3, v23)
    val v48: s0 = f94(v50)
    v10 = v10.updated(0, v48)
    val v40: Vector[s0] = Vector(v65, v99, v72, v48, v72)
    v3 = v15
    var v39: s2 = v12
    v3 = v3.copy(p0 = v35)
    val v114: s2 = v5(3)
    val v73: s0 = v40(4)
    v14 = v14.updated(0, v73)
    val v86: Vector[s1] = v41.p1
    v3 = v3.copy(p0 = v14)
    v15 = v15.copy(p1 = v4)
    var v83: s0 = v50
    val v60: s2 = v2(2)
    val v147: Vector[s0] = v20.p0
    v2 = v2.updated(0, v15)
    v83 = v83.copy(p1 = v44)
    v34 = v147
    v10 = v10.updated(1, v83)
    v3 = v3.copy(p1 = v24)
    v15 = v15.copy(p1 = v17)
    v7 = v7.updated(2, v60)
    v5 = v5.updated(0, v114)
    v2 = v2.updated(1, v39)
    v15 = v15.copy(p1 = v86)
    v15
  }
  @noinline
  def f0(v0: s8, v1: s3, v2: Double): Double = {
    val v5: Vector[s2] = v1.p1
    var v11: s8 = v0
    val v15: s2 = v5(0)
    val v6: s2 = f92(v15)
    val v9: s2 = v5(0)
    var v34: s2 = v9
    v11 = v11.copy(p2 = v34)
    val v12: Vector[s0] = v11.p0
    v11 = v11.copy(p0 = v12)
    val v23: Vector[s0] = v6.p0
    var v90: Vector[s0] = v23
    v11 = v11.copy(p0 = v12)
    val v25: s0 = v90(2)
    val v46: s0 = v12(0)
    val v28: Vector[Vector[Double]] = v25.p0
    val v96: Vector[Double] = v28(1)
    v34 = v34.copy(p0 = v90)
    v90 = v90.updated(1, v46)
    val v62: Double = v96(0)
    v62
  }
  def benchmark(): Unit = {
    val v0: s8 = s8(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0))), s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0)))), Vector(Vector(s2(Vector(s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0))), s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0))), s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0), Vector(24.0)))), Vector(s1(Vector(Vector(s0(Vector(Vector(25.0), Vector(26.0), Vector(27.0)), Vector(Vector(28.0), Vector(29.0)))), Vector(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0)))), Vector(s0(Vector(Vector(35.0), Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0))))), Vector(s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0), Vector(44.0))), s0(Vector(Vector(45.0), Vector(46.0), Vector(47.0)), Vector(Vector(48.0), Vector(49.0))), s0(Vector(Vector(50.0), Vector(51.0), Vector(52.0)), Vector(Vector(53.0), Vector(54.0))))), s1(Vector(Vector(s0(Vector(Vector(55.0), Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0)))), Vector(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0), Vector(64.0)))), Vector(s0(Vector(Vector(65.0), Vector(66.0), Vector(67.0)), Vector(Vector(68.0), Vector(69.0))))), Vector(s0(Vector(Vector(70.0), Vector(71.0), Vector(72.0)), Vector(Vector(73.0), Vector(74.0))), s0(Vector(Vector(75.0), Vector(76.0), Vector(77.0)), Vector(Vector(78.0), Vector(79.0))), s0(Vector(Vector(80.0), Vector(81.0), Vector(82.0)), Vector(Vector(83.0), Vector(84.0))))))))), s2(Vector(s0(Vector(Vector(85.0), Vector(86.0), Vector(87.0)), Vector(Vector(88.0), Vector(89.0))), s0(Vector(Vector(90.0), Vector(91.0), Vector(92.0)), Vector(Vector(93.0), Vector(94.0))), s0(Vector(Vector(95.0), Vector(96.0), Vector(97.0)), Vector(Vector(98.0), Vector(99.0)))), Vector(s1(Vector(Vector(s0(Vector(Vector(100.0), Vector(101.0), Vector(102.0)), Vector(Vector(103.0), Vector(104.0)))), Vector(s0(Vector(Vector(105.0), Vector(106.0), Vector(107.0)), Vector(Vector(108.0), Vector(109.0)))), Vector(s0(Vector(Vector(110.0), Vector(111.0), Vector(112.0)), Vector(Vector(113.0), Vector(114.0))))), Vector(s0(Vector(Vector(115.0), Vector(116.0), Vector(117.0)), Vector(Vector(118.0), Vector(119.0))), s0(Vector(Vector(120.0), Vector(121.0), Vector(122.0)), Vector(Vector(123.0), Vector(124.0))), s0(Vector(Vector(125.0), Vector(126.0), Vector(127.0)), Vector(Vector(128.0), Vector(129.0))))), s1(Vector(Vector(s0(Vector(Vector(130.0), Vector(131.0), Vector(132.0)), Vector(Vector(133.0), Vector(134.0)))), Vector(s0(Vector(Vector(135.0), Vector(136.0), Vector(137.0)), Vector(Vector(138.0), Vector(139.0)))), Vector(s0(Vector(Vector(140.0), Vector(141.0), Vector(142.0)), Vector(Vector(143.0), Vector(144.0))))), Vector(s0(Vector(Vector(145.0), Vector(146.0), Vector(147.0)), Vector(Vector(148.0), Vector(149.0))), s0(Vector(Vector(150.0), Vector(151.0), Vector(152.0)), Vector(Vector(153.0), Vector(154.0))), s0(Vector(Vector(155.0), Vector(156.0), Vector(157.0)), Vector(Vector(158.0), Vector(159.0))))))), s1(Vector(Vector(s0(Vector(Vector(160.0), Vector(161.0), Vector(162.0)), Vector(Vector(163.0), Vector(164.0)))), Vector(s0(Vector(Vector(165.0), Vector(166.0), Vector(167.0)), Vector(Vector(168.0), Vector(169.0)))), Vector(s0(Vector(Vector(170.0), Vector(171.0), Vector(172.0)), Vector(Vector(173.0), Vector(174.0))))), Vector(s0(Vector(Vector(175.0), Vector(176.0), Vector(177.0)), Vector(Vector(178.0), Vector(179.0))), s0(Vector(Vector(180.0), Vector(181.0), Vector(182.0)), Vector(Vector(183.0), Vector(184.0))), s0(Vector(Vector(185.0), Vector(186.0), Vector(187.0)), Vector(Vector(188.0), Vector(189.0))))), Vector(Vector(s2(Vector(s0(Vector(Vector(190.0), Vector(191.0), Vector(192.0)), Vector(Vector(193.0), Vector(194.0))), s0(Vector(Vector(195.0), Vector(196.0), Vector(197.0)), Vector(Vector(198.0), Vector(199.0))), s0(Vector(Vector(200.0), Vector(201.0), Vector(202.0)), Vector(Vector(203.0), Vector(204.0)))), Vector(s1(Vector(Vector(s0(Vector(Vector(205.0), Vector(206.0), Vector(207.0)), Vector(Vector(208.0), Vector(209.0)))), Vector(s0(Vector(Vector(210.0), Vector(211.0), Vector(212.0)), Vector(Vector(213.0), Vector(214.0)))), Vector(s0(Vector(Vector(215.0), Vector(216.0), Vector(217.0)), Vector(Vector(218.0), Vector(219.0))))), Vector(s0(Vector(Vector(220.0), Vector(221.0), Vector(222.0)), Vector(Vector(223.0), Vector(224.0))), s0(Vector(Vector(225.0), Vector(226.0), Vector(227.0)), Vector(Vector(228.0), Vector(229.0))), s0(Vector(Vector(230.0), Vector(231.0), Vector(232.0)), Vector(Vector(233.0), Vector(234.0))))), s1(Vector(Vector(s0(Vector(Vector(235.0), Vector(236.0), Vector(237.0)), Vector(Vector(238.0), Vector(239.0)))), Vector(s0(Vector(Vector(240.0), Vector(241.0), Vector(242.0)), Vector(Vector(243.0), Vector(244.0)))), Vector(s0(Vector(Vector(245.0), Vector(246.0), Vector(247.0)), Vector(Vector(248.0), Vector(249.0))))), Vector(s0(Vector(Vector(250.0), Vector(251.0), Vector(252.0)), Vector(Vector(253.0), Vector(254.0))), s0(Vector(Vector(255.0), Vector(256.0), Vector(257.0)), Vector(Vector(258.0), Vector(259.0))), s0(Vector(Vector(260.0), Vector(261.0), Vector(262.0)), Vector(Vector(263.0), Vector(264.0)))))))), Vector(s2(Vector(s0(Vector(Vector(265.0), Vector(266.0), Vector(267.0)), Vector(Vector(268.0), Vector(269.0))), s0(Vector(Vector(270.0), Vector(271.0), Vector(272.0)), Vector(Vector(273.0), Vector(274.0))), s0(Vector(Vector(275.0), Vector(276.0), Vector(277.0)), Vector(Vector(278.0), Vector(279.0)))), Vector(s1(Vector(Vector(s0(Vector(Vector(280.0), Vector(281.0), Vector(282.0)), Vector(Vector(283.0), Vector(284.0)))), Vector(s0(Vector(Vector(285.0), Vector(286.0), Vector(287.0)), Vector(Vector(288.0), Vector(289.0)))), Vector(s0(Vector(Vector(290.0), Vector(291.0), Vector(292.0)), Vector(Vector(293.0), Vector(294.0))))), Vector(s0(Vector(Vector(295.0), Vector(296.0), Vector(297.0)), Vector(Vector(298.0), Vector(299.0))), s0(Vector(Vector(300.0), Vector(301.0), Vector(302.0)), Vector(Vector(303.0), Vector(304.0))), s0(Vector(Vector(305.0), Vector(306.0), Vector(307.0)), Vector(Vector(308.0), Vector(309.0))))), s1(Vector(Vector(s0(Vector(Vector(310.0), Vector(311.0), Vector(312.0)), Vector(Vector(313.0), Vector(314.0)))), Vector(s0(Vector(Vector(315.0), Vector(316.0), Vector(317.0)), Vector(Vector(318.0), Vector(319.0)))), Vector(s0(Vector(Vector(320.0), Vector(321.0), Vector(322.0)), Vector(Vector(323.0), Vector(324.0))))), Vector(s0(Vector(Vector(325.0), Vector(326.0), Vector(327.0)), Vector(Vector(328.0), Vector(329.0))), s0(Vector(Vector(330.0), Vector(331.0), Vector(332.0)), Vector(Vector(333.0), Vector(334.0))), s0(Vector(Vector(335.0), Vector(336.0), Vector(337.0)), Vector(Vector(338.0), Vector(339.0)))))))), Vector(s2(Vector(s0(Vector(Vector(340.0), Vector(341.0), Vector(342.0)), Vector(Vector(343.0), Vector(344.0))), s0(Vector(Vector(345.0), Vector(346.0), Vector(347.0)), Vector(Vector(348.0), Vector(349.0))), s0(Vector(Vector(350.0), Vector(351.0), Vector(352.0)), Vector(Vector(353.0), Vector(354.0)))), Vector(s1(Vector(Vector(s0(Vector(Vector(355.0), Vector(356.0), Vector(357.0)), Vector(Vector(358.0), Vector(359.0)))), Vector(s0(Vector(Vector(360.0), Vector(361.0), Vector(362.0)), Vector(Vector(363.0), Vector(364.0)))), Vector(s0(Vector(Vector(365.0), Vector(366.0), Vector(367.0)), Vector(Vector(368.0), Vector(369.0))))), Vector(s0(Vector(Vector(370.0), Vector(371.0), Vector(372.0)), Vector(Vector(373.0), Vector(374.0))), s0(Vector(Vector(375.0), Vector(376.0), Vector(377.0)), Vector(Vector(378.0), Vector(379.0))), s0(Vector(Vector(380.0), Vector(381.0), Vector(382.0)), Vector(Vector(383.0), Vector(384.0))))), s1(Vector(Vector(s0(Vector(Vector(385.0), Vector(386.0), Vector(387.0)), Vector(Vector(388.0), Vector(389.0)))), Vector(s0(Vector(Vector(390.0), Vector(391.0), Vector(392.0)), Vector(Vector(393.0), Vector(394.0)))), Vector(s0(Vector(Vector(395.0), Vector(396.0), Vector(397.0)), Vector(Vector(398.0), Vector(399.0))))), Vector(s0(Vector(Vector(400.0), Vector(401.0), Vector(402.0)), Vector(Vector(403.0), Vector(404.0))), s0(Vector(Vector(405.0), Vector(406.0), Vector(407.0)), Vector(Vector(408.0), Vector(409.0))), s0(Vector(Vector(410.0), Vector(411.0), Vector(412.0)), Vector(Vector(413.0), Vector(414.0))))))))))
    val v1: s3 = s3(s0(Vector(Vector(415.0), Vector(416.0), Vector(417.0)), Vector(Vector(418.0), Vector(419.0))), Vector(s2(Vector(s0(Vector(Vector(420.0), Vector(421.0), Vector(422.0)), Vector(Vector(423.0), Vector(424.0))), s0(Vector(Vector(425.0), Vector(426.0), Vector(427.0)), Vector(Vector(428.0), Vector(429.0))), s0(Vector(Vector(430.0), Vector(431.0), Vector(432.0)), Vector(Vector(433.0), Vector(434.0)))), Vector(s1(Vector(Vector(s0(Vector(Vector(435.0), Vector(436.0), Vector(437.0)), Vector(Vector(438.0), Vector(439.0)))), Vector(s0(Vector(Vector(440.0), Vector(441.0), Vector(442.0)), Vector(Vector(443.0), Vector(444.0)))), Vector(s0(Vector(Vector(445.0), Vector(446.0), Vector(447.0)), Vector(Vector(448.0), Vector(449.0))))), Vector(s0(Vector(Vector(450.0), Vector(451.0), Vector(452.0)), Vector(Vector(453.0), Vector(454.0))), s0(Vector(Vector(455.0), Vector(456.0), Vector(457.0)), Vector(Vector(458.0), Vector(459.0))), s0(Vector(Vector(460.0), Vector(461.0), Vector(462.0)), Vector(Vector(463.0), Vector(464.0))))), s1(Vector(Vector(s0(Vector(Vector(465.0), Vector(466.0), Vector(467.0)), Vector(Vector(468.0), Vector(469.0)))), Vector(s0(Vector(Vector(470.0), Vector(471.0), Vector(472.0)), Vector(Vector(473.0), Vector(474.0)))), Vector(s0(Vector(Vector(475.0), Vector(476.0), Vector(477.0)), Vector(Vector(478.0), Vector(479.0))))), Vector(s0(Vector(Vector(480.0), Vector(481.0), Vector(482.0)), Vector(Vector(483.0), Vector(484.0))), s0(Vector(Vector(485.0), Vector(486.0), Vector(487.0)), Vector(Vector(488.0), Vector(489.0))), s0(Vector(Vector(490.0), Vector(491.0), Vector(492.0)), Vector(Vector(493.0), Vector(494.0)))))))))
    val v2: Double = 495.0
    val start = nanoTime()
    var result: Double = 495.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}