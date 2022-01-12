import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Double],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[Vector[s0]]
  )
  case class s2 (
    p0: s0,
    p1: s0
  )
  case class s3 (
    p0: Vector[Vector[s0]],
    p1: Vector[s0]
  )
  case class s4 (
    p0: Vector[s0],
    p1: s2
  )
  case class s5 (
    p0: s2,
    p1: Vector[Vector[s4]]
  )
  case class s6 (
    p0: s4,
    p1: Vector[s2]
  )
  case class s7 (
    p0: s6,
    p1: s3
  )
  case class s9 (
    p0: s7,
    p1: Vector[Vector[s5]]
  )
  def f116(v0: s7): s7 = {
    var v6: s7 = v0
    val v9: s6 = v6.p0
    val v4: s4 = v9.p0
    v6 = v6.copy(p0 = v9)
    var v1: s6 = v9
    var v8: s7 = v0
    v8 = v8.copy(p0 = v9)
    val v2: Vector[s7] = Vector(v8, v6, v0, v0, v0, v6, v8)
    v6 = v6.copy(p0 = v1)
    var v7: s6 = v9
    var v3: s6 = v1
    v6 = v6.copy(p0 = v3)
    val v14: s7 = v2(1)
    val v18: Vector[s2] = v9.p1
    val v5: s2 = v18(1)
    v1 = v1.copy(p1 = v18)
    v3 = v3.copy(p1 = v18)
    val v12: s6 = v14.p0
    val v21: Vector[s2] = v7.p1
    val v10: s4 = v12.p0
    v3 = v3.copy(p1 = v18)
    val v23: s0 = v5.p0
    v7 = v7.copy(p0 = v4)
    var v17: s2 = v5
    var v33: s4 = v10
    var v49: Vector[s2] = v18
    v49 = v49.updated(0, v5)
    v17 = v5
    val v22: s2 = v49(2)
    v49 = v49.updated(2, v22)
    val v48: Vector[s2] = Vector(v17, v17, v22, v5, v22)
    val v64: s7 = v2(0)
    v33 = v33.copy(p1 = v22)
    v17 = v17.copy(p0 = v23)
    val v94: Vector[s0] = v4.p0
    v8 = v8.copy(p0 = v12)
    val v140: s2 = v21(1)
    val v62: s4 = s4(v94, v140)
    v7 = v7.copy(p0 = v62)
    var v68: Vector[s2] = v21
    v7 = v7.copy(p0 = v33)
    v49 = v21
    var v81: Vector[s2] = v48
    val v167: s2 = v81(0)
    v49 = v49.updated(0, v167)
    v1 = v1.copy(p1 = v68)
    var v171: s7 = v64
    v3 = v3.copy(p1 = v49)
    v171 = v171.copy(p0 = v3)
    v7 = v7.copy(p0 = v4)
    v171
  }
  def f107(v0: s2): s2 = {
    val v7: s0 = v0.p1
    val v2: s0 = v0.p0
    var v3: s0 = v2
    var v1: s0 = v3
    val v5: s0 = v0.p1
    val v11: Vector[Double] = v3.p0
    v3 = v5
    val v4: s0 = v0.p1
    val v8: s0 = v0.p0
    v1 = v1.copy(p0 = v11)
    var v15: s0 = v7
    val v13: Vector[Vector[Double]] = v15.p1
    var v22: s2 = v0
    v22 = v22.copy(p1 = v1)
    val v17: Vector[Double] = v13(1)
    var v16: s2 = v22
    val v23: s0 = v0.p0
    v22 = v22.copy(p0 = v23)
    val v34: s2 = s2(v1, v3)
    var v45: Vector[Vector[Double]] = v13
    var v36: s2 = v16
    v1 = v1.copy(p1 = v13)
    var v39: s2 = v16
    var v38: Vector[Vector[Double]] = v45
    var v50: s2 = v36
    v39 = v39.copy(p1 = v4)
    v45 = v45.updated(0, v17)
    val v70: s0 = v39.p0
    val v56: Vector[Vector[Double]] = v15.p1
    val v40: s0 = v34.p0
    v39 = v39.copy(p1 = v8)
    var v100: Vector[Vector[Double]] = v13
    val v67: Vector[Double] = v38(1)
    v16 = v16.copy(p0 = v40)
    v15 = v15.copy(p1 = v56)
    v45 = v45.updated(1, v67)
    v1 = v1.copy(p1 = v38)
    v36 = v36.copy(p1 = v70)
    v50 = v50.copy(p1 = v40)
    var v73: Vector[Vector[Double]] = v100
    v38 = v73
    v50
  }
  def f104(v0: s0, v1: Vector[s0]): Vector[s0] = {
    var v52: Vector[s0] = v1
    v52
  }
  def f86(v0: s9): s9 = {
    val v3: s7 = v0.p0
    val v1: s7 = f116(v3)
    var v6: s7 = v3
    val v7: s6 = v6.p0
    var v8: s9 = v0
    v6 = v6.copy(p0 = v7)
    var v11: s9 = v0
    var v2: s9 = v11
    val v4: Vector[Vector[s5]] = v0.p1
    val v16: s3 = v6.p1
    val v13: Vector[Vector[s5]] = v0.p1
    var v23: Vector[Vector[s5]] = v13
    val v10: s7 = f116(v3)
    v11 = v8
    var v20: s3 = v16
    val v31: Vector[s0] = v20.p1
    var v19: s3 = v16
    var v29: Vector[Vector[s5]] = v4
    val v37: s7 = f116(v10)
    var v40: s9 = v0
    var v24: s7 = v3
    val v25: Vector[s9] = Vector(v40, v11, v0, v8, v0, v8)
    val v51: Vector[Vector[s0]] = v16.p0
    v8 = v8.copy(p0 = v24)
    v6 = v6.copy(p1 = v16)
    v6 = v6.copy(p1 = v20)
    v8 = v8.copy(p0 = v1)
    val v63: Vector[s5] = v29(2)
    v6 = v6.copy(p1 = v19)
    val v72: s7 = f116(v6)
    var v50: Vector[s0] = v31
    v20 = v20.copy(p1 = v50)
    v20 = v20.copy(p0 = v51)
    val v57: s0 = v50(0)
    v40 = v40.copy(p1 = v4)
    val v177: s9 = s9(v37, v23)
    v50 = v50.updated(1, v57)
    var v98: Vector[Vector[s5]] = v23
    val v123: s9 = v25(4)
    val v96: s9 = s9(v72, v98)
    v11 = v11.copy(p1 = v29)
    val v162: Vector[s9] = Vector(v177, v2, v177, v2, v96, v40, v123)
    var v400: Vector[s9] = v162
    val v83: s9 = v400(3)
    v98 = v98.updated(2, v63)
    v83
  }
  def f81(v0: s9): s9 = {
    val v4: Vector[Vector[s5]] = v0.p1
    val v3: s9 = f86(v0)
    var v1: s9 = v3
    val v2: s7 = v1.p0
    var v5: s9 = v3
    val v7: s7 = f116(v2)
    val v16: s7 = v5.p0
    v5 = v0
    v5 = v0
    val v12: s7 = f116(v16)
    var v27: s9 = v5
    v1 = v1.copy(p1 = v4)
    val v19: Vector[Vector[s5]] = v27.p1
    val v30: s7 = f116(v16)
    v27 = v27.copy(p1 = v4)
    v5 = v5.copy(p1 = v4)
    val v48: s9 = s9(v30, v19)
    v5 = v5.copy(p0 = v7)
    v5 = v5.copy(p1 = v19)
    v5 = v5.copy(p1 = v19)
    v27 = v27.copy(p0 = v12)
    v27 = v27.copy(p1 = v4)
    v1 = v1.copy(p1 = v19)
    v48
  }
  def f73(v0: s0, v1: s4): s0 = {
    var v5: s4 = v1
    v5 = v1
    val v2: Vector[s0] = v5.p0
    val v8: s0 = v2(0)
    val v7: Vector[s0] = v1.p0
    val v4: s0 = v2(0)
    var v6: Vector[s0] = v2
    val v14: s0 = v2(1)
    val v12: s2 = v1.p1
    val v11: s2 = f107(v12)
    v5 = v1
    val v21: s2 = f107(v11)
    val v37: s2 = f107(v12)
    val v22: Vector[s0] = f104(v14, v6)
    val v51: s2 = f107(v11)
    val v27: s0 = v2(0)
    val v24: Vector[s0] = f104(v4, v7)
    v6 = v6.updated(0, v4)
    val v16: s2 = f107(v51)
    val v41: s2 = v1.p1
    v5 = v5.copy(p0 = v22)
    val v28: s2 = f107(v21)
    v6 = v6.updated(0, v8)
    v6 = v24
    var v35: s2 = v41
    val v87: Vector[s0] = f104(v14, v22)
    v5 = v1
    val v42: s2 = f107(v21)
    val v95: s0 = v12.p0
    v35 = v35.copy(p0 = v27)
    val v73: s2 = f107(v16)
    val v54: s2 = s2(v14, v8)
    val v52: s2 = f107(v37)
    var v179: s4 = v5
    val v68: s2 = v179.p1
    v6 = v6.updated(2, v95)
    val v84: s0 = v35.p0
    val v92: s2 = f107(v73)
    val v106: s2 = f107(v42)
    val v130: Vector[s2] = Vector(v51, v21, v92, v52, v106, v68)
    val v120: s2 = v130(5)
    val v253: s0 = v87(0)
    v179 = v179.copy(p1 = v54)
    val v211: s0 = v120.p0
    v179 = v179.copy(p1 = v28)
    v5 = v5.copy(p1 = v21)
    v6 = v6.updated(2, v84)
    v35 = v35.copy(p0 = v253)
    v211
  }
  @noinline
  def f0(v0: Vector[s9], v1: Vector[s1], v2: Double): Double = {
    var v3: Vector[s9] = v0
    var v11: Vector[s9] = v3
    var v7: Vector[s9] = v3
    var v4: Vector[s9] = v11
    val v18: s9 = v7(1)
    val v12: s9 = f81(v18)
    v4 = v4.updated(0, v18)
    val v10: s9 = f81(v12)
    v11 = v11.updated(0, v10)
    val v17: s1 = v1(0)
    val v14: s9 = v0(0)
    val v13: Vector[Vector[s0]] = v17.p1
    var v28: Vector[Vector[s0]] = v13
    val v23: s9 = v4(0)
    val v21: Vector[Vector[s0]] = v17.p1
    val v68: Vector[s0] = v21(0)
    v11 = v11.updated(2, v14)
    val v59: s7 = v23.p0
    v28 = v28.updated(0, v68)
    var v42: Vector[s0] = v68
    val v94: s6 = v59.p0
    val v43: s4 = v94.p0
    v28 = v28.updated(0, v42)
    val v33: Vector[s0] = v28(0)
    val v35: s0 = v33(0)
    v42 = v68
    v4 = v4.updated(2, v12)
    v28 = v28.updated(0, v33)
    val v48: s0 = f73(v35, v43)
    val v120: Vector[Double] = v48.p0
    val v47: Double = v120(0)
    v47
  }
  def benchmark(): Unit = {
    val v0: Vector[s9] = Vector(s9(s7(s6(s4(Vector(s0(Vector(0.0), Vector(Vector(1.0), Vector(2.0), Vector(3.0))), s0(Vector(4.0), Vector(Vector(5.0), Vector(6.0), Vector(7.0))), s0(Vector(8.0), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))), s2(s0(Vector(12.0), Vector(Vector(13.0), Vector(14.0), Vector(15.0))), s0(Vector(16.0), Vector(Vector(17.0), Vector(18.0), Vector(19.0))))), Vector(s2(s0(Vector(20.0), Vector(Vector(21.0), Vector(22.0), Vector(23.0))), s0(Vector(24.0), Vector(Vector(25.0), Vector(26.0), Vector(27.0)))), s2(s0(Vector(28.0), Vector(Vector(29.0), Vector(30.0), Vector(31.0))), s0(Vector(32.0), Vector(Vector(33.0), Vector(34.0), Vector(35.0)))), s2(s0(Vector(36.0), Vector(Vector(37.0), Vector(38.0), Vector(39.0))), s0(Vector(40.0), Vector(Vector(41.0), Vector(42.0), Vector(43.0)))))), s3(Vector(Vector(s0(Vector(44.0), Vector(Vector(45.0), Vector(46.0), Vector(47.0)))), Vector(s0(Vector(48.0), Vector(Vector(49.0), Vector(50.0), Vector(51.0))))), Vector(s0(Vector(52.0), Vector(Vector(53.0), Vector(54.0), Vector(55.0))), s0(Vector(56.0), Vector(Vector(57.0), Vector(58.0), Vector(59.0)))))), Vector(Vector(s5(s2(s0(Vector(60.0), Vector(Vector(61.0), Vector(62.0), Vector(63.0))), s0(Vector(64.0), Vector(Vector(65.0), Vector(66.0), Vector(67.0)))), Vector(Vector(s4(Vector(s0(Vector(68.0), Vector(Vector(69.0), Vector(70.0), Vector(71.0))), s0(Vector(72.0), Vector(Vector(73.0), Vector(74.0), Vector(75.0))), s0(Vector(76.0), Vector(Vector(77.0), Vector(78.0), Vector(79.0)))), s2(s0(Vector(80.0), Vector(Vector(81.0), Vector(82.0), Vector(83.0))), s0(Vector(84.0), Vector(Vector(85.0), Vector(86.0), Vector(87.0))))))))), Vector(s5(s2(s0(Vector(88.0), Vector(Vector(89.0), Vector(90.0), Vector(91.0))), s0(Vector(92.0), Vector(Vector(93.0), Vector(94.0), Vector(95.0)))), Vector(Vector(s4(Vector(s0(Vector(96.0), Vector(Vector(97.0), Vector(98.0), Vector(99.0))), s0(Vector(100.0), Vector(Vector(101.0), Vector(102.0), Vector(103.0))), s0(Vector(104.0), Vector(Vector(105.0), Vector(106.0), Vector(107.0)))), s2(s0(Vector(108.0), Vector(Vector(109.0), Vector(110.0), Vector(111.0))), s0(Vector(112.0), Vector(Vector(113.0), Vector(114.0), Vector(115.0))))))))), Vector(s5(s2(s0(Vector(116.0), Vector(Vector(117.0), Vector(118.0), Vector(119.0))), s0(Vector(120.0), Vector(Vector(121.0), Vector(122.0), Vector(123.0)))), Vector(Vector(s4(Vector(s0(Vector(124.0), Vector(Vector(125.0), Vector(126.0), Vector(127.0))), s0(Vector(128.0), Vector(Vector(129.0), Vector(130.0), Vector(131.0))), s0(Vector(132.0), Vector(Vector(133.0), Vector(134.0), Vector(135.0)))), s2(s0(Vector(136.0), Vector(Vector(137.0), Vector(138.0), Vector(139.0))), s0(Vector(140.0), Vector(Vector(141.0), Vector(142.0), Vector(143.0))))))))))), s9(s7(s6(s4(Vector(s0(Vector(144.0), Vector(Vector(145.0), Vector(146.0), Vector(147.0))), s0(Vector(148.0), Vector(Vector(149.0), Vector(150.0), Vector(151.0))), s0(Vector(152.0), Vector(Vector(153.0), Vector(154.0), Vector(155.0)))), s2(s0(Vector(156.0), Vector(Vector(157.0), Vector(158.0), Vector(159.0))), s0(Vector(160.0), Vector(Vector(161.0), Vector(162.0), Vector(163.0))))), Vector(s2(s0(Vector(164.0), Vector(Vector(165.0), Vector(166.0), Vector(167.0))), s0(Vector(168.0), Vector(Vector(169.0), Vector(170.0), Vector(171.0)))), s2(s0(Vector(172.0), Vector(Vector(173.0), Vector(174.0), Vector(175.0))), s0(Vector(176.0), Vector(Vector(177.0), Vector(178.0), Vector(179.0)))), s2(s0(Vector(180.0), Vector(Vector(181.0), Vector(182.0), Vector(183.0))), s0(Vector(184.0), Vector(Vector(185.0), Vector(186.0), Vector(187.0)))))), s3(Vector(Vector(s0(Vector(188.0), Vector(Vector(189.0), Vector(190.0), Vector(191.0)))), Vector(s0(Vector(192.0), Vector(Vector(193.0), Vector(194.0), Vector(195.0))))), Vector(s0(Vector(196.0), Vector(Vector(197.0), Vector(198.0), Vector(199.0))), s0(Vector(200.0), Vector(Vector(201.0), Vector(202.0), Vector(203.0)))))), Vector(Vector(s5(s2(s0(Vector(204.0), Vector(Vector(205.0), Vector(206.0), Vector(207.0))), s0(Vector(208.0), Vector(Vector(209.0), Vector(210.0), Vector(211.0)))), Vector(Vector(s4(Vector(s0(Vector(212.0), Vector(Vector(213.0), Vector(214.0), Vector(215.0))), s0(Vector(216.0), Vector(Vector(217.0), Vector(218.0), Vector(219.0))), s0(Vector(220.0), Vector(Vector(221.0), Vector(222.0), Vector(223.0)))), s2(s0(Vector(224.0), Vector(Vector(225.0), Vector(226.0), Vector(227.0))), s0(Vector(228.0), Vector(Vector(229.0), Vector(230.0), Vector(231.0))))))))), Vector(s5(s2(s0(Vector(232.0), Vector(Vector(233.0), Vector(234.0), Vector(235.0))), s0(Vector(236.0), Vector(Vector(237.0), Vector(238.0), Vector(239.0)))), Vector(Vector(s4(Vector(s0(Vector(240.0), Vector(Vector(241.0), Vector(242.0), Vector(243.0))), s0(Vector(244.0), Vector(Vector(245.0), Vector(246.0), Vector(247.0))), s0(Vector(248.0), Vector(Vector(249.0), Vector(250.0), Vector(251.0)))), s2(s0(Vector(252.0), Vector(Vector(253.0), Vector(254.0), Vector(255.0))), s0(Vector(256.0), Vector(Vector(257.0), Vector(258.0), Vector(259.0))))))))), Vector(s5(s2(s0(Vector(260.0), Vector(Vector(261.0), Vector(262.0), Vector(263.0))), s0(Vector(264.0), Vector(Vector(265.0), Vector(266.0), Vector(267.0)))), Vector(Vector(s4(Vector(s0(Vector(268.0), Vector(Vector(269.0), Vector(270.0), Vector(271.0))), s0(Vector(272.0), Vector(Vector(273.0), Vector(274.0), Vector(275.0))), s0(Vector(276.0), Vector(Vector(277.0), Vector(278.0), Vector(279.0)))), s2(s0(Vector(280.0), Vector(Vector(281.0), Vector(282.0), Vector(283.0))), s0(Vector(284.0), Vector(Vector(285.0), Vector(286.0), Vector(287.0))))))))))), s9(s7(s6(s4(Vector(s0(Vector(288.0), Vector(Vector(289.0), Vector(290.0), Vector(291.0))), s0(Vector(292.0), Vector(Vector(293.0), Vector(294.0), Vector(295.0))), s0(Vector(296.0), Vector(Vector(297.0), Vector(298.0), Vector(299.0)))), s2(s0(Vector(300.0), Vector(Vector(301.0), Vector(302.0), Vector(303.0))), s0(Vector(304.0), Vector(Vector(305.0), Vector(306.0), Vector(307.0))))), Vector(s2(s0(Vector(308.0), Vector(Vector(309.0), Vector(310.0), Vector(311.0))), s0(Vector(312.0), Vector(Vector(313.0), Vector(314.0), Vector(315.0)))), s2(s0(Vector(316.0), Vector(Vector(317.0), Vector(318.0), Vector(319.0))), s0(Vector(320.0), Vector(Vector(321.0), Vector(322.0), Vector(323.0)))), s2(s0(Vector(324.0), Vector(Vector(325.0), Vector(326.0), Vector(327.0))), s0(Vector(328.0), Vector(Vector(329.0), Vector(330.0), Vector(331.0)))))), s3(Vector(Vector(s0(Vector(332.0), Vector(Vector(333.0), Vector(334.0), Vector(335.0)))), Vector(s0(Vector(336.0), Vector(Vector(337.0), Vector(338.0), Vector(339.0))))), Vector(s0(Vector(340.0), Vector(Vector(341.0), Vector(342.0), Vector(343.0))), s0(Vector(344.0), Vector(Vector(345.0), Vector(346.0), Vector(347.0)))))), Vector(Vector(s5(s2(s0(Vector(348.0), Vector(Vector(349.0), Vector(350.0), Vector(351.0))), s0(Vector(352.0), Vector(Vector(353.0), Vector(354.0), Vector(355.0)))), Vector(Vector(s4(Vector(s0(Vector(356.0), Vector(Vector(357.0), Vector(358.0), Vector(359.0))), s0(Vector(360.0), Vector(Vector(361.0), Vector(362.0), Vector(363.0))), s0(Vector(364.0), Vector(Vector(365.0), Vector(366.0), Vector(367.0)))), s2(s0(Vector(368.0), Vector(Vector(369.0), Vector(370.0), Vector(371.0))), s0(Vector(372.0), Vector(Vector(373.0), Vector(374.0), Vector(375.0))))))))), Vector(s5(s2(s0(Vector(376.0), Vector(Vector(377.0), Vector(378.0), Vector(379.0))), s0(Vector(380.0), Vector(Vector(381.0), Vector(382.0), Vector(383.0)))), Vector(Vector(s4(Vector(s0(Vector(384.0), Vector(Vector(385.0), Vector(386.0), Vector(387.0))), s0(Vector(388.0), Vector(Vector(389.0), Vector(390.0), Vector(391.0))), s0(Vector(392.0), Vector(Vector(393.0), Vector(394.0), Vector(395.0)))), s2(s0(Vector(396.0), Vector(Vector(397.0), Vector(398.0), Vector(399.0))), s0(Vector(400.0), Vector(Vector(401.0), Vector(402.0), Vector(403.0))))))))), Vector(s5(s2(s0(Vector(404.0), Vector(Vector(405.0), Vector(406.0), Vector(407.0))), s0(Vector(408.0), Vector(Vector(409.0), Vector(410.0), Vector(411.0)))), Vector(Vector(s4(Vector(s0(Vector(412.0), Vector(Vector(413.0), Vector(414.0), Vector(415.0))), s0(Vector(416.0), Vector(Vector(417.0), Vector(418.0), Vector(419.0))), s0(Vector(420.0), Vector(Vector(421.0), Vector(422.0), Vector(423.0)))), s2(s0(Vector(424.0), Vector(Vector(425.0), Vector(426.0), Vector(427.0))), s0(Vector(428.0), Vector(Vector(429.0), Vector(430.0), Vector(431.0))))))))))))
    val v1: Vector[s1] = Vector(s1(s0(Vector(432.0), Vector(Vector(433.0), Vector(434.0), Vector(435.0))), Vector(Vector(s0(Vector(436.0), Vector(Vector(437.0), Vector(438.0), Vector(439.0)))))))
    val v2: Double = 440.0
    val start = nanoTime()
    var result: Double = 440.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}