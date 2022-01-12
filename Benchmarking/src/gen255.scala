import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Double
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s2 (
    p0: Vector[Double],
    p1: s1,
    p2: Vector[s1]
  )
  case class s3 (
    p0: Vector[s2],
    p1: Vector[Vector[s2]]
  )
  case class s4 (
    p0: Vector[s2],
    p1: Vector[s1]
  )
  case class s5 (
    p0: Vector[s1],
    p1: Vector[s2]
  )
  case class s6 (
    p0: s3
  )
  case class s8 (
    p0: s3,
    p1: Vector[Vector[s6]]
  )
  case class s9 (
    p0: s2,
    p1: s5
  )
  def f5(v0: s0): s0 = {
    var v1: s0 = v0
    var v6: s0 = v0
    var v4: s0 = v0
    var v3: s0 = v1
    var v8: s0 = v0
    val v2: Double = v6.p1
    v4 = v4.copy(p1 = v2)
    var v9: s0 = v8
    v6 = v6.copy(p1 = v2)
    v9 = v3
    val v12: Double = v1.p1
    var v5: Double = v2
    var v16: s0 = v3
    val v14: Vector[s0] = Vector(v16)
    val v19: Double = v8.p1
    var v30: s0 = v0
    var v10: Vector[s0] = v14
    v30 = v30.copy(p1 = v12)
    v10 = v10.updated(0, v3)
    val v25: s0 = v10(0)
    val v17: Double = v5 + v2
    val v20: s0 = v14(0)
    val v37: Double = v6.p1
    val v52: Vector[Double] = Vector(v5, v17, v19, v2, v37)
    v16 = v16.copy(p1 = v2)
    v6 = v4
    var v36: Vector[s0] = v10
    v16 = v16.copy(p1 = v5)
    val v28: Double = v3.p1
    v30 = v30.copy(p1 = v37)
    v36 = v36.updated(0, v3)
    v36 = v36.updated(0, v16)
    v16 = v16.copy(p1 = v2)
    val v22: Double = v52(1)
    v10 = v10.updated(0, v25)
    val v24: Vector[Vector[Double]] = v20.p0
    v36 = v36.updated(0, v9)
    val v55: s0 = v36(0)
    val v80: Vector[Vector[Double]] = v0.p0
    v36 = v10
    v4 = v4.copy(p0 = v80)
    v30 = v16
    val v48: Vector[Vector[Double]] = v3.p0
    v30 = v30.copy(p0 = v24)
    v9 = v9.copy(p0 = v80)
    v1 = v1.copy(p1 = v22)
    var v103: s0 = v55
    v1 = v30
    val v65: Double = v16.p1
    v1 = v1.copy(p1 = v28)
    v1 = v1.copy(p1 = v65)
    val v93: Vector[Vector[Double]] = v0.p0
    v8 = v8.copy(p0 = v24)
    v9 = v9.copy(p0 = v93)
    v1 = v1.copy(p0 = v48)
    v1 = v1.copy(p0 = v93)
    v103
  }
  @noinline
  def f0(v0: Vector[s4], v1: s0, v2: Vector[s5], v3: s2, v4: s9, v5: Vector[s1], v6: s8, v7: s2, v8: Double): Double = {
    val v33: s0 = f5(v1)
    val v99: Double = v33.p1
    v99
  }
  def benchmark(): Unit = {
    val v0: Vector[s4] = Vector(s4(Vector(s2(Vector(0.0, 1.0), s1(s0(Vector(Vector(2.0), Vector(3.0)), 4.0), Vector(s0(Vector(Vector(5.0), Vector(6.0)), 7.0), s0(Vector(Vector(8.0), Vector(9.0)), 10.0), s0(Vector(Vector(11.0), Vector(12.0)), 13.0))), Vector(s1(s0(Vector(Vector(14.0), Vector(15.0)), 16.0), Vector(s0(Vector(Vector(17.0), Vector(18.0)), 19.0), s0(Vector(Vector(20.0), Vector(21.0)), 22.0), s0(Vector(Vector(23.0), Vector(24.0)), 25.0))), s1(s0(Vector(Vector(26.0), Vector(27.0)), 28.0), Vector(s0(Vector(Vector(29.0), Vector(30.0)), 31.0), s0(Vector(Vector(32.0), Vector(33.0)), 34.0), s0(Vector(Vector(35.0), Vector(36.0)), 37.0)))))), Vector(s1(s0(Vector(Vector(38.0), Vector(39.0)), 40.0), Vector(s0(Vector(Vector(41.0), Vector(42.0)), 43.0), s0(Vector(Vector(44.0), Vector(45.0)), 46.0), s0(Vector(Vector(47.0), Vector(48.0)), 49.0))), s1(s0(Vector(Vector(50.0), Vector(51.0)), 52.0), Vector(s0(Vector(Vector(53.0), Vector(54.0)), 55.0), s0(Vector(Vector(56.0), Vector(57.0)), 58.0), s0(Vector(Vector(59.0), Vector(60.0)), 61.0))), s1(s0(Vector(Vector(62.0), Vector(63.0)), 64.0), Vector(s0(Vector(Vector(65.0), Vector(66.0)), 67.0), s0(Vector(Vector(68.0), Vector(69.0)), 70.0), s0(Vector(Vector(71.0), Vector(72.0)), 73.0))))), s4(Vector(s2(Vector(74.0, 75.0), s1(s0(Vector(Vector(76.0), Vector(77.0)), 78.0), Vector(s0(Vector(Vector(79.0), Vector(80.0)), 81.0), s0(Vector(Vector(82.0), Vector(83.0)), 84.0), s0(Vector(Vector(85.0), Vector(86.0)), 87.0))), Vector(s1(s0(Vector(Vector(88.0), Vector(89.0)), 90.0), Vector(s0(Vector(Vector(91.0), Vector(92.0)), 93.0), s0(Vector(Vector(94.0), Vector(95.0)), 96.0), s0(Vector(Vector(97.0), Vector(98.0)), 99.0))), s1(s0(Vector(Vector(100.0), Vector(101.0)), 102.0), Vector(s0(Vector(Vector(103.0), Vector(104.0)), 105.0), s0(Vector(Vector(106.0), Vector(107.0)), 108.0), s0(Vector(Vector(109.0), Vector(110.0)), 111.0)))))), Vector(s1(s0(Vector(Vector(112.0), Vector(113.0)), 114.0), Vector(s0(Vector(Vector(115.0), Vector(116.0)), 117.0), s0(Vector(Vector(118.0), Vector(119.0)), 120.0), s0(Vector(Vector(121.0), Vector(122.0)), 123.0))), s1(s0(Vector(Vector(124.0), Vector(125.0)), 126.0), Vector(s0(Vector(Vector(127.0), Vector(128.0)), 129.0), s0(Vector(Vector(130.0), Vector(131.0)), 132.0), s0(Vector(Vector(133.0), Vector(134.0)), 135.0))), s1(s0(Vector(Vector(136.0), Vector(137.0)), 138.0), Vector(s0(Vector(Vector(139.0), Vector(140.0)), 141.0), s0(Vector(Vector(142.0), Vector(143.0)), 144.0), s0(Vector(Vector(145.0), Vector(146.0)), 147.0))))))
    val v1: s0 = s0(Vector(Vector(148.0), Vector(149.0)), 150.0)
    val v2: Vector[s5] = Vector(s5(Vector(s1(s0(Vector(Vector(151.0), Vector(152.0)), 153.0), Vector(s0(Vector(Vector(154.0), Vector(155.0)), 156.0), s0(Vector(Vector(157.0), Vector(158.0)), 159.0), s0(Vector(Vector(160.0), Vector(161.0)), 162.0))), s1(s0(Vector(Vector(163.0), Vector(164.0)), 165.0), Vector(s0(Vector(Vector(166.0), Vector(167.0)), 168.0), s0(Vector(Vector(169.0), Vector(170.0)), 171.0), s0(Vector(Vector(172.0), Vector(173.0)), 174.0))), s1(s0(Vector(Vector(175.0), Vector(176.0)), 177.0), Vector(s0(Vector(Vector(178.0), Vector(179.0)), 180.0), s0(Vector(Vector(181.0), Vector(182.0)), 183.0), s0(Vector(Vector(184.0), Vector(185.0)), 186.0)))), Vector(s2(Vector(187.0, 188.0), s1(s0(Vector(Vector(189.0), Vector(190.0)), 191.0), Vector(s0(Vector(Vector(192.0), Vector(193.0)), 194.0), s0(Vector(Vector(195.0), Vector(196.0)), 197.0), s0(Vector(Vector(198.0), Vector(199.0)), 200.0))), Vector(s1(s0(Vector(Vector(201.0), Vector(202.0)), 203.0), Vector(s0(Vector(Vector(204.0), Vector(205.0)), 206.0), s0(Vector(Vector(207.0), Vector(208.0)), 209.0), s0(Vector(Vector(210.0), Vector(211.0)), 212.0))), s1(s0(Vector(Vector(213.0), Vector(214.0)), 215.0), Vector(s0(Vector(Vector(216.0), Vector(217.0)), 218.0), s0(Vector(Vector(219.0), Vector(220.0)), 221.0), s0(Vector(Vector(222.0), Vector(223.0)), 224.0))))), s2(Vector(225.0, 226.0), s1(s0(Vector(Vector(227.0), Vector(228.0)), 229.0), Vector(s0(Vector(Vector(230.0), Vector(231.0)), 232.0), s0(Vector(Vector(233.0), Vector(234.0)), 235.0), s0(Vector(Vector(236.0), Vector(237.0)), 238.0))), Vector(s1(s0(Vector(Vector(239.0), Vector(240.0)), 241.0), Vector(s0(Vector(Vector(242.0), Vector(243.0)), 244.0), s0(Vector(Vector(245.0), Vector(246.0)), 247.0), s0(Vector(Vector(248.0), Vector(249.0)), 250.0))), s1(s0(Vector(Vector(251.0), Vector(252.0)), 253.0), Vector(s0(Vector(Vector(254.0), Vector(255.0)), 256.0), s0(Vector(Vector(257.0), Vector(258.0)), 259.0), s0(Vector(Vector(260.0), Vector(261.0)), 262.0))))))), s5(Vector(s1(s0(Vector(Vector(263.0), Vector(264.0)), 265.0), Vector(s0(Vector(Vector(266.0), Vector(267.0)), 268.0), s0(Vector(Vector(269.0), Vector(270.0)), 271.0), s0(Vector(Vector(272.0), Vector(273.0)), 274.0))), s1(s0(Vector(Vector(275.0), Vector(276.0)), 277.0), Vector(s0(Vector(Vector(278.0), Vector(279.0)), 280.0), s0(Vector(Vector(281.0), Vector(282.0)), 283.0), s0(Vector(Vector(284.0), Vector(285.0)), 286.0))), s1(s0(Vector(Vector(287.0), Vector(288.0)), 289.0), Vector(s0(Vector(Vector(290.0), Vector(291.0)), 292.0), s0(Vector(Vector(293.0), Vector(294.0)), 295.0), s0(Vector(Vector(296.0), Vector(297.0)), 298.0)))), Vector(s2(Vector(299.0, 300.0), s1(s0(Vector(Vector(301.0), Vector(302.0)), 303.0), Vector(s0(Vector(Vector(304.0), Vector(305.0)), 306.0), s0(Vector(Vector(307.0), Vector(308.0)), 309.0), s0(Vector(Vector(310.0), Vector(311.0)), 312.0))), Vector(s1(s0(Vector(Vector(313.0), Vector(314.0)), 315.0), Vector(s0(Vector(Vector(316.0), Vector(317.0)), 318.0), s0(Vector(Vector(319.0), Vector(320.0)), 321.0), s0(Vector(Vector(322.0), Vector(323.0)), 324.0))), s1(s0(Vector(Vector(325.0), Vector(326.0)), 327.0), Vector(s0(Vector(Vector(328.0), Vector(329.0)), 330.0), s0(Vector(Vector(331.0), Vector(332.0)), 333.0), s0(Vector(Vector(334.0), Vector(335.0)), 336.0))))), s2(Vector(337.0, 338.0), s1(s0(Vector(Vector(339.0), Vector(340.0)), 341.0), Vector(s0(Vector(Vector(342.0), Vector(343.0)), 344.0), s0(Vector(Vector(345.0), Vector(346.0)), 347.0), s0(Vector(Vector(348.0), Vector(349.0)), 350.0))), Vector(s1(s0(Vector(Vector(351.0), Vector(352.0)), 353.0), Vector(s0(Vector(Vector(354.0), Vector(355.0)), 356.0), s0(Vector(Vector(357.0), Vector(358.0)), 359.0), s0(Vector(Vector(360.0), Vector(361.0)), 362.0))), s1(s0(Vector(Vector(363.0), Vector(364.0)), 365.0), Vector(s0(Vector(Vector(366.0), Vector(367.0)), 368.0), s0(Vector(Vector(369.0), Vector(370.0)), 371.0), s0(Vector(Vector(372.0), Vector(373.0)), 374.0))))))))
    val v3: s2 = s2(Vector(375.0, 376.0), s1(s0(Vector(Vector(377.0), Vector(378.0)), 379.0), Vector(s0(Vector(Vector(380.0), Vector(381.0)), 382.0), s0(Vector(Vector(383.0), Vector(384.0)), 385.0), s0(Vector(Vector(386.0), Vector(387.0)), 388.0))), Vector(s1(s0(Vector(Vector(389.0), Vector(390.0)), 391.0), Vector(s0(Vector(Vector(392.0), Vector(393.0)), 394.0), s0(Vector(Vector(395.0), Vector(396.0)), 397.0), s0(Vector(Vector(398.0), Vector(399.0)), 400.0))), s1(s0(Vector(Vector(401.0), Vector(402.0)), 403.0), Vector(s0(Vector(Vector(404.0), Vector(405.0)), 406.0), s0(Vector(Vector(407.0), Vector(408.0)), 409.0), s0(Vector(Vector(410.0), Vector(411.0)), 412.0)))))
    val v4: s9 = s9(s2(Vector(413.0, 414.0), s1(s0(Vector(Vector(415.0), Vector(416.0)), 417.0), Vector(s0(Vector(Vector(418.0), Vector(419.0)), 420.0), s0(Vector(Vector(421.0), Vector(422.0)), 423.0), s0(Vector(Vector(424.0), Vector(425.0)), 426.0))), Vector(s1(s0(Vector(Vector(427.0), Vector(428.0)), 429.0), Vector(s0(Vector(Vector(430.0), Vector(431.0)), 432.0), s0(Vector(Vector(433.0), Vector(434.0)), 435.0), s0(Vector(Vector(436.0), Vector(437.0)), 438.0))), s1(s0(Vector(Vector(439.0), Vector(440.0)), 441.0), Vector(s0(Vector(Vector(442.0), Vector(443.0)), 444.0), s0(Vector(Vector(445.0), Vector(446.0)), 447.0), s0(Vector(Vector(448.0), Vector(449.0)), 450.0))))), s5(Vector(s1(s0(Vector(Vector(451.0), Vector(452.0)), 453.0), Vector(s0(Vector(Vector(454.0), Vector(455.0)), 456.0), s0(Vector(Vector(457.0), Vector(458.0)), 459.0), s0(Vector(Vector(460.0), Vector(461.0)), 462.0))), s1(s0(Vector(Vector(463.0), Vector(464.0)), 465.0), Vector(s0(Vector(Vector(466.0), Vector(467.0)), 468.0), s0(Vector(Vector(469.0), Vector(470.0)), 471.0), s0(Vector(Vector(472.0), Vector(473.0)), 474.0))), s1(s0(Vector(Vector(475.0), Vector(476.0)), 477.0), Vector(s0(Vector(Vector(478.0), Vector(479.0)), 480.0), s0(Vector(Vector(481.0), Vector(482.0)), 483.0), s0(Vector(Vector(484.0), Vector(485.0)), 486.0)))), Vector(s2(Vector(487.0, 488.0), s1(s0(Vector(Vector(489.0), Vector(490.0)), 491.0), Vector(s0(Vector(Vector(492.0), Vector(493.0)), 494.0), s0(Vector(Vector(495.0), Vector(496.0)), 497.0), s0(Vector(Vector(498.0), Vector(499.0)), 500.0))), Vector(s1(s0(Vector(Vector(501.0), Vector(502.0)), 503.0), Vector(s0(Vector(Vector(504.0), Vector(505.0)), 506.0), s0(Vector(Vector(507.0), Vector(508.0)), 509.0), s0(Vector(Vector(510.0), Vector(511.0)), 512.0))), s1(s0(Vector(Vector(513.0), Vector(514.0)), 515.0), Vector(s0(Vector(Vector(516.0), Vector(517.0)), 518.0), s0(Vector(Vector(519.0), Vector(520.0)), 521.0), s0(Vector(Vector(522.0), Vector(523.0)), 524.0))))), s2(Vector(525.0, 526.0), s1(s0(Vector(Vector(527.0), Vector(528.0)), 529.0), Vector(s0(Vector(Vector(530.0), Vector(531.0)), 532.0), s0(Vector(Vector(533.0), Vector(534.0)), 535.0), s0(Vector(Vector(536.0), Vector(537.0)), 538.0))), Vector(s1(s0(Vector(Vector(539.0), Vector(540.0)), 541.0), Vector(s0(Vector(Vector(542.0), Vector(543.0)), 544.0), s0(Vector(Vector(545.0), Vector(546.0)), 547.0), s0(Vector(Vector(548.0), Vector(549.0)), 550.0))), s1(s0(Vector(Vector(551.0), Vector(552.0)), 553.0), Vector(s0(Vector(Vector(554.0), Vector(555.0)), 556.0), s0(Vector(Vector(557.0), Vector(558.0)), 559.0), s0(Vector(Vector(560.0), Vector(561.0)), 562.0))))))))
    val v5: Vector[s1] = Vector(s1(s0(Vector(Vector(563.0), Vector(564.0)), 565.0), Vector(s0(Vector(Vector(566.0), Vector(567.0)), 568.0), s0(Vector(Vector(569.0), Vector(570.0)), 571.0), s0(Vector(Vector(572.0), Vector(573.0)), 574.0))), s1(s0(Vector(Vector(575.0), Vector(576.0)), 577.0), Vector(s0(Vector(Vector(578.0), Vector(579.0)), 580.0), s0(Vector(Vector(581.0), Vector(582.0)), 583.0), s0(Vector(Vector(584.0), Vector(585.0)), 586.0))))
    val v6: s8 = s8(s3(Vector(s2(Vector(587.0, 588.0), s1(s0(Vector(Vector(589.0), Vector(590.0)), 591.0), Vector(s0(Vector(Vector(592.0), Vector(593.0)), 594.0), s0(Vector(Vector(595.0), Vector(596.0)), 597.0), s0(Vector(Vector(598.0), Vector(599.0)), 600.0))), Vector(s1(s0(Vector(Vector(601.0), Vector(602.0)), 603.0), Vector(s0(Vector(Vector(604.0), Vector(605.0)), 606.0), s0(Vector(Vector(607.0), Vector(608.0)), 609.0), s0(Vector(Vector(610.0), Vector(611.0)), 612.0))), s1(s0(Vector(Vector(613.0), Vector(614.0)), 615.0), Vector(s0(Vector(Vector(616.0), Vector(617.0)), 618.0), s0(Vector(Vector(619.0), Vector(620.0)), 621.0), s0(Vector(Vector(622.0), Vector(623.0)), 624.0))))), s2(Vector(625.0, 626.0), s1(s0(Vector(Vector(627.0), Vector(628.0)), 629.0), Vector(s0(Vector(Vector(630.0), Vector(631.0)), 632.0), s0(Vector(Vector(633.0), Vector(634.0)), 635.0), s0(Vector(Vector(636.0), Vector(637.0)), 638.0))), Vector(s1(s0(Vector(Vector(639.0), Vector(640.0)), 641.0), Vector(s0(Vector(Vector(642.0), Vector(643.0)), 644.0), s0(Vector(Vector(645.0), Vector(646.0)), 647.0), s0(Vector(Vector(648.0), Vector(649.0)), 650.0))), s1(s0(Vector(Vector(651.0), Vector(652.0)), 653.0), Vector(s0(Vector(Vector(654.0), Vector(655.0)), 656.0), s0(Vector(Vector(657.0), Vector(658.0)), 659.0), s0(Vector(Vector(660.0), Vector(661.0)), 662.0))))), s2(Vector(663.0, 664.0), s1(s0(Vector(Vector(665.0), Vector(666.0)), 667.0), Vector(s0(Vector(Vector(668.0), Vector(669.0)), 670.0), s0(Vector(Vector(671.0), Vector(672.0)), 673.0), s0(Vector(Vector(674.0), Vector(675.0)), 676.0))), Vector(s1(s0(Vector(Vector(677.0), Vector(678.0)), 679.0), Vector(s0(Vector(Vector(680.0), Vector(681.0)), 682.0), s0(Vector(Vector(683.0), Vector(684.0)), 685.0), s0(Vector(Vector(686.0), Vector(687.0)), 688.0))), s1(s0(Vector(Vector(689.0), Vector(690.0)), 691.0), Vector(s0(Vector(Vector(692.0), Vector(693.0)), 694.0), s0(Vector(Vector(695.0), Vector(696.0)), 697.0), s0(Vector(Vector(698.0), Vector(699.0)), 700.0)))))), Vector(Vector(s2(Vector(701.0, 702.0), s1(s0(Vector(Vector(703.0), Vector(704.0)), 705.0), Vector(s0(Vector(Vector(706.0), Vector(707.0)), 708.0), s0(Vector(Vector(709.0), Vector(710.0)), 711.0), s0(Vector(Vector(712.0), Vector(713.0)), 714.0))), Vector(s1(s0(Vector(Vector(715.0), Vector(716.0)), 717.0), Vector(s0(Vector(Vector(718.0), Vector(719.0)), 720.0), s0(Vector(Vector(721.0), Vector(722.0)), 723.0), s0(Vector(Vector(724.0), Vector(725.0)), 726.0))), s1(s0(Vector(Vector(727.0), Vector(728.0)), 729.0), Vector(s0(Vector(Vector(730.0), Vector(731.0)), 732.0), s0(Vector(Vector(733.0), Vector(734.0)), 735.0), s0(Vector(Vector(736.0), Vector(737.0)), 738.0)))))))), Vector(Vector(s6(s3(Vector(s2(Vector(739.0, 740.0), s1(s0(Vector(Vector(741.0), Vector(742.0)), 743.0), Vector(s0(Vector(Vector(744.0), Vector(745.0)), 746.0), s0(Vector(Vector(747.0), Vector(748.0)), 749.0), s0(Vector(Vector(750.0), Vector(751.0)), 752.0))), Vector(s1(s0(Vector(Vector(753.0), Vector(754.0)), 755.0), Vector(s0(Vector(Vector(756.0), Vector(757.0)), 758.0), s0(Vector(Vector(759.0), Vector(760.0)), 761.0), s0(Vector(Vector(762.0), Vector(763.0)), 764.0))), s1(s0(Vector(Vector(765.0), Vector(766.0)), 767.0), Vector(s0(Vector(Vector(768.0), Vector(769.0)), 770.0), s0(Vector(Vector(771.0), Vector(772.0)), 773.0), s0(Vector(Vector(774.0), Vector(775.0)), 776.0))))), s2(Vector(777.0, 778.0), s1(s0(Vector(Vector(779.0), Vector(780.0)), 781.0), Vector(s0(Vector(Vector(782.0), Vector(783.0)), 784.0), s0(Vector(Vector(785.0), Vector(786.0)), 787.0), s0(Vector(Vector(788.0), Vector(789.0)), 790.0))), Vector(s1(s0(Vector(Vector(791.0), Vector(792.0)), 793.0), Vector(s0(Vector(Vector(794.0), Vector(795.0)), 796.0), s0(Vector(Vector(797.0), Vector(798.0)), 799.0), s0(Vector(Vector(800.0), Vector(801.0)), 802.0))), s1(s0(Vector(Vector(803.0), Vector(804.0)), 805.0), Vector(s0(Vector(Vector(806.0), Vector(807.0)), 808.0), s0(Vector(Vector(809.0), Vector(810.0)), 811.0), s0(Vector(Vector(812.0), Vector(813.0)), 814.0))))), s2(Vector(815.0, 816.0), s1(s0(Vector(Vector(817.0), Vector(818.0)), 819.0), Vector(s0(Vector(Vector(820.0), Vector(821.0)), 822.0), s0(Vector(Vector(823.0), Vector(824.0)), 825.0), s0(Vector(Vector(826.0), Vector(827.0)), 828.0))), Vector(s1(s0(Vector(Vector(829.0), Vector(830.0)), 831.0), Vector(s0(Vector(Vector(832.0), Vector(833.0)), 834.0), s0(Vector(Vector(835.0), Vector(836.0)), 837.0), s0(Vector(Vector(838.0), Vector(839.0)), 840.0))), s1(s0(Vector(Vector(841.0), Vector(842.0)), 843.0), Vector(s0(Vector(Vector(844.0), Vector(845.0)), 846.0), s0(Vector(Vector(847.0), Vector(848.0)), 849.0), s0(Vector(Vector(850.0), Vector(851.0)), 852.0)))))), Vector(Vector(s2(Vector(853.0, 854.0), s1(s0(Vector(Vector(855.0), Vector(856.0)), 857.0), Vector(s0(Vector(Vector(858.0), Vector(859.0)), 860.0), s0(Vector(Vector(861.0), Vector(862.0)), 863.0), s0(Vector(Vector(864.0), Vector(865.0)), 866.0))), Vector(s1(s0(Vector(Vector(867.0), Vector(868.0)), 869.0), Vector(s0(Vector(Vector(870.0), Vector(871.0)), 872.0), s0(Vector(Vector(873.0), Vector(874.0)), 875.0), s0(Vector(Vector(876.0), Vector(877.0)), 878.0))), s1(s0(Vector(Vector(879.0), Vector(880.0)), 881.0), Vector(s0(Vector(Vector(882.0), Vector(883.0)), 884.0), s0(Vector(Vector(885.0), Vector(886.0)), 887.0), s0(Vector(Vector(888.0), Vector(889.0)), 890.0)))))))))), Vector(s6(s3(Vector(s2(Vector(891.0, 892.0), s1(s0(Vector(Vector(893.0), Vector(894.0)), 895.0), Vector(s0(Vector(Vector(896.0), Vector(897.0)), 898.0), s0(Vector(Vector(899.0), Vector(900.0)), 901.0), s0(Vector(Vector(902.0), Vector(903.0)), 904.0))), Vector(s1(s0(Vector(Vector(905.0), Vector(906.0)), 907.0), Vector(s0(Vector(Vector(908.0), Vector(909.0)), 910.0), s0(Vector(Vector(911.0), Vector(912.0)), 913.0), s0(Vector(Vector(914.0), Vector(915.0)), 916.0))), s1(s0(Vector(Vector(917.0), Vector(918.0)), 919.0), Vector(s0(Vector(Vector(920.0), Vector(921.0)), 922.0), s0(Vector(Vector(923.0), Vector(924.0)), 925.0), s0(Vector(Vector(926.0), Vector(927.0)), 928.0))))), s2(Vector(929.0, 930.0), s1(s0(Vector(Vector(931.0), Vector(932.0)), 933.0), Vector(s0(Vector(Vector(934.0), Vector(935.0)), 936.0), s0(Vector(Vector(937.0), Vector(938.0)), 939.0), s0(Vector(Vector(940.0), Vector(941.0)), 942.0))), Vector(s1(s0(Vector(Vector(943.0), Vector(944.0)), 945.0), Vector(s0(Vector(Vector(946.0), Vector(947.0)), 948.0), s0(Vector(Vector(949.0), Vector(950.0)), 951.0), s0(Vector(Vector(952.0), Vector(953.0)), 954.0))), s1(s0(Vector(Vector(955.0), Vector(956.0)), 957.0), Vector(s0(Vector(Vector(958.0), Vector(959.0)), 960.0), s0(Vector(Vector(961.0), Vector(962.0)), 963.0), s0(Vector(Vector(964.0), Vector(965.0)), 966.0))))), s2(Vector(967.0, 968.0), s1(s0(Vector(Vector(969.0), Vector(970.0)), 971.0), Vector(s0(Vector(Vector(972.0), Vector(973.0)), 974.0), s0(Vector(Vector(975.0), Vector(976.0)), 977.0), s0(Vector(Vector(978.0), Vector(979.0)), 980.0))), Vector(s1(s0(Vector(Vector(981.0), Vector(982.0)), 983.0), Vector(s0(Vector(Vector(984.0), Vector(985.0)), 986.0), s0(Vector(Vector(987.0), Vector(988.0)), 989.0), s0(Vector(Vector(990.0), Vector(991.0)), 992.0))), s1(s0(Vector(Vector(993.0), Vector(994.0)), 995.0), Vector(s0(Vector(Vector(996.0), Vector(997.0)), 998.0), s0(Vector(Vector(999.0), Vector(1000.0)), 1001.0), s0(Vector(Vector(1002.0), Vector(1003.0)), 1004.0)))))), Vector(Vector(s2(Vector(1005.0, 1006.0), s1(s0(Vector(Vector(1007.0), Vector(1008.0)), 1009.0), Vector(s0(Vector(Vector(1010.0), Vector(1011.0)), 1012.0), s0(Vector(Vector(1013.0), Vector(1014.0)), 1015.0), s0(Vector(Vector(1016.0), Vector(1017.0)), 1018.0))), Vector(s1(s0(Vector(Vector(1019.0), Vector(1020.0)), 1021.0), Vector(s0(Vector(Vector(1022.0), Vector(1023.0)), 1024.0), s0(Vector(Vector(1025.0), Vector(1026.0)), 1027.0), s0(Vector(Vector(1028.0), Vector(1029.0)), 1030.0))), s1(s0(Vector(Vector(1031.0), Vector(1032.0)), 1033.0), Vector(s0(Vector(Vector(1034.0), Vector(1035.0)), 1036.0), s0(Vector(Vector(1037.0), Vector(1038.0)), 1039.0), s0(Vector(Vector(1040.0), Vector(1041.0)), 1042.0)))))))))), Vector(s6(s3(Vector(s2(Vector(1043.0, 1044.0), s1(s0(Vector(Vector(1045.0), Vector(1046.0)), 1047.0), Vector(s0(Vector(Vector(1048.0), Vector(1049.0)), 1050.0), s0(Vector(Vector(1051.0), Vector(1052.0)), 1053.0), s0(Vector(Vector(1054.0), Vector(1055.0)), 1056.0))), Vector(s1(s0(Vector(Vector(1057.0), Vector(1058.0)), 1059.0), Vector(s0(Vector(Vector(1060.0), Vector(1061.0)), 1062.0), s0(Vector(Vector(1063.0), Vector(1064.0)), 1065.0), s0(Vector(Vector(1066.0), Vector(1067.0)), 1068.0))), s1(s0(Vector(Vector(1069.0), Vector(1070.0)), 1071.0), Vector(s0(Vector(Vector(1072.0), Vector(1073.0)), 1074.0), s0(Vector(Vector(1075.0), Vector(1076.0)), 1077.0), s0(Vector(Vector(1078.0), Vector(1079.0)), 1080.0))))), s2(Vector(1081.0, 1082.0), s1(s0(Vector(Vector(1083.0), Vector(1084.0)), 1085.0), Vector(s0(Vector(Vector(1086.0), Vector(1087.0)), 1088.0), s0(Vector(Vector(1089.0), Vector(1090.0)), 1091.0), s0(Vector(Vector(1092.0), Vector(1093.0)), 1094.0))), Vector(s1(s0(Vector(Vector(1095.0), Vector(1096.0)), 1097.0), Vector(s0(Vector(Vector(1098.0), Vector(1099.0)), 1100.0), s0(Vector(Vector(1101.0), Vector(1102.0)), 1103.0), s0(Vector(Vector(1104.0), Vector(1105.0)), 1106.0))), s1(s0(Vector(Vector(1107.0), Vector(1108.0)), 1109.0), Vector(s0(Vector(Vector(1110.0), Vector(1111.0)), 1112.0), s0(Vector(Vector(1113.0), Vector(1114.0)), 1115.0), s0(Vector(Vector(1116.0), Vector(1117.0)), 1118.0))))), s2(Vector(1119.0, 1120.0), s1(s0(Vector(Vector(1121.0), Vector(1122.0)), 1123.0), Vector(s0(Vector(Vector(1124.0), Vector(1125.0)), 1126.0), s0(Vector(Vector(1127.0), Vector(1128.0)), 1129.0), s0(Vector(Vector(1130.0), Vector(1131.0)), 1132.0))), Vector(s1(s0(Vector(Vector(1133.0), Vector(1134.0)), 1135.0), Vector(s0(Vector(Vector(1136.0), Vector(1137.0)), 1138.0), s0(Vector(Vector(1139.0), Vector(1140.0)), 1141.0), s0(Vector(Vector(1142.0), Vector(1143.0)), 1144.0))), s1(s0(Vector(Vector(1145.0), Vector(1146.0)), 1147.0), Vector(s0(Vector(Vector(1148.0), Vector(1149.0)), 1150.0), s0(Vector(Vector(1151.0), Vector(1152.0)), 1153.0), s0(Vector(Vector(1154.0), Vector(1155.0)), 1156.0)))))), Vector(Vector(s2(Vector(1157.0, 1158.0), s1(s0(Vector(Vector(1159.0), Vector(1160.0)), 1161.0), Vector(s0(Vector(Vector(1162.0), Vector(1163.0)), 1164.0), s0(Vector(Vector(1165.0), Vector(1166.0)), 1167.0), s0(Vector(Vector(1168.0), Vector(1169.0)), 1170.0))), Vector(s1(s0(Vector(Vector(1171.0), Vector(1172.0)), 1173.0), Vector(s0(Vector(Vector(1174.0), Vector(1175.0)), 1176.0), s0(Vector(Vector(1177.0), Vector(1178.0)), 1179.0), s0(Vector(Vector(1180.0), Vector(1181.0)), 1182.0))), s1(s0(Vector(Vector(1183.0), Vector(1184.0)), 1185.0), Vector(s0(Vector(Vector(1186.0), Vector(1187.0)), 1188.0), s0(Vector(Vector(1189.0), Vector(1190.0)), 1191.0), s0(Vector(Vector(1192.0), Vector(1193.0)), 1194.0))))))))))))
    val v7: s2 = s2(Vector(1195.0, 1196.0), s1(s0(Vector(Vector(1197.0), Vector(1198.0)), 1199.0), Vector(s0(Vector(Vector(1200.0), Vector(1201.0)), 1202.0), s0(Vector(Vector(1203.0), Vector(1204.0)), 1205.0), s0(Vector(Vector(1206.0), Vector(1207.0)), 1208.0))), Vector(s1(s0(Vector(Vector(1209.0), Vector(1210.0)), 1211.0), Vector(s0(Vector(Vector(1212.0), Vector(1213.0)), 1214.0), s0(Vector(Vector(1215.0), Vector(1216.0)), 1217.0), s0(Vector(Vector(1218.0), Vector(1219.0)), 1220.0))), s1(s0(Vector(Vector(1221.0), Vector(1222.0)), 1223.0), Vector(s0(Vector(Vector(1224.0), Vector(1225.0)), 1226.0), s0(Vector(Vector(1227.0), Vector(1228.0)), 1229.0), s0(Vector(Vector(1230.0), Vector(1231.0)), 1232.0)))))
    val v8: Double = 1233.0
    val start = nanoTime()
    var result: Double = 1233.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4, v5, v6, v7, v8)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}