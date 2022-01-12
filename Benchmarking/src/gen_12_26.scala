import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[Vector[s0]]
  )
  case class s2 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s3 (
    p0: Vector[s1],
    p1: Vector[s0]
  )
  case class s5 (
    p0: s1,
    p1: s1,
    p2: Double
  )
  case class s6 (
    p0: Vector[s0],
    p1: Vector[s1]
  )
  case class s7 (
    p0: Vector[s3],
    p1: Vector[Vector[s2]],
    p2: Vector[s1]
  )
  case class s8 (
    p0: s0,
    p1: Vector[Vector[s0]],
    p2: s6,
    p3: Vector[Vector[s5]],
    p4: Vector[Vector[s5]],
    p5: Vector[Double],
    p6: s3,
    p7: s0
  )
  case class s9 (
    p0: Vector[Vector[s2]],
    p1: Vector[s7]
  )
  def f54(v0: s6): s6 = {
    val v7: Vector[s1] = v0.p1
    val v10: Vector[s0] = v0.p0
    val v37: s6 = s6(v10, v7)
    v37
  }
  @noinline
  def f0(v0: s8, v1: Vector[s7], v2: s6, v3: Vector[Vector[s9]], v4: Vector[s7], v5: Double): Double = {
    val v9: s6 = f54(v2)
    val v16: Vector[s1] = v9.p1
    val v12: s1 = v16(2)
    val v28: Vector[s0] = v12.p0
    val v59: Double = v5 * v5
    val v52: Double = v5 * v59
    var v103: s1 = v12
    val v89: s5 = s5(v103, v12, v52)
    var v98: s5 = v89
    val v80: Double = v98.p2
    v103 = v103.copy(p0 = v28)
    v80
  }
  def benchmark(): Unit = {
    val v0: s8 = s8(s0(Vector(Vector(0.0)), Vector(Vector(1.0))), Vector(Vector(s0(Vector(Vector(2.0)), Vector(Vector(3.0)))), Vector(s0(Vector(Vector(4.0)), Vector(Vector(5.0)))), Vector(s0(Vector(Vector(6.0)), Vector(Vector(7.0))))), s6(Vector(s0(Vector(Vector(8.0)), Vector(Vector(9.0)))), Vector(s1(Vector(s0(Vector(Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0)))), Vector(Vector(s0(Vector(Vector(14.0)), Vector(Vector(15.0)))), Vector(s0(Vector(Vector(16.0)), Vector(Vector(17.0)))))), s1(Vector(s0(Vector(Vector(18.0)), Vector(Vector(19.0))), s0(Vector(Vector(20.0)), Vector(Vector(21.0)))), Vector(Vector(s0(Vector(Vector(22.0)), Vector(Vector(23.0)))), Vector(s0(Vector(Vector(24.0)), Vector(Vector(25.0)))))), s1(Vector(s0(Vector(Vector(26.0)), Vector(Vector(27.0))), s0(Vector(Vector(28.0)), Vector(Vector(29.0)))), Vector(Vector(s0(Vector(Vector(30.0)), Vector(Vector(31.0)))), Vector(s0(Vector(Vector(32.0)), Vector(Vector(33.0)))))))), Vector(Vector(s5(s1(Vector(s0(Vector(Vector(34.0)), Vector(Vector(35.0))), s0(Vector(Vector(36.0)), Vector(Vector(37.0)))), Vector(Vector(s0(Vector(Vector(38.0)), Vector(Vector(39.0)))), Vector(s0(Vector(Vector(40.0)), Vector(Vector(41.0)))))), s1(Vector(s0(Vector(Vector(42.0)), Vector(Vector(43.0))), s0(Vector(Vector(44.0)), Vector(Vector(45.0)))), Vector(Vector(s0(Vector(Vector(46.0)), Vector(Vector(47.0)))), Vector(s0(Vector(Vector(48.0)), Vector(Vector(49.0)))))), 50.0))), Vector(Vector(s5(s1(Vector(s0(Vector(Vector(51.0)), Vector(Vector(52.0))), s0(Vector(Vector(53.0)), Vector(Vector(54.0)))), Vector(Vector(s0(Vector(Vector(55.0)), Vector(Vector(56.0)))), Vector(s0(Vector(Vector(57.0)), Vector(Vector(58.0)))))), s1(Vector(s0(Vector(Vector(59.0)), Vector(Vector(60.0))), s0(Vector(Vector(61.0)), Vector(Vector(62.0)))), Vector(Vector(s0(Vector(Vector(63.0)), Vector(Vector(64.0)))), Vector(s0(Vector(Vector(65.0)), Vector(Vector(66.0)))))), 67.0)), Vector(s5(s1(Vector(s0(Vector(Vector(68.0)), Vector(Vector(69.0))), s0(Vector(Vector(70.0)), Vector(Vector(71.0)))), Vector(Vector(s0(Vector(Vector(72.0)), Vector(Vector(73.0)))), Vector(s0(Vector(Vector(74.0)), Vector(Vector(75.0)))))), s1(Vector(s0(Vector(Vector(76.0)), Vector(Vector(77.0))), s0(Vector(Vector(78.0)), Vector(Vector(79.0)))), Vector(Vector(s0(Vector(Vector(80.0)), Vector(Vector(81.0)))), Vector(s0(Vector(Vector(82.0)), Vector(Vector(83.0)))))), 84.0)), Vector(s5(s1(Vector(s0(Vector(Vector(85.0)), Vector(Vector(86.0))), s0(Vector(Vector(87.0)), Vector(Vector(88.0)))), Vector(Vector(s0(Vector(Vector(89.0)), Vector(Vector(90.0)))), Vector(s0(Vector(Vector(91.0)), Vector(Vector(92.0)))))), s1(Vector(s0(Vector(Vector(93.0)), Vector(Vector(94.0))), s0(Vector(Vector(95.0)), Vector(Vector(96.0)))), Vector(Vector(s0(Vector(Vector(97.0)), Vector(Vector(98.0)))), Vector(s0(Vector(Vector(99.0)), Vector(Vector(100.0)))))), 101.0))), Vector(102.0, 103.0), s3(Vector(s1(Vector(s0(Vector(Vector(104.0)), Vector(Vector(105.0))), s0(Vector(Vector(106.0)), Vector(Vector(107.0)))), Vector(Vector(s0(Vector(Vector(108.0)), Vector(Vector(109.0)))), Vector(s0(Vector(Vector(110.0)), Vector(Vector(111.0)))))), s1(Vector(s0(Vector(Vector(112.0)), Vector(Vector(113.0))), s0(Vector(Vector(114.0)), Vector(Vector(115.0)))), Vector(Vector(s0(Vector(Vector(116.0)), Vector(Vector(117.0)))), Vector(s0(Vector(Vector(118.0)), Vector(Vector(119.0))))))), Vector(s0(Vector(Vector(120.0)), Vector(Vector(121.0))))), s0(Vector(Vector(122.0)), Vector(Vector(123.0))))
    val v1: Vector[s7] = Vector(s7(Vector(s3(Vector(s1(Vector(s0(Vector(Vector(124.0)), Vector(Vector(125.0))), s0(Vector(Vector(126.0)), Vector(Vector(127.0)))), Vector(Vector(s0(Vector(Vector(128.0)), Vector(Vector(129.0)))), Vector(s0(Vector(Vector(130.0)), Vector(Vector(131.0)))))), s1(Vector(s0(Vector(Vector(132.0)), Vector(Vector(133.0))), s0(Vector(Vector(134.0)), Vector(Vector(135.0)))), Vector(Vector(s0(Vector(Vector(136.0)), Vector(Vector(137.0)))), Vector(s0(Vector(Vector(138.0)), Vector(Vector(139.0))))))), Vector(s0(Vector(Vector(140.0)), Vector(Vector(141.0))))), s3(Vector(s1(Vector(s0(Vector(Vector(142.0)), Vector(Vector(143.0))), s0(Vector(Vector(144.0)), Vector(Vector(145.0)))), Vector(Vector(s0(Vector(Vector(146.0)), Vector(Vector(147.0)))), Vector(s0(Vector(Vector(148.0)), Vector(Vector(149.0)))))), s1(Vector(s0(Vector(Vector(150.0)), Vector(Vector(151.0))), s0(Vector(Vector(152.0)), Vector(Vector(153.0)))), Vector(Vector(s0(Vector(Vector(154.0)), Vector(Vector(155.0)))), Vector(s0(Vector(Vector(156.0)), Vector(Vector(157.0))))))), Vector(s0(Vector(Vector(158.0)), Vector(Vector(159.0)))))), Vector(Vector(s2(s0(Vector(Vector(160.0)), Vector(Vector(161.0))), Vector(s0(Vector(Vector(162.0)), Vector(Vector(163.0)))))), Vector(s2(s0(Vector(Vector(164.0)), Vector(Vector(165.0))), Vector(s0(Vector(Vector(166.0)), Vector(Vector(167.0))))))), Vector(s1(Vector(s0(Vector(Vector(168.0)), Vector(Vector(169.0))), s0(Vector(Vector(170.0)), Vector(Vector(171.0)))), Vector(Vector(s0(Vector(Vector(172.0)), Vector(Vector(173.0)))), Vector(s0(Vector(Vector(174.0)), Vector(Vector(175.0)))))), s1(Vector(s0(Vector(Vector(176.0)), Vector(Vector(177.0))), s0(Vector(Vector(178.0)), Vector(Vector(179.0)))), Vector(Vector(s0(Vector(Vector(180.0)), Vector(Vector(181.0)))), Vector(s0(Vector(Vector(182.0)), Vector(Vector(183.0)))))), s1(Vector(s0(Vector(Vector(184.0)), Vector(Vector(185.0))), s0(Vector(Vector(186.0)), Vector(Vector(187.0)))), Vector(Vector(s0(Vector(Vector(188.0)), Vector(Vector(189.0)))), Vector(s0(Vector(Vector(190.0)), Vector(Vector(191.0)))))))))
    val v2: s6 = s6(Vector(s0(Vector(Vector(192.0)), Vector(Vector(193.0)))), Vector(s1(Vector(s0(Vector(Vector(194.0)), Vector(Vector(195.0))), s0(Vector(Vector(196.0)), Vector(Vector(197.0)))), Vector(Vector(s0(Vector(Vector(198.0)), Vector(Vector(199.0)))), Vector(s0(Vector(Vector(200.0)), Vector(Vector(201.0)))))), s1(Vector(s0(Vector(Vector(202.0)), Vector(Vector(203.0))), s0(Vector(Vector(204.0)), Vector(Vector(205.0)))), Vector(Vector(s0(Vector(Vector(206.0)), Vector(Vector(207.0)))), Vector(s0(Vector(Vector(208.0)), Vector(Vector(209.0)))))), s1(Vector(s0(Vector(Vector(210.0)), Vector(Vector(211.0))), s0(Vector(Vector(212.0)), Vector(Vector(213.0)))), Vector(Vector(s0(Vector(Vector(214.0)), Vector(Vector(215.0)))), Vector(s0(Vector(Vector(216.0)), Vector(Vector(217.0))))))))
    val v3: Vector[Vector[s9]] = Vector(Vector(s9(Vector(Vector(s2(s0(Vector(Vector(218.0)), Vector(Vector(219.0))), Vector(s0(Vector(Vector(220.0)), Vector(Vector(221.0)))))), Vector(s2(s0(Vector(Vector(222.0)), Vector(Vector(223.0))), Vector(s0(Vector(Vector(224.0)), Vector(Vector(225.0))))))), Vector(s7(Vector(s3(Vector(s1(Vector(s0(Vector(Vector(226.0)), Vector(Vector(227.0))), s0(Vector(Vector(228.0)), Vector(Vector(229.0)))), Vector(Vector(s0(Vector(Vector(230.0)), Vector(Vector(231.0)))), Vector(s0(Vector(Vector(232.0)), Vector(Vector(233.0)))))), s1(Vector(s0(Vector(Vector(234.0)), Vector(Vector(235.0))), s0(Vector(Vector(236.0)), Vector(Vector(237.0)))), Vector(Vector(s0(Vector(Vector(238.0)), Vector(Vector(239.0)))), Vector(s0(Vector(Vector(240.0)), Vector(Vector(241.0))))))), Vector(s0(Vector(Vector(242.0)), Vector(Vector(243.0))))), s3(Vector(s1(Vector(s0(Vector(Vector(244.0)), Vector(Vector(245.0))), s0(Vector(Vector(246.0)), Vector(Vector(247.0)))), Vector(Vector(s0(Vector(Vector(248.0)), Vector(Vector(249.0)))), Vector(s0(Vector(Vector(250.0)), Vector(Vector(251.0)))))), s1(Vector(s0(Vector(Vector(252.0)), Vector(Vector(253.0))), s0(Vector(Vector(254.0)), Vector(Vector(255.0)))), Vector(Vector(s0(Vector(Vector(256.0)), Vector(Vector(257.0)))), Vector(s0(Vector(Vector(258.0)), Vector(Vector(259.0))))))), Vector(s0(Vector(Vector(260.0)), Vector(Vector(261.0)))))), Vector(Vector(s2(s0(Vector(Vector(262.0)), Vector(Vector(263.0))), Vector(s0(Vector(Vector(264.0)), Vector(Vector(265.0)))))), Vector(s2(s0(Vector(Vector(266.0)), Vector(Vector(267.0))), Vector(s0(Vector(Vector(268.0)), Vector(Vector(269.0))))))), Vector(s1(Vector(s0(Vector(Vector(270.0)), Vector(Vector(271.0))), s0(Vector(Vector(272.0)), Vector(Vector(273.0)))), Vector(Vector(s0(Vector(Vector(274.0)), Vector(Vector(275.0)))), Vector(s0(Vector(Vector(276.0)), Vector(Vector(277.0)))))), s1(Vector(s0(Vector(Vector(278.0)), Vector(Vector(279.0))), s0(Vector(Vector(280.0)), Vector(Vector(281.0)))), Vector(Vector(s0(Vector(Vector(282.0)), Vector(Vector(283.0)))), Vector(s0(Vector(Vector(284.0)), Vector(Vector(285.0)))))), s1(Vector(s0(Vector(Vector(286.0)), Vector(Vector(287.0))), s0(Vector(Vector(288.0)), Vector(Vector(289.0)))), Vector(Vector(s0(Vector(Vector(290.0)), Vector(Vector(291.0)))), Vector(s0(Vector(Vector(292.0)), Vector(Vector(293.0))))))))))))
    val v4: Vector[s7] = Vector(s7(Vector(s3(Vector(s1(Vector(s0(Vector(Vector(294.0)), Vector(Vector(295.0))), s0(Vector(Vector(296.0)), Vector(Vector(297.0)))), Vector(Vector(s0(Vector(Vector(298.0)), Vector(Vector(299.0)))), Vector(s0(Vector(Vector(300.0)), Vector(Vector(301.0)))))), s1(Vector(s0(Vector(Vector(302.0)), Vector(Vector(303.0))), s0(Vector(Vector(304.0)), Vector(Vector(305.0)))), Vector(Vector(s0(Vector(Vector(306.0)), Vector(Vector(307.0)))), Vector(s0(Vector(Vector(308.0)), Vector(Vector(309.0))))))), Vector(s0(Vector(Vector(310.0)), Vector(Vector(311.0))))), s3(Vector(s1(Vector(s0(Vector(Vector(312.0)), Vector(Vector(313.0))), s0(Vector(Vector(314.0)), Vector(Vector(315.0)))), Vector(Vector(s0(Vector(Vector(316.0)), Vector(Vector(317.0)))), Vector(s0(Vector(Vector(318.0)), Vector(Vector(319.0)))))), s1(Vector(s0(Vector(Vector(320.0)), Vector(Vector(321.0))), s0(Vector(Vector(322.0)), Vector(Vector(323.0)))), Vector(Vector(s0(Vector(Vector(324.0)), Vector(Vector(325.0)))), Vector(s0(Vector(Vector(326.0)), Vector(Vector(327.0))))))), Vector(s0(Vector(Vector(328.0)), Vector(Vector(329.0)))))), Vector(Vector(s2(s0(Vector(Vector(330.0)), Vector(Vector(331.0))), Vector(s0(Vector(Vector(332.0)), Vector(Vector(333.0)))))), Vector(s2(s0(Vector(Vector(334.0)), Vector(Vector(335.0))), Vector(s0(Vector(Vector(336.0)), Vector(Vector(337.0))))))), Vector(s1(Vector(s0(Vector(Vector(338.0)), Vector(Vector(339.0))), s0(Vector(Vector(340.0)), Vector(Vector(341.0)))), Vector(Vector(s0(Vector(Vector(342.0)), Vector(Vector(343.0)))), Vector(s0(Vector(Vector(344.0)), Vector(Vector(345.0)))))), s1(Vector(s0(Vector(Vector(346.0)), Vector(Vector(347.0))), s0(Vector(Vector(348.0)), Vector(Vector(349.0)))), Vector(Vector(s0(Vector(Vector(350.0)), Vector(Vector(351.0)))), Vector(s0(Vector(Vector(352.0)), Vector(Vector(353.0)))))), s1(Vector(s0(Vector(Vector(354.0)), Vector(Vector(355.0))), s0(Vector(Vector(356.0)), Vector(Vector(357.0)))), Vector(Vector(s0(Vector(Vector(358.0)), Vector(Vector(359.0)))), Vector(s0(Vector(Vector(360.0)), Vector(Vector(361.0)))))))), s7(Vector(s3(Vector(s1(Vector(s0(Vector(Vector(362.0)), Vector(Vector(363.0))), s0(Vector(Vector(364.0)), Vector(Vector(365.0)))), Vector(Vector(s0(Vector(Vector(366.0)), Vector(Vector(367.0)))), Vector(s0(Vector(Vector(368.0)), Vector(Vector(369.0)))))), s1(Vector(s0(Vector(Vector(370.0)), Vector(Vector(371.0))), s0(Vector(Vector(372.0)), Vector(Vector(373.0)))), Vector(Vector(s0(Vector(Vector(374.0)), Vector(Vector(375.0)))), Vector(s0(Vector(Vector(376.0)), Vector(Vector(377.0))))))), Vector(s0(Vector(Vector(378.0)), Vector(Vector(379.0))))), s3(Vector(s1(Vector(s0(Vector(Vector(380.0)), Vector(Vector(381.0))), s0(Vector(Vector(382.0)), Vector(Vector(383.0)))), Vector(Vector(s0(Vector(Vector(384.0)), Vector(Vector(385.0)))), Vector(s0(Vector(Vector(386.0)), Vector(Vector(387.0)))))), s1(Vector(s0(Vector(Vector(388.0)), Vector(Vector(389.0))), s0(Vector(Vector(390.0)), Vector(Vector(391.0)))), Vector(Vector(s0(Vector(Vector(392.0)), Vector(Vector(393.0)))), Vector(s0(Vector(Vector(394.0)), Vector(Vector(395.0))))))), Vector(s0(Vector(Vector(396.0)), Vector(Vector(397.0)))))), Vector(Vector(s2(s0(Vector(Vector(398.0)), Vector(Vector(399.0))), Vector(s0(Vector(Vector(400.0)), Vector(Vector(401.0)))))), Vector(s2(s0(Vector(Vector(402.0)), Vector(Vector(403.0))), Vector(s0(Vector(Vector(404.0)), Vector(Vector(405.0))))))), Vector(s1(Vector(s0(Vector(Vector(406.0)), Vector(Vector(407.0))), s0(Vector(Vector(408.0)), Vector(Vector(409.0)))), Vector(Vector(s0(Vector(Vector(410.0)), Vector(Vector(411.0)))), Vector(s0(Vector(Vector(412.0)), Vector(Vector(413.0)))))), s1(Vector(s0(Vector(Vector(414.0)), Vector(Vector(415.0))), s0(Vector(Vector(416.0)), Vector(Vector(417.0)))), Vector(Vector(s0(Vector(Vector(418.0)), Vector(Vector(419.0)))), Vector(s0(Vector(Vector(420.0)), Vector(Vector(421.0)))))), s1(Vector(s0(Vector(Vector(422.0)), Vector(Vector(423.0))), s0(Vector(Vector(424.0)), Vector(Vector(425.0)))), Vector(Vector(s0(Vector(Vector(426.0)), Vector(Vector(427.0)))), Vector(s0(Vector(Vector(428.0)), Vector(Vector(429.0)))))))), s7(Vector(s3(Vector(s1(Vector(s0(Vector(Vector(430.0)), Vector(Vector(431.0))), s0(Vector(Vector(432.0)), Vector(Vector(433.0)))), Vector(Vector(s0(Vector(Vector(434.0)), Vector(Vector(435.0)))), Vector(s0(Vector(Vector(436.0)), Vector(Vector(437.0)))))), s1(Vector(s0(Vector(Vector(438.0)), Vector(Vector(439.0))), s0(Vector(Vector(440.0)), Vector(Vector(441.0)))), Vector(Vector(s0(Vector(Vector(442.0)), Vector(Vector(443.0)))), Vector(s0(Vector(Vector(444.0)), Vector(Vector(445.0))))))), Vector(s0(Vector(Vector(446.0)), Vector(Vector(447.0))))), s3(Vector(s1(Vector(s0(Vector(Vector(448.0)), Vector(Vector(449.0))), s0(Vector(Vector(450.0)), Vector(Vector(451.0)))), Vector(Vector(s0(Vector(Vector(452.0)), Vector(Vector(453.0)))), Vector(s0(Vector(Vector(454.0)), Vector(Vector(455.0)))))), s1(Vector(s0(Vector(Vector(456.0)), Vector(Vector(457.0))), s0(Vector(Vector(458.0)), Vector(Vector(459.0)))), Vector(Vector(s0(Vector(Vector(460.0)), Vector(Vector(461.0)))), Vector(s0(Vector(Vector(462.0)), Vector(Vector(463.0))))))), Vector(s0(Vector(Vector(464.0)), Vector(Vector(465.0)))))), Vector(Vector(s2(s0(Vector(Vector(466.0)), Vector(Vector(467.0))), Vector(s0(Vector(Vector(468.0)), Vector(Vector(469.0)))))), Vector(s2(s0(Vector(Vector(470.0)), Vector(Vector(471.0))), Vector(s0(Vector(Vector(472.0)), Vector(Vector(473.0))))))), Vector(s1(Vector(s0(Vector(Vector(474.0)), Vector(Vector(475.0))), s0(Vector(Vector(476.0)), Vector(Vector(477.0)))), Vector(Vector(s0(Vector(Vector(478.0)), Vector(Vector(479.0)))), Vector(s0(Vector(Vector(480.0)), Vector(Vector(481.0)))))), s1(Vector(s0(Vector(Vector(482.0)), Vector(Vector(483.0))), s0(Vector(Vector(484.0)), Vector(Vector(485.0)))), Vector(Vector(s0(Vector(Vector(486.0)), Vector(Vector(487.0)))), Vector(s0(Vector(Vector(488.0)), Vector(Vector(489.0)))))), s1(Vector(s0(Vector(Vector(490.0)), Vector(Vector(491.0))), s0(Vector(Vector(492.0)), Vector(Vector(493.0)))), Vector(Vector(s0(Vector(Vector(494.0)), Vector(Vector(495.0)))), Vector(s0(Vector(Vector(496.0)), Vector(Vector(497.0)))))))))
    val v5: Double = 498.0
    val start = nanoTime()
    var result: Double = 498.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4, v5)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}