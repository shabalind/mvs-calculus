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
    p0: Vector[s0],
    p1: s0
  )
  case class s3 (
    p0: s0
  )
  def f40(v0: s1): s1 = {
    var v1: s1 = v0
    val v2: s0 = v0.p0
    var v4: s1 = v1
    val v8: s0 = v0.p0
    v4 = v4.copy(p1 = v8)
    v1 = v4
    v4 = v4.copy(p1 = v8)
    v4 = v4.copy(p1 = v2)
    val v6: s0 = v4.p0
    var v3: s0 = v8
    val v5: Vector[Vector[Double]] = v2.p0
    val v7: s0 = v1.p1
    v3 = v3.copy(p0 = v5)
    val v9: s0 = v4.p1
    val v14: Vector[s0] = Vector(v7)
    val v38: s0 = v0.p0
    v4 = v4.copy(p1 = v6)
    var v21: s1 = v1
    val v20: Vector[s0] = Vector(v6, v38, v3, v2, v3, v38, v6)
    var v17: s1 = v21
    val v24: s0 = v4.p0
    var v59: Vector[s0] = v14
    var v42: Vector[s0] = v20
    v4 = v4.copy(p0 = v38)
    v59 = v59.updated(0, v9)
    val v58: s0 = v20(6)
    val v48: s0 = v1.p1
    var v68: s0 = v24
    var v43: Vector[s0] = v14
    val v32: s0 = v17.p0
    val v149: s0 = v59(0)
    val v57: s0 = v43(0)
    val v85: s0 = v0.p1
    v43 = v43.updated(0, v6)
    v59 = v59.updated(0, v68)
    v17 = v17.copy(p1 = v8)
    v43 = v43.updated(0, v149)
    v17 = v17.copy(p1 = v57)
    val v65: s0 = v42(3)
    v17 = v17.copy(p1 = v85)
    val v91: s0 = v59(0)
    v1 = v1.copy(p1 = v24)
    var v103: s1 = v1
    val v214: s0 = v103.p1
    v17 = v17.copy(p0 = v48)
    val v140: Vector[Vector[Double]] = v65.p1
    var v97: s0 = v91
    v3 = v3.copy(p1 = v140)
    v103 = v103.copy(p1 = v9)
    val v166: Vector[Vector[Double]] = v149.p1
    v17 = v17.copy(p1 = v214)
    val v74: Vector[Vector[Double]] = v2.p1
    v43 = v43.updated(0, v58)
    v1 = v1.copy(p0 = v32)
    v97 = v97.copy(p1 = v166)
    v42 = v42.updated(3, v97)
    v97 = v97.copy(p1 = v74)
    v103 = v103.copy(p0 = v24)
    v103
  }
  def f34(v0: s0): s0 = {
    v0
  }
  def f33(v0: s1, v1: s3): s3 = {
    val v2: s0 = v1.p0
    var v7: s0 = v2
    val v4: Vector[Vector[Double]] = v7.p1
    val v6: Vector[Vector[Double]] = v7.p1
    val v8: s0 = f34(v2)
    val v3: s1 = f40(v0)
    v7 = v2
    val v10: s0 = f34(v8)
    v7 = v7.copy(p1 = v4)
    v7 = v8
    val v16: s0 = f34(v10)
    v7 = v7.copy(p1 = v4)
    val v11: s0 = v1.p0
    var v21: s3 = v1
    val v34: Vector[Vector[Double]] = v11.p0
    val v28: s1 = f40(v3)
    val v31: Vector[Vector[Double]] = v7.p0
    val v30: s0 = s0(v34, v6)
    v21 = v21.copy(p0 = v30)
    val v37: s0 = f34(v30)
    v7 = v7.copy(p0 = v31)
    v21 = v1
    v21 = v21.copy(p0 = v8)
    val v116: s0 = f34(v16)
    v21 = v21.copy(p0 = v116)
    val v57: s0 = v28.p0
    v21 = v21.copy(p0 = v57)
    v21 = v21.copy(p0 = v37)
    v21
  }
  def f31(v0: s1): s1 = {
    val v4: s1 = f40(v0)
    val v3: s1 = f40(v0)
    var v6: s1 = v4
    val v5: s1 = f40(v0)
    val v1: s0 = v6.p0
    var v7: s0 = v1
    val v2: s1 = f40(v0)
    val v8: s0 = v3.p0
    var v11: s0 = v7
    val v10: Vector[Vector[Double]] = v8.p1
    val v17: s0 = f34(v7)
    var v12: Vector[Vector[Double]] = v10
    var v13: s1 = v5
    v13 = v13.copy(p0 = v17)
    val v20: s0 = f34(v17)
    val v18: Vector[Vector[Double]] = v17.p0
    val v38: s1 = f40(v2)
    val v24: Vector[Double] = v18(1)
    val v19: s0 = v3.p0
    v13 = v5
    val v28: Vector[Vector[Vector[Double]]] = Vector(v18)
    v13 = v13.copy(p1 = v20)
    v12 = v12.updated(0, v24)
    v12 = v12.updated(0, v24)
    val v23: Vector[Vector[Double]] = v28(0)
    val v27: Vector[Double] = v23(1)
    val v67: s0 = v38.p0
    v11 = v11.copy(p0 = v23)
    v13 = v13.copy(p0 = v11)
    v12 = v12.updated(0, v27)
    v13 = v13.copy(p1 = v67)
    v12 = v12.updated(0, v27)
    val v77: Vector[Vector[Double]] = v19.p1
    v11 = v67
    v7 = v7.copy(p1 = v77)
    v11 = v11.copy(p1 = v12)
    v13
  }
  def f13(v0: s2): s2 = {
    var v3: s2 = v0
    var v8: s2 = v3
    var v7: s2 = v3
    v7 = v8
    val v10: s0 = v0.p1
    v8 = v8.copy(p1 = v10)
    v7 = v7.copy(p1 = v10)
    var v14: s2 = v7
    v14
  }
  def f9(v0: s0, v1: Vector[s0]): s0 = {
    val v2: s0 = f34(v0)
    val v19: Vector[Vector[Double]] = v0.p0
    val v4: s0 = f34(v2)
    val v12: s0 = f34(v4)
    val v11: Vector[Double] = v19(1)
    val v22: s0 = f34(v12)
    val v23: s0 = f34(v12)
    val v25: s0 = f34(v0)
    val v30: s2 = s2(v1, v2)
    val v17: s0 = v1(0)
    var v34: Vector[s0] = v1
    v34 = v34.updated(0, v25)
    v34 = v34.updated(0, v0)
    val v39: Vector[Vector[Double]] = v22.p0
    v34 = v34.updated(0, v25)
    v34 = v34.updated(0, v0)
    var v27: s0 = v23
    val v42: s2 = f13(v30)
    val v24: s2 = f13(v42)
    v34 = v34.updated(0, v12)
    v27 = v27.copy(p0 = v39)
    val v61: s0 = v42.p1
    var v67: s2 = v42
    val v46: s0 = v67.p1
    val v58: s2 = f13(v24)
    val v52: Vector[Vector[Double]] = Vector(v11)
    val v95: Vector[s0] = Vector(v4, v22, v12, v27, v4, v17)
    var v55: Vector[s0] = v95
    v67 = v67.copy(p0 = v34)
    v34 = v34.updated(0, v17)
    v67 = v67.copy(p1 = v23)
    v55 = v55.updated(0, v0)
    var v128: Vector[s0] = v34
    var v56: Vector[s0] = v128
    var v72: Vector[s0] = v56
    val v155: s0 = f34(v46)
    v56 = v56.updated(0, v61)
    v128 = v128.updated(0, v4)
    var v106: s2 = v58
    v34 = v34.updated(0, v22)
    val v107: s0 = v106.p1
    v27 = v27.copy(p1 = v52)
    val v77: s0 = v55(3)
    v56 = v56.updated(0, v4)
    v55 = v55.updated(3, v46)
    v106 = v106.copy(p1 = v17)
    v106 = v106.copy(p0 = v72)
    v67 = v67.copy(p1 = v77)
    val v219: s0 = f34(v107)
    v106 = v106.copy(p0 = v72)
    v128 = v128.updated(0, v27)
    v34 = v34.updated(0, v155)
    v219
  }
  def f6(v0: s3, v1: s3): s3 = {
    val v7: s0 = v0.p0
    var v4: s0 = v7
    val v2: s0 = f34(v7)
    val v9: s0 = f34(v4)
    val v13: s0 = v0.p0
    val v8: Vector[Vector[Double]] = v2.p0
    val v19: Vector[Vector[Double]] = v7.p1
    var v12: s0 = v9
    var v14: s0 = v12
    var v20: Vector[Vector[Double]] = v8
    v12 = v12.copy(p1 = v19)
    var v29: s3 = v1
    val v30: Vector[Double] = v19(0)
    val v33: Vector[Vector[Vector[Double]]] = Vector(v8, v20, v20, v20, v20, v20, v8)
    val v34: Vector[Vector[Double]] = v14.p0
    v12 = v12.copy(p0 = v8)
    var v17: Vector[Double] = v30
    val v38: Vector[Vector[Double]] = v33(3)
    val v32: Vector[Vector[Double]] = v2.p1
    val v41: Vector[Double] = v8(0)
    var v45: Vector[Vector[Double]] = v20
    v12 = v12.copy(p0 = v38)
    v20 = v20.updated(1, v17)
    v29 = v29.copy(p0 = v14)
    val v59: Vector[Double] = v20(0)
    v4 = v4.copy(p0 = v34)
    v20 = v20.updated(0, v59)
    val v67: Vector[Double] = v32(0)
    v14 = v14.copy(p0 = v45)
    v29 = v29.copy(p0 = v13)
    v45 = v45.updated(1, v67)
    v20 = v20.updated(0, v41)
    val v154: s1 = s1(v13, v7)
    v12 = v12.copy(p0 = v20)
    val v118: s3 = f33(v154, v29)
    val v64: s1 = f31(v154)
    var v219: s1 = v64
    val v222: s3 = f33(v219, v118)
    v222
  }
  def f2(v0: s0): s0 = {
    val v6: Vector[s0] = Vector(v0)
    var v1: s0 = v0
    val v8: s0 = f34(v1)
    var v2: s0 = v0
    val v3: s0 = v6(0)
    var v5: s0 = v0
    val v7: s0 = v6(0)
    var v4: Vector[s0] = v6
    val v9: s0 = f34(v5)
    val v14: s0 = v4(0)
    v4 = v4.updated(0, v7)
    var v10: s0 = v0
    val v21: Vector[Vector[Double]] = v8.p0
    var v23: Vector[s0] = v6
    val v52: s0 = f9(v5, v23)
    val v30: Vector[Vector[Double]] = v3.p0
    v23 = v23.updated(0, v2)
    val v22: Vector[Vector[Double]] = v14.p1
    val v39: Vector[Vector[Double]] = v52.p1
    val v49: s0 = f34(v9)
    val v29: s0 = v4(0)
    val v134: s0 = f34(v29)
    val v47: Vector[Vector[Double]] = v29.p0
    val v33: s3 = s3(v0)
    val v73: s3 = f6(v33, v33)
    v1 = v1.copy(p1 = v39)
    var v100: s3 = v33
    val v62: s3 = s3(v10)
    var v86: s3 = v33
    v100 = v62
    val v105: s1 = s1(v49, v134)
    v2 = v2.copy(p1 = v22)
    v10 = v10.copy(p0 = v30)
    val v88: s3 = f33(v105, v100)
    var v64: s3 = v86
    val v77: s1 = f31(v105)
    v10 = v10.copy(p0 = v47)
    var v106: Vector[Vector[Double]] = v21
    val v180: s3 = f33(v77, v73)
    val v115: s0 = v77.p0
    val v258: s3 = f6(v64, v88)
    v64 = v64.copy(p0 = v115)
    v10 = v10.copy(p0 = v106)
    var v211: s3 = v180
    v100 = v100.copy(p0 = v10)
    val v179: s3 = f6(v211, v258)
    val v214: s0 = v179.p0
    v214
  }
  @noinline
  def f0(v0: s3, v1: Double): Double = {
    val v3: s0 = v0.p0
    val v26: s0 = f2(v3)
    val v34: Vector[Vector[Double]] = v26.p0
    val v16: Vector[Double] = v34(0)
    val v20: Double = v16(0)
    v20
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))))
    val v1: Double = 3.0
    val start = nanoTime()
    var result: Double = 3.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}