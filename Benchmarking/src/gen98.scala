import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[Vector[s0]],
    p2: s0,
    p3: s0,
    p4: s0
  )
  case class s2 (
    p0: s1,
    p1: s1
  )
  case class s3 (
    p0: Vector[Vector[s1]],
    p1: Vector[s2]
  )
  case class s6 (
    p0: s3,
    p1: s3,
    p2: s1,
    p3: Vector[s3]
  )
  def f118(v0: Vector[s0], v1: Vector[s0]): Vector[s0] = {
    val v3: s0 = v1(2)
    val v6: s0 = v0(0)
    var v4: Vector[s0] = v0
    val v9: s0 = v4(0)
    val v5: s0 = v0(0)
    val v10: Vector[Vector[Double]] = v3.p1
    var v7: Vector[s0] = v4
    var v8: s0 = v6
    v4 = v4.updated(0, v5)
    val v23: Vector[Vector[Double]] = v8.p0
    val v20: Vector[Vector[Double]] = v8.p0
    v7 = v7.updated(0, v9)
    var v27: Vector[s0] = v1
    v7 = v7.updated(0, v9)
    v8 = v8.copy(p1 = v10)
    val v33: s0 = v1(2)
    val v32: s0 = v4(0)
    val v59: Vector[Vector[Double]] = v32.p1
    val v18: Vector[Double] = v20(0)
    var v35: Vector[s0] = v4
    var v42: Vector[s0] = v35
    var v56: Vector[Vector[Double]] = v59
    var v38: Vector[s0] = v27
    v38 = v38.updated(2, v5)
    val v46: s0 = v7(0)
    var v40: Vector[s0] = v38
    v8 = v8.copy(p1 = v59)
    val v60: Vector[Vector[Double]] = v46.p0
    val v132: Vector[Double] = v60(0)
    var v71: Vector[Vector[Double]] = v56
    v8 = v8.copy(p1 = v71)
    val v77: s0 = v1(2)
    val v57: Vector[Vector[Double]] = v32.p0
    v4 = v4.updated(0, v9)
    var v45: Vector[s0] = v40
    v56 = v56.updated(1, v132)
    val v86: s0 = s0(v57, v71)
    v8 = v8.copy(p1 = v10)
    v8 = v8.copy(p0 = v60)
    v8 = v8.copy(p0 = v23)
    v8 = v86
    v56 = v56.updated(1, v18)
    var v142: Vector[s0] = v45
    val v89: Vector[Vector[Double]] = v77.p0
    val v250: s0 = v142(1)
    v142 = v142.updated(0, v86)
    v42 = v35
    v42 = v42.updated(0, v46)
    v8 = v8.copy(p0 = v89)
    v35 = v35.updated(0, v250)
    v40 = v40.updated(0, v33)
    val v149: s0 = v1(1)
    v4 = v4.updated(0, v149)
    v42
  }
  def f112(v0: s1): s1 = {
    var v5: s1 = v0
    var v3: s1 = v0
    val v6: Vector[Vector[s0]] = v0.p1
    v3 = v3.copy(p1 = v6)
    val v2: Vector[s0] = v6(2)
    val v15: Vector[s0] = v3.p0
    val v10: s0 = v2(0)
    val v1: s0 = v2(0)
    val v16: Vector[s0] = v6(2)
    val v8: Vector[s0] = f118(v16, v15)
    val v20: s0 = v16(0)
    v3 = v3.copy(p2 = v20)
    val v13: s0 = v8(0)
    val v28: Vector[Vector[s0]] = v0.p1
    v5 = v5.copy(p1 = v6)
    v3 = v3.copy(p3 = v20)
    var v32: Vector[Vector[s0]] = v28
    val v69: Vector[Vector[Double]] = v13.p0
    v5 = v5.copy(p1 = v32)
    val v61: s2 = s2(v3, v5)
    var v47: s0 = v10
    val v88: s1 = v61.p0
    val v55: s1 = v61.p0
    v47 = v47.copy(p0 = v69)
    v3 = v3.copy(p2 = v1)
    v5 = v5.copy(p3 = v47)
    val v77: s2 = s2(v88, v55)
    val v231: s1 = v77.p1
    v231
  }
  def f107(v0: s3): s3 = {
    var v4: s3 = v0
    val v3: Vector[s2] = v0.p1
    val v8: Vector[s3] = Vector(v0, v0, v4, v4, v0, v4)
    val v5: Vector[Vector[s1]] = v0.p0
    val v2: s3 = v8(0)
    val v6: Vector[s2] = v0.p1
    var v25: Vector[s2] = v3
    val v9: s2 = v3(0)
    val v15: Vector[Vector[Vector[s1]]] = Vector(v5, v5, v5, v5)
    val v35: s1 = v9.p1
    var v24: Vector[s3] = v8
    val v14: s1 = f112(v35)
    var v30: Vector[s3] = v24
    var v32: Vector[s2] = v6
    val v20: s3 = v30(2)
    val v44: Vector[s2] = v20.p1
    v30 = v30.updated(4, v4)
    val v70: s1 = f112(v14)
    val v52: Vector[Vector[s1]] = v15(1)
    v4 = v4.copy(p0 = v52)
    v4 = v4.copy(p1 = v32)
    val v138: s2 = v32(0)
    v4 = v4.copy(p1 = v44)
    val v200: Vector[Vector[s1]] = v2.p0
    v30 = v30.updated(3, v4)
    v4 = v4.copy(p1 = v25)
    var v174: s2 = v138
    v4 = v4.copy(p0 = v200)
    v32 = v32.updated(0, v174)
    v174 = v174.copy(p0 = v70)
    v4 = v4.copy(p1 = v6)
    val v300: s3 = v30(1)
    v300
  }
  def f100(v0: s6): s6 = {
    val v7: Vector[s3] = v0.p3
    val v4: s3 = v7(0)
    val v6: s3 = v7(0)
    var v13: s6 = v0
    val v17: s3 = f107(v4)
    var v23: Vector[s3] = v7
    var v44: s6 = v13
    v23 = v23.updated(0, v4)
    var v30: s6 = v44
    v44 = v44.copy(p3 = v7)
    v23 = v23.updated(1, v6)
    v44 = v13
    v30 = v30.copy(p3 = v7)
    var v83: s3 = v17
    v30 = v30.copy(p3 = v23)
    v23 = v23.updated(0, v83)
    v30
  }
  def f92(v0: s1, v1: s2): s2 = {
    var v2: s2 = v1
    val v7: s1 = v1.p1
    val v6: s1 = v1.p1
    val v3: s1 = v2.p1
    val v8: s1 = v2.p0
    val v9: s1 = f112(v8)
    var v10: s1 = v3
    v2 = v2.copy(p0 = v10)
    val v13: s1 = f112(v9)
    var v15: s2 = v2
    var v14: s2 = v15
    v14 = v14.copy(p1 = v8)
    v15 = v15.copy(p0 = v6)
    val v33: s1 = v2.p1
    val v27: s0 = v33.p2
    val v46: s1 = v15.p0
    v2 = v2.copy(p1 = v46)
    val v23: s1 = v15.p1
    val v60: s1 = f112(v7)
    v2 = v2.copy(p0 = v3)
    var v41: s2 = v14
    val v57: Vector[s0] = v33.p0
    v14 = v14.copy(p0 = v23)
    var v59: s1 = v46
    val v24: s0 = v57(2)
    v10 = v10.copy(p2 = v27)
    v15 = v15.copy(p0 = v23)
    v2 = v2.copy(p1 = v59)
    v59 = v59.copy(p3 = v24)
    v10 = v10.copy(p3 = v27)
    val v63: s1 = f112(v13)
    v14 = v14.copy(p0 = v60)
    v41 = v41.copy(p0 = v63)
    v41 = v41.copy(p1 = v63)
    v10 = v10.copy(p0 = v57)
    v41
  }
  def f89(v0: s3): s3 = {
    var v5: s3 = v0
    val v8: Vector[s3] = Vector(v5, v5, v0, v0)
    val v6: Vector[Vector[s1]] = v0.p0
    v5 = v5.copy(p0 = v6)
    var v4: Vector[Vector[s1]] = v6
    v5 = v5.copy(p0 = v4)
    val v23: Vector[Vector[s1]] = v0.p0
    val v73: Vector[s1] = v23(0)
    v4 = v4.updated(0, v73)
    val v112: s3 = v8(2)
    v5 = v5.copy(p0 = v23)
    v112
  }
  def f88(v0: s6): s6 = {
    val v4: s3 = v0.p0
    val v8: Vector[Vector[s1]] = v4.p0
    var v5: s3 = v4
    v5 = v4
    val v1: Vector[s2] = v5.p1
    val v7: s3 = v0.p0
    val v18: s2 = v1(0)
    var v13: s2 = v18
    val v10: s3 = f89(v5)
    val v16: s6 = f100(v0)
    val v14: Vector[s1] = v8(0)
    var v15: s6 = v16
    val v38: s3 = f89(v10)
    var v32: Vector[s1] = v14
    v15 = v15.copy(p0 = v7)
    val v54: Vector[s2] = v10.p1
    val v21: Vector[s1] = v8(0)
    val v33: s1 = v32(0)
    var v52: s1 = v33
    v5 = v5.copy(p1 = v54)
    var v36: s1 = v52
    v13 = v13.copy(p0 = v36)
    v15 = v15.copy(p1 = v38)
    val v27: s1 = f112(v52)
    val v65: s1 = v21(0)
    val v35: s2 = f92(v52, v18)
    val v44: s1 = v13.p0
    v32 = v32.updated(0, v44)
    v13 = v13.copy(p0 = v52)
    val v59: s0 = v65.p4
    v5 = v5.copy(p1 = v54)
    val v79: s1 = f112(v36)
    v32 = v32.updated(0, v27)
    val v37: s1 = v35.p0
    val v50: s6 = f100(v15)
    val v41: s1 = f112(v79)
    v15 = v15.copy(p2 = v41)
    v15 = v15.copy(p2 = v52)
    v32 = v32.updated(0, v37)
    v52 = v52.copy(p3 = v59)
    v13 = v13.copy(p1 = v37)
    v50
  }
  @noinline
  def f0(v0: s6, v1: s2, v2: Double, v3: s2): Double = {
    val v7: s6 = f88(v0)
    val v5: s1 = v7.p2
    val v10: Vector[Vector[s0]] = v5.p1
    val v15: Vector[s0] = v10(1)
    val v115: s0 = v15(0)
    val v67: Vector[Vector[Double]] = v115.p1
    val v102: Vector[Double] = v67(1)
    val v75: Double = v102(0)
    v75
  }
  def benchmark(): Unit = {
    val v0: s6 = s6(s3(Vector(Vector(s1(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0))), s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))), Vector(Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0)))), Vector(s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0)))), Vector(s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))))), s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0))), s0(Vector(Vector(28.0)), Vector(Vector(29.0), Vector(30.0), Vector(31.0))), s0(Vector(Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0)))))), Vector(s2(s1(Vector(s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0))), s0(Vector(Vector(40.0)), Vector(Vector(41.0), Vector(42.0), Vector(43.0))), s0(Vector(Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0)))), Vector(Vector(s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0), Vector(51.0)))), Vector(s0(Vector(Vector(52.0)), Vector(Vector(53.0), Vector(54.0), Vector(55.0)))), Vector(s0(Vector(Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0))))), s0(Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0), Vector(63.0))), s0(Vector(Vector(64.0)), Vector(Vector(65.0), Vector(66.0), Vector(67.0))), s0(Vector(Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0)))), s1(Vector(s0(Vector(Vector(72.0)), Vector(Vector(73.0), Vector(74.0), Vector(75.0))), s0(Vector(Vector(76.0)), Vector(Vector(77.0), Vector(78.0), Vector(79.0))), s0(Vector(Vector(80.0)), Vector(Vector(81.0), Vector(82.0), Vector(83.0)))), Vector(Vector(s0(Vector(Vector(84.0)), Vector(Vector(85.0), Vector(86.0), Vector(87.0)))), Vector(s0(Vector(Vector(88.0)), Vector(Vector(89.0), Vector(90.0), Vector(91.0)))), Vector(s0(Vector(Vector(92.0)), Vector(Vector(93.0), Vector(94.0), Vector(95.0))))), s0(Vector(Vector(96.0)), Vector(Vector(97.0), Vector(98.0), Vector(99.0))), s0(Vector(Vector(100.0)), Vector(Vector(101.0), Vector(102.0), Vector(103.0))), s0(Vector(Vector(104.0)), Vector(Vector(105.0), Vector(106.0), Vector(107.0))))))), s3(Vector(Vector(s1(Vector(s0(Vector(Vector(108.0)), Vector(Vector(109.0), Vector(110.0), Vector(111.0))), s0(Vector(Vector(112.0)), Vector(Vector(113.0), Vector(114.0), Vector(115.0))), s0(Vector(Vector(116.0)), Vector(Vector(117.0), Vector(118.0), Vector(119.0)))), Vector(Vector(s0(Vector(Vector(120.0)), Vector(Vector(121.0), Vector(122.0), Vector(123.0)))), Vector(s0(Vector(Vector(124.0)), Vector(Vector(125.0), Vector(126.0), Vector(127.0)))), Vector(s0(Vector(Vector(128.0)), Vector(Vector(129.0), Vector(130.0), Vector(131.0))))), s0(Vector(Vector(132.0)), Vector(Vector(133.0), Vector(134.0), Vector(135.0))), s0(Vector(Vector(136.0)), Vector(Vector(137.0), Vector(138.0), Vector(139.0))), s0(Vector(Vector(140.0)), Vector(Vector(141.0), Vector(142.0), Vector(143.0)))))), Vector(s2(s1(Vector(s0(Vector(Vector(144.0)), Vector(Vector(145.0), Vector(146.0), Vector(147.0))), s0(Vector(Vector(148.0)), Vector(Vector(149.0), Vector(150.0), Vector(151.0))), s0(Vector(Vector(152.0)), Vector(Vector(153.0), Vector(154.0), Vector(155.0)))), Vector(Vector(s0(Vector(Vector(156.0)), Vector(Vector(157.0), Vector(158.0), Vector(159.0)))), Vector(s0(Vector(Vector(160.0)), Vector(Vector(161.0), Vector(162.0), Vector(163.0)))), Vector(s0(Vector(Vector(164.0)), Vector(Vector(165.0), Vector(166.0), Vector(167.0))))), s0(Vector(Vector(168.0)), Vector(Vector(169.0), Vector(170.0), Vector(171.0))), s0(Vector(Vector(172.0)), Vector(Vector(173.0), Vector(174.0), Vector(175.0))), s0(Vector(Vector(176.0)), Vector(Vector(177.0), Vector(178.0), Vector(179.0)))), s1(Vector(s0(Vector(Vector(180.0)), Vector(Vector(181.0), Vector(182.0), Vector(183.0))), s0(Vector(Vector(184.0)), Vector(Vector(185.0), Vector(186.0), Vector(187.0))), s0(Vector(Vector(188.0)), Vector(Vector(189.0), Vector(190.0), Vector(191.0)))), Vector(Vector(s0(Vector(Vector(192.0)), Vector(Vector(193.0), Vector(194.0), Vector(195.0)))), Vector(s0(Vector(Vector(196.0)), Vector(Vector(197.0), Vector(198.0), Vector(199.0)))), Vector(s0(Vector(Vector(200.0)), Vector(Vector(201.0), Vector(202.0), Vector(203.0))))), s0(Vector(Vector(204.0)), Vector(Vector(205.0), Vector(206.0), Vector(207.0))), s0(Vector(Vector(208.0)), Vector(Vector(209.0), Vector(210.0), Vector(211.0))), s0(Vector(Vector(212.0)), Vector(Vector(213.0), Vector(214.0), Vector(215.0))))))), s1(Vector(s0(Vector(Vector(216.0)), Vector(Vector(217.0), Vector(218.0), Vector(219.0))), s0(Vector(Vector(220.0)), Vector(Vector(221.0), Vector(222.0), Vector(223.0))), s0(Vector(Vector(224.0)), Vector(Vector(225.0), Vector(226.0), Vector(227.0)))), Vector(Vector(s0(Vector(Vector(228.0)), Vector(Vector(229.0), Vector(230.0), Vector(231.0)))), Vector(s0(Vector(Vector(232.0)), Vector(Vector(233.0), Vector(234.0), Vector(235.0)))), Vector(s0(Vector(Vector(236.0)), Vector(Vector(237.0), Vector(238.0), Vector(239.0))))), s0(Vector(Vector(240.0)), Vector(Vector(241.0), Vector(242.0), Vector(243.0))), s0(Vector(Vector(244.0)), Vector(Vector(245.0), Vector(246.0), Vector(247.0))), s0(Vector(Vector(248.0)), Vector(Vector(249.0), Vector(250.0), Vector(251.0)))), Vector(s3(Vector(Vector(s1(Vector(s0(Vector(Vector(252.0)), Vector(Vector(253.0), Vector(254.0), Vector(255.0))), s0(Vector(Vector(256.0)), Vector(Vector(257.0), Vector(258.0), Vector(259.0))), s0(Vector(Vector(260.0)), Vector(Vector(261.0), Vector(262.0), Vector(263.0)))), Vector(Vector(s0(Vector(Vector(264.0)), Vector(Vector(265.0), Vector(266.0), Vector(267.0)))), Vector(s0(Vector(Vector(268.0)), Vector(Vector(269.0), Vector(270.0), Vector(271.0)))), Vector(s0(Vector(Vector(272.0)), Vector(Vector(273.0), Vector(274.0), Vector(275.0))))), s0(Vector(Vector(276.0)), Vector(Vector(277.0), Vector(278.0), Vector(279.0))), s0(Vector(Vector(280.0)), Vector(Vector(281.0), Vector(282.0), Vector(283.0))), s0(Vector(Vector(284.0)), Vector(Vector(285.0), Vector(286.0), Vector(287.0)))))), Vector(s2(s1(Vector(s0(Vector(Vector(288.0)), Vector(Vector(289.0), Vector(290.0), Vector(291.0))), s0(Vector(Vector(292.0)), Vector(Vector(293.0), Vector(294.0), Vector(295.0))), s0(Vector(Vector(296.0)), Vector(Vector(297.0), Vector(298.0), Vector(299.0)))), Vector(Vector(s0(Vector(Vector(300.0)), Vector(Vector(301.0), Vector(302.0), Vector(303.0)))), Vector(s0(Vector(Vector(304.0)), Vector(Vector(305.0), Vector(306.0), Vector(307.0)))), Vector(s0(Vector(Vector(308.0)), Vector(Vector(309.0), Vector(310.0), Vector(311.0))))), s0(Vector(Vector(312.0)), Vector(Vector(313.0), Vector(314.0), Vector(315.0))), s0(Vector(Vector(316.0)), Vector(Vector(317.0), Vector(318.0), Vector(319.0))), s0(Vector(Vector(320.0)), Vector(Vector(321.0), Vector(322.0), Vector(323.0)))), s1(Vector(s0(Vector(Vector(324.0)), Vector(Vector(325.0), Vector(326.0), Vector(327.0))), s0(Vector(Vector(328.0)), Vector(Vector(329.0), Vector(330.0), Vector(331.0))), s0(Vector(Vector(332.0)), Vector(Vector(333.0), Vector(334.0), Vector(335.0)))), Vector(Vector(s0(Vector(Vector(336.0)), Vector(Vector(337.0), Vector(338.0), Vector(339.0)))), Vector(s0(Vector(Vector(340.0)), Vector(Vector(341.0), Vector(342.0), Vector(343.0)))), Vector(s0(Vector(Vector(344.0)), Vector(Vector(345.0), Vector(346.0), Vector(347.0))))), s0(Vector(Vector(348.0)), Vector(Vector(349.0), Vector(350.0), Vector(351.0))), s0(Vector(Vector(352.0)), Vector(Vector(353.0), Vector(354.0), Vector(355.0))), s0(Vector(Vector(356.0)), Vector(Vector(357.0), Vector(358.0), Vector(359.0))))))), s3(Vector(Vector(s1(Vector(s0(Vector(Vector(360.0)), Vector(Vector(361.0), Vector(362.0), Vector(363.0))), s0(Vector(Vector(364.0)), Vector(Vector(365.0), Vector(366.0), Vector(367.0))), s0(Vector(Vector(368.0)), Vector(Vector(369.0), Vector(370.0), Vector(371.0)))), Vector(Vector(s0(Vector(Vector(372.0)), Vector(Vector(373.0), Vector(374.0), Vector(375.0)))), Vector(s0(Vector(Vector(376.0)), Vector(Vector(377.0), Vector(378.0), Vector(379.0)))), Vector(s0(Vector(Vector(380.0)), Vector(Vector(381.0), Vector(382.0), Vector(383.0))))), s0(Vector(Vector(384.0)), Vector(Vector(385.0), Vector(386.0), Vector(387.0))), s0(Vector(Vector(388.0)), Vector(Vector(389.0), Vector(390.0), Vector(391.0))), s0(Vector(Vector(392.0)), Vector(Vector(393.0), Vector(394.0), Vector(395.0)))))), Vector(s2(s1(Vector(s0(Vector(Vector(396.0)), Vector(Vector(397.0), Vector(398.0), Vector(399.0))), s0(Vector(Vector(400.0)), Vector(Vector(401.0), Vector(402.0), Vector(403.0))), s0(Vector(Vector(404.0)), Vector(Vector(405.0), Vector(406.0), Vector(407.0)))), Vector(Vector(s0(Vector(Vector(408.0)), Vector(Vector(409.0), Vector(410.0), Vector(411.0)))), Vector(s0(Vector(Vector(412.0)), Vector(Vector(413.0), Vector(414.0), Vector(415.0)))), Vector(s0(Vector(Vector(416.0)), Vector(Vector(417.0), Vector(418.0), Vector(419.0))))), s0(Vector(Vector(420.0)), Vector(Vector(421.0), Vector(422.0), Vector(423.0))), s0(Vector(Vector(424.0)), Vector(Vector(425.0), Vector(426.0), Vector(427.0))), s0(Vector(Vector(428.0)), Vector(Vector(429.0), Vector(430.0), Vector(431.0)))), s1(Vector(s0(Vector(Vector(432.0)), Vector(Vector(433.0), Vector(434.0), Vector(435.0))), s0(Vector(Vector(436.0)), Vector(Vector(437.0), Vector(438.0), Vector(439.0))), s0(Vector(Vector(440.0)), Vector(Vector(441.0), Vector(442.0), Vector(443.0)))), Vector(Vector(s0(Vector(Vector(444.0)), Vector(Vector(445.0), Vector(446.0), Vector(447.0)))), Vector(s0(Vector(Vector(448.0)), Vector(Vector(449.0), Vector(450.0), Vector(451.0)))), Vector(s0(Vector(Vector(452.0)), Vector(Vector(453.0), Vector(454.0), Vector(455.0))))), s0(Vector(Vector(456.0)), Vector(Vector(457.0), Vector(458.0), Vector(459.0))), s0(Vector(Vector(460.0)), Vector(Vector(461.0), Vector(462.0), Vector(463.0))), s0(Vector(Vector(464.0)), Vector(Vector(465.0), Vector(466.0), Vector(467.0)))))))))
    val v1: s2 = s2(s1(Vector(s0(Vector(Vector(468.0)), Vector(Vector(469.0), Vector(470.0), Vector(471.0))), s0(Vector(Vector(472.0)), Vector(Vector(473.0), Vector(474.0), Vector(475.0))), s0(Vector(Vector(476.0)), Vector(Vector(477.0), Vector(478.0), Vector(479.0)))), Vector(Vector(s0(Vector(Vector(480.0)), Vector(Vector(481.0), Vector(482.0), Vector(483.0)))), Vector(s0(Vector(Vector(484.0)), Vector(Vector(485.0), Vector(486.0), Vector(487.0)))), Vector(s0(Vector(Vector(488.0)), Vector(Vector(489.0), Vector(490.0), Vector(491.0))))), s0(Vector(Vector(492.0)), Vector(Vector(493.0), Vector(494.0), Vector(495.0))), s0(Vector(Vector(496.0)), Vector(Vector(497.0), Vector(498.0), Vector(499.0))), s0(Vector(Vector(500.0)), Vector(Vector(501.0), Vector(502.0), Vector(503.0)))), s1(Vector(s0(Vector(Vector(504.0)), Vector(Vector(505.0), Vector(506.0), Vector(507.0))), s0(Vector(Vector(508.0)), Vector(Vector(509.0), Vector(510.0), Vector(511.0))), s0(Vector(Vector(512.0)), Vector(Vector(513.0), Vector(514.0), Vector(515.0)))), Vector(Vector(s0(Vector(Vector(516.0)), Vector(Vector(517.0), Vector(518.0), Vector(519.0)))), Vector(s0(Vector(Vector(520.0)), Vector(Vector(521.0), Vector(522.0), Vector(523.0)))), Vector(s0(Vector(Vector(524.0)), Vector(Vector(525.0), Vector(526.0), Vector(527.0))))), s0(Vector(Vector(528.0)), Vector(Vector(529.0), Vector(530.0), Vector(531.0))), s0(Vector(Vector(532.0)), Vector(Vector(533.0), Vector(534.0), Vector(535.0))), s0(Vector(Vector(536.0)), Vector(Vector(537.0), Vector(538.0), Vector(539.0)))))
    val v2: Double = 540.0
    val v3: s2 = s2(s1(Vector(s0(Vector(Vector(541.0)), Vector(Vector(542.0), Vector(543.0), Vector(544.0))), s0(Vector(Vector(545.0)), Vector(Vector(546.0), Vector(547.0), Vector(548.0))), s0(Vector(Vector(549.0)), Vector(Vector(550.0), Vector(551.0), Vector(552.0)))), Vector(Vector(s0(Vector(Vector(553.0)), Vector(Vector(554.0), Vector(555.0), Vector(556.0)))), Vector(s0(Vector(Vector(557.0)), Vector(Vector(558.0), Vector(559.0), Vector(560.0)))), Vector(s0(Vector(Vector(561.0)), Vector(Vector(562.0), Vector(563.0), Vector(564.0))))), s0(Vector(Vector(565.0)), Vector(Vector(566.0), Vector(567.0), Vector(568.0))), s0(Vector(Vector(569.0)), Vector(Vector(570.0), Vector(571.0), Vector(572.0))), s0(Vector(Vector(573.0)), Vector(Vector(574.0), Vector(575.0), Vector(576.0)))), s1(Vector(s0(Vector(Vector(577.0)), Vector(Vector(578.0), Vector(579.0), Vector(580.0))), s0(Vector(Vector(581.0)), Vector(Vector(582.0), Vector(583.0), Vector(584.0))), s0(Vector(Vector(585.0)), Vector(Vector(586.0), Vector(587.0), Vector(588.0)))), Vector(Vector(s0(Vector(Vector(589.0)), Vector(Vector(590.0), Vector(591.0), Vector(592.0)))), Vector(s0(Vector(Vector(593.0)), Vector(Vector(594.0), Vector(595.0), Vector(596.0)))), Vector(s0(Vector(Vector(597.0)), Vector(Vector(598.0), Vector(599.0), Vector(600.0))))), s0(Vector(Vector(601.0)), Vector(Vector(602.0), Vector(603.0), Vector(604.0))), s0(Vector(Vector(605.0)), Vector(Vector(606.0), Vector(607.0), Vector(608.0))), s0(Vector(Vector(609.0)), Vector(Vector(610.0), Vector(611.0), Vector(612.0)))))
    val start = nanoTime()
    var result: Double = StructValue(Name(str='s2', ty=None), [StructValue(Name(str='s1', ty=None), [[StructValue(Name(str='s0', ty=None), [[[541.0]], [[542.0], [543.0], [544.0]]]), StructValue(Name(str='s0', ty=None), [[[545.0]], [[546.0], [547.0], [548.0]]]), StructValue(Name(str='s0', ty=None), [[[549.0]], [[550.0], [551.0], [552.0]]])], [[StructValue(Name(str='s0', ty=None), [[[553.0]], [[554.0], [555.0], [556.0]]])], [StructValue(Name(str='s0', ty=None), [[[557.0]], [[558.0], [559.0], [560.0]]])], [StructValue(Name(str='s0', ty=None), [[[561.0]], [[562.0], [563.0], [564.0]]])]], StructValue(Name(str='s0', ty=None), [[[565.0]], [[566.0], [567.0], [568.0]]]), StructValue(Name(str='s0', ty=None), [[[569.0]], [[570.0], [571.0], [572.0]]]), StructValue(Name(str='s0', ty=None), [[[573.0]], [[574.0], [575.0], [576.0]]])]), StructValue(Name(str='s1', ty=None), [[StructValue(Name(str='s0', ty=None), [[[577.0]], [[578.0], [579.0], [580.0]]]), StructValue(Name(str='s0', ty=None), [[[581.0]], [[582.0], [583.0], [584.0]]]), StructValue(Name(str='s0', ty=None), [[[585.0]], [[586.0], [587.0], [588.0]]])], [[StructValue(Name(str='s0', ty=None), [[[589.0]], [[590.0], [591.0], [592.0]]])], [StructValue(Name(str='s0', ty=None), [[[593.0]], [[594.0], [595.0], [596.0]]])], [StructValue(Name(str='s0', ty=None), [[[597.0]], [[598.0], [599.0], [600.0]]])]], StructValue(Name(str='s0', ty=None), [[[601.0]], [[602.0], [603.0], [604.0]]]), StructValue(Name(str='s0', ty=None), [[[605.0]], [[606.0], [607.0], [608.0]]]), StructValue(Name(str='s0', ty=None), [[[609.0]], [[610.0], [611.0], [612.0]]])])])
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}