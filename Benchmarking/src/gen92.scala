import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[Vector[s0]],
    p2: Double,
    p3: s0
  )
  case class s3 (
    p0: Vector[s0],
    p1: s0,
    p2: Vector[s0]
  )
  case class s4 (
    p0: s0,
    p1: Vector[s3],
    p2: s0
  )
  case class s5 (
    p0: s3,
    p1: Double
  )
  case class s6 (
    p0: s1,
    p1: s0
  )
  case class s7 (
    p0: Vector[Vector[s6]],
    p1: s5
  )
  def f87(v0: s4, v1: s3): s4 = {
    val v7: s0 = v1.p1
    var v3: s0 = v7
    var v6: s0 = v7
    val v8: s0 = v1.p1
    var v4: s0 = v3
    var v17: s0 = v4
    val v19: Vector[s3] = v0.p1
    var v10: s0 = v6
    val v20: Vector[Vector[Double]] = v17.p1
    val v22: Vector[Vector[Double]] = v10.p1
    val v24: Vector[Vector[Double]] = v10.p0
    v4 = v4.copy(p1 = v20)
    val v14: s4 = s4(v8, v19, v17)
    v17 = v17.copy(p0 = v20)
    var v39: Vector[Vector[Double]] = v24
    v4 = v4.copy(p1 = v39)
    v10 = v10.copy(p1 = v39)
    v6 = v6.copy(p0 = v20)
    var v68: Vector[Vector[Double]] = v22
    v3 = v3.copy(p0 = v20)
    v10 = v10.copy(p0 = v68)
    var v91: Vector[Vector[Double]] = v20
    v4 = v4.copy(p1 = v91)
    v10 = v10.copy(p1 = v20)
    v14
  }
  def f79(v0: s3): s3 = {
    var v7: s3 = v0
    var v3: s3 = v7
    val v1: Vector[s0] = v7.p2
    v7 = v7.copy(p2 = v1)
    val v4: s0 = v7.p1
    val v8: Vector[s0] = Vector(v4, v4)
    var v2: s0 = v4
    val v5: Vector[s0] = v7.p0
    val v9: Vector[s0] = v0.p0
    val v11: s0 = v9(2)
    val v18: s0 = v7.p1
    var v17: Vector[s0] = v1
    val v16: Vector[s0] = v7.p2
    v17 = v17.updated(1, v18)
    val v23: s0 = v3.p1
    v3 = v3.copy(p1 = v23)
    val v13: s0 = v8(1)
    v7 = v7.copy(p2 = v17)
    val v15: s0 = v16(1)
    var v14: Vector[s0] = v5
    val v37: Vector[Vector[Double]] = v18.p1
    v17 = v17.updated(0, v18)
    val v19: s0 = v1(0)
    val v22: s0 = v9(1)
    var v38: s3 = v7
    val v34: Vector[s0] = Vector(v22, v13, v19, v15)
    v3 = v3.copy(p0 = v14)
    var v35: Vector[s0] = v34
    val v28: Vector[s0] = v3.p2
    v35 = v35.updated(3, v23)
    v17 = v17.updated(0, v2)
    var v27: Vector[s0] = v5
    v7 = v38
    val v53: s0 = v28(1)
    var v43: Vector[s0] = v5
    v38 = v38.copy(p0 = v5)
    v17 = v28
    v2 = v13
    v17 = v17.updated(0, v22)
    val v69: s0 = v35(1)
    v3 = v3.copy(p2 = v8)
    val v60: Vector[Vector[Double]] = v11.p0
    var v85: Vector[Vector[Double]] = v60
    val v51: s0 = v5(2)
    val v100: Vector[Vector[Double]] = v53.p0
    v38 = v38.copy(p0 = v5)
    v3 = v3.copy(p0 = v5)
    v3 = v3.copy(p1 = v23)
    val v46: Vector[Double] = v37(0)
    v38 = v38.copy(p0 = v27)
    val v92: Vector[Vector[s0]] = Vector(v27, v9, v43, v5, v14)
    val v161: Vector[Vector[Double]] = v4.p0
    v38 = v38.copy(p1 = v23)
    v2 = v2.copy(p1 = v100)
    v2 = v2.copy(p0 = v161)
    val v102: Vector[s0] = v92(2)
    v3 = v3.copy(p2 = v16)
    v38 = v38.copy(p1 = v69)
    val v120: s0 = v34(0)
    v38 = v38.copy(p2 = v16)
    v17 = v17.updated(0, v19)
    val v112: s3 = s3(v102, v51, v16)
    v43 = v43.updated(2, v120)
    v38 = v38.copy(p0 = v43)
    v85 = v85.updated(2, v46)
    v2 = v2.copy(p0 = v85)
    v17 = v17.updated(0, v19)
    v112
  }
  def f77(v0: s4): s4 = {
    val v6: Vector[s3] = v0.p1
    val v3: s3 = v6(0)
    val v13: s3 = f79(v3)
    val v9: s4 = f87(v0, v13)
    v9
  }
  def f59(v0: s0, v1: s3, v2: s4): s3 = {
    var v6: s4 = v2
    val v3: Vector[Vector[Double]] = v0.p1
    var v4: s0 = v0
    val v9: s0 = v2.p0
    v4 = v4.copy(p1 = v3)
    val v10: s3 = f79(v1)
    var v12: s4 = v6
    val v22: s4 = f77(v12)
    val v17: Vector[Vector[Double]] = v0.p0
    val v14: s0 = v1.p1
    val v16: s4 = f87(v22, v10)
    v12 = v12.copy(p2 = v4)
    v4 = v4.copy(p0 = v17)
    val v27: Vector[s3] = v16.p1
    v6 = v6.copy(p0 = v9)
    val v28: s3 = v27(0)
    v12 = v12.copy(p2 = v14)
    v28
  }
  @noinline
  def f0(v0: s3, v1: Vector[s7], v2: Vector[s4], v3: Vector[s0], v4: Double): Double = {
    val v6: s4 = v2(1)
    val v7: s0 = v3(1)
    val v5: s3 = f79(v0)
    val v14: s3 = f59(v7, v5, v6)
    val v8: s5 = s5(v14, v4)
    val v53: Double = v8.p1
    var v34: Double = v53
    v34
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0))), s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0)))), s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))), Vector(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0))), s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0)))))
    val v1: Vector[s7] = Vector(s7(Vector(Vector(s6(s1(s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0), Vector(40.0), Vector(41.0))), Vector(Vector(s0(Vector(Vector(42.0), Vector(43.0), Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0))))), 48.0, s0(Vector(Vector(49.0), Vector(50.0), Vector(51.0)), Vector(Vector(52.0), Vector(53.0), Vector(54.0)))), s0(Vector(Vector(55.0), Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0), Vector(60.0))))), Vector(s6(s1(s0(Vector(Vector(61.0), Vector(62.0), Vector(63.0)), Vector(Vector(64.0), Vector(65.0), Vector(66.0))), Vector(Vector(s0(Vector(Vector(67.0), Vector(68.0), Vector(69.0)), Vector(Vector(70.0), Vector(71.0), Vector(72.0))))), 73.0, s0(Vector(Vector(74.0), Vector(75.0), Vector(76.0)), Vector(Vector(77.0), Vector(78.0), Vector(79.0)))), s0(Vector(Vector(80.0), Vector(81.0), Vector(82.0)), Vector(Vector(83.0), Vector(84.0), Vector(85.0)))))), s5(s3(Vector(s0(Vector(Vector(86.0), Vector(87.0), Vector(88.0)), Vector(Vector(89.0), Vector(90.0), Vector(91.0))), s0(Vector(Vector(92.0), Vector(93.0), Vector(94.0)), Vector(Vector(95.0), Vector(96.0), Vector(97.0))), s0(Vector(Vector(98.0), Vector(99.0), Vector(100.0)), Vector(Vector(101.0), Vector(102.0), Vector(103.0)))), s0(Vector(Vector(104.0), Vector(105.0), Vector(106.0)), Vector(Vector(107.0), Vector(108.0), Vector(109.0))), Vector(s0(Vector(Vector(110.0), Vector(111.0), Vector(112.0)), Vector(Vector(113.0), Vector(114.0), Vector(115.0))), s0(Vector(Vector(116.0), Vector(117.0), Vector(118.0)), Vector(Vector(119.0), Vector(120.0), Vector(121.0))))), 122.0)), s7(Vector(Vector(s6(s1(s0(Vector(Vector(123.0), Vector(124.0), Vector(125.0)), Vector(Vector(126.0), Vector(127.0), Vector(128.0))), Vector(Vector(s0(Vector(Vector(129.0), Vector(130.0), Vector(131.0)), Vector(Vector(132.0), Vector(133.0), Vector(134.0))))), 135.0, s0(Vector(Vector(136.0), Vector(137.0), Vector(138.0)), Vector(Vector(139.0), Vector(140.0), Vector(141.0)))), s0(Vector(Vector(142.0), Vector(143.0), Vector(144.0)), Vector(Vector(145.0), Vector(146.0), Vector(147.0))))), Vector(s6(s1(s0(Vector(Vector(148.0), Vector(149.0), Vector(150.0)), Vector(Vector(151.0), Vector(152.0), Vector(153.0))), Vector(Vector(s0(Vector(Vector(154.0), Vector(155.0), Vector(156.0)), Vector(Vector(157.0), Vector(158.0), Vector(159.0))))), 160.0, s0(Vector(Vector(161.0), Vector(162.0), Vector(163.0)), Vector(Vector(164.0), Vector(165.0), Vector(166.0)))), s0(Vector(Vector(167.0), Vector(168.0), Vector(169.0)), Vector(Vector(170.0), Vector(171.0), Vector(172.0)))))), s5(s3(Vector(s0(Vector(Vector(173.0), Vector(174.0), Vector(175.0)), Vector(Vector(176.0), Vector(177.0), Vector(178.0))), s0(Vector(Vector(179.0), Vector(180.0), Vector(181.0)), Vector(Vector(182.0), Vector(183.0), Vector(184.0))), s0(Vector(Vector(185.0), Vector(186.0), Vector(187.0)), Vector(Vector(188.0), Vector(189.0), Vector(190.0)))), s0(Vector(Vector(191.0), Vector(192.0), Vector(193.0)), Vector(Vector(194.0), Vector(195.0), Vector(196.0))), Vector(s0(Vector(Vector(197.0), Vector(198.0), Vector(199.0)), Vector(Vector(200.0), Vector(201.0), Vector(202.0))), s0(Vector(Vector(203.0), Vector(204.0), Vector(205.0)), Vector(Vector(206.0), Vector(207.0), Vector(208.0))))), 209.0)), s7(Vector(Vector(s6(s1(s0(Vector(Vector(210.0), Vector(211.0), Vector(212.0)), Vector(Vector(213.0), Vector(214.0), Vector(215.0))), Vector(Vector(s0(Vector(Vector(216.0), Vector(217.0), Vector(218.0)), Vector(Vector(219.0), Vector(220.0), Vector(221.0))))), 222.0, s0(Vector(Vector(223.0), Vector(224.0), Vector(225.0)), Vector(Vector(226.0), Vector(227.0), Vector(228.0)))), s0(Vector(Vector(229.0), Vector(230.0), Vector(231.0)), Vector(Vector(232.0), Vector(233.0), Vector(234.0))))), Vector(s6(s1(s0(Vector(Vector(235.0), Vector(236.0), Vector(237.0)), Vector(Vector(238.0), Vector(239.0), Vector(240.0))), Vector(Vector(s0(Vector(Vector(241.0), Vector(242.0), Vector(243.0)), Vector(Vector(244.0), Vector(245.0), Vector(246.0))))), 247.0, s0(Vector(Vector(248.0), Vector(249.0), Vector(250.0)), Vector(Vector(251.0), Vector(252.0), Vector(253.0)))), s0(Vector(Vector(254.0), Vector(255.0), Vector(256.0)), Vector(Vector(257.0), Vector(258.0), Vector(259.0)))))), s5(s3(Vector(s0(Vector(Vector(260.0), Vector(261.0), Vector(262.0)), Vector(Vector(263.0), Vector(264.0), Vector(265.0))), s0(Vector(Vector(266.0), Vector(267.0), Vector(268.0)), Vector(Vector(269.0), Vector(270.0), Vector(271.0))), s0(Vector(Vector(272.0), Vector(273.0), Vector(274.0)), Vector(Vector(275.0), Vector(276.0), Vector(277.0)))), s0(Vector(Vector(278.0), Vector(279.0), Vector(280.0)), Vector(Vector(281.0), Vector(282.0), Vector(283.0))), Vector(s0(Vector(Vector(284.0), Vector(285.0), Vector(286.0)), Vector(Vector(287.0), Vector(288.0), Vector(289.0))), s0(Vector(Vector(290.0), Vector(291.0), Vector(292.0)), Vector(Vector(293.0), Vector(294.0), Vector(295.0))))), 296.0)))
    val v2: Vector[s4] = Vector(s4(s0(Vector(Vector(297.0), Vector(298.0), Vector(299.0)), Vector(Vector(300.0), Vector(301.0), Vector(302.0))), Vector(s3(Vector(s0(Vector(Vector(303.0), Vector(304.0), Vector(305.0)), Vector(Vector(306.0), Vector(307.0), Vector(308.0))), s0(Vector(Vector(309.0), Vector(310.0), Vector(311.0)), Vector(Vector(312.0), Vector(313.0), Vector(314.0))), s0(Vector(Vector(315.0), Vector(316.0), Vector(317.0)), Vector(Vector(318.0), Vector(319.0), Vector(320.0)))), s0(Vector(Vector(321.0), Vector(322.0), Vector(323.0)), Vector(Vector(324.0), Vector(325.0), Vector(326.0))), Vector(s0(Vector(Vector(327.0), Vector(328.0), Vector(329.0)), Vector(Vector(330.0), Vector(331.0), Vector(332.0))), s0(Vector(Vector(333.0), Vector(334.0), Vector(335.0)), Vector(Vector(336.0), Vector(337.0), Vector(338.0)))))), s0(Vector(Vector(339.0), Vector(340.0), Vector(341.0)), Vector(Vector(342.0), Vector(343.0), Vector(344.0)))), s4(s0(Vector(Vector(345.0), Vector(346.0), Vector(347.0)), Vector(Vector(348.0), Vector(349.0), Vector(350.0))), Vector(s3(Vector(s0(Vector(Vector(351.0), Vector(352.0), Vector(353.0)), Vector(Vector(354.0), Vector(355.0), Vector(356.0))), s0(Vector(Vector(357.0), Vector(358.0), Vector(359.0)), Vector(Vector(360.0), Vector(361.0), Vector(362.0))), s0(Vector(Vector(363.0), Vector(364.0), Vector(365.0)), Vector(Vector(366.0), Vector(367.0), Vector(368.0)))), s0(Vector(Vector(369.0), Vector(370.0), Vector(371.0)), Vector(Vector(372.0), Vector(373.0), Vector(374.0))), Vector(s0(Vector(Vector(375.0), Vector(376.0), Vector(377.0)), Vector(Vector(378.0), Vector(379.0), Vector(380.0))), s0(Vector(Vector(381.0), Vector(382.0), Vector(383.0)), Vector(Vector(384.0), Vector(385.0), Vector(386.0)))))), s0(Vector(Vector(387.0), Vector(388.0), Vector(389.0)), Vector(Vector(390.0), Vector(391.0), Vector(392.0)))))
    val v3: Vector[s0] = Vector(s0(Vector(Vector(393.0), Vector(394.0), Vector(395.0)), Vector(Vector(396.0), Vector(397.0), Vector(398.0))), s0(Vector(Vector(399.0), Vector(400.0), Vector(401.0)), Vector(Vector(402.0), Vector(403.0), Vector(404.0))), s0(Vector(Vector(405.0), Vector(406.0), Vector(407.0)), Vector(Vector(408.0), Vector(409.0), Vector(410.0))))
    val v4: Double = 411.0
    val start = nanoTime()
    var result: Double = 411.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}