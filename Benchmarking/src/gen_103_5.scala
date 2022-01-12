import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: s0
  )
  def f45(v0: s0): s0 = {
    val v3: Vector[Vector[Double]] = v0.p1
    val v2: Vector[Vector[Double]] = v0.p1
    var v6: Vector[Vector[Double]] = v2
    val v8: Vector[Double] = v3(2)
    val v7: Vector[Vector[Vector[Double]]] = Vector(v6, v6, v2)
    val v4: Vector[Vector[Double]] = v0.p0
    val v9: Vector[Vector[Double]] = v7(1)
    val v5: Vector[Double] = v9(0)
    var v15: Vector[Vector[Double]] = v9
    val v1: Vector[Vector[Double]] = v0.p1
    v6 = v6.updated(1, v5)
    v15 = v15.updated(0, v8)
    val v22: Vector[Vector[Vector[Double]]] = Vector(v15)
    var v16: Vector[Vector[Vector[Double]]] = v22
    val v36: Vector[Vector[Double]] = v0.p1
    val v17: Vector[Double] = v2(2)
    var v23: Vector[Vector[Vector[Double]]] = v16
    v16 = v16.updated(0, v3)
    val v27: Vector[Vector[Double]] = v0.p0
    var v37: Vector[Vector[Vector[Double]]] = v7
    val v20: Vector[Vector[Double]] = v0.p1
    val v31: Vector[Vector[Double]] = v0.p1
    v15 = v15.updated(0, v8)
    val v35: Vector[Vector[Double]] = v0.p1
    v23 = v23.updated(0, v27)
    val v50: Vector[Vector[Double]] = v0.p1
    val v72: Vector[Vector[Double]] = v0.p0
    val v67: s0 = s0(v35, v15)
    var v60: s0 = v67
    v60 = v60.copy(p0 = v72)
    val v30: Vector[Vector[Double]] = v37(2)
    v60 = v60.copy(p1 = v30)
    v16 = v16.updated(0, v35)
    var v44: Vector[Vector[Vector[Double]]] = v23
    v6 = v6.updated(2, v17)
    v16 = v16.updated(0, v20)
    var v54: Vector[Vector[Double]] = v31
    val v112: Vector[Vector[Double]] = v0.p0
    val v90: Vector[Vector[Double]] = v0.p1
    val v123: Vector[Vector[Double]] = v60.p0
    v60 = v60.copy(p1 = v1)
    val v104: Vector[Vector[Double]] = v0.p1
    val v195: Vector[Vector[Double]] = v60.p0
    v60 = v60.copy(p0 = v36)
    var v52: Vector[Vector[Double]] = v6
    v60 = v60.copy(p0 = v123)
    v60 = v60.copy(p0 = v2)
    v60 = v60.copy(p1 = v50)
    val v84: s0 = s0(v90, v195)
    v23 = v23.updated(0, v4)
    v60 = v60.copy(p1 = v72)
    v60 = v60.copy(p1 = v104)
    val v171: Vector[Vector[Double]] = v44(0)
    v60 = v60.copy(p0 = v112)
    v60 = v60.copy(p1 = v171)
    v60 = v60.copy(p1 = v54)
    v60 = v60.copy(p1 = v72)
    v54 = v54.updated(2, v5)
    v60 = v60.copy(p1 = v52)
    v84
  }
  def f42(v0: Vector[Vector[s0]], v1: s1): Vector[Vector[s0]] = {
    v0
  }
  def f38(v0: s1): s1 = {
    val v10: Vector[Vector[s0]] = v0.p0
    val v9: Vector[Vector[s0]] = f42(v10, v0)
    val v24: Vector[Vector[s0]] = v0.p0
    val v28: Vector[s0] = v24(1)
    val v29: Vector[Vector[s0]] = f42(v9, v0)
    val v47: Vector[Vector[s0]] = f42(v9, v0)
    val v25: Vector[Vector[s0]] = f42(v9, v0)
    val v40: s0 = v0.p1
    var v32: Vector[s0] = v28
    val v39: s1 = s1(v25, v40)
    val v31: s0 = v28(0)
    val v35: Vector[s0] = v29(0)
    var v59: Vector[Vector[s0]] = v29
    val v54: Vector[Vector[s0]] = f42(v59, v0)
    var v62: Vector[Vector[s0]] = v54
    var v112: s1 = v39
    v59 = v59.updated(1, v35)
    v62 = v62.updated(1, v32)
    val v81: Vector[s0] = v47(0)
    v62 = v62.updated(1, v81)
    v112 = v112.copy(p0 = v62)
    v112 = v112.copy(p1 = v31)
    v112
  }
  def f37(v0: s1): s1 = {
    val v5: Vector[Vector[s0]] = v0.p0
    var v4: Vector[Vector[s0]] = v5
    val v6: Vector[s0] = v4(0)
    val v9: s0 = v0.p1
    val v15: s1 = f38(v0)
    val v7: s0 = v6(0)
    val v13: s0 = f45(v9)
    val v17: Vector[Vector[s0]] = v0.p0
    var v26: s1 = v15
    v26 = v26.copy(p1 = v13)
    v26 = v26.copy(p1 = v7)
    v26 = v26.copy(p0 = v17)
    v26
  }
  def f36(v0: s1, v1: Vector[s0]): Vector[s0] = {
    var v5: Vector[s0] = v1
    val v6: s0 = v0.p1
    v5 = v5.updated(0, v6)
    val v3: Vector[Vector[Double]] = v6.p1
    v5 = v1
    var v4: s1 = v0
    v5 = v5.updated(0, v6)
    val v14: Vector[Vector[s0]] = v4.p0
    var v17: s0 = v6
    v5 = v5.updated(0, v17)
    v17 = v17.copy(p1 = v3)
    val v20: s0 = v4.p1
    val v10: s1 = f38(v4)
    val v12: s1 = f38(v4)
    val v24: s0 = f45(v6)
    val v16: s0 = v0.p1
    val v33: s0 = f45(v16)
    val v29: Vector[Vector[s0]] = v10.p0
    v5 = v5.updated(0, v33)
    v5 = v5.updated(0, v20)
    val v59: s0 = v5(0)
    val v68: Vector[Vector[s0]] = f42(v29, v12)
    v4 = v4.copy(p0 = v14)
    val v54: Vector[Vector[Double]] = v24.p1
    v17 = v17.copy(p1 = v54)
    v4 = v4.copy(p1 = v59)
    val v50: Vector[s0] = v68(1)
    v50
  }
  def f35(v0: s1): s1 = {
    var v6: s1 = v0
    val v1: s0 = v6.p1
    val v7: s1 = f38(v0)
    v6 = v6.copy(p1 = v1)
    var v3: s1 = v0
    val v5: s1 = f37(v6)
    val v10: Vector[s1] = Vector(v7)
    val v4: s1 = v10(0)
    var v11: s0 = v1
    val v9: Vector[Vector[Double]] = v1.p0
    val v25: s1 = v10(0)
    var v17: Vector[Vector[Double]] = v9
    var v13: Vector[Vector[Double]] = v9
    val v12: Vector[Vector[s0]] = v7.p0
    val v14: Vector[Vector[s0]] = v0.p0
    val v15: Vector[s0] = v14(1)
    v11 = v11.copy(p1 = v9)
    val v43: s0 = f45(v11)
    var v30: Vector[Vector[s0]] = v12
    var v16: s0 = v11
    var v20: Vector[Vector[s0]] = v30
    val v21: s0 = v15(0)
    val v38: s1 = f37(v6)
    val v49: Vector[s1] = Vector(v7, v4, v3, v0)
    val v37: s1 = f37(v4)
    v6 = v6.copy(p0 = v20)
    var v19: Vector[Vector[Double]] = v13
    var v22: Vector[s1] = v49
    val v35: s1 = v49(0)
    val v50: Vector[Vector[Double]] = v43.p1
    var v27: s0 = v21
    v3 = v0
    v22 = v49
    val v33: Vector[Vector[Double]] = v16.p0
    val v62: s1 = v22(3)
    v16 = v27
    val v47: Vector[s0] = f36(v38, v15)
    val v26: Vector[Vector[s0]] = f42(v20, v35)
    var v76: s1 = v25
    v27 = v27.copy(p1 = v19)
    v16 = v16.copy(p1 = v33)
    val v46: Vector[Double] = v50(0)
    val v52: Vector[s0] = f36(v6, v47)
    v22 = v22.updated(1, v0)
    v11 = v11.copy(p0 = v17)
    val v39: s1 = f37(v3)
    v16 = v11
    val v24: s1 = f38(v37)
    v22 = v22.updated(1, v76)
    val v34: s1 = v10(0)
    val v64: Vector[Vector[Double]] = v21.p1
    var v103: Vector[s0] = v52
    val v86: Vector[Vector[s0]] = f42(v30, v5)
    v20 = v20.updated(1, v103)
    val v87: Vector[Vector[s0]] = v34.p0
    val v121: s0 = v52(0)
    v17 = v17.updated(1, v46)
    var v63: Vector[Vector[Double]] = v9
    v3 = v3.copy(p0 = v86)
    v22 = v22.updated(0, v39)
    v3 = v3.copy(p1 = v16)
    val v56: s1 = f38(v24)
    v63 = v63.updated(0, v46)
    v30 = v20
    var v96: s1 = v62
    var v57: Vector[Vector[Double]] = v63
    val v232: Vector[s0] = v30(1)
    val v162: s0 = s0(v64, v19)
    v27 = v27.copy(p0 = v57)
    val v134: Vector[Vector[Double]] = v121.p0
    v20 = v87
    v30 = v30.updated(1, v232)
    v11 = v11.copy(p0 = v134)
    v3 = v3.copy(p0 = v26)
    v27 = v43
    val v202: s1 = f38(v96)
    val v280: Vector[Vector[s0]] = v56.p0
    v6 = v6.copy(p0 = v280)
    val v106: Vector[Vector[s0]] = f42(v87, v4)
    v3 = v3.copy(p0 = v106)
    v103 = v103.updated(0, v162)
    v76 = v24
    v202
  }
  def f34(v0: s0, v1: Vector[Vector[s0]]): s0 = {
    var v3: s0 = v0
    val v6: Vector[Vector[Double]] = v0.p0
    v3 = v3.copy(p1 = v6)
    val v5: Vector[Double] = v6(2)
    val v7: Vector[Double] = v6(2)
    var v9: Vector[Vector[Double]] = v6
    val v14: Vector[Vector[Double]] = v0.p0
    v3 = v3.copy(p1 = v9)
    var v10: s0 = v3
    val v18: s0 = f45(v3)
    val v12: Vector[Vector[Double]] = v18.p1
    v3 = v3.copy(p1 = v9)
    val v25: s1 = s1(v1, v10)
    val v30: Vector[Vector[Double]] = v0.p0
    v3 = v3.copy(p0 = v30)
    v9 = v9.updated(0, v5)
    v3 = v3.copy(p0 = v14)
    val v17: s0 = v25.p1
    val v23: Vector[Vector[Double]] = v17.p1
    var v54: Vector[Double] = v5
    val v28: s0 = v25.p1
    v9 = v9.updated(1, v54)
    val v50: Double = v7(0)
    var v31: s0 = v28
    v3 = v3.copy(p0 = v12)
    val v66: Vector[Double] = Vector(v50, v50, v50, v50, v50, v50)
    var v60: Vector[Double] = v66
    v31 = v31.copy(p1 = v23)
    var v149: Vector[Double] = v60
    val v83: s0 = f45(v31)
    val v155: Double = v149(5)
    val v140: Vector[Vector[Double]] = v10.p0
    val v198: s0 = f45(v83)
    v3 = v3.copy(p0 = v140)
    v54 = v54.updated(0, v155)
    v3 = v3.copy(p1 = v140)
    v198
  }
  def f29(v0: s1): s1 = {
    val v2: Vector[Vector[s0]] = v0.p0
    val v4: s0 = v0.p1
    val v7: s1 = s1(v2, v4)
    val v16: s1 = f37(v7)
    val v18: s1 = f37(v16)
    var v49: s1 = v18
    v49
  }
  @noinline
  def f0(v0: s1, v1: Double): Double = {
    var v5: s1 = v0
    val v7: s0 = v5.p1
    val v3: Vector[s0] = Vector(v7, v7, v7, v7, v7)
    val v4: s1 = f29(v0)
    var v14: s0 = v7
    var v11: Vector[s0] = v3
    val v6: Vector[Vector[s0]] = v0.p0
    v11 = v11.updated(2, v14)
    val v12: s0 = v11(1)
    val v13: s0 = v3(2)
    val v15: s0 = v11(1)
    val v20: s1 = f35(v0)
    val v30: s1 = f35(v4)
    val v10: Vector[s0] = v6(0)
    val v25: Vector[s0] = v6(1)
    val v39: s0 = v10(0)
    val v23: s1 = s1(v6, v12)
    val v32: Vector[Vector[Double]] = v13.p0
    val v43: Vector[Vector[s0]] = v30.p0
    val v46: Vector[Vector[s0]] = v20.p0
    val v72: Vector[Vector[Double]] = v7.p1
    var v31: Vector[s0] = v10
    val v16: Vector[s0] = Vector(v7, v15, v15, v14, v15, v13)
    val v40: Vector[Vector[Double]] = v13.p1
    val v35: s0 = v10(0)
    val v22: Vector[Double] = v40(1)
    val v28: s0 = v16(0)
    v11 = v11.updated(1, v13)
    val v34: Double = v22(0)
    val v27: s0 = f45(v28)
    var v44: Double = v34
    val v172: Vector[Vector[Double]] = v35.p0
    v11 = v11.updated(1, v28)
    var v60: Vector[Vector[s0]] = v46
    val v57: Vector[Vector[Double]] = v27.p0
    var v92: Vector[s0] = v31
    var v80: Vector[Vector[s0]] = v6
    v60 = v60.updated(1, v10)
    val v94: s0 = f34(v14, v60)
    val v151: Vector[s0] = v43(0)
    v14 = v35
    v14 = v14.copy(p1 = v57)
    v60 = v60.updated(0, v92)
    var v68: s0 = v13
    val v100: Vector[Vector[Double]] = v68.p0
    v80 = v80.updated(1, v151)
    v68 = v68.copy(p0 = v172)
    v80 = v80.updated(0, v25)
    v68 = v68.copy(p1 = v72)
    v31 = v31.updated(0, v39)
    v5 = v5.copy(p0 = v80)
    val v119: s1 = f29(v23)
    val v89: s0 = v3(4)
    val v168: s0 = v119.p1
    val v138: Vector[Vector[Double]] = v39.p1
    v68 = v68.copy(p1 = v138)
    v92 = v92.updated(0, v12)
    v92 = v92.updated(0, v89)
    v92 = v92.updated(0, v168)
    val v111: s0 = v5.p1
    v14 = v14.copy(p0 = v32)
    val v244: Vector[Vector[Double]] = v111.p0
    v14 = v14.copy(p0 = v100)
    v5 = v5.copy(p1 = v94)
    val v299: Double = v44 - v44
    v68 = v68.copy(p1 = v244)
    v11 = v11.updated(3, v15)
    v299
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0)))), Vector(s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0))))
    val v1: Double = 18.0
    val start = nanoTime()
    var result: Double = 18.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}