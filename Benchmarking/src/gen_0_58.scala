import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[Vector[s0]]
  )
  case class s3 (
    p0: Vector[Vector[s1]],
    p1: s0
  )
  case class s4 (
    p0: Vector[s3],
    p1: s0
  )
  case class s5 (
    p0: s4,
    p1: Vector[s3]
  )
  def f61(v0: Double): Double = {
    var v7: Double = v0
    var v3: Double = v7
    var v5: Double = v0
    val v4: Vector[Double] = Vector(v3, v3, v5, v7)
    var v1: Vector[Double] = v4
    val v11: Double = v5 / v5
    v1 = v1.updated(2, v11)
    val v15: Double = v1(2)
    v15
  }
  @noinline
  def f0(v0: Vector[s4], v1: Vector[s4], v2: s5, v3: Double): Double = {
    val v11: Double = f61(v3)
    var v24: Double = v11
    var v206: Double = v24
    var v107: Double = v206
    val v117: Double = v206 / v206
    val v303: Double = v117 * v107
    v303
  }
  def benchmark(): Unit = {
    val v0: Vector[s4] = Vector(s4(Vector(s3(Vector(Vector(s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))), Vector(Vector(s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0)))), Vector(s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))))))), Vector(s1(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0))), Vector(Vector(s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0)))), Vector(s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))))))), Vector(s1(s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0))), Vector(Vector(s0(Vector(Vector(28.0)), Vector(Vector(29.0), Vector(30.0), Vector(31.0)))), Vector(s0(Vector(Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0)))))))), s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0)))), s3(Vector(Vector(s1(s0(Vector(Vector(40.0)), Vector(Vector(41.0), Vector(42.0), Vector(43.0))), Vector(Vector(s0(Vector(Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0)))), Vector(s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0), Vector(51.0))))))), Vector(s1(s0(Vector(Vector(52.0)), Vector(Vector(53.0), Vector(54.0), Vector(55.0))), Vector(Vector(s0(Vector(Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0)))), Vector(s0(Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0), Vector(63.0))))))), Vector(s1(s0(Vector(Vector(64.0)), Vector(Vector(65.0), Vector(66.0), Vector(67.0))), Vector(Vector(s0(Vector(Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0)))), Vector(s0(Vector(Vector(72.0)), Vector(Vector(73.0), Vector(74.0), Vector(75.0)))))))), s0(Vector(Vector(76.0)), Vector(Vector(77.0), Vector(78.0), Vector(79.0))))), s0(Vector(Vector(80.0)), Vector(Vector(81.0), Vector(82.0), Vector(83.0)))), s4(Vector(s3(Vector(Vector(s1(s0(Vector(Vector(84.0)), Vector(Vector(85.0), Vector(86.0), Vector(87.0))), Vector(Vector(s0(Vector(Vector(88.0)), Vector(Vector(89.0), Vector(90.0), Vector(91.0)))), Vector(s0(Vector(Vector(92.0)), Vector(Vector(93.0), Vector(94.0), Vector(95.0))))))), Vector(s1(s0(Vector(Vector(96.0)), Vector(Vector(97.0), Vector(98.0), Vector(99.0))), Vector(Vector(s0(Vector(Vector(100.0)), Vector(Vector(101.0), Vector(102.0), Vector(103.0)))), Vector(s0(Vector(Vector(104.0)), Vector(Vector(105.0), Vector(106.0), Vector(107.0))))))), Vector(s1(s0(Vector(Vector(108.0)), Vector(Vector(109.0), Vector(110.0), Vector(111.0))), Vector(Vector(s0(Vector(Vector(112.0)), Vector(Vector(113.0), Vector(114.0), Vector(115.0)))), Vector(s0(Vector(Vector(116.0)), Vector(Vector(117.0), Vector(118.0), Vector(119.0)))))))), s0(Vector(Vector(120.0)), Vector(Vector(121.0), Vector(122.0), Vector(123.0)))), s3(Vector(Vector(s1(s0(Vector(Vector(124.0)), Vector(Vector(125.0), Vector(126.0), Vector(127.0))), Vector(Vector(s0(Vector(Vector(128.0)), Vector(Vector(129.0), Vector(130.0), Vector(131.0)))), Vector(s0(Vector(Vector(132.0)), Vector(Vector(133.0), Vector(134.0), Vector(135.0))))))), Vector(s1(s0(Vector(Vector(136.0)), Vector(Vector(137.0), Vector(138.0), Vector(139.0))), Vector(Vector(s0(Vector(Vector(140.0)), Vector(Vector(141.0), Vector(142.0), Vector(143.0)))), Vector(s0(Vector(Vector(144.0)), Vector(Vector(145.0), Vector(146.0), Vector(147.0))))))), Vector(s1(s0(Vector(Vector(148.0)), Vector(Vector(149.0), Vector(150.0), Vector(151.0))), Vector(Vector(s0(Vector(Vector(152.0)), Vector(Vector(153.0), Vector(154.0), Vector(155.0)))), Vector(s0(Vector(Vector(156.0)), Vector(Vector(157.0), Vector(158.0), Vector(159.0)))))))), s0(Vector(Vector(160.0)), Vector(Vector(161.0), Vector(162.0), Vector(163.0))))), s0(Vector(Vector(164.0)), Vector(Vector(165.0), Vector(166.0), Vector(167.0)))))
    val v1: Vector[s4] = Vector(s4(Vector(s3(Vector(Vector(s1(s0(Vector(Vector(168.0)), Vector(Vector(169.0), Vector(170.0), Vector(171.0))), Vector(Vector(s0(Vector(Vector(172.0)), Vector(Vector(173.0), Vector(174.0), Vector(175.0)))), Vector(s0(Vector(Vector(176.0)), Vector(Vector(177.0), Vector(178.0), Vector(179.0))))))), Vector(s1(s0(Vector(Vector(180.0)), Vector(Vector(181.0), Vector(182.0), Vector(183.0))), Vector(Vector(s0(Vector(Vector(184.0)), Vector(Vector(185.0), Vector(186.0), Vector(187.0)))), Vector(s0(Vector(Vector(188.0)), Vector(Vector(189.0), Vector(190.0), Vector(191.0))))))), Vector(s1(s0(Vector(Vector(192.0)), Vector(Vector(193.0), Vector(194.0), Vector(195.0))), Vector(Vector(s0(Vector(Vector(196.0)), Vector(Vector(197.0), Vector(198.0), Vector(199.0)))), Vector(s0(Vector(Vector(200.0)), Vector(Vector(201.0), Vector(202.0), Vector(203.0)))))))), s0(Vector(Vector(204.0)), Vector(Vector(205.0), Vector(206.0), Vector(207.0)))), s3(Vector(Vector(s1(s0(Vector(Vector(208.0)), Vector(Vector(209.0), Vector(210.0), Vector(211.0))), Vector(Vector(s0(Vector(Vector(212.0)), Vector(Vector(213.0), Vector(214.0), Vector(215.0)))), Vector(s0(Vector(Vector(216.0)), Vector(Vector(217.0), Vector(218.0), Vector(219.0))))))), Vector(s1(s0(Vector(Vector(220.0)), Vector(Vector(221.0), Vector(222.0), Vector(223.0))), Vector(Vector(s0(Vector(Vector(224.0)), Vector(Vector(225.0), Vector(226.0), Vector(227.0)))), Vector(s0(Vector(Vector(228.0)), Vector(Vector(229.0), Vector(230.0), Vector(231.0))))))), Vector(s1(s0(Vector(Vector(232.0)), Vector(Vector(233.0), Vector(234.0), Vector(235.0))), Vector(Vector(s0(Vector(Vector(236.0)), Vector(Vector(237.0), Vector(238.0), Vector(239.0)))), Vector(s0(Vector(Vector(240.0)), Vector(Vector(241.0), Vector(242.0), Vector(243.0)))))))), s0(Vector(Vector(244.0)), Vector(Vector(245.0), Vector(246.0), Vector(247.0))))), s0(Vector(Vector(248.0)), Vector(Vector(249.0), Vector(250.0), Vector(251.0)))))
    val v2: s5 = s5(s4(Vector(s3(Vector(Vector(s1(s0(Vector(Vector(252.0)), Vector(Vector(253.0), Vector(254.0), Vector(255.0))), Vector(Vector(s0(Vector(Vector(256.0)), Vector(Vector(257.0), Vector(258.0), Vector(259.0)))), Vector(s0(Vector(Vector(260.0)), Vector(Vector(261.0), Vector(262.0), Vector(263.0))))))), Vector(s1(s0(Vector(Vector(264.0)), Vector(Vector(265.0), Vector(266.0), Vector(267.0))), Vector(Vector(s0(Vector(Vector(268.0)), Vector(Vector(269.0), Vector(270.0), Vector(271.0)))), Vector(s0(Vector(Vector(272.0)), Vector(Vector(273.0), Vector(274.0), Vector(275.0))))))), Vector(s1(s0(Vector(Vector(276.0)), Vector(Vector(277.0), Vector(278.0), Vector(279.0))), Vector(Vector(s0(Vector(Vector(280.0)), Vector(Vector(281.0), Vector(282.0), Vector(283.0)))), Vector(s0(Vector(Vector(284.0)), Vector(Vector(285.0), Vector(286.0), Vector(287.0)))))))), s0(Vector(Vector(288.0)), Vector(Vector(289.0), Vector(290.0), Vector(291.0)))), s3(Vector(Vector(s1(s0(Vector(Vector(292.0)), Vector(Vector(293.0), Vector(294.0), Vector(295.0))), Vector(Vector(s0(Vector(Vector(296.0)), Vector(Vector(297.0), Vector(298.0), Vector(299.0)))), Vector(s0(Vector(Vector(300.0)), Vector(Vector(301.0), Vector(302.0), Vector(303.0))))))), Vector(s1(s0(Vector(Vector(304.0)), Vector(Vector(305.0), Vector(306.0), Vector(307.0))), Vector(Vector(s0(Vector(Vector(308.0)), Vector(Vector(309.0), Vector(310.0), Vector(311.0)))), Vector(s0(Vector(Vector(312.0)), Vector(Vector(313.0), Vector(314.0), Vector(315.0))))))), Vector(s1(s0(Vector(Vector(316.0)), Vector(Vector(317.0), Vector(318.0), Vector(319.0))), Vector(Vector(s0(Vector(Vector(320.0)), Vector(Vector(321.0), Vector(322.0), Vector(323.0)))), Vector(s0(Vector(Vector(324.0)), Vector(Vector(325.0), Vector(326.0), Vector(327.0)))))))), s0(Vector(Vector(328.0)), Vector(Vector(329.0), Vector(330.0), Vector(331.0))))), s0(Vector(Vector(332.0)), Vector(Vector(333.0), Vector(334.0), Vector(335.0)))), Vector(s3(Vector(Vector(s1(s0(Vector(Vector(336.0)), Vector(Vector(337.0), Vector(338.0), Vector(339.0))), Vector(Vector(s0(Vector(Vector(340.0)), Vector(Vector(341.0), Vector(342.0), Vector(343.0)))), Vector(s0(Vector(Vector(344.0)), Vector(Vector(345.0), Vector(346.0), Vector(347.0))))))), Vector(s1(s0(Vector(Vector(348.0)), Vector(Vector(349.0), Vector(350.0), Vector(351.0))), Vector(Vector(s0(Vector(Vector(352.0)), Vector(Vector(353.0), Vector(354.0), Vector(355.0)))), Vector(s0(Vector(Vector(356.0)), Vector(Vector(357.0), Vector(358.0), Vector(359.0))))))), Vector(s1(s0(Vector(Vector(360.0)), Vector(Vector(361.0), Vector(362.0), Vector(363.0))), Vector(Vector(s0(Vector(Vector(364.0)), Vector(Vector(365.0), Vector(366.0), Vector(367.0)))), Vector(s0(Vector(Vector(368.0)), Vector(Vector(369.0), Vector(370.0), Vector(371.0)))))))), s0(Vector(Vector(372.0)), Vector(Vector(373.0), Vector(374.0), Vector(375.0)))), s3(Vector(Vector(s1(s0(Vector(Vector(376.0)), Vector(Vector(377.0), Vector(378.0), Vector(379.0))), Vector(Vector(s0(Vector(Vector(380.0)), Vector(Vector(381.0), Vector(382.0), Vector(383.0)))), Vector(s0(Vector(Vector(384.0)), Vector(Vector(385.0), Vector(386.0), Vector(387.0))))))), Vector(s1(s0(Vector(Vector(388.0)), Vector(Vector(389.0), Vector(390.0), Vector(391.0))), Vector(Vector(s0(Vector(Vector(392.0)), Vector(Vector(393.0), Vector(394.0), Vector(395.0)))), Vector(s0(Vector(Vector(396.0)), Vector(Vector(397.0), Vector(398.0), Vector(399.0))))))), Vector(s1(s0(Vector(Vector(400.0)), Vector(Vector(401.0), Vector(402.0), Vector(403.0))), Vector(Vector(s0(Vector(Vector(404.0)), Vector(Vector(405.0), Vector(406.0), Vector(407.0)))), Vector(s0(Vector(Vector(408.0)), Vector(Vector(409.0), Vector(410.0), Vector(411.0)))))))), s0(Vector(Vector(412.0)), Vector(Vector(413.0), Vector(414.0), Vector(415.0)))), s3(Vector(Vector(s1(s0(Vector(Vector(416.0)), Vector(Vector(417.0), Vector(418.0), Vector(419.0))), Vector(Vector(s0(Vector(Vector(420.0)), Vector(Vector(421.0), Vector(422.0), Vector(423.0)))), Vector(s0(Vector(Vector(424.0)), Vector(Vector(425.0), Vector(426.0), Vector(427.0))))))), Vector(s1(s0(Vector(Vector(428.0)), Vector(Vector(429.0), Vector(430.0), Vector(431.0))), Vector(Vector(s0(Vector(Vector(432.0)), Vector(Vector(433.0), Vector(434.0), Vector(435.0)))), Vector(s0(Vector(Vector(436.0)), Vector(Vector(437.0), Vector(438.0), Vector(439.0))))))), Vector(s1(s0(Vector(Vector(440.0)), Vector(Vector(441.0), Vector(442.0), Vector(443.0))), Vector(Vector(s0(Vector(Vector(444.0)), Vector(Vector(445.0), Vector(446.0), Vector(447.0)))), Vector(s0(Vector(Vector(448.0)), Vector(Vector(449.0), Vector(450.0), Vector(451.0)))))))), s0(Vector(Vector(452.0)), Vector(Vector(453.0), Vector(454.0), Vector(455.0))))))
    val v3: Double = 456.0
    val start = nanoTime()
    var result: Double = 456.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}