import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: s1,
    p1: s0
  )
  case class s3 (
    p0: Vector[s2],
    p1: Vector[s1]
  )
  def f81(v0: Vector[s1]): Vector[s1] = {
    val v5: s1 = v0(0)
    val v4: s0 = v5.p1
    val v1: s0 = v5.p1
    var v2: s1 = v5
    val v16: s1 = v0(0)
    val v12: Vector[Vector[Double]] = v4.p0
    var v9: s0 = v4
    val v8: Vector[Double] = v12(0)
    v9 = v9.copy(p0 = v12)
    v2 = v2.copy(p0 = v4)
    val v18: s1 = v0(1)
    v9 = v9.copy(p0 = v12)
    v9 = v4
    val v50: s0 = v2.p1
    v2 = v2.copy(p0 = v9)
    var v20: s1 = v18
    var v10: Vector[s1] = v0
    val v15: Vector[Vector[Double]] = v1.p1
    v10 = v10.updated(0, v2)
    val v25: Vector[Vector[Double]] = v50.p1
    var v14: Vector[Vector[Double]] = v15
    val v17: Vector[Vector[Double]] = v9.p2
    val v19: s1 = v0(1)
    val v26: Vector[Double] = v12(0)
    var v39: s1 = v16
    v10 = v10.updated(1, v19)
    val v24: s0 = v39.p1
    v14 = v14.updated(1, v8)
    var v28: s0 = v50
    v9 = v9.copy(p1 = v25)
    var v21: Vector[s1] = v10
    val v33: s0 = v18.p1
    var v43: Vector[Vector[Double]] = v12
    var v40: Vector[Double] = v26
    v9 = v9.copy(p1 = v17)
    v10 = v10.updated(1, v2)
    var v27: s1 = v19
    var v35: s0 = v33
    var v60: Vector[Vector[Double]] = v25
    val v29: Vector[Double] = v60(1)
    val v87: Vector[Vector[Double]] = v35.p2
    val v47: s0 = v27.p1
    v10 = v10.updated(1, v20)
    v28 = v28.copy(p0 = v12)
    val v46: Vector[Double] = v14(1)
    v2 = v2.copy(p1 = v47)
    val v38: Vector[Double] = v43(0)
    v43 = v43.updated(0, v29)
    v28 = v28.copy(p0 = v43)
    v60 = v60.updated(1, v40)
    v2 = v2.copy(p0 = v1)
    v43 = v43.updated(0, v46)
    val v42: Vector[Vector[Double]] = v28.p0
    v35 = v35.copy(p2 = v25)
    val v156: Vector[Double] = v14(0)
    val v150: s0 = v5.p0
    v10 = v10.updated(0, v27)
    v20 = v20.copy(p0 = v150)
    v2 = v2.copy(p0 = v24)
    val v88: Vector[Double] = v42(0)
    v14 = v14.updated(0, v38)
    v10 = v10.updated(1, v18)
    v60 = v60.updated(1, v156)
    v10 = v21
    v10 = v10.updated(1, v2)
    v39 = v39.copy(p0 = v28)
    v35 = v35.copy(p1 = v25)
    v20 = v20.copy(p1 = v1)
    v28 = v28.copy(p1 = v87)
    v2 = v2.copy(p1 = v9)
    var v103: s0 = v24
    v39 = v39.copy(p1 = v28)
    v60 = v60.updated(1, v38)
    v14 = v14.updated(1, v88)
    var v166: Vector[s1] = v21
    v2 = v2.copy(p0 = v103)
    v166
  }
  def f74(v0: s2): s2 = {
    v0
  }
  def f72(v0: s0): s0 = {
    val v5: Vector[Vector[Double]] = v0.p1
    val v11: s1 = s1(v0, v0)
    val v9: s0 = v11.p1
    var v15: s1 = v11
    var v21: s0 = v9
    v21 = v21.copy(p1 = v5)
    var v18: s0 = v21
    v15 = v15.copy(p0 = v18)
    val v49: s0 = v15.p0
    v15 = v15.copy(p1 = v9)
    v49
  }
  def f71(v0: s1): s1 = {
    val v5: s0 = v0.p1
    val v2: s0 = f72(v5)
    val v4: s2 = s2(v0, v2)
    var v8: s1 = v0
    v8 = v0
    val v7: s0 = f72(v2)
    v8 = v8.copy(p1 = v5)
    val v12: s2 = f74(v4)
    var v6: s2 = v4
    v6 = v6.copy(p1 = v5)
    var v22: s1 = v8
    v22 = v8
    v22 = v22.copy(p1 = v7)
    val v33: s1 = s1(v2, v2)
    val v42: s2 = f74(v6)
    val v32: s1 = v12.p0
    v6 = v6.copy(p0 = v22)
    val v81: s1 = v42.p0
    var v44: s1 = v22
    val v34: s2 = f74(v42)
    val v61: s0 = v44.p1
    v44 = v81
    v8 = v8.copy(p0 = v61)
    val v39: s0 = v81.p0
    v44 = v44.copy(p1 = v61)
    val v67: s0 = v32.p0
    val v51: s0 = v34.p1
    v8 = v44
    v6 = v6.copy(p1 = v67)
    val v96: s0 = v81.p0
    val v98: s0 = f72(v51)
    var v68: s0 = v39
    v44 = v44.copy(p0 = v98)
    v8 = v8.copy(p0 = v96)
    v44 = v44.copy(p0 = v68)
    v6 = v6.copy(p0 = v33)
    v44
  }
  def f70(v0: s3): s3 = {
    val v2: Vector[s1] = v0.p1
    var v5: Vector[s1] = v2
    val v4: s1 = v5(0)
    v5 = v5.updated(0, v4)
    var v61: s3 = v0
    v61 = v61.copy(p1 = v5)
    v61
  }
  def f67(v0: s2, v1: s2): s2 = {
    val v5: Vector[s2] = Vector(v1, v1)
    val v4: s2 = v5(1)
    val v9: s2 = v5(0)
    val v14: s1 = v4.p0
    val v25: s1 = f71(v14)
    val v45: s0 = v9.p1
    val v37: s2 = s2(v25, v45)
    v37
  }
  def f60(v0: s2): s2 = {
    val v2: s2 = f74(v0)
    var v7: s2 = v2
    val v6: s0 = v2.p1
    val v4: Vector[Vector[Double]] = v6.p0
    var v1: Vector[Vector[Double]] = v4
    val v11: Vector[Vector[Double]] = v6.p1
    val v9: s0 = f72(v6)
    val v5: s1 = v2.p0
    val v12: s0 = f72(v6)
    val v15: Vector[Vector[Double]] = v6.p0
    val v20: s0 = s0(v1, v11, v11)
    var v31: s0 = v9
    val v14: s0 = f72(v12)
    val v24: Vector[Double] = v11(1)
    var v21: s1 = v5
    v7 = v7.copy(p1 = v14)
    val v22: s0 = v7.p1
    v21 = v21.copy(p0 = v20)
    v1 = v1.updated(0, v24)
    val v71: Vector[Vector[Double]] = v22.p2
    var v121: Vector[Vector[Double]] = v71
    val v107: Vector[Double] = v15(0)
    val v85: s2 = s2(v21, v31)
    v31 = v31.copy(p1 = v121)
    v121 = v121.updated(0, v107)
    v31 = v31.copy(p0 = v1)
    val v169: s2 = f74(v85)
    v169
  }
  def f56(v0: s3): s3 = {
    val v7: s3 = f70(v0)
    var v4: s3 = v0
    val v3: Vector[s1] = v7.p1
    val v6: s3 = f70(v7)
    val v8: Vector[s1] = f81(v3)
    val v10: Vector[s2] = v6.p0
    v4 = v4.copy(p0 = v10)
    v4 = v4.copy(p1 = v8)
    v4
  }
  def f53(v0: s3): s3 = {
    var v6: s3 = v0
    val v4: s3 = f70(v6)
    val v8: Vector[s1] = v0.p1
    v6 = v6.copy(p1 = v8)
    var v5: Vector[s1] = v8
    val v13: s1 = v5(1)
    v6 = v6.copy(p1 = v5)
    val v7: s0 = v13.p1
    var v9: s0 = v7
    val v2: Vector[Vector[Double]] = v9.p1
    var v3: s0 = v9
    v9 = v9.copy(p1 = v2)
    val v17: s0 = f72(v3)
    var v18: Vector[s1] = v5
    v18 = v18.updated(0, v13)
    val v11: s1 = s1(v7, v17)
    var v19: Vector[Vector[Double]] = v2
    val v29: s1 = v8(1)
    val v25: Vector[s1] = v0.p1
    v18 = v8
    var v20: s1 = v13
    v5 = v5.updated(0, v29)
    val v24: Vector[Double] = v19(1)
    v9 = v9.copy(p2 = v2)
    v5 = v5.updated(1, v29)
    v3 = v3.copy(p2 = v19)
    val v33: Vector[s1] = f81(v18)
    v18 = v18.updated(1, v20)
    v19 = v19.updated(0, v24)
    v3 = v3.copy(p1 = v19)
    v3 = v3.copy(p1 = v2)
    val v36: Vector[s2] = v4.p0
    val v32: Vector[s2] = v0.p0
    v3 = v3.copy(p1 = v19)
    v5 = v5.updated(1, v13)
    val v61: s3 = s3(v36, v33)
    v9 = v9.copy(p2 = v2)
    v20 = v20.copy(p0 = v3)
    val v73: Vector[s1] = f81(v25)
    v5 = v5.updated(0, v13)
    v18 = v18.updated(0, v13)
    v3 = v3.copy(p2 = v19)
    v6 = v6.copy(p0 = v32)
    v18 = v18.updated(0, v11)
    val v58: s3 = f70(v61)
    v6 = v6.copy(p1 = v33)
    v6 = v6.copy(p1 = v73)
    v5 = v5.updated(1, v13)
    v6 = v6.copy(p0 = v32)
    v58
  }
  def f50(v0: Vector[Double], v1: s0): s0 = {
    var v4: s0 = v1
    var v8: s0 = v4
    val v7: s0 = f72(v8)
    val v9: Vector[Vector[Double]] = v4.p2
    var v2: s0 = v7
    val v11: s1 = s1(v2, v2)
    val v12: Vector[Vector[Double]] = v2.p0
    var v19: Vector[Vector[Double]] = v12
    v19 = v19.updated(0, v0)
    val v35: s1 = f71(v11)
    val v33: s0 = v35.p1
    v19 = v19.updated(0, v0)
    v2 = v2.copy(p2 = v9)
    v4 = v4.copy(p0 = v19)
    v19 = v19.updated(0, v0)
    v19 = v19.updated(0, v0)
    v33
  }
  def f46(v0: s0): s0 = {
    val v5: Vector[Vector[Double]] = v0.p0
    val v1: Vector[Double] = v5(0)
    val v2: Vector[Vector[Double]] = v0.p0
    val v3: Double = v1(0)
    val v7: Double = v1(0)
    val v9: Vector[Double] = v5(0)
    val v8: Vector[Vector[Double]] = v0.p1
    var v11: s0 = v0
    val v17: Vector[Double] = v8(0)
    var v10: Double = v3
    var v14: Vector[Double] = v9
    v14 = v14.updated(0, v7)
    val v13: Vector[Vector[Double]] = v11.p1
    v11 = v11.copy(p2 = v13)
    val v18: Vector[Vector[Double]] = v0.p0
    val v12: Vector[Vector[Double]] = v0.p1
    var v24: Vector[Double] = v14
    var v35: Vector[Vector[Double]] = v8
    val v19: Double = v3 / v3
    v24 = v24.updated(0, v19)
    val v15: Vector[Vector[Double]] = v0.p1
    val v20: Vector[Vector[Double]] = v11.p1
    v35 = v35.updated(0, v14)
    v11 = v11.copy(p1 = v15)
    v24 = v24.updated(0, v10)
    v35 = v35.updated(1, v14)
    v11 = v11.copy(p1 = v20)
    v11 = v11.copy(p2 = v15)
    var v54: Vector[Vector[Double]] = v12
    v24 = v24.updated(0, v19)
    var v16: Vector[Vector[Double]] = v35
    v35 = v35.updated(1, v14)
    v11 = v11.copy(p1 = v54)
    val v21: s0 = f50(v17, v0)
    val v33: Vector[Vector[Double]] = v11.p1
    var v22: Vector[Vector[Double]] = v35
    val v28: Vector[Double] = v2(0)
    var v41: s0 = v11
    val v61: s0 = f72(v21)
    v41 = v41.copy(p0 = v2)
    val v44: Vector[Double] = v13(0)
    v41 = v41.copy(p2 = v33)
    v54 = v54.updated(1, v1)
    v16 = v16.updated(1, v24)
    val v55: Vector[Vector[Double]] = v41.p0
    val v82: Vector[Vector[Double]] = v61.p0
    val v36: Vector[Double] = v16(0)
    v11 = v11.copy(p0 = v82)
    val v47: Vector[Double] = v18(0)
    val v84: Vector[Vector[Double]] = Vector(v24, v44, v47, v28, v36, v17, v14)
    val v94: Vector[Vector[Double]] = v21.p0
    val v83: Vector[Vector[Double]] = v61.p2
    v41 = v41.copy(p1 = v83)
    v41 = v41.copy(p2 = v20)
    val v105: Vector[Double] = v84(1)
    v41 = v41.copy(p0 = v94)
    v11 = v11.copy(p2 = v22)
    v24 = v44
    v11 = v11.copy(p0 = v55)
    val v160: s0 = f50(v105, v0)
    v160
  }
  def f42(v0: s0): s0 = {
    val v1: s0 = f46(v0)
    val v5: Vector[Vector[Double]] = v0.p2
    val v6: Vector[Double] = v5(1)
    val v2: s0 = f72(v1)
    var v7: Vector[Double] = v6
    val v10: s0 = f72(v1)
    var v9: Vector[Vector[Double]] = v5
    val v4: Vector[Vector[Double]] = v10.p1
    v9 = v9.updated(0, v7)
    var v17: Vector[Vector[Double]] = v9
    val v11: Vector[Vector[Double]] = v2.p0
    v17 = v17.updated(1, v6)
    var v14: Vector[Vector[Double]] = v11
    v14 = v14.updated(0, v7)
    v9 = v9.updated(0, v6)
    v9 = v9.updated(0, v6)
    val v110: s0 = s0(v14, v4, v17)
    v110
  }
  def f37(v0: Double, v1: s1): Double = {
    val v6: s1 = f71(v1)
    val v2: s0 = v6.p0
    val v10: s0 = f72(v2)
    val v4: Vector[Vector[Double]] = v2.p1
    var v7: Double = v0
    var v8: s0 = v2
    val v13: s0 = f42(v10)
    v8 = v13
    val v32: Vector[Vector[Double]] = v8.p0
    v8 = v8.copy(p2 = v4)
    val v23: Vector[Double] = v32(0)
    val v57: Double = v0 / v7
    val v74: Double = v23(0)
    val v25: Double = v74 - v57
    v7 = v25
    var v93: Double = v57
    v93 = v25
    v93
  }
  def f35(v0: s1, v1: Vector[s2]): Vector[s2] = {
    val v7: Vector[Vector[s2]] = Vector(v1, v1, v1)
    val v65: Vector[s2] = v7(1)
    v65
  }
  def f27(v0: s1): s1 = {
    val v6: s1 = f71(v0)
    val v24: s1 = f71(v6)
    v24
  }
  def f25(v0: s0, v1: Vector[s3], v2: s2, v3: s1): s0 = {
    val v4: s2 = f60(v2)
    val v7: s2 = f60(v4)
    var v19: s2 = v4
    val v25: Vector[s2] = Vector(v19, v7)
    val v20: s2 = v25(1)
    val v43: s0 = v20.p1
    v43
  }
  def f14(v0: s3): s3 = {
    val v3: s3 = f70(v0)
    val v4: Vector[s2] = v0.p0
    val v2: s2 = v4(0)
    var v11: s2 = v2
    var v8: s2 = v11
    val v12: s1 = v8.p0
    val v16: Vector[s1] = Vector(v12, v12)
    val v35: s3 = f56(v0)
    val v29: Vector[s2] = v3.p0
    var v47: Vector[s2] = v29
    val v38: s3 = f53(v3)
    var v60: s3 = v35
    v60 = v60.copy(p0 = v47)
    val v106: Vector[s2] = v38.p0
    v47 = v47.updated(0, v8)
    v60 = v60.copy(p0 = v106)
    v60 = v60.copy(p1 = v16)
    v47 = v4
    v60
  }
  def f3(v0: s0, v1: s1): s1 = {
    var v2: s0 = v0
    val v7: Vector[Vector[Double]] = v2.p0
    v2 = v2.copy(p0 = v7)
    val v9: Vector[Double] = v7(0)
    v2 = v2.copy(p0 = v7)
    val v5: s0 = v1.p0
    val v11: s0 = v1.p0
    v2 = v11
    val v3: Double = v9(0)
    v2 = v2.copy(p0 = v7)
    var v13: Vector[Double] = v9
    val v10: s0 = f46(v5)
    val v12: Vector[Vector[Double]] = v2.p0
    var v20: s1 = v1
    val v16: Vector[Double] = v12(0)
    val v36: s0 = f50(v13, v0)
    v13 = v13.updated(0, v3)
    val v15: s0 = f46(v10)
    val v30: Double = v16(0)
    val v28: Double = f37(v3, v1)
    var v35: Double = v30
    v13 = v13.updated(0, v28)
    v20 = v20.copy(p1 = v15)
    var v34: s1 = v20
    v20 = v20.copy(p1 = v36)
    v13 = v13.updated(0, v35)
    val v96: s1 = f27(v34)
    v96
  }
  def f1(v0: s3): s3 = {
    var v2: s3 = v0
    val v3: Vector[s2] = v0.p0
    val v5: Vector[s1] = v2.p1
    val v4: Vector[s2] = v0.p0
    val v8: s2 = v4(0)
    v2 = v2.copy(p0 = v3)
    val v17: Vector[s1] = v2.p1
    v2 = v2.copy(p1 = v17)
    var v15: s2 = v8
    var v16: s2 = v15
    val v22: s1 = v16.p0
    val v38: s2 = v3(0)
    val v53: s0 = v38.p1
    val v43: s0 = v22.p0
    val v91: Vector[s2] = f35(v22, v4)
    val v50: s3 = s3(v91, v5)
    v2 = v2.copy(p1 = v5)
    v15 = v15.copy(p1 = v53)
    val v171: Vector[s2] = v2.p0
    v15 = v15.copy(p1 = v43)
    v2 = v2.copy(p0 = v171)
    v50
  }
  @noinline
  def f0(v0: Vector[s3], v1: Double): Double = {
    var v7: Vector[s3] = v0
    val v4: s3 = v7(0)
    val v5: Vector[s2] = v4.p0
    val v8: s3 = v0(2)
    var v2: Double = v1
    v2 = v1
    var v3: Vector[s3] = v7
    val v14: s2 = v5(0)
    var v11: Vector[s2] = v5
    v3 = v3.updated(0, v8)
    val v17: s1 = v14.p0
    val v6: s2 = f67(v14, v14)
    val v10: s0 = v6.p1
    val v13: s3 = v0(0)
    val v16: s0 = f25(v10, v7, v14, v17)
    val v25: s3 = v0(0)
    val v20: s3 = f14(v8)
    v7 = v7.updated(2, v4)
    val v30: s3 = v0(1)
    val v19: s1 = v14.p0
    val v27: s3 = f1(v30)
    val v33: s3 = v7(2)
    v7 = v7.updated(2, v8)
    var v43: s3 = v25
    val v64: s1 = f3(v16, v19)
    var v71: Vector[s3] = v3
    val v44: s3 = f70(v13)
    v7 = v7.updated(2, v33)
    v43 = v43.copy(p0 = v5)
    v3 = v3.updated(2, v13)
    val v54: s3 = v7(2)
    v71 = v71.updated(2, v27)
    val v117: s0 = v64.p1
    v7 = v7.updated(0, v8)
    v71 = v71.updated(1, v43)
    val v72: s2 = v11(0)
    var v94: s3 = v54
    val v76: s0 = f25(v117, v71, v72, v64)
    val v104: s3 = v71(2)
    val v141: Vector[s1] = v25.p1
    val v248: Vector[Vector[Double]] = v76.p1
    v94 = v94.copy(p1 = v141)
    val v118: Vector[s1] = v94.p1
    v94 = v94.copy(p1 = v118)
    v7 = v7.updated(1, v104)
    var v180: s3 = v44
    v43 = v20
    val v105: Vector[Double] = v248(0)
    val v220: Double = v105(0)
    v7 = v7.updated(2, v43)
    v43 = v94
    val v158: Double = v220 * v2
    v7 = v7.updated(0, v180)
    v71 = v71.updated(0, v8)
    v158
  }
  def benchmark(): Unit = {
    val v0: Vector[s3] = Vector(s3(Vector(s2(s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0))), s0(Vector(Vector(5.0)), Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0)))), s0(Vector(Vector(10.0)), Vector(Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0))))), Vector(s1(s0(Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0))), s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0), Vector(24.0)))), s1(s0(Vector(Vector(25.0)), Vector(Vector(26.0), Vector(27.0)), Vector(Vector(28.0), Vector(29.0))), s0(Vector(Vector(30.0)), Vector(Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0)))))), s3(Vector(s2(s1(s0(Vector(Vector(35.0)), Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0))), s0(Vector(Vector(40.0)), Vector(Vector(41.0), Vector(42.0)), Vector(Vector(43.0), Vector(44.0)))), s0(Vector(Vector(45.0)), Vector(Vector(46.0), Vector(47.0)), Vector(Vector(48.0), Vector(49.0))))), Vector(s1(s0(Vector(Vector(50.0)), Vector(Vector(51.0), Vector(52.0)), Vector(Vector(53.0), Vector(54.0))), s0(Vector(Vector(55.0)), Vector(Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0)))), s1(s0(Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0)), Vector(Vector(63.0), Vector(64.0))), s0(Vector(Vector(65.0)), Vector(Vector(66.0), Vector(67.0)), Vector(Vector(68.0), Vector(69.0)))))), s3(Vector(s2(s1(s0(Vector(Vector(70.0)), Vector(Vector(71.0), Vector(72.0)), Vector(Vector(73.0), Vector(74.0))), s0(Vector(Vector(75.0)), Vector(Vector(76.0), Vector(77.0)), Vector(Vector(78.0), Vector(79.0)))), s0(Vector(Vector(80.0)), Vector(Vector(81.0), Vector(82.0)), Vector(Vector(83.0), Vector(84.0))))), Vector(s1(s0(Vector(Vector(85.0)), Vector(Vector(86.0), Vector(87.0)), Vector(Vector(88.0), Vector(89.0))), s0(Vector(Vector(90.0)), Vector(Vector(91.0), Vector(92.0)), Vector(Vector(93.0), Vector(94.0)))), s1(s0(Vector(Vector(95.0)), Vector(Vector(96.0), Vector(97.0)), Vector(Vector(98.0), Vector(99.0))), s0(Vector(Vector(100.0)), Vector(Vector(101.0), Vector(102.0)), Vector(Vector(103.0), Vector(104.0)))))))
    val v1: Double = 105.0
    val start = nanoTime()
    var result: Double = 105.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}