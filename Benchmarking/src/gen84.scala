import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Double],
    p3: Vector[Vector[Double]],
    p4: Vector[Vector[Double]],
    p5: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[Vector[s0]]
  )
  case class s2 (
    p0: s1
  )
  case class s3 (
    p0: Vector[s1],
    p1: Vector[s2],
    p2: s2
  )
  def f15(v0: Double): Double = {
    val v6: Vector[Double] = Vector(v0, v0, v0, v0, v0, v0, v0)
    var v8: Vector[Double] = v6
    var v7: Vector[Double] = v6
    v8 = v8.updated(1, v0)
    val v5: Double = v7(0)
    v8 = v8.updated(6, v0)
    val v9: Double = v8(3)
    var v4: Vector[Double] = v8
    var v12: Double = v5
    val v2: Double = v7(1)
    val v10: Double = v4(5)
    v4 = v4.updated(4, v2)
    val v11: Double = v8(0)
    val v15: Double = v6(3)
    var v38: Vector[Double] = v7
    val v17: Double = v7(6)
    val v14: Double = v4(1)
    var v29: Vector[Double] = v38
    val v31: Double = v7(1)
    v29 = v29.updated(2, v12)
    v7 = v7.updated(5, v11)
    v7 = v7.updated(6, v10)
    val v13: Double = v8(5)
    var v16: Double = v2
    var v24: Double = v10
    val v43: Vector[Double] = Vector(v31, v24, v17)
    var v33: Vector[Double] = v43
    val v39: Double = v29(2)
    val v42: Double = v4(4)
    var v27: Vector[Double] = v33
    val v34: Double = v27(0)
    var v48: Double = v34
    v27 = v33
    var v37: Double = v34
    var v90: Vector[Double] = v43
    val v35: Vector[Double] = Vector(v14, v48, v16, v2)
    v8 = v8.updated(1, v39)
    v7 = v7.updated(1, v24)
    var v61: Vector[Double] = v35
    val v32: Double = v33(0)
    val v63: Double = v90(0)
    var v74: Vector[Double] = v61
    v8 = v8.updated(1, v16)
    v29 = v29.updated(5, v42)
    val v75: Double = v61(2)
    v74 = v74.updated(3, v63)
    var v82: Vector[Double] = v74
    var v76: Vector[Double] = v33
    v38 = v38.updated(4, v75)
    v74 = v74.updated(0, v32)
    v33 = v33.updated(2, v13)
    v33 = v33.updated(0, v15)
    v82 = v82.updated(3, v37)
    var v128: Vector[Double] = v82
    var v237: Vector[Double] = v128
    val v351: Double = v76(2)
    var v204: Double = v63
    v237 = v237.updated(2, v351)
    val v102: Double = v237(0)
    v76 = v76.updated(1, v204)
    v33 = v33.updated(0, v9)
    v102
  }
  @noinline
  def f0(v0: Vector[s3], v1: s3, v2: Double): Double = {
    val v4: Vector[s1] = v1.p0
    val v10: s1 = v4(0)
    val v6: Double = v2 / v2
    val v3: Vector[Vector[s0]] = v10.p1
    val v11: Double = f15(v6)
    val v27: Vector[s0] = v3(0)
    var v36: Double = v2
    val v44: s0 = v27(0)
    val v108: Vector[Double] = v44.p2
    val v125: Double = v11 * v36
    var v85: Vector[Double] = v108
    val v96: Double = v85(0)
    v85 = v85.updated(0, v125)
    val v426: Double = v36 * v96
    v426
  }
  def benchmark(): Unit = {
    val v0: Vector[s3] = Vector(s3(Vector(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0)), Vector(3.0, 4.0), Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0), Vector(12.0)))), Vector(Vector(s0(Vector(Vector(13.0), Vector(14.0)), Vector(Vector(15.0)), Vector(16.0, 17.0), Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0), Vector(24.0), Vector(25.0)))))), s1(Vector(s0(Vector(Vector(26.0), Vector(27.0)), Vector(Vector(28.0)), Vector(29.0, 30.0), Vector(Vector(31.0), Vector(32.0), Vector(33.0)), Vector(Vector(34.0), Vector(35.0)), Vector(Vector(36.0), Vector(37.0), Vector(38.0)))), Vector(Vector(s0(Vector(Vector(39.0), Vector(40.0)), Vector(Vector(41.0)), Vector(42.0, 43.0), Vector(Vector(44.0), Vector(45.0), Vector(46.0)), Vector(Vector(47.0), Vector(48.0)), Vector(Vector(49.0), Vector(50.0), Vector(51.0))))))), Vector(s2(s1(Vector(s0(Vector(Vector(52.0), Vector(53.0)), Vector(Vector(54.0)), Vector(55.0, 56.0), Vector(Vector(57.0), Vector(58.0), Vector(59.0)), Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0), Vector(63.0), Vector(64.0)))), Vector(Vector(s0(Vector(Vector(65.0), Vector(66.0)), Vector(Vector(67.0)), Vector(68.0, 69.0), Vector(Vector(70.0), Vector(71.0), Vector(72.0)), Vector(Vector(73.0), Vector(74.0)), Vector(Vector(75.0), Vector(76.0), Vector(77.0))))))), s2(s1(Vector(s0(Vector(Vector(78.0), Vector(79.0)), Vector(Vector(80.0)), Vector(81.0, 82.0), Vector(Vector(83.0), Vector(84.0), Vector(85.0)), Vector(Vector(86.0), Vector(87.0)), Vector(Vector(88.0), Vector(89.0), Vector(90.0)))), Vector(Vector(s0(Vector(Vector(91.0), Vector(92.0)), Vector(Vector(93.0)), Vector(94.0, 95.0), Vector(Vector(96.0), Vector(97.0), Vector(98.0)), Vector(Vector(99.0), Vector(100.0)), Vector(Vector(101.0), Vector(102.0), Vector(103.0))))))), s2(s1(Vector(s0(Vector(Vector(104.0), Vector(105.0)), Vector(Vector(106.0)), Vector(107.0, 108.0), Vector(Vector(109.0), Vector(110.0), Vector(111.0)), Vector(Vector(112.0), Vector(113.0)), Vector(Vector(114.0), Vector(115.0), Vector(116.0)))), Vector(Vector(s0(Vector(Vector(117.0), Vector(118.0)), Vector(Vector(119.0)), Vector(120.0, 121.0), Vector(Vector(122.0), Vector(123.0), Vector(124.0)), Vector(Vector(125.0), Vector(126.0)), Vector(Vector(127.0), Vector(128.0), Vector(129.0)))))))), s2(s1(Vector(s0(Vector(Vector(130.0), Vector(131.0)), Vector(Vector(132.0)), Vector(133.0, 134.0), Vector(Vector(135.0), Vector(136.0), Vector(137.0)), Vector(Vector(138.0), Vector(139.0)), Vector(Vector(140.0), Vector(141.0), Vector(142.0)))), Vector(Vector(s0(Vector(Vector(143.0), Vector(144.0)), Vector(Vector(145.0)), Vector(146.0, 147.0), Vector(Vector(148.0), Vector(149.0), Vector(150.0)), Vector(Vector(151.0), Vector(152.0)), Vector(Vector(153.0), Vector(154.0), Vector(155.0)))))))), s3(Vector(s1(Vector(s0(Vector(Vector(156.0), Vector(157.0)), Vector(Vector(158.0)), Vector(159.0, 160.0), Vector(Vector(161.0), Vector(162.0), Vector(163.0)), Vector(Vector(164.0), Vector(165.0)), Vector(Vector(166.0), Vector(167.0), Vector(168.0)))), Vector(Vector(s0(Vector(Vector(169.0), Vector(170.0)), Vector(Vector(171.0)), Vector(172.0, 173.0), Vector(Vector(174.0), Vector(175.0), Vector(176.0)), Vector(Vector(177.0), Vector(178.0)), Vector(Vector(179.0), Vector(180.0), Vector(181.0)))))), s1(Vector(s0(Vector(Vector(182.0), Vector(183.0)), Vector(Vector(184.0)), Vector(185.0, 186.0), Vector(Vector(187.0), Vector(188.0), Vector(189.0)), Vector(Vector(190.0), Vector(191.0)), Vector(Vector(192.0), Vector(193.0), Vector(194.0)))), Vector(Vector(s0(Vector(Vector(195.0), Vector(196.0)), Vector(Vector(197.0)), Vector(198.0, 199.0), Vector(Vector(200.0), Vector(201.0), Vector(202.0)), Vector(Vector(203.0), Vector(204.0)), Vector(Vector(205.0), Vector(206.0), Vector(207.0))))))), Vector(s2(s1(Vector(s0(Vector(Vector(208.0), Vector(209.0)), Vector(Vector(210.0)), Vector(211.0, 212.0), Vector(Vector(213.0), Vector(214.0), Vector(215.0)), Vector(Vector(216.0), Vector(217.0)), Vector(Vector(218.0), Vector(219.0), Vector(220.0)))), Vector(Vector(s0(Vector(Vector(221.0), Vector(222.0)), Vector(Vector(223.0)), Vector(224.0, 225.0), Vector(Vector(226.0), Vector(227.0), Vector(228.0)), Vector(Vector(229.0), Vector(230.0)), Vector(Vector(231.0), Vector(232.0), Vector(233.0))))))), s2(s1(Vector(s0(Vector(Vector(234.0), Vector(235.0)), Vector(Vector(236.0)), Vector(237.0, 238.0), Vector(Vector(239.0), Vector(240.0), Vector(241.0)), Vector(Vector(242.0), Vector(243.0)), Vector(Vector(244.0), Vector(245.0), Vector(246.0)))), Vector(Vector(s0(Vector(Vector(247.0), Vector(248.0)), Vector(Vector(249.0)), Vector(250.0, 251.0), Vector(Vector(252.0), Vector(253.0), Vector(254.0)), Vector(Vector(255.0), Vector(256.0)), Vector(Vector(257.0), Vector(258.0), Vector(259.0))))))), s2(s1(Vector(s0(Vector(Vector(260.0), Vector(261.0)), Vector(Vector(262.0)), Vector(263.0, 264.0), Vector(Vector(265.0), Vector(266.0), Vector(267.0)), Vector(Vector(268.0), Vector(269.0)), Vector(Vector(270.0), Vector(271.0), Vector(272.0)))), Vector(Vector(s0(Vector(Vector(273.0), Vector(274.0)), Vector(Vector(275.0)), Vector(276.0, 277.0), Vector(Vector(278.0), Vector(279.0), Vector(280.0)), Vector(Vector(281.0), Vector(282.0)), Vector(Vector(283.0), Vector(284.0), Vector(285.0)))))))), s2(s1(Vector(s0(Vector(Vector(286.0), Vector(287.0)), Vector(Vector(288.0)), Vector(289.0, 290.0), Vector(Vector(291.0), Vector(292.0), Vector(293.0)), Vector(Vector(294.0), Vector(295.0)), Vector(Vector(296.0), Vector(297.0), Vector(298.0)))), Vector(Vector(s0(Vector(Vector(299.0), Vector(300.0)), Vector(Vector(301.0)), Vector(302.0, 303.0), Vector(Vector(304.0), Vector(305.0), Vector(306.0)), Vector(Vector(307.0), Vector(308.0)), Vector(Vector(309.0), Vector(310.0), Vector(311.0)))))))), s3(Vector(s1(Vector(s0(Vector(Vector(312.0), Vector(313.0)), Vector(Vector(314.0)), Vector(315.0, 316.0), Vector(Vector(317.0), Vector(318.0), Vector(319.0)), Vector(Vector(320.0), Vector(321.0)), Vector(Vector(322.0), Vector(323.0), Vector(324.0)))), Vector(Vector(s0(Vector(Vector(325.0), Vector(326.0)), Vector(Vector(327.0)), Vector(328.0, 329.0), Vector(Vector(330.0), Vector(331.0), Vector(332.0)), Vector(Vector(333.0), Vector(334.0)), Vector(Vector(335.0), Vector(336.0), Vector(337.0)))))), s1(Vector(s0(Vector(Vector(338.0), Vector(339.0)), Vector(Vector(340.0)), Vector(341.0, 342.0), Vector(Vector(343.0), Vector(344.0), Vector(345.0)), Vector(Vector(346.0), Vector(347.0)), Vector(Vector(348.0), Vector(349.0), Vector(350.0)))), Vector(Vector(s0(Vector(Vector(351.0), Vector(352.0)), Vector(Vector(353.0)), Vector(354.0, 355.0), Vector(Vector(356.0), Vector(357.0), Vector(358.0)), Vector(Vector(359.0), Vector(360.0)), Vector(Vector(361.0), Vector(362.0), Vector(363.0))))))), Vector(s2(s1(Vector(s0(Vector(Vector(364.0), Vector(365.0)), Vector(Vector(366.0)), Vector(367.0, 368.0), Vector(Vector(369.0), Vector(370.0), Vector(371.0)), Vector(Vector(372.0), Vector(373.0)), Vector(Vector(374.0), Vector(375.0), Vector(376.0)))), Vector(Vector(s0(Vector(Vector(377.0), Vector(378.0)), Vector(Vector(379.0)), Vector(380.0, 381.0), Vector(Vector(382.0), Vector(383.0), Vector(384.0)), Vector(Vector(385.0), Vector(386.0)), Vector(Vector(387.0), Vector(388.0), Vector(389.0))))))), s2(s1(Vector(s0(Vector(Vector(390.0), Vector(391.0)), Vector(Vector(392.0)), Vector(393.0, 394.0), Vector(Vector(395.0), Vector(396.0), Vector(397.0)), Vector(Vector(398.0), Vector(399.0)), Vector(Vector(400.0), Vector(401.0), Vector(402.0)))), Vector(Vector(s0(Vector(Vector(403.0), Vector(404.0)), Vector(Vector(405.0)), Vector(406.0, 407.0), Vector(Vector(408.0), Vector(409.0), Vector(410.0)), Vector(Vector(411.0), Vector(412.0)), Vector(Vector(413.0), Vector(414.0), Vector(415.0))))))), s2(s1(Vector(s0(Vector(Vector(416.0), Vector(417.0)), Vector(Vector(418.0)), Vector(419.0, 420.0), Vector(Vector(421.0), Vector(422.0), Vector(423.0)), Vector(Vector(424.0), Vector(425.0)), Vector(Vector(426.0), Vector(427.0), Vector(428.0)))), Vector(Vector(s0(Vector(Vector(429.0), Vector(430.0)), Vector(Vector(431.0)), Vector(432.0, 433.0), Vector(Vector(434.0), Vector(435.0), Vector(436.0)), Vector(Vector(437.0), Vector(438.0)), Vector(Vector(439.0), Vector(440.0), Vector(441.0)))))))), s2(s1(Vector(s0(Vector(Vector(442.0), Vector(443.0)), Vector(Vector(444.0)), Vector(445.0, 446.0), Vector(Vector(447.0), Vector(448.0), Vector(449.0)), Vector(Vector(450.0), Vector(451.0)), Vector(Vector(452.0), Vector(453.0), Vector(454.0)))), Vector(Vector(s0(Vector(Vector(455.0), Vector(456.0)), Vector(Vector(457.0)), Vector(458.0, 459.0), Vector(Vector(460.0), Vector(461.0), Vector(462.0)), Vector(Vector(463.0), Vector(464.0)), Vector(Vector(465.0), Vector(466.0), Vector(467.0)))))))))
    val v1: s3 = s3(Vector(s1(Vector(s0(Vector(Vector(468.0), Vector(469.0)), Vector(Vector(470.0)), Vector(471.0, 472.0), Vector(Vector(473.0), Vector(474.0), Vector(475.0)), Vector(Vector(476.0), Vector(477.0)), Vector(Vector(478.0), Vector(479.0), Vector(480.0)))), Vector(Vector(s0(Vector(Vector(481.0), Vector(482.0)), Vector(Vector(483.0)), Vector(484.0, 485.0), Vector(Vector(486.0), Vector(487.0), Vector(488.0)), Vector(Vector(489.0), Vector(490.0)), Vector(Vector(491.0), Vector(492.0), Vector(493.0)))))), s1(Vector(s0(Vector(Vector(494.0), Vector(495.0)), Vector(Vector(496.0)), Vector(497.0, 498.0), Vector(Vector(499.0), Vector(500.0), Vector(501.0)), Vector(Vector(502.0), Vector(503.0)), Vector(Vector(504.0), Vector(505.0), Vector(506.0)))), Vector(Vector(s0(Vector(Vector(507.0), Vector(508.0)), Vector(Vector(509.0)), Vector(510.0, 511.0), Vector(Vector(512.0), Vector(513.0), Vector(514.0)), Vector(Vector(515.0), Vector(516.0)), Vector(Vector(517.0), Vector(518.0), Vector(519.0))))))), Vector(s2(s1(Vector(s0(Vector(Vector(520.0), Vector(521.0)), Vector(Vector(522.0)), Vector(523.0, 524.0), Vector(Vector(525.0), Vector(526.0), Vector(527.0)), Vector(Vector(528.0), Vector(529.0)), Vector(Vector(530.0), Vector(531.0), Vector(532.0)))), Vector(Vector(s0(Vector(Vector(533.0), Vector(534.0)), Vector(Vector(535.0)), Vector(536.0, 537.0), Vector(Vector(538.0), Vector(539.0), Vector(540.0)), Vector(Vector(541.0), Vector(542.0)), Vector(Vector(543.0), Vector(544.0), Vector(545.0))))))), s2(s1(Vector(s0(Vector(Vector(546.0), Vector(547.0)), Vector(Vector(548.0)), Vector(549.0, 550.0), Vector(Vector(551.0), Vector(552.0), Vector(553.0)), Vector(Vector(554.0), Vector(555.0)), Vector(Vector(556.0), Vector(557.0), Vector(558.0)))), Vector(Vector(s0(Vector(Vector(559.0), Vector(560.0)), Vector(Vector(561.0)), Vector(562.0, 563.0), Vector(Vector(564.0), Vector(565.0), Vector(566.0)), Vector(Vector(567.0), Vector(568.0)), Vector(Vector(569.0), Vector(570.0), Vector(571.0))))))), s2(s1(Vector(s0(Vector(Vector(572.0), Vector(573.0)), Vector(Vector(574.0)), Vector(575.0, 576.0), Vector(Vector(577.0), Vector(578.0), Vector(579.0)), Vector(Vector(580.0), Vector(581.0)), Vector(Vector(582.0), Vector(583.0), Vector(584.0)))), Vector(Vector(s0(Vector(Vector(585.0), Vector(586.0)), Vector(Vector(587.0)), Vector(588.0, 589.0), Vector(Vector(590.0), Vector(591.0), Vector(592.0)), Vector(Vector(593.0), Vector(594.0)), Vector(Vector(595.0), Vector(596.0), Vector(597.0)))))))), s2(s1(Vector(s0(Vector(Vector(598.0), Vector(599.0)), Vector(Vector(600.0)), Vector(601.0, 602.0), Vector(Vector(603.0), Vector(604.0), Vector(605.0)), Vector(Vector(606.0), Vector(607.0)), Vector(Vector(608.0), Vector(609.0), Vector(610.0)))), Vector(Vector(s0(Vector(Vector(611.0), Vector(612.0)), Vector(Vector(613.0)), Vector(614.0, 615.0), Vector(Vector(616.0), Vector(617.0), Vector(618.0)), Vector(Vector(619.0), Vector(620.0)), Vector(Vector(621.0), Vector(622.0), Vector(623.0))))))))
    val v2: Double = 624.0
    val start = nanoTime()
    var result: Double = 624.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}