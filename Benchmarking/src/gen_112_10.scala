import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  case class s2 (
    p0: s1,
    p1: s0
  )
  case class s4 (
    p0: s0,
    p1: Vector[s2]
  )
  case class s5 (
    p0: Vector[s4],
    p1: s2,
    p2: s1
  )
  case class s6 (
    p0: Vector[Vector[s0]],
    p1: s5
  )
  def f114(v0: s0): s0 = {
    var v7: s0 = v0
    val v3: Vector[s0] = Vector(v7)
    val v10: s0 = v3(0)
    v10
  }
  def f101(v0: s0, v1: s1): s0 = {
    val v5: s0 = f114(v0)
    val v2: s0 = f114(v5)
    val v30: s0 = f114(v2)
    val v22: s0 = f114(v30)
    v22
  }
  def f81(v0: s0): s0 = {
    var v7: s0 = v0
    val v3: Vector[Vector[Double]] = v7.p0
    val v1: s0 = f114(v0)
    var v4: Vector[Vector[Double]] = v3
    val v8: s0 = f114(v1)
    val v6: s0 = f114(v7)
    var v2: Vector[Vector[Double]] = v4
    v7 = v7.copy(p0 = v3)
    val v9: s0 = f114(v1)
    v2 = v3
    val v12: Vector[s0] = Vector(v6, v9, v0, v6, v7, v8)
    v7 = v7.copy(p0 = v3)
    val v13: s0 = f114(v1)
    val v11: Vector[Vector[Double]] = v7.p0
    var v16: s0 = v13
    val v25: s0 = f114(v16)
    val v42: Vector[Vector[Double]] = v25.p0
    v7 = v7.copy(p0 = v42)
    v7 = v7.copy(p0 = v2)
    val v51: s0 = v12(5)
    v7 = v7.copy(p0 = v11)
    v51
  }
  def f80(v0: s1): s1 = {
    var v2: s1 = v0
    v2
  }
  def f66(v0: s1): s1 = {
    var v6: s1 = v0
    val v1: Vector[s0] = v6.p0
    val v4: s0 = v1(1)
    val v14: s0 = f101(v4, v0)
    v6 = v6.copy(p1 = v14)
    v6
  }
  def f35(v0: s0): s0 = {
    val v1: Vector[Vector[Double]] = v0.p0
    val v2: s0 = f81(v0)
    val v15: s0 = f81(v2)
    val v8: s0 = f81(v0)
    val v4: s0 = f114(v0)
    val v11: Vector[Vector[Double]] = v4.p1
    var v21: s0 = v0
    v21 = v21.copy(p1 = v11)
    val v16: s0 = f114(v21)
    v21 = v21.copy(p0 = v1)
    val v44: s0 = f114(v15)
    v21 = v21.copy(p1 = v11)
    val v61: Vector[Vector[Double]] = v44.p0
    v21 = v21.copy(p0 = v61)
    val v96: Vector[Vector[Double]] = v8.p0
    v21 = v21.copy(p0 = v96)
    v16
  }
  def f25(v0: Double): Double = {
    var v2: Double = v0
    var v3: Double = v0
    var v1: Double = v2
    val v6: Double = v1 / v1
    var v5: Double = v2
    var v10: Double = v3
    var v7: Double = v5
    v3 = v6
    var v4: Double = v1
    var v8: Double = v0
    val v9: Double = v2 * v10
    var v13: Double = v7
    v5 = v6
    var v21: Double = v5
    val v17: Double = v0 / v21
    v4 = v17
    var v29: Double = v8
    var v43: Double = v4
    var v14: Double = v9
    var v19: Double = v14
    val v25: Vector[Double] = Vector(v6, v43, v10, v29)
    var v71: Vector[Double] = v25
    val v32: Double = v25(1)
    var v37: Vector[Double] = v71
    var v39: Vector[Double] = v71
    v4 = v13
    var v46: Double = v32
    v29 = v3
    v5 = v10
    val v53: Double = v37(0)
    val v55: Double = v39(0)
    v39 = v39.updated(0, v53)
    v71 = v71.updated(0, v19)
    v39 = v39.updated(2, v46)
    v39 = v39.updated(1, v13)
    v55
  }
  def f16(v0: Double): Double = {
    val v1: Double = f25(v0)
    var v4: Double = v0
    val v7: Double = f25(v0)
    val v2: Double = f25(v0)
    var v5: Double = v4
    var v6: Double = v1
    var v12: Double = v1
    val v3: Double = f25(v12)
    var v8: Double = v6
    var v9: Double = v0
    var v15: Double = v0
    val v11: Double = f25(v9)
    var v28: Double = v5
    var v10: Double = v0
    var v13: Double = v10
    val v18: Double = f25(v10)
    val v27: Double = f25(v7)
    var v40: Double = v15
    val v24: Double = f25(v28)
    val v21: Vector[Double] = Vector(v2, v18, v18, v4, v3, v4, v3)
    var v34: Vector[Double] = v21
    var v16: Vector[Double] = v21
    var v19: Double = v24
    var v41: Double = v8
    val v26: Double = v16(1)
    v5 = v40
    var v61: Vector[Double] = v21
    v61 = v61.updated(5, v40)
    var v22: Vector[Double] = v61
    v16 = v16.updated(2, v41)
    var v64: Vector[Double] = v34
    v16 = v16.updated(5, v26)
    v10 = v11
    val v73: Vector[Vector[Double]] = Vector(v34, v61, v64, v34)
    var v51: Vector[Double] = v22
    var v71: Vector[Vector[Double]] = v73
    val v66: Double = v51(1)
    var v57: Double = v18
    v16 = v16.updated(0, v15)
    v71 = v71.updated(2, v16)
    val v115: Vector[Double] = v71(1)
    v61 = v61.updated(0, v27)
    v16 = v16.updated(1, v66)
    val v94: Double = v13 - v24
    v16 = v16.updated(3, v57)
    val v106: Double = v115(5)
    v71 = v71.updated(0, v22)
    v22 = v22.updated(5, v18)
    v61 = v61.updated(0, v11)
    v16 = v16.updated(1, v94)
    v51 = v51.updated(4, v9)
    v71 = v71.updated(2, v21)
    v64 = v64.updated(5, v19)
    val v176: Double = f25(v106)
    v176
  }
  def f11(v0: s0): s0 = {
    var v5: s0 = v0
    var v4: s0 = v0
    val v3: s0 = f114(v0)
    val v6: s0 = f114(v3)
    val v2: Vector[Vector[Double]] = v5.p0
    val v7: s0 = f81(v3)
    val v8: s0 = f81(v4)
    val v12: Vector[Vector[Double]] = v0.p1
    var v10: Vector[Vector[Double]] = v2
    v5 = v5.copy(p1 = v12)
    val v1: s0 = f114(v0)
    val v13: Vector[s0] = Vector(v7, v8, v5, v0)
    val v33: s0 = f35(v0)
    v4 = v4.copy(p0 = v2)
    val v15: s0 = v13(2)
    val v32: s0 = f114(v5)
    var v11: Vector[s0] = v13
    val v18: Vector[Double] = v10(0)
    v11 = v11.updated(3, v3)
    val v16: Double = v18(0)
    var v22: Vector[Vector[Double]] = v10
    var v20: Vector[s0] = v13
    var v26: Vector[Vector[Double]] = v2
    val v29: Vector[Vector[Double]] = v4.p0
    val v17: s0 = f81(v6)
    val v43: Vector[Vector[Double]] = v7.p1
    val v25: Vector[Double] = v29(0)
    val v27: Vector[Vector[Double]] = v7.p1
    v5 = v5.copy(p0 = v26)
    v4 = v15
    val v30: Vector[Vector[Double]] = v33.p0
    val v28: Vector[Double] = v43(1)
    var v34: Vector[Vector[Double]] = v29
    var v23: Vector[s0] = v11
    val v59: s0 = v20(1)
    v4 = v17
    val v85: Vector[Vector[Double]] = v32.p0
    val v49: Vector[Double] = v22(1)
    val v57: Double = v28(0)
    val v61: Double = v25(0)
    val v44: Vector[Vector[Double]] = v6.p0
    val v66: s0 = f35(v1)
    v5 = v5.copy(p0 = v85)
    v5 = v5.copy(p0 = v34)
    v4 = v4.copy(p0 = v30)
    val v51: Vector[Vector[Double]] = v17.p0
    val v81: Double = f16(v61)
    var v53: Vector[Vector[Double]] = v27
    var v58: Vector[Double] = v49
    v4 = v4.copy(p0 = v22)
    val v102: Vector[Double] = v34(0)
    v53 = v53.updated(1, v58)
    var v67: Vector[Double] = v102
    var v100: Vector[Vector[Double]] = v53
    var v138: Vector[Vector[Double]] = v43
    var v63: Vector[s0] = v23
    v67 = v67.updated(0, v81)
    val v113: s0 = f114(v66)
    v11 = v11.updated(0, v8)
    v34 = v34.updated(1, v67)
    v23 = v23.updated(3, v33)
    val v95: Vector[Double] = v100(1)
    v4 = v4.copy(p0 = v51)
    val v106: s0 = v63(2)
    v67 = v67.updated(0, v57)
    v5 = v5.copy(p0 = v44)
    v23 = v23.updated(1, v113)
    val v114: Vector[Vector[Double]] = v59.p0
    v5 = v5.copy(p0 = v2)
    v34 = v34.updated(2, v95)
    v67 = v67.updated(0, v16)
    v5 = v5.copy(p1 = v138)
    v5 = v5.copy(p0 = v114)
    v5 = v5.copy(p1 = v12)
    v5 = v5.copy(p1 = v53)
    v4 = v4.copy(p1 = v53)
    v106
  }
  @noinline
  def f0(v0: Vector[Vector[s6]], v1: Double): Double = {
    var v5: Double = v1
    v5 = v1
    val v2: Double = f16(v1)
    var v4: Double = v5
    val v6: Vector[s6] = v0(2)
    val v7: Double = f16(v2)
    var v3: Vector[Vector[s6]] = v0
    v3 = v3.updated(0, v6)
    val v11: Vector[s6] = v3(2)
    val v13: s6 = v6(0)
    v3 = v3.updated(1, v6)
    val v12: s6 = v11(0)
    val v22: Vector[s6] = v0(2)
    v3 = v3.updated(2, v22)
    val v46: s5 = v13.p1
    v3 = v3.updated(0, v11)
    val v23: Vector[Vector[s0]] = v12.p0
    val v24: Vector[s6] = v3(2)
    v3 = v3.updated(1, v24)
    val v35: s1 = v46.p2
    val v44: Double = f16(v4)
    v3 = v3.updated(0, v11)
    val v38: Vector[s0] = v35.p0
    val v36: s1 = f66(v35)
    var v55: Vector[s0] = v38
    val v87: s1 = f80(v36)
    val v54: Vector[s0] = v23(0)
    val v62: s0 = v87.p1
    val v49: s0 = f11(v62)
    v3 = v3.updated(1, v24)
    var v34: s0 = v49
    val v28: s0 = v55(2)
    val v50: s0 = v54(0)
    val v42: Vector[Vector[Double]] = v34.p0
    v34 = v34.copy(p0 = v42)
    val v56: Vector[Vector[Double]] = v28.p0
    val v33: s0 = f81(v50)
    v55 = v55.updated(0, v33)
    v34 = v34.copy(p0 = v56)
    v55 = v55.updated(2, v33)
    val v133: Vector[Double] = v56(2)
    val v98: Vector[Double] = v42(1)
    var v76: Vector[Double] = v133
    v76 = v76.updated(0, v7)
    val v176: Double = v76(0)
    val v255: Double = v44 - v176
    val v131: Double = v98(0)
    v76 = v76.updated(0, v131)
    v3 = v3.updated(2, v24)
    v255
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s6]] = Vector(Vector(s6(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0))))), s5(Vector(s4(s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0))), Vector(s2(s1(Vector(s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0))), s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0))), s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0), Vector(24.0)))), s0(Vector(Vector(25.0), Vector(26.0), Vector(27.0)), Vector(Vector(28.0), Vector(29.0)))), s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0)))))), s4(s0(Vector(Vector(35.0), Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0))), Vector(s2(s1(Vector(s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0), Vector(44.0))), s0(Vector(Vector(45.0), Vector(46.0), Vector(47.0)), Vector(Vector(48.0), Vector(49.0))), s0(Vector(Vector(50.0), Vector(51.0), Vector(52.0)), Vector(Vector(53.0), Vector(54.0)))), s0(Vector(Vector(55.0), Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0)))), s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0), Vector(64.0)))))), s4(s0(Vector(Vector(65.0), Vector(66.0), Vector(67.0)), Vector(Vector(68.0), Vector(69.0))), Vector(s2(s1(Vector(s0(Vector(Vector(70.0), Vector(71.0), Vector(72.0)), Vector(Vector(73.0), Vector(74.0))), s0(Vector(Vector(75.0), Vector(76.0), Vector(77.0)), Vector(Vector(78.0), Vector(79.0))), s0(Vector(Vector(80.0), Vector(81.0), Vector(82.0)), Vector(Vector(83.0), Vector(84.0)))), s0(Vector(Vector(85.0), Vector(86.0), Vector(87.0)), Vector(Vector(88.0), Vector(89.0)))), s0(Vector(Vector(90.0), Vector(91.0), Vector(92.0)), Vector(Vector(93.0), Vector(94.0))))))), s2(s1(Vector(s0(Vector(Vector(95.0), Vector(96.0), Vector(97.0)), Vector(Vector(98.0), Vector(99.0))), s0(Vector(Vector(100.0), Vector(101.0), Vector(102.0)), Vector(Vector(103.0), Vector(104.0))), s0(Vector(Vector(105.0), Vector(106.0), Vector(107.0)), Vector(Vector(108.0), Vector(109.0)))), s0(Vector(Vector(110.0), Vector(111.0), Vector(112.0)), Vector(Vector(113.0), Vector(114.0)))), s0(Vector(Vector(115.0), Vector(116.0), Vector(117.0)), Vector(Vector(118.0), Vector(119.0)))), s1(Vector(s0(Vector(Vector(120.0), Vector(121.0), Vector(122.0)), Vector(Vector(123.0), Vector(124.0))), s0(Vector(Vector(125.0), Vector(126.0), Vector(127.0)), Vector(Vector(128.0), Vector(129.0))), s0(Vector(Vector(130.0), Vector(131.0), Vector(132.0)), Vector(Vector(133.0), Vector(134.0)))), s0(Vector(Vector(135.0), Vector(136.0), Vector(137.0)), Vector(Vector(138.0), Vector(139.0))))))), Vector(s6(Vector(Vector(s0(Vector(Vector(140.0), Vector(141.0), Vector(142.0)), Vector(Vector(143.0), Vector(144.0))))), s5(Vector(s4(s0(Vector(Vector(145.0), Vector(146.0), Vector(147.0)), Vector(Vector(148.0), Vector(149.0))), Vector(s2(s1(Vector(s0(Vector(Vector(150.0), Vector(151.0), Vector(152.0)), Vector(Vector(153.0), Vector(154.0))), s0(Vector(Vector(155.0), Vector(156.0), Vector(157.0)), Vector(Vector(158.0), Vector(159.0))), s0(Vector(Vector(160.0), Vector(161.0), Vector(162.0)), Vector(Vector(163.0), Vector(164.0)))), s0(Vector(Vector(165.0), Vector(166.0), Vector(167.0)), Vector(Vector(168.0), Vector(169.0)))), s0(Vector(Vector(170.0), Vector(171.0), Vector(172.0)), Vector(Vector(173.0), Vector(174.0)))))), s4(s0(Vector(Vector(175.0), Vector(176.0), Vector(177.0)), Vector(Vector(178.0), Vector(179.0))), Vector(s2(s1(Vector(s0(Vector(Vector(180.0), Vector(181.0), Vector(182.0)), Vector(Vector(183.0), Vector(184.0))), s0(Vector(Vector(185.0), Vector(186.0), Vector(187.0)), Vector(Vector(188.0), Vector(189.0))), s0(Vector(Vector(190.0), Vector(191.0), Vector(192.0)), Vector(Vector(193.0), Vector(194.0)))), s0(Vector(Vector(195.0), Vector(196.0), Vector(197.0)), Vector(Vector(198.0), Vector(199.0)))), s0(Vector(Vector(200.0), Vector(201.0), Vector(202.0)), Vector(Vector(203.0), Vector(204.0)))))), s4(s0(Vector(Vector(205.0), Vector(206.0), Vector(207.0)), Vector(Vector(208.0), Vector(209.0))), Vector(s2(s1(Vector(s0(Vector(Vector(210.0), Vector(211.0), Vector(212.0)), Vector(Vector(213.0), Vector(214.0))), s0(Vector(Vector(215.0), Vector(216.0), Vector(217.0)), Vector(Vector(218.0), Vector(219.0))), s0(Vector(Vector(220.0), Vector(221.0), Vector(222.0)), Vector(Vector(223.0), Vector(224.0)))), s0(Vector(Vector(225.0), Vector(226.0), Vector(227.0)), Vector(Vector(228.0), Vector(229.0)))), s0(Vector(Vector(230.0), Vector(231.0), Vector(232.0)), Vector(Vector(233.0), Vector(234.0))))))), s2(s1(Vector(s0(Vector(Vector(235.0), Vector(236.0), Vector(237.0)), Vector(Vector(238.0), Vector(239.0))), s0(Vector(Vector(240.0), Vector(241.0), Vector(242.0)), Vector(Vector(243.0), Vector(244.0))), s0(Vector(Vector(245.0), Vector(246.0), Vector(247.0)), Vector(Vector(248.0), Vector(249.0)))), s0(Vector(Vector(250.0), Vector(251.0), Vector(252.0)), Vector(Vector(253.0), Vector(254.0)))), s0(Vector(Vector(255.0), Vector(256.0), Vector(257.0)), Vector(Vector(258.0), Vector(259.0)))), s1(Vector(s0(Vector(Vector(260.0), Vector(261.0), Vector(262.0)), Vector(Vector(263.0), Vector(264.0))), s0(Vector(Vector(265.0), Vector(266.0), Vector(267.0)), Vector(Vector(268.0), Vector(269.0))), s0(Vector(Vector(270.0), Vector(271.0), Vector(272.0)), Vector(Vector(273.0), Vector(274.0)))), s0(Vector(Vector(275.0), Vector(276.0), Vector(277.0)), Vector(Vector(278.0), Vector(279.0))))))), Vector(s6(Vector(Vector(s0(Vector(Vector(280.0), Vector(281.0), Vector(282.0)), Vector(Vector(283.0), Vector(284.0))))), s5(Vector(s4(s0(Vector(Vector(285.0), Vector(286.0), Vector(287.0)), Vector(Vector(288.0), Vector(289.0))), Vector(s2(s1(Vector(s0(Vector(Vector(290.0), Vector(291.0), Vector(292.0)), Vector(Vector(293.0), Vector(294.0))), s0(Vector(Vector(295.0), Vector(296.0), Vector(297.0)), Vector(Vector(298.0), Vector(299.0))), s0(Vector(Vector(300.0), Vector(301.0), Vector(302.0)), Vector(Vector(303.0), Vector(304.0)))), s0(Vector(Vector(305.0), Vector(306.0), Vector(307.0)), Vector(Vector(308.0), Vector(309.0)))), s0(Vector(Vector(310.0), Vector(311.0), Vector(312.0)), Vector(Vector(313.0), Vector(314.0)))))), s4(s0(Vector(Vector(315.0), Vector(316.0), Vector(317.0)), Vector(Vector(318.0), Vector(319.0))), Vector(s2(s1(Vector(s0(Vector(Vector(320.0), Vector(321.0), Vector(322.0)), Vector(Vector(323.0), Vector(324.0))), s0(Vector(Vector(325.0), Vector(326.0), Vector(327.0)), Vector(Vector(328.0), Vector(329.0))), s0(Vector(Vector(330.0), Vector(331.0), Vector(332.0)), Vector(Vector(333.0), Vector(334.0)))), s0(Vector(Vector(335.0), Vector(336.0), Vector(337.0)), Vector(Vector(338.0), Vector(339.0)))), s0(Vector(Vector(340.0), Vector(341.0), Vector(342.0)), Vector(Vector(343.0), Vector(344.0)))))), s4(s0(Vector(Vector(345.0), Vector(346.0), Vector(347.0)), Vector(Vector(348.0), Vector(349.0))), Vector(s2(s1(Vector(s0(Vector(Vector(350.0), Vector(351.0), Vector(352.0)), Vector(Vector(353.0), Vector(354.0))), s0(Vector(Vector(355.0), Vector(356.0), Vector(357.0)), Vector(Vector(358.0), Vector(359.0))), s0(Vector(Vector(360.0), Vector(361.0), Vector(362.0)), Vector(Vector(363.0), Vector(364.0)))), s0(Vector(Vector(365.0), Vector(366.0), Vector(367.0)), Vector(Vector(368.0), Vector(369.0)))), s0(Vector(Vector(370.0), Vector(371.0), Vector(372.0)), Vector(Vector(373.0), Vector(374.0))))))), s2(s1(Vector(s0(Vector(Vector(375.0), Vector(376.0), Vector(377.0)), Vector(Vector(378.0), Vector(379.0))), s0(Vector(Vector(380.0), Vector(381.0), Vector(382.0)), Vector(Vector(383.0), Vector(384.0))), s0(Vector(Vector(385.0), Vector(386.0), Vector(387.0)), Vector(Vector(388.0), Vector(389.0)))), s0(Vector(Vector(390.0), Vector(391.0), Vector(392.0)), Vector(Vector(393.0), Vector(394.0)))), s0(Vector(Vector(395.0), Vector(396.0), Vector(397.0)), Vector(Vector(398.0), Vector(399.0)))), s1(Vector(s0(Vector(Vector(400.0), Vector(401.0), Vector(402.0)), Vector(Vector(403.0), Vector(404.0))), s0(Vector(Vector(405.0), Vector(406.0), Vector(407.0)), Vector(Vector(408.0), Vector(409.0))), s0(Vector(Vector(410.0), Vector(411.0), Vector(412.0)), Vector(Vector(413.0), Vector(414.0)))), s0(Vector(Vector(415.0), Vector(416.0), Vector(417.0)), Vector(Vector(418.0), Vector(419.0))))))))
    val v1: Double = 420.0
    val start = nanoTime()
    var result: Double = 420.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}