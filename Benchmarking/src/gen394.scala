import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Double
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  case class s2 (
    p0: Vector[s1],
    p1: s1
  )
  case class s3 (
    p0: s0,
    p1: s1
  )
  case class s4 (
    p0: Vector[s2],
    p1: s3
  )
  case class s5 (
    p0: Vector[Vector[s0]],
    p1: Vector[Vector[s1]]
  )
  case class s6 (
    p0: Vector[s2]
  )
  case class s13 (
    p0: Vector[s6],
    p1: Vector[s4]
  )
  def f2(v0: s0): s0 = {
    val v1: Double = v0.p1
    var v7: s0 = v0
    val v6: Double = v1 * v1
    var v5: s0 = v0
    val v8: Double = v0.p1
    var v3: Double = v1
    val v10: Vector[Vector[Double]] = v7.p0
    val v11: Vector[Double] = Vector(v6, v1, v3, v6, v3)
    var v2: Vector[Vector[Double]] = v10
    val v4: Double = v7.p1
    var v20: Vector[Double] = v11
    val v9: Double = v7.p1
    val v12: Vector[Vector[Double]] = v7.p0
    val v15: Vector[Double] = v2(1)
    var v17: Vector[Double] = v20
    val v18: Double = v15(0)
    val v36: Vector[Vector[Double]] = v5.p0
    var v33: Vector[Double] = v15
    v17 = v17.updated(1, v6)
    val v23: Vector[Vector[Double]] = v5.p0
    v5 = v5.copy(p1 = v9)
    val v16: Double = v5.p1
    v5 = v0
    val v13: Vector[Double] = v23(1)
    val v46: Vector[Vector[Double]] = v5.p0
    v5 = v5.copy(p0 = v23)
    v7 = v7.copy(p0 = v36)
    val v32: Double = v7.p1
    v20 = v20.updated(0, v16)
    v7 = v0
    val v21: Double = v15(0)
    val v24: Vector[Vector[Double]] = v5.p0
    v7 = v7.copy(p0 = v10)
    v5 = v5.copy(p0 = v24)
    val v49: Vector[Vector[Double]] = v7.p0
    var v27: Vector[Vector[Double]] = v12
    var v22: Vector[Vector[Double]] = v27
    v7 = v7.copy(p0 = v36)
    var v29: Vector[Vector[Double]] = v22
    v5 = v5.copy(p1 = v18)
    v2 = v2.updated(0, v13)
    v7 = v7.copy(p1 = v32)
    v5 = v5.copy(p1 = v21)
    val v69: Vector[Vector[Double]] = Vector(v20, v11, v17, v20, v17, v11, v17)
    var v76: Vector[Double] = v33
    val v54: Double = v20(0)
    val v92: Vector[Vector[Double]] = v0.p0
    var v60: Double = v9
    v20 = v20.updated(2, v8)
    v17 = v17.updated(0, v4)
    val v72: Double = v7.p1
    val v66: Double = v5.p1
    var v43: s0 = v7
    v5 = v5.copy(p1 = v66)
    v27 = v27.updated(1, v76)
    v7 = v7.copy(p1 = v16)
    val v44: Double = v5.p1
    v43 = v43.copy(p0 = v2)
    val v63: Double = v0.p1
    var v83: Vector[Vector[Double]] = v29
    val v74: Vector[Double] = v69(2)
    v2 = v2.updated(1, v13)
    v17 = v74
    v5 = v5.copy(p1 = v60)
    val v174: Double = v17(0)
    v33 = v33.updated(0, v32)
    v43 = v43.copy(p1 = v54)
    v5 = v5.copy(p0 = v2)
    v5 = v5.copy(p0 = v92)
    v7 = v7.copy(p1 = v72)
    val v140: Vector[Vector[Double]] = v43.p0
    v76 = v76.updated(0, v6)
    v7 = v7.copy(p0 = v83)
    v43 = v43.copy(p1 = v174)
    v7 = v7.copy(p0 = v46)
    v43 = v43.copy(p0 = v49)
    v43 = v43.copy(p0 = v12)
    v5 = v5.copy(p1 = v63)
    v43 = v43.copy(p1 = v44)
    v7 = v7.copy(p0 = v140)
    v7 = v7.copy(p0 = v83)
    v43 = v43.copy(p1 = v44)
    v43
  }
  @noinline
  def f0(v0: Vector[s5], v1: Vector[Vector[s13]], v2: Double): Double = {
    val v8: s5 = v0(2)
    val v10: Vector[Vector[s0]] = v8.p0
    val v17: Vector[s0] = v10(2)
    val v25: s0 = v17(0)
    val v60: s0 = f2(v25)
    val v66: Double = v60.p1
    v66
  }
  def benchmark(): Unit = {
    val v0: Vector[s5] = Vector(s5(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0)), 2.0)), Vector(s0(Vector(Vector(3.0), Vector(4.0)), 5.0)), Vector(s0(Vector(Vector(6.0), Vector(7.0)), 8.0))), Vector(Vector(s1(Vector(s0(Vector(Vector(9.0), Vector(10.0)), 11.0), s0(Vector(Vector(12.0), Vector(13.0)), 14.0), s0(Vector(Vector(15.0), Vector(16.0)), 17.0)), Vector(s0(Vector(Vector(18.0), Vector(19.0)), 20.0), s0(Vector(Vector(21.0), Vector(22.0)), 23.0)))), Vector(s1(Vector(s0(Vector(Vector(24.0), Vector(25.0)), 26.0), s0(Vector(Vector(27.0), Vector(28.0)), 29.0), s0(Vector(Vector(30.0), Vector(31.0)), 32.0)), Vector(s0(Vector(Vector(33.0), Vector(34.0)), 35.0), s0(Vector(Vector(36.0), Vector(37.0)), 38.0)))))), s5(Vector(Vector(s0(Vector(Vector(39.0), Vector(40.0)), 41.0)), Vector(s0(Vector(Vector(42.0), Vector(43.0)), 44.0)), Vector(s0(Vector(Vector(45.0), Vector(46.0)), 47.0))), Vector(Vector(s1(Vector(s0(Vector(Vector(48.0), Vector(49.0)), 50.0), s0(Vector(Vector(51.0), Vector(52.0)), 53.0), s0(Vector(Vector(54.0), Vector(55.0)), 56.0)), Vector(s0(Vector(Vector(57.0), Vector(58.0)), 59.0), s0(Vector(Vector(60.0), Vector(61.0)), 62.0)))), Vector(s1(Vector(s0(Vector(Vector(63.0), Vector(64.0)), 65.0), s0(Vector(Vector(66.0), Vector(67.0)), 68.0), s0(Vector(Vector(69.0), Vector(70.0)), 71.0)), Vector(s0(Vector(Vector(72.0), Vector(73.0)), 74.0), s0(Vector(Vector(75.0), Vector(76.0)), 77.0)))))), s5(Vector(Vector(s0(Vector(Vector(78.0), Vector(79.0)), 80.0)), Vector(s0(Vector(Vector(81.0), Vector(82.0)), 83.0)), Vector(s0(Vector(Vector(84.0), Vector(85.0)), 86.0))), Vector(Vector(s1(Vector(s0(Vector(Vector(87.0), Vector(88.0)), 89.0), s0(Vector(Vector(90.0), Vector(91.0)), 92.0), s0(Vector(Vector(93.0), Vector(94.0)), 95.0)), Vector(s0(Vector(Vector(96.0), Vector(97.0)), 98.0), s0(Vector(Vector(99.0), Vector(100.0)), 101.0)))), Vector(s1(Vector(s0(Vector(Vector(102.0), Vector(103.0)), 104.0), s0(Vector(Vector(105.0), Vector(106.0)), 107.0), s0(Vector(Vector(108.0), Vector(109.0)), 110.0)), Vector(s0(Vector(Vector(111.0), Vector(112.0)), 113.0), s0(Vector(Vector(114.0), Vector(115.0)), 116.0)))))))
    val v1: Vector[Vector[s13]] = Vector(Vector(s13(Vector(s6(Vector(s2(Vector(s1(Vector(s0(Vector(Vector(117.0), Vector(118.0)), 119.0), s0(Vector(Vector(120.0), Vector(121.0)), 122.0), s0(Vector(Vector(123.0), Vector(124.0)), 125.0)), Vector(s0(Vector(Vector(126.0), Vector(127.0)), 128.0), s0(Vector(Vector(129.0), Vector(130.0)), 131.0))), s1(Vector(s0(Vector(Vector(132.0), Vector(133.0)), 134.0), s0(Vector(Vector(135.0), Vector(136.0)), 137.0), s0(Vector(Vector(138.0), Vector(139.0)), 140.0)), Vector(s0(Vector(Vector(141.0), Vector(142.0)), 143.0), s0(Vector(Vector(144.0), Vector(145.0)), 146.0))), s1(Vector(s0(Vector(Vector(147.0), Vector(148.0)), 149.0), s0(Vector(Vector(150.0), Vector(151.0)), 152.0), s0(Vector(Vector(153.0), Vector(154.0)), 155.0)), Vector(s0(Vector(Vector(156.0), Vector(157.0)), 158.0), s0(Vector(Vector(159.0), Vector(160.0)), 161.0)))), s1(Vector(s0(Vector(Vector(162.0), Vector(163.0)), 164.0), s0(Vector(Vector(165.0), Vector(166.0)), 167.0), s0(Vector(Vector(168.0), Vector(169.0)), 170.0)), Vector(s0(Vector(Vector(171.0), Vector(172.0)), 173.0), s0(Vector(Vector(174.0), Vector(175.0)), 176.0)))))), s6(Vector(s2(Vector(s1(Vector(s0(Vector(Vector(177.0), Vector(178.0)), 179.0), s0(Vector(Vector(180.0), Vector(181.0)), 182.0), s0(Vector(Vector(183.0), Vector(184.0)), 185.0)), Vector(s0(Vector(Vector(186.0), Vector(187.0)), 188.0), s0(Vector(Vector(189.0), Vector(190.0)), 191.0))), s1(Vector(s0(Vector(Vector(192.0), Vector(193.0)), 194.0), s0(Vector(Vector(195.0), Vector(196.0)), 197.0), s0(Vector(Vector(198.0), Vector(199.0)), 200.0)), Vector(s0(Vector(Vector(201.0), Vector(202.0)), 203.0), s0(Vector(Vector(204.0), Vector(205.0)), 206.0))), s1(Vector(s0(Vector(Vector(207.0), Vector(208.0)), 209.0), s0(Vector(Vector(210.0), Vector(211.0)), 212.0), s0(Vector(Vector(213.0), Vector(214.0)), 215.0)), Vector(s0(Vector(Vector(216.0), Vector(217.0)), 218.0), s0(Vector(Vector(219.0), Vector(220.0)), 221.0)))), s1(Vector(s0(Vector(Vector(222.0), Vector(223.0)), 224.0), s0(Vector(Vector(225.0), Vector(226.0)), 227.0), s0(Vector(Vector(228.0), Vector(229.0)), 230.0)), Vector(s0(Vector(Vector(231.0), Vector(232.0)), 233.0), s0(Vector(Vector(234.0), Vector(235.0)), 236.0)))))), s6(Vector(s2(Vector(s1(Vector(s0(Vector(Vector(237.0), Vector(238.0)), 239.0), s0(Vector(Vector(240.0), Vector(241.0)), 242.0), s0(Vector(Vector(243.0), Vector(244.0)), 245.0)), Vector(s0(Vector(Vector(246.0), Vector(247.0)), 248.0), s0(Vector(Vector(249.0), Vector(250.0)), 251.0))), s1(Vector(s0(Vector(Vector(252.0), Vector(253.0)), 254.0), s0(Vector(Vector(255.0), Vector(256.0)), 257.0), s0(Vector(Vector(258.0), Vector(259.0)), 260.0)), Vector(s0(Vector(Vector(261.0), Vector(262.0)), 263.0), s0(Vector(Vector(264.0), Vector(265.0)), 266.0))), s1(Vector(s0(Vector(Vector(267.0), Vector(268.0)), 269.0), s0(Vector(Vector(270.0), Vector(271.0)), 272.0), s0(Vector(Vector(273.0), Vector(274.0)), 275.0)), Vector(s0(Vector(Vector(276.0), Vector(277.0)), 278.0), s0(Vector(Vector(279.0), Vector(280.0)), 281.0)))), s1(Vector(s0(Vector(Vector(282.0), Vector(283.0)), 284.0), s0(Vector(Vector(285.0), Vector(286.0)), 287.0), s0(Vector(Vector(288.0), Vector(289.0)), 290.0)), Vector(s0(Vector(Vector(291.0), Vector(292.0)), 293.0), s0(Vector(Vector(294.0), Vector(295.0)), 296.0))))))), Vector(s4(Vector(s2(Vector(s1(Vector(s0(Vector(Vector(297.0), Vector(298.0)), 299.0), s0(Vector(Vector(300.0), Vector(301.0)), 302.0), s0(Vector(Vector(303.0), Vector(304.0)), 305.0)), Vector(s0(Vector(Vector(306.0), Vector(307.0)), 308.0), s0(Vector(Vector(309.0), Vector(310.0)), 311.0))), s1(Vector(s0(Vector(Vector(312.0), Vector(313.0)), 314.0), s0(Vector(Vector(315.0), Vector(316.0)), 317.0), s0(Vector(Vector(318.0), Vector(319.0)), 320.0)), Vector(s0(Vector(Vector(321.0), Vector(322.0)), 323.0), s0(Vector(Vector(324.0), Vector(325.0)), 326.0))), s1(Vector(s0(Vector(Vector(327.0), Vector(328.0)), 329.0), s0(Vector(Vector(330.0), Vector(331.0)), 332.0), s0(Vector(Vector(333.0), Vector(334.0)), 335.0)), Vector(s0(Vector(Vector(336.0), Vector(337.0)), 338.0), s0(Vector(Vector(339.0), Vector(340.0)), 341.0)))), s1(Vector(s0(Vector(Vector(342.0), Vector(343.0)), 344.0), s0(Vector(Vector(345.0), Vector(346.0)), 347.0), s0(Vector(Vector(348.0), Vector(349.0)), 350.0)), Vector(s0(Vector(Vector(351.0), Vector(352.0)), 353.0), s0(Vector(Vector(354.0), Vector(355.0)), 356.0))))), s3(s0(Vector(Vector(357.0), Vector(358.0)), 359.0), s1(Vector(s0(Vector(Vector(360.0), Vector(361.0)), 362.0), s0(Vector(Vector(363.0), Vector(364.0)), 365.0), s0(Vector(Vector(366.0), Vector(367.0)), 368.0)), Vector(s0(Vector(Vector(369.0), Vector(370.0)), 371.0), s0(Vector(Vector(372.0), Vector(373.0)), 374.0)))))))), Vector(s13(Vector(s6(Vector(s2(Vector(s1(Vector(s0(Vector(Vector(375.0), Vector(376.0)), 377.0), s0(Vector(Vector(378.0), Vector(379.0)), 380.0), s0(Vector(Vector(381.0), Vector(382.0)), 383.0)), Vector(s0(Vector(Vector(384.0), Vector(385.0)), 386.0), s0(Vector(Vector(387.0), Vector(388.0)), 389.0))), s1(Vector(s0(Vector(Vector(390.0), Vector(391.0)), 392.0), s0(Vector(Vector(393.0), Vector(394.0)), 395.0), s0(Vector(Vector(396.0), Vector(397.0)), 398.0)), Vector(s0(Vector(Vector(399.0), Vector(400.0)), 401.0), s0(Vector(Vector(402.0), Vector(403.0)), 404.0))), s1(Vector(s0(Vector(Vector(405.0), Vector(406.0)), 407.0), s0(Vector(Vector(408.0), Vector(409.0)), 410.0), s0(Vector(Vector(411.0), Vector(412.0)), 413.0)), Vector(s0(Vector(Vector(414.0), Vector(415.0)), 416.0), s0(Vector(Vector(417.0), Vector(418.0)), 419.0)))), s1(Vector(s0(Vector(Vector(420.0), Vector(421.0)), 422.0), s0(Vector(Vector(423.0), Vector(424.0)), 425.0), s0(Vector(Vector(426.0), Vector(427.0)), 428.0)), Vector(s0(Vector(Vector(429.0), Vector(430.0)), 431.0), s0(Vector(Vector(432.0), Vector(433.0)), 434.0)))))), s6(Vector(s2(Vector(s1(Vector(s0(Vector(Vector(435.0), Vector(436.0)), 437.0), s0(Vector(Vector(438.0), Vector(439.0)), 440.0), s0(Vector(Vector(441.0), Vector(442.0)), 443.0)), Vector(s0(Vector(Vector(444.0), Vector(445.0)), 446.0), s0(Vector(Vector(447.0), Vector(448.0)), 449.0))), s1(Vector(s0(Vector(Vector(450.0), Vector(451.0)), 452.0), s0(Vector(Vector(453.0), Vector(454.0)), 455.0), s0(Vector(Vector(456.0), Vector(457.0)), 458.0)), Vector(s0(Vector(Vector(459.0), Vector(460.0)), 461.0), s0(Vector(Vector(462.0), Vector(463.0)), 464.0))), s1(Vector(s0(Vector(Vector(465.0), Vector(466.0)), 467.0), s0(Vector(Vector(468.0), Vector(469.0)), 470.0), s0(Vector(Vector(471.0), Vector(472.0)), 473.0)), Vector(s0(Vector(Vector(474.0), Vector(475.0)), 476.0), s0(Vector(Vector(477.0), Vector(478.0)), 479.0)))), s1(Vector(s0(Vector(Vector(480.0), Vector(481.0)), 482.0), s0(Vector(Vector(483.0), Vector(484.0)), 485.0), s0(Vector(Vector(486.0), Vector(487.0)), 488.0)), Vector(s0(Vector(Vector(489.0), Vector(490.0)), 491.0), s0(Vector(Vector(492.0), Vector(493.0)), 494.0)))))), s6(Vector(s2(Vector(s1(Vector(s0(Vector(Vector(495.0), Vector(496.0)), 497.0), s0(Vector(Vector(498.0), Vector(499.0)), 500.0), s0(Vector(Vector(501.0), Vector(502.0)), 503.0)), Vector(s0(Vector(Vector(504.0), Vector(505.0)), 506.0), s0(Vector(Vector(507.0), Vector(508.0)), 509.0))), s1(Vector(s0(Vector(Vector(510.0), Vector(511.0)), 512.0), s0(Vector(Vector(513.0), Vector(514.0)), 515.0), s0(Vector(Vector(516.0), Vector(517.0)), 518.0)), Vector(s0(Vector(Vector(519.0), Vector(520.0)), 521.0), s0(Vector(Vector(522.0), Vector(523.0)), 524.0))), s1(Vector(s0(Vector(Vector(525.0), Vector(526.0)), 527.0), s0(Vector(Vector(528.0), Vector(529.0)), 530.0), s0(Vector(Vector(531.0), Vector(532.0)), 533.0)), Vector(s0(Vector(Vector(534.0), Vector(535.0)), 536.0), s0(Vector(Vector(537.0), Vector(538.0)), 539.0)))), s1(Vector(s0(Vector(Vector(540.0), Vector(541.0)), 542.0), s0(Vector(Vector(543.0), Vector(544.0)), 545.0), s0(Vector(Vector(546.0), Vector(547.0)), 548.0)), Vector(s0(Vector(Vector(549.0), Vector(550.0)), 551.0), s0(Vector(Vector(552.0), Vector(553.0)), 554.0))))))), Vector(s4(Vector(s2(Vector(s1(Vector(s0(Vector(Vector(555.0), Vector(556.0)), 557.0), s0(Vector(Vector(558.0), Vector(559.0)), 560.0), s0(Vector(Vector(561.0), Vector(562.0)), 563.0)), Vector(s0(Vector(Vector(564.0), Vector(565.0)), 566.0), s0(Vector(Vector(567.0), Vector(568.0)), 569.0))), s1(Vector(s0(Vector(Vector(570.0), Vector(571.0)), 572.0), s0(Vector(Vector(573.0), Vector(574.0)), 575.0), s0(Vector(Vector(576.0), Vector(577.0)), 578.0)), Vector(s0(Vector(Vector(579.0), Vector(580.0)), 581.0), s0(Vector(Vector(582.0), Vector(583.0)), 584.0))), s1(Vector(s0(Vector(Vector(585.0), Vector(586.0)), 587.0), s0(Vector(Vector(588.0), Vector(589.0)), 590.0), s0(Vector(Vector(591.0), Vector(592.0)), 593.0)), Vector(s0(Vector(Vector(594.0), Vector(595.0)), 596.0), s0(Vector(Vector(597.0), Vector(598.0)), 599.0)))), s1(Vector(s0(Vector(Vector(600.0), Vector(601.0)), 602.0), s0(Vector(Vector(603.0), Vector(604.0)), 605.0), s0(Vector(Vector(606.0), Vector(607.0)), 608.0)), Vector(s0(Vector(Vector(609.0), Vector(610.0)), 611.0), s0(Vector(Vector(612.0), Vector(613.0)), 614.0))))), s3(s0(Vector(Vector(615.0), Vector(616.0)), 617.0), s1(Vector(s0(Vector(Vector(618.0), Vector(619.0)), 620.0), s0(Vector(Vector(621.0), Vector(622.0)), 623.0), s0(Vector(Vector(624.0), Vector(625.0)), 626.0)), Vector(s0(Vector(Vector(627.0), Vector(628.0)), 629.0), s0(Vector(Vector(630.0), Vector(631.0)), 632.0)))))))), Vector(s13(Vector(s6(Vector(s2(Vector(s1(Vector(s0(Vector(Vector(633.0), Vector(634.0)), 635.0), s0(Vector(Vector(636.0), Vector(637.0)), 638.0), s0(Vector(Vector(639.0), Vector(640.0)), 641.0)), Vector(s0(Vector(Vector(642.0), Vector(643.0)), 644.0), s0(Vector(Vector(645.0), Vector(646.0)), 647.0))), s1(Vector(s0(Vector(Vector(648.0), Vector(649.0)), 650.0), s0(Vector(Vector(651.0), Vector(652.0)), 653.0), s0(Vector(Vector(654.0), Vector(655.0)), 656.0)), Vector(s0(Vector(Vector(657.0), Vector(658.0)), 659.0), s0(Vector(Vector(660.0), Vector(661.0)), 662.0))), s1(Vector(s0(Vector(Vector(663.0), Vector(664.0)), 665.0), s0(Vector(Vector(666.0), Vector(667.0)), 668.0), s0(Vector(Vector(669.0), Vector(670.0)), 671.0)), Vector(s0(Vector(Vector(672.0), Vector(673.0)), 674.0), s0(Vector(Vector(675.0), Vector(676.0)), 677.0)))), s1(Vector(s0(Vector(Vector(678.0), Vector(679.0)), 680.0), s0(Vector(Vector(681.0), Vector(682.0)), 683.0), s0(Vector(Vector(684.0), Vector(685.0)), 686.0)), Vector(s0(Vector(Vector(687.0), Vector(688.0)), 689.0), s0(Vector(Vector(690.0), Vector(691.0)), 692.0)))))), s6(Vector(s2(Vector(s1(Vector(s0(Vector(Vector(693.0), Vector(694.0)), 695.0), s0(Vector(Vector(696.0), Vector(697.0)), 698.0), s0(Vector(Vector(699.0), Vector(700.0)), 701.0)), Vector(s0(Vector(Vector(702.0), Vector(703.0)), 704.0), s0(Vector(Vector(705.0), Vector(706.0)), 707.0))), s1(Vector(s0(Vector(Vector(708.0), Vector(709.0)), 710.0), s0(Vector(Vector(711.0), Vector(712.0)), 713.0), s0(Vector(Vector(714.0), Vector(715.0)), 716.0)), Vector(s0(Vector(Vector(717.0), Vector(718.0)), 719.0), s0(Vector(Vector(720.0), Vector(721.0)), 722.0))), s1(Vector(s0(Vector(Vector(723.0), Vector(724.0)), 725.0), s0(Vector(Vector(726.0), Vector(727.0)), 728.0), s0(Vector(Vector(729.0), Vector(730.0)), 731.0)), Vector(s0(Vector(Vector(732.0), Vector(733.0)), 734.0), s0(Vector(Vector(735.0), Vector(736.0)), 737.0)))), s1(Vector(s0(Vector(Vector(738.0), Vector(739.0)), 740.0), s0(Vector(Vector(741.0), Vector(742.0)), 743.0), s0(Vector(Vector(744.0), Vector(745.0)), 746.0)), Vector(s0(Vector(Vector(747.0), Vector(748.0)), 749.0), s0(Vector(Vector(750.0), Vector(751.0)), 752.0)))))), s6(Vector(s2(Vector(s1(Vector(s0(Vector(Vector(753.0), Vector(754.0)), 755.0), s0(Vector(Vector(756.0), Vector(757.0)), 758.0), s0(Vector(Vector(759.0), Vector(760.0)), 761.0)), Vector(s0(Vector(Vector(762.0), Vector(763.0)), 764.0), s0(Vector(Vector(765.0), Vector(766.0)), 767.0))), s1(Vector(s0(Vector(Vector(768.0), Vector(769.0)), 770.0), s0(Vector(Vector(771.0), Vector(772.0)), 773.0), s0(Vector(Vector(774.0), Vector(775.0)), 776.0)), Vector(s0(Vector(Vector(777.0), Vector(778.0)), 779.0), s0(Vector(Vector(780.0), Vector(781.0)), 782.0))), s1(Vector(s0(Vector(Vector(783.0), Vector(784.0)), 785.0), s0(Vector(Vector(786.0), Vector(787.0)), 788.0), s0(Vector(Vector(789.0), Vector(790.0)), 791.0)), Vector(s0(Vector(Vector(792.0), Vector(793.0)), 794.0), s0(Vector(Vector(795.0), Vector(796.0)), 797.0)))), s1(Vector(s0(Vector(Vector(798.0), Vector(799.0)), 800.0), s0(Vector(Vector(801.0), Vector(802.0)), 803.0), s0(Vector(Vector(804.0), Vector(805.0)), 806.0)), Vector(s0(Vector(Vector(807.0), Vector(808.0)), 809.0), s0(Vector(Vector(810.0), Vector(811.0)), 812.0))))))), Vector(s4(Vector(s2(Vector(s1(Vector(s0(Vector(Vector(813.0), Vector(814.0)), 815.0), s0(Vector(Vector(816.0), Vector(817.0)), 818.0), s0(Vector(Vector(819.0), Vector(820.0)), 821.0)), Vector(s0(Vector(Vector(822.0), Vector(823.0)), 824.0), s0(Vector(Vector(825.0), Vector(826.0)), 827.0))), s1(Vector(s0(Vector(Vector(828.0), Vector(829.0)), 830.0), s0(Vector(Vector(831.0), Vector(832.0)), 833.0), s0(Vector(Vector(834.0), Vector(835.0)), 836.0)), Vector(s0(Vector(Vector(837.0), Vector(838.0)), 839.0), s0(Vector(Vector(840.0), Vector(841.0)), 842.0))), s1(Vector(s0(Vector(Vector(843.0), Vector(844.0)), 845.0), s0(Vector(Vector(846.0), Vector(847.0)), 848.0), s0(Vector(Vector(849.0), Vector(850.0)), 851.0)), Vector(s0(Vector(Vector(852.0), Vector(853.0)), 854.0), s0(Vector(Vector(855.0), Vector(856.0)), 857.0)))), s1(Vector(s0(Vector(Vector(858.0), Vector(859.0)), 860.0), s0(Vector(Vector(861.0), Vector(862.0)), 863.0), s0(Vector(Vector(864.0), Vector(865.0)), 866.0)), Vector(s0(Vector(Vector(867.0), Vector(868.0)), 869.0), s0(Vector(Vector(870.0), Vector(871.0)), 872.0))))), s3(s0(Vector(Vector(873.0), Vector(874.0)), 875.0), s1(Vector(s0(Vector(Vector(876.0), Vector(877.0)), 878.0), s0(Vector(Vector(879.0), Vector(880.0)), 881.0), s0(Vector(Vector(882.0), Vector(883.0)), 884.0)), Vector(s0(Vector(Vector(885.0), Vector(886.0)), 887.0), s0(Vector(Vector(888.0), Vector(889.0)), 890.0)))))))))
    val v2: Double = 891.0
    val start = nanoTime()
    var result: Double = 891.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}