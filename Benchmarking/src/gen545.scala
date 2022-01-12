import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0,
    p2: s0,
    p3: s0,
    p4: s0,
    p5: s0,
    p6: s0
  )
  case class s2 (
    p0: Vector[s1],
    p1: Vector[s0]
  )
  case class s4 (
    p0: s0,
    p1: s0,
    p2: s0
  )
  case class s6 (
    p0: Vector[s1],
    p1: s2
  )
  def f85(v0: s4): s4 = {
    val v19: s0 = v0.p0
    var v33: s4 = v0
    v33 = v33.copy(p2 = v19)
    v33
  }
  def f82(v0: s2): s2 = {
    val v7: Vector[s2] = Vector(v0, v0, v0, v0, v0, v0)
    var v3: Vector[s2] = v7
    val v8: s2 = v3(5)
    v8
  }
  def f79(v0: s2, v1: Vector[s1]): s2 = {
    val v7: s2 = f82(v0)
    val v11: s2 = f82(v7)
    val v13: s2 = f82(v11)
    val v33: s2 = f82(v13)
    var v93: s2 = v33
    var v171: s2 = v93
    v171
  }
  def f68(v0: Vector[s1]): Vector[s1] = {
    var v6: Vector[s1] = v0
    val v8: Vector[Vector[s1]] = Vector(v0, v6, v6, v0, v0, v0)
    val v5: Vector[s1] = v8(2)
    v5
  }
  def f67(v0: s6): s6 = {
    var v2: s6 = v0
    var v8: s6 = v2
    var v3: s6 = v8
    var v7: s6 = v3
    val v5: Vector[s1] = v7.p0
    val v11: s2 = v0.p1
    val v9: Vector[s1] = v11.p0
    var v4: Vector[s1] = v5
    val v17: Vector[s1] = v11.p0
    var v6: s2 = v11
    val v13: s2 = f82(v11)
    v7 = v7.copy(p1 = v13)
    val v15: s1 = v9(1)
    val v16: s2 = f82(v11)
    v3 = v3.copy(p1 = v16)
    val v20: s2 = f82(v16)
    val v25: Vector[s1] = v6.p0
    v2 = v2.copy(p1 = v11)
    val v33: Vector[s0] = v20.p1
    val v34: s1 = v17(1)
    v3 = v3.copy(p0 = v17)
    v2 = v2.copy(p0 = v25)
    v6 = v6.copy(p1 = v33)
    v6 = v6.copy(p0 = v4)
    v4 = v4.updated(0, v34)
    v7 = v7.copy(p1 = v16)
    v4 = v4.updated(1, v15)
    v8 = v8.copy(p1 = v6)
    v7
  }
  def f52(v0: Vector[s6]): Vector[s6] = {
    var v6: Vector[s6] = v0
    val v3: s6 = v0(2)
    var v4: s6 = v3
    v6 = v0
    val v2: Vector[Vector[s6]] = Vector(v6, v6, v0, v0)
    val v7: s6 = f67(v4)
    val v1: s2 = v3.p1
    var v10: s2 = v1
    v4 = v3
    val v8: Vector[s1] = v10.p0
    val v13: Vector[s1] = f68(v8)
    v6 = v6.updated(0, v4)
    v10 = v10.copy(p0 = v8)
    v6 = v6.updated(2, v7)
    v4 = v4.copy(p0 = v13)
    v6 = v6.updated(2, v3)
    var v9: Vector[s6] = v0
    val v43: s6 = v9(0)
    v9 = v9.updated(1, v7)
    v6 = v6.updated(2, v43)
    val v48: Vector[s6] = v2(0)
    var v63: Vector[s6] = v48
    v9 = v48
    v63
  }
  def f49(v0: s4): s4 = {
    val v7: s4 = f85(v0)
    val v6: s4 = f85(v7)
    var v1: s4 = v0
    val v5: s0 = v0.p0
    v1 = v1.copy(p0 = v5)
    v1 = v1.copy(p2 = v5)
    var v9: s4 = v1
    var v13: s4 = v1
    val v35: s4 = f85(v7)
    val v20: s4 = f85(v9)
    val v21: s4 = f85(v35)
    val v27: Vector[s4] = Vector(v13, v35, v6, v21, v7, v20, v20)
    val v73: s4 = v27(1)
    v73
  }
  def f48(v0: s4): s4 = {
    var v2: s4 = v0
    var v3: s4 = v2
    val v1: s4 = f85(v3)
    val v9: s0 = v0.p0
    var v5: s4 = v2
    val v16: s4 = f49(v5)
    v2 = v2.copy(p2 = v9)
    v2 = v16
    var v13: s4 = v2
    val v8: s0 = v13.p0
    val v14: s4 = f49(v5)
    v13 = v13.copy(p2 = v8)
    var v18: s4 = v0
    var v36: s4 = v14
    v18 = v18.copy(p1 = v8)
    v36 = v36.copy(p0 = v9)
    val v40: s0 = v18.p2
    v5 = v5.copy(p2 = v40)
    v2 = v1
    v36 = v2
    v36 = v18
    v36
  }
  def f42(v0: s2): s2 = {
    val v3: s2 = f82(v0)
    val v2: Vector[s2] = Vector(v3, v3, v0, v0, v3, v0, v0)
    val v8: Vector[s1] = v0.p0
    var v7: Vector[s1] = v8
    val v10: s1 = v8(1)
    var v24: Vector[s1] = v7
    val v20: s1 = v24(1)
    val v14: s2 = v2(5)
    val v16: s1 = v8(1)
    val v37: Vector[s1] = v14.p0
    var v30: s1 = v16
    var v59: Vector[s1] = v37
    v7 = v7.updated(0, v30)
    var v49: Vector[s1] = v59
    val v139: s0 = v20.p6
    v59 = v59.updated(0, v10)
    v30 = v30.copy(p0 = v139)
    val v117: s6 = s6(v49, v14)
    v49 = v24
    var v245: s6 = v117
    v245 = v245.copy(p0 = v59)
    val v253: s2 = v245.p1
    v245 = v245.copy(p1 = v14)
    v253
  }
  def f34(v0: s6, v1: s2): s2 = {
    val v5: Vector[s2] = Vector(v1, v1, v1, v1, v1, v1, v1)
    val v7: s2 = v0.p1
    var v9: s6 = v0
    val v6: s2 = v9.p1
    val v4: Vector[s1] = v9.p0
    val v21: s2 = f79(v6, v4)
    var v17: Vector[s2] = v5
    val v25: s2 = f79(v21, v4)
    val v20: s2 = f42(v25)
    v9 = v9.copy(p0 = v4)
    val v16: s2 = v17(6)
    v17 = v17.updated(5, v16)
    v17 = v17.updated(5, v20)
    v17 = v17.updated(4, v7)
    val v41: s2 = v17(5)
    v41
  }
  def f32(v0: s1, v1: s2): s1 = {
    val v2: Vector[s2] = Vector(v1, v1, v1, v1, v1, v1)
    val v5: s2 = v2(3)
    val v31: s2 = f82(v5)
    val v73: Vector[s1] = v31.p0
    val v52: s1 = v73(0)
    v52
  }
  def f30(v0: s6): s6 = {
    val v1: Vector[s1] = v0.p0
    val v7: s2 = v0.p1
    val v8: s1 = v1(1)
    val v6: s1 = f32(v8, v7)
    val v9: Vector[s1] = f68(v1)
    val v15: s2 = f82(v7)
    var v27: Vector[s1] = v9
    val v59: s2 = f34(v0, v15)
    v27 = v27.updated(0, v6)
    val v58: s6 = s6(v27, v59)
    val v110: s6 = f67(v58)
    v110
  }
  def f21(v0: s1): s1 = {
    var v2: s1 = v0
    val v1: s0 = v0.p0
    val v4: s0 = v0.p1
    val v6: Vector[Vector[Double]] = v4.p0
    val v3: s0 = v0.p0
    v2 = v2.copy(p0 = v4)
    v2 = v2.copy(p4 = v1)
    val v10: s0 = v2.p4
    val v14: s0 = v2.p1
    v2 = v2.copy(p0 = v4)
    val v9: s4 = s4(v3, v3, v1)
    val v12: s4 = f48(v9)
    val v21: s0 = v9.p1
    v2 = v2.copy(p3 = v10)
    val v20: s0 = v0.p2
    val v29: s4 = f85(v12)
    v2 = v2.copy(p4 = v14)
    var v16: s0 = v20
    val v35: s1 = s1(v20, v10, v1, v16, v20, v20, v3)
    v2 = v2.copy(p3 = v21)
    val v69: s4 = f85(v29)
    val v75: s0 = v69.p0
    v2 = v2.copy(p5 = v75)
    v16 = v16.copy(p0 = v6)
    v2 = v35
    v35
  }
  def f7(v0: Double, v1: s1): Double = {
    val v6: s1 = f21(v1)
    var v2: Double = v0
    var v12: Double = v2
    var v3: Double = v2
    val v8: s0 = v6.p6
    var v13: s0 = v8
    val v20: Vector[Vector[Double]] = v8.p1
    val v17: Vector[Double] = v20(0)
    var v15: Vector[Double] = v17
    var v14: s0 = v13
    val v10: Vector[Vector[Double]] = v13.p0
    v14 = v14.copy(p0 = v10)
    v15 = v15.updated(0, v12)
    v13 = v13.copy(p0 = v10)
    v13 = v14
    val v42: Vector[Double] = v10(2)
    v14 = v14.copy(p0 = v10)
    val v23: Double = v15(0)
    v14 = v14.copy(p1 = v20)
    val v41: Vector[Vector[Double]] = Vector(v42, v42, v15, v17, v15)
    val v40: s0 = v6.p5
    val v31: Vector[Vector[Double]] = v40.p0
    v15 = v15.updated(0, v23)
    v14 = v14.copy(p0 = v31)
    v15 = v15.updated(0, v0)
    var v71: Vector[Vector[Double]] = v41
    var v82: Vector[Vector[Double]] = v71
    val v115: Vector[Double] = v82(3)
    v15 = v15.updated(0, v3)
    val v364: Double = v115(0)
    v364
  }
  @noinline
  def f0(v0: Vector[s6], v1: Double): Double = {
    val v2: Vector[s6] = f52(v0)
    val v6: s6 = v0(0)
    val v8: s6 = v2(0)
    var v5: s6 = v8
    val v17: Vector[s1] = v5.p0
    val v12: s1 = v17(1)
    v5 = v5.copy(p0 = v17)
    val v9: Vector[s1] = f68(v17)
    v5 = v5.copy(p0 = v9)
    var v13: Vector[s1] = v9
    val v15: Vector[s1] = v6.p0
    val v14: s1 = v9(0)
    v5 = v5.copy(p0 = v13)
    val v19: Vector[s1] = f68(v9)
    val v24: Vector[s1] = v8.p0
    v5 = v5.copy(p0 = v19)
    val v28: s1 = v13(0)
    val v21: s6 = v2(2)
    val v23: Double = f7(v1, v28)
    val v46: s1 = v24(0)
    v5 = v5.copy(p0 = v24)
    val v22: s6 = f30(v21)
    v5 = v5.copy(p0 = v17)
    val v86: s1 = v19(1)
    var v65: Double = v23
    v13 = v13.updated(1, v12)
    val v53: s2 = v22.p1
    val v132: Double = f7(v65, v46)
    var v56: Double = v132
    v5 = v5.copy(p0 = v15)
    var v62: Vector[s1] = v9
    v56 = v65
    var v141: Vector[s1] = v62
    val v118: s1 = f32(v14, v53)
    v5 = v5.copy(p0 = v141)
    v141 = v141.updated(0, v86)
    var v128: Double = v56
    v5 = v5.copy(p0 = v141)
    v62 = v62.updated(0, v86)
    v141 = v141.updated(1, v118)
    v128
  }
  def benchmark(): Unit = {
    val v0: Vector[s6] = Vector(s6(Vector(s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0))), s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0))), s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0))), s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0))), s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0))), s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0)))), s1(s0(Vector(Vector(28.0), Vector(29.0), Vector(30.0)), Vector(Vector(31.0))), s0(Vector(Vector(32.0), Vector(33.0), Vector(34.0)), Vector(Vector(35.0))), s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0))), s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0))), s0(Vector(Vector(44.0), Vector(45.0), Vector(46.0)), Vector(Vector(47.0))), s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0))), s0(Vector(Vector(52.0), Vector(53.0), Vector(54.0)), Vector(Vector(55.0))))), s2(Vector(s1(s0(Vector(Vector(56.0), Vector(57.0), Vector(58.0)), Vector(Vector(59.0))), s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0))), s0(Vector(Vector(64.0), Vector(65.0), Vector(66.0)), Vector(Vector(67.0))), s0(Vector(Vector(68.0), Vector(69.0), Vector(70.0)), Vector(Vector(71.0))), s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)), Vector(Vector(75.0))), s0(Vector(Vector(76.0), Vector(77.0), Vector(78.0)), Vector(Vector(79.0))), s0(Vector(Vector(80.0), Vector(81.0), Vector(82.0)), Vector(Vector(83.0)))), s1(s0(Vector(Vector(84.0), Vector(85.0), Vector(86.0)), Vector(Vector(87.0))), s0(Vector(Vector(88.0), Vector(89.0), Vector(90.0)), Vector(Vector(91.0))), s0(Vector(Vector(92.0), Vector(93.0), Vector(94.0)), Vector(Vector(95.0))), s0(Vector(Vector(96.0), Vector(97.0), Vector(98.0)), Vector(Vector(99.0))), s0(Vector(Vector(100.0), Vector(101.0), Vector(102.0)), Vector(Vector(103.0))), s0(Vector(Vector(104.0), Vector(105.0), Vector(106.0)), Vector(Vector(107.0))), s0(Vector(Vector(108.0), Vector(109.0), Vector(110.0)), Vector(Vector(111.0))))), Vector(s0(Vector(Vector(112.0), Vector(113.0), Vector(114.0)), Vector(Vector(115.0))), s0(Vector(Vector(116.0), Vector(117.0), Vector(118.0)), Vector(Vector(119.0))), s0(Vector(Vector(120.0), Vector(121.0), Vector(122.0)), Vector(Vector(123.0)))))), s6(Vector(s1(s0(Vector(Vector(124.0), Vector(125.0), Vector(126.0)), Vector(Vector(127.0))), s0(Vector(Vector(128.0), Vector(129.0), Vector(130.0)), Vector(Vector(131.0))), s0(Vector(Vector(132.0), Vector(133.0), Vector(134.0)), Vector(Vector(135.0))), s0(Vector(Vector(136.0), Vector(137.0), Vector(138.0)), Vector(Vector(139.0))), s0(Vector(Vector(140.0), Vector(141.0), Vector(142.0)), Vector(Vector(143.0))), s0(Vector(Vector(144.0), Vector(145.0), Vector(146.0)), Vector(Vector(147.0))), s0(Vector(Vector(148.0), Vector(149.0), Vector(150.0)), Vector(Vector(151.0)))), s1(s0(Vector(Vector(152.0), Vector(153.0), Vector(154.0)), Vector(Vector(155.0))), s0(Vector(Vector(156.0), Vector(157.0), Vector(158.0)), Vector(Vector(159.0))), s0(Vector(Vector(160.0), Vector(161.0), Vector(162.0)), Vector(Vector(163.0))), s0(Vector(Vector(164.0), Vector(165.0), Vector(166.0)), Vector(Vector(167.0))), s0(Vector(Vector(168.0), Vector(169.0), Vector(170.0)), Vector(Vector(171.0))), s0(Vector(Vector(172.0), Vector(173.0), Vector(174.0)), Vector(Vector(175.0))), s0(Vector(Vector(176.0), Vector(177.0), Vector(178.0)), Vector(Vector(179.0))))), s2(Vector(s1(s0(Vector(Vector(180.0), Vector(181.0), Vector(182.0)), Vector(Vector(183.0))), s0(Vector(Vector(184.0), Vector(185.0), Vector(186.0)), Vector(Vector(187.0))), s0(Vector(Vector(188.0), Vector(189.0), Vector(190.0)), Vector(Vector(191.0))), s0(Vector(Vector(192.0), Vector(193.0), Vector(194.0)), Vector(Vector(195.0))), s0(Vector(Vector(196.0), Vector(197.0), Vector(198.0)), Vector(Vector(199.0))), s0(Vector(Vector(200.0), Vector(201.0), Vector(202.0)), Vector(Vector(203.0))), s0(Vector(Vector(204.0), Vector(205.0), Vector(206.0)), Vector(Vector(207.0)))), s1(s0(Vector(Vector(208.0), Vector(209.0), Vector(210.0)), Vector(Vector(211.0))), s0(Vector(Vector(212.0), Vector(213.0), Vector(214.0)), Vector(Vector(215.0))), s0(Vector(Vector(216.0), Vector(217.0), Vector(218.0)), Vector(Vector(219.0))), s0(Vector(Vector(220.0), Vector(221.0), Vector(222.0)), Vector(Vector(223.0))), s0(Vector(Vector(224.0), Vector(225.0), Vector(226.0)), Vector(Vector(227.0))), s0(Vector(Vector(228.0), Vector(229.0), Vector(230.0)), Vector(Vector(231.0))), s0(Vector(Vector(232.0), Vector(233.0), Vector(234.0)), Vector(Vector(235.0))))), Vector(s0(Vector(Vector(236.0), Vector(237.0), Vector(238.0)), Vector(Vector(239.0))), s0(Vector(Vector(240.0), Vector(241.0), Vector(242.0)), Vector(Vector(243.0))), s0(Vector(Vector(244.0), Vector(245.0), Vector(246.0)), Vector(Vector(247.0)))))), s6(Vector(s1(s0(Vector(Vector(248.0), Vector(249.0), Vector(250.0)), Vector(Vector(251.0))), s0(Vector(Vector(252.0), Vector(253.0), Vector(254.0)), Vector(Vector(255.0))), s0(Vector(Vector(256.0), Vector(257.0), Vector(258.0)), Vector(Vector(259.0))), s0(Vector(Vector(260.0), Vector(261.0), Vector(262.0)), Vector(Vector(263.0))), s0(Vector(Vector(264.0), Vector(265.0), Vector(266.0)), Vector(Vector(267.0))), s0(Vector(Vector(268.0), Vector(269.0), Vector(270.0)), Vector(Vector(271.0))), s0(Vector(Vector(272.0), Vector(273.0), Vector(274.0)), Vector(Vector(275.0)))), s1(s0(Vector(Vector(276.0), Vector(277.0), Vector(278.0)), Vector(Vector(279.0))), s0(Vector(Vector(280.0), Vector(281.0), Vector(282.0)), Vector(Vector(283.0))), s0(Vector(Vector(284.0), Vector(285.0), Vector(286.0)), Vector(Vector(287.0))), s0(Vector(Vector(288.0), Vector(289.0), Vector(290.0)), Vector(Vector(291.0))), s0(Vector(Vector(292.0), Vector(293.0), Vector(294.0)), Vector(Vector(295.0))), s0(Vector(Vector(296.0), Vector(297.0), Vector(298.0)), Vector(Vector(299.0))), s0(Vector(Vector(300.0), Vector(301.0), Vector(302.0)), Vector(Vector(303.0))))), s2(Vector(s1(s0(Vector(Vector(304.0), Vector(305.0), Vector(306.0)), Vector(Vector(307.0))), s0(Vector(Vector(308.0), Vector(309.0), Vector(310.0)), Vector(Vector(311.0))), s0(Vector(Vector(312.0), Vector(313.0), Vector(314.0)), Vector(Vector(315.0))), s0(Vector(Vector(316.0), Vector(317.0), Vector(318.0)), Vector(Vector(319.0))), s0(Vector(Vector(320.0), Vector(321.0), Vector(322.0)), Vector(Vector(323.0))), s0(Vector(Vector(324.0), Vector(325.0), Vector(326.0)), Vector(Vector(327.0))), s0(Vector(Vector(328.0), Vector(329.0), Vector(330.0)), Vector(Vector(331.0)))), s1(s0(Vector(Vector(332.0), Vector(333.0), Vector(334.0)), Vector(Vector(335.0))), s0(Vector(Vector(336.0), Vector(337.0), Vector(338.0)), Vector(Vector(339.0))), s0(Vector(Vector(340.0), Vector(341.0), Vector(342.0)), Vector(Vector(343.0))), s0(Vector(Vector(344.0), Vector(345.0), Vector(346.0)), Vector(Vector(347.0))), s0(Vector(Vector(348.0), Vector(349.0), Vector(350.0)), Vector(Vector(351.0))), s0(Vector(Vector(352.0), Vector(353.0), Vector(354.0)), Vector(Vector(355.0))), s0(Vector(Vector(356.0), Vector(357.0), Vector(358.0)), Vector(Vector(359.0))))), Vector(s0(Vector(Vector(360.0), Vector(361.0), Vector(362.0)), Vector(Vector(363.0))), s0(Vector(Vector(364.0), Vector(365.0), Vector(366.0)), Vector(Vector(367.0))), s0(Vector(Vector(368.0), Vector(369.0), Vector(370.0)), Vector(Vector(371.0)))))))
    val v1: Double = 372.0
    val start = nanoTime()
    var result: Double = 372.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}