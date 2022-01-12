import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0],
    p2: s0
  )
  case class s2 (
    p0: Double,
    p1: Vector[s0],
    p2: Vector[Vector[s0]],
    p3: Vector[s1]
  )
  case class s3 (
    p0: Vector[s1],
    p1: s2
  )
  case class s4 (
    p0: Vector[s1],
    p1: s3
  )
  case class s5 (
    p0: s1,
    p1: s1
  )
  case class s7 (
    p0: s1,
    p1: s4
  )
  case class s9 (
    p0: s3,
    p1: s2
  )
  case class s12 (
    p0: s7,
    p1: s9
  )
  def f107(v0: s2): s2 = {
    val v3: Vector[Vector[s0]] = v0.p2
    var v6: Vector[Vector[s0]] = v3
    val v2: Double = v0.p0
    var v7: Vector[Vector[s0]] = v3
    val v11: Vector[s0] = v6(1)
    v6 = v6.updated(1, v11)
    val v5: Vector[s0] = v6(0)
    var v1: Double = v2
    var v13: Double = v2
    var v10: s2 = v0
    val v8: Vector[s1] = v10.p3
    val v14: Vector[s0] = v3(0)
    val v23: Vector[s1] = v0.p3
    v6 = v6.updated(0, v14)
    val v30: Vector[s0] = v6(1)
    v10 = v10.copy(p0 = v2)
    var v15: Vector[Vector[s0]] = v7
    val v44: s0 = v5(0)
    var v40: s2 = v10
    v6 = v6.updated(0, v5)
    val v43: Vector[s1] = v0.p3
    val v28: s1 = v43(0)
    val v51: Vector[Vector[s0]] = v0.p2
    val v56: Vector[Vector[Double]] = v44.p0
    val v72: Vector[s0] = v51(1)
    var v62: Vector[Vector[Double]] = v56
    v7 = v7.updated(1, v30)
    v40 = v40.copy(p2 = v15)
    val v41: Vector[Double] = v62(1)
    var v75: Double = v1
    val v48: s1 = v23(1)
    val v66: s5 = s5(v48, v48)
    v10 = v10.copy(p3 = v43)
    var v53: Vector[s1] = v8
    var v49: s2 = v0
    val v103: Double = v41(0)
    v40 = v40.copy(p2 = v51)
    var v95: Vector[s1] = v23
    val v78: s1 = v66.p1
    val v58: Double = v41(0)
    val v42: Vector[s0] = v40.p1
    val v85: Vector[s1] = v10.p3
    val v112: s5 = s5(v28, v78)
    v10 = v10.copy(p3 = v95)
    v62 = v62.updated(0, v41)
    v49 = v49.copy(p3 = v53)
    v15 = v15.updated(1, v11)
    val v150: Vector[s0] = v3(1)
    v7 = v7.updated(1, v72)
    v6 = v6.updated(1, v150)
    val v160: s1 = v112.p1
    var v106: Vector[s0] = v42
    v49 = v49.copy(p0 = v103)
    val v138: Vector[s0] = v49.p1
    v53 = v53.updated(1, v160)
    var v216: Double = v13
    v40 = v40.copy(p0 = v216)
    v13 = v75
    val v193: s2 = s2(v58, v106, v7, v85)
    v10 = v10.copy(p1 = v138)
    v193
  }
  @noinline
  def f0(v0: s12, v1: s9, v2: Double): Double = {
    var v5: Double = v2
    val v6: s2 = v1.p1
    var v4: s2 = v6
    val v10: s2 = v1.p1
    val v14: Vector[Vector[s0]] = v4.p2
    val v16: Vector[s1] = v10.p3
    val v13: s2 = f107(v10)
    val v22: Vector[s0] = v14(0)
    val v25: s0 = v22(0)
    v4 = v4.copy(p3 = v16)
    val v32: Double = v13.p0
    val v39: Double = v32 / v5
    val v70: Vector[Vector[Double]] = v25.p0
    var v47: Vector[Vector[Double]] = v70
    v4 = v4.copy(p0 = v5)
    v4 = v4.copy(p0 = v39)
    val v82: Vector[Double] = v47(1)
    val v112: Double = v82(0)
    v112
  }
  def benchmark(): Unit = {
    val v0: s12 = s12(s7(s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0))), Vector(s0(Vector(Vector(3.0), Vector(4.0), Vector(5.0))), s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0))), s0(Vector(Vector(9.0), Vector(10.0), Vector(11.0)))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)))), s4(Vector(s1(s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0))), Vector(s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0))), s0(Vector(Vector(21.0), Vector(22.0), Vector(23.0))), s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)))), s0(Vector(Vector(27.0), Vector(28.0), Vector(29.0)))), s1(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0))), Vector(s0(Vector(Vector(33.0), Vector(34.0), Vector(35.0))), s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0))), s0(Vector(Vector(39.0), Vector(40.0), Vector(41.0)))), s0(Vector(Vector(42.0), Vector(43.0), Vector(44.0))))), s3(Vector(s1(s0(Vector(Vector(45.0), Vector(46.0), Vector(47.0))), Vector(s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0))), s0(Vector(Vector(51.0), Vector(52.0), Vector(53.0))), s0(Vector(Vector(54.0), Vector(55.0), Vector(56.0)))), s0(Vector(Vector(57.0), Vector(58.0), Vector(59.0)))), s1(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0))), Vector(s0(Vector(Vector(63.0), Vector(64.0), Vector(65.0))), s0(Vector(Vector(66.0), Vector(67.0), Vector(68.0))), s0(Vector(Vector(69.0), Vector(70.0), Vector(71.0)))), s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)))), s1(s0(Vector(Vector(75.0), Vector(76.0), Vector(77.0))), Vector(s0(Vector(Vector(78.0), Vector(79.0), Vector(80.0))), s0(Vector(Vector(81.0), Vector(82.0), Vector(83.0))), s0(Vector(Vector(84.0), Vector(85.0), Vector(86.0)))), s0(Vector(Vector(87.0), Vector(88.0), Vector(89.0))))), s2(90.0, Vector(s0(Vector(Vector(91.0), Vector(92.0), Vector(93.0))), s0(Vector(Vector(94.0), Vector(95.0), Vector(96.0))), s0(Vector(Vector(97.0), Vector(98.0), Vector(99.0)))), Vector(Vector(s0(Vector(Vector(100.0), Vector(101.0), Vector(102.0)))), Vector(s0(Vector(Vector(103.0), Vector(104.0), Vector(105.0))))), Vector(s1(s0(Vector(Vector(106.0), Vector(107.0), Vector(108.0))), Vector(s0(Vector(Vector(109.0), Vector(110.0), Vector(111.0))), s0(Vector(Vector(112.0), Vector(113.0), Vector(114.0))), s0(Vector(Vector(115.0), Vector(116.0), Vector(117.0)))), s0(Vector(Vector(118.0), Vector(119.0), Vector(120.0)))), s1(s0(Vector(Vector(121.0), Vector(122.0), Vector(123.0))), Vector(s0(Vector(Vector(124.0), Vector(125.0), Vector(126.0))), s0(Vector(Vector(127.0), Vector(128.0), Vector(129.0))), s0(Vector(Vector(130.0), Vector(131.0), Vector(132.0)))), s0(Vector(Vector(133.0), Vector(134.0), Vector(135.0))))))))), s9(s3(Vector(s1(s0(Vector(Vector(136.0), Vector(137.0), Vector(138.0))), Vector(s0(Vector(Vector(139.0), Vector(140.0), Vector(141.0))), s0(Vector(Vector(142.0), Vector(143.0), Vector(144.0))), s0(Vector(Vector(145.0), Vector(146.0), Vector(147.0)))), s0(Vector(Vector(148.0), Vector(149.0), Vector(150.0)))), s1(s0(Vector(Vector(151.0), Vector(152.0), Vector(153.0))), Vector(s0(Vector(Vector(154.0), Vector(155.0), Vector(156.0))), s0(Vector(Vector(157.0), Vector(158.0), Vector(159.0))), s0(Vector(Vector(160.0), Vector(161.0), Vector(162.0)))), s0(Vector(Vector(163.0), Vector(164.0), Vector(165.0)))), s1(s0(Vector(Vector(166.0), Vector(167.0), Vector(168.0))), Vector(s0(Vector(Vector(169.0), Vector(170.0), Vector(171.0))), s0(Vector(Vector(172.0), Vector(173.0), Vector(174.0))), s0(Vector(Vector(175.0), Vector(176.0), Vector(177.0)))), s0(Vector(Vector(178.0), Vector(179.0), Vector(180.0))))), s2(181.0, Vector(s0(Vector(Vector(182.0), Vector(183.0), Vector(184.0))), s0(Vector(Vector(185.0), Vector(186.0), Vector(187.0))), s0(Vector(Vector(188.0), Vector(189.0), Vector(190.0)))), Vector(Vector(s0(Vector(Vector(191.0), Vector(192.0), Vector(193.0)))), Vector(s0(Vector(Vector(194.0), Vector(195.0), Vector(196.0))))), Vector(s1(s0(Vector(Vector(197.0), Vector(198.0), Vector(199.0))), Vector(s0(Vector(Vector(200.0), Vector(201.0), Vector(202.0))), s0(Vector(Vector(203.0), Vector(204.0), Vector(205.0))), s0(Vector(Vector(206.0), Vector(207.0), Vector(208.0)))), s0(Vector(Vector(209.0), Vector(210.0), Vector(211.0)))), s1(s0(Vector(Vector(212.0), Vector(213.0), Vector(214.0))), Vector(s0(Vector(Vector(215.0), Vector(216.0), Vector(217.0))), s0(Vector(Vector(218.0), Vector(219.0), Vector(220.0))), s0(Vector(Vector(221.0), Vector(222.0), Vector(223.0)))), s0(Vector(Vector(224.0), Vector(225.0), Vector(226.0))))))), s2(227.0, Vector(s0(Vector(Vector(228.0), Vector(229.0), Vector(230.0))), s0(Vector(Vector(231.0), Vector(232.0), Vector(233.0))), s0(Vector(Vector(234.0), Vector(235.0), Vector(236.0)))), Vector(Vector(s0(Vector(Vector(237.0), Vector(238.0), Vector(239.0)))), Vector(s0(Vector(Vector(240.0), Vector(241.0), Vector(242.0))))), Vector(s1(s0(Vector(Vector(243.0), Vector(244.0), Vector(245.0))), Vector(s0(Vector(Vector(246.0), Vector(247.0), Vector(248.0))), s0(Vector(Vector(249.0), Vector(250.0), Vector(251.0))), s0(Vector(Vector(252.0), Vector(253.0), Vector(254.0)))), s0(Vector(Vector(255.0), Vector(256.0), Vector(257.0)))), s1(s0(Vector(Vector(258.0), Vector(259.0), Vector(260.0))), Vector(s0(Vector(Vector(261.0), Vector(262.0), Vector(263.0))), s0(Vector(Vector(264.0), Vector(265.0), Vector(266.0))), s0(Vector(Vector(267.0), Vector(268.0), Vector(269.0)))), s0(Vector(Vector(270.0), Vector(271.0), Vector(272.0))))))))
    val v1: s9 = s9(s3(Vector(s1(s0(Vector(Vector(273.0), Vector(274.0), Vector(275.0))), Vector(s0(Vector(Vector(276.0), Vector(277.0), Vector(278.0))), s0(Vector(Vector(279.0), Vector(280.0), Vector(281.0))), s0(Vector(Vector(282.0), Vector(283.0), Vector(284.0)))), s0(Vector(Vector(285.0), Vector(286.0), Vector(287.0)))), s1(s0(Vector(Vector(288.0), Vector(289.0), Vector(290.0))), Vector(s0(Vector(Vector(291.0), Vector(292.0), Vector(293.0))), s0(Vector(Vector(294.0), Vector(295.0), Vector(296.0))), s0(Vector(Vector(297.0), Vector(298.0), Vector(299.0)))), s0(Vector(Vector(300.0), Vector(301.0), Vector(302.0)))), s1(s0(Vector(Vector(303.0), Vector(304.0), Vector(305.0))), Vector(s0(Vector(Vector(306.0), Vector(307.0), Vector(308.0))), s0(Vector(Vector(309.0), Vector(310.0), Vector(311.0))), s0(Vector(Vector(312.0), Vector(313.0), Vector(314.0)))), s0(Vector(Vector(315.0), Vector(316.0), Vector(317.0))))), s2(318.0, Vector(s0(Vector(Vector(319.0), Vector(320.0), Vector(321.0))), s0(Vector(Vector(322.0), Vector(323.0), Vector(324.0))), s0(Vector(Vector(325.0), Vector(326.0), Vector(327.0)))), Vector(Vector(s0(Vector(Vector(328.0), Vector(329.0), Vector(330.0)))), Vector(s0(Vector(Vector(331.0), Vector(332.0), Vector(333.0))))), Vector(s1(s0(Vector(Vector(334.0), Vector(335.0), Vector(336.0))), Vector(s0(Vector(Vector(337.0), Vector(338.0), Vector(339.0))), s0(Vector(Vector(340.0), Vector(341.0), Vector(342.0))), s0(Vector(Vector(343.0), Vector(344.0), Vector(345.0)))), s0(Vector(Vector(346.0), Vector(347.0), Vector(348.0)))), s1(s0(Vector(Vector(349.0), Vector(350.0), Vector(351.0))), Vector(s0(Vector(Vector(352.0), Vector(353.0), Vector(354.0))), s0(Vector(Vector(355.0), Vector(356.0), Vector(357.0))), s0(Vector(Vector(358.0), Vector(359.0), Vector(360.0)))), s0(Vector(Vector(361.0), Vector(362.0), Vector(363.0))))))), s2(364.0, Vector(s0(Vector(Vector(365.0), Vector(366.0), Vector(367.0))), s0(Vector(Vector(368.0), Vector(369.0), Vector(370.0))), s0(Vector(Vector(371.0), Vector(372.0), Vector(373.0)))), Vector(Vector(s0(Vector(Vector(374.0), Vector(375.0), Vector(376.0)))), Vector(s0(Vector(Vector(377.0), Vector(378.0), Vector(379.0))))), Vector(s1(s0(Vector(Vector(380.0), Vector(381.0), Vector(382.0))), Vector(s0(Vector(Vector(383.0), Vector(384.0), Vector(385.0))), s0(Vector(Vector(386.0), Vector(387.0), Vector(388.0))), s0(Vector(Vector(389.0), Vector(390.0), Vector(391.0)))), s0(Vector(Vector(392.0), Vector(393.0), Vector(394.0)))), s1(s0(Vector(Vector(395.0), Vector(396.0), Vector(397.0))), Vector(s0(Vector(Vector(398.0), Vector(399.0), Vector(400.0))), s0(Vector(Vector(401.0), Vector(402.0), Vector(403.0))), s0(Vector(Vector(404.0), Vector(405.0), Vector(406.0)))), s0(Vector(Vector(407.0), Vector(408.0), Vector(409.0)))))))
    val v2: Double = 410.0
    val start = nanoTime()
    var result: Double = 410.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}