import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s2 (
    p0: s1,
    p1: Vector[s1]
  )
  case class s4 (
    p0: Vector[s0],
    p1: s1
  )
  case class s5 (
    p0: Vector[s0],
    p1: Vector[s4]
  )
  def f89(v0: s4, v1: s5): s5 = {
    v1
  }
  def f88(v0: s1): s1 = {
    val v5: Vector[s0] = v0.p1
    val v8: s0 = v5(1)
    var v2: s0 = v8
    val v4: s0 = v0.p0
    var v7: Vector[s0] = v5
    val v3: Vector[Vector[Double]] = v8.p1
    val v9: Vector[Double] = v3(0)
    v7 = v7.updated(0, v2)
    v2 = v2.copy(p1 = v3)
    val v6: Vector[Vector[Double]] = v8.p1
    v2 = v2.copy(p1 = v6)
    val v10: s0 = v5(2)
    val v17: Vector[s0] = v0.p1
    var v14: Vector[s0] = v7
    val v12: Vector[Vector[Double]] = v10.p1
    val v26: Vector[Double] = v6(0)
    val v30: Vector[Vector[Double]] = v8.p0
    var v37: Vector[Double] = v26
    val v25: Vector[Double] = v3(0)
    var v104: Vector[Vector[Double]] = v30
    val v27: s0 = s0(v104, v12)
    v104 = v104.updated(0, v9)
    v104 = v104.updated(0, v37)
    val v43: Vector[Vector[Double]] = v27.p0
    val v40: Vector[s0] = v0.p1
    v2 = v2.copy(p0 = v43)
    v7 = v17
    val v96: Double = v25(0)
    v37 = v37.updated(0, v96)
    val v60: s0 = v40(0)
    v14 = v14.updated(2, v4)
    val v62: s1 = s1(v60, v14)
    v62
  }
  def f85(v0: s0, v1: Vector[s5]): s0 = {
    var v3: s0 = v0
    val v4: Vector[s0] = Vector(v3)
    val v8: Vector[Vector[Double]] = v0.p1
    val v6: Vector[Vector[Double]] = v0.p0
    val v2: Vector[Vector[Double]] = v3.p1
    v3 = v3.copy(p1 = v8)
    var v5: Vector[Vector[Double]] = v6
    v3 = v3.copy(p1 = v2)
    v3 = v3.copy(p0 = v6)
    val v7: Vector[Double] = v2(0)
    v3 = v3.copy(p1 = v2)
    val v14: Vector[Vector[Double]] = v3.p1
    v5 = v5.updated(0, v7)
    v3 = v3.copy(p0 = v5)
    v3 = v3.copy(p1 = v8)
    val v16: Vector[Vector[Double]] = v3.p0
    v5 = v5.updated(0, v7)
    val v22: Vector[Double] = v2(0)
    v3 = v3.copy(p1 = v8)
    val v21: s0 = v4(0)
    v3 = v3.copy(p0 = v6)
    v5 = v5.updated(0, v22)
    v5 = v5.updated(0, v7)
    v3 = v3.copy(p1 = v14)
    v3 = v3.copy(p0 = v16)
    v3 = v3.copy(p0 = v16)
    val v25: s0 = v4(0)
    val v45: Vector[Vector[Double]] = v25.p1
    v3 = v3.copy(p1 = v45)
    v21
  }
  def f84(v0: s1): s1 = {
    var v2: s1 = v0
    v2 = v0
    var v3: s1 = v0
    val v12: s0 = v0.p0
    val v6: Vector[Vector[Double]] = v12.p0
    var v4: s0 = v12
    val v9: s1 = f88(v3)
    var v8: Vector[Vector[Double]] = v6
    val v11: Vector[s0] = v0.p1
    val v10: Vector[s0] = v2.p1
    v4 = v12
    v4 = v4.copy(p0 = v8)
    val v14: Vector[s0] = v0.p1
    var v17: Vector[s0] = v10
    val v21: Vector[Double] = v8(0)
    var v26: Vector[Vector[Double]] = v6
    val v19: s0 = v9.p0
    v17 = v17.updated(0, v19)
    val v33: s0 = v11(1)
    v4 = v4.copy(p0 = v26)
    var v23: Vector[s0] = v14
    val v32: Vector[Double] = v6(0)
    v26 = v26.updated(0, v32)
    val v28: Vector[s0] = v0.p1
    val v71: s1 = f88(v9)
    v23 = v23.updated(0, v33)
    val v62: s1 = f88(v2)
    v23 = v23.updated(2, v4)
    v26 = v26.updated(0, v21)
    v2 = v2.copy(p1 = v17)
    v8 = v8.updated(0, v32)
    val v141: s0 = v11(1)
    val v109: Vector[Vector[Double]] = v141.p1
    val v70: s0 = v23(0)
    val v116: Vector[s0] = v71.p1
    var v148: Vector[Vector[Double]] = v109
    val v176: s0 = v62.p0
    v23 = v23.updated(0, v176)
    var v204: s1 = v3
    val v98: s0 = v116(0)
    val v81: s1 = f88(v204)
    v4 = v4.copy(p1 = v148)
    val v147: s0 = v17(0)
    v2 = v2.copy(p0 = v147)
    v204 = v204.copy(p0 = v70)
    val v150: s1 = f88(v81)
    v204 = v204.copy(p1 = v28)
    v17 = v17.updated(1, v98)
    v150
  }
  def f70(v0: s5): s5 = {
    val v2: Vector[s0] = v0.p0
    var v5: Vector[s0] = v2
    var v6: s5 = v0
    val v3: s0 = v2(0)
    v5 = v5.updated(0, v3)
    v6 = v6.copy(p0 = v2)
    v6 = v6.copy(p0 = v5)
    val v9: s0 = v2(0)
    v6 = v6.copy(p0 = v5)
    val v19: Vector[s4] = v6.p1
    v5 = v5.updated(0, v9)
    v5 = v5.updated(0, v3)
    v6 = v6.copy(p1 = v19)
    v6 = v6.copy(p1 = v19)
    v6
  }
  def f62(v0: s5): s5 = {
    val v7: s5 = f70(v0)
    val v5: Vector[s4] = v0.p1
    var v8: s5 = v7
    val v20: Vector[s4] = v8.p1
    v8 = v8.copy(p1 = v5)
    val v9: s5 = f70(v8)
    val v13: s4 = v20(0)
    val v10: s4 = v20(0)
    val v18: s4 = v20(0)
    val v16: Vector[s0] = v10.p0
    val v12: s0 = v16(0)
    var v15: s0 = v12
    val v14: Vector[s4] = v7.p1
    v8 = v0
    val v21: s5 = f89(v18, v9)
    var v31: Vector[s0] = v16
    v31 = v31.updated(1, v12)
    val v26: s1 = v13.p1
    v31 = v31.updated(0, v15)
    v31 = v31.updated(0, v15)
    val v80: s1 = f88(v26)
    val v60: s1 = f84(v80)
    val v47: s1 = f88(v60)
    var v89: Vector[s0] = v31
    v8 = v8.copy(p1 = v14)
    val v108: s4 = s4(v89, v47)
    val v113: s5 = f89(v108, v21)
    v113
  }
  def f44(v0: s1, v1: s0): s0 = {
    val v2: Vector[s0] = v0.p1
    var v4: s0 = v1
    var v5: Vector[s0] = v2
    val v9: s0 = v5(1)
    v5 = v5.updated(0, v4)
    val v26: Vector[Vector[Double]] = v1.p1
    v4 = v4.copy(p1 = v26)
    v9
  }
  def f27(v0: Vector[s0]): Vector[s0] = {
    v0
  }
  def f20(v0: s5): s5 = {
    val v5: s5 = f62(v0)
    val v6: Vector[s0] = v0.p0
    val v1: Vector[s0] = v0.p0
    val v2: Vector[s0] = v0.p0
    val v11: Vector[s0] = f27(v1)
    val v7: s0 = v11(0)
    val v8: Vector[s0] = f27(v6)
    val v16: Vector[Vector[Double]] = v7.p0
    val v10: Vector[Vector[Double]] = v7.p0
    val v13: s5 = f62(v5)
    val v14: Vector[Double] = v10(0)
    var v18: s5 = v5
    val v30: s0 = v6(0)
    val v17: s0 = v2(0)
    val v27: Vector[s0] = v13.p0
    v18 = v18.copy(p0 = v2)
    var v84: Vector[Vector[Double]] = v16
    v84 = v84.updated(0, v14)
    val v29: s5 = f70(v18)
    var v19: Vector[Vector[Double]] = v84
    val v36: Vector[Vector[Double]] = v17.p1
    val v20: Vector[s0] = v5.p0
    var v52: Vector[s0] = v27
    v18 = v18.copy(p0 = v52)
    val v59: s0 = s0(v19, v36)
    v18 = v18.copy(p0 = v52)
    var v41: Vector[Vector[Double]] = v36
    val v26: Vector[Double] = v41(0)
    val v31: s5 = f62(v13)
    val v60: Vector[s0] = Vector(v30, v7, v59)
    val v77: Vector[Double] = v36(0)
    val v89: s0 = v60(2)
    v18 = v18.copy(p0 = v8)
    val v158: s1 = s1(v17, v60)
    var v69: s0 = v17
    v69 = v69.copy(p0 = v16)
    v18 = v18.copy(p0 = v20)
    val v79: s5 = f70(v31)
    val v58: Vector[Vector[Double]] = v7.p0
    val v67: s1 = f84(v158)
    val v91: Vector[s0] = v158.p1
    val v86: Vector[s4] = v29.p1
    var v80: Vector[Double] = v26
    var v50: s1 = v67
    var v74: Vector[s4] = v86
    val v178: s0 = f44(v50, v69)
    val v93: s1 = s1(v89, v91)
    v18 = v18.copy(p1 = v74)
    val v176: Vector[Double] = v58(0)
    v19 = v19.updated(0, v77)
    v50 = v50.copy(p0 = v7)
    val v247: s0 = f44(v93, v178)
    v52 = v52.updated(0, v247)
    v18 = v18.copy(p1 = v86)
    val v126: s4 = v86(0)
    v69 = v69.copy(p0 = v84)
    var v153: s4 = v126
    v84 = v84.updated(0, v176)
    v84 = v84.updated(0, v80)
    v69 = v69.copy(p0 = v16)
    val v144: s5 = f89(v153, v79)
    v144
  }
  def f2(v0: s0): s0 = {
    v0
  }
  @noinline
  def f0(v0: s0, v1: s1, v2: Vector[Vector[s5]], v3: s2, v4: Double): Double = {
    val v5: Vector[s5] = v2(1)
    val v9: Vector[s5] = v2(1)
    val v6: s0 = f2(v0)
    var v16: Vector[s5] = v9
    var v13: s0 = v6
    val v26: Vector[Vector[Double]] = v6.p0
    val v14: s0 = f85(v13, v16)
    val v39: s5 = v5(0)
    v16 = v16.updated(0, v39)
    val v33: Vector[Vector[Double]] = v14.p0
    val v31: s5 = f20(v39)
    var v66: Vector[Vector[Double]] = v33
    v66 = v26
    val v50: Vector[Double] = v66(0)
    val v89: Double = v50(0)
    v16 = v16.updated(0, v31)
    v89
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0)))
    val v1: s1 = s1(s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0))), Vector(s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0))), s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0)))))
    val v2: Vector[Vector[s5]] = Vector(Vector(s5(Vector(s0(Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0)))), Vector(s4(Vector(s0(Vector(Vector(18.0)), Vector(Vector(19.0), Vector(20.0))), s0(Vector(Vector(21.0)), Vector(Vector(22.0), Vector(23.0)))), s1(s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0))), Vector(s0(Vector(Vector(27.0)), Vector(Vector(28.0), Vector(29.0))), s0(Vector(Vector(30.0)), Vector(Vector(31.0), Vector(32.0))), s0(Vector(Vector(33.0)), Vector(Vector(34.0), Vector(35.0))))))))), Vector(s5(Vector(s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0)))), Vector(s4(Vector(s0(Vector(Vector(39.0)), Vector(Vector(40.0), Vector(41.0))), s0(Vector(Vector(42.0)), Vector(Vector(43.0), Vector(44.0)))), s1(s0(Vector(Vector(45.0)), Vector(Vector(46.0), Vector(47.0))), Vector(s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0))), s0(Vector(Vector(51.0)), Vector(Vector(52.0), Vector(53.0))), s0(Vector(Vector(54.0)), Vector(Vector(55.0), Vector(56.0))))))))))
    val v3: s2 = s2(s1(s0(Vector(Vector(57.0)), Vector(Vector(58.0), Vector(59.0))), Vector(s0(Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0))), s0(Vector(Vector(63.0)), Vector(Vector(64.0), Vector(65.0))), s0(Vector(Vector(66.0)), Vector(Vector(67.0), Vector(68.0))))), Vector(s1(s0(Vector(Vector(69.0)), Vector(Vector(70.0), Vector(71.0))), Vector(s0(Vector(Vector(72.0)), Vector(Vector(73.0), Vector(74.0))), s0(Vector(Vector(75.0)), Vector(Vector(76.0), Vector(77.0))), s0(Vector(Vector(78.0)), Vector(Vector(79.0), Vector(80.0))))), s1(s0(Vector(Vector(81.0)), Vector(Vector(82.0), Vector(83.0))), Vector(s0(Vector(Vector(84.0)), Vector(Vector(85.0), Vector(86.0))), s0(Vector(Vector(87.0)), Vector(Vector(88.0), Vector(89.0))), s0(Vector(Vector(90.0)), Vector(Vector(91.0), Vector(92.0)))))))
    val v4: Double = 93.0
    val start = nanoTime()
    var result: Double = 93.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}