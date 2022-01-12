import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Double,
    p1: Vector[s0],
    p2: s0
  )
  case class s2 (
    p0: Vector[s1],
    p1: Vector[s1]
  )
  case class s5 (
    p0: Vector[s2],
    p1: s1
  )
  def f36(v0: s1): s1 = {
    val v5: s0 = v0.p2
    val v4: Vector[s0] = Vector(v5, v5, v5, v5, v5)
    var v1: s1 = v0
    val v2: Vector[Vector[Double]] = v5.p0
    val v6: Vector[Vector[Double]] = v5.p0
    val v7: s0 = v4(0)
    var v8: Vector[Vector[Double]] = v6
    val v12: s0 = v4(2)
    val v3: Vector[Vector[Double]] = v5.p1
    val v9: Vector[Double] = v3(0)
    val v14: Vector[s0] = v1.p1
    var v11: Vector[Vector[Double]] = v3
    var v18: Vector[Vector[Double]] = v3
    var v10: s0 = v7
    val v17: Double = v9(0)
    var v26: Double = v17
    var v15: s0 = v10
    var v20: Vector[Vector[Double]] = v11
    var v23: s1 = v1
    val v28: Vector[Vector[Double]] = v7.p0
    v8 = v8.updated(2, v9)
    val v16: Vector[Vector[Double]] = v7.p0
    val v24: Vector[Vector[Double]] = v15.p0
    var v21: Vector[s0] = v4
    v18 = v20
    val v42: s0 = v14(1)
    val v34: Vector[Double] = v28(1)
    val v40: Vector[Double] = v20(0)
    val v29: Double = v40(0)
    v10 = v10.copy(p1 = v18)
    var v39: Vector[Vector[Double]] = v24
    val v31: Vector[s0] = v23.p1
    var v36: Vector[Double] = v34
    v21 = v21.updated(2, v12)
    val v30: Vector[Vector[Double]] = v12.p1
    val v77: s0 = v21(2)
    val v38: Double = v23.p0
    var v35: Vector[Double] = v36
    val v53: Vector[s0] = v0.p1
    v35 = v35.updated(0, v26)
    v18 = v18.updated(0, v35)
    v15 = v15.copy(p0 = v24)
    var v49: Vector[s0] = v31
    v15 = v15.copy(p0 = v2)
    v23 = v23.copy(p1 = v49)
    val v69: Vector[Vector[Vector[Double]]] = Vector(v39, v28, v8, v24)
    v35 = v35.updated(0, v29)
    val v116: Vector[Vector[Double]] = v42.p1
    v15 = v15.copy(p0 = v16)
    v1 = v1.copy(p0 = v26)
    val v44: Vector[Vector[Double]] = v77.p0
    var v63: Double = v29
    var v56: Vector[s0] = v14
    val v70: Vector[Double] = v30(0)
    v15 = v15.copy(p0 = v24)
    v21 = v21.updated(4, v15)
    v39 = v39.updated(1, v35)
    val v100: Vector[s0] = v1.p1
    var v112: Vector[s0] = v56
    val v62: Vector[Double] = v44(2)
    val v276: s0 = v112(0)
    val v60: Vector[Double] = v116(0)
    v1 = v1.copy(p0 = v38)
    val v125: Double = v29 / v63
    v1 = v1.copy(p0 = v125)
    val v88: Vector[Vector[Double]] = v77.p0
    v20 = v20.updated(0, v62)
    v18 = v18.updated(0, v60)
    val v83: Vector[Vector[Double]] = v276.p0
    v10 = v10.copy(p0 = v88)
    v15 = v15.copy(p0 = v8)
    v49 = v49.updated(1, v12)
    v35 = v35.updated(0, v29)
    v1 = v1.copy(p1 = v100)
    val v171: s1 = s1(v38, v53, v12)
    v20 = v20.updated(0, v70)
    v11 = v11.updated(0, v62)
    v11 = v11.updated(0, v36)
    val v262: Vector[Vector[Double]] = v69(3)
    v10 = v10.copy(p0 = v39)
    v10 = v10.copy(p0 = v83)
    val v101: Vector[Double] = v262(1)
    v39 = v39.updated(1, v101)
    v23 = v23.copy(p2 = v276)
    v35 = v70
    v171
  }
  def f27(v0: s0): s0 = {
    val v6: Vector[s0] = Vector(v0)
    val v5: Vector[Vector[Double]] = v0.p0
    val v2: Vector[Vector[Double]] = v0.p0
    val v10: Vector[Vector[Vector[Double]]] = Vector(v5, v5, v5, v5, v2, v5)
    var v4: Vector[Vector[Vector[Double]]] = v10
    v4 = v4.updated(4, v2)
    val v11: Vector[Vector[Double]] = v10(5)
    var v21: Vector[Vector[Vector[Double]]] = v10
    v21 = v21.updated(3, v5)
    val v15: Vector[Vector[Double]] = v0.p0
    var v35: Vector[Vector[Double]] = v11
    val v20: Vector[Vector[Double]] = v4(3)
    var v29: Vector[Vector[Double]] = v20
    val v22: Vector[Double] = v35(1)
    var v34: Vector[Vector[Vector[Double]]] = v21
    val v17: s0 = v6(0)
    val v45: Vector[Vector[Double]] = v17.p1
    v4 = v4.updated(2, v15)
    val v79: s0 = s0(v29, v45)
    var v23: Vector[Double] = v22
    v29 = v29.updated(0, v23)
    v4 = v34
    v79
  }
  def f26(v0: s0): s0 = {
    val v2: Vector[Vector[Double]] = v0.p0
    val v9: Vector[Vector[Double]] = v0.p1
    val v30: s0 = s0(v2, v9)
    var v42: s0 = v30
    v42
  }
  def f23(v0: s1): s1 = {
    val v5: s0 = v0.p2
    val v6: s0 = f27(v5)
    val v1: s1 = f36(v0)
    val v4: s0 = f26(v6)
    val v10: s1 = f36(v1)
    val v13: Vector[Vector[Double]] = v4.p1
    val v12: s0 = v10.p2
    var v25: Vector[Vector[Double]] = v13
    val v26: s0 = f27(v12)
    val v37: s0 = v10.p2
    val v65: s1 = f36(v10)
    var v98: s0 = v37
    var v59: s1 = v65
    v98 = v98.copy(p1 = v25)
    v98 = v98.copy(p1 = v13)
    val v57: Vector[s0] = v65.p1
    val v80: s0 = f26(v26)
    val v31: Vector[Vector[Double]] = v80.p1
    v98 = v98.copy(p1 = v25)
    val v66: s1 = f36(v59)
    val v63: s0 = f26(v80)
    v59 = v59.copy(p1 = v57)
    v98 = v98.copy(p1 = v31)
    v59 = v59.copy(p2 = v98)
    v59 = v59.copy(p2 = v63)
    v66
  }
  def f21(v0: s5): s5 = {
    var v2: s5 = v0
    var v5: s5 = v0
    val v6: Vector[s2] = v2.p0
    val v10: s2 = v6(2)
    v5 = v5.copy(p0 = v6)
    var v11: s5 = v2
    var v17: s2 = v10
    v2 = v5
    v11 = v11.copy(p0 = v6)
    val v8: s1 = v11.p1
    val v14: Vector[s2] = v5.p0
    val v9: s1 = f36(v8)
    v5 = v5.copy(p1 = v9)
    val v19: s2 = v14(2)
    var v29: Vector[s2] = v14
    val v16: Vector[s1] = v17.p0
    val v48: s1 = v16(1)
    v29 = v29.updated(1, v19)
    v5 = v5.copy(p1 = v48)
    v5 = v5.copy(p0 = v29)
    v11
  }
  def f16(v0: s1): s1 = {
    val v1: s1 = f23(v0)
    val v2: s1 = f36(v1)
    val v5: s1 = f36(v0)
    var v3: s1 = v1
    var v6: s1 = v3
    val v9: Double = v0.p0
    val v8: Vector[s0] = v2.p1
    val v4: s0 = v8(1)
    val v7: Vector[Vector[Double]] = v4.p1
    var v13: Double = v9
    val v12: Vector[Double] = v7(0)
    val v16: s0 = v5.p2
    var v14: Double = v9
    v6 = v6.copy(p0 = v13)
    var v21: Vector[s0] = v8
    val v24: s0 = f27(v4)
    v3 = v3.copy(p2 = v24)
    val v18: s0 = f26(v24)
    v3 = v3.copy(p2 = v24)
    v21 = v21.updated(0, v16)
    val v27: s0 = f26(v18)
    v21 = v8
    val v19: s0 = f27(v18)
    v21 = v21.updated(1, v19)
    v6 = v6.copy(p0 = v9)
    val v15: s0 = f26(v16)
    val v22: s0 = v21(1)
    v6 = v6.copy(p1 = v8)
    var v32: Vector[s0] = v8
    var v31: s0 = v4
    var v23: Vector[s0] = v21
    var v29: Double = v14
    val v26: s0 = v8(1)
    v32 = v32.updated(0, v18)
    val v25: Vector[Vector[Double]] = v22.p0
    val v60: s0 = f27(v4)
    var v46: s1 = v5
    var v20: Vector[s0] = v23
    val v40: Double = v12(0)
    v6 = v6.copy(p2 = v27)
    val v58: Double = v12(0)
    val v38: s0 = v21(1)
    var v55: Vector[s0] = v32
    v3 = v3.copy(p1 = v20)
    v3 = v3.copy(p0 = v40)
    v6 = v6.copy(p1 = v23)
    val v43: Vector[Vector[Double]] = v24.p1
    val v49: s0 = f26(v31)
    v21 = v21.updated(1, v60)
    v31 = v31.copy(p1 = v43)
    var v73: s0 = v24
    val v51: s0 = v8(0)
    val v37: s0 = f26(v26)
    val v33: s1 = f36(v1)
    v73 = v73.copy(p0 = v25)
    val v57: s0 = v20(1)
    val v44: Vector[Vector[Double]] = v57.p1
    v46 = v46.copy(p1 = v23)
    val v77: s1 = f36(v33)
    v6 = v6.copy(p1 = v20)
    val v54: Double = v58 - v14
    val v109: s0 = s0(v25, v44)
    val v53: Vector[s1] = Vector(v77, v77, v3, v46, v33, v33, v6)
    v23 = v23.updated(1, v16)
    v46 = v46.copy(p2 = v73)
    val v81: Vector[Vector[Vector[Double]]] = Vector(v43, v43, v7)
    val v64: s0 = v33.p2
    v32 = v32.updated(0, v49)
    val v52: s0 = f27(v51)
    v23 = v23.updated(0, v37)
    val v59: s1 = v53(5)
    val v62: Double = v0.p0
    v3 = v3.copy(p0 = v54)
    v6 = v6.copy(p1 = v55)
    var v93: Vector[s0] = v20
    val v121: Vector[s0] = v59.p1
    val v102: Vector[Vector[Double]] = v81(0)
    v73 = v73.copy(p1 = v43)
    v6 = v6.copy(p1 = v93)
    v31 = v31.copy(p1 = v44)
    v31 = v31.copy(p1 = v102)
    val v137: s1 = f23(v2)
    val v136: s0 = f26(v73)
    v3 = v3.copy(p2 = v38)
    val v68: Double = v137.p0
    v20 = v20.updated(0, v15)
    val v120: s1 = s1(v29, v121, v136)
    v73 = v73.copy(p1 = v43)
    v73 = v15
    v3 = v3.copy(p0 = v62)
    v6 = v6.copy(p0 = v68)
    v32 = v20
    v32 = v32.updated(0, v64)
    val v125: s0 = f27(v37)
    v73 = v18
    v3 = v3.copy(p2 = v109)
    v93 = v93.updated(0, v125)
    v32 = v32.updated(1, v49)
    v55 = v55.updated(1, v52)
    v120
  }
  def f10(v0: s5): s5 = {
    val v4: s5 = f21(v0)
    var v1: s5 = v4
    var v7: s5 = v1
    v7
  }
  def f8(v0: Vector[s2]): Vector[s2] = {
    val v2: s2 = v0(2)
    val v4: s2 = v0(2)
    val v5: Vector[s1] = v4.p1
    var v11: Vector[s1] = v5
    var v1: Vector[s2] = v0
    val v6: Vector[s1] = v4.p1
    var v3: s2 = v2
    v3 = v3.copy(p1 = v11)
    val v13: Vector[s1] = v4.p0
    v1 = v1.updated(1, v3)
    var v17: Vector[s2] = v1
    v3 = v3.copy(p0 = v13)
    v1 = v0
    v3 = v3.copy(p1 = v6)
    v17
  }
  @noinline
  def f0(v0: s5, v1: Double): Double = {
    var v3: s5 = v0
    var v2: Double = v1
    val v4: s5 = f10(v0)
    val v6: Vector[s2] = v3.p0
    var v5: Vector[s2] = v6
    val v7: s2 = v5(0)
    val v13: Vector[s1] = v7.p0
    v5 = v5.updated(2, v7)
    val v12: Vector[s1] = v7.p1
    val v10: s2 = v6(2)
    v3 = v3.copy(p0 = v6)
    v5 = v5.updated(1, v7)
    val v20: s2 = v5(2)
    val v11: s1 = v13(1)
    val v21: s1 = v12(0)
    val v14: s1 = v4.p1
    val v29: s1 = f36(v14)
    val v27: Vector[s2] = f8(v5)
    val v36: Vector[s1] = Vector(v14, v21, v29, v21, v29, v11, v29)
    val v43: s2 = v5(0)
    val v22: Vector[s1] = v20.p1
    val v15: s1 = v36(3)
    val v48: Double = v15.p0
    val v16: s1 = v13(1)
    val v38: s2 = s2(v13, v22)
    val v32: s1 = v36(1)
    val v37: Double = v2 - v48
    v5 = v5.updated(2, v7)
    var v35: s5 = v4
    var v33: s2 = v10
    val v23: s1 = f16(v32)
    v5 = v5.updated(1, v43)
    val v83: s2 = v5(1)
    val v84: Double = v23.p0
    v5 = v5.updated(1, v43)
    var v122: Vector[s2] = v27
    v33 = v33.copy(p1 = v22)
    val v92: Vector[s2] = v35.p0
    v5 = v5.updated(2, v7)
    v5 = v5.updated(2, v38)
    var v81: Double = v37
    v122 = v122.updated(0, v83)
    v5 = v92
    v33 = v33.copy(p0 = v13)
    val v100: s1 = f36(v16)
    v3 = v3.copy(p0 = v122)
    v5 = v5.updated(2, v83)
    val v140: Double = v48 / v81
    val v101: s1 = f36(v100)
    v35 = v35.copy(p1 = v101)
    v3 = v3.copy(p0 = v92)
    var v127: Double = v84
    val v152: Double = v140 * v127
    v122 = v122.updated(2, v33)
    v152
  }
  def benchmark(): Unit = {
    val v0: s5 = s5(Vector(s2(Vector(s1(0.0, Vector(s0(Vector(Vector(1.0), Vector(2.0), Vector(3.0)), Vector(Vector(4.0))), s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0)))), s0(Vector(Vector(9.0), Vector(10.0), Vector(11.0)), Vector(Vector(12.0)))), s1(13.0, Vector(s0(Vector(Vector(14.0), Vector(15.0), Vector(16.0)), Vector(Vector(17.0))), s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0)))), s0(Vector(Vector(22.0), Vector(23.0), Vector(24.0)), Vector(Vector(25.0)))), s1(26.0, Vector(s0(Vector(Vector(27.0), Vector(28.0), Vector(29.0)), Vector(Vector(30.0))), s0(Vector(Vector(31.0), Vector(32.0), Vector(33.0)), Vector(Vector(34.0)))), s0(Vector(Vector(35.0), Vector(36.0), Vector(37.0)), Vector(Vector(38.0))))), Vector(s1(39.0, Vector(s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0))), s0(Vector(Vector(44.0), Vector(45.0), Vector(46.0)), Vector(Vector(47.0)))), s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0)))))), s2(Vector(s1(52.0, Vector(s0(Vector(Vector(53.0), Vector(54.0), Vector(55.0)), Vector(Vector(56.0))), s0(Vector(Vector(57.0), Vector(58.0), Vector(59.0)), Vector(Vector(60.0)))), s0(Vector(Vector(61.0), Vector(62.0), Vector(63.0)), Vector(Vector(64.0)))), s1(65.0, Vector(s0(Vector(Vector(66.0), Vector(67.0), Vector(68.0)), Vector(Vector(69.0))), s0(Vector(Vector(70.0), Vector(71.0), Vector(72.0)), Vector(Vector(73.0)))), s0(Vector(Vector(74.0), Vector(75.0), Vector(76.0)), Vector(Vector(77.0)))), s1(78.0, Vector(s0(Vector(Vector(79.0), Vector(80.0), Vector(81.0)), Vector(Vector(82.0))), s0(Vector(Vector(83.0), Vector(84.0), Vector(85.0)), Vector(Vector(86.0)))), s0(Vector(Vector(87.0), Vector(88.0), Vector(89.0)), Vector(Vector(90.0))))), Vector(s1(91.0, Vector(s0(Vector(Vector(92.0), Vector(93.0), Vector(94.0)), Vector(Vector(95.0))), s0(Vector(Vector(96.0), Vector(97.0), Vector(98.0)), Vector(Vector(99.0)))), s0(Vector(Vector(100.0), Vector(101.0), Vector(102.0)), Vector(Vector(103.0)))))), s2(Vector(s1(104.0, Vector(s0(Vector(Vector(105.0), Vector(106.0), Vector(107.0)), Vector(Vector(108.0))), s0(Vector(Vector(109.0), Vector(110.0), Vector(111.0)), Vector(Vector(112.0)))), s0(Vector(Vector(113.0), Vector(114.0), Vector(115.0)), Vector(Vector(116.0)))), s1(117.0, Vector(s0(Vector(Vector(118.0), Vector(119.0), Vector(120.0)), Vector(Vector(121.0))), s0(Vector(Vector(122.0), Vector(123.0), Vector(124.0)), Vector(Vector(125.0)))), s0(Vector(Vector(126.0), Vector(127.0), Vector(128.0)), Vector(Vector(129.0)))), s1(130.0, Vector(s0(Vector(Vector(131.0), Vector(132.0), Vector(133.0)), Vector(Vector(134.0))), s0(Vector(Vector(135.0), Vector(136.0), Vector(137.0)), Vector(Vector(138.0)))), s0(Vector(Vector(139.0), Vector(140.0), Vector(141.0)), Vector(Vector(142.0))))), Vector(s1(143.0, Vector(s0(Vector(Vector(144.0), Vector(145.0), Vector(146.0)), Vector(Vector(147.0))), s0(Vector(Vector(148.0), Vector(149.0), Vector(150.0)), Vector(Vector(151.0)))), s0(Vector(Vector(152.0), Vector(153.0), Vector(154.0)), Vector(Vector(155.0))))))), s1(156.0, Vector(s0(Vector(Vector(157.0), Vector(158.0), Vector(159.0)), Vector(Vector(160.0))), s0(Vector(Vector(161.0), Vector(162.0), Vector(163.0)), Vector(Vector(164.0)))), s0(Vector(Vector(165.0), Vector(166.0), Vector(167.0)), Vector(Vector(168.0)))))
    val v1: Double = 169.0
    val start = nanoTime()
    var result: Double = 169.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}