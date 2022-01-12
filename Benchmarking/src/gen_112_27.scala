import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Double
  )
  case class s2 (
    p0: s1,
    p1: Vector[s1]
  )
  case class s3 (
    p0: s2,
    p1: s2,
    p2: Vector[Vector[Double]]
  )
  case class s4 (
    p0: Vector[s1],
    p1: s1
  )
  case class s5 (
    p0: s3,
    p1: s4,
    p2: Vector[s4]
  )
  case class s6 (
    p0: Vector[s1],
    p1: s5
  )
  case class s7 (
    p0: s6,
    p1: Vector[s3]
  )
  case class s9 (
    p0: Vector[s3],
    p1: s0
  )
  case class s12 (
    p0: s9,
    p1: s9
  )
  def f33(v0: Double): Double = {
    var v6: Double = v0
    var v1: Double = v6
    var v4: Double = v0
    val v3: Double = v0 + v6
    val v2: Double = v6 - v3
    var v12: Double = v1
    val v7: Double = v2 + v12
    var v14: Double = v3
    var v16: Double = v1
    var v18: Double = v3
    val v33: Vector[Double] = Vector(v16, v4, v14, v7, v18)
    var v19: Vector[Double] = v33
    var v20: Vector[Double] = v19
    val v24: Double = v20(2)
    v24
  }
  @noinline
  def f0(v0: s7, v1: Vector[s12], v2: Vector[s7], v3: Double): Double = {
    val v40: Double = f33(v3)
    v40
  }
  def benchmark(): Unit = {
    val v0: s7 = s7(s6(Vector(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0)))), 5.0), s1(Vector(s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0)))), 11.0), s1(Vector(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0)))), 17.0)), s5(s3(s2(s1(Vector(s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0)))), 23.0), Vector(s1(Vector(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0)))), 29.0))), s2(s1(Vector(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0)))), 35.0), Vector(s1(Vector(s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0), Vector(40.0)))), 41.0))), Vector(Vector(42.0), Vector(43.0), Vector(44.0))), s4(Vector(s1(Vector(s0(Vector(Vector(45.0), Vector(46.0), Vector(47.0)), Vector(Vector(48.0), Vector(49.0)))), 50.0)), s1(Vector(s0(Vector(Vector(51.0), Vector(52.0), Vector(53.0)), Vector(Vector(54.0), Vector(55.0)))), 56.0)), Vector(s4(Vector(s1(Vector(s0(Vector(Vector(57.0), Vector(58.0), Vector(59.0)), Vector(Vector(60.0), Vector(61.0)))), 62.0)), s1(Vector(s0(Vector(Vector(63.0), Vector(64.0), Vector(65.0)), Vector(Vector(66.0), Vector(67.0)))), 68.0))))), Vector(s3(s2(s1(Vector(s0(Vector(Vector(69.0), Vector(70.0), Vector(71.0)), Vector(Vector(72.0), Vector(73.0)))), 74.0), Vector(s1(Vector(s0(Vector(Vector(75.0), Vector(76.0), Vector(77.0)), Vector(Vector(78.0), Vector(79.0)))), 80.0))), s2(s1(Vector(s0(Vector(Vector(81.0), Vector(82.0), Vector(83.0)), Vector(Vector(84.0), Vector(85.0)))), 86.0), Vector(s1(Vector(s0(Vector(Vector(87.0), Vector(88.0), Vector(89.0)), Vector(Vector(90.0), Vector(91.0)))), 92.0))), Vector(Vector(93.0), Vector(94.0), Vector(95.0)))))
    val v1: Vector[s12] = Vector(s12(s9(Vector(s3(s2(s1(Vector(s0(Vector(Vector(96.0), Vector(97.0), Vector(98.0)), Vector(Vector(99.0), Vector(100.0)))), 101.0), Vector(s1(Vector(s0(Vector(Vector(102.0), Vector(103.0), Vector(104.0)), Vector(Vector(105.0), Vector(106.0)))), 107.0))), s2(s1(Vector(s0(Vector(Vector(108.0), Vector(109.0), Vector(110.0)), Vector(Vector(111.0), Vector(112.0)))), 113.0), Vector(s1(Vector(s0(Vector(Vector(114.0), Vector(115.0), Vector(116.0)), Vector(Vector(117.0), Vector(118.0)))), 119.0))), Vector(Vector(120.0), Vector(121.0), Vector(122.0))), s3(s2(s1(Vector(s0(Vector(Vector(123.0), Vector(124.0), Vector(125.0)), Vector(Vector(126.0), Vector(127.0)))), 128.0), Vector(s1(Vector(s0(Vector(Vector(129.0), Vector(130.0), Vector(131.0)), Vector(Vector(132.0), Vector(133.0)))), 134.0))), s2(s1(Vector(s0(Vector(Vector(135.0), Vector(136.0), Vector(137.0)), Vector(Vector(138.0), Vector(139.0)))), 140.0), Vector(s1(Vector(s0(Vector(Vector(141.0), Vector(142.0), Vector(143.0)), Vector(Vector(144.0), Vector(145.0)))), 146.0))), Vector(Vector(147.0), Vector(148.0), Vector(149.0)))), s0(Vector(Vector(150.0), Vector(151.0), Vector(152.0)), Vector(Vector(153.0), Vector(154.0)))), s9(Vector(s3(s2(s1(Vector(s0(Vector(Vector(155.0), Vector(156.0), Vector(157.0)), Vector(Vector(158.0), Vector(159.0)))), 160.0), Vector(s1(Vector(s0(Vector(Vector(161.0), Vector(162.0), Vector(163.0)), Vector(Vector(164.0), Vector(165.0)))), 166.0))), s2(s1(Vector(s0(Vector(Vector(167.0), Vector(168.0), Vector(169.0)), Vector(Vector(170.0), Vector(171.0)))), 172.0), Vector(s1(Vector(s0(Vector(Vector(173.0), Vector(174.0), Vector(175.0)), Vector(Vector(176.0), Vector(177.0)))), 178.0))), Vector(Vector(179.0), Vector(180.0), Vector(181.0))), s3(s2(s1(Vector(s0(Vector(Vector(182.0), Vector(183.0), Vector(184.0)), Vector(Vector(185.0), Vector(186.0)))), 187.0), Vector(s1(Vector(s0(Vector(Vector(188.0), Vector(189.0), Vector(190.0)), Vector(Vector(191.0), Vector(192.0)))), 193.0))), s2(s1(Vector(s0(Vector(Vector(194.0), Vector(195.0), Vector(196.0)), Vector(Vector(197.0), Vector(198.0)))), 199.0), Vector(s1(Vector(s0(Vector(Vector(200.0), Vector(201.0), Vector(202.0)), Vector(Vector(203.0), Vector(204.0)))), 205.0))), Vector(Vector(206.0), Vector(207.0), Vector(208.0)))), s0(Vector(Vector(209.0), Vector(210.0), Vector(211.0)), Vector(Vector(212.0), Vector(213.0))))), s12(s9(Vector(s3(s2(s1(Vector(s0(Vector(Vector(214.0), Vector(215.0), Vector(216.0)), Vector(Vector(217.0), Vector(218.0)))), 219.0), Vector(s1(Vector(s0(Vector(Vector(220.0), Vector(221.0), Vector(222.0)), Vector(Vector(223.0), Vector(224.0)))), 225.0))), s2(s1(Vector(s0(Vector(Vector(226.0), Vector(227.0), Vector(228.0)), Vector(Vector(229.0), Vector(230.0)))), 231.0), Vector(s1(Vector(s0(Vector(Vector(232.0), Vector(233.0), Vector(234.0)), Vector(Vector(235.0), Vector(236.0)))), 237.0))), Vector(Vector(238.0), Vector(239.0), Vector(240.0))), s3(s2(s1(Vector(s0(Vector(Vector(241.0), Vector(242.0), Vector(243.0)), Vector(Vector(244.0), Vector(245.0)))), 246.0), Vector(s1(Vector(s0(Vector(Vector(247.0), Vector(248.0), Vector(249.0)), Vector(Vector(250.0), Vector(251.0)))), 252.0))), s2(s1(Vector(s0(Vector(Vector(253.0), Vector(254.0), Vector(255.0)), Vector(Vector(256.0), Vector(257.0)))), 258.0), Vector(s1(Vector(s0(Vector(Vector(259.0), Vector(260.0), Vector(261.0)), Vector(Vector(262.0), Vector(263.0)))), 264.0))), Vector(Vector(265.0), Vector(266.0), Vector(267.0)))), s0(Vector(Vector(268.0), Vector(269.0), Vector(270.0)), Vector(Vector(271.0), Vector(272.0)))), s9(Vector(s3(s2(s1(Vector(s0(Vector(Vector(273.0), Vector(274.0), Vector(275.0)), Vector(Vector(276.0), Vector(277.0)))), 278.0), Vector(s1(Vector(s0(Vector(Vector(279.0), Vector(280.0), Vector(281.0)), Vector(Vector(282.0), Vector(283.0)))), 284.0))), s2(s1(Vector(s0(Vector(Vector(285.0), Vector(286.0), Vector(287.0)), Vector(Vector(288.0), Vector(289.0)))), 290.0), Vector(s1(Vector(s0(Vector(Vector(291.0), Vector(292.0), Vector(293.0)), Vector(Vector(294.0), Vector(295.0)))), 296.0))), Vector(Vector(297.0), Vector(298.0), Vector(299.0))), s3(s2(s1(Vector(s0(Vector(Vector(300.0), Vector(301.0), Vector(302.0)), Vector(Vector(303.0), Vector(304.0)))), 305.0), Vector(s1(Vector(s0(Vector(Vector(306.0), Vector(307.0), Vector(308.0)), Vector(Vector(309.0), Vector(310.0)))), 311.0))), s2(s1(Vector(s0(Vector(Vector(312.0), Vector(313.0), Vector(314.0)), Vector(Vector(315.0), Vector(316.0)))), 317.0), Vector(s1(Vector(s0(Vector(Vector(318.0), Vector(319.0), Vector(320.0)), Vector(Vector(321.0), Vector(322.0)))), 323.0))), Vector(Vector(324.0), Vector(325.0), Vector(326.0)))), s0(Vector(Vector(327.0), Vector(328.0), Vector(329.0)), Vector(Vector(330.0), Vector(331.0))))), s12(s9(Vector(s3(s2(s1(Vector(s0(Vector(Vector(332.0), Vector(333.0), Vector(334.0)), Vector(Vector(335.0), Vector(336.0)))), 337.0), Vector(s1(Vector(s0(Vector(Vector(338.0), Vector(339.0), Vector(340.0)), Vector(Vector(341.0), Vector(342.0)))), 343.0))), s2(s1(Vector(s0(Vector(Vector(344.0), Vector(345.0), Vector(346.0)), Vector(Vector(347.0), Vector(348.0)))), 349.0), Vector(s1(Vector(s0(Vector(Vector(350.0), Vector(351.0), Vector(352.0)), Vector(Vector(353.0), Vector(354.0)))), 355.0))), Vector(Vector(356.0), Vector(357.0), Vector(358.0))), s3(s2(s1(Vector(s0(Vector(Vector(359.0), Vector(360.0), Vector(361.0)), Vector(Vector(362.0), Vector(363.0)))), 364.0), Vector(s1(Vector(s0(Vector(Vector(365.0), Vector(366.0), Vector(367.0)), Vector(Vector(368.0), Vector(369.0)))), 370.0))), s2(s1(Vector(s0(Vector(Vector(371.0), Vector(372.0), Vector(373.0)), Vector(Vector(374.0), Vector(375.0)))), 376.0), Vector(s1(Vector(s0(Vector(Vector(377.0), Vector(378.0), Vector(379.0)), Vector(Vector(380.0), Vector(381.0)))), 382.0))), Vector(Vector(383.0), Vector(384.0), Vector(385.0)))), s0(Vector(Vector(386.0), Vector(387.0), Vector(388.0)), Vector(Vector(389.0), Vector(390.0)))), s9(Vector(s3(s2(s1(Vector(s0(Vector(Vector(391.0), Vector(392.0), Vector(393.0)), Vector(Vector(394.0), Vector(395.0)))), 396.0), Vector(s1(Vector(s0(Vector(Vector(397.0), Vector(398.0), Vector(399.0)), Vector(Vector(400.0), Vector(401.0)))), 402.0))), s2(s1(Vector(s0(Vector(Vector(403.0), Vector(404.0), Vector(405.0)), Vector(Vector(406.0), Vector(407.0)))), 408.0), Vector(s1(Vector(s0(Vector(Vector(409.0), Vector(410.0), Vector(411.0)), Vector(Vector(412.0), Vector(413.0)))), 414.0))), Vector(Vector(415.0), Vector(416.0), Vector(417.0))), s3(s2(s1(Vector(s0(Vector(Vector(418.0), Vector(419.0), Vector(420.0)), Vector(Vector(421.0), Vector(422.0)))), 423.0), Vector(s1(Vector(s0(Vector(Vector(424.0), Vector(425.0), Vector(426.0)), Vector(Vector(427.0), Vector(428.0)))), 429.0))), s2(s1(Vector(s0(Vector(Vector(430.0), Vector(431.0), Vector(432.0)), Vector(Vector(433.0), Vector(434.0)))), 435.0), Vector(s1(Vector(s0(Vector(Vector(436.0), Vector(437.0), Vector(438.0)), Vector(Vector(439.0), Vector(440.0)))), 441.0))), Vector(Vector(442.0), Vector(443.0), Vector(444.0)))), s0(Vector(Vector(445.0), Vector(446.0), Vector(447.0)), Vector(Vector(448.0), Vector(449.0))))))
    val v2: Vector[s7] = Vector(s7(s6(Vector(s1(Vector(s0(Vector(Vector(450.0), Vector(451.0), Vector(452.0)), Vector(Vector(453.0), Vector(454.0)))), 455.0), s1(Vector(s0(Vector(Vector(456.0), Vector(457.0), Vector(458.0)), Vector(Vector(459.0), Vector(460.0)))), 461.0), s1(Vector(s0(Vector(Vector(462.0), Vector(463.0), Vector(464.0)), Vector(Vector(465.0), Vector(466.0)))), 467.0)), s5(s3(s2(s1(Vector(s0(Vector(Vector(468.0), Vector(469.0), Vector(470.0)), Vector(Vector(471.0), Vector(472.0)))), 473.0), Vector(s1(Vector(s0(Vector(Vector(474.0), Vector(475.0), Vector(476.0)), Vector(Vector(477.0), Vector(478.0)))), 479.0))), s2(s1(Vector(s0(Vector(Vector(480.0), Vector(481.0), Vector(482.0)), Vector(Vector(483.0), Vector(484.0)))), 485.0), Vector(s1(Vector(s0(Vector(Vector(486.0), Vector(487.0), Vector(488.0)), Vector(Vector(489.0), Vector(490.0)))), 491.0))), Vector(Vector(492.0), Vector(493.0), Vector(494.0))), s4(Vector(s1(Vector(s0(Vector(Vector(495.0), Vector(496.0), Vector(497.0)), Vector(Vector(498.0), Vector(499.0)))), 500.0)), s1(Vector(s0(Vector(Vector(501.0), Vector(502.0), Vector(503.0)), Vector(Vector(504.0), Vector(505.0)))), 506.0)), Vector(s4(Vector(s1(Vector(s0(Vector(Vector(507.0), Vector(508.0), Vector(509.0)), Vector(Vector(510.0), Vector(511.0)))), 512.0)), s1(Vector(s0(Vector(Vector(513.0), Vector(514.0), Vector(515.0)), Vector(Vector(516.0), Vector(517.0)))), 518.0))))), Vector(s3(s2(s1(Vector(s0(Vector(Vector(519.0), Vector(520.0), Vector(521.0)), Vector(Vector(522.0), Vector(523.0)))), 524.0), Vector(s1(Vector(s0(Vector(Vector(525.0), Vector(526.0), Vector(527.0)), Vector(Vector(528.0), Vector(529.0)))), 530.0))), s2(s1(Vector(s0(Vector(Vector(531.0), Vector(532.0), Vector(533.0)), Vector(Vector(534.0), Vector(535.0)))), 536.0), Vector(s1(Vector(s0(Vector(Vector(537.0), Vector(538.0), Vector(539.0)), Vector(Vector(540.0), Vector(541.0)))), 542.0))), Vector(Vector(543.0), Vector(544.0), Vector(545.0))))), s7(s6(Vector(s1(Vector(s0(Vector(Vector(546.0), Vector(547.0), Vector(548.0)), Vector(Vector(549.0), Vector(550.0)))), 551.0), s1(Vector(s0(Vector(Vector(552.0), Vector(553.0), Vector(554.0)), Vector(Vector(555.0), Vector(556.0)))), 557.0), s1(Vector(s0(Vector(Vector(558.0), Vector(559.0), Vector(560.0)), Vector(Vector(561.0), Vector(562.0)))), 563.0)), s5(s3(s2(s1(Vector(s0(Vector(Vector(564.0), Vector(565.0), Vector(566.0)), Vector(Vector(567.0), Vector(568.0)))), 569.0), Vector(s1(Vector(s0(Vector(Vector(570.0), Vector(571.0), Vector(572.0)), Vector(Vector(573.0), Vector(574.0)))), 575.0))), s2(s1(Vector(s0(Vector(Vector(576.0), Vector(577.0), Vector(578.0)), Vector(Vector(579.0), Vector(580.0)))), 581.0), Vector(s1(Vector(s0(Vector(Vector(582.0), Vector(583.0), Vector(584.0)), Vector(Vector(585.0), Vector(586.0)))), 587.0))), Vector(Vector(588.0), Vector(589.0), Vector(590.0))), s4(Vector(s1(Vector(s0(Vector(Vector(591.0), Vector(592.0), Vector(593.0)), Vector(Vector(594.0), Vector(595.0)))), 596.0)), s1(Vector(s0(Vector(Vector(597.0), Vector(598.0), Vector(599.0)), Vector(Vector(600.0), Vector(601.0)))), 602.0)), Vector(s4(Vector(s1(Vector(s0(Vector(Vector(603.0), Vector(604.0), Vector(605.0)), Vector(Vector(606.0), Vector(607.0)))), 608.0)), s1(Vector(s0(Vector(Vector(609.0), Vector(610.0), Vector(611.0)), Vector(Vector(612.0), Vector(613.0)))), 614.0))))), Vector(s3(s2(s1(Vector(s0(Vector(Vector(615.0), Vector(616.0), Vector(617.0)), Vector(Vector(618.0), Vector(619.0)))), 620.0), Vector(s1(Vector(s0(Vector(Vector(621.0), Vector(622.0), Vector(623.0)), Vector(Vector(624.0), Vector(625.0)))), 626.0))), s2(s1(Vector(s0(Vector(Vector(627.0), Vector(628.0), Vector(629.0)), Vector(Vector(630.0), Vector(631.0)))), 632.0), Vector(s1(Vector(s0(Vector(Vector(633.0), Vector(634.0), Vector(635.0)), Vector(Vector(636.0), Vector(637.0)))), 638.0))), Vector(Vector(639.0), Vector(640.0), Vector(641.0))))))
    val v3: Double = 642.0
    val start = nanoTime()
    var result: Double = 642.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}