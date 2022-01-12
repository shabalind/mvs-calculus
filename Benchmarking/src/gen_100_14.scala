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
    p0: Vector[Vector[s1]],
    p1: Vector[s0]
  )
  case class s3 (
    p0: s1,
    p1: s1
  )
  case class s4 (
    p0: s2,
    p1: s3
  )
  case class s5 (
    p0: s3,
    p1: Vector[s4],
    p2: s0,
    p3: s4
  )
  case class s6 (
    p0: Vector[Vector[s0]],
    p1: Vector[s5]
  )
  case class s7 (
    p0: s6,
    p1: Vector[s1]
  )
  def f22(v0: s6): s6 = {
    val v6: Vector[Vector[s0]] = v0.p0
    val v8: Vector[s0] = v6(0)
    val v2: Vector[s5] = v0.p1
    val v4: Vector[Vector[s0]] = v0.p0
    val v11: Vector[s5] = v0.p1
    val v3: Vector[s0] = v6(0)
    var v1: Vector[s0] = v8
    val v14: Vector[s0] = v4(0)
    var v15: Vector[Vector[s0]] = v6
    val v9: Vector[s5] = v0.p1
    val v12: s0 = v3(0)
    val v13: Vector[Vector[s0]] = v0.p0
    val v26: s6 = s6(v4, v11)
    val v10: Vector[s5] = v26.p1
    val v27: s0 = v3(0)
    var v25: Vector[s0] = v8
    v25 = v25.updated(0, v12)
    v25 = v25.updated(0, v27)
    var v40: Vector[Vector[s0]] = v13
    var v18: Vector[s5] = v10
    var v72: s6 = v26
    v15 = v15.updated(0, v25)
    val v75: s0 = v14(0)
    val v39: Vector[s5] = v72.p1
    v72 = v72.copy(p0 = v15)
    val v30: s0 = v8(0)
    v40 = v40.updated(0, v25)
    v72 = v72.copy(p0 = v6)
    v72 = v72.copy(p0 = v15)
    v72 = v72.copy(p1 = v39)
    val v34: Vector[s5] = v72.p1
    var v35: s6 = v0
    v25 = v25.updated(0, v75)
    val v80: s0 = v8(0)
    v25 = v25.updated(0, v75)
    v35 = v35.copy(p1 = v2)
    v35 = v35.copy(p1 = v9)
    v15 = v15.updated(0, v8)
    v1 = v1.updated(0, v30)
    v72 = v72.copy(p1 = v10)
    v25 = v25.updated(0, v80)
    v72 = v72.copy(p1 = v10)
    v35 = v35.copy(p1 = v18)
    v40 = v40.updated(0, v1)
    v72 = v72.copy(p0 = v40)
    val v98: Vector[s0] = v15(0)
    v35 = v35.copy(p1 = v34)
    v1 = v1.updated(0, v75)
    v15 = v15.updated(0, v1)
    v40 = v40.updated(0, v98)
    v35
  }
  @noinline
  def f0(v0: Vector[s7], v1: Double): Double = {
    val v3: s7 = v0(0)
    val v6: s6 = v3.p0
    val v2: s6 = f22(v6)
    val v39: Vector[Vector[s0]] = v2.p0
    val v51: Vector[s0] = v39(0)
    val v75: s0 = v51(0)
    val v117: Vector[Vector[Double]] = v75.p0
    val v112: Vector[Double] = v117(0)
    val v66: Double = v112(0)
    v66
  }
  def benchmark(): Unit = {
    val v0: Vector[s7] = Vector(s7(s6(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0))))), Vector(s5(s3(s1(s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0))), Vector(s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0))), s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0))))), s1(s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0))), Vector(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0))), s0(Vector(Vector(28.0), Vector(29.0), Vector(30.0)), Vector(Vector(31.0))), s0(Vector(Vector(32.0), Vector(33.0), Vector(34.0)), Vector(Vector(35.0)))))), Vector(s4(s2(Vector(Vector(s1(s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0))), Vector(s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0))), s0(Vector(Vector(44.0), Vector(45.0), Vector(46.0)), Vector(Vector(47.0))), s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0))))))), Vector(s0(Vector(Vector(52.0), Vector(53.0), Vector(54.0)), Vector(Vector(55.0))), s0(Vector(Vector(56.0), Vector(57.0), Vector(58.0)), Vector(Vector(59.0))), s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0))))), s3(s1(s0(Vector(Vector(64.0), Vector(65.0), Vector(66.0)), Vector(Vector(67.0))), Vector(s0(Vector(Vector(68.0), Vector(69.0), Vector(70.0)), Vector(Vector(71.0))), s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)), Vector(Vector(75.0))), s0(Vector(Vector(76.0), Vector(77.0), Vector(78.0)), Vector(Vector(79.0))))), s1(s0(Vector(Vector(80.0), Vector(81.0), Vector(82.0)), Vector(Vector(83.0))), Vector(s0(Vector(Vector(84.0), Vector(85.0), Vector(86.0)), Vector(Vector(87.0))), s0(Vector(Vector(88.0), Vector(89.0), Vector(90.0)), Vector(Vector(91.0))), s0(Vector(Vector(92.0), Vector(93.0), Vector(94.0)), Vector(Vector(95.0))))))), s4(s2(Vector(Vector(s1(s0(Vector(Vector(96.0), Vector(97.0), Vector(98.0)), Vector(Vector(99.0))), Vector(s0(Vector(Vector(100.0), Vector(101.0), Vector(102.0)), Vector(Vector(103.0))), s0(Vector(Vector(104.0), Vector(105.0), Vector(106.0)), Vector(Vector(107.0))), s0(Vector(Vector(108.0), Vector(109.0), Vector(110.0)), Vector(Vector(111.0))))))), Vector(s0(Vector(Vector(112.0), Vector(113.0), Vector(114.0)), Vector(Vector(115.0))), s0(Vector(Vector(116.0), Vector(117.0), Vector(118.0)), Vector(Vector(119.0))), s0(Vector(Vector(120.0), Vector(121.0), Vector(122.0)), Vector(Vector(123.0))))), s3(s1(s0(Vector(Vector(124.0), Vector(125.0), Vector(126.0)), Vector(Vector(127.0))), Vector(s0(Vector(Vector(128.0), Vector(129.0), Vector(130.0)), Vector(Vector(131.0))), s0(Vector(Vector(132.0), Vector(133.0), Vector(134.0)), Vector(Vector(135.0))), s0(Vector(Vector(136.0), Vector(137.0), Vector(138.0)), Vector(Vector(139.0))))), s1(s0(Vector(Vector(140.0), Vector(141.0), Vector(142.0)), Vector(Vector(143.0))), Vector(s0(Vector(Vector(144.0), Vector(145.0), Vector(146.0)), Vector(Vector(147.0))), s0(Vector(Vector(148.0), Vector(149.0), Vector(150.0)), Vector(Vector(151.0))), s0(Vector(Vector(152.0), Vector(153.0), Vector(154.0)), Vector(Vector(155.0)))))))), s0(Vector(Vector(156.0), Vector(157.0), Vector(158.0)), Vector(Vector(159.0))), s4(s2(Vector(Vector(s1(s0(Vector(Vector(160.0), Vector(161.0), Vector(162.0)), Vector(Vector(163.0))), Vector(s0(Vector(Vector(164.0), Vector(165.0), Vector(166.0)), Vector(Vector(167.0))), s0(Vector(Vector(168.0), Vector(169.0), Vector(170.0)), Vector(Vector(171.0))), s0(Vector(Vector(172.0), Vector(173.0), Vector(174.0)), Vector(Vector(175.0))))))), Vector(s0(Vector(Vector(176.0), Vector(177.0), Vector(178.0)), Vector(Vector(179.0))), s0(Vector(Vector(180.0), Vector(181.0), Vector(182.0)), Vector(Vector(183.0))), s0(Vector(Vector(184.0), Vector(185.0), Vector(186.0)), Vector(Vector(187.0))))), s3(s1(s0(Vector(Vector(188.0), Vector(189.0), Vector(190.0)), Vector(Vector(191.0))), Vector(s0(Vector(Vector(192.0), Vector(193.0), Vector(194.0)), Vector(Vector(195.0))), s0(Vector(Vector(196.0), Vector(197.0), Vector(198.0)), Vector(Vector(199.0))), s0(Vector(Vector(200.0), Vector(201.0), Vector(202.0)), Vector(Vector(203.0))))), s1(s0(Vector(Vector(204.0), Vector(205.0), Vector(206.0)), Vector(Vector(207.0))), Vector(s0(Vector(Vector(208.0), Vector(209.0), Vector(210.0)), Vector(Vector(211.0))), s0(Vector(Vector(212.0), Vector(213.0), Vector(214.0)), Vector(Vector(215.0))), s0(Vector(Vector(216.0), Vector(217.0), Vector(218.0)), Vector(Vector(219.0)))))))), s5(s3(s1(s0(Vector(Vector(220.0), Vector(221.0), Vector(222.0)), Vector(Vector(223.0))), Vector(s0(Vector(Vector(224.0), Vector(225.0), Vector(226.0)), Vector(Vector(227.0))), s0(Vector(Vector(228.0), Vector(229.0), Vector(230.0)), Vector(Vector(231.0))), s0(Vector(Vector(232.0), Vector(233.0), Vector(234.0)), Vector(Vector(235.0))))), s1(s0(Vector(Vector(236.0), Vector(237.0), Vector(238.0)), Vector(Vector(239.0))), Vector(s0(Vector(Vector(240.0), Vector(241.0), Vector(242.0)), Vector(Vector(243.0))), s0(Vector(Vector(244.0), Vector(245.0), Vector(246.0)), Vector(Vector(247.0))), s0(Vector(Vector(248.0), Vector(249.0), Vector(250.0)), Vector(Vector(251.0)))))), Vector(s4(s2(Vector(Vector(s1(s0(Vector(Vector(252.0), Vector(253.0), Vector(254.0)), Vector(Vector(255.0))), Vector(s0(Vector(Vector(256.0), Vector(257.0), Vector(258.0)), Vector(Vector(259.0))), s0(Vector(Vector(260.0), Vector(261.0), Vector(262.0)), Vector(Vector(263.0))), s0(Vector(Vector(264.0), Vector(265.0), Vector(266.0)), Vector(Vector(267.0))))))), Vector(s0(Vector(Vector(268.0), Vector(269.0), Vector(270.0)), Vector(Vector(271.0))), s0(Vector(Vector(272.0), Vector(273.0), Vector(274.0)), Vector(Vector(275.0))), s0(Vector(Vector(276.0), Vector(277.0), Vector(278.0)), Vector(Vector(279.0))))), s3(s1(s0(Vector(Vector(280.0), Vector(281.0), Vector(282.0)), Vector(Vector(283.0))), Vector(s0(Vector(Vector(284.0), Vector(285.0), Vector(286.0)), Vector(Vector(287.0))), s0(Vector(Vector(288.0), Vector(289.0), Vector(290.0)), Vector(Vector(291.0))), s0(Vector(Vector(292.0), Vector(293.0), Vector(294.0)), Vector(Vector(295.0))))), s1(s0(Vector(Vector(296.0), Vector(297.0), Vector(298.0)), Vector(Vector(299.0))), Vector(s0(Vector(Vector(300.0), Vector(301.0), Vector(302.0)), Vector(Vector(303.0))), s0(Vector(Vector(304.0), Vector(305.0), Vector(306.0)), Vector(Vector(307.0))), s0(Vector(Vector(308.0), Vector(309.0), Vector(310.0)), Vector(Vector(311.0))))))), s4(s2(Vector(Vector(s1(s0(Vector(Vector(312.0), Vector(313.0), Vector(314.0)), Vector(Vector(315.0))), Vector(s0(Vector(Vector(316.0), Vector(317.0), Vector(318.0)), Vector(Vector(319.0))), s0(Vector(Vector(320.0), Vector(321.0), Vector(322.0)), Vector(Vector(323.0))), s0(Vector(Vector(324.0), Vector(325.0), Vector(326.0)), Vector(Vector(327.0))))))), Vector(s0(Vector(Vector(328.0), Vector(329.0), Vector(330.0)), Vector(Vector(331.0))), s0(Vector(Vector(332.0), Vector(333.0), Vector(334.0)), Vector(Vector(335.0))), s0(Vector(Vector(336.0), Vector(337.0), Vector(338.0)), Vector(Vector(339.0))))), s3(s1(s0(Vector(Vector(340.0), Vector(341.0), Vector(342.0)), Vector(Vector(343.0))), Vector(s0(Vector(Vector(344.0), Vector(345.0), Vector(346.0)), Vector(Vector(347.0))), s0(Vector(Vector(348.0), Vector(349.0), Vector(350.0)), Vector(Vector(351.0))), s0(Vector(Vector(352.0), Vector(353.0), Vector(354.0)), Vector(Vector(355.0))))), s1(s0(Vector(Vector(356.0), Vector(357.0), Vector(358.0)), Vector(Vector(359.0))), Vector(s0(Vector(Vector(360.0), Vector(361.0), Vector(362.0)), Vector(Vector(363.0))), s0(Vector(Vector(364.0), Vector(365.0), Vector(366.0)), Vector(Vector(367.0))), s0(Vector(Vector(368.0), Vector(369.0), Vector(370.0)), Vector(Vector(371.0)))))))), s0(Vector(Vector(372.0), Vector(373.0), Vector(374.0)), Vector(Vector(375.0))), s4(s2(Vector(Vector(s1(s0(Vector(Vector(376.0), Vector(377.0), Vector(378.0)), Vector(Vector(379.0))), Vector(s0(Vector(Vector(380.0), Vector(381.0), Vector(382.0)), Vector(Vector(383.0))), s0(Vector(Vector(384.0), Vector(385.0), Vector(386.0)), Vector(Vector(387.0))), s0(Vector(Vector(388.0), Vector(389.0), Vector(390.0)), Vector(Vector(391.0))))))), Vector(s0(Vector(Vector(392.0), Vector(393.0), Vector(394.0)), Vector(Vector(395.0))), s0(Vector(Vector(396.0), Vector(397.0), Vector(398.0)), Vector(Vector(399.0))), s0(Vector(Vector(400.0), Vector(401.0), Vector(402.0)), Vector(Vector(403.0))))), s3(s1(s0(Vector(Vector(404.0), Vector(405.0), Vector(406.0)), Vector(Vector(407.0))), Vector(s0(Vector(Vector(408.0), Vector(409.0), Vector(410.0)), Vector(Vector(411.0))), s0(Vector(Vector(412.0), Vector(413.0), Vector(414.0)), Vector(Vector(415.0))), s0(Vector(Vector(416.0), Vector(417.0), Vector(418.0)), Vector(Vector(419.0))))), s1(s0(Vector(Vector(420.0), Vector(421.0), Vector(422.0)), Vector(Vector(423.0))), Vector(s0(Vector(Vector(424.0), Vector(425.0), Vector(426.0)), Vector(Vector(427.0))), s0(Vector(Vector(428.0), Vector(429.0), Vector(430.0)), Vector(Vector(431.0))), s0(Vector(Vector(432.0), Vector(433.0), Vector(434.0)), Vector(Vector(435.0)))))))), s5(s3(s1(s0(Vector(Vector(436.0), Vector(437.0), Vector(438.0)), Vector(Vector(439.0))), Vector(s0(Vector(Vector(440.0), Vector(441.0), Vector(442.0)), Vector(Vector(443.0))), s0(Vector(Vector(444.0), Vector(445.0), Vector(446.0)), Vector(Vector(447.0))), s0(Vector(Vector(448.0), Vector(449.0), Vector(450.0)), Vector(Vector(451.0))))), s1(s0(Vector(Vector(452.0), Vector(453.0), Vector(454.0)), Vector(Vector(455.0))), Vector(s0(Vector(Vector(456.0), Vector(457.0), Vector(458.0)), Vector(Vector(459.0))), s0(Vector(Vector(460.0), Vector(461.0), Vector(462.0)), Vector(Vector(463.0))), s0(Vector(Vector(464.0), Vector(465.0), Vector(466.0)), Vector(Vector(467.0)))))), Vector(s4(s2(Vector(Vector(s1(s0(Vector(Vector(468.0), Vector(469.0), Vector(470.0)), Vector(Vector(471.0))), Vector(s0(Vector(Vector(472.0), Vector(473.0), Vector(474.0)), Vector(Vector(475.0))), s0(Vector(Vector(476.0), Vector(477.0), Vector(478.0)), Vector(Vector(479.0))), s0(Vector(Vector(480.0), Vector(481.0), Vector(482.0)), Vector(Vector(483.0))))))), Vector(s0(Vector(Vector(484.0), Vector(485.0), Vector(486.0)), Vector(Vector(487.0))), s0(Vector(Vector(488.0), Vector(489.0), Vector(490.0)), Vector(Vector(491.0))), s0(Vector(Vector(492.0), Vector(493.0), Vector(494.0)), Vector(Vector(495.0))))), s3(s1(s0(Vector(Vector(496.0), Vector(497.0), Vector(498.0)), Vector(Vector(499.0))), Vector(s0(Vector(Vector(500.0), Vector(501.0), Vector(502.0)), Vector(Vector(503.0))), s0(Vector(Vector(504.0), Vector(505.0), Vector(506.0)), Vector(Vector(507.0))), s0(Vector(Vector(508.0), Vector(509.0), Vector(510.0)), Vector(Vector(511.0))))), s1(s0(Vector(Vector(512.0), Vector(513.0), Vector(514.0)), Vector(Vector(515.0))), Vector(s0(Vector(Vector(516.0), Vector(517.0), Vector(518.0)), Vector(Vector(519.0))), s0(Vector(Vector(520.0), Vector(521.0), Vector(522.0)), Vector(Vector(523.0))), s0(Vector(Vector(524.0), Vector(525.0), Vector(526.0)), Vector(Vector(527.0))))))), s4(s2(Vector(Vector(s1(s0(Vector(Vector(528.0), Vector(529.0), Vector(530.0)), Vector(Vector(531.0))), Vector(s0(Vector(Vector(532.0), Vector(533.0), Vector(534.0)), Vector(Vector(535.0))), s0(Vector(Vector(536.0), Vector(537.0), Vector(538.0)), Vector(Vector(539.0))), s0(Vector(Vector(540.0), Vector(541.0), Vector(542.0)), Vector(Vector(543.0))))))), Vector(s0(Vector(Vector(544.0), Vector(545.0), Vector(546.0)), Vector(Vector(547.0))), s0(Vector(Vector(548.0), Vector(549.0), Vector(550.0)), Vector(Vector(551.0))), s0(Vector(Vector(552.0), Vector(553.0), Vector(554.0)), Vector(Vector(555.0))))), s3(s1(s0(Vector(Vector(556.0), Vector(557.0), Vector(558.0)), Vector(Vector(559.0))), Vector(s0(Vector(Vector(560.0), Vector(561.0), Vector(562.0)), Vector(Vector(563.0))), s0(Vector(Vector(564.0), Vector(565.0), Vector(566.0)), Vector(Vector(567.0))), s0(Vector(Vector(568.0), Vector(569.0), Vector(570.0)), Vector(Vector(571.0))))), s1(s0(Vector(Vector(572.0), Vector(573.0), Vector(574.0)), Vector(Vector(575.0))), Vector(s0(Vector(Vector(576.0), Vector(577.0), Vector(578.0)), Vector(Vector(579.0))), s0(Vector(Vector(580.0), Vector(581.0), Vector(582.0)), Vector(Vector(583.0))), s0(Vector(Vector(584.0), Vector(585.0), Vector(586.0)), Vector(Vector(587.0)))))))), s0(Vector(Vector(588.0), Vector(589.0), Vector(590.0)), Vector(Vector(591.0))), s4(s2(Vector(Vector(s1(s0(Vector(Vector(592.0), Vector(593.0), Vector(594.0)), Vector(Vector(595.0))), Vector(s0(Vector(Vector(596.0), Vector(597.0), Vector(598.0)), Vector(Vector(599.0))), s0(Vector(Vector(600.0), Vector(601.0), Vector(602.0)), Vector(Vector(603.0))), s0(Vector(Vector(604.0), Vector(605.0), Vector(606.0)), Vector(Vector(607.0))))))), Vector(s0(Vector(Vector(608.0), Vector(609.0), Vector(610.0)), Vector(Vector(611.0))), s0(Vector(Vector(612.0), Vector(613.0), Vector(614.0)), Vector(Vector(615.0))), s0(Vector(Vector(616.0), Vector(617.0), Vector(618.0)), Vector(Vector(619.0))))), s3(s1(s0(Vector(Vector(620.0), Vector(621.0), Vector(622.0)), Vector(Vector(623.0))), Vector(s0(Vector(Vector(624.0), Vector(625.0), Vector(626.0)), Vector(Vector(627.0))), s0(Vector(Vector(628.0), Vector(629.0), Vector(630.0)), Vector(Vector(631.0))), s0(Vector(Vector(632.0), Vector(633.0), Vector(634.0)), Vector(Vector(635.0))))), s1(s0(Vector(Vector(636.0), Vector(637.0), Vector(638.0)), Vector(Vector(639.0))), Vector(s0(Vector(Vector(640.0), Vector(641.0), Vector(642.0)), Vector(Vector(643.0))), s0(Vector(Vector(644.0), Vector(645.0), Vector(646.0)), Vector(Vector(647.0))), s0(Vector(Vector(648.0), Vector(649.0), Vector(650.0)), Vector(Vector(651.0)))))))))), Vector(s1(s0(Vector(Vector(652.0), Vector(653.0), Vector(654.0)), Vector(Vector(655.0))), Vector(s0(Vector(Vector(656.0), Vector(657.0), Vector(658.0)), Vector(Vector(659.0))), s0(Vector(Vector(660.0), Vector(661.0), Vector(662.0)), Vector(Vector(663.0))), s0(Vector(Vector(664.0), Vector(665.0), Vector(666.0)), Vector(Vector(667.0))))))))
    val v1: Double = 668.0
    val start = nanoTime()
    var result: Double = 668.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}