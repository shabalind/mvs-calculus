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
    p0: Vector[s1],
    p1: Vector[s1]
  )
  case class s3 (
    p0: Vector[Vector[s0]],
    p1: Vector[Vector[s2]]
  )
  case class s5 (
    p0: Vector[s3],
    p1: s2
  )
  def f86(v0: Double): Double = {
    var v7: Double = v0
    var v4: Double = v7
    var v6: Double = v0
    val v8: Vector[Double] = Vector(v7, v4, v6, v0, v4, v4, v6)
    var v2: Double = v7
    var v18: Vector[Double] = v8
    v18 = v18.updated(6, v0)
    val v15: Vector[Vector[Double]] = Vector(v18, v8, v8, v8, v8, v8)
    val v21: Vector[Double] = v15(0)
    val v19: Double = v21(4)
    v18 = v18.updated(4, v4)
    var v98: Double = v19
    var v63: Double = v98
    v7 = v2
    v63
  }
  def f45(v0: Double): Double = {
    val v1: Double = f86(v0)
    val v3: Double = f86(v1)
    val v7: Double = f86(v3)
    var v2: Double = v1
    val v8: Vector[Double] = Vector(v7, v2)
    val v11: Double = f86(v0)
    v2 = v11
    val v9: Vector[Vector[Double]] = Vector(v8, v8, v8, v8, v8)
    val v12: Double = f86(v1)
    val v20: Double = f86(v1)
    val v24: Double = v8(0)
    var v15: Vector[Double] = v8
    val v18: Double = v24 + v12
    var v22: Vector[Vector[Double]] = v9
    val v25: Vector[Double] = v22(3)
    var v29: Double = v1
    var v27: Vector[Double] = v15
    val v43: Double = v11 * v11
    v22 = v22.updated(3, v15)
    v27 = v15
    val v26: Vector[Vector[Vector[Double]]] = Vector(v22, v9, v22, v22, v22, v9)
    v15 = v15.updated(0, v18)
    val v21: Vector[Vector[Double]] = v26(1)
    val v14: Vector[Double] = v21(3)
    var v23: Vector[Double] = v14
    val v30: Vector[Double] = v21(2)
    v23 = v23.updated(0, v20)
    v15 = v15.updated(0, v2)
    var v87: Vector[Vector[Double]] = v21
    v87 = v87.updated(0, v15)
    v23 = v23.updated(1, v29)
    v87 = v87.updated(0, v27)
    v87 = v87.updated(1, v23)
    val v54: Double = f86(v43)
    v15 = v15.updated(1, v54)
    v87 = v87.updated(4, v30)
    val v76: Vector[Double] = v87(2)
    val v115: Double = v25(1)
    v15 = v15.updated(1, v115)
    val v221: Double = v76(0)
    v221
  }
  def f29(v0: Double): Double = {
    val v1: Double = f86(v0)
    val v3: Double = f45(v1)
    val v4: Double = f45(v0)
    var v7: Double = v3
    var v16: Double = v1
    var v8: Double = v4
    val v9: Double = f86(v8)
    var v14: Double = v4
    val v20: Double = f45(v7)
    v8 = v14
    var v23: Double = v16
    val v26: Double = v1 * v23
    var v13: Double = v26
    var v28: Double = v13
    val v39: Double = f86(v9)
    val v37: Double = f86(v1)
    val v55: Double = f45(v39)
    var v34: Double = v55
    val v66: Double = f86(v8)
    val v59: Vector[Double] = Vector(v66, v34, v28, v37, v3)
    val v50: Double = v59(4)
    val v51: Double = v20 / v7
    var v56: Vector[Double] = v59
    var v72: Vector[Double] = v56
    v56 = v56.updated(3, v50)
    val v161: Double = v72(0)
    v72 = v72.updated(4, v51)
    v161
  }
  @noinline
  def f0(v0: Vector[s0], v1: Vector[s5], v2: Vector[Vector[s3]], v3: Vector[Vector[s2]], v4: Double): Double = {
    var v5: Vector[s0] = v0
    val v19: Double = f45(v4)
    val v13: s0 = v5(0)
    val v15: Vector[Vector[Double]] = v13.p0
    var v27: Double = v19
    val v28: s0 = v5(2)
    val v95: s0 = s0(v15, v15)
    v5 = v5.updated(2, v13)
    val v72: Vector[Vector[Double]] = v95.p0
    var v174: Double = v27
    val v69: Vector[Double] = v72(1)
    v5 = v5.updated(1, v28)
    val v80: Double = v69(0)
    v27 = v80
    val v96: Double = f29(v174)
    v96
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0))), s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0))))
    val v1: Vector[s5] = Vector(s5(Vector(s3(Vector(Vector(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0)))), Vector(s0(Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0))))), Vector(Vector(s2(Vector(s1(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0))), Vector(s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0), Vector(27.0))))), s1(s0(Vector(Vector(28.0), Vector(29.0)), Vector(Vector(30.0), Vector(31.0))), Vector(s0(Vector(Vector(32.0), Vector(33.0)), Vector(Vector(34.0), Vector(35.0))))), s1(s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0))), Vector(s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0)))))), Vector(s1(s0(Vector(Vector(44.0), Vector(45.0)), Vector(Vector(46.0), Vector(47.0))), Vector(s0(Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0), Vector(51.0)))))))))), s3(Vector(Vector(s0(Vector(Vector(52.0), Vector(53.0)), Vector(Vector(54.0), Vector(55.0)))), Vector(s0(Vector(Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0))))), Vector(Vector(s2(Vector(s1(s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0), Vector(63.0))), Vector(s0(Vector(Vector(64.0), Vector(65.0)), Vector(Vector(66.0), Vector(67.0))))), s1(s0(Vector(Vector(68.0), Vector(69.0)), Vector(Vector(70.0), Vector(71.0))), Vector(s0(Vector(Vector(72.0), Vector(73.0)), Vector(Vector(74.0), Vector(75.0))))), s1(s0(Vector(Vector(76.0), Vector(77.0)), Vector(Vector(78.0), Vector(79.0))), Vector(s0(Vector(Vector(80.0), Vector(81.0)), Vector(Vector(82.0), Vector(83.0)))))), Vector(s1(s0(Vector(Vector(84.0), Vector(85.0)), Vector(Vector(86.0), Vector(87.0))), Vector(s0(Vector(Vector(88.0), Vector(89.0)), Vector(Vector(90.0), Vector(91.0)))))))))), s3(Vector(Vector(s0(Vector(Vector(92.0), Vector(93.0)), Vector(Vector(94.0), Vector(95.0)))), Vector(s0(Vector(Vector(96.0), Vector(97.0)), Vector(Vector(98.0), Vector(99.0))))), Vector(Vector(s2(Vector(s1(s0(Vector(Vector(100.0), Vector(101.0)), Vector(Vector(102.0), Vector(103.0))), Vector(s0(Vector(Vector(104.0), Vector(105.0)), Vector(Vector(106.0), Vector(107.0))))), s1(s0(Vector(Vector(108.0), Vector(109.0)), Vector(Vector(110.0), Vector(111.0))), Vector(s0(Vector(Vector(112.0), Vector(113.0)), Vector(Vector(114.0), Vector(115.0))))), s1(s0(Vector(Vector(116.0), Vector(117.0)), Vector(Vector(118.0), Vector(119.0))), Vector(s0(Vector(Vector(120.0), Vector(121.0)), Vector(Vector(122.0), Vector(123.0)))))), Vector(s1(s0(Vector(Vector(124.0), Vector(125.0)), Vector(Vector(126.0), Vector(127.0))), Vector(s0(Vector(Vector(128.0), Vector(129.0)), Vector(Vector(130.0), Vector(131.0))))))))))), s2(Vector(s1(s0(Vector(Vector(132.0), Vector(133.0)), Vector(Vector(134.0), Vector(135.0))), Vector(s0(Vector(Vector(136.0), Vector(137.0)), Vector(Vector(138.0), Vector(139.0))))), s1(s0(Vector(Vector(140.0), Vector(141.0)), Vector(Vector(142.0), Vector(143.0))), Vector(s0(Vector(Vector(144.0), Vector(145.0)), Vector(Vector(146.0), Vector(147.0))))), s1(s0(Vector(Vector(148.0), Vector(149.0)), Vector(Vector(150.0), Vector(151.0))), Vector(s0(Vector(Vector(152.0), Vector(153.0)), Vector(Vector(154.0), Vector(155.0)))))), Vector(s1(s0(Vector(Vector(156.0), Vector(157.0)), Vector(Vector(158.0), Vector(159.0))), Vector(s0(Vector(Vector(160.0), Vector(161.0)), Vector(Vector(162.0), Vector(163.0)))))))), s5(Vector(s3(Vector(Vector(s0(Vector(Vector(164.0), Vector(165.0)), Vector(Vector(166.0), Vector(167.0)))), Vector(s0(Vector(Vector(168.0), Vector(169.0)), Vector(Vector(170.0), Vector(171.0))))), Vector(Vector(s2(Vector(s1(s0(Vector(Vector(172.0), Vector(173.0)), Vector(Vector(174.0), Vector(175.0))), Vector(s0(Vector(Vector(176.0), Vector(177.0)), Vector(Vector(178.0), Vector(179.0))))), s1(s0(Vector(Vector(180.0), Vector(181.0)), Vector(Vector(182.0), Vector(183.0))), Vector(s0(Vector(Vector(184.0), Vector(185.0)), Vector(Vector(186.0), Vector(187.0))))), s1(s0(Vector(Vector(188.0), Vector(189.0)), Vector(Vector(190.0), Vector(191.0))), Vector(s0(Vector(Vector(192.0), Vector(193.0)), Vector(Vector(194.0), Vector(195.0)))))), Vector(s1(s0(Vector(Vector(196.0), Vector(197.0)), Vector(Vector(198.0), Vector(199.0))), Vector(s0(Vector(Vector(200.0), Vector(201.0)), Vector(Vector(202.0), Vector(203.0)))))))))), s3(Vector(Vector(s0(Vector(Vector(204.0), Vector(205.0)), Vector(Vector(206.0), Vector(207.0)))), Vector(s0(Vector(Vector(208.0), Vector(209.0)), Vector(Vector(210.0), Vector(211.0))))), Vector(Vector(s2(Vector(s1(s0(Vector(Vector(212.0), Vector(213.0)), Vector(Vector(214.0), Vector(215.0))), Vector(s0(Vector(Vector(216.0), Vector(217.0)), Vector(Vector(218.0), Vector(219.0))))), s1(s0(Vector(Vector(220.0), Vector(221.0)), Vector(Vector(222.0), Vector(223.0))), Vector(s0(Vector(Vector(224.0), Vector(225.0)), Vector(Vector(226.0), Vector(227.0))))), s1(s0(Vector(Vector(228.0), Vector(229.0)), Vector(Vector(230.0), Vector(231.0))), Vector(s0(Vector(Vector(232.0), Vector(233.0)), Vector(Vector(234.0), Vector(235.0)))))), Vector(s1(s0(Vector(Vector(236.0), Vector(237.0)), Vector(Vector(238.0), Vector(239.0))), Vector(s0(Vector(Vector(240.0), Vector(241.0)), Vector(Vector(242.0), Vector(243.0)))))))))), s3(Vector(Vector(s0(Vector(Vector(244.0), Vector(245.0)), Vector(Vector(246.0), Vector(247.0)))), Vector(s0(Vector(Vector(248.0), Vector(249.0)), Vector(Vector(250.0), Vector(251.0))))), Vector(Vector(s2(Vector(s1(s0(Vector(Vector(252.0), Vector(253.0)), Vector(Vector(254.0), Vector(255.0))), Vector(s0(Vector(Vector(256.0), Vector(257.0)), Vector(Vector(258.0), Vector(259.0))))), s1(s0(Vector(Vector(260.0), Vector(261.0)), Vector(Vector(262.0), Vector(263.0))), Vector(s0(Vector(Vector(264.0), Vector(265.0)), Vector(Vector(266.0), Vector(267.0))))), s1(s0(Vector(Vector(268.0), Vector(269.0)), Vector(Vector(270.0), Vector(271.0))), Vector(s0(Vector(Vector(272.0), Vector(273.0)), Vector(Vector(274.0), Vector(275.0)))))), Vector(s1(s0(Vector(Vector(276.0), Vector(277.0)), Vector(Vector(278.0), Vector(279.0))), Vector(s0(Vector(Vector(280.0), Vector(281.0)), Vector(Vector(282.0), Vector(283.0))))))))))), s2(Vector(s1(s0(Vector(Vector(284.0), Vector(285.0)), Vector(Vector(286.0), Vector(287.0))), Vector(s0(Vector(Vector(288.0), Vector(289.0)), Vector(Vector(290.0), Vector(291.0))))), s1(s0(Vector(Vector(292.0), Vector(293.0)), Vector(Vector(294.0), Vector(295.0))), Vector(s0(Vector(Vector(296.0), Vector(297.0)), Vector(Vector(298.0), Vector(299.0))))), s1(s0(Vector(Vector(300.0), Vector(301.0)), Vector(Vector(302.0), Vector(303.0))), Vector(s0(Vector(Vector(304.0), Vector(305.0)), Vector(Vector(306.0), Vector(307.0)))))), Vector(s1(s0(Vector(Vector(308.0), Vector(309.0)), Vector(Vector(310.0), Vector(311.0))), Vector(s0(Vector(Vector(312.0), Vector(313.0)), Vector(Vector(314.0), Vector(315.0)))))))), s5(Vector(s3(Vector(Vector(s0(Vector(Vector(316.0), Vector(317.0)), Vector(Vector(318.0), Vector(319.0)))), Vector(s0(Vector(Vector(320.0), Vector(321.0)), Vector(Vector(322.0), Vector(323.0))))), Vector(Vector(s2(Vector(s1(s0(Vector(Vector(324.0), Vector(325.0)), Vector(Vector(326.0), Vector(327.0))), Vector(s0(Vector(Vector(328.0), Vector(329.0)), Vector(Vector(330.0), Vector(331.0))))), s1(s0(Vector(Vector(332.0), Vector(333.0)), Vector(Vector(334.0), Vector(335.0))), Vector(s0(Vector(Vector(336.0), Vector(337.0)), Vector(Vector(338.0), Vector(339.0))))), s1(s0(Vector(Vector(340.0), Vector(341.0)), Vector(Vector(342.0), Vector(343.0))), Vector(s0(Vector(Vector(344.0), Vector(345.0)), Vector(Vector(346.0), Vector(347.0)))))), Vector(s1(s0(Vector(Vector(348.0), Vector(349.0)), Vector(Vector(350.0), Vector(351.0))), Vector(s0(Vector(Vector(352.0), Vector(353.0)), Vector(Vector(354.0), Vector(355.0)))))))))), s3(Vector(Vector(s0(Vector(Vector(356.0), Vector(357.0)), Vector(Vector(358.0), Vector(359.0)))), Vector(s0(Vector(Vector(360.0), Vector(361.0)), Vector(Vector(362.0), Vector(363.0))))), Vector(Vector(s2(Vector(s1(s0(Vector(Vector(364.0), Vector(365.0)), Vector(Vector(366.0), Vector(367.0))), Vector(s0(Vector(Vector(368.0), Vector(369.0)), Vector(Vector(370.0), Vector(371.0))))), s1(s0(Vector(Vector(372.0), Vector(373.0)), Vector(Vector(374.0), Vector(375.0))), Vector(s0(Vector(Vector(376.0), Vector(377.0)), Vector(Vector(378.0), Vector(379.0))))), s1(s0(Vector(Vector(380.0), Vector(381.0)), Vector(Vector(382.0), Vector(383.0))), Vector(s0(Vector(Vector(384.0), Vector(385.0)), Vector(Vector(386.0), Vector(387.0)))))), Vector(s1(s0(Vector(Vector(388.0), Vector(389.0)), Vector(Vector(390.0), Vector(391.0))), Vector(s0(Vector(Vector(392.0), Vector(393.0)), Vector(Vector(394.0), Vector(395.0)))))))))), s3(Vector(Vector(s0(Vector(Vector(396.0), Vector(397.0)), Vector(Vector(398.0), Vector(399.0)))), Vector(s0(Vector(Vector(400.0), Vector(401.0)), Vector(Vector(402.0), Vector(403.0))))), Vector(Vector(s2(Vector(s1(s0(Vector(Vector(404.0), Vector(405.0)), Vector(Vector(406.0), Vector(407.0))), Vector(s0(Vector(Vector(408.0), Vector(409.0)), Vector(Vector(410.0), Vector(411.0))))), s1(s0(Vector(Vector(412.0), Vector(413.0)), Vector(Vector(414.0), Vector(415.0))), Vector(s0(Vector(Vector(416.0), Vector(417.0)), Vector(Vector(418.0), Vector(419.0))))), s1(s0(Vector(Vector(420.0), Vector(421.0)), Vector(Vector(422.0), Vector(423.0))), Vector(s0(Vector(Vector(424.0), Vector(425.0)), Vector(Vector(426.0), Vector(427.0)))))), Vector(s1(s0(Vector(Vector(428.0), Vector(429.0)), Vector(Vector(430.0), Vector(431.0))), Vector(s0(Vector(Vector(432.0), Vector(433.0)), Vector(Vector(434.0), Vector(435.0))))))))))), s2(Vector(s1(s0(Vector(Vector(436.0), Vector(437.0)), Vector(Vector(438.0), Vector(439.0))), Vector(s0(Vector(Vector(440.0), Vector(441.0)), Vector(Vector(442.0), Vector(443.0))))), s1(s0(Vector(Vector(444.0), Vector(445.0)), Vector(Vector(446.0), Vector(447.0))), Vector(s0(Vector(Vector(448.0), Vector(449.0)), Vector(Vector(450.0), Vector(451.0))))), s1(s0(Vector(Vector(452.0), Vector(453.0)), Vector(Vector(454.0), Vector(455.0))), Vector(s0(Vector(Vector(456.0), Vector(457.0)), Vector(Vector(458.0), Vector(459.0)))))), Vector(s1(s0(Vector(Vector(460.0), Vector(461.0)), Vector(Vector(462.0), Vector(463.0))), Vector(s0(Vector(Vector(464.0), Vector(465.0)), Vector(Vector(466.0), Vector(467.0)))))))))
    val v2: Vector[Vector[s3]] = Vector(Vector(s3(Vector(Vector(s0(Vector(Vector(468.0), Vector(469.0)), Vector(Vector(470.0), Vector(471.0)))), Vector(s0(Vector(Vector(472.0), Vector(473.0)), Vector(Vector(474.0), Vector(475.0))))), Vector(Vector(s2(Vector(s1(s0(Vector(Vector(476.0), Vector(477.0)), Vector(Vector(478.0), Vector(479.0))), Vector(s0(Vector(Vector(480.0), Vector(481.0)), Vector(Vector(482.0), Vector(483.0))))), s1(s0(Vector(Vector(484.0), Vector(485.0)), Vector(Vector(486.0), Vector(487.0))), Vector(s0(Vector(Vector(488.0), Vector(489.0)), Vector(Vector(490.0), Vector(491.0))))), s1(s0(Vector(Vector(492.0), Vector(493.0)), Vector(Vector(494.0), Vector(495.0))), Vector(s0(Vector(Vector(496.0), Vector(497.0)), Vector(Vector(498.0), Vector(499.0)))))), Vector(s1(s0(Vector(Vector(500.0), Vector(501.0)), Vector(Vector(502.0), Vector(503.0))), Vector(s0(Vector(Vector(504.0), Vector(505.0)), Vector(Vector(506.0), Vector(507.0))))))))))))
    val v3: Vector[Vector[s2]] = Vector(Vector(s2(Vector(s1(s0(Vector(Vector(508.0), Vector(509.0)), Vector(Vector(510.0), Vector(511.0))), Vector(s0(Vector(Vector(512.0), Vector(513.0)), Vector(Vector(514.0), Vector(515.0))))), s1(s0(Vector(Vector(516.0), Vector(517.0)), Vector(Vector(518.0), Vector(519.0))), Vector(s0(Vector(Vector(520.0), Vector(521.0)), Vector(Vector(522.0), Vector(523.0))))), s1(s0(Vector(Vector(524.0), Vector(525.0)), Vector(Vector(526.0), Vector(527.0))), Vector(s0(Vector(Vector(528.0), Vector(529.0)), Vector(Vector(530.0), Vector(531.0)))))), Vector(s1(s0(Vector(Vector(532.0), Vector(533.0)), Vector(Vector(534.0), Vector(535.0))), Vector(s0(Vector(Vector(536.0), Vector(537.0)), Vector(Vector(538.0), Vector(539.0)))))))), Vector(s2(Vector(s1(s0(Vector(Vector(540.0), Vector(541.0)), Vector(Vector(542.0), Vector(543.0))), Vector(s0(Vector(Vector(544.0), Vector(545.0)), Vector(Vector(546.0), Vector(547.0))))), s1(s0(Vector(Vector(548.0), Vector(549.0)), Vector(Vector(550.0), Vector(551.0))), Vector(s0(Vector(Vector(552.0), Vector(553.0)), Vector(Vector(554.0), Vector(555.0))))), s1(s0(Vector(Vector(556.0), Vector(557.0)), Vector(Vector(558.0), Vector(559.0))), Vector(s0(Vector(Vector(560.0), Vector(561.0)), Vector(Vector(562.0), Vector(563.0)))))), Vector(s1(s0(Vector(Vector(564.0), Vector(565.0)), Vector(Vector(566.0), Vector(567.0))), Vector(s0(Vector(Vector(568.0), Vector(569.0)), Vector(Vector(570.0), Vector(571.0)))))))), Vector(s2(Vector(s1(s0(Vector(Vector(572.0), Vector(573.0)), Vector(Vector(574.0), Vector(575.0))), Vector(s0(Vector(Vector(576.0), Vector(577.0)), Vector(Vector(578.0), Vector(579.0))))), s1(s0(Vector(Vector(580.0), Vector(581.0)), Vector(Vector(582.0), Vector(583.0))), Vector(s0(Vector(Vector(584.0), Vector(585.0)), Vector(Vector(586.0), Vector(587.0))))), s1(s0(Vector(Vector(588.0), Vector(589.0)), Vector(Vector(590.0), Vector(591.0))), Vector(s0(Vector(Vector(592.0), Vector(593.0)), Vector(Vector(594.0), Vector(595.0)))))), Vector(s1(s0(Vector(Vector(596.0), Vector(597.0)), Vector(Vector(598.0), Vector(599.0))), Vector(s0(Vector(Vector(600.0), Vector(601.0)), Vector(Vector(602.0), Vector(603.0)))))))))
    val v4: Double = 604.0
    val start = nanoTime()
    var result: Double = 604.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}