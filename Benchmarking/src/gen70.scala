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
    p0: Vector[s1],
    p1: s1
  )
  case class s4 (
    p0: s0,
    p1: s1
  )
  case class s5 (
    p0: s4,
    p1: Vector[s2],
    p2: Vector[Vector[s1]],
    p3: Vector[Vector[s1]],
    p4: Double,
    p5: Vector[s0]
  )
  case class s7 (
    p0: Vector[Vector[s5]],
    p1: Vector[s1]
  )
  def f68(v0: Double): Double = {
    var v5: Double = v0
    var v6: Double = v0
    var v2: Double = v6
    var v7: Double = v6
    var v4: Double = v7
    val v1: Vector[Double] = Vector(v4, v0, v7, v7, v5)
    val v3: Double = v1(0)
    var v8: Vector[Double] = v1
    v8 = v8.updated(4, v4)
    val v9: Double = v1(4)
    var v10: Double = v0
    var v12: Vector[Double] = v8
    var v16: Vector[Double] = v8
    val v15: Double = v16(2)
    var v13: Double = v9
    val v25: Double = v8(3)
    var v14: Double = v13
    v8 = v8.updated(3, v15)
    var v30: Vector[Double] = v16
    val v24: Double = v30(4)
    val v11: Double = v12(4)
    v16 = v16.updated(2, v15)
    var v17: Double = v6
    v12 = v12.updated(0, v24)
    val v42: Vector[Double] = Vector(v11, v9, v10)
    var v31: Vector[Double] = v42
    val v38: Double = v1(3)
    v8 = v8.updated(4, v25)
    v16 = v16.updated(1, v2)
    v8 = v8.updated(2, v17)
    v7 = v3
    var v20: Vector[Double] = v31
    var v26: Vector[Double] = v31
    var v41: Vector[Double] = v26
    v30 = v30.updated(2, v2)
    v41 = v26
    var v48: Vector[Double] = v41
    var v22: Vector[Double] = v20
    v12 = v12.updated(3, v38)
    val v47: Double = v48(2)
    var v45: Vector[Double] = v48
    v4 = v9
    v30 = v30.updated(0, v38)
    var v35: Vector[Double] = v45
    val v135: Double = v35(2)
    val v75: Double = v22(2)
    var v126: Double = v75
    var v239: Double = v14
    v8 = v8.updated(4, v47)
    v41 = v41.updated(1, v239)
    v126 = v135
    v126
  }
  def f27(v0: s0, v1: s0): s0 = {
    val v4: Vector[Vector[Double]] = v0.p0
    var v7: Vector[Vector[Double]] = v4
    val v15: Vector[Vector[Double]] = v0.p1
    val v9: Vector[Vector[Double]] = v1.p0
    val v5: Vector[Vector[Double]] = v1.p0
    val v29: Vector[Double] = v9(2)
    var v38: Vector[Vector[Double]] = v9
    var v41: s0 = v0
    v41 = v41.copy(p0 = v9)
    val v25: Vector[Double] = v7(1)
    val v51: Vector[Vector[Double]] = v1.p1
    var v44: Vector[Double] = v29
    v41 = v41.copy(p0 = v38)
    val v58: Vector[Double] = v15(0)
    var v62: s0 = v1
    v38 = v38.updated(0, v25)
    var v56: Vector[Vector[Double]] = v5
    v62 = v62.copy(p1 = v5)
    val v83: Vector[Vector[Double]] = v62.p0
    v38 = v38.updated(1, v58)
    var v50: s0 = v41
    v7 = v7.updated(1, v25)
    var v120: Vector[Vector[Double]] = v15
    val v54: Vector[Double] = v56(1)
    v50 = v50.copy(p1 = v5)
    v62 = v62.copy(p1 = v120)
    v56 = v56.updated(2, v54)
    var v151: Vector[Double] = v54
    var v197: s0 = v50
    v120 = v120.updated(0, v151)
    v197 = v197.copy(p0 = v51)
    v7 = v7.updated(0, v25)
    v120 = v120.updated(2, v44)
    val v176: s1 = s1(v197, v50)
    v62 = v62.copy(p0 = v83)
    val v280: s0 = v176.p0
    v41 = v41.copy(p1 = v83)
    v280
  }
  def f4(v0: s0): s0 = {
    var v6: s0 = v0
    var v1: s0 = v6
    val v9: s0 = f27(v1, v1)
    var v7: s0 = v1
    val v2: s0 = f27(v9, v6)
    var v5: s0 = v7
    val v8: Vector[Vector[Double]] = v5.p0
    val v3: s0 = f27(v2, v5)
    val v10: Vector[Double] = v8(0)
    val v11: Vector[Double] = v8(2)
    v6 = v6.copy(p0 = v8)
    val v12: Vector[Double] = v8(0)
    var v27: Vector[Double] = v12
    var v19: Vector[Vector[Double]] = v8
    val v24: Double = v11(0)
    var v60: Vector[Vector[Double]] = v8
    var v33: Vector[Double] = v11
    val v36: Vector[Double] = v8(1)
    v5 = v5.copy(p1 = v19)
    v7 = v7.copy(p0 = v60)
    var v16: Vector[Vector[Double]] = v60
    v7 = v7.copy(p0 = v8)
    var v57: Vector[Vector[Double]] = v60
    v7 = v7.copy(p0 = v57)
    val v46: Double = v27(0)
    v19 = v19.updated(0, v33)
    v33 = v33.updated(0, v46)
    val v67: Double = f68(v24)
    v33 = v33.updated(0, v67)
    v5 = v5.copy(p0 = v57)
    v6 = v6.copy(p1 = v8)
    v16 = v16.updated(2, v36)
    v5 = v5.copy(p1 = v16)
    v7 = v7.copy(p1 = v57)
    v57 = v57.updated(0, v10)
    v3
  }
  @noinline
  def f0(v0: Vector[s7], v1: s2, v2: Vector[s0], v3: Double): Double = {
    val v6: Double = f68(v3)
    var v4: Vector[s0] = v2
    var v10: Double = v6
    val v12: s0 = v4(0)
    val v18: s0 = f4(v12)
    val v85: Vector[Vector[Double]] = v12.p0
    v4 = v4.updated(0, v12)
    v4 = v4.updated(0, v18)
    var v140: Vector[Vector[Double]] = v85
    val v56: Vector[Double] = v140(2)
    var v161: Double = v10
    val v83: Double = v3 - v161
    val v156: Double = v56(0)
    val v334: Double = v83 - v3
    val v143: Double = v334 * v156
    v143
  }
  def benchmark(): Unit = {
    val v0: Vector[s7] = Vector(s7(Vector(Vector(s5(s4(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0))), s1(s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0))))), Vector(s2(Vector(s1(s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))), s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0)))), s1(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0))), s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0), Vector(40.0), Vector(41.0))))), s1(s0(Vector(Vector(42.0), Vector(43.0), Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0))), s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0), Vector(52.0), Vector(53.0)))))), Vector(Vector(s1(s0(Vector(Vector(54.0), Vector(55.0), Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0))), s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0), Vector(64.0), Vector(65.0))))), Vector(s1(s0(Vector(Vector(66.0), Vector(67.0), Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0))), s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)), Vector(Vector(75.0), Vector(76.0), Vector(77.0)))))), Vector(Vector(s1(s0(Vector(Vector(78.0), Vector(79.0), Vector(80.0)), Vector(Vector(81.0), Vector(82.0), Vector(83.0))), s0(Vector(Vector(84.0), Vector(85.0), Vector(86.0)), Vector(Vector(87.0), Vector(88.0), Vector(89.0)))))), 90.0, Vector(s0(Vector(Vector(91.0), Vector(92.0), Vector(93.0)), Vector(Vector(94.0), Vector(95.0), Vector(96.0))), s0(Vector(Vector(97.0), Vector(98.0), Vector(99.0)), Vector(Vector(100.0), Vector(101.0), Vector(102.0))), s0(Vector(Vector(103.0), Vector(104.0), Vector(105.0)), Vector(Vector(106.0), Vector(107.0), Vector(108.0)))))), Vector(s5(s4(s0(Vector(Vector(109.0), Vector(110.0), Vector(111.0)), Vector(Vector(112.0), Vector(113.0), Vector(114.0))), s1(s0(Vector(Vector(115.0), Vector(116.0), Vector(117.0)), Vector(Vector(118.0), Vector(119.0), Vector(120.0))), s0(Vector(Vector(121.0), Vector(122.0), Vector(123.0)), Vector(Vector(124.0), Vector(125.0), Vector(126.0))))), Vector(s2(Vector(s1(s0(Vector(Vector(127.0), Vector(128.0), Vector(129.0)), Vector(Vector(130.0), Vector(131.0), Vector(132.0))), s0(Vector(Vector(133.0), Vector(134.0), Vector(135.0)), Vector(Vector(136.0), Vector(137.0), Vector(138.0)))), s1(s0(Vector(Vector(139.0), Vector(140.0), Vector(141.0)), Vector(Vector(142.0), Vector(143.0), Vector(144.0))), s0(Vector(Vector(145.0), Vector(146.0), Vector(147.0)), Vector(Vector(148.0), Vector(149.0), Vector(150.0))))), s1(s0(Vector(Vector(151.0), Vector(152.0), Vector(153.0)), Vector(Vector(154.0), Vector(155.0), Vector(156.0))), s0(Vector(Vector(157.0), Vector(158.0), Vector(159.0)), Vector(Vector(160.0), Vector(161.0), Vector(162.0)))))), Vector(Vector(s1(s0(Vector(Vector(163.0), Vector(164.0), Vector(165.0)), Vector(Vector(166.0), Vector(167.0), Vector(168.0))), s0(Vector(Vector(169.0), Vector(170.0), Vector(171.0)), Vector(Vector(172.0), Vector(173.0), Vector(174.0))))), Vector(s1(s0(Vector(Vector(175.0), Vector(176.0), Vector(177.0)), Vector(Vector(178.0), Vector(179.0), Vector(180.0))), s0(Vector(Vector(181.0), Vector(182.0), Vector(183.0)), Vector(Vector(184.0), Vector(185.0), Vector(186.0)))))), Vector(Vector(s1(s0(Vector(Vector(187.0), Vector(188.0), Vector(189.0)), Vector(Vector(190.0), Vector(191.0), Vector(192.0))), s0(Vector(Vector(193.0), Vector(194.0), Vector(195.0)), Vector(Vector(196.0), Vector(197.0), Vector(198.0)))))), 199.0, Vector(s0(Vector(Vector(200.0), Vector(201.0), Vector(202.0)), Vector(Vector(203.0), Vector(204.0), Vector(205.0))), s0(Vector(Vector(206.0), Vector(207.0), Vector(208.0)), Vector(Vector(209.0), Vector(210.0), Vector(211.0))), s0(Vector(Vector(212.0), Vector(213.0), Vector(214.0)), Vector(Vector(215.0), Vector(216.0), Vector(217.0))))))), Vector(s1(s0(Vector(Vector(218.0), Vector(219.0), Vector(220.0)), Vector(Vector(221.0), Vector(222.0), Vector(223.0))), s0(Vector(Vector(224.0), Vector(225.0), Vector(226.0)), Vector(Vector(227.0), Vector(228.0), Vector(229.0)))))), s7(Vector(Vector(s5(s4(s0(Vector(Vector(230.0), Vector(231.0), Vector(232.0)), Vector(Vector(233.0), Vector(234.0), Vector(235.0))), s1(s0(Vector(Vector(236.0), Vector(237.0), Vector(238.0)), Vector(Vector(239.0), Vector(240.0), Vector(241.0))), s0(Vector(Vector(242.0), Vector(243.0), Vector(244.0)), Vector(Vector(245.0), Vector(246.0), Vector(247.0))))), Vector(s2(Vector(s1(s0(Vector(Vector(248.0), Vector(249.0), Vector(250.0)), Vector(Vector(251.0), Vector(252.0), Vector(253.0))), s0(Vector(Vector(254.0), Vector(255.0), Vector(256.0)), Vector(Vector(257.0), Vector(258.0), Vector(259.0)))), s1(s0(Vector(Vector(260.0), Vector(261.0), Vector(262.0)), Vector(Vector(263.0), Vector(264.0), Vector(265.0))), s0(Vector(Vector(266.0), Vector(267.0), Vector(268.0)), Vector(Vector(269.0), Vector(270.0), Vector(271.0))))), s1(s0(Vector(Vector(272.0), Vector(273.0), Vector(274.0)), Vector(Vector(275.0), Vector(276.0), Vector(277.0))), s0(Vector(Vector(278.0), Vector(279.0), Vector(280.0)), Vector(Vector(281.0), Vector(282.0), Vector(283.0)))))), Vector(Vector(s1(s0(Vector(Vector(284.0), Vector(285.0), Vector(286.0)), Vector(Vector(287.0), Vector(288.0), Vector(289.0))), s0(Vector(Vector(290.0), Vector(291.0), Vector(292.0)), Vector(Vector(293.0), Vector(294.0), Vector(295.0))))), Vector(s1(s0(Vector(Vector(296.0), Vector(297.0), Vector(298.0)), Vector(Vector(299.0), Vector(300.0), Vector(301.0))), s0(Vector(Vector(302.0), Vector(303.0), Vector(304.0)), Vector(Vector(305.0), Vector(306.0), Vector(307.0)))))), Vector(Vector(s1(s0(Vector(Vector(308.0), Vector(309.0), Vector(310.0)), Vector(Vector(311.0), Vector(312.0), Vector(313.0))), s0(Vector(Vector(314.0), Vector(315.0), Vector(316.0)), Vector(Vector(317.0), Vector(318.0), Vector(319.0)))))), 320.0, Vector(s0(Vector(Vector(321.0), Vector(322.0), Vector(323.0)), Vector(Vector(324.0), Vector(325.0), Vector(326.0))), s0(Vector(Vector(327.0), Vector(328.0), Vector(329.0)), Vector(Vector(330.0), Vector(331.0), Vector(332.0))), s0(Vector(Vector(333.0), Vector(334.0), Vector(335.0)), Vector(Vector(336.0), Vector(337.0), Vector(338.0)))))), Vector(s5(s4(s0(Vector(Vector(339.0), Vector(340.0), Vector(341.0)), Vector(Vector(342.0), Vector(343.0), Vector(344.0))), s1(s0(Vector(Vector(345.0), Vector(346.0), Vector(347.0)), Vector(Vector(348.0), Vector(349.0), Vector(350.0))), s0(Vector(Vector(351.0), Vector(352.0), Vector(353.0)), Vector(Vector(354.0), Vector(355.0), Vector(356.0))))), Vector(s2(Vector(s1(s0(Vector(Vector(357.0), Vector(358.0), Vector(359.0)), Vector(Vector(360.0), Vector(361.0), Vector(362.0))), s0(Vector(Vector(363.0), Vector(364.0), Vector(365.0)), Vector(Vector(366.0), Vector(367.0), Vector(368.0)))), s1(s0(Vector(Vector(369.0), Vector(370.0), Vector(371.0)), Vector(Vector(372.0), Vector(373.0), Vector(374.0))), s0(Vector(Vector(375.0), Vector(376.0), Vector(377.0)), Vector(Vector(378.0), Vector(379.0), Vector(380.0))))), s1(s0(Vector(Vector(381.0), Vector(382.0), Vector(383.0)), Vector(Vector(384.0), Vector(385.0), Vector(386.0))), s0(Vector(Vector(387.0), Vector(388.0), Vector(389.0)), Vector(Vector(390.0), Vector(391.0), Vector(392.0)))))), Vector(Vector(s1(s0(Vector(Vector(393.0), Vector(394.0), Vector(395.0)), Vector(Vector(396.0), Vector(397.0), Vector(398.0))), s0(Vector(Vector(399.0), Vector(400.0), Vector(401.0)), Vector(Vector(402.0), Vector(403.0), Vector(404.0))))), Vector(s1(s0(Vector(Vector(405.0), Vector(406.0), Vector(407.0)), Vector(Vector(408.0), Vector(409.0), Vector(410.0))), s0(Vector(Vector(411.0), Vector(412.0), Vector(413.0)), Vector(Vector(414.0), Vector(415.0), Vector(416.0)))))), Vector(Vector(s1(s0(Vector(Vector(417.0), Vector(418.0), Vector(419.0)), Vector(Vector(420.0), Vector(421.0), Vector(422.0))), s0(Vector(Vector(423.0), Vector(424.0), Vector(425.0)), Vector(Vector(426.0), Vector(427.0), Vector(428.0)))))), 429.0, Vector(s0(Vector(Vector(430.0), Vector(431.0), Vector(432.0)), Vector(Vector(433.0), Vector(434.0), Vector(435.0))), s0(Vector(Vector(436.0), Vector(437.0), Vector(438.0)), Vector(Vector(439.0), Vector(440.0), Vector(441.0))), s0(Vector(Vector(442.0), Vector(443.0), Vector(444.0)), Vector(Vector(445.0), Vector(446.0), Vector(447.0))))))), Vector(s1(s0(Vector(Vector(448.0), Vector(449.0), Vector(450.0)), Vector(Vector(451.0), Vector(452.0), Vector(453.0))), s0(Vector(Vector(454.0), Vector(455.0), Vector(456.0)), Vector(Vector(457.0), Vector(458.0), Vector(459.0)))))), s7(Vector(Vector(s5(s4(s0(Vector(Vector(460.0), Vector(461.0), Vector(462.0)), Vector(Vector(463.0), Vector(464.0), Vector(465.0))), s1(s0(Vector(Vector(466.0), Vector(467.0), Vector(468.0)), Vector(Vector(469.0), Vector(470.0), Vector(471.0))), s0(Vector(Vector(472.0), Vector(473.0), Vector(474.0)), Vector(Vector(475.0), Vector(476.0), Vector(477.0))))), Vector(s2(Vector(s1(s0(Vector(Vector(478.0), Vector(479.0), Vector(480.0)), Vector(Vector(481.0), Vector(482.0), Vector(483.0))), s0(Vector(Vector(484.0), Vector(485.0), Vector(486.0)), Vector(Vector(487.0), Vector(488.0), Vector(489.0)))), s1(s0(Vector(Vector(490.0), Vector(491.0), Vector(492.0)), Vector(Vector(493.0), Vector(494.0), Vector(495.0))), s0(Vector(Vector(496.0), Vector(497.0), Vector(498.0)), Vector(Vector(499.0), Vector(500.0), Vector(501.0))))), s1(s0(Vector(Vector(502.0), Vector(503.0), Vector(504.0)), Vector(Vector(505.0), Vector(506.0), Vector(507.0))), s0(Vector(Vector(508.0), Vector(509.0), Vector(510.0)), Vector(Vector(511.0), Vector(512.0), Vector(513.0)))))), Vector(Vector(s1(s0(Vector(Vector(514.0), Vector(515.0), Vector(516.0)), Vector(Vector(517.0), Vector(518.0), Vector(519.0))), s0(Vector(Vector(520.0), Vector(521.0), Vector(522.0)), Vector(Vector(523.0), Vector(524.0), Vector(525.0))))), Vector(s1(s0(Vector(Vector(526.0), Vector(527.0), Vector(528.0)), Vector(Vector(529.0), Vector(530.0), Vector(531.0))), s0(Vector(Vector(532.0), Vector(533.0), Vector(534.0)), Vector(Vector(535.0), Vector(536.0), Vector(537.0)))))), Vector(Vector(s1(s0(Vector(Vector(538.0), Vector(539.0), Vector(540.0)), Vector(Vector(541.0), Vector(542.0), Vector(543.0))), s0(Vector(Vector(544.0), Vector(545.0), Vector(546.0)), Vector(Vector(547.0), Vector(548.0), Vector(549.0)))))), 550.0, Vector(s0(Vector(Vector(551.0), Vector(552.0), Vector(553.0)), Vector(Vector(554.0), Vector(555.0), Vector(556.0))), s0(Vector(Vector(557.0), Vector(558.0), Vector(559.0)), Vector(Vector(560.0), Vector(561.0), Vector(562.0))), s0(Vector(Vector(563.0), Vector(564.0), Vector(565.0)), Vector(Vector(566.0), Vector(567.0), Vector(568.0)))))), Vector(s5(s4(s0(Vector(Vector(569.0), Vector(570.0), Vector(571.0)), Vector(Vector(572.0), Vector(573.0), Vector(574.0))), s1(s0(Vector(Vector(575.0), Vector(576.0), Vector(577.0)), Vector(Vector(578.0), Vector(579.0), Vector(580.0))), s0(Vector(Vector(581.0), Vector(582.0), Vector(583.0)), Vector(Vector(584.0), Vector(585.0), Vector(586.0))))), Vector(s2(Vector(s1(s0(Vector(Vector(587.0), Vector(588.0), Vector(589.0)), Vector(Vector(590.0), Vector(591.0), Vector(592.0))), s0(Vector(Vector(593.0), Vector(594.0), Vector(595.0)), Vector(Vector(596.0), Vector(597.0), Vector(598.0)))), s1(s0(Vector(Vector(599.0), Vector(600.0), Vector(601.0)), Vector(Vector(602.0), Vector(603.0), Vector(604.0))), s0(Vector(Vector(605.0), Vector(606.0), Vector(607.0)), Vector(Vector(608.0), Vector(609.0), Vector(610.0))))), s1(s0(Vector(Vector(611.0), Vector(612.0), Vector(613.0)), Vector(Vector(614.0), Vector(615.0), Vector(616.0))), s0(Vector(Vector(617.0), Vector(618.0), Vector(619.0)), Vector(Vector(620.0), Vector(621.0), Vector(622.0)))))), Vector(Vector(s1(s0(Vector(Vector(623.0), Vector(624.0), Vector(625.0)), Vector(Vector(626.0), Vector(627.0), Vector(628.0))), s0(Vector(Vector(629.0), Vector(630.0), Vector(631.0)), Vector(Vector(632.0), Vector(633.0), Vector(634.0))))), Vector(s1(s0(Vector(Vector(635.0), Vector(636.0), Vector(637.0)), Vector(Vector(638.0), Vector(639.0), Vector(640.0))), s0(Vector(Vector(641.0), Vector(642.0), Vector(643.0)), Vector(Vector(644.0), Vector(645.0), Vector(646.0)))))), Vector(Vector(s1(s0(Vector(Vector(647.0), Vector(648.0), Vector(649.0)), Vector(Vector(650.0), Vector(651.0), Vector(652.0))), s0(Vector(Vector(653.0), Vector(654.0), Vector(655.0)), Vector(Vector(656.0), Vector(657.0), Vector(658.0)))))), 659.0, Vector(s0(Vector(Vector(660.0), Vector(661.0), Vector(662.0)), Vector(Vector(663.0), Vector(664.0), Vector(665.0))), s0(Vector(Vector(666.0), Vector(667.0), Vector(668.0)), Vector(Vector(669.0), Vector(670.0), Vector(671.0))), s0(Vector(Vector(672.0), Vector(673.0), Vector(674.0)), Vector(Vector(675.0), Vector(676.0), Vector(677.0))))))), Vector(s1(s0(Vector(Vector(678.0), Vector(679.0), Vector(680.0)), Vector(Vector(681.0), Vector(682.0), Vector(683.0))), s0(Vector(Vector(684.0), Vector(685.0), Vector(686.0)), Vector(Vector(687.0), Vector(688.0), Vector(689.0)))))))
    val v1: s2 = s2(Vector(s1(s0(Vector(Vector(690.0), Vector(691.0), Vector(692.0)), Vector(Vector(693.0), Vector(694.0), Vector(695.0))), s0(Vector(Vector(696.0), Vector(697.0), Vector(698.0)), Vector(Vector(699.0), Vector(700.0), Vector(701.0)))), s1(s0(Vector(Vector(702.0), Vector(703.0), Vector(704.0)), Vector(Vector(705.0), Vector(706.0), Vector(707.0))), s0(Vector(Vector(708.0), Vector(709.0), Vector(710.0)), Vector(Vector(711.0), Vector(712.0), Vector(713.0))))), s1(s0(Vector(Vector(714.0), Vector(715.0), Vector(716.0)), Vector(Vector(717.0), Vector(718.0), Vector(719.0))), s0(Vector(Vector(720.0), Vector(721.0), Vector(722.0)), Vector(Vector(723.0), Vector(724.0), Vector(725.0)))))
    val v2: Vector[s0] = Vector(s0(Vector(Vector(726.0), Vector(727.0), Vector(728.0)), Vector(Vector(729.0), Vector(730.0), Vector(731.0))))
    val v3: Double = 732.0
    val start = nanoTime()
    var result: Double = 732.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}