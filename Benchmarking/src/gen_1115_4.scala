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
    p1: Vector[s1],
    p2: s1,
    p3: s1,
    p4: s0,
    p5: Vector[s0]
  )
  case class s4 (
    p0: s2,
    p1: Vector[s0]
  )
  def f103(v0: s0): s0 = {
    v0
  }
  def f97(v0: s2): s2 = {
    var v2: s2 = v0
    val v4: Vector[s1] = v0.p1
    v2 = v2.copy(p1 = v4)
    var v8: Vector[s1] = v4
    var v3: s2 = v2
    val v7: Vector[Vector[s1]] = v2.p0
    var v9: Vector[s1] = v4
    val v5: s1 = v3.p3
    v2 = v2.copy(p0 = v7)
    val v6: s1 = v8(0)
    v2 = v2.copy(p1 = v9)
    var v10: s2 = v3
    v9 = v9.updated(0, v6)
    var v23: Vector[Vector[s1]] = v7
    v3 = v3.copy(p0 = v23)
    val v20: s1 = v8(0)
    var v11: Vector[Vector[s1]] = v23
    val v14: s0 = v5.p0
    var v25: Vector[Vector[s1]] = v11
    val v26: Vector[s1] = v23(0)
    v11 = v11.updated(0, v9)
    v3 = v3.copy(p3 = v5)
    val v28: s0 = v10.p4
    var v40: s0 = v14
    val v16: s1 = s1(v14, v40)
    v25 = v25.updated(0, v26)
    v9 = v9.updated(0, v6)
    val v32: Vector[s1] = v25(0)
    val v27: Vector[s0] = v3.p5
    v9 = v9.updated(0, v5)
    val v44: s2 = s2(v25, v8, v5, v16, v28, v27)
    v9 = v9.updated(0, v20)
    v23 = v23.updated(0, v4)
    v23 = v23.updated(0, v32)
    v44
  }
  def f89(v0: Vector[s1]): Vector[s1] = {
    var v5: Vector[s1] = v0
    val v3: Vector[Vector[s1]] = Vector(v5, v5, v5, v5, v0, v0, v5)
    var v8: Vector[Vector[s1]] = v3
    v8 = v8.updated(0, v5)
    var v6: Vector[Vector[s1]] = v8
    val v21: Vector[s1] = v6(5)
    v21
  }
  def f81(v0: s2): s2 = {
    val v2: s2 = f97(v0)
    val v3: s2 = f97(v0)
    val v10: s2 = f97(v0)
    val v17: s2 = f97(v0)
    val v21: Vector[s2] = Vector(v10, v10, v3, v2, v0, v2, v17)
    var v51: Vector[s2] = v21
    val v53: s2 = v51(5)
    val v66: s2 = f97(v53)
    v66
  }
  def f79(v0: s2, v1: s4): s2 = {
    var v2: s2 = v0
    val v3: s1 = v0.p3
    val v4: Vector[s2] = Vector(v0, v2)
    var v5: Vector[s2] = v4
    val v11: s0 = v3.p1
    var v7: Vector[s2] = v4
    v2 = v2.copy(p4 = v11)
    v7 = v7.updated(0, v2)
    val v8: s2 = v5(1)
    v7 = v7.updated(0, v0)
    var v27: s1 = v3
    v2 = v2.copy(p2 = v27)
    val v118: s2 = v7(0)
    v7 = v7.updated(0, v8)
    val v50: s2 = v4(1)
    v7 = v7.updated(1, v50)
    v118
  }
  def f77(v0: s1, v1: s2): s2 = {
    val v18: s2 = f97(v1)
    val v20: s2 = f97(v1)
    val v26: Vector[s0] = v20.p5
    var v47: s2 = v18
    v47 = v47.copy(p5 = v26)
    v47
  }
  def f76(v0: s0): s0 = {
    val v5: s0 = f103(v0)
    val v2: s0 = f103(v0)
    val v21: s0 = f103(v2)
    val v13: s0 = f103(v0)
    val v14: s0 = f103(v5)
    val v12: Vector[Vector[Double]] = v14.p0
    val v11: s0 = f103(v21)
    val v20: Vector[Vector[Double]] = v13.p0
    val v30: s1 = s1(v2, v2)
    val v41: s0 = v30.p0
    val v26: s0 = f103(v21)
    var v32: s0 = v41
    val v25: s0 = f103(v26)
    val v31: s0 = f103(v5)
    val v38: Vector[s1] = Vector(v30, v30, v30, v30, v30)
    val v19: s1 = v38(1)
    val v45: Vector[Vector[Double]] = v31.p1
    v32 = v32.copy(p1 = v45)
    var v61: Vector[Vector[Double]] = v45
    val v46: Vector[Vector[Vector[Double]]] = Vector(v61, v61, v61, v61, v45, v61, v45)
    v32 = v25
    val v48: s0 = v19.p0
    val v124: s0 = f103(v32)
    v32 = v32.copy(p0 = v12)
    v32 = v32.copy(p1 = v45)
    val v82: Vector[Vector[Double]] = v46(4)
    val v57: s0 = f103(v11)
    v32 = v32.copy(p1 = v82)
    var v100: s1 = v19
    v100 = v100.copy(p0 = v57)
    v100 = v100.copy(p1 = v124)
    v100 = v100.copy(p0 = v48)
    v32 = v32.copy(p0 = v20)
    val v151: s0 = v100.p1
    v151
  }
  def f74(v0: s4): s4 = {
    val v5: Vector[s0] = v0.p1
    val v3: s0 = v5(0)
    val v8: s0 = f103(v3)
    val v13: Vector[s0] = v0.p1
    var v23: Vector[s0] = v13
    val v40: s0 = f76(v8)
    v23 = v23.updated(1, v40)
    v23 = v23.updated(1, v8)
    val v126: s2 = v0.p0
    val v101: s4 = s4(v126, v23)
    v101
  }
  def f69(v0: Vector[s0]): Vector[s0] = {
    val v4: s0 = v0(0)
    val v5: s0 = v0(0)
    var v7: s0 = v4
    var v6: Vector[s0] = v0
    var v1: Vector[s0] = v6
    var v2: s0 = v7
    val v3: s0 = f76(v4)
    val v10: Vector[Vector[s0]] = Vector(v6, v6)
    v6 = v6.updated(1, v4)
    var v14: Vector[Vector[s0]] = v10
    val v21: Vector[Vector[Double]] = v5.p0
    val v11: s0 = v1(0)
    v6 = v6.updated(1, v2)
    v6 = v6.updated(0, v4)
    v14 = v14.updated(0, v6)
    v2 = v2.copy(p0 = v21)
    v7 = v7.copy(p0 = v21)
    val v16: Vector[s0] = v14(0)
    val v20: s0 = v16(0)
    val v27: s1 = s1(v3, v20)
    v14 = v14.updated(1, v1)
    v14 = v14.updated(0, v1)
    val v28: Vector[Vector[s0]] = Vector(v0, v1, v16, v6, v0, v6)
    val v26: s0 = v27.p0
    val v22: s0 = f103(v11)
    v6 = v6.updated(1, v22)
    val v41: Vector[Vector[Double]] = v20.p1
    val v46: s0 = f103(v26)
    val v55: Vector[Vector[Double]] = v46.p1
    val v121: Vector[s0] = v28(0)
    v2 = v2.copy(p1 = v41)
    v2 = v2.copy(p1 = v55)
    v121
  }
  def f65(v0: s2, v1: s0): s2 = {
    val v4: s2 = f97(v0)
    var v2: s2 = v0
    val v6: Vector[Vector[s1]] = v0.p0
    v2 = v2.copy(p4 = v1)
    var v13: Vector[Vector[s1]] = v6
    val v5: Vector[s1] = v13(0)
    val v7: Vector[Vector[s1]] = v4.p0
    val v17: s1 = v5(0)
    v2 = v2.copy(p1 = v5)
    val v8: s1 = v5(0)
    val v11: s2 = f97(v2)
    val v10: s1 = v5(0)
    v2 = v2.copy(p2 = v8)
    v13 = v6
    val v9: Vector[s1] = v6(0)
    val v15: s1 = v9(0)
    val v18: Vector[Vector[Vector[s1]]] = Vector(v6, v7, v13, v7)
    val v14: Vector[s1] = f89(v5)
    var v35: Vector[Vector[Vector[s1]]] = v18
    var v43: Vector[Vector[Vector[s1]]] = v35
    val v26: Vector[Vector[s1]] = v43(1)
    v13 = v13.updated(0, v5)
    val v82: s2 = f77(v17, v11)
    var v38: Vector[Vector[Vector[s1]]] = v43
    v2 = v2.copy(p0 = v26)
    v2 = v4
    v35 = v35.updated(0, v26)
    v35 = v38
    val v44: s2 = f77(v17, v82)
    v2 = v2.copy(p1 = v14)
    v43 = v43.updated(3, v13)
    v35 = v35.updated(2, v13)
    val v54: Vector[s1] = Vector(v15, v15, v8, v10)
    v35 = v35.updated(0, v7)
    val v71: s1 = v54(1)
    val v97: s0 = v71.p0
    v2 = v2.copy(p4 = v97)
    val v157: s2 = f97(v44)
    v157
  }
  def f57(v0: s4): s4 = {
    var v6: s4 = v0
    val v1: s4 = f74(v0)
    val v11: Vector[s0] = v0.p1
    val v5: s0 = v11(1)
    val v2: s2 = v1.p0
    var v10: Vector[s0] = v11
    val v3: Vector[s0] = f69(v10)
    var v4: s2 = v2
    val v8: s0 = v3(0)
    var v7: Vector[s0] = v3
    v10 = v11
    val v16: s1 = s1(v5, v5)
    v4 = v4.copy(p3 = v16)
    var v13: Vector[s0] = v10
    val v14: Vector[s0] = v4.p5
    v6 = v6.copy(p1 = v11)
    v7 = v7.updated(1, v8)
    v10 = v10.updated(1, v8)
    v6 = v0
    v7 = v14
    var v35: s4 = v1
    val v24: s0 = v13(1)
    v35 = v35.copy(p1 = v3)
    v6 = v0
    var v22: Vector[s0] = v3
    val v25: s2 = f79(v4, v35)
    val v26: s0 = v16.p0
    v6 = v6.copy(p0 = v25)
    v35 = v35.copy(p0 = v25)
    val v27: Vector[s0] = f69(v11)
    v10 = v10.updated(1, v26)
    v35 = v35.copy(p1 = v3)
    var v19: Vector[s0] = v11
    v4 = v4.copy(p5 = v19)
    val v50: s0 = v27(1)
    val v45: s0 = v7(1)
    val v78: Vector[s4] = Vector(v6, v0, v1, v35, v1)
    val v42: s0 = v22(0)
    val v68: s1 = s1(v45, v24)
    v7 = v7.updated(0, v8)
    v4 = v4.copy(p3 = v68)
    val v124: s4 = v78(3)
    v6 = v6.copy(p1 = v11)
    val v72: s2 = f65(v4, v42)
    v19 = v19.updated(0, v45)
    v7 = v7.updated(0, v8)
    var v167: s4 = v124
    val v129: s2 = v35.p0
    v6 = v6.copy(p0 = v72)
    v167 = v167.copy(p0 = v129)
    v4 = v4.copy(p4 = v50)
    v167
  }
  def f45(v0: s0): s0 = {
    var v7: s0 = v0
    var v2: s0 = v7
    val v1: s0 = f76(v2)
    var v4: s0 = v1
    val v9: Vector[Vector[Double]] = v4.p0
    val v3: Vector[Vector[Double]] = v0.p1
    v2 = v2.copy(p0 = v9)
    var v15: Vector[Vector[Double]] = v9
    v4 = v4.copy(p1 = v3)
    v2 = v2.copy(p0 = v15)
    val v13: s0 = s0(v15, v3)
    val v17: s0 = f76(v13)
    v4 = v4.copy(p0 = v9)
    v2 = v2.copy(p1 = v3)
    val v42: Vector[Double] = v9(0)
    v15 = v15.updated(0, v42)
    v4 = v4.copy(p1 = v3)
    val v20: Vector[Double] = v9(0)
    val v33: Vector[Double] = v9(0)
    v15 = v15.updated(0, v20)
    val v73: s0 = f103(v17)
    v15 = v15.updated(0, v33)
    v4 = v4.copy(p0 = v15)
    v73
  }
  def f40(v0: s0, v1: s2): s2 = {
    val v2: s0 = f45(v0)
    val v6: s0 = f103(v2)
    val v9: s2 = f65(v1, v6)
    val v8: Vector[s0] = v9.p5
    val v12: Vector[s0] = v9.p5
    val v3: s0 = v8(0)
    var v10: s2 = v1
    val v17: s0 = v8(1)
    val v19: Vector[s1] = v9.p1
    val v15: s0 = v12(0)
    var v20: Vector[s1] = v19
    val v13: Vector[s0] = f69(v12)
    v10 = v10.copy(p1 = v20)
    var v29: s2 = v1
    v29 = v10
    val v47: s1 = v29.p3
    val v48: Vector[s1] = f89(v19)
    val v123: s1 = v20(0)
    val v49: s2 = f65(v9, v17)
    var v83: Vector[s1] = v48
    val v84: Vector[s0] = f69(v13)
    v29 = v49
    v10 = v10.copy(p2 = v47)
    val v67: s2 = f97(v29)
    val v57: Vector[s1] = v67.p1
    var v115: s2 = v49
    val v295: Vector[Vector[s1]] = v9.p0
    v29 = v29.copy(p1 = v57)
    v83 = v83.updated(0, v47)
    var v134: s1 = v123
    v83 = v83.updated(0, v47)
    val v151: s0 = v9.p4
    var v99: Vector[Vector[s1]] = v295
    v10 = v10.copy(p1 = v83)
    val v85: s1 = v115.p2
    var v64: s1 = v85
    val v178: s4 = s4(v115, v13)
    val v314: s2 = s2(v99, v57, v64, v134, v151, v84)
    v29 = v29.copy(p1 = v48)
    v29 = v29.copy(p4 = v15)
    val v131: s2 = f65(v29, v3)
    v64 = v64.copy(p1 = v151)
    v29 = v29.copy(p1 = v83)
    val v180: s1 = v314.p3
    val v210: s2 = f79(v131, v178)
    v10 = v10.copy(p3 = v180)
    v210
  }
  def f22(v0: s2, v1: s0, v2: s2): s0 = {
    val v7: Vector[Vector[Double]] = v1.p0
    var v9: s2 = v2
    v9 = v9.copy(p4 = v1)
    val v5: s0 = f103(v1)
    val v3: s2 = f40(v1, v0)
    v9 = v9.copy(p4 = v5)
    val v12: s0 = f76(v1)
    val v16: Vector[s0] = v9.p5
    val v18: s2 = f65(v3, v12)
    val v34: s4 = s4(v2, v16)
    val v24: s1 = v18.p2
    val v27: s0 = v24.p1
    val v40: s2 = v34.p0
    var v38: s1 = v24
    val v21: s0 = v38.p0
    var v37: s1 = v24
    var v23: s0 = v27
    val v56: s4 = f57(v34)
    val v47: s2 = f65(v2, v21)
    v38 = v38.copy(p1 = v5)
    val v68: s2 = f79(v0, v56)
    val v35: s0 = v2.p4
    val v94: s2 = v34.p0
    val v107: Vector[s2] = Vector(v0, v40, v94, v68)
    v37 = v37.copy(p0 = v23)
    val v103: s2 = f40(v21, v47)
    val v81: s2 = v107(0)
    var v42: s0 = v35
    v37 = v37.copy(p1 = v1)
    v23 = v23.copy(p0 = v7)
    val v99: s1 = v103.p3
    val v89: Vector[s0] = v81.p5
    var v146: s0 = v35
    val v98: s0 = v99.p0
    val v160: s0 = v89(1)
    v38 = v38.copy(p0 = v42)
    v9 = v9.copy(p3 = v37)
    v37 = v37.copy(p0 = v146)
    v37 = v37.copy(p0 = v98)
    val v221: s0 = f103(v160)
    v23 = v23.copy(p0 = v7)
    v221
  }
  @noinline
  def f0(v0: Vector[s4], v1: Double): Double = {
    val v2: s4 = v0(0)
    val v5: Vector[s0] = v2.p1
    var v11: Vector[s4] = v0
    val v3: s0 = v5(1)
    v11 = v11.updated(0, v2)
    val v9: s0 = f103(v3)
    val v12: s4 = v11(0)
    var v22: s0 = v9
    val v20: Vector[s0] = f69(v5)
    val v51: Vector[Vector[Double]] = v22.p0
    val v65: s2 = v12.p0
    val v47: s2 = f81(v65)
    var v23: Vector[Vector[Double]] = v51
    val v37: s0 = f76(v9)
    var v40: s0 = v37
    val v26: s0 = v20(0)
    v22 = v22.copy(p0 = v23)
    val v64: s0 = f22(v65, v26, v47)
    v22 = v40
    val v252: Vector[Double] = v23(0)
    val v52: Vector[Vector[Double]] = v64.p1
    v22 = v22.copy(p0 = v23)
    val v155: Double = v252(0)
    v40 = v40.copy(p1 = v52)
    v155
  }
  def benchmark(): Unit = {
    val v0: Vector[s4] = Vector(s4(s2(Vector(Vector(s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0)))))), Vector(s1(s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0))))), s1(s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0))), s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0)))), s1(s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0))), s0(Vector(Vector(28.0)), Vector(Vector(29.0), Vector(30.0), Vector(31.0)))), s0(Vector(Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0))), Vector(s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0))), s0(Vector(Vector(40.0)), Vector(Vector(41.0), Vector(42.0), Vector(43.0))))), Vector(s0(Vector(Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0))), s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0), Vector(51.0))))))
    val v1: Double = 52.0
    val start = nanoTime()
    var result: Double = 52.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}