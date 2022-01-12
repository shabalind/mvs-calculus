import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s2 (
    p0: s1,
    p1: Vector[s1]
  )
  case class s3 (
    p0: s0,
    p1: s2
  )
  case class s4 (
    p0: s3,
    p1: s0
  )
  case class s6 (
    p0: Double,
    p1: Vector[s2]
  )
  case class s7 (
    p0: Vector[Vector[s0]],
    p1: Vector[Vector[s6]]
  )
  case class s10 (
    p0: s4,
    p1: Vector[s3]
  )
  def f121(v0: s10, v1: s1): s10 = {
    v0
  }
  def f117(v0: s0): s0 = {
    val v3: Vector[Vector[Double]] = v0.p0
    val v4: Vector[Double] = v3(1)
    var v7: s0 = v0
    val v11: Double = v4(0)
    v7 = v7.copy(p0 = v3)
    var v1: Double = v11
    v7 = v7.copy(p0 = v3)
    val v9: Vector[Vector[Double]] = v7.p0
    var v2: Double = v1
    val v5: Vector[Vector[Double]] = v0.p0
    val v14: Vector[Vector[Double]] = v7.p0
    var v40: Vector[Double] = v4
    val v16: s0 = s0(v3)
    v40 = v40.updated(0, v2)
    var v18: Vector[Double] = v4
    v7 = v7.copy(p0 = v14)
    val v15: Vector[Vector[Double]] = v7.p0
    v40 = v40.updated(0, v1)
    val v21: Double = v2 + v11
    val v12: Vector[Double] = Vector(v11, v1, v21)
    val v26: Vector[Vector[Double]] = v16.p0
    v40 = v40.updated(0, v2)
    v7 = v7.copy(p0 = v5)
    v40 = v40.updated(0, v11)
    v7 = v7.copy(p0 = v3)
    var v25: s0 = v0
    v25 = v25.copy(p0 = v9)
    val v37: Double = v12(1)
    v7 = v7.copy(p0 = v5)
    val v35: Vector[s0] = Vector(v0, v25, v16, v7, v0, v7)
    v1 = v11
    val v43: Vector[Vector[Double]] = v25.p0
    var v31: Vector[Vector[Double]] = v14
    val v19: Vector[Vector[Double]] = v0.p0
    v7 = v7.copy(p0 = v15)
    val v52: Vector[Vector[Double]] = v0.p0
    val v32: Vector[Vector[Double]] = v7.p0
    v25 = v25.copy(p0 = v52)
    var v34: Vector[s0] = v35
    v40 = v40.updated(0, v37)
    var v41: Vector[s0] = v34
    var v85: Vector[s0] = v41
    v25 = v25.copy(p0 = v26)
    v31 = v31.updated(0, v40)
    v7 = v7.copy(p0 = v19)
    v7 = v7.copy(p0 = v5)
    var v42: Vector[Vector[Double]] = v9
    v7 = v7.copy(p0 = v32)
    v7 = v7.copy(p0 = v43)
    v7 = v7.copy(p0 = v31)
    val v147: s0 = v85(1)
    v25 = v25.copy(p0 = v42)
    val v73: Vector[Vector[Double]] = v147.p0
    v25 = v25.copy(p0 = v15)
    v85 = v35
    val v145: Double = v18(0)
    v85 = v85.updated(3, v147)
    v40 = v40.updated(0, v145)
    val v126: s0 = s0(v73)
    v126
  }
  def f110(v0: s10): s10 = {
    val v8: Vector[s3] = v0.p1
    val v7: s4 = v0.p0
    val v3: s3 = v8(0)
    val v6: s0 = v7.p1
    var v13: s3 = v3
    var v39: s3 = v3
    val v15: s2 = v13.p1
    v39 = v39.copy(p0 = v6)
    v13 = v39
    val v21: s1 = v15.p0
    v39 = v39.copy(p0 = v6)
    v13 = v13.copy(p1 = v15)
    val v25: s0 = v21.p0
    var v38: s1 = v21
    v38 = v38.copy(p0 = v25)
    v38 = v21
    val v70: s10 = f121(v0, v38)
    val v48: Vector[s1] = Vector(v38, v38, v21, v21, v21, v21, v38)
    val v72: s1 = v48(3)
    val v152: s10 = f121(v70, v72)
    v152
  }
  def f93(v0: s7): s7 = {
    var v3: s7 = v0
    var v4: s7 = v0
    var v5: s7 = v4
    var v8: s7 = v5
    val v1: Vector[Vector[s6]] = v8.p1
    val v7: Vector[Vector[s0]] = v4.p0
    v5 = v5.copy(p0 = v7)
    val v15: Vector[Vector[s6]] = v3.p1
    v5 = v5.copy(p1 = v1)
    v8 = v8.copy(p0 = v7)
    v3 = v3.copy(p0 = v7)
    val v27: Vector[Vector[s6]] = v3.p1
    val v40: Vector[Vector[s0]] = v4.p0
    v3 = v0
    val v49: s7 = s7(v7, v27)
    v4 = v4.copy(p1 = v27)
    val v32: Vector[Vector[s0]] = v49.p0
    val v57: Vector[Vector[s0]] = v0.p0
    val v107: Vector[s0] = v32(0)
    var v45: s7 = v4
    v4 = v4.copy(p1 = v1)
    v8 = v0
    var v173: Vector[Vector[s0]] = v57
    v8 = v8.copy(p0 = v57)
    v45 = v45.copy(p0 = v40)
    v45 = v45.copy(p1 = v27)
    v8 = v8.copy(p0 = v173)
    v8 = v8.copy(p1 = v15)
    v3 = v3.copy(p0 = v7)
    v173 = v173.updated(0, v107)
    v45
  }
  def f90(v0: s0): s0 = {
    val v2: s0 = f117(v0)
    v2
  }
  def f89(v0: s0): s0 = {
    val v6: Vector[Vector[Double]] = v0.p0
    val v8: s0 = f117(v0)
    var v4: Vector[Vector[Double]] = v6
    val v11: Vector[Vector[Double]] = v0.p0
    var v7: Vector[Vector[Double]] = v11
    var v3: s0 = v8
    v3 = v3.copy(p0 = v7)
    v3 = v0
    var v36: s0 = v3
    v3 = v3.copy(p0 = v4)
    val v57: s0 = f117(v36)
    val v95: s0 = f90(v57)
    v36 = v36.copy(p0 = v11)
    v95
  }
  def f87(v0: s3): s3 = {
    var v5: s3 = v0
    val v2: s0 = v0.p0
    val v4: s0 = v5.p0
    var v3: s3 = v5
    val v6: s0 = f117(v2)
    val v29: s0 = f90(v6)
    var v16: s3 = v3
    val v20: s2 = v0.p1
    val v19: s0 = f117(v29)
    val v33: Vector[Vector[Double]] = v4.p0
    v16 = v16.copy(p1 = v20)
    var v50: s0 = v29
    val v51: s0 = f90(v50)
    v50 = v50.copy(p0 = v33)
    val v92: s0 = f89(v19)
    var v75: s3 = v16
    v5 = v5.copy(p0 = v51)
    v75 = v75.copy(p0 = v92)
    v75
  }
  def f86(v0: s10): s10 = {
    val v7: s10 = f110(v0)
    val v2: s4 = v0.p0
    val v1: s4 = v0.p0
    val v4: Vector[s3] = v7.p1
    val v8: Vector[s3] = v7.p1
    val v5: s10 = f110(v0)
    var v10: s10 = v5
    v10 = v10.copy(p0 = v1)
    var v11: Vector[s3] = v4
    v10 = v10.copy(p0 = v2)
    val v23: s10 = s10(v1, v8)
    val v13: s3 = v11(1)
    val v18: s3 = f87(v13)
    val v22: s10 = f110(v10)
    val v28: s3 = v1.p0
    v10 = v10.copy(p1 = v11)
    v10 = v10.copy(p1 = v4)
    v11 = v11.updated(1, v18)
    v10 = v23
    v11 = v11.updated(2, v28)
    v22
  }
  def f81(v0: Vector[s6]): Vector[s6] = {
    val v5: s6 = v0(0)
    val v28: s6 = v0(0)
    val v35: s6 = v0(0)
    var v47: Vector[s6] = v0
    v47 = v47.updated(0, v35)
    v47 = v47.updated(0, v28)
    v47 = v47.updated(0, v5)
    v47
  }
  def f69(v0: Double): Double = {
    var v3: Double = v0
    var v4: Double = v0
    val v5: Vector[Double] = Vector(v4, v4, v3)
    var v2: Vector[Double] = v5
    var v10: Double = v4
    var v14: Vector[Double] = v2
    v2 = v2.updated(1, v10)
    v2 = v2.updated(2, v0)
    var v13: Vector[Double] = v5
    var v24: Vector[Double] = v5
    val v11: Double = v24(1)
    v24 = v24.updated(0, v3)
    val v20: Double = v13(2)
    v13 = v13.updated(0, v10)
    var v16: Double = v20
    val v19: Double = v5(0)
    v13 = v13.updated(1, v3)
    var v38: Vector[Double] = v24
    var v22: Double = v16
    v13 = v13.updated(2, v22)
    v13 = v13.updated(1, v4)
    val v23: Double = v14(1)
    v24 = v13
    v38 = v38.updated(1, v3)
    val v54: Double = v24(0)
    v38 = v38.updated(1, v54)
    v38 = v38.updated(1, v10)
    v38 = v38.updated(2, v23)
    var v73: Vector[Double] = v38
    v13 = v13.updated(2, v11)
    v13 = v24
    val v87: Double = v73(2)
    v73 = v73.updated(1, v19)
    v24 = v24.updated(1, v22)
    v87
  }
  def f43(v0: Vector[Vector[s6]]): Vector[Vector[s6]] = {
    val v3: Vector[s6] = v0(0)
    val v7: Vector[s6] = f81(v3)
    val v4: Vector[s6] = f81(v7)
    var v14: Vector[Vector[s6]] = v0
    v14 = v14.updated(0, v4)
    v14 = v14.updated(0, v7)
    var v21: Vector[Vector[s6]] = v14
    var v18: Vector[Vector[s6]] = v21
    val v32: Vector[Vector[Vector[s6]]] = Vector(v18, v14, v14, v18, v0, v21)
    val v43: Vector[Vector[s6]] = v32(2)
    v43
  }
  def f36(v0: s7): s7 = {
    var v3: s7 = v0
    val v1: Vector[Vector[s0]] = v0.p0
    val v2: Vector[Vector[s0]] = v0.p0
    val v11: Vector[s0] = v1(0)
    val v7: Vector[Vector[s6]] = v3.p1
    v3 = v3.copy(p0 = v2)
    val v5: s0 = v11(0)
    val v8: Vector[Vector[s0]] = Vector(v11, v11, v11, v11, v11, v11, v11)
    var v12: Vector[Vector[s0]] = v2
    v3 = v3.copy(p1 = v7)
    var v29: s0 = v5
    val v18: Vector[s0] = v8(5)
    val v51: s0 = f90(v29)
    val v42: Vector[Vector[Double]] = v51.p0
    v29 = v29.copy(p0 = v42)
    var v43: Vector[s0] = v18
    val v40: Vector[s0] = v12(0)
    v43 = v43.updated(0, v51)
    v12 = v12.updated(0, v40)
    val v54: Vector[Vector[s6]] = f43(v7)
    v12 = v12.updated(0, v43)
    v3 = v3.copy(p0 = v12)
    val v93: s7 = s7(v12, v54)
    v93
  }
  def f13(v0: Double): Double = {
    val v8: Double = v0 * v0
    val v4: Double = f69(v8)
    var v2: Double = v4
    val v10: Double = f69(v4)
    val v1: Double = f69(v10)
    var v18: Double = v8
    var v11: Double = v4
    val v15: Double = f69(v1)
    v18 = v8
    val v9: Double = f69(v8)
    val v23: Vector[Double] = Vector(v8, v11, v1, v18)
    var v31: Vector[Double] = v23
    val v29: Double = f69(v2)
    v31 = v31.updated(0, v15)
    val v16: Double = v31(2)
    val v33: Double = f69(v16)
    v31 = v31.updated(2, v16)
    var v35: Vector[Double] = v23
    var v44: Vector[Double] = v31
    v2 = v16
    val v43: Double = f69(v10)
    v44 = v44.updated(1, v43)
    val v41: Double = v23(3)
    var v64: Vector[Double] = v44
    val v91: Double = v64(0)
    val v49: Double = v41 - v29
    val v60: Double = f69(v33)
    val v115: Double = f69(v9)
    v31 = v31.updated(3, v91)
    var v68: Vector[Double] = v35
    v44 = v68
    val v96: Double = f69(v49)
    v64 = v64.updated(3, v115)
    val v143: Double = v35(3)
    var v110: Vector[Double] = v64
    val v106: Vector[Double] = Vector(v143, v96)
    val v190: Double = v106(0)
    v31 = v31.updated(0, v60)
    v35 = v110
    v190
  }
  def f8(v0: s10, v1: s7): s7 = {
    val v5: s7 = f36(v1)
    var v7: s7 = v1
    val v4: Vector[Vector[s6]] = v7.p1
    val v10: Vector[Vector[s6]] = f43(v4)
    val v11: Vector[Vector[s0]] = v5.p0
    var v19: s7 = v1
    var v24: s7 = v19
    v7 = v7.copy(p0 = v11)
    val v51: Vector[Vector[s0]] = v1.p0
    val v152: s7 = f93(v24)
    v7 = v7.copy(p1 = v10)
    v19 = v19.copy(p1 = v10)
    v7 = v7.copy(p0 = v51)
    val v128: s7 = f93(v152)
    v128
  }
  @noinline
  def f0(v0: Vector[s7], v1: s10, v2: Double): Double = {
    var v4: Vector[s7] = v0
    var v6: Vector[s7] = v4
    var v5: Vector[s7] = v0
    val v3: s10 = f86(v1)
    val v13: s7 = v4(1)
    val v10: s7 = f8(v3, v13)
    val v20: Vector[Vector[s6]] = v10.p1
    v6 = v6.updated(1, v10)
    v6 = v6.updated(0, v13)
    v4 = v0
    val v78: Vector[s6] = v20(0)
    val v25: Double = f69(v2)
    val v45: s6 = v78(0)
    val v58: Vector[s6] = v20(0)
    val v93: s6 = v58(0)
    var v43: Vector[s6] = v58
    val v39: Double = v25 / v25
    val v32: s7 = v6(0)
    v43 = v43.updated(0, v45)
    val v27: Double = f13(v39)
    v4 = v4.updated(0, v32)
    v4 = v5
    val v59: s6 = v43(0)
    val v97: Vector[s6] = v20(0)
    var v95: s6 = v93
    var v121: Vector[s6] = v97
    v43 = v43.updated(0, v45)
    v121 = v121.updated(0, v95)
    val v146: s6 = v121(0)
    v43 = v43.updated(0, v146)
    v5 = v5.updated(0, v32)
    val v203: Double = v59.p0
    val v410: Double = f69(v203)
    val v242: Double = v27 - v410
    v242
  }
  def benchmark(): Unit = {
    val v0: Vector[s7] = Vector(s7(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0))))), Vector(Vector(s6(2.0, Vector(s2(s1(s0(Vector(Vector(3.0), Vector(4.0))), Vector(s0(Vector(Vector(5.0), Vector(6.0))), s0(Vector(Vector(7.0), Vector(8.0))), s0(Vector(Vector(9.0), Vector(10.0))))), Vector(s1(s0(Vector(Vector(11.0), Vector(12.0))), Vector(s0(Vector(Vector(13.0), Vector(14.0))), s0(Vector(Vector(15.0), Vector(16.0))), s0(Vector(Vector(17.0), Vector(18.0))))), s1(s0(Vector(Vector(19.0), Vector(20.0))), Vector(s0(Vector(Vector(21.0), Vector(22.0))), s0(Vector(Vector(23.0), Vector(24.0))), s0(Vector(Vector(25.0), Vector(26.0))))))), s2(s1(s0(Vector(Vector(27.0), Vector(28.0))), Vector(s0(Vector(Vector(29.0), Vector(30.0))), s0(Vector(Vector(31.0), Vector(32.0))), s0(Vector(Vector(33.0), Vector(34.0))))), Vector(s1(s0(Vector(Vector(35.0), Vector(36.0))), Vector(s0(Vector(Vector(37.0), Vector(38.0))), s0(Vector(Vector(39.0), Vector(40.0))), s0(Vector(Vector(41.0), Vector(42.0))))), s1(s0(Vector(Vector(43.0), Vector(44.0))), Vector(s0(Vector(Vector(45.0), Vector(46.0))), s0(Vector(Vector(47.0), Vector(48.0))), s0(Vector(Vector(49.0), Vector(50.0))))))), s2(s1(s0(Vector(Vector(51.0), Vector(52.0))), Vector(s0(Vector(Vector(53.0), Vector(54.0))), s0(Vector(Vector(55.0), Vector(56.0))), s0(Vector(Vector(57.0), Vector(58.0))))), Vector(s1(s0(Vector(Vector(59.0), Vector(60.0))), Vector(s0(Vector(Vector(61.0), Vector(62.0))), s0(Vector(Vector(63.0), Vector(64.0))), s0(Vector(Vector(65.0), Vector(66.0))))), s1(s0(Vector(Vector(67.0), Vector(68.0))), Vector(s0(Vector(Vector(69.0), Vector(70.0))), s0(Vector(Vector(71.0), Vector(72.0))), s0(Vector(Vector(73.0), Vector(74.0)))))))))))), s7(Vector(Vector(s0(Vector(Vector(75.0), Vector(76.0))))), Vector(Vector(s6(77.0, Vector(s2(s1(s0(Vector(Vector(78.0), Vector(79.0))), Vector(s0(Vector(Vector(80.0), Vector(81.0))), s0(Vector(Vector(82.0), Vector(83.0))), s0(Vector(Vector(84.0), Vector(85.0))))), Vector(s1(s0(Vector(Vector(86.0), Vector(87.0))), Vector(s0(Vector(Vector(88.0), Vector(89.0))), s0(Vector(Vector(90.0), Vector(91.0))), s0(Vector(Vector(92.0), Vector(93.0))))), s1(s0(Vector(Vector(94.0), Vector(95.0))), Vector(s0(Vector(Vector(96.0), Vector(97.0))), s0(Vector(Vector(98.0), Vector(99.0))), s0(Vector(Vector(100.0), Vector(101.0))))))), s2(s1(s0(Vector(Vector(102.0), Vector(103.0))), Vector(s0(Vector(Vector(104.0), Vector(105.0))), s0(Vector(Vector(106.0), Vector(107.0))), s0(Vector(Vector(108.0), Vector(109.0))))), Vector(s1(s0(Vector(Vector(110.0), Vector(111.0))), Vector(s0(Vector(Vector(112.0), Vector(113.0))), s0(Vector(Vector(114.0), Vector(115.0))), s0(Vector(Vector(116.0), Vector(117.0))))), s1(s0(Vector(Vector(118.0), Vector(119.0))), Vector(s0(Vector(Vector(120.0), Vector(121.0))), s0(Vector(Vector(122.0), Vector(123.0))), s0(Vector(Vector(124.0), Vector(125.0))))))), s2(s1(s0(Vector(Vector(126.0), Vector(127.0))), Vector(s0(Vector(Vector(128.0), Vector(129.0))), s0(Vector(Vector(130.0), Vector(131.0))), s0(Vector(Vector(132.0), Vector(133.0))))), Vector(s1(s0(Vector(Vector(134.0), Vector(135.0))), Vector(s0(Vector(Vector(136.0), Vector(137.0))), s0(Vector(Vector(138.0), Vector(139.0))), s0(Vector(Vector(140.0), Vector(141.0))))), s1(s0(Vector(Vector(142.0), Vector(143.0))), Vector(s0(Vector(Vector(144.0), Vector(145.0))), s0(Vector(Vector(146.0), Vector(147.0))), s0(Vector(Vector(148.0), Vector(149.0)))))))))))))
    val v1: s10 = s10(s4(s3(s0(Vector(Vector(150.0), Vector(151.0))), s2(s1(s0(Vector(Vector(152.0), Vector(153.0))), Vector(s0(Vector(Vector(154.0), Vector(155.0))), s0(Vector(Vector(156.0), Vector(157.0))), s0(Vector(Vector(158.0), Vector(159.0))))), Vector(s1(s0(Vector(Vector(160.0), Vector(161.0))), Vector(s0(Vector(Vector(162.0), Vector(163.0))), s0(Vector(Vector(164.0), Vector(165.0))), s0(Vector(Vector(166.0), Vector(167.0))))), s1(s0(Vector(Vector(168.0), Vector(169.0))), Vector(s0(Vector(Vector(170.0), Vector(171.0))), s0(Vector(Vector(172.0), Vector(173.0))), s0(Vector(Vector(174.0), Vector(175.0)))))))), s0(Vector(Vector(176.0), Vector(177.0)))), Vector(s3(s0(Vector(Vector(178.0), Vector(179.0))), s2(s1(s0(Vector(Vector(180.0), Vector(181.0))), Vector(s0(Vector(Vector(182.0), Vector(183.0))), s0(Vector(Vector(184.0), Vector(185.0))), s0(Vector(Vector(186.0), Vector(187.0))))), Vector(s1(s0(Vector(Vector(188.0), Vector(189.0))), Vector(s0(Vector(Vector(190.0), Vector(191.0))), s0(Vector(Vector(192.0), Vector(193.0))), s0(Vector(Vector(194.0), Vector(195.0))))), s1(s0(Vector(Vector(196.0), Vector(197.0))), Vector(s0(Vector(Vector(198.0), Vector(199.0))), s0(Vector(Vector(200.0), Vector(201.0))), s0(Vector(Vector(202.0), Vector(203.0)))))))), s3(s0(Vector(Vector(204.0), Vector(205.0))), s2(s1(s0(Vector(Vector(206.0), Vector(207.0))), Vector(s0(Vector(Vector(208.0), Vector(209.0))), s0(Vector(Vector(210.0), Vector(211.0))), s0(Vector(Vector(212.0), Vector(213.0))))), Vector(s1(s0(Vector(Vector(214.0), Vector(215.0))), Vector(s0(Vector(Vector(216.0), Vector(217.0))), s0(Vector(Vector(218.0), Vector(219.0))), s0(Vector(Vector(220.0), Vector(221.0))))), s1(s0(Vector(Vector(222.0), Vector(223.0))), Vector(s0(Vector(Vector(224.0), Vector(225.0))), s0(Vector(Vector(226.0), Vector(227.0))), s0(Vector(Vector(228.0), Vector(229.0)))))))), s3(s0(Vector(Vector(230.0), Vector(231.0))), s2(s1(s0(Vector(Vector(232.0), Vector(233.0))), Vector(s0(Vector(Vector(234.0), Vector(235.0))), s0(Vector(Vector(236.0), Vector(237.0))), s0(Vector(Vector(238.0), Vector(239.0))))), Vector(s1(s0(Vector(Vector(240.0), Vector(241.0))), Vector(s0(Vector(Vector(242.0), Vector(243.0))), s0(Vector(Vector(244.0), Vector(245.0))), s0(Vector(Vector(246.0), Vector(247.0))))), s1(s0(Vector(Vector(248.0), Vector(249.0))), Vector(s0(Vector(Vector(250.0), Vector(251.0))), s0(Vector(Vector(252.0), Vector(253.0))), s0(Vector(Vector(254.0), Vector(255.0))))))))))
    val v2: Double = 256.0
    val start = nanoTime()
    var result: Double = 256.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}