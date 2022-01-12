import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]],
    p3: Vector[Vector[Double]],
    p4: Vector[Vector[Double]],
    p5: Vector[Vector[Double]],
    p6: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: s0,
    p1: Vector[s0],
    p2: s1,
    p3: Double,
    p4: s0,
    p5: s1
  )
  case class s3 (
    p0: s0,
    p1: s1
  )
  def f30(v0: s1): s1 = {
    val v6: s0 = v0.p1
    val v11: s0 = v0.p1
    val v7: s1 = s1(v11, v6)
    val v5: s0 = v0.p1
    val v9: s0 = v0.p1
    val v18: Vector[Vector[Double]] = v9.p0
    var v26: s0 = v5
    var v43: s1 = v7
    val v50: Vector[Vector[Double]] = v11.p4
    val v39: s0 = v0.p0
    val v31: s1 = s1(v26, v39)
    v43 = v43.copy(p0 = v6)
    val v33: s0 = v31.p0
    v26 = v26.copy(p0 = v18)
    v26 = v26.copy(p4 = v50)
    val v25: s3 = s3(v33, v7)
    val v38: s1 = v25.p1
    var v152: s1 = v43
    var v114: s1 = v152
    v114 = v38
    v114
  }
  def f18(v0: s1, v1: s1): s1 = {
    val v5: s0 = v1.p0
    val v3: s0 = v1.p0
    val v4: s0 = v0.p1
    var v8: s1 = v1
    val v6: Vector[s0] = Vector(v4, v4, v4, v4, v5, v4, v3)
    val v15: s0 = v6(1)
    val v9: s0 = v6(1)
    val v25: s1 = f30(v8)
    val v22: s0 = v6(0)
    v8 = v8.copy(p1 = v22)
    var v41: s1 = v25
    v8 = v8.copy(p1 = v9)
    v41 = v41.copy(p0 = v15)
    val v33: s1 = f30(v41)
    val v73: s0 = v6(5)
    v8 = v8.copy(p1 = v73)
    val v97: s0 = v1.p1
    val v153: s1 = f30(v33)
    v41 = v41.copy(p1 = v97)
    val v123: s0 = v1.p0
    var v112: s1 = v153
    v112 = v112.copy(p1 = v123)
    v112
  }
  def f14(v0: s0): s0 = {
    val v3: Vector[Vector[Double]] = v0.p0
    var v7: s0 = v0
    var v2: s0 = v0
    val v1: Vector[Double] = v3(0)
    var v5: Vector[Double] = v1
    val v9: Vector[Vector[Double]] = Vector(v5)
    var v8: s0 = v0
    v2 = v2.copy(p3 = v9)
    val v10: Vector[Vector[Double]] = v7.p4
    val v11: Vector[Vector[Double]] = v2.p6
    v2 = v8
    v7 = v8
    v2 = v2.copy(p0 = v3)
    val v27: Vector[Vector[Double]] = v7.p3
    v2 = v2.copy(p1 = v10)
    val v23: s0 = s0(v3, v10, v3, v27, v10, v3, v11)
    v23
  }
  def f6(v0: s0, v1: s1, v2: s1, v3: s1): s1 = {
    val v15: s1 = f30(v3)
    val v34: s1 = f30(v15)
    val v71: s1 = f18(v1, v1)
    val v37: s1 = f30(v34)
    val v32: s1 = f18(v37, v71)
    val v47: s0 = v32.p0
    val v124: s3 = s3(v47, v2)
    var v159: s1 = v71
    val v146: s1 = v124.p1
    v159 = v159.copy(p1 = v47)
    val v136: s1 = f18(v146, v159)
    v136
  }
  def f4(v0: s0, v1: s1): s1 = {
    val v4: Vector[Vector[Double]] = v0.p6
    val v2: s0 = f14(v0)
    val v3: Vector[Double] = v4(1)
    var v7: Vector[Vector[Double]] = v4
    val v8: Vector[Vector[Double]] = v2.p3
    val v9: Vector[Double] = v8(0)
    v7 = v7.updated(0, v3)
    val v14: s1 = f30(v1)
    v7 = v7.updated(0, v9)
    var v5: Vector[Double] = v9
    val v22: s1 = f18(v1, v14)
    val v10: s0 = f14(v2)
    val v24: Vector[Double] = v8(0)
    var v38: Vector[Vector[Double]] = v4
    val v30: Vector[Vector[Vector[Double]]] = Vector(v8, v8, v8, v8, v8, v8)
    val v17: Vector[Vector[Double]] = v0.p4
    var v43: s1 = v22
    val v26: s1 = f18(v43, v22)
    v38 = v38.updated(0, v3)
    v7 = v7.updated(0, v9)
    val v21: Vector[Vector[Double]] = v30(4)
    v38 = v38.updated(0, v5)
    var v44: Vector[Vector[Double]] = v7
    val v19: s0 = s0(v44, v17, v38, v21, v17, v4, v44)
    v43 = v43.copy(p0 = v10)
    v7 = v7.updated(1, v24)
    val v40: s0 = f14(v19)
    var v28: s1 = v1
    val v33: s1 = f6(v0, v28, v26, v22)
    v43 = v43.copy(p0 = v40)
    v28 = v28.copy(p1 = v40)
    v33
  }
  @noinline
  def f0(v0: s0, v1: Vector[s2], v2: Vector[Vector[s0]], v3: s1, v4: Vector[s0], v5: Double): Double = {
    val v24: s1 = f18(v3, v3)
    val v25: s0 = f14(v0)
    val v28: s1 = f4(v25, v24)
    val v31: s0 = v28.p1
    val v48: Vector[Vector[Double]] = v31.p4
    val v38: Vector[Double] = v48(1)
    val v78: Double = v38(0)
    val v70: Double = v38(0)
    var v141: Double = v78
    val v96: Double = v141 - v70
    v96
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0)), Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0)), Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0)))
    val v1: Vector[s2] = Vector(s2(s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0)), Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0)), Vector(Vector(23.0), Vector(24.0), Vector(25.0)), Vector(Vector(26.0), Vector(27.0)), Vector(Vector(28.0), Vector(29.0))), Vector(s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0), Vector(33.0), Vector(34.0)), Vector(Vector(35.0), Vector(36.0)), Vector(Vector(37.0)), Vector(Vector(38.0), Vector(39.0), Vector(40.0)), Vector(Vector(41.0), Vector(42.0)), Vector(Vector(43.0), Vector(44.0)))), s1(s0(Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0), Vector(48.0), Vector(49.0)), Vector(Vector(50.0), Vector(51.0)), Vector(Vector(52.0)), Vector(Vector(53.0), Vector(54.0), Vector(55.0)), Vector(Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0))), s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0), Vector(63.0), Vector(64.0)), Vector(Vector(65.0), Vector(66.0)), Vector(Vector(67.0)), Vector(Vector(68.0), Vector(69.0), Vector(70.0)), Vector(Vector(71.0), Vector(72.0)), Vector(Vector(73.0), Vector(74.0)))), 75.0, s0(Vector(Vector(76.0), Vector(77.0)), Vector(Vector(78.0), Vector(79.0), Vector(80.0)), Vector(Vector(81.0), Vector(82.0)), Vector(Vector(83.0)), Vector(Vector(84.0), Vector(85.0), Vector(86.0)), Vector(Vector(87.0), Vector(88.0)), Vector(Vector(89.0), Vector(90.0))), s1(s0(Vector(Vector(91.0), Vector(92.0)), Vector(Vector(93.0), Vector(94.0), Vector(95.0)), Vector(Vector(96.0), Vector(97.0)), Vector(Vector(98.0)), Vector(Vector(99.0), Vector(100.0), Vector(101.0)), Vector(Vector(102.0), Vector(103.0)), Vector(Vector(104.0), Vector(105.0))), s0(Vector(Vector(106.0), Vector(107.0)), Vector(Vector(108.0), Vector(109.0), Vector(110.0)), Vector(Vector(111.0), Vector(112.0)), Vector(Vector(113.0)), Vector(Vector(114.0), Vector(115.0), Vector(116.0)), Vector(Vector(117.0), Vector(118.0)), Vector(Vector(119.0), Vector(120.0))))), s2(s0(Vector(Vector(121.0), Vector(122.0)), Vector(Vector(123.0), Vector(124.0), Vector(125.0)), Vector(Vector(126.0), Vector(127.0)), Vector(Vector(128.0)), Vector(Vector(129.0), Vector(130.0), Vector(131.0)), Vector(Vector(132.0), Vector(133.0)), Vector(Vector(134.0), Vector(135.0))), Vector(s0(Vector(Vector(136.0), Vector(137.0)), Vector(Vector(138.0), Vector(139.0), Vector(140.0)), Vector(Vector(141.0), Vector(142.0)), Vector(Vector(143.0)), Vector(Vector(144.0), Vector(145.0), Vector(146.0)), Vector(Vector(147.0), Vector(148.0)), Vector(Vector(149.0), Vector(150.0)))), s1(s0(Vector(Vector(151.0), Vector(152.0)), Vector(Vector(153.0), Vector(154.0), Vector(155.0)), Vector(Vector(156.0), Vector(157.0)), Vector(Vector(158.0)), Vector(Vector(159.0), Vector(160.0), Vector(161.0)), Vector(Vector(162.0), Vector(163.0)), Vector(Vector(164.0), Vector(165.0))), s0(Vector(Vector(166.0), Vector(167.0)), Vector(Vector(168.0), Vector(169.0), Vector(170.0)), Vector(Vector(171.0), Vector(172.0)), Vector(Vector(173.0)), Vector(Vector(174.0), Vector(175.0), Vector(176.0)), Vector(Vector(177.0), Vector(178.0)), Vector(Vector(179.0), Vector(180.0)))), 181.0, s0(Vector(Vector(182.0), Vector(183.0)), Vector(Vector(184.0), Vector(185.0), Vector(186.0)), Vector(Vector(187.0), Vector(188.0)), Vector(Vector(189.0)), Vector(Vector(190.0), Vector(191.0), Vector(192.0)), Vector(Vector(193.0), Vector(194.0)), Vector(Vector(195.0), Vector(196.0))), s1(s0(Vector(Vector(197.0), Vector(198.0)), Vector(Vector(199.0), Vector(200.0), Vector(201.0)), Vector(Vector(202.0), Vector(203.0)), Vector(Vector(204.0)), Vector(Vector(205.0), Vector(206.0), Vector(207.0)), Vector(Vector(208.0), Vector(209.0)), Vector(Vector(210.0), Vector(211.0))), s0(Vector(Vector(212.0), Vector(213.0)), Vector(Vector(214.0), Vector(215.0), Vector(216.0)), Vector(Vector(217.0), Vector(218.0)), Vector(Vector(219.0)), Vector(Vector(220.0), Vector(221.0), Vector(222.0)), Vector(Vector(223.0), Vector(224.0)), Vector(Vector(225.0), Vector(226.0))))), s2(s0(Vector(Vector(227.0), Vector(228.0)), Vector(Vector(229.0), Vector(230.0), Vector(231.0)), Vector(Vector(232.0), Vector(233.0)), Vector(Vector(234.0)), Vector(Vector(235.0), Vector(236.0), Vector(237.0)), Vector(Vector(238.0), Vector(239.0)), Vector(Vector(240.0), Vector(241.0))), Vector(s0(Vector(Vector(242.0), Vector(243.0)), Vector(Vector(244.0), Vector(245.0), Vector(246.0)), Vector(Vector(247.0), Vector(248.0)), Vector(Vector(249.0)), Vector(Vector(250.0), Vector(251.0), Vector(252.0)), Vector(Vector(253.0), Vector(254.0)), Vector(Vector(255.0), Vector(256.0)))), s1(s0(Vector(Vector(257.0), Vector(258.0)), Vector(Vector(259.0), Vector(260.0), Vector(261.0)), Vector(Vector(262.0), Vector(263.0)), Vector(Vector(264.0)), Vector(Vector(265.0), Vector(266.0), Vector(267.0)), Vector(Vector(268.0), Vector(269.0)), Vector(Vector(270.0), Vector(271.0))), s0(Vector(Vector(272.0), Vector(273.0)), Vector(Vector(274.0), Vector(275.0), Vector(276.0)), Vector(Vector(277.0), Vector(278.0)), Vector(Vector(279.0)), Vector(Vector(280.0), Vector(281.0), Vector(282.0)), Vector(Vector(283.0), Vector(284.0)), Vector(Vector(285.0), Vector(286.0)))), 287.0, s0(Vector(Vector(288.0), Vector(289.0)), Vector(Vector(290.0), Vector(291.0), Vector(292.0)), Vector(Vector(293.0), Vector(294.0)), Vector(Vector(295.0)), Vector(Vector(296.0), Vector(297.0), Vector(298.0)), Vector(Vector(299.0), Vector(300.0)), Vector(Vector(301.0), Vector(302.0))), s1(s0(Vector(Vector(303.0), Vector(304.0)), Vector(Vector(305.0), Vector(306.0), Vector(307.0)), Vector(Vector(308.0), Vector(309.0)), Vector(Vector(310.0)), Vector(Vector(311.0), Vector(312.0), Vector(313.0)), Vector(Vector(314.0), Vector(315.0)), Vector(Vector(316.0), Vector(317.0))), s0(Vector(Vector(318.0), Vector(319.0)), Vector(Vector(320.0), Vector(321.0), Vector(322.0)), Vector(Vector(323.0), Vector(324.0)), Vector(Vector(325.0)), Vector(Vector(326.0), Vector(327.0), Vector(328.0)), Vector(Vector(329.0), Vector(330.0)), Vector(Vector(331.0), Vector(332.0))))))
    val v2: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(333.0), Vector(334.0)), Vector(Vector(335.0), Vector(336.0), Vector(337.0)), Vector(Vector(338.0), Vector(339.0)), Vector(Vector(340.0)), Vector(Vector(341.0), Vector(342.0), Vector(343.0)), Vector(Vector(344.0), Vector(345.0)), Vector(Vector(346.0), Vector(347.0)))), Vector(s0(Vector(Vector(348.0), Vector(349.0)), Vector(Vector(350.0), Vector(351.0), Vector(352.0)), Vector(Vector(353.0), Vector(354.0)), Vector(Vector(355.0)), Vector(Vector(356.0), Vector(357.0), Vector(358.0)), Vector(Vector(359.0), Vector(360.0)), Vector(Vector(361.0), Vector(362.0)))))
    val v3: s1 = s1(s0(Vector(Vector(363.0), Vector(364.0)), Vector(Vector(365.0), Vector(366.0), Vector(367.0)), Vector(Vector(368.0), Vector(369.0)), Vector(Vector(370.0)), Vector(Vector(371.0), Vector(372.0), Vector(373.0)), Vector(Vector(374.0), Vector(375.0)), Vector(Vector(376.0), Vector(377.0))), s0(Vector(Vector(378.0), Vector(379.0)), Vector(Vector(380.0), Vector(381.0), Vector(382.0)), Vector(Vector(383.0), Vector(384.0)), Vector(Vector(385.0)), Vector(Vector(386.0), Vector(387.0), Vector(388.0)), Vector(Vector(389.0), Vector(390.0)), Vector(Vector(391.0), Vector(392.0))))
    val v4: Vector[s0] = Vector(s0(Vector(Vector(393.0), Vector(394.0)), Vector(Vector(395.0), Vector(396.0), Vector(397.0)), Vector(Vector(398.0), Vector(399.0)), Vector(Vector(400.0)), Vector(Vector(401.0), Vector(402.0), Vector(403.0)), Vector(Vector(404.0), Vector(405.0)), Vector(Vector(406.0), Vector(407.0))))
    val v5: Double = 408.0
    val start = nanoTime()
    var result: Double = 408.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4, v5)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}