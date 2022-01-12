import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: s0
  )
  case class s2 (
    p0: Vector[s0],
    p1: s1,
    p2: Vector[s1],
    p3: s0,
    p4: s1
  )
  case class s3 (
    p0: s1,
    p1: s2
  )
  case class s4 (
    p0: Vector[Vector[s2]],
    p1: s0
  )
  case class s6 (
    p0: s3,
    p1: s2
  )
  case class s7 (
    p0: s0,
    p1: Vector[Vector[s6]]
  )
  def f29(v0: Double): Double = {
    var v3: Double = v0
    var v7: Double = v3
    var v6: Double = v3
    var v4: Double = v7
    var v5: Double = v4
    v4 = v5
    var v2: Double = v5
    v2 = v5
    var v1: Double = v3
    v2 = v0
    var v10: Double = v6
    v5 = v10
    var v11: Double = v4
    var v14: Double = v6
    var v19: Double = v0
    v4 = v10
    val v29: Double = v14 * v10
    var v32: Double = v2
    var v16: Double = v7
    var v30: Double = v11
    var v35: Double = v30
    val v25: Vector[Double] = Vector(v29)
    var v36: Vector[Double] = v25
    v36 = v36.updated(0, v3)
    var v34: Vector[Double] = v36
    v36 = v36.updated(0, v32)
    val v141: Double = v25(0)
    val v40: Double = v34(0)
    val v48: Vector[Double] = Vector(v16, v141, v32, v40, v16)
    v34 = v34.updated(0, v19)
    var v68: Vector[Double] = v48
    var v146: Double = v35
    var v114: Vector[Double] = v68
    val v41: Double = v114(3)
    v68 = v68.updated(2, v40)
    v34 = v34.updated(0, v1)
    v114 = v114.updated(1, v146)
    v68 = v68.updated(0, v40)
    v41
  }
  @noinline
  def f0(v0: Vector[Vector[s4]], v1: s2, v2: Vector[s2], v3: Vector[s7], v4: Double): Double = {
    val v8: Double = f29(v4)
    val v13: Double = f29(v8)
    val v20: Double = f29(v4)
    val v87: Double = v20 + v13
    val v68: Vector[Double] = Vector(v87, v87, v8, v87, v8)
    val v88: Double = v68(1)
    var v146: Double = v87
    val v77: Double = v146 + v88
    v77
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s4]] = Vector(Vector(s4(Vector(Vector(s2(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0))), s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0))), s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0)))), s1(Vector(Vector(s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0))))), s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0)))), Vector(s1(Vector(Vector(s0(Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0))))), s0(Vector(Vector(18.0)), Vector(Vector(19.0), Vector(20.0)))), s1(Vector(Vector(s0(Vector(Vector(21.0)), Vector(Vector(22.0), Vector(23.0))))), s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0)))), s1(Vector(Vector(s0(Vector(Vector(27.0)), Vector(Vector(28.0), Vector(29.0))))), s0(Vector(Vector(30.0)), Vector(Vector(31.0), Vector(32.0))))), s0(Vector(Vector(33.0)), Vector(Vector(34.0), Vector(35.0))), s1(Vector(Vector(s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0))))), s0(Vector(Vector(39.0)), Vector(Vector(40.0), Vector(41.0))))))), s0(Vector(Vector(42.0)), Vector(Vector(43.0), Vector(44.0))))), Vector(s4(Vector(Vector(s2(Vector(s0(Vector(Vector(45.0)), Vector(Vector(46.0), Vector(47.0))), s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0))), s0(Vector(Vector(51.0)), Vector(Vector(52.0), Vector(53.0)))), s1(Vector(Vector(s0(Vector(Vector(54.0)), Vector(Vector(55.0), Vector(56.0))))), s0(Vector(Vector(57.0)), Vector(Vector(58.0), Vector(59.0)))), Vector(s1(Vector(Vector(s0(Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0))))), s0(Vector(Vector(63.0)), Vector(Vector(64.0), Vector(65.0)))), s1(Vector(Vector(s0(Vector(Vector(66.0)), Vector(Vector(67.0), Vector(68.0))))), s0(Vector(Vector(69.0)), Vector(Vector(70.0), Vector(71.0)))), s1(Vector(Vector(s0(Vector(Vector(72.0)), Vector(Vector(73.0), Vector(74.0))))), s0(Vector(Vector(75.0)), Vector(Vector(76.0), Vector(77.0))))), s0(Vector(Vector(78.0)), Vector(Vector(79.0), Vector(80.0))), s1(Vector(Vector(s0(Vector(Vector(81.0)), Vector(Vector(82.0), Vector(83.0))))), s0(Vector(Vector(84.0)), Vector(Vector(85.0), Vector(86.0))))))), s0(Vector(Vector(87.0)), Vector(Vector(88.0), Vector(89.0))))))
    val v1: s2 = s2(Vector(s0(Vector(Vector(90.0)), Vector(Vector(91.0), Vector(92.0))), s0(Vector(Vector(93.0)), Vector(Vector(94.0), Vector(95.0))), s0(Vector(Vector(96.0)), Vector(Vector(97.0), Vector(98.0)))), s1(Vector(Vector(s0(Vector(Vector(99.0)), Vector(Vector(100.0), Vector(101.0))))), s0(Vector(Vector(102.0)), Vector(Vector(103.0), Vector(104.0)))), Vector(s1(Vector(Vector(s0(Vector(Vector(105.0)), Vector(Vector(106.0), Vector(107.0))))), s0(Vector(Vector(108.0)), Vector(Vector(109.0), Vector(110.0)))), s1(Vector(Vector(s0(Vector(Vector(111.0)), Vector(Vector(112.0), Vector(113.0))))), s0(Vector(Vector(114.0)), Vector(Vector(115.0), Vector(116.0)))), s1(Vector(Vector(s0(Vector(Vector(117.0)), Vector(Vector(118.0), Vector(119.0))))), s0(Vector(Vector(120.0)), Vector(Vector(121.0), Vector(122.0))))), s0(Vector(Vector(123.0)), Vector(Vector(124.0), Vector(125.0))), s1(Vector(Vector(s0(Vector(Vector(126.0)), Vector(Vector(127.0), Vector(128.0))))), s0(Vector(Vector(129.0)), Vector(Vector(130.0), Vector(131.0)))))
    val v2: Vector[s2] = Vector(s2(Vector(s0(Vector(Vector(132.0)), Vector(Vector(133.0), Vector(134.0))), s0(Vector(Vector(135.0)), Vector(Vector(136.0), Vector(137.0))), s0(Vector(Vector(138.0)), Vector(Vector(139.0), Vector(140.0)))), s1(Vector(Vector(s0(Vector(Vector(141.0)), Vector(Vector(142.0), Vector(143.0))))), s0(Vector(Vector(144.0)), Vector(Vector(145.0), Vector(146.0)))), Vector(s1(Vector(Vector(s0(Vector(Vector(147.0)), Vector(Vector(148.0), Vector(149.0))))), s0(Vector(Vector(150.0)), Vector(Vector(151.0), Vector(152.0)))), s1(Vector(Vector(s0(Vector(Vector(153.0)), Vector(Vector(154.0), Vector(155.0))))), s0(Vector(Vector(156.0)), Vector(Vector(157.0), Vector(158.0)))), s1(Vector(Vector(s0(Vector(Vector(159.0)), Vector(Vector(160.0), Vector(161.0))))), s0(Vector(Vector(162.0)), Vector(Vector(163.0), Vector(164.0))))), s0(Vector(Vector(165.0)), Vector(Vector(166.0), Vector(167.0))), s1(Vector(Vector(s0(Vector(Vector(168.0)), Vector(Vector(169.0), Vector(170.0))))), s0(Vector(Vector(171.0)), Vector(Vector(172.0), Vector(173.0))))), s2(Vector(s0(Vector(Vector(174.0)), Vector(Vector(175.0), Vector(176.0))), s0(Vector(Vector(177.0)), Vector(Vector(178.0), Vector(179.0))), s0(Vector(Vector(180.0)), Vector(Vector(181.0), Vector(182.0)))), s1(Vector(Vector(s0(Vector(Vector(183.0)), Vector(Vector(184.0), Vector(185.0))))), s0(Vector(Vector(186.0)), Vector(Vector(187.0), Vector(188.0)))), Vector(s1(Vector(Vector(s0(Vector(Vector(189.0)), Vector(Vector(190.0), Vector(191.0))))), s0(Vector(Vector(192.0)), Vector(Vector(193.0), Vector(194.0)))), s1(Vector(Vector(s0(Vector(Vector(195.0)), Vector(Vector(196.0), Vector(197.0))))), s0(Vector(Vector(198.0)), Vector(Vector(199.0), Vector(200.0)))), s1(Vector(Vector(s0(Vector(Vector(201.0)), Vector(Vector(202.0), Vector(203.0))))), s0(Vector(Vector(204.0)), Vector(Vector(205.0), Vector(206.0))))), s0(Vector(Vector(207.0)), Vector(Vector(208.0), Vector(209.0))), s1(Vector(Vector(s0(Vector(Vector(210.0)), Vector(Vector(211.0), Vector(212.0))))), s0(Vector(Vector(213.0)), Vector(Vector(214.0), Vector(215.0))))))
    val v3: Vector[s7] = Vector(s7(s0(Vector(Vector(216.0)), Vector(Vector(217.0), Vector(218.0))), Vector(Vector(s6(s3(s1(Vector(Vector(s0(Vector(Vector(219.0)), Vector(Vector(220.0), Vector(221.0))))), s0(Vector(Vector(222.0)), Vector(Vector(223.0), Vector(224.0)))), s2(Vector(s0(Vector(Vector(225.0)), Vector(Vector(226.0), Vector(227.0))), s0(Vector(Vector(228.0)), Vector(Vector(229.0), Vector(230.0))), s0(Vector(Vector(231.0)), Vector(Vector(232.0), Vector(233.0)))), s1(Vector(Vector(s0(Vector(Vector(234.0)), Vector(Vector(235.0), Vector(236.0))))), s0(Vector(Vector(237.0)), Vector(Vector(238.0), Vector(239.0)))), Vector(s1(Vector(Vector(s0(Vector(Vector(240.0)), Vector(Vector(241.0), Vector(242.0))))), s0(Vector(Vector(243.0)), Vector(Vector(244.0), Vector(245.0)))), s1(Vector(Vector(s0(Vector(Vector(246.0)), Vector(Vector(247.0), Vector(248.0))))), s0(Vector(Vector(249.0)), Vector(Vector(250.0), Vector(251.0)))), s1(Vector(Vector(s0(Vector(Vector(252.0)), Vector(Vector(253.0), Vector(254.0))))), s0(Vector(Vector(255.0)), Vector(Vector(256.0), Vector(257.0))))), s0(Vector(Vector(258.0)), Vector(Vector(259.0), Vector(260.0))), s1(Vector(Vector(s0(Vector(Vector(261.0)), Vector(Vector(262.0), Vector(263.0))))), s0(Vector(Vector(264.0)), Vector(Vector(265.0), Vector(266.0)))))), s2(Vector(s0(Vector(Vector(267.0)), Vector(Vector(268.0), Vector(269.0))), s0(Vector(Vector(270.0)), Vector(Vector(271.0), Vector(272.0))), s0(Vector(Vector(273.0)), Vector(Vector(274.0), Vector(275.0)))), s1(Vector(Vector(s0(Vector(Vector(276.0)), Vector(Vector(277.0), Vector(278.0))))), s0(Vector(Vector(279.0)), Vector(Vector(280.0), Vector(281.0)))), Vector(s1(Vector(Vector(s0(Vector(Vector(282.0)), Vector(Vector(283.0), Vector(284.0))))), s0(Vector(Vector(285.0)), Vector(Vector(286.0), Vector(287.0)))), s1(Vector(Vector(s0(Vector(Vector(288.0)), Vector(Vector(289.0), Vector(290.0))))), s0(Vector(Vector(291.0)), Vector(Vector(292.0), Vector(293.0)))), s1(Vector(Vector(s0(Vector(Vector(294.0)), Vector(Vector(295.0), Vector(296.0))))), s0(Vector(Vector(297.0)), Vector(Vector(298.0), Vector(299.0))))), s0(Vector(Vector(300.0)), Vector(Vector(301.0), Vector(302.0))), s1(Vector(Vector(s0(Vector(Vector(303.0)), Vector(Vector(304.0), Vector(305.0))))), s0(Vector(Vector(306.0)), Vector(Vector(307.0), Vector(308.0))))))), Vector(s6(s3(s1(Vector(Vector(s0(Vector(Vector(309.0)), Vector(Vector(310.0), Vector(311.0))))), s0(Vector(Vector(312.0)), Vector(Vector(313.0), Vector(314.0)))), s2(Vector(s0(Vector(Vector(315.0)), Vector(Vector(316.0), Vector(317.0))), s0(Vector(Vector(318.0)), Vector(Vector(319.0), Vector(320.0))), s0(Vector(Vector(321.0)), Vector(Vector(322.0), Vector(323.0)))), s1(Vector(Vector(s0(Vector(Vector(324.0)), Vector(Vector(325.0), Vector(326.0))))), s0(Vector(Vector(327.0)), Vector(Vector(328.0), Vector(329.0)))), Vector(s1(Vector(Vector(s0(Vector(Vector(330.0)), Vector(Vector(331.0), Vector(332.0))))), s0(Vector(Vector(333.0)), Vector(Vector(334.0), Vector(335.0)))), s1(Vector(Vector(s0(Vector(Vector(336.0)), Vector(Vector(337.0), Vector(338.0))))), s0(Vector(Vector(339.0)), Vector(Vector(340.0), Vector(341.0)))), s1(Vector(Vector(s0(Vector(Vector(342.0)), Vector(Vector(343.0), Vector(344.0))))), s0(Vector(Vector(345.0)), Vector(Vector(346.0), Vector(347.0))))), s0(Vector(Vector(348.0)), Vector(Vector(349.0), Vector(350.0))), s1(Vector(Vector(s0(Vector(Vector(351.0)), Vector(Vector(352.0), Vector(353.0))))), s0(Vector(Vector(354.0)), Vector(Vector(355.0), Vector(356.0)))))), s2(Vector(s0(Vector(Vector(357.0)), Vector(Vector(358.0), Vector(359.0))), s0(Vector(Vector(360.0)), Vector(Vector(361.0), Vector(362.0))), s0(Vector(Vector(363.0)), Vector(Vector(364.0), Vector(365.0)))), s1(Vector(Vector(s0(Vector(Vector(366.0)), Vector(Vector(367.0), Vector(368.0))))), s0(Vector(Vector(369.0)), Vector(Vector(370.0), Vector(371.0)))), Vector(s1(Vector(Vector(s0(Vector(Vector(372.0)), Vector(Vector(373.0), Vector(374.0))))), s0(Vector(Vector(375.0)), Vector(Vector(376.0), Vector(377.0)))), s1(Vector(Vector(s0(Vector(Vector(378.0)), Vector(Vector(379.0), Vector(380.0))))), s0(Vector(Vector(381.0)), Vector(Vector(382.0), Vector(383.0)))), s1(Vector(Vector(s0(Vector(Vector(384.0)), Vector(Vector(385.0), Vector(386.0))))), s0(Vector(Vector(387.0)), Vector(Vector(388.0), Vector(389.0))))), s0(Vector(Vector(390.0)), Vector(Vector(391.0), Vector(392.0))), s1(Vector(Vector(s0(Vector(Vector(393.0)), Vector(Vector(394.0), Vector(395.0))))), s0(Vector(Vector(396.0)), Vector(Vector(397.0), Vector(398.0))))))), Vector(s6(s3(s1(Vector(Vector(s0(Vector(Vector(399.0)), Vector(Vector(400.0), Vector(401.0))))), s0(Vector(Vector(402.0)), Vector(Vector(403.0), Vector(404.0)))), s2(Vector(s0(Vector(Vector(405.0)), Vector(Vector(406.0), Vector(407.0))), s0(Vector(Vector(408.0)), Vector(Vector(409.0), Vector(410.0))), s0(Vector(Vector(411.0)), Vector(Vector(412.0), Vector(413.0)))), s1(Vector(Vector(s0(Vector(Vector(414.0)), Vector(Vector(415.0), Vector(416.0))))), s0(Vector(Vector(417.0)), Vector(Vector(418.0), Vector(419.0)))), Vector(s1(Vector(Vector(s0(Vector(Vector(420.0)), Vector(Vector(421.0), Vector(422.0))))), s0(Vector(Vector(423.0)), Vector(Vector(424.0), Vector(425.0)))), s1(Vector(Vector(s0(Vector(Vector(426.0)), Vector(Vector(427.0), Vector(428.0))))), s0(Vector(Vector(429.0)), Vector(Vector(430.0), Vector(431.0)))), s1(Vector(Vector(s0(Vector(Vector(432.0)), Vector(Vector(433.0), Vector(434.0))))), s0(Vector(Vector(435.0)), Vector(Vector(436.0), Vector(437.0))))), s0(Vector(Vector(438.0)), Vector(Vector(439.0), Vector(440.0))), s1(Vector(Vector(s0(Vector(Vector(441.0)), Vector(Vector(442.0), Vector(443.0))))), s0(Vector(Vector(444.0)), Vector(Vector(445.0), Vector(446.0)))))), s2(Vector(s0(Vector(Vector(447.0)), Vector(Vector(448.0), Vector(449.0))), s0(Vector(Vector(450.0)), Vector(Vector(451.0), Vector(452.0))), s0(Vector(Vector(453.0)), Vector(Vector(454.0), Vector(455.0)))), s1(Vector(Vector(s0(Vector(Vector(456.0)), Vector(Vector(457.0), Vector(458.0))))), s0(Vector(Vector(459.0)), Vector(Vector(460.0), Vector(461.0)))), Vector(s1(Vector(Vector(s0(Vector(Vector(462.0)), Vector(Vector(463.0), Vector(464.0))))), s0(Vector(Vector(465.0)), Vector(Vector(466.0), Vector(467.0)))), s1(Vector(Vector(s0(Vector(Vector(468.0)), Vector(Vector(469.0), Vector(470.0))))), s0(Vector(Vector(471.0)), Vector(Vector(472.0), Vector(473.0)))), s1(Vector(Vector(s0(Vector(Vector(474.0)), Vector(Vector(475.0), Vector(476.0))))), s0(Vector(Vector(477.0)), Vector(Vector(478.0), Vector(479.0))))), s0(Vector(Vector(480.0)), Vector(Vector(481.0), Vector(482.0))), s1(Vector(Vector(s0(Vector(Vector(483.0)), Vector(Vector(484.0), Vector(485.0))))), s0(Vector(Vector(486.0)), Vector(Vector(487.0), Vector(488.0))))))))))
    val v4: Double = 489.0
    val start = nanoTime()
    var result: Double = 489.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}