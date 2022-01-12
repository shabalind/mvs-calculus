import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[Vector[s0]]
  )
  case class s2 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s3 (
    p0: Vector[s0],
    p1: s2,
    p2: s2,
    p3: s1
  )
  case class s4 (
    p0: Vector[Vector[s0]],
    p1: s3,
    p2: s1,
    p3: Vector[s1]
  )
  case class s5 (
    p0: Vector[s0],
    p1: Vector[Vector[s0]]
  )
  case class s6 (
    p0: s3
  )
  case class s8 (
    p0: Vector[Vector[s4]],
    p1: Vector[Vector[s1]]
  )
  case class s13 (
    p0: Vector[Vector[s6]],
    p1: Vector[s3]
  )
  def f65(v0: s0): s0 = {
    val v7: Vector[Vector[Double]] = v0.p0
    val v2: Vector[Vector[Double]] = v0.p0
    val v4: Vector[Double] = v2(1)
    val v6: s0 = s0(v2)
    val v9: Vector[Double] = v2(2)
    val v5: Vector[Vector[Vector[Double]]] = Vector(v2)
    var v3: Vector[Double] = v4
    val v1: Vector[Vector[Double]] = v6.p0
    val v13: Double = v4(0)
    val v8: Vector[Double] = v2(2)
    val v16: Vector[Vector[Vector[Vector[Double]]]] = Vector(v5, v5, v5, v5, v5)
    var v11: Vector[Vector[Double]] = v1
    val v18: Double = v9(0)
    val v12: Vector[Vector[Vector[Double]]] = v16(2)
    v3 = v3.updated(0, v13)
    var v19: Vector[Vector[Double]] = v7
    var v17: Vector[Vector[Double]] = v11
    v3 = v3.updated(0, v18)
    val v28: Vector[Vector[Double]] = v12(0)
    var v26: Vector[Double] = v4
    v3 = v4
    v3 = v3.updated(0, v18)
    val v23: Vector[Vector[Double]] = v6.p0
    val v27: Vector[Double] = v17(2)
    var v31: Double = v18
    val v32: Vector[Vector[Double]] = v5(0)
    val v39: Double = v31 * v18
    var v20: s0 = v6
    var v43: s0 = v20
    v3 = v3.updated(0, v39)
    val v41: Vector[Vector[Double]] = v5(0)
    val v69: Vector[Vector[Vector[Double]]] = Vector(v19, v17, v19, v28, v28, v2, v23)
    v20 = v20.copy(p0 = v41)
    v17 = v17.updated(1, v26)
    val v70: Double = v4(0)
    v43 = v43.copy(p0 = v32)
    val v34: Vector[Vector[Double]] = v69(2)
    v26 = v26.updated(0, v70)
    v43 = v43.copy(p0 = v28)
    v11 = v11.updated(2, v8)
    v20 = v20.copy(p0 = v32)
    v11 = v11.updated(1, v3)
    var v72: Vector[Double] = v27
    v20 = v20.copy(p0 = v34)
    v43 = v43.copy(p0 = v23)
    v3 = v72
    v43 = v43.copy(p0 = v23)
    v43
  }
  @noinline
  def f0(v0: Vector[s4], v1: Vector[s5], v2: Vector[s8], v3: s13, v4: s5, v5: Double): Double = {
    val v13: Vector[s0] = v4.p0
    val v40: s0 = v13(2)
    val v21: s0 = f65(v40)
    val v35: Vector[Vector[Double]] = v21.p0
    val v48: Vector[Double] = v35(0)
    val v81: Double = v48(0)
    var v92: Double = v81
    val v172: Double = v92 + v5
    v172
  }
  def benchmark(): Unit = {
    val v0: Vector[s4] = Vector(s4(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)))), Vector(s0(Vector(Vector(3.0), Vector(4.0), Vector(5.0))))), s3(Vector(s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0))), s0(Vector(Vector(9.0), Vector(10.0), Vector(11.0)))), s2(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0))), Vector(s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0))), s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0))))), s2(s0(Vector(Vector(21.0), Vector(22.0), Vector(23.0))), Vector(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0))), s0(Vector(Vector(27.0), Vector(28.0), Vector(29.0))))), s1(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0))), Vector(Vector(s0(Vector(Vector(33.0), Vector(34.0), Vector(35.0)))), Vector(s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)))), Vector(s0(Vector(Vector(39.0), Vector(40.0), Vector(41.0))))))), s1(s0(Vector(Vector(42.0), Vector(43.0), Vector(44.0))), Vector(Vector(s0(Vector(Vector(45.0), Vector(46.0), Vector(47.0)))), Vector(s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)))), Vector(s0(Vector(Vector(51.0), Vector(52.0), Vector(53.0)))))), Vector(s1(s0(Vector(Vector(54.0), Vector(55.0), Vector(56.0))), Vector(Vector(s0(Vector(Vector(57.0), Vector(58.0), Vector(59.0)))), Vector(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)))), Vector(s0(Vector(Vector(63.0), Vector(64.0), Vector(65.0)))))), s1(s0(Vector(Vector(66.0), Vector(67.0), Vector(68.0))), Vector(Vector(s0(Vector(Vector(69.0), Vector(70.0), Vector(71.0)))), Vector(s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)))), Vector(s0(Vector(Vector(75.0), Vector(76.0), Vector(77.0)))))), s1(s0(Vector(Vector(78.0), Vector(79.0), Vector(80.0))), Vector(Vector(s0(Vector(Vector(81.0), Vector(82.0), Vector(83.0)))), Vector(s0(Vector(Vector(84.0), Vector(85.0), Vector(86.0)))), Vector(s0(Vector(Vector(87.0), Vector(88.0), Vector(89.0)))))))))
    val v1: Vector[s5] = Vector(s5(Vector(s0(Vector(Vector(90.0), Vector(91.0), Vector(92.0))), s0(Vector(Vector(93.0), Vector(94.0), Vector(95.0))), s0(Vector(Vector(96.0), Vector(97.0), Vector(98.0)))), Vector(Vector(s0(Vector(Vector(99.0), Vector(100.0), Vector(101.0)))), Vector(s0(Vector(Vector(102.0), Vector(103.0), Vector(104.0)))), Vector(s0(Vector(Vector(105.0), Vector(106.0), Vector(107.0)))))))
    val v2: Vector[s8] = Vector(s8(Vector(Vector(s4(Vector(Vector(s0(Vector(Vector(108.0), Vector(109.0), Vector(110.0)))), Vector(s0(Vector(Vector(111.0), Vector(112.0), Vector(113.0))))), s3(Vector(s0(Vector(Vector(114.0), Vector(115.0), Vector(116.0))), s0(Vector(Vector(117.0), Vector(118.0), Vector(119.0)))), s2(s0(Vector(Vector(120.0), Vector(121.0), Vector(122.0))), Vector(s0(Vector(Vector(123.0), Vector(124.0), Vector(125.0))), s0(Vector(Vector(126.0), Vector(127.0), Vector(128.0))))), s2(s0(Vector(Vector(129.0), Vector(130.0), Vector(131.0))), Vector(s0(Vector(Vector(132.0), Vector(133.0), Vector(134.0))), s0(Vector(Vector(135.0), Vector(136.0), Vector(137.0))))), s1(s0(Vector(Vector(138.0), Vector(139.0), Vector(140.0))), Vector(Vector(s0(Vector(Vector(141.0), Vector(142.0), Vector(143.0)))), Vector(s0(Vector(Vector(144.0), Vector(145.0), Vector(146.0)))), Vector(s0(Vector(Vector(147.0), Vector(148.0), Vector(149.0))))))), s1(s0(Vector(Vector(150.0), Vector(151.0), Vector(152.0))), Vector(Vector(s0(Vector(Vector(153.0), Vector(154.0), Vector(155.0)))), Vector(s0(Vector(Vector(156.0), Vector(157.0), Vector(158.0)))), Vector(s0(Vector(Vector(159.0), Vector(160.0), Vector(161.0)))))), Vector(s1(s0(Vector(Vector(162.0), Vector(163.0), Vector(164.0))), Vector(Vector(s0(Vector(Vector(165.0), Vector(166.0), Vector(167.0)))), Vector(s0(Vector(Vector(168.0), Vector(169.0), Vector(170.0)))), Vector(s0(Vector(Vector(171.0), Vector(172.0), Vector(173.0)))))), s1(s0(Vector(Vector(174.0), Vector(175.0), Vector(176.0))), Vector(Vector(s0(Vector(Vector(177.0), Vector(178.0), Vector(179.0)))), Vector(s0(Vector(Vector(180.0), Vector(181.0), Vector(182.0)))), Vector(s0(Vector(Vector(183.0), Vector(184.0), Vector(185.0)))))), s1(s0(Vector(Vector(186.0), Vector(187.0), Vector(188.0))), Vector(Vector(s0(Vector(Vector(189.0), Vector(190.0), Vector(191.0)))), Vector(s0(Vector(Vector(192.0), Vector(193.0), Vector(194.0)))), Vector(s0(Vector(Vector(195.0), Vector(196.0), Vector(197.0))))))))), Vector(s4(Vector(Vector(s0(Vector(Vector(198.0), Vector(199.0), Vector(200.0)))), Vector(s0(Vector(Vector(201.0), Vector(202.0), Vector(203.0))))), s3(Vector(s0(Vector(Vector(204.0), Vector(205.0), Vector(206.0))), s0(Vector(Vector(207.0), Vector(208.0), Vector(209.0)))), s2(s0(Vector(Vector(210.0), Vector(211.0), Vector(212.0))), Vector(s0(Vector(Vector(213.0), Vector(214.0), Vector(215.0))), s0(Vector(Vector(216.0), Vector(217.0), Vector(218.0))))), s2(s0(Vector(Vector(219.0), Vector(220.0), Vector(221.0))), Vector(s0(Vector(Vector(222.0), Vector(223.0), Vector(224.0))), s0(Vector(Vector(225.0), Vector(226.0), Vector(227.0))))), s1(s0(Vector(Vector(228.0), Vector(229.0), Vector(230.0))), Vector(Vector(s0(Vector(Vector(231.0), Vector(232.0), Vector(233.0)))), Vector(s0(Vector(Vector(234.0), Vector(235.0), Vector(236.0)))), Vector(s0(Vector(Vector(237.0), Vector(238.0), Vector(239.0))))))), s1(s0(Vector(Vector(240.0), Vector(241.0), Vector(242.0))), Vector(Vector(s0(Vector(Vector(243.0), Vector(244.0), Vector(245.0)))), Vector(s0(Vector(Vector(246.0), Vector(247.0), Vector(248.0)))), Vector(s0(Vector(Vector(249.0), Vector(250.0), Vector(251.0)))))), Vector(s1(s0(Vector(Vector(252.0), Vector(253.0), Vector(254.0))), Vector(Vector(s0(Vector(Vector(255.0), Vector(256.0), Vector(257.0)))), Vector(s0(Vector(Vector(258.0), Vector(259.0), Vector(260.0)))), Vector(s0(Vector(Vector(261.0), Vector(262.0), Vector(263.0)))))), s1(s0(Vector(Vector(264.0), Vector(265.0), Vector(266.0))), Vector(Vector(s0(Vector(Vector(267.0), Vector(268.0), Vector(269.0)))), Vector(s0(Vector(Vector(270.0), Vector(271.0), Vector(272.0)))), Vector(s0(Vector(Vector(273.0), Vector(274.0), Vector(275.0)))))), s1(s0(Vector(Vector(276.0), Vector(277.0), Vector(278.0))), Vector(Vector(s0(Vector(Vector(279.0), Vector(280.0), Vector(281.0)))), Vector(s0(Vector(Vector(282.0), Vector(283.0), Vector(284.0)))), Vector(s0(Vector(Vector(285.0), Vector(286.0), Vector(287.0)))))))))), Vector(Vector(s1(s0(Vector(Vector(288.0), Vector(289.0), Vector(290.0))), Vector(Vector(s0(Vector(Vector(291.0), Vector(292.0), Vector(293.0)))), Vector(s0(Vector(Vector(294.0), Vector(295.0), Vector(296.0)))), Vector(s0(Vector(Vector(297.0), Vector(298.0), Vector(299.0))))))))), s8(Vector(Vector(s4(Vector(Vector(s0(Vector(Vector(300.0), Vector(301.0), Vector(302.0)))), Vector(s0(Vector(Vector(303.0), Vector(304.0), Vector(305.0))))), s3(Vector(s0(Vector(Vector(306.0), Vector(307.0), Vector(308.0))), s0(Vector(Vector(309.0), Vector(310.0), Vector(311.0)))), s2(s0(Vector(Vector(312.0), Vector(313.0), Vector(314.0))), Vector(s0(Vector(Vector(315.0), Vector(316.0), Vector(317.0))), s0(Vector(Vector(318.0), Vector(319.0), Vector(320.0))))), s2(s0(Vector(Vector(321.0), Vector(322.0), Vector(323.0))), Vector(s0(Vector(Vector(324.0), Vector(325.0), Vector(326.0))), s0(Vector(Vector(327.0), Vector(328.0), Vector(329.0))))), s1(s0(Vector(Vector(330.0), Vector(331.0), Vector(332.0))), Vector(Vector(s0(Vector(Vector(333.0), Vector(334.0), Vector(335.0)))), Vector(s0(Vector(Vector(336.0), Vector(337.0), Vector(338.0)))), Vector(s0(Vector(Vector(339.0), Vector(340.0), Vector(341.0))))))), s1(s0(Vector(Vector(342.0), Vector(343.0), Vector(344.0))), Vector(Vector(s0(Vector(Vector(345.0), Vector(346.0), Vector(347.0)))), Vector(s0(Vector(Vector(348.0), Vector(349.0), Vector(350.0)))), Vector(s0(Vector(Vector(351.0), Vector(352.0), Vector(353.0)))))), Vector(s1(s0(Vector(Vector(354.0), Vector(355.0), Vector(356.0))), Vector(Vector(s0(Vector(Vector(357.0), Vector(358.0), Vector(359.0)))), Vector(s0(Vector(Vector(360.0), Vector(361.0), Vector(362.0)))), Vector(s0(Vector(Vector(363.0), Vector(364.0), Vector(365.0)))))), s1(s0(Vector(Vector(366.0), Vector(367.0), Vector(368.0))), Vector(Vector(s0(Vector(Vector(369.0), Vector(370.0), Vector(371.0)))), Vector(s0(Vector(Vector(372.0), Vector(373.0), Vector(374.0)))), Vector(s0(Vector(Vector(375.0), Vector(376.0), Vector(377.0)))))), s1(s0(Vector(Vector(378.0), Vector(379.0), Vector(380.0))), Vector(Vector(s0(Vector(Vector(381.0), Vector(382.0), Vector(383.0)))), Vector(s0(Vector(Vector(384.0), Vector(385.0), Vector(386.0)))), Vector(s0(Vector(Vector(387.0), Vector(388.0), Vector(389.0))))))))), Vector(s4(Vector(Vector(s0(Vector(Vector(390.0), Vector(391.0), Vector(392.0)))), Vector(s0(Vector(Vector(393.0), Vector(394.0), Vector(395.0))))), s3(Vector(s0(Vector(Vector(396.0), Vector(397.0), Vector(398.0))), s0(Vector(Vector(399.0), Vector(400.0), Vector(401.0)))), s2(s0(Vector(Vector(402.0), Vector(403.0), Vector(404.0))), Vector(s0(Vector(Vector(405.0), Vector(406.0), Vector(407.0))), s0(Vector(Vector(408.0), Vector(409.0), Vector(410.0))))), s2(s0(Vector(Vector(411.0), Vector(412.0), Vector(413.0))), Vector(s0(Vector(Vector(414.0), Vector(415.0), Vector(416.0))), s0(Vector(Vector(417.0), Vector(418.0), Vector(419.0))))), s1(s0(Vector(Vector(420.0), Vector(421.0), Vector(422.0))), Vector(Vector(s0(Vector(Vector(423.0), Vector(424.0), Vector(425.0)))), Vector(s0(Vector(Vector(426.0), Vector(427.0), Vector(428.0)))), Vector(s0(Vector(Vector(429.0), Vector(430.0), Vector(431.0))))))), s1(s0(Vector(Vector(432.0), Vector(433.0), Vector(434.0))), Vector(Vector(s0(Vector(Vector(435.0), Vector(436.0), Vector(437.0)))), Vector(s0(Vector(Vector(438.0), Vector(439.0), Vector(440.0)))), Vector(s0(Vector(Vector(441.0), Vector(442.0), Vector(443.0)))))), Vector(s1(s0(Vector(Vector(444.0), Vector(445.0), Vector(446.0))), Vector(Vector(s0(Vector(Vector(447.0), Vector(448.0), Vector(449.0)))), Vector(s0(Vector(Vector(450.0), Vector(451.0), Vector(452.0)))), Vector(s0(Vector(Vector(453.0), Vector(454.0), Vector(455.0)))))), s1(s0(Vector(Vector(456.0), Vector(457.0), Vector(458.0))), Vector(Vector(s0(Vector(Vector(459.0), Vector(460.0), Vector(461.0)))), Vector(s0(Vector(Vector(462.0), Vector(463.0), Vector(464.0)))), Vector(s0(Vector(Vector(465.0), Vector(466.0), Vector(467.0)))))), s1(s0(Vector(Vector(468.0), Vector(469.0), Vector(470.0))), Vector(Vector(s0(Vector(Vector(471.0), Vector(472.0), Vector(473.0)))), Vector(s0(Vector(Vector(474.0), Vector(475.0), Vector(476.0)))), Vector(s0(Vector(Vector(477.0), Vector(478.0), Vector(479.0)))))))))), Vector(Vector(s1(s0(Vector(Vector(480.0), Vector(481.0), Vector(482.0))), Vector(Vector(s0(Vector(Vector(483.0), Vector(484.0), Vector(485.0)))), Vector(s0(Vector(Vector(486.0), Vector(487.0), Vector(488.0)))), Vector(s0(Vector(Vector(489.0), Vector(490.0), Vector(491.0))))))))), s8(Vector(Vector(s4(Vector(Vector(s0(Vector(Vector(492.0), Vector(493.0), Vector(494.0)))), Vector(s0(Vector(Vector(495.0), Vector(496.0), Vector(497.0))))), s3(Vector(s0(Vector(Vector(498.0), Vector(499.0), Vector(500.0))), s0(Vector(Vector(501.0), Vector(502.0), Vector(503.0)))), s2(s0(Vector(Vector(504.0), Vector(505.0), Vector(506.0))), Vector(s0(Vector(Vector(507.0), Vector(508.0), Vector(509.0))), s0(Vector(Vector(510.0), Vector(511.0), Vector(512.0))))), s2(s0(Vector(Vector(513.0), Vector(514.0), Vector(515.0))), Vector(s0(Vector(Vector(516.0), Vector(517.0), Vector(518.0))), s0(Vector(Vector(519.0), Vector(520.0), Vector(521.0))))), s1(s0(Vector(Vector(522.0), Vector(523.0), Vector(524.0))), Vector(Vector(s0(Vector(Vector(525.0), Vector(526.0), Vector(527.0)))), Vector(s0(Vector(Vector(528.0), Vector(529.0), Vector(530.0)))), Vector(s0(Vector(Vector(531.0), Vector(532.0), Vector(533.0))))))), s1(s0(Vector(Vector(534.0), Vector(535.0), Vector(536.0))), Vector(Vector(s0(Vector(Vector(537.0), Vector(538.0), Vector(539.0)))), Vector(s0(Vector(Vector(540.0), Vector(541.0), Vector(542.0)))), Vector(s0(Vector(Vector(543.0), Vector(544.0), Vector(545.0)))))), Vector(s1(s0(Vector(Vector(546.0), Vector(547.0), Vector(548.0))), Vector(Vector(s0(Vector(Vector(549.0), Vector(550.0), Vector(551.0)))), Vector(s0(Vector(Vector(552.0), Vector(553.0), Vector(554.0)))), Vector(s0(Vector(Vector(555.0), Vector(556.0), Vector(557.0)))))), s1(s0(Vector(Vector(558.0), Vector(559.0), Vector(560.0))), Vector(Vector(s0(Vector(Vector(561.0), Vector(562.0), Vector(563.0)))), Vector(s0(Vector(Vector(564.0), Vector(565.0), Vector(566.0)))), Vector(s0(Vector(Vector(567.0), Vector(568.0), Vector(569.0)))))), s1(s0(Vector(Vector(570.0), Vector(571.0), Vector(572.0))), Vector(Vector(s0(Vector(Vector(573.0), Vector(574.0), Vector(575.0)))), Vector(s0(Vector(Vector(576.0), Vector(577.0), Vector(578.0)))), Vector(s0(Vector(Vector(579.0), Vector(580.0), Vector(581.0))))))))), Vector(s4(Vector(Vector(s0(Vector(Vector(582.0), Vector(583.0), Vector(584.0)))), Vector(s0(Vector(Vector(585.0), Vector(586.0), Vector(587.0))))), s3(Vector(s0(Vector(Vector(588.0), Vector(589.0), Vector(590.0))), s0(Vector(Vector(591.0), Vector(592.0), Vector(593.0)))), s2(s0(Vector(Vector(594.0), Vector(595.0), Vector(596.0))), Vector(s0(Vector(Vector(597.0), Vector(598.0), Vector(599.0))), s0(Vector(Vector(600.0), Vector(601.0), Vector(602.0))))), s2(s0(Vector(Vector(603.0), Vector(604.0), Vector(605.0))), Vector(s0(Vector(Vector(606.0), Vector(607.0), Vector(608.0))), s0(Vector(Vector(609.0), Vector(610.0), Vector(611.0))))), s1(s0(Vector(Vector(612.0), Vector(613.0), Vector(614.0))), Vector(Vector(s0(Vector(Vector(615.0), Vector(616.0), Vector(617.0)))), Vector(s0(Vector(Vector(618.0), Vector(619.0), Vector(620.0)))), Vector(s0(Vector(Vector(621.0), Vector(622.0), Vector(623.0))))))), s1(s0(Vector(Vector(624.0), Vector(625.0), Vector(626.0))), Vector(Vector(s0(Vector(Vector(627.0), Vector(628.0), Vector(629.0)))), Vector(s0(Vector(Vector(630.0), Vector(631.0), Vector(632.0)))), Vector(s0(Vector(Vector(633.0), Vector(634.0), Vector(635.0)))))), Vector(s1(s0(Vector(Vector(636.0), Vector(637.0), Vector(638.0))), Vector(Vector(s0(Vector(Vector(639.0), Vector(640.0), Vector(641.0)))), Vector(s0(Vector(Vector(642.0), Vector(643.0), Vector(644.0)))), Vector(s0(Vector(Vector(645.0), Vector(646.0), Vector(647.0)))))), s1(s0(Vector(Vector(648.0), Vector(649.0), Vector(650.0))), Vector(Vector(s0(Vector(Vector(651.0), Vector(652.0), Vector(653.0)))), Vector(s0(Vector(Vector(654.0), Vector(655.0), Vector(656.0)))), Vector(s0(Vector(Vector(657.0), Vector(658.0), Vector(659.0)))))), s1(s0(Vector(Vector(660.0), Vector(661.0), Vector(662.0))), Vector(Vector(s0(Vector(Vector(663.0), Vector(664.0), Vector(665.0)))), Vector(s0(Vector(Vector(666.0), Vector(667.0), Vector(668.0)))), Vector(s0(Vector(Vector(669.0), Vector(670.0), Vector(671.0)))))))))), Vector(Vector(s1(s0(Vector(Vector(672.0), Vector(673.0), Vector(674.0))), Vector(Vector(s0(Vector(Vector(675.0), Vector(676.0), Vector(677.0)))), Vector(s0(Vector(Vector(678.0), Vector(679.0), Vector(680.0)))), Vector(s0(Vector(Vector(681.0), Vector(682.0), Vector(683.0))))))))))
    val v3: s13 = s13(Vector(Vector(s6(s3(Vector(s0(Vector(Vector(684.0), Vector(685.0), Vector(686.0))), s0(Vector(Vector(687.0), Vector(688.0), Vector(689.0)))), s2(s0(Vector(Vector(690.0), Vector(691.0), Vector(692.0))), Vector(s0(Vector(Vector(693.0), Vector(694.0), Vector(695.0))), s0(Vector(Vector(696.0), Vector(697.0), Vector(698.0))))), s2(s0(Vector(Vector(699.0), Vector(700.0), Vector(701.0))), Vector(s0(Vector(Vector(702.0), Vector(703.0), Vector(704.0))), s0(Vector(Vector(705.0), Vector(706.0), Vector(707.0))))), s1(s0(Vector(Vector(708.0), Vector(709.0), Vector(710.0))), Vector(Vector(s0(Vector(Vector(711.0), Vector(712.0), Vector(713.0)))), Vector(s0(Vector(Vector(714.0), Vector(715.0), Vector(716.0)))), Vector(s0(Vector(Vector(717.0), Vector(718.0), Vector(719.0))))))))), Vector(s6(s3(Vector(s0(Vector(Vector(720.0), Vector(721.0), Vector(722.0))), s0(Vector(Vector(723.0), Vector(724.0), Vector(725.0)))), s2(s0(Vector(Vector(726.0), Vector(727.0), Vector(728.0))), Vector(s0(Vector(Vector(729.0), Vector(730.0), Vector(731.0))), s0(Vector(Vector(732.0), Vector(733.0), Vector(734.0))))), s2(s0(Vector(Vector(735.0), Vector(736.0), Vector(737.0))), Vector(s0(Vector(Vector(738.0), Vector(739.0), Vector(740.0))), s0(Vector(Vector(741.0), Vector(742.0), Vector(743.0))))), s1(s0(Vector(Vector(744.0), Vector(745.0), Vector(746.0))), Vector(Vector(s0(Vector(Vector(747.0), Vector(748.0), Vector(749.0)))), Vector(s0(Vector(Vector(750.0), Vector(751.0), Vector(752.0)))), Vector(s0(Vector(Vector(753.0), Vector(754.0), Vector(755.0))))))))), Vector(s6(s3(Vector(s0(Vector(Vector(756.0), Vector(757.0), Vector(758.0))), s0(Vector(Vector(759.0), Vector(760.0), Vector(761.0)))), s2(s0(Vector(Vector(762.0), Vector(763.0), Vector(764.0))), Vector(s0(Vector(Vector(765.0), Vector(766.0), Vector(767.0))), s0(Vector(Vector(768.0), Vector(769.0), Vector(770.0))))), s2(s0(Vector(Vector(771.0), Vector(772.0), Vector(773.0))), Vector(s0(Vector(Vector(774.0), Vector(775.0), Vector(776.0))), s0(Vector(Vector(777.0), Vector(778.0), Vector(779.0))))), s1(s0(Vector(Vector(780.0), Vector(781.0), Vector(782.0))), Vector(Vector(s0(Vector(Vector(783.0), Vector(784.0), Vector(785.0)))), Vector(s0(Vector(Vector(786.0), Vector(787.0), Vector(788.0)))), Vector(s0(Vector(Vector(789.0), Vector(790.0), Vector(791.0)))))))))), Vector(s3(Vector(s0(Vector(Vector(792.0), Vector(793.0), Vector(794.0))), s0(Vector(Vector(795.0), Vector(796.0), Vector(797.0)))), s2(s0(Vector(Vector(798.0), Vector(799.0), Vector(800.0))), Vector(s0(Vector(Vector(801.0), Vector(802.0), Vector(803.0))), s0(Vector(Vector(804.0), Vector(805.0), Vector(806.0))))), s2(s0(Vector(Vector(807.0), Vector(808.0), Vector(809.0))), Vector(s0(Vector(Vector(810.0), Vector(811.0), Vector(812.0))), s0(Vector(Vector(813.0), Vector(814.0), Vector(815.0))))), s1(s0(Vector(Vector(816.0), Vector(817.0), Vector(818.0))), Vector(Vector(s0(Vector(Vector(819.0), Vector(820.0), Vector(821.0)))), Vector(s0(Vector(Vector(822.0), Vector(823.0), Vector(824.0)))), Vector(s0(Vector(Vector(825.0), Vector(826.0), Vector(827.0))))))), s3(Vector(s0(Vector(Vector(828.0), Vector(829.0), Vector(830.0))), s0(Vector(Vector(831.0), Vector(832.0), Vector(833.0)))), s2(s0(Vector(Vector(834.0), Vector(835.0), Vector(836.0))), Vector(s0(Vector(Vector(837.0), Vector(838.0), Vector(839.0))), s0(Vector(Vector(840.0), Vector(841.0), Vector(842.0))))), s2(s0(Vector(Vector(843.0), Vector(844.0), Vector(845.0))), Vector(s0(Vector(Vector(846.0), Vector(847.0), Vector(848.0))), s0(Vector(Vector(849.0), Vector(850.0), Vector(851.0))))), s1(s0(Vector(Vector(852.0), Vector(853.0), Vector(854.0))), Vector(Vector(s0(Vector(Vector(855.0), Vector(856.0), Vector(857.0)))), Vector(s0(Vector(Vector(858.0), Vector(859.0), Vector(860.0)))), Vector(s0(Vector(Vector(861.0), Vector(862.0), Vector(863.0)))))))))
    val v4: s5 = s5(Vector(s0(Vector(Vector(864.0), Vector(865.0), Vector(866.0))), s0(Vector(Vector(867.0), Vector(868.0), Vector(869.0))), s0(Vector(Vector(870.0), Vector(871.0), Vector(872.0)))), Vector(Vector(s0(Vector(Vector(873.0), Vector(874.0), Vector(875.0)))), Vector(s0(Vector(Vector(876.0), Vector(877.0), Vector(878.0)))), Vector(s0(Vector(Vector(879.0), Vector(880.0), Vector(881.0))))))
    val v5: Double = 882.0
    val start = nanoTime()
    var result: Double = 882.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4, v5)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}