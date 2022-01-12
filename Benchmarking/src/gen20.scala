import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: s0,
    p1: Vector[s0],
    p2: Vector[s1],
    p3: Vector[s1]
  )
  case class s3 (
    p0: s2,
    p1: s1
  )
  case class s4 (
    p0: s0,
    p1: Vector[s0],
    p2: Vector[s3],
    p3: Vector[s3],
    p4: s2
  )
  def f19(v0: Double, v1: Vector[s0]): Double = {
    val v8: s0 = v1(0)
    val v6: Vector[Vector[Double]] = v8.p0
    val v2: s0 = v1(0)
    val v5: Vector[Vector[Double]] = v2.p0
    val v10: Vector[Vector[Double]] = v8.p1
    var v4: Vector[Vector[Double]] = v10
    val v11: s0 = v1(0)
    var v18: Vector[Vector[Double]] = v4
    val v14: Vector[Vector[Double]] = v8.p0
    val v19: Vector[Double] = v18(0)
    val v22: Vector[Double] = v14(0)
    val v41: Vector[Vector[Double]] = Vector(v19, v19)
    val v29: Vector[Double] = v5(2)
    v18 = v18.updated(0, v19)
    val v36: Vector[Vector[Double]] = v11.p0
    v18 = v18.updated(0, v29)
    val v30: Vector[Double] = v41(0)
    val v66: Vector[Double] = v41(0)
    val v38: Vector[Double] = v18(0)
    var v94: Vector[Vector[Double]] = v41
    val v59: Vector[Double] = v94(1)
    var v63: Vector[Vector[Double]] = v94
    val v34: Vector[Double] = v6(0)
    v94 = v94.updated(1, v30)
    val v117: Vector[Double] = v36(0)
    v18 = v10
    var v37: Vector[Vector[Double]] = v63
    var v46: Vector[Double] = v117
    val v55: Vector[Double] = v4(0)
    val v226: Vector[Double] = v94(1)
    v37 = v41
    val v83: Vector[Vector[Double]] = v11.p1
    v18 = v18.updated(0, v59)
    v94 = v94.updated(1, v55)
    v18 = v18.updated(0, v38)
    val v104: Vector[Double] = v37(1)
    v94 = v94.updated(1, v34)
    v18 = v83
    v37 = v37.updated(1, v46)
    val v174: Double = v22(0)
    v94 = v94.updated(1, v226)
    v4 = v4.updated(0, v29)
    v37 = v37.updated(0, v66)
    val v91: Double = v104(0)
    val v118: Double = v174 - v91
    v118
  }
  def f18(v0: Vector[s1]): Vector[s1] = {
    val v5: s1 = v0(0)
    val v6: s1 = v0(0)
    var v7: s1 = v6
    val v10: s0 = v5.p1
    val v1: s0 = v7.p1
    var v3: s0 = v1
    var v4: s0 = v3
    var v17: Vector[s1] = v0
    v7 = v7.copy(p1 = v4)
    val v9: Vector[Vector[Double]] = v10.p0
    val v11: s0 = v7.p1
    val v16: Vector[Vector[Double]] = v4.p1
    var v14: Vector[Vector[Double]] = v16
    var v29: Vector[Vector[Double]] = v14
    v7 = v7.copy(p0 = v3)
    var v20: s0 = v11
    v17 = v17.updated(0, v7)
    val v15: Vector[Double] = v9(2)
    v14 = v14.updated(0, v15)
    val v24: Vector[Vector[Double]] = v20.p0
    v29 = v29.updated(0, v15)
    v3 = v11
    v3 = v3.copy(p0 = v24)
    val v30: Vector[Double] = v14(0)
    v14 = v14.updated(0, v30)
    val v74: s1 = v0(0)
    v17 = v17.updated(0, v74)
    v29 = v29.updated(0, v15)
    v14 = v14.updated(0, v30)
    v20 = v20.copy(p1 = v29)
    v20 = v20.copy(p1 = v16)
    v17 = v17.updated(0, v6)
    v17
  }
  def f16(v0: s0): s0 = {
    val v8: Vector[Vector[Double]] = v0.p1
    val v1: Vector[Vector[Vector[Double]]] = Vector(v8, v8, v8, v8)
    var v7: s0 = v0
    v7 = v0
    var v2: Vector[Vector[Double]] = v8
    val v3: Vector[Vector[Double]] = v1(0)
    val v6: Vector[Double] = v2(0)
    v7 = v7.copy(p1 = v3)
    v2 = v2.updated(0, v6)
    v7 = v7.copy(p1 = v3)
    val v4: Vector[Vector[Double]] = v0.p1
    var v5: Vector[Vector[Double]] = v4
    v5 = v5.updated(0, v6)
    var v12: s0 = v7
    val v13: Vector[Double] = v8(0)
    val v17: Vector[Vector[Double]] = v1(1)
    val v10: Vector[Vector[Double]] = v12.p0
    v2 = v2.updated(0, v6)
    var v15: Vector[Vector[Double]] = v10
    v7 = v7.copy(p0 = v15)
    var v14: Vector[Vector[Double]] = v10
    var v28: s0 = v7
    val v24: s0 = s0(v14, v8)
    val v18: Vector[Double] = v2(0)
    v5 = v5.updated(0, v18)
    val v36: Vector[Vector[Double]] = v7.p0
    val v19: Vector[Double] = v10(2)
    v2 = v2.updated(0, v19)
    var v26: s0 = v24
    v12 = v12.copy(p0 = v10)
    val v25: Vector[Vector[Double]] = v7.p0
    val v32: Vector[Vector[Double]] = v12.p0
    v7 = v7.copy(p0 = v10)
    v26 = v26.copy(p1 = v2)
    var v65: s0 = v7
    v7 = v7.copy(p1 = v5)
    val v45: Vector[Vector[Double]] = v12.p1
    v12 = v12.copy(p0 = v36)
    var v82: Vector[Vector[Vector[Double]]] = v1
    v65 = v65.copy(p0 = v14)
    v26 = v26.copy(p1 = v3)
    val v52: Vector[Vector[Double]] = v28.p0
    v7 = v7.copy(p0 = v25)
    val v86: Vector[s0] = Vector(v24, v24, v65)
    val v56: s1 = s1(v7, v12)
    v65 = v65.copy(p0 = v14)
    v28 = v28.copy(p1 = v45)
    val v68: Vector[Vector[Double]] = v12.p0
    val v114: Vector[Vector[Double]] = v82(2)
    val v95: s0 = v56.p0
    v12 = v12.copy(p1 = v114)
    v65 = v65.copy(p0 = v14)
    v14 = v14.updated(1, v13)
    v12 = v12.copy(p1 = v17)
    v7 = v7.copy(p0 = v68)
    v26 = v95
    val v97: s0 = v86(2)
    v7 = v7.copy(p0 = v52)
    v82 = v82.updated(1, v45)
    v26 = v26.copy(p0 = v32)
    v12 = v26
    v97
  }
  def f11(v0: s1): s1 = {
    v0
  }
  def f8(v0: s1): s1 = {
    val v1: s1 = f11(v0)
    var v2: s1 = v1
    val v5: s0 = v2.p1
    val v7: s0 = f16(v5)
    v2 = v2.copy(p0 = v7)
    v2
  }
  def f4(v0: Vector[s1], v1: s1, v2: s0, v3: Vector[s1]): Vector[s1] = {
    var v5: Vector[s1] = v3
    val v8: Vector[Vector[s1]] = Vector(v3, v5)
    v5 = v3
    val v7: Vector[s1] = v8(1)
    v5 = v7
    v5 = v5.updated(0, v1)
    v5 = v5.updated(0, v1)
    val v17: s1 = f8(v1)
    val v28: Vector[s1] = v8(1)
    val v31: s1 = f11(v17)
    var v46: Vector[s1] = v28
    var v54: Vector[s1] = v46
    val v115: Vector[s1] = f18(v54)
    v54 = v54.updated(0, v31)
    v115
  }
  def f3(v0: s0, v1: Vector[s2]): s0 = {
    val v8: s0 = f16(v0)
    val v6: Vector[Vector[Double]] = v8.p0
    val v2: s0 = f16(v8)
    var v9: s0 = v2
    v9 = v9.copy(p0 = v6)
    val v18: s0 = f16(v9)
    v18
  }
  def f2(v0: s2, v1: s0): s2 = {
    val v6: s0 = f16(v1)
    val v5: Vector[s1] = v0.p3
    val v4: Vector[Vector[Double]] = v1.p0
    val v8: s0 = f16(v6)
    val v3: s1 = v5(0)
    var v2: Vector[s1] = v5
    v2 = v2.updated(0, v3)
    var v9: s0 = v1
    v9 = v9.copy(p0 = v4)
    val v13: Vector[Vector[Double]] = v1.p0
    v9 = v9.copy(p0 = v13)
    v9 = v9.copy(p0 = v13)
    var v11: s1 = v3
    v2 = v2.updated(0, v11)
    v2 = v2.updated(0, v3)
    val v20: Vector[s1] = f4(v5, v11, v1, v2)
    val v21: Vector[s1] = f18(v20)
    v9 = v9.copy(p0 = v13)
    v9 = v9.copy(p0 = v13)
    val v24: s1 = s1(v8, v6)
    v2 = v2.updated(0, v24)
    val v34: Vector[s1] = f4(v20, v11, v9, v2)
    val v43: s1 = v21(0)
    v2 = v2.updated(0, v43)
    val v56: Vector[s0] = v0.p1
    val v150: Vector[Vector[Double]] = v8.p0
    val v87: Vector[s1] = v0.p2
    val v157: Vector[s0] = v0.p1
    val v69: s0 = f16(v1)
    val v70: Vector[s2] = Vector(v0, v0, v0)
    var v96: s0 = v69
    val v118: s0 = f3(v96, v70)
    val v90: s0 = v56(1)
    v96 = v96.copy(p0 = v150)
    v11 = v11.copy(p1 = v118)
    val v142: Vector[s1] = f4(v20, v11, v90, v34)
    val v193: s2 = s2(v118, v157, v87, v142)
    v2 = v2.updated(0, v43)
    v193
  }
  @noinline
  def f0(v0: s3, v1: s4, v2: Vector[s4], v3: s1, v4: Vector[Vector[s3]], v5: Double): Double = {
    var v7: s1 = v3
    val v6: s1 = f8(v7)
    val v8: s2 = v0.p0
    val v9: Vector[s1] = v8.p2
    val v30: s0 = v7.p0
    val v17: s1 = f8(v6)
    v7 = v7.copy(p0 = v30)
    val v15: s0 = f16(v30)
    val v14: s0 = v17.p0
    val v45: s2 = f2(v8, v14)
    var v21: s2 = v8
    v7 = v7.copy(p1 = v14)
    val v36: Vector[s0] = v21.p1
    v21 = v45
    val v40: s0 = f16(v14)
    val v61: s0 = v36(1)
    v21 = v21.copy(p0 = v61)
    val v49: Vector[s0] = v45.p1
    var v38: Vector[s0] = v49
    v38 = v38.updated(0, v40)
    v38 = v38.updated(1, v61)
    v7 = v7.copy(p0 = v61)
    var v60: Vector[s0] = v49
    val v124: Vector[Vector[Double]] = v61.p1
    val v56: Vector[Double] = v124(0)
    var v92: s0 = v15
    v21 = v21.copy(p1 = v60)
    v38 = v49
    v21 = v21.copy(p2 = v9)
    v21 = v21.copy(p1 = v38)
    val v138: Double = v56(0)
    val v102: s0 = f16(v14)
    v92 = v102
    v60 = v60.updated(2, v92)
    v60 = v60.updated(0, v102)
    v21 = v21.copy(p1 = v36)
    v21 = v21.copy(p1 = v49)
    val v167: Double = f19(v138, v38)
    v167
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(s2(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0))), Vector(s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0))), s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0)))), Vector(s1(s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0))), s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0)))), s1(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0))), s0(Vector(Vector(28.0), Vector(29.0), Vector(30.0)), Vector(Vector(31.0))))), Vector(s1(s0(Vector(Vector(32.0), Vector(33.0), Vector(34.0)), Vector(Vector(35.0))), s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0)))))), s1(s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0))), s0(Vector(Vector(44.0), Vector(45.0), Vector(46.0)), Vector(Vector(47.0)))))
    val v1: s4 = s4(s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0))), Vector(s0(Vector(Vector(52.0), Vector(53.0), Vector(54.0)), Vector(Vector(55.0))), s0(Vector(Vector(56.0), Vector(57.0), Vector(58.0)), Vector(Vector(59.0)))), Vector(s3(s2(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0))), Vector(s0(Vector(Vector(64.0), Vector(65.0), Vector(66.0)), Vector(Vector(67.0))), s0(Vector(Vector(68.0), Vector(69.0), Vector(70.0)), Vector(Vector(71.0))), s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)), Vector(Vector(75.0)))), Vector(s1(s0(Vector(Vector(76.0), Vector(77.0), Vector(78.0)), Vector(Vector(79.0))), s0(Vector(Vector(80.0), Vector(81.0), Vector(82.0)), Vector(Vector(83.0)))), s1(s0(Vector(Vector(84.0), Vector(85.0), Vector(86.0)), Vector(Vector(87.0))), s0(Vector(Vector(88.0), Vector(89.0), Vector(90.0)), Vector(Vector(91.0))))), Vector(s1(s0(Vector(Vector(92.0), Vector(93.0), Vector(94.0)), Vector(Vector(95.0))), s0(Vector(Vector(96.0), Vector(97.0), Vector(98.0)), Vector(Vector(99.0)))))), s1(s0(Vector(Vector(100.0), Vector(101.0), Vector(102.0)), Vector(Vector(103.0))), s0(Vector(Vector(104.0), Vector(105.0), Vector(106.0)), Vector(Vector(107.0))))), s3(s2(s0(Vector(Vector(108.0), Vector(109.0), Vector(110.0)), Vector(Vector(111.0))), Vector(s0(Vector(Vector(112.0), Vector(113.0), Vector(114.0)), Vector(Vector(115.0))), s0(Vector(Vector(116.0), Vector(117.0), Vector(118.0)), Vector(Vector(119.0))), s0(Vector(Vector(120.0), Vector(121.0), Vector(122.0)), Vector(Vector(123.0)))), Vector(s1(s0(Vector(Vector(124.0), Vector(125.0), Vector(126.0)), Vector(Vector(127.0))), s0(Vector(Vector(128.0), Vector(129.0), Vector(130.0)), Vector(Vector(131.0)))), s1(s0(Vector(Vector(132.0), Vector(133.0), Vector(134.0)), Vector(Vector(135.0))), s0(Vector(Vector(136.0), Vector(137.0), Vector(138.0)), Vector(Vector(139.0))))), Vector(s1(s0(Vector(Vector(140.0), Vector(141.0), Vector(142.0)), Vector(Vector(143.0))), s0(Vector(Vector(144.0), Vector(145.0), Vector(146.0)), Vector(Vector(147.0)))))), s1(s0(Vector(Vector(148.0), Vector(149.0), Vector(150.0)), Vector(Vector(151.0))), s0(Vector(Vector(152.0), Vector(153.0), Vector(154.0)), Vector(Vector(155.0)))))), Vector(s3(s2(s0(Vector(Vector(156.0), Vector(157.0), Vector(158.0)), Vector(Vector(159.0))), Vector(s0(Vector(Vector(160.0), Vector(161.0), Vector(162.0)), Vector(Vector(163.0))), s0(Vector(Vector(164.0), Vector(165.0), Vector(166.0)), Vector(Vector(167.0))), s0(Vector(Vector(168.0), Vector(169.0), Vector(170.0)), Vector(Vector(171.0)))), Vector(s1(s0(Vector(Vector(172.0), Vector(173.0), Vector(174.0)), Vector(Vector(175.0))), s0(Vector(Vector(176.0), Vector(177.0), Vector(178.0)), Vector(Vector(179.0)))), s1(s0(Vector(Vector(180.0), Vector(181.0), Vector(182.0)), Vector(Vector(183.0))), s0(Vector(Vector(184.0), Vector(185.0), Vector(186.0)), Vector(Vector(187.0))))), Vector(s1(s0(Vector(Vector(188.0), Vector(189.0), Vector(190.0)), Vector(Vector(191.0))), s0(Vector(Vector(192.0), Vector(193.0), Vector(194.0)), Vector(Vector(195.0)))))), s1(s0(Vector(Vector(196.0), Vector(197.0), Vector(198.0)), Vector(Vector(199.0))), s0(Vector(Vector(200.0), Vector(201.0), Vector(202.0)), Vector(Vector(203.0))))), s3(s2(s0(Vector(Vector(204.0), Vector(205.0), Vector(206.0)), Vector(Vector(207.0))), Vector(s0(Vector(Vector(208.0), Vector(209.0), Vector(210.0)), Vector(Vector(211.0))), s0(Vector(Vector(212.0), Vector(213.0), Vector(214.0)), Vector(Vector(215.0))), s0(Vector(Vector(216.0), Vector(217.0), Vector(218.0)), Vector(Vector(219.0)))), Vector(s1(s0(Vector(Vector(220.0), Vector(221.0), Vector(222.0)), Vector(Vector(223.0))), s0(Vector(Vector(224.0), Vector(225.0), Vector(226.0)), Vector(Vector(227.0)))), s1(s0(Vector(Vector(228.0), Vector(229.0), Vector(230.0)), Vector(Vector(231.0))), s0(Vector(Vector(232.0), Vector(233.0), Vector(234.0)), Vector(Vector(235.0))))), Vector(s1(s0(Vector(Vector(236.0), Vector(237.0), Vector(238.0)), Vector(Vector(239.0))), s0(Vector(Vector(240.0), Vector(241.0), Vector(242.0)), Vector(Vector(243.0)))))), s1(s0(Vector(Vector(244.0), Vector(245.0), Vector(246.0)), Vector(Vector(247.0))), s0(Vector(Vector(248.0), Vector(249.0), Vector(250.0)), Vector(Vector(251.0)))))), s2(s0(Vector(Vector(252.0), Vector(253.0), Vector(254.0)), Vector(Vector(255.0))), Vector(s0(Vector(Vector(256.0), Vector(257.0), Vector(258.0)), Vector(Vector(259.0))), s0(Vector(Vector(260.0), Vector(261.0), Vector(262.0)), Vector(Vector(263.0))), s0(Vector(Vector(264.0), Vector(265.0), Vector(266.0)), Vector(Vector(267.0)))), Vector(s1(s0(Vector(Vector(268.0), Vector(269.0), Vector(270.0)), Vector(Vector(271.0))), s0(Vector(Vector(272.0), Vector(273.0), Vector(274.0)), Vector(Vector(275.0)))), s1(s0(Vector(Vector(276.0), Vector(277.0), Vector(278.0)), Vector(Vector(279.0))), s0(Vector(Vector(280.0), Vector(281.0), Vector(282.0)), Vector(Vector(283.0))))), Vector(s1(s0(Vector(Vector(284.0), Vector(285.0), Vector(286.0)), Vector(Vector(287.0))), s0(Vector(Vector(288.0), Vector(289.0), Vector(290.0)), Vector(Vector(291.0)))))))
    val v2: Vector[s4] = Vector(s4(s0(Vector(Vector(292.0), Vector(293.0), Vector(294.0)), Vector(Vector(295.0))), Vector(s0(Vector(Vector(296.0), Vector(297.0), Vector(298.0)), Vector(Vector(299.0))), s0(Vector(Vector(300.0), Vector(301.0), Vector(302.0)), Vector(Vector(303.0)))), Vector(s3(s2(s0(Vector(Vector(304.0), Vector(305.0), Vector(306.0)), Vector(Vector(307.0))), Vector(s0(Vector(Vector(308.0), Vector(309.0), Vector(310.0)), Vector(Vector(311.0))), s0(Vector(Vector(312.0), Vector(313.0), Vector(314.0)), Vector(Vector(315.0))), s0(Vector(Vector(316.0), Vector(317.0), Vector(318.0)), Vector(Vector(319.0)))), Vector(s1(s0(Vector(Vector(320.0), Vector(321.0), Vector(322.0)), Vector(Vector(323.0))), s0(Vector(Vector(324.0), Vector(325.0), Vector(326.0)), Vector(Vector(327.0)))), s1(s0(Vector(Vector(328.0), Vector(329.0), Vector(330.0)), Vector(Vector(331.0))), s0(Vector(Vector(332.0), Vector(333.0), Vector(334.0)), Vector(Vector(335.0))))), Vector(s1(s0(Vector(Vector(336.0), Vector(337.0), Vector(338.0)), Vector(Vector(339.0))), s0(Vector(Vector(340.0), Vector(341.0), Vector(342.0)), Vector(Vector(343.0)))))), s1(s0(Vector(Vector(344.0), Vector(345.0), Vector(346.0)), Vector(Vector(347.0))), s0(Vector(Vector(348.0), Vector(349.0), Vector(350.0)), Vector(Vector(351.0))))), s3(s2(s0(Vector(Vector(352.0), Vector(353.0), Vector(354.0)), Vector(Vector(355.0))), Vector(s0(Vector(Vector(356.0), Vector(357.0), Vector(358.0)), Vector(Vector(359.0))), s0(Vector(Vector(360.0), Vector(361.0), Vector(362.0)), Vector(Vector(363.0))), s0(Vector(Vector(364.0), Vector(365.0), Vector(366.0)), Vector(Vector(367.0)))), Vector(s1(s0(Vector(Vector(368.0), Vector(369.0), Vector(370.0)), Vector(Vector(371.0))), s0(Vector(Vector(372.0), Vector(373.0), Vector(374.0)), Vector(Vector(375.0)))), s1(s0(Vector(Vector(376.0), Vector(377.0), Vector(378.0)), Vector(Vector(379.0))), s0(Vector(Vector(380.0), Vector(381.0), Vector(382.0)), Vector(Vector(383.0))))), Vector(s1(s0(Vector(Vector(384.0), Vector(385.0), Vector(386.0)), Vector(Vector(387.0))), s0(Vector(Vector(388.0), Vector(389.0), Vector(390.0)), Vector(Vector(391.0)))))), s1(s0(Vector(Vector(392.0), Vector(393.0), Vector(394.0)), Vector(Vector(395.0))), s0(Vector(Vector(396.0), Vector(397.0), Vector(398.0)), Vector(Vector(399.0)))))), Vector(s3(s2(s0(Vector(Vector(400.0), Vector(401.0), Vector(402.0)), Vector(Vector(403.0))), Vector(s0(Vector(Vector(404.0), Vector(405.0), Vector(406.0)), Vector(Vector(407.0))), s0(Vector(Vector(408.0), Vector(409.0), Vector(410.0)), Vector(Vector(411.0))), s0(Vector(Vector(412.0), Vector(413.0), Vector(414.0)), Vector(Vector(415.0)))), Vector(s1(s0(Vector(Vector(416.0), Vector(417.0), Vector(418.0)), Vector(Vector(419.0))), s0(Vector(Vector(420.0), Vector(421.0), Vector(422.0)), Vector(Vector(423.0)))), s1(s0(Vector(Vector(424.0), Vector(425.0), Vector(426.0)), Vector(Vector(427.0))), s0(Vector(Vector(428.0), Vector(429.0), Vector(430.0)), Vector(Vector(431.0))))), Vector(s1(s0(Vector(Vector(432.0), Vector(433.0), Vector(434.0)), Vector(Vector(435.0))), s0(Vector(Vector(436.0), Vector(437.0), Vector(438.0)), Vector(Vector(439.0)))))), s1(s0(Vector(Vector(440.0), Vector(441.0), Vector(442.0)), Vector(Vector(443.0))), s0(Vector(Vector(444.0), Vector(445.0), Vector(446.0)), Vector(Vector(447.0))))), s3(s2(s0(Vector(Vector(448.0), Vector(449.0), Vector(450.0)), Vector(Vector(451.0))), Vector(s0(Vector(Vector(452.0), Vector(453.0), Vector(454.0)), Vector(Vector(455.0))), s0(Vector(Vector(456.0), Vector(457.0), Vector(458.0)), Vector(Vector(459.0))), s0(Vector(Vector(460.0), Vector(461.0), Vector(462.0)), Vector(Vector(463.0)))), Vector(s1(s0(Vector(Vector(464.0), Vector(465.0), Vector(466.0)), Vector(Vector(467.0))), s0(Vector(Vector(468.0), Vector(469.0), Vector(470.0)), Vector(Vector(471.0)))), s1(s0(Vector(Vector(472.0), Vector(473.0), Vector(474.0)), Vector(Vector(475.0))), s0(Vector(Vector(476.0), Vector(477.0), Vector(478.0)), Vector(Vector(479.0))))), Vector(s1(s0(Vector(Vector(480.0), Vector(481.0), Vector(482.0)), Vector(Vector(483.0))), s0(Vector(Vector(484.0), Vector(485.0), Vector(486.0)), Vector(Vector(487.0)))))), s1(s0(Vector(Vector(488.0), Vector(489.0), Vector(490.0)), Vector(Vector(491.0))), s0(Vector(Vector(492.0), Vector(493.0), Vector(494.0)), Vector(Vector(495.0)))))), s2(s0(Vector(Vector(496.0), Vector(497.0), Vector(498.0)), Vector(Vector(499.0))), Vector(s0(Vector(Vector(500.0), Vector(501.0), Vector(502.0)), Vector(Vector(503.0))), s0(Vector(Vector(504.0), Vector(505.0), Vector(506.0)), Vector(Vector(507.0))), s0(Vector(Vector(508.0), Vector(509.0), Vector(510.0)), Vector(Vector(511.0)))), Vector(s1(s0(Vector(Vector(512.0), Vector(513.0), Vector(514.0)), Vector(Vector(515.0))), s0(Vector(Vector(516.0), Vector(517.0), Vector(518.0)), Vector(Vector(519.0)))), s1(s0(Vector(Vector(520.0), Vector(521.0), Vector(522.0)), Vector(Vector(523.0))), s0(Vector(Vector(524.0), Vector(525.0), Vector(526.0)), Vector(Vector(527.0))))), Vector(s1(s0(Vector(Vector(528.0), Vector(529.0), Vector(530.0)), Vector(Vector(531.0))), s0(Vector(Vector(532.0), Vector(533.0), Vector(534.0)), Vector(Vector(535.0))))))), s4(s0(Vector(Vector(536.0), Vector(537.0), Vector(538.0)), Vector(Vector(539.0))), Vector(s0(Vector(Vector(540.0), Vector(541.0), Vector(542.0)), Vector(Vector(543.0))), s0(Vector(Vector(544.0), Vector(545.0), Vector(546.0)), Vector(Vector(547.0)))), Vector(s3(s2(s0(Vector(Vector(548.0), Vector(549.0), Vector(550.0)), Vector(Vector(551.0))), Vector(s0(Vector(Vector(552.0), Vector(553.0), Vector(554.0)), Vector(Vector(555.0))), s0(Vector(Vector(556.0), Vector(557.0), Vector(558.0)), Vector(Vector(559.0))), s0(Vector(Vector(560.0), Vector(561.0), Vector(562.0)), Vector(Vector(563.0)))), Vector(s1(s0(Vector(Vector(564.0), Vector(565.0), Vector(566.0)), Vector(Vector(567.0))), s0(Vector(Vector(568.0), Vector(569.0), Vector(570.0)), Vector(Vector(571.0)))), s1(s0(Vector(Vector(572.0), Vector(573.0), Vector(574.0)), Vector(Vector(575.0))), s0(Vector(Vector(576.0), Vector(577.0), Vector(578.0)), Vector(Vector(579.0))))), Vector(s1(s0(Vector(Vector(580.0), Vector(581.0), Vector(582.0)), Vector(Vector(583.0))), s0(Vector(Vector(584.0), Vector(585.0), Vector(586.0)), Vector(Vector(587.0)))))), s1(s0(Vector(Vector(588.0), Vector(589.0), Vector(590.0)), Vector(Vector(591.0))), s0(Vector(Vector(592.0), Vector(593.0), Vector(594.0)), Vector(Vector(595.0))))), s3(s2(s0(Vector(Vector(596.0), Vector(597.0), Vector(598.0)), Vector(Vector(599.0))), Vector(s0(Vector(Vector(600.0), Vector(601.0), Vector(602.0)), Vector(Vector(603.0))), s0(Vector(Vector(604.0), Vector(605.0), Vector(606.0)), Vector(Vector(607.0))), s0(Vector(Vector(608.0), Vector(609.0), Vector(610.0)), Vector(Vector(611.0)))), Vector(s1(s0(Vector(Vector(612.0), Vector(613.0), Vector(614.0)), Vector(Vector(615.0))), s0(Vector(Vector(616.0), Vector(617.0), Vector(618.0)), Vector(Vector(619.0)))), s1(s0(Vector(Vector(620.0), Vector(621.0), Vector(622.0)), Vector(Vector(623.0))), s0(Vector(Vector(624.0), Vector(625.0), Vector(626.0)), Vector(Vector(627.0))))), Vector(s1(s0(Vector(Vector(628.0), Vector(629.0), Vector(630.0)), Vector(Vector(631.0))), s0(Vector(Vector(632.0), Vector(633.0), Vector(634.0)), Vector(Vector(635.0)))))), s1(s0(Vector(Vector(636.0), Vector(637.0), Vector(638.0)), Vector(Vector(639.0))), s0(Vector(Vector(640.0), Vector(641.0), Vector(642.0)), Vector(Vector(643.0)))))), Vector(s3(s2(s0(Vector(Vector(644.0), Vector(645.0), Vector(646.0)), Vector(Vector(647.0))), Vector(s0(Vector(Vector(648.0), Vector(649.0), Vector(650.0)), Vector(Vector(651.0))), s0(Vector(Vector(652.0), Vector(653.0), Vector(654.0)), Vector(Vector(655.0))), s0(Vector(Vector(656.0), Vector(657.0), Vector(658.0)), Vector(Vector(659.0)))), Vector(s1(s0(Vector(Vector(660.0), Vector(661.0), Vector(662.0)), Vector(Vector(663.0))), s0(Vector(Vector(664.0), Vector(665.0), Vector(666.0)), Vector(Vector(667.0)))), s1(s0(Vector(Vector(668.0), Vector(669.0), Vector(670.0)), Vector(Vector(671.0))), s0(Vector(Vector(672.0), Vector(673.0), Vector(674.0)), Vector(Vector(675.0))))), Vector(s1(s0(Vector(Vector(676.0), Vector(677.0), Vector(678.0)), Vector(Vector(679.0))), s0(Vector(Vector(680.0), Vector(681.0), Vector(682.0)), Vector(Vector(683.0)))))), s1(s0(Vector(Vector(684.0), Vector(685.0), Vector(686.0)), Vector(Vector(687.0))), s0(Vector(Vector(688.0), Vector(689.0), Vector(690.0)), Vector(Vector(691.0))))), s3(s2(s0(Vector(Vector(692.0), Vector(693.0), Vector(694.0)), Vector(Vector(695.0))), Vector(s0(Vector(Vector(696.0), Vector(697.0), Vector(698.0)), Vector(Vector(699.0))), s0(Vector(Vector(700.0), Vector(701.0), Vector(702.0)), Vector(Vector(703.0))), s0(Vector(Vector(704.0), Vector(705.0), Vector(706.0)), Vector(Vector(707.0)))), Vector(s1(s0(Vector(Vector(708.0), Vector(709.0), Vector(710.0)), Vector(Vector(711.0))), s0(Vector(Vector(712.0), Vector(713.0), Vector(714.0)), Vector(Vector(715.0)))), s1(s0(Vector(Vector(716.0), Vector(717.0), Vector(718.0)), Vector(Vector(719.0))), s0(Vector(Vector(720.0), Vector(721.0), Vector(722.0)), Vector(Vector(723.0))))), Vector(s1(s0(Vector(Vector(724.0), Vector(725.0), Vector(726.0)), Vector(Vector(727.0))), s0(Vector(Vector(728.0), Vector(729.0), Vector(730.0)), Vector(Vector(731.0)))))), s1(s0(Vector(Vector(732.0), Vector(733.0), Vector(734.0)), Vector(Vector(735.0))), s0(Vector(Vector(736.0), Vector(737.0), Vector(738.0)), Vector(Vector(739.0)))))), s2(s0(Vector(Vector(740.0), Vector(741.0), Vector(742.0)), Vector(Vector(743.0))), Vector(s0(Vector(Vector(744.0), Vector(745.0), Vector(746.0)), Vector(Vector(747.0))), s0(Vector(Vector(748.0), Vector(749.0), Vector(750.0)), Vector(Vector(751.0))), s0(Vector(Vector(752.0), Vector(753.0), Vector(754.0)), Vector(Vector(755.0)))), Vector(s1(s0(Vector(Vector(756.0), Vector(757.0), Vector(758.0)), Vector(Vector(759.0))), s0(Vector(Vector(760.0), Vector(761.0), Vector(762.0)), Vector(Vector(763.0)))), s1(s0(Vector(Vector(764.0), Vector(765.0), Vector(766.0)), Vector(Vector(767.0))), s0(Vector(Vector(768.0), Vector(769.0), Vector(770.0)), Vector(Vector(771.0))))), Vector(s1(s0(Vector(Vector(772.0), Vector(773.0), Vector(774.0)), Vector(Vector(775.0))), s0(Vector(Vector(776.0), Vector(777.0), Vector(778.0)), Vector(Vector(779.0))))))), s4(s0(Vector(Vector(780.0), Vector(781.0), Vector(782.0)), Vector(Vector(783.0))), Vector(s0(Vector(Vector(784.0), Vector(785.0), Vector(786.0)), Vector(Vector(787.0))), s0(Vector(Vector(788.0), Vector(789.0), Vector(790.0)), Vector(Vector(791.0)))), Vector(s3(s2(s0(Vector(Vector(792.0), Vector(793.0), Vector(794.0)), Vector(Vector(795.0))), Vector(s0(Vector(Vector(796.0), Vector(797.0), Vector(798.0)), Vector(Vector(799.0))), s0(Vector(Vector(800.0), Vector(801.0), Vector(802.0)), Vector(Vector(803.0))), s0(Vector(Vector(804.0), Vector(805.0), Vector(806.0)), Vector(Vector(807.0)))), Vector(s1(s0(Vector(Vector(808.0), Vector(809.0), Vector(810.0)), Vector(Vector(811.0))), s0(Vector(Vector(812.0), Vector(813.0), Vector(814.0)), Vector(Vector(815.0)))), s1(s0(Vector(Vector(816.0), Vector(817.0), Vector(818.0)), Vector(Vector(819.0))), s0(Vector(Vector(820.0), Vector(821.0), Vector(822.0)), Vector(Vector(823.0))))), Vector(s1(s0(Vector(Vector(824.0), Vector(825.0), Vector(826.0)), Vector(Vector(827.0))), s0(Vector(Vector(828.0), Vector(829.0), Vector(830.0)), Vector(Vector(831.0)))))), s1(s0(Vector(Vector(832.0), Vector(833.0), Vector(834.0)), Vector(Vector(835.0))), s0(Vector(Vector(836.0), Vector(837.0), Vector(838.0)), Vector(Vector(839.0))))), s3(s2(s0(Vector(Vector(840.0), Vector(841.0), Vector(842.0)), Vector(Vector(843.0))), Vector(s0(Vector(Vector(844.0), Vector(845.0), Vector(846.0)), Vector(Vector(847.0))), s0(Vector(Vector(848.0), Vector(849.0), Vector(850.0)), Vector(Vector(851.0))), s0(Vector(Vector(852.0), Vector(853.0), Vector(854.0)), Vector(Vector(855.0)))), Vector(s1(s0(Vector(Vector(856.0), Vector(857.0), Vector(858.0)), Vector(Vector(859.0))), s0(Vector(Vector(860.0), Vector(861.0), Vector(862.0)), Vector(Vector(863.0)))), s1(s0(Vector(Vector(864.0), Vector(865.0), Vector(866.0)), Vector(Vector(867.0))), s0(Vector(Vector(868.0), Vector(869.0), Vector(870.0)), Vector(Vector(871.0))))), Vector(s1(s0(Vector(Vector(872.0), Vector(873.0), Vector(874.0)), Vector(Vector(875.0))), s0(Vector(Vector(876.0), Vector(877.0), Vector(878.0)), Vector(Vector(879.0)))))), s1(s0(Vector(Vector(880.0), Vector(881.0), Vector(882.0)), Vector(Vector(883.0))), s0(Vector(Vector(884.0), Vector(885.0), Vector(886.0)), Vector(Vector(887.0)))))), Vector(s3(s2(s0(Vector(Vector(888.0), Vector(889.0), Vector(890.0)), Vector(Vector(891.0))), Vector(s0(Vector(Vector(892.0), Vector(893.0), Vector(894.0)), Vector(Vector(895.0))), s0(Vector(Vector(896.0), Vector(897.0), Vector(898.0)), Vector(Vector(899.0))), s0(Vector(Vector(900.0), Vector(901.0), Vector(902.0)), Vector(Vector(903.0)))), Vector(s1(s0(Vector(Vector(904.0), Vector(905.0), Vector(906.0)), Vector(Vector(907.0))), s0(Vector(Vector(908.0), Vector(909.0), Vector(910.0)), Vector(Vector(911.0)))), s1(s0(Vector(Vector(912.0), Vector(913.0), Vector(914.0)), Vector(Vector(915.0))), s0(Vector(Vector(916.0), Vector(917.0), Vector(918.0)), Vector(Vector(919.0))))), Vector(s1(s0(Vector(Vector(920.0), Vector(921.0), Vector(922.0)), Vector(Vector(923.0))), s0(Vector(Vector(924.0), Vector(925.0), Vector(926.0)), Vector(Vector(927.0)))))), s1(s0(Vector(Vector(928.0), Vector(929.0), Vector(930.0)), Vector(Vector(931.0))), s0(Vector(Vector(932.0), Vector(933.0), Vector(934.0)), Vector(Vector(935.0))))), s3(s2(s0(Vector(Vector(936.0), Vector(937.0), Vector(938.0)), Vector(Vector(939.0))), Vector(s0(Vector(Vector(940.0), Vector(941.0), Vector(942.0)), Vector(Vector(943.0))), s0(Vector(Vector(944.0), Vector(945.0), Vector(946.0)), Vector(Vector(947.0))), s0(Vector(Vector(948.0), Vector(949.0), Vector(950.0)), Vector(Vector(951.0)))), Vector(s1(s0(Vector(Vector(952.0), Vector(953.0), Vector(954.0)), Vector(Vector(955.0))), s0(Vector(Vector(956.0), Vector(957.0), Vector(958.0)), Vector(Vector(959.0)))), s1(s0(Vector(Vector(960.0), Vector(961.0), Vector(962.0)), Vector(Vector(963.0))), s0(Vector(Vector(964.0), Vector(965.0), Vector(966.0)), Vector(Vector(967.0))))), Vector(s1(s0(Vector(Vector(968.0), Vector(969.0), Vector(970.0)), Vector(Vector(971.0))), s0(Vector(Vector(972.0), Vector(973.0), Vector(974.0)), Vector(Vector(975.0)))))), s1(s0(Vector(Vector(976.0), Vector(977.0), Vector(978.0)), Vector(Vector(979.0))), s0(Vector(Vector(980.0), Vector(981.0), Vector(982.0)), Vector(Vector(983.0)))))), s2(s0(Vector(Vector(984.0), Vector(985.0), Vector(986.0)), Vector(Vector(987.0))), Vector(s0(Vector(Vector(988.0), Vector(989.0), Vector(990.0)), Vector(Vector(991.0))), s0(Vector(Vector(992.0), Vector(993.0), Vector(994.0)), Vector(Vector(995.0))), s0(Vector(Vector(996.0), Vector(997.0), Vector(998.0)), Vector(Vector(999.0)))), Vector(s1(s0(Vector(Vector(1000.0), Vector(1001.0), Vector(1002.0)), Vector(Vector(1003.0))), s0(Vector(Vector(1004.0), Vector(1005.0), Vector(1006.0)), Vector(Vector(1007.0)))), s1(s0(Vector(Vector(1008.0), Vector(1009.0), Vector(1010.0)), Vector(Vector(1011.0))), s0(Vector(Vector(1012.0), Vector(1013.0), Vector(1014.0)), Vector(Vector(1015.0))))), Vector(s1(s0(Vector(Vector(1016.0), Vector(1017.0), Vector(1018.0)), Vector(Vector(1019.0))), s0(Vector(Vector(1020.0), Vector(1021.0), Vector(1022.0)), Vector(Vector(1023.0))))))))
    val v3: s1 = s1(s0(Vector(Vector(1024.0), Vector(1025.0), Vector(1026.0)), Vector(Vector(1027.0))), s0(Vector(Vector(1028.0), Vector(1029.0), Vector(1030.0)), Vector(Vector(1031.0))))
    val v4: Vector[Vector[s3]] = Vector(Vector(s3(s2(s0(Vector(Vector(1032.0), Vector(1033.0), Vector(1034.0)), Vector(Vector(1035.0))), Vector(s0(Vector(Vector(1036.0), Vector(1037.0), Vector(1038.0)), Vector(Vector(1039.0))), s0(Vector(Vector(1040.0), Vector(1041.0), Vector(1042.0)), Vector(Vector(1043.0))), s0(Vector(Vector(1044.0), Vector(1045.0), Vector(1046.0)), Vector(Vector(1047.0)))), Vector(s1(s0(Vector(Vector(1048.0), Vector(1049.0), Vector(1050.0)), Vector(Vector(1051.0))), s0(Vector(Vector(1052.0), Vector(1053.0), Vector(1054.0)), Vector(Vector(1055.0)))), s1(s0(Vector(Vector(1056.0), Vector(1057.0), Vector(1058.0)), Vector(Vector(1059.0))), s0(Vector(Vector(1060.0), Vector(1061.0), Vector(1062.0)), Vector(Vector(1063.0))))), Vector(s1(s0(Vector(Vector(1064.0), Vector(1065.0), Vector(1066.0)), Vector(Vector(1067.0))), s0(Vector(Vector(1068.0), Vector(1069.0), Vector(1070.0)), Vector(Vector(1071.0)))))), s1(s0(Vector(Vector(1072.0), Vector(1073.0), Vector(1074.0)), Vector(Vector(1075.0))), s0(Vector(Vector(1076.0), Vector(1077.0), Vector(1078.0)), Vector(Vector(1079.0)))))), Vector(s3(s2(s0(Vector(Vector(1080.0), Vector(1081.0), Vector(1082.0)), Vector(Vector(1083.0))), Vector(s0(Vector(Vector(1084.0), Vector(1085.0), Vector(1086.0)), Vector(Vector(1087.0))), s0(Vector(Vector(1088.0), Vector(1089.0), Vector(1090.0)), Vector(Vector(1091.0))), s0(Vector(Vector(1092.0), Vector(1093.0), Vector(1094.0)), Vector(Vector(1095.0)))), Vector(s1(s0(Vector(Vector(1096.0), Vector(1097.0), Vector(1098.0)), Vector(Vector(1099.0))), s0(Vector(Vector(1100.0), Vector(1101.0), Vector(1102.0)), Vector(Vector(1103.0)))), s1(s0(Vector(Vector(1104.0), Vector(1105.0), Vector(1106.0)), Vector(Vector(1107.0))), s0(Vector(Vector(1108.0), Vector(1109.0), Vector(1110.0)), Vector(Vector(1111.0))))), Vector(s1(s0(Vector(Vector(1112.0), Vector(1113.0), Vector(1114.0)), Vector(Vector(1115.0))), s0(Vector(Vector(1116.0), Vector(1117.0), Vector(1118.0)), Vector(Vector(1119.0)))))), s1(s0(Vector(Vector(1120.0), Vector(1121.0), Vector(1122.0)), Vector(Vector(1123.0))), s0(Vector(Vector(1124.0), Vector(1125.0), Vector(1126.0)), Vector(Vector(1127.0)))))), Vector(s3(s2(s0(Vector(Vector(1128.0), Vector(1129.0), Vector(1130.0)), Vector(Vector(1131.0))), Vector(s0(Vector(Vector(1132.0), Vector(1133.0), Vector(1134.0)), Vector(Vector(1135.0))), s0(Vector(Vector(1136.0), Vector(1137.0), Vector(1138.0)), Vector(Vector(1139.0))), s0(Vector(Vector(1140.0), Vector(1141.0), Vector(1142.0)), Vector(Vector(1143.0)))), Vector(s1(s0(Vector(Vector(1144.0), Vector(1145.0), Vector(1146.0)), Vector(Vector(1147.0))), s0(Vector(Vector(1148.0), Vector(1149.0), Vector(1150.0)), Vector(Vector(1151.0)))), s1(s0(Vector(Vector(1152.0), Vector(1153.0), Vector(1154.0)), Vector(Vector(1155.0))), s0(Vector(Vector(1156.0), Vector(1157.0), Vector(1158.0)), Vector(Vector(1159.0))))), Vector(s1(s0(Vector(Vector(1160.0), Vector(1161.0), Vector(1162.0)), Vector(Vector(1163.0))), s0(Vector(Vector(1164.0), Vector(1165.0), Vector(1166.0)), Vector(Vector(1167.0)))))), s1(s0(Vector(Vector(1168.0), Vector(1169.0), Vector(1170.0)), Vector(Vector(1171.0))), s0(Vector(Vector(1172.0), Vector(1173.0), Vector(1174.0)), Vector(Vector(1175.0)))))))
    val v5: Double = 1176.0
    val start = nanoTime()
    var result: Double = 1176.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4, v5)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}