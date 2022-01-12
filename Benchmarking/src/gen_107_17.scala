import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: s0
  )
  case class s2 (
    p0: Vector[Vector[s1]],
    p1: s1,
    p2: Vector[s0],
    p3: Vector[s0],
    p4: Vector[s1]
  )
  case class s4 (
    p0: Vector[s0],
    p1: s2
  )
  case class s5 (
    p0: s4,
    p1: s2
  )
  case class s6 (
    p0: Vector[s5],
    p1: Double
  )
  def f41(v0: s2): s2 = {
    val v2: Vector[s1] = v0.p4
    var v3: Vector[s1] = v2
    var v4: s2 = v0
    val v7: s1 = v3(1)
    v3 = v3.updated(0, v7)
    val v8: s1 = v2(0)
    var v21: s2 = v4
    v21 = v21.copy(p4 = v3)
    val v12: Vector[s0] = v4.p2
    v3 = v3.updated(0, v8)
    v4 = v4.copy(p2 = v12)
    val v59: Vector[s0] = v4.p2
    v4 = v4.copy(p2 = v59)
    val v78: Vector[s1] = v21.p4
    var v97: Vector[s1] = v78
    var v58: s2 = v21
    v58 = v58.copy(p4 = v97)
    v58
  }
  def f33(v0: s4): s4 = {
    val v6: Vector[s0] = v0.p0
    val v2: s2 = v0.p1
    val v26: s4 = s4(v6, v2)
    v26
  }
  def f21(v0: s5): s5 = {
    var v7: s5 = v0
    var v3: s5 = v7
    var v8: s5 = v3
    val v4: s2 = v3.p1
    val v9: Vector[Vector[s1]] = v4.p0
    var v20: Vector[Vector[s1]] = v9
    v8 = v8.copy(p1 = v4)
    var v10: s5 = v0
    val v29: Vector[s1] = v20(0)
    v8 = v8.copy(p1 = v4)
    v20 = v20.updated(0, v29)
    v8 = v3
    val v63: s2 = v10.p1
    var v47: s2 = v63
    v8 = v8.copy(p1 = v47)
    val v52: s4 = v7.p0
    val v89: Vector[s1] = v47.p4
    v10 = v10.copy(p0 = v52)
    var v28: Vector[s1] = v89
    var v78: s4 = v52
    v3 = v3.copy(p0 = v78)
    v47 = v47.copy(p4 = v28)
    v47 = v47.copy(p0 = v20)
    v8
  }
  def f20(v0: s5): s5 = {
    val v5: s5 = f21(v0)
    val v8: s4 = v5.p0
    val v3: s2 = v5.p1
    val v15: Vector[s2] = Vector(v3)
    val v4: s2 = v15(0)
    val v11: s4 = f33(v8)
    val v12: s5 = f21(v0)
    val v18: Vector[s0] = v11.p0
    val v36: s4 = s4(v18, v4)
    var v114: s5 = v12
    val v38: s4 = f33(v36)
    var v123: s4 = v38
    val v93: s5 = f21(v114)
    v114 = v114.copy(p1 = v3)
    v114 = v114.copy(p0 = v123)
    val v161: s5 = f21(v93)
    val v366: s5 = f21(v161)
    v366
  }
  @noinline
  def f0(v0: s6, v1: Double): Double = {
    var v4: s6 = v0
    var v6: Double = v1
    var v8: Double = v6
    var v3: s6 = v0
    v4 = v4.copy(p1 = v8)
    var v2: s6 = v4
    val v9: Double = v4.p1
    val v15: Vector[s5] = v4.p0
    val v5: Double = v4.p1
    v2 = v2.copy(p1 = v5)
    val v12: s5 = v15(0)
    val v11: s5 = f20(v12)
    val v33: s5 = v15(1)
    var v10: Vector[s5] = v15
    v10 = v10.updated(0, v33)
    val v22: s5 = f21(v33)
    val v20: s2 = v11.p1
    var v19: Vector[s5] = v10
    v19 = v19.updated(0, v12)
    var v43: Vector[s5] = v10
    val v36: s2 = f41(v20)
    val v31: s2 = f41(v36)
    var v64: Vector[s5] = v10
    val v87: s5 = v15(0)
    v19 = v19.updated(0, v87)
    v3 = v3.copy(p0 = v43)
    v10 = v10.updated(1, v33)
    val v29: Double = v2.p1
    v2 = v2.copy(p0 = v19)
    v4 = v3
    v43 = v43.updated(1, v33)
    var v66: Double = v29
    val v94: Double = v9 * v66
    var v65: s2 = v31
    v3 = v3.copy(p0 = v64)
    var v62: s5 = v33
    v43 = v43.updated(0, v22)
    v2 = v2.copy(p1 = v9)
    v43 = v43.updated(1, v62)
    val v39: s5 = v15(0)
    v62 = v62.copy(p1 = v65)
    v4 = v4.copy(p1 = v8)
    v64 = v64.updated(0, v39)
    v94
  }
  def benchmark(): Unit = {
    val v0: s6 = s6(Vector(s5(s4(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0))), s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))), s2(Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0)))), Vector(s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0)))), Vector(s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))))), s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0)))))), s1(Vector(Vector(s0(Vector(Vector(28.0)), Vector(Vector(29.0), Vector(30.0), Vector(31.0)))), Vector(s0(Vector(Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0)))), Vector(s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0))))), s0(Vector(Vector(40.0)), Vector(Vector(41.0), Vector(42.0), Vector(43.0)))), Vector(s0(Vector(Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0))), s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0), Vector(51.0)))), Vector(s0(Vector(Vector(52.0)), Vector(Vector(53.0), Vector(54.0), Vector(55.0)))), Vector(s1(Vector(Vector(s0(Vector(Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0)))), Vector(s0(Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0), Vector(63.0)))), Vector(s0(Vector(Vector(64.0)), Vector(Vector(65.0), Vector(66.0), Vector(67.0))))), s0(Vector(Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0)))), s1(Vector(Vector(s0(Vector(Vector(72.0)), Vector(Vector(73.0), Vector(74.0), Vector(75.0)))), Vector(s0(Vector(Vector(76.0)), Vector(Vector(77.0), Vector(78.0), Vector(79.0)))), Vector(s0(Vector(Vector(80.0)), Vector(Vector(81.0), Vector(82.0), Vector(83.0))))), s0(Vector(Vector(84.0)), Vector(Vector(85.0), Vector(86.0), Vector(87.0))))))), s2(Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(88.0)), Vector(Vector(89.0), Vector(90.0), Vector(91.0)))), Vector(s0(Vector(Vector(92.0)), Vector(Vector(93.0), Vector(94.0), Vector(95.0)))), Vector(s0(Vector(Vector(96.0)), Vector(Vector(97.0), Vector(98.0), Vector(99.0))))), s0(Vector(Vector(100.0)), Vector(Vector(101.0), Vector(102.0), Vector(103.0)))))), s1(Vector(Vector(s0(Vector(Vector(104.0)), Vector(Vector(105.0), Vector(106.0), Vector(107.0)))), Vector(s0(Vector(Vector(108.0)), Vector(Vector(109.0), Vector(110.0), Vector(111.0)))), Vector(s0(Vector(Vector(112.0)), Vector(Vector(113.0), Vector(114.0), Vector(115.0))))), s0(Vector(Vector(116.0)), Vector(Vector(117.0), Vector(118.0), Vector(119.0)))), Vector(s0(Vector(Vector(120.0)), Vector(Vector(121.0), Vector(122.0), Vector(123.0))), s0(Vector(Vector(124.0)), Vector(Vector(125.0), Vector(126.0), Vector(127.0)))), Vector(s0(Vector(Vector(128.0)), Vector(Vector(129.0), Vector(130.0), Vector(131.0)))), Vector(s1(Vector(Vector(s0(Vector(Vector(132.0)), Vector(Vector(133.0), Vector(134.0), Vector(135.0)))), Vector(s0(Vector(Vector(136.0)), Vector(Vector(137.0), Vector(138.0), Vector(139.0)))), Vector(s0(Vector(Vector(140.0)), Vector(Vector(141.0), Vector(142.0), Vector(143.0))))), s0(Vector(Vector(144.0)), Vector(Vector(145.0), Vector(146.0), Vector(147.0)))), s1(Vector(Vector(s0(Vector(Vector(148.0)), Vector(Vector(149.0), Vector(150.0), Vector(151.0)))), Vector(s0(Vector(Vector(152.0)), Vector(Vector(153.0), Vector(154.0), Vector(155.0)))), Vector(s0(Vector(Vector(156.0)), Vector(Vector(157.0), Vector(158.0), Vector(159.0))))), s0(Vector(Vector(160.0)), Vector(Vector(161.0), Vector(162.0), Vector(163.0))))))), s5(s4(Vector(s0(Vector(Vector(164.0)), Vector(Vector(165.0), Vector(166.0), Vector(167.0))), s0(Vector(Vector(168.0)), Vector(Vector(169.0), Vector(170.0), Vector(171.0))), s0(Vector(Vector(172.0)), Vector(Vector(173.0), Vector(174.0), Vector(175.0)))), s2(Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(176.0)), Vector(Vector(177.0), Vector(178.0), Vector(179.0)))), Vector(s0(Vector(Vector(180.0)), Vector(Vector(181.0), Vector(182.0), Vector(183.0)))), Vector(s0(Vector(Vector(184.0)), Vector(Vector(185.0), Vector(186.0), Vector(187.0))))), s0(Vector(Vector(188.0)), Vector(Vector(189.0), Vector(190.0), Vector(191.0)))))), s1(Vector(Vector(s0(Vector(Vector(192.0)), Vector(Vector(193.0), Vector(194.0), Vector(195.0)))), Vector(s0(Vector(Vector(196.0)), Vector(Vector(197.0), Vector(198.0), Vector(199.0)))), Vector(s0(Vector(Vector(200.0)), Vector(Vector(201.0), Vector(202.0), Vector(203.0))))), s0(Vector(Vector(204.0)), Vector(Vector(205.0), Vector(206.0), Vector(207.0)))), Vector(s0(Vector(Vector(208.0)), Vector(Vector(209.0), Vector(210.0), Vector(211.0))), s0(Vector(Vector(212.0)), Vector(Vector(213.0), Vector(214.0), Vector(215.0)))), Vector(s0(Vector(Vector(216.0)), Vector(Vector(217.0), Vector(218.0), Vector(219.0)))), Vector(s1(Vector(Vector(s0(Vector(Vector(220.0)), Vector(Vector(221.0), Vector(222.0), Vector(223.0)))), Vector(s0(Vector(Vector(224.0)), Vector(Vector(225.0), Vector(226.0), Vector(227.0)))), Vector(s0(Vector(Vector(228.0)), Vector(Vector(229.0), Vector(230.0), Vector(231.0))))), s0(Vector(Vector(232.0)), Vector(Vector(233.0), Vector(234.0), Vector(235.0)))), s1(Vector(Vector(s0(Vector(Vector(236.0)), Vector(Vector(237.0), Vector(238.0), Vector(239.0)))), Vector(s0(Vector(Vector(240.0)), Vector(Vector(241.0), Vector(242.0), Vector(243.0)))), Vector(s0(Vector(Vector(244.0)), Vector(Vector(245.0), Vector(246.0), Vector(247.0))))), s0(Vector(Vector(248.0)), Vector(Vector(249.0), Vector(250.0), Vector(251.0))))))), s2(Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(252.0)), Vector(Vector(253.0), Vector(254.0), Vector(255.0)))), Vector(s0(Vector(Vector(256.0)), Vector(Vector(257.0), Vector(258.0), Vector(259.0)))), Vector(s0(Vector(Vector(260.0)), Vector(Vector(261.0), Vector(262.0), Vector(263.0))))), s0(Vector(Vector(264.0)), Vector(Vector(265.0), Vector(266.0), Vector(267.0)))))), s1(Vector(Vector(s0(Vector(Vector(268.0)), Vector(Vector(269.0), Vector(270.0), Vector(271.0)))), Vector(s0(Vector(Vector(272.0)), Vector(Vector(273.0), Vector(274.0), Vector(275.0)))), Vector(s0(Vector(Vector(276.0)), Vector(Vector(277.0), Vector(278.0), Vector(279.0))))), s0(Vector(Vector(280.0)), Vector(Vector(281.0), Vector(282.0), Vector(283.0)))), Vector(s0(Vector(Vector(284.0)), Vector(Vector(285.0), Vector(286.0), Vector(287.0))), s0(Vector(Vector(288.0)), Vector(Vector(289.0), Vector(290.0), Vector(291.0)))), Vector(s0(Vector(Vector(292.0)), Vector(Vector(293.0), Vector(294.0), Vector(295.0)))), Vector(s1(Vector(Vector(s0(Vector(Vector(296.0)), Vector(Vector(297.0), Vector(298.0), Vector(299.0)))), Vector(s0(Vector(Vector(300.0)), Vector(Vector(301.0), Vector(302.0), Vector(303.0)))), Vector(s0(Vector(Vector(304.0)), Vector(Vector(305.0), Vector(306.0), Vector(307.0))))), s0(Vector(Vector(308.0)), Vector(Vector(309.0), Vector(310.0), Vector(311.0)))), s1(Vector(Vector(s0(Vector(Vector(312.0)), Vector(Vector(313.0), Vector(314.0), Vector(315.0)))), Vector(s0(Vector(Vector(316.0)), Vector(Vector(317.0), Vector(318.0), Vector(319.0)))), Vector(s0(Vector(Vector(320.0)), Vector(Vector(321.0), Vector(322.0), Vector(323.0))))), s0(Vector(Vector(324.0)), Vector(Vector(325.0), Vector(326.0), Vector(327.0)))))))), 328.0)
    val v1: Double = 329.0
    val start = nanoTime()
    var result: Double = 329.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}