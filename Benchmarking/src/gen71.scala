import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Double,
    p1: s0
  )
  case class s2 (
    p0: Vector[s0],
    p1: Vector[s1]
  )
  case class s3 (
    p0: s1,
    p1: s2,
    p2: s0,
    p3: s2,
    p4: Vector[s0],
    p5: Vector[s1],
    p6: s2,
    p7: s1
  )
  case class s4 (
    p0: s0,
    p1: s0
  )
  case class s5 (
    p0: Vector[Vector[s4]],
    p1: Vector[s3]
  )
  case class s8 (
    p0: s1,
    p1: s2
  )
  def f2(v0: Vector[s1], v1: s5): Vector[s1] = {
    var v149: Vector[s1] = v0
    v149
  }
  @noinline
  def f0(v0: s8, v1: Vector[Vector[s5]], v2: Double): Double = {
    val v7: Vector[s5] = v1(2)
    val v3: s5 = v7(0)
    val v4: Vector[s5] = v1(2)
    val v14: s5 = v4(0)
    val v16: Vector[s3] = v14.p1
    var v9: Double = v2
    val v13: Vector[Double] = Vector(v2, v2, v9, v9, v2, v2, v2)
    val v21: s2 = v0.p1
    v9 = v2
    val v20: s3 = v16(0)
    val v12: s3 = v16(0)
    var v36: s3 = v12
    v36 = v20
    val v24: s2 = v36.p3
    val v50: Vector[s1] = v21.p1
    val v94: Vector[s1] = f2(v50, v3)
    val v37: Vector[s0] = v24.p0
    v36 = v36.copy(p1 = v21)
    val v67: Double = v13(2)
    val v29: s0 = v37(1)
    val v95: Vector[Vector[Double]] = v29.p1
    var v73: Vector[Vector[Double]] = v95
    val v65: Vector[Double] = v73(1)
    val v76: s1 = v94(2)
    val v184: Double = v76.p0
    val v189: Double = v184 - v67
    val v93: Double = v65(0)
    val v160: Double = v189 - v93
    v160
  }
  def benchmark(): Unit = {
    val v0: s8 = s8(s1(0.0, s0(Vector(Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0)))), s2(Vector(s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0), Vector(10.0))), s0(Vector(Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0)))), Vector(s1(16.0, s0(Vector(Vector(17.0), Vector(18.0)), Vector(Vector(19.0), Vector(20.0), Vector(21.0)))), s1(22.0, s0(Vector(Vector(23.0), Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0)))), s1(28.0, s0(Vector(Vector(29.0), Vector(30.0)), Vector(Vector(31.0), Vector(32.0), Vector(33.0)))))))
    val v1: Vector[Vector[s5]] = Vector(Vector(s5(Vector(Vector(s4(s0(Vector(Vector(34.0), Vector(35.0)), Vector(Vector(36.0), Vector(37.0), Vector(38.0))), s0(Vector(Vector(39.0), Vector(40.0)), Vector(Vector(41.0), Vector(42.0), Vector(43.0))))), Vector(s4(s0(Vector(Vector(44.0), Vector(45.0)), Vector(Vector(46.0), Vector(47.0), Vector(48.0))), s0(Vector(Vector(49.0), Vector(50.0)), Vector(Vector(51.0), Vector(52.0), Vector(53.0)))))), Vector(s3(s1(54.0, s0(Vector(Vector(55.0), Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0)))), s2(Vector(s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0), Vector(63.0), Vector(64.0))), s0(Vector(Vector(65.0), Vector(66.0)), Vector(Vector(67.0), Vector(68.0), Vector(69.0)))), Vector(s1(70.0, s0(Vector(Vector(71.0), Vector(72.0)), Vector(Vector(73.0), Vector(74.0), Vector(75.0)))), s1(76.0, s0(Vector(Vector(77.0), Vector(78.0)), Vector(Vector(79.0), Vector(80.0), Vector(81.0)))), s1(82.0, s0(Vector(Vector(83.0), Vector(84.0)), Vector(Vector(85.0), Vector(86.0), Vector(87.0)))))), s0(Vector(Vector(88.0), Vector(89.0)), Vector(Vector(90.0), Vector(91.0), Vector(92.0))), s2(Vector(s0(Vector(Vector(93.0), Vector(94.0)), Vector(Vector(95.0), Vector(96.0), Vector(97.0))), s0(Vector(Vector(98.0), Vector(99.0)), Vector(Vector(100.0), Vector(101.0), Vector(102.0)))), Vector(s1(103.0, s0(Vector(Vector(104.0), Vector(105.0)), Vector(Vector(106.0), Vector(107.0), Vector(108.0)))), s1(109.0, s0(Vector(Vector(110.0), Vector(111.0)), Vector(Vector(112.0), Vector(113.0), Vector(114.0)))), s1(115.0, s0(Vector(Vector(116.0), Vector(117.0)), Vector(Vector(118.0), Vector(119.0), Vector(120.0)))))), Vector(s0(Vector(Vector(121.0), Vector(122.0)), Vector(Vector(123.0), Vector(124.0), Vector(125.0)))), Vector(s1(126.0, s0(Vector(Vector(127.0), Vector(128.0)), Vector(Vector(129.0), Vector(130.0), Vector(131.0)))), s1(132.0, s0(Vector(Vector(133.0), Vector(134.0)), Vector(Vector(135.0), Vector(136.0), Vector(137.0))))), s2(Vector(s0(Vector(Vector(138.0), Vector(139.0)), Vector(Vector(140.0), Vector(141.0), Vector(142.0))), s0(Vector(Vector(143.0), Vector(144.0)), Vector(Vector(145.0), Vector(146.0), Vector(147.0)))), Vector(s1(148.0, s0(Vector(Vector(149.0), Vector(150.0)), Vector(Vector(151.0), Vector(152.0), Vector(153.0)))), s1(154.0, s0(Vector(Vector(155.0), Vector(156.0)), Vector(Vector(157.0), Vector(158.0), Vector(159.0)))), s1(160.0, s0(Vector(Vector(161.0), Vector(162.0)), Vector(Vector(163.0), Vector(164.0), Vector(165.0)))))), s1(166.0, s0(Vector(Vector(167.0), Vector(168.0)), Vector(Vector(169.0), Vector(170.0), Vector(171.0)))))))), Vector(s5(Vector(Vector(s4(s0(Vector(Vector(172.0), Vector(173.0)), Vector(Vector(174.0), Vector(175.0), Vector(176.0))), s0(Vector(Vector(177.0), Vector(178.0)), Vector(Vector(179.0), Vector(180.0), Vector(181.0))))), Vector(s4(s0(Vector(Vector(182.0), Vector(183.0)), Vector(Vector(184.0), Vector(185.0), Vector(186.0))), s0(Vector(Vector(187.0), Vector(188.0)), Vector(Vector(189.0), Vector(190.0), Vector(191.0)))))), Vector(s3(s1(192.0, s0(Vector(Vector(193.0), Vector(194.0)), Vector(Vector(195.0), Vector(196.0), Vector(197.0)))), s2(Vector(s0(Vector(Vector(198.0), Vector(199.0)), Vector(Vector(200.0), Vector(201.0), Vector(202.0))), s0(Vector(Vector(203.0), Vector(204.0)), Vector(Vector(205.0), Vector(206.0), Vector(207.0)))), Vector(s1(208.0, s0(Vector(Vector(209.0), Vector(210.0)), Vector(Vector(211.0), Vector(212.0), Vector(213.0)))), s1(214.0, s0(Vector(Vector(215.0), Vector(216.0)), Vector(Vector(217.0), Vector(218.0), Vector(219.0)))), s1(220.0, s0(Vector(Vector(221.0), Vector(222.0)), Vector(Vector(223.0), Vector(224.0), Vector(225.0)))))), s0(Vector(Vector(226.0), Vector(227.0)), Vector(Vector(228.0), Vector(229.0), Vector(230.0))), s2(Vector(s0(Vector(Vector(231.0), Vector(232.0)), Vector(Vector(233.0), Vector(234.0), Vector(235.0))), s0(Vector(Vector(236.0), Vector(237.0)), Vector(Vector(238.0), Vector(239.0), Vector(240.0)))), Vector(s1(241.0, s0(Vector(Vector(242.0), Vector(243.0)), Vector(Vector(244.0), Vector(245.0), Vector(246.0)))), s1(247.0, s0(Vector(Vector(248.0), Vector(249.0)), Vector(Vector(250.0), Vector(251.0), Vector(252.0)))), s1(253.0, s0(Vector(Vector(254.0), Vector(255.0)), Vector(Vector(256.0), Vector(257.0), Vector(258.0)))))), Vector(s0(Vector(Vector(259.0), Vector(260.0)), Vector(Vector(261.0), Vector(262.0), Vector(263.0)))), Vector(s1(264.0, s0(Vector(Vector(265.0), Vector(266.0)), Vector(Vector(267.0), Vector(268.0), Vector(269.0)))), s1(270.0, s0(Vector(Vector(271.0), Vector(272.0)), Vector(Vector(273.0), Vector(274.0), Vector(275.0))))), s2(Vector(s0(Vector(Vector(276.0), Vector(277.0)), Vector(Vector(278.0), Vector(279.0), Vector(280.0))), s0(Vector(Vector(281.0), Vector(282.0)), Vector(Vector(283.0), Vector(284.0), Vector(285.0)))), Vector(s1(286.0, s0(Vector(Vector(287.0), Vector(288.0)), Vector(Vector(289.0), Vector(290.0), Vector(291.0)))), s1(292.0, s0(Vector(Vector(293.0), Vector(294.0)), Vector(Vector(295.0), Vector(296.0), Vector(297.0)))), s1(298.0, s0(Vector(Vector(299.0), Vector(300.0)), Vector(Vector(301.0), Vector(302.0), Vector(303.0)))))), s1(304.0, s0(Vector(Vector(305.0), Vector(306.0)), Vector(Vector(307.0), Vector(308.0), Vector(309.0)))))))), Vector(s5(Vector(Vector(s4(s0(Vector(Vector(310.0), Vector(311.0)), Vector(Vector(312.0), Vector(313.0), Vector(314.0))), s0(Vector(Vector(315.0), Vector(316.0)), Vector(Vector(317.0), Vector(318.0), Vector(319.0))))), Vector(s4(s0(Vector(Vector(320.0), Vector(321.0)), Vector(Vector(322.0), Vector(323.0), Vector(324.0))), s0(Vector(Vector(325.0), Vector(326.0)), Vector(Vector(327.0), Vector(328.0), Vector(329.0)))))), Vector(s3(s1(330.0, s0(Vector(Vector(331.0), Vector(332.0)), Vector(Vector(333.0), Vector(334.0), Vector(335.0)))), s2(Vector(s0(Vector(Vector(336.0), Vector(337.0)), Vector(Vector(338.0), Vector(339.0), Vector(340.0))), s0(Vector(Vector(341.0), Vector(342.0)), Vector(Vector(343.0), Vector(344.0), Vector(345.0)))), Vector(s1(346.0, s0(Vector(Vector(347.0), Vector(348.0)), Vector(Vector(349.0), Vector(350.0), Vector(351.0)))), s1(352.0, s0(Vector(Vector(353.0), Vector(354.0)), Vector(Vector(355.0), Vector(356.0), Vector(357.0)))), s1(358.0, s0(Vector(Vector(359.0), Vector(360.0)), Vector(Vector(361.0), Vector(362.0), Vector(363.0)))))), s0(Vector(Vector(364.0), Vector(365.0)), Vector(Vector(366.0), Vector(367.0), Vector(368.0))), s2(Vector(s0(Vector(Vector(369.0), Vector(370.0)), Vector(Vector(371.0), Vector(372.0), Vector(373.0))), s0(Vector(Vector(374.0), Vector(375.0)), Vector(Vector(376.0), Vector(377.0), Vector(378.0)))), Vector(s1(379.0, s0(Vector(Vector(380.0), Vector(381.0)), Vector(Vector(382.0), Vector(383.0), Vector(384.0)))), s1(385.0, s0(Vector(Vector(386.0), Vector(387.0)), Vector(Vector(388.0), Vector(389.0), Vector(390.0)))), s1(391.0, s0(Vector(Vector(392.0), Vector(393.0)), Vector(Vector(394.0), Vector(395.0), Vector(396.0)))))), Vector(s0(Vector(Vector(397.0), Vector(398.0)), Vector(Vector(399.0), Vector(400.0), Vector(401.0)))), Vector(s1(402.0, s0(Vector(Vector(403.0), Vector(404.0)), Vector(Vector(405.0), Vector(406.0), Vector(407.0)))), s1(408.0, s0(Vector(Vector(409.0), Vector(410.0)), Vector(Vector(411.0), Vector(412.0), Vector(413.0))))), s2(Vector(s0(Vector(Vector(414.0), Vector(415.0)), Vector(Vector(416.0), Vector(417.0), Vector(418.0))), s0(Vector(Vector(419.0), Vector(420.0)), Vector(Vector(421.0), Vector(422.0), Vector(423.0)))), Vector(s1(424.0, s0(Vector(Vector(425.0), Vector(426.0)), Vector(Vector(427.0), Vector(428.0), Vector(429.0)))), s1(430.0, s0(Vector(Vector(431.0), Vector(432.0)), Vector(Vector(433.0), Vector(434.0), Vector(435.0)))), s1(436.0, s0(Vector(Vector(437.0), Vector(438.0)), Vector(Vector(439.0), Vector(440.0), Vector(441.0)))))), s1(442.0, s0(Vector(Vector(443.0), Vector(444.0)), Vector(Vector(445.0), Vector(446.0), Vector(447.0)))))))))
    val v2: Double = 448.0
    val start = nanoTime()
    var result: Double = 448.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}