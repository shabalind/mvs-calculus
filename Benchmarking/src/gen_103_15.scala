import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Double
  )
  case class s2 (
    p0: s0,
    p1: Vector[s0],
    p2: Vector[Vector[s1]]
  )
  case class s3 (
    p0: Vector[Vector[s1]],
    p1: s0
  )
  case class s4 (
    p0: s1,
    p1: s0,
    p2: Vector[s1]
  )
  case class s5 (
    p0: s1,
    p1: Vector[Vector[s3]]
  )
  case class s6 (
    p0: s4,
    p1: Vector[Vector[s1]]
  )
  case class s8 (
    p0: s5,
    p1: Vector[s5]
  )
  case class s10 (
    p0: Vector[Vector[s3]],
    p1: s3
  )
  case class s11 (
    p0: s6,
    p1: Vector[Vector[s0]]
  )
  case class s12 (
    p0: s8,
    p1: Vector[s10]
  )
  case class s13 (
    p0: s11,
    p1: s1
  )
  def f63(v0: s0): s0 = {
    var v5: s0 = v0
    val v9: Vector[Vector[Double]] = v0.p0
    var v6: s0 = v5
    val v15: Vector[Vector[Double]] = v0.p0
    v5 = v5.copy(p0 = v15)
    v6 = v6.copy(p0 = v9)
    v5 = v5.copy(p0 = v15)
    v5 = v0
    v6
  }
  @noinline
  def f0(v0: s5, v1: Vector[s12], v2: Vector[Vector[s13]], v3: s2, v4: Double): Double = {
    val v8: s1 = v0.p0
    var v11: Double = v4
    val v9: s0 = v8.p0
    val v17: s0 = f63(v9)
    val v23: Vector[Vector[Double]] = v17.p0
    val v28: Vector[Double] = v23(1)
    val v27: Double = v28(0)
    var v46: Double = v27
    val v57: Vector[Vector[Double]] = v17.p0
    val v167: Double = v46 * v11
    val v52: Vector[Double] = v57(0)
    val v118: Double = v52(0)
    val v287: Double = v118 - v167
    v287
  }
  def benchmark(): Unit = {
    val v0: s5 = s5(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))), 3.0), Vector(Vector(s3(Vector(Vector(s1(s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0))), 7.0)), Vector(s1(s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0))), 11.0)), Vector(s1(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0))), 15.0))), s0(Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0))))), Vector(s3(Vector(Vector(s1(s0(Vector(Vector(19.0), Vector(20.0)), Vector(Vector(21.0))), 22.0)), Vector(s1(s0(Vector(Vector(23.0), Vector(24.0)), Vector(Vector(25.0))), 26.0)), Vector(s1(s0(Vector(Vector(27.0), Vector(28.0)), Vector(Vector(29.0))), 30.0))), s0(Vector(Vector(31.0), Vector(32.0)), Vector(Vector(33.0)))))))
    val v1: Vector[s12] = Vector(s12(s8(s5(s1(s0(Vector(Vector(34.0), Vector(35.0)), Vector(Vector(36.0))), 37.0), Vector(Vector(s3(Vector(Vector(s1(s0(Vector(Vector(38.0), Vector(39.0)), Vector(Vector(40.0))), 41.0)), Vector(s1(s0(Vector(Vector(42.0), Vector(43.0)), Vector(Vector(44.0))), 45.0)), Vector(s1(s0(Vector(Vector(46.0), Vector(47.0)), Vector(Vector(48.0))), 49.0))), s0(Vector(Vector(50.0), Vector(51.0)), Vector(Vector(52.0))))), Vector(s3(Vector(Vector(s1(s0(Vector(Vector(53.0), Vector(54.0)), Vector(Vector(55.0))), 56.0)), Vector(s1(s0(Vector(Vector(57.0), Vector(58.0)), Vector(Vector(59.0))), 60.0)), Vector(s1(s0(Vector(Vector(61.0), Vector(62.0)), Vector(Vector(63.0))), 64.0))), s0(Vector(Vector(65.0), Vector(66.0)), Vector(Vector(67.0))))))), Vector(s5(s1(s0(Vector(Vector(68.0), Vector(69.0)), Vector(Vector(70.0))), 71.0), Vector(Vector(s3(Vector(Vector(s1(s0(Vector(Vector(72.0), Vector(73.0)), Vector(Vector(74.0))), 75.0)), Vector(s1(s0(Vector(Vector(76.0), Vector(77.0)), Vector(Vector(78.0))), 79.0)), Vector(s1(s0(Vector(Vector(80.0), Vector(81.0)), Vector(Vector(82.0))), 83.0))), s0(Vector(Vector(84.0), Vector(85.0)), Vector(Vector(86.0))))), Vector(s3(Vector(Vector(s1(s0(Vector(Vector(87.0), Vector(88.0)), Vector(Vector(89.0))), 90.0)), Vector(s1(s0(Vector(Vector(91.0), Vector(92.0)), Vector(Vector(93.0))), 94.0)), Vector(s1(s0(Vector(Vector(95.0), Vector(96.0)), Vector(Vector(97.0))), 98.0))), s0(Vector(Vector(99.0), Vector(100.0)), Vector(Vector(101.0))))))), s5(s1(s0(Vector(Vector(102.0), Vector(103.0)), Vector(Vector(104.0))), 105.0), Vector(Vector(s3(Vector(Vector(s1(s0(Vector(Vector(106.0), Vector(107.0)), Vector(Vector(108.0))), 109.0)), Vector(s1(s0(Vector(Vector(110.0), Vector(111.0)), Vector(Vector(112.0))), 113.0)), Vector(s1(s0(Vector(Vector(114.0), Vector(115.0)), Vector(Vector(116.0))), 117.0))), s0(Vector(Vector(118.0), Vector(119.0)), Vector(Vector(120.0))))), Vector(s3(Vector(Vector(s1(s0(Vector(Vector(121.0), Vector(122.0)), Vector(Vector(123.0))), 124.0)), Vector(s1(s0(Vector(Vector(125.0), Vector(126.0)), Vector(Vector(127.0))), 128.0)), Vector(s1(s0(Vector(Vector(129.0), Vector(130.0)), Vector(Vector(131.0))), 132.0))), s0(Vector(Vector(133.0), Vector(134.0)), Vector(Vector(135.0))))))))), Vector(s10(Vector(Vector(s3(Vector(Vector(s1(s0(Vector(Vector(136.0), Vector(137.0)), Vector(Vector(138.0))), 139.0)), Vector(s1(s0(Vector(Vector(140.0), Vector(141.0)), Vector(Vector(142.0))), 143.0)), Vector(s1(s0(Vector(Vector(144.0), Vector(145.0)), Vector(Vector(146.0))), 147.0))), s0(Vector(Vector(148.0), Vector(149.0)), Vector(Vector(150.0))))), Vector(s3(Vector(Vector(s1(s0(Vector(Vector(151.0), Vector(152.0)), Vector(Vector(153.0))), 154.0)), Vector(s1(s0(Vector(Vector(155.0), Vector(156.0)), Vector(Vector(157.0))), 158.0)), Vector(s1(s0(Vector(Vector(159.0), Vector(160.0)), Vector(Vector(161.0))), 162.0))), s0(Vector(Vector(163.0), Vector(164.0)), Vector(Vector(165.0))))), Vector(s3(Vector(Vector(s1(s0(Vector(Vector(166.0), Vector(167.0)), Vector(Vector(168.0))), 169.0)), Vector(s1(s0(Vector(Vector(170.0), Vector(171.0)), Vector(Vector(172.0))), 173.0)), Vector(s1(s0(Vector(Vector(174.0), Vector(175.0)), Vector(Vector(176.0))), 177.0))), s0(Vector(Vector(178.0), Vector(179.0)), Vector(Vector(180.0)))))), s3(Vector(Vector(s1(s0(Vector(Vector(181.0), Vector(182.0)), Vector(Vector(183.0))), 184.0)), Vector(s1(s0(Vector(Vector(185.0), Vector(186.0)), Vector(Vector(187.0))), 188.0)), Vector(s1(s0(Vector(Vector(189.0), Vector(190.0)), Vector(Vector(191.0))), 192.0))), s0(Vector(Vector(193.0), Vector(194.0)), Vector(Vector(195.0))))), s10(Vector(Vector(s3(Vector(Vector(s1(s0(Vector(Vector(196.0), Vector(197.0)), Vector(Vector(198.0))), 199.0)), Vector(s1(s0(Vector(Vector(200.0), Vector(201.0)), Vector(Vector(202.0))), 203.0)), Vector(s1(s0(Vector(Vector(204.0), Vector(205.0)), Vector(Vector(206.0))), 207.0))), s0(Vector(Vector(208.0), Vector(209.0)), Vector(Vector(210.0))))), Vector(s3(Vector(Vector(s1(s0(Vector(Vector(211.0), Vector(212.0)), Vector(Vector(213.0))), 214.0)), Vector(s1(s0(Vector(Vector(215.0), Vector(216.0)), Vector(Vector(217.0))), 218.0)), Vector(s1(s0(Vector(Vector(219.0), Vector(220.0)), Vector(Vector(221.0))), 222.0))), s0(Vector(Vector(223.0), Vector(224.0)), Vector(Vector(225.0))))), Vector(s3(Vector(Vector(s1(s0(Vector(Vector(226.0), Vector(227.0)), Vector(Vector(228.0))), 229.0)), Vector(s1(s0(Vector(Vector(230.0), Vector(231.0)), Vector(Vector(232.0))), 233.0)), Vector(s1(s0(Vector(Vector(234.0), Vector(235.0)), Vector(Vector(236.0))), 237.0))), s0(Vector(Vector(238.0), Vector(239.0)), Vector(Vector(240.0)))))), s3(Vector(Vector(s1(s0(Vector(Vector(241.0), Vector(242.0)), Vector(Vector(243.0))), 244.0)), Vector(s1(s0(Vector(Vector(245.0), Vector(246.0)), Vector(Vector(247.0))), 248.0)), Vector(s1(s0(Vector(Vector(249.0), Vector(250.0)), Vector(Vector(251.0))), 252.0))), s0(Vector(Vector(253.0), Vector(254.0)), Vector(Vector(255.0))))), s10(Vector(Vector(s3(Vector(Vector(s1(s0(Vector(Vector(256.0), Vector(257.0)), Vector(Vector(258.0))), 259.0)), Vector(s1(s0(Vector(Vector(260.0), Vector(261.0)), Vector(Vector(262.0))), 263.0)), Vector(s1(s0(Vector(Vector(264.0), Vector(265.0)), Vector(Vector(266.0))), 267.0))), s0(Vector(Vector(268.0), Vector(269.0)), Vector(Vector(270.0))))), Vector(s3(Vector(Vector(s1(s0(Vector(Vector(271.0), Vector(272.0)), Vector(Vector(273.0))), 274.0)), Vector(s1(s0(Vector(Vector(275.0), Vector(276.0)), Vector(Vector(277.0))), 278.0)), Vector(s1(s0(Vector(Vector(279.0), Vector(280.0)), Vector(Vector(281.0))), 282.0))), s0(Vector(Vector(283.0), Vector(284.0)), Vector(Vector(285.0))))), Vector(s3(Vector(Vector(s1(s0(Vector(Vector(286.0), Vector(287.0)), Vector(Vector(288.0))), 289.0)), Vector(s1(s0(Vector(Vector(290.0), Vector(291.0)), Vector(Vector(292.0))), 293.0)), Vector(s1(s0(Vector(Vector(294.0), Vector(295.0)), Vector(Vector(296.0))), 297.0))), s0(Vector(Vector(298.0), Vector(299.0)), Vector(Vector(300.0)))))), s3(Vector(Vector(s1(s0(Vector(Vector(301.0), Vector(302.0)), Vector(Vector(303.0))), 304.0)), Vector(s1(s0(Vector(Vector(305.0), Vector(306.0)), Vector(Vector(307.0))), 308.0)), Vector(s1(s0(Vector(Vector(309.0), Vector(310.0)), Vector(Vector(311.0))), 312.0))), s0(Vector(Vector(313.0), Vector(314.0)), Vector(Vector(315.0))))))), s12(s8(s5(s1(s0(Vector(Vector(316.0), Vector(317.0)), Vector(Vector(318.0))), 319.0), Vector(Vector(s3(Vector(Vector(s1(s0(Vector(Vector(320.0), Vector(321.0)), Vector(Vector(322.0))), 323.0)), Vector(s1(s0(Vector(Vector(324.0), Vector(325.0)), Vector(Vector(326.0))), 327.0)), Vector(s1(s0(Vector(Vector(328.0), Vector(329.0)), Vector(Vector(330.0))), 331.0))), s0(Vector(Vector(332.0), Vector(333.0)), Vector(Vector(334.0))))), Vector(s3(Vector(Vector(s1(s0(Vector(Vector(335.0), Vector(336.0)), Vector(Vector(337.0))), 338.0)), Vector(s1(s0(Vector(Vector(339.0), Vector(340.0)), Vector(Vector(341.0))), 342.0)), Vector(s1(s0(Vector(Vector(343.0), Vector(344.0)), Vector(Vector(345.0))), 346.0))), s0(Vector(Vector(347.0), Vector(348.0)), Vector(Vector(349.0))))))), Vector(s5(s1(s0(Vector(Vector(350.0), Vector(351.0)), Vector(Vector(352.0))), 353.0), Vector(Vector(s3(Vector(Vector(s1(s0(Vector(Vector(354.0), Vector(355.0)), Vector(Vector(356.0))), 357.0)), Vector(s1(s0(Vector(Vector(358.0), Vector(359.0)), Vector(Vector(360.0))), 361.0)), Vector(s1(s0(Vector(Vector(362.0), Vector(363.0)), Vector(Vector(364.0))), 365.0))), s0(Vector(Vector(366.0), Vector(367.0)), Vector(Vector(368.0))))), Vector(s3(Vector(Vector(s1(s0(Vector(Vector(369.0), Vector(370.0)), Vector(Vector(371.0))), 372.0)), Vector(s1(s0(Vector(Vector(373.0), Vector(374.0)), Vector(Vector(375.0))), 376.0)), Vector(s1(s0(Vector(Vector(377.0), Vector(378.0)), Vector(Vector(379.0))), 380.0))), s0(Vector(Vector(381.0), Vector(382.0)), Vector(Vector(383.0))))))), s5(s1(s0(Vector(Vector(384.0), Vector(385.0)), Vector(Vector(386.0))), 387.0), Vector(Vector(s3(Vector(Vector(s1(s0(Vector(Vector(388.0), Vector(389.0)), Vector(Vector(390.0))), 391.0)), Vector(s1(s0(Vector(Vector(392.0), Vector(393.0)), Vector(Vector(394.0))), 395.0)), Vector(s1(s0(Vector(Vector(396.0), Vector(397.0)), Vector(Vector(398.0))), 399.0))), s0(Vector(Vector(400.0), Vector(401.0)), Vector(Vector(402.0))))), Vector(s3(Vector(Vector(s1(s0(Vector(Vector(403.0), Vector(404.0)), Vector(Vector(405.0))), 406.0)), Vector(s1(s0(Vector(Vector(407.0), Vector(408.0)), Vector(Vector(409.0))), 410.0)), Vector(s1(s0(Vector(Vector(411.0), Vector(412.0)), Vector(Vector(413.0))), 414.0))), s0(Vector(Vector(415.0), Vector(416.0)), Vector(Vector(417.0))))))))), Vector(s10(Vector(Vector(s3(Vector(Vector(s1(s0(Vector(Vector(418.0), Vector(419.0)), Vector(Vector(420.0))), 421.0)), Vector(s1(s0(Vector(Vector(422.0), Vector(423.0)), Vector(Vector(424.0))), 425.0)), Vector(s1(s0(Vector(Vector(426.0), Vector(427.0)), Vector(Vector(428.0))), 429.0))), s0(Vector(Vector(430.0), Vector(431.0)), Vector(Vector(432.0))))), Vector(s3(Vector(Vector(s1(s0(Vector(Vector(433.0), Vector(434.0)), Vector(Vector(435.0))), 436.0)), Vector(s1(s0(Vector(Vector(437.0), Vector(438.0)), Vector(Vector(439.0))), 440.0)), Vector(s1(s0(Vector(Vector(441.0), Vector(442.0)), Vector(Vector(443.0))), 444.0))), s0(Vector(Vector(445.0), Vector(446.0)), Vector(Vector(447.0))))), Vector(s3(Vector(Vector(s1(s0(Vector(Vector(448.0), Vector(449.0)), Vector(Vector(450.0))), 451.0)), Vector(s1(s0(Vector(Vector(452.0), Vector(453.0)), Vector(Vector(454.0))), 455.0)), Vector(s1(s0(Vector(Vector(456.0), Vector(457.0)), Vector(Vector(458.0))), 459.0))), s0(Vector(Vector(460.0), Vector(461.0)), Vector(Vector(462.0)))))), s3(Vector(Vector(s1(s0(Vector(Vector(463.0), Vector(464.0)), Vector(Vector(465.0))), 466.0)), Vector(s1(s0(Vector(Vector(467.0), Vector(468.0)), Vector(Vector(469.0))), 470.0)), Vector(s1(s0(Vector(Vector(471.0), Vector(472.0)), Vector(Vector(473.0))), 474.0))), s0(Vector(Vector(475.0), Vector(476.0)), Vector(Vector(477.0))))), s10(Vector(Vector(s3(Vector(Vector(s1(s0(Vector(Vector(478.0), Vector(479.0)), Vector(Vector(480.0))), 481.0)), Vector(s1(s0(Vector(Vector(482.0), Vector(483.0)), Vector(Vector(484.0))), 485.0)), Vector(s1(s0(Vector(Vector(486.0), Vector(487.0)), Vector(Vector(488.0))), 489.0))), s0(Vector(Vector(490.0), Vector(491.0)), Vector(Vector(492.0))))), Vector(s3(Vector(Vector(s1(s0(Vector(Vector(493.0), Vector(494.0)), Vector(Vector(495.0))), 496.0)), Vector(s1(s0(Vector(Vector(497.0), Vector(498.0)), Vector(Vector(499.0))), 500.0)), Vector(s1(s0(Vector(Vector(501.0), Vector(502.0)), Vector(Vector(503.0))), 504.0))), s0(Vector(Vector(505.0), Vector(506.0)), Vector(Vector(507.0))))), Vector(s3(Vector(Vector(s1(s0(Vector(Vector(508.0), Vector(509.0)), Vector(Vector(510.0))), 511.0)), Vector(s1(s0(Vector(Vector(512.0), Vector(513.0)), Vector(Vector(514.0))), 515.0)), Vector(s1(s0(Vector(Vector(516.0), Vector(517.0)), Vector(Vector(518.0))), 519.0))), s0(Vector(Vector(520.0), Vector(521.0)), Vector(Vector(522.0)))))), s3(Vector(Vector(s1(s0(Vector(Vector(523.0), Vector(524.0)), Vector(Vector(525.0))), 526.0)), Vector(s1(s0(Vector(Vector(527.0), Vector(528.0)), Vector(Vector(529.0))), 530.0)), Vector(s1(s0(Vector(Vector(531.0), Vector(532.0)), Vector(Vector(533.0))), 534.0))), s0(Vector(Vector(535.0), Vector(536.0)), Vector(Vector(537.0))))), s10(Vector(Vector(s3(Vector(Vector(s1(s0(Vector(Vector(538.0), Vector(539.0)), Vector(Vector(540.0))), 541.0)), Vector(s1(s0(Vector(Vector(542.0), Vector(543.0)), Vector(Vector(544.0))), 545.0)), Vector(s1(s0(Vector(Vector(546.0), Vector(547.0)), Vector(Vector(548.0))), 549.0))), s0(Vector(Vector(550.0), Vector(551.0)), Vector(Vector(552.0))))), Vector(s3(Vector(Vector(s1(s0(Vector(Vector(553.0), Vector(554.0)), Vector(Vector(555.0))), 556.0)), Vector(s1(s0(Vector(Vector(557.0), Vector(558.0)), Vector(Vector(559.0))), 560.0)), Vector(s1(s0(Vector(Vector(561.0), Vector(562.0)), Vector(Vector(563.0))), 564.0))), s0(Vector(Vector(565.0), Vector(566.0)), Vector(Vector(567.0))))), Vector(s3(Vector(Vector(s1(s0(Vector(Vector(568.0), Vector(569.0)), Vector(Vector(570.0))), 571.0)), Vector(s1(s0(Vector(Vector(572.0), Vector(573.0)), Vector(Vector(574.0))), 575.0)), Vector(s1(s0(Vector(Vector(576.0), Vector(577.0)), Vector(Vector(578.0))), 579.0))), s0(Vector(Vector(580.0), Vector(581.0)), Vector(Vector(582.0)))))), s3(Vector(Vector(s1(s0(Vector(Vector(583.0), Vector(584.0)), Vector(Vector(585.0))), 586.0)), Vector(s1(s0(Vector(Vector(587.0), Vector(588.0)), Vector(Vector(589.0))), 590.0)), Vector(s1(s0(Vector(Vector(591.0), Vector(592.0)), Vector(Vector(593.0))), 594.0))), s0(Vector(Vector(595.0), Vector(596.0)), Vector(Vector(597.0))))))))
    val v2: Vector[Vector[s13]] = Vector(Vector(s13(s11(s6(s4(s1(s0(Vector(Vector(598.0), Vector(599.0)), Vector(Vector(600.0))), 601.0), s0(Vector(Vector(602.0), Vector(603.0)), Vector(Vector(604.0))), Vector(s1(s0(Vector(Vector(605.0), Vector(606.0)), Vector(Vector(607.0))), 608.0))), Vector(Vector(s1(s0(Vector(Vector(609.0), Vector(610.0)), Vector(Vector(611.0))), 612.0)))), Vector(Vector(s0(Vector(Vector(613.0), Vector(614.0)), Vector(Vector(615.0)))), Vector(s0(Vector(Vector(616.0), Vector(617.0)), Vector(Vector(618.0)))), Vector(s0(Vector(Vector(619.0), Vector(620.0)), Vector(Vector(621.0)))))), s1(s0(Vector(Vector(622.0), Vector(623.0)), Vector(Vector(624.0))), 625.0))))
    val v3: s2 = s2(s0(Vector(Vector(626.0), Vector(627.0)), Vector(Vector(628.0))), Vector(s0(Vector(Vector(629.0), Vector(630.0)), Vector(Vector(631.0)))), Vector(Vector(s1(s0(Vector(Vector(632.0), Vector(633.0)), Vector(Vector(634.0))), 635.0)), Vector(s1(s0(Vector(Vector(636.0), Vector(637.0)), Vector(Vector(638.0))), 639.0))))
    val v4: Double = 640.0
    val start = nanoTime()
    var result: Double = 640.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}