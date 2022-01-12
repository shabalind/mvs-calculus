import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Double,
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  case class s2 (
    p0: s1,
    p1: Vector[s1],
    p2: s1,
    p3: s0
  )
  case class s6 (
    p0: s1,
    p1: Vector[s2]
  )
  case class s9 (
    p0: Vector[s6],
    p1: s6
  )
  case class s10 (
    p0: Vector[Vector[s9]],
    p1: Vector[s1]
  )
  case class s11 (
    p0: Vector[s6],
    p1: Vector[Vector[s2]]
  )
  @noinline
  def f0(v0: s11, v1: Vector[s10], v2: Double): Double = {
    val v5: s10 = v1(0)
    var v8: s10 = v5
    val v18: Vector[s1] = v8.p1
    val v15: s10 = v1(2)
    val v14: s1 = v18(0)
    var v22: Vector[s1] = v18
    val v20: Vector[s0] = v14.p0
    val v37: s1 = s1(v20, v20)
    var v61: s10 = v15
    val v50: Vector[s0] = v37.p0
    val v48: s0 = v50(0)
    v61 = v61.copy(p1 = v18)
    val v103: Vector[Vector[Double]] = v48.p1
    v8 = v8.copy(p1 = v22)
    v8 = v61
    val v168: Vector[Double] = v103(0)
    val v99: Double = v168(0)
    v99
  }
  def benchmark(): Unit = {
    val v0: s11 = s11(Vector(s6(s1(Vector(s0(0.0, Vector(Vector(1.0), Vector(2.0)))), Vector(s0(3.0, Vector(Vector(4.0), Vector(5.0))))), Vector(s2(s1(Vector(s0(6.0, Vector(Vector(7.0), Vector(8.0)))), Vector(s0(9.0, Vector(Vector(10.0), Vector(11.0))))), Vector(s1(Vector(s0(12.0, Vector(Vector(13.0), Vector(14.0)))), Vector(s0(15.0, Vector(Vector(16.0), Vector(17.0)))))), s1(Vector(s0(18.0, Vector(Vector(19.0), Vector(20.0)))), Vector(s0(21.0, Vector(Vector(22.0), Vector(23.0))))), s0(24.0, Vector(Vector(25.0), Vector(26.0)))), s2(s1(Vector(s0(27.0, Vector(Vector(28.0), Vector(29.0)))), Vector(s0(30.0, Vector(Vector(31.0), Vector(32.0))))), Vector(s1(Vector(s0(33.0, Vector(Vector(34.0), Vector(35.0)))), Vector(s0(36.0, Vector(Vector(37.0), Vector(38.0)))))), s1(Vector(s0(39.0, Vector(Vector(40.0), Vector(41.0)))), Vector(s0(42.0, Vector(Vector(43.0), Vector(44.0))))), s0(45.0, Vector(Vector(46.0), Vector(47.0)))), s2(s1(Vector(s0(48.0, Vector(Vector(49.0), Vector(50.0)))), Vector(s0(51.0, Vector(Vector(52.0), Vector(53.0))))), Vector(s1(Vector(s0(54.0, Vector(Vector(55.0), Vector(56.0)))), Vector(s0(57.0, Vector(Vector(58.0), Vector(59.0)))))), s1(Vector(s0(60.0, Vector(Vector(61.0), Vector(62.0)))), Vector(s0(63.0, Vector(Vector(64.0), Vector(65.0))))), s0(66.0, Vector(Vector(67.0), Vector(68.0))))))), Vector(Vector(s2(s1(Vector(s0(69.0, Vector(Vector(70.0), Vector(71.0)))), Vector(s0(72.0, Vector(Vector(73.0), Vector(74.0))))), Vector(s1(Vector(s0(75.0, Vector(Vector(76.0), Vector(77.0)))), Vector(s0(78.0, Vector(Vector(79.0), Vector(80.0)))))), s1(Vector(s0(81.0, Vector(Vector(82.0), Vector(83.0)))), Vector(s0(84.0, Vector(Vector(85.0), Vector(86.0))))), s0(87.0, Vector(Vector(88.0), Vector(89.0)))))))
    val v1: Vector[s10] = Vector(s10(Vector(Vector(s9(Vector(s6(s1(Vector(s0(90.0, Vector(Vector(91.0), Vector(92.0)))), Vector(s0(93.0, Vector(Vector(94.0), Vector(95.0))))), Vector(s2(s1(Vector(s0(96.0, Vector(Vector(97.0), Vector(98.0)))), Vector(s0(99.0, Vector(Vector(100.0), Vector(101.0))))), Vector(s1(Vector(s0(102.0, Vector(Vector(103.0), Vector(104.0)))), Vector(s0(105.0, Vector(Vector(106.0), Vector(107.0)))))), s1(Vector(s0(108.0, Vector(Vector(109.0), Vector(110.0)))), Vector(s0(111.0, Vector(Vector(112.0), Vector(113.0))))), s0(114.0, Vector(Vector(115.0), Vector(116.0)))), s2(s1(Vector(s0(117.0, Vector(Vector(118.0), Vector(119.0)))), Vector(s0(120.0, Vector(Vector(121.0), Vector(122.0))))), Vector(s1(Vector(s0(123.0, Vector(Vector(124.0), Vector(125.0)))), Vector(s0(126.0, Vector(Vector(127.0), Vector(128.0)))))), s1(Vector(s0(129.0, Vector(Vector(130.0), Vector(131.0)))), Vector(s0(132.0, Vector(Vector(133.0), Vector(134.0))))), s0(135.0, Vector(Vector(136.0), Vector(137.0)))), s2(s1(Vector(s0(138.0, Vector(Vector(139.0), Vector(140.0)))), Vector(s0(141.0, Vector(Vector(142.0), Vector(143.0))))), Vector(s1(Vector(s0(144.0, Vector(Vector(145.0), Vector(146.0)))), Vector(s0(147.0, Vector(Vector(148.0), Vector(149.0)))))), s1(Vector(s0(150.0, Vector(Vector(151.0), Vector(152.0)))), Vector(s0(153.0, Vector(Vector(154.0), Vector(155.0))))), s0(156.0, Vector(Vector(157.0), Vector(158.0)))))), s6(s1(Vector(s0(159.0, Vector(Vector(160.0), Vector(161.0)))), Vector(s0(162.0, Vector(Vector(163.0), Vector(164.0))))), Vector(s2(s1(Vector(s0(165.0, Vector(Vector(166.0), Vector(167.0)))), Vector(s0(168.0, Vector(Vector(169.0), Vector(170.0))))), Vector(s1(Vector(s0(171.0, Vector(Vector(172.0), Vector(173.0)))), Vector(s0(174.0, Vector(Vector(175.0), Vector(176.0)))))), s1(Vector(s0(177.0, Vector(Vector(178.0), Vector(179.0)))), Vector(s0(180.0, Vector(Vector(181.0), Vector(182.0))))), s0(183.0, Vector(Vector(184.0), Vector(185.0)))), s2(s1(Vector(s0(186.0, Vector(Vector(187.0), Vector(188.0)))), Vector(s0(189.0, Vector(Vector(190.0), Vector(191.0))))), Vector(s1(Vector(s0(192.0, Vector(Vector(193.0), Vector(194.0)))), Vector(s0(195.0, Vector(Vector(196.0), Vector(197.0)))))), s1(Vector(s0(198.0, Vector(Vector(199.0), Vector(200.0)))), Vector(s0(201.0, Vector(Vector(202.0), Vector(203.0))))), s0(204.0, Vector(Vector(205.0), Vector(206.0)))), s2(s1(Vector(s0(207.0, Vector(Vector(208.0), Vector(209.0)))), Vector(s0(210.0, Vector(Vector(211.0), Vector(212.0))))), Vector(s1(Vector(s0(213.0, Vector(Vector(214.0), Vector(215.0)))), Vector(s0(216.0, Vector(Vector(217.0), Vector(218.0)))))), s1(Vector(s0(219.0, Vector(Vector(220.0), Vector(221.0)))), Vector(s0(222.0, Vector(Vector(223.0), Vector(224.0))))), s0(225.0, Vector(Vector(226.0), Vector(227.0))))))), s6(s1(Vector(s0(228.0, Vector(Vector(229.0), Vector(230.0)))), Vector(s0(231.0, Vector(Vector(232.0), Vector(233.0))))), Vector(s2(s1(Vector(s0(234.0, Vector(Vector(235.0), Vector(236.0)))), Vector(s0(237.0, Vector(Vector(238.0), Vector(239.0))))), Vector(s1(Vector(s0(240.0, Vector(Vector(241.0), Vector(242.0)))), Vector(s0(243.0, Vector(Vector(244.0), Vector(245.0)))))), s1(Vector(s0(246.0, Vector(Vector(247.0), Vector(248.0)))), Vector(s0(249.0, Vector(Vector(250.0), Vector(251.0))))), s0(252.0, Vector(Vector(253.0), Vector(254.0)))), s2(s1(Vector(s0(255.0, Vector(Vector(256.0), Vector(257.0)))), Vector(s0(258.0, Vector(Vector(259.0), Vector(260.0))))), Vector(s1(Vector(s0(261.0, Vector(Vector(262.0), Vector(263.0)))), Vector(s0(264.0, Vector(Vector(265.0), Vector(266.0)))))), s1(Vector(s0(267.0, Vector(Vector(268.0), Vector(269.0)))), Vector(s0(270.0, Vector(Vector(271.0), Vector(272.0))))), s0(273.0, Vector(Vector(274.0), Vector(275.0)))), s2(s1(Vector(s0(276.0, Vector(Vector(277.0), Vector(278.0)))), Vector(s0(279.0, Vector(Vector(280.0), Vector(281.0))))), Vector(s1(Vector(s0(282.0, Vector(Vector(283.0), Vector(284.0)))), Vector(s0(285.0, Vector(Vector(286.0), Vector(287.0)))))), s1(Vector(s0(288.0, Vector(Vector(289.0), Vector(290.0)))), Vector(s0(291.0, Vector(Vector(292.0), Vector(293.0))))), s0(294.0, Vector(Vector(295.0), Vector(296.0)))))))), Vector(s9(Vector(s6(s1(Vector(s0(297.0, Vector(Vector(298.0), Vector(299.0)))), Vector(s0(300.0, Vector(Vector(301.0), Vector(302.0))))), Vector(s2(s1(Vector(s0(303.0, Vector(Vector(304.0), Vector(305.0)))), Vector(s0(306.0, Vector(Vector(307.0), Vector(308.0))))), Vector(s1(Vector(s0(309.0, Vector(Vector(310.0), Vector(311.0)))), Vector(s0(312.0, Vector(Vector(313.0), Vector(314.0)))))), s1(Vector(s0(315.0, Vector(Vector(316.0), Vector(317.0)))), Vector(s0(318.0, Vector(Vector(319.0), Vector(320.0))))), s0(321.0, Vector(Vector(322.0), Vector(323.0)))), s2(s1(Vector(s0(324.0, Vector(Vector(325.0), Vector(326.0)))), Vector(s0(327.0, Vector(Vector(328.0), Vector(329.0))))), Vector(s1(Vector(s0(330.0, Vector(Vector(331.0), Vector(332.0)))), Vector(s0(333.0, Vector(Vector(334.0), Vector(335.0)))))), s1(Vector(s0(336.0, Vector(Vector(337.0), Vector(338.0)))), Vector(s0(339.0, Vector(Vector(340.0), Vector(341.0))))), s0(342.0, Vector(Vector(343.0), Vector(344.0)))), s2(s1(Vector(s0(345.0, Vector(Vector(346.0), Vector(347.0)))), Vector(s0(348.0, Vector(Vector(349.0), Vector(350.0))))), Vector(s1(Vector(s0(351.0, Vector(Vector(352.0), Vector(353.0)))), Vector(s0(354.0, Vector(Vector(355.0), Vector(356.0)))))), s1(Vector(s0(357.0, Vector(Vector(358.0), Vector(359.0)))), Vector(s0(360.0, Vector(Vector(361.0), Vector(362.0))))), s0(363.0, Vector(Vector(364.0), Vector(365.0)))))), s6(s1(Vector(s0(366.0, Vector(Vector(367.0), Vector(368.0)))), Vector(s0(369.0, Vector(Vector(370.0), Vector(371.0))))), Vector(s2(s1(Vector(s0(372.0, Vector(Vector(373.0), Vector(374.0)))), Vector(s0(375.0, Vector(Vector(376.0), Vector(377.0))))), Vector(s1(Vector(s0(378.0, Vector(Vector(379.0), Vector(380.0)))), Vector(s0(381.0, Vector(Vector(382.0), Vector(383.0)))))), s1(Vector(s0(384.0, Vector(Vector(385.0), Vector(386.0)))), Vector(s0(387.0, Vector(Vector(388.0), Vector(389.0))))), s0(390.0, Vector(Vector(391.0), Vector(392.0)))), s2(s1(Vector(s0(393.0, Vector(Vector(394.0), Vector(395.0)))), Vector(s0(396.0, Vector(Vector(397.0), Vector(398.0))))), Vector(s1(Vector(s0(399.0, Vector(Vector(400.0), Vector(401.0)))), Vector(s0(402.0, Vector(Vector(403.0), Vector(404.0)))))), s1(Vector(s0(405.0, Vector(Vector(406.0), Vector(407.0)))), Vector(s0(408.0, Vector(Vector(409.0), Vector(410.0))))), s0(411.0, Vector(Vector(412.0), Vector(413.0)))), s2(s1(Vector(s0(414.0, Vector(Vector(415.0), Vector(416.0)))), Vector(s0(417.0, Vector(Vector(418.0), Vector(419.0))))), Vector(s1(Vector(s0(420.0, Vector(Vector(421.0), Vector(422.0)))), Vector(s0(423.0, Vector(Vector(424.0), Vector(425.0)))))), s1(Vector(s0(426.0, Vector(Vector(427.0), Vector(428.0)))), Vector(s0(429.0, Vector(Vector(430.0), Vector(431.0))))), s0(432.0, Vector(Vector(433.0), Vector(434.0))))))), s6(s1(Vector(s0(435.0, Vector(Vector(436.0), Vector(437.0)))), Vector(s0(438.0, Vector(Vector(439.0), Vector(440.0))))), Vector(s2(s1(Vector(s0(441.0, Vector(Vector(442.0), Vector(443.0)))), Vector(s0(444.0, Vector(Vector(445.0), Vector(446.0))))), Vector(s1(Vector(s0(447.0, Vector(Vector(448.0), Vector(449.0)))), Vector(s0(450.0, Vector(Vector(451.0), Vector(452.0)))))), s1(Vector(s0(453.0, Vector(Vector(454.0), Vector(455.0)))), Vector(s0(456.0, Vector(Vector(457.0), Vector(458.0))))), s0(459.0, Vector(Vector(460.0), Vector(461.0)))), s2(s1(Vector(s0(462.0, Vector(Vector(463.0), Vector(464.0)))), Vector(s0(465.0, Vector(Vector(466.0), Vector(467.0))))), Vector(s1(Vector(s0(468.0, Vector(Vector(469.0), Vector(470.0)))), Vector(s0(471.0, Vector(Vector(472.0), Vector(473.0)))))), s1(Vector(s0(474.0, Vector(Vector(475.0), Vector(476.0)))), Vector(s0(477.0, Vector(Vector(478.0), Vector(479.0))))), s0(480.0, Vector(Vector(481.0), Vector(482.0)))), s2(s1(Vector(s0(483.0, Vector(Vector(484.0), Vector(485.0)))), Vector(s0(486.0, Vector(Vector(487.0), Vector(488.0))))), Vector(s1(Vector(s0(489.0, Vector(Vector(490.0), Vector(491.0)))), Vector(s0(492.0, Vector(Vector(493.0), Vector(494.0)))))), s1(Vector(s0(495.0, Vector(Vector(496.0), Vector(497.0)))), Vector(s0(498.0, Vector(Vector(499.0), Vector(500.0))))), s0(501.0, Vector(Vector(502.0), Vector(503.0))))))))), Vector(s1(Vector(s0(504.0, Vector(Vector(505.0), Vector(506.0)))), Vector(s0(507.0, Vector(Vector(508.0), Vector(509.0))))))), s10(Vector(Vector(s9(Vector(s6(s1(Vector(s0(510.0, Vector(Vector(511.0), Vector(512.0)))), Vector(s0(513.0, Vector(Vector(514.0), Vector(515.0))))), Vector(s2(s1(Vector(s0(516.0, Vector(Vector(517.0), Vector(518.0)))), Vector(s0(519.0, Vector(Vector(520.0), Vector(521.0))))), Vector(s1(Vector(s0(522.0, Vector(Vector(523.0), Vector(524.0)))), Vector(s0(525.0, Vector(Vector(526.0), Vector(527.0)))))), s1(Vector(s0(528.0, Vector(Vector(529.0), Vector(530.0)))), Vector(s0(531.0, Vector(Vector(532.0), Vector(533.0))))), s0(534.0, Vector(Vector(535.0), Vector(536.0)))), s2(s1(Vector(s0(537.0, Vector(Vector(538.0), Vector(539.0)))), Vector(s0(540.0, Vector(Vector(541.0), Vector(542.0))))), Vector(s1(Vector(s0(543.0, Vector(Vector(544.0), Vector(545.0)))), Vector(s0(546.0, Vector(Vector(547.0), Vector(548.0)))))), s1(Vector(s0(549.0, Vector(Vector(550.0), Vector(551.0)))), Vector(s0(552.0, Vector(Vector(553.0), Vector(554.0))))), s0(555.0, Vector(Vector(556.0), Vector(557.0)))), s2(s1(Vector(s0(558.0, Vector(Vector(559.0), Vector(560.0)))), Vector(s0(561.0, Vector(Vector(562.0), Vector(563.0))))), Vector(s1(Vector(s0(564.0, Vector(Vector(565.0), Vector(566.0)))), Vector(s0(567.0, Vector(Vector(568.0), Vector(569.0)))))), s1(Vector(s0(570.0, Vector(Vector(571.0), Vector(572.0)))), Vector(s0(573.0, Vector(Vector(574.0), Vector(575.0))))), s0(576.0, Vector(Vector(577.0), Vector(578.0)))))), s6(s1(Vector(s0(579.0, Vector(Vector(580.0), Vector(581.0)))), Vector(s0(582.0, Vector(Vector(583.0), Vector(584.0))))), Vector(s2(s1(Vector(s0(585.0, Vector(Vector(586.0), Vector(587.0)))), Vector(s0(588.0, Vector(Vector(589.0), Vector(590.0))))), Vector(s1(Vector(s0(591.0, Vector(Vector(592.0), Vector(593.0)))), Vector(s0(594.0, Vector(Vector(595.0), Vector(596.0)))))), s1(Vector(s0(597.0, Vector(Vector(598.0), Vector(599.0)))), Vector(s0(600.0, Vector(Vector(601.0), Vector(602.0))))), s0(603.0, Vector(Vector(604.0), Vector(605.0)))), s2(s1(Vector(s0(606.0, Vector(Vector(607.0), Vector(608.0)))), Vector(s0(609.0, Vector(Vector(610.0), Vector(611.0))))), Vector(s1(Vector(s0(612.0, Vector(Vector(613.0), Vector(614.0)))), Vector(s0(615.0, Vector(Vector(616.0), Vector(617.0)))))), s1(Vector(s0(618.0, Vector(Vector(619.0), Vector(620.0)))), Vector(s0(621.0, Vector(Vector(622.0), Vector(623.0))))), s0(624.0, Vector(Vector(625.0), Vector(626.0)))), s2(s1(Vector(s0(627.0, Vector(Vector(628.0), Vector(629.0)))), Vector(s0(630.0, Vector(Vector(631.0), Vector(632.0))))), Vector(s1(Vector(s0(633.0, Vector(Vector(634.0), Vector(635.0)))), Vector(s0(636.0, Vector(Vector(637.0), Vector(638.0)))))), s1(Vector(s0(639.0, Vector(Vector(640.0), Vector(641.0)))), Vector(s0(642.0, Vector(Vector(643.0), Vector(644.0))))), s0(645.0, Vector(Vector(646.0), Vector(647.0))))))), s6(s1(Vector(s0(648.0, Vector(Vector(649.0), Vector(650.0)))), Vector(s0(651.0, Vector(Vector(652.0), Vector(653.0))))), Vector(s2(s1(Vector(s0(654.0, Vector(Vector(655.0), Vector(656.0)))), Vector(s0(657.0, Vector(Vector(658.0), Vector(659.0))))), Vector(s1(Vector(s0(660.0, Vector(Vector(661.0), Vector(662.0)))), Vector(s0(663.0, Vector(Vector(664.0), Vector(665.0)))))), s1(Vector(s0(666.0, Vector(Vector(667.0), Vector(668.0)))), Vector(s0(669.0, Vector(Vector(670.0), Vector(671.0))))), s0(672.0, Vector(Vector(673.0), Vector(674.0)))), s2(s1(Vector(s0(675.0, Vector(Vector(676.0), Vector(677.0)))), Vector(s0(678.0, Vector(Vector(679.0), Vector(680.0))))), Vector(s1(Vector(s0(681.0, Vector(Vector(682.0), Vector(683.0)))), Vector(s0(684.0, Vector(Vector(685.0), Vector(686.0)))))), s1(Vector(s0(687.0, Vector(Vector(688.0), Vector(689.0)))), Vector(s0(690.0, Vector(Vector(691.0), Vector(692.0))))), s0(693.0, Vector(Vector(694.0), Vector(695.0)))), s2(s1(Vector(s0(696.0, Vector(Vector(697.0), Vector(698.0)))), Vector(s0(699.0, Vector(Vector(700.0), Vector(701.0))))), Vector(s1(Vector(s0(702.0, Vector(Vector(703.0), Vector(704.0)))), Vector(s0(705.0, Vector(Vector(706.0), Vector(707.0)))))), s1(Vector(s0(708.0, Vector(Vector(709.0), Vector(710.0)))), Vector(s0(711.0, Vector(Vector(712.0), Vector(713.0))))), s0(714.0, Vector(Vector(715.0), Vector(716.0)))))))), Vector(s9(Vector(s6(s1(Vector(s0(717.0, Vector(Vector(718.0), Vector(719.0)))), Vector(s0(720.0, Vector(Vector(721.0), Vector(722.0))))), Vector(s2(s1(Vector(s0(723.0, Vector(Vector(724.0), Vector(725.0)))), Vector(s0(726.0, Vector(Vector(727.0), Vector(728.0))))), Vector(s1(Vector(s0(729.0, Vector(Vector(730.0), Vector(731.0)))), Vector(s0(732.0, Vector(Vector(733.0), Vector(734.0)))))), s1(Vector(s0(735.0, Vector(Vector(736.0), Vector(737.0)))), Vector(s0(738.0, Vector(Vector(739.0), Vector(740.0))))), s0(741.0, Vector(Vector(742.0), Vector(743.0)))), s2(s1(Vector(s0(744.0, Vector(Vector(745.0), Vector(746.0)))), Vector(s0(747.0, Vector(Vector(748.0), Vector(749.0))))), Vector(s1(Vector(s0(750.0, Vector(Vector(751.0), Vector(752.0)))), Vector(s0(753.0, Vector(Vector(754.0), Vector(755.0)))))), s1(Vector(s0(756.0, Vector(Vector(757.0), Vector(758.0)))), Vector(s0(759.0, Vector(Vector(760.0), Vector(761.0))))), s0(762.0, Vector(Vector(763.0), Vector(764.0)))), s2(s1(Vector(s0(765.0, Vector(Vector(766.0), Vector(767.0)))), Vector(s0(768.0, Vector(Vector(769.0), Vector(770.0))))), Vector(s1(Vector(s0(771.0, Vector(Vector(772.0), Vector(773.0)))), Vector(s0(774.0, Vector(Vector(775.0), Vector(776.0)))))), s1(Vector(s0(777.0, Vector(Vector(778.0), Vector(779.0)))), Vector(s0(780.0, Vector(Vector(781.0), Vector(782.0))))), s0(783.0, Vector(Vector(784.0), Vector(785.0)))))), s6(s1(Vector(s0(786.0, Vector(Vector(787.0), Vector(788.0)))), Vector(s0(789.0, Vector(Vector(790.0), Vector(791.0))))), Vector(s2(s1(Vector(s0(792.0, Vector(Vector(793.0), Vector(794.0)))), Vector(s0(795.0, Vector(Vector(796.0), Vector(797.0))))), Vector(s1(Vector(s0(798.0, Vector(Vector(799.0), Vector(800.0)))), Vector(s0(801.0, Vector(Vector(802.0), Vector(803.0)))))), s1(Vector(s0(804.0, Vector(Vector(805.0), Vector(806.0)))), Vector(s0(807.0, Vector(Vector(808.0), Vector(809.0))))), s0(810.0, Vector(Vector(811.0), Vector(812.0)))), s2(s1(Vector(s0(813.0, Vector(Vector(814.0), Vector(815.0)))), Vector(s0(816.0, Vector(Vector(817.0), Vector(818.0))))), Vector(s1(Vector(s0(819.0, Vector(Vector(820.0), Vector(821.0)))), Vector(s0(822.0, Vector(Vector(823.0), Vector(824.0)))))), s1(Vector(s0(825.0, Vector(Vector(826.0), Vector(827.0)))), Vector(s0(828.0, Vector(Vector(829.0), Vector(830.0))))), s0(831.0, Vector(Vector(832.0), Vector(833.0)))), s2(s1(Vector(s0(834.0, Vector(Vector(835.0), Vector(836.0)))), Vector(s0(837.0, Vector(Vector(838.0), Vector(839.0))))), Vector(s1(Vector(s0(840.0, Vector(Vector(841.0), Vector(842.0)))), Vector(s0(843.0, Vector(Vector(844.0), Vector(845.0)))))), s1(Vector(s0(846.0, Vector(Vector(847.0), Vector(848.0)))), Vector(s0(849.0, Vector(Vector(850.0), Vector(851.0))))), s0(852.0, Vector(Vector(853.0), Vector(854.0))))))), s6(s1(Vector(s0(855.0, Vector(Vector(856.0), Vector(857.0)))), Vector(s0(858.0, Vector(Vector(859.0), Vector(860.0))))), Vector(s2(s1(Vector(s0(861.0, Vector(Vector(862.0), Vector(863.0)))), Vector(s0(864.0, Vector(Vector(865.0), Vector(866.0))))), Vector(s1(Vector(s0(867.0, Vector(Vector(868.0), Vector(869.0)))), Vector(s0(870.0, Vector(Vector(871.0), Vector(872.0)))))), s1(Vector(s0(873.0, Vector(Vector(874.0), Vector(875.0)))), Vector(s0(876.0, Vector(Vector(877.0), Vector(878.0))))), s0(879.0, Vector(Vector(880.0), Vector(881.0)))), s2(s1(Vector(s0(882.0, Vector(Vector(883.0), Vector(884.0)))), Vector(s0(885.0, Vector(Vector(886.0), Vector(887.0))))), Vector(s1(Vector(s0(888.0, Vector(Vector(889.0), Vector(890.0)))), Vector(s0(891.0, Vector(Vector(892.0), Vector(893.0)))))), s1(Vector(s0(894.0, Vector(Vector(895.0), Vector(896.0)))), Vector(s0(897.0, Vector(Vector(898.0), Vector(899.0))))), s0(900.0, Vector(Vector(901.0), Vector(902.0)))), s2(s1(Vector(s0(903.0, Vector(Vector(904.0), Vector(905.0)))), Vector(s0(906.0, Vector(Vector(907.0), Vector(908.0))))), Vector(s1(Vector(s0(909.0, Vector(Vector(910.0), Vector(911.0)))), Vector(s0(912.0, Vector(Vector(913.0), Vector(914.0)))))), s1(Vector(s0(915.0, Vector(Vector(916.0), Vector(917.0)))), Vector(s0(918.0, Vector(Vector(919.0), Vector(920.0))))), s0(921.0, Vector(Vector(922.0), Vector(923.0))))))))), Vector(s1(Vector(s0(924.0, Vector(Vector(925.0), Vector(926.0)))), Vector(s0(927.0, Vector(Vector(928.0), Vector(929.0))))))), s10(Vector(Vector(s9(Vector(s6(s1(Vector(s0(930.0, Vector(Vector(931.0), Vector(932.0)))), Vector(s0(933.0, Vector(Vector(934.0), Vector(935.0))))), Vector(s2(s1(Vector(s0(936.0, Vector(Vector(937.0), Vector(938.0)))), Vector(s0(939.0, Vector(Vector(940.0), Vector(941.0))))), Vector(s1(Vector(s0(942.0, Vector(Vector(943.0), Vector(944.0)))), Vector(s0(945.0, Vector(Vector(946.0), Vector(947.0)))))), s1(Vector(s0(948.0, Vector(Vector(949.0), Vector(950.0)))), Vector(s0(951.0, Vector(Vector(952.0), Vector(953.0))))), s0(954.0, Vector(Vector(955.0), Vector(956.0)))), s2(s1(Vector(s0(957.0, Vector(Vector(958.0), Vector(959.0)))), Vector(s0(960.0, Vector(Vector(961.0), Vector(962.0))))), Vector(s1(Vector(s0(963.0, Vector(Vector(964.0), Vector(965.0)))), Vector(s0(966.0, Vector(Vector(967.0), Vector(968.0)))))), s1(Vector(s0(969.0, Vector(Vector(970.0), Vector(971.0)))), Vector(s0(972.0, Vector(Vector(973.0), Vector(974.0))))), s0(975.0, Vector(Vector(976.0), Vector(977.0)))), s2(s1(Vector(s0(978.0, Vector(Vector(979.0), Vector(980.0)))), Vector(s0(981.0, Vector(Vector(982.0), Vector(983.0))))), Vector(s1(Vector(s0(984.0, Vector(Vector(985.0), Vector(986.0)))), Vector(s0(987.0, Vector(Vector(988.0), Vector(989.0)))))), s1(Vector(s0(990.0, Vector(Vector(991.0), Vector(992.0)))), Vector(s0(993.0, Vector(Vector(994.0), Vector(995.0))))), s0(996.0, Vector(Vector(997.0), Vector(998.0)))))), s6(s1(Vector(s0(999.0, Vector(Vector(1000.0), Vector(1001.0)))), Vector(s0(1002.0, Vector(Vector(1003.0), Vector(1004.0))))), Vector(s2(s1(Vector(s0(1005.0, Vector(Vector(1006.0), Vector(1007.0)))), Vector(s0(1008.0, Vector(Vector(1009.0), Vector(1010.0))))), Vector(s1(Vector(s0(1011.0, Vector(Vector(1012.0), Vector(1013.0)))), Vector(s0(1014.0, Vector(Vector(1015.0), Vector(1016.0)))))), s1(Vector(s0(1017.0, Vector(Vector(1018.0), Vector(1019.0)))), Vector(s0(1020.0, Vector(Vector(1021.0), Vector(1022.0))))), s0(1023.0, Vector(Vector(1024.0), Vector(1025.0)))), s2(s1(Vector(s0(1026.0, Vector(Vector(1027.0), Vector(1028.0)))), Vector(s0(1029.0, Vector(Vector(1030.0), Vector(1031.0))))), Vector(s1(Vector(s0(1032.0, Vector(Vector(1033.0), Vector(1034.0)))), Vector(s0(1035.0, Vector(Vector(1036.0), Vector(1037.0)))))), s1(Vector(s0(1038.0, Vector(Vector(1039.0), Vector(1040.0)))), Vector(s0(1041.0, Vector(Vector(1042.0), Vector(1043.0))))), s0(1044.0, Vector(Vector(1045.0), Vector(1046.0)))), s2(s1(Vector(s0(1047.0, Vector(Vector(1048.0), Vector(1049.0)))), Vector(s0(1050.0, Vector(Vector(1051.0), Vector(1052.0))))), Vector(s1(Vector(s0(1053.0, Vector(Vector(1054.0), Vector(1055.0)))), Vector(s0(1056.0, Vector(Vector(1057.0), Vector(1058.0)))))), s1(Vector(s0(1059.0, Vector(Vector(1060.0), Vector(1061.0)))), Vector(s0(1062.0, Vector(Vector(1063.0), Vector(1064.0))))), s0(1065.0, Vector(Vector(1066.0), Vector(1067.0))))))), s6(s1(Vector(s0(1068.0, Vector(Vector(1069.0), Vector(1070.0)))), Vector(s0(1071.0, Vector(Vector(1072.0), Vector(1073.0))))), Vector(s2(s1(Vector(s0(1074.0, Vector(Vector(1075.0), Vector(1076.0)))), Vector(s0(1077.0, Vector(Vector(1078.0), Vector(1079.0))))), Vector(s1(Vector(s0(1080.0, Vector(Vector(1081.0), Vector(1082.0)))), Vector(s0(1083.0, Vector(Vector(1084.0), Vector(1085.0)))))), s1(Vector(s0(1086.0, Vector(Vector(1087.0), Vector(1088.0)))), Vector(s0(1089.0, Vector(Vector(1090.0), Vector(1091.0))))), s0(1092.0, Vector(Vector(1093.0), Vector(1094.0)))), s2(s1(Vector(s0(1095.0, Vector(Vector(1096.0), Vector(1097.0)))), Vector(s0(1098.0, Vector(Vector(1099.0), Vector(1100.0))))), Vector(s1(Vector(s0(1101.0, Vector(Vector(1102.0), Vector(1103.0)))), Vector(s0(1104.0, Vector(Vector(1105.0), Vector(1106.0)))))), s1(Vector(s0(1107.0, Vector(Vector(1108.0), Vector(1109.0)))), Vector(s0(1110.0, Vector(Vector(1111.0), Vector(1112.0))))), s0(1113.0, Vector(Vector(1114.0), Vector(1115.0)))), s2(s1(Vector(s0(1116.0, Vector(Vector(1117.0), Vector(1118.0)))), Vector(s0(1119.0, Vector(Vector(1120.0), Vector(1121.0))))), Vector(s1(Vector(s0(1122.0, Vector(Vector(1123.0), Vector(1124.0)))), Vector(s0(1125.0, Vector(Vector(1126.0), Vector(1127.0)))))), s1(Vector(s0(1128.0, Vector(Vector(1129.0), Vector(1130.0)))), Vector(s0(1131.0, Vector(Vector(1132.0), Vector(1133.0))))), s0(1134.0, Vector(Vector(1135.0), Vector(1136.0)))))))), Vector(s9(Vector(s6(s1(Vector(s0(1137.0, Vector(Vector(1138.0), Vector(1139.0)))), Vector(s0(1140.0, Vector(Vector(1141.0), Vector(1142.0))))), Vector(s2(s1(Vector(s0(1143.0, Vector(Vector(1144.0), Vector(1145.0)))), Vector(s0(1146.0, Vector(Vector(1147.0), Vector(1148.0))))), Vector(s1(Vector(s0(1149.0, Vector(Vector(1150.0), Vector(1151.0)))), Vector(s0(1152.0, Vector(Vector(1153.0), Vector(1154.0)))))), s1(Vector(s0(1155.0, Vector(Vector(1156.0), Vector(1157.0)))), Vector(s0(1158.0, Vector(Vector(1159.0), Vector(1160.0))))), s0(1161.0, Vector(Vector(1162.0), Vector(1163.0)))), s2(s1(Vector(s0(1164.0, Vector(Vector(1165.0), Vector(1166.0)))), Vector(s0(1167.0, Vector(Vector(1168.0), Vector(1169.0))))), Vector(s1(Vector(s0(1170.0, Vector(Vector(1171.0), Vector(1172.0)))), Vector(s0(1173.0, Vector(Vector(1174.0), Vector(1175.0)))))), s1(Vector(s0(1176.0, Vector(Vector(1177.0), Vector(1178.0)))), Vector(s0(1179.0, Vector(Vector(1180.0), Vector(1181.0))))), s0(1182.0, Vector(Vector(1183.0), Vector(1184.0)))), s2(s1(Vector(s0(1185.0, Vector(Vector(1186.0), Vector(1187.0)))), Vector(s0(1188.0, Vector(Vector(1189.0), Vector(1190.0))))), Vector(s1(Vector(s0(1191.0, Vector(Vector(1192.0), Vector(1193.0)))), Vector(s0(1194.0, Vector(Vector(1195.0), Vector(1196.0)))))), s1(Vector(s0(1197.0, Vector(Vector(1198.0), Vector(1199.0)))), Vector(s0(1200.0, Vector(Vector(1201.0), Vector(1202.0))))), s0(1203.0, Vector(Vector(1204.0), Vector(1205.0)))))), s6(s1(Vector(s0(1206.0, Vector(Vector(1207.0), Vector(1208.0)))), Vector(s0(1209.0, Vector(Vector(1210.0), Vector(1211.0))))), Vector(s2(s1(Vector(s0(1212.0, Vector(Vector(1213.0), Vector(1214.0)))), Vector(s0(1215.0, Vector(Vector(1216.0), Vector(1217.0))))), Vector(s1(Vector(s0(1218.0, Vector(Vector(1219.0), Vector(1220.0)))), Vector(s0(1221.0, Vector(Vector(1222.0), Vector(1223.0)))))), s1(Vector(s0(1224.0, Vector(Vector(1225.0), Vector(1226.0)))), Vector(s0(1227.0, Vector(Vector(1228.0), Vector(1229.0))))), s0(1230.0, Vector(Vector(1231.0), Vector(1232.0)))), s2(s1(Vector(s0(1233.0, Vector(Vector(1234.0), Vector(1235.0)))), Vector(s0(1236.0, Vector(Vector(1237.0), Vector(1238.0))))), Vector(s1(Vector(s0(1239.0, Vector(Vector(1240.0), Vector(1241.0)))), Vector(s0(1242.0, Vector(Vector(1243.0), Vector(1244.0)))))), s1(Vector(s0(1245.0, Vector(Vector(1246.0), Vector(1247.0)))), Vector(s0(1248.0, Vector(Vector(1249.0), Vector(1250.0))))), s0(1251.0, Vector(Vector(1252.0), Vector(1253.0)))), s2(s1(Vector(s0(1254.0, Vector(Vector(1255.0), Vector(1256.0)))), Vector(s0(1257.0, Vector(Vector(1258.0), Vector(1259.0))))), Vector(s1(Vector(s0(1260.0, Vector(Vector(1261.0), Vector(1262.0)))), Vector(s0(1263.0, Vector(Vector(1264.0), Vector(1265.0)))))), s1(Vector(s0(1266.0, Vector(Vector(1267.0), Vector(1268.0)))), Vector(s0(1269.0, Vector(Vector(1270.0), Vector(1271.0))))), s0(1272.0, Vector(Vector(1273.0), Vector(1274.0))))))), s6(s1(Vector(s0(1275.0, Vector(Vector(1276.0), Vector(1277.0)))), Vector(s0(1278.0, Vector(Vector(1279.0), Vector(1280.0))))), Vector(s2(s1(Vector(s0(1281.0, Vector(Vector(1282.0), Vector(1283.0)))), Vector(s0(1284.0, Vector(Vector(1285.0), Vector(1286.0))))), Vector(s1(Vector(s0(1287.0, Vector(Vector(1288.0), Vector(1289.0)))), Vector(s0(1290.0, Vector(Vector(1291.0), Vector(1292.0)))))), s1(Vector(s0(1293.0, Vector(Vector(1294.0), Vector(1295.0)))), Vector(s0(1296.0, Vector(Vector(1297.0), Vector(1298.0))))), s0(1299.0, Vector(Vector(1300.0), Vector(1301.0)))), s2(s1(Vector(s0(1302.0, Vector(Vector(1303.0), Vector(1304.0)))), Vector(s0(1305.0, Vector(Vector(1306.0), Vector(1307.0))))), Vector(s1(Vector(s0(1308.0, Vector(Vector(1309.0), Vector(1310.0)))), Vector(s0(1311.0, Vector(Vector(1312.0), Vector(1313.0)))))), s1(Vector(s0(1314.0, Vector(Vector(1315.0), Vector(1316.0)))), Vector(s0(1317.0, Vector(Vector(1318.0), Vector(1319.0))))), s0(1320.0, Vector(Vector(1321.0), Vector(1322.0)))), s2(s1(Vector(s0(1323.0, Vector(Vector(1324.0), Vector(1325.0)))), Vector(s0(1326.0, Vector(Vector(1327.0), Vector(1328.0))))), Vector(s1(Vector(s0(1329.0, Vector(Vector(1330.0), Vector(1331.0)))), Vector(s0(1332.0, Vector(Vector(1333.0), Vector(1334.0)))))), s1(Vector(s0(1335.0, Vector(Vector(1336.0), Vector(1337.0)))), Vector(s0(1338.0, Vector(Vector(1339.0), Vector(1340.0))))), s0(1341.0, Vector(Vector(1342.0), Vector(1343.0))))))))), Vector(s1(Vector(s0(1344.0, Vector(Vector(1345.0), Vector(1346.0)))), Vector(s0(1347.0, Vector(Vector(1348.0), Vector(1349.0))))))))
    val v2: Double = 1350.0
    val start = nanoTime()
    var result: Double = 1350.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}