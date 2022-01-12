import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  case class s2 (
    p0: s0,
    p1: Vector[Double]
  )
  case class s3 (
    p0: Vector[Vector[s1]],
    p1: s1
  )
  case class s4 (
    p0: Vector[Vector[s2]],
    p1: s3
  )
  case class s6 (
    p0: s4,
    p1: Vector[Vector[s4]]
  )
  case class s8 (
    p0: s6,
    p1: Vector[Vector[s1]]
  )
  def f33(v0: s6): s6 = {
    val v5: Vector[Vector[s4]] = v0.p1
    val v6: s4 = v0.p0
    val v31: s6 = s6(v6, v5)
    v31
  }
  @noinline
  def f0(v0: Vector[s8], v1: Double): Double = {
    val v7: s8 = v0(0)
    val v22: s6 = v7.p0
    val v2: s6 = f33(v22)
    val v21: s6 = f33(v2)
    val v55: s4 = v21.p0
    val v40: Vector[Vector[s2]] = v55.p0
    val v37: Vector[s2] = v40(1)
    var v118: Vector[s2] = v37
    val v71: s2 = v118(0)
    val v212: Vector[Double] = v71.p1
    val v210: Double = v212(0)
    v210
  }
  def benchmark(): Unit = {
    val v0: Vector[s8] = Vector(s8(s6(s4(Vector(Vector(s2(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0))), Vector(6.0, 7.0))), Vector(s2(s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0), Vector(12.0), Vector(13.0))), Vector(14.0, 15.0)))), s3(Vector(Vector(s1(Vector(s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0), Vector(20.0), Vector(21.0))), s0(Vector(Vector(22.0), Vector(23.0), Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0))), s0(Vector(Vector(28.0), Vector(29.0), Vector(30.0)), Vector(Vector(31.0), Vector(32.0), Vector(33.0)))), Vector(s0(Vector(Vector(34.0), Vector(35.0), Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0))), s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0), Vector(44.0), Vector(45.0)))))), Vector(s1(Vector(s0(Vector(Vector(46.0), Vector(47.0), Vector(48.0)), Vector(Vector(49.0), Vector(50.0), Vector(51.0))), s0(Vector(Vector(52.0), Vector(53.0), Vector(54.0)), Vector(Vector(55.0), Vector(56.0), Vector(57.0))), s0(Vector(Vector(58.0), Vector(59.0), Vector(60.0)), Vector(Vector(61.0), Vector(62.0), Vector(63.0)))), Vector(s0(Vector(Vector(64.0), Vector(65.0), Vector(66.0)), Vector(Vector(67.0), Vector(68.0), Vector(69.0))), s0(Vector(Vector(70.0), Vector(71.0), Vector(72.0)), Vector(Vector(73.0), Vector(74.0), Vector(75.0))))))), s1(Vector(s0(Vector(Vector(76.0), Vector(77.0), Vector(78.0)), Vector(Vector(79.0), Vector(80.0), Vector(81.0))), s0(Vector(Vector(82.0), Vector(83.0), Vector(84.0)), Vector(Vector(85.0), Vector(86.0), Vector(87.0))), s0(Vector(Vector(88.0), Vector(89.0), Vector(90.0)), Vector(Vector(91.0), Vector(92.0), Vector(93.0)))), Vector(s0(Vector(Vector(94.0), Vector(95.0), Vector(96.0)), Vector(Vector(97.0), Vector(98.0), Vector(99.0))), s0(Vector(Vector(100.0), Vector(101.0), Vector(102.0)), Vector(Vector(103.0), Vector(104.0), Vector(105.0))))))), Vector(Vector(s4(Vector(Vector(s2(s0(Vector(Vector(106.0), Vector(107.0), Vector(108.0)), Vector(Vector(109.0), Vector(110.0), Vector(111.0))), Vector(112.0, 113.0))), Vector(s2(s0(Vector(Vector(114.0), Vector(115.0), Vector(116.0)), Vector(Vector(117.0), Vector(118.0), Vector(119.0))), Vector(120.0, 121.0)))), s3(Vector(Vector(s1(Vector(s0(Vector(Vector(122.0), Vector(123.0), Vector(124.0)), Vector(Vector(125.0), Vector(126.0), Vector(127.0))), s0(Vector(Vector(128.0), Vector(129.0), Vector(130.0)), Vector(Vector(131.0), Vector(132.0), Vector(133.0))), s0(Vector(Vector(134.0), Vector(135.0), Vector(136.0)), Vector(Vector(137.0), Vector(138.0), Vector(139.0)))), Vector(s0(Vector(Vector(140.0), Vector(141.0), Vector(142.0)), Vector(Vector(143.0), Vector(144.0), Vector(145.0))), s0(Vector(Vector(146.0), Vector(147.0), Vector(148.0)), Vector(Vector(149.0), Vector(150.0), Vector(151.0)))))), Vector(s1(Vector(s0(Vector(Vector(152.0), Vector(153.0), Vector(154.0)), Vector(Vector(155.0), Vector(156.0), Vector(157.0))), s0(Vector(Vector(158.0), Vector(159.0), Vector(160.0)), Vector(Vector(161.0), Vector(162.0), Vector(163.0))), s0(Vector(Vector(164.0), Vector(165.0), Vector(166.0)), Vector(Vector(167.0), Vector(168.0), Vector(169.0)))), Vector(s0(Vector(Vector(170.0), Vector(171.0), Vector(172.0)), Vector(Vector(173.0), Vector(174.0), Vector(175.0))), s0(Vector(Vector(176.0), Vector(177.0), Vector(178.0)), Vector(Vector(179.0), Vector(180.0), Vector(181.0))))))), s1(Vector(s0(Vector(Vector(182.0), Vector(183.0), Vector(184.0)), Vector(Vector(185.0), Vector(186.0), Vector(187.0))), s0(Vector(Vector(188.0), Vector(189.0), Vector(190.0)), Vector(Vector(191.0), Vector(192.0), Vector(193.0))), s0(Vector(Vector(194.0), Vector(195.0), Vector(196.0)), Vector(Vector(197.0), Vector(198.0), Vector(199.0)))), Vector(s0(Vector(Vector(200.0), Vector(201.0), Vector(202.0)), Vector(Vector(203.0), Vector(204.0), Vector(205.0))), s0(Vector(Vector(206.0), Vector(207.0), Vector(208.0)), Vector(Vector(209.0), Vector(210.0), Vector(211.0)))))))), Vector(s4(Vector(Vector(s2(s0(Vector(Vector(212.0), Vector(213.0), Vector(214.0)), Vector(Vector(215.0), Vector(216.0), Vector(217.0))), Vector(218.0, 219.0))), Vector(s2(s0(Vector(Vector(220.0), Vector(221.0), Vector(222.0)), Vector(Vector(223.0), Vector(224.0), Vector(225.0))), Vector(226.0, 227.0)))), s3(Vector(Vector(s1(Vector(s0(Vector(Vector(228.0), Vector(229.0), Vector(230.0)), Vector(Vector(231.0), Vector(232.0), Vector(233.0))), s0(Vector(Vector(234.0), Vector(235.0), Vector(236.0)), Vector(Vector(237.0), Vector(238.0), Vector(239.0))), s0(Vector(Vector(240.0), Vector(241.0), Vector(242.0)), Vector(Vector(243.0), Vector(244.0), Vector(245.0)))), Vector(s0(Vector(Vector(246.0), Vector(247.0), Vector(248.0)), Vector(Vector(249.0), Vector(250.0), Vector(251.0))), s0(Vector(Vector(252.0), Vector(253.0), Vector(254.0)), Vector(Vector(255.0), Vector(256.0), Vector(257.0)))))), Vector(s1(Vector(s0(Vector(Vector(258.0), Vector(259.0), Vector(260.0)), Vector(Vector(261.0), Vector(262.0), Vector(263.0))), s0(Vector(Vector(264.0), Vector(265.0), Vector(266.0)), Vector(Vector(267.0), Vector(268.0), Vector(269.0))), s0(Vector(Vector(270.0), Vector(271.0), Vector(272.0)), Vector(Vector(273.0), Vector(274.0), Vector(275.0)))), Vector(s0(Vector(Vector(276.0), Vector(277.0), Vector(278.0)), Vector(Vector(279.0), Vector(280.0), Vector(281.0))), s0(Vector(Vector(282.0), Vector(283.0), Vector(284.0)), Vector(Vector(285.0), Vector(286.0), Vector(287.0))))))), s1(Vector(s0(Vector(Vector(288.0), Vector(289.0), Vector(290.0)), Vector(Vector(291.0), Vector(292.0), Vector(293.0))), s0(Vector(Vector(294.0), Vector(295.0), Vector(296.0)), Vector(Vector(297.0), Vector(298.0), Vector(299.0))), s0(Vector(Vector(300.0), Vector(301.0), Vector(302.0)), Vector(Vector(303.0), Vector(304.0), Vector(305.0)))), Vector(s0(Vector(Vector(306.0), Vector(307.0), Vector(308.0)), Vector(Vector(309.0), Vector(310.0), Vector(311.0))), s0(Vector(Vector(312.0), Vector(313.0), Vector(314.0)), Vector(Vector(315.0), Vector(316.0), Vector(317.0)))))))), Vector(s4(Vector(Vector(s2(s0(Vector(Vector(318.0), Vector(319.0), Vector(320.0)), Vector(Vector(321.0), Vector(322.0), Vector(323.0))), Vector(324.0, 325.0))), Vector(s2(s0(Vector(Vector(326.0), Vector(327.0), Vector(328.0)), Vector(Vector(329.0), Vector(330.0), Vector(331.0))), Vector(332.0, 333.0)))), s3(Vector(Vector(s1(Vector(s0(Vector(Vector(334.0), Vector(335.0), Vector(336.0)), Vector(Vector(337.0), Vector(338.0), Vector(339.0))), s0(Vector(Vector(340.0), Vector(341.0), Vector(342.0)), Vector(Vector(343.0), Vector(344.0), Vector(345.0))), s0(Vector(Vector(346.0), Vector(347.0), Vector(348.0)), Vector(Vector(349.0), Vector(350.0), Vector(351.0)))), Vector(s0(Vector(Vector(352.0), Vector(353.0), Vector(354.0)), Vector(Vector(355.0), Vector(356.0), Vector(357.0))), s0(Vector(Vector(358.0), Vector(359.0), Vector(360.0)), Vector(Vector(361.0), Vector(362.0), Vector(363.0)))))), Vector(s1(Vector(s0(Vector(Vector(364.0), Vector(365.0), Vector(366.0)), Vector(Vector(367.0), Vector(368.0), Vector(369.0))), s0(Vector(Vector(370.0), Vector(371.0), Vector(372.0)), Vector(Vector(373.0), Vector(374.0), Vector(375.0))), s0(Vector(Vector(376.0), Vector(377.0), Vector(378.0)), Vector(Vector(379.0), Vector(380.0), Vector(381.0)))), Vector(s0(Vector(Vector(382.0), Vector(383.0), Vector(384.0)), Vector(Vector(385.0), Vector(386.0), Vector(387.0))), s0(Vector(Vector(388.0), Vector(389.0), Vector(390.0)), Vector(Vector(391.0), Vector(392.0), Vector(393.0))))))), s1(Vector(s0(Vector(Vector(394.0), Vector(395.0), Vector(396.0)), Vector(Vector(397.0), Vector(398.0), Vector(399.0))), s0(Vector(Vector(400.0), Vector(401.0), Vector(402.0)), Vector(Vector(403.0), Vector(404.0), Vector(405.0))), s0(Vector(Vector(406.0), Vector(407.0), Vector(408.0)), Vector(Vector(409.0), Vector(410.0), Vector(411.0)))), Vector(s0(Vector(Vector(412.0), Vector(413.0), Vector(414.0)), Vector(Vector(415.0), Vector(416.0), Vector(417.0))), s0(Vector(Vector(418.0), Vector(419.0), Vector(420.0)), Vector(Vector(421.0), Vector(422.0), Vector(423.0)))))))))), Vector(Vector(s1(Vector(s0(Vector(Vector(424.0), Vector(425.0), Vector(426.0)), Vector(Vector(427.0), Vector(428.0), Vector(429.0))), s0(Vector(Vector(430.0), Vector(431.0), Vector(432.0)), Vector(Vector(433.0), Vector(434.0), Vector(435.0))), s0(Vector(Vector(436.0), Vector(437.0), Vector(438.0)), Vector(Vector(439.0), Vector(440.0), Vector(441.0)))), Vector(s0(Vector(Vector(442.0), Vector(443.0), Vector(444.0)), Vector(Vector(445.0), Vector(446.0), Vector(447.0))), s0(Vector(Vector(448.0), Vector(449.0), Vector(450.0)), Vector(Vector(451.0), Vector(452.0), Vector(453.0)))))), Vector(s1(Vector(s0(Vector(Vector(454.0), Vector(455.0), Vector(456.0)), Vector(Vector(457.0), Vector(458.0), Vector(459.0))), s0(Vector(Vector(460.0), Vector(461.0), Vector(462.0)), Vector(Vector(463.0), Vector(464.0), Vector(465.0))), s0(Vector(Vector(466.0), Vector(467.0), Vector(468.0)), Vector(Vector(469.0), Vector(470.0), Vector(471.0)))), Vector(s0(Vector(Vector(472.0), Vector(473.0), Vector(474.0)), Vector(Vector(475.0), Vector(476.0), Vector(477.0))), s0(Vector(Vector(478.0), Vector(479.0), Vector(480.0)), Vector(Vector(481.0), Vector(482.0), Vector(483.0)))))))))
    val v1: Double = 484.0
    val start = nanoTime()
    var result: Double = 484.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}