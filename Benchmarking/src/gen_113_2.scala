import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0,
    p2: Vector[s0]
  )
  case class s2 (
    p0: Vector[s0],
    p1: s1
  )
  def f37(v0: s0, v1: s0): s0 = {
    val v3: Vector[Vector[Double]] = v1.p1
    val v4: Vector[Vector[Double]] = v0.p1
    val v7: Vector[Vector[Double]] = v1.p0
    var v6: Vector[Vector[Double]] = v7
    val v8: Vector[Double] = v6(0)
    val v2: Vector[Vector[Double]] = v0.p1
    val v13: s0 = s0(v7, v2)
    var v5: Vector[Double] = v8
    val v9: Double = v8(0)
    val v15: Vector[Double] = v7(0)
    v6 = v6.updated(0, v5)
    val v16: Vector[Vector[Double]] = v0.p0
    v6 = v6.updated(0, v15)
    val v20: Double = v8(0)
    val v12: Vector[Double] = v7(0)
    var v23: Vector[Vector[Double]] = v2
    var v10: Vector[Vector[Double]] = v3
    val v21: s0 = s0(v16, v2)
    v23 = v2
    var v25: Vector[Vector[Double]] = v10
    var v18: Double = v9
    val v14: Vector[Vector[Double]] = v13.p0
    val v42: Double = v15(0)
    v6 = v6.updated(0, v12)
    var v19: Vector[Vector[Double]] = v7
    val v17: Vector[Double] = v10(2)
    val v50: Vector[Double] = v16(0)
    val v27: Double = v20 + v18
    v10 = v23
    var v35: Vector[Vector[Double]] = v14
    val v31: Vector[Vector[Double]] = v0.p1
    val v39: Vector[Vector[Double]] = v21.p1
    val v30: s0 = s0(v19, v4)
    var v72: Double = v18
    var v49: Vector[Vector[Double]] = v35
    val v38: Vector[Vector[Vector[Double]]] = Vector(v23, v23, v25, v10, v39, v31, v2)
    var v56: Double = v27
    val v54: Vector[Double] = Vector(v56, v72, v27, v56, v9)
    val v32: Vector[Vector[Double]] = v38(6)
    var v46: Double = v42
    val v115: Vector[Vector[Vector[Double]]] = Vector(v49, v6)
    var v37: s0 = v21
    v37 = v37.copy(p1 = v23)
    val v41: s0 = s0(v16, v32)
    var v128: s0 = v30
    v37 = v37.copy(p1 = v4)
    val v67: s0 = s0(v14, v32)
    var v95: Double = v46
    v37 = v37.copy(p1 = v3)
    val v152: Vector[Vector[Double]] = v13.p0
    val v71: Vector[Vector[Double]] = v115(1)
    v128 = v128.copy(p1 = v3)
    v128 = v128.copy(p0 = v71)
    val v80: Vector[s0] = Vector(v30, v21, v128, v1, v21)
    v128 = v128.copy(p1 = v3)
    v128 = v128.copy(p0 = v152)
    val v92: Vector[Vector[Double]] = v37.p1
    val v184: Vector[Double] = v92(1)
    v35 = v35.updated(0, v17)
    val v83: Vector[Vector[Double]] = v115(1)
    v19 = v19.updated(0, v5)
    val v113: Vector[Vector[Double]] = v37.p0
    val v63: s0 = s0(v83, v2)
    v128 = v67
    v37 = v37.copy(p0 = v14)
    v128 = v128.copy(p0 = v19)
    val v82: s0 = v80(4)
    v128 = v128.copy(p0 = v152)
    val v77: Vector[s0] = Vector(v0, v63, v1, v30, v67, v41, v67)
    var v94: Vector[Double] = v54
    v49 = v49.updated(0, v184)
    var v121: Vector[s0] = v77
    v37 = v37.copy(p1 = v2)
    val v86: Vector[Double] = v14(0)
    v128 = v128.copy(p0 = v113)
    var v166: Vector[s0] = v121
    v25 = v25.updated(0, v50)
    v166 = v166.updated(3, v13)
    var v244: Vector[Vector[Double]] = v4
    v128 = v128.copy(p1 = v92)
    val v230: Double = v94(4)
    v5 = v5.updated(0, v230)
    val v191: s0 = v166(3)
    v5 = v5.updated(0, v95)
    v19 = v113
    v128 = v128.copy(p1 = v244)
    v23 = v23.updated(1, v8)
    val v132: Vector[Vector[Double]] = v82.p0
    v37 = v37.copy(p0 = v132)
    v5 = v86
    v191
  }
  def f2(v0: s0, v1: Double): Double = {
    var v7: s0 = v0
    val v3: s0 = f37(v7, v7)
    var v5: Double = v1
    var v6: Double = v1
    var v9: s0 = v7
    val v2: s0 = f37(v9, v7)
    var v17: s0 = v3
    val v10: Vector[Vector[Double]] = v17.p1
    val v14: Vector[Double] = v10(0)
    val v34: Vector[Vector[Double]] = v2.p0
    val v16: Double = v14(0)
    val v20: Double = v14(0)
    val v21: Double = v14(0)
    var v69: Vector[Vector[Double]] = v10
    v7 = v9
    val v46: Vector[Double] = Vector(v16, v20, v6, v1, v5, v6, v21)
    var v24: Vector[Double] = v46
    v17 = v17.copy(p1 = v69)
    v17 = v17.copy(p0 = v34)
    v17 = v17.copy(p1 = v69)
    v24 = v24.updated(0, v1)
    val v26: Double = v24(3)
    v26
  }
  @noinline
  def f0(v0: s2, v1: Vector[s1], v2: s0, v3: Vector[s2], v4: Double): Double = {
    val v16: s1 = v0.p1
    val v20: s0 = v16.p1
    val v29: Vector[Vector[Double]] = v20.p1
    val v43: Vector[Double] = v29(2)
    val v58: Double = v43(0)
    val v84: Double = f2(v2, v58)
    v84
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0)))), s1(s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0))), s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))), Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0))), s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0))), s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))))))
    val v1: Vector[s1] = Vector(s1(s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0))), s0(Vector(Vector(28.0)), Vector(Vector(29.0), Vector(30.0), Vector(31.0))), Vector(s0(Vector(Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0))), s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0))), s0(Vector(Vector(40.0)), Vector(Vector(41.0), Vector(42.0), Vector(43.0))))), s1(s0(Vector(Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0))), s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0), Vector(51.0))), Vector(s0(Vector(Vector(52.0)), Vector(Vector(53.0), Vector(54.0), Vector(55.0))), s0(Vector(Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0))), s0(Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0), Vector(63.0))))), s1(s0(Vector(Vector(64.0)), Vector(Vector(65.0), Vector(66.0), Vector(67.0))), s0(Vector(Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0))), Vector(s0(Vector(Vector(72.0)), Vector(Vector(73.0), Vector(74.0), Vector(75.0))), s0(Vector(Vector(76.0)), Vector(Vector(77.0), Vector(78.0), Vector(79.0))), s0(Vector(Vector(80.0)), Vector(Vector(81.0), Vector(82.0), Vector(83.0))))))
    val v2: s0 = s0(Vector(Vector(84.0)), Vector(Vector(85.0), Vector(86.0), Vector(87.0)))
    val v3: Vector[s2] = Vector(s2(Vector(s0(Vector(Vector(88.0)), Vector(Vector(89.0), Vector(90.0), Vector(91.0)))), s1(s0(Vector(Vector(92.0)), Vector(Vector(93.0), Vector(94.0), Vector(95.0))), s0(Vector(Vector(96.0)), Vector(Vector(97.0), Vector(98.0), Vector(99.0))), Vector(s0(Vector(Vector(100.0)), Vector(Vector(101.0), Vector(102.0), Vector(103.0))), s0(Vector(Vector(104.0)), Vector(Vector(105.0), Vector(106.0), Vector(107.0))), s0(Vector(Vector(108.0)), Vector(Vector(109.0), Vector(110.0), Vector(111.0)))))), s2(Vector(s0(Vector(Vector(112.0)), Vector(Vector(113.0), Vector(114.0), Vector(115.0)))), s1(s0(Vector(Vector(116.0)), Vector(Vector(117.0), Vector(118.0), Vector(119.0))), s0(Vector(Vector(120.0)), Vector(Vector(121.0), Vector(122.0), Vector(123.0))), Vector(s0(Vector(Vector(124.0)), Vector(Vector(125.0), Vector(126.0), Vector(127.0))), s0(Vector(Vector(128.0)), Vector(Vector(129.0), Vector(130.0), Vector(131.0))), s0(Vector(Vector(132.0)), Vector(Vector(133.0), Vector(134.0), Vector(135.0)))))))
    val v4: Double = 136.0
    val start = nanoTime()
    var result: Double = 136.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}