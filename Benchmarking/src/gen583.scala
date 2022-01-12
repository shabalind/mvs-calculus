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
    p0: Vector[Vector[s1]],
    p1: s1
  )
  def f19(v0: s1): s1 = {
    val v4: s0 = v0.p1
    val v5: s0 = v0.p1
    val v2: s1 = s1(v4, v4)
    var v3: s0 = v5
    var v6: s0 = v3
    var v7: s0 = v5
    val v8: Vector[Vector[Double]] = v4.p0
    val v9: Vector[Double] = v8(1)
    var v1: Vector[Vector[Double]] = v8
    v3 = v3.copy(p1 = v1)
    v1 = v1.updated(2, v9)
    var v10: Vector[Vector[Double]] = v8
    val v12: Double = v9(0)
    v1 = v1.updated(1, v9)
    v6 = v6.copy(p1 = v1)
    v7 = v7.copy(p1 = v8)
    v6 = v6.copy(p0 = v8)
    v7 = v7.copy(p1 = v10)
    v3 = v7
    val v14: Vector[Vector[Double]] = v6.p0
    val v17: Double = v9(0)
    val v18: Vector[Vector[Double]] = v3.p1
    val v25: Vector[Double] = v1(2)
    val v19: Double = v17 * v12
    val v16: Double = v25(0)
    var v33: s0 = v5
    val v21: Double = v19 * v19
    v33 = v33.copy(p1 = v18)
    v1 = v1.updated(1, v25)
    v3 = v3.copy(p0 = v18)
    val v43: s0 = v2.p0
    v6 = v6.copy(p1 = v1)
    v10 = v10.updated(1, v25)
    val v20: Vector[Double] = v18(1)
    val v34: Vector[Vector[Double]] = v6.p1
    val v35: Vector[Double] = v34(1)
    v1 = v1.updated(1, v20)
    v10 = v10.updated(2, v25)
    var v40: s0 = v33
    val v31: s0 = v2.p0
    val v44: Vector[Vector[Double]] = v31.p1
    val v36: Vector[Vector[Double]] = v4.p0
    v7 = v7.copy(p1 = v14)
    v1 = v1.updated(1, v25)
    v6 = v6.copy(p1 = v34)
    var v49: s0 = v43
    var v53: Vector[Double] = v35
    v10 = v10.updated(2, v53)
    val v46: Vector[Vector[Double]] = v43.p0
    v53 = v53.updated(0, v16)
    val v48: Vector[Vector[Double]] = v4.p0
    v6 = v6.copy(p1 = v8)
    v1 = v10
    val v60: Vector[Vector[Double]] = v6.p0
    val v61: s1 = s1(v49, v40)
    val v39: Vector[Double] = v60(1)
    v1 = v1.updated(2, v35)
    val v57: Vector[Double] = v1(2)
    v1 = v1.updated(1, v57)
    v7 = v7.copy(p1 = v44)
    v10 = v60
    v3 = v3.copy(p0 = v48)
    v33 = v33.copy(p0 = v36)
    v33 = v33.copy(p0 = v46)
    val v65: Vector[Double] = v46(2)
    v53 = v53.updated(0, v21)
    var v72: s1 = v61
    v10 = v10.updated(2, v39)
    v10 = v10.updated(1, v65)
    v33 = v33.copy(p1 = v48)
    v72
  }
  def f14(v0: s0): s0 = {
    var v1: s0 = v0
    val v3: Vector[Vector[Double]] = v0.p1
    val v8: Vector[Vector[Double]] = v0.p0
    v1 = v1.copy(p1 = v8)
    val v64: s1 = s1(v1, v1)
    val v49: s1 = f19(v64)
    val v66: Vector[s1] = Vector(v64, v64, v64, v49, v49)
    v1 = v1.copy(p1 = v3)
    val v62: s1 = v66(4)
    val v75: s0 = v62.p0
    v75
  }
  def f9(v0: s0, v1: s0): s0 = {
    var v6: s0 = v0
    var v3: s0 = v1
    v3 = v6
    val v13: Vector[s0] = Vector(v0)
    v3 = v0
    val v21: s0 = f14(v0)
    val v18: s0 = v13(0)
    var v10: s0 = v0
    val v9: Vector[Vector[Double]] = v21.p0
    val v14: Vector[Vector[Double]] = v10.p1
    var v17: Vector[Vector[Double]] = v14
    var v28: s0 = v18
    v6 = v6.copy(p1 = v14)
    val v24: s0 = v13(0)
    var v19: Vector[s0] = v13
    v19 = v19.updated(0, v0)
    v19 = v19.updated(0, v28)
    v28 = v28.copy(p1 = v9)
    val v29: s0 = f14(v24)
    val v30: Vector[Vector[Double]] = v0.p1
    v19 = v19.updated(0, v29)
    val v81: s0 = v13(0)
    val v43: s0 = v13(0)
    val v22: s0 = f14(v29)
    val v36: s0 = f14(v10)
    val v48: Vector[Vector[Double]] = v10.p1
    val v39: s0 = f14(v18)
    val v44: Vector[Double] = v30(0)
    val v31: Vector[Vector[Double]] = v3.p0
    v28 = v28.copy(p1 = v48)
    var v40: Vector[s0] = v19
    v40 = v19
    v10 = v10.copy(p0 = v31)
    v28 = v24
    v10 = v10.copy(p1 = v17)
    val v34: s0 = f14(v36)
    val v59: Vector[Vector[Double]] = v43.p0
    v17 = v17.updated(0, v44)
    val v73: s0 = v40(0)
    v40 = v40.updated(0, v34)
    v3 = v3.copy(p0 = v31)
    v40 = v40.updated(0, v39)
    v40 = v40.updated(0, v22)
    v28 = v28.copy(p1 = v59)
    v19 = v19.updated(0, v81)
    val v160: s0 = f14(v73)
    v160
  }
  def f5(v0: s1): s1 = {
    var v6: s1 = v0
    val v3: s0 = v6.p1
    v6 = v6.copy(p0 = v3)
    val v4: Vector[Vector[Double]] = v3.p0
    var v13: s0 = v3
    val v11: s1 = f19(v0)
    v13 = v13.copy(p0 = v4)
    val v18: s0 = f14(v13)
    var v21: s1 = v0
    val v17: s0 = v11.p1
    val v14: s0 = v0.p0
    val v27: s0 = v21.p0
    val v29: s1 = f19(v6)
    val v24: s0 = f14(v27)
    val v37: s0 = v0.p1
    val v30: s0 = v6.p0
    v6 = v6.copy(p0 = v37)
    v21 = v21.copy(p1 = v14)
    val v32: s0 = f14(v30)
    val v42: s1 = f19(v29)
    val v43: Vector[Vector[Double]] = v17.p1
    val v26: Vector[Vector[Double]] = v14.p0
    val v36: Vector[Vector[Double]] = v37.p0
    val v39: s1 = f19(v42)
    v13 = v13.copy(p0 = v26)
    var v66: Vector[Vector[Double]] = v36
    var v101: s1 = v21
    v101 = v101.copy(p0 = v32)
    val v89: s0 = v42.p0
    val v109: s0 = v39.p1
    v21 = v21.copy(p1 = v27)
    val v54: Vector[Vector[Double]] = v89.p0
    v101 = v101.copy(p1 = v18)
    val v73: s0 = v11.p1
    v101 = v101.copy(p1 = v27)
    v13 = v13.copy(p1 = v66)
    val v93: s0 = s0(v54, v43)
    v6 = v6.copy(p0 = v73)
    v101 = v101.copy(p1 = v93)
    v6 = v6.copy(p0 = v24)
    v21 = v21.copy(p0 = v109)
    v101
  }
  def f1(v0: Vector[s2]): Vector[s2] = {
    val v3: Vector[Vector[s2]] = Vector(v0, v0)
    var v8: Vector[Vector[s2]] = v3
    var v15: Vector[Vector[s2]] = v3
    v15 = v8
    val v37: Vector[s2] = v3(0)
    v8 = v8.updated(1, v37)
    val v81: Vector[s2] = v15(0)
    var v118: Vector[Vector[s2]] = v8
    v8 = v118
    v81
  }
  @noinline
  def f0(v0: Vector[s2], v1: Double): Double = {
    var v2: Double = v1
    val v4: Vector[s2] = f1(v0)
    var v5: Double = v2
    var v3: Vector[s2] = v4
    v3 = v4
    var v7: Vector[s2] = v4
    var v8: Vector[s2] = v3
    val v13: s2 = v3(1)
    var v11: s2 = v13
    val v15: Vector[s2] = f1(v4)
    val v10: s2 = v15(1)
    val v22: s2 = v8(0)
    v7 = v7.updated(0, v13)
    val v18: Vector[s2] = f1(v15)
    var v16: s2 = v22
    val v21: s1 = v22.p1
    val v12: s1 = f5(v21)
    val v19: Vector[s2] = f1(v0)
    var v33: s2 = v10
    val v35: s2 = v7(1)
    val v49: s1 = v11.p1
    v7 = v19
    val v36: s2 = v4(0)
    var v30: s2 = v35
    var v42: Double = v5
    val v25: Vector[Vector[s1]] = v36.p0
    var v32: Vector[Vector[s1]] = v25
    v3 = v3.updated(1, v33)
    val v99: s1 = f5(v12)
    val v26: Vector[Vector[s1]] = v16.p0
    var v27: Vector[Vector[s1]] = v26
    val v67: s0 = v99.p0
    var v64: Vector[Vector[s1]] = v25
    val v84: Vector[s1] = v26(0)
    val v40: s1 = v84(0)
    var v41: Vector[Vector[s1]] = v32
    v64 = v64.updated(0, v84)
    val v47: Vector[s2] = f1(v18)
    val v74: s0 = v40.p1
    v32 = v32.updated(0, v84)
    val v90: s1 = f5(v40)
    v30 = v30.copy(p1 = v40)
    v30 = v30.copy(p1 = v49)
    val v130: s1 = f5(v12)
    val v144: s0 = f9(v74, v67)
    val v106: Vector[s1] = v41(0)
    val v120: s0 = f14(v144)
    v30 = v30.copy(p0 = v25)
    v33 = v33.copy(p0 = v27)
    val v57: Vector[Vector[Double]] = v120.p1
    var v102: Vector[s1] = v106
    v11 = v11.copy(p1 = v99)
    var v94: Vector[Vector[s1]] = v25
    v27 = v27.updated(0, v106)
    var v50: Vector[s1] = v84
    v16 = v16.copy(p1 = v130)
    val v95: Vector[s1] = v27(0)
    v8 = v8.updated(1, v35)
    v30 = v30.copy(p0 = v94)
    val v118: Vector[Double] = v57(1)
    v8 = v8.updated(1, v30)
    v41 = v41.updated(0, v95)
    v3 = v3.updated(0, v10)
    var v109: Vector[s1] = v102
    v11 = v11.copy(p1 = v90)
    val v133: s1 = v109(0)
    v33 = v33.copy(p1 = v133)
    val v177: s2 = v47(0)
    v11 = v11.copy(p0 = v27)
    v64 = v64.updated(0, v50)
    val v81: Double = v118(0)
    v16 = v16.copy(p0 = v41)
    v30 = v30.copy(p0 = v64)
    var v160: Double = v81
    v7 = v7.updated(0, v177)
    val v105: Double = v160 / v42
    v105
  }
  def benchmark(): Unit = {
    val v0: Vector[s2] = Vector(s2(Vector(Vector(s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0))), s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))))), s1(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0))), s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))))), s2(Vector(Vector(s1(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0))), s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0)))))), s1(s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0), Vector(40.0), Vector(41.0))), s0(Vector(Vector(42.0), Vector(43.0), Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0))))))
    val v1: Double = 48.0
    val start = nanoTime()
    var result: Double = 48.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}