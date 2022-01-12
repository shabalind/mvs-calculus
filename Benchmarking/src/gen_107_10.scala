import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]],
    p3: Vector[Vector[Double]],
    p4: Vector[Vector[Double]],
    p5: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s2 (
    p0: Vector[s1],
    p1: s0
  )
  case class s4 (
    p0: Vector[Vector[s2]],
    p1: s2
  )
  case class s6 (
    p0: Vector[Vector[s4]],
    p1: s4,
    p2: Vector[s1],
    p3: Vector[s4]
  )
  def f108(v0: Double): Double = {
    var v2: Double = v0
    var v6: Double = v0
    var v10: Double = v6
    val v8: Double = v6 + v6
    var v4: Double = v0
    v6 = v8
    var v3: Double = v2
    var v5: Double = v4
    var v7: Double = v2
    val v11: Double = v2 - v0
    var v9: Double = v3
    var v20: Double = v5
    var v15: Double = v0
    var v24: Double = v11
    var v17: Double = v24
    var v14: Double = v4
    var v25: Double = v5
    var v22: Double = v20
    var v28: Double = v5
    val v16: Double = v14 + v28
    var v26: Double = v2
    var v38: Double = v14
    var v42: Double = v38
    val v64: Vector[Double] = Vector(v22, v17, v4, v15, v42, v3, v2)
    val v29: Double = v64(1)
    var v62: Vector[Double] = v64
    var v66: Vector[Double] = v62
    v62 = v62.updated(4, v9)
    v66 = v66.updated(2, v16)
    v66 = v66.updated(3, v25)
    v42 = v10
    v62 = v62.updated(5, v8)
    v62 = v62.updated(0, v3)
    v62 = v62.updated(1, v29)
    var v33: Vector[Double] = v66
    var v45: Double = v26
    v33 = v33.updated(2, v10)
    v66 = v66.updated(5, v11)
    var v72: Vector[Double] = v62
    v62 = v62.updated(5, v22)
    v33 = v33.updated(3, v45)
    v62 = v62.updated(6, v15)
    var v79: Vector[Double] = v72
    v26 = v7
    val v213: Vector[Vector[Double]] = Vector(v79, v79, v33)
    val v142: Vector[Double] = v213(0)
    val v82: Double = v142(0)
    v82
  }
  @noinline
  def f0(v0: s2, v1: Double, v2: s6): Double = {
    var v12: Double = v1
    val v11: Vector[Double] = Vector(v1, v12, v1, v12, v12)
    val v31: Double = v11(2)
    val v21: Double = f108(v31)
    v21
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(Vector(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0)), Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0))), Vector(s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0)), Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0)), Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0))))), s1(s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0)), Vector(Vector(21.0)), Vector(Vector(22.0), Vector(23.0)), Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0))), Vector(s0(Vector(Vector(27.0), Vector(28.0)), Vector(Vector(29.0)), Vector(Vector(30.0)), Vector(Vector(31.0), Vector(32.0)), Vector(Vector(33.0)), Vector(Vector(34.0), Vector(35.0))))), s1(s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0)), Vector(Vector(39.0)), Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0)), Vector(Vector(43.0), Vector(44.0))), Vector(s0(Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0)), Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0)), Vector(Vector(51.0)), Vector(Vector(52.0), Vector(53.0)))))), s0(Vector(Vector(54.0), Vector(55.0)), Vector(Vector(56.0)), Vector(Vector(57.0)), Vector(Vector(58.0), Vector(59.0)), Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0))))
    val v1: Double = 63.0
    val v2: s6 = s6(Vector(Vector(s4(Vector(Vector(s2(Vector(s1(s0(Vector(Vector(64.0), Vector(65.0)), Vector(Vector(66.0)), Vector(Vector(67.0)), Vector(Vector(68.0), Vector(69.0)), Vector(Vector(70.0)), Vector(Vector(71.0), Vector(72.0))), Vector(s0(Vector(Vector(73.0), Vector(74.0)), Vector(Vector(75.0)), Vector(Vector(76.0)), Vector(Vector(77.0), Vector(78.0)), Vector(Vector(79.0)), Vector(Vector(80.0), Vector(81.0))))), s1(s0(Vector(Vector(82.0), Vector(83.0)), Vector(Vector(84.0)), Vector(Vector(85.0)), Vector(Vector(86.0), Vector(87.0)), Vector(Vector(88.0)), Vector(Vector(89.0), Vector(90.0))), Vector(s0(Vector(Vector(91.0), Vector(92.0)), Vector(Vector(93.0)), Vector(Vector(94.0)), Vector(Vector(95.0), Vector(96.0)), Vector(Vector(97.0)), Vector(Vector(98.0), Vector(99.0))))), s1(s0(Vector(Vector(100.0), Vector(101.0)), Vector(Vector(102.0)), Vector(Vector(103.0)), Vector(Vector(104.0), Vector(105.0)), Vector(Vector(106.0)), Vector(Vector(107.0), Vector(108.0))), Vector(s0(Vector(Vector(109.0), Vector(110.0)), Vector(Vector(111.0)), Vector(Vector(112.0)), Vector(Vector(113.0), Vector(114.0)), Vector(Vector(115.0)), Vector(Vector(116.0), Vector(117.0)))))), s0(Vector(Vector(118.0), Vector(119.0)), Vector(Vector(120.0)), Vector(Vector(121.0)), Vector(Vector(122.0), Vector(123.0)), Vector(Vector(124.0)), Vector(Vector(125.0), Vector(126.0))))), Vector(s2(Vector(s1(s0(Vector(Vector(127.0), Vector(128.0)), Vector(Vector(129.0)), Vector(Vector(130.0)), Vector(Vector(131.0), Vector(132.0)), Vector(Vector(133.0)), Vector(Vector(134.0), Vector(135.0))), Vector(s0(Vector(Vector(136.0), Vector(137.0)), Vector(Vector(138.0)), Vector(Vector(139.0)), Vector(Vector(140.0), Vector(141.0)), Vector(Vector(142.0)), Vector(Vector(143.0), Vector(144.0))))), s1(s0(Vector(Vector(145.0), Vector(146.0)), Vector(Vector(147.0)), Vector(Vector(148.0)), Vector(Vector(149.0), Vector(150.0)), Vector(Vector(151.0)), Vector(Vector(152.0), Vector(153.0))), Vector(s0(Vector(Vector(154.0), Vector(155.0)), Vector(Vector(156.0)), Vector(Vector(157.0)), Vector(Vector(158.0), Vector(159.0)), Vector(Vector(160.0)), Vector(Vector(161.0), Vector(162.0))))), s1(s0(Vector(Vector(163.0), Vector(164.0)), Vector(Vector(165.0)), Vector(Vector(166.0)), Vector(Vector(167.0), Vector(168.0)), Vector(Vector(169.0)), Vector(Vector(170.0), Vector(171.0))), Vector(s0(Vector(Vector(172.0), Vector(173.0)), Vector(Vector(174.0)), Vector(Vector(175.0)), Vector(Vector(176.0), Vector(177.0)), Vector(Vector(178.0)), Vector(Vector(179.0), Vector(180.0)))))), s0(Vector(Vector(181.0), Vector(182.0)), Vector(Vector(183.0)), Vector(Vector(184.0)), Vector(Vector(185.0), Vector(186.0)), Vector(Vector(187.0)), Vector(Vector(188.0), Vector(189.0)))))), s2(Vector(s1(s0(Vector(Vector(190.0), Vector(191.0)), Vector(Vector(192.0)), Vector(Vector(193.0)), Vector(Vector(194.0), Vector(195.0)), Vector(Vector(196.0)), Vector(Vector(197.0), Vector(198.0))), Vector(s0(Vector(Vector(199.0), Vector(200.0)), Vector(Vector(201.0)), Vector(Vector(202.0)), Vector(Vector(203.0), Vector(204.0)), Vector(Vector(205.0)), Vector(Vector(206.0), Vector(207.0))))), s1(s0(Vector(Vector(208.0), Vector(209.0)), Vector(Vector(210.0)), Vector(Vector(211.0)), Vector(Vector(212.0), Vector(213.0)), Vector(Vector(214.0)), Vector(Vector(215.0), Vector(216.0))), Vector(s0(Vector(Vector(217.0), Vector(218.0)), Vector(Vector(219.0)), Vector(Vector(220.0)), Vector(Vector(221.0), Vector(222.0)), Vector(Vector(223.0)), Vector(Vector(224.0), Vector(225.0))))), s1(s0(Vector(Vector(226.0), Vector(227.0)), Vector(Vector(228.0)), Vector(Vector(229.0)), Vector(Vector(230.0), Vector(231.0)), Vector(Vector(232.0)), Vector(Vector(233.0), Vector(234.0))), Vector(s0(Vector(Vector(235.0), Vector(236.0)), Vector(Vector(237.0)), Vector(Vector(238.0)), Vector(Vector(239.0), Vector(240.0)), Vector(Vector(241.0)), Vector(Vector(242.0), Vector(243.0)))))), s0(Vector(Vector(244.0), Vector(245.0)), Vector(Vector(246.0)), Vector(Vector(247.0)), Vector(Vector(248.0), Vector(249.0)), Vector(Vector(250.0)), Vector(Vector(251.0), Vector(252.0)))))), Vector(s4(Vector(Vector(s2(Vector(s1(s0(Vector(Vector(253.0), Vector(254.0)), Vector(Vector(255.0)), Vector(Vector(256.0)), Vector(Vector(257.0), Vector(258.0)), Vector(Vector(259.0)), Vector(Vector(260.0), Vector(261.0))), Vector(s0(Vector(Vector(262.0), Vector(263.0)), Vector(Vector(264.0)), Vector(Vector(265.0)), Vector(Vector(266.0), Vector(267.0)), Vector(Vector(268.0)), Vector(Vector(269.0), Vector(270.0))))), s1(s0(Vector(Vector(271.0), Vector(272.0)), Vector(Vector(273.0)), Vector(Vector(274.0)), Vector(Vector(275.0), Vector(276.0)), Vector(Vector(277.0)), Vector(Vector(278.0), Vector(279.0))), Vector(s0(Vector(Vector(280.0), Vector(281.0)), Vector(Vector(282.0)), Vector(Vector(283.0)), Vector(Vector(284.0), Vector(285.0)), Vector(Vector(286.0)), Vector(Vector(287.0), Vector(288.0))))), s1(s0(Vector(Vector(289.0), Vector(290.0)), Vector(Vector(291.0)), Vector(Vector(292.0)), Vector(Vector(293.0), Vector(294.0)), Vector(Vector(295.0)), Vector(Vector(296.0), Vector(297.0))), Vector(s0(Vector(Vector(298.0), Vector(299.0)), Vector(Vector(300.0)), Vector(Vector(301.0)), Vector(Vector(302.0), Vector(303.0)), Vector(Vector(304.0)), Vector(Vector(305.0), Vector(306.0)))))), s0(Vector(Vector(307.0), Vector(308.0)), Vector(Vector(309.0)), Vector(Vector(310.0)), Vector(Vector(311.0), Vector(312.0)), Vector(Vector(313.0)), Vector(Vector(314.0), Vector(315.0))))), Vector(s2(Vector(s1(s0(Vector(Vector(316.0), Vector(317.0)), Vector(Vector(318.0)), Vector(Vector(319.0)), Vector(Vector(320.0), Vector(321.0)), Vector(Vector(322.0)), Vector(Vector(323.0), Vector(324.0))), Vector(s0(Vector(Vector(325.0), Vector(326.0)), Vector(Vector(327.0)), Vector(Vector(328.0)), Vector(Vector(329.0), Vector(330.0)), Vector(Vector(331.0)), Vector(Vector(332.0), Vector(333.0))))), s1(s0(Vector(Vector(334.0), Vector(335.0)), Vector(Vector(336.0)), Vector(Vector(337.0)), Vector(Vector(338.0), Vector(339.0)), Vector(Vector(340.0)), Vector(Vector(341.0), Vector(342.0))), Vector(s0(Vector(Vector(343.0), Vector(344.0)), Vector(Vector(345.0)), Vector(Vector(346.0)), Vector(Vector(347.0), Vector(348.0)), Vector(Vector(349.0)), Vector(Vector(350.0), Vector(351.0))))), s1(s0(Vector(Vector(352.0), Vector(353.0)), Vector(Vector(354.0)), Vector(Vector(355.0)), Vector(Vector(356.0), Vector(357.0)), Vector(Vector(358.0)), Vector(Vector(359.0), Vector(360.0))), Vector(s0(Vector(Vector(361.0), Vector(362.0)), Vector(Vector(363.0)), Vector(Vector(364.0)), Vector(Vector(365.0), Vector(366.0)), Vector(Vector(367.0)), Vector(Vector(368.0), Vector(369.0)))))), s0(Vector(Vector(370.0), Vector(371.0)), Vector(Vector(372.0)), Vector(Vector(373.0)), Vector(Vector(374.0), Vector(375.0)), Vector(Vector(376.0)), Vector(Vector(377.0), Vector(378.0)))))), s2(Vector(s1(s0(Vector(Vector(379.0), Vector(380.0)), Vector(Vector(381.0)), Vector(Vector(382.0)), Vector(Vector(383.0), Vector(384.0)), Vector(Vector(385.0)), Vector(Vector(386.0), Vector(387.0))), Vector(s0(Vector(Vector(388.0), Vector(389.0)), Vector(Vector(390.0)), Vector(Vector(391.0)), Vector(Vector(392.0), Vector(393.0)), Vector(Vector(394.0)), Vector(Vector(395.0), Vector(396.0))))), s1(s0(Vector(Vector(397.0), Vector(398.0)), Vector(Vector(399.0)), Vector(Vector(400.0)), Vector(Vector(401.0), Vector(402.0)), Vector(Vector(403.0)), Vector(Vector(404.0), Vector(405.0))), Vector(s0(Vector(Vector(406.0), Vector(407.0)), Vector(Vector(408.0)), Vector(Vector(409.0)), Vector(Vector(410.0), Vector(411.0)), Vector(Vector(412.0)), Vector(Vector(413.0), Vector(414.0))))), s1(s0(Vector(Vector(415.0), Vector(416.0)), Vector(Vector(417.0)), Vector(Vector(418.0)), Vector(Vector(419.0), Vector(420.0)), Vector(Vector(421.0)), Vector(Vector(422.0), Vector(423.0))), Vector(s0(Vector(Vector(424.0), Vector(425.0)), Vector(Vector(426.0)), Vector(Vector(427.0)), Vector(Vector(428.0), Vector(429.0)), Vector(Vector(430.0)), Vector(Vector(431.0), Vector(432.0)))))), s0(Vector(Vector(433.0), Vector(434.0)), Vector(Vector(435.0)), Vector(Vector(436.0)), Vector(Vector(437.0), Vector(438.0)), Vector(Vector(439.0)), Vector(Vector(440.0), Vector(441.0))))))), s4(Vector(Vector(s2(Vector(s1(s0(Vector(Vector(442.0), Vector(443.0)), Vector(Vector(444.0)), Vector(Vector(445.0)), Vector(Vector(446.0), Vector(447.0)), Vector(Vector(448.0)), Vector(Vector(449.0), Vector(450.0))), Vector(s0(Vector(Vector(451.0), Vector(452.0)), Vector(Vector(453.0)), Vector(Vector(454.0)), Vector(Vector(455.0), Vector(456.0)), Vector(Vector(457.0)), Vector(Vector(458.0), Vector(459.0))))), s1(s0(Vector(Vector(460.0), Vector(461.0)), Vector(Vector(462.0)), Vector(Vector(463.0)), Vector(Vector(464.0), Vector(465.0)), Vector(Vector(466.0)), Vector(Vector(467.0), Vector(468.0))), Vector(s0(Vector(Vector(469.0), Vector(470.0)), Vector(Vector(471.0)), Vector(Vector(472.0)), Vector(Vector(473.0), Vector(474.0)), Vector(Vector(475.0)), Vector(Vector(476.0), Vector(477.0))))), s1(s0(Vector(Vector(478.0), Vector(479.0)), Vector(Vector(480.0)), Vector(Vector(481.0)), Vector(Vector(482.0), Vector(483.0)), Vector(Vector(484.0)), Vector(Vector(485.0), Vector(486.0))), Vector(s0(Vector(Vector(487.0), Vector(488.0)), Vector(Vector(489.0)), Vector(Vector(490.0)), Vector(Vector(491.0), Vector(492.0)), Vector(Vector(493.0)), Vector(Vector(494.0), Vector(495.0)))))), s0(Vector(Vector(496.0), Vector(497.0)), Vector(Vector(498.0)), Vector(Vector(499.0)), Vector(Vector(500.0), Vector(501.0)), Vector(Vector(502.0)), Vector(Vector(503.0), Vector(504.0))))), Vector(s2(Vector(s1(s0(Vector(Vector(505.0), Vector(506.0)), Vector(Vector(507.0)), Vector(Vector(508.0)), Vector(Vector(509.0), Vector(510.0)), Vector(Vector(511.0)), Vector(Vector(512.0), Vector(513.0))), Vector(s0(Vector(Vector(514.0), Vector(515.0)), Vector(Vector(516.0)), Vector(Vector(517.0)), Vector(Vector(518.0), Vector(519.0)), Vector(Vector(520.0)), Vector(Vector(521.0), Vector(522.0))))), s1(s0(Vector(Vector(523.0), Vector(524.0)), Vector(Vector(525.0)), Vector(Vector(526.0)), Vector(Vector(527.0), Vector(528.0)), Vector(Vector(529.0)), Vector(Vector(530.0), Vector(531.0))), Vector(s0(Vector(Vector(532.0), Vector(533.0)), Vector(Vector(534.0)), Vector(Vector(535.0)), Vector(Vector(536.0), Vector(537.0)), Vector(Vector(538.0)), Vector(Vector(539.0), Vector(540.0))))), s1(s0(Vector(Vector(541.0), Vector(542.0)), Vector(Vector(543.0)), Vector(Vector(544.0)), Vector(Vector(545.0), Vector(546.0)), Vector(Vector(547.0)), Vector(Vector(548.0), Vector(549.0))), Vector(s0(Vector(Vector(550.0), Vector(551.0)), Vector(Vector(552.0)), Vector(Vector(553.0)), Vector(Vector(554.0), Vector(555.0)), Vector(Vector(556.0)), Vector(Vector(557.0), Vector(558.0)))))), s0(Vector(Vector(559.0), Vector(560.0)), Vector(Vector(561.0)), Vector(Vector(562.0)), Vector(Vector(563.0), Vector(564.0)), Vector(Vector(565.0)), Vector(Vector(566.0), Vector(567.0)))))), s2(Vector(s1(s0(Vector(Vector(568.0), Vector(569.0)), Vector(Vector(570.0)), Vector(Vector(571.0)), Vector(Vector(572.0), Vector(573.0)), Vector(Vector(574.0)), Vector(Vector(575.0), Vector(576.0))), Vector(s0(Vector(Vector(577.0), Vector(578.0)), Vector(Vector(579.0)), Vector(Vector(580.0)), Vector(Vector(581.0), Vector(582.0)), Vector(Vector(583.0)), Vector(Vector(584.0), Vector(585.0))))), s1(s0(Vector(Vector(586.0), Vector(587.0)), Vector(Vector(588.0)), Vector(Vector(589.0)), Vector(Vector(590.0), Vector(591.0)), Vector(Vector(592.0)), Vector(Vector(593.0), Vector(594.0))), Vector(s0(Vector(Vector(595.0), Vector(596.0)), Vector(Vector(597.0)), Vector(Vector(598.0)), Vector(Vector(599.0), Vector(600.0)), Vector(Vector(601.0)), Vector(Vector(602.0), Vector(603.0))))), s1(s0(Vector(Vector(604.0), Vector(605.0)), Vector(Vector(606.0)), Vector(Vector(607.0)), Vector(Vector(608.0), Vector(609.0)), Vector(Vector(610.0)), Vector(Vector(611.0), Vector(612.0))), Vector(s0(Vector(Vector(613.0), Vector(614.0)), Vector(Vector(615.0)), Vector(Vector(616.0)), Vector(Vector(617.0), Vector(618.0)), Vector(Vector(619.0)), Vector(Vector(620.0), Vector(621.0)))))), s0(Vector(Vector(622.0), Vector(623.0)), Vector(Vector(624.0)), Vector(Vector(625.0)), Vector(Vector(626.0), Vector(627.0)), Vector(Vector(628.0)), Vector(Vector(629.0), Vector(630.0))))), Vector(s1(s0(Vector(Vector(631.0), Vector(632.0)), Vector(Vector(633.0)), Vector(Vector(634.0)), Vector(Vector(635.0), Vector(636.0)), Vector(Vector(637.0)), Vector(Vector(638.0), Vector(639.0))), Vector(s0(Vector(Vector(640.0), Vector(641.0)), Vector(Vector(642.0)), Vector(Vector(643.0)), Vector(Vector(644.0), Vector(645.0)), Vector(Vector(646.0)), Vector(Vector(647.0), Vector(648.0))))), s1(s0(Vector(Vector(649.0), Vector(650.0)), Vector(Vector(651.0)), Vector(Vector(652.0)), Vector(Vector(653.0), Vector(654.0)), Vector(Vector(655.0)), Vector(Vector(656.0), Vector(657.0))), Vector(s0(Vector(Vector(658.0), Vector(659.0)), Vector(Vector(660.0)), Vector(Vector(661.0)), Vector(Vector(662.0), Vector(663.0)), Vector(Vector(664.0)), Vector(Vector(665.0), Vector(666.0))))), s1(s0(Vector(Vector(667.0), Vector(668.0)), Vector(Vector(669.0)), Vector(Vector(670.0)), Vector(Vector(671.0), Vector(672.0)), Vector(Vector(673.0)), Vector(Vector(674.0), Vector(675.0))), Vector(s0(Vector(Vector(676.0), Vector(677.0)), Vector(Vector(678.0)), Vector(Vector(679.0)), Vector(Vector(680.0), Vector(681.0)), Vector(Vector(682.0)), Vector(Vector(683.0), Vector(684.0)))))), Vector(s4(Vector(Vector(s2(Vector(s1(s0(Vector(Vector(685.0), Vector(686.0)), Vector(Vector(687.0)), Vector(Vector(688.0)), Vector(Vector(689.0), Vector(690.0)), Vector(Vector(691.0)), Vector(Vector(692.0), Vector(693.0))), Vector(s0(Vector(Vector(694.0), Vector(695.0)), Vector(Vector(696.0)), Vector(Vector(697.0)), Vector(Vector(698.0), Vector(699.0)), Vector(Vector(700.0)), Vector(Vector(701.0), Vector(702.0))))), s1(s0(Vector(Vector(703.0), Vector(704.0)), Vector(Vector(705.0)), Vector(Vector(706.0)), Vector(Vector(707.0), Vector(708.0)), Vector(Vector(709.0)), Vector(Vector(710.0), Vector(711.0))), Vector(s0(Vector(Vector(712.0), Vector(713.0)), Vector(Vector(714.0)), Vector(Vector(715.0)), Vector(Vector(716.0), Vector(717.0)), Vector(Vector(718.0)), Vector(Vector(719.0), Vector(720.0))))), s1(s0(Vector(Vector(721.0), Vector(722.0)), Vector(Vector(723.0)), Vector(Vector(724.0)), Vector(Vector(725.0), Vector(726.0)), Vector(Vector(727.0)), Vector(Vector(728.0), Vector(729.0))), Vector(s0(Vector(Vector(730.0), Vector(731.0)), Vector(Vector(732.0)), Vector(Vector(733.0)), Vector(Vector(734.0), Vector(735.0)), Vector(Vector(736.0)), Vector(Vector(737.0), Vector(738.0)))))), s0(Vector(Vector(739.0), Vector(740.0)), Vector(Vector(741.0)), Vector(Vector(742.0)), Vector(Vector(743.0), Vector(744.0)), Vector(Vector(745.0)), Vector(Vector(746.0), Vector(747.0))))), Vector(s2(Vector(s1(s0(Vector(Vector(748.0), Vector(749.0)), Vector(Vector(750.0)), Vector(Vector(751.0)), Vector(Vector(752.0), Vector(753.0)), Vector(Vector(754.0)), Vector(Vector(755.0), Vector(756.0))), Vector(s0(Vector(Vector(757.0), Vector(758.0)), Vector(Vector(759.0)), Vector(Vector(760.0)), Vector(Vector(761.0), Vector(762.0)), Vector(Vector(763.0)), Vector(Vector(764.0), Vector(765.0))))), s1(s0(Vector(Vector(766.0), Vector(767.0)), Vector(Vector(768.0)), Vector(Vector(769.0)), Vector(Vector(770.0), Vector(771.0)), Vector(Vector(772.0)), Vector(Vector(773.0), Vector(774.0))), Vector(s0(Vector(Vector(775.0), Vector(776.0)), Vector(Vector(777.0)), Vector(Vector(778.0)), Vector(Vector(779.0), Vector(780.0)), Vector(Vector(781.0)), Vector(Vector(782.0), Vector(783.0))))), s1(s0(Vector(Vector(784.0), Vector(785.0)), Vector(Vector(786.0)), Vector(Vector(787.0)), Vector(Vector(788.0), Vector(789.0)), Vector(Vector(790.0)), Vector(Vector(791.0), Vector(792.0))), Vector(s0(Vector(Vector(793.0), Vector(794.0)), Vector(Vector(795.0)), Vector(Vector(796.0)), Vector(Vector(797.0), Vector(798.0)), Vector(Vector(799.0)), Vector(Vector(800.0), Vector(801.0)))))), s0(Vector(Vector(802.0), Vector(803.0)), Vector(Vector(804.0)), Vector(Vector(805.0)), Vector(Vector(806.0), Vector(807.0)), Vector(Vector(808.0)), Vector(Vector(809.0), Vector(810.0)))))), s2(Vector(s1(s0(Vector(Vector(811.0), Vector(812.0)), Vector(Vector(813.0)), Vector(Vector(814.0)), Vector(Vector(815.0), Vector(816.0)), Vector(Vector(817.0)), Vector(Vector(818.0), Vector(819.0))), Vector(s0(Vector(Vector(820.0), Vector(821.0)), Vector(Vector(822.0)), Vector(Vector(823.0)), Vector(Vector(824.0), Vector(825.0)), Vector(Vector(826.0)), Vector(Vector(827.0), Vector(828.0))))), s1(s0(Vector(Vector(829.0), Vector(830.0)), Vector(Vector(831.0)), Vector(Vector(832.0)), Vector(Vector(833.0), Vector(834.0)), Vector(Vector(835.0)), Vector(Vector(836.0), Vector(837.0))), Vector(s0(Vector(Vector(838.0), Vector(839.0)), Vector(Vector(840.0)), Vector(Vector(841.0)), Vector(Vector(842.0), Vector(843.0)), Vector(Vector(844.0)), Vector(Vector(845.0), Vector(846.0))))), s1(s0(Vector(Vector(847.0), Vector(848.0)), Vector(Vector(849.0)), Vector(Vector(850.0)), Vector(Vector(851.0), Vector(852.0)), Vector(Vector(853.0)), Vector(Vector(854.0), Vector(855.0))), Vector(s0(Vector(Vector(856.0), Vector(857.0)), Vector(Vector(858.0)), Vector(Vector(859.0)), Vector(Vector(860.0), Vector(861.0)), Vector(Vector(862.0)), Vector(Vector(863.0), Vector(864.0)))))), s0(Vector(Vector(865.0), Vector(866.0)), Vector(Vector(867.0)), Vector(Vector(868.0)), Vector(Vector(869.0), Vector(870.0)), Vector(Vector(871.0)), Vector(Vector(872.0), Vector(873.0)))))))
    val start = nanoTime()
    var result: Double = StructValue(Name(str='s6', ty=None), [[[StructValue(Name(str='s4', ty=None), [[[StructValue(Name(str='s2', ty=None), [[StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[64.0], [65.0]], [[66.0]], [[67.0]], [[68.0], [69.0]], [[70.0]], [[71.0], [72.0]]]), [StructValue(Name(str='s0', ty=None), [[[73.0], [74.0]], [[75.0]], [[76.0]], [[77.0], [78.0]], [[79.0]], [[80.0], [81.0]]])]]), StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[82.0], [83.0]], [[84.0]], [[85.0]], [[86.0], [87.0]], [[88.0]], [[89.0], [90.0]]]), [StructValue(Name(str='s0', ty=None), [[[91.0], [92.0]], [[93.0]], [[94.0]], [[95.0], [96.0]], [[97.0]], [[98.0], [99.0]]])]]), StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[100.0], [101.0]], [[102.0]], [[103.0]], [[104.0], [105.0]], [[106.0]], [[107.0], [108.0]]]), [StructValue(Name(str='s0', ty=None), [[[109.0], [110.0]], [[111.0]], [[112.0]], [[113.0], [114.0]], [[115.0]], [[116.0], [117.0]]])]])], StructValue(Name(str='s0', ty=None), [[[118.0], [119.0]], [[120.0]], [[121.0]], [[122.0], [123.0]], [[124.0]], [[125.0], [126.0]]])])], [StructValue(Name(str='s2', ty=None), [[StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[127.0], [128.0]], [[129.0]], [[130.0]], [[131.0], [132.0]], [[133.0]], [[134.0], [135.0]]]), [StructValue(Name(str='s0', ty=None), [[[136.0], [137.0]], [[138.0]], [[139.0]], [[140.0], [141.0]], [[142.0]], [[143.0], [144.0]]])]]), StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[145.0], [146.0]], [[147.0]], [[148.0]], [[149.0], [150.0]], [[151.0]], [[152.0], [153.0]]]), [StructValue(Name(str='s0', ty=None), [[[154.0], [155.0]], [[156.0]], [[157.0]], [[158.0], [159.0]], [[160.0]], [[161.0], [162.0]]])]]), StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[163.0], [164.0]], [[165.0]], [[166.0]], [[167.0], [168.0]], [[169.0]], [[170.0], [171.0]]]), [StructValue(Name(str='s0', ty=None), [[[172.0], [173.0]], [[174.0]], [[175.0]], [[176.0], [177.0]], [[178.0]], [[179.0], [180.0]]])]])], StructValue(Name(str='s0', ty=None), [[[181.0], [182.0]], [[183.0]], [[184.0]], [[185.0], [186.0]], [[187.0]], [[188.0], [189.0]]])])]], StructValue(Name(str='s2', ty=None), [[StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[190.0], [191.0]], [[192.0]], [[193.0]], [[194.0], [195.0]], [[196.0]], [[197.0], [198.0]]]), [StructValue(Name(str='s0', ty=None), [[[199.0], [200.0]], [[201.0]], [[202.0]], [[203.0], [204.0]], [[205.0]], [[206.0], [207.0]]])]]), StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[208.0], [209.0]], [[210.0]], [[211.0]], [[212.0], [213.0]], [[214.0]], [[215.0], [216.0]]]), [StructValue(Name(str='s0', ty=None), [[[217.0], [218.0]], [[219.0]], [[220.0]], [[221.0], [222.0]], [[223.0]], [[224.0], [225.0]]])]]), StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[226.0], [227.0]], [[228.0]], [[229.0]], [[230.0], [231.0]], [[232.0]], [[233.0], [234.0]]]), [StructValue(Name(str='s0', ty=None), [[[235.0], [236.0]], [[237.0]], [[238.0]], [[239.0], [240.0]], [[241.0]], [[242.0], [243.0]]])]])], StructValue(Name(str='s0', ty=None), [[[244.0], [245.0]], [[246.0]], [[247.0]], [[248.0], [249.0]], [[250.0]], [[251.0], [252.0]]])])])], [StructValue(Name(str='s4', ty=None), [[[StructValue(Name(str='s2', ty=None), [[StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[253.0], [254.0]], [[255.0]], [[256.0]], [[257.0], [258.0]], [[259.0]], [[260.0], [261.0]]]), [StructValue(Name(str='s0', ty=None), [[[262.0], [263.0]], [[264.0]], [[265.0]], [[266.0], [267.0]], [[268.0]], [[269.0], [270.0]]])]]), StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[271.0], [272.0]], [[273.0]], [[274.0]], [[275.0], [276.0]], [[277.0]], [[278.0], [279.0]]]), [StructValue(Name(str='s0', ty=None), [[[280.0], [281.0]], [[282.0]], [[283.0]], [[284.0], [285.0]], [[286.0]], [[287.0], [288.0]]])]]), StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[289.0], [290.0]], [[291.0]], [[292.0]], [[293.0], [294.0]], [[295.0]], [[296.0], [297.0]]]), [StructValue(Name(str='s0', ty=None), [[[298.0], [299.0]], [[300.0]], [[301.0]], [[302.0], [303.0]], [[304.0]], [[305.0], [306.0]]])]])], StructValue(Name(str='s0', ty=None), [[[307.0], [308.0]], [[309.0]], [[310.0]], [[311.0], [312.0]], [[313.0]], [[314.0], [315.0]]])])], [StructValue(Name(str='s2', ty=None), [[StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[316.0], [317.0]], [[318.0]], [[319.0]], [[320.0], [321.0]], [[322.0]], [[323.0], [324.0]]]), [StructValue(Name(str='s0', ty=None), [[[325.0], [326.0]], [[327.0]], [[328.0]], [[329.0], [330.0]], [[331.0]], [[332.0], [333.0]]])]]), StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[334.0], [335.0]], [[336.0]], [[337.0]], [[338.0], [339.0]], [[340.0]], [[341.0], [342.0]]]), [StructValue(Name(str='s0', ty=None), [[[343.0], [344.0]], [[345.0]], [[346.0]], [[347.0], [348.0]], [[349.0]], [[350.0], [351.0]]])]]), StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[352.0], [353.0]], [[354.0]], [[355.0]], [[356.0], [357.0]], [[358.0]], [[359.0], [360.0]]]), [StructValue(Name(str='s0', ty=None), [[[361.0], [362.0]], [[363.0]], [[364.0]], [[365.0], [366.0]], [[367.0]], [[368.0], [369.0]]])]])], StructValue(Name(str='s0', ty=None), [[[370.0], [371.0]], [[372.0]], [[373.0]], [[374.0], [375.0]], [[376.0]], [[377.0], [378.0]]])])]], StructValue(Name(str='s2', ty=None), [[StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[379.0], [380.0]], [[381.0]], [[382.0]], [[383.0], [384.0]], [[385.0]], [[386.0], [387.0]]]), [StructValue(Name(str='s0', ty=None), [[[388.0], [389.0]], [[390.0]], [[391.0]], [[392.0], [393.0]], [[394.0]], [[395.0], [396.0]]])]]), StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[397.0], [398.0]], [[399.0]], [[400.0]], [[401.0], [402.0]], [[403.0]], [[404.0], [405.0]]]), [StructValue(Name(str='s0', ty=None), [[[406.0], [407.0]], [[408.0]], [[409.0]], [[410.0], [411.0]], [[412.0]], [[413.0], [414.0]]])]]), StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[415.0], [416.0]], [[417.0]], [[418.0]], [[419.0], [420.0]], [[421.0]], [[422.0], [423.0]]]), [StructValue(Name(str='s0', ty=None), [[[424.0], [425.0]], [[426.0]], [[427.0]], [[428.0], [429.0]], [[430.0]], [[431.0], [432.0]]])]])], StructValue(Name(str='s0', ty=None), [[[433.0], [434.0]], [[435.0]], [[436.0]], [[437.0], [438.0]], [[439.0]], [[440.0], [441.0]]])])])]], StructValue(Name(str='s4', ty=None), [[[StructValue(Name(str='s2', ty=None), [[StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[442.0], [443.0]], [[444.0]], [[445.0]], [[446.0], [447.0]], [[448.0]], [[449.0], [450.0]]]), [StructValue(Name(str='s0', ty=None), [[[451.0], [452.0]], [[453.0]], [[454.0]], [[455.0], [456.0]], [[457.0]], [[458.0], [459.0]]])]]), StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[460.0], [461.0]], [[462.0]], [[463.0]], [[464.0], [465.0]], [[466.0]], [[467.0], [468.0]]]), [StructValue(Name(str='s0', ty=None), [[[469.0], [470.0]], [[471.0]], [[472.0]], [[473.0], [474.0]], [[475.0]], [[476.0], [477.0]]])]]), StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[478.0], [479.0]], [[480.0]], [[481.0]], [[482.0], [483.0]], [[484.0]], [[485.0], [486.0]]]), [StructValue(Name(str='s0', ty=None), [[[487.0], [488.0]], [[489.0]], [[490.0]], [[491.0], [492.0]], [[493.0]], [[494.0], [495.0]]])]])], StructValue(Name(str='s0', ty=None), [[[496.0], [497.0]], [[498.0]], [[499.0]], [[500.0], [501.0]], [[502.0]], [[503.0], [504.0]]])])], [StructValue(Name(str='s2', ty=None), [[StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[505.0], [506.0]], [[507.0]], [[508.0]], [[509.0], [510.0]], [[511.0]], [[512.0], [513.0]]]), [StructValue(Name(str='s0', ty=None), [[[514.0], [515.0]], [[516.0]], [[517.0]], [[518.0], [519.0]], [[520.0]], [[521.0], [522.0]]])]]), StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[523.0], [524.0]], [[525.0]], [[526.0]], [[527.0], [528.0]], [[529.0]], [[530.0], [531.0]]]), [StructValue(Name(str='s0', ty=None), [[[532.0], [533.0]], [[534.0]], [[535.0]], [[536.0], [537.0]], [[538.0]], [[539.0], [540.0]]])]]), StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[541.0], [542.0]], [[543.0]], [[544.0]], [[545.0], [546.0]], [[547.0]], [[548.0], [549.0]]]), [StructValue(Name(str='s0', ty=None), [[[550.0], [551.0]], [[552.0]], [[553.0]], [[554.0], [555.0]], [[556.0]], [[557.0], [558.0]]])]])], StructValue(Name(str='s0', ty=None), [[[559.0], [560.0]], [[561.0]], [[562.0]], [[563.0], [564.0]], [[565.0]], [[566.0], [567.0]]])])]], StructValue(Name(str='s2', ty=None), [[StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[568.0], [569.0]], [[570.0]], [[571.0]], [[572.0], [573.0]], [[574.0]], [[575.0], [576.0]]]), [StructValue(Name(str='s0', ty=None), [[[577.0], [578.0]], [[579.0]], [[580.0]], [[581.0], [582.0]], [[583.0]], [[584.0], [585.0]]])]]), StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[586.0], [587.0]], [[588.0]], [[589.0]], [[590.0], [591.0]], [[592.0]], [[593.0], [594.0]]]), [StructValue(Name(str='s0', ty=None), [[[595.0], [596.0]], [[597.0]], [[598.0]], [[599.0], [600.0]], [[601.0]], [[602.0], [603.0]]])]]), StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[604.0], [605.0]], [[606.0]], [[607.0]], [[608.0], [609.0]], [[610.0]], [[611.0], [612.0]]]), [StructValue(Name(str='s0', ty=None), [[[613.0], [614.0]], [[615.0]], [[616.0]], [[617.0], [618.0]], [[619.0]], [[620.0], [621.0]]])]])], StructValue(Name(str='s0', ty=None), [[[622.0], [623.0]], [[624.0]], [[625.0]], [[626.0], [627.0]], [[628.0]], [[629.0], [630.0]]])])]), [StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[631.0], [632.0]], [[633.0]], [[634.0]], [[635.0], [636.0]], [[637.0]], [[638.0], [639.0]]]), [StructValue(Name(str='s0', ty=None), [[[640.0], [641.0]], [[642.0]], [[643.0]], [[644.0], [645.0]], [[646.0]], [[647.0], [648.0]]])]]), StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[649.0], [650.0]], [[651.0]], [[652.0]], [[653.0], [654.0]], [[655.0]], [[656.0], [657.0]]]), [StructValue(Name(str='s0', ty=None), [[[658.0], [659.0]], [[660.0]], [[661.0]], [[662.0], [663.0]], [[664.0]], [[665.0], [666.0]]])]]), StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[667.0], [668.0]], [[669.0]], [[670.0]], [[671.0], [672.0]], [[673.0]], [[674.0], [675.0]]]), [StructValue(Name(str='s0', ty=None), [[[676.0], [677.0]], [[678.0]], [[679.0]], [[680.0], [681.0]], [[682.0]], [[683.0], [684.0]]])]])], [StructValue(Name(str='s4', ty=None), [[[StructValue(Name(str='s2', ty=None), [[StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[685.0], [686.0]], [[687.0]], [[688.0]], [[689.0], [690.0]], [[691.0]], [[692.0], [693.0]]]), [StructValue(Name(str='s0', ty=None), [[[694.0], [695.0]], [[696.0]], [[697.0]], [[698.0], [699.0]], [[700.0]], [[701.0], [702.0]]])]]), StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[703.0], [704.0]], [[705.0]], [[706.0]], [[707.0], [708.0]], [[709.0]], [[710.0], [711.0]]]), [StructValue(Name(str='s0', ty=None), [[[712.0], [713.0]], [[714.0]], [[715.0]], [[716.0], [717.0]], [[718.0]], [[719.0], [720.0]]])]]), StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[721.0], [722.0]], [[723.0]], [[724.0]], [[725.0], [726.0]], [[727.0]], [[728.0], [729.0]]]), [StructValue(Name(str='s0', ty=None), [[[730.0], [731.0]], [[732.0]], [[733.0]], [[734.0], [735.0]], [[736.0]], [[737.0], [738.0]]])]])], StructValue(Name(str='s0', ty=None), [[[739.0], [740.0]], [[741.0]], [[742.0]], [[743.0], [744.0]], [[745.0]], [[746.0], [747.0]]])])], [StructValue(Name(str='s2', ty=None), [[StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[748.0], [749.0]], [[750.0]], [[751.0]], [[752.0], [753.0]], [[754.0]], [[755.0], [756.0]]]), [StructValue(Name(str='s0', ty=None), [[[757.0], [758.0]], [[759.0]], [[760.0]], [[761.0], [762.0]], [[763.0]], [[764.0], [765.0]]])]]), StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[766.0], [767.0]], [[768.0]], [[769.0]], [[770.0], [771.0]], [[772.0]], [[773.0], [774.0]]]), [StructValue(Name(str='s0', ty=None), [[[775.0], [776.0]], [[777.0]], [[778.0]], [[779.0], [780.0]], [[781.0]], [[782.0], [783.0]]])]]), StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[784.0], [785.0]], [[786.0]], [[787.0]], [[788.0], [789.0]], [[790.0]], [[791.0], [792.0]]]), [StructValue(Name(str='s0', ty=None), [[[793.0], [794.0]], [[795.0]], [[796.0]], [[797.0], [798.0]], [[799.0]], [[800.0], [801.0]]])]])], StructValue(Name(str='s0', ty=None), [[[802.0], [803.0]], [[804.0]], [[805.0]], [[806.0], [807.0]], [[808.0]], [[809.0], [810.0]]])])]], StructValue(Name(str='s2', ty=None), [[StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[811.0], [812.0]], [[813.0]], [[814.0]], [[815.0], [816.0]], [[817.0]], [[818.0], [819.0]]]), [StructValue(Name(str='s0', ty=None), [[[820.0], [821.0]], [[822.0]], [[823.0]], [[824.0], [825.0]], [[826.0]], [[827.0], [828.0]]])]]), StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[829.0], [830.0]], [[831.0]], [[832.0]], [[833.0], [834.0]], [[835.0]], [[836.0], [837.0]]]), [StructValue(Name(str='s0', ty=None), [[[838.0], [839.0]], [[840.0]], [[841.0]], [[842.0], [843.0]], [[844.0]], [[845.0], [846.0]]])]]), StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[847.0], [848.0]], [[849.0]], [[850.0]], [[851.0], [852.0]], [[853.0]], [[854.0], [855.0]]]), [StructValue(Name(str='s0', ty=None), [[[856.0], [857.0]], [[858.0]], [[859.0]], [[860.0], [861.0]], [[862.0]], [[863.0], [864.0]]])]])], StructValue(Name(str='s0', ty=None), [[[865.0], [866.0]], [[867.0]], [[868.0]], [[869.0], [870.0]], [[871.0]], [[872.0], [873.0]]])])])]])
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}