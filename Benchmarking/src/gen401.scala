import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]],
    p3: Vector[Vector[Double]]
  )
  case class s2 (
    p0: s0,
    p1: s0
  )
  case class s7 (
    p0: Double,
    p1: Vector[Vector[s2]]
  )
  def f71(v0: s0): s0 = {
    var v5: s0 = v0
    var v4: s0 = v5
    var v6: s0 = v0
    val v3: Vector[Vector[Double]] = v5.p0
    val v13: Vector[Vector[Double]] = v5.p1
    val v17: Vector[Vector[Double]] = v6.p0
    v4 = v4.copy(p0 = v3)
    v5 = v5.copy(p0 = v17)
    v4 = v4.copy(p1 = v13)
    v6 = v6.copy(p1 = v13)
    val v1: Vector[Vector[Double]] = v4.p3
    v5 = v5.copy(p1 = v13)
    val v27: Vector[Vector[Double]] = v4.p1
    v4 = v4.copy(p1 = v27)
    var v36: s0 = v4
    v5 = v5.copy(p3 = v1)
    v36
  }
  def f68(v0: s7): s7 = {
    var v6: s7 = v0
    val v2: Double = v6.p0
    val v7: Vector[Double] = Vector(v2, v2)
    val v3: Double = v7(1)
    v6 = v6.copy(p0 = v3)
    val v5: Double = v7(1)
    val v12: Vector[Vector[s2]] = v6.p1
    val v8: Vector[Vector[s2]] = v6.p1
    v6 = v6.copy(p1 = v12)
    v6 = v6.copy(p1 = v12)
    val v33: Double = v6.p0
    var v34: Double = v5
    val v19: Vector[s2] = v8(1)
    var v45: s7 = v0
    val v16: s2 = v19(0)
    v45 = v45.copy(p1 = v8)
    val v55: s0 = v16.p0
    v6 = v6.copy(p0 = v5)
    val v52: Vector[Vector[Double]] = v55.p2
    v45 = v45.copy(p0 = v3)
    v45 = v45.copy(p0 = v2)
    var v68: Vector[Vector[Double]] = v52
    val v60: Vector[Double] = v68(2)
    val v36: Double = v60(0)
    var v50: s7 = v0
    var v58: s7 = v50
    val v107: Double = v36 + v5
    v6 = v6.copy(p0 = v107)
    v68 = v68.updated(1, v60)
    val v88: Vector[Vector[s2]] = v6.p1
    var v44: Vector[Vector[Double]] = v68
    v58 = v58.copy(p1 = v88)
    val v80: Vector[Double] = v44(2)
    v68 = v68.updated(1, v80)
    v6 = v6.copy(p0 = v34)
    v58 = v45
    v50 = v50.copy(p1 = v88)
    v58 = v58.copy(p0 = v33)
    v58 = v58.copy(p1 = v8)
    v45 = v45.copy(p0 = v33)
    v58
  }
  def f59(v0: Vector[Vector[s2]]): Vector[Vector[s2]] = {
    var v2: Vector[Vector[s2]] = v0
    var v5: Vector[Vector[s2]] = v0
    v2 = v5
    var v1: Vector[Vector[s2]] = v0
    val v3: Vector[Vector[Vector[s2]]] = Vector(v1, v2, v0, v5, v1, v0)
    val v9: Vector[s2] = v2(2)
    v2 = v2.updated(0, v9)
    v1 = v1.updated(0, v9)
    var v37: Vector[s2] = v9
    v2 = v2.updated(1, v9)
    v1 = v1.updated(1, v37)
    val v65: Vector[Vector[s2]] = v3(2)
    v65
  }
  def f50(v0: s2): s2 = {
    var v8: s2 = v0
    var v6: s2 = v8
    var v5: s2 = v0
    val v2: s0 = v5.p1
    val v4: Vector[s2] = Vector(v5, v6, v8)
    val v1: s0 = f71(v2)
    val v7: s0 = f71(v2)
    val v9: s0 = v5.p1
    val v13: s0 = v0.p0
    val v3: s2 = v4(1)
    val v11: s0 = f71(v1)
    val v16: s0 = f71(v7)
    var v29: s2 = v3
    v6 = v6.copy(p0 = v16)
    v5 = v5.copy(p1 = v13)
    var v30: s2 = v29
    val v28: s0 = f71(v9)
    v8 = v8.copy(p0 = v28)
    v6 = v6.copy(p1 = v13)
    var v17: s2 = v29
    v8 = v8.copy(p1 = v28)
    val v48: s0 = v3.p1
    v6 = v6.copy(p0 = v2)
    val v90: s0 = v30.p0
    val v52: s0 = f71(v48)
    val v75: s0 = v3.p0
    v29 = v29.copy(p1 = v52)
    v17 = v17.copy(p0 = v90)
    v17 = v17.copy(p0 = v11)
    v8 = v8.copy(p0 = v75)
    v17
  }
  def f15(v0: s7): s7 = {
    var v2: s7 = v0
    var v6: s7 = v0
    val v8: s7 = f68(v6)
    v6 = v8
    var v5: s7 = v6
    val v1: s7 = f68(v0)
    val v9: s7 = f68(v1)
    val v7: Vector[Vector[s2]] = v0.p1
    var v3: Vector[Vector[s2]] = v7
    val v17: Vector[Vector[s2]] = v2.p1
    val v21: Vector[s2] = v7(0)
    val v15: Vector[s2] = v17(0)
    val v20: Vector[Vector[s2]] = v0.p1
    var v18: s7 = v1
    val v12: Vector[Vector[s2]] = f59(v7)
    v5 = v5.copy(p1 = v3)
    val v19: Vector[Vector[s2]] = f59(v17)
    val v30: Vector[Vector[s2]] = f59(v20)
    v5 = v5.copy(p1 = v7)
    val v13: Double = v0.p0
    val v16: s2 = v21(0)
    val v28: Double = v0.p0
    val v51: Vector[Vector[s2]] = f59(v3)
    val v56: Vector[s2] = v12(0)
    val v37: s7 = f68(v18)
    val v46: Vector[Vector[s2]] = v37.p1
    v2 = v2.copy(p0 = v13)
    val v24: Vector[Vector[Vector[s2]]] = Vector(v51, v3, v12, v51)
    v6 = v6.copy(p1 = v3)
    v3 = v3.updated(0, v15)
    v18 = v18.copy(p0 = v28)
    val v32: Vector[s2] = v20(0)
    v2 = v1
    v3 = v19
    v3 = v3.updated(1, v32)
    val v26: s2 = v56(0)
    val v40: Vector[s2] = v46(1)
    val v23: Vector[s2] = v30(0)
    val v31: Double = v5.p0
    var v49: Vector[s2] = v23
    val v50: Double = v9.p0
    v3 = v3.updated(0, v49)
    v2 = v2.copy(p0 = v31)
    v5 = v5.copy(p1 = v51)
    val v33: s0 = v16.p0
    v3 = v3.updated(0, v21)
    val v59: s2 = v23(0)
    val v66: Vector[Vector[s2]] = v24(2)
    v49 = v40
    val v42: Vector[Vector[Double]] = v33.p2
    val v39: Vector[Double] = v42(1)
    v2 = v2.copy(p1 = v19)
    val v79: Vector[Vector[s2]] = v24(2)
    v6 = v6.copy(p0 = v50)
    v6 = v6.copy(p1 = v66)
    v2 = v2.copy(p1 = v17)
    val v116: s2 = f50(v59)
    v49 = v49.updated(0, v116)
    v18 = v18.copy(p1 = v3)
    v5 = v5.copy(p1 = v79)
    val v105: Double = v39(0)
    v5 = v5.copy(p1 = v7)
    val v188: s7 = f68(v18)
    v6 = v6.copy(p1 = v46)
    v5 = v5.copy(p0 = v105)
    var v113: s7 = v188
    v3 = v3.updated(1, v15)
    v5 = v5.copy(p1 = v7)
    v113 = v113.copy(p1 = v3)
    v49 = v49.updated(0, v26)
    v18 = v18.copy(p1 = v51)
    v113
  }
  @noinline
  def f0(v0: Vector[s7], v1: Double): Double = {
    var v4: Vector[s7] = v0
    val v7: s7 = v4(1)
    var v3: Vector[s7] = v0
    val v5: s7 = v3(1)
    val v6: s7 = f68(v7)
    v3 = v3.updated(0, v5)
    val v8: s7 = f68(v6)
    var v18: Double = v1
    var v21: Double = v18
    val v39: s7 = v4(1)
    val v14: s7 = f15(v5)
    val v30: s7 = v3(2)
    v18 = v21
    val v120: Double = v14.p0
    var v94: Double = v1
    val v70: Double = v94 / v120
    val v86: Double = v70 * v18
    v3 = v3.updated(0, v30)
    v3 = v3.updated(2, v39)
    v4 = v4.updated(1, v6)
    v3 = v3.updated(1, v8)
    v86
  }
  def benchmark(): Unit = {
    val v0: Vector[s7] = Vector(s7(0.0, Vector(Vector(s2(s0(Vector(Vector(1.0), Vector(2.0), Vector(3.0)), Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0))), s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0)), Vector(Vector(14.0), Vector(15.0), Vector(16.0)), Vector(Vector(17.0), Vector(18.0))))), Vector(s2(s0(Vector(Vector(19.0), Vector(20.0), Vector(21.0)), Vector(Vector(22.0)), Vector(Vector(23.0), Vector(24.0), Vector(25.0)), Vector(Vector(26.0), Vector(27.0))), s0(Vector(Vector(28.0), Vector(29.0), Vector(30.0)), Vector(Vector(31.0)), Vector(Vector(32.0), Vector(33.0), Vector(34.0)), Vector(Vector(35.0), Vector(36.0))))), Vector(s2(s0(Vector(Vector(37.0), Vector(38.0), Vector(39.0)), Vector(Vector(40.0)), Vector(Vector(41.0), Vector(42.0), Vector(43.0)), Vector(Vector(44.0), Vector(45.0))), s0(Vector(Vector(46.0), Vector(47.0), Vector(48.0)), Vector(Vector(49.0)), Vector(Vector(50.0), Vector(51.0), Vector(52.0)), Vector(Vector(53.0), Vector(54.0))))))), s7(55.0, Vector(Vector(s2(s0(Vector(Vector(56.0), Vector(57.0), Vector(58.0)), Vector(Vector(59.0)), Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0), Vector(64.0))), s0(Vector(Vector(65.0), Vector(66.0), Vector(67.0)), Vector(Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0)), Vector(Vector(72.0), Vector(73.0))))), Vector(s2(s0(Vector(Vector(74.0), Vector(75.0), Vector(76.0)), Vector(Vector(77.0)), Vector(Vector(78.0), Vector(79.0), Vector(80.0)), Vector(Vector(81.0), Vector(82.0))), s0(Vector(Vector(83.0), Vector(84.0), Vector(85.0)), Vector(Vector(86.0)), Vector(Vector(87.0), Vector(88.0), Vector(89.0)), Vector(Vector(90.0), Vector(91.0))))), Vector(s2(s0(Vector(Vector(92.0), Vector(93.0), Vector(94.0)), Vector(Vector(95.0)), Vector(Vector(96.0), Vector(97.0), Vector(98.0)), Vector(Vector(99.0), Vector(100.0))), s0(Vector(Vector(101.0), Vector(102.0), Vector(103.0)), Vector(Vector(104.0)), Vector(Vector(105.0), Vector(106.0), Vector(107.0)), Vector(Vector(108.0), Vector(109.0))))))), s7(110.0, Vector(Vector(s2(s0(Vector(Vector(111.0), Vector(112.0), Vector(113.0)), Vector(Vector(114.0)), Vector(Vector(115.0), Vector(116.0), Vector(117.0)), Vector(Vector(118.0), Vector(119.0))), s0(Vector(Vector(120.0), Vector(121.0), Vector(122.0)), Vector(Vector(123.0)), Vector(Vector(124.0), Vector(125.0), Vector(126.0)), Vector(Vector(127.0), Vector(128.0))))), Vector(s2(s0(Vector(Vector(129.0), Vector(130.0), Vector(131.0)), Vector(Vector(132.0)), Vector(Vector(133.0), Vector(134.0), Vector(135.0)), Vector(Vector(136.0), Vector(137.0))), s0(Vector(Vector(138.0), Vector(139.0), Vector(140.0)), Vector(Vector(141.0)), Vector(Vector(142.0), Vector(143.0), Vector(144.0)), Vector(Vector(145.0), Vector(146.0))))), Vector(s2(s0(Vector(Vector(147.0), Vector(148.0), Vector(149.0)), Vector(Vector(150.0)), Vector(Vector(151.0), Vector(152.0), Vector(153.0)), Vector(Vector(154.0), Vector(155.0))), s0(Vector(Vector(156.0), Vector(157.0), Vector(158.0)), Vector(Vector(159.0)), Vector(Vector(160.0), Vector(161.0), Vector(162.0)), Vector(Vector(163.0), Vector(164.0))))))))
    val v1: Double = 165.0
    val start = nanoTime()
    var result: Double = 165.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}