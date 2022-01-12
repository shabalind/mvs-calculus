import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Double,
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]],
    p3: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  case class s2 (
    p0: s0,
    p1: s0
  )
  case class s3 (
    p0: s2,
    p1: Vector[Vector[s0]]
  )
  case class s4 (
    p0: Vector[s1],
    p1: s1
  )
  case class s5 (
    p0: s2,
    p1: s2
  )
  case class s6 (
    p0: Vector[s3],
    p1: s4,
    p2: Vector[s4],
    p3: Vector[s1],
    p4: Vector[Vector[s4]]
  )
  def f14(v0: Double): Double = {
    var v1: Double = v0
    val v6: Double = v1 - v1
    var v3: Double = v6
    var v2: Double = v0
    var v5: Double = v3
    var v4: Double = v2
    val v7: Vector[Double] = Vector(v5, v4, v2, v4, v2, v4)
    var v9: Vector[Double] = v7
    val v8: Double = v7(4)
    v9 = v9.updated(0, v2)
    var v11: Vector[Double] = v9
    var v13: Vector[Double] = v7
    var v18: Vector[Double] = v13
    val v12: Double = v13(1)
    var v22: Vector[Double] = v18
    var v19: Double = v6
    v11 = v11.updated(1, v2)
    v13 = v13.updated(0, v1)
    val v21: Double = v22(3)
    val v33: Double = v22(3)
    v13 = v13.updated(4, v1)
    v19 = v3
    val v29: Double = v7(3)
    var v50: Double = v33
    v22 = v22.updated(3, v29)
    v18 = v11
    var v72: Double = v19
    v18 = v18.updated(3, v8)
    v50 = v21
    v13 = v13.updated(1, v12)
    val v73: Vector[Double] = Vector(v8, v4)
    var v45: Double = v2
    v9 = v9.updated(0, v45)
    v1 = v19
    val v145: Double = v73(1)
    var v68: Double = v72
    v19 = v145
    v45 = v68
    v50
  }
  @noinline
  def f0(v0: Vector[s5], v1: s5, v2: s0, v3: s6, v4: Vector[s3], v5: s3, v6: Vector[Double], v7: Double): Double = {
    val v12: Double = v6(0)
    val v10: Double = f14(v12)
    v10
  }
  def benchmark(): Unit = {
    val v0: Vector[s5] = Vector(s5(s2(s0(0.0, Vector(Vector(1.0)), Vector(Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0))), s0(6.0, Vector(Vector(7.0)), Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))), s2(s0(12.0, Vector(Vector(13.0)), Vector(Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0))), s0(18.0, Vector(Vector(19.0)), Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))))))
    val v1: s5 = s5(s2(s0(24.0, Vector(Vector(25.0)), Vector(Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0))), s0(30.0, Vector(Vector(31.0)), Vector(Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0)))), s2(s0(36.0, Vector(Vector(37.0)), Vector(Vector(38.0)), Vector(Vector(39.0), Vector(40.0), Vector(41.0))), s0(42.0, Vector(Vector(43.0)), Vector(Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0)))))
    val v2: s0 = s0(48.0, Vector(Vector(49.0)), Vector(Vector(50.0)), Vector(Vector(51.0), Vector(52.0), Vector(53.0)))
    val v3: s6 = s6(Vector(s3(s2(s0(54.0, Vector(Vector(55.0)), Vector(Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0))), s0(60.0, Vector(Vector(61.0)), Vector(Vector(62.0)), Vector(Vector(63.0), Vector(64.0), Vector(65.0)))), Vector(Vector(s0(66.0, Vector(Vector(67.0)), Vector(Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0)))), Vector(s0(72.0, Vector(Vector(73.0)), Vector(Vector(74.0)), Vector(Vector(75.0), Vector(76.0), Vector(77.0))))))), s4(Vector(s1(Vector(s0(78.0, Vector(Vector(79.0)), Vector(Vector(80.0)), Vector(Vector(81.0), Vector(82.0), Vector(83.0)))), Vector(s0(84.0, Vector(Vector(85.0)), Vector(Vector(86.0)), Vector(Vector(87.0), Vector(88.0), Vector(89.0))), s0(90.0, Vector(Vector(91.0)), Vector(Vector(92.0)), Vector(Vector(93.0), Vector(94.0), Vector(95.0))), s0(96.0, Vector(Vector(97.0)), Vector(Vector(98.0)), Vector(Vector(99.0), Vector(100.0), Vector(101.0))))), s1(Vector(s0(102.0, Vector(Vector(103.0)), Vector(Vector(104.0)), Vector(Vector(105.0), Vector(106.0), Vector(107.0)))), Vector(s0(108.0, Vector(Vector(109.0)), Vector(Vector(110.0)), Vector(Vector(111.0), Vector(112.0), Vector(113.0))), s0(114.0, Vector(Vector(115.0)), Vector(Vector(116.0)), Vector(Vector(117.0), Vector(118.0), Vector(119.0))), s0(120.0, Vector(Vector(121.0)), Vector(Vector(122.0)), Vector(Vector(123.0), Vector(124.0), Vector(125.0))))), s1(Vector(s0(126.0, Vector(Vector(127.0)), Vector(Vector(128.0)), Vector(Vector(129.0), Vector(130.0), Vector(131.0)))), Vector(s0(132.0, Vector(Vector(133.0)), Vector(Vector(134.0)), Vector(Vector(135.0), Vector(136.0), Vector(137.0))), s0(138.0, Vector(Vector(139.0)), Vector(Vector(140.0)), Vector(Vector(141.0), Vector(142.0), Vector(143.0))), s0(144.0, Vector(Vector(145.0)), Vector(Vector(146.0)), Vector(Vector(147.0), Vector(148.0), Vector(149.0)))))), s1(Vector(s0(150.0, Vector(Vector(151.0)), Vector(Vector(152.0)), Vector(Vector(153.0), Vector(154.0), Vector(155.0)))), Vector(s0(156.0, Vector(Vector(157.0)), Vector(Vector(158.0)), Vector(Vector(159.0), Vector(160.0), Vector(161.0))), s0(162.0, Vector(Vector(163.0)), Vector(Vector(164.0)), Vector(Vector(165.0), Vector(166.0), Vector(167.0))), s0(168.0, Vector(Vector(169.0)), Vector(Vector(170.0)), Vector(Vector(171.0), Vector(172.0), Vector(173.0)))))), Vector(s4(Vector(s1(Vector(s0(174.0, Vector(Vector(175.0)), Vector(Vector(176.0)), Vector(Vector(177.0), Vector(178.0), Vector(179.0)))), Vector(s0(180.0, Vector(Vector(181.0)), Vector(Vector(182.0)), Vector(Vector(183.0), Vector(184.0), Vector(185.0))), s0(186.0, Vector(Vector(187.0)), Vector(Vector(188.0)), Vector(Vector(189.0), Vector(190.0), Vector(191.0))), s0(192.0, Vector(Vector(193.0)), Vector(Vector(194.0)), Vector(Vector(195.0), Vector(196.0), Vector(197.0))))), s1(Vector(s0(198.0, Vector(Vector(199.0)), Vector(Vector(200.0)), Vector(Vector(201.0), Vector(202.0), Vector(203.0)))), Vector(s0(204.0, Vector(Vector(205.0)), Vector(Vector(206.0)), Vector(Vector(207.0), Vector(208.0), Vector(209.0))), s0(210.0, Vector(Vector(211.0)), Vector(Vector(212.0)), Vector(Vector(213.0), Vector(214.0), Vector(215.0))), s0(216.0, Vector(Vector(217.0)), Vector(Vector(218.0)), Vector(Vector(219.0), Vector(220.0), Vector(221.0))))), s1(Vector(s0(222.0, Vector(Vector(223.0)), Vector(Vector(224.0)), Vector(Vector(225.0), Vector(226.0), Vector(227.0)))), Vector(s0(228.0, Vector(Vector(229.0)), Vector(Vector(230.0)), Vector(Vector(231.0), Vector(232.0), Vector(233.0))), s0(234.0, Vector(Vector(235.0)), Vector(Vector(236.0)), Vector(Vector(237.0), Vector(238.0), Vector(239.0))), s0(240.0, Vector(Vector(241.0)), Vector(Vector(242.0)), Vector(Vector(243.0), Vector(244.0), Vector(245.0)))))), s1(Vector(s0(246.0, Vector(Vector(247.0)), Vector(Vector(248.0)), Vector(Vector(249.0), Vector(250.0), Vector(251.0)))), Vector(s0(252.0, Vector(Vector(253.0)), Vector(Vector(254.0)), Vector(Vector(255.0), Vector(256.0), Vector(257.0))), s0(258.0, Vector(Vector(259.0)), Vector(Vector(260.0)), Vector(Vector(261.0), Vector(262.0), Vector(263.0))), s0(264.0, Vector(Vector(265.0)), Vector(Vector(266.0)), Vector(Vector(267.0), Vector(268.0), Vector(269.0)))))), s4(Vector(s1(Vector(s0(270.0, Vector(Vector(271.0)), Vector(Vector(272.0)), Vector(Vector(273.0), Vector(274.0), Vector(275.0)))), Vector(s0(276.0, Vector(Vector(277.0)), Vector(Vector(278.0)), Vector(Vector(279.0), Vector(280.0), Vector(281.0))), s0(282.0, Vector(Vector(283.0)), Vector(Vector(284.0)), Vector(Vector(285.0), Vector(286.0), Vector(287.0))), s0(288.0, Vector(Vector(289.0)), Vector(Vector(290.0)), Vector(Vector(291.0), Vector(292.0), Vector(293.0))))), s1(Vector(s0(294.0, Vector(Vector(295.0)), Vector(Vector(296.0)), Vector(Vector(297.0), Vector(298.0), Vector(299.0)))), Vector(s0(300.0, Vector(Vector(301.0)), Vector(Vector(302.0)), Vector(Vector(303.0), Vector(304.0), Vector(305.0))), s0(306.0, Vector(Vector(307.0)), Vector(Vector(308.0)), Vector(Vector(309.0), Vector(310.0), Vector(311.0))), s0(312.0, Vector(Vector(313.0)), Vector(Vector(314.0)), Vector(Vector(315.0), Vector(316.0), Vector(317.0))))), s1(Vector(s0(318.0, Vector(Vector(319.0)), Vector(Vector(320.0)), Vector(Vector(321.0), Vector(322.0), Vector(323.0)))), Vector(s0(324.0, Vector(Vector(325.0)), Vector(Vector(326.0)), Vector(Vector(327.0), Vector(328.0), Vector(329.0))), s0(330.0, Vector(Vector(331.0)), Vector(Vector(332.0)), Vector(Vector(333.0), Vector(334.0), Vector(335.0))), s0(336.0, Vector(Vector(337.0)), Vector(Vector(338.0)), Vector(Vector(339.0), Vector(340.0), Vector(341.0)))))), s1(Vector(s0(342.0, Vector(Vector(343.0)), Vector(Vector(344.0)), Vector(Vector(345.0), Vector(346.0), Vector(347.0)))), Vector(s0(348.0, Vector(Vector(349.0)), Vector(Vector(350.0)), Vector(Vector(351.0), Vector(352.0), Vector(353.0))), s0(354.0, Vector(Vector(355.0)), Vector(Vector(356.0)), Vector(Vector(357.0), Vector(358.0), Vector(359.0))), s0(360.0, Vector(Vector(361.0)), Vector(Vector(362.0)), Vector(Vector(363.0), Vector(364.0), Vector(365.0)))))), s4(Vector(s1(Vector(s0(366.0, Vector(Vector(367.0)), Vector(Vector(368.0)), Vector(Vector(369.0), Vector(370.0), Vector(371.0)))), Vector(s0(372.0, Vector(Vector(373.0)), Vector(Vector(374.0)), Vector(Vector(375.0), Vector(376.0), Vector(377.0))), s0(378.0, Vector(Vector(379.0)), Vector(Vector(380.0)), Vector(Vector(381.0), Vector(382.0), Vector(383.0))), s0(384.0, Vector(Vector(385.0)), Vector(Vector(386.0)), Vector(Vector(387.0), Vector(388.0), Vector(389.0))))), s1(Vector(s0(390.0, Vector(Vector(391.0)), Vector(Vector(392.0)), Vector(Vector(393.0), Vector(394.0), Vector(395.0)))), Vector(s0(396.0, Vector(Vector(397.0)), Vector(Vector(398.0)), Vector(Vector(399.0), Vector(400.0), Vector(401.0))), s0(402.0, Vector(Vector(403.0)), Vector(Vector(404.0)), Vector(Vector(405.0), Vector(406.0), Vector(407.0))), s0(408.0, Vector(Vector(409.0)), Vector(Vector(410.0)), Vector(Vector(411.0), Vector(412.0), Vector(413.0))))), s1(Vector(s0(414.0, Vector(Vector(415.0)), Vector(Vector(416.0)), Vector(Vector(417.0), Vector(418.0), Vector(419.0)))), Vector(s0(420.0, Vector(Vector(421.0)), Vector(Vector(422.0)), Vector(Vector(423.0), Vector(424.0), Vector(425.0))), s0(426.0, Vector(Vector(427.0)), Vector(Vector(428.0)), Vector(Vector(429.0), Vector(430.0), Vector(431.0))), s0(432.0, Vector(Vector(433.0)), Vector(Vector(434.0)), Vector(Vector(435.0), Vector(436.0), Vector(437.0)))))), s1(Vector(s0(438.0, Vector(Vector(439.0)), Vector(Vector(440.0)), Vector(Vector(441.0), Vector(442.0), Vector(443.0)))), Vector(s0(444.0, Vector(Vector(445.0)), Vector(Vector(446.0)), Vector(Vector(447.0), Vector(448.0), Vector(449.0))), s0(450.0, Vector(Vector(451.0)), Vector(Vector(452.0)), Vector(Vector(453.0), Vector(454.0), Vector(455.0))), s0(456.0, Vector(Vector(457.0)), Vector(Vector(458.0)), Vector(Vector(459.0), Vector(460.0), Vector(461.0))))))), Vector(s1(Vector(s0(462.0, Vector(Vector(463.0)), Vector(Vector(464.0)), Vector(Vector(465.0), Vector(466.0), Vector(467.0)))), Vector(s0(468.0, Vector(Vector(469.0)), Vector(Vector(470.0)), Vector(Vector(471.0), Vector(472.0), Vector(473.0))), s0(474.0, Vector(Vector(475.0)), Vector(Vector(476.0)), Vector(Vector(477.0), Vector(478.0), Vector(479.0))), s0(480.0, Vector(Vector(481.0)), Vector(Vector(482.0)), Vector(Vector(483.0), Vector(484.0), Vector(485.0))))), s1(Vector(s0(486.0, Vector(Vector(487.0)), Vector(Vector(488.0)), Vector(Vector(489.0), Vector(490.0), Vector(491.0)))), Vector(s0(492.0, Vector(Vector(493.0)), Vector(Vector(494.0)), Vector(Vector(495.0), Vector(496.0), Vector(497.0))), s0(498.0, Vector(Vector(499.0)), Vector(Vector(500.0)), Vector(Vector(501.0), Vector(502.0), Vector(503.0))), s0(504.0, Vector(Vector(505.0)), Vector(Vector(506.0)), Vector(Vector(507.0), Vector(508.0), Vector(509.0)))))), Vector(Vector(s4(Vector(s1(Vector(s0(510.0, Vector(Vector(511.0)), Vector(Vector(512.0)), Vector(Vector(513.0), Vector(514.0), Vector(515.0)))), Vector(s0(516.0, Vector(Vector(517.0)), Vector(Vector(518.0)), Vector(Vector(519.0), Vector(520.0), Vector(521.0))), s0(522.0, Vector(Vector(523.0)), Vector(Vector(524.0)), Vector(Vector(525.0), Vector(526.0), Vector(527.0))), s0(528.0, Vector(Vector(529.0)), Vector(Vector(530.0)), Vector(Vector(531.0), Vector(532.0), Vector(533.0))))), s1(Vector(s0(534.0, Vector(Vector(535.0)), Vector(Vector(536.0)), Vector(Vector(537.0), Vector(538.0), Vector(539.0)))), Vector(s0(540.0, Vector(Vector(541.0)), Vector(Vector(542.0)), Vector(Vector(543.0), Vector(544.0), Vector(545.0))), s0(546.0, Vector(Vector(547.0)), Vector(Vector(548.0)), Vector(Vector(549.0), Vector(550.0), Vector(551.0))), s0(552.0, Vector(Vector(553.0)), Vector(Vector(554.0)), Vector(Vector(555.0), Vector(556.0), Vector(557.0))))), s1(Vector(s0(558.0, Vector(Vector(559.0)), Vector(Vector(560.0)), Vector(Vector(561.0), Vector(562.0), Vector(563.0)))), Vector(s0(564.0, Vector(Vector(565.0)), Vector(Vector(566.0)), Vector(Vector(567.0), Vector(568.0), Vector(569.0))), s0(570.0, Vector(Vector(571.0)), Vector(Vector(572.0)), Vector(Vector(573.0), Vector(574.0), Vector(575.0))), s0(576.0, Vector(Vector(577.0)), Vector(Vector(578.0)), Vector(Vector(579.0), Vector(580.0), Vector(581.0)))))), s1(Vector(s0(582.0, Vector(Vector(583.0)), Vector(Vector(584.0)), Vector(Vector(585.0), Vector(586.0), Vector(587.0)))), Vector(s0(588.0, Vector(Vector(589.0)), Vector(Vector(590.0)), Vector(Vector(591.0), Vector(592.0), Vector(593.0))), s0(594.0, Vector(Vector(595.0)), Vector(Vector(596.0)), Vector(Vector(597.0), Vector(598.0), Vector(599.0))), s0(600.0, Vector(Vector(601.0)), Vector(Vector(602.0)), Vector(Vector(603.0), Vector(604.0), Vector(605.0))))))), Vector(s4(Vector(s1(Vector(s0(606.0, Vector(Vector(607.0)), Vector(Vector(608.0)), Vector(Vector(609.0), Vector(610.0), Vector(611.0)))), Vector(s0(612.0, Vector(Vector(613.0)), Vector(Vector(614.0)), Vector(Vector(615.0), Vector(616.0), Vector(617.0))), s0(618.0, Vector(Vector(619.0)), Vector(Vector(620.0)), Vector(Vector(621.0), Vector(622.0), Vector(623.0))), s0(624.0, Vector(Vector(625.0)), Vector(Vector(626.0)), Vector(Vector(627.0), Vector(628.0), Vector(629.0))))), s1(Vector(s0(630.0, Vector(Vector(631.0)), Vector(Vector(632.0)), Vector(Vector(633.0), Vector(634.0), Vector(635.0)))), Vector(s0(636.0, Vector(Vector(637.0)), Vector(Vector(638.0)), Vector(Vector(639.0), Vector(640.0), Vector(641.0))), s0(642.0, Vector(Vector(643.0)), Vector(Vector(644.0)), Vector(Vector(645.0), Vector(646.0), Vector(647.0))), s0(648.0, Vector(Vector(649.0)), Vector(Vector(650.0)), Vector(Vector(651.0), Vector(652.0), Vector(653.0))))), s1(Vector(s0(654.0, Vector(Vector(655.0)), Vector(Vector(656.0)), Vector(Vector(657.0), Vector(658.0), Vector(659.0)))), Vector(s0(660.0, Vector(Vector(661.0)), Vector(Vector(662.0)), Vector(Vector(663.0), Vector(664.0), Vector(665.0))), s0(666.0, Vector(Vector(667.0)), Vector(Vector(668.0)), Vector(Vector(669.0), Vector(670.0), Vector(671.0))), s0(672.0, Vector(Vector(673.0)), Vector(Vector(674.0)), Vector(Vector(675.0), Vector(676.0), Vector(677.0)))))), s1(Vector(s0(678.0, Vector(Vector(679.0)), Vector(Vector(680.0)), Vector(Vector(681.0), Vector(682.0), Vector(683.0)))), Vector(s0(684.0, Vector(Vector(685.0)), Vector(Vector(686.0)), Vector(Vector(687.0), Vector(688.0), Vector(689.0))), s0(690.0, Vector(Vector(691.0)), Vector(Vector(692.0)), Vector(Vector(693.0), Vector(694.0), Vector(695.0))), s0(696.0, Vector(Vector(697.0)), Vector(Vector(698.0)), Vector(Vector(699.0), Vector(700.0), Vector(701.0)))))))))
    val v4: Vector[s3] = Vector(s3(s2(s0(702.0, Vector(Vector(703.0)), Vector(Vector(704.0)), Vector(Vector(705.0), Vector(706.0), Vector(707.0))), s0(708.0, Vector(Vector(709.0)), Vector(Vector(710.0)), Vector(Vector(711.0), Vector(712.0), Vector(713.0)))), Vector(Vector(s0(714.0, Vector(Vector(715.0)), Vector(Vector(716.0)), Vector(Vector(717.0), Vector(718.0), Vector(719.0)))), Vector(s0(720.0, Vector(Vector(721.0)), Vector(Vector(722.0)), Vector(Vector(723.0), Vector(724.0), Vector(725.0)))))), s3(s2(s0(726.0, Vector(Vector(727.0)), Vector(Vector(728.0)), Vector(Vector(729.0), Vector(730.0), Vector(731.0))), s0(732.0, Vector(Vector(733.0)), Vector(Vector(734.0)), Vector(Vector(735.0), Vector(736.0), Vector(737.0)))), Vector(Vector(s0(738.0, Vector(Vector(739.0)), Vector(Vector(740.0)), Vector(Vector(741.0), Vector(742.0), Vector(743.0)))), Vector(s0(744.0, Vector(Vector(745.0)), Vector(Vector(746.0)), Vector(Vector(747.0), Vector(748.0), Vector(749.0)))))), s3(s2(s0(750.0, Vector(Vector(751.0)), Vector(Vector(752.0)), Vector(Vector(753.0), Vector(754.0), Vector(755.0))), s0(756.0, Vector(Vector(757.0)), Vector(Vector(758.0)), Vector(Vector(759.0), Vector(760.0), Vector(761.0)))), Vector(Vector(s0(762.0, Vector(Vector(763.0)), Vector(Vector(764.0)), Vector(Vector(765.0), Vector(766.0), Vector(767.0)))), Vector(s0(768.0, Vector(Vector(769.0)), Vector(Vector(770.0)), Vector(Vector(771.0), Vector(772.0), Vector(773.0)))))))
    val v5: s3 = s3(s2(s0(774.0, Vector(Vector(775.0)), Vector(Vector(776.0)), Vector(Vector(777.0), Vector(778.0), Vector(779.0))), s0(780.0, Vector(Vector(781.0)), Vector(Vector(782.0)), Vector(Vector(783.0), Vector(784.0), Vector(785.0)))), Vector(Vector(s0(786.0, Vector(Vector(787.0)), Vector(Vector(788.0)), Vector(Vector(789.0), Vector(790.0), Vector(791.0)))), Vector(s0(792.0, Vector(Vector(793.0)), Vector(Vector(794.0)), Vector(Vector(795.0), Vector(796.0), Vector(797.0))))))
    val v6: Vector[Double] = Vector(798.0)
    val v7: Double = 799.0
    val start = nanoTime()
    var result: Double = 799.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4, v5, v6, v7)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}