import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  case class s2 (
    p0: s1,
    p1: s0
  )
  case class s3 (
    p0: Vector[Vector[s2]],
    p1: Vector[s2]
  )
  def f111(v0: s2): s2 = {
    var v4: s2 = v0
    v4
  }
  def f108(v0: s0): s0 = {
    var v5: s0 = v0
    var v4: s0 = v5
    val v3: Vector[Vector[Double]] = v4.p0
    v4 = v4.copy(p0 = v3)
    var v1: s0 = v4
    val v8: Vector[Vector[Double]] = v1.p2
    val v2: Vector[Vector[Double]] = v1.p0
    val v6: Vector[Vector[Vector[Double]]] = Vector(v8, v8, v8, v8, v8)
    val v11: Vector[Vector[Double]] = v6(1)
    var v17: s0 = v4
    v1 = v1.copy(p2 = v8)
    v5 = v5.copy(p0 = v2)
    val v20: Vector[Vector[Double]] = v6(1)
    val v35: Vector[Vector[Double]] = v1.p0
    v17 = v17.copy(p2 = v11)
    v1 = v1.copy(p2 = v20)
    v4 = v4.copy(p2 = v8)
    v5 = v5.copy(p0 = v35)
    v17
  }
  def f106(v0: s1): s1 = {
    val v5: s0 = v0.p1
    val v1: s0 = f108(v5)
    var v6: s1 = v0
    val v3: s0 = f108(v5)
    v6 = v6.copy(p1 = v1)
    var v7: s1 = v6
    val v2: s0 = f108(v3)
    val v9: s0 = f108(v5)
    v6 = v6.copy(p1 = v2)
    val v11: Vector[s0] = v7.p0
    val v17: s0 = f108(v9)
    val v22: s0 = f108(v17)
    var v19: Vector[s0] = v11
    val v44: s0 = f108(v17)
    v6 = v6.copy(p1 = v9)
    var v24: Vector[s0] = v19
    v19 = v19.updated(0, v22)
    v24 = v24.updated(0, v9)
    val v42: s2 = s2(v7, v44)
    v6 = v6.copy(p0 = v24)
    val v108: s2 = f111(v42)
    val v55: s1 = v108.p0
    v24 = v24.updated(0, v44)
    v6 = v6.copy(p1 = v9)
    v55
  }
  def f103(v0: s2, v1: s0): s0 = {
    var v6: s2 = v0
    val v3: s0 = f108(v1)
    v6 = v6.copy(p1 = v1)
    val v8: s0 = v6.p1
    v6 = v0
    v6 = v6.copy(p1 = v8)
    v6 = v6.copy(p1 = v3)
    val v14: s0 = f108(v8)
    val v13: s0 = f108(v3)
    var v25: s0 = v3
    val v26: Vector[s0] = Vector(v8, v3, v14, v25, v3)
    v6 = v6.copy(p1 = v13)
    val v56: s0 = v26(2)
    v56
  }
  def f102(v0: s1, v1: s2): s2 = {
    val v6: s2 = f111(v1)
    v6
  }
  def f100(v0: s0): s0 = {
    var v4: s0 = v0
    val v6: Vector[Vector[Double]] = v0.p0
    val v1: Vector[Double] = v6(2)
    v4 = v4.copy(p0 = v6)
    val v5: Vector[Vector[Double]] = v4.p2
    val v2: Vector[Double] = v5(0)
    val v9: Vector[Vector[Double]] = v4.p0
    v4 = v4.copy(p2 = v5)
    val v8: Vector[Vector[Double]] = v4.p2
    var v3: Vector[Vector[Double]] = v6
    v4 = v4.copy(p0 = v9)
    var v7: Vector[Vector[Double]] = v5
    var v18: Vector[Double] = v1
    val v10: Vector[Vector[Double]] = v0.p2
    var v11: Vector[Vector[Double]] = v10
    v11 = v11.updated(0, v1)
    val v20: s0 = f108(v4)
    var v12: Vector[Vector[Double]] = v3
    v4 = v4.copy(p2 = v11)
    val v15: s0 = f108(v20)
    v7 = v7.updated(0, v18)
    v11 = v11.updated(0, v2)
    val v31: Vector[Vector[Double]] = v15.p1
    val v16: Double = v2(0)
    v12 = v12.updated(0, v1)
    v4 = v4.copy(p2 = v10)
    v4 = v4.copy(p2 = v7)
    v7 = v7.updated(0, v18)
    var v36: Vector[Vector[Double]] = v9
    v4 = v4.copy(p2 = v5)
    v4 = v4.copy(p0 = v12)
    v18 = v18.updated(0, v16)
    val v29: Vector[Double] = v31(1)
    val v46: Vector[Double] = v10(0)
    v18 = v18.updated(0, v16)
    var v62: Vector[Vector[Double]] = v10
    val v96: Vector[Double] = v7(0)
    v36 = v6
    v36 = v36.updated(1, v18)
    val v75: Vector[Double] = v8(0)
    var v32: Vector[Vector[Double]] = v12
    v4 = v4.copy(p2 = v62)
    var v68: Vector[Double] = v29
    val v77: Vector[Vector[Double]] = v15.p2
    v18 = v2
    var v101: Vector[Vector[Double]] = v7
    v11 = v77
    v101 = v101.updated(0, v96)
    v62 = v62.updated(0, v75)
    var v66: Vector[Vector[Double]] = v31
    val v87: s0 = s0(v36, v66, v101)
    v101 = v101.updated(0, v68)
    v7 = v77
    val v121: Vector[Double] = v32(2)
    v36 = v36.updated(1, v96)
    v66 = v66.updated(1, v46)
    v66 = v66.updated(1, v121)
    v87
  }
  def f98(v0: s2): s2 = {
    val v3: s1 = v0.p0
    val v2: Vector[s2] = Vector(v0)
    val v10: s0 = v3.p1
    val v5: s2 = v2(0)
    val v39: s2 = s2(v3, v10)
    val v38: s1 = v39.p0
    val v62: s2 = f102(v38, v5)
    v62
  }
  def f89(v0: s2): s2 = {
    var v4: s2 = v0
    val v1: s1 = v4.p0
    v4 = v4.copy(p0 = v1)
    val v2: s2 = f111(v0)
    var v5: s1 = v1
    val v6: s0 = v2.p1
    val v10: s2 = f111(v2)
    var v12: s1 = v5
    val v14: s1 = v10.p0
    val v20: s0 = f103(v4, v6)
    var v17: s1 = v1
    v4 = v4.copy(p1 = v20)
    val v16: s1 = v10.p0
    val v9: Vector[s0] = v14.p0
    val v24: s0 = f100(v20)
    v12 = v12.copy(p0 = v9)
    var v67: s2 = v0
    val v49: s2 = f102(v12, v67)
    val v90: s2 = f102(v16, v49)
    v12 = v12.copy(p0 = v9)
    v67 = v67.copy(p1 = v24)
    val v117: s2 = f102(v17, v90)
    v117
  }
  def f88(v0: s1): s1 = {
    val v1: s1 = f106(v0)
    val v2: s1 = f106(v0)
    val v5: s0 = v1.p1
    val v6: s0 = f108(v5)
    val v3: s0 = f100(v5)
    var v14: s1 = v1
    val v8: s0 = v1.p1
    v14 = v14.copy(p1 = v8)
    var v16: s1 = v14
    v16 = v16.copy(p1 = v6)
    v14 = v14.copy(p1 = v8)
    v14 = v14.copy(p1 = v3)
    val v57: Vector[s0] = v2.p0
    v14 = v14.copy(p0 = v57)
    v16
  }
  def f84(v0: s0): s0 = {
    var v5: s0 = v0
    val v7: Vector[Vector[Double]] = v0.p1
    val v4: Vector[Vector[Double]] = v5.p0
    var v8: Vector[Vector[Double]] = v7
    val v1: Vector[Double] = v7(1)
    var v3: Vector[Vector[Double]] = v7
    var v2: Vector[Double] = v1
    val v6: Vector[Vector[Double]] = v5.p0
    val v9: Double = v1(0)
    val v13: Vector[Double] = v7(1)
    val v11: Vector[Vector[Double]] = v0.p2
    val v21: s0 = f108(v5)
    val v10: Vector[Vector[Double]] = v5.p2
    val v12: Vector[Double] = v10(0)
    v2 = v2.updated(0, v9)
    v3 = v7
    v5 = v5.copy(p0 = v6)
    val v15: Double = v2(0)
    v5 = v5.copy(p0 = v4)
    val v19: s0 = s0(v4, v3, v11)
    val v24: s0 = f108(v19)
    val v74: Double = v13(0)
    var v36: Double = v15
    val v32: Vector[Vector[Double]] = v19.p0
    val v26: Double = v36 + v74
    val v20: s0 = f108(v24)
    val v69: Vector[Vector[Double]] = v24.p2
    val v28: s0 = f100(v20)
    val v59: Vector[Double] = v32(2)
    val v38: Vector[Vector[Double]] = v24.p0
    val v22: Vector[Vector[Double]] = v28.p2
    val v39: Vector[Double] = v69(0)
    val v30: Vector[Vector[Double]] = v21.p0
    v5 = v5.copy(p0 = v4)
    val v161: s0 = s0(v30, v8, v22)
    val v53: Vector[Vector[Double]] = v21.p1
    val v79: s0 = f108(v161)
    val v132: Vector[Double] = v8(0)
    val v57: Vector[s0] = Vector(v161, v161, v79)
    v5 = v5.copy(p2 = v11)
    v8 = v8.updated(0, v2)
    v2 = v2.updated(0, v26)
    v8 = v8.updated(0, v12)
    val v111: s0 = v57(1)
    val v105: s0 = f108(v111)
    v3 = v3.updated(1, v59)
    v2 = v39
    v5 = v5.copy(p0 = v38)
    v5 = v5.copy(p1 = v53)
    v3 = v3.updated(1, v132)
    v105
  }
  def f83(v0: s3): s3 = {
    v0
  }
  def f80(v0: s2): s2 = {
    val v1: s2 = f89(v0)
    val v6: s1 = v1.p0
    val v2: s1 = f88(v6)
    val v11: s2 = f102(v2, v0)
    v11
  }
  def f74(v0: s2, v1: s0): s2 = {
    val v7: s0 = f100(v1)
    var v8: s2 = v0
    var v6: s0 = v7
    val v9: s0 = f103(v8, v6)
    val v17: s2 = f111(v0)
    val v21: s0 = v17.p1
    var v51: s2 = v8
    val v16: s0 = f100(v7)
    val v14: s1 = v51.p0
    v8 = v8.copy(p0 = v14)
    val v36: s1 = v0.p0
    val v15: s2 = f98(v51)
    var v50: s1 = v36
    v50 = v50.copy(p1 = v21)
    val v39: Vector[Vector[Double]] = v16.p2
    val v57: s1 = f106(v50)
    v51 = v51.copy(p0 = v50)
    val v54: s2 = f102(v57, v15)
    v6 = v6.copy(p2 = v39)
    v51 = v51.copy(p1 = v9)
    v54
  }
  def f49(v0: s2): s2 = {
    var v11: s2 = v0
    val v13: s2 = f89(v11)
    v13
  }
  def f43(v0: s0, v1: s2): s2 = {
    var v5: s2 = v1
    v5 = v5.copy(p1 = v0)
    v5 = v5.copy(p1 = v0)
    val v2: s2 = f98(v1)
    val v14: s2 = f74(v2, v0)
    val v10: Vector[s2] = Vector(v2, v5, v14, v2, v5, v1, v5)
    val v17: s2 = v10(0)
    v17
  }
  def f42(v0: s1): s1 = {
    val v4: s1 = f106(v0)
    val v3: s1 = f106(v4)
    val v2: Vector[s1] = Vector(v0, v3)
    val v9: s1 = v2(0)
    val v52: s1 = f88(v9)
    v52
  }
  def f38(v0: s0): s0 = {
    val v1: s0 = f108(v0)
    val v7: s0 = f108(v1)
    var v3: s0 = v7
    v3 = v1
    val v5: s0 = f100(v1)
    val v6: Vector[Vector[Double]] = v3.p0
    var v11: s0 = v5
    v11 = v11.copy(p0 = v6)
    var v2: s0 = v11
    val v9: Vector[Double] = v6(2)
    v3 = v3.copy(p0 = v6)
    v11 = v11.copy(p0 = v6)
    val v29: Vector[Vector[Double]] = v2.p2
    val v14: Vector[Vector[Double]] = v2.p0
    val v44: Vector[Vector[Double]] = v0.p2
    val v43: s0 = f100(v1)
    v2 = v2.copy(p0 = v6)
    val v26: Vector[Vector[Double]] = v43.p2
    val v28: Vector[Vector[Double]] = v5.p1
    var v60: Vector[Vector[Double]] = v14
    var v42: Vector[Vector[Double]] = v26
    v11 = v11.copy(p0 = v6)
    val v35: s0 = s0(v60, v28, v29)
    v2 = v2.copy(p2 = v42)
    v11 = v11.copy(p2 = v29)
    v11 = v11.copy(p1 = v28)
    v3 = v3.copy(p2 = v44)
    v11 = v11.copy(p2 = v44)
    v60 = v60.updated(2, v9)
    v35
  }
  def f29(v0: s2): s2 = {
    var v1: s2 = v0
    val v7: s1 = v1.p0
    val v6: s2 = f98(v0)
    val v5: s0 = v6.p1
    v1 = v1.copy(p0 = v7)
    var v3: s1 = v7
    v1 = v1.copy(p0 = v3)
    val v9: s0 = f103(v0, v5)
    val v2: s2 = f80(v0)
    v1 = v1.copy(p1 = v9)
    val v15: Vector[s2] = Vector(v1, v2, v2, v6, v0, v2)
    val v11: s1 = v2.p0
    var v19: s1 = v7
    v19 = v19.copy(p1 = v9)
    val v25: s2 = v15(2)
    val v24: s0 = v19.p1
    val v26: s2 = f49(v25)
    val v22: s2 = f111(v26)
    v1 = v1.copy(p0 = v11)
    v1 = v1.copy(p0 = v7)
    val v93: s2 = f89(v22)
    val v56: s2 = f74(v93, v24)
    val v46: s2 = f98(v56)
    v46
  }
  def f21(v0: s0, v1: s0): s0 = {
    var v7: s0 = v1
    val v3: s0 = f108(v0)
    val v2: s0 = f38(v0)
    val v5: Vector[Vector[Double]] = v7.p1
    val v4: Vector[Vector[Vector[Double]]] = Vector(v5, v5, v5, v5)
    val v16: s0 = f38(v1)
    val v14: Vector[Vector[Double]] = v2.p2
    val v28: Vector[Vector[Double]] = v16.p0
    val v43: Vector[Vector[Vector[Double]]] = Vector(v28)
    var v26: Vector[Vector[Vector[Double]]] = v4
    var v38: Vector[Vector[Vector[Double]]] = v43
    val v22: Vector[Vector[Double]] = v38(0)
    val v77: Vector[Vector[Double]] = v26(1)
    val v44: Vector[Vector[Double]] = v3.p0
    v38 = v38.updated(0, v44)
    val v73: s0 = s0(v22, v77, v14)
    v7 = v7.copy(p1 = v5)
    v73
  }
  def f5(v0: s0, v1: s0, v2: s3, v3: s0): s0 = {
    val v7: Vector[s0] = Vector(v3, v3, v0, v3, v0, v0, v1)
    var v74: Vector[s0] = v7
    val v58: s0 = v74(6)
    var v69: Vector[s0] = v74
    v74 = v69
    v58
  }
  @noinline
  def f0(v0: s2, v1: Vector[Vector[s3]], v2: Double): Double = {
    val v4: s2 = f29(v0)
    val v10: Vector[s3] = v1(0)
    var v8: s2 = v4
    val v9: s1 = v0.p0
    val v3: s0 = v8.p1
    val v13: s2 = f98(v0)
    val v14: s0 = f103(v13, v3)
    val v17: s0 = f84(v3)
    var v11: s0 = v17
    v8 = v8.copy(p1 = v11)
    val v15: s3 = v10(0)
    val v34: Vector[s1] = Vector(v9, v9)
    var v22: s0 = v14
    val v30: s1 = v34(1)
    val v27: s1 = f42(v30)
    val v47: Vector[Vector[Double]] = v3.p2
    v22 = v22.copy(p2 = v47)
    v11 = v11.copy(p2 = v47)
    val v42: s0 = f21(v3, v11)
    val v18: Vector[Vector[Double]] = v3.p0
    val v71: Vector[Double] = v18(0)
    val v64: Double = v71(0)
    val v33: Vector[Vector[Double]] = v14.p2
    var v53: s2 = v4
    val v80: s2 = f43(v42, v53)
    val v57: s1 = v13.p0
    val v82: s3 = f83(v15)
    val v88: s0 = v80.p1
    v8 = v8.copy(p1 = v22)
    val v141: s1 = v4.p0
    val v102: s0 = f103(v80, v14)
    var v85: Double = v64
    v53 = v53.copy(p0 = v57)
    val v92: Vector[Vector[Double]] = v102.p2
    v53 = v53.copy(p0 = v30)
    val v66: s0 = f5(v88, v14, v82, v22)
    val v84: s0 = v4.p1
    v53 = v53.copy(p1 = v42)
    val v69: Vector[Vector[Double]] = v66.p0
    v11 = v11.copy(p2 = v92)
    v11 = v11.copy(p0 = v69)
    v53 = v53.copy(p1 = v84)
    v11 = v11.copy(p0 = v18)
    v8 = v8.copy(p0 = v27)
    v11 = v11.copy(p2 = v33)
    val v93: Double = v85 + v85
    var v162: Double = v93
    v8 = v8.copy(p0 = v141)
    v162
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0)))), s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0)))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0))))
    val v1: Vector[Vector[s3]] = Vector(Vector(s3(Vector(Vector(s2(s1(Vector(s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0)))), s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0)), Vector(Vector(29.0)))), s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0)), Vector(Vector(35.0))))), Vector(s2(s1(Vector(s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0), Vector(40.0)), Vector(Vector(41.0)))), s0(Vector(Vector(42.0), Vector(43.0), Vector(44.0)), Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0)))), s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0), Vector(52.0)), Vector(Vector(53.0)))))), Vector(s2(s1(Vector(s0(Vector(Vector(54.0), Vector(55.0), Vector(56.0)), Vector(Vector(57.0), Vector(58.0)), Vector(Vector(59.0)))), s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0), Vector(64.0)), Vector(Vector(65.0)))), s0(Vector(Vector(66.0), Vector(67.0), Vector(68.0)), Vector(Vector(69.0), Vector(70.0)), Vector(Vector(71.0)))), s2(s1(Vector(s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)), Vector(Vector(75.0), Vector(76.0)), Vector(Vector(77.0)))), s0(Vector(Vector(78.0), Vector(79.0), Vector(80.0)), Vector(Vector(81.0), Vector(82.0)), Vector(Vector(83.0)))), s0(Vector(Vector(84.0), Vector(85.0), Vector(86.0)), Vector(Vector(87.0), Vector(88.0)), Vector(Vector(89.0)))), s2(s1(Vector(s0(Vector(Vector(90.0), Vector(91.0), Vector(92.0)), Vector(Vector(93.0), Vector(94.0)), Vector(Vector(95.0)))), s0(Vector(Vector(96.0), Vector(97.0), Vector(98.0)), Vector(Vector(99.0), Vector(100.0)), Vector(Vector(101.0)))), s0(Vector(Vector(102.0), Vector(103.0), Vector(104.0)), Vector(Vector(105.0), Vector(106.0)), Vector(Vector(107.0))))))), Vector(s3(Vector(Vector(s2(s1(Vector(s0(Vector(Vector(108.0), Vector(109.0), Vector(110.0)), Vector(Vector(111.0), Vector(112.0)), Vector(Vector(113.0)))), s0(Vector(Vector(114.0), Vector(115.0), Vector(116.0)), Vector(Vector(117.0), Vector(118.0)), Vector(Vector(119.0)))), s0(Vector(Vector(120.0), Vector(121.0), Vector(122.0)), Vector(Vector(123.0), Vector(124.0)), Vector(Vector(125.0))))), Vector(s2(s1(Vector(s0(Vector(Vector(126.0), Vector(127.0), Vector(128.0)), Vector(Vector(129.0), Vector(130.0)), Vector(Vector(131.0)))), s0(Vector(Vector(132.0), Vector(133.0), Vector(134.0)), Vector(Vector(135.0), Vector(136.0)), Vector(Vector(137.0)))), s0(Vector(Vector(138.0), Vector(139.0), Vector(140.0)), Vector(Vector(141.0), Vector(142.0)), Vector(Vector(143.0)))))), Vector(s2(s1(Vector(s0(Vector(Vector(144.0), Vector(145.0), Vector(146.0)), Vector(Vector(147.0), Vector(148.0)), Vector(Vector(149.0)))), s0(Vector(Vector(150.0), Vector(151.0), Vector(152.0)), Vector(Vector(153.0), Vector(154.0)), Vector(Vector(155.0)))), s0(Vector(Vector(156.0), Vector(157.0), Vector(158.0)), Vector(Vector(159.0), Vector(160.0)), Vector(Vector(161.0)))), s2(s1(Vector(s0(Vector(Vector(162.0), Vector(163.0), Vector(164.0)), Vector(Vector(165.0), Vector(166.0)), Vector(Vector(167.0)))), s0(Vector(Vector(168.0), Vector(169.0), Vector(170.0)), Vector(Vector(171.0), Vector(172.0)), Vector(Vector(173.0)))), s0(Vector(Vector(174.0), Vector(175.0), Vector(176.0)), Vector(Vector(177.0), Vector(178.0)), Vector(Vector(179.0)))), s2(s1(Vector(s0(Vector(Vector(180.0), Vector(181.0), Vector(182.0)), Vector(Vector(183.0), Vector(184.0)), Vector(Vector(185.0)))), s0(Vector(Vector(186.0), Vector(187.0), Vector(188.0)), Vector(Vector(189.0), Vector(190.0)), Vector(Vector(191.0)))), s0(Vector(Vector(192.0), Vector(193.0), Vector(194.0)), Vector(Vector(195.0), Vector(196.0)), Vector(Vector(197.0))))))))
    val v2: Double = 198.0
    val start = nanoTime()
    var result: Double = 198.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}