import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Double],
    p3: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0,
    p2: s0
  )
  case class s2 (
    p0: s1,
    p1: Vector[s0]
  )
  case class s3 (
    p0: Vector[s2],
    p1: Vector[Vector[s2]]
  )
  case class s4 (
    p0: Vector[s3],
    p1: Vector[Vector[s2]],
    p2: Vector[s0]
  )
  case class s5 (
    p0: s0,
    p1: Vector[s1]
  )
  case class s6 (
    p0: s0,
    p1: s4
  )
  case class s7 (
    p0: s5,
    p1: s6,
    p2: Vector[s1],
    p3: Vector[s0],
    p4: s1,
    p5: Vector[Vector[s5]]
  )
  def f39(v0: s1): s1 = {
    var v4: s1 = v0
    val v6: Vector[s0] = v4.p0
    val v5: s0 = v6(0)
    val v7: Vector[Vector[Double]] = v5.p1
    v4 = v0
    var v2: s0 = v5
    v4 = v4.copy(p0 = v6)
    val v1: s0 = v4.p1
    val v10: Vector[Vector[Double]] = v2.p3
    var v17: Vector[Vector[Double]] = v7
    v4 = v4.copy(p2 = v1)
    var v18: Vector[s0] = v6
    var v15: s0 = v5
    v15 = v15.copy(p1 = v17)
    val v19: Vector[s0] = v0.p0
    val v35: Vector[Double] = v1.p2
    v15 = v15.copy(p3 = v10)
    v18 = v19
    v4 = v4.copy(p0 = v18)
    val v21: s0 = v4.p1
    val v27: Vector[Vector[Double]] = v21.p1
    v2 = v5
    var v24: s1 = v4
    val v52: s0 = v4.p2
    var v39: s0 = v15
    var v49: Vector[Double] = v35
    v39 = v39.copy(p1 = v27)
    v24 = v24.copy(p1 = v39)
    v2 = v2.copy(p2 = v49)
    v4 = v4.copy(p2 = v52)
    v24
  }
  def f37(v0: s7, v1: s4): s7 = {
    var v4: s4 = v1
    val v7: Vector[Vector[s5]] = v0.p5
    val v9: Vector[s1] = v0.p2
    var v5: s7 = v0
    var v10: s7 = v5
    val v16: Vector[Vector[s5]] = v5.p5
    val v22: Vector[s1] = v0.p2
    v10 = v10.copy(p5 = v16)
    val v23: Vector[s0] = v4.p2
    val v14: Vector[s5] = v7(1)
    val v13: s5 = v14(0)
    val v29: s0 = v23(0)
    val v24: s0 = v13.p0
    v10 = v10.copy(p2 = v22)
    var v46: s7 = v10
    var v51: s0 = v29
    v4 = v4.copy(p2 = v23)
    val v76: Vector[s0] = Vector(v24, v51)
    v5 = v5.copy(p2 = v9)
    v46 = v46.copy(p3 = v76)
    v5 = v46
    v46
  }
  def f34(v0: s0): s0 = {
    v0
  }
  def f24(v0: s1): s1 = {
    var v4: s1 = v0
    val v3: Vector[s0] = v4.p0
    val v8: s0 = v4.p1
    val v6: s1 = f39(v0)
    v4 = v4.copy(p1 = v8)
    var v1: Vector[s0] = v3
    val v2: s0 = f34(v8)
    var v9: s0 = v8
    v4 = v4.copy(p2 = v2)
    val v12: Vector[s0] = Vector(v8)
    v1 = v1.updated(0, v9)
    val v16: s0 = v1(0)
    val v18: s0 = v12(0)
    v4 = v4.copy(p0 = v1)
    val v14: Vector[Vector[Double]] = v2.p3
    val v20: Vector[Vector[Double]] = v2.p1
    val v25: s0 = v3(0)
    val v58: Vector[Double] = v20(1)
    var v17: Vector[Vector[Double]] = v14
    val v27: s1 = s1(v1, v16, v25)
    val v79: Vector[Double] = v9.p2
    val v34: Vector[Double] = v20(1)
    v9 = v9.copy(p1 = v20)
    v4 = v4.copy(p2 = v2)
    var v56: Vector[s0] = v12
    val v37: s0 = v6.p1
    v9 = v9.copy(p2 = v79)
    v4 = v4.copy(p0 = v56)
    v9 = v9.copy(p3 = v14)
    v17 = v17.updated(2, v58)
    val v76: s0 = v0.p2
    v4 = v4.copy(p2 = v76)
    v17 = v17.updated(1, v34)
    var v89: Vector[Vector[Double]] = v17
    val v29: Vector[Vector[Double]] = v16.p0
    v9 = v9.copy(p3 = v89)
    var v70: Vector[Vector[Double]] = v29
    v56 = v56.updated(0, v18)
    v56 = v56.updated(0, v37)
    v9 = v9.copy(p0 = v70)
    v27
  }
  def f23(v0: s7): s7 = {
    v0
  }
  def f21(v0: s0): s0 = {
    val v2: Vector[Vector[Double]] = v0.p0
    var v6: Vector[Vector[Double]] = v2
    var v4: Vector[Vector[Double]] = v6
    var v5: s0 = v0
    val v7: Vector[Double] = v6(0)
    val v3: Vector[Vector[Double]] = v5.p1
    var v11: Vector[Vector[Double]] = v3
    var v8: Vector[Vector[Double]] = v3
    val v19: Vector[Double] = v5.p2
    val v10: Vector[Vector[Double]] = v5.p3
    v4 = v4.updated(0, v7)
    val v15: s0 = s0(v4, v3, v19, v10)
    val v14: Vector[Double] = v5.p2
    v5 = v5.copy(p1 = v11)
    val v12: s0 = f34(v0)
    v5 = v5.copy(p2 = v19)
    val v20: s0 = f34(v0)
    val v22: s0 = f34(v12)
    v5 = v5.copy(p3 = v10)
    val v59: Vector[Vector[Double]] = v5.p1
    v5 = v5.copy(p2 = v19)
    v4 = v4.updated(0, v7)
    var v27: Vector[Vector[Double]] = v59
    val v21: s0 = f34(v12)
    v5 = v5.copy(p0 = v2)
    val v30: s0 = f34(v0)
    val v32: Double = v14(1)
    v8 = v8.updated(0, v7)
    val v36: Vector[Vector[Double]] = v12.p3
    v4 = v4.updated(0, v7)
    val v18: s0 = f34(v22)
    v5 = v5.copy(p2 = v14)
    val v24: s0 = f34(v12)
    val v40: s0 = f34(v20)
    val v34: Vector[Double] = v36(0)
    val v38: Vector[Double] = v10(2)
    var v54: Vector[Double] = v34
    val v29: Vector[Vector[Double]] = v21.p1
    val v43: s0 = f34(v15)
    v8 = v8.updated(0, v34)
    val v52: Double = v34(0)
    v6 = v6.updated(0, v38)
    v11 = v59
    v54 = v54.updated(0, v32)
    val v35: s0 = s0(v2, v59, v19, v10)
    val v33: Double = v52 * v32
    val v31: Vector[Vector[Double]] = v24.p3
    val v64: Vector[Vector[Double]] = v43.p0
    val v108: s0 = f34(v15)
    val v146: Vector[Double] = v22.p2
    v8 = v8.updated(0, v34)
    v5 = v5.copy(p3 = v10)
    val v91: Vector[Double] = v10(1)
    v8 = v8.updated(1, v54)
    val v70: Vector[Double] = v8(0)
    var v73: Double = v33
    v8 = v8.updated(1, v91)
    v54 = v54.updated(0, v73)
    v5 = v5.copy(p1 = v27)
    v5 = v5.copy(p3 = v31)
    v5 = v5.copy(p2 = v146)
    v4 = v4.updated(0, v7)
    val v84: s0 = f34(v40)
    v27 = v27.updated(1, v70)
    v5 = v5.copy(p0 = v64)
    v27 = v27.updated(1, v34)
    val v87: s0 = f34(v0)
    v11 = v11.updated(1, v34)
    val v98: s0 = f34(v43)
    val v191: Vector[s0] = Vector(v35, v98, v18, v21, v108, v87, v30)
    v27 = v27.updated(0, v7)
    v5 = v5.copy(p0 = v4)
    var v132: Vector[s0] = v191
    val v134: s0 = v132(0)
    v27 = v27.updated(0, v7)
    v5 = v5.copy(p1 = v29)
    v54 = v54.updated(0, v32)
    v132 = v132.updated(5, v84)
    v134
  }
  def f18(v0: s4): s4 = {
    var v4: s4 = v0
    val v3: Vector[Vector[s2]] = v4.p1
    v4 = v4.copy(p1 = v3)
    v4 = v0
    val v1: Vector[s0] = v4.p2
    val v11: s0 = v1(0)
    val v12: Vector[Vector[s2]] = v0.p1
    v4 = v4.copy(p1 = v12)
    val v19: Vector[s2] = v12(1)
    v4 = v4.copy(p1 = v12)
    v4 = v4.copy(p1 = v12)
    var v31: Vector[s2] = v19
    v4 = v4.copy(p1 = v12)
    val v33: s2 = v31(0)
    val v34: s0 = f34(v11)
    val v100: Vector[Vector[s2]] = v0.p1
    val v64: s6 = s6(v34, v0)
    val v157: s1 = v33.p0
    val v117: Vector[s0] = v157.p0
    var v91: s6 = v64
    v4 = v4.copy(p1 = v100)
    val v84: s4 = v91.p1
    v4 = v4.copy(p1 = v100)
    v91 = v91.copy(p1 = v84)
    v4 = v4.copy(p2 = v117)
    val v126: s4 = v91.p1
    v126
  }
  def f7(v0: Double): Double = {
    var v4: Double = v0
    var v5: Double = v4
    var v3: Double = v4
    var v11: Double = v3
    var v15: Double = v11
    var v19: Double = v15
    var v10: Double = v11
    val v17: Vector[Double] = Vector(v19, v5, v0, v10, v0)
    var v23: Vector[Double] = v17
    val v20: Vector[Vector[Double]] = Vector(v17, v23, v23)
    val v24: Vector[Double] = v20(1)
    val v61: Vector[Double] = v20(1)
    val v58: Double = v24(3)
    var v63: Vector[Double] = v61
    val v47: Double = v63(4)
    v63 = v63.updated(1, v58)
    v47
  }
  @noinline
  def f0(v0: Vector[s7], v1: Double): Double = {
    var v4: Vector[s7] = v0
    var v6: Double = v1
    val v3: Double = f7(v1)
    val v7: Double = f7(v6)
    v6 = v3
    val v8: s7 = v0(0)
    var v10: s7 = v8
    var v19: Vector[s7] = v0
    v19 = v19.updated(0, v10)
    val v9: s7 = f23(v8)
    val v18: s1 = v10.p4
    val v15: s6 = v9.p1
    val v12: s7 = v4(0)
    val v21: s7 = v4(0)
    var v17: s1 = v18
    val v14: s1 = f39(v18)
    val v24: s7 = v4(0)
    val v28: s1 = f24(v14)
    val v22: s4 = v15.p1
    val v50: s4 = v15.p1
    val v36: Vector[s0] = v28.p0
    val v62: Vector[s0] = v50.p2
    val v33: s4 = f18(v22)
    v10 = v10.copy(p1 = v15)
    v4 = v4.updated(0, v10)
    var v30: s7 = v21
    v17 = v17.copy(p0 = v62)
    var v31: s1 = v14
    val v34: s4 = v15.p1
    var v75: Vector[s7] = v19
    val v37: s7 = v4(0)
    v19 = v19.updated(0, v24)
    v30 = v30.copy(p1 = v15)
    v19 = v19.updated(0, v21)
    v75 = v75.updated(0, v37)
    v75 = v75.updated(0, v30)
    val v64: s0 = v31.p2
    v19 = v19.updated(0, v37)
    v4 = v75
    val v58: s0 = f21(v64)
    v17 = v17.copy(p1 = v58)
    val v54: s0 = v17.p1
    val v110: Double = v7 + v6
    val v82: Vector[Vector[Double]] = v54.p0
    var v102: Vector[Vector[Double]] = v82
    var v93: s4 = v33
    v17 = v17.copy(p2 = v64)
    val v73: Vector[Double] = v102(0)
    v31 = v31.copy(p0 = v36)
    val v40: s7 = f23(v12)
    val v48: Double = v73(0)
    val v77: s7 = f37(v40, v34)
    v4 = v4.updated(0, v30)
    v4 = v4.updated(0, v30)
    val v119: Double = v110 * v48
    val v236: s7 = f37(v9, v93)
    v10 = v77
    val v153: s7 = v0(0)
    var v117: Vector[s7] = v4
    v19 = v117
    v4 = v4.updated(0, v236)
    v10 = v153
    v119
  }
  def benchmark(): Unit = {
    val v0: Vector[s7] = Vector(s7(s5(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0)), Vector(3.0, 4.0, 5.0), Vector(Vector(6.0), Vector(7.0), Vector(8.0))), Vector(s1(Vector(s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0)), Vector(12.0, 13.0, 14.0), Vector(Vector(15.0), Vector(16.0), Vector(17.0)))), s0(Vector(Vector(18.0)), Vector(Vector(19.0), Vector(20.0)), Vector(21.0, 22.0, 23.0), Vector(Vector(24.0), Vector(25.0), Vector(26.0))), s0(Vector(Vector(27.0)), Vector(Vector(28.0), Vector(29.0)), Vector(30.0, 31.0, 32.0), Vector(Vector(33.0), Vector(34.0), Vector(35.0)))), s1(Vector(s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0)), Vector(39.0, 40.0, 41.0), Vector(Vector(42.0), Vector(43.0), Vector(44.0)))), s0(Vector(Vector(45.0)), Vector(Vector(46.0), Vector(47.0)), Vector(48.0, 49.0, 50.0), Vector(Vector(51.0), Vector(52.0), Vector(53.0))), s0(Vector(Vector(54.0)), Vector(Vector(55.0), Vector(56.0)), Vector(57.0, 58.0, 59.0), Vector(Vector(60.0), Vector(61.0), Vector(62.0)))), s1(Vector(s0(Vector(Vector(63.0)), Vector(Vector(64.0), Vector(65.0)), Vector(66.0, 67.0, 68.0), Vector(Vector(69.0), Vector(70.0), Vector(71.0)))), s0(Vector(Vector(72.0)), Vector(Vector(73.0), Vector(74.0)), Vector(75.0, 76.0, 77.0), Vector(Vector(78.0), Vector(79.0), Vector(80.0))), s0(Vector(Vector(81.0)), Vector(Vector(82.0), Vector(83.0)), Vector(84.0, 85.0, 86.0), Vector(Vector(87.0), Vector(88.0), Vector(89.0)))))), s6(s0(Vector(Vector(90.0)), Vector(Vector(91.0), Vector(92.0)), Vector(93.0, 94.0, 95.0), Vector(Vector(96.0), Vector(97.0), Vector(98.0))), s4(Vector(s3(Vector(s2(s1(Vector(s0(Vector(Vector(99.0)), Vector(Vector(100.0), Vector(101.0)), Vector(102.0, 103.0, 104.0), Vector(Vector(105.0), Vector(106.0), Vector(107.0)))), s0(Vector(Vector(108.0)), Vector(Vector(109.0), Vector(110.0)), Vector(111.0, 112.0, 113.0), Vector(Vector(114.0), Vector(115.0), Vector(116.0))), s0(Vector(Vector(117.0)), Vector(Vector(118.0), Vector(119.0)), Vector(120.0, 121.0, 122.0), Vector(Vector(123.0), Vector(124.0), Vector(125.0)))), Vector(s0(Vector(Vector(126.0)), Vector(Vector(127.0), Vector(128.0)), Vector(129.0, 130.0, 131.0), Vector(Vector(132.0), Vector(133.0), Vector(134.0))), s0(Vector(Vector(135.0)), Vector(Vector(136.0), Vector(137.0)), Vector(138.0, 139.0, 140.0), Vector(Vector(141.0), Vector(142.0), Vector(143.0))))), s2(s1(Vector(s0(Vector(Vector(144.0)), Vector(Vector(145.0), Vector(146.0)), Vector(147.0, 148.0, 149.0), Vector(Vector(150.0), Vector(151.0), Vector(152.0)))), s0(Vector(Vector(153.0)), Vector(Vector(154.0), Vector(155.0)), Vector(156.0, 157.0, 158.0), Vector(Vector(159.0), Vector(160.0), Vector(161.0))), s0(Vector(Vector(162.0)), Vector(Vector(163.0), Vector(164.0)), Vector(165.0, 166.0, 167.0), Vector(Vector(168.0), Vector(169.0), Vector(170.0)))), Vector(s0(Vector(Vector(171.0)), Vector(Vector(172.0), Vector(173.0)), Vector(174.0, 175.0, 176.0), Vector(Vector(177.0), Vector(178.0), Vector(179.0))), s0(Vector(Vector(180.0)), Vector(Vector(181.0), Vector(182.0)), Vector(183.0, 184.0, 185.0), Vector(Vector(186.0), Vector(187.0), Vector(188.0)))))), Vector(Vector(s2(s1(Vector(s0(Vector(Vector(189.0)), Vector(Vector(190.0), Vector(191.0)), Vector(192.0, 193.0, 194.0), Vector(Vector(195.0), Vector(196.0), Vector(197.0)))), s0(Vector(Vector(198.0)), Vector(Vector(199.0), Vector(200.0)), Vector(201.0, 202.0, 203.0), Vector(Vector(204.0), Vector(205.0), Vector(206.0))), s0(Vector(Vector(207.0)), Vector(Vector(208.0), Vector(209.0)), Vector(210.0, 211.0, 212.0), Vector(Vector(213.0), Vector(214.0), Vector(215.0)))), Vector(s0(Vector(Vector(216.0)), Vector(Vector(217.0), Vector(218.0)), Vector(219.0, 220.0, 221.0), Vector(Vector(222.0), Vector(223.0), Vector(224.0))), s0(Vector(Vector(225.0)), Vector(Vector(226.0), Vector(227.0)), Vector(228.0, 229.0, 230.0), Vector(Vector(231.0), Vector(232.0), Vector(233.0)))))), Vector(s2(s1(Vector(s0(Vector(Vector(234.0)), Vector(Vector(235.0), Vector(236.0)), Vector(237.0, 238.0, 239.0), Vector(Vector(240.0), Vector(241.0), Vector(242.0)))), s0(Vector(Vector(243.0)), Vector(Vector(244.0), Vector(245.0)), Vector(246.0, 247.0, 248.0), Vector(Vector(249.0), Vector(250.0), Vector(251.0))), s0(Vector(Vector(252.0)), Vector(Vector(253.0), Vector(254.0)), Vector(255.0, 256.0, 257.0), Vector(Vector(258.0), Vector(259.0), Vector(260.0)))), Vector(s0(Vector(Vector(261.0)), Vector(Vector(262.0), Vector(263.0)), Vector(264.0, 265.0, 266.0), Vector(Vector(267.0), Vector(268.0), Vector(269.0))), s0(Vector(Vector(270.0)), Vector(Vector(271.0), Vector(272.0)), Vector(273.0, 274.0, 275.0), Vector(Vector(276.0), Vector(277.0), Vector(278.0))))))))), Vector(Vector(s2(s1(Vector(s0(Vector(Vector(279.0)), Vector(Vector(280.0), Vector(281.0)), Vector(282.0, 283.0, 284.0), Vector(Vector(285.0), Vector(286.0), Vector(287.0)))), s0(Vector(Vector(288.0)), Vector(Vector(289.0), Vector(290.0)), Vector(291.0, 292.0, 293.0), Vector(Vector(294.0), Vector(295.0), Vector(296.0))), s0(Vector(Vector(297.0)), Vector(Vector(298.0), Vector(299.0)), Vector(300.0, 301.0, 302.0), Vector(Vector(303.0), Vector(304.0), Vector(305.0)))), Vector(s0(Vector(Vector(306.0)), Vector(Vector(307.0), Vector(308.0)), Vector(309.0, 310.0, 311.0), Vector(Vector(312.0), Vector(313.0), Vector(314.0))), s0(Vector(Vector(315.0)), Vector(Vector(316.0), Vector(317.0)), Vector(318.0, 319.0, 320.0), Vector(Vector(321.0), Vector(322.0), Vector(323.0)))))), Vector(s2(s1(Vector(s0(Vector(Vector(324.0)), Vector(Vector(325.0), Vector(326.0)), Vector(327.0, 328.0, 329.0), Vector(Vector(330.0), Vector(331.0), Vector(332.0)))), s0(Vector(Vector(333.0)), Vector(Vector(334.0), Vector(335.0)), Vector(336.0, 337.0, 338.0), Vector(Vector(339.0), Vector(340.0), Vector(341.0))), s0(Vector(Vector(342.0)), Vector(Vector(343.0), Vector(344.0)), Vector(345.0, 346.0, 347.0), Vector(Vector(348.0), Vector(349.0), Vector(350.0)))), Vector(s0(Vector(Vector(351.0)), Vector(Vector(352.0), Vector(353.0)), Vector(354.0, 355.0, 356.0), Vector(Vector(357.0), Vector(358.0), Vector(359.0))), s0(Vector(Vector(360.0)), Vector(Vector(361.0), Vector(362.0)), Vector(363.0, 364.0, 365.0), Vector(Vector(366.0), Vector(367.0), Vector(368.0)))))), Vector(s2(s1(Vector(s0(Vector(Vector(369.0)), Vector(Vector(370.0), Vector(371.0)), Vector(372.0, 373.0, 374.0), Vector(Vector(375.0), Vector(376.0), Vector(377.0)))), s0(Vector(Vector(378.0)), Vector(Vector(379.0), Vector(380.0)), Vector(381.0, 382.0, 383.0), Vector(Vector(384.0), Vector(385.0), Vector(386.0))), s0(Vector(Vector(387.0)), Vector(Vector(388.0), Vector(389.0)), Vector(390.0, 391.0, 392.0), Vector(Vector(393.0), Vector(394.0), Vector(395.0)))), Vector(s0(Vector(Vector(396.0)), Vector(Vector(397.0), Vector(398.0)), Vector(399.0, 400.0, 401.0), Vector(Vector(402.0), Vector(403.0), Vector(404.0))), s0(Vector(Vector(405.0)), Vector(Vector(406.0), Vector(407.0)), Vector(408.0, 409.0, 410.0), Vector(Vector(411.0), Vector(412.0), Vector(413.0))))))), Vector(s0(Vector(Vector(414.0)), Vector(Vector(415.0), Vector(416.0)), Vector(417.0, 418.0, 419.0), Vector(Vector(420.0), Vector(421.0), Vector(422.0)))))), Vector(s1(Vector(s0(Vector(Vector(423.0)), Vector(Vector(424.0), Vector(425.0)), Vector(426.0, 427.0, 428.0), Vector(Vector(429.0), Vector(430.0), Vector(431.0)))), s0(Vector(Vector(432.0)), Vector(Vector(433.0), Vector(434.0)), Vector(435.0, 436.0, 437.0), Vector(Vector(438.0), Vector(439.0), Vector(440.0))), s0(Vector(Vector(441.0)), Vector(Vector(442.0), Vector(443.0)), Vector(444.0, 445.0, 446.0), Vector(Vector(447.0), Vector(448.0), Vector(449.0)))), s1(Vector(s0(Vector(Vector(450.0)), Vector(Vector(451.0), Vector(452.0)), Vector(453.0, 454.0, 455.0), Vector(Vector(456.0), Vector(457.0), Vector(458.0)))), s0(Vector(Vector(459.0)), Vector(Vector(460.0), Vector(461.0)), Vector(462.0, 463.0, 464.0), Vector(Vector(465.0), Vector(466.0), Vector(467.0))), s0(Vector(Vector(468.0)), Vector(Vector(469.0), Vector(470.0)), Vector(471.0, 472.0, 473.0), Vector(Vector(474.0), Vector(475.0), Vector(476.0))))), Vector(s0(Vector(Vector(477.0)), Vector(Vector(478.0), Vector(479.0)), Vector(480.0, 481.0, 482.0), Vector(Vector(483.0), Vector(484.0), Vector(485.0))), s0(Vector(Vector(486.0)), Vector(Vector(487.0), Vector(488.0)), Vector(489.0, 490.0, 491.0), Vector(Vector(492.0), Vector(493.0), Vector(494.0)))), s1(Vector(s0(Vector(Vector(495.0)), Vector(Vector(496.0), Vector(497.0)), Vector(498.0, 499.0, 500.0), Vector(Vector(501.0), Vector(502.0), Vector(503.0)))), s0(Vector(Vector(504.0)), Vector(Vector(505.0), Vector(506.0)), Vector(507.0, 508.0, 509.0), Vector(Vector(510.0), Vector(511.0), Vector(512.0))), s0(Vector(Vector(513.0)), Vector(Vector(514.0), Vector(515.0)), Vector(516.0, 517.0, 518.0), Vector(Vector(519.0), Vector(520.0), Vector(521.0)))), Vector(Vector(s5(s0(Vector(Vector(522.0)), Vector(Vector(523.0), Vector(524.0)), Vector(525.0, 526.0, 527.0), Vector(Vector(528.0), Vector(529.0), Vector(530.0))), Vector(s1(Vector(s0(Vector(Vector(531.0)), Vector(Vector(532.0), Vector(533.0)), Vector(534.0, 535.0, 536.0), Vector(Vector(537.0), Vector(538.0), Vector(539.0)))), s0(Vector(Vector(540.0)), Vector(Vector(541.0), Vector(542.0)), Vector(543.0, 544.0, 545.0), Vector(Vector(546.0), Vector(547.0), Vector(548.0))), s0(Vector(Vector(549.0)), Vector(Vector(550.0), Vector(551.0)), Vector(552.0, 553.0, 554.0), Vector(Vector(555.0), Vector(556.0), Vector(557.0)))), s1(Vector(s0(Vector(Vector(558.0)), Vector(Vector(559.0), Vector(560.0)), Vector(561.0, 562.0, 563.0), Vector(Vector(564.0), Vector(565.0), Vector(566.0)))), s0(Vector(Vector(567.0)), Vector(Vector(568.0), Vector(569.0)), Vector(570.0, 571.0, 572.0), Vector(Vector(573.0), Vector(574.0), Vector(575.0))), s0(Vector(Vector(576.0)), Vector(Vector(577.0), Vector(578.0)), Vector(579.0, 580.0, 581.0), Vector(Vector(582.0), Vector(583.0), Vector(584.0)))), s1(Vector(s0(Vector(Vector(585.0)), Vector(Vector(586.0), Vector(587.0)), Vector(588.0, 589.0, 590.0), Vector(Vector(591.0), Vector(592.0), Vector(593.0)))), s0(Vector(Vector(594.0)), Vector(Vector(595.0), Vector(596.0)), Vector(597.0, 598.0, 599.0), Vector(Vector(600.0), Vector(601.0), Vector(602.0))), s0(Vector(Vector(603.0)), Vector(Vector(604.0), Vector(605.0)), Vector(606.0, 607.0, 608.0), Vector(Vector(609.0), Vector(610.0), Vector(611.0))))))), Vector(s5(s0(Vector(Vector(612.0)), Vector(Vector(613.0), Vector(614.0)), Vector(615.0, 616.0, 617.0), Vector(Vector(618.0), Vector(619.0), Vector(620.0))), Vector(s1(Vector(s0(Vector(Vector(621.0)), Vector(Vector(622.0), Vector(623.0)), Vector(624.0, 625.0, 626.0), Vector(Vector(627.0), Vector(628.0), Vector(629.0)))), s0(Vector(Vector(630.0)), Vector(Vector(631.0), Vector(632.0)), Vector(633.0, 634.0, 635.0), Vector(Vector(636.0), Vector(637.0), Vector(638.0))), s0(Vector(Vector(639.0)), Vector(Vector(640.0), Vector(641.0)), Vector(642.0, 643.0, 644.0), Vector(Vector(645.0), Vector(646.0), Vector(647.0)))), s1(Vector(s0(Vector(Vector(648.0)), Vector(Vector(649.0), Vector(650.0)), Vector(651.0, 652.0, 653.0), Vector(Vector(654.0), Vector(655.0), Vector(656.0)))), s0(Vector(Vector(657.0)), Vector(Vector(658.0), Vector(659.0)), Vector(660.0, 661.0, 662.0), Vector(Vector(663.0), Vector(664.0), Vector(665.0))), s0(Vector(Vector(666.0)), Vector(Vector(667.0), Vector(668.0)), Vector(669.0, 670.0, 671.0), Vector(Vector(672.0), Vector(673.0), Vector(674.0)))), s1(Vector(s0(Vector(Vector(675.0)), Vector(Vector(676.0), Vector(677.0)), Vector(678.0, 679.0, 680.0), Vector(Vector(681.0), Vector(682.0), Vector(683.0)))), s0(Vector(Vector(684.0)), Vector(Vector(685.0), Vector(686.0)), Vector(687.0, 688.0, 689.0), Vector(Vector(690.0), Vector(691.0), Vector(692.0))), s0(Vector(Vector(693.0)), Vector(Vector(694.0), Vector(695.0)), Vector(696.0, 697.0, 698.0), Vector(Vector(699.0), Vector(700.0), Vector(701.0))))))))))
    val v1: Double = 702.0
    val start = nanoTime()
    var result: Double = 702.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}