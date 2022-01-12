import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: s0,
    p2: s0,
    p3: s0,
    p4: s0,
    p5: Vector[Vector[s0]],
    p6: Vector[s0],
    p7: s0
  )
  case class s2 (
    p0: s1,
    p1: Vector[Vector[Double]]
  )
  case class s4 (
    p0: Vector[Vector[s1]],
    p1: s1
  )
  case class s5 (
    p0: s4,
    p1: s2,
    p2: Vector[s4],
    p3: s0
  )
  case class s6 (
    p0: s4,
    p1: Vector[Vector[s2]]
  )
  case class s7 (
    p0: Vector[Vector[s6]],
    p1: Vector[s5]
  )
  def f21(v0: s4, v1: s0): s0 = {
    val v7: Vector[s0] = Vector(v1, v1, v1, v1, v1, v1, v1)
    val v3: Vector[Vector[Double]] = v1.p0
    val v6: Vector[Vector[Double]] = v1.p0
    val v2: s0 = v7(6)
    var v5: Vector[Vector[Double]] = v3
    var v9: Vector[Vector[Double]] = v3
    val v4: s0 = v7(1)
    val v17: Vector[Vector[Double]] = v4.p0
    val v11: s0 = s0(v9)
    val v12: Vector[Double] = v6(1)
    val v10: s1 = v0.p1
    val v30: Vector[Double] = v3(0)
    val v24: Vector[Double] = v9(0)
    var v18: Vector[Double] = v24
    var v25: Vector[Double] = v30
    v5 = v5.updated(1, v25)
    var v34: s0 = v11
    v34 = v34.copy(p0 = v3)
    val v46: s0 = v10.p1
    val v27: Vector[Vector[Double]] = v2.p0
    var v36: Vector[s0] = v7
    v34 = v34.copy(p0 = v27)
    v25 = v12
    val v64: Double = v25(0)
    v36 = v36.updated(0, v2)
    v34 = v34.copy(p0 = v5)
    v34 = v34.copy(p0 = v17)
    v34 = v2
    v36 = v36.updated(0, v46)
    v36 = v36.updated(6, v34)
    val v54: Vector[Vector[Double]] = v1.p0
    val v80: Double = v30(0)
    v5 = v5.updated(0, v18)
    v34 = v34.copy(p0 = v54)
    var v40: Double = v80
    v34 = v4
    v40 = v64
    v25 = v25.updated(0, v80)
    v25 = v25.updated(0, v64)
    v34 = v34.copy(p0 = v27)
    v25 = v25.updated(0, v40)
    v34 = v34.copy(p0 = v54)
    var v61: Vector[s0] = v36
    val v79: s0 = v61(3)
    v25 = v25.updated(0, v80)
    v9 = v9.updated(1, v25)
    v79
  }
  @noinline
  def f0(v0: s4, v1: Vector[s7], v2: Double): Double = {
    val v6: s1 = v0.p1
    val v7: s7 = v1(1)
    val v3: s1 = v0.p1
    val v15: s0 = v6.p1
    val v22: s0 = f21(v0, v15)
    val v13: s0 = f21(v0, v22)
    val v34: Vector[Vector[s6]] = v7.p0
    val v36: Vector[s6] = v34(0)
    val v130: s6 = v36(0)
    val v43: Vector[Vector[s1]] = v0.p0
    var v86: s4 = v0
    val v44: s0 = f21(v86, v13)
    v86 = v86.copy(p0 = v43)
    val v58: s4 = v130.p0
    val v68: s0 = f21(v58, v44)
    v86 = v86.copy(p1 = v3)
    v86 = v86.copy(p0 = v43)
    val v93: Vector[Vector[Double]] = v68.p0
    val v193: Vector[Double] = v93(1)
    val v191: Double = v193(0)
    v191
  }
  def benchmark(): Unit = {
    val v0: s4 = s4(Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0)))), Vector(s0(Vector(Vector(2.0), Vector(3.0))))), s0(Vector(Vector(4.0), Vector(5.0))), s0(Vector(Vector(6.0), Vector(7.0))), s0(Vector(Vector(8.0), Vector(9.0))), s0(Vector(Vector(10.0), Vector(11.0))), Vector(Vector(s0(Vector(Vector(12.0), Vector(13.0))))), Vector(s0(Vector(Vector(14.0), Vector(15.0))), s0(Vector(Vector(16.0), Vector(17.0)))), s0(Vector(Vector(18.0), Vector(19.0))))), Vector(s1(Vector(Vector(s0(Vector(Vector(20.0), Vector(21.0)))), Vector(s0(Vector(Vector(22.0), Vector(23.0))))), s0(Vector(Vector(24.0), Vector(25.0))), s0(Vector(Vector(26.0), Vector(27.0))), s0(Vector(Vector(28.0), Vector(29.0))), s0(Vector(Vector(30.0), Vector(31.0))), Vector(Vector(s0(Vector(Vector(32.0), Vector(33.0))))), Vector(s0(Vector(Vector(34.0), Vector(35.0))), s0(Vector(Vector(36.0), Vector(37.0)))), s0(Vector(Vector(38.0), Vector(39.0)))))), s1(Vector(Vector(s0(Vector(Vector(40.0), Vector(41.0)))), Vector(s0(Vector(Vector(42.0), Vector(43.0))))), s0(Vector(Vector(44.0), Vector(45.0))), s0(Vector(Vector(46.0), Vector(47.0))), s0(Vector(Vector(48.0), Vector(49.0))), s0(Vector(Vector(50.0), Vector(51.0))), Vector(Vector(s0(Vector(Vector(52.0), Vector(53.0))))), Vector(s0(Vector(Vector(54.0), Vector(55.0))), s0(Vector(Vector(56.0), Vector(57.0)))), s0(Vector(Vector(58.0), Vector(59.0)))))
    val v1: Vector[s7] = Vector(s7(Vector(Vector(s6(s4(Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(60.0), Vector(61.0)))), Vector(s0(Vector(Vector(62.0), Vector(63.0))))), s0(Vector(Vector(64.0), Vector(65.0))), s0(Vector(Vector(66.0), Vector(67.0))), s0(Vector(Vector(68.0), Vector(69.0))), s0(Vector(Vector(70.0), Vector(71.0))), Vector(Vector(s0(Vector(Vector(72.0), Vector(73.0))))), Vector(s0(Vector(Vector(74.0), Vector(75.0))), s0(Vector(Vector(76.0), Vector(77.0)))), s0(Vector(Vector(78.0), Vector(79.0))))), Vector(s1(Vector(Vector(s0(Vector(Vector(80.0), Vector(81.0)))), Vector(s0(Vector(Vector(82.0), Vector(83.0))))), s0(Vector(Vector(84.0), Vector(85.0))), s0(Vector(Vector(86.0), Vector(87.0))), s0(Vector(Vector(88.0), Vector(89.0))), s0(Vector(Vector(90.0), Vector(91.0))), Vector(Vector(s0(Vector(Vector(92.0), Vector(93.0))))), Vector(s0(Vector(Vector(94.0), Vector(95.0))), s0(Vector(Vector(96.0), Vector(97.0)))), s0(Vector(Vector(98.0), Vector(99.0)))))), s1(Vector(Vector(s0(Vector(Vector(100.0), Vector(101.0)))), Vector(s0(Vector(Vector(102.0), Vector(103.0))))), s0(Vector(Vector(104.0), Vector(105.0))), s0(Vector(Vector(106.0), Vector(107.0))), s0(Vector(Vector(108.0), Vector(109.0))), s0(Vector(Vector(110.0), Vector(111.0))), Vector(Vector(s0(Vector(Vector(112.0), Vector(113.0))))), Vector(s0(Vector(Vector(114.0), Vector(115.0))), s0(Vector(Vector(116.0), Vector(117.0)))), s0(Vector(Vector(118.0), Vector(119.0))))), Vector(Vector(s2(s1(Vector(Vector(s0(Vector(Vector(120.0), Vector(121.0)))), Vector(s0(Vector(Vector(122.0), Vector(123.0))))), s0(Vector(Vector(124.0), Vector(125.0))), s0(Vector(Vector(126.0), Vector(127.0))), s0(Vector(Vector(128.0), Vector(129.0))), s0(Vector(Vector(130.0), Vector(131.0))), Vector(Vector(s0(Vector(Vector(132.0), Vector(133.0))))), Vector(s0(Vector(Vector(134.0), Vector(135.0))), s0(Vector(Vector(136.0), Vector(137.0)))), s0(Vector(Vector(138.0), Vector(139.0)))), Vector(Vector(140.0)))), Vector(s2(s1(Vector(Vector(s0(Vector(Vector(141.0), Vector(142.0)))), Vector(s0(Vector(Vector(143.0), Vector(144.0))))), s0(Vector(Vector(145.0), Vector(146.0))), s0(Vector(Vector(147.0), Vector(148.0))), s0(Vector(Vector(149.0), Vector(150.0))), s0(Vector(Vector(151.0), Vector(152.0))), Vector(Vector(s0(Vector(Vector(153.0), Vector(154.0))))), Vector(s0(Vector(Vector(155.0), Vector(156.0))), s0(Vector(Vector(157.0), Vector(158.0)))), s0(Vector(Vector(159.0), Vector(160.0)))), Vector(Vector(161.0)))), Vector(s2(s1(Vector(Vector(s0(Vector(Vector(162.0), Vector(163.0)))), Vector(s0(Vector(Vector(164.0), Vector(165.0))))), s0(Vector(Vector(166.0), Vector(167.0))), s0(Vector(Vector(168.0), Vector(169.0))), s0(Vector(Vector(170.0), Vector(171.0))), s0(Vector(Vector(172.0), Vector(173.0))), Vector(Vector(s0(Vector(Vector(174.0), Vector(175.0))))), Vector(s0(Vector(Vector(176.0), Vector(177.0))), s0(Vector(Vector(178.0), Vector(179.0)))), s0(Vector(Vector(180.0), Vector(181.0)))), Vector(Vector(182.0)))))))), Vector(s5(s4(Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(183.0), Vector(184.0)))), Vector(s0(Vector(Vector(185.0), Vector(186.0))))), s0(Vector(Vector(187.0), Vector(188.0))), s0(Vector(Vector(189.0), Vector(190.0))), s0(Vector(Vector(191.0), Vector(192.0))), s0(Vector(Vector(193.0), Vector(194.0))), Vector(Vector(s0(Vector(Vector(195.0), Vector(196.0))))), Vector(s0(Vector(Vector(197.0), Vector(198.0))), s0(Vector(Vector(199.0), Vector(200.0)))), s0(Vector(Vector(201.0), Vector(202.0))))), Vector(s1(Vector(Vector(s0(Vector(Vector(203.0), Vector(204.0)))), Vector(s0(Vector(Vector(205.0), Vector(206.0))))), s0(Vector(Vector(207.0), Vector(208.0))), s0(Vector(Vector(209.0), Vector(210.0))), s0(Vector(Vector(211.0), Vector(212.0))), s0(Vector(Vector(213.0), Vector(214.0))), Vector(Vector(s0(Vector(Vector(215.0), Vector(216.0))))), Vector(s0(Vector(Vector(217.0), Vector(218.0))), s0(Vector(Vector(219.0), Vector(220.0)))), s0(Vector(Vector(221.0), Vector(222.0)))))), s1(Vector(Vector(s0(Vector(Vector(223.0), Vector(224.0)))), Vector(s0(Vector(Vector(225.0), Vector(226.0))))), s0(Vector(Vector(227.0), Vector(228.0))), s0(Vector(Vector(229.0), Vector(230.0))), s0(Vector(Vector(231.0), Vector(232.0))), s0(Vector(Vector(233.0), Vector(234.0))), Vector(Vector(s0(Vector(Vector(235.0), Vector(236.0))))), Vector(s0(Vector(Vector(237.0), Vector(238.0))), s0(Vector(Vector(239.0), Vector(240.0)))), s0(Vector(Vector(241.0), Vector(242.0))))), s2(s1(Vector(Vector(s0(Vector(Vector(243.0), Vector(244.0)))), Vector(s0(Vector(Vector(245.0), Vector(246.0))))), s0(Vector(Vector(247.0), Vector(248.0))), s0(Vector(Vector(249.0), Vector(250.0))), s0(Vector(Vector(251.0), Vector(252.0))), s0(Vector(Vector(253.0), Vector(254.0))), Vector(Vector(s0(Vector(Vector(255.0), Vector(256.0))))), Vector(s0(Vector(Vector(257.0), Vector(258.0))), s0(Vector(Vector(259.0), Vector(260.0)))), s0(Vector(Vector(261.0), Vector(262.0)))), Vector(Vector(263.0))), Vector(s4(Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(264.0), Vector(265.0)))), Vector(s0(Vector(Vector(266.0), Vector(267.0))))), s0(Vector(Vector(268.0), Vector(269.0))), s0(Vector(Vector(270.0), Vector(271.0))), s0(Vector(Vector(272.0), Vector(273.0))), s0(Vector(Vector(274.0), Vector(275.0))), Vector(Vector(s0(Vector(Vector(276.0), Vector(277.0))))), Vector(s0(Vector(Vector(278.0), Vector(279.0))), s0(Vector(Vector(280.0), Vector(281.0)))), s0(Vector(Vector(282.0), Vector(283.0))))), Vector(s1(Vector(Vector(s0(Vector(Vector(284.0), Vector(285.0)))), Vector(s0(Vector(Vector(286.0), Vector(287.0))))), s0(Vector(Vector(288.0), Vector(289.0))), s0(Vector(Vector(290.0), Vector(291.0))), s0(Vector(Vector(292.0), Vector(293.0))), s0(Vector(Vector(294.0), Vector(295.0))), Vector(Vector(s0(Vector(Vector(296.0), Vector(297.0))))), Vector(s0(Vector(Vector(298.0), Vector(299.0))), s0(Vector(Vector(300.0), Vector(301.0)))), s0(Vector(Vector(302.0), Vector(303.0)))))), s1(Vector(Vector(s0(Vector(Vector(304.0), Vector(305.0)))), Vector(s0(Vector(Vector(306.0), Vector(307.0))))), s0(Vector(Vector(308.0), Vector(309.0))), s0(Vector(Vector(310.0), Vector(311.0))), s0(Vector(Vector(312.0), Vector(313.0))), s0(Vector(Vector(314.0), Vector(315.0))), Vector(Vector(s0(Vector(Vector(316.0), Vector(317.0))))), Vector(s0(Vector(Vector(318.0), Vector(319.0))), s0(Vector(Vector(320.0), Vector(321.0)))), s0(Vector(Vector(322.0), Vector(323.0))))), s4(Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(324.0), Vector(325.0)))), Vector(s0(Vector(Vector(326.0), Vector(327.0))))), s0(Vector(Vector(328.0), Vector(329.0))), s0(Vector(Vector(330.0), Vector(331.0))), s0(Vector(Vector(332.0), Vector(333.0))), s0(Vector(Vector(334.0), Vector(335.0))), Vector(Vector(s0(Vector(Vector(336.0), Vector(337.0))))), Vector(s0(Vector(Vector(338.0), Vector(339.0))), s0(Vector(Vector(340.0), Vector(341.0)))), s0(Vector(Vector(342.0), Vector(343.0))))), Vector(s1(Vector(Vector(s0(Vector(Vector(344.0), Vector(345.0)))), Vector(s0(Vector(Vector(346.0), Vector(347.0))))), s0(Vector(Vector(348.0), Vector(349.0))), s0(Vector(Vector(350.0), Vector(351.0))), s0(Vector(Vector(352.0), Vector(353.0))), s0(Vector(Vector(354.0), Vector(355.0))), Vector(Vector(s0(Vector(Vector(356.0), Vector(357.0))))), Vector(s0(Vector(Vector(358.0), Vector(359.0))), s0(Vector(Vector(360.0), Vector(361.0)))), s0(Vector(Vector(362.0), Vector(363.0)))))), s1(Vector(Vector(s0(Vector(Vector(364.0), Vector(365.0)))), Vector(s0(Vector(Vector(366.0), Vector(367.0))))), s0(Vector(Vector(368.0), Vector(369.0))), s0(Vector(Vector(370.0), Vector(371.0))), s0(Vector(Vector(372.0), Vector(373.0))), s0(Vector(Vector(374.0), Vector(375.0))), Vector(Vector(s0(Vector(Vector(376.0), Vector(377.0))))), Vector(s0(Vector(Vector(378.0), Vector(379.0))), s0(Vector(Vector(380.0), Vector(381.0)))), s0(Vector(Vector(382.0), Vector(383.0)))))), s0(Vector(Vector(384.0), Vector(385.0)))))), s7(Vector(Vector(s6(s4(Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(386.0), Vector(387.0)))), Vector(s0(Vector(Vector(388.0), Vector(389.0))))), s0(Vector(Vector(390.0), Vector(391.0))), s0(Vector(Vector(392.0), Vector(393.0))), s0(Vector(Vector(394.0), Vector(395.0))), s0(Vector(Vector(396.0), Vector(397.0))), Vector(Vector(s0(Vector(Vector(398.0), Vector(399.0))))), Vector(s0(Vector(Vector(400.0), Vector(401.0))), s0(Vector(Vector(402.0), Vector(403.0)))), s0(Vector(Vector(404.0), Vector(405.0))))), Vector(s1(Vector(Vector(s0(Vector(Vector(406.0), Vector(407.0)))), Vector(s0(Vector(Vector(408.0), Vector(409.0))))), s0(Vector(Vector(410.0), Vector(411.0))), s0(Vector(Vector(412.0), Vector(413.0))), s0(Vector(Vector(414.0), Vector(415.0))), s0(Vector(Vector(416.0), Vector(417.0))), Vector(Vector(s0(Vector(Vector(418.0), Vector(419.0))))), Vector(s0(Vector(Vector(420.0), Vector(421.0))), s0(Vector(Vector(422.0), Vector(423.0)))), s0(Vector(Vector(424.0), Vector(425.0)))))), s1(Vector(Vector(s0(Vector(Vector(426.0), Vector(427.0)))), Vector(s0(Vector(Vector(428.0), Vector(429.0))))), s0(Vector(Vector(430.0), Vector(431.0))), s0(Vector(Vector(432.0), Vector(433.0))), s0(Vector(Vector(434.0), Vector(435.0))), s0(Vector(Vector(436.0), Vector(437.0))), Vector(Vector(s0(Vector(Vector(438.0), Vector(439.0))))), Vector(s0(Vector(Vector(440.0), Vector(441.0))), s0(Vector(Vector(442.0), Vector(443.0)))), s0(Vector(Vector(444.0), Vector(445.0))))), Vector(Vector(s2(s1(Vector(Vector(s0(Vector(Vector(446.0), Vector(447.0)))), Vector(s0(Vector(Vector(448.0), Vector(449.0))))), s0(Vector(Vector(450.0), Vector(451.0))), s0(Vector(Vector(452.0), Vector(453.0))), s0(Vector(Vector(454.0), Vector(455.0))), s0(Vector(Vector(456.0), Vector(457.0))), Vector(Vector(s0(Vector(Vector(458.0), Vector(459.0))))), Vector(s0(Vector(Vector(460.0), Vector(461.0))), s0(Vector(Vector(462.0), Vector(463.0)))), s0(Vector(Vector(464.0), Vector(465.0)))), Vector(Vector(466.0)))), Vector(s2(s1(Vector(Vector(s0(Vector(Vector(467.0), Vector(468.0)))), Vector(s0(Vector(Vector(469.0), Vector(470.0))))), s0(Vector(Vector(471.0), Vector(472.0))), s0(Vector(Vector(473.0), Vector(474.0))), s0(Vector(Vector(475.0), Vector(476.0))), s0(Vector(Vector(477.0), Vector(478.0))), Vector(Vector(s0(Vector(Vector(479.0), Vector(480.0))))), Vector(s0(Vector(Vector(481.0), Vector(482.0))), s0(Vector(Vector(483.0), Vector(484.0)))), s0(Vector(Vector(485.0), Vector(486.0)))), Vector(Vector(487.0)))), Vector(s2(s1(Vector(Vector(s0(Vector(Vector(488.0), Vector(489.0)))), Vector(s0(Vector(Vector(490.0), Vector(491.0))))), s0(Vector(Vector(492.0), Vector(493.0))), s0(Vector(Vector(494.0), Vector(495.0))), s0(Vector(Vector(496.0), Vector(497.0))), s0(Vector(Vector(498.0), Vector(499.0))), Vector(Vector(s0(Vector(Vector(500.0), Vector(501.0))))), Vector(s0(Vector(Vector(502.0), Vector(503.0))), s0(Vector(Vector(504.0), Vector(505.0)))), s0(Vector(Vector(506.0), Vector(507.0)))), Vector(Vector(508.0)))))))), Vector(s5(s4(Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(509.0), Vector(510.0)))), Vector(s0(Vector(Vector(511.0), Vector(512.0))))), s0(Vector(Vector(513.0), Vector(514.0))), s0(Vector(Vector(515.0), Vector(516.0))), s0(Vector(Vector(517.0), Vector(518.0))), s0(Vector(Vector(519.0), Vector(520.0))), Vector(Vector(s0(Vector(Vector(521.0), Vector(522.0))))), Vector(s0(Vector(Vector(523.0), Vector(524.0))), s0(Vector(Vector(525.0), Vector(526.0)))), s0(Vector(Vector(527.0), Vector(528.0))))), Vector(s1(Vector(Vector(s0(Vector(Vector(529.0), Vector(530.0)))), Vector(s0(Vector(Vector(531.0), Vector(532.0))))), s0(Vector(Vector(533.0), Vector(534.0))), s0(Vector(Vector(535.0), Vector(536.0))), s0(Vector(Vector(537.0), Vector(538.0))), s0(Vector(Vector(539.0), Vector(540.0))), Vector(Vector(s0(Vector(Vector(541.0), Vector(542.0))))), Vector(s0(Vector(Vector(543.0), Vector(544.0))), s0(Vector(Vector(545.0), Vector(546.0)))), s0(Vector(Vector(547.0), Vector(548.0)))))), s1(Vector(Vector(s0(Vector(Vector(549.0), Vector(550.0)))), Vector(s0(Vector(Vector(551.0), Vector(552.0))))), s0(Vector(Vector(553.0), Vector(554.0))), s0(Vector(Vector(555.0), Vector(556.0))), s0(Vector(Vector(557.0), Vector(558.0))), s0(Vector(Vector(559.0), Vector(560.0))), Vector(Vector(s0(Vector(Vector(561.0), Vector(562.0))))), Vector(s0(Vector(Vector(563.0), Vector(564.0))), s0(Vector(Vector(565.0), Vector(566.0)))), s0(Vector(Vector(567.0), Vector(568.0))))), s2(s1(Vector(Vector(s0(Vector(Vector(569.0), Vector(570.0)))), Vector(s0(Vector(Vector(571.0), Vector(572.0))))), s0(Vector(Vector(573.0), Vector(574.0))), s0(Vector(Vector(575.0), Vector(576.0))), s0(Vector(Vector(577.0), Vector(578.0))), s0(Vector(Vector(579.0), Vector(580.0))), Vector(Vector(s0(Vector(Vector(581.0), Vector(582.0))))), Vector(s0(Vector(Vector(583.0), Vector(584.0))), s0(Vector(Vector(585.0), Vector(586.0)))), s0(Vector(Vector(587.0), Vector(588.0)))), Vector(Vector(589.0))), Vector(s4(Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(590.0), Vector(591.0)))), Vector(s0(Vector(Vector(592.0), Vector(593.0))))), s0(Vector(Vector(594.0), Vector(595.0))), s0(Vector(Vector(596.0), Vector(597.0))), s0(Vector(Vector(598.0), Vector(599.0))), s0(Vector(Vector(600.0), Vector(601.0))), Vector(Vector(s0(Vector(Vector(602.0), Vector(603.0))))), Vector(s0(Vector(Vector(604.0), Vector(605.0))), s0(Vector(Vector(606.0), Vector(607.0)))), s0(Vector(Vector(608.0), Vector(609.0))))), Vector(s1(Vector(Vector(s0(Vector(Vector(610.0), Vector(611.0)))), Vector(s0(Vector(Vector(612.0), Vector(613.0))))), s0(Vector(Vector(614.0), Vector(615.0))), s0(Vector(Vector(616.0), Vector(617.0))), s0(Vector(Vector(618.0), Vector(619.0))), s0(Vector(Vector(620.0), Vector(621.0))), Vector(Vector(s0(Vector(Vector(622.0), Vector(623.0))))), Vector(s0(Vector(Vector(624.0), Vector(625.0))), s0(Vector(Vector(626.0), Vector(627.0)))), s0(Vector(Vector(628.0), Vector(629.0)))))), s1(Vector(Vector(s0(Vector(Vector(630.0), Vector(631.0)))), Vector(s0(Vector(Vector(632.0), Vector(633.0))))), s0(Vector(Vector(634.0), Vector(635.0))), s0(Vector(Vector(636.0), Vector(637.0))), s0(Vector(Vector(638.0), Vector(639.0))), s0(Vector(Vector(640.0), Vector(641.0))), Vector(Vector(s0(Vector(Vector(642.0), Vector(643.0))))), Vector(s0(Vector(Vector(644.0), Vector(645.0))), s0(Vector(Vector(646.0), Vector(647.0)))), s0(Vector(Vector(648.0), Vector(649.0))))), s4(Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(650.0), Vector(651.0)))), Vector(s0(Vector(Vector(652.0), Vector(653.0))))), s0(Vector(Vector(654.0), Vector(655.0))), s0(Vector(Vector(656.0), Vector(657.0))), s0(Vector(Vector(658.0), Vector(659.0))), s0(Vector(Vector(660.0), Vector(661.0))), Vector(Vector(s0(Vector(Vector(662.0), Vector(663.0))))), Vector(s0(Vector(Vector(664.0), Vector(665.0))), s0(Vector(Vector(666.0), Vector(667.0)))), s0(Vector(Vector(668.0), Vector(669.0))))), Vector(s1(Vector(Vector(s0(Vector(Vector(670.0), Vector(671.0)))), Vector(s0(Vector(Vector(672.0), Vector(673.0))))), s0(Vector(Vector(674.0), Vector(675.0))), s0(Vector(Vector(676.0), Vector(677.0))), s0(Vector(Vector(678.0), Vector(679.0))), s0(Vector(Vector(680.0), Vector(681.0))), Vector(Vector(s0(Vector(Vector(682.0), Vector(683.0))))), Vector(s0(Vector(Vector(684.0), Vector(685.0))), s0(Vector(Vector(686.0), Vector(687.0)))), s0(Vector(Vector(688.0), Vector(689.0)))))), s1(Vector(Vector(s0(Vector(Vector(690.0), Vector(691.0)))), Vector(s0(Vector(Vector(692.0), Vector(693.0))))), s0(Vector(Vector(694.0), Vector(695.0))), s0(Vector(Vector(696.0), Vector(697.0))), s0(Vector(Vector(698.0), Vector(699.0))), s0(Vector(Vector(700.0), Vector(701.0))), Vector(Vector(s0(Vector(Vector(702.0), Vector(703.0))))), Vector(s0(Vector(Vector(704.0), Vector(705.0))), s0(Vector(Vector(706.0), Vector(707.0)))), s0(Vector(Vector(708.0), Vector(709.0)))))), s0(Vector(Vector(710.0), Vector(711.0)))))))
    val v2: Double = 712.0
    val start = nanoTime()
    var result: Double = 712.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}