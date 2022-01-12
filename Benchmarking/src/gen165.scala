import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Double,
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  case class s3 (
    p0: Vector[s1],
    p1: Vector[s0]
  )
  case class s4 (
    p0: s1,
    p1: s3
  )
  def f45(v0: s3, v1: s1): s3 = {
    var v2: s3 = v0
    var v4: s3 = v2
    var v3: s3 = v4
    val v6: Vector[s0] = v1.p0
    val v5: Vector[s0] = v1.p0
    var v9: Vector[s0] = v5
    val v7: s0 = v9(0)
    var v8: s1 = v1
    v8 = v8.copy(p1 = v7)
    v8 = v8.copy(p0 = v5)
    v9 = v9.updated(0, v7)
    val v11: s0 = v9(0)
    val v10: s0 = v5(0)
    v8 = v8.copy(p0 = v6)
    v9 = v9.updated(0, v7)
    v9 = v9.updated(0, v10)
    val v13: Vector[s1] = v0.p0
    val v23: s0 = v5(0)
    val v16: Double = v10.p0
    v4 = v4.copy(p0 = v13)
    val v15: Vector[s0] = v3.p1
    val v12: s1 = v13(0)
    v2 = v2.copy(p0 = v13)
    val v19: s0 = v15(1)
    val v14: s3 = s3(v13, v15)
    val v27: s0 = v6(0)
    val v18: Vector[s1] = v3.p0
    v9 = v9.updated(0, v19)
    val v28: Double = v23.p0
    val v59: Double = v16 + v28
    val v29: s0 = v5(0)
    v9 = v9.updated(0, v7)
    var v20: s0 = v27
    v9 = v9.updated(0, v20)
    v9 = v9.updated(0, v7)
    val v36: s0 = v15(1)
    val v30: Vector[s1] = v0.p0
    v9 = v9.updated(0, v23)
    val v61: Vector[s0] = v12.p0
    val v42: s1 = v30(0)
    v9 = v9.updated(0, v11)
    v9 = v9.updated(0, v7)
    val v44: Vector[s0] = v4.p1
    val v83: Vector[s0] = v4.p1
    val v45: Double = v36.p0
    var v60: Vector[s0] = v44
    var v56: s3 = v2
    v2 = v2.copy(p1 = v60)
    var v39: s3 = v56
    v20 = v20.copy(p0 = v28)
    val v86: Vector[Double] = Vector(v28, v45, v16, v16)
    val v64: Vector[Vector[Double]] = v27.p1
    val v48: Vector[s0] = v3.p1
    v20 = v20.copy(p1 = v64)
    var v123: Vector[s0] = v83
    var v47: s3 = v39
    v56 = v56.copy(p1 = v123)
    v47 = v47.copy(p1 = v44)
    var v80: Vector[Vector[Double]] = v64
    val v70: s0 = v9(0)
    val v164: Vector[s0] = v42.p0
    v60 = v60.updated(1, v29)
    v8 = v8.copy(p0 = v6)
    val v76: Double = v86(2)
    val v52: Double = v76 * v59
    v9 = v9.updated(0, v11)
    v8 = v8.copy(p0 = v164)
    val v101: Double = v16 * v52
    v39 = v39.copy(p1 = v123)
    val v68: Vector[s3] = Vector(v14, v4, v47, v0, v3, v39, v4)
    v39 = v39.copy(p0 = v18)
    v2 = v2.copy(p1 = v15)
    v8 = v8.copy(p0 = v61)
    v20 = v20.copy(p0 = v101)
    val v149: Vector[s0] = v56.p1
    var v113: Vector[s0] = v149
    v47 = v47.copy(p1 = v48)
    val v158: Vector[Vector[Double]] = v11.p1
    val v146: s0 = v113(0)
    v20 = v20.copy(p1 = v80)
    v56 = v56.copy(p1 = v44)
    v20 = v20.copy(p1 = v80)
    val v137: s3 = v68(3)
    var v145: Vector[s1] = v13
    v2 = v2.copy(p0 = v145)
    v60 = v60.updated(1, v36)
    v3 = v3.copy(p0 = v13)
    var v99: Vector[Vector[Double]] = v158
    val v97: Vector[Vector[Double]] = v70.p1
    v4 = v4.copy(p1 = v149)
    v20 = v20.copy(p1 = v99)
    val v169: s4 = s4(v8, v137)
    v60 = v60.updated(0, v146)
    v20 = v20.copy(p1 = v97)
    val v283: s3 = v169.p1
    v283
  }
  def f39(v0: s3): s3 = {
    val v2: Vector[s0] = v0.p1
    val v4: s0 = v2(0)
    val v8: Vector[Vector[Double]] = v4.p1
    var v1: s3 = v0
    val v5: Vector[s0] = v0.p1
    var v3: Vector[s0] = v5
    v1 = v1.copy(p1 = v3)
    val v15: Double = v4.p0
    var v11: Vector[s0] = v5
    val v13: Vector[s0] = v1.p1
    v1 = v1.copy(p1 = v11)
    var v26: s3 = v0
    val v24: Vector[s0] = v1.p1
    val v36: Vector[s0] = v26.p1
    v1 = v1.copy(p1 = v3)
    v26 = v26.copy(p1 = v36)
    v1 = v1.copy(p1 = v3)
    var v47: s3 = v0
    val v28: Vector[s0] = v47.p1
    v47 = v47.copy(p1 = v5)
    val v58: s0 = v5(0)
    v26 = v26.copy(p1 = v13)
    val v32: Vector[Vector[s0]] = Vector(v24, v5, v36, v11)
    var v70: s3 = v47
    val v34: s0 = s0(v15, v8)
    var v41: s3 = v26
    val v84: Vector[s0] = v26.p1
    v70 = v70.copy(p1 = v36)
    var v43: s0 = v4
    v26 = v26.copy(p1 = v24)
    val v68: Vector[s1] = v26.p0
    v70 = v70.copy(p0 = v68)
    val v156: s0 = v11(1)
    v11 = v11.updated(0, v43)
    v11 = v11.updated(1, v156)
    val v67: s0 = v84(1)
    v3 = v3.updated(0, v34)
    val v73: Vector[s0] = v32(0)
    val v53: Vector[s0] = v32(2)
    v70 = v70.copy(p1 = v53)
    v11 = v11.updated(0, v58)
    v70 = v70.copy(p0 = v68)
    v70 = v70.copy(p0 = v68)
    var v85: Vector[s1] = v68
    var v40: Vector[s0] = v73
    v11 = v11.updated(1, v58)
    v40 = v28
    val v145: Vector[s1] = v1.p0
    v41 = v41.copy(p0 = v68)
    val v94: Vector[s1] = v26.p0
    val v86: Vector[s1] = v41.p0
    v11 = v11.updated(0, v67)
    val v92: s1 = v68(0)
    val v89: s3 = f45(v70, v92)
    v26 = v26.copy(p1 = v40)
    v41 = v41.copy(p1 = v13)
    var v103: s3 = v89
    val v59: s1 = v145(0)
    v103 = v103.copy(p1 = v2)
    v70 = v70.copy(p0 = v94)
    val v122: s3 = f45(v103, v59)
    v1 = v1.copy(p0 = v86)
    v103 = v103.copy(p0 = v85)
    v122
  }
  def f33(v0: Vector[s0]): Vector[s0] = {
    val v7: Vector[Vector[s0]] = Vector(v0, v0, v0, v0)
    val v1: Vector[Vector[Vector[s0]]] = Vector(v7, v7, v7, v7, v7, v7)
    val v3: Vector[Vector[s0]] = v1(5)
    val v4: Vector[s0] = v3(0)
    val v8: Vector[Vector[s0]] = v1(3)
    var v6: Vector[s0] = v0
    v6 = v4
    var v17: Vector[Vector[s0]] = v8
    val v13: Vector[s0] = v17(0)
    val v18: s0 = v6(0)
    val v11: s1 = s1(v13, v18)
    var v32: s1 = v11
    v32 = v32.copy(p0 = v0)
    val v26: Vector[s0] = v32.p0
    v17 = v17.updated(0, v4)
    val v59: Vector[s0] = v32.p0
    val v63: s0 = v26(0)
    var v47: Vector[s0] = v59
    val v77: s0 = v32.p1
    v47 = v47.updated(0, v63)
    val v86: Vector[s0] = v11.p0
    v47 = v47.updated(0, v77)
    v17 = v17.updated(0, v86)
    v47
  }
  def f20(v0: s0, v1: s0): s0 = {
    var v3: s0 = v0
    var v4: s0 = v1
    val v2: Vector[Vector[Double]] = v1.p1
    val v6: Vector[Double] = v2(0)
    var v8: s0 = v0
    val v7: Double = v1.p0
    val v10: Vector[Double] = v2(0)
    var v9: s0 = v1
    val v5: Vector[Double] = v2(0)
    val v15: Vector[Double] = v2(0)
    val v14: Vector[Vector[Double]] = v4.p1
    val v16: Double = v3.p0
    var v11: Vector[Double] = v5
    val v12: Double = v15(0)
    var v13: Vector[Double] = v11
    val v20: Vector[Vector[Double]] = v3.p1
    val v21: Vector[Vector[Double]] = v0.p1
    var v17: s0 = v8
    val v27: Double = v1.p0
    v4 = v4.copy(p1 = v20)
    var v32: s0 = v1
    var v35: s0 = v0
    val v34: Vector[Vector[Double]] = v1.p1
    val v19: Double = v1.p0
    val v36: Vector[Vector[Double]] = v1.p1
    v32 = v32.copy(p0 = v12)
    v4 = v4.copy(p1 = v34)
    var v22: Vector[Vector[Double]] = v14
    var v31: Vector[Double] = v15
    v3 = v3.copy(p1 = v2)
    var v24: Vector[Double] = v13
    val v42: Vector[Vector[Double]] = v0.p1
    val v73: Double = v32.p0
    var v26: s0 = v32
    val v82: Vector[Vector[Double]] = v35.p1
    val v61: Vector[Vector[Double]] = Vector(v6, v5, v11, v24, v6)
    v22 = v2
    v31 = v31.updated(0, v16)
    val v23: Vector[Vector[Double]] = v1.p1
    var v60: s0 = v8
    val v38: Vector[Vector[Double]] = v60.p1
    v35 = v35.copy(p1 = v23)
    val v37: Double = v27 - v7
    val v71: s0 = s0(v37, v21)
    v26 = v26.copy(p1 = v34)
    var v62: Vector[Vector[Double]] = v61
    var v49: s0 = v26
    val v43: Vector[Double] = v62(2)
    val v46: Double = v71.p0
    val v58: Vector[Double] = v36(0)
    val v50: Vector[Vector[Double]] = Vector(v10, v24, v31)
    val v44: Vector[Double] = v50(2)
    v22 = v22.updated(0, v58)
    var v57: Double = v73
    var v51: Vector[Vector[Double]] = v38
    val v68: Double = v17.p0
    v32 = v32.copy(p1 = v51)
    val v64: Double = v8.p0
    val v53: Double = v32.p0
    v32 = v32.copy(p0 = v19)
    val v55: Vector[Vector[Double]] = v17.p1
    val v97: Vector[Vector[Double]] = v26.p1
    var v75: Double = v68
    v13 = v13.updated(0, v64)
    val v56: Double = v32.p0
    v49 = v49.copy(p0 = v57)
    v26 = v26.copy(p1 = v2)
    val v99: s0 = s0(v27, v22)
    val v66: Vector[Vector[Double]] = v17.p1
    v8 = v8.copy(p1 = v34)
    v26 = v26.copy(p1 = v42)
    v35 = v35.copy(p1 = v82)
    v17 = v17.copy(p0 = v56)
    v60 = v60.copy(p1 = v97)
    v35 = v35.copy(p0 = v19)
    v13 = v13.updated(0, v53)
    v4 = v4.copy(p1 = v66)
    val v80: Vector[s0] = Vector(v49, v9, v60, v99, v35, v9, v60)
    var v144: Vector[s0] = v80
    val v237: Vector[Vector[Double]] = v0.p1
    v26 = v26.copy(p1 = v237)
    v4 = v4.copy(p0 = v7)
    var v196: Vector[s0] = v144
    v62 = v62.updated(2, v44)
    v8 = v8.copy(p1 = v34)
    v4 = v4.copy(p1 = v23)
    v60 = v60.copy(p0 = v7)
    v22 = v22.updated(0, v43)
    v60 = v60.copy(p0 = v12)
    v35 = v35.copy(p1 = v66)
    val v200: s0 = v196(5)
    v4 = v4.copy(p0 = v75)
    v26 = v26.copy(p1 = v55)
    v8 = v8.copy(p0 = v46)
    v200
  }
  def f19(v0: s3): s3 = {
    val v1: s3 = f39(v0)
    val v2: s3 = f39(v0)
    var v3: s3 = v0
    val v8: Vector[s1] = v1.p0
    val v5: s3 = f39(v2)
    var v7: Vector[s1] = v8
    val v19: s1 = v7(0)
    val v10: Vector[s0] = v0.p1
    val v36: Vector[s0] = v19.p0
    val v18: s0 = v10(0)
    var v20: Vector[s0] = v10
    var v16: s0 = v18
    var v12: Vector[s0] = v20
    val v15: Vector[s0] = f33(v36)
    val v21: Vector[s1] = v3.p0
    val v17: Vector[s1] = v2.p0
    val v23: Vector[s0] = v19.p0
    val v34: s0 = v15(0)
    v3 = v0
    var v24: Vector[s0] = v10
    v3 = v3.copy(p1 = v24)
    val v43: s0 = v23(0)
    v3 = v3.copy(p1 = v24)
    val v14: s0 = f20(v34, v18)
    v3 = v3.copy(p1 = v10)
    v20 = v20.updated(1, v14)
    val v30: s0 = v19.p1
    v12 = v12.updated(1, v16)
    val v41: s1 = v7(0)
    val v26: s3 = s3(v7, v12)
    v7 = v7.updated(0, v41)
    val v47: Vector[s1] = v1.p0
    val v35: s0 = v19.p1
    var v27: s0 = v30
    v12 = v12.updated(1, v34)
    v3 = v3.copy(p1 = v24)
    v3 = v3.copy(p1 = v24)
    v12 = v12.updated(0, v43)
    val v54: Double = v30.p0
    val v80: Vector[Vector[Double]] = v27.p1
    v24 = v24.updated(1, v27)
    v27 = v27.copy(p0 = v54)
    v3 = v3.copy(p0 = v21)
    val v29: Double = v35.p0
    v3 = v3.copy(p0 = v47)
    val v67: s3 = f45(v0, v19)
    v16 = v16.copy(p0 = v29)
    v12 = v12.updated(0, v16)
    v3 = v3.copy(p0 = v17)
    v3 = v3.copy(p1 = v10)
    v27 = v27.copy(p1 = v80)
    v16 = v16.copy(p0 = v54)
    v16 = v16.copy(p1 = v80)
    val v84: Vector[s3] = Vector(v67, v26, v3, v5)
    v3 = v3.copy(p0 = v7)
    v7 = v8
    val v115: s3 = v84(2)
    v115
  }
  def f15(v0: s3): s3 = {
    var v7: s3 = v0
    val v6: Vector[s1] = v7.p0
    var v1: Vector[s1] = v6
    val v5: Vector[s0] = v7.p1
    var v3: s3 = v0
    v7 = v7.copy(p1 = v5)
    v7 = v7.copy(p0 = v6)
    val v4: s3 = f19(v7)
    val v11: s3 = f19(v3)
    var v9: Vector[s1] = v6
    var v15: Vector[s0] = v5
    val v12: s0 = v5(1)
    val v10: Vector[s1] = v4.p0
    val v43: s1 = v6(0)
    v7 = v3
    v3 = v3.copy(p0 = v1)
    val v42: s1 = v9(0)
    val v21: s3 = f45(v0, v42)
    v7 = v7.copy(p1 = v15)
    v7 = v7.copy(p0 = v6)
    val v20: s1 = v10(0)
    val v24: Vector[s3] = Vector(v21, v11)
    val v40: s0 = v15(1)
    v3 = v3.copy(p0 = v10)
    var v22: Vector[s3] = v24
    val v58: s3 = v22(0)
    v1 = v1.updated(0, v20)
    v7 = v7.copy(p1 = v15)
    val v81: s0 = f20(v40, v12)
    v15 = v15.updated(1, v81)
    v1 = v1.updated(0, v43)
    v58
  }
  @noinline
  def f0(v0: Vector[s4], v1: Double): Double = {
    val v4: s4 = v0(0)
    val v6: s3 = v4.p1
    val v3: s3 = f15(v6)
    val v28: Vector[s1] = v3.p0
    val v16: s1 = v28(0)
    val v26: s0 = v16.p1
    val v42: Double = v26.p0
    v42
  }
  def benchmark(): Unit = {
    val v0: Vector[s4] = Vector(s4(s1(Vector(s0(0.0, Vector(Vector(1.0)))), s0(2.0, Vector(Vector(3.0)))), s3(Vector(s1(Vector(s0(4.0, Vector(Vector(5.0)))), s0(6.0, Vector(Vector(7.0))))), Vector(s0(8.0, Vector(Vector(9.0))), s0(10.0, Vector(Vector(11.0)))))))
    val v1: Double = 12.0
    val start = nanoTime()
    var result: Double = 12.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}