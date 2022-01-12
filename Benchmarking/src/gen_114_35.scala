import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s2 (
    p0: s1,
    p1: s0
  )
  case class s3 (
    p0: s1,
    p1: s0
  )
  case class s4 (
    p0: s0,
    p1: s2,
    p2: Vector[s1]
  )
  case class s5 (
    p0: s1,
    p1: Double,
    p2: s2
  )
  case class s7 (
    p0: Vector[s4],
    p1: Vector[s5]
  )
  case class s9 (
    p0: Vector[Vector[s5]],
    p1: s3
  )
  case class s11 (
    p0: Vector[s9],
    p1: Vector[s5],
    p2: Vector[s7],
    p3: Vector[Vector[s5]],
    p4: s7,
    p5: s7
  )
  @noinline
  def f0(v0: s11, v1: Double): Double = {
    var v7: s11 = v0
    val v3: Vector[s5] = v7.p1
    val v5: Vector[Vector[s5]] = v7.p3
    val v8: s7 = v7.p4
    v7 = v7.copy(p5 = v8)
    v7 = v7.copy(p1 = v3)
    val v23: s5 = v3(0)
    v7 = v7.copy(p4 = v8)
    val v18: s1 = v23.p0
    val v42: Vector[s0] = v18.p1
    v7 = v7.copy(p3 = v5)
    val v29: s0 = v42(1)
    val v44: s0 = v18.p0
    val v49: Vector[Vector[Double]] = v44.p1
    val v122: s0 = v42(0)
    var v84: s0 = v29
    val v60: Vector[Double] = v49(0)
    val v135: Vector[Vector[Double]] = v84.p1
    v84 = v122
    val v116: Vector[Double] = v135(0)
    val v217: Double = v60(0)
    val v176: Double = v116(0)
    val v140: Double = v176 / v217
    v140
  }
  def benchmark(): Unit = {
    val v0: s11 = s11(Vector(s9(Vector(Vector(s5(s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0))), Vector(s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0))), s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0))))), 12.0, s2(s1(s0(Vector(Vector(13.0), Vector(14.0), Vector(15.0)), Vector(Vector(16.0))), Vector(s0(Vector(Vector(17.0), Vector(18.0), Vector(19.0)), Vector(Vector(20.0))), s0(Vector(Vector(21.0), Vector(22.0), Vector(23.0)), Vector(Vector(24.0))))), s0(Vector(Vector(25.0), Vector(26.0), Vector(27.0)), Vector(Vector(28.0)))))), Vector(s5(s1(s0(Vector(Vector(29.0), Vector(30.0), Vector(31.0)), Vector(Vector(32.0))), Vector(s0(Vector(Vector(33.0), Vector(34.0), Vector(35.0)), Vector(Vector(36.0))), s0(Vector(Vector(37.0), Vector(38.0), Vector(39.0)), Vector(Vector(40.0))))), 41.0, s2(s1(s0(Vector(Vector(42.0), Vector(43.0), Vector(44.0)), Vector(Vector(45.0))), Vector(s0(Vector(Vector(46.0), Vector(47.0), Vector(48.0)), Vector(Vector(49.0))), s0(Vector(Vector(50.0), Vector(51.0), Vector(52.0)), Vector(Vector(53.0))))), s0(Vector(Vector(54.0), Vector(55.0), Vector(56.0)), Vector(Vector(57.0)))))), Vector(s5(s1(s0(Vector(Vector(58.0), Vector(59.0), Vector(60.0)), Vector(Vector(61.0))), Vector(s0(Vector(Vector(62.0), Vector(63.0), Vector(64.0)), Vector(Vector(65.0))), s0(Vector(Vector(66.0), Vector(67.0), Vector(68.0)), Vector(Vector(69.0))))), 70.0, s2(s1(s0(Vector(Vector(71.0), Vector(72.0), Vector(73.0)), Vector(Vector(74.0))), Vector(s0(Vector(Vector(75.0), Vector(76.0), Vector(77.0)), Vector(Vector(78.0))), s0(Vector(Vector(79.0), Vector(80.0), Vector(81.0)), Vector(Vector(82.0))))), s0(Vector(Vector(83.0), Vector(84.0), Vector(85.0)), Vector(Vector(86.0))))))), s3(s1(s0(Vector(Vector(87.0), Vector(88.0), Vector(89.0)), Vector(Vector(90.0))), Vector(s0(Vector(Vector(91.0), Vector(92.0), Vector(93.0)), Vector(Vector(94.0))), s0(Vector(Vector(95.0), Vector(96.0), Vector(97.0)), Vector(Vector(98.0))))), s0(Vector(Vector(99.0), Vector(100.0), Vector(101.0)), Vector(Vector(102.0)))))), Vector(s5(s1(s0(Vector(Vector(103.0), Vector(104.0), Vector(105.0)), Vector(Vector(106.0))), Vector(s0(Vector(Vector(107.0), Vector(108.0), Vector(109.0)), Vector(Vector(110.0))), s0(Vector(Vector(111.0), Vector(112.0), Vector(113.0)), Vector(Vector(114.0))))), 115.0, s2(s1(s0(Vector(Vector(116.0), Vector(117.0), Vector(118.0)), Vector(Vector(119.0))), Vector(s0(Vector(Vector(120.0), Vector(121.0), Vector(122.0)), Vector(Vector(123.0))), s0(Vector(Vector(124.0), Vector(125.0), Vector(126.0)), Vector(Vector(127.0))))), s0(Vector(Vector(128.0), Vector(129.0), Vector(130.0)), Vector(Vector(131.0)))))), Vector(s7(Vector(s4(s0(Vector(Vector(132.0), Vector(133.0), Vector(134.0)), Vector(Vector(135.0))), s2(s1(s0(Vector(Vector(136.0), Vector(137.0), Vector(138.0)), Vector(Vector(139.0))), Vector(s0(Vector(Vector(140.0), Vector(141.0), Vector(142.0)), Vector(Vector(143.0))), s0(Vector(Vector(144.0), Vector(145.0), Vector(146.0)), Vector(Vector(147.0))))), s0(Vector(Vector(148.0), Vector(149.0), Vector(150.0)), Vector(Vector(151.0)))), Vector(s1(s0(Vector(Vector(152.0), Vector(153.0), Vector(154.0)), Vector(Vector(155.0))), Vector(s0(Vector(Vector(156.0), Vector(157.0), Vector(158.0)), Vector(Vector(159.0))), s0(Vector(Vector(160.0), Vector(161.0), Vector(162.0)), Vector(Vector(163.0))))))), s4(s0(Vector(Vector(164.0), Vector(165.0), Vector(166.0)), Vector(Vector(167.0))), s2(s1(s0(Vector(Vector(168.0), Vector(169.0), Vector(170.0)), Vector(Vector(171.0))), Vector(s0(Vector(Vector(172.0), Vector(173.0), Vector(174.0)), Vector(Vector(175.0))), s0(Vector(Vector(176.0), Vector(177.0), Vector(178.0)), Vector(Vector(179.0))))), s0(Vector(Vector(180.0), Vector(181.0), Vector(182.0)), Vector(Vector(183.0)))), Vector(s1(s0(Vector(Vector(184.0), Vector(185.0), Vector(186.0)), Vector(Vector(187.0))), Vector(s0(Vector(Vector(188.0), Vector(189.0), Vector(190.0)), Vector(Vector(191.0))), s0(Vector(Vector(192.0), Vector(193.0), Vector(194.0)), Vector(Vector(195.0)))))))), Vector(s5(s1(s0(Vector(Vector(196.0), Vector(197.0), Vector(198.0)), Vector(Vector(199.0))), Vector(s0(Vector(Vector(200.0), Vector(201.0), Vector(202.0)), Vector(Vector(203.0))), s0(Vector(Vector(204.0), Vector(205.0), Vector(206.0)), Vector(Vector(207.0))))), 208.0, s2(s1(s0(Vector(Vector(209.0), Vector(210.0), Vector(211.0)), Vector(Vector(212.0))), Vector(s0(Vector(Vector(213.0), Vector(214.0), Vector(215.0)), Vector(Vector(216.0))), s0(Vector(Vector(217.0), Vector(218.0), Vector(219.0)), Vector(Vector(220.0))))), s0(Vector(Vector(221.0), Vector(222.0), Vector(223.0)), Vector(Vector(224.0))))))), s7(Vector(s4(s0(Vector(Vector(225.0), Vector(226.0), Vector(227.0)), Vector(Vector(228.0))), s2(s1(s0(Vector(Vector(229.0), Vector(230.0), Vector(231.0)), Vector(Vector(232.0))), Vector(s0(Vector(Vector(233.0), Vector(234.0), Vector(235.0)), Vector(Vector(236.0))), s0(Vector(Vector(237.0), Vector(238.0), Vector(239.0)), Vector(Vector(240.0))))), s0(Vector(Vector(241.0), Vector(242.0), Vector(243.0)), Vector(Vector(244.0)))), Vector(s1(s0(Vector(Vector(245.0), Vector(246.0), Vector(247.0)), Vector(Vector(248.0))), Vector(s0(Vector(Vector(249.0), Vector(250.0), Vector(251.0)), Vector(Vector(252.0))), s0(Vector(Vector(253.0), Vector(254.0), Vector(255.0)), Vector(Vector(256.0))))))), s4(s0(Vector(Vector(257.0), Vector(258.0), Vector(259.0)), Vector(Vector(260.0))), s2(s1(s0(Vector(Vector(261.0), Vector(262.0), Vector(263.0)), Vector(Vector(264.0))), Vector(s0(Vector(Vector(265.0), Vector(266.0), Vector(267.0)), Vector(Vector(268.0))), s0(Vector(Vector(269.0), Vector(270.0), Vector(271.0)), Vector(Vector(272.0))))), s0(Vector(Vector(273.0), Vector(274.0), Vector(275.0)), Vector(Vector(276.0)))), Vector(s1(s0(Vector(Vector(277.0), Vector(278.0), Vector(279.0)), Vector(Vector(280.0))), Vector(s0(Vector(Vector(281.0), Vector(282.0), Vector(283.0)), Vector(Vector(284.0))), s0(Vector(Vector(285.0), Vector(286.0), Vector(287.0)), Vector(Vector(288.0)))))))), Vector(s5(s1(s0(Vector(Vector(289.0), Vector(290.0), Vector(291.0)), Vector(Vector(292.0))), Vector(s0(Vector(Vector(293.0), Vector(294.0), Vector(295.0)), Vector(Vector(296.0))), s0(Vector(Vector(297.0), Vector(298.0), Vector(299.0)), Vector(Vector(300.0))))), 301.0, s2(s1(s0(Vector(Vector(302.0), Vector(303.0), Vector(304.0)), Vector(Vector(305.0))), Vector(s0(Vector(Vector(306.0), Vector(307.0), Vector(308.0)), Vector(Vector(309.0))), s0(Vector(Vector(310.0), Vector(311.0), Vector(312.0)), Vector(Vector(313.0))))), s0(Vector(Vector(314.0), Vector(315.0), Vector(316.0)), Vector(Vector(317.0))))))), s7(Vector(s4(s0(Vector(Vector(318.0), Vector(319.0), Vector(320.0)), Vector(Vector(321.0))), s2(s1(s0(Vector(Vector(322.0), Vector(323.0), Vector(324.0)), Vector(Vector(325.0))), Vector(s0(Vector(Vector(326.0), Vector(327.0), Vector(328.0)), Vector(Vector(329.0))), s0(Vector(Vector(330.0), Vector(331.0), Vector(332.0)), Vector(Vector(333.0))))), s0(Vector(Vector(334.0), Vector(335.0), Vector(336.0)), Vector(Vector(337.0)))), Vector(s1(s0(Vector(Vector(338.0), Vector(339.0), Vector(340.0)), Vector(Vector(341.0))), Vector(s0(Vector(Vector(342.0), Vector(343.0), Vector(344.0)), Vector(Vector(345.0))), s0(Vector(Vector(346.0), Vector(347.0), Vector(348.0)), Vector(Vector(349.0))))))), s4(s0(Vector(Vector(350.0), Vector(351.0), Vector(352.0)), Vector(Vector(353.0))), s2(s1(s0(Vector(Vector(354.0), Vector(355.0), Vector(356.0)), Vector(Vector(357.0))), Vector(s0(Vector(Vector(358.0), Vector(359.0), Vector(360.0)), Vector(Vector(361.0))), s0(Vector(Vector(362.0), Vector(363.0), Vector(364.0)), Vector(Vector(365.0))))), s0(Vector(Vector(366.0), Vector(367.0), Vector(368.0)), Vector(Vector(369.0)))), Vector(s1(s0(Vector(Vector(370.0), Vector(371.0), Vector(372.0)), Vector(Vector(373.0))), Vector(s0(Vector(Vector(374.0), Vector(375.0), Vector(376.0)), Vector(Vector(377.0))), s0(Vector(Vector(378.0), Vector(379.0), Vector(380.0)), Vector(Vector(381.0)))))))), Vector(s5(s1(s0(Vector(Vector(382.0), Vector(383.0), Vector(384.0)), Vector(Vector(385.0))), Vector(s0(Vector(Vector(386.0), Vector(387.0), Vector(388.0)), Vector(Vector(389.0))), s0(Vector(Vector(390.0), Vector(391.0), Vector(392.0)), Vector(Vector(393.0))))), 394.0, s2(s1(s0(Vector(Vector(395.0), Vector(396.0), Vector(397.0)), Vector(Vector(398.0))), Vector(s0(Vector(Vector(399.0), Vector(400.0), Vector(401.0)), Vector(Vector(402.0))), s0(Vector(Vector(403.0), Vector(404.0), Vector(405.0)), Vector(Vector(406.0))))), s0(Vector(Vector(407.0), Vector(408.0), Vector(409.0)), Vector(Vector(410.0)))))))), Vector(Vector(s5(s1(s0(Vector(Vector(411.0), Vector(412.0), Vector(413.0)), Vector(Vector(414.0))), Vector(s0(Vector(Vector(415.0), Vector(416.0), Vector(417.0)), Vector(Vector(418.0))), s0(Vector(Vector(419.0), Vector(420.0), Vector(421.0)), Vector(Vector(422.0))))), 423.0, s2(s1(s0(Vector(Vector(424.0), Vector(425.0), Vector(426.0)), Vector(Vector(427.0))), Vector(s0(Vector(Vector(428.0), Vector(429.0), Vector(430.0)), Vector(Vector(431.0))), s0(Vector(Vector(432.0), Vector(433.0), Vector(434.0)), Vector(Vector(435.0))))), s0(Vector(Vector(436.0), Vector(437.0), Vector(438.0)), Vector(Vector(439.0)))))), Vector(s5(s1(s0(Vector(Vector(440.0), Vector(441.0), Vector(442.0)), Vector(Vector(443.0))), Vector(s0(Vector(Vector(444.0), Vector(445.0), Vector(446.0)), Vector(Vector(447.0))), s0(Vector(Vector(448.0), Vector(449.0), Vector(450.0)), Vector(Vector(451.0))))), 452.0, s2(s1(s0(Vector(Vector(453.0), Vector(454.0), Vector(455.0)), Vector(Vector(456.0))), Vector(s0(Vector(Vector(457.0), Vector(458.0), Vector(459.0)), Vector(Vector(460.0))), s0(Vector(Vector(461.0), Vector(462.0), Vector(463.0)), Vector(Vector(464.0))))), s0(Vector(Vector(465.0), Vector(466.0), Vector(467.0)), Vector(Vector(468.0))))))), s7(Vector(s4(s0(Vector(Vector(469.0), Vector(470.0), Vector(471.0)), Vector(Vector(472.0))), s2(s1(s0(Vector(Vector(473.0), Vector(474.0), Vector(475.0)), Vector(Vector(476.0))), Vector(s0(Vector(Vector(477.0), Vector(478.0), Vector(479.0)), Vector(Vector(480.0))), s0(Vector(Vector(481.0), Vector(482.0), Vector(483.0)), Vector(Vector(484.0))))), s0(Vector(Vector(485.0), Vector(486.0), Vector(487.0)), Vector(Vector(488.0)))), Vector(s1(s0(Vector(Vector(489.0), Vector(490.0), Vector(491.0)), Vector(Vector(492.0))), Vector(s0(Vector(Vector(493.0), Vector(494.0), Vector(495.0)), Vector(Vector(496.0))), s0(Vector(Vector(497.0), Vector(498.0), Vector(499.0)), Vector(Vector(500.0))))))), s4(s0(Vector(Vector(501.0), Vector(502.0), Vector(503.0)), Vector(Vector(504.0))), s2(s1(s0(Vector(Vector(505.0), Vector(506.0), Vector(507.0)), Vector(Vector(508.0))), Vector(s0(Vector(Vector(509.0), Vector(510.0), Vector(511.0)), Vector(Vector(512.0))), s0(Vector(Vector(513.0), Vector(514.0), Vector(515.0)), Vector(Vector(516.0))))), s0(Vector(Vector(517.0), Vector(518.0), Vector(519.0)), Vector(Vector(520.0)))), Vector(s1(s0(Vector(Vector(521.0), Vector(522.0), Vector(523.0)), Vector(Vector(524.0))), Vector(s0(Vector(Vector(525.0), Vector(526.0), Vector(527.0)), Vector(Vector(528.0))), s0(Vector(Vector(529.0), Vector(530.0), Vector(531.0)), Vector(Vector(532.0)))))))), Vector(s5(s1(s0(Vector(Vector(533.0), Vector(534.0), Vector(535.0)), Vector(Vector(536.0))), Vector(s0(Vector(Vector(537.0), Vector(538.0), Vector(539.0)), Vector(Vector(540.0))), s0(Vector(Vector(541.0), Vector(542.0), Vector(543.0)), Vector(Vector(544.0))))), 545.0, s2(s1(s0(Vector(Vector(546.0), Vector(547.0), Vector(548.0)), Vector(Vector(549.0))), Vector(s0(Vector(Vector(550.0), Vector(551.0), Vector(552.0)), Vector(Vector(553.0))), s0(Vector(Vector(554.0), Vector(555.0), Vector(556.0)), Vector(Vector(557.0))))), s0(Vector(Vector(558.0), Vector(559.0), Vector(560.0)), Vector(Vector(561.0))))))), s7(Vector(s4(s0(Vector(Vector(562.0), Vector(563.0), Vector(564.0)), Vector(Vector(565.0))), s2(s1(s0(Vector(Vector(566.0), Vector(567.0), Vector(568.0)), Vector(Vector(569.0))), Vector(s0(Vector(Vector(570.0), Vector(571.0), Vector(572.0)), Vector(Vector(573.0))), s0(Vector(Vector(574.0), Vector(575.0), Vector(576.0)), Vector(Vector(577.0))))), s0(Vector(Vector(578.0), Vector(579.0), Vector(580.0)), Vector(Vector(581.0)))), Vector(s1(s0(Vector(Vector(582.0), Vector(583.0), Vector(584.0)), Vector(Vector(585.0))), Vector(s0(Vector(Vector(586.0), Vector(587.0), Vector(588.0)), Vector(Vector(589.0))), s0(Vector(Vector(590.0), Vector(591.0), Vector(592.0)), Vector(Vector(593.0))))))), s4(s0(Vector(Vector(594.0), Vector(595.0), Vector(596.0)), Vector(Vector(597.0))), s2(s1(s0(Vector(Vector(598.0), Vector(599.0), Vector(600.0)), Vector(Vector(601.0))), Vector(s0(Vector(Vector(602.0), Vector(603.0), Vector(604.0)), Vector(Vector(605.0))), s0(Vector(Vector(606.0), Vector(607.0), Vector(608.0)), Vector(Vector(609.0))))), s0(Vector(Vector(610.0), Vector(611.0), Vector(612.0)), Vector(Vector(613.0)))), Vector(s1(s0(Vector(Vector(614.0), Vector(615.0), Vector(616.0)), Vector(Vector(617.0))), Vector(s0(Vector(Vector(618.0), Vector(619.0), Vector(620.0)), Vector(Vector(621.0))), s0(Vector(Vector(622.0), Vector(623.0), Vector(624.0)), Vector(Vector(625.0)))))))), Vector(s5(s1(s0(Vector(Vector(626.0), Vector(627.0), Vector(628.0)), Vector(Vector(629.0))), Vector(s0(Vector(Vector(630.0), Vector(631.0), Vector(632.0)), Vector(Vector(633.0))), s0(Vector(Vector(634.0), Vector(635.0), Vector(636.0)), Vector(Vector(637.0))))), 638.0, s2(s1(s0(Vector(Vector(639.0), Vector(640.0), Vector(641.0)), Vector(Vector(642.0))), Vector(s0(Vector(Vector(643.0), Vector(644.0), Vector(645.0)), Vector(Vector(646.0))), s0(Vector(Vector(647.0), Vector(648.0), Vector(649.0)), Vector(Vector(650.0))))), s0(Vector(Vector(651.0), Vector(652.0), Vector(653.0)), Vector(Vector(654.0))))))))
    val v1: Double = 655.0
    val start = nanoTime()
    var result: Double = 655.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}