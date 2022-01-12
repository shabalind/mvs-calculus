import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0,
    p2: Vector[s0]
  )
  case class s2 (
    p0: Vector[Vector[s0]],
    p1: s1
  )
  case class s4 (
    p0: s1,
    p1: Vector[Vector[s2]]
  )
  case class s6 (
    p0: Vector[Vector[s4]],
    p1: s1
  )
  case class s8 (
    p0: Vector[s1],
    p1: s4
  )
  case class s10 (
    p0: Vector[s0],
    p1: Vector[s6]
  )
  def f66(v0: s4): s4 = {
    var v8: s4 = v0
    val v3: s1 = v8.p0
    var v7: s4 = v0
    v7 = v7.copy(p0 = v3)
    val v2: s1 = v8.p0
    var v1: s4 = v7
    var v13: s4 = v7
    v1 = v1.copy(p0 = v3)
    var v12: s4 = v1
    var v14: s4 = v7
    v7 = v7.copy(p0 = v2)
    val v40: s1 = v14.p0
    v12 = v13
    val v72: Vector[Vector[s2]] = v12.p1
    v12 = v12.copy(p0 = v40)
    var v42: Vector[Vector[s2]] = v72
    v14 = v14.copy(p1 = v42)
    v12
  }
  def f44(v0: Vector[Double]): Vector[Double] = {
    val v4: Double = v0(0)
    val v7: Double = v0(0)
    val v2: Double = v0(0)
    var v10: Vector[Double] = v0
    var v3: Double = v7
    var v6: Vector[Double] = v10
    val v15: Double = v6(0)
    val v1: Double = v0(0)
    v6 = v6.updated(0, v1)
    var v13: Vector[Double] = v6
    v10 = v10.updated(0, v2)
    v6 = v6.updated(0, v3)
    val v22: Double = v10(0)
    v13 = v13.updated(0, v2)
    var v14: Vector[Double] = v0
    var v30: Double = v3
    var v18: Vector[Double] = v14
    v18 = v18.updated(0, v22)
    val v21: Vector[Vector[Double]] = Vector(v18, v0)
    v10 = v10.updated(0, v15)
    var v25: Vector[Vector[Double]] = v21
    val v37: Vector[Double] = v21(1)
    v10 = v10.updated(0, v30)
    v6 = v6.updated(0, v4)
    v10 = v10.updated(0, v4)
    val v20: Vector[Double] = v25(1)
    var v57: Vector[Double] = v14
    v3 = v7
    var v41: Double = v3
    var v82: Vector[Vector[Double]] = v21
    var v34: Vector[Vector[Double]] = v82
    val v33: Double = v13(0)
    var v28: Vector[Double] = v57
    var v48: Vector[Double] = v28
    var v29: Vector[Vector[Double]] = v34
    var v135: Vector[Double] = v18
    v34 = v34.updated(0, v135)
    val v44: Double = v10(0)
    var v53: Double = v41
    v57 = v57.updated(0, v33)
    val v156: Double = v48(0)
    var v62: Vector[Vector[Double]] = v29
    v30 = v53
    v10 = v10.updated(0, v41)
    var v98: Vector[Vector[Double]] = v25
    v34 = v34.updated(1, v37)
    val v91: Double = v20(0)
    var v66: Double = v15
    val v139: Double = v14(0)
    v98 = v98.updated(1, v14)
    var v89: Double = v139
    v25 = v34
    v25 = v98
    var v138: Double = v66
    val v215: Vector[Double] = v62(0)
    var v58: Vector[Double] = v215
    var v114: Double = v138
    v48 = v48.updated(0, v44)
    v18 = v18.updated(0, v89)
    v18 = v18.updated(0, v114)
    v48 = v48.updated(0, v91)
    v6 = v6.updated(0, v156)
    v58
  }
  def f43(v0: s8, v1: Double): Double = {
    var v7: s8 = v0
    val v5: Vector[s1] = v7.p0
    val v4: s1 = v5(0)
    val v3: s4 = v7.p1
    val v8: s4 = f66(v3)
    val v12: s0 = v4.p1
    val v13: s4 = f66(v8)
    val v22: s4 = f66(v13)
    val v20: Vector[Vector[Double]] = v12.p1
    val v33: Vector[Vector[Vector[Double]]] = Vector(v20, v20, v20, v20)
    val v29: Vector[Double] = v20(1)
    v7 = v7.copy(p0 = v5)
    val v49: Vector[Vector[Double]] = v33(2)
    val v50: s4 = f66(v22)
    val v30: Vector[Double] = f44(v29)
    v7 = v7.copy(p1 = v50)
    var v99: Vector[Vector[Double]] = v49
    v99 = v49
    v99 = v99.updated(0, v30)
    val v72: Vector[Double] = v99(0)
    val v191: Double = v72(0)
    v191
  }
  def f22(v0: s8): s8 = {
    var v6: s8 = v0
    var v4: s8 = v0
    var v7: s8 = v4
    val v5: Vector[s1] = v0.p0
    var v9: Vector[s1] = v5
    var v1: s8 = v4
    val v14: Vector[s1] = v6.p0
    var v2: Vector[s1] = v5
    v6 = v6.copy(p0 = v9)
    var v11: Vector[s1] = v2
    val v13: s1 = v11(0)
    v11 = v11.updated(0, v13)
    v4 = v4.copy(p0 = v5)
    val v3: s1 = v5(0)
    val v8: Vector[s1] = v4.p0
    var v12: s8 = v1
    v2 = v2.updated(0, v3)
    v11 = v11.updated(0, v3)
    var v20: Vector[s1] = v8
    var v15: s1 = v13
    v4 = v4.copy(p0 = v14)
    val v43: Vector[s1] = v7.p0
    v1 = v1.copy(p0 = v20)
    v9 = v9.updated(0, v13)
    var v33: s1 = v15
    v4 = v4.copy(p0 = v43)
    val v26: Vector[s0] = v15.p0
    v11 = v11.updated(0, v33)
    v2 = v2.updated(0, v3)
    v9 = v9.updated(0, v3)
    v33 = v33.copy(p0 = v26)
    v6 = v6.copy(p0 = v2)
    v6 = v6.copy(p0 = v11)
    v12
  }
  def f20(v0: s1, v1: s4): s1 = {
    val v8: s4 = f66(v1)
    val v2: s4 = f66(v8)
    var v39: s4 = v2
    val v37: s1 = v39.p0
    v37
  }
  def f14(v0: s2, v1: s4): s4 = {
    val v4: Vector[Vector[s2]] = v1.p1
    val v7: s4 = f66(v1)
    val v8: Vector[s2] = v4(0)
    val v6: s1 = v1.p0
    var v13: s4 = v1
    val v14: Vector[Vector[s2]] = v1.p1
    val v10: s4 = f66(v1)
    v13 = v13.copy(p0 = v6)
    v13 = v13.copy(p0 = v6)
    var v30: Vector[Vector[s2]] = v14
    v13 = v13.copy(p1 = v14)
    val v15: s2 = v8(0)
    var v20: Vector[s2] = v8
    v13 = v13.copy(p1 = v4)
    v30 = v30.updated(0, v20)
    v30 = v30.updated(0, v8)
    v13 = v7
    val v72: s4 = f66(v10)
    v30 = v30.updated(0, v8)
    var v44: s4 = v13
    v13 = v13.copy(p0 = v6)
    v30 = v30.updated(1, v20)
    v30 = v30.updated(0, v8)
    val v113: s1 = v15.p1
    v13 = v13.copy(p1 = v14)
    v13 = v13.copy(p1 = v30)
    val v115: s1 = f20(v113, v72)
    v13 = v13.copy(p0 = v115)
    v44 = v10
    val v145: s4 = f66(v44)
    v145
  }
  def f12(v0: s8, v1: s8): s8 = {
    val v7: Vector[s1] = v0.p0
    val v3: s1 = v7(0)
    var v13: Vector[s1] = v7
    val v8: s1 = v13(0)
    v13 = v13.updated(0, v3)
    val v6: s4 = v0.p1
    v13 = v7
    val v10: s8 = s8(v13, v6)
    v13 = v13.updated(0, v8)
    v13 = v13.updated(0, v8)
    val v67: s8 = f22(v10)
    val v29: s8 = f22(v67)
    var v30: s4 = v6
    val v38: s4 = f66(v30)
    val v56: s4 = v29.p1
    val v59: Vector[s1] = v29.p0
    val v76: s8 = f22(v10)
    val v62: Vector[s4] = Vector(v56)
    var v145: Vector[s4] = v62
    val v110: s4 = v145(0)
    val v215: Vector[Vector[s2]] = v38.p1
    val v104: s8 = s8(v59, v30)
    val v90: Vector[s2] = v215(1)
    v30 = v110
    val v83: s4 = v76.p1
    v13 = v13.updated(0, v3)
    val v132: s2 = v90(0)
    val v108: s4 = f14(v132, v83)
    v145 = v145.updated(0, v108)
    v104
  }
  @noinline
  def f0(v0: Vector[Vector[s6]], v1: s10, v2: Vector[s1], v3: Vector[s8], v4: Double): Double = {
    val v9: s8 = v3(1)
    val v8: s4 = v9.p1
    val v15: s8 = f22(v9)
    val v13: s8 = f22(v15)
    val v10: s8 = f22(v13)
    val v12: s4 = v15.p1
    val v20: s1 = v8.p0
    val v26: s1 = f20(v20, v12)
    val v61: s1 = f20(v26, v12)
    val v46: Double = v4 + v4
    val v32: Double = v46 - v4
    val v92: s0 = v61.p1
    val v111: s8 = f12(v15, v10)
    val v116: Vector[Vector[Double]] = v92.p0
    val v63: Vector[Double] = v116(0)
    val v278: Double = v63(0)
    val v219: Double = f43(v111, v32)
    val v218: Double = v219 * v278
    v218
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s6]] = Vector(Vector(s6(Vector(Vector(s4(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0)))), s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0))), Vector(s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0))))), Vector(Vector(s2(Vector(Vector(s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0))))), s1(Vector(s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0), Vector(24.0)))), s0(Vector(Vector(25.0), Vector(26.0), Vector(27.0)), Vector(Vector(28.0), Vector(29.0))), Vector(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0))))))), Vector(s2(Vector(Vector(s0(Vector(Vector(35.0), Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0))))), s1(Vector(s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0), Vector(44.0)))), s0(Vector(Vector(45.0), Vector(46.0), Vector(47.0)), Vector(Vector(48.0), Vector(49.0))), Vector(s0(Vector(Vector(50.0), Vector(51.0), Vector(52.0)), Vector(Vector(53.0), Vector(54.0))))))))))), s1(Vector(s0(Vector(Vector(55.0), Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0)))), s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0), Vector(64.0))), Vector(s0(Vector(Vector(65.0), Vector(66.0), Vector(67.0)), Vector(Vector(68.0), Vector(69.0))))))), Vector(s6(Vector(Vector(s4(s1(Vector(s0(Vector(Vector(70.0), Vector(71.0), Vector(72.0)), Vector(Vector(73.0), Vector(74.0)))), s0(Vector(Vector(75.0), Vector(76.0), Vector(77.0)), Vector(Vector(78.0), Vector(79.0))), Vector(s0(Vector(Vector(80.0), Vector(81.0), Vector(82.0)), Vector(Vector(83.0), Vector(84.0))))), Vector(Vector(s2(Vector(Vector(s0(Vector(Vector(85.0), Vector(86.0), Vector(87.0)), Vector(Vector(88.0), Vector(89.0))))), s1(Vector(s0(Vector(Vector(90.0), Vector(91.0), Vector(92.0)), Vector(Vector(93.0), Vector(94.0)))), s0(Vector(Vector(95.0), Vector(96.0), Vector(97.0)), Vector(Vector(98.0), Vector(99.0))), Vector(s0(Vector(Vector(100.0), Vector(101.0), Vector(102.0)), Vector(Vector(103.0), Vector(104.0))))))), Vector(s2(Vector(Vector(s0(Vector(Vector(105.0), Vector(106.0), Vector(107.0)), Vector(Vector(108.0), Vector(109.0))))), s1(Vector(s0(Vector(Vector(110.0), Vector(111.0), Vector(112.0)), Vector(Vector(113.0), Vector(114.0)))), s0(Vector(Vector(115.0), Vector(116.0), Vector(117.0)), Vector(Vector(118.0), Vector(119.0))), Vector(s0(Vector(Vector(120.0), Vector(121.0), Vector(122.0)), Vector(Vector(123.0), Vector(124.0))))))))))), s1(Vector(s0(Vector(Vector(125.0), Vector(126.0), Vector(127.0)), Vector(Vector(128.0), Vector(129.0)))), s0(Vector(Vector(130.0), Vector(131.0), Vector(132.0)), Vector(Vector(133.0), Vector(134.0))), Vector(s0(Vector(Vector(135.0), Vector(136.0), Vector(137.0)), Vector(Vector(138.0), Vector(139.0))))))))
    val v1: s10 = s10(Vector(s0(Vector(Vector(140.0), Vector(141.0), Vector(142.0)), Vector(Vector(143.0), Vector(144.0))), s0(Vector(Vector(145.0), Vector(146.0), Vector(147.0)), Vector(Vector(148.0), Vector(149.0))), s0(Vector(Vector(150.0), Vector(151.0), Vector(152.0)), Vector(Vector(153.0), Vector(154.0)))), Vector(s6(Vector(Vector(s4(s1(Vector(s0(Vector(Vector(155.0), Vector(156.0), Vector(157.0)), Vector(Vector(158.0), Vector(159.0)))), s0(Vector(Vector(160.0), Vector(161.0), Vector(162.0)), Vector(Vector(163.0), Vector(164.0))), Vector(s0(Vector(Vector(165.0), Vector(166.0), Vector(167.0)), Vector(Vector(168.0), Vector(169.0))))), Vector(Vector(s2(Vector(Vector(s0(Vector(Vector(170.0), Vector(171.0), Vector(172.0)), Vector(Vector(173.0), Vector(174.0))))), s1(Vector(s0(Vector(Vector(175.0), Vector(176.0), Vector(177.0)), Vector(Vector(178.0), Vector(179.0)))), s0(Vector(Vector(180.0), Vector(181.0), Vector(182.0)), Vector(Vector(183.0), Vector(184.0))), Vector(s0(Vector(Vector(185.0), Vector(186.0), Vector(187.0)), Vector(Vector(188.0), Vector(189.0))))))), Vector(s2(Vector(Vector(s0(Vector(Vector(190.0), Vector(191.0), Vector(192.0)), Vector(Vector(193.0), Vector(194.0))))), s1(Vector(s0(Vector(Vector(195.0), Vector(196.0), Vector(197.0)), Vector(Vector(198.0), Vector(199.0)))), s0(Vector(Vector(200.0), Vector(201.0), Vector(202.0)), Vector(Vector(203.0), Vector(204.0))), Vector(s0(Vector(Vector(205.0), Vector(206.0), Vector(207.0)), Vector(Vector(208.0), Vector(209.0))))))))))), s1(Vector(s0(Vector(Vector(210.0), Vector(211.0), Vector(212.0)), Vector(Vector(213.0), Vector(214.0)))), s0(Vector(Vector(215.0), Vector(216.0), Vector(217.0)), Vector(Vector(218.0), Vector(219.0))), Vector(s0(Vector(Vector(220.0), Vector(221.0), Vector(222.0)), Vector(Vector(223.0), Vector(224.0))))))))
    val v2: Vector[s1] = Vector(s1(Vector(s0(Vector(Vector(225.0), Vector(226.0), Vector(227.0)), Vector(Vector(228.0), Vector(229.0)))), s0(Vector(Vector(230.0), Vector(231.0), Vector(232.0)), Vector(Vector(233.0), Vector(234.0))), Vector(s0(Vector(Vector(235.0), Vector(236.0), Vector(237.0)), Vector(Vector(238.0), Vector(239.0))))), s1(Vector(s0(Vector(Vector(240.0), Vector(241.0), Vector(242.0)), Vector(Vector(243.0), Vector(244.0)))), s0(Vector(Vector(245.0), Vector(246.0), Vector(247.0)), Vector(Vector(248.0), Vector(249.0))), Vector(s0(Vector(Vector(250.0), Vector(251.0), Vector(252.0)), Vector(Vector(253.0), Vector(254.0))))), s1(Vector(s0(Vector(Vector(255.0), Vector(256.0), Vector(257.0)), Vector(Vector(258.0), Vector(259.0)))), s0(Vector(Vector(260.0), Vector(261.0), Vector(262.0)), Vector(Vector(263.0), Vector(264.0))), Vector(s0(Vector(Vector(265.0), Vector(266.0), Vector(267.0)), Vector(Vector(268.0), Vector(269.0))))))
    val v3: Vector[s8] = Vector(s8(Vector(s1(Vector(s0(Vector(Vector(270.0), Vector(271.0), Vector(272.0)), Vector(Vector(273.0), Vector(274.0)))), s0(Vector(Vector(275.0), Vector(276.0), Vector(277.0)), Vector(Vector(278.0), Vector(279.0))), Vector(s0(Vector(Vector(280.0), Vector(281.0), Vector(282.0)), Vector(Vector(283.0), Vector(284.0)))))), s4(s1(Vector(s0(Vector(Vector(285.0), Vector(286.0), Vector(287.0)), Vector(Vector(288.0), Vector(289.0)))), s0(Vector(Vector(290.0), Vector(291.0), Vector(292.0)), Vector(Vector(293.0), Vector(294.0))), Vector(s0(Vector(Vector(295.0), Vector(296.0), Vector(297.0)), Vector(Vector(298.0), Vector(299.0))))), Vector(Vector(s2(Vector(Vector(s0(Vector(Vector(300.0), Vector(301.0), Vector(302.0)), Vector(Vector(303.0), Vector(304.0))))), s1(Vector(s0(Vector(Vector(305.0), Vector(306.0), Vector(307.0)), Vector(Vector(308.0), Vector(309.0)))), s0(Vector(Vector(310.0), Vector(311.0), Vector(312.0)), Vector(Vector(313.0), Vector(314.0))), Vector(s0(Vector(Vector(315.0), Vector(316.0), Vector(317.0)), Vector(Vector(318.0), Vector(319.0))))))), Vector(s2(Vector(Vector(s0(Vector(Vector(320.0), Vector(321.0), Vector(322.0)), Vector(Vector(323.0), Vector(324.0))))), s1(Vector(s0(Vector(Vector(325.0), Vector(326.0), Vector(327.0)), Vector(Vector(328.0), Vector(329.0)))), s0(Vector(Vector(330.0), Vector(331.0), Vector(332.0)), Vector(Vector(333.0), Vector(334.0))), Vector(s0(Vector(Vector(335.0), Vector(336.0), Vector(337.0)), Vector(Vector(338.0), Vector(339.0)))))))))), s8(Vector(s1(Vector(s0(Vector(Vector(340.0), Vector(341.0), Vector(342.0)), Vector(Vector(343.0), Vector(344.0)))), s0(Vector(Vector(345.0), Vector(346.0), Vector(347.0)), Vector(Vector(348.0), Vector(349.0))), Vector(s0(Vector(Vector(350.0), Vector(351.0), Vector(352.0)), Vector(Vector(353.0), Vector(354.0)))))), s4(s1(Vector(s0(Vector(Vector(355.0), Vector(356.0), Vector(357.0)), Vector(Vector(358.0), Vector(359.0)))), s0(Vector(Vector(360.0), Vector(361.0), Vector(362.0)), Vector(Vector(363.0), Vector(364.0))), Vector(s0(Vector(Vector(365.0), Vector(366.0), Vector(367.0)), Vector(Vector(368.0), Vector(369.0))))), Vector(Vector(s2(Vector(Vector(s0(Vector(Vector(370.0), Vector(371.0), Vector(372.0)), Vector(Vector(373.0), Vector(374.0))))), s1(Vector(s0(Vector(Vector(375.0), Vector(376.0), Vector(377.0)), Vector(Vector(378.0), Vector(379.0)))), s0(Vector(Vector(380.0), Vector(381.0), Vector(382.0)), Vector(Vector(383.0), Vector(384.0))), Vector(s0(Vector(Vector(385.0), Vector(386.0), Vector(387.0)), Vector(Vector(388.0), Vector(389.0))))))), Vector(s2(Vector(Vector(s0(Vector(Vector(390.0), Vector(391.0), Vector(392.0)), Vector(Vector(393.0), Vector(394.0))))), s1(Vector(s0(Vector(Vector(395.0), Vector(396.0), Vector(397.0)), Vector(Vector(398.0), Vector(399.0)))), s0(Vector(Vector(400.0), Vector(401.0), Vector(402.0)), Vector(Vector(403.0), Vector(404.0))), Vector(s0(Vector(Vector(405.0), Vector(406.0), Vector(407.0)), Vector(Vector(408.0), Vector(409.0)))))))))))
    val v4: Double = 410.0
    val start = nanoTime()
    var result: Double = 410.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}