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
  case class s3 (
    p0: s0,
    p1: Vector[s1]
  )
  case class s4 (
    p0: s1,
    p1: s1
  )
  case class s5 (
    p0: s0,
    p1: s4
  )
  case class s8 (
    p0: s1,
    p1: s5
  )
  case class s10 (
    p0: Vector[s5],
    p1: Vector[Vector[s4]]
  )
  case class s11 (
    p0: s1,
    p1: Vector[s3]
  )
  def f65(v0: s1): s1 = {
    var v4: s1 = v0
    val v5: s4 = s4(v0, v0)
    val v2: s0 = v4.p0
    val v1: Vector[Vector[Double]] = v2.p1
    val v3: s1 = v5.p0
    val v7: Vector[Double] = v1(1)
    v4 = v4.copy(p0 = v2)
    var v14: s0 = v2
    var v8: s1 = v3
    val v13: s0 = s0(v1, v1)
    var v18: s1 = v3
    v4 = v4.copy(p1 = v13)
    val v29: Vector[Double] = v1(0)
    val v35: Vector[s1] = Vector(v4, v18)
    v18 = v8
    val v37: s0 = v18.p0
    v14 = v14.copy(p1 = v1)
    var v23: Vector[Vector[Double]] = v1
    val v38: Vector[Vector[Double]] = v2.p1
    v18 = v18.copy(p0 = v14)
    val v89: Vector[Vector[Vector[Double]]] = Vector(v38)
    val v47: s0 = v8.p1
    val v123: s1 = v35(0)
    v23 = v23.updated(1, v7)
    v14 = v14.copy(p1 = v23)
    v18 = v18.copy(p0 = v37)
    v18 = v123
    val v55: Vector[Vector[Double]] = v89(0)
    v23 = v23.updated(0, v29)
    v4 = v8
    v4 = v4.copy(p0 = v37)
    v8 = v123
    v14 = v14.copy(p1 = v55)
    v4 = v4.copy(p0 = v47)
    v123
  }
  def f28(v0: s0): s0 = {
    val v2: Vector[Vector[Double]] = v0.p0
    var v1: Vector[Vector[Double]] = v2
    val v3: Vector[Vector[Double]] = v0.p0
    var v4: s0 = v0
    val v10: Vector[Vector[Double]] = v4.p1
    var v6: s0 = v0
    val v5: Vector[Vector[Double]] = v0.p0
    val v8: Vector[Double] = v5(1)
    val v17: Vector[Vector[Double]] = v6.p0
    var v13: Vector[Vector[Double]] = v3
    v6 = v6.copy(p1 = v1)
    val v19: Vector[Double] = v5(1)
    val v12: Vector[Vector[Double]] = v6.p1
    v1 = v1.updated(1, v19)
    val v16: Vector[Double] = v17(0)
    val v27: Vector[Vector[Vector[Double]]] = Vector(v1)
    val v29: Vector[Double] = v3(0)
    var v35: Vector[Vector[Double]] = v12
    var v43: Vector[Double] = v19
    v13 = v13.updated(1, v8)
    v1 = v1.updated(1, v29)
    v1 = v1.updated(1, v29)
    var v23: s0 = v0
    var v24: s0 = v4
    v1 = v1.updated(0, v43)
    val v31: Vector[Vector[Double]] = v24.p0
    v6 = v6.copy(p0 = v35)
    v24 = v24.copy(p1 = v35)
    var v67: s0 = v24
    v4 = v4.copy(p0 = v35)
    v35 = v35.updated(1, v16)
    v24 = v24.copy(p0 = v12)
    val v40: Double = v43(0)
    val v32: Vector[Vector[Double]] = v27(0)
    val v33: Vector[Vector[Double]] = v4.p1
    val v47: Vector[Double] = v3(1)
    val v53: Vector[s0] = Vector(v4, v23, v6, v23)
    val v51: Vector[Double] = v31(0)
    var v87: Vector[s0] = v53
    v67 = v4
    var v38: s0 = v6
    val v52: Vector[Vector[Double]] = v27(0)
    v6 = v6.copy(p1 = v1)
    v6 = v6.copy(p1 = v13)
    val v72: Vector[Vector[Double]] = v27(0)
    v67 = v67.copy(p0 = v32)
    var v144: Vector[s0] = v87
    v6 = v6.copy(p1 = v3)
    var v56: Vector[s0] = v144
    val v95: Vector[Vector[Double]] = v67.p1
    v67 = v67.copy(p1 = v72)
    val v86: s0 = v56(3)
    v13 = v13.updated(0, v16)
    val v46: Double = v51(0)
    var v41: Vector[Vector[Vector[Double]]] = v27
    val v55: Vector[Vector[Double]] = v41(0)
    val v105: Vector[Vector[Double]] = v0.p0
    val v115: Vector[Vector[Double]] = v67.p0
    v67 = v67.copy(p1 = v115)
    val v64: Vector[Vector[Double]] = v67.p0
    v4 = v4.copy(p1 = v2)
    v38 = v38.copy(p1 = v95)
    v24 = v24.copy(p1 = v64)
    v67 = v67.copy(p0 = v52)
    v41 = v27
    v67 = v67.copy(p1 = v33)
    v6 = v6.copy(p0 = v55)
    v67 = v67.copy(p1 = v10)
    val v112: s1 = s1(v67, v38)
    val v143: s1 = f65(v112)
    v43 = v43.updated(0, v40)
    v67 = v67.copy(p1 = v64)
    val v116: s1 = f65(v143)
    val v170: s1 = f65(v116)
    v4 = v86
    v35 = v35.updated(1, v47)
    v24 = v24.copy(p0 = v13)
    v24 = v24.copy(p0 = v5)
    v6 = v6.copy(p0 = v105)
    val v173: s0 = v170.p0
    v43 = v43.updated(0, v46)
    v173
  }
  @noinline
  def f0(v0: Vector[s11], v1: Vector[Vector[s4]], v2: Vector[s10], v3: s8, v4: Double): Double = {
    val v16: s5 = v3.p1
    val v30: s0 = v16.p0
    val v28: s0 = f28(v30)
    val v45: Vector[Vector[Double]] = v28.p0
    val v53: Vector[Double] = v45(1)
    val v108: Double = v53(0)
    v108
  }
  def benchmark(): Unit = {
    val v0: Vector[s11] = Vector(s11(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0)))), Vector(s3(s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0))), Vector(s1(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0))), s0(Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0)))), s1(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0))), s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0), Vector(27.0)))), s1(s0(Vector(Vector(28.0), Vector(29.0)), Vector(Vector(30.0), Vector(31.0))), s0(Vector(Vector(32.0), Vector(33.0)), Vector(Vector(34.0), Vector(35.0)))))), s3(s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0))), Vector(s1(s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0))), s0(Vector(Vector(44.0), Vector(45.0)), Vector(Vector(46.0), Vector(47.0)))), s1(s0(Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0), Vector(51.0))), s0(Vector(Vector(52.0), Vector(53.0)), Vector(Vector(54.0), Vector(55.0)))), s1(s0(Vector(Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0))), s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0), Vector(63.0)))))), s3(s0(Vector(Vector(64.0), Vector(65.0)), Vector(Vector(66.0), Vector(67.0))), Vector(s1(s0(Vector(Vector(68.0), Vector(69.0)), Vector(Vector(70.0), Vector(71.0))), s0(Vector(Vector(72.0), Vector(73.0)), Vector(Vector(74.0), Vector(75.0)))), s1(s0(Vector(Vector(76.0), Vector(77.0)), Vector(Vector(78.0), Vector(79.0))), s0(Vector(Vector(80.0), Vector(81.0)), Vector(Vector(82.0), Vector(83.0)))), s1(s0(Vector(Vector(84.0), Vector(85.0)), Vector(Vector(86.0), Vector(87.0))), s0(Vector(Vector(88.0), Vector(89.0)), Vector(Vector(90.0), Vector(91.0)))))))), s11(s1(s0(Vector(Vector(92.0), Vector(93.0)), Vector(Vector(94.0), Vector(95.0))), s0(Vector(Vector(96.0), Vector(97.0)), Vector(Vector(98.0), Vector(99.0)))), Vector(s3(s0(Vector(Vector(100.0), Vector(101.0)), Vector(Vector(102.0), Vector(103.0))), Vector(s1(s0(Vector(Vector(104.0), Vector(105.0)), Vector(Vector(106.0), Vector(107.0))), s0(Vector(Vector(108.0), Vector(109.0)), Vector(Vector(110.0), Vector(111.0)))), s1(s0(Vector(Vector(112.0), Vector(113.0)), Vector(Vector(114.0), Vector(115.0))), s0(Vector(Vector(116.0), Vector(117.0)), Vector(Vector(118.0), Vector(119.0)))), s1(s0(Vector(Vector(120.0), Vector(121.0)), Vector(Vector(122.0), Vector(123.0))), s0(Vector(Vector(124.0), Vector(125.0)), Vector(Vector(126.0), Vector(127.0)))))), s3(s0(Vector(Vector(128.0), Vector(129.0)), Vector(Vector(130.0), Vector(131.0))), Vector(s1(s0(Vector(Vector(132.0), Vector(133.0)), Vector(Vector(134.0), Vector(135.0))), s0(Vector(Vector(136.0), Vector(137.0)), Vector(Vector(138.0), Vector(139.0)))), s1(s0(Vector(Vector(140.0), Vector(141.0)), Vector(Vector(142.0), Vector(143.0))), s0(Vector(Vector(144.0), Vector(145.0)), Vector(Vector(146.0), Vector(147.0)))), s1(s0(Vector(Vector(148.0), Vector(149.0)), Vector(Vector(150.0), Vector(151.0))), s0(Vector(Vector(152.0), Vector(153.0)), Vector(Vector(154.0), Vector(155.0)))))), s3(s0(Vector(Vector(156.0), Vector(157.0)), Vector(Vector(158.0), Vector(159.0))), Vector(s1(s0(Vector(Vector(160.0), Vector(161.0)), Vector(Vector(162.0), Vector(163.0))), s0(Vector(Vector(164.0), Vector(165.0)), Vector(Vector(166.0), Vector(167.0)))), s1(s0(Vector(Vector(168.0), Vector(169.0)), Vector(Vector(170.0), Vector(171.0))), s0(Vector(Vector(172.0), Vector(173.0)), Vector(Vector(174.0), Vector(175.0)))), s1(s0(Vector(Vector(176.0), Vector(177.0)), Vector(Vector(178.0), Vector(179.0))), s0(Vector(Vector(180.0), Vector(181.0)), Vector(Vector(182.0), Vector(183.0)))))))))
    val v1: Vector[Vector[s4]] = Vector(Vector(s4(s1(s0(Vector(Vector(184.0), Vector(185.0)), Vector(Vector(186.0), Vector(187.0))), s0(Vector(Vector(188.0), Vector(189.0)), Vector(Vector(190.0), Vector(191.0)))), s1(s0(Vector(Vector(192.0), Vector(193.0)), Vector(Vector(194.0), Vector(195.0))), s0(Vector(Vector(196.0), Vector(197.0)), Vector(Vector(198.0), Vector(199.0)))))), Vector(s4(s1(s0(Vector(Vector(200.0), Vector(201.0)), Vector(Vector(202.0), Vector(203.0))), s0(Vector(Vector(204.0), Vector(205.0)), Vector(Vector(206.0), Vector(207.0)))), s1(s0(Vector(Vector(208.0), Vector(209.0)), Vector(Vector(210.0), Vector(211.0))), s0(Vector(Vector(212.0), Vector(213.0)), Vector(Vector(214.0), Vector(215.0)))))))
    val v2: Vector[s10] = Vector(s10(Vector(s5(s0(Vector(Vector(216.0), Vector(217.0)), Vector(Vector(218.0), Vector(219.0))), s4(s1(s0(Vector(Vector(220.0), Vector(221.0)), Vector(Vector(222.0), Vector(223.0))), s0(Vector(Vector(224.0), Vector(225.0)), Vector(Vector(226.0), Vector(227.0)))), s1(s0(Vector(Vector(228.0), Vector(229.0)), Vector(Vector(230.0), Vector(231.0))), s0(Vector(Vector(232.0), Vector(233.0)), Vector(Vector(234.0), Vector(235.0))))))), Vector(Vector(s4(s1(s0(Vector(Vector(236.0), Vector(237.0)), Vector(Vector(238.0), Vector(239.0))), s0(Vector(Vector(240.0), Vector(241.0)), Vector(Vector(242.0), Vector(243.0)))), s1(s0(Vector(Vector(244.0), Vector(245.0)), Vector(Vector(246.0), Vector(247.0))), s0(Vector(Vector(248.0), Vector(249.0)), Vector(Vector(250.0), Vector(251.0)))))), Vector(s4(s1(s0(Vector(Vector(252.0), Vector(253.0)), Vector(Vector(254.0), Vector(255.0))), s0(Vector(Vector(256.0), Vector(257.0)), Vector(Vector(258.0), Vector(259.0)))), s1(s0(Vector(Vector(260.0), Vector(261.0)), Vector(Vector(262.0), Vector(263.0))), s0(Vector(Vector(264.0), Vector(265.0)), Vector(Vector(266.0), Vector(267.0)))))), Vector(s4(s1(s0(Vector(Vector(268.0), Vector(269.0)), Vector(Vector(270.0), Vector(271.0))), s0(Vector(Vector(272.0), Vector(273.0)), Vector(Vector(274.0), Vector(275.0)))), s1(s0(Vector(Vector(276.0), Vector(277.0)), Vector(Vector(278.0), Vector(279.0))), s0(Vector(Vector(280.0), Vector(281.0)), Vector(Vector(282.0), Vector(283.0)))))))), s10(Vector(s5(s0(Vector(Vector(284.0), Vector(285.0)), Vector(Vector(286.0), Vector(287.0))), s4(s1(s0(Vector(Vector(288.0), Vector(289.0)), Vector(Vector(290.0), Vector(291.0))), s0(Vector(Vector(292.0), Vector(293.0)), Vector(Vector(294.0), Vector(295.0)))), s1(s0(Vector(Vector(296.0), Vector(297.0)), Vector(Vector(298.0), Vector(299.0))), s0(Vector(Vector(300.0), Vector(301.0)), Vector(Vector(302.0), Vector(303.0))))))), Vector(Vector(s4(s1(s0(Vector(Vector(304.0), Vector(305.0)), Vector(Vector(306.0), Vector(307.0))), s0(Vector(Vector(308.0), Vector(309.0)), Vector(Vector(310.0), Vector(311.0)))), s1(s0(Vector(Vector(312.0), Vector(313.0)), Vector(Vector(314.0), Vector(315.0))), s0(Vector(Vector(316.0), Vector(317.0)), Vector(Vector(318.0), Vector(319.0)))))), Vector(s4(s1(s0(Vector(Vector(320.0), Vector(321.0)), Vector(Vector(322.0), Vector(323.0))), s0(Vector(Vector(324.0), Vector(325.0)), Vector(Vector(326.0), Vector(327.0)))), s1(s0(Vector(Vector(328.0), Vector(329.0)), Vector(Vector(330.0), Vector(331.0))), s0(Vector(Vector(332.0), Vector(333.0)), Vector(Vector(334.0), Vector(335.0)))))), Vector(s4(s1(s0(Vector(Vector(336.0), Vector(337.0)), Vector(Vector(338.0), Vector(339.0))), s0(Vector(Vector(340.0), Vector(341.0)), Vector(Vector(342.0), Vector(343.0)))), s1(s0(Vector(Vector(344.0), Vector(345.0)), Vector(Vector(346.0), Vector(347.0))), s0(Vector(Vector(348.0), Vector(349.0)), Vector(Vector(350.0), Vector(351.0)))))))))
    val v3: s8 = s8(s1(s0(Vector(Vector(352.0), Vector(353.0)), Vector(Vector(354.0), Vector(355.0))), s0(Vector(Vector(356.0), Vector(357.0)), Vector(Vector(358.0), Vector(359.0)))), s5(s0(Vector(Vector(360.0), Vector(361.0)), Vector(Vector(362.0), Vector(363.0))), s4(s1(s0(Vector(Vector(364.0), Vector(365.0)), Vector(Vector(366.0), Vector(367.0))), s0(Vector(Vector(368.0), Vector(369.0)), Vector(Vector(370.0), Vector(371.0)))), s1(s0(Vector(Vector(372.0), Vector(373.0)), Vector(Vector(374.0), Vector(375.0))), s0(Vector(Vector(376.0), Vector(377.0)), Vector(Vector(378.0), Vector(379.0)))))))
    val v4: Double = 380.0
    val start = nanoTime()
    var result: Double = 380.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}