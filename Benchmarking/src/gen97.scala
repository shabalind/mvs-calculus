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
    p0: s0,
    p1: Vector[Vector[s1]]
  )
  case class s3 (
    p0: s0,
    p1: Vector[s2]
  )
  case class s4 (
    p0: Vector[Vector[s2]],
    p1: s2,
    p2: s0
  )
  case class s5 (
    p0: s2,
    p1: s4
  )
  def f117(v0: s2, v1: s4): s4 = {
    val v2: s0 = v0.p0
    val v3: Vector[Vector[Double]] = v2.p0
    var v13: s4 = v1
    val v5: s0 = v13.p2
    var v15: s0 = v2
    val v14: Vector[Vector[s2]] = v13.p0
    v13 = v13.copy(p0 = v14)
    var v26: s4 = v1
    val v30: s2 = v26.p1
    var v17: s0 = v15
    val v35: Vector[s0] = Vector(v15)
    var v40: Vector[s0] = v35
    val v123: Vector[Vector[Double]] = v17.p0
    v40 = v40.updated(0, v17)
    var v25: s0 = v5
    var v33: s4 = v1
    v13 = v26
    val v46: s0 = v40(0)
    val v52: s1 = s1(v25, v46)
    v33 = v33.copy(p1 = v30)
    v40 = v40.updated(0, v5)
    val v101: s0 = v52.p1
    v25 = v25.copy(p0 = v3)
    val v76: s0 = v52.p1
    v17 = v17.copy(p0 = v123)
    v33 = v33.copy(p2 = v76)
    v15 = v101
    v33
  }
  def f110(v0: Vector[s2]): Vector[s2] = {
    val v5: s2 = v0(0)
    var v8: Vector[s2] = v0
    val v3: Vector[Vector[s1]] = v5.p1
    val v6: Vector[s1] = v3(0)
    val v2: s2 = v0(0)
    val v11: s2 = v0(0)
    val v7: s2 = v0(0)
    v8 = v8.updated(0, v11)
    v8 = v8.updated(0, v11)
    val v4: s0 = v7.p0
    val v9: Vector[Vector[s1]] = v11.p1
    v8 = v8.updated(0, v7)
    var v15: s2 = v2
    v15 = v15.copy(p1 = v9)
    val v10: s1 = s1(v4, v4)
    val v23: Vector[Vector[s1]] = v5.p1
    val v13: s0 = v10.p0
    v8 = v8.updated(0, v5)
    v8 = v8.updated(0, v7)
    val v24: s2 = s2(v13, v9)
    v15 = v15.copy(p1 = v23)
    var v27: Vector[s2] = v8
    val v35: Vector[s0] = Vector(v4, v13, v13, v13)
    v8 = v8.updated(0, v2)
    v27 = v27.updated(0, v15)
    var v33: Vector[s0] = v35
    v27 = v27.updated(0, v5)
    val v32: s0 = v24.p0
    v33 = v33.updated(3, v32)
    val v21: s1 = v6(0)
    v33 = v33.updated(3, v4)
    v27 = v27.updated(0, v24)
    v8 = v8.updated(0, v15)
    var v39: Vector[s0] = v35
    v8 = v8.updated(0, v2)
    v8 = v8.updated(0, v2)
    val v89: s0 = v33(1)
    v15 = v15.copy(p0 = v89)
    val v31: s0 = v2.p0
    v8 = v27
    var v83: Vector[s0] = v39
    val v78: s0 = v21.p1
    val v47: s0 = v5.p0
    val v179: s0 = v83(0)
    v33 = v33.updated(0, v179)
    v15 = v15.copy(p0 = v31)
    v83 = v83.updated(0, v47)
    v83 = v39
    v33 = v33.updated(1, v179)
    v39 = v39.updated(3, v78)
    v27
  }
  def f102(v0: Vector[Double]): Vector[Double] = {
    val v3: Double = v0(0)
    var v7: Double = v3
    val v5: Double = v0(0)
    val v10: Double = v0(0)
    val v1: Vector[Double] = Vector(v5, v3, v3)
    var v2: Vector[Double] = v0
    v2 = v2.updated(0, v5)
    var v8: Vector[Double] = v0
    var v11: Vector[Double] = v8
    var v6: Vector[Double] = v8
    v11 = v11.updated(0, v5)
    val v9: Double = v1(2)
    var v14: Vector[Double] = v1
    var v13: Vector[Double] = v6
    val v24: Double = v14(1)
    val v17: Double = v14(2)
    v6 = v6.updated(0, v5)
    val v28: Double = v1(1)
    var v15: Vector[Double] = v1
    v6 = v6.updated(0, v17)
    val v25: Double = v0(0)
    val v18: Double = v11(0)
    var v34: Vector[Double] = v1
    var v35: Double = v25
    val v42: Double = v14(2)
    var v27: Double = v9
    val v31: Double = v15(1)
    val v64: Double = v14(0)
    var v32: Vector[Double] = v34
    val v29: Double = v11(0)
    val v23: Double = v11(0)
    v13 = v13.updated(0, v7)
    v13 = v13.updated(0, v7)
    var v22: Vector[Double] = v14
    val v45: Double = v13(0)
    v32 = v32.updated(1, v24)
    val v48: Double = v13(0)
    v14 = v14.updated(1, v35)
    v15 = v22
    val v53: Double = v32(2)
    var v63: Vector[Double] = v2
    v32 = v32.updated(0, v53)
    v14 = v14.updated(2, v10)
    val v26: Vector[Vector[Double]] = Vector(v0, v11, v2, v11, v2, v8)
    v14 = v14.updated(2, v48)
    val v41: Vector[Double] = Vector(v27, v45, v27, v23, v45, v18, v5)
    val v110: Double = v63(0)
    v22 = v22.updated(2, v25)
    var v100: Double = v9
    v22 = v22.updated(0, v53)
    v15 = v15.updated(2, v29)
    v14 = v14.updated(0, v100)
    v63 = v63.updated(0, v23)
    val v56: Vector[Vector[Vector[Double]]] = Vector(v26, v26)
    v11 = v11.updated(0, v42)
    v11 = v11.updated(0, v23)
    val v79: Vector[Vector[Double]] = v56(0)
    val v81: Double = v41(5)
    var v65: Vector[Vector[Double]] = v79
    v11 = v11.updated(0, v81)
    v22 = v1
    val v120: Vector[Double] = v65(1)
    val v154: Double = v7 * v64
    v35 = v31
    v65 = v65.updated(1, v13)
    v2 = v2.updated(0, v28)
    v34 = v34.updated(1, v154)
    v7 = v110
    v120
  }
  def f96(v0: Vector[s4]): Vector[s4] = {
    var v6: Vector[s4] = v0
    val v1: s4 = v6(0)
    var v2: s4 = v1
    v6 = v6.updated(0, v2)
    v6 = v0
    val v3: s0 = v1.p2
    var v5: s0 = v3
    v2 = v2.copy(p2 = v3)
    v6 = v6.updated(0, v1)
    v6 = v6.updated(0, v1)
    var v11: Vector[s4] = v0
    val v8: s1 = s1(v5, v3)
    v6 = v6.updated(0, v2)
    v11 = v6
    val v10: s4 = v6(0)
    val v7: s4 = v11(0)
    val v16: s0 = v8.p0
    val v12: Vector[Vector[s2]] = v10.p0
    v2 = v2.copy(p2 = v16)
    var v30: Vector[Vector[s2]] = v12
    var v9: Vector[Vector[s2]] = v30
    var v15: Vector[Vector[s2]] = v30
    v2 = v2.copy(p2 = v3)
    val v20: Vector[s2] = v15(1)
    val v21: Vector[s2] = f110(v20)
    val v19: Vector[s2] = f110(v20)
    val v38: s2 = v20(0)
    var v41: s4 = v10
    val v18: s4 = v6(0)
    val v13: s4 = f117(v38, v10)
    v30 = v30.updated(1, v20)
    v41 = v41.copy(p1 = v38)
    val v22: Vector[Vector[Double]] = v3.p0
    val v24: Vector[Vector[s2]] = v18.p0
    val v28: Vector[s2] = f110(v20)
    v41 = v41.copy(p0 = v24)
    val v31: s2 = v7.p1
    val v35: Vector[s2] = v30(1)
    var v29: Vector[s2] = v21
    val v42: s2 = v19(0)
    val v58: Vector[s2] = f110(v19)
    v9 = v9.updated(1, v35)
    v9 = v9.updated(1, v58)
    val v44: s4 = f117(v38, v1)
    val v27: s4 = f117(v42, v13)
    v30 = v30.updated(0, v58)
    v29 = v29.updated(0, v31)
    v5 = v5.copy(p0 = v22)
    v5 = v5.copy(p0 = v22)
    v9 = v9.updated(0, v29)
    v6 = v6.updated(0, v7)
    var v92: s4 = v44
    var v34: Vector[s4] = v0
    var v66: s4 = v7
    v11 = v11.updated(0, v13)
    var v55: s4 = v44
    val v32: s5 = s5(v31, v27)
    val v76: Vector[s2] = f110(v28)
    v30 = v30.updated(0, v35)
    var v175: s2 = v38
    var v62: Vector[Vector[Double]] = v22
    v92 = v92.copy(p1 = v175)
    v30 = v30.updated(1, v76)
    val v118: s4 = f117(v31, v55)
    var v72: s5 = v32
    v6 = v6.updated(0, v66)
    val v103: s4 = v72.p1
    val v93: s4 = f117(v42, v118)
    v41 = v41.copy(p1 = v38)
    val v85: Vector[Vector[s2]] = v41.p0
    var v109: Vector[s2] = v76
    v15 = v15.updated(0, v20)
    v55 = v55.copy(p0 = v85)
    val v111: s2 = v28(0)
    val v98: s2 = v109(0)
    v2 = v2.copy(p0 = v15)
    v72 = v72.copy(p0 = v111)
    v9 = v9.updated(0, v58)
    v92 = v103
    var v147: Vector[s4] = v34
    v72 = v72.copy(p1 = v92)
    v147 = v147.updated(0, v93)
    val v162: s2 = v72.p0
    v2 = v2.copy(p0 = v9)
    v5 = v5.copy(p0 = v62)
    v29 = v29.updated(0, v98)
    v109 = v109.updated(0, v162)
    v147
  }
  def f42(v0: Double, v1: Vector[Vector[s4]]): Double = {
    var v5: Vector[Vector[s4]] = v1
    val v2: Vector[s4] = v5(0)
    val v16: s4 = v2(0)
    val v11: Vector[s4] = f96(v2)
    val v10: s0 = v16.p2
    var v42: s0 = v10
    val v32: Vector[Vector[Double]] = v42.p0
    val v54: Vector[Double] = v32(0)
    v5 = v5.updated(0, v2)
    val v22: Vector[Vector[Double]] = v10.p1
    var v65: Vector[Vector[Double]] = v32
    v65 = v65.updated(0, v54)
    v65 = v65.updated(0, v54)
    val v28: Vector[Double] = f102(v54)
    v42 = v42.copy(p0 = v65)
    val v49: Double = v54(0)
    v65 = v65.updated(0, v28)
    val v101: Vector[Double] = v22(0)
    var v51: Vector[Vector[Double]] = v22
    val v74: Vector[Double] = v51(1)
    v51 = v22
    v5 = v5.updated(2, v11)
    v51 = v51.updated(1, v101)
    v65 = v65.updated(0, v74)
    v51 = v51.updated(0, v54)
    var v77: Double = v49
    v65 = v65.updated(0, v74)
    var v124: Vector[Double] = v28
    v51 = v51.updated(0, v124)
    v77
  }
  @noinline
  def f0(v0: Vector[s3], v1: Vector[Vector[s4]], v2: Double): Double = {
    val v5: Double = f42(v2, v1)
    var v13: Double = v5
    var v19: Double = v13
    val v24: Double = v19 / v19
    v24
  }
  def benchmark(): Unit = {
    val v0: Vector[s3] = Vector(s3(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0))), Vector(s2(s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0))), Vector(Vector(s1(s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0))), s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0))))), Vector(s1(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0))), s0(Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0))))))), s2(s0(Vector(Vector(18.0)), Vector(Vector(19.0), Vector(20.0))), Vector(Vector(s1(s0(Vector(Vector(21.0)), Vector(Vector(22.0), Vector(23.0))), s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0))))), Vector(s1(s0(Vector(Vector(27.0)), Vector(Vector(28.0), Vector(29.0))), s0(Vector(Vector(30.0)), Vector(Vector(31.0), Vector(32.0))))))))), s3(s0(Vector(Vector(33.0)), Vector(Vector(34.0), Vector(35.0))), Vector(s2(s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0))), Vector(Vector(s1(s0(Vector(Vector(39.0)), Vector(Vector(40.0), Vector(41.0))), s0(Vector(Vector(42.0)), Vector(Vector(43.0), Vector(44.0))))), Vector(s1(s0(Vector(Vector(45.0)), Vector(Vector(46.0), Vector(47.0))), s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0))))))), s2(s0(Vector(Vector(51.0)), Vector(Vector(52.0), Vector(53.0))), Vector(Vector(s1(s0(Vector(Vector(54.0)), Vector(Vector(55.0), Vector(56.0))), s0(Vector(Vector(57.0)), Vector(Vector(58.0), Vector(59.0))))), Vector(s1(s0(Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0))), s0(Vector(Vector(63.0)), Vector(Vector(64.0), Vector(65.0))))))))), s3(s0(Vector(Vector(66.0)), Vector(Vector(67.0), Vector(68.0))), Vector(s2(s0(Vector(Vector(69.0)), Vector(Vector(70.0), Vector(71.0))), Vector(Vector(s1(s0(Vector(Vector(72.0)), Vector(Vector(73.0), Vector(74.0))), s0(Vector(Vector(75.0)), Vector(Vector(76.0), Vector(77.0))))), Vector(s1(s0(Vector(Vector(78.0)), Vector(Vector(79.0), Vector(80.0))), s0(Vector(Vector(81.0)), Vector(Vector(82.0), Vector(83.0))))))), s2(s0(Vector(Vector(84.0)), Vector(Vector(85.0), Vector(86.0))), Vector(Vector(s1(s0(Vector(Vector(87.0)), Vector(Vector(88.0), Vector(89.0))), s0(Vector(Vector(90.0)), Vector(Vector(91.0), Vector(92.0))))), Vector(s1(s0(Vector(Vector(93.0)), Vector(Vector(94.0), Vector(95.0))), s0(Vector(Vector(96.0)), Vector(Vector(97.0), Vector(98.0))))))))))
    val v1: Vector[Vector[s4]] = Vector(Vector(s4(Vector(Vector(s2(s0(Vector(Vector(99.0)), Vector(Vector(100.0), Vector(101.0))), Vector(Vector(s1(s0(Vector(Vector(102.0)), Vector(Vector(103.0), Vector(104.0))), s0(Vector(Vector(105.0)), Vector(Vector(106.0), Vector(107.0))))), Vector(s1(s0(Vector(Vector(108.0)), Vector(Vector(109.0), Vector(110.0))), s0(Vector(Vector(111.0)), Vector(Vector(112.0), Vector(113.0)))))))), Vector(s2(s0(Vector(Vector(114.0)), Vector(Vector(115.0), Vector(116.0))), Vector(Vector(s1(s0(Vector(Vector(117.0)), Vector(Vector(118.0), Vector(119.0))), s0(Vector(Vector(120.0)), Vector(Vector(121.0), Vector(122.0))))), Vector(s1(s0(Vector(Vector(123.0)), Vector(Vector(124.0), Vector(125.0))), s0(Vector(Vector(126.0)), Vector(Vector(127.0), Vector(128.0))))))))), s2(s0(Vector(Vector(129.0)), Vector(Vector(130.0), Vector(131.0))), Vector(Vector(s1(s0(Vector(Vector(132.0)), Vector(Vector(133.0), Vector(134.0))), s0(Vector(Vector(135.0)), Vector(Vector(136.0), Vector(137.0))))), Vector(s1(s0(Vector(Vector(138.0)), Vector(Vector(139.0), Vector(140.0))), s0(Vector(Vector(141.0)), Vector(Vector(142.0), Vector(143.0))))))), s0(Vector(Vector(144.0)), Vector(Vector(145.0), Vector(146.0))))), Vector(s4(Vector(Vector(s2(s0(Vector(Vector(147.0)), Vector(Vector(148.0), Vector(149.0))), Vector(Vector(s1(s0(Vector(Vector(150.0)), Vector(Vector(151.0), Vector(152.0))), s0(Vector(Vector(153.0)), Vector(Vector(154.0), Vector(155.0))))), Vector(s1(s0(Vector(Vector(156.0)), Vector(Vector(157.0), Vector(158.0))), s0(Vector(Vector(159.0)), Vector(Vector(160.0), Vector(161.0)))))))), Vector(s2(s0(Vector(Vector(162.0)), Vector(Vector(163.0), Vector(164.0))), Vector(Vector(s1(s0(Vector(Vector(165.0)), Vector(Vector(166.0), Vector(167.0))), s0(Vector(Vector(168.0)), Vector(Vector(169.0), Vector(170.0))))), Vector(s1(s0(Vector(Vector(171.0)), Vector(Vector(172.0), Vector(173.0))), s0(Vector(Vector(174.0)), Vector(Vector(175.0), Vector(176.0))))))))), s2(s0(Vector(Vector(177.0)), Vector(Vector(178.0), Vector(179.0))), Vector(Vector(s1(s0(Vector(Vector(180.0)), Vector(Vector(181.0), Vector(182.0))), s0(Vector(Vector(183.0)), Vector(Vector(184.0), Vector(185.0))))), Vector(s1(s0(Vector(Vector(186.0)), Vector(Vector(187.0), Vector(188.0))), s0(Vector(Vector(189.0)), Vector(Vector(190.0), Vector(191.0))))))), s0(Vector(Vector(192.0)), Vector(Vector(193.0), Vector(194.0))))), Vector(s4(Vector(Vector(s2(s0(Vector(Vector(195.0)), Vector(Vector(196.0), Vector(197.0))), Vector(Vector(s1(s0(Vector(Vector(198.0)), Vector(Vector(199.0), Vector(200.0))), s0(Vector(Vector(201.0)), Vector(Vector(202.0), Vector(203.0))))), Vector(s1(s0(Vector(Vector(204.0)), Vector(Vector(205.0), Vector(206.0))), s0(Vector(Vector(207.0)), Vector(Vector(208.0), Vector(209.0)))))))), Vector(s2(s0(Vector(Vector(210.0)), Vector(Vector(211.0), Vector(212.0))), Vector(Vector(s1(s0(Vector(Vector(213.0)), Vector(Vector(214.0), Vector(215.0))), s0(Vector(Vector(216.0)), Vector(Vector(217.0), Vector(218.0))))), Vector(s1(s0(Vector(Vector(219.0)), Vector(Vector(220.0), Vector(221.0))), s0(Vector(Vector(222.0)), Vector(Vector(223.0), Vector(224.0))))))))), s2(s0(Vector(Vector(225.0)), Vector(Vector(226.0), Vector(227.0))), Vector(Vector(s1(s0(Vector(Vector(228.0)), Vector(Vector(229.0), Vector(230.0))), s0(Vector(Vector(231.0)), Vector(Vector(232.0), Vector(233.0))))), Vector(s1(s0(Vector(Vector(234.0)), Vector(Vector(235.0), Vector(236.0))), s0(Vector(Vector(237.0)), Vector(Vector(238.0), Vector(239.0))))))), s0(Vector(Vector(240.0)), Vector(Vector(241.0), Vector(242.0))))))
    val v2: Double = 243.0
    val start = nanoTime()
    var result: Double = 243.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}