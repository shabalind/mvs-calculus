import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]],
    p3: Vector[Vector[Double]],
    p4: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: s0,
    p1: s1,
    p2: s0
  )
  case class s3 (
    p0: Vector[s2],
    p1: Vector[s2]
  )
  case class s5 (
    p0: s1,
    p1: Vector[s3]
  )
  def f27(v0: Double, v1: Double): Double = {
    var v7: Double = v1
    var v12: Double = v7
    var v2: Double = v12
    var v28: Double = v2
    var v23: Double = v28
    var v30: Double = v23
    v30
  }
  @noinline
  def f0(v0: s5, v1: s3, v2: Double): Double = {
    val v7: Double = v2 - v2
    val v12: Double = f27(v7, v2)
    val v22: Double = v2 * v12
    val v39: Double = f27(v22, v22)
    val v33: Double = f27(v39, v12)
    v33
  }
  def benchmark(): Unit = {
    val v0: s5 = s5(s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0))), s0(Vector(Vector(11.0), Vector(12.0), Vector(13.0)), Vector(Vector(14.0)), Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0)), Vector(Vector(20.0), Vector(21.0)))), Vector(s3(Vector(s2(s0(Vector(Vector(22.0), Vector(23.0), Vector(24.0)), Vector(Vector(25.0)), Vector(Vector(26.0), Vector(27.0)), Vector(Vector(28.0), Vector(29.0), Vector(30.0)), Vector(Vector(31.0), Vector(32.0))), s1(s0(Vector(Vector(33.0), Vector(34.0), Vector(35.0)), Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0)), Vector(Vector(39.0), Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0))), s0(Vector(Vector(44.0), Vector(45.0), Vector(46.0)), Vector(Vector(47.0)), Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0), Vector(51.0), Vector(52.0)), Vector(Vector(53.0), Vector(54.0)))), s0(Vector(Vector(55.0), Vector(56.0), Vector(57.0)), Vector(Vector(58.0)), Vector(Vector(59.0), Vector(60.0)), Vector(Vector(61.0), Vector(62.0), Vector(63.0)), Vector(Vector(64.0), Vector(65.0))))), Vector(s2(s0(Vector(Vector(66.0), Vector(67.0), Vector(68.0)), Vector(Vector(69.0)), Vector(Vector(70.0), Vector(71.0)), Vector(Vector(72.0), Vector(73.0), Vector(74.0)), Vector(Vector(75.0), Vector(76.0))), s1(s0(Vector(Vector(77.0), Vector(78.0), Vector(79.0)), Vector(Vector(80.0)), Vector(Vector(81.0), Vector(82.0)), Vector(Vector(83.0), Vector(84.0), Vector(85.0)), Vector(Vector(86.0), Vector(87.0))), s0(Vector(Vector(88.0), Vector(89.0), Vector(90.0)), Vector(Vector(91.0)), Vector(Vector(92.0), Vector(93.0)), Vector(Vector(94.0), Vector(95.0), Vector(96.0)), Vector(Vector(97.0), Vector(98.0)))), s0(Vector(Vector(99.0), Vector(100.0), Vector(101.0)), Vector(Vector(102.0)), Vector(Vector(103.0), Vector(104.0)), Vector(Vector(105.0), Vector(106.0), Vector(107.0)), Vector(Vector(108.0), Vector(109.0)))), s2(s0(Vector(Vector(110.0), Vector(111.0), Vector(112.0)), Vector(Vector(113.0)), Vector(Vector(114.0), Vector(115.0)), Vector(Vector(116.0), Vector(117.0), Vector(118.0)), Vector(Vector(119.0), Vector(120.0))), s1(s0(Vector(Vector(121.0), Vector(122.0), Vector(123.0)), Vector(Vector(124.0)), Vector(Vector(125.0), Vector(126.0)), Vector(Vector(127.0), Vector(128.0), Vector(129.0)), Vector(Vector(130.0), Vector(131.0))), s0(Vector(Vector(132.0), Vector(133.0), Vector(134.0)), Vector(Vector(135.0)), Vector(Vector(136.0), Vector(137.0)), Vector(Vector(138.0), Vector(139.0), Vector(140.0)), Vector(Vector(141.0), Vector(142.0)))), s0(Vector(Vector(143.0), Vector(144.0), Vector(145.0)), Vector(Vector(146.0)), Vector(Vector(147.0), Vector(148.0)), Vector(Vector(149.0), Vector(150.0), Vector(151.0)), Vector(Vector(152.0), Vector(153.0)))), s2(s0(Vector(Vector(154.0), Vector(155.0), Vector(156.0)), Vector(Vector(157.0)), Vector(Vector(158.0), Vector(159.0)), Vector(Vector(160.0), Vector(161.0), Vector(162.0)), Vector(Vector(163.0), Vector(164.0))), s1(s0(Vector(Vector(165.0), Vector(166.0), Vector(167.0)), Vector(Vector(168.0)), Vector(Vector(169.0), Vector(170.0)), Vector(Vector(171.0), Vector(172.0), Vector(173.0)), Vector(Vector(174.0), Vector(175.0))), s0(Vector(Vector(176.0), Vector(177.0), Vector(178.0)), Vector(Vector(179.0)), Vector(Vector(180.0), Vector(181.0)), Vector(Vector(182.0), Vector(183.0), Vector(184.0)), Vector(Vector(185.0), Vector(186.0)))), s0(Vector(Vector(187.0), Vector(188.0), Vector(189.0)), Vector(Vector(190.0)), Vector(Vector(191.0), Vector(192.0)), Vector(Vector(193.0), Vector(194.0), Vector(195.0)), Vector(Vector(196.0), Vector(197.0)))))), s3(Vector(s2(s0(Vector(Vector(198.0), Vector(199.0), Vector(200.0)), Vector(Vector(201.0)), Vector(Vector(202.0), Vector(203.0)), Vector(Vector(204.0), Vector(205.0), Vector(206.0)), Vector(Vector(207.0), Vector(208.0))), s1(s0(Vector(Vector(209.0), Vector(210.0), Vector(211.0)), Vector(Vector(212.0)), Vector(Vector(213.0), Vector(214.0)), Vector(Vector(215.0), Vector(216.0), Vector(217.0)), Vector(Vector(218.0), Vector(219.0))), s0(Vector(Vector(220.0), Vector(221.0), Vector(222.0)), Vector(Vector(223.0)), Vector(Vector(224.0), Vector(225.0)), Vector(Vector(226.0), Vector(227.0), Vector(228.0)), Vector(Vector(229.0), Vector(230.0)))), s0(Vector(Vector(231.0), Vector(232.0), Vector(233.0)), Vector(Vector(234.0)), Vector(Vector(235.0), Vector(236.0)), Vector(Vector(237.0), Vector(238.0), Vector(239.0)), Vector(Vector(240.0), Vector(241.0))))), Vector(s2(s0(Vector(Vector(242.0), Vector(243.0), Vector(244.0)), Vector(Vector(245.0)), Vector(Vector(246.0), Vector(247.0)), Vector(Vector(248.0), Vector(249.0), Vector(250.0)), Vector(Vector(251.0), Vector(252.0))), s1(s0(Vector(Vector(253.0), Vector(254.0), Vector(255.0)), Vector(Vector(256.0)), Vector(Vector(257.0), Vector(258.0)), Vector(Vector(259.0), Vector(260.0), Vector(261.0)), Vector(Vector(262.0), Vector(263.0))), s0(Vector(Vector(264.0), Vector(265.0), Vector(266.0)), Vector(Vector(267.0)), Vector(Vector(268.0), Vector(269.0)), Vector(Vector(270.0), Vector(271.0), Vector(272.0)), Vector(Vector(273.0), Vector(274.0)))), s0(Vector(Vector(275.0), Vector(276.0), Vector(277.0)), Vector(Vector(278.0)), Vector(Vector(279.0), Vector(280.0)), Vector(Vector(281.0), Vector(282.0), Vector(283.0)), Vector(Vector(284.0), Vector(285.0)))), s2(s0(Vector(Vector(286.0), Vector(287.0), Vector(288.0)), Vector(Vector(289.0)), Vector(Vector(290.0), Vector(291.0)), Vector(Vector(292.0), Vector(293.0), Vector(294.0)), Vector(Vector(295.0), Vector(296.0))), s1(s0(Vector(Vector(297.0), Vector(298.0), Vector(299.0)), Vector(Vector(300.0)), Vector(Vector(301.0), Vector(302.0)), Vector(Vector(303.0), Vector(304.0), Vector(305.0)), Vector(Vector(306.0), Vector(307.0))), s0(Vector(Vector(308.0), Vector(309.0), Vector(310.0)), Vector(Vector(311.0)), Vector(Vector(312.0), Vector(313.0)), Vector(Vector(314.0), Vector(315.0), Vector(316.0)), Vector(Vector(317.0), Vector(318.0)))), s0(Vector(Vector(319.0), Vector(320.0), Vector(321.0)), Vector(Vector(322.0)), Vector(Vector(323.0), Vector(324.0)), Vector(Vector(325.0), Vector(326.0), Vector(327.0)), Vector(Vector(328.0), Vector(329.0)))), s2(s0(Vector(Vector(330.0), Vector(331.0), Vector(332.0)), Vector(Vector(333.0)), Vector(Vector(334.0), Vector(335.0)), Vector(Vector(336.0), Vector(337.0), Vector(338.0)), Vector(Vector(339.0), Vector(340.0))), s1(s0(Vector(Vector(341.0), Vector(342.0), Vector(343.0)), Vector(Vector(344.0)), Vector(Vector(345.0), Vector(346.0)), Vector(Vector(347.0), Vector(348.0), Vector(349.0)), Vector(Vector(350.0), Vector(351.0))), s0(Vector(Vector(352.0), Vector(353.0), Vector(354.0)), Vector(Vector(355.0)), Vector(Vector(356.0), Vector(357.0)), Vector(Vector(358.0), Vector(359.0), Vector(360.0)), Vector(Vector(361.0), Vector(362.0)))), s0(Vector(Vector(363.0), Vector(364.0), Vector(365.0)), Vector(Vector(366.0)), Vector(Vector(367.0), Vector(368.0)), Vector(Vector(369.0), Vector(370.0), Vector(371.0)), Vector(Vector(372.0), Vector(373.0))))))))
    val v1: s3 = s3(Vector(s2(s0(Vector(Vector(374.0), Vector(375.0), Vector(376.0)), Vector(Vector(377.0)), Vector(Vector(378.0), Vector(379.0)), Vector(Vector(380.0), Vector(381.0), Vector(382.0)), Vector(Vector(383.0), Vector(384.0))), s1(s0(Vector(Vector(385.0), Vector(386.0), Vector(387.0)), Vector(Vector(388.0)), Vector(Vector(389.0), Vector(390.0)), Vector(Vector(391.0), Vector(392.0), Vector(393.0)), Vector(Vector(394.0), Vector(395.0))), s0(Vector(Vector(396.0), Vector(397.0), Vector(398.0)), Vector(Vector(399.0)), Vector(Vector(400.0), Vector(401.0)), Vector(Vector(402.0), Vector(403.0), Vector(404.0)), Vector(Vector(405.0), Vector(406.0)))), s0(Vector(Vector(407.0), Vector(408.0), Vector(409.0)), Vector(Vector(410.0)), Vector(Vector(411.0), Vector(412.0)), Vector(Vector(413.0), Vector(414.0), Vector(415.0)), Vector(Vector(416.0), Vector(417.0))))), Vector(s2(s0(Vector(Vector(418.0), Vector(419.0), Vector(420.0)), Vector(Vector(421.0)), Vector(Vector(422.0), Vector(423.0)), Vector(Vector(424.0), Vector(425.0), Vector(426.0)), Vector(Vector(427.0), Vector(428.0))), s1(s0(Vector(Vector(429.0), Vector(430.0), Vector(431.0)), Vector(Vector(432.0)), Vector(Vector(433.0), Vector(434.0)), Vector(Vector(435.0), Vector(436.0), Vector(437.0)), Vector(Vector(438.0), Vector(439.0))), s0(Vector(Vector(440.0), Vector(441.0), Vector(442.0)), Vector(Vector(443.0)), Vector(Vector(444.0), Vector(445.0)), Vector(Vector(446.0), Vector(447.0), Vector(448.0)), Vector(Vector(449.0), Vector(450.0)))), s0(Vector(Vector(451.0), Vector(452.0), Vector(453.0)), Vector(Vector(454.0)), Vector(Vector(455.0), Vector(456.0)), Vector(Vector(457.0), Vector(458.0), Vector(459.0)), Vector(Vector(460.0), Vector(461.0)))), s2(s0(Vector(Vector(462.0), Vector(463.0), Vector(464.0)), Vector(Vector(465.0)), Vector(Vector(466.0), Vector(467.0)), Vector(Vector(468.0), Vector(469.0), Vector(470.0)), Vector(Vector(471.0), Vector(472.0))), s1(s0(Vector(Vector(473.0), Vector(474.0), Vector(475.0)), Vector(Vector(476.0)), Vector(Vector(477.0), Vector(478.0)), Vector(Vector(479.0), Vector(480.0), Vector(481.0)), Vector(Vector(482.0), Vector(483.0))), s0(Vector(Vector(484.0), Vector(485.0), Vector(486.0)), Vector(Vector(487.0)), Vector(Vector(488.0), Vector(489.0)), Vector(Vector(490.0), Vector(491.0), Vector(492.0)), Vector(Vector(493.0), Vector(494.0)))), s0(Vector(Vector(495.0), Vector(496.0), Vector(497.0)), Vector(Vector(498.0)), Vector(Vector(499.0), Vector(500.0)), Vector(Vector(501.0), Vector(502.0), Vector(503.0)), Vector(Vector(504.0), Vector(505.0)))), s2(s0(Vector(Vector(506.0), Vector(507.0), Vector(508.0)), Vector(Vector(509.0)), Vector(Vector(510.0), Vector(511.0)), Vector(Vector(512.0), Vector(513.0), Vector(514.0)), Vector(Vector(515.0), Vector(516.0))), s1(s0(Vector(Vector(517.0), Vector(518.0), Vector(519.0)), Vector(Vector(520.0)), Vector(Vector(521.0), Vector(522.0)), Vector(Vector(523.0), Vector(524.0), Vector(525.0)), Vector(Vector(526.0), Vector(527.0))), s0(Vector(Vector(528.0), Vector(529.0), Vector(530.0)), Vector(Vector(531.0)), Vector(Vector(532.0), Vector(533.0)), Vector(Vector(534.0), Vector(535.0), Vector(536.0)), Vector(Vector(537.0), Vector(538.0)))), s0(Vector(Vector(539.0), Vector(540.0), Vector(541.0)), Vector(Vector(542.0)), Vector(Vector(543.0), Vector(544.0)), Vector(Vector(545.0), Vector(546.0), Vector(547.0)), Vector(Vector(548.0), Vector(549.0))))))
    val v2: Double = 550.0
    val start = nanoTime()
    var result: Double = 550.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}