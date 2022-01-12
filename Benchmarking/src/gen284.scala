import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[Vector[s0]],
    p2: Vector[Vector[s0]]
  )
  case class s2 (
    p0: s1,
    p1: Vector[s1]
  )
  def f79(v0: s1): s1 = {
    val v3: Vector[s1] = Vector(v0, v0, v0, v0, v0, v0, v0)
    val v9: s1 = v3(3)
    v9
  }
  def f77(v0: Vector[s2]): Vector[s2] = {
    var v3: Vector[s2] = v0
    var v4: Vector[s2] = v3
    val v6: s2 = v3(0)
    val v2: s1 = v6.p0
    var v7: Vector[s2] = v3
    var v5: s2 = v6
    val v13: s1 = f79(v2)
    v5 = v5.copy(p0 = v2)
    val v10: Vector[Vector[s0]] = v2.p2
    val v1: s1 = f79(v13)
    v5 = v5.copy(p0 = v1)
    v4 = v4.updated(0, v6)
    val v14: s1 = f79(v1)
    val v11: s1 = v6.p0
    val v9: s2 = v4(0)
    val v12: Vector[s0] = v10(0)
    v5 = v5.copy(p0 = v13)
    v3 = v3.updated(0, v9)
    val v8: Vector[Vector[s0]] = v2.p1
    val v25: s1 = f79(v13)
    v3 = v3.updated(0, v5)
    val v16: s1 = f79(v14)
    v3 = v3.updated(0, v5)
    v7 = v7.updated(0, v5)
    var v19: s1 = v11
    val v36: s2 = v0(0)
    v5 = v5.copy(p0 = v13)
    val v27: Vector[Vector[s2]] = Vector(v7, v3, v7)
    val v24: Vector[s0] = v8(0)
    val v30: s1 = f79(v19)
    v7 = v7.updated(0, v36)
    var v26: Vector[s2] = v4
    val v23: s1 = v36.p0
    val v42: s2 = v26(0)
    val v38: s1 = f79(v30)
    val v20: Vector[Vector[s0]] = v23.p2
    v3 = v3.updated(0, v5)
    var v50: s2 = v9
    val v54: Vector[s1] = v50.p1
    val v58: s1 = f79(v38)
    var v90: s2 = v42
    var v79: Vector[s2] = v4
    var v46: Vector[Vector[s0]] = v20
    v46 = v46.updated(0, v12)
    v3 = v0
    v46 = v46.updated(0, v24)
    v19 = v19.copy(p1 = v8)
    v7 = v7.updated(0, v5)
    val v48: s1 = f79(v30)
    v5 = v5.copy(p1 = v54)
    val v83: Vector[s1] = v6.p1
    v19 = v13
    val v67: s1 = f79(v48)
    v3 = v3.updated(0, v42)
    val v57: s1 = f79(v58)
    val v55: s1 = f79(v67)
    v4 = v4.updated(0, v6)
    var v65: Vector[s1] = v54
    val v72: Vector[s2] = v27(2)
    v90 = v90.copy(p0 = v48)
    v90 = v90.copy(p0 = v23)
    val v100: s0 = v24(0)
    val v133: s1 = f79(v1)
    val v98: Vector[Vector[s0]] = v57.p2
    val v70: s2 = s2(v16, v65)
    v46 = v98
    v65 = v65.updated(0, v133)
    v90 = v90.copy(p0 = v55)
    v3 = v79
    v19 = v19.copy(p1 = v98)
    val v137: s1 = f79(v25)
    v50 = v50.copy(p0 = v137)
    v79 = v79.updated(0, v90)
    v79 = v79.updated(0, v70)
    v19 = v19.copy(p0 = v100)
    v19 = v19.copy(p1 = v46)
    v5 = v5.copy(p1 = v83)
    v72
  }
  def f53(v0: Vector[Vector[Double]], v1: s0): s0 = {
    var v2: s0 = v1
    v2 = v2.copy(p1 = v0)
    val v5: Vector[Double] = v0(0)
    v2 = v2.copy(p1 = v0)
    var v10: Vector[Vector[Double]] = v0
    val v8: Vector[Vector[Double]] = v1.p1
    var v9: Vector[Vector[Double]] = v8
    val v6: Vector[Vector[Double]] = v2.p1
    val v7: Double = v5(0)
    val v4: Double = v5(0)
    v2 = v2.copy(p1 = v8)
    val v13: Double = v5(0)
    v2 = v2.copy(p1 = v9)
    val v12: Double = v5(0)
    val v17: Vector[Vector[Double]] = v1.p0
    var v16: Vector[Vector[Double]] = v9
    var v15: Double = v12
    v16 = v16.updated(1, v5)
    var v11: Vector[Vector[Double]] = v6
    var v26: Vector[Double] = v5
    val v25: Vector[Vector[Double]] = v2.p1
    var v21: Vector[Double] = v26
    val v37: Vector[Double] = v0(0)
    v2 = v2.copy(p1 = v11)
    var v22: Vector[Vector[Double]] = v17
    val v20: Vector[Vector[Double]] = v2.p0
    var v23: Vector[Double] = v37
    v2 = v2.copy(p0 = v22)
    v2 = v2.copy(p1 = v10)
    val v18: Double = v21(0)
    val v31: Vector[Vector[Double]] = v1.p1
    v2 = v2.copy(p0 = v22)
    v2 = v2.copy(p0 = v17)
    var v24: Double = v7
    v10 = v10.updated(0, v37)
    val v27: Vector[Double] = v25(1)
    val v36: Vector[Vector[Double]] = v2.p1
    val v48: Double = v23(0)
    val v62: Vector[Vector[Double]] = v2.p0
    val v33: Double = v5(0)
    val v38: Vector[Vector[Vector[Double]]] = Vector(v17, v20, v17)
    val v50: Vector[Vector[Double]] = v1.p0
    v2 = v2.copy(p0 = v62)
    var v32: Vector[Double] = v37
    val v19: Double = v32(0)
    var v42: Vector[Vector[Vector[Double]]] = v38
    v2 = v2.copy(p0 = v62)
    v26 = v26.updated(0, v24)
    var v41: Vector[Vector[Double]] = v17
    val v29: Vector[Vector[Double]] = v1.p0
    var v56: Double = v48
    val v64: Vector[Vector[Double]] = v2.p0
    v2 = v2.copy(p1 = v16)
    v32 = v23
    v23 = v23.updated(0, v18)
    var v30: Vector[Vector[Vector[Double]]] = v38
    val v67: Vector[Double] = v41(0)
    v30 = v38
    val v91: Vector[Vector[Double]] = v1.p1
    v11 = v11.updated(0, v5)
    v2 = v2.copy(p0 = v29)
    var v51: s0 = v2
    val v72: Vector[Double] = v50(0)
    val v85: Vector[Vector[Double]] = v1.p0
    var v35: Vector[Double] = v67
    v41 = v41.updated(0, v23)
    val v39: Vector[Double] = Vector(v12, v48, v4)
    val v66: Vector[Vector[Double]] = v30(0)
    var v53: s0 = v51
    var v43: Vector[Vector[Vector[Double]]] = v42
    val v49: s0 = s0(v64, v8)
    val v44: Vector[Vector[Double]] = v51.p1
    val v79: Vector[Vector[Double]] = v49.p1
    v42 = v42.updated(1, v20)
    v51 = v51.copy(p0 = v66)
    v16 = v16.updated(0, v23)
    v9 = v9.updated(0, v32)
    v21 = v21.updated(0, v33)
    val v80: Double = v27(0)
    var v57: Vector[Double] = v39
    val v81: Vector[Vector[Double]] = v43(0)
    v51 = v51.copy(p0 = v29)
    v32 = v32.updated(0, v7)
    v11 = v11.updated(0, v67)
    var v99: Vector[Double] = v57
    var v94: Vector[Vector[Double]] = v16
    v51 = v51.copy(p0 = v20)
    v51 = v51.copy(p1 = v79)
    v2 = v2.copy(p1 = v44)
    var v70: Double = v15
    v57 = v57.updated(0, v13)
    val v71: s0 = s0(v85, v91)
    v53 = v53.copy(p0 = v64)
    v51 = v1
    val v115: Double = v13 * v80
    v2 = v2.copy(p0 = v17)
    v11 = v11.updated(0, v72)
    v23 = v32
    v57 = v57.updated(2, v115)
    val v119: Vector[Vector[Double]] = v71.p0
    v53 = v53.copy(p0 = v81)
    v53 = v53.copy(p1 = v94)
    val v141: Double = v99(0)
    v32 = v32.updated(0, v4)
    v51 = v51.copy(p0 = v119)
    v9 = v9.updated(1, v35)
    val v293: Double = v141 * v12
    var v210: s0 = v53
    v32 = v32.updated(0, v70)
    v26 = v26.updated(0, v141)
    v2 = v2.copy(p0 = v85)
    v70 = v293
    val v165: Vector[Double] = v36(1)
    v51 = v51.copy(p1 = v16)
    v51 = v51.copy(p1 = v91)
    v99 = v99.updated(2, v56)
    v2 = v2.copy(p1 = v31)
    var v194: s0 = v210
    v99 = v99.updated(1, v19)
    v53 = v53.copy(p1 = v79)
    v41 = v41.updated(0, v165)
    v194
  }
  def f48(v0: Vector[s1], v1: s2): s2 = {
    v1
  }
  def f36(v0: Vector[Vector[s2]]): Vector[Vector[s2]] = {
    var v6: Vector[Vector[s2]] = v0
    var v3: Vector[Vector[s2]] = v0
    var v2: Vector[Vector[s2]] = v6
    val v8: Vector[s2] = v6(0)
    val v5: s2 = v8(0)
    val v19: Vector[s2] = f77(v8)
    var v31: Vector[s2] = v19
    val v15: s2 = v31(0)
    v3 = v3.updated(0, v19)
    var v24: Vector[s2] = v31
    v6 = v6.updated(0, v24)
    val v30: s2 = v19(0)
    val v36: Vector[s1] = v15.p1
    var v46: Vector[Vector[s2]] = v2
    val v60: s2 = f48(v36, v30)
    val v48: s2 = f48(v36, v60)
    v2 = v3
    v24 = v24.updated(0, v48)
    v31 = v31.updated(0, v5)
    v46
  }
  def f17(v0: s0): s0 = {
    var v5: s0 = v0
    val v4: Vector[Vector[Double]] = v0.p1
    v5 = v5.copy(p1 = v4)
    val v2: s0 = f53(v4, v0)
    val v9: Vector[Double] = v4(1)
    var v13: s0 = v2
    val v6: Vector[Double] = v4(0)
    val v11: s0 = f53(v4, v13)
    val v21: Vector[Vector[Double]] = v2.p1
    val v14: Vector[Double] = v21(0)
    var v17: Vector[Vector[Double]] = v21
    val v23: s0 = f53(v4, v2)
    v17 = v17.updated(1, v9)
    val v15: Vector[Vector[Double]] = v23.p0
    v17 = v4
    val v30: s0 = f53(v21, v13)
    val v16: Vector[Vector[Double]] = v30.p1
    v13 = v13.copy(p0 = v15)
    val v18: Vector[Double] = v21(0)
    val v19: Vector[Vector[Double]] = v11.p0
    val v20: s0 = f53(v21, v13)
    v13 = v13.copy(p1 = v17)
    val v27: Vector[Vector[Double]] = v20.p1
    val v41: Vector[Vector[Double]] = v20.p1
    v17 = v17.updated(0, v14)
    val v26: Vector[Double] = v19(0)
    val v22: s0 = f53(v16, v2)
    var v32: Vector[Vector[Double]] = v41
    val v91: Vector[Vector[Double]] = v22.p0
    var v35: Vector[Vector[Double]] = v21
    val v101: s0 = f53(v32, v11)
    val v56: Vector[Vector[Double]] = v5.p0
    v5 = v5.copy(p0 = v15)
    v32 = v41
    val v146: s0 = f53(v35, v101)
    var v79: Vector[Vector[Double]] = v41
    v5 = v5.copy(p1 = v79)
    v5 = v5.copy(p0 = v91)
    v35 = v35.updated(1, v6)
    v32 = v32.updated(1, v26)
    v13 = v13.copy(p0 = v56)
    v35 = v35.updated(1, v18)
    v5 = v5.copy(p0 = v15)
    v5 = v5.copy(p1 = v27)
    v5 = v5.copy(p0 = v56)
    v146
  }
  def f13(v0: Vector[Vector[s2]]): Vector[Vector[s2]] = {
    val v6: Vector[s2] = v0(0)
    val v7: Vector[s2] = f77(v6)
    var v15: Vector[s2] = v7
    val v13: Vector[Vector[s2]] = f36(v0)
    var v14: Vector[Vector[s2]] = v13
    var v17: Vector[Vector[s2]] = v14
    v17 = v17.updated(0, v15)
    v17
  }
  @noinline
  def f0(v0: Vector[s2], v1: Vector[Vector[s2]], v2: Double): Double = {
    val v5: Vector[s2] = v1(0)
    var v7: Vector[s2] = v5
    val v11: Vector[Vector[s2]] = f13(v1)
    val v8: Vector[s2] = v11(0)
    val v29: s2 = v7(0)
    val v25: Vector[s1] = v29.p1
    val v52: s1 = v29.p0
    val v58: s2 = s2(v52, v25)
    val v78: Vector[s1] = v58.p1
    var v27: s1 = v52
    val v54: s0 = v27.p0
    val v39: s0 = f17(v54)
    val v47: s2 = v8(0)
    val v24: s1 = v78(1)
    val v92: Vector[Vector[s0]] = v24.p2
    v27 = v27.copy(p1 = v92)
    v27 = v27.copy(p2 = v92)
    v7 = v7.updated(0, v47)
    v27 = v27.copy(p2 = v92)
    val v96: Vector[Vector[Double]] = v39.p1
    val v144: Vector[Double] = v96(0)
    var v93: Vector[Double] = v144
    val v99: Double = v93(0)
    v99
  }
  def benchmark(): Unit = {
    val v0: Vector[s2] = Vector(s2(s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0))), Vector(Vector(s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0))))), Vector(Vector(s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0)))))), Vector(s1(s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0))), Vector(Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0))))), Vector(Vector(s0(Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0)))))), s1(s0(Vector(Vector(18.0)), Vector(Vector(19.0), Vector(20.0))), Vector(Vector(s0(Vector(Vector(21.0)), Vector(Vector(22.0), Vector(23.0))))), Vector(Vector(s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0)))))))), s2(s1(s0(Vector(Vector(27.0)), Vector(Vector(28.0), Vector(29.0))), Vector(Vector(s0(Vector(Vector(30.0)), Vector(Vector(31.0), Vector(32.0))))), Vector(Vector(s0(Vector(Vector(33.0)), Vector(Vector(34.0), Vector(35.0)))))), Vector(s1(s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0))), Vector(Vector(s0(Vector(Vector(39.0)), Vector(Vector(40.0), Vector(41.0))))), Vector(Vector(s0(Vector(Vector(42.0)), Vector(Vector(43.0), Vector(44.0)))))), s1(s0(Vector(Vector(45.0)), Vector(Vector(46.0), Vector(47.0))), Vector(Vector(s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0))))), Vector(Vector(s0(Vector(Vector(51.0)), Vector(Vector(52.0), Vector(53.0)))))))))
    val v1: Vector[Vector[s2]] = Vector(Vector(s2(s1(s0(Vector(Vector(54.0)), Vector(Vector(55.0), Vector(56.0))), Vector(Vector(s0(Vector(Vector(57.0)), Vector(Vector(58.0), Vector(59.0))))), Vector(Vector(s0(Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0)))))), Vector(s1(s0(Vector(Vector(63.0)), Vector(Vector(64.0), Vector(65.0))), Vector(Vector(s0(Vector(Vector(66.0)), Vector(Vector(67.0), Vector(68.0))))), Vector(Vector(s0(Vector(Vector(69.0)), Vector(Vector(70.0), Vector(71.0)))))), s1(s0(Vector(Vector(72.0)), Vector(Vector(73.0), Vector(74.0))), Vector(Vector(s0(Vector(Vector(75.0)), Vector(Vector(76.0), Vector(77.0))))), Vector(Vector(s0(Vector(Vector(78.0)), Vector(Vector(79.0), Vector(80.0))))))))))
    val v2: Double = 81.0
    val start = nanoTime()
    var result: Double = 81.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}