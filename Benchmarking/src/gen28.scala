import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Double],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0,
    p2: Vector[s0]
  )
  case class s2 (
    p0: Vector[s0],
    p1: s1
  )
  case class s3 (
    p0: s2,
    p1: Vector[s1]
  )
  case class s4 (
    p0: s3,
    p1: s1
  )
  case class s5 (
    p0: s1,
    p1: s3
  )
  case class s6 (
    p0: Vector[Vector[s4]],
    p1: s5
  )
  case class s8 (
    p0: s0,
    p1: s5,
    p2: Vector[s4]
  )
  case class s9 (
    p0: s1,
    p1: s6
  )
  def f8(v0: s0): s0 = {
    val v3: Vector[s0] = Vector(v0, v0, v0, v0, v0, v0)
    val v5: s0 = v3(3)
    v5
  }
  @noinline
  def f0(v0: Vector[s9], v1: Vector[s0], v2: s9, v3: Vector[s5], v4: s3, v5: Vector[Vector[s8]], v6: Double): Double = {
    var v10: Vector[s0] = v1
    val v14: s0 = v10(0)
    v10 = v10.updated(0, v14)
    val v17: s5 = v3(1)
    val v22: s0 = f8(v14)
    val v20: s1 = v17.p0
    v10 = v10.updated(0, v22)
    v10 = v10.updated(0, v22)
    val v28: Vector[s8] = v5(0)
    val v33: s0 = v20.p1
    val v32: s0 = f8(v14)
    v10 = v10.updated(0, v22)
    v10 = v10.updated(0, v33)
    val v31: s8 = v28(0)
    v10 = v10.updated(0, v32)
    val v68: Vector[Vector[Double]] = v22.p1
    val v66: s0 = v31.p0
    v10 = v10.updated(0, v32)
    val v97: s0 = v31.p0
    v10 = v10.updated(0, v97)
    val v118: Vector[Double] = v68(1)
    val v144: Double = v118(0)
    v10 = v10.updated(0, v66)
    v10 = v10.updated(0, v33)
    v144
  }
  def benchmark(): Unit = {
    val v0: Vector[s9] = Vector(s9(s1(Vector(s0(Vector(0.0, 1.0), Vector(Vector(2.0), Vector(3.0), Vector(4.0)))), s0(Vector(5.0, 6.0), Vector(Vector(7.0), Vector(8.0), Vector(9.0))), Vector(s0(Vector(10.0, 11.0), Vector(Vector(12.0), Vector(13.0), Vector(14.0))), s0(Vector(15.0, 16.0), Vector(Vector(17.0), Vector(18.0), Vector(19.0))))), s6(Vector(Vector(s4(s3(s2(Vector(s0(Vector(20.0, 21.0), Vector(Vector(22.0), Vector(23.0), Vector(24.0))), s0(Vector(25.0, 26.0), Vector(Vector(27.0), Vector(28.0), Vector(29.0))), s0(Vector(30.0, 31.0), Vector(Vector(32.0), Vector(33.0), Vector(34.0)))), s1(Vector(s0(Vector(35.0, 36.0), Vector(Vector(37.0), Vector(38.0), Vector(39.0)))), s0(Vector(40.0, 41.0), Vector(Vector(42.0), Vector(43.0), Vector(44.0))), Vector(s0(Vector(45.0, 46.0), Vector(Vector(47.0), Vector(48.0), Vector(49.0))), s0(Vector(50.0, 51.0), Vector(Vector(52.0), Vector(53.0), Vector(54.0)))))), Vector(s1(Vector(s0(Vector(55.0, 56.0), Vector(Vector(57.0), Vector(58.0), Vector(59.0)))), s0(Vector(60.0, 61.0), Vector(Vector(62.0), Vector(63.0), Vector(64.0))), Vector(s0(Vector(65.0, 66.0), Vector(Vector(67.0), Vector(68.0), Vector(69.0))), s0(Vector(70.0, 71.0), Vector(Vector(72.0), Vector(73.0), Vector(74.0))))), s1(Vector(s0(Vector(75.0, 76.0), Vector(Vector(77.0), Vector(78.0), Vector(79.0)))), s0(Vector(80.0, 81.0), Vector(Vector(82.0), Vector(83.0), Vector(84.0))), Vector(s0(Vector(85.0, 86.0), Vector(Vector(87.0), Vector(88.0), Vector(89.0))), s0(Vector(90.0, 91.0), Vector(Vector(92.0), Vector(93.0), Vector(94.0))))))), s1(Vector(s0(Vector(95.0, 96.0), Vector(Vector(97.0), Vector(98.0), Vector(99.0)))), s0(Vector(100.0, 101.0), Vector(Vector(102.0), Vector(103.0), Vector(104.0))), Vector(s0(Vector(105.0, 106.0), Vector(Vector(107.0), Vector(108.0), Vector(109.0))), s0(Vector(110.0, 111.0), Vector(Vector(112.0), Vector(113.0), Vector(114.0)))))))), s5(s1(Vector(s0(Vector(115.0, 116.0), Vector(Vector(117.0), Vector(118.0), Vector(119.0)))), s0(Vector(120.0, 121.0), Vector(Vector(122.0), Vector(123.0), Vector(124.0))), Vector(s0(Vector(125.0, 126.0), Vector(Vector(127.0), Vector(128.0), Vector(129.0))), s0(Vector(130.0, 131.0), Vector(Vector(132.0), Vector(133.0), Vector(134.0))))), s3(s2(Vector(s0(Vector(135.0, 136.0), Vector(Vector(137.0), Vector(138.0), Vector(139.0))), s0(Vector(140.0, 141.0), Vector(Vector(142.0), Vector(143.0), Vector(144.0))), s0(Vector(145.0, 146.0), Vector(Vector(147.0), Vector(148.0), Vector(149.0)))), s1(Vector(s0(Vector(150.0, 151.0), Vector(Vector(152.0), Vector(153.0), Vector(154.0)))), s0(Vector(155.0, 156.0), Vector(Vector(157.0), Vector(158.0), Vector(159.0))), Vector(s0(Vector(160.0, 161.0), Vector(Vector(162.0), Vector(163.0), Vector(164.0))), s0(Vector(165.0, 166.0), Vector(Vector(167.0), Vector(168.0), Vector(169.0)))))), Vector(s1(Vector(s0(Vector(170.0, 171.0), Vector(Vector(172.0), Vector(173.0), Vector(174.0)))), s0(Vector(175.0, 176.0), Vector(Vector(177.0), Vector(178.0), Vector(179.0))), Vector(s0(Vector(180.0, 181.0), Vector(Vector(182.0), Vector(183.0), Vector(184.0))), s0(Vector(185.0, 186.0), Vector(Vector(187.0), Vector(188.0), Vector(189.0))))), s1(Vector(s0(Vector(190.0, 191.0), Vector(Vector(192.0), Vector(193.0), Vector(194.0)))), s0(Vector(195.0, 196.0), Vector(Vector(197.0), Vector(198.0), Vector(199.0))), Vector(s0(Vector(200.0, 201.0), Vector(Vector(202.0), Vector(203.0), Vector(204.0))), s0(Vector(205.0, 206.0), Vector(Vector(207.0), Vector(208.0), Vector(209.0)))))))))))
    val v1: Vector[s0] = Vector(s0(Vector(210.0, 211.0), Vector(Vector(212.0), Vector(213.0), Vector(214.0))))
    val v2: s9 = s9(s1(Vector(s0(Vector(215.0, 216.0), Vector(Vector(217.0), Vector(218.0), Vector(219.0)))), s0(Vector(220.0, 221.0), Vector(Vector(222.0), Vector(223.0), Vector(224.0))), Vector(s0(Vector(225.0, 226.0), Vector(Vector(227.0), Vector(228.0), Vector(229.0))), s0(Vector(230.0, 231.0), Vector(Vector(232.0), Vector(233.0), Vector(234.0))))), s6(Vector(Vector(s4(s3(s2(Vector(s0(Vector(235.0, 236.0), Vector(Vector(237.0), Vector(238.0), Vector(239.0))), s0(Vector(240.0, 241.0), Vector(Vector(242.0), Vector(243.0), Vector(244.0))), s0(Vector(245.0, 246.0), Vector(Vector(247.0), Vector(248.0), Vector(249.0)))), s1(Vector(s0(Vector(250.0, 251.0), Vector(Vector(252.0), Vector(253.0), Vector(254.0)))), s0(Vector(255.0, 256.0), Vector(Vector(257.0), Vector(258.0), Vector(259.0))), Vector(s0(Vector(260.0, 261.0), Vector(Vector(262.0), Vector(263.0), Vector(264.0))), s0(Vector(265.0, 266.0), Vector(Vector(267.0), Vector(268.0), Vector(269.0)))))), Vector(s1(Vector(s0(Vector(270.0, 271.0), Vector(Vector(272.0), Vector(273.0), Vector(274.0)))), s0(Vector(275.0, 276.0), Vector(Vector(277.0), Vector(278.0), Vector(279.0))), Vector(s0(Vector(280.0, 281.0), Vector(Vector(282.0), Vector(283.0), Vector(284.0))), s0(Vector(285.0, 286.0), Vector(Vector(287.0), Vector(288.0), Vector(289.0))))), s1(Vector(s0(Vector(290.0, 291.0), Vector(Vector(292.0), Vector(293.0), Vector(294.0)))), s0(Vector(295.0, 296.0), Vector(Vector(297.0), Vector(298.0), Vector(299.0))), Vector(s0(Vector(300.0, 301.0), Vector(Vector(302.0), Vector(303.0), Vector(304.0))), s0(Vector(305.0, 306.0), Vector(Vector(307.0), Vector(308.0), Vector(309.0))))))), s1(Vector(s0(Vector(310.0, 311.0), Vector(Vector(312.0), Vector(313.0), Vector(314.0)))), s0(Vector(315.0, 316.0), Vector(Vector(317.0), Vector(318.0), Vector(319.0))), Vector(s0(Vector(320.0, 321.0), Vector(Vector(322.0), Vector(323.0), Vector(324.0))), s0(Vector(325.0, 326.0), Vector(Vector(327.0), Vector(328.0), Vector(329.0)))))))), s5(s1(Vector(s0(Vector(330.0, 331.0), Vector(Vector(332.0), Vector(333.0), Vector(334.0)))), s0(Vector(335.0, 336.0), Vector(Vector(337.0), Vector(338.0), Vector(339.0))), Vector(s0(Vector(340.0, 341.0), Vector(Vector(342.0), Vector(343.0), Vector(344.0))), s0(Vector(345.0, 346.0), Vector(Vector(347.0), Vector(348.0), Vector(349.0))))), s3(s2(Vector(s0(Vector(350.0, 351.0), Vector(Vector(352.0), Vector(353.0), Vector(354.0))), s0(Vector(355.0, 356.0), Vector(Vector(357.0), Vector(358.0), Vector(359.0))), s0(Vector(360.0, 361.0), Vector(Vector(362.0), Vector(363.0), Vector(364.0)))), s1(Vector(s0(Vector(365.0, 366.0), Vector(Vector(367.0), Vector(368.0), Vector(369.0)))), s0(Vector(370.0, 371.0), Vector(Vector(372.0), Vector(373.0), Vector(374.0))), Vector(s0(Vector(375.0, 376.0), Vector(Vector(377.0), Vector(378.0), Vector(379.0))), s0(Vector(380.0, 381.0), Vector(Vector(382.0), Vector(383.0), Vector(384.0)))))), Vector(s1(Vector(s0(Vector(385.0, 386.0), Vector(Vector(387.0), Vector(388.0), Vector(389.0)))), s0(Vector(390.0, 391.0), Vector(Vector(392.0), Vector(393.0), Vector(394.0))), Vector(s0(Vector(395.0, 396.0), Vector(Vector(397.0), Vector(398.0), Vector(399.0))), s0(Vector(400.0, 401.0), Vector(Vector(402.0), Vector(403.0), Vector(404.0))))), s1(Vector(s0(Vector(405.0, 406.0), Vector(Vector(407.0), Vector(408.0), Vector(409.0)))), s0(Vector(410.0, 411.0), Vector(Vector(412.0), Vector(413.0), Vector(414.0))), Vector(s0(Vector(415.0, 416.0), Vector(Vector(417.0), Vector(418.0), Vector(419.0))), s0(Vector(420.0, 421.0), Vector(Vector(422.0), Vector(423.0), Vector(424.0))))))))))
    val v3: Vector[s5] = Vector(s5(s1(Vector(s0(Vector(425.0, 426.0), Vector(Vector(427.0), Vector(428.0), Vector(429.0)))), s0(Vector(430.0, 431.0), Vector(Vector(432.0), Vector(433.0), Vector(434.0))), Vector(s0(Vector(435.0, 436.0), Vector(Vector(437.0), Vector(438.0), Vector(439.0))), s0(Vector(440.0, 441.0), Vector(Vector(442.0), Vector(443.0), Vector(444.0))))), s3(s2(Vector(s0(Vector(445.0, 446.0), Vector(Vector(447.0), Vector(448.0), Vector(449.0))), s0(Vector(450.0, 451.0), Vector(Vector(452.0), Vector(453.0), Vector(454.0))), s0(Vector(455.0, 456.0), Vector(Vector(457.0), Vector(458.0), Vector(459.0)))), s1(Vector(s0(Vector(460.0, 461.0), Vector(Vector(462.0), Vector(463.0), Vector(464.0)))), s0(Vector(465.0, 466.0), Vector(Vector(467.0), Vector(468.0), Vector(469.0))), Vector(s0(Vector(470.0, 471.0), Vector(Vector(472.0), Vector(473.0), Vector(474.0))), s0(Vector(475.0, 476.0), Vector(Vector(477.0), Vector(478.0), Vector(479.0)))))), Vector(s1(Vector(s0(Vector(480.0, 481.0), Vector(Vector(482.0), Vector(483.0), Vector(484.0)))), s0(Vector(485.0, 486.0), Vector(Vector(487.0), Vector(488.0), Vector(489.0))), Vector(s0(Vector(490.0, 491.0), Vector(Vector(492.0), Vector(493.0), Vector(494.0))), s0(Vector(495.0, 496.0), Vector(Vector(497.0), Vector(498.0), Vector(499.0))))), s1(Vector(s0(Vector(500.0, 501.0), Vector(Vector(502.0), Vector(503.0), Vector(504.0)))), s0(Vector(505.0, 506.0), Vector(Vector(507.0), Vector(508.0), Vector(509.0))), Vector(s0(Vector(510.0, 511.0), Vector(Vector(512.0), Vector(513.0), Vector(514.0))), s0(Vector(515.0, 516.0), Vector(Vector(517.0), Vector(518.0), Vector(519.0)))))))), s5(s1(Vector(s0(Vector(520.0, 521.0), Vector(Vector(522.0), Vector(523.0), Vector(524.0)))), s0(Vector(525.0, 526.0), Vector(Vector(527.0), Vector(528.0), Vector(529.0))), Vector(s0(Vector(530.0, 531.0), Vector(Vector(532.0), Vector(533.0), Vector(534.0))), s0(Vector(535.0, 536.0), Vector(Vector(537.0), Vector(538.0), Vector(539.0))))), s3(s2(Vector(s0(Vector(540.0, 541.0), Vector(Vector(542.0), Vector(543.0), Vector(544.0))), s0(Vector(545.0, 546.0), Vector(Vector(547.0), Vector(548.0), Vector(549.0))), s0(Vector(550.0, 551.0), Vector(Vector(552.0), Vector(553.0), Vector(554.0)))), s1(Vector(s0(Vector(555.0, 556.0), Vector(Vector(557.0), Vector(558.0), Vector(559.0)))), s0(Vector(560.0, 561.0), Vector(Vector(562.0), Vector(563.0), Vector(564.0))), Vector(s0(Vector(565.0, 566.0), Vector(Vector(567.0), Vector(568.0), Vector(569.0))), s0(Vector(570.0, 571.0), Vector(Vector(572.0), Vector(573.0), Vector(574.0)))))), Vector(s1(Vector(s0(Vector(575.0, 576.0), Vector(Vector(577.0), Vector(578.0), Vector(579.0)))), s0(Vector(580.0, 581.0), Vector(Vector(582.0), Vector(583.0), Vector(584.0))), Vector(s0(Vector(585.0, 586.0), Vector(Vector(587.0), Vector(588.0), Vector(589.0))), s0(Vector(590.0, 591.0), Vector(Vector(592.0), Vector(593.0), Vector(594.0))))), s1(Vector(s0(Vector(595.0, 596.0), Vector(Vector(597.0), Vector(598.0), Vector(599.0)))), s0(Vector(600.0, 601.0), Vector(Vector(602.0), Vector(603.0), Vector(604.0))), Vector(s0(Vector(605.0, 606.0), Vector(Vector(607.0), Vector(608.0), Vector(609.0))), s0(Vector(610.0, 611.0), Vector(Vector(612.0), Vector(613.0), Vector(614.0)))))))))
    val v4: s3 = s3(s2(Vector(s0(Vector(615.0, 616.0), Vector(Vector(617.0), Vector(618.0), Vector(619.0))), s0(Vector(620.0, 621.0), Vector(Vector(622.0), Vector(623.0), Vector(624.0))), s0(Vector(625.0, 626.0), Vector(Vector(627.0), Vector(628.0), Vector(629.0)))), s1(Vector(s0(Vector(630.0, 631.0), Vector(Vector(632.0), Vector(633.0), Vector(634.0)))), s0(Vector(635.0, 636.0), Vector(Vector(637.0), Vector(638.0), Vector(639.0))), Vector(s0(Vector(640.0, 641.0), Vector(Vector(642.0), Vector(643.0), Vector(644.0))), s0(Vector(645.0, 646.0), Vector(Vector(647.0), Vector(648.0), Vector(649.0)))))), Vector(s1(Vector(s0(Vector(650.0, 651.0), Vector(Vector(652.0), Vector(653.0), Vector(654.0)))), s0(Vector(655.0, 656.0), Vector(Vector(657.0), Vector(658.0), Vector(659.0))), Vector(s0(Vector(660.0, 661.0), Vector(Vector(662.0), Vector(663.0), Vector(664.0))), s0(Vector(665.0, 666.0), Vector(Vector(667.0), Vector(668.0), Vector(669.0))))), s1(Vector(s0(Vector(670.0, 671.0), Vector(Vector(672.0), Vector(673.0), Vector(674.0)))), s0(Vector(675.0, 676.0), Vector(Vector(677.0), Vector(678.0), Vector(679.0))), Vector(s0(Vector(680.0, 681.0), Vector(Vector(682.0), Vector(683.0), Vector(684.0))), s0(Vector(685.0, 686.0), Vector(Vector(687.0), Vector(688.0), Vector(689.0)))))))
    val v5: Vector[Vector[s8]] = Vector(Vector(s8(s0(Vector(690.0, 691.0), Vector(Vector(692.0), Vector(693.0), Vector(694.0))), s5(s1(Vector(s0(Vector(695.0, 696.0), Vector(Vector(697.0), Vector(698.0), Vector(699.0)))), s0(Vector(700.0, 701.0), Vector(Vector(702.0), Vector(703.0), Vector(704.0))), Vector(s0(Vector(705.0, 706.0), Vector(Vector(707.0), Vector(708.0), Vector(709.0))), s0(Vector(710.0, 711.0), Vector(Vector(712.0), Vector(713.0), Vector(714.0))))), s3(s2(Vector(s0(Vector(715.0, 716.0), Vector(Vector(717.0), Vector(718.0), Vector(719.0))), s0(Vector(720.0, 721.0), Vector(Vector(722.0), Vector(723.0), Vector(724.0))), s0(Vector(725.0, 726.0), Vector(Vector(727.0), Vector(728.0), Vector(729.0)))), s1(Vector(s0(Vector(730.0, 731.0), Vector(Vector(732.0), Vector(733.0), Vector(734.0)))), s0(Vector(735.0, 736.0), Vector(Vector(737.0), Vector(738.0), Vector(739.0))), Vector(s0(Vector(740.0, 741.0), Vector(Vector(742.0), Vector(743.0), Vector(744.0))), s0(Vector(745.0, 746.0), Vector(Vector(747.0), Vector(748.0), Vector(749.0)))))), Vector(s1(Vector(s0(Vector(750.0, 751.0), Vector(Vector(752.0), Vector(753.0), Vector(754.0)))), s0(Vector(755.0, 756.0), Vector(Vector(757.0), Vector(758.0), Vector(759.0))), Vector(s0(Vector(760.0, 761.0), Vector(Vector(762.0), Vector(763.0), Vector(764.0))), s0(Vector(765.0, 766.0), Vector(Vector(767.0), Vector(768.0), Vector(769.0))))), s1(Vector(s0(Vector(770.0, 771.0), Vector(Vector(772.0), Vector(773.0), Vector(774.0)))), s0(Vector(775.0, 776.0), Vector(Vector(777.0), Vector(778.0), Vector(779.0))), Vector(s0(Vector(780.0, 781.0), Vector(Vector(782.0), Vector(783.0), Vector(784.0))), s0(Vector(785.0, 786.0), Vector(Vector(787.0), Vector(788.0), Vector(789.0)))))))), Vector(s4(s3(s2(Vector(s0(Vector(790.0, 791.0), Vector(Vector(792.0), Vector(793.0), Vector(794.0))), s0(Vector(795.0, 796.0), Vector(Vector(797.0), Vector(798.0), Vector(799.0))), s0(Vector(800.0, 801.0), Vector(Vector(802.0), Vector(803.0), Vector(804.0)))), s1(Vector(s0(Vector(805.0, 806.0), Vector(Vector(807.0), Vector(808.0), Vector(809.0)))), s0(Vector(810.0, 811.0), Vector(Vector(812.0), Vector(813.0), Vector(814.0))), Vector(s0(Vector(815.0, 816.0), Vector(Vector(817.0), Vector(818.0), Vector(819.0))), s0(Vector(820.0, 821.0), Vector(Vector(822.0), Vector(823.0), Vector(824.0)))))), Vector(s1(Vector(s0(Vector(825.0, 826.0), Vector(Vector(827.0), Vector(828.0), Vector(829.0)))), s0(Vector(830.0, 831.0), Vector(Vector(832.0), Vector(833.0), Vector(834.0))), Vector(s0(Vector(835.0, 836.0), Vector(Vector(837.0), Vector(838.0), Vector(839.0))), s0(Vector(840.0, 841.0), Vector(Vector(842.0), Vector(843.0), Vector(844.0))))), s1(Vector(s0(Vector(845.0, 846.0), Vector(Vector(847.0), Vector(848.0), Vector(849.0)))), s0(Vector(850.0, 851.0), Vector(Vector(852.0), Vector(853.0), Vector(854.0))), Vector(s0(Vector(855.0, 856.0), Vector(Vector(857.0), Vector(858.0), Vector(859.0))), s0(Vector(860.0, 861.0), Vector(Vector(862.0), Vector(863.0), Vector(864.0))))))), s1(Vector(s0(Vector(865.0, 866.0), Vector(Vector(867.0), Vector(868.0), Vector(869.0)))), s0(Vector(870.0, 871.0), Vector(Vector(872.0), Vector(873.0), Vector(874.0))), Vector(s0(Vector(875.0, 876.0), Vector(Vector(877.0), Vector(878.0), Vector(879.0))), s0(Vector(880.0, 881.0), Vector(Vector(882.0), Vector(883.0), Vector(884.0))))))))))
    val v6: Double = 885.0
    val start = nanoTime()
    var result: Double = 885.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4, v5, v6)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}