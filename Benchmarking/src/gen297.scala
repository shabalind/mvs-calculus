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
  case class s2 (
    p0: s1
  )
  case class s3 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  case class s4 (
    p0: s3,
    p1: Vector[Vector[s0]]
  )
  case class s5 (
    p0: Vector[s1],
    p1: Vector[s4],
    p2: Vector[s2],
    p3: s1,
    p4: Vector[s3]
  )
  def f120(v0: s3): s3 = {
    var v7: s3 = v0
    var v4: s3 = v0
    val v6: Vector[s0] = v0.p0
    var v3: Vector[s0] = v6
    val v8: Vector[s0] = v0.p1
    v4 = v7
    v7 = v7.copy(p0 = v6)
    val v1: Vector[s0] = v0.p1
    val v2: s0 = v3(1)
    v3 = v3.updated(1, v2)
    var v30: Vector[s0] = v6
    v7 = v7.copy(p1 = v1)
    v4 = v4.copy(p0 = v30)
    v7 = v7.copy(p1 = v8)
    v7 = v7.copy(p0 = v6)
    v30 = v30.updated(1, v2)
    v7 = v7.copy(p0 = v30)
    var v52: s3 = v4
    val v33: Vector[s0] = v0.p0
    val v84: s0 = v30(1)
    var v67: Vector[s0] = v33
    v7 = v7.copy(p0 = v33)
    v52 = v52.copy(p0 = v67)
    v4 = v4.copy(p1 = v1)
    v30 = v30.updated(1, v84)
    v4 = v4.copy(p0 = v30)
    v52 = v4
    var v154: Vector[s0] = v30
    v7 = v7.copy(p0 = v154)
    v52
  }
  def f119(v0: s1): s1 = {
    val v4: s0 = v0.p1
    val v8: Vector[Vector[Double]] = v4.p0
    val v2: s0 = v0.p0
    val v7: Vector[Double] = v8(0)
    val v5: Vector[Vector[Double]] = v4.p0
    val v9: Vector[Vector[Double]] = v2.p0
    val v1: Double = v7(0)
    val v15: Double = v7(0)
    val v10: Vector[Vector[Double]] = v2.p1
    var v6: s1 = v0
    var v16: Vector[Vector[Double]] = v10
    val v11: Vector[s0] = Vector(v2, v2, v4, v2, v4)
    v6 = v6.copy(p1 = v2)
    val v12: s2 = s2(v0)
    var v33: Vector[s0] = v11
    v6 = v6.copy(p0 = v4)
    var v14: Vector[Double] = v7
    val v13: s0 = v11(2)
    val v35: s0 = v11(1)
    v33 = v11
    val v18: s0 = v6.p1
    val v52: Double = v1 * v1
    var v38: Vector[Vector[Double]] = v10
    v6 = v6.copy(p1 = v4)
    v14 = v14.updated(0, v15)
    v16 = v16.updated(0, v7)
    v33 = v33.updated(3, v35)
    v38 = v38.updated(0, v14)
    var v22: s1 = v6
    val v53: s1 = v12.p0
    v22 = v22.copy(p0 = v18)
    v14 = v14.updated(0, v52)
    val v24: s0 = v22.p1
    val v19: Vector[Double] = v16(0)
    val v23: Vector[s1] = Vector(v22, v0, v0, v0, v0, v53)
    v22 = v6
    v14 = v14.updated(0, v15)
    val v34: Vector[Vector[Double]] = v35.p0
    val v100: Vector[Vector[Double]] = v13.p0
    val v29: s0 = v33(3)
    var v37: Vector[Vector[Double]] = v16
    v33 = v33.updated(1, v13)
    val v39: s0 = v22.p1
    val v43: Vector[Vector[Vector[Double]]] = Vector(v38)
    v6 = v6.copy(p0 = v13)
    val v58: s0 = v53.p1
    val v55: s0 = v6.p0
    val v36: s0 = s0(v9, v37)
    v22 = v22.copy(p0 = v29)
    v22 = v22.copy(p0 = v18)
    v22 = v22.copy(p0 = v36)
    val v62: Vector[Double] = v5(1)
    v38 = v37
    val v44: Vector[Vector[Double]] = v43(0)
    v14 = v14.updated(0, v52)
    v6 = v6.copy(p1 = v58)
    val v101: s1 = v23(0)
    val v128: Vector[Double] = v44(0)
    v22 = v22.copy(p1 = v29)
    v16 = v16.updated(0, v62)
    v22 = v22.copy(p1 = v18)
    val v175: s2 = s2(v101)
    var v91: s0 = v24
    v37 = v37.updated(0, v19)
    val v83: Vector[Vector[Double]] = v36.p1
    v33 = v33.updated(0, v35)
    v91 = v91.copy(p0 = v8)
    v91 = v91.copy(p0 = v100)
    v22 = v22.copy(p0 = v39)
    var v103: s0 = v39
    v22 = v22.copy(p1 = v103)
    v16 = v16.updated(0, v128)
    val v56: s1 = v175.p0
    v22 = v22.copy(p0 = v91)
    v6 = v6.copy(p0 = v55)
    v91 = v91.copy(p0 = v34)
    v91 = v91.copy(p1 = v83)
    val v216: s0 = v53.p1
    v6 = v6.copy(p0 = v216)
    v56
  }
  def f114(v0: s0): s0 = {
    var v1: s0 = v0
    val v4: Vector[Vector[Double]] = v1.p1
    val v8: Vector[Vector[Double]] = v0.p0
    v1 = v1.copy(p0 = v8)
    val v7: Vector[Double] = v4(0)
    v1 = v1.copy(p0 = v8)
    val v2: s0 = s0(v8, v4)
    val v10: Vector[Vector[Double]] = v1.p0
    val v25: Vector[Vector[Double]] = v1.p1
    var v11: Vector[Vector[Double]] = v10
    v11 = v11.updated(1, v7)
    val v17: Double = v7(0)
    val v23: Vector[Vector[Double]] = v2.p1
    var v13: Double = v17
    val v24: Vector[Vector[Double]] = v1.p1
    val v39: Vector[Double] = v8(1)
    var v30: Vector[Double] = v7
    v30 = v30.updated(0, v17)
    val v22: s0 = s0(v8, v23)
    val v47: Vector[Double] = v24(0)
    val v29: Vector[Vector[Double]] = v22.p0
    var v41: s0 = v0
    v41 = v41.copy(p1 = v25)
    val v31: s1 = s1(v22, v0)
    val v75: s1 = f119(v31)
    v1 = v1.copy(p0 = v11)
    v11 = v11.updated(0, v47)
    v1 = v1.copy(p0 = v29)
    val v58: s0 = v75.p1
    var v43: Double = v13
    v11 = v11.updated(1, v39)
    v30 = v30.updated(0, v43)
    var v135: s1 = v75
    v135 = v135.copy(p1 = v58)
    val v98: Vector[Vector[Double]] = v41.p0
    v135 = v135.copy(p1 = v41)
    val v84: s0 = v135.p1
    v1 = v1.copy(p1 = v23)
    v11 = v11.updated(0, v30)
    v1 = v1.copy(p0 = v98)
    v84
  }
  def f99(v0: s0): s0 = {
    val v5: Vector[Vector[Double]] = v0.p0
    val v14: Vector[Double] = v5(0)
    var v16: Vector[Vector[Double]] = v5
    var v2: Vector[Double] = v14
    val v1: Vector[Double] = v16(0)
    val v18: Vector[Vector[Double]] = v0.p1
    var v10: Vector[Vector[Double]] = v5
    val v15: Double = v1(0)
    var v19: Double = v15
    val v20: Vector[Double] = v18(0)
    v16 = v10
    v2 = v2.updated(0, v19)
    val v25: Vector[Double] = v18(0)
    v16 = v16.updated(1, v14)
    var v51: Double = v19
    var v33: Vector[Vector[Double]] = v18
    val v26: Vector[Double] = v33(0)
    v16 = v16.updated(1, v26)
    var v38: Vector[Vector[Double]] = v33
    var v50: Vector[Vector[Double]] = v5
    val v45: Double = v51 / v19
    val v70: Vector[Vector[Vector[Double]]] = Vector(v50, v50)
    val v66: Vector[Double] = v33(0)
    v10 = v10.updated(1, v66)
    val v65: Vector[Vector[Double]] = v70(1)
    var v58: Vector[Vector[Double]] = v65
    v16 = v16.updated(0, v1)
    var v75: Vector[Vector[Double]] = v38
    v16 = v58
    v33 = v33.updated(0, v25)
    val v71: s0 = s0(v65, v75)
    val v81: Vector[Double] = v38(0)
    v75 = v75.updated(0, v20)
    var v245: s0 = v71
    v245 = v245.copy(p0 = v16)
    v16 = v16.updated(1, v2)
    v50 = v50.updated(0, v81)
    v75 = v75.updated(0, v81)
    v2 = v2.updated(0, v45)
    v245
  }
  def f64(v0: s3): s3 = {
    val v7: Vector[s0] = v0.p0
    val v5: Vector[Vector[s0]] = Vector(v7)
    val v1: s3 = f120(v0)
    val v6: s3 = f120(v1)
    val v10: s3 = f120(v0)
    val v13: Vector[s0] = v0.p0
    val v8: s3 = f120(v6)
    val v12: s3 = f120(v10)
    val v16: s3 = f120(v1)
    val v37: Vector[s0] = v5(0)
    val v64: s3 = f120(v8)
    val v53: Vector[s3] = Vector(v6, v16, v12, v64, v0, v16, v16)
    var v55: Vector[Vector[s0]] = v5
    v55 = v55.updated(0, v13)
    v55 = v55.updated(0, v37)
    val v84: s3 = v53(6)
    v55 = v55.updated(0, v37)
    val v139: Vector[s0] = v84.p1
    val v276: Vector[s0] = v55(0)
    val v194: s3 = s3(v276, v139)
    v194
  }
  def f42(v0: s0): s0 = {
    val v2: s0 = f99(v0)
    val v7: s0 = f114(v2)
    val v6: Vector[Vector[Double]] = v7.p0
    val v1: s0 = f99(v7)
    val v3: Vector[Vector[Double]] = v1.p0
    val v8: s0 = f114(v7)
    val v11: Vector[Vector[Vector[Double]]] = Vector(v6, v3, v3, v3, v3)
    val v20: Vector[Vector[Double]] = v8.p1
    val v27: Vector[Vector[Double]] = v8.p0
    var v23: Vector[Vector[Vector[Double]]] = v11
    val v39: Vector[Vector[Vector[Vector[Double]]]] = Vector(v23, v11, v11, v23, v23)
    val v95: Vector[Vector[Vector[Double]]] = v39(1)
    v23 = v95
    var v43: Vector[Vector[Vector[Double]]] = v95
    val v71: Vector[Vector[Double]] = v43(3)
    v43 = v43.updated(2, v27)
    val v77: s0 = s0(v71, v20)
    v77
  }
  def f19(v0: s3): s3 = {
    var v6: s3 = v0
    var v4: s3 = v0
    val v1: Vector[s0] = v4.p0
    var v3: s3 = v6
    val v13: Vector[s0] = v3.p1
    v4 = v6
    v6 = v6.copy(p1 = v13)
    val v15: Vector[s0] = v4.p0
    val v25: Vector[s0] = v3.p0
    v4 = v4.copy(p0 = v25)
    val v14: Vector[s0] = v6.p1
    val v19: Vector[Vector[s0]] = Vector(v25, v15, v1)
    val v38: s3 = f64(v3)
    val v48: Vector[s0] = v19(2)
    var v36: Vector[s0] = v14
    v4 = v38
    val v55: s3 = s3(v15, v36)
    v6 = v6.copy(p0 = v1)
    v6 = v6.copy(p0 = v48)
    v55
  }
  def f2(v0: Double, v1: s0): Double = {
    val v3: s0 = f42(v1)
    val v14: Vector[Vector[Double]] = v3.p0
    val v5: Vector[Double] = v14(1)
    val v12: Double = v5(0)
    v12
  }
  @noinline
  def f0(v0: Vector[s5], v1: Vector[Vector[s4]], v2: Vector[s4], v3: s3, v4: Double): Double = {
    val v24: s3 = f19(v3)
    val v40: Vector[s0] = v24.p0
    val v51: s0 = v40(1)
    val v23: Double = f2(v4, v51)
    val v42: Double = v4 / v4
    val v100: Double = v42 + v23
    var v54: Double = v100
    v54
  }
  def benchmark(): Unit = {
    val v0: Vector[s5] = Vector(s5(Vector(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))), s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0))))), Vector(s4(s3(Vector(s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0))), s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0)))), Vector(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0))))), Vector(Vector(s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0)))), Vector(s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0)))))), s4(s3(Vector(s0(Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0))), s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0)))), Vector(s0(Vector(Vector(27.0), Vector(28.0)), Vector(Vector(29.0))))), Vector(Vector(s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0)))), Vector(s0(Vector(Vector(33.0), Vector(34.0)), Vector(Vector(35.0)))))), s4(s3(Vector(s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0))), s0(Vector(Vector(39.0), Vector(40.0)), Vector(Vector(41.0)))), Vector(s0(Vector(Vector(42.0), Vector(43.0)), Vector(Vector(44.0))))), Vector(Vector(s0(Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0)))), Vector(s0(Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0))))))), Vector(s2(s1(s0(Vector(Vector(51.0), Vector(52.0)), Vector(Vector(53.0))), s0(Vector(Vector(54.0), Vector(55.0)), Vector(Vector(56.0))))), s2(s1(s0(Vector(Vector(57.0), Vector(58.0)), Vector(Vector(59.0))), s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0))))), s2(s1(s0(Vector(Vector(63.0), Vector(64.0)), Vector(Vector(65.0))), s0(Vector(Vector(66.0), Vector(67.0)), Vector(Vector(68.0)))))), s1(s0(Vector(Vector(69.0), Vector(70.0)), Vector(Vector(71.0))), s0(Vector(Vector(72.0), Vector(73.0)), Vector(Vector(74.0)))), Vector(s3(Vector(s0(Vector(Vector(75.0), Vector(76.0)), Vector(Vector(77.0))), s0(Vector(Vector(78.0), Vector(79.0)), Vector(Vector(80.0)))), Vector(s0(Vector(Vector(81.0), Vector(82.0)), Vector(Vector(83.0))))))), s5(Vector(s1(s0(Vector(Vector(84.0), Vector(85.0)), Vector(Vector(86.0))), s0(Vector(Vector(87.0), Vector(88.0)), Vector(Vector(89.0))))), Vector(s4(s3(Vector(s0(Vector(Vector(90.0), Vector(91.0)), Vector(Vector(92.0))), s0(Vector(Vector(93.0), Vector(94.0)), Vector(Vector(95.0)))), Vector(s0(Vector(Vector(96.0), Vector(97.0)), Vector(Vector(98.0))))), Vector(Vector(s0(Vector(Vector(99.0), Vector(100.0)), Vector(Vector(101.0)))), Vector(s0(Vector(Vector(102.0), Vector(103.0)), Vector(Vector(104.0)))))), s4(s3(Vector(s0(Vector(Vector(105.0), Vector(106.0)), Vector(Vector(107.0))), s0(Vector(Vector(108.0), Vector(109.0)), Vector(Vector(110.0)))), Vector(s0(Vector(Vector(111.0), Vector(112.0)), Vector(Vector(113.0))))), Vector(Vector(s0(Vector(Vector(114.0), Vector(115.0)), Vector(Vector(116.0)))), Vector(s0(Vector(Vector(117.0), Vector(118.0)), Vector(Vector(119.0)))))), s4(s3(Vector(s0(Vector(Vector(120.0), Vector(121.0)), Vector(Vector(122.0))), s0(Vector(Vector(123.0), Vector(124.0)), Vector(Vector(125.0)))), Vector(s0(Vector(Vector(126.0), Vector(127.0)), Vector(Vector(128.0))))), Vector(Vector(s0(Vector(Vector(129.0), Vector(130.0)), Vector(Vector(131.0)))), Vector(s0(Vector(Vector(132.0), Vector(133.0)), Vector(Vector(134.0))))))), Vector(s2(s1(s0(Vector(Vector(135.0), Vector(136.0)), Vector(Vector(137.0))), s0(Vector(Vector(138.0), Vector(139.0)), Vector(Vector(140.0))))), s2(s1(s0(Vector(Vector(141.0), Vector(142.0)), Vector(Vector(143.0))), s0(Vector(Vector(144.0), Vector(145.0)), Vector(Vector(146.0))))), s2(s1(s0(Vector(Vector(147.0), Vector(148.0)), Vector(Vector(149.0))), s0(Vector(Vector(150.0), Vector(151.0)), Vector(Vector(152.0)))))), s1(s0(Vector(Vector(153.0), Vector(154.0)), Vector(Vector(155.0))), s0(Vector(Vector(156.0), Vector(157.0)), Vector(Vector(158.0)))), Vector(s3(Vector(s0(Vector(Vector(159.0), Vector(160.0)), Vector(Vector(161.0))), s0(Vector(Vector(162.0), Vector(163.0)), Vector(Vector(164.0)))), Vector(s0(Vector(Vector(165.0), Vector(166.0)), Vector(Vector(167.0))))))), s5(Vector(s1(s0(Vector(Vector(168.0), Vector(169.0)), Vector(Vector(170.0))), s0(Vector(Vector(171.0), Vector(172.0)), Vector(Vector(173.0))))), Vector(s4(s3(Vector(s0(Vector(Vector(174.0), Vector(175.0)), Vector(Vector(176.0))), s0(Vector(Vector(177.0), Vector(178.0)), Vector(Vector(179.0)))), Vector(s0(Vector(Vector(180.0), Vector(181.0)), Vector(Vector(182.0))))), Vector(Vector(s0(Vector(Vector(183.0), Vector(184.0)), Vector(Vector(185.0)))), Vector(s0(Vector(Vector(186.0), Vector(187.0)), Vector(Vector(188.0)))))), s4(s3(Vector(s0(Vector(Vector(189.0), Vector(190.0)), Vector(Vector(191.0))), s0(Vector(Vector(192.0), Vector(193.0)), Vector(Vector(194.0)))), Vector(s0(Vector(Vector(195.0), Vector(196.0)), Vector(Vector(197.0))))), Vector(Vector(s0(Vector(Vector(198.0), Vector(199.0)), Vector(Vector(200.0)))), Vector(s0(Vector(Vector(201.0), Vector(202.0)), Vector(Vector(203.0)))))), s4(s3(Vector(s0(Vector(Vector(204.0), Vector(205.0)), Vector(Vector(206.0))), s0(Vector(Vector(207.0), Vector(208.0)), Vector(Vector(209.0)))), Vector(s0(Vector(Vector(210.0), Vector(211.0)), Vector(Vector(212.0))))), Vector(Vector(s0(Vector(Vector(213.0), Vector(214.0)), Vector(Vector(215.0)))), Vector(s0(Vector(Vector(216.0), Vector(217.0)), Vector(Vector(218.0))))))), Vector(s2(s1(s0(Vector(Vector(219.0), Vector(220.0)), Vector(Vector(221.0))), s0(Vector(Vector(222.0), Vector(223.0)), Vector(Vector(224.0))))), s2(s1(s0(Vector(Vector(225.0), Vector(226.0)), Vector(Vector(227.0))), s0(Vector(Vector(228.0), Vector(229.0)), Vector(Vector(230.0))))), s2(s1(s0(Vector(Vector(231.0), Vector(232.0)), Vector(Vector(233.0))), s0(Vector(Vector(234.0), Vector(235.0)), Vector(Vector(236.0)))))), s1(s0(Vector(Vector(237.0), Vector(238.0)), Vector(Vector(239.0))), s0(Vector(Vector(240.0), Vector(241.0)), Vector(Vector(242.0)))), Vector(s3(Vector(s0(Vector(Vector(243.0), Vector(244.0)), Vector(Vector(245.0))), s0(Vector(Vector(246.0), Vector(247.0)), Vector(Vector(248.0)))), Vector(s0(Vector(Vector(249.0), Vector(250.0)), Vector(Vector(251.0))))))))
    val v1: Vector[Vector[s4]] = Vector(Vector(s4(s3(Vector(s0(Vector(Vector(252.0), Vector(253.0)), Vector(Vector(254.0))), s0(Vector(Vector(255.0), Vector(256.0)), Vector(Vector(257.0)))), Vector(s0(Vector(Vector(258.0), Vector(259.0)), Vector(Vector(260.0))))), Vector(Vector(s0(Vector(Vector(261.0), Vector(262.0)), Vector(Vector(263.0)))), Vector(s0(Vector(Vector(264.0), Vector(265.0)), Vector(Vector(266.0))))))), Vector(s4(s3(Vector(s0(Vector(Vector(267.0), Vector(268.0)), Vector(Vector(269.0))), s0(Vector(Vector(270.0), Vector(271.0)), Vector(Vector(272.0)))), Vector(s0(Vector(Vector(273.0), Vector(274.0)), Vector(Vector(275.0))))), Vector(Vector(s0(Vector(Vector(276.0), Vector(277.0)), Vector(Vector(278.0)))), Vector(s0(Vector(Vector(279.0), Vector(280.0)), Vector(Vector(281.0))))))))
    val v2: Vector[s4] = Vector(s4(s3(Vector(s0(Vector(Vector(282.0), Vector(283.0)), Vector(Vector(284.0))), s0(Vector(Vector(285.0), Vector(286.0)), Vector(Vector(287.0)))), Vector(s0(Vector(Vector(288.0), Vector(289.0)), Vector(Vector(290.0))))), Vector(Vector(s0(Vector(Vector(291.0), Vector(292.0)), Vector(Vector(293.0)))), Vector(s0(Vector(Vector(294.0), Vector(295.0)), Vector(Vector(296.0)))))), s4(s3(Vector(s0(Vector(Vector(297.0), Vector(298.0)), Vector(Vector(299.0))), s0(Vector(Vector(300.0), Vector(301.0)), Vector(Vector(302.0)))), Vector(s0(Vector(Vector(303.0), Vector(304.0)), Vector(Vector(305.0))))), Vector(Vector(s0(Vector(Vector(306.0), Vector(307.0)), Vector(Vector(308.0)))), Vector(s0(Vector(Vector(309.0), Vector(310.0)), Vector(Vector(311.0)))))))
    val v3: s3 = s3(Vector(s0(Vector(Vector(312.0), Vector(313.0)), Vector(Vector(314.0))), s0(Vector(Vector(315.0), Vector(316.0)), Vector(Vector(317.0)))), Vector(s0(Vector(Vector(318.0), Vector(319.0)), Vector(Vector(320.0)))))
    val v4: Double = 321.0
    val start = nanoTime()
    var result: Double = 321.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}