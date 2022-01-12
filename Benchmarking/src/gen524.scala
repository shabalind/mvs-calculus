import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  case class s3 (
    p0: Vector[s1],
    p1: s0
  )
  def f60(v0: s0): s0 = {
    v0
  }
  def f56(v0: Vector[s0]): Vector[s0] = {
    val v4: s0 = v0(0)
    val v5: s0 = v0(0)
    val v2: s0 = v0(0)
    val v13: s0 = v0(0)
    var v1: s0 = v4
    val v8: Vector[Vector[Double]] = v2.p1
    val v9: s0 = f60(v2)
    val v6: Vector[Vector[Vector[Double]]] = Vector(v8, v8, v8)
    val v11: Vector[Vector[Double]] = v6(2)
    v1 = v1.copy(p1 = v11)
    val v28: s0 = f60(v9)
    val v35: Vector[Vector[Double]] = v2.p1
    val v32: s0 = f60(v1)
    val v41: Vector[Vector[Double]] = v13.p0
    v1 = v9
    val v60: s0 = f60(v32)
    var v84: Vector[Vector[Double]] = v41
    val v34: Vector[Vector[Double]] = v28.p1
    v1 = v1.copy(p0 = v84)
    val v58: s1 = s1(v0, v60)
    val v99: Vector[Vector[Double]] = v5.p1
    v1 = v1.copy(p1 = v99)
    v1 = v1.copy(p1 = v35)
    v1 = v1.copy(p1 = v34)
    val v106: Vector[s0] = v58.p0
    v106
  }
  def f50(v0: Vector[s3]): Vector[s3] = {
    var v4: Vector[s3] = v0
    val v1: s3 = v0(0)
    v4 = v0
    v4 = v4.updated(1, v1)
    val v121: Vector[Vector[s3]] = Vector(v4, v0)
    val v80: s3 = v0(0)
    v4 = v4.updated(0, v80)
    val v75: Vector[s3] = v121(1)
    v75
  }
  def f47(v0: s1): s1 = {
    var v3: s1 = v0
    val v6: Vector[s0] = v0.p0
    val v4: s0 = v6(0)
    v3 = v0
    val v8: s0 = v6(0)
    var v2: s0 = v4
    val v5: s0 = f60(v2)
    var v10: s0 = v8
    val v20: Vector[Vector[Double]] = v10.p0
    v3 = v3.copy(p1 = v5)
    v2 = v2.copy(p0 = v20)
    v2 = v2.copy(p0 = v20)
    val v81: Vector[Vector[Double]] = v5.p1
    var v80: s1 = v3
    v10 = v10.copy(p1 = v81)
    var v177: s1 = v80
    v177
  }
  def f37(v0: s0, v1: s0): s0 = {
    val v6: Vector[s0] = Vector(v0, v0, v0, v0)
    val v3: s0 = v6(3)
    val v9: s0 = v6(3)
    var v13: Vector[s0] = v6
    val v8: s0 = v13(2)
    v13 = v13.updated(0, v8)
    v13 = v13.updated(2, v9)
    var v20: s0 = v8
    val v12: s0 = f60(v20)
    v13 = v13.updated(2, v3)
    val v14: s0 = f60(v12)
    val v31: Vector[Vector[Double]] = v12.p1
    val v55: Vector[Vector[Double]] = v12.p1
    val v37: Vector[Vector[Double]] = v8.p0
    v20 = v20.copy(p1 = v55)
    val v67: s0 = f60(v14)
    v13 = v13.updated(1, v67)
    val v79: s0 = s0(v37, v31)
    v79
  }
  def f36(v0: s3): s3 = {
    var v3: s3 = v0
    val v5: s0 = v3.p1
    var v7: s0 = v5
    var v4: s3 = v3
    val v2: Vector[s3] = Vector(v3, v0)
    var v10: s3 = v4
    v3 = v0
    val v6: Vector[s1] = v0.p0
    v4 = v3
    val v9: Vector[Vector[Double]] = v7.p1
    val v1: Vector[Vector[Double]] = v5.p1
    val v14: s0 = f37(v7, v5)
    val v11: Vector[Vector[Double]] = v5.p1
    v3 = v3.copy(p1 = v14)
    val v22: s0 = f37(v5, v5)
    val v8: Vector[Vector[Double]] = v7.p0
    var v20: Vector[s3] = v2
    v20 = v20.updated(1, v10)
    val v18: s0 = s0(v8, v11)
    v4 = v4.copy(p1 = v14)
    val v46: Vector[Double] = v9(1)
    val v34: Vector[s3] = f50(v2)
    var v29: Vector[Vector[Double]] = v1
    val v35: s3 = v20(1)
    v20 = v34
    val v23: s0 = f37(v5, v18)
    v3 = v3.copy(p1 = v22)
    v3 = v3.copy(p1 = v23)
    v7 = v7.copy(p1 = v29)
    v29 = v29.updated(1, v46)
    v10 = v10.copy(p0 = v6)
    v4 = v4.copy(p1 = v5)
    v35
  }
  def f33(v0: s0): s0 = {
    var v4: s0 = v0
    val v7: Vector[Vector[Double]] = v4.p1
    v4 = v4.copy(p1 = v7)
    val v2: s0 = f37(v4, v0)
    v4 = v2
    val v3: s0 = f37(v4, v0)
    v4 = v4.copy(p1 = v7)
    val v13: Vector[Vector[Double]] = v3.p1
    val v8: Vector[Vector[Double]] = v2.p0
    val v9: Vector[Vector[Double]] = v3.p0
    val v10: s0 = f60(v3)
    val v20: s0 = f37(v4, v3)
    val v22: Vector[Vector[Double]] = v20.p0
    val v17: s0 = f60(v2)
    v4 = v4.copy(p1 = v13)
    v4 = v4.copy(p0 = v8)
    val v25: Vector[Vector[Double]] = v4.p1
    val v41: Vector[Vector[Vector[Double]]] = Vector(v22, v8)
    v4 = v4.copy(p1 = v25)
    val v24: Vector[Vector[Double]] = v20.p1
    v4 = v4.copy(p1 = v24)
    val v43: Vector[Vector[Double]] = v0.p1
    var v36: s0 = v4
    val v58: Vector[Vector[Double]] = v0.p1
    val v49: Vector[Vector[Double]] = v41(0)
    v4 = v4.copy(p0 = v9)
    val v32: Vector[Vector[Double]] = v17.p1
    var v52: s0 = v36
    var v47: s0 = v52
    v36 = v36.copy(p0 = v9)
    v36 = v36.copy(p0 = v49)
    v4 = v4.copy(p0 = v49)
    val v33: Vector[Vector[Double]] = v41(0)
    v52 = v52.copy(p1 = v24)
    v47 = v47.copy(p1 = v58)
    val v66: Vector[Vector[Double]] = v10.p1
    v4 = v4.copy(p0 = v33)
    v52 = v52.copy(p1 = v43)
    v47 = v47.copy(p0 = v22)
    v36 = v20
    val v123: s0 = s0(v49, v24)
    v36 = v36.copy(p1 = v58)
    v47 = v47.copy(p1 = v32)
    v4 = v4.copy(p1 = v66)
    v4 = v4.copy(p1 = v58)
    v4 = v4.copy(p1 = v13)
    val v241: s0 = f37(v123, v47)
    v241
  }
  def f28(v0: Vector[s3], v1: s0): s0 = {
    val v6: s0 = f37(v1, v1)
    var v4: s0 = v1
    val v7: s0 = f37(v1, v6)
    var v5: Vector[s3] = v0
    var v8: Vector[s3] = v5
    val v2: s0 = f60(v4)
    var v9: Vector[s3] = v5
    val v14: Vector[Vector[Double]] = v7.p0
    val v12: Vector[Double] = v14(0)
    val v3: s3 = v9(0)
    val v28: Vector[Vector[Double]] = v6.p0
    var v10: Vector[s3] = v8
    val v36: s0 = v3.p1
    var v13: Vector[Double] = v12
    val v34: Vector[Vector[Double]] = v6.p1
    val v23: s3 = v10(0)
    val v26: Vector[Double] = v34(1)
    val v49: s3 = f36(v3)
    val v52: s3 = v8(0)
    v9 = v9.updated(0, v49)
    v4 = v4.copy(p0 = v28)
    v4 = v4.copy(p0 = v14)
    var v29: s3 = v23
    v29 = v29.copy(p1 = v1)
    val v30: s3 = f36(v49)
    var v40: Vector[Vector[Double]] = v28
    v29 = v29.copy(p1 = v7)
    val v45: s3 = f36(v29)
    v4 = v4.copy(p1 = v34)
    v5 = v5.updated(0, v45)
    v5 = v5.updated(0, v30)
    val v61: Vector[Double] = v40(1)
    v40 = v40.updated(2, v26)
    val v35: Vector[Vector[Double]] = v2.p1
    val v42: Vector[s1] = v52.p0
    v40 = v40.updated(0, v13)
    var v80: Vector[s1] = v42
    v4 = v4.copy(p0 = v40)
    v5 = v5.updated(0, v29)
    v4 = v4.copy(p0 = v40)
    var v46: s0 = v36
    val v84: s0 = f33(v46)
    val v93: s0 = f37(v84, v2)
    val v57: Vector[Vector[Double]] = v84.p1
    v4 = v4.copy(p1 = v57)
    v46 = v46.copy(p0 = v14)
    v5 = v5.updated(0, v52)
    v29 = v29.copy(p0 = v80)
    var v141: s0 = v93
    v141 = v141.copy(p1 = v35)
    v40 = v40.updated(2, v61)
    val v137: s3 = v0(0)
    v8 = v8.updated(0, v3)
    v5 = v5.updated(0, v137)
    v141
  }
  def f23(v0: Vector[s0]): Vector[s0] = {
    val v2: Vector[Vector[s0]] = Vector(v0, v0, v0, v0)
    var v9: Vector[s0] = v0
    var v6: Vector[Vector[s0]] = v2
    val v5: Vector[s0] = v6(2)
    var v15: Vector[s0] = v5
    val v8: Vector[s0] = f56(v15)
    val v10: Vector[s0] = f56(v9)
    val v16: Vector[s0] = f56(v15)
    var v30: Vector[s0] = v9
    val v25: Vector[s0] = f56(v10)
    val v20: Vector[s0] = f56(v30)
    v15 = v20
    val v43: Vector[s0] = f56(v15)
    val v50: Vector[s0] = f56(v16)
    val v42: Vector[s0] = f56(v8)
    val v48: s0 = v42(0)
    val v46: Vector[Vector[Double]] = v48.p1
    var v58: s0 = v48
    val v104: s0 = f33(v58)
    v58 = v58.copy(p1 = v46)
    v58 = v58.copy(p1 = v46)
    val v55: Vector[Vector[Double]] = v104.p1
    val v44: s1 = s1(v16, v58)
    val v79: s0 = v5(0)
    val v63: s1 = s1(v50, v104)
    v58 = v58.copy(p1 = v46)
    v58 = v58.copy(p1 = v55)
    v58 = v58.copy(p1 = v55)
    val v73: Vector[Vector[Double]] = v79.p0
    val v53: Vector[Vector[Double]] = v58.p0
    var v93: s1 = v44
    v6 = v6.updated(0, v25)
    v58 = v58.copy(p0 = v53)
    val v122: s1 = f47(v63)
    v58 = v58.copy(p0 = v53)
    v58 = v58.copy(p0 = v73)
    val v299: s1 = f47(v93)
    val v296: Vector[s1] = Vector(v299, v122, v63, v93, v122)
    var v64: Vector[s1] = v296
    v93 = v63
    v93 = v93.copy(p0 = v43)
    v93 = v93.copy(p0 = v15)
    val v138: s1 = v64(0)
    val v362: Vector[s0] = v138.p0
    v362
  }
  def f10(v0: Vector[s1]): Vector[s1] = {
    var v5: Vector[s1] = v0
    var v7: Vector[s1] = v5
    val v2: s1 = v7(0)
    v7 = v7.updated(1, v2)
    val v9: s1 = v5(1)
    v7 = v5
    v7 = v7.updated(0, v9)
    v5 = v5.updated(1, v2)
    val v50: s1 = v7(0)
    val v17: s1 = f47(v50)
    var v44: Vector[s1] = v7
    v5 = v5.updated(1, v17)
    v44
  }
  def f4(v0: Vector[s1]): Vector[s1] = {
    val v2: Vector[s1] = f10(v0)
    val v6: Vector[Vector[s1]] = Vector(v0, v2, v2, v0)
    val v3: Vector[s1] = f10(v0)
    val v4: Vector[s1] = f10(v0)
    val v5: Vector[s1] = f10(v0)
    val v7: Vector[s1] = f10(v5)
    val v8: s1 = v5(0)
    val v9: Vector[s1] = f10(v3)
    var v10: Vector[s1] = v4
    v10 = v5
    var v15: Vector[Vector[s1]] = v6
    val v1: s1 = f47(v8)
    val v17: s1 = v4(0)
    v15 = v15.updated(0, v10)
    v15 = v15.updated(0, v2)
    v10 = v10.updated(1, v1)
    val v13: s1 = f47(v1)
    var v34: Vector[s1] = v9
    val v30: s1 = f47(v17)
    v10 = v10.updated(1, v30)
    v15 = v15.updated(1, v5)
    v10 = v10.updated(0, v1)
    var v25: s1 = v17
    v15 = v15.updated(3, v7)
    var v21: s1 = v13
    val v20: Vector[Vector[Vector[s1]]] = Vector(v6, v15, v15, v6, v6, v15)
    val v28: s1 = v10(1)
    val v47: s1 = f47(v30)
    v34 = v34.updated(0, v25)
    v15 = v15.updated(2, v3)
    v34 = v34.updated(0, v28)
    val v19: Vector[Vector[s1]] = v20(4)
    v10 = v10.updated(0, v47)
    val v42: Vector[s1] = v19(2)
    val v57: Vector[s1] = f10(v0)
    v34 = v34.updated(1, v21)
    v34 = v34.updated(0, v17)
    v10 = v57
    v10 = v10.updated(1, v25)
    v15 = v15.updated(0, v34)
    val v179: Vector[s1] = f10(v42)
    v179
  }
  @noinline
  def f0(v0: s0, v1: Vector[s3], v2: Double): Double = {
    val v5: s3 = v1(0)
    val v4: s3 = v1(0)
    val v7: s3 = v1(0)
    var v8: s0 = v0
    val v3: Vector[Vector[Double]] = v8.p1
    val v9: s0 = v7.p1
    val v10: s0 = f37(v0, v9)
    val v29: s0 = f37(v0, v8)
    val v14: Vector[Double] = v3(0)
    v8 = v8.copy(p1 = v3)
    val v18: s3 = f36(v5)
    val v26: Vector[s1] = v5.p0
    v8 = v8.copy(p1 = v3)
    val v24: Vector[s1] = f4(v26)
    var v17: s3 = v4
    val v35: Double = v14(0)
    var v19: Vector[s1] = v24
    val v45: s1 = v26(0)
    v19 = v19.updated(0, v45)
    var v37: s1 = v45
    var v21: Vector[s3] = v1
    val v22: Vector[s1] = f4(v26)
    var v13: Vector[s1] = v19
    val v46: s0 = v37.p1
    var v51: Double = v35
    v21 = v21.updated(0, v17)
    val v39: s3 = v1(0)
    v17 = v18
    val v33: s0 = v39.p1
    val v59: Vector[Vector[Double]] = v46.p1
    val v43: Vector[s0] = v37.p0
    val v49: s3 = v21(0)
    v17 = v17.copy(p0 = v13)
    val v36: Vector[s1] = v17.p0
    v37 = v37.copy(p0 = v43)
    val v47: s0 = f28(v21, v10)
    val v57: s1 = v24(1)
    v21 = v21.updated(0, v18)
    val v42: Vector[Vector[Double]] = v47.p0
    val v70: s1 = f47(v37)
    val v54: Vector[Double] = v59(0)
    val v91: s1 = v36(1)
    v17 = v17.copy(p0 = v22)
    v37 = v37.copy(p1 = v33)
    val v60: Double = v54(0)
    v19 = v19.updated(0, v91)
    val v58: Vector[s0] = f23(v43)
    var v65: Vector[s1] = v13
    val v155: Double = v2 / v51
    v37 = v37.copy(p1 = v29)
    val v67: s3 = f36(v49)
    var v125: s1 = v57
    val v137: Vector[Vector[Double]] = v9.p0
    val v72: s1 = f47(v70)
    v8 = v8.copy(p0 = v137)
    v13 = v13.updated(1, v72)
    var v173: Double = v155
    val v92: s0 = f60(v46)
    v173 = v155
    v21 = v21.updated(0, v67)
    v173 = v2
    v37 = v37.copy(p0 = v58)
    v65 = v65.updated(1, v125)
    val v94: Vector[s0] = f23(v43)
    v17 = v17.copy(p0 = v65)
    v37 = v37.copy(p0 = v94)
    v37 = v37.copy(p1 = v46)
    v13 = v13.updated(1, v45)
    v8 = v8.copy(p0 = v42)
    v17 = v17.copy(p1 = v92)
    v51 = v60
    v173
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0)))
    val v1: Vector[s3] = Vector(s3(Vector(s1(Vector(s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0)))), s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0)))), s1(Vector(s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0)))), s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0), Vector(24.0))))), s0(Vector(Vector(25.0), Vector(26.0), Vector(27.0)), Vector(Vector(28.0), Vector(29.0)))))
    val v2: Double = 30.0
    val start = nanoTime()
    var result: Double = 30.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}