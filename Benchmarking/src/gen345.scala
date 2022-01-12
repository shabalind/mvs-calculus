import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Double],
    p3: Vector[Double]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  case class s2 (
    p0: s1,
    p1: s1,
    p2: s1
  )
  case class s3 (
    p0: Vector[s0],
    p1: s2
  )
  case class s4 (
    p0: Vector[Vector[s0]],
    p1: Vector[s3]
  )
  case class s5 (
    p0: Vector[s2],
    p1: s3
  )
  case class s8 (
    p0: s3,
    p1: s5
  )
  case class s10 (
    p0: s1,
    p1: Vector[s4]
  )
  def f78(v0: s1, v1: Vector[s0]): Vector[s0] = {
    val v2: Vector[s0] = v0.p1
    val v5: s2 = s2(v0, v0, v0)
    val v11: s1 = s1(v1, v2)
    val v8: s1 = v5.p1
    val v18: s1 = v5.p0
    val v28: s2 = s2(v11, v11, v18)
    var v22: s2 = v28
    v22 = v22.copy(p1 = v11)
    val v39: s1 = v22.p2
    val v123: Vector[s0] = v39.p0
    v22 = v22.copy(p0 = v8)
    v22 = v22.copy(p2 = v11)
    v123
  }
  def f71(v0: s2): s2 = {
    var v3: s2 = v0
    val v7: s1 = v3.p1
    val v6: Vector[s0] = v7.p0
    val v5: Vector[s0] = f78(v7, v6)
    val v1: Vector[s0] = f78(v7, v6)
    val v12: s1 = v3.p2
    var v2: s1 = v7
    var v8: Vector[s0] = v6
    v2 = v2.copy(p0 = v8)
    var v16: s1 = v12
    var v18: Vector[s0] = v8
    val v15: s0 = v5(1)
    var v29: s1 = v2
    val v19: s0 = v6(0)
    v3 = v3.copy(p1 = v7)
    var v26: s1 = v2
    val v24: s0 = v18(0)
    v8 = v8.updated(2, v24)
    v18 = v1
    val v22: Vector[s0] = f78(v26, v18)
    val v20: Vector[s0] = f78(v26, v22)
    v2 = v2.copy(p0 = v22)
    val v31: s0 = v18(1)
    val v60: Vector[s0] = v26.p1
    var v34: s2 = v3
    v29 = v29.copy(p0 = v6)
    var v39: s1 = v2
    val v43: Vector[s0] = f78(v26, v18)
    val v47: Vector[s0] = v16.p1
    v26 = v26.copy(p1 = v60)
    val v86: Vector[s0] = f78(v29, v43)
    v34 = v34.copy(p1 = v29)
    var v94: Vector[s0] = v47
    val v68: Vector[s0] = f78(v16, v18)
    v18 = v18.updated(0, v24)
    v3 = v3.copy(p1 = v12)
    val v49: Vector[s0] = f78(v29, v20)
    v18 = v18.updated(1, v15)
    val v50: s1 = v34.p0
    var v103: s1 = v7
    v39 = v103
    v94 = v60
    v8 = v8.updated(2, v31)
    val v75: Vector[s0] = v39.p1
    v29 = v29.copy(p1 = v47)
    v94 = v75
    v2 = v50
    val v281: s2 = s2(v103, v16, v16)
    v34 = v34.copy(p2 = v16)
    v94 = v94.updated(1, v31)
    v94 = v94.updated(0, v19)
    v103 = v103.copy(p1 = v94)
    v8 = v49
    v18 = v18.updated(1, v15)
    v26 = v26.copy(p0 = v68)
    v26 = v26.copy(p1 = v47)
    v29 = v29.copy(p0 = v22)
    v2 = v2.copy(p0 = v86)
    v281
  }
  def f69(v0: s5): s5 = {
    val v2: s3 = v0.p1
    val v6: Vector[s2] = v0.p0
    val v14: s5 = s5(v6, v2)
    v14
  }
  def f63(v0: s0, v1: Vector[s0]): Vector[s0] = {
    val v3: s0 = v1(0)
    var v45: Vector[s0] = v1
    v45 = v45.updated(0, v3)
    var v55: Vector[s0] = v45
    v55
  }
  def f60(v0: s0): s0 = {
    v0
  }
  def f44(v0: s3): s3 = {
    val v5: s2 = v0.p1
    var v4: s2 = v5
    var v6: s3 = v0
    val v3: Vector[s0] = v6.p0
    val v2: s2 = f71(v5)
    val v9: s0 = v3(0)
    val v10: s0 = f60(v9)
    val v8: Vector[s0] = v0.p0
    val v13: s0 = f60(v10)
    val v14: s0 = v8(0)
    v6 = v6.copy(p1 = v4)
    val v15: s1 = v4.p2
    val v18: s0 = v8(0)
    var v29: s2 = v4
    v4 = v4.copy(p0 = v15)
    val v24: s1 = v2.p0
    val v26: s3 = s3(v3, v29)
    val v35: s0 = f60(v9)
    val v20: Vector[s0] = f63(v35, v3)
    var v22: s1 = v15
    val v32: Vector[s0] = v22.p1
    val v34: Vector[s0] = v26.p0
    v6 = v6.copy(p0 = v3)
    val v36: s3 = s3(v20, v2)
    var v62: Vector[s0] = v32
    val v47: Vector[s0] = f63(v18, v34)
    v29 = v29.copy(p1 = v24)
    val v41: Vector[s0] = f63(v13, v47)
    var v37: Vector[s0] = v62
    v29 = v29.copy(p0 = v15)
    v22 = v22.copy(p1 = v37)
    v29 = v29.copy(p1 = v22)
    val v87: s0 = v62(0)
    v37 = v37.updated(1, v87)
    v6 = v36
    v22 = v22.copy(p1 = v32)
    val v93: s3 = s3(v41, v29)
    v37 = v37.updated(0, v14)
    v93
  }
  def f37(v0: Vector[s8]): Vector[s8] = {
    val v5: s8 = v0(0)
    val v3: Vector[Vector[s8]] = Vector(v0, v0, v0, v0)
    val v2: s3 = v5.p0
    var v4: Vector[s8] = v0
    var v8: Vector[Vector[s8]] = v3
    val v1: s5 = v5.p1
    val v10: s5 = f69(v1)
    var v18: Vector[s8] = v4
    val v39: Vector[s8] = v3(2)
    v8 = v8.updated(1, v4)
    val v34: s8 = v0(0)
    val v16: Vector[s8] = v8(1)
    var v21: Vector[s8] = v18
    v21 = v21.updated(0, v5)
    v18 = v18.updated(0, v34)
    v18 = v18.updated(0, v5)
    val v47: s8 = v21(0)
    v4 = v4.updated(0, v47)
    val v32: Vector[s8] = v3(1)
    val v37: s8 = s8(v2, v10)
    v4 = v4.updated(0, v37)
    val v130: Vector[Vector[s8]] = Vector(v0, v18, v32, v32, v16, v32, v39)
    v8 = v8.updated(2, v39)
    v8 = v8.updated(1, v32)
    val v160: Vector[s8] = v130(6)
    v160
  }
  @noinline
  def f0(v0: Vector[s10], v1: Vector[s8], v2: Double): Double = {
    val v5: Vector[s8] = f37(v1)
    val v11: s8 = v5(0)
    val v18: s3 = v11.p0
    val v29: s3 = f44(v18)
    val v36: Vector[s0] = v29.p0
    val v39: s0 = v36(0)
    val v34: Vector[Double] = v39.p2
    val v67: Double = v34(0)
    v67
  }
  def benchmark(): Unit = {
    val v0: Vector[s10] = Vector(s10(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0)), Vector(5.0), Vector(6.0)), s0(Vector(Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0)), Vector(12.0), Vector(13.0)), s0(Vector(Vector(14.0), Vector(15.0)), Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(19.0), Vector(20.0))), Vector(s0(Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0), Vector(24.0), Vector(25.0)), Vector(26.0), Vector(27.0)), s0(Vector(Vector(28.0), Vector(29.0)), Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(33.0), Vector(34.0)))), Vector(s4(Vector(Vector(s0(Vector(Vector(35.0), Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0)), Vector(40.0), Vector(41.0))), Vector(s0(Vector(Vector(42.0), Vector(43.0)), Vector(Vector(44.0), Vector(45.0), Vector(46.0)), Vector(47.0), Vector(48.0))), Vector(s0(Vector(Vector(49.0), Vector(50.0)), Vector(Vector(51.0), Vector(52.0), Vector(53.0)), Vector(54.0), Vector(55.0)))), Vector(s3(Vector(s0(Vector(Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0), Vector(60.0)), Vector(61.0), Vector(62.0))), s2(s1(Vector(s0(Vector(Vector(63.0), Vector(64.0)), Vector(Vector(65.0), Vector(66.0), Vector(67.0)), Vector(68.0), Vector(69.0)), s0(Vector(Vector(70.0), Vector(71.0)), Vector(Vector(72.0), Vector(73.0), Vector(74.0)), Vector(75.0), Vector(76.0)), s0(Vector(Vector(77.0), Vector(78.0)), Vector(Vector(79.0), Vector(80.0), Vector(81.0)), Vector(82.0), Vector(83.0))), Vector(s0(Vector(Vector(84.0), Vector(85.0)), Vector(Vector(86.0), Vector(87.0), Vector(88.0)), Vector(89.0), Vector(90.0)), s0(Vector(Vector(91.0), Vector(92.0)), Vector(Vector(93.0), Vector(94.0), Vector(95.0)), Vector(96.0), Vector(97.0)))), s1(Vector(s0(Vector(Vector(98.0), Vector(99.0)), Vector(Vector(100.0), Vector(101.0), Vector(102.0)), Vector(103.0), Vector(104.0)), s0(Vector(Vector(105.0), Vector(106.0)), Vector(Vector(107.0), Vector(108.0), Vector(109.0)), Vector(110.0), Vector(111.0)), s0(Vector(Vector(112.0), Vector(113.0)), Vector(Vector(114.0), Vector(115.0), Vector(116.0)), Vector(117.0), Vector(118.0))), Vector(s0(Vector(Vector(119.0), Vector(120.0)), Vector(Vector(121.0), Vector(122.0), Vector(123.0)), Vector(124.0), Vector(125.0)), s0(Vector(Vector(126.0), Vector(127.0)), Vector(Vector(128.0), Vector(129.0), Vector(130.0)), Vector(131.0), Vector(132.0)))), s1(Vector(s0(Vector(Vector(133.0), Vector(134.0)), Vector(Vector(135.0), Vector(136.0), Vector(137.0)), Vector(138.0), Vector(139.0)), s0(Vector(Vector(140.0), Vector(141.0)), Vector(Vector(142.0), Vector(143.0), Vector(144.0)), Vector(145.0), Vector(146.0)), s0(Vector(Vector(147.0), Vector(148.0)), Vector(Vector(149.0), Vector(150.0), Vector(151.0)), Vector(152.0), Vector(153.0))), Vector(s0(Vector(Vector(154.0), Vector(155.0)), Vector(Vector(156.0), Vector(157.0), Vector(158.0)), Vector(159.0), Vector(160.0)), s0(Vector(Vector(161.0), Vector(162.0)), Vector(Vector(163.0), Vector(164.0), Vector(165.0)), Vector(166.0), Vector(167.0)))))), s3(Vector(s0(Vector(Vector(168.0), Vector(169.0)), Vector(Vector(170.0), Vector(171.0), Vector(172.0)), Vector(173.0), Vector(174.0))), s2(s1(Vector(s0(Vector(Vector(175.0), Vector(176.0)), Vector(Vector(177.0), Vector(178.0), Vector(179.0)), Vector(180.0), Vector(181.0)), s0(Vector(Vector(182.0), Vector(183.0)), Vector(Vector(184.0), Vector(185.0), Vector(186.0)), Vector(187.0), Vector(188.0)), s0(Vector(Vector(189.0), Vector(190.0)), Vector(Vector(191.0), Vector(192.0), Vector(193.0)), Vector(194.0), Vector(195.0))), Vector(s0(Vector(Vector(196.0), Vector(197.0)), Vector(Vector(198.0), Vector(199.0), Vector(200.0)), Vector(201.0), Vector(202.0)), s0(Vector(Vector(203.0), Vector(204.0)), Vector(Vector(205.0), Vector(206.0), Vector(207.0)), Vector(208.0), Vector(209.0)))), s1(Vector(s0(Vector(Vector(210.0), Vector(211.0)), Vector(Vector(212.0), Vector(213.0), Vector(214.0)), Vector(215.0), Vector(216.0)), s0(Vector(Vector(217.0), Vector(218.0)), Vector(Vector(219.0), Vector(220.0), Vector(221.0)), Vector(222.0), Vector(223.0)), s0(Vector(Vector(224.0), Vector(225.0)), Vector(Vector(226.0), Vector(227.0), Vector(228.0)), Vector(229.0), Vector(230.0))), Vector(s0(Vector(Vector(231.0), Vector(232.0)), Vector(Vector(233.0), Vector(234.0), Vector(235.0)), Vector(236.0), Vector(237.0)), s0(Vector(Vector(238.0), Vector(239.0)), Vector(Vector(240.0), Vector(241.0), Vector(242.0)), Vector(243.0), Vector(244.0)))), s1(Vector(s0(Vector(Vector(245.0), Vector(246.0)), Vector(Vector(247.0), Vector(248.0), Vector(249.0)), Vector(250.0), Vector(251.0)), s0(Vector(Vector(252.0), Vector(253.0)), Vector(Vector(254.0), Vector(255.0), Vector(256.0)), Vector(257.0), Vector(258.0)), s0(Vector(Vector(259.0), Vector(260.0)), Vector(Vector(261.0), Vector(262.0), Vector(263.0)), Vector(264.0), Vector(265.0))), Vector(s0(Vector(Vector(266.0), Vector(267.0)), Vector(Vector(268.0), Vector(269.0), Vector(270.0)), Vector(271.0), Vector(272.0)), s0(Vector(Vector(273.0), Vector(274.0)), Vector(Vector(275.0), Vector(276.0), Vector(277.0)), Vector(278.0), Vector(279.0)))))), s3(Vector(s0(Vector(Vector(280.0), Vector(281.0)), Vector(Vector(282.0), Vector(283.0), Vector(284.0)), Vector(285.0), Vector(286.0))), s2(s1(Vector(s0(Vector(Vector(287.0), Vector(288.0)), Vector(Vector(289.0), Vector(290.0), Vector(291.0)), Vector(292.0), Vector(293.0)), s0(Vector(Vector(294.0), Vector(295.0)), Vector(Vector(296.0), Vector(297.0), Vector(298.0)), Vector(299.0), Vector(300.0)), s0(Vector(Vector(301.0), Vector(302.0)), Vector(Vector(303.0), Vector(304.0), Vector(305.0)), Vector(306.0), Vector(307.0))), Vector(s0(Vector(Vector(308.0), Vector(309.0)), Vector(Vector(310.0), Vector(311.0), Vector(312.0)), Vector(313.0), Vector(314.0)), s0(Vector(Vector(315.0), Vector(316.0)), Vector(Vector(317.0), Vector(318.0), Vector(319.0)), Vector(320.0), Vector(321.0)))), s1(Vector(s0(Vector(Vector(322.0), Vector(323.0)), Vector(Vector(324.0), Vector(325.0), Vector(326.0)), Vector(327.0), Vector(328.0)), s0(Vector(Vector(329.0), Vector(330.0)), Vector(Vector(331.0), Vector(332.0), Vector(333.0)), Vector(334.0), Vector(335.0)), s0(Vector(Vector(336.0), Vector(337.0)), Vector(Vector(338.0), Vector(339.0), Vector(340.0)), Vector(341.0), Vector(342.0))), Vector(s0(Vector(Vector(343.0), Vector(344.0)), Vector(Vector(345.0), Vector(346.0), Vector(347.0)), Vector(348.0), Vector(349.0)), s0(Vector(Vector(350.0), Vector(351.0)), Vector(Vector(352.0), Vector(353.0), Vector(354.0)), Vector(355.0), Vector(356.0)))), s1(Vector(s0(Vector(Vector(357.0), Vector(358.0)), Vector(Vector(359.0), Vector(360.0), Vector(361.0)), Vector(362.0), Vector(363.0)), s0(Vector(Vector(364.0), Vector(365.0)), Vector(Vector(366.0), Vector(367.0), Vector(368.0)), Vector(369.0), Vector(370.0)), s0(Vector(Vector(371.0), Vector(372.0)), Vector(Vector(373.0), Vector(374.0), Vector(375.0)), Vector(376.0), Vector(377.0))), Vector(s0(Vector(Vector(378.0), Vector(379.0)), Vector(Vector(380.0), Vector(381.0), Vector(382.0)), Vector(383.0), Vector(384.0)), s0(Vector(Vector(385.0), Vector(386.0)), Vector(Vector(387.0), Vector(388.0), Vector(389.0)), Vector(390.0), Vector(391.0)))))))), s4(Vector(Vector(s0(Vector(Vector(392.0), Vector(393.0)), Vector(Vector(394.0), Vector(395.0), Vector(396.0)), Vector(397.0), Vector(398.0))), Vector(s0(Vector(Vector(399.0), Vector(400.0)), Vector(Vector(401.0), Vector(402.0), Vector(403.0)), Vector(404.0), Vector(405.0))), Vector(s0(Vector(Vector(406.0), Vector(407.0)), Vector(Vector(408.0), Vector(409.0), Vector(410.0)), Vector(411.0), Vector(412.0)))), Vector(s3(Vector(s0(Vector(Vector(413.0), Vector(414.0)), Vector(Vector(415.0), Vector(416.0), Vector(417.0)), Vector(418.0), Vector(419.0))), s2(s1(Vector(s0(Vector(Vector(420.0), Vector(421.0)), Vector(Vector(422.0), Vector(423.0), Vector(424.0)), Vector(425.0), Vector(426.0)), s0(Vector(Vector(427.0), Vector(428.0)), Vector(Vector(429.0), Vector(430.0), Vector(431.0)), Vector(432.0), Vector(433.0)), s0(Vector(Vector(434.0), Vector(435.0)), Vector(Vector(436.0), Vector(437.0), Vector(438.0)), Vector(439.0), Vector(440.0))), Vector(s0(Vector(Vector(441.0), Vector(442.0)), Vector(Vector(443.0), Vector(444.0), Vector(445.0)), Vector(446.0), Vector(447.0)), s0(Vector(Vector(448.0), Vector(449.0)), Vector(Vector(450.0), Vector(451.0), Vector(452.0)), Vector(453.0), Vector(454.0)))), s1(Vector(s0(Vector(Vector(455.0), Vector(456.0)), Vector(Vector(457.0), Vector(458.0), Vector(459.0)), Vector(460.0), Vector(461.0)), s0(Vector(Vector(462.0), Vector(463.0)), Vector(Vector(464.0), Vector(465.0), Vector(466.0)), Vector(467.0), Vector(468.0)), s0(Vector(Vector(469.0), Vector(470.0)), Vector(Vector(471.0), Vector(472.0), Vector(473.0)), Vector(474.0), Vector(475.0))), Vector(s0(Vector(Vector(476.0), Vector(477.0)), Vector(Vector(478.0), Vector(479.0), Vector(480.0)), Vector(481.0), Vector(482.0)), s0(Vector(Vector(483.0), Vector(484.0)), Vector(Vector(485.0), Vector(486.0), Vector(487.0)), Vector(488.0), Vector(489.0)))), s1(Vector(s0(Vector(Vector(490.0), Vector(491.0)), Vector(Vector(492.0), Vector(493.0), Vector(494.0)), Vector(495.0), Vector(496.0)), s0(Vector(Vector(497.0), Vector(498.0)), Vector(Vector(499.0), Vector(500.0), Vector(501.0)), Vector(502.0), Vector(503.0)), s0(Vector(Vector(504.0), Vector(505.0)), Vector(Vector(506.0), Vector(507.0), Vector(508.0)), Vector(509.0), Vector(510.0))), Vector(s0(Vector(Vector(511.0), Vector(512.0)), Vector(Vector(513.0), Vector(514.0), Vector(515.0)), Vector(516.0), Vector(517.0)), s0(Vector(Vector(518.0), Vector(519.0)), Vector(Vector(520.0), Vector(521.0), Vector(522.0)), Vector(523.0), Vector(524.0)))))), s3(Vector(s0(Vector(Vector(525.0), Vector(526.0)), Vector(Vector(527.0), Vector(528.0), Vector(529.0)), Vector(530.0), Vector(531.0))), s2(s1(Vector(s0(Vector(Vector(532.0), Vector(533.0)), Vector(Vector(534.0), Vector(535.0), Vector(536.0)), Vector(537.0), Vector(538.0)), s0(Vector(Vector(539.0), Vector(540.0)), Vector(Vector(541.0), Vector(542.0), Vector(543.0)), Vector(544.0), Vector(545.0)), s0(Vector(Vector(546.0), Vector(547.0)), Vector(Vector(548.0), Vector(549.0), Vector(550.0)), Vector(551.0), Vector(552.0))), Vector(s0(Vector(Vector(553.0), Vector(554.0)), Vector(Vector(555.0), Vector(556.0), Vector(557.0)), Vector(558.0), Vector(559.0)), s0(Vector(Vector(560.0), Vector(561.0)), Vector(Vector(562.0), Vector(563.0), Vector(564.0)), Vector(565.0), Vector(566.0)))), s1(Vector(s0(Vector(Vector(567.0), Vector(568.0)), Vector(Vector(569.0), Vector(570.0), Vector(571.0)), Vector(572.0), Vector(573.0)), s0(Vector(Vector(574.0), Vector(575.0)), Vector(Vector(576.0), Vector(577.0), Vector(578.0)), Vector(579.0), Vector(580.0)), s0(Vector(Vector(581.0), Vector(582.0)), Vector(Vector(583.0), Vector(584.0), Vector(585.0)), Vector(586.0), Vector(587.0))), Vector(s0(Vector(Vector(588.0), Vector(589.0)), Vector(Vector(590.0), Vector(591.0), Vector(592.0)), Vector(593.0), Vector(594.0)), s0(Vector(Vector(595.0), Vector(596.0)), Vector(Vector(597.0), Vector(598.0), Vector(599.0)), Vector(600.0), Vector(601.0)))), s1(Vector(s0(Vector(Vector(602.0), Vector(603.0)), Vector(Vector(604.0), Vector(605.0), Vector(606.0)), Vector(607.0), Vector(608.0)), s0(Vector(Vector(609.0), Vector(610.0)), Vector(Vector(611.0), Vector(612.0), Vector(613.0)), Vector(614.0), Vector(615.0)), s0(Vector(Vector(616.0), Vector(617.0)), Vector(Vector(618.0), Vector(619.0), Vector(620.0)), Vector(621.0), Vector(622.0))), Vector(s0(Vector(Vector(623.0), Vector(624.0)), Vector(Vector(625.0), Vector(626.0), Vector(627.0)), Vector(628.0), Vector(629.0)), s0(Vector(Vector(630.0), Vector(631.0)), Vector(Vector(632.0), Vector(633.0), Vector(634.0)), Vector(635.0), Vector(636.0)))))), s3(Vector(s0(Vector(Vector(637.0), Vector(638.0)), Vector(Vector(639.0), Vector(640.0), Vector(641.0)), Vector(642.0), Vector(643.0))), s2(s1(Vector(s0(Vector(Vector(644.0), Vector(645.0)), Vector(Vector(646.0), Vector(647.0), Vector(648.0)), Vector(649.0), Vector(650.0)), s0(Vector(Vector(651.0), Vector(652.0)), Vector(Vector(653.0), Vector(654.0), Vector(655.0)), Vector(656.0), Vector(657.0)), s0(Vector(Vector(658.0), Vector(659.0)), Vector(Vector(660.0), Vector(661.0), Vector(662.0)), Vector(663.0), Vector(664.0))), Vector(s0(Vector(Vector(665.0), Vector(666.0)), Vector(Vector(667.0), Vector(668.0), Vector(669.0)), Vector(670.0), Vector(671.0)), s0(Vector(Vector(672.0), Vector(673.0)), Vector(Vector(674.0), Vector(675.0), Vector(676.0)), Vector(677.0), Vector(678.0)))), s1(Vector(s0(Vector(Vector(679.0), Vector(680.0)), Vector(Vector(681.0), Vector(682.0), Vector(683.0)), Vector(684.0), Vector(685.0)), s0(Vector(Vector(686.0), Vector(687.0)), Vector(Vector(688.0), Vector(689.0), Vector(690.0)), Vector(691.0), Vector(692.0)), s0(Vector(Vector(693.0), Vector(694.0)), Vector(Vector(695.0), Vector(696.0), Vector(697.0)), Vector(698.0), Vector(699.0))), Vector(s0(Vector(Vector(700.0), Vector(701.0)), Vector(Vector(702.0), Vector(703.0), Vector(704.0)), Vector(705.0), Vector(706.0)), s0(Vector(Vector(707.0), Vector(708.0)), Vector(Vector(709.0), Vector(710.0), Vector(711.0)), Vector(712.0), Vector(713.0)))), s1(Vector(s0(Vector(Vector(714.0), Vector(715.0)), Vector(Vector(716.0), Vector(717.0), Vector(718.0)), Vector(719.0), Vector(720.0)), s0(Vector(Vector(721.0), Vector(722.0)), Vector(Vector(723.0), Vector(724.0), Vector(725.0)), Vector(726.0), Vector(727.0)), s0(Vector(Vector(728.0), Vector(729.0)), Vector(Vector(730.0), Vector(731.0), Vector(732.0)), Vector(733.0), Vector(734.0))), Vector(s0(Vector(Vector(735.0), Vector(736.0)), Vector(Vector(737.0), Vector(738.0), Vector(739.0)), Vector(740.0), Vector(741.0)), s0(Vector(Vector(742.0), Vector(743.0)), Vector(Vector(744.0), Vector(745.0), Vector(746.0)), Vector(747.0), Vector(748.0)))))))), s4(Vector(Vector(s0(Vector(Vector(749.0), Vector(750.0)), Vector(Vector(751.0), Vector(752.0), Vector(753.0)), Vector(754.0), Vector(755.0))), Vector(s0(Vector(Vector(756.0), Vector(757.0)), Vector(Vector(758.0), Vector(759.0), Vector(760.0)), Vector(761.0), Vector(762.0))), Vector(s0(Vector(Vector(763.0), Vector(764.0)), Vector(Vector(765.0), Vector(766.0), Vector(767.0)), Vector(768.0), Vector(769.0)))), Vector(s3(Vector(s0(Vector(Vector(770.0), Vector(771.0)), Vector(Vector(772.0), Vector(773.0), Vector(774.0)), Vector(775.0), Vector(776.0))), s2(s1(Vector(s0(Vector(Vector(777.0), Vector(778.0)), Vector(Vector(779.0), Vector(780.0), Vector(781.0)), Vector(782.0), Vector(783.0)), s0(Vector(Vector(784.0), Vector(785.0)), Vector(Vector(786.0), Vector(787.0), Vector(788.0)), Vector(789.0), Vector(790.0)), s0(Vector(Vector(791.0), Vector(792.0)), Vector(Vector(793.0), Vector(794.0), Vector(795.0)), Vector(796.0), Vector(797.0))), Vector(s0(Vector(Vector(798.0), Vector(799.0)), Vector(Vector(800.0), Vector(801.0), Vector(802.0)), Vector(803.0), Vector(804.0)), s0(Vector(Vector(805.0), Vector(806.0)), Vector(Vector(807.0), Vector(808.0), Vector(809.0)), Vector(810.0), Vector(811.0)))), s1(Vector(s0(Vector(Vector(812.0), Vector(813.0)), Vector(Vector(814.0), Vector(815.0), Vector(816.0)), Vector(817.0), Vector(818.0)), s0(Vector(Vector(819.0), Vector(820.0)), Vector(Vector(821.0), Vector(822.0), Vector(823.0)), Vector(824.0), Vector(825.0)), s0(Vector(Vector(826.0), Vector(827.0)), Vector(Vector(828.0), Vector(829.0), Vector(830.0)), Vector(831.0), Vector(832.0))), Vector(s0(Vector(Vector(833.0), Vector(834.0)), Vector(Vector(835.0), Vector(836.0), Vector(837.0)), Vector(838.0), Vector(839.0)), s0(Vector(Vector(840.0), Vector(841.0)), Vector(Vector(842.0), Vector(843.0), Vector(844.0)), Vector(845.0), Vector(846.0)))), s1(Vector(s0(Vector(Vector(847.0), Vector(848.0)), Vector(Vector(849.0), Vector(850.0), Vector(851.0)), Vector(852.0), Vector(853.0)), s0(Vector(Vector(854.0), Vector(855.0)), Vector(Vector(856.0), Vector(857.0), Vector(858.0)), Vector(859.0), Vector(860.0)), s0(Vector(Vector(861.0), Vector(862.0)), Vector(Vector(863.0), Vector(864.0), Vector(865.0)), Vector(866.0), Vector(867.0))), Vector(s0(Vector(Vector(868.0), Vector(869.0)), Vector(Vector(870.0), Vector(871.0), Vector(872.0)), Vector(873.0), Vector(874.0)), s0(Vector(Vector(875.0), Vector(876.0)), Vector(Vector(877.0), Vector(878.0), Vector(879.0)), Vector(880.0), Vector(881.0)))))), s3(Vector(s0(Vector(Vector(882.0), Vector(883.0)), Vector(Vector(884.0), Vector(885.0), Vector(886.0)), Vector(887.0), Vector(888.0))), s2(s1(Vector(s0(Vector(Vector(889.0), Vector(890.0)), Vector(Vector(891.0), Vector(892.0), Vector(893.0)), Vector(894.0), Vector(895.0)), s0(Vector(Vector(896.0), Vector(897.0)), Vector(Vector(898.0), Vector(899.0), Vector(900.0)), Vector(901.0), Vector(902.0)), s0(Vector(Vector(903.0), Vector(904.0)), Vector(Vector(905.0), Vector(906.0), Vector(907.0)), Vector(908.0), Vector(909.0))), Vector(s0(Vector(Vector(910.0), Vector(911.0)), Vector(Vector(912.0), Vector(913.0), Vector(914.0)), Vector(915.0), Vector(916.0)), s0(Vector(Vector(917.0), Vector(918.0)), Vector(Vector(919.0), Vector(920.0), Vector(921.0)), Vector(922.0), Vector(923.0)))), s1(Vector(s0(Vector(Vector(924.0), Vector(925.0)), Vector(Vector(926.0), Vector(927.0), Vector(928.0)), Vector(929.0), Vector(930.0)), s0(Vector(Vector(931.0), Vector(932.0)), Vector(Vector(933.0), Vector(934.0), Vector(935.0)), Vector(936.0), Vector(937.0)), s0(Vector(Vector(938.0), Vector(939.0)), Vector(Vector(940.0), Vector(941.0), Vector(942.0)), Vector(943.0), Vector(944.0))), Vector(s0(Vector(Vector(945.0), Vector(946.0)), Vector(Vector(947.0), Vector(948.0), Vector(949.0)), Vector(950.0), Vector(951.0)), s0(Vector(Vector(952.0), Vector(953.0)), Vector(Vector(954.0), Vector(955.0), Vector(956.0)), Vector(957.0), Vector(958.0)))), s1(Vector(s0(Vector(Vector(959.0), Vector(960.0)), Vector(Vector(961.0), Vector(962.0), Vector(963.0)), Vector(964.0), Vector(965.0)), s0(Vector(Vector(966.0), Vector(967.0)), Vector(Vector(968.0), Vector(969.0), Vector(970.0)), Vector(971.0), Vector(972.0)), s0(Vector(Vector(973.0), Vector(974.0)), Vector(Vector(975.0), Vector(976.0), Vector(977.0)), Vector(978.0), Vector(979.0))), Vector(s0(Vector(Vector(980.0), Vector(981.0)), Vector(Vector(982.0), Vector(983.0), Vector(984.0)), Vector(985.0), Vector(986.0)), s0(Vector(Vector(987.0), Vector(988.0)), Vector(Vector(989.0), Vector(990.0), Vector(991.0)), Vector(992.0), Vector(993.0)))))), s3(Vector(s0(Vector(Vector(994.0), Vector(995.0)), Vector(Vector(996.0), Vector(997.0), Vector(998.0)), Vector(999.0), Vector(1000.0))), s2(s1(Vector(s0(Vector(Vector(1001.0), Vector(1002.0)), Vector(Vector(1003.0), Vector(1004.0), Vector(1005.0)), Vector(1006.0), Vector(1007.0)), s0(Vector(Vector(1008.0), Vector(1009.0)), Vector(Vector(1010.0), Vector(1011.0), Vector(1012.0)), Vector(1013.0), Vector(1014.0)), s0(Vector(Vector(1015.0), Vector(1016.0)), Vector(Vector(1017.0), Vector(1018.0), Vector(1019.0)), Vector(1020.0), Vector(1021.0))), Vector(s0(Vector(Vector(1022.0), Vector(1023.0)), Vector(Vector(1024.0), Vector(1025.0), Vector(1026.0)), Vector(1027.0), Vector(1028.0)), s0(Vector(Vector(1029.0), Vector(1030.0)), Vector(Vector(1031.0), Vector(1032.0), Vector(1033.0)), Vector(1034.0), Vector(1035.0)))), s1(Vector(s0(Vector(Vector(1036.0), Vector(1037.0)), Vector(Vector(1038.0), Vector(1039.0), Vector(1040.0)), Vector(1041.0), Vector(1042.0)), s0(Vector(Vector(1043.0), Vector(1044.0)), Vector(Vector(1045.0), Vector(1046.0), Vector(1047.0)), Vector(1048.0), Vector(1049.0)), s0(Vector(Vector(1050.0), Vector(1051.0)), Vector(Vector(1052.0), Vector(1053.0), Vector(1054.0)), Vector(1055.0), Vector(1056.0))), Vector(s0(Vector(Vector(1057.0), Vector(1058.0)), Vector(Vector(1059.0), Vector(1060.0), Vector(1061.0)), Vector(1062.0), Vector(1063.0)), s0(Vector(Vector(1064.0), Vector(1065.0)), Vector(Vector(1066.0), Vector(1067.0), Vector(1068.0)), Vector(1069.0), Vector(1070.0)))), s1(Vector(s0(Vector(Vector(1071.0), Vector(1072.0)), Vector(Vector(1073.0), Vector(1074.0), Vector(1075.0)), Vector(1076.0), Vector(1077.0)), s0(Vector(Vector(1078.0), Vector(1079.0)), Vector(Vector(1080.0), Vector(1081.0), Vector(1082.0)), Vector(1083.0), Vector(1084.0)), s0(Vector(Vector(1085.0), Vector(1086.0)), Vector(Vector(1087.0), Vector(1088.0), Vector(1089.0)), Vector(1090.0), Vector(1091.0))), Vector(s0(Vector(Vector(1092.0), Vector(1093.0)), Vector(Vector(1094.0), Vector(1095.0), Vector(1096.0)), Vector(1097.0), Vector(1098.0)), s0(Vector(Vector(1099.0), Vector(1100.0)), Vector(Vector(1101.0), Vector(1102.0), Vector(1103.0)), Vector(1104.0), Vector(1105.0)))))))))))
    val v1: Vector[s8] = Vector(s8(s3(Vector(s0(Vector(Vector(1106.0), Vector(1107.0)), Vector(Vector(1108.0), Vector(1109.0), Vector(1110.0)), Vector(1111.0), Vector(1112.0))), s2(s1(Vector(s0(Vector(Vector(1113.0), Vector(1114.0)), Vector(Vector(1115.0), Vector(1116.0), Vector(1117.0)), Vector(1118.0), Vector(1119.0)), s0(Vector(Vector(1120.0), Vector(1121.0)), Vector(Vector(1122.0), Vector(1123.0), Vector(1124.0)), Vector(1125.0), Vector(1126.0)), s0(Vector(Vector(1127.0), Vector(1128.0)), Vector(Vector(1129.0), Vector(1130.0), Vector(1131.0)), Vector(1132.0), Vector(1133.0))), Vector(s0(Vector(Vector(1134.0), Vector(1135.0)), Vector(Vector(1136.0), Vector(1137.0), Vector(1138.0)), Vector(1139.0), Vector(1140.0)), s0(Vector(Vector(1141.0), Vector(1142.0)), Vector(Vector(1143.0), Vector(1144.0), Vector(1145.0)), Vector(1146.0), Vector(1147.0)))), s1(Vector(s0(Vector(Vector(1148.0), Vector(1149.0)), Vector(Vector(1150.0), Vector(1151.0), Vector(1152.0)), Vector(1153.0), Vector(1154.0)), s0(Vector(Vector(1155.0), Vector(1156.0)), Vector(Vector(1157.0), Vector(1158.0), Vector(1159.0)), Vector(1160.0), Vector(1161.0)), s0(Vector(Vector(1162.0), Vector(1163.0)), Vector(Vector(1164.0), Vector(1165.0), Vector(1166.0)), Vector(1167.0), Vector(1168.0))), Vector(s0(Vector(Vector(1169.0), Vector(1170.0)), Vector(Vector(1171.0), Vector(1172.0), Vector(1173.0)), Vector(1174.0), Vector(1175.0)), s0(Vector(Vector(1176.0), Vector(1177.0)), Vector(Vector(1178.0), Vector(1179.0), Vector(1180.0)), Vector(1181.0), Vector(1182.0)))), s1(Vector(s0(Vector(Vector(1183.0), Vector(1184.0)), Vector(Vector(1185.0), Vector(1186.0), Vector(1187.0)), Vector(1188.0), Vector(1189.0)), s0(Vector(Vector(1190.0), Vector(1191.0)), Vector(Vector(1192.0), Vector(1193.0), Vector(1194.0)), Vector(1195.0), Vector(1196.0)), s0(Vector(Vector(1197.0), Vector(1198.0)), Vector(Vector(1199.0), Vector(1200.0), Vector(1201.0)), Vector(1202.0), Vector(1203.0))), Vector(s0(Vector(Vector(1204.0), Vector(1205.0)), Vector(Vector(1206.0), Vector(1207.0), Vector(1208.0)), Vector(1209.0), Vector(1210.0)), s0(Vector(Vector(1211.0), Vector(1212.0)), Vector(Vector(1213.0), Vector(1214.0), Vector(1215.0)), Vector(1216.0), Vector(1217.0)))))), s5(Vector(s2(s1(Vector(s0(Vector(Vector(1218.0), Vector(1219.0)), Vector(Vector(1220.0), Vector(1221.0), Vector(1222.0)), Vector(1223.0), Vector(1224.0)), s0(Vector(Vector(1225.0), Vector(1226.0)), Vector(Vector(1227.0), Vector(1228.0), Vector(1229.0)), Vector(1230.0), Vector(1231.0)), s0(Vector(Vector(1232.0), Vector(1233.0)), Vector(Vector(1234.0), Vector(1235.0), Vector(1236.0)), Vector(1237.0), Vector(1238.0))), Vector(s0(Vector(Vector(1239.0), Vector(1240.0)), Vector(Vector(1241.0), Vector(1242.0), Vector(1243.0)), Vector(1244.0), Vector(1245.0)), s0(Vector(Vector(1246.0), Vector(1247.0)), Vector(Vector(1248.0), Vector(1249.0), Vector(1250.0)), Vector(1251.0), Vector(1252.0)))), s1(Vector(s0(Vector(Vector(1253.0), Vector(1254.0)), Vector(Vector(1255.0), Vector(1256.0), Vector(1257.0)), Vector(1258.0), Vector(1259.0)), s0(Vector(Vector(1260.0), Vector(1261.0)), Vector(Vector(1262.0), Vector(1263.0), Vector(1264.0)), Vector(1265.0), Vector(1266.0)), s0(Vector(Vector(1267.0), Vector(1268.0)), Vector(Vector(1269.0), Vector(1270.0), Vector(1271.0)), Vector(1272.0), Vector(1273.0))), Vector(s0(Vector(Vector(1274.0), Vector(1275.0)), Vector(Vector(1276.0), Vector(1277.0), Vector(1278.0)), Vector(1279.0), Vector(1280.0)), s0(Vector(Vector(1281.0), Vector(1282.0)), Vector(Vector(1283.0), Vector(1284.0), Vector(1285.0)), Vector(1286.0), Vector(1287.0)))), s1(Vector(s0(Vector(Vector(1288.0), Vector(1289.0)), Vector(Vector(1290.0), Vector(1291.0), Vector(1292.0)), Vector(1293.0), Vector(1294.0)), s0(Vector(Vector(1295.0), Vector(1296.0)), Vector(Vector(1297.0), Vector(1298.0), Vector(1299.0)), Vector(1300.0), Vector(1301.0)), s0(Vector(Vector(1302.0), Vector(1303.0)), Vector(Vector(1304.0), Vector(1305.0), Vector(1306.0)), Vector(1307.0), Vector(1308.0))), Vector(s0(Vector(Vector(1309.0), Vector(1310.0)), Vector(Vector(1311.0), Vector(1312.0), Vector(1313.0)), Vector(1314.0), Vector(1315.0)), s0(Vector(Vector(1316.0), Vector(1317.0)), Vector(Vector(1318.0), Vector(1319.0), Vector(1320.0)), Vector(1321.0), Vector(1322.0)))))), s3(Vector(s0(Vector(Vector(1323.0), Vector(1324.0)), Vector(Vector(1325.0), Vector(1326.0), Vector(1327.0)), Vector(1328.0), Vector(1329.0))), s2(s1(Vector(s0(Vector(Vector(1330.0), Vector(1331.0)), Vector(Vector(1332.0), Vector(1333.0), Vector(1334.0)), Vector(1335.0), Vector(1336.0)), s0(Vector(Vector(1337.0), Vector(1338.0)), Vector(Vector(1339.0), Vector(1340.0), Vector(1341.0)), Vector(1342.0), Vector(1343.0)), s0(Vector(Vector(1344.0), Vector(1345.0)), Vector(Vector(1346.0), Vector(1347.0), Vector(1348.0)), Vector(1349.0), Vector(1350.0))), Vector(s0(Vector(Vector(1351.0), Vector(1352.0)), Vector(Vector(1353.0), Vector(1354.0), Vector(1355.0)), Vector(1356.0), Vector(1357.0)), s0(Vector(Vector(1358.0), Vector(1359.0)), Vector(Vector(1360.0), Vector(1361.0), Vector(1362.0)), Vector(1363.0), Vector(1364.0)))), s1(Vector(s0(Vector(Vector(1365.0), Vector(1366.0)), Vector(Vector(1367.0), Vector(1368.0), Vector(1369.0)), Vector(1370.0), Vector(1371.0)), s0(Vector(Vector(1372.0), Vector(1373.0)), Vector(Vector(1374.0), Vector(1375.0), Vector(1376.0)), Vector(1377.0), Vector(1378.0)), s0(Vector(Vector(1379.0), Vector(1380.0)), Vector(Vector(1381.0), Vector(1382.0), Vector(1383.0)), Vector(1384.0), Vector(1385.0))), Vector(s0(Vector(Vector(1386.0), Vector(1387.0)), Vector(Vector(1388.0), Vector(1389.0), Vector(1390.0)), Vector(1391.0), Vector(1392.0)), s0(Vector(Vector(1393.0), Vector(1394.0)), Vector(Vector(1395.0), Vector(1396.0), Vector(1397.0)), Vector(1398.0), Vector(1399.0)))), s1(Vector(s0(Vector(Vector(1400.0), Vector(1401.0)), Vector(Vector(1402.0), Vector(1403.0), Vector(1404.0)), Vector(1405.0), Vector(1406.0)), s0(Vector(Vector(1407.0), Vector(1408.0)), Vector(Vector(1409.0), Vector(1410.0), Vector(1411.0)), Vector(1412.0), Vector(1413.0)), s0(Vector(Vector(1414.0), Vector(1415.0)), Vector(Vector(1416.0), Vector(1417.0), Vector(1418.0)), Vector(1419.0), Vector(1420.0))), Vector(s0(Vector(Vector(1421.0), Vector(1422.0)), Vector(Vector(1423.0), Vector(1424.0), Vector(1425.0)), Vector(1426.0), Vector(1427.0)), s0(Vector(Vector(1428.0), Vector(1429.0)), Vector(Vector(1430.0), Vector(1431.0), Vector(1432.0)), Vector(1433.0), Vector(1434.0)))))))))
    val v2: Double = 1435.0
    val start = nanoTime()
    var result: Double = 1435.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}