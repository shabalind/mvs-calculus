import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0,
    p2: Vector[s0],
    p3: Vector[s0],
    p4: Vector[Vector[s0]],
    p5: s0
  )
  case class s2 (
    p0: Double,
    p1: s0
  )
  case class s3 (
    p0: Vector[Vector[s2]],
    p1: s1
  )
  case class s4 (
    p0: Vector[Vector[s2]],
    p1: Vector[Vector[s1]]
  )
  case class s6 (
    p0: s0,
    p1: s2
  )
  case class s8 (
    p0: Vector[s6],
    p1: s3
  )
  case class s10 (
    p0: Vector[s8],
    p1: s4
  )
  def f33(v0: s2): s2 = {
    val v4: Double = v0.p0
    val v2: Double = v0.p0
    val v1: Vector[Double] = Vector(v2, v4, v2, v2, v4)
    var v19: Vector[Double] = v1
    val v5: s0 = v0.p1
    var v13: Double = v2
    var v8: Double = v4
    var v10: s0 = v5
    val v16: Double = v0.p0
    val v11: Double = v19(0)
    v19 = v19.updated(1, v16)
    val v24: s0 = v0.p1
    v19 = v19.updated(1, v8)
    val v14: Vector[Vector[Double]] = v24.p1
    val v26: Vector[Vector[Double]] = v5.p1
    var v20: s2 = v0
    v10 = v10.copy(p1 = v26)
    var v18: s2 = v0
    val v36: Double = v20.p0
    val v37: s6 = s6(v5, v18)
    val v50: s2 = s2(v36, v10)
    val v31: s0 = v50.p1
    val v32: Double = v8 * v11
    val v30: Double = v50.p0
    val v25: Vector[Vector[Double]] = v10.p1
    v18 = v18.copy(p0 = v32)
    v19 = v19.updated(0, v32)
    val v29: s0 = v37.p0
    val v28: Vector[Double] = v25(0)
    val v66: s2 = v37.p1
    val v54: Double = v36 + v30
    v19 = v19.updated(0, v36)
    v10 = v10.copy(p1 = v14)
    v19 = v19.updated(0, v54)
    val v40: Vector[Vector[Double]] = v5.p0
    v10 = v10.copy(p1 = v25)
    val v77: s0 = v66.p1
    val v186: Double = v28(0)
    val v70: Vector[Vector[Double]] = v29.p1
    var v72: s0 = v31
    val v125: s2 = s2(v186, v72)
    v8 = v30
    val v86: Vector[Vector[Double]] = v77.p1
    v72 = v72.copy(p1 = v25)
    v10 = v10.copy(p0 = v40)
    v20 = v20.copy(p0 = v13)
    v72 = v72.copy(p1 = v25)
    var v74: Vector[Vector[Double]] = v70
    v72 = v72.copy(p1 = v86)
    v10 = v10.copy(p1 = v74)
    v10 = v10.copy(p1 = v86)
    v125
  }
  def f23(v0: Double, v1: Vector[Vector[Double]], v2: Double, v3: s3): Double = {
    var v8: Vector[Vector[Double]] = v1
    var v6: Vector[Vector[Double]] = v8
    v6 = v1
    val v9: Vector[Double] = v6(0)
    val v18: Double = v9(0)
    v6 = v6.updated(0, v9)
    val v10: Vector[Double] = v1(0)
    val v25: Double = v9(0)
    val v46: Double = v18 / v25
    v8 = v8.updated(0, v10)
    val v31: Double = v46 * v25
    val v42: Double = v31 - v0
    v42
  }
  @noinline
  def f0(v0: Vector[s8], v1: Vector[s3], v2: Vector[Vector[s3]], v3: s10, v4: Double): Double = {
    var v5: Double = v4
    val v7: s4 = v3.p1
    var v9: s4 = v7
    val v14: Vector[Vector[s2]] = v9.p0
    val v16: s4 = v3.p1
    v9 = v9.copy(p0 = v14)
    v9 = v9.copy(p0 = v14)
    val v21: Vector[Vector[s1]] = v16.p1
    v5 = v4
    v9 = v16
    val v50: Vector[s2] = v14(2)
    val v59: s2 = v50(0)
    val v23: s0 = v59.p1
    v9 = v7
    val v118: s2 = f33(v59)
    val v74: Vector[s3] = v2(0)
    v9 = v9.copy(p0 = v14)
    v9 = v9.copy(p0 = v14)
    val v173: s3 = v74(0)
    val v142: Vector[Vector[Double]] = v23.p0
    val v167: Double = v118.p0
    val v168: Double = f23(v5, v142, v167, v173)
    v9 = v9.copy(p1 = v21)
    val v123: Double = v168 + v5
    var v253: Double = v123
    v253
  }
  def benchmark(): Unit = {
    val v0: Vector[s8] = Vector(s8(Vector(s6(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))), s2(4.0, s0(Vector(Vector(5.0)), Vector(Vector(6.0), Vector(7.0), Vector(8.0)))))), s3(Vector(Vector(s2(9.0, s0(Vector(Vector(10.0)), Vector(Vector(11.0), Vector(12.0), Vector(13.0))))), Vector(s2(14.0, s0(Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0), Vector(18.0))))), Vector(s2(19.0, s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0)))))), s1(s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0))), s0(Vector(Vector(28.0)), Vector(Vector(29.0), Vector(30.0), Vector(31.0))), Vector(s0(Vector(Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0))), s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0))), s0(Vector(Vector(40.0)), Vector(Vector(41.0), Vector(42.0), Vector(43.0)))), Vector(s0(Vector(Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0)))), Vector(Vector(s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0), Vector(51.0)))), Vector(s0(Vector(Vector(52.0)), Vector(Vector(53.0), Vector(54.0), Vector(55.0)))), Vector(s0(Vector(Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0))))), s0(Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0), Vector(63.0)))))), s8(Vector(s6(s0(Vector(Vector(64.0)), Vector(Vector(65.0), Vector(66.0), Vector(67.0))), s2(68.0, s0(Vector(Vector(69.0)), Vector(Vector(70.0), Vector(71.0), Vector(72.0)))))), s3(Vector(Vector(s2(73.0, s0(Vector(Vector(74.0)), Vector(Vector(75.0), Vector(76.0), Vector(77.0))))), Vector(s2(78.0, s0(Vector(Vector(79.0)), Vector(Vector(80.0), Vector(81.0), Vector(82.0))))), Vector(s2(83.0, s0(Vector(Vector(84.0)), Vector(Vector(85.0), Vector(86.0), Vector(87.0)))))), s1(s0(Vector(Vector(88.0)), Vector(Vector(89.0), Vector(90.0), Vector(91.0))), s0(Vector(Vector(92.0)), Vector(Vector(93.0), Vector(94.0), Vector(95.0))), Vector(s0(Vector(Vector(96.0)), Vector(Vector(97.0), Vector(98.0), Vector(99.0))), s0(Vector(Vector(100.0)), Vector(Vector(101.0), Vector(102.0), Vector(103.0))), s0(Vector(Vector(104.0)), Vector(Vector(105.0), Vector(106.0), Vector(107.0)))), Vector(s0(Vector(Vector(108.0)), Vector(Vector(109.0), Vector(110.0), Vector(111.0)))), Vector(Vector(s0(Vector(Vector(112.0)), Vector(Vector(113.0), Vector(114.0), Vector(115.0)))), Vector(s0(Vector(Vector(116.0)), Vector(Vector(117.0), Vector(118.0), Vector(119.0)))), Vector(s0(Vector(Vector(120.0)), Vector(Vector(121.0), Vector(122.0), Vector(123.0))))), s0(Vector(Vector(124.0)), Vector(Vector(125.0), Vector(126.0), Vector(127.0)))))), s8(Vector(s6(s0(Vector(Vector(128.0)), Vector(Vector(129.0), Vector(130.0), Vector(131.0))), s2(132.0, s0(Vector(Vector(133.0)), Vector(Vector(134.0), Vector(135.0), Vector(136.0)))))), s3(Vector(Vector(s2(137.0, s0(Vector(Vector(138.0)), Vector(Vector(139.0), Vector(140.0), Vector(141.0))))), Vector(s2(142.0, s0(Vector(Vector(143.0)), Vector(Vector(144.0), Vector(145.0), Vector(146.0))))), Vector(s2(147.0, s0(Vector(Vector(148.0)), Vector(Vector(149.0), Vector(150.0), Vector(151.0)))))), s1(s0(Vector(Vector(152.0)), Vector(Vector(153.0), Vector(154.0), Vector(155.0))), s0(Vector(Vector(156.0)), Vector(Vector(157.0), Vector(158.0), Vector(159.0))), Vector(s0(Vector(Vector(160.0)), Vector(Vector(161.0), Vector(162.0), Vector(163.0))), s0(Vector(Vector(164.0)), Vector(Vector(165.0), Vector(166.0), Vector(167.0))), s0(Vector(Vector(168.0)), Vector(Vector(169.0), Vector(170.0), Vector(171.0)))), Vector(s0(Vector(Vector(172.0)), Vector(Vector(173.0), Vector(174.0), Vector(175.0)))), Vector(Vector(s0(Vector(Vector(176.0)), Vector(Vector(177.0), Vector(178.0), Vector(179.0)))), Vector(s0(Vector(Vector(180.0)), Vector(Vector(181.0), Vector(182.0), Vector(183.0)))), Vector(s0(Vector(Vector(184.0)), Vector(Vector(185.0), Vector(186.0), Vector(187.0))))), s0(Vector(Vector(188.0)), Vector(Vector(189.0), Vector(190.0), Vector(191.0)))))))
    val v1: Vector[s3] = Vector(s3(Vector(Vector(s2(192.0, s0(Vector(Vector(193.0)), Vector(Vector(194.0), Vector(195.0), Vector(196.0))))), Vector(s2(197.0, s0(Vector(Vector(198.0)), Vector(Vector(199.0), Vector(200.0), Vector(201.0))))), Vector(s2(202.0, s0(Vector(Vector(203.0)), Vector(Vector(204.0), Vector(205.0), Vector(206.0)))))), s1(s0(Vector(Vector(207.0)), Vector(Vector(208.0), Vector(209.0), Vector(210.0))), s0(Vector(Vector(211.0)), Vector(Vector(212.0), Vector(213.0), Vector(214.0))), Vector(s0(Vector(Vector(215.0)), Vector(Vector(216.0), Vector(217.0), Vector(218.0))), s0(Vector(Vector(219.0)), Vector(Vector(220.0), Vector(221.0), Vector(222.0))), s0(Vector(Vector(223.0)), Vector(Vector(224.0), Vector(225.0), Vector(226.0)))), Vector(s0(Vector(Vector(227.0)), Vector(Vector(228.0), Vector(229.0), Vector(230.0)))), Vector(Vector(s0(Vector(Vector(231.0)), Vector(Vector(232.0), Vector(233.0), Vector(234.0)))), Vector(s0(Vector(Vector(235.0)), Vector(Vector(236.0), Vector(237.0), Vector(238.0)))), Vector(s0(Vector(Vector(239.0)), Vector(Vector(240.0), Vector(241.0), Vector(242.0))))), s0(Vector(Vector(243.0)), Vector(Vector(244.0), Vector(245.0), Vector(246.0))))), s3(Vector(Vector(s2(247.0, s0(Vector(Vector(248.0)), Vector(Vector(249.0), Vector(250.0), Vector(251.0))))), Vector(s2(252.0, s0(Vector(Vector(253.0)), Vector(Vector(254.0), Vector(255.0), Vector(256.0))))), Vector(s2(257.0, s0(Vector(Vector(258.0)), Vector(Vector(259.0), Vector(260.0), Vector(261.0)))))), s1(s0(Vector(Vector(262.0)), Vector(Vector(263.0), Vector(264.0), Vector(265.0))), s0(Vector(Vector(266.0)), Vector(Vector(267.0), Vector(268.0), Vector(269.0))), Vector(s0(Vector(Vector(270.0)), Vector(Vector(271.0), Vector(272.0), Vector(273.0))), s0(Vector(Vector(274.0)), Vector(Vector(275.0), Vector(276.0), Vector(277.0))), s0(Vector(Vector(278.0)), Vector(Vector(279.0), Vector(280.0), Vector(281.0)))), Vector(s0(Vector(Vector(282.0)), Vector(Vector(283.0), Vector(284.0), Vector(285.0)))), Vector(Vector(s0(Vector(Vector(286.0)), Vector(Vector(287.0), Vector(288.0), Vector(289.0)))), Vector(s0(Vector(Vector(290.0)), Vector(Vector(291.0), Vector(292.0), Vector(293.0)))), Vector(s0(Vector(Vector(294.0)), Vector(Vector(295.0), Vector(296.0), Vector(297.0))))), s0(Vector(Vector(298.0)), Vector(Vector(299.0), Vector(300.0), Vector(301.0))))), s3(Vector(Vector(s2(302.0, s0(Vector(Vector(303.0)), Vector(Vector(304.0), Vector(305.0), Vector(306.0))))), Vector(s2(307.0, s0(Vector(Vector(308.0)), Vector(Vector(309.0), Vector(310.0), Vector(311.0))))), Vector(s2(312.0, s0(Vector(Vector(313.0)), Vector(Vector(314.0), Vector(315.0), Vector(316.0)))))), s1(s0(Vector(Vector(317.0)), Vector(Vector(318.0), Vector(319.0), Vector(320.0))), s0(Vector(Vector(321.0)), Vector(Vector(322.0), Vector(323.0), Vector(324.0))), Vector(s0(Vector(Vector(325.0)), Vector(Vector(326.0), Vector(327.0), Vector(328.0))), s0(Vector(Vector(329.0)), Vector(Vector(330.0), Vector(331.0), Vector(332.0))), s0(Vector(Vector(333.0)), Vector(Vector(334.0), Vector(335.0), Vector(336.0)))), Vector(s0(Vector(Vector(337.0)), Vector(Vector(338.0), Vector(339.0), Vector(340.0)))), Vector(Vector(s0(Vector(Vector(341.0)), Vector(Vector(342.0), Vector(343.0), Vector(344.0)))), Vector(s0(Vector(Vector(345.0)), Vector(Vector(346.0), Vector(347.0), Vector(348.0)))), Vector(s0(Vector(Vector(349.0)), Vector(Vector(350.0), Vector(351.0), Vector(352.0))))), s0(Vector(Vector(353.0)), Vector(Vector(354.0), Vector(355.0), Vector(356.0))))))
    val v2: Vector[Vector[s3]] = Vector(Vector(s3(Vector(Vector(s2(357.0, s0(Vector(Vector(358.0)), Vector(Vector(359.0), Vector(360.0), Vector(361.0))))), Vector(s2(362.0, s0(Vector(Vector(363.0)), Vector(Vector(364.0), Vector(365.0), Vector(366.0))))), Vector(s2(367.0, s0(Vector(Vector(368.0)), Vector(Vector(369.0), Vector(370.0), Vector(371.0)))))), s1(s0(Vector(Vector(372.0)), Vector(Vector(373.0), Vector(374.0), Vector(375.0))), s0(Vector(Vector(376.0)), Vector(Vector(377.0), Vector(378.0), Vector(379.0))), Vector(s0(Vector(Vector(380.0)), Vector(Vector(381.0), Vector(382.0), Vector(383.0))), s0(Vector(Vector(384.0)), Vector(Vector(385.0), Vector(386.0), Vector(387.0))), s0(Vector(Vector(388.0)), Vector(Vector(389.0), Vector(390.0), Vector(391.0)))), Vector(s0(Vector(Vector(392.0)), Vector(Vector(393.0), Vector(394.0), Vector(395.0)))), Vector(Vector(s0(Vector(Vector(396.0)), Vector(Vector(397.0), Vector(398.0), Vector(399.0)))), Vector(s0(Vector(Vector(400.0)), Vector(Vector(401.0), Vector(402.0), Vector(403.0)))), Vector(s0(Vector(Vector(404.0)), Vector(Vector(405.0), Vector(406.0), Vector(407.0))))), s0(Vector(Vector(408.0)), Vector(Vector(409.0), Vector(410.0), Vector(411.0)))))), Vector(s3(Vector(Vector(s2(412.0, s0(Vector(Vector(413.0)), Vector(Vector(414.0), Vector(415.0), Vector(416.0))))), Vector(s2(417.0, s0(Vector(Vector(418.0)), Vector(Vector(419.0), Vector(420.0), Vector(421.0))))), Vector(s2(422.0, s0(Vector(Vector(423.0)), Vector(Vector(424.0), Vector(425.0), Vector(426.0)))))), s1(s0(Vector(Vector(427.0)), Vector(Vector(428.0), Vector(429.0), Vector(430.0))), s0(Vector(Vector(431.0)), Vector(Vector(432.0), Vector(433.0), Vector(434.0))), Vector(s0(Vector(Vector(435.0)), Vector(Vector(436.0), Vector(437.0), Vector(438.0))), s0(Vector(Vector(439.0)), Vector(Vector(440.0), Vector(441.0), Vector(442.0))), s0(Vector(Vector(443.0)), Vector(Vector(444.0), Vector(445.0), Vector(446.0)))), Vector(s0(Vector(Vector(447.0)), Vector(Vector(448.0), Vector(449.0), Vector(450.0)))), Vector(Vector(s0(Vector(Vector(451.0)), Vector(Vector(452.0), Vector(453.0), Vector(454.0)))), Vector(s0(Vector(Vector(455.0)), Vector(Vector(456.0), Vector(457.0), Vector(458.0)))), Vector(s0(Vector(Vector(459.0)), Vector(Vector(460.0), Vector(461.0), Vector(462.0))))), s0(Vector(Vector(463.0)), Vector(Vector(464.0), Vector(465.0), Vector(466.0)))))), Vector(s3(Vector(Vector(s2(467.0, s0(Vector(Vector(468.0)), Vector(Vector(469.0), Vector(470.0), Vector(471.0))))), Vector(s2(472.0, s0(Vector(Vector(473.0)), Vector(Vector(474.0), Vector(475.0), Vector(476.0))))), Vector(s2(477.0, s0(Vector(Vector(478.0)), Vector(Vector(479.0), Vector(480.0), Vector(481.0)))))), s1(s0(Vector(Vector(482.0)), Vector(Vector(483.0), Vector(484.0), Vector(485.0))), s0(Vector(Vector(486.0)), Vector(Vector(487.0), Vector(488.0), Vector(489.0))), Vector(s0(Vector(Vector(490.0)), Vector(Vector(491.0), Vector(492.0), Vector(493.0))), s0(Vector(Vector(494.0)), Vector(Vector(495.0), Vector(496.0), Vector(497.0))), s0(Vector(Vector(498.0)), Vector(Vector(499.0), Vector(500.0), Vector(501.0)))), Vector(s0(Vector(Vector(502.0)), Vector(Vector(503.0), Vector(504.0), Vector(505.0)))), Vector(Vector(s0(Vector(Vector(506.0)), Vector(Vector(507.0), Vector(508.0), Vector(509.0)))), Vector(s0(Vector(Vector(510.0)), Vector(Vector(511.0), Vector(512.0), Vector(513.0)))), Vector(s0(Vector(Vector(514.0)), Vector(Vector(515.0), Vector(516.0), Vector(517.0))))), s0(Vector(Vector(518.0)), Vector(Vector(519.0), Vector(520.0), Vector(521.0)))))))
    val v3: s10 = s10(Vector(s8(Vector(s6(s0(Vector(Vector(522.0)), Vector(Vector(523.0), Vector(524.0), Vector(525.0))), s2(526.0, s0(Vector(Vector(527.0)), Vector(Vector(528.0), Vector(529.0), Vector(530.0)))))), s3(Vector(Vector(s2(531.0, s0(Vector(Vector(532.0)), Vector(Vector(533.0), Vector(534.0), Vector(535.0))))), Vector(s2(536.0, s0(Vector(Vector(537.0)), Vector(Vector(538.0), Vector(539.0), Vector(540.0))))), Vector(s2(541.0, s0(Vector(Vector(542.0)), Vector(Vector(543.0), Vector(544.0), Vector(545.0)))))), s1(s0(Vector(Vector(546.0)), Vector(Vector(547.0), Vector(548.0), Vector(549.0))), s0(Vector(Vector(550.0)), Vector(Vector(551.0), Vector(552.0), Vector(553.0))), Vector(s0(Vector(Vector(554.0)), Vector(Vector(555.0), Vector(556.0), Vector(557.0))), s0(Vector(Vector(558.0)), Vector(Vector(559.0), Vector(560.0), Vector(561.0))), s0(Vector(Vector(562.0)), Vector(Vector(563.0), Vector(564.0), Vector(565.0)))), Vector(s0(Vector(Vector(566.0)), Vector(Vector(567.0), Vector(568.0), Vector(569.0)))), Vector(Vector(s0(Vector(Vector(570.0)), Vector(Vector(571.0), Vector(572.0), Vector(573.0)))), Vector(s0(Vector(Vector(574.0)), Vector(Vector(575.0), Vector(576.0), Vector(577.0)))), Vector(s0(Vector(Vector(578.0)), Vector(Vector(579.0), Vector(580.0), Vector(581.0))))), s0(Vector(Vector(582.0)), Vector(Vector(583.0), Vector(584.0), Vector(585.0))))))), s4(Vector(Vector(s2(586.0, s0(Vector(Vector(587.0)), Vector(Vector(588.0), Vector(589.0), Vector(590.0))))), Vector(s2(591.0, s0(Vector(Vector(592.0)), Vector(Vector(593.0), Vector(594.0), Vector(595.0))))), Vector(s2(596.0, s0(Vector(Vector(597.0)), Vector(Vector(598.0), Vector(599.0), Vector(600.0)))))), Vector(Vector(s1(s0(Vector(Vector(601.0)), Vector(Vector(602.0), Vector(603.0), Vector(604.0))), s0(Vector(Vector(605.0)), Vector(Vector(606.0), Vector(607.0), Vector(608.0))), Vector(s0(Vector(Vector(609.0)), Vector(Vector(610.0), Vector(611.0), Vector(612.0))), s0(Vector(Vector(613.0)), Vector(Vector(614.0), Vector(615.0), Vector(616.0))), s0(Vector(Vector(617.0)), Vector(Vector(618.0), Vector(619.0), Vector(620.0)))), Vector(s0(Vector(Vector(621.0)), Vector(Vector(622.0), Vector(623.0), Vector(624.0)))), Vector(Vector(s0(Vector(Vector(625.0)), Vector(Vector(626.0), Vector(627.0), Vector(628.0)))), Vector(s0(Vector(Vector(629.0)), Vector(Vector(630.0), Vector(631.0), Vector(632.0)))), Vector(s0(Vector(Vector(633.0)), Vector(Vector(634.0), Vector(635.0), Vector(636.0))))), s0(Vector(Vector(637.0)), Vector(Vector(638.0), Vector(639.0), Vector(640.0))))), Vector(s1(s0(Vector(Vector(641.0)), Vector(Vector(642.0), Vector(643.0), Vector(644.0))), s0(Vector(Vector(645.0)), Vector(Vector(646.0), Vector(647.0), Vector(648.0))), Vector(s0(Vector(Vector(649.0)), Vector(Vector(650.0), Vector(651.0), Vector(652.0))), s0(Vector(Vector(653.0)), Vector(Vector(654.0), Vector(655.0), Vector(656.0))), s0(Vector(Vector(657.0)), Vector(Vector(658.0), Vector(659.0), Vector(660.0)))), Vector(s0(Vector(Vector(661.0)), Vector(Vector(662.0), Vector(663.0), Vector(664.0)))), Vector(Vector(s0(Vector(Vector(665.0)), Vector(Vector(666.0), Vector(667.0), Vector(668.0)))), Vector(s0(Vector(Vector(669.0)), Vector(Vector(670.0), Vector(671.0), Vector(672.0)))), Vector(s0(Vector(Vector(673.0)), Vector(Vector(674.0), Vector(675.0), Vector(676.0))))), s0(Vector(Vector(677.0)), Vector(Vector(678.0), Vector(679.0), Vector(680.0))))))))
    val v4: Double = 681.0
    val start = nanoTime()
    var result: Double = 681.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}