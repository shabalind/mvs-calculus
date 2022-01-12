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
    p0: s1,
    p1: Vector[s1],
    p2: s0,
    p3: Vector[Vector[s0]]
  )
  case class s3 (
    p0: s1,
    p1: Vector[Vector[s0]]
  )
  case class s4 (
    p0: s1,
    p1: Vector[s3]
  )
  case class s5 (
    p0: Vector[Vector[s1]],
    p1: Vector[s0]
  )
  case class s6 (
    p0: s2,
    p1: Vector[s5]
  )
  case class s8 (
    p0: s4,
    p1: Vector[Vector[s2]],
    p2: Vector[Vector[s6]],
    p3: Vector[Vector[s0]]
  )
  case class s9 (
    p0: Vector[s2],
    p1: Vector[s6]
  )
  def f68(v0: Double): Double = {
    var v8: Double = v0
    var v7: Double = v0
    var v4: Double = v8
    var v1: Double = v7
    var v6: Double = v8
    var v2: Double = v0
    var v13: Double = v1
    var v9: Double = v6
    var v14: Double = v13
    var v11: Double = v9
    var v32: Double = v9
    var v27: Double = v0
    var v19: Double = v11
    var v43: Double = v4
    val v42: Vector[Double] = Vector(v7, v7, v32, v9, v9)
    var v20: Double = v7
    var v40: Vector[Double] = v42
    v27 = v43
    v40 = v40.updated(2, v27)
    var v31: Double = v19
    val v39: Double = v40(4)
    v40 = v40.updated(0, v39)
    v40 = v40.updated(0, v31)
    var v55: Vector[Double] = v40
    var v41: Vector[Double] = v40
    v20 = v2
    v55 = v55.updated(1, v31)
    val v79: Double = v41(1)
    var v65: Vector[Double] = v55
    val v165: Vector[Vector[Double]] = Vector(v40, v65)
    val v67: Vector[Double] = v165(0)
    val v77: Double = v65(1)
    val v104: Vector[Double] = v165(0)
    var v58: Vector[Double] = v104
    val v51: Double = v58(2)
    v13 = v6
    v40 = v40.updated(4, v79)
    val v91: Double = v67(2)
    v65 = v65.updated(4, v51)
    v55 = v55.updated(2, v77)
    v58 = v58.updated(4, v20)
    v58 = v58.updated(3, v14)
    v91
  }
  def f12(v0: Double): Double = {
    val v1: Double = f68(v0)
    val v7: Double = f68(v1)
    var v6: Double = v1
    val v5: Double = f68(v6)
    var v2: Double = v0
    var v8: Double = v2
    var v3: Double = v6
    var v4: Double = v5
    val v14: Double = v0 / v8
    var v9: Double = v7
    var v19: Double = v0
    var v11: Double = v9
    var v13: Double = v8
    val v10: Double = f68(v5)
    val v15: Vector[Double] = Vector(v10, v10, v4, v7, v13, v3)
    val v20: Double = v15(0)
    v4 = v20
    var v24: Vector[Double] = v15
    var v22: Vector[Double] = v24
    val v52: Double = v22(2)
    v22 = v22.updated(1, v1)
    val v62: Vector[Double] = Vector(v14, v11, v19, v8)
    val v16: Vector[Vector[Double]] = Vector(v62, v62, v62)
    var v45: Vector[Vector[Double]] = v16
    var v64: Vector[Vector[Double]] = v45
    val v30: Vector[Double] = v64(0)
    v11 = v52
    val v65: Double = v30(3)
    v65
  }
  @noinline
  def f0(v0: s8, v1: s9, v2: Double): Double = {
    var v8: Double = v2
    val v13: Double = f12(v8)
    val v59: Double = v8 / v13
    val v36: Double = f12(v59)
    val v121: Double = v36 * v59
    v8 = v36
    v121
  }
  def benchmark(): Unit = {
    val v0: s8 = s8(s4(s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0))), s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))), Vector(s3(s1(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0))), s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0)))), Vector(Vector(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0)))), Vector(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0)))))), s3(s1(s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0), Vector(40.0), Vector(41.0))), s0(Vector(Vector(42.0), Vector(43.0), Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0)))), Vector(Vector(s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0), Vector(52.0), Vector(53.0)))), Vector(s0(Vector(Vector(54.0), Vector(55.0), Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0)))))))), Vector(Vector(s2(s1(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0), Vector(64.0), Vector(65.0))), s0(Vector(Vector(66.0), Vector(67.0), Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0)))), Vector(s1(s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)), Vector(Vector(75.0), Vector(76.0), Vector(77.0))), s0(Vector(Vector(78.0), Vector(79.0), Vector(80.0)), Vector(Vector(81.0), Vector(82.0), Vector(83.0)))), s1(s0(Vector(Vector(84.0), Vector(85.0), Vector(86.0)), Vector(Vector(87.0), Vector(88.0), Vector(89.0))), s0(Vector(Vector(90.0), Vector(91.0), Vector(92.0)), Vector(Vector(93.0), Vector(94.0), Vector(95.0)))), s1(s0(Vector(Vector(96.0), Vector(97.0), Vector(98.0)), Vector(Vector(99.0), Vector(100.0), Vector(101.0))), s0(Vector(Vector(102.0), Vector(103.0), Vector(104.0)), Vector(Vector(105.0), Vector(106.0), Vector(107.0))))), s0(Vector(Vector(108.0), Vector(109.0), Vector(110.0)), Vector(Vector(111.0), Vector(112.0), Vector(113.0))), Vector(Vector(s0(Vector(Vector(114.0), Vector(115.0), Vector(116.0)), Vector(Vector(117.0), Vector(118.0), Vector(119.0)))), Vector(s0(Vector(Vector(120.0), Vector(121.0), Vector(122.0)), Vector(Vector(123.0), Vector(124.0), Vector(125.0)))), Vector(s0(Vector(Vector(126.0), Vector(127.0), Vector(128.0)), Vector(Vector(129.0), Vector(130.0), Vector(131.0)))))))), Vector(Vector(s6(s2(s1(s0(Vector(Vector(132.0), Vector(133.0), Vector(134.0)), Vector(Vector(135.0), Vector(136.0), Vector(137.0))), s0(Vector(Vector(138.0), Vector(139.0), Vector(140.0)), Vector(Vector(141.0), Vector(142.0), Vector(143.0)))), Vector(s1(s0(Vector(Vector(144.0), Vector(145.0), Vector(146.0)), Vector(Vector(147.0), Vector(148.0), Vector(149.0))), s0(Vector(Vector(150.0), Vector(151.0), Vector(152.0)), Vector(Vector(153.0), Vector(154.0), Vector(155.0)))), s1(s0(Vector(Vector(156.0), Vector(157.0), Vector(158.0)), Vector(Vector(159.0), Vector(160.0), Vector(161.0))), s0(Vector(Vector(162.0), Vector(163.0), Vector(164.0)), Vector(Vector(165.0), Vector(166.0), Vector(167.0)))), s1(s0(Vector(Vector(168.0), Vector(169.0), Vector(170.0)), Vector(Vector(171.0), Vector(172.0), Vector(173.0))), s0(Vector(Vector(174.0), Vector(175.0), Vector(176.0)), Vector(Vector(177.0), Vector(178.0), Vector(179.0))))), s0(Vector(Vector(180.0), Vector(181.0), Vector(182.0)), Vector(Vector(183.0), Vector(184.0), Vector(185.0))), Vector(Vector(s0(Vector(Vector(186.0), Vector(187.0), Vector(188.0)), Vector(Vector(189.0), Vector(190.0), Vector(191.0)))), Vector(s0(Vector(Vector(192.0), Vector(193.0), Vector(194.0)), Vector(Vector(195.0), Vector(196.0), Vector(197.0)))), Vector(s0(Vector(Vector(198.0), Vector(199.0), Vector(200.0)), Vector(Vector(201.0), Vector(202.0), Vector(203.0)))))), Vector(s5(Vector(Vector(s1(s0(Vector(Vector(204.0), Vector(205.0), Vector(206.0)), Vector(Vector(207.0), Vector(208.0), Vector(209.0))), s0(Vector(Vector(210.0), Vector(211.0), Vector(212.0)), Vector(Vector(213.0), Vector(214.0), Vector(215.0))))), Vector(s1(s0(Vector(Vector(216.0), Vector(217.0), Vector(218.0)), Vector(Vector(219.0), Vector(220.0), Vector(221.0))), s0(Vector(Vector(222.0), Vector(223.0), Vector(224.0)), Vector(Vector(225.0), Vector(226.0), Vector(227.0)))))), Vector(s0(Vector(Vector(228.0), Vector(229.0), Vector(230.0)), Vector(Vector(231.0), Vector(232.0), Vector(233.0))), s0(Vector(Vector(234.0), Vector(235.0), Vector(236.0)), Vector(Vector(237.0), Vector(238.0), Vector(239.0))), s0(Vector(Vector(240.0), Vector(241.0), Vector(242.0)), Vector(Vector(243.0), Vector(244.0), Vector(245.0))))), s5(Vector(Vector(s1(s0(Vector(Vector(246.0), Vector(247.0), Vector(248.0)), Vector(Vector(249.0), Vector(250.0), Vector(251.0))), s0(Vector(Vector(252.0), Vector(253.0), Vector(254.0)), Vector(Vector(255.0), Vector(256.0), Vector(257.0))))), Vector(s1(s0(Vector(Vector(258.0), Vector(259.0), Vector(260.0)), Vector(Vector(261.0), Vector(262.0), Vector(263.0))), s0(Vector(Vector(264.0), Vector(265.0), Vector(266.0)), Vector(Vector(267.0), Vector(268.0), Vector(269.0)))))), Vector(s0(Vector(Vector(270.0), Vector(271.0), Vector(272.0)), Vector(Vector(273.0), Vector(274.0), Vector(275.0))), s0(Vector(Vector(276.0), Vector(277.0), Vector(278.0)), Vector(Vector(279.0), Vector(280.0), Vector(281.0))), s0(Vector(Vector(282.0), Vector(283.0), Vector(284.0)), Vector(Vector(285.0), Vector(286.0), Vector(287.0))))), s5(Vector(Vector(s1(s0(Vector(Vector(288.0), Vector(289.0), Vector(290.0)), Vector(Vector(291.0), Vector(292.0), Vector(293.0))), s0(Vector(Vector(294.0), Vector(295.0), Vector(296.0)), Vector(Vector(297.0), Vector(298.0), Vector(299.0))))), Vector(s1(s0(Vector(Vector(300.0), Vector(301.0), Vector(302.0)), Vector(Vector(303.0), Vector(304.0), Vector(305.0))), s0(Vector(Vector(306.0), Vector(307.0), Vector(308.0)), Vector(Vector(309.0), Vector(310.0), Vector(311.0)))))), Vector(s0(Vector(Vector(312.0), Vector(313.0), Vector(314.0)), Vector(Vector(315.0), Vector(316.0), Vector(317.0))), s0(Vector(Vector(318.0), Vector(319.0), Vector(320.0)), Vector(Vector(321.0), Vector(322.0), Vector(323.0))), s0(Vector(Vector(324.0), Vector(325.0), Vector(326.0)), Vector(Vector(327.0), Vector(328.0), Vector(329.0)))))))), Vector(s6(s2(s1(s0(Vector(Vector(330.0), Vector(331.0), Vector(332.0)), Vector(Vector(333.0), Vector(334.0), Vector(335.0))), s0(Vector(Vector(336.0), Vector(337.0), Vector(338.0)), Vector(Vector(339.0), Vector(340.0), Vector(341.0)))), Vector(s1(s0(Vector(Vector(342.0), Vector(343.0), Vector(344.0)), Vector(Vector(345.0), Vector(346.0), Vector(347.0))), s0(Vector(Vector(348.0), Vector(349.0), Vector(350.0)), Vector(Vector(351.0), Vector(352.0), Vector(353.0)))), s1(s0(Vector(Vector(354.0), Vector(355.0), Vector(356.0)), Vector(Vector(357.0), Vector(358.0), Vector(359.0))), s0(Vector(Vector(360.0), Vector(361.0), Vector(362.0)), Vector(Vector(363.0), Vector(364.0), Vector(365.0)))), s1(s0(Vector(Vector(366.0), Vector(367.0), Vector(368.0)), Vector(Vector(369.0), Vector(370.0), Vector(371.0))), s0(Vector(Vector(372.0), Vector(373.0), Vector(374.0)), Vector(Vector(375.0), Vector(376.0), Vector(377.0))))), s0(Vector(Vector(378.0), Vector(379.0), Vector(380.0)), Vector(Vector(381.0), Vector(382.0), Vector(383.0))), Vector(Vector(s0(Vector(Vector(384.0), Vector(385.0), Vector(386.0)), Vector(Vector(387.0), Vector(388.0), Vector(389.0)))), Vector(s0(Vector(Vector(390.0), Vector(391.0), Vector(392.0)), Vector(Vector(393.0), Vector(394.0), Vector(395.0)))), Vector(s0(Vector(Vector(396.0), Vector(397.0), Vector(398.0)), Vector(Vector(399.0), Vector(400.0), Vector(401.0)))))), Vector(s5(Vector(Vector(s1(s0(Vector(Vector(402.0), Vector(403.0), Vector(404.0)), Vector(Vector(405.0), Vector(406.0), Vector(407.0))), s0(Vector(Vector(408.0), Vector(409.0), Vector(410.0)), Vector(Vector(411.0), Vector(412.0), Vector(413.0))))), Vector(s1(s0(Vector(Vector(414.0), Vector(415.0), Vector(416.0)), Vector(Vector(417.0), Vector(418.0), Vector(419.0))), s0(Vector(Vector(420.0), Vector(421.0), Vector(422.0)), Vector(Vector(423.0), Vector(424.0), Vector(425.0)))))), Vector(s0(Vector(Vector(426.0), Vector(427.0), Vector(428.0)), Vector(Vector(429.0), Vector(430.0), Vector(431.0))), s0(Vector(Vector(432.0), Vector(433.0), Vector(434.0)), Vector(Vector(435.0), Vector(436.0), Vector(437.0))), s0(Vector(Vector(438.0), Vector(439.0), Vector(440.0)), Vector(Vector(441.0), Vector(442.0), Vector(443.0))))), s5(Vector(Vector(s1(s0(Vector(Vector(444.0), Vector(445.0), Vector(446.0)), Vector(Vector(447.0), Vector(448.0), Vector(449.0))), s0(Vector(Vector(450.0), Vector(451.0), Vector(452.0)), Vector(Vector(453.0), Vector(454.0), Vector(455.0))))), Vector(s1(s0(Vector(Vector(456.0), Vector(457.0), Vector(458.0)), Vector(Vector(459.0), Vector(460.0), Vector(461.0))), s0(Vector(Vector(462.0), Vector(463.0), Vector(464.0)), Vector(Vector(465.0), Vector(466.0), Vector(467.0)))))), Vector(s0(Vector(Vector(468.0), Vector(469.0), Vector(470.0)), Vector(Vector(471.0), Vector(472.0), Vector(473.0))), s0(Vector(Vector(474.0), Vector(475.0), Vector(476.0)), Vector(Vector(477.0), Vector(478.0), Vector(479.0))), s0(Vector(Vector(480.0), Vector(481.0), Vector(482.0)), Vector(Vector(483.0), Vector(484.0), Vector(485.0))))), s5(Vector(Vector(s1(s0(Vector(Vector(486.0), Vector(487.0), Vector(488.0)), Vector(Vector(489.0), Vector(490.0), Vector(491.0))), s0(Vector(Vector(492.0), Vector(493.0), Vector(494.0)), Vector(Vector(495.0), Vector(496.0), Vector(497.0))))), Vector(s1(s0(Vector(Vector(498.0), Vector(499.0), Vector(500.0)), Vector(Vector(501.0), Vector(502.0), Vector(503.0))), s0(Vector(Vector(504.0), Vector(505.0), Vector(506.0)), Vector(Vector(507.0), Vector(508.0), Vector(509.0)))))), Vector(s0(Vector(Vector(510.0), Vector(511.0), Vector(512.0)), Vector(Vector(513.0), Vector(514.0), Vector(515.0))), s0(Vector(Vector(516.0), Vector(517.0), Vector(518.0)), Vector(Vector(519.0), Vector(520.0), Vector(521.0))), s0(Vector(Vector(522.0), Vector(523.0), Vector(524.0)), Vector(Vector(525.0), Vector(526.0), Vector(527.0)))))))), Vector(s6(s2(s1(s0(Vector(Vector(528.0), Vector(529.0), Vector(530.0)), Vector(Vector(531.0), Vector(532.0), Vector(533.0))), s0(Vector(Vector(534.0), Vector(535.0), Vector(536.0)), Vector(Vector(537.0), Vector(538.0), Vector(539.0)))), Vector(s1(s0(Vector(Vector(540.0), Vector(541.0), Vector(542.0)), Vector(Vector(543.0), Vector(544.0), Vector(545.0))), s0(Vector(Vector(546.0), Vector(547.0), Vector(548.0)), Vector(Vector(549.0), Vector(550.0), Vector(551.0)))), s1(s0(Vector(Vector(552.0), Vector(553.0), Vector(554.0)), Vector(Vector(555.0), Vector(556.0), Vector(557.0))), s0(Vector(Vector(558.0), Vector(559.0), Vector(560.0)), Vector(Vector(561.0), Vector(562.0), Vector(563.0)))), s1(s0(Vector(Vector(564.0), Vector(565.0), Vector(566.0)), Vector(Vector(567.0), Vector(568.0), Vector(569.0))), s0(Vector(Vector(570.0), Vector(571.0), Vector(572.0)), Vector(Vector(573.0), Vector(574.0), Vector(575.0))))), s0(Vector(Vector(576.0), Vector(577.0), Vector(578.0)), Vector(Vector(579.0), Vector(580.0), Vector(581.0))), Vector(Vector(s0(Vector(Vector(582.0), Vector(583.0), Vector(584.0)), Vector(Vector(585.0), Vector(586.0), Vector(587.0)))), Vector(s0(Vector(Vector(588.0), Vector(589.0), Vector(590.0)), Vector(Vector(591.0), Vector(592.0), Vector(593.0)))), Vector(s0(Vector(Vector(594.0), Vector(595.0), Vector(596.0)), Vector(Vector(597.0), Vector(598.0), Vector(599.0)))))), Vector(s5(Vector(Vector(s1(s0(Vector(Vector(600.0), Vector(601.0), Vector(602.0)), Vector(Vector(603.0), Vector(604.0), Vector(605.0))), s0(Vector(Vector(606.0), Vector(607.0), Vector(608.0)), Vector(Vector(609.0), Vector(610.0), Vector(611.0))))), Vector(s1(s0(Vector(Vector(612.0), Vector(613.0), Vector(614.0)), Vector(Vector(615.0), Vector(616.0), Vector(617.0))), s0(Vector(Vector(618.0), Vector(619.0), Vector(620.0)), Vector(Vector(621.0), Vector(622.0), Vector(623.0)))))), Vector(s0(Vector(Vector(624.0), Vector(625.0), Vector(626.0)), Vector(Vector(627.0), Vector(628.0), Vector(629.0))), s0(Vector(Vector(630.0), Vector(631.0), Vector(632.0)), Vector(Vector(633.0), Vector(634.0), Vector(635.0))), s0(Vector(Vector(636.0), Vector(637.0), Vector(638.0)), Vector(Vector(639.0), Vector(640.0), Vector(641.0))))), s5(Vector(Vector(s1(s0(Vector(Vector(642.0), Vector(643.0), Vector(644.0)), Vector(Vector(645.0), Vector(646.0), Vector(647.0))), s0(Vector(Vector(648.0), Vector(649.0), Vector(650.0)), Vector(Vector(651.0), Vector(652.0), Vector(653.0))))), Vector(s1(s0(Vector(Vector(654.0), Vector(655.0), Vector(656.0)), Vector(Vector(657.0), Vector(658.0), Vector(659.0))), s0(Vector(Vector(660.0), Vector(661.0), Vector(662.0)), Vector(Vector(663.0), Vector(664.0), Vector(665.0)))))), Vector(s0(Vector(Vector(666.0), Vector(667.0), Vector(668.0)), Vector(Vector(669.0), Vector(670.0), Vector(671.0))), s0(Vector(Vector(672.0), Vector(673.0), Vector(674.0)), Vector(Vector(675.0), Vector(676.0), Vector(677.0))), s0(Vector(Vector(678.0), Vector(679.0), Vector(680.0)), Vector(Vector(681.0), Vector(682.0), Vector(683.0))))), s5(Vector(Vector(s1(s0(Vector(Vector(684.0), Vector(685.0), Vector(686.0)), Vector(Vector(687.0), Vector(688.0), Vector(689.0))), s0(Vector(Vector(690.0), Vector(691.0), Vector(692.0)), Vector(Vector(693.0), Vector(694.0), Vector(695.0))))), Vector(s1(s0(Vector(Vector(696.0), Vector(697.0), Vector(698.0)), Vector(Vector(699.0), Vector(700.0), Vector(701.0))), s0(Vector(Vector(702.0), Vector(703.0), Vector(704.0)), Vector(Vector(705.0), Vector(706.0), Vector(707.0)))))), Vector(s0(Vector(Vector(708.0), Vector(709.0), Vector(710.0)), Vector(Vector(711.0), Vector(712.0), Vector(713.0))), s0(Vector(Vector(714.0), Vector(715.0), Vector(716.0)), Vector(Vector(717.0), Vector(718.0), Vector(719.0))), s0(Vector(Vector(720.0), Vector(721.0), Vector(722.0)), Vector(Vector(723.0), Vector(724.0), Vector(725.0))))))))), Vector(Vector(s0(Vector(Vector(726.0), Vector(727.0), Vector(728.0)), Vector(Vector(729.0), Vector(730.0), Vector(731.0)))), Vector(s0(Vector(Vector(732.0), Vector(733.0), Vector(734.0)), Vector(Vector(735.0), Vector(736.0), Vector(737.0)))), Vector(s0(Vector(Vector(738.0), Vector(739.0), Vector(740.0)), Vector(Vector(741.0), Vector(742.0), Vector(743.0))))))
    val v1: s9 = s9(Vector(s2(s1(s0(Vector(Vector(744.0), Vector(745.0), Vector(746.0)), Vector(Vector(747.0), Vector(748.0), Vector(749.0))), s0(Vector(Vector(750.0), Vector(751.0), Vector(752.0)), Vector(Vector(753.0), Vector(754.0), Vector(755.0)))), Vector(s1(s0(Vector(Vector(756.0), Vector(757.0), Vector(758.0)), Vector(Vector(759.0), Vector(760.0), Vector(761.0))), s0(Vector(Vector(762.0), Vector(763.0), Vector(764.0)), Vector(Vector(765.0), Vector(766.0), Vector(767.0)))), s1(s0(Vector(Vector(768.0), Vector(769.0), Vector(770.0)), Vector(Vector(771.0), Vector(772.0), Vector(773.0))), s0(Vector(Vector(774.0), Vector(775.0), Vector(776.0)), Vector(Vector(777.0), Vector(778.0), Vector(779.0)))), s1(s0(Vector(Vector(780.0), Vector(781.0), Vector(782.0)), Vector(Vector(783.0), Vector(784.0), Vector(785.0))), s0(Vector(Vector(786.0), Vector(787.0), Vector(788.0)), Vector(Vector(789.0), Vector(790.0), Vector(791.0))))), s0(Vector(Vector(792.0), Vector(793.0), Vector(794.0)), Vector(Vector(795.0), Vector(796.0), Vector(797.0))), Vector(Vector(s0(Vector(Vector(798.0), Vector(799.0), Vector(800.0)), Vector(Vector(801.0), Vector(802.0), Vector(803.0)))), Vector(s0(Vector(Vector(804.0), Vector(805.0), Vector(806.0)), Vector(Vector(807.0), Vector(808.0), Vector(809.0)))), Vector(s0(Vector(Vector(810.0), Vector(811.0), Vector(812.0)), Vector(Vector(813.0), Vector(814.0), Vector(815.0)))))), s2(s1(s0(Vector(Vector(816.0), Vector(817.0), Vector(818.0)), Vector(Vector(819.0), Vector(820.0), Vector(821.0))), s0(Vector(Vector(822.0), Vector(823.0), Vector(824.0)), Vector(Vector(825.0), Vector(826.0), Vector(827.0)))), Vector(s1(s0(Vector(Vector(828.0), Vector(829.0), Vector(830.0)), Vector(Vector(831.0), Vector(832.0), Vector(833.0))), s0(Vector(Vector(834.0), Vector(835.0), Vector(836.0)), Vector(Vector(837.0), Vector(838.0), Vector(839.0)))), s1(s0(Vector(Vector(840.0), Vector(841.0), Vector(842.0)), Vector(Vector(843.0), Vector(844.0), Vector(845.0))), s0(Vector(Vector(846.0), Vector(847.0), Vector(848.0)), Vector(Vector(849.0), Vector(850.0), Vector(851.0)))), s1(s0(Vector(Vector(852.0), Vector(853.0), Vector(854.0)), Vector(Vector(855.0), Vector(856.0), Vector(857.0))), s0(Vector(Vector(858.0), Vector(859.0), Vector(860.0)), Vector(Vector(861.0), Vector(862.0), Vector(863.0))))), s0(Vector(Vector(864.0), Vector(865.0), Vector(866.0)), Vector(Vector(867.0), Vector(868.0), Vector(869.0))), Vector(Vector(s0(Vector(Vector(870.0), Vector(871.0), Vector(872.0)), Vector(Vector(873.0), Vector(874.0), Vector(875.0)))), Vector(s0(Vector(Vector(876.0), Vector(877.0), Vector(878.0)), Vector(Vector(879.0), Vector(880.0), Vector(881.0)))), Vector(s0(Vector(Vector(882.0), Vector(883.0), Vector(884.0)), Vector(Vector(885.0), Vector(886.0), Vector(887.0))))))), Vector(s6(s2(s1(s0(Vector(Vector(888.0), Vector(889.0), Vector(890.0)), Vector(Vector(891.0), Vector(892.0), Vector(893.0))), s0(Vector(Vector(894.0), Vector(895.0), Vector(896.0)), Vector(Vector(897.0), Vector(898.0), Vector(899.0)))), Vector(s1(s0(Vector(Vector(900.0), Vector(901.0), Vector(902.0)), Vector(Vector(903.0), Vector(904.0), Vector(905.0))), s0(Vector(Vector(906.0), Vector(907.0), Vector(908.0)), Vector(Vector(909.0), Vector(910.0), Vector(911.0)))), s1(s0(Vector(Vector(912.0), Vector(913.0), Vector(914.0)), Vector(Vector(915.0), Vector(916.0), Vector(917.0))), s0(Vector(Vector(918.0), Vector(919.0), Vector(920.0)), Vector(Vector(921.0), Vector(922.0), Vector(923.0)))), s1(s0(Vector(Vector(924.0), Vector(925.0), Vector(926.0)), Vector(Vector(927.0), Vector(928.0), Vector(929.0))), s0(Vector(Vector(930.0), Vector(931.0), Vector(932.0)), Vector(Vector(933.0), Vector(934.0), Vector(935.0))))), s0(Vector(Vector(936.0), Vector(937.0), Vector(938.0)), Vector(Vector(939.0), Vector(940.0), Vector(941.0))), Vector(Vector(s0(Vector(Vector(942.0), Vector(943.0), Vector(944.0)), Vector(Vector(945.0), Vector(946.0), Vector(947.0)))), Vector(s0(Vector(Vector(948.0), Vector(949.0), Vector(950.0)), Vector(Vector(951.0), Vector(952.0), Vector(953.0)))), Vector(s0(Vector(Vector(954.0), Vector(955.0), Vector(956.0)), Vector(Vector(957.0), Vector(958.0), Vector(959.0)))))), Vector(s5(Vector(Vector(s1(s0(Vector(Vector(960.0), Vector(961.0), Vector(962.0)), Vector(Vector(963.0), Vector(964.0), Vector(965.0))), s0(Vector(Vector(966.0), Vector(967.0), Vector(968.0)), Vector(Vector(969.0), Vector(970.0), Vector(971.0))))), Vector(s1(s0(Vector(Vector(972.0), Vector(973.0), Vector(974.0)), Vector(Vector(975.0), Vector(976.0), Vector(977.0))), s0(Vector(Vector(978.0), Vector(979.0), Vector(980.0)), Vector(Vector(981.0), Vector(982.0), Vector(983.0)))))), Vector(s0(Vector(Vector(984.0), Vector(985.0), Vector(986.0)), Vector(Vector(987.0), Vector(988.0), Vector(989.0))), s0(Vector(Vector(990.0), Vector(991.0), Vector(992.0)), Vector(Vector(993.0), Vector(994.0), Vector(995.0))), s0(Vector(Vector(996.0), Vector(997.0), Vector(998.0)), Vector(Vector(999.0), Vector(1000.0), Vector(1001.0))))), s5(Vector(Vector(s1(s0(Vector(Vector(1002.0), Vector(1003.0), Vector(1004.0)), Vector(Vector(1005.0), Vector(1006.0), Vector(1007.0))), s0(Vector(Vector(1008.0), Vector(1009.0), Vector(1010.0)), Vector(Vector(1011.0), Vector(1012.0), Vector(1013.0))))), Vector(s1(s0(Vector(Vector(1014.0), Vector(1015.0), Vector(1016.0)), Vector(Vector(1017.0), Vector(1018.0), Vector(1019.0))), s0(Vector(Vector(1020.0), Vector(1021.0), Vector(1022.0)), Vector(Vector(1023.0), Vector(1024.0), Vector(1025.0)))))), Vector(s0(Vector(Vector(1026.0), Vector(1027.0), Vector(1028.0)), Vector(Vector(1029.0), Vector(1030.0), Vector(1031.0))), s0(Vector(Vector(1032.0), Vector(1033.0), Vector(1034.0)), Vector(Vector(1035.0), Vector(1036.0), Vector(1037.0))), s0(Vector(Vector(1038.0), Vector(1039.0), Vector(1040.0)), Vector(Vector(1041.0), Vector(1042.0), Vector(1043.0))))), s5(Vector(Vector(s1(s0(Vector(Vector(1044.0), Vector(1045.0), Vector(1046.0)), Vector(Vector(1047.0), Vector(1048.0), Vector(1049.0))), s0(Vector(Vector(1050.0), Vector(1051.0), Vector(1052.0)), Vector(Vector(1053.0), Vector(1054.0), Vector(1055.0))))), Vector(s1(s0(Vector(Vector(1056.0), Vector(1057.0), Vector(1058.0)), Vector(Vector(1059.0), Vector(1060.0), Vector(1061.0))), s0(Vector(Vector(1062.0), Vector(1063.0), Vector(1064.0)), Vector(Vector(1065.0), Vector(1066.0), Vector(1067.0)))))), Vector(s0(Vector(Vector(1068.0), Vector(1069.0), Vector(1070.0)), Vector(Vector(1071.0), Vector(1072.0), Vector(1073.0))), s0(Vector(Vector(1074.0), Vector(1075.0), Vector(1076.0)), Vector(Vector(1077.0), Vector(1078.0), Vector(1079.0))), s0(Vector(Vector(1080.0), Vector(1081.0), Vector(1082.0)), Vector(Vector(1083.0), Vector(1084.0), Vector(1085.0))))))), s6(s2(s1(s0(Vector(Vector(1086.0), Vector(1087.0), Vector(1088.0)), Vector(Vector(1089.0), Vector(1090.0), Vector(1091.0))), s0(Vector(Vector(1092.0), Vector(1093.0), Vector(1094.0)), Vector(Vector(1095.0), Vector(1096.0), Vector(1097.0)))), Vector(s1(s0(Vector(Vector(1098.0), Vector(1099.0), Vector(1100.0)), Vector(Vector(1101.0), Vector(1102.0), Vector(1103.0))), s0(Vector(Vector(1104.0), Vector(1105.0), Vector(1106.0)), Vector(Vector(1107.0), Vector(1108.0), Vector(1109.0)))), s1(s0(Vector(Vector(1110.0), Vector(1111.0), Vector(1112.0)), Vector(Vector(1113.0), Vector(1114.0), Vector(1115.0))), s0(Vector(Vector(1116.0), Vector(1117.0), Vector(1118.0)), Vector(Vector(1119.0), Vector(1120.0), Vector(1121.0)))), s1(s0(Vector(Vector(1122.0), Vector(1123.0), Vector(1124.0)), Vector(Vector(1125.0), Vector(1126.0), Vector(1127.0))), s0(Vector(Vector(1128.0), Vector(1129.0), Vector(1130.0)), Vector(Vector(1131.0), Vector(1132.0), Vector(1133.0))))), s0(Vector(Vector(1134.0), Vector(1135.0), Vector(1136.0)), Vector(Vector(1137.0), Vector(1138.0), Vector(1139.0))), Vector(Vector(s0(Vector(Vector(1140.0), Vector(1141.0), Vector(1142.0)), Vector(Vector(1143.0), Vector(1144.0), Vector(1145.0)))), Vector(s0(Vector(Vector(1146.0), Vector(1147.0), Vector(1148.0)), Vector(Vector(1149.0), Vector(1150.0), Vector(1151.0)))), Vector(s0(Vector(Vector(1152.0), Vector(1153.0), Vector(1154.0)), Vector(Vector(1155.0), Vector(1156.0), Vector(1157.0)))))), Vector(s5(Vector(Vector(s1(s0(Vector(Vector(1158.0), Vector(1159.0), Vector(1160.0)), Vector(Vector(1161.0), Vector(1162.0), Vector(1163.0))), s0(Vector(Vector(1164.0), Vector(1165.0), Vector(1166.0)), Vector(Vector(1167.0), Vector(1168.0), Vector(1169.0))))), Vector(s1(s0(Vector(Vector(1170.0), Vector(1171.0), Vector(1172.0)), Vector(Vector(1173.0), Vector(1174.0), Vector(1175.0))), s0(Vector(Vector(1176.0), Vector(1177.0), Vector(1178.0)), Vector(Vector(1179.0), Vector(1180.0), Vector(1181.0)))))), Vector(s0(Vector(Vector(1182.0), Vector(1183.0), Vector(1184.0)), Vector(Vector(1185.0), Vector(1186.0), Vector(1187.0))), s0(Vector(Vector(1188.0), Vector(1189.0), Vector(1190.0)), Vector(Vector(1191.0), Vector(1192.0), Vector(1193.0))), s0(Vector(Vector(1194.0), Vector(1195.0), Vector(1196.0)), Vector(Vector(1197.0), Vector(1198.0), Vector(1199.0))))), s5(Vector(Vector(s1(s0(Vector(Vector(1200.0), Vector(1201.0), Vector(1202.0)), Vector(Vector(1203.0), Vector(1204.0), Vector(1205.0))), s0(Vector(Vector(1206.0), Vector(1207.0), Vector(1208.0)), Vector(Vector(1209.0), Vector(1210.0), Vector(1211.0))))), Vector(s1(s0(Vector(Vector(1212.0), Vector(1213.0), Vector(1214.0)), Vector(Vector(1215.0), Vector(1216.0), Vector(1217.0))), s0(Vector(Vector(1218.0), Vector(1219.0), Vector(1220.0)), Vector(Vector(1221.0), Vector(1222.0), Vector(1223.0)))))), Vector(s0(Vector(Vector(1224.0), Vector(1225.0), Vector(1226.0)), Vector(Vector(1227.0), Vector(1228.0), Vector(1229.0))), s0(Vector(Vector(1230.0), Vector(1231.0), Vector(1232.0)), Vector(Vector(1233.0), Vector(1234.0), Vector(1235.0))), s0(Vector(Vector(1236.0), Vector(1237.0), Vector(1238.0)), Vector(Vector(1239.0), Vector(1240.0), Vector(1241.0))))), s5(Vector(Vector(s1(s0(Vector(Vector(1242.0), Vector(1243.0), Vector(1244.0)), Vector(Vector(1245.0), Vector(1246.0), Vector(1247.0))), s0(Vector(Vector(1248.0), Vector(1249.0), Vector(1250.0)), Vector(Vector(1251.0), Vector(1252.0), Vector(1253.0))))), Vector(s1(s0(Vector(Vector(1254.0), Vector(1255.0), Vector(1256.0)), Vector(Vector(1257.0), Vector(1258.0), Vector(1259.0))), s0(Vector(Vector(1260.0), Vector(1261.0), Vector(1262.0)), Vector(Vector(1263.0), Vector(1264.0), Vector(1265.0)))))), Vector(s0(Vector(Vector(1266.0), Vector(1267.0), Vector(1268.0)), Vector(Vector(1269.0), Vector(1270.0), Vector(1271.0))), s0(Vector(Vector(1272.0), Vector(1273.0), Vector(1274.0)), Vector(Vector(1275.0), Vector(1276.0), Vector(1277.0))), s0(Vector(Vector(1278.0), Vector(1279.0), Vector(1280.0)), Vector(Vector(1281.0), Vector(1282.0), Vector(1283.0)))))))))
    val v2: Double = 1284.0
    val start = nanoTime()
    var result: Double = 1284.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}