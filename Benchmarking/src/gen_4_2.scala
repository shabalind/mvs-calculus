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
    p0: s1,
    p1: Vector[Vector[s0]]
  )
  case class s4 (
    p0: s0,
    p1: Vector[s1]
  )
  case class s5 (
    p0: Vector[s4],
    p1: s4,
    p2: s2
  )
  def f43(v0: Vector[s4]): Vector[s4] = {
    var v7: Vector[s4] = v0
    var v5: Vector[s4] = v7
    var v4: Vector[s4] = v5
    var v1: Vector[s4] = v5
    val v6: s4 = v1(1)
    val v8: s0 = v6.p0
    var v12: s4 = v6
    val v14: s4 = v5(0)
    v5 = v5.updated(0, v12)
    v12 = v12.copy(p0 = v8)
    v12 = v12.copy(p0 = v8)
    v12 = v12.copy(p0 = v8)
    v12 = v12.copy(p0 = v8)
    v5 = v4
    val v58: s0 = v14.p0
    val v36: s4 = v4(1)
    val v54: s0 = v6.p0
    v7 = v7.updated(0, v36)
    val v56: s4 = v5(1)
    val v43: Vector[s1] = v6.p1
    v12 = v12.copy(p1 = v43)
    val v38: Vector[s1] = v12.p1
    var v51: Vector[s4] = v1
    v12 = v12.copy(p1 = v43)
    v12 = v12.copy(p0 = v58)
    v12 = v12.copy(p0 = v54)
    v12 = v12.copy(p1 = v38)
    v51 = v51.updated(1, v56)
    v51
  }
  def f42(v0: s5, v1: s0): s5 = {
    var v6: s5 = v0
    var v5: s5 = v0
    val v2: Vector[s5] = Vector(v6)
    val v13: s4 = v6.p1
    v6 = v6.copy(p1 = v13)
    v6 = v0
    var v8: s4 = v13
    val v14: Vector[s1] = v8.p1
    v6 = v6.copy(p1 = v8)
    var v12: Vector[s5] = v2
    v12 = v2
    v12 = v12.updated(0, v5)
    v8 = v8.copy(p1 = v14)
    v12 = v2
    val v110: s5 = v12(0)
    v110
  }
  def f41(v0: s2, v1: s0): s2 = {
    val v2: s1 = v0.p0
    val v30: Vector[Vector[s0]] = v0.p1
    val v48: s2 = s2(v2, v30)
    var v33: s2 = v48
    val v62: Vector[s2] = Vector(v0, v33, v33, v33, v33, v33, v33)
    val v110: s2 = v62(3)
    v110
  }
  def f38(v0: s1): s1 = {
    var v7: s1 = v0
    var v4: s1 = v0
    var v3: s1 = v4
    var v6: s1 = v0
    val v2: Vector[s0] = v3.p1
    val v9: Vector[s0] = v6.p0
    var v1: Vector[s0] = v2
    val v10: s0 = v2(0)
    var v8: Vector[s0] = v1
    val v18: s0 = v9(1)
    val v32: Vector[Vector[Double]] = v10.p0
    val v20: Vector[s0] = v6.p0
    val v12: Vector[s0] = v7.p0
    var v14: s0 = v10
    val v21: s1 = s1(v20, v8)
    val v34: s0 = v8(1)
    var v37: Vector[s0] = v9
    v7 = v7.copy(p0 = v12)
    v14 = v14.copy(p0 = v32)
    val v15: s0 = v8(0)
    var v52: s0 = v18
    v8 = v8.updated(1, v52)
    v6 = v6.copy(p1 = v1)
    v1 = v1.updated(1, v34)
    v8 = v8.updated(1, v18)
    v4 = v4.copy(p1 = v1)
    var v40: s1 = v21
    v4 = v4.copy(p0 = v12)
    val v43: Vector[s0] = v6.p0
    v6 = v6.copy(p0 = v37)
    v37 = v37.updated(1, v15)
    val v41: Vector[s0] = v0.p1
    v37 = v37.updated(1, v34)
    v3 = v3.copy(p1 = v1)
    v4 = v4.copy(p0 = v37)
    v3 = v3.copy(p1 = v1)
    v4 = v4.copy(p0 = v43)
    v8 = v8.updated(0, v18)
    var v122: Vector[s0] = v41
    v40 = v40.copy(p1 = v122)
    v40 = v40.copy(p1 = v41)
    val v90: Vector[s1] = Vector(v0, v3, v4, v40, v0, v21, v21)
    v122 = v122.updated(1, v14)
    var v81: Vector[s1] = v90
    val v83: s1 = v81(1)
    v83
  }
  def f37(v0: s0, v1: s1): s1 = {
    var v5: s1 = v1
    val v20: s1 = f38(v5)
    v20
  }
  def f35(v0: s1): s1 = {
    val v7: s1 = f38(v0)
    val v6: s1 = f38(v0)
    val v3: s1 = f38(v0)
    var v2: s1 = v7
    val v4: Vector[s1] = Vector(v3, v2, v7)
    val v5: s1 = f38(v2)
    val v1: Vector[s0] = v5.p0
    v2 = v2.copy(p0 = v1)
    val v9: s1 = f38(v6)
    v2 = v2.copy(p0 = v1)
    val v12: Vector[Vector[s0]] = Vector(v1, v1, v1)
    val v21: s0 = v1(0)
    val v31: Vector[s0] = v12(0)
    val v18: s4 = s4(v21, v4)
    v2 = v2.copy(p0 = v31)
    val v47: Vector[s1] = v18.p1
    val v59: s1 = v47(2)
    v2 = v59
    val v38: Vector[s0] = v9.p0
    val v34: s1 = v47(2)
    v2 = v2.copy(p0 = v38)
    v2 = v2.copy(p0 = v38)
    v34
  }
  def f32(v0: Vector[s1], v1: s5): s5 = {
    val v4: s4 = v1.p1
    var v6: s4 = v4
    val v2: s1 = v0(0)
    val v3: s1 = f35(v2)
    val v5: s0 = v6.p0
    val v10: s1 = f38(v2)
    var v11: s5 = v1
    var v8: s5 = v1
    val v20: Vector[s1] = v4.p1
    v8 = v8.copy(p1 = v6)
    v8 = v8.copy(p1 = v4)
    var v15: Vector[s1] = v20
    val v13: Vector[s1] = v4.p1
    var v24: s0 = v5
    v15 = v15.updated(1, v2)
    val v17: s2 = v11.p2
    v15 = v15.updated(0, v10)
    v15 = v15.updated(0, v10)
    v15 = v15.updated(0, v10)
    val v16: s1 = v20(2)
    v15 = v15.updated(2, v3)
    v11 = v11.copy(p2 = v17)
    val v33: s2 = f41(v17, v5)
    v6 = v6.copy(p0 = v24)
    v8 = v8.copy(p2 = v33)
    var v32: Vector[s1] = v15
    val v69: s0 = v6.p0
    var v37: s4 = v4
    v11 = v11.copy(p1 = v37)
    val v53: Vector[s4] = v8.p0
    v6 = v6.copy(p1 = v32)
    val v58: Vector[Vector[Double]] = v69.p0
    var v39: Vector[s1] = v0
    v6 = v6.copy(p0 = v5)
    v39 = v39.updated(0, v16)
    val v113: s5 = s5(v53, v37, v33)
    v8 = v8.copy(p1 = v4)
    v6 = v6.copy(p0 = v24)
    v32 = v32.updated(2, v16)
    v15 = v15.updated(0, v16)
    v8 = v8.copy(p0 = v53)
    v6 = v4
    val v215: s1 = v39(0)
    v15 = v15.updated(0, v215)
    v24 = v24.copy(p0 = v58)
    v6 = v6.copy(p1 = v13)
    v113
  }
  def f24(v0: s5): s5 = {
    var v7: s5 = v0
    var v5: s5 = v7
    val v3: s2 = v5.p2
    var v1: s5 = v5
    val v2: Vector[Vector[s0]] = v3.p1
    val v21: Vector[s0] = v2(0)
    v7 = v0
    val v10: s0 = v21(0)
    v5 = v5.copy(p2 = v3)
    val v11: s2 = f41(v3, v10)
    v7 = v7.copy(p2 = v11)
    var v9: s0 = v10
    v7 = v1
    val v8: Vector[Vector[Double]] = v9.p0
    val v13: Vector[s4] = v0.p0
    v5 = v5.copy(p0 = v13)
    var v16: Vector[s4] = v13
    val v12: s0 = v21(0)
    val v15: s0 = v21(0)
    val v29: s5 = f42(v7, v12)
    var v17: Vector[Vector[Double]] = v8
    val v20: Vector[Double] = v17(0)
    val v26: s4 = v29.p1
    v7 = v7.copy(p0 = v13)
    val v35: s2 = f41(v11, v9)
    val v36: s2 = f41(v35, v15)
    val v32: Vector[s4] = f43(v16)
    v5 = v5.copy(p0 = v32)
    val v31: s2 = v5.p2
    var v23: s4 = v26
    v7 = v7.copy(p2 = v35)
    v1 = v1.copy(p2 = v36)
    val v55: Vector[s4] = f43(v13)
    var v50: Vector[s4] = v13
    var v74: Vector[Double] = v20
    v5 = v5.copy(p2 = v36)
    v50 = v50.updated(1, v23)
    var v86: s5 = v0
    v16 = v55
    val v97: Vector[Double] = v8(1)
    v86 = v86.copy(p1 = v23)
    v17 = v17.updated(1, v97)
    val v64: Vector[s4] = f43(v13)
    v86 = v86.copy(p2 = v31)
    val v84: s4 = v50(0)
    v9 = v9.copy(p0 = v17)
    v17 = v17.updated(2, v74)
    val v91: Vector[s4] = f43(v32)
    v5 = v5.copy(p1 = v84)
    v16 = v64
    v5 = v5.copy(p0 = v91)
    val v106: s5 = f42(v86, v9)
    v106
  }
  def f11(v0: Vector[s1]): Vector[s1] = {
    var v5: Vector[s1] = v0
    v5 = v0
    var v3: Vector[s1] = v5
    val v4: s1 = v5(2)
    val v11: s1 = f38(v4)
    var v8: Vector[s1] = v3
    v3 = v3.updated(0, v11)
    v5 = v5.updated(0, v4)
    var v20: Vector[s1] = v8
    v20
  }
  @noinline
  def f0(v0: s5, v1: Double): Double = {
    var v7: s5 = v0
    val v5: s5 = f24(v0)
    val v2: s5 = f24(v5)
    val v6: s4 = v7.p1
    val v4: Vector[s1] = v6.p1
    var v12: s5 = v7
    var v8: s4 = v6
    val v9: s0 = v6.p0
    val v13: Vector[s1] = v6.p1
    var v18: s0 = v9
    val v15: s0 = v8.p0
    val v14: Vector[s1] = f11(v13)
    val v19: s4 = v12.p1
    var v32: s0 = v9
    val v25: s1 = v13(2)
    val v31: s1 = f37(v32, v25)
    val v20: Vector[s1] = f11(v14)
    var v16: s4 = v19
    val v34: s1 = v13(0)
    val v26: Vector[s1] = Vector(v31)
    val v45: s1 = v4(2)
    val v28: s1 = v4(1)
    var v42: Vector[s1] = v20
    var v33: Vector[s1] = v26
    v16 = v16.copy(p1 = v4)
    v42 = v42.updated(1, v31)
    v42 = v14
    val v49: s2 = v12.p2
    v16 = v16.copy(p1 = v13)
    val v92: s2 = f41(v49, v15)
    var v52: Vector[s1] = v26
    val v41: s1 = f38(v34)
    v12 = v12.copy(p2 = v92)
    val v56: s1 = f38(v25)
    var v51: Vector[s1] = v13
    v33 = v33.updated(0, v28)
    v16 = v16.copy(p1 = v4)
    var v37: s2 = v49
    val v50: s5 = f32(v33, v12)
    v52 = v52.updated(0, v25)
    val v53: Vector[Vector[Double]] = v18.p0
    v8 = v8.copy(p1 = v51)
    var v43: Vector[Vector[Double]] = v53
    v52 = v52.updated(0, v25)
    var v72: s4 = v16
    v42 = v42.updated(0, v56)
    var v47: Vector[Vector[Double]] = v43
    val v97: s1 = f38(v45)
    var v74: s4 = v72
    var v98: Vector[Vector[Double]] = v47
    val v104: s1 = v37.p0
    v7 = v7.copy(p2 = v37)
    val v73: s0 = v72.p0
    v42 = v42.updated(2, v56)
    var v105: Vector[Vector[Double]] = v98
    v12 = v12.copy(p2 = v92)
    v42 = v42.updated(0, v41)
    v8 = v8.copy(p1 = v42)
    v12 = v2
    v42 = v42.updated(0, v31)
    val v125: Vector[Double] = v105(0)
    v52 = v52.updated(0, v104)
    v32 = v32.copy(p0 = v105)
    v33 = v33.updated(0, v97)
    v8 = v8.copy(p1 = v51)
    v98 = v98.updated(2, v125)
    val v151: Vector[Double] = v105(1)
    v52 = v52.updated(0, v56)
    v12 = v50
    val v120: Double = v151(0)
    val v247: Vector[s1] = v74.p1
    v72 = v72.copy(p1 = v247)
    v105 = v105.updated(0, v125)
    v8 = v8.copy(p0 = v73)
    val v187: s1 = v52(0)
    v51 = v51.updated(2, v187)
    v120
  }
  def benchmark(): Unit = {
    val v0: s5 = s5(Vector(s4(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0))), Vector(s1(Vector(s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0))), s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0)))), Vector(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0))), s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0))), s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0))))), s1(Vector(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0))), s0(Vector(Vector(28.0), Vector(29.0), Vector(30.0)), Vector(Vector(31.0)))), Vector(s0(Vector(Vector(32.0), Vector(33.0), Vector(34.0)), Vector(Vector(35.0))), s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0))), s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0))))), s1(Vector(s0(Vector(Vector(44.0), Vector(45.0), Vector(46.0)), Vector(Vector(47.0))), s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0)))), Vector(s0(Vector(Vector(52.0), Vector(53.0), Vector(54.0)), Vector(Vector(55.0))), s0(Vector(Vector(56.0), Vector(57.0), Vector(58.0)), Vector(Vector(59.0))), s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0))))))), s4(s0(Vector(Vector(64.0), Vector(65.0), Vector(66.0)), Vector(Vector(67.0))), Vector(s1(Vector(s0(Vector(Vector(68.0), Vector(69.0), Vector(70.0)), Vector(Vector(71.0))), s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)), Vector(Vector(75.0)))), Vector(s0(Vector(Vector(76.0), Vector(77.0), Vector(78.0)), Vector(Vector(79.0))), s0(Vector(Vector(80.0), Vector(81.0), Vector(82.0)), Vector(Vector(83.0))), s0(Vector(Vector(84.0), Vector(85.0), Vector(86.0)), Vector(Vector(87.0))))), s1(Vector(s0(Vector(Vector(88.0), Vector(89.0), Vector(90.0)), Vector(Vector(91.0))), s0(Vector(Vector(92.0), Vector(93.0), Vector(94.0)), Vector(Vector(95.0)))), Vector(s0(Vector(Vector(96.0), Vector(97.0), Vector(98.0)), Vector(Vector(99.0))), s0(Vector(Vector(100.0), Vector(101.0), Vector(102.0)), Vector(Vector(103.0))), s0(Vector(Vector(104.0), Vector(105.0), Vector(106.0)), Vector(Vector(107.0))))), s1(Vector(s0(Vector(Vector(108.0), Vector(109.0), Vector(110.0)), Vector(Vector(111.0))), s0(Vector(Vector(112.0), Vector(113.0), Vector(114.0)), Vector(Vector(115.0)))), Vector(s0(Vector(Vector(116.0), Vector(117.0), Vector(118.0)), Vector(Vector(119.0))), s0(Vector(Vector(120.0), Vector(121.0), Vector(122.0)), Vector(Vector(123.0))), s0(Vector(Vector(124.0), Vector(125.0), Vector(126.0)), Vector(Vector(127.0)))))))), s4(s0(Vector(Vector(128.0), Vector(129.0), Vector(130.0)), Vector(Vector(131.0))), Vector(s1(Vector(s0(Vector(Vector(132.0), Vector(133.0), Vector(134.0)), Vector(Vector(135.0))), s0(Vector(Vector(136.0), Vector(137.0), Vector(138.0)), Vector(Vector(139.0)))), Vector(s0(Vector(Vector(140.0), Vector(141.0), Vector(142.0)), Vector(Vector(143.0))), s0(Vector(Vector(144.0), Vector(145.0), Vector(146.0)), Vector(Vector(147.0))), s0(Vector(Vector(148.0), Vector(149.0), Vector(150.0)), Vector(Vector(151.0))))), s1(Vector(s0(Vector(Vector(152.0), Vector(153.0), Vector(154.0)), Vector(Vector(155.0))), s0(Vector(Vector(156.0), Vector(157.0), Vector(158.0)), Vector(Vector(159.0)))), Vector(s0(Vector(Vector(160.0), Vector(161.0), Vector(162.0)), Vector(Vector(163.0))), s0(Vector(Vector(164.0), Vector(165.0), Vector(166.0)), Vector(Vector(167.0))), s0(Vector(Vector(168.0), Vector(169.0), Vector(170.0)), Vector(Vector(171.0))))), s1(Vector(s0(Vector(Vector(172.0), Vector(173.0), Vector(174.0)), Vector(Vector(175.0))), s0(Vector(Vector(176.0), Vector(177.0), Vector(178.0)), Vector(Vector(179.0)))), Vector(s0(Vector(Vector(180.0), Vector(181.0), Vector(182.0)), Vector(Vector(183.0))), s0(Vector(Vector(184.0), Vector(185.0), Vector(186.0)), Vector(Vector(187.0))), s0(Vector(Vector(188.0), Vector(189.0), Vector(190.0)), Vector(Vector(191.0))))))), s2(s1(Vector(s0(Vector(Vector(192.0), Vector(193.0), Vector(194.0)), Vector(Vector(195.0))), s0(Vector(Vector(196.0), Vector(197.0), Vector(198.0)), Vector(Vector(199.0)))), Vector(s0(Vector(Vector(200.0), Vector(201.0), Vector(202.0)), Vector(Vector(203.0))), s0(Vector(Vector(204.0), Vector(205.0), Vector(206.0)), Vector(Vector(207.0))), s0(Vector(Vector(208.0), Vector(209.0), Vector(210.0)), Vector(Vector(211.0))))), Vector(Vector(s0(Vector(Vector(212.0), Vector(213.0), Vector(214.0)), Vector(Vector(215.0)))), Vector(s0(Vector(Vector(216.0), Vector(217.0), Vector(218.0)), Vector(Vector(219.0)))), Vector(s0(Vector(Vector(220.0), Vector(221.0), Vector(222.0)), Vector(Vector(223.0)))))))
    val v1: Double = 224.0
    val start = nanoTime()
    var result: Double = 224.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}