import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  case class s2 (
    p0: Vector[s1],
    p1: Double
  )
  case class s4 (
    p0: s2,
    p1: Vector[Vector[s2]]
  )
  case class s6 (
    p0: s0,
    p1: Vector[s1]
  )
  case class s9 (
    p0: Vector[Vector[s0]],
    p1: Vector[Vector[s2]]
  )
  case class s11 (
    p0: Vector[s9],
    p1: s4
  )
  case class s12 (
    p0: Vector[Vector[s0]],
    p1: s6
  )
  def f55(v0: s1): s1 = {
    var v6: s1 = v0
    var v21: s1 = v0
    val v24: Vector[s0] = v21.p0
    val v54: Vector[s0] = v6.p1
    val v41: Vector[s0] = v0.p1
    val v13: Vector[s0] = v21.p1
    v6 = v6.copy(p0 = v24)
    v21 = v21.copy(p1 = v13)
    v21 = v21.copy(p1 = v54)
    v21 = v0
    val v124: Vector[s0] = v0.p1
    v6 = v6.copy(p1 = v41)
    v21 = v21.copy(p1 = v124)
    v21 = v21.copy(p1 = v13)
    v6
  }
  def f31(v0: s2): s2 = {
    var v3: s2 = v0
    v3
  }
  def f19(v0: s4): s4 = {
    var v1: s4 = v0
    val v7: Vector[Vector[s2]] = v1.p1
    var v3: Vector[Vector[s2]] = v7
    val v6: Vector[s4] = Vector(v1)
    var v2: Vector[Vector[s2]] = v7
    val v5: s4 = v6(0)
    val v4: s4 = v6(0)
    v2 = v7
    v1 = v1.copy(p1 = v3)
    val v10: s2 = v0.p0
    val v8: s2 = f31(v10)
    var v9: Vector[Vector[s2]] = v3
    v3 = v2
    val v14: Double = v8.p1
    val v21: s2 = f31(v10)
    val v27: Double = v14 / v14
    val v28: Vector[s2] = v7(0)
    val v13: s2 = f31(v8)
    var v12: s2 = v13
    var v15: s2 = v21
    val v17: s2 = f31(v21)
    val v32: Vector[s2] = v7(0)
    val v24: Vector[s2] = Vector(v12, v12, v15, v8, v17, v17)
    val v19: s2 = v32(0)
    val v25: s2 = f31(v19)
    v15 = v15.copy(p1 = v27)
    val v41: s2 = v28(0)
    v1 = v1.copy(p1 = v9)
    val v20: s2 = f31(v25)
    val v30: s2 = v5.p0
    var v37: Double = v27
    val v72: Vector[s2] = v7(0)
    val v48: Vector[Vector[s2]] = v0.p1
    val v81: s2 = f31(v10)
    val v26: s2 = v24(5)
    val v56: Double = v81.p1
    v9 = v9.updated(0, v32)
    val v78: Vector[s1] = v41.p0
    v9 = v9.updated(0, v72)
    val v61: Double = v21.p1
    var v39: Vector[s2] = v24
    val v100: s2 = v39(4)
    val v34: s2 = f31(v26)
    var v51: s4 = v4
    v1 = v1.copy(p0 = v41)
    val v49: Double = v37 * v56
    var v64: Vector[s1] = v78
    v1 = v1.copy(p0 = v30)
    v1 = v1.copy(p1 = v48)
    val v55: Vector[Vector[s2]] = v4.p1
    var v95: Vector[Vector[s2]] = v55
    var v42: s2 = v26
    val v53: Vector[s1] = v42.p0
    v12 = v12.copy(p1 = v14)
    v15 = v15.copy(p1 = v49)
    v37 = v61
    var v62: Vector[s2] = v39
    v12 = v12.copy(p0 = v64)
    v39 = v62
    v62 = v62.updated(5, v34)
    v2 = v2.updated(0, v28)
    val v58: s1 = v53(0)
    val v105: Double = v20.p1
    v62 = v24
    val v149: s1 = f55(v58)
    var v122: s4 = v51
    v12 = v12.copy(p1 = v56)
    v51 = v51.copy(p1 = v95)
    v64 = v64.updated(0, v149)
    v12 = v12.copy(p1 = v105)
    v1 = v1.copy(p0 = v42)
    v122 = v122.copy(p0 = v26)
    v51 = v51.copy(p0 = v100)
    v15 = v15.copy(p1 = v37)
    val v229: s2 = f31(v42)
    v122 = v122.copy(p0 = v229)
    v122
  }
  def f9(v0: Vector[Vector[s11]]): Vector[Vector[s11]] = {
    var v1: Vector[Vector[s11]] = v0
    val v4: Vector[s11] = v0(0)
    val v7: s11 = v4(0)
    var v9: Vector[Vector[s11]] = v0
    v9 = v9.updated(2, v4)
    val v8: Vector[s11] = v9(2)
    v1 = v1.updated(0, v4)
    v9 = v9.updated(1, v8)
    v1 = v1.updated(2, v4)
    var v20: Vector[s11] = v4
    v9 = v9.updated(2, v20)
    v20 = v20.updated(0, v7)
    val v19: Vector[s11] = v1(0)
    v9 = v9.updated(2, v8)
    v9 = v9.updated(0, v19)
    val v36: Vector[s11] = v1(1)
    v9 = v9.updated(0, v36)
    v1 = v1.updated(2, v4)
    var v73: Vector[Vector[s11]] = v9
    v9 = v9.updated(1, v8)
    v9 = v9.updated(1, v8)
    v9 = v9.updated(2, v4)
    v73
  }
  @noinline
  def f0(v0: Vector[Vector[s11]], v1: Vector[s12], v2: Double): Double = {
    var v3: Double = v2
    var v6: Vector[Vector[s11]] = v0
    val v4: Vector[Vector[s11]] = f9(v6)
    var v10: Double = v3
    val v15: Vector[Vector[s11]] = f9(v0)
    val v20: Vector[s11] = v4(0)
    val v18: Vector[Vector[s11]] = f9(v15)
    v6 = v6.updated(2, v20)
    val v17: s11 = v20(0)
    val v62: s4 = v17.p1
    var v48: Double = v10
    val v89: s4 = f19(v62)
    v3 = v2
    val v74: Vector[s11] = v18(1)
    val v72: s2 = v89.p0
    val v66: s2 = f31(v72)
    var v120: s2 = v66
    v120 = v120.copy(p1 = v48)
    v6 = v6.updated(0, v74)
    val v139: s2 = f31(v120)
    val v75: Double = v139.p1
    v75
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s11]] = Vector(Vector(s11(Vector(s9(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0)))), Vector(s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0)))), Vector(s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0))))), Vector(Vector(s2(Vector(s1(Vector(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0))), s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0)))), Vector(s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0)))))), 24.0)))), s9(Vector(Vector(s0(Vector(Vector(25.0), Vector(26.0), Vector(27.0)), Vector(Vector(28.0)))), Vector(s0(Vector(Vector(29.0), Vector(30.0), Vector(31.0)), Vector(Vector(32.0)))), Vector(s0(Vector(Vector(33.0), Vector(34.0), Vector(35.0)), Vector(Vector(36.0))))), Vector(Vector(s2(Vector(s1(Vector(s0(Vector(Vector(37.0), Vector(38.0), Vector(39.0)), Vector(Vector(40.0))), s0(Vector(Vector(41.0), Vector(42.0), Vector(43.0)), Vector(Vector(44.0)))), Vector(s0(Vector(Vector(45.0), Vector(46.0), Vector(47.0)), Vector(Vector(48.0)))))), 49.0))))), s4(s2(Vector(s1(Vector(s0(Vector(Vector(50.0), Vector(51.0), Vector(52.0)), Vector(Vector(53.0))), s0(Vector(Vector(54.0), Vector(55.0), Vector(56.0)), Vector(Vector(57.0)))), Vector(s0(Vector(Vector(58.0), Vector(59.0), Vector(60.0)), Vector(Vector(61.0)))))), 62.0), Vector(Vector(s2(Vector(s1(Vector(s0(Vector(Vector(63.0), Vector(64.0), Vector(65.0)), Vector(Vector(66.0))), s0(Vector(Vector(67.0), Vector(68.0), Vector(69.0)), Vector(Vector(70.0)))), Vector(s0(Vector(Vector(71.0), Vector(72.0), Vector(73.0)), Vector(Vector(74.0)))))), 75.0)))))), Vector(s11(Vector(s9(Vector(Vector(s0(Vector(Vector(76.0), Vector(77.0), Vector(78.0)), Vector(Vector(79.0)))), Vector(s0(Vector(Vector(80.0), Vector(81.0), Vector(82.0)), Vector(Vector(83.0)))), Vector(s0(Vector(Vector(84.0), Vector(85.0), Vector(86.0)), Vector(Vector(87.0))))), Vector(Vector(s2(Vector(s1(Vector(s0(Vector(Vector(88.0), Vector(89.0), Vector(90.0)), Vector(Vector(91.0))), s0(Vector(Vector(92.0), Vector(93.0), Vector(94.0)), Vector(Vector(95.0)))), Vector(s0(Vector(Vector(96.0), Vector(97.0), Vector(98.0)), Vector(Vector(99.0)))))), 100.0)))), s9(Vector(Vector(s0(Vector(Vector(101.0), Vector(102.0), Vector(103.0)), Vector(Vector(104.0)))), Vector(s0(Vector(Vector(105.0), Vector(106.0), Vector(107.0)), Vector(Vector(108.0)))), Vector(s0(Vector(Vector(109.0), Vector(110.0), Vector(111.0)), Vector(Vector(112.0))))), Vector(Vector(s2(Vector(s1(Vector(s0(Vector(Vector(113.0), Vector(114.0), Vector(115.0)), Vector(Vector(116.0))), s0(Vector(Vector(117.0), Vector(118.0), Vector(119.0)), Vector(Vector(120.0)))), Vector(s0(Vector(Vector(121.0), Vector(122.0), Vector(123.0)), Vector(Vector(124.0)))))), 125.0))))), s4(s2(Vector(s1(Vector(s0(Vector(Vector(126.0), Vector(127.0), Vector(128.0)), Vector(Vector(129.0))), s0(Vector(Vector(130.0), Vector(131.0), Vector(132.0)), Vector(Vector(133.0)))), Vector(s0(Vector(Vector(134.0), Vector(135.0), Vector(136.0)), Vector(Vector(137.0)))))), 138.0), Vector(Vector(s2(Vector(s1(Vector(s0(Vector(Vector(139.0), Vector(140.0), Vector(141.0)), Vector(Vector(142.0))), s0(Vector(Vector(143.0), Vector(144.0), Vector(145.0)), Vector(Vector(146.0)))), Vector(s0(Vector(Vector(147.0), Vector(148.0), Vector(149.0)), Vector(Vector(150.0)))))), 151.0)))))), Vector(s11(Vector(s9(Vector(Vector(s0(Vector(Vector(152.0), Vector(153.0), Vector(154.0)), Vector(Vector(155.0)))), Vector(s0(Vector(Vector(156.0), Vector(157.0), Vector(158.0)), Vector(Vector(159.0)))), Vector(s0(Vector(Vector(160.0), Vector(161.0), Vector(162.0)), Vector(Vector(163.0))))), Vector(Vector(s2(Vector(s1(Vector(s0(Vector(Vector(164.0), Vector(165.0), Vector(166.0)), Vector(Vector(167.0))), s0(Vector(Vector(168.0), Vector(169.0), Vector(170.0)), Vector(Vector(171.0)))), Vector(s0(Vector(Vector(172.0), Vector(173.0), Vector(174.0)), Vector(Vector(175.0)))))), 176.0)))), s9(Vector(Vector(s0(Vector(Vector(177.0), Vector(178.0), Vector(179.0)), Vector(Vector(180.0)))), Vector(s0(Vector(Vector(181.0), Vector(182.0), Vector(183.0)), Vector(Vector(184.0)))), Vector(s0(Vector(Vector(185.0), Vector(186.0), Vector(187.0)), Vector(Vector(188.0))))), Vector(Vector(s2(Vector(s1(Vector(s0(Vector(Vector(189.0), Vector(190.0), Vector(191.0)), Vector(Vector(192.0))), s0(Vector(Vector(193.0), Vector(194.0), Vector(195.0)), Vector(Vector(196.0)))), Vector(s0(Vector(Vector(197.0), Vector(198.0), Vector(199.0)), Vector(Vector(200.0)))))), 201.0))))), s4(s2(Vector(s1(Vector(s0(Vector(Vector(202.0), Vector(203.0), Vector(204.0)), Vector(Vector(205.0))), s0(Vector(Vector(206.0), Vector(207.0), Vector(208.0)), Vector(Vector(209.0)))), Vector(s0(Vector(Vector(210.0), Vector(211.0), Vector(212.0)), Vector(Vector(213.0)))))), 214.0), Vector(Vector(s2(Vector(s1(Vector(s0(Vector(Vector(215.0), Vector(216.0), Vector(217.0)), Vector(Vector(218.0))), s0(Vector(Vector(219.0), Vector(220.0), Vector(221.0)), Vector(Vector(222.0)))), Vector(s0(Vector(Vector(223.0), Vector(224.0), Vector(225.0)), Vector(Vector(226.0)))))), 227.0)))))))
    val v1: Vector[s12] = Vector(s12(Vector(Vector(s0(Vector(Vector(228.0), Vector(229.0), Vector(230.0)), Vector(Vector(231.0))))), s6(s0(Vector(Vector(232.0), Vector(233.0), Vector(234.0)), Vector(Vector(235.0))), Vector(s1(Vector(s0(Vector(Vector(236.0), Vector(237.0), Vector(238.0)), Vector(Vector(239.0))), s0(Vector(Vector(240.0), Vector(241.0), Vector(242.0)), Vector(Vector(243.0)))), Vector(s0(Vector(Vector(244.0), Vector(245.0), Vector(246.0)), Vector(Vector(247.0))))), s1(Vector(s0(Vector(Vector(248.0), Vector(249.0), Vector(250.0)), Vector(Vector(251.0))), s0(Vector(Vector(252.0), Vector(253.0), Vector(254.0)), Vector(Vector(255.0)))), Vector(s0(Vector(Vector(256.0), Vector(257.0), Vector(258.0)), Vector(Vector(259.0)))))))), s12(Vector(Vector(s0(Vector(Vector(260.0), Vector(261.0), Vector(262.0)), Vector(Vector(263.0))))), s6(s0(Vector(Vector(264.0), Vector(265.0), Vector(266.0)), Vector(Vector(267.0))), Vector(s1(Vector(s0(Vector(Vector(268.0), Vector(269.0), Vector(270.0)), Vector(Vector(271.0))), s0(Vector(Vector(272.0), Vector(273.0), Vector(274.0)), Vector(Vector(275.0)))), Vector(s0(Vector(Vector(276.0), Vector(277.0), Vector(278.0)), Vector(Vector(279.0))))), s1(Vector(s0(Vector(Vector(280.0), Vector(281.0), Vector(282.0)), Vector(Vector(283.0))), s0(Vector(Vector(284.0), Vector(285.0), Vector(286.0)), Vector(Vector(287.0)))), Vector(s0(Vector(Vector(288.0), Vector(289.0), Vector(290.0)), Vector(Vector(291.0)))))))), s12(Vector(Vector(s0(Vector(Vector(292.0), Vector(293.0), Vector(294.0)), Vector(Vector(295.0))))), s6(s0(Vector(Vector(296.0), Vector(297.0), Vector(298.0)), Vector(Vector(299.0))), Vector(s1(Vector(s0(Vector(Vector(300.0), Vector(301.0), Vector(302.0)), Vector(Vector(303.0))), s0(Vector(Vector(304.0), Vector(305.0), Vector(306.0)), Vector(Vector(307.0)))), Vector(s0(Vector(Vector(308.0), Vector(309.0), Vector(310.0)), Vector(Vector(311.0))))), s1(Vector(s0(Vector(Vector(312.0), Vector(313.0), Vector(314.0)), Vector(Vector(315.0))), s0(Vector(Vector(316.0), Vector(317.0), Vector(318.0)), Vector(Vector(319.0)))), Vector(s0(Vector(Vector(320.0), Vector(321.0), Vector(322.0)), Vector(Vector(323.0)))))))))
    val v2: Double = 324.0
    val start = nanoTime()
    var result: Double = 324.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}