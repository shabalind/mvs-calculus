import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]],
    p3: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: s1,
    p1: s1
  )
  case class s4 (
    p0: s2,
    p1: s0
  )
  case class s5 (
    p0: Vector[s1],
    p1: s1
  )
  case class s9 (
    p0: Double,
    p1: Vector[s4]
  )
  def f25(v0: Double): Double = {
    var v7: Double = v0
    var v5: Double = v0
    var v1: Double = v0
    var v8: Double = v1
    var v6: Double = v0
    var v4: Double = v5
    var v2: Double = v8
    var v9: Double = v7
    var v10: Double = v8
    var v3: Double = v4
    var v12: Double = v5
    val v23: Vector[Double] = Vector(v5, v4, v6)
    var v11: Vector[Double] = v23
    v9 = v8
    var v15: Vector[Double] = v23
    var v13: Double = v3
    v11 = v11.updated(1, v10)
    val v34: Double = v11(1)
    var v16: Vector[Double] = v23
    val v14: Double = v5 - v6
    var v29: Vector[Double] = v23
    var v22: Vector[Double] = v15
    var v45: Double = v10
    v29 = v29.updated(0, v12)
    v16 = v16.updated(1, v34)
    var v21: Vector[Double] = v23
    val v17: Double = v29(0)
    var v24: Double = v5
    v15 = v15.updated(1, v24)
    v21 = v21.updated(1, v34)
    var v33: Double = v2
    val v39: Double = v22(0)
    var v62: Double = v9
    var v55: Vector[Double] = v11
    v21 = v21.updated(0, v10)
    v21 = v21.updated(0, v6)
    v15 = v15.updated(1, v9)
    v15 = v15.updated(1, v7)
    v15 = v15.updated(2, v0)
    var v42: Double = v39
    v21 = v21.updated(1, v1)
    var v60: Double = v62
    var v40: Double = v13
    val v30: Double = v11(2)
    v29 = v29.updated(0, v30)
    var v76: Vector[Double] = v16
    var v37: Vector[Double] = v21
    val v86: Vector[Double] = Vector(v45, v33, v14, v0)
    v3 = v40
    v76 = v37
    var v57: Vector[Double] = v86
    val v41: Double = v11(1)
    val v81: Double = v57(3)
    var v44: Vector[Double] = v29
    v21 = v21.updated(1, v40)
    var v52: Vector[Double] = v86
    val v90: Double = v52(0)
    var v51: Double = v42
    v55 = v55.updated(1, v41)
    val v146: Double = v86(3)
    var v121: Vector[Double] = v52
    var v73: Vector[Double] = v23
    var v67: Vector[Double] = v57
    val v69: Double = v55(0)
    var v83: Vector[Double] = v29
    val v84: Double = v86(1)
    var v108: Double = v69
    v44 = v44.updated(1, v146)
    v3 = v146
    val v213: Double = v67(1)
    val v126: Double = v73(1)
    v21 = v21.updated(0, v13)
    v55 = v55.updated(0, v90)
    v83 = v83.updated(0, v34)
    val v113: Double = v44(1)
    v37 = v37.updated(1, v8)
    v83 = v83.updated(2, v51)
    var v153: Vector[Double] = v55
    val v104: Double = v29(1)
    val v101: Double = v21(0)
    v83 = v83.updated(0, v104)
    v22 = v22.updated(0, v101)
    v52 = v52.updated(3, v108)
    v40 = v81
    val v171: Vector[Vector[Double]] = Vector(v16, v11, v23, v83, v76, v55)
    val v158: Double = v67(1)
    var v182: Vector[Vector[Double]] = v171
    v44 = v44.updated(0, v90)
    v16 = v16.updated(0, v113)
    v44 = v153
    var v137: Vector[Vector[Double]] = v182
    val v119: Vector[Double] = v171(2)
    v16 = v119
    v13 = v126
    v11 = v11.updated(1, v213)
    v44 = v44.updated(2, v9)
    var v165: Vector[Vector[Double]] = v137
    val v132: Double = v121(0)
    v55 = v55.updated(1, v17)
    val v230: Double = v60 / v158
    val v186: Vector[Double] = v171(1)
    v15 = v15.updated(0, v84)
    v29 = v15
    var v152: Vector[Vector[Double]] = v165
    v83 = v83.updated(2, v230)
    val v209: Vector[Double] = v152(0)
    v15 = v209
    v1 = v132
    val v127: Double = v186(0)
    v83 = v83.updated(1, v41)
    v127
  }
  @noinline
  def f0(v0: Vector[s5], v1: Vector[s9], v2: Double): Double = {
    val v8: Double = f25(v2)
    var v17: Double = v8
    v17 = v8
    val v20: Double = v17 * v8
    val v16: Double = v17 / v20
    val v30: Double = v16 / v20
    v30
  }
  def benchmark(): Unit = {
    val v0: Vector[s5] = Vector(s5(Vector(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0)), Vector(Vector(5.0)), Vector(Vector(6.0))), s0(Vector(Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0)), Vector(Vector(12.0)), Vector(Vector(13.0)))), s1(s0(Vector(Vector(14.0), Vector(15.0)), Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0)), Vector(Vector(20.0))), s0(Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0), Vector(24.0), Vector(25.0)), Vector(Vector(26.0)), Vector(Vector(27.0))))), s1(s0(Vector(Vector(28.0), Vector(29.0)), Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0)), Vector(Vector(34.0))), s0(Vector(Vector(35.0), Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0)), Vector(Vector(40.0)), Vector(Vector(41.0))))), s5(Vector(s1(s0(Vector(Vector(42.0), Vector(43.0)), Vector(Vector(44.0), Vector(45.0), Vector(46.0)), Vector(Vector(47.0)), Vector(Vector(48.0))), s0(Vector(Vector(49.0), Vector(50.0)), Vector(Vector(51.0), Vector(52.0), Vector(53.0)), Vector(Vector(54.0)), Vector(Vector(55.0)))), s1(s0(Vector(Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0), Vector(60.0)), Vector(Vector(61.0)), Vector(Vector(62.0))), s0(Vector(Vector(63.0), Vector(64.0)), Vector(Vector(65.0), Vector(66.0), Vector(67.0)), Vector(Vector(68.0)), Vector(Vector(69.0))))), s1(s0(Vector(Vector(70.0), Vector(71.0)), Vector(Vector(72.0), Vector(73.0), Vector(74.0)), Vector(Vector(75.0)), Vector(Vector(76.0))), s0(Vector(Vector(77.0), Vector(78.0)), Vector(Vector(79.0), Vector(80.0), Vector(81.0)), Vector(Vector(82.0)), Vector(Vector(83.0))))), s5(Vector(s1(s0(Vector(Vector(84.0), Vector(85.0)), Vector(Vector(86.0), Vector(87.0), Vector(88.0)), Vector(Vector(89.0)), Vector(Vector(90.0))), s0(Vector(Vector(91.0), Vector(92.0)), Vector(Vector(93.0), Vector(94.0), Vector(95.0)), Vector(Vector(96.0)), Vector(Vector(97.0)))), s1(s0(Vector(Vector(98.0), Vector(99.0)), Vector(Vector(100.0), Vector(101.0), Vector(102.0)), Vector(Vector(103.0)), Vector(Vector(104.0))), s0(Vector(Vector(105.0), Vector(106.0)), Vector(Vector(107.0), Vector(108.0), Vector(109.0)), Vector(Vector(110.0)), Vector(Vector(111.0))))), s1(s0(Vector(Vector(112.0), Vector(113.0)), Vector(Vector(114.0), Vector(115.0), Vector(116.0)), Vector(Vector(117.0)), Vector(Vector(118.0))), s0(Vector(Vector(119.0), Vector(120.0)), Vector(Vector(121.0), Vector(122.0), Vector(123.0)), Vector(Vector(124.0)), Vector(Vector(125.0))))))
    val v1: Vector[s9] = Vector(s9(126.0, Vector(s4(s2(s1(s0(Vector(Vector(127.0), Vector(128.0)), Vector(Vector(129.0), Vector(130.0), Vector(131.0)), Vector(Vector(132.0)), Vector(Vector(133.0))), s0(Vector(Vector(134.0), Vector(135.0)), Vector(Vector(136.0), Vector(137.0), Vector(138.0)), Vector(Vector(139.0)), Vector(Vector(140.0)))), s1(s0(Vector(Vector(141.0), Vector(142.0)), Vector(Vector(143.0), Vector(144.0), Vector(145.0)), Vector(Vector(146.0)), Vector(Vector(147.0))), s0(Vector(Vector(148.0), Vector(149.0)), Vector(Vector(150.0), Vector(151.0), Vector(152.0)), Vector(Vector(153.0)), Vector(Vector(154.0))))), s0(Vector(Vector(155.0), Vector(156.0)), Vector(Vector(157.0), Vector(158.0), Vector(159.0)), Vector(Vector(160.0)), Vector(Vector(161.0)))), s4(s2(s1(s0(Vector(Vector(162.0), Vector(163.0)), Vector(Vector(164.0), Vector(165.0), Vector(166.0)), Vector(Vector(167.0)), Vector(Vector(168.0))), s0(Vector(Vector(169.0), Vector(170.0)), Vector(Vector(171.0), Vector(172.0), Vector(173.0)), Vector(Vector(174.0)), Vector(Vector(175.0)))), s1(s0(Vector(Vector(176.0), Vector(177.0)), Vector(Vector(178.0), Vector(179.0), Vector(180.0)), Vector(Vector(181.0)), Vector(Vector(182.0))), s0(Vector(Vector(183.0), Vector(184.0)), Vector(Vector(185.0), Vector(186.0), Vector(187.0)), Vector(Vector(188.0)), Vector(Vector(189.0))))), s0(Vector(Vector(190.0), Vector(191.0)), Vector(Vector(192.0), Vector(193.0), Vector(194.0)), Vector(Vector(195.0)), Vector(Vector(196.0)))), s4(s2(s1(s0(Vector(Vector(197.0), Vector(198.0)), Vector(Vector(199.0), Vector(200.0), Vector(201.0)), Vector(Vector(202.0)), Vector(Vector(203.0))), s0(Vector(Vector(204.0), Vector(205.0)), Vector(Vector(206.0), Vector(207.0), Vector(208.0)), Vector(Vector(209.0)), Vector(Vector(210.0)))), s1(s0(Vector(Vector(211.0), Vector(212.0)), Vector(Vector(213.0), Vector(214.0), Vector(215.0)), Vector(Vector(216.0)), Vector(Vector(217.0))), s0(Vector(Vector(218.0), Vector(219.0)), Vector(Vector(220.0), Vector(221.0), Vector(222.0)), Vector(Vector(223.0)), Vector(Vector(224.0))))), s0(Vector(Vector(225.0), Vector(226.0)), Vector(Vector(227.0), Vector(228.0), Vector(229.0)), Vector(Vector(230.0)), Vector(Vector(231.0)))))), s9(232.0, Vector(s4(s2(s1(s0(Vector(Vector(233.0), Vector(234.0)), Vector(Vector(235.0), Vector(236.0), Vector(237.0)), Vector(Vector(238.0)), Vector(Vector(239.0))), s0(Vector(Vector(240.0), Vector(241.0)), Vector(Vector(242.0), Vector(243.0), Vector(244.0)), Vector(Vector(245.0)), Vector(Vector(246.0)))), s1(s0(Vector(Vector(247.0), Vector(248.0)), Vector(Vector(249.0), Vector(250.0), Vector(251.0)), Vector(Vector(252.0)), Vector(Vector(253.0))), s0(Vector(Vector(254.0), Vector(255.0)), Vector(Vector(256.0), Vector(257.0), Vector(258.0)), Vector(Vector(259.0)), Vector(Vector(260.0))))), s0(Vector(Vector(261.0), Vector(262.0)), Vector(Vector(263.0), Vector(264.0), Vector(265.0)), Vector(Vector(266.0)), Vector(Vector(267.0)))), s4(s2(s1(s0(Vector(Vector(268.0), Vector(269.0)), Vector(Vector(270.0), Vector(271.0), Vector(272.0)), Vector(Vector(273.0)), Vector(Vector(274.0))), s0(Vector(Vector(275.0), Vector(276.0)), Vector(Vector(277.0), Vector(278.0), Vector(279.0)), Vector(Vector(280.0)), Vector(Vector(281.0)))), s1(s0(Vector(Vector(282.0), Vector(283.0)), Vector(Vector(284.0), Vector(285.0), Vector(286.0)), Vector(Vector(287.0)), Vector(Vector(288.0))), s0(Vector(Vector(289.0), Vector(290.0)), Vector(Vector(291.0), Vector(292.0), Vector(293.0)), Vector(Vector(294.0)), Vector(Vector(295.0))))), s0(Vector(Vector(296.0), Vector(297.0)), Vector(Vector(298.0), Vector(299.0), Vector(300.0)), Vector(Vector(301.0)), Vector(Vector(302.0)))), s4(s2(s1(s0(Vector(Vector(303.0), Vector(304.0)), Vector(Vector(305.0), Vector(306.0), Vector(307.0)), Vector(Vector(308.0)), Vector(Vector(309.0))), s0(Vector(Vector(310.0), Vector(311.0)), Vector(Vector(312.0), Vector(313.0), Vector(314.0)), Vector(Vector(315.0)), Vector(Vector(316.0)))), s1(s0(Vector(Vector(317.0), Vector(318.0)), Vector(Vector(319.0), Vector(320.0), Vector(321.0)), Vector(Vector(322.0)), Vector(Vector(323.0))), s0(Vector(Vector(324.0), Vector(325.0)), Vector(Vector(326.0), Vector(327.0), Vector(328.0)), Vector(Vector(329.0)), Vector(Vector(330.0))))), s0(Vector(Vector(331.0), Vector(332.0)), Vector(Vector(333.0), Vector(334.0), Vector(335.0)), Vector(Vector(336.0)), Vector(Vector(337.0)))))), s9(338.0, Vector(s4(s2(s1(s0(Vector(Vector(339.0), Vector(340.0)), Vector(Vector(341.0), Vector(342.0), Vector(343.0)), Vector(Vector(344.0)), Vector(Vector(345.0))), s0(Vector(Vector(346.0), Vector(347.0)), Vector(Vector(348.0), Vector(349.0), Vector(350.0)), Vector(Vector(351.0)), Vector(Vector(352.0)))), s1(s0(Vector(Vector(353.0), Vector(354.0)), Vector(Vector(355.0), Vector(356.0), Vector(357.0)), Vector(Vector(358.0)), Vector(Vector(359.0))), s0(Vector(Vector(360.0), Vector(361.0)), Vector(Vector(362.0), Vector(363.0), Vector(364.0)), Vector(Vector(365.0)), Vector(Vector(366.0))))), s0(Vector(Vector(367.0), Vector(368.0)), Vector(Vector(369.0), Vector(370.0), Vector(371.0)), Vector(Vector(372.0)), Vector(Vector(373.0)))), s4(s2(s1(s0(Vector(Vector(374.0), Vector(375.0)), Vector(Vector(376.0), Vector(377.0), Vector(378.0)), Vector(Vector(379.0)), Vector(Vector(380.0))), s0(Vector(Vector(381.0), Vector(382.0)), Vector(Vector(383.0), Vector(384.0), Vector(385.0)), Vector(Vector(386.0)), Vector(Vector(387.0)))), s1(s0(Vector(Vector(388.0), Vector(389.0)), Vector(Vector(390.0), Vector(391.0), Vector(392.0)), Vector(Vector(393.0)), Vector(Vector(394.0))), s0(Vector(Vector(395.0), Vector(396.0)), Vector(Vector(397.0), Vector(398.0), Vector(399.0)), Vector(Vector(400.0)), Vector(Vector(401.0))))), s0(Vector(Vector(402.0), Vector(403.0)), Vector(Vector(404.0), Vector(405.0), Vector(406.0)), Vector(Vector(407.0)), Vector(Vector(408.0)))), s4(s2(s1(s0(Vector(Vector(409.0), Vector(410.0)), Vector(Vector(411.0), Vector(412.0), Vector(413.0)), Vector(Vector(414.0)), Vector(Vector(415.0))), s0(Vector(Vector(416.0), Vector(417.0)), Vector(Vector(418.0), Vector(419.0), Vector(420.0)), Vector(Vector(421.0)), Vector(Vector(422.0)))), s1(s0(Vector(Vector(423.0), Vector(424.0)), Vector(Vector(425.0), Vector(426.0), Vector(427.0)), Vector(Vector(428.0)), Vector(Vector(429.0))), s0(Vector(Vector(430.0), Vector(431.0)), Vector(Vector(432.0), Vector(433.0), Vector(434.0)), Vector(Vector(435.0)), Vector(Vector(436.0))))), s0(Vector(Vector(437.0), Vector(438.0)), Vector(Vector(439.0), Vector(440.0), Vector(441.0)), Vector(Vector(442.0)), Vector(Vector(443.0)))))))
    val v2: Double = 444.0
    val start = nanoTime()
    var result: Double = 444.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}