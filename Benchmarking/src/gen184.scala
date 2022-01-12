import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  case class s2 (
    p0: Vector[s1],
    p1: Vector[s0]
  )
  def f18(v0: s0, v1: s0, v2: Vector[s2]): s0 = {
    val v26: Vector[Vector[Double]] = v1.p0
    val v39: Vector[Vector[Double]] = v0.p0
    var v20: s0 = v0
    val v18: Vector[Vector[Double]] = v20.p1
    v20 = v20.copy(p1 = v26)
    val v38: Vector[Vector[Double]] = v20.p0
    var v76: s0 = v0
    v76 = v76.copy(p1 = v38)
    v76 = v1
    v20 = v20.copy(p0 = v26)
    v20 = v20.copy(p0 = v39)
    v20 = v20.copy(p0 = v18)
    v76 = v76.copy(p1 = v26)
    v76
  }
  def f16(v0: s2): s2 = {
    var v8: s2 = v0
    v8
  }
  def f15(v0: s0, v1: Vector[Vector[s2]]): s0 = {
    val v4: Vector[Vector[Vector[s2]]] = Vector(v1, v1, v1, v1, v1)
    var v6: s0 = v0
    val v5: Vector[s2] = v1(1)
    val v2: Vector[Vector[Double]] = v0.p1
    var v7: Vector[s2] = v5
    val v3: Vector[Vector[Double]] = v6.p0
    val v13: s0 = f18(v0, v6, v7)
    v6 = v6.copy(p1 = v2)
    val v11: s0 = f18(v13, v6, v7)
    val v14: s0 = f18(v13, v11, v5)
    val v15: s0 = f18(v11, v0, v7)
    v6 = v6.copy(p1 = v2)
    val v19: s0 = f18(v13, v14, v7)
    val v36: Vector[Vector[Double]] = v19.p1
    v6 = v6.copy(p1 = v36)
    val v20: s2 = v7(0)
    var v21: Vector[Vector[Vector[s2]]] = v4
    val v22: s2 = f16(v20)
    v7 = v7.updated(0, v22)
    var v35: s2 = v22
    val v55: Vector[s2] = v1(0)
    val v30: Vector[s1] = v20.p0
    val v24: Vector[Vector[s2]] = v21(4)
    v35 = v35.copy(p0 = v30)
    val v32: s0 = s0(v2, v36)
    val v49: Vector[s1] = v35.p0
    val v23: s1 = v30(1)
    v35 = v35.copy(p0 = v49)
    v6 = v6.copy(p0 = v36)
    val v50: s0 = v23.p1
    v6 = v6.copy(p0 = v2)
    v6 = v6.copy(p0 = v3)
    val v26: s0 = f18(v15, v32, v55)
    v7 = v7.updated(0, v35)
    val v68: Vector[s2] = v24(0)
    val v66: Vector[s0] = v20.p1
    val v64: Vector[Vector[s2]] = v21(4)
    val v59: s0 = v66(0)
    v6 = v6.copy(p1 = v3)
    val v82: Vector[s2] = v64(1)
    val v77: s0 = f18(v59, v50, v68)
    v35 = v35.copy(p0 = v49)
    val v114: s0 = f18(v26, v77, v82)
    v114
  }
  def f13(v0: s0, v1: s0): s0 = {
    var v5: s0 = v1
    v5 = v1
    var v4: s0 = v0
    v5 = v0
    val v2: Vector[Vector[Double]] = v5.p1
    v4 = v4.copy(p1 = v2)
    var v13: Vector[Vector[Double]] = v2
    val v6: Vector[Double] = v2(2)
    var v9: Vector[Vector[Double]] = v13
    var v7: s0 = v5
    val v8: Vector[Double] = v2(0)
    val v11: Vector[Vector[Double]] = v5.p1
    v9 = v9.updated(1, v8)
    var v15: s0 = v0
    var v3: Vector[Vector[Double]] = v13
    val v24: Double = v6(0)
    v5 = v5.copy(p0 = v3)
    v4 = v4.copy(p1 = v13)
    v9 = v9.updated(1, v6)
    val v14: Vector[Vector[Double]] = v5.p0
    val v31: Double = v8(0)
    v9 = v9.updated(2, v6)
    val v16: Vector[Double] = v14(0)
    v7 = v7.copy(p0 = v11)
    var v22: Vector[Vector[Double]] = v9
    val v28: Vector[Vector[Double]] = v0.p1
    val v12: Vector[Vector[Double]] = v7.p1
    v13 = v3
    var v19: Vector[Double] = v6
    v13 = v13.updated(1, v8)
    val v18: Vector[Double] = Vector(v24, v31, v24, v31, v24, v31, v31)
    v5 = v5.copy(p1 = v3)
    var v32: Double = v31
    val v40: Vector[Vector[Double]] = v0.p0
    v7 = v7.copy(p0 = v11)
    val v25: Vector[Vector[Double]] = v15.p1
    var v29: Vector[Vector[Double]] = v3
    var v56: Vector[Vector[Double]] = v29
    v5 = v5.copy(p0 = v28)
    val v76: Vector[Double] = v2(0)
    val v43: Double = v18(5)
    v13 = v13.updated(0, v8)
    val v79: Vector[Vector[Double]] = v4.p1
    val v70: Double = v31 * v43
    v7 = v7.copy(p0 = v79)
    v56 = v56.updated(0, v16)
    v19 = v19.updated(0, v24)
    val v53: Vector[Vector[Double]] = v0.p0
    v4 = v4.copy(p1 = v56)
    v19 = v76
    var v48: Double = v70
    v56 = v56.updated(2, v8)
    v5 = v4
    var v81: Vector[Double] = v76
    var v34: Double = v32
    v22 = v22.updated(1, v81)
    v5 = v5.copy(p1 = v29)
    v4 = v4.copy(p1 = v22)
    var v33: Double = v34
    v19 = v19.updated(0, v32)
    var v63: Vector[Double] = v16
    var v58: Double = v32
    val v51: Vector[Vector[Vector[Double]]] = Vector(v12, v25, v2, v56, v56, v13, v25)
    v29 = v29.updated(1, v8)
    v4 = v4.copy(p1 = v11)
    v81 = v81.updated(0, v33)
    v56 = v56.updated(0, v16)
    val v35: Vector[Vector[Double]] = v51(6)
    val v99: Vector[Double] = v35(1)
    val v41: Vector[Vector[Double]] = v51(0)
    val v50: Vector[Vector[Double]] = v4.p1
    v4 = v4.copy(p0 = v40)
    val v122: Vector[Double] = v41(1)
    val v88: Vector[Double] = v13(0)
    v19 = v19.updated(0, v33)
    v19 = v19.updated(0, v43)
    v81 = v81.updated(0, v43)
    v13 = v13.updated(2, v88)
    v15 = v15.copy(p1 = v79)
    val v100: s0 = s0(v56, v41)
    val v156: Vector[Vector[Double]] = v100.p1
    var v171: Vector[Vector[Vector[Double]]] = v51
    val v84: Vector[Vector[Double]] = v171(1)
    val v141: Vector[Vector[Double]] = v0.p1
    v33 = v58
    v4 = v4.copy(p0 = v50)
    val v80: Vector[Vector[Double]] = v4.p1
    v5 = v5.copy(p0 = v53)
    v4 = v4.copy(p1 = v141)
    val v123: Vector[Vector[Double]] = v171(0)
    v15 = v15.copy(p0 = v84)
    val v125: s0 = s0(v156, v123)
    v3 = v3.updated(0, v63)
    v9 = v9.updated(2, v19)
    v4 = v4.copy(p1 = v80)
    v22 = v22.updated(2, v99)
    v19 = v19.updated(0, v48)
    var v134: Vector[Double] = v122
    v29 = v29.updated(1, v134)
    v125
  }
  def f4(v0: s0): s0 = {
    val v2: s0 = f13(v0, v0)
    val v5: Vector[Vector[Double]] = v0.p0
    var v9: Vector[Vector[Double]] = v5
    val v7: s0 = s0(v9, v9)
    var v11: s0 = v0
    val v18: s0 = f13(v7, v11)
    val v12: Vector[Vector[Double]] = v2.p1
    val v21: Vector[Vector[Double]] = v2.p0
    v11 = v11.copy(p0 = v21)
    val v19: Vector[Double] = v5(2)
    val v44: s0 = f13(v0, v18)
    v9 = v9.updated(1, v19)
    val v34: Vector[Double] = v12(2)
    v9 = v9.updated(2, v34)
    val v25: s0 = f13(v44, v7)
    v25
  }
  @noinline
  def f0(v0: s2, v1: Vector[Vector[s2]], v2: Vector[Vector[Double]], v3: Double): Double = {
    val v8: Vector[s0] = v0.p1
    var v4: Vector[Vector[s2]] = v1
    v4 = v1
    val v13: s0 = v8(2)
    val v11: Vector[Vector[Double]] = v13.p0
    v4 = v1
    val v17: Vector[Vector[Double]] = v13.p1
    val v28: s0 = f4(v13)
    val v23: s0 = f15(v28, v4)
    var v35: Vector[Vector[Double]] = v11
    val v30: Vector[Vector[Double]] = v23.p1
    val v21: Vector[Double] = v30(1)
    v35 = v17
    v35 = v35.updated(0, v21)
    v35 = v2
    v35 = v35.updated(0, v21)
    v35 = v35.updated(1, v21)
    val v80: Vector[Double] = v35(2)
    v35 = v35.updated(0, v21)
    val v77: Double = v80(0)
    val v73: Double = v3 + v77
    v73
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(Vector(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0))), s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0)))), s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0)))), s1(Vector(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0))), s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0))), s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0), Vector(40.0), Vector(41.0)))), s0(Vector(Vector(42.0), Vector(43.0), Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0))))), Vector(s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0), Vector(52.0), Vector(53.0))), s0(Vector(Vector(54.0), Vector(55.0), Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0))), s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0), Vector(64.0), Vector(65.0)))))
    val v1: Vector[Vector[s2]] = Vector(Vector(s2(Vector(s1(Vector(s0(Vector(Vector(66.0), Vector(67.0), Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0))), s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)), Vector(Vector(75.0), Vector(76.0), Vector(77.0))), s0(Vector(Vector(78.0), Vector(79.0), Vector(80.0)), Vector(Vector(81.0), Vector(82.0), Vector(83.0)))), s0(Vector(Vector(84.0), Vector(85.0), Vector(86.0)), Vector(Vector(87.0), Vector(88.0), Vector(89.0)))), s1(Vector(s0(Vector(Vector(90.0), Vector(91.0), Vector(92.0)), Vector(Vector(93.0), Vector(94.0), Vector(95.0))), s0(Vector(Vector(96.0), Vector(97.0), Vector(98.0)), Vector(Vector(99.0), Vector(100.0), Vector(101.0))), s0(Vector(Vector(102.0), Vector(103.0), Vector(104.0)), Vector(Vector(105.0), Vector(106.0), Vector(107.0)))), s0(Vector(Vector(108.0), Vector(109.0), Vector(110.0)), Vector(Vector(111.0), Vector(112.0), Vector(113.0))))), Vector(s0(Vector(Vector(114.0), Vector(115.0), Vector(116.0)), Vector(Vector(117.0), Vector(118.0), Vector(119.0))), s0(Vector(Vector(120.0), Vector(121.0), Vector(122.0)), Vector(Vector(123.0), Vector(124.0), Vector(125.0))), s0(Vector(Vector(126.0), Vector(127.0), Vector(128.0)), Vector(Vector(129.0), Vector(130.0), Vector(131.0)))))), Vector(s2(Vector(s1(Vector(s0(Vector(Vector(132.0), Vector(133.0), Vector(134.0)), Vector(Vector(135.0), Vector(136.0), Vector(137.0))), s0(Vector(Vector(138.0), Vector(139.0), Vector(140.0)), Vector(Vector(141.0), Vector(142.0), Vector(143.0))), s0(Vector(Vector(144.0), Vector(145.0), Vector(146.0)), Vector(Vector(147.0), Vector(148.0), Vector(149.0)))), s0(Vector(Vector(150.0), Vector(151.0), Vector(152.0)), Vector(Vector(153.0), Vector(154.0), Vector(155.0)))), s1(Vector(s0(Vector(Vector(156.0), Vector(157.0), Vector(158.0)), Vector(Vector(159.0), Vector(160.0), Vector(161.0))), s0(Vector(Vector(162.0), Vector(163.0), Vector(164.0)), Vector(Vector(165.0), Vector(166.0), Vector(167.0))), s0(Vector(Vector(168.0), Vector(169.0), Vector(170.0)), Vector(Vector(171.0), Vector(172.0), Vector(173.0)))), s0(Vector(Vector(174.0), Vector(175.0), Vector(176.0)), Vector(Vector(177.0), Vector(178.0), Vector(179.0))))), Vector(s0(Vector(Vector(180.0), Vector(181.0), Vector(182.0)), Vector(Vector(183.0), Vector(184.0), Vector(185.0))), s0(Vector(Vector(186.0), Vector(187.0), Vector(188.0)), Vector(Vector(189.0), Vector(190.0), Vector(191.0))), s0(Vector(Vector(192.0), Vector(193.0), Vector(194.0)), Vector(Vector(195.0), Vector(196.0), Vector(197.0)))))), Vector(s2(Vector(s1(Vector(s0(Vector(Vector(198.0), Vector(199.0), Vector(200.0)), Vector(Vector(201.0), Vector(202.0), Vector(203.0))), s0(Vector(Vector(204.0), Vector(205.0), Vector(206.0)), Vector(Vector(207.0), Vector(208.0), Vector(209.0))), s0(Vector(Vector(210.0), Vector(211.0), Vector(212.0)), Vector(Vector(213.0), Vector(214.0), Vector(215.0)))), s0(Vector(Vector(216.0), Vector(217.0), Vector(218.0)), Vector(Vector(219.0), Vector(220.0), Vector(221.0)))), s1(Vector(s0(Vector(Vector(222.0), Vector(223.0), Vector(224.0)), Vector(Vector(225.0), Vector(226.0), Vector(227.0))), s0(Vector(Vector(228.0), Vector(229.0), Vector(230.0)), Vector(Vector(231.0), Vector(232.0), Vector(233.0))), s0(Vector(Vector(234.0), Vector(235.0), Vector(236.0)), Vector(Vector(237.0), Vector(238.0), Vector(239.0)))), s0(Vector(Vector(240.0), Vector(241.0), Vector(242.0)), Vector(Vector(243.0), Vector(244.0), Vector(245.0))))), Vector(s0(Vector(Vector(246.0), Vector(247.0), Vector(248.0)), Vector(Vector(249.0), Vector(250.0), Vector(251.0))), s0(Vector(Vector(252.0), Vector(253.0), Vector(254.0)), Vector(Vector(255.0), Vector(256.0), Vector(257.0))), s0(Vector(Vector(258.0), Vector(259.0), Vector(260.0)), Vector(Vector(261.0), Vector(262.0), Vector(263.0)))))))
    val v2: Vector[Vector[Double]] = Vector(Vector(264.0), Vector(265.0), Vector(266.0))
    val v3: Double = 267.0
    val start = nanoTime()
    var result: Double = 267.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}