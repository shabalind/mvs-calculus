import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Double],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  case class s2 (
    p0: Vector[Vector[s1]],
    p1: Vector[s1],
    p2: s1,
    p3: s0,
    p4: s0
  )
  case class s3 (
    p0: s2,
    p1: Vector[Vector[s2]]
  )
  case class s9 (
    p0: s0,
    p1: Vector[s3]
  )
  def f12(v0: Double): Double = {
    var v1: Double = v0
    var v3: Double = v1
    var v4: Double = v1
    var v5: Double = v1
    var v7: Double = v1
    var v6: Double = v1
    var v11: Double = v4
    var v9: Double = v11
    var v21: Double = v5
    val v15: Vector[Double] = Vector(v1, v6, v7)
    var v16: Vector[Double] = v15
    var v18: Vector[Double] = v15
    var v12: Vector[Double] = v18
    var v30: Double = v1
    var v27: Vector[Double] = v16
    val v23: Vector[Vector[Double]] = Vector(v15, v12, v27, v27, v12, v16, v27)
    val v13: Double = v18(2)
    v12 = v12.updated(2, v13)
    var v51: Vector[Vector[Double]] = v23
    v18 = v18.updated(0, v1)
    val v31: Double = v18(0)
    v51 = v23
    val v24: Double = v16(0)
    val v26: Double = v27(0)
    val v32: Vector[Double] = v23(4)
    var v25: Vector[Vector[Double]] = v23
    var v49: Vector[Vector[Double]] = v51
    val v42: Vector[Double] = v51(1)
    v6 = v31
    val v28: Double = v32(2)
    v18 = v18.updated(2, v1)
    val v36: Vector[Double] = v49(0)
    var v59: Double = v24
    val v37: Vector[Double] = Vector(v11, v4, v26, v30, v7, v59, v6)
    var v57: Double = v28
    v18 = v18.updated(2, v21)
    var v33: Vector[Vector[Double]] = v25
    v18 = v18.updated(0, v28)
    v25 = v25.updated(3, v12)
    val v69: Vector[Double] = v33(4)
    v25 = v25.updated(4, v18)
    v21 = v6
    val v99: Double = v3 + v28
    val v46: Vector[Vector[Double]] = Vector(v37, v37, v37, v37)
    val v103: Vector[Double] = v46(1)
    v33 = v33.updated(0, v42)
    val v97: Double = v103(4)
    var v70: Vector[Double] = v103
    v25 = v25.updated(2, v36)
    v18 = v18.updated(1, v99)
    v27 = v27.updated(1, v57)
    v70 = v70.updated(6, v97)
    val v191: Double = v69(1)
    v12 = v12.updated(1, v99)
    v5 = v9
    v25 = v25.updated(3, v32)
    val v93: Double = v70(0)
    v16 = v16.updated(2, v93)
    v191
  }
  @noinline
  def f0(v0: s9, v1: Double): Double = {
    val v8: Double = f12(v1)
    val v3: Double = f12(v8)
    var v10: Double = v3
    val v7: Double = f12(v10)
    val v9: Double = f12(v8)
    val v20: Vector[Double] = Vector(v8, v7, v9, v9, v8)
    val v69: Double = v20(3)
    val v56: Double = f12(v7)
    val v97: Double = v69 * v56
    val v144: Double = f12(v97)
    v144
  }
  def benchmark(): Unit = {
    val v0: s9 = s9(s0(Vector(0.0, 1.0, 2.0), Vector(Vector(3.0), Vector(4.0), Vector(5.0))), Vector(s3(s2(Vector(Vector(s1(Vector(s0(Vector(6.0, 7.0, 8.0), Vector(Vector(9.0), Vector(10.0), Vector(11.0))), s0(Vector(12.0, 13.0, 14.0), Vector(Vector(15.0), Vector(16.0), Vector(17.0))), s0(Vector(18.0, 19.0, 20.0), Vector(Vector(21.0), Vector(22.0), Vector(23.0)))), Vector(s0(Vector(24.0, 25.0, 26.0), Vector(Vector(27.0), Vector(28.0), Vector(29.0))), s0(Vector(30.0, 31.0, 32.0), Vector(Vector(33.0), Vector(34.0), Vector(35.0))), s0(Vector(36.0, 37.0, 38.0), Vector(Vector(39.0), Vector(40.0), Vector(41.0)))))), Vector(s1(Vector(s0(Vector(42.0, 43.0, 44.0), Vector(Vector(45.0), Vector(46.0), Vector(47.0))), s0(Vector(48.0, 49.0, 50.0), Vector(Vector(51.0), Vector(52.0), Vector(53.0))), s0(Vector(54.0, 55.0, 56.0), Vector(Vector(57.0), Vector(58.0), Vector(59.0)))), Vector(s0(Vector(60.0, 61.0, 62.0), Vector(Vector(63.0), Vector(64.0), Vector(65.0))), s0(Vector(66.0, 67.0, 68.0), Vector(Vector(69.0), Vector(70.0), Vector(71.0))), s0(Vector(72.0, 73.0, 74.0), Vector(Vector(75.0), Vector(76.0), Vector(77.0)))))), Vector(s1(Vector(s0(Vector(78.0, 79.0, 80.0), Vector(Vector(81.0), Vector(82.0), Vector(83.0))), s0(Vector(84.0, 85.0, 86.0), Vector(Vector(87.0), Vector(88.0), Vector(89.0))), s0(Vector(90.0, 91.0, 92.0), Vector(Vector(93.0), Vector(94.0), Vector(95.0)))), Vector(s0(Vector(96.0, 97.0, 98.0), Vector(Vector(99.0), Vector(100.0), Vector(101.0))), s0(Vector(102.0, 103.0, 104.0), Vector(Vector(105.0), Vector(106.0), Vector(107.0))), s0(Vector(108.0, 109.0, 110.0), Vector(Vector(111.0), Vector(112.0), Vector(113.0))))))), Vector(s1(Vector(s0(Vector(114.0, 115.0, 116.0), Vector(Vector(117.0), Vector(118.0), Vector(119.0))), s0(Vector(120.0, 121.0, 122.0), Vector(Vector(123.0), Vector(124.0), Vector(125.0))), s0(Vector(126.0, 127.0, 128.0), Vector(Vector(129.0), Vector(130.0), Vector(131.0)))), Vector(s0(Vector(132.0, 133.0, 134.0), Vector(Vector(135.0), Vector(136.0), Vector(137.0))), s0(Vector(138.0, 139.0, 140.0), Vector(Vector(141.0), Vector(142.0), Vector(143.0))), s0(Vector(144.0, 145.0, 146.0), Vector(Vector(147.0), Vector(148.0), Vector(149.0))))), s1(Vector(s0(Vector(150.0, 151.0, 152.0), Vector(Vector(153.0), Vector(154.0), Vector(155.0))), s0(Vector(156.0, 157.0, 158.0), Vector(Vector(159.0), Vector(160.0), Vector(161.0))), s0(Vector(162.0, 163.0, 164.0), Vector(Vector(165.0), Vector(166.0), Vector(167.0)))), Vector(s0(Vector(168.0, 169.0, 170.0), Vector(Vector(171.0), Vector(172.0), Vector(173.0))), s0(Vector(174.0, 175.0, 176.0), Vector(Vector(177.0), Vector(178.0), Vector(179.0))), s0(Vector(180.0, 181.0, 182.0), Vector(Vector(183.0), Vector(184.0), Vector(185.0)))))), s1(Vector(s0(Vector(186.0, 187.0, 188.0), Vector(Vector(189.0), Vector(190.0), Vector(191.0))), s0(Vector(192.0, 193.0, 194.0), Vector(Vector(195.0), Vector(196.0), Vector(197.0))), s0(Vector(198.0, 199.0, 200.0), Vector(Vector(201.0), Vector(202.0), Vector(203.0)))), Vector(s0(Vector(204.0, 205.0, 206.0), Vector(Vector(207.0), Vector(208.0), Vector(209.0))), s0(Vector(210.0, 211.0, 212.0), Vector(Vector(213.0), Vector(214.0), Vector(215.0))), s0(Vector(216.0, 217.0, 218.0), Vector(Vector(219.0), Vector(220.0), Vector(221.0))))), s0(Vector(222.0, 223.0, 224.0), Vector(Vector(225.0), Vector(226.0), Vector(227.0))), s0(Vector(228.0, 229.0, 230.0), Vector(Vector(231.0), Vector(232.0), Vector(233.0)))), Vector(Vector(s2(Vector(Vector(s1(Vector(s0(Vector(234.0, 235.0, 236.0), Vector(Vector(237.0), Vector(238.0), Vector(239.0))), s0(Vector(240.0, 241.0, 242.0), Vector(Vector(243.0), Vector(244.0), Vector(245.0))), s0(Vector(246.0, 247.0, 248.0), Vector(Vector(249.0), Vector(250.0), Vector(251.0)))), Vector(s0(Vector(252.0, 253.0, 254.0), Vector(Vector(255.0), Vector(256.0), Vector(257.0))), s0(Vector(258.0, 259.0, 260.0), Vector(Vector(261.0), Vector(262.0), Vector(263.0))), s0(Vector(264.0, 265.0, 266.0), Vector(Vector(267.0), Vector(268.0), Vector(269.0)))))), Vector(s1(Vector(s0(Vector(270.0, 271.0, 272.0), Vector(Vector(273.0), Vector(274.0), Vector(275.0))), s0(Vector(276.0, 277.0, 278.0), Vector(Vector(279.0), Vector(280.0), Vector(281.0))), s0(Vector(282.0, 283.0, 284.0), Vector(Vector(285.0), Vector(286.0), Vector(287.0)))), Vector(s0(Vector(288.0, 289.0, 290.0), Vector(Vector(291.0), Vector(292.0), Vector(293.0))), s0(Vector(294.0, 295.0, 296.0), Vector(Vector(297.0), Vector(298.0), Vector(299.0))), s0(Vector(300.0, 301.0, 302.0), Vector(Vector(303.0), Vector(304.0), Vector(305.0)))))), Vector(s1(Vector(s0(Vector(306.0, 307.0, 308.0), Vector(Vector(309.0), Vector(310.0), Vector(311.0))), s0(Vector(312.0, 313.0, 314.0), Vector(Vector(315.0), Vector(316.0), Vector(317.0))), s0(Vector(318.0, 319.0, 320.0), Vector(Vector(321.0), Vector(322.0), Vector(323.0)))), Vector(s0(Vector(324.0, 325.0, 326.0), Vector(Vector(327.0), Vector(328.0), Vector(329.0))), s0(Vector(330.0, 331.0, 332.0), Vector(Vector(333.0), Vector(334.0), Vector(335.0))), s0(Vector(336.0, 337.0, 338.0), Vector(Vector(339.0), Vector(340.0), Vector(341.0))))))), Vector(s1(Vector(s0(Vector(342.0, 343.0, 344.0), Vector(Vector(345.0), Vector(346.0), Vector(347.0))), s0(Vector(348.0, 349.0, 350.0), Vector(Vector(351.0), Vector(352.0), Vector(353.0))), s0(Vector(354.0, 355.0, 356.0), Vector(Vector(357.0), Vector(358.0), Vector(359.0)))), Vector(s0(Vector(360.0, 361.0, 362.0), Vector(Vector(363.0), Vector(364.0), Vector(365.0))), s0(Vector(366.0, 367.0, 368.0), Vector(Vector(369.0), Vector(370.0), Vector(371.0))), s0(Vector(372.0, 373.0, 374.0), Vector(Vector(375.0), Vector(376.0), Vector(377.0))))), s1(Vector(s0(Vector(378.0, 379.0, 380.0), Vector(Vector(381.0), Vector(382.0), Vector(383.0))), s0(Vector(384.0, 385.0, 386.0), Vector(Vector(387.0), Vector(388.0), Vector(389.0))), s0(Vector(390.0, 391.0, 392.0), Vector(Vector(393.0), Vector(394.0), Vector(395.0)))), Vector(s0(Vector(396.0, 397.0, 398.0), Vector(Vector(399.0), Vector(400.0), Vector(401.0))), s0(Vector(402.0, 403.0, 404.0), Vector(Vector(405.0), Vector(406.0), Vector(407.0))), s0(Vector(408.0, 409.0, 410.0), Vector(Vector(411.0), Vector(412.0), Vector(413.0)))))), s1(Vector(s0(Vector(414.0, 415.0, 416.0), Vector(Vector(417.0), Vector(418.0), Vector(419.0))), s0(Vector(420.0, 421.0, 422.0), Vector(Vector(423.0), Vector(424.0), Vector(425.0))), s0(Vector(426.0, 427.0, 428.0), Vector(Vector(429.0), Vector(430.0), Vector(431.0)))), Vector(s0(Vector(432.0, 433.0, 434.0), Vector(Vector(435.0), Vector(436.0), Vector(437.0))), s0(Vector(438.0, 439.0, 440.0), Vector(Vector(441.0), Vector(442.0), Vector(443.0))), s0(Vector(444.0, 445.0, 446.0), Vector(Vector(447.0), Vector(448.0), Vector(449.0))))), s0(Vector(450.0, 451.0, 452.0), Vector(Vector(453.0), Vector(454.0), Vector(455.0))), s0(Vector(456.0, 457.0, 458.0), Vector(Vector(459.0), Vector(460.0), Vector(461.0))))))), s3(s2(Vector(Vector(s1(Vector(s0(Vector(462.0, 463.0, 464.0), Vector(Vector(465.0), Vector(466.0), Vector(467.0))), s0(Vector(468.0, 469.0, 470.0), Vector(Vector(471.0), Vector(472.0), Vector(473.0))), s0(Vector(474.0, 475.0, 476.0), Vector(Vector(477.0), Vector(478.0), Vector(479.0)))), Vector(s0(Vector(480.0, 481.0, 482.0), Vector(Vector(483.0), Vector(484.0), Vector(485.0))), s0(Vector(486.0, 487.0, 488.0), Vector(Vector(489.0), Vector(490.0), Vector(491.0))), s0(Vector(492.0, 493.0, 494.0), Vector(Vector(495.0), Vector(496.0), Vector(497.0)))))), Vector(s1(Vector(s0(Vector(498.0, 499.0, 500.0), Vector(Vector(501.0), Vector(502.0), Vector(503.0))), s0(Vector(504.0, 505.0, 506.0), Vector(Vector(507.0), Vector(508.0), Vector(509.0))), s0(Vector(510.0, 511.0, 512.0), Vector(Vector(513.0), Vector(514.0), Vector(515.0)))), Vector(s0(Vector(516.0, 517.0, 518.0), Vector(Vector(519.0), Vector(520.0), Vector(521.0))), s0(Vector(522.0, 523.0, 524.0), Vector(Vector(525.0), Vector(526.0), Vector(527.0))), s0(Vector(528.0, 529.0, 530.0), Vector(Vector(531.0), Vector(532.0), Vector(533.0)))))), Vector(s1(Vector(s0(Vector(534.0, 535.0, 536.0), Vector(Vector(537.0), Vector(538.0), Vector(539.0))), s0(Vector(540.0, 541.0, 542.0), Vector(Vector(543.0), Vector(544.0), Vector(545.0))), s0(Vector(546.0, 547.0, 548.0), Vector(Vector(549.0), Vector(550.0), Vector(551.0)))), Vector(s0(Vector(552.0, 553.0, 554.0), Vector(Vector(555.0), Vector(556.0), Vector(557.0))), s0(Vector(558.0, 559.0, 560.0), Vector(Vector(561.0), Vector(562.0), Vector(563.0))), s0(Vector(564.0, 565.0, 566.0), Vector(Vector(567.0), Vector(568.0), Vector(569.0))))))), Vector(s1(Vector(s0(Vector(570.0, 571.0, 572.0), Vector(Vector(573.0), Vector(574.0), Vector(575.0))), s0(Vector(576.0, 577.0, 578.0), Vector(Vector(579.0), Vector(580.0), Vector(581.0))), s0(Vector(582.0, 583.0, 584.0), Vector(Vector(585.0), Vector(586.0), Vector(587.0)))), Vector(s0(Vector(588.0, 589.0, 590.0), Vector(Vector(591.0), Vector(592.0), Vector(593.0))), s0(Vector(594.0, 595.0, 596.0), Vector(Vector(597.0), Vector(598.0), Vector(599.0))), s0(Vector(600.0, 601.0, 602.0), Vector(Vector(603.0), Vector(604.0), Vector(605.0))))), s1(Vector(s0(Vector(606.0, 607.0, 608.0), Vector(Vector(609.0), Vector(610.0), Vector(611.0))), s0(Vector(612.0, 613.0, 614.0), Vector(Vector(615.0), Vector(616.0), Vector(617.0))), s0(Vector(618.0, 619.0, 620.0), Vector(Vector(621.0), Vector(622.0), Vector(623.0)))), Vector(s0(Vector(624.0, 625.0, 626.0), Vector(Vector(627.0), Vector(628.0), Vector(629.0))), s0(Vector(630.0, 631.0, 632.0), Vector(Vector(633.0), Vector(634.0), Vector(635.0))), s0(Vector(636.0, 637.0, 638.0), Vector(Vector(639.0), Vector(640.0), Vector(641.0)))))), s1(Vector(s0(Vector(642.0, 643.0, 644.0), Vector(Vector(645.0), Vector(646.0), Vector(647.0))), s0(Vector(648.0, 649.0, 650.0), Vector(Vector(651.0), Vector(652.0), Vector(653.0))), s0(Vector(654.0, 655.0, 656.0), Vector(Vector(657.0), Vector(658.0), Vector(659.0)))), Vector(s0(Vector(660.0, 661.0, 662.0), Vector(Vector(663.0), Vector(664.0), Vector(665.0))), s0(Vector(666.0, 667.0, 668.0), Vector(Vector(669.0), Vector(670.0), Vector(671.0))), s0(Vector(672.0, 673.0, 674.0), Vector(Vector(675.0), Vector(676.0), Vector(677.0))))), s0(Vector(678.0, 679.0, 680.0), Vector(Vector(681.0), Vector(682.0), Vector(683.0))), s0(Vector(684.0, 685.0, 686.0), Vector(Vector(687.0), Vector(688.0), Vector(689.0)))), Vector(Vector(s2(Vector(Vector(s1(Vector(s0(Vector(690.0, 691.0, 692.0), Vector(Vector(693.0), Vector(694.0), Vector(695.0))), s0(Vector(696.0, 697.0, 698.0), Vector(Vector(699.0), Vector(700.0), Vector(701.0))), s0(Vector(702.0, 703.0, 704.0), Vector(Vector(705.0), Vector(706.0), Vector(707.0)))), Vector(s0(Vector(708.0, 709.0, 710.0), Vector(Vector(711.0), Vector(712.0), Vector(713.0))), s0(Vector(714.0, 715.0, 716.0), Vector(Vector(717.0), Vector(718.0), Vector(719.0))), s0(Vector(720.0, 721.0, 722.0), Vector(Vector(723.0), Vector(724.0), Vector(725.0)))))), Vector(s1(Vector(s0(Vector(726.0, 727.0, 728.0), Vector(Vector(729.0), Vector(730.0), Vector(731.0))), s0(Vector(732.0, 733.0, 734.0), Vector(Vector(735.0), Vector(736.0), Vector(737.0))), s0(Vector(738.0, 739.0, 740.0), Vector(Vector(741.0), Vector(742.0), Vector(743.0)))), Vector(s0(Vector(744.0, 745.0, 746.0), Vector(Vector(747.0), Vector(748.0), Vector(749.0))), s0(Vector(750.0, 751.0, 752.0), Vector(Vector(753.0), Vector(754.0), Vector(755.0))), s0(Vector(756.0, 757.0, 758.0), Vector(Vector(759.0), Vector(760.0), Vector(761.0)))))), Vector(s1(Vector(s0(Vector(762.0, 763.0, 764.0), Vector(Vector(765.0), Vector(766.0), Vector(767.0))), s0(Vector(768.0, 769.0, 770.0), Vector(Vector(771.0), Vector(772.0), Vector(773.0))), s0(Vector(774.0, 775.0, 776.0), Vector(Vector(777.0), Vector(778.0), Vector(779.0)))), Vector(s0(Vector(780.0, 781.0, 782.0), Vector(Vector(783.0), Vector(784.0), Vector(785.0))), s0(Vector(786.0, 787.0, 788.0), Vector(Vector(789.0), Vector(790.0), Vector(791.0))), s0(Vector(792.0, 793.0, 794.0), Vector(Vector(795.0), Vector(796.0), Vector(797.0))))))), Vector(s1(Vector(s0(Vector(798.0, 799.0, 800.0), Vector(Vector(801.0), Vector(802.0), Vector(803.0))), s0(Vector(804.0, 805.0, 806.0), Vector(Vector(807.0), Vector(808.0), Vector(809.0))), s0(Vector(810.0, 811.0, 812.0), Vector(Vector(813.0), Vector(814.0), Vector(815.0)))), Vector(s0(Vector(816.0, 817.0, 818.0), Vector(Vector(819.0), Vector(820.0), Vector(821.0))), s0(Vector(822.0, 823.0, 824.0), Vector(Vector(825.0), Vector(826.0), Vector(827.0))), s0(Vector(828.0, 829.0, 830.0), Vector(Vector(831.0), Vector(832.0), Vector(833.0))))), s1(Vector(s0(Vector(834.0, 835.0, 836.0), Vector(Vector(837.0), Vector(838.0), Vector(839.0))), s0(Vector(840.0, 841.0, 842.0), Vector(Vector(843.0), Vector(844.0), Vector(845.0))), s0(Vector(846.0, 847.0, 848.0), Vector(Vector(849.0), Vector(850.0), Vector(851.0)))), Vector(s0(Vector(852.0, 853.0, 854.0), Vector(Vector(855.0), Vector(856.0), Vector(857.0))), s0(Vector(858.0, 859.0, 860.0), Vector(Vector(861.0), Vector(862.0), Vector(863.0))), s0(Vector(864.0, 865.0, 866.0), Vector(Vector(867.0), Vector(868.0), Vector(869.0)))))), s1(Vector(s0(Vector(870.0, 871.0, 872.0), Vector(Vector(873.0), Vector(874.0), Vector(875.0))), s0(Vector(876.0, 877.0, 878.0), Vector(Vector(879.0), Vector(880.0), Vector(881.0))), s0(Vector(882.0, 883.0, 884.0), Vector(Vector(885.0), Vector(886.0), Vector(887.0)))), Vector(s0(Vector(888.0, 889.0, 890.0), Vector(Vector(891.0), Vector(892.0), Vector(893.0))), s0(Vector(894.0, 895.0, 896.0), Vector(Vector(897.0), Vector(898.0), Vector(899.0))), s0(Vector(900.0, 901.0, 902.0), Vector(Vector(903.0), Vector(904.0), Vector(905.0))))), s0(Vector(906.0, 907.0, 908.0), Vector(Vector(909.0), Vector(910.0), Vector(911.0))), s0(Vector(912.0, 913.0, 914.0), Vector(Vector(915.0), Vector(916.0), Vector(917.0)))))))))
    val v1: Double = 918.0
    val start = nanoTime()
    var result: Double = 918.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}