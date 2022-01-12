import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Double,
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s2 (
    p0: Vector[s1],
    p1: Vector[s0]
  )
  case class s3 (
    p0: Vector[s2],
    p1: s1
  )
  case class s4 (
    p0: s3,
    p1: Vector[s0]
  )
  case class s6 (
    p0: Vector[s4],
    p1: s2
  )
  case class s11 (
    p0: s3,
    p1: s6
  )
  def f38(v0: Double): Double = {
    var v5: Double = v0
    var v2: Double = v5
    var v8: Double = v5
    var v4: Double = v0
    var v3: Double = v2
    var v9: Double = v4
    var v7: Double = v8
    var v6: Double = v2
    v7 = v8
    v7 = v2
    val v1: Vector[Double] = Vector(v7, v3)
    var v10: Vector[Double] = v1
    v10 = v10.updated(0, v9)
    val v24: Vector[Vector[Double]] = Vector(v10)
    var v16: Vector[Vector[Double]] = v24
    var v20: Vector[Vector[Double]] = v16
    var v13: Vector[Vector[Double]] = v20
    var v18: Vector[Vector[Double]] = v20
    val v19: Vector[Double] = v18(0)
    var v17: Vector[Vector[Double]] = v24
    val v32: Vector[Double] = v18(0)
    val v59: Vector[Double] = v16(0)
    v16 = v16.updated(0, v1)
    var v31: Vector[Vector[Double]] = v17
    v10 = v10.updated(0, v8)
    v17 = v17.updated(0, v1)
    var v34: Vector[Double] = v32
    v31 = v31.updated(0, v1)
    v31 = v31.updated(0, v59)
    v16 = v16.updated(0, v19)
    val v54: Vector[Double] = v31(0)
    val v46: Vector[Double] = v18(0)
    val v47: Vector[Double] = v16(0)
    v17 = v17.updated(0, v47)
    val v52: Vector[Double] = v20(0)
    var v85: Vector[Vector[Double]] = v18
    val v26: Double = v10(0)
    var v48: Vector[Double] = v59
    val v45: Double = v46(1)
    v18 = v18.updated(0, v48)
    v17 = v17.updated(0, v1)
    val v39: Vector[Double] = v85(0)
    var v68: Vector[Vector[Double]] = v13
    var v100: Vector[Double] = v34
    v100 = v54
    val v62: Double = v19(0)
    val v93: Double = v39(1)
    v85 = v85.updated(0, v100)
    val v36: Vector[Double] = Vector(v3, v8, v93, v0, v62, v45)
    var v66: Vector[Double] = v19
    v66 = v66.updated(1, v3)
    v17 = v17.updated(0, v10)
    var v89: Vector[Double] = v36
    v100 = v100.updated(0, v62)
    v85 = v85.updated(0, v47)
    v89 = v89.updated(3, v6)
    v31 = v68
    v68 = v68.updated(0, v34)
    val v112: Double = v89(5)
    v20 = v20.updated(0, v46)
    v10 = v10.updated(1, v26)
    v31 = v31.updated(0, v66)
    v16 = v16.updated(0, v52)
    val v77: Double = v36(1)
    val v148: Double = v77 * v112
    v148
  }
  def f3(v0: Double): Double = {
    val v3: Double = f38(v0)
    var v2: Double = v3
    var v4: Double = v2
    var v5: Double = v3
    val v6: Double = f38(v4)
    val v8: Double = f38(v5)
    val v10: Double = f38(v6)
    val v7: Double = f38(v6)
    val v9: Double = f38(v10)
    val v24: Double = f38(v9)
    val v15: Vector[Double] = Vector(v5, v7, v24, v8)
    val v30: Double = v15(3)
    v30
  }
  @noinline
  def f0(v0: s4, v1: s11, v2: Double): Double = {
    val v3: s3 = v0.p0
    val v6: Vector[s2] = v3.p0
    val v19: s2 = v6(0)
    var v12: Double = v2
    val v15: Vector[s0] = v19.p1
    val v18: Double = f3(v2)
    val v25: s0 = v15(1)
    val v22: Double = v12 / v18
    val v16: Double = v25.p0
    val v33: Double = f3(v22)
    val v64: Double = v16 / v33
    v64
  }
  def benchmark(): Unit = {
    val v0: s4 = s4(s3(Vector(s2(Vector(s1(s0(0.0, Vector(Vector(1.0), Vector(2.0), Vector(3.0))), Vector(s0(4.0, Vector(Vector(5.0), Vector(6.0), Vector(7.0))))), s1(s0(8.0, Vector(Vector(9.0), Vector(10.0), Vector(11.0))), Vector(s0(12.0, Vector(Vector(13.0), Vector(14.0), Vector(15.0))))), s1(s0(16.0, Vector(Vector(17.0), Vector(18.0), Vector(19.0))), Vector(s0(20.0, Vector(Vector(21.0), Vector(22.0), Vector(23.0)))))), Vector(s0(24.0, Vector(Vector(25.0), Vector(26.0), Vector(27.0))), s0(28.0, Vector(Vector(29.0), Vector(30.0), Vector(31.0))))), s2(Vector(s1(s0(32.0, Vector(Vector(33.0), Vector(34.0), Vector(35.0))), Vector(s0(36.0, Vector(Vector(37.0), Vector(38.0), Vector(39.0))))), s1(s0(40.0, Vector(Vector(41.0), Vector(42.0), Vector(43.0))), Vector(s0(44.0, Vector(Vector(45.0), Vector(46.0), Vector(47.0))))), s1(s0(48.0, Vector(Vector(49.0), Vector(50.0), Vector(51.0))), Vector(s0(52.0, Vector(Vector(53.0), Vector(54.0), Vector(55.0)))))), Vector(s0(56.0, Vector(Vector(57.0), Vector(58.0), Vector(59.0))), s0(60.0, Vector(Vector(61.0), Vector(62.0), Vector(63.0))))), s2(Vector(s1(s0(64.0, Vector(Vector(65.0), Vector(66.0), Vector(67.0))), Vector(s0(68.0, Vector(Vector(69.0), Vector(70.0), Vector(71.0))))), s1(s0(72.0, Vector(Vector(73.0), Vector(74.0), Vector(75.0))), Vector(s0(76.0, Vector(Vector(77.0), Vector(78.0), Vector(79.0))))), s1(s0(80.0, Vector(Vector(81.0), Vector(82.0), Vector(83.0))), Vector(s0(84.0, Vector(Vector(85.0), Vector(86.0), Vector(87.0)))))), Vector(s0(88.0, Vector(Vector(89.0), Vector(90.0), Vector(91.0))), s0(92.0, Vector(Vector(93.0), Vector(94.0), Vector(95.0)))))), s1(s0(96.0, Vector(Vector(97.0), Vector(98.0), Vector(99.0))), Vector(s0(100.0, Vector(Vector(101.0), Vector(102.0), Vector(103.0)))))), Vector(s0(104.0, Vector(Vector(105.0), Vector(106.0), Vector(107.0)))))
    val v1: s11 = s11(s3(Vector(s2(Vector(s1(s0(108.0, Vector(Vector(109.0), Vector(110.0), Vector(111.0))), Vector(s0(112.0, Vector(Vector(113.0), Vector(114.0), Vector(115.0))))), s1(s0(116.0, Vector(Vector(117.0), Vector(118.0), Vector(119.0))), Vector(s0(120.0, Vector(Vector(121.0), Vector(122.0), Vector(123.0))))), s1(s0(124.0, Vector(Vector(125.0), Vector(126.0), Vector(127.0))), Vector(s0(128.0, Vector(Vector(129.0), Vector(130.0), Vector(131.0)))))), Vector(s0(132.0, Vector(Vector(133.0), Vector(134.0), Vector(135.0))), s0(136.0, Vector(Vector(137.0), Vector(138.0), Vector(139.0))))), s2(Vector(s1(s0(140.0, Vector(Vector(141.0), Vector(142.0), Vector(143.0))), Vector(s0(144.0, Vector(Vector(145.0), Vector(146.0), Vector(147.0))))), s1(s0(148.0, Vector(Vector(149.0), Vector(150.0), Vector(151.0))), Vector(s0(152.0, Vector(Vector(153.0), Vector(154.0), Vector(155.0))))), s1(s0(156.0, Vector(Vector(157.0), Vector(158.0), Vector(159.0))), Vector(s0(160.0, Vector(Vector(161.0), Vector(162.0), Vector(163.0)))))), Vector(s0(164.0, Vector(Vector(165.0), Vector(166.0), Vector(167.0))), s0(168.0, Vector(Vector(169.0), Vector(170.0), Vector(171.0))))), s2(Vector(s1(s0(172.0, Vector(Vector(173.0), Vector(174.0), Vector(175.0))), Vector(s0(176.0, Vector(Vector(177.0), Vector(178.0), Vector(179.0))))), s1(s0(180.0, Vector(Vector(181.0), Vector(182.0), Vector(183.0))), Vector(s0(184.0, Vector(Vector(185.0), Vector(186.0), Vector(187.0))))), s1(s0(188.0, Vector(Vector(189.0), Vector(190.0), Vector(191.0))), Vector(s0(192.0, Vector(Vector(193.0), Vector(194.0), Vector(195.0)))))), Vector(s0(196.0, Vector(Vector(197.0), Vector(198.0), Vector(199.0))), s0(200.0, Vector(Vector(201.0), Vector(202.0), Vector(203.0)))))), s1(s0(204.0, Vector(Vector(205.0), Vector(206.0), Vector(207.0))), Vector(s0(208.0, Vector(Vector(209.0), Vector(210.0), Vector(211.0)))))), s6(Vector(s4(s3(Vector(s2(Vector(s1(s0(212.0, Vector(Vector(213.0), Vector(214.0), Vector(215.0))), Vector(s0(216.0, Vector(Vector(217.0), Vector(218.0), Vector(219.0))))), s1(s0(220.0, Vector(Vector(221.0), Vector(222.0), Vector(223.0))), Vector(s0(224.0, Vector(Vector(225.0), Vector(226.0), Vector(227.0))))), s1(s0(228.0, Vector(Vector(229.0), Vector(230.0), Vector(231.0))), Vector(s0(232.0, Vector(Vector(233.0), Vector(234.0), Vector(235.0)))))), Vector(s0(236.0, Vector(Vector(237.0), Vector(238.0), Vector(239.0))), s0(240.0, Vector(Vector(241.0), Vector(242.0), Vector(243.0))))), s2(Vector(s1(s0(244.0, Vector(Vector(245.0), Vector(246.0), Vector(247.0))), Vector(s0(248.0, Vector(Vector(249.0), Vector(250.0), Vector(251.0))))), s1(s0(252.0, Vector(Vector(253.0), Vector(254.0), Vector(255.0))), Vector(s0(256.0, Vector(Vector(257.0), Vector(258.0), Vector(259.0))))), s1(s0(260.0, Vector(Vector(261.0), Vector(262.0), Vector(263.0))), Vector(s0(264.0, Vector(Vector(265.0), Vector(266.0), Vector(267.0)))))), Vector(s0(268.0, Vector(Vector(269.0), Vector(270.0), Vector(271.0))), s0(272.0, Vector(Vector(273.0), Vector(274.0), Vector(275.0))))), s2(Vector(s1(s0(276.0, Vector(Vector(277.0), Vector(278.0), Vector(279.0))), Vector(s0(280.0, Vector(Vector(281.0), Vector(282.0), Vector(283.0))))), s1(s0(284.0, Vector(Vector(285.0), Vector(286.0), Vector(287.0))), Vector(s0(288.0, Vector(Vector(289.0), Vector(290.0), Vector(291.0))))), s1(s0(292.0, Vector(Vector(293.0), Vector(294.0), Vector(295.0))), Vector(s0(296.0, Vector(Vector(297.0), Vector(298.0), Vector(299.0)))))), Vector(s0(300.0, Vector(Vector(301.0), Vector(302.0), Vector(303.0))), s0(304.0, Vector(Vector(305.0), Vector(306.0), Vector(307.0)))))), s1(s0(308.0, Vector(Vector(309.0), Vector(310.0), Vector(311.0))), Vector(s0(312.0, Vector(Vector(313.0), Vector(314.0), Vector(315.0)))))), Vector(s0(316.0, Vector(Vector(317.0), Vector(318.0), Vector(319.0))))), s4(s3(Vector(s2(Vector(s1(s0(320.0, Vector(Vector(321.0), Vector(322.0), Vector(323.0))), Vector(s0(324.0, Vector(Vector(325.0), Vector(326.0), Vector(327.0))))), s1(s0(328.0, Vector(Vector(329.0), Vector(330.0), Vector(331.0))), Vector(s0(332.0, Vector(Vector(333.0), Vector(334.0), Vector(335.0))))), s1(s0(336.0, Vector(Vector(337.0), Vector(338.0), Vector(339.0))), Vector(s0(340.0, Vector(Vector(341.0), Vector(342.0), Vector(343.0)))))), Vector(s0(344.0, Vector(Vector(345.0), Vector(346.0), Vector(347.0))), s0(348.0, Vector(Vector(349.0), Vector(350.0), Vector(351.0))))), s2(Vector(s1(s0(352.0, Vector(Vector(353.0), Vector(354.0), Vector(355.0))), Vector(s0(356.0, Vector(Vector(357.0), Vector(358.0), Vector(359.0))))), s1(s0(360.0, Vector(Vector(361.0), Vector(362.0), Vector(363.0))), Vector(s0(364.0, Vector(Vector(365.0), Vector(366.0), Vector(367.0))))), s1(s0(368.0, Vector(Vector(369.0), Vector(370.0), Vector(371.0))), Vector(s0(372.0, Vector(Vector(373.0), Vector(374.0), Vector(375.0)))))), Vector(s0(376.0, Vector(Vector(377.0), Vector(378.0), Vector(379.0))), s0(380.0, Vector(Vector(381.0), Vector(382.0), Vector(383.0))))), s2(Vector(s1(s0(384.0, Vector(Vector(385.0), Vector(386.0), Vector(387.0))), Vector(s0(388.0, Vector(Vector(389.0), Vector(390.0), Vector(391.0))))), s1(s0(392.0, Vector(Vector(393.0), Vector(394.0), Vector(395.0))), Vector(s0(396.0, Vector(Vector(397.0), Vector(398.0), Vector(399.0))))), s1(s0(400.0, Vector(Vector(401.0), Vector(402.0), Vector(403.0))), Vector(s0(404.0, Vector(Vector(405.0), Vector(406.0), Vector(407.0)))))), Vector(s0(408.0, Vector(Vector(409.0), Vector(410.0), Vector(411.0))), s0(412.0, Vector(Vector(413.0), Vector(414.0), Vector(415.0)))))), s1(s0(416.0, Vector(Vector(417.0), Vector(418.0), Vector(419.0))), Vector(s0(420.0, Vector(Vector(421.0), Vector(422.0), Vector(423.0)))))), Vector(s0(424.0, Vector(Vector(425.0), Vector(426.0), Vector(427.0)))))), s2(Vector(s1(s0(428.0, Vector(Vector(429.0), Vector(430.0), Vector(431.0))), Vector(s0(432.0, Vector(Vector(433.0), Vector(434.0), Vector(435.0))))), s1(s0(436.0, Vector(Vector(437.0), Vector(438.0), Vector(439.0))), Vector(s0(440.0, Vector(Vector(441.0), Vector(442.0), Vector(443.0))))), s1(s0(444.0, Vector(Vector(445.0), Vector(446.0), Vector(447.0))), Vector(s0(448.0, Vector(Vector(449.0), Vector(450.0), Vector(451.0)))))), Vector(s0(452.0, Vector(Vector(453.0), Vector(454.0), Vector(455.0))), s0(456.0, Vector(Vector(457.0), Vector(458.0), Vector(459.0)))))))
    val v2: Double = 460.0
    val start = nanoTime()
    var result: Double = 460.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}