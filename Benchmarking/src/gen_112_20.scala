import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Double],
    p1: Double
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: s0
  )
  case class s2 (
    p0: Vector[s1],
    p1: s1
  )
  case class s5 (
    p0: s0,
    p1: s2
  )
  def f35(v0: s0, v1: s1): s0 = {
    var v8: s1 = v1
    var v7: s0 = v0
    val v3: s0 = v1.p1
    v8 = v8.copy(p1 = v7)
    v8 = v8.copy(p1 = v0)
    val v2: Vector[s1] = Vector(v1, v8, v1, v8, v1, v1)
    val v5: Vector[Vector[s0]] = v8.p0
    val v4: Vector[s0] = v5(1)
    val v6: Vector[s0] = v5(1)
    val v20: Vector[Double] = v7.p0
    val v14: Vector[Double] = v3.p0
    var v10: Vector[Vector[s0]] = v5
    v8 = v8.copy(p0 = v10)
    val v26: s1 = s1(v10, v7)
    v7 = v7.copy(p0 = v20)
    v7 = v7.copy(p0 = v14)
    v10 = v10.updated(1, v4)
    val v47: s0 = v26.p1
    v10 = v10.updated(1, v6)
    var v85: s0 = v47
    val v48: s1 = v2(2)
    val v46: s0 = v48.p1
    var v70: s0 = v46
    v10 = v10.updated(1, v6)
    v85 = v70
    v85
  }
  def f30(v0: s0): s0 = {
    var v4: s0 = v0
    val v2: Vector[Double] = v0.p0
    val v6: Vector[s0] = Vector(v4, v0, v4, v4)
    val v7: Vector[Double] = v0.p0
    val v1: s0 = v6(2)
    v4 = v4.copy(p0 = v7)
    v4 = v4.copy(p0 = v2)
    val v5: Double = v4.p1
    val v3: Vector[Double] = v4.p0
    v4 = v4.copy(p1 = v5)
    var v11: Vector[s0] = v6
    v11 = v11.updated(2, v1)
    val v8: Double = v2(1)
    var v10: Vector[s0] = v6
    var v9: s0 = v0
    val v12: Double = v0.p1
    val v16: s0 = v11(1)
    val v14: s0 = v11(2)
    val v23: Vector[Double] = v14.p0
    var v20: Vector[s0] = v6
    var v19: Vector[s0] = v10
    v20 = v20.updated(3, v0)
    val v18: Double = v23(1)
    v4 = v4.copy(p1 = v12)
    v19 = v19.updated(1, v16)
    v4 = v4.copy(p1 = v18)
    val v24: Double = v14.p1
    val v30: Vector[Double] = v1.p0
    var v27: Vector[Double] = v7
    val v34: Vector[Double] = v4.p0
    v20 = v20.updated(1, v0)
    val v66: Vector[Vector[s0]] = Vector(v19, v6, v19, v20)
    v4 = v4.copy(p0 = v34)
    val v38: Vector[s0] = v66(3)
    v9 = v9.copy(p1 = v5)
    val v54: Vector[s0] = v66(1)
    v9 = v9.copy(p1 = v24)
    var v39: s0 = v9
    v4 = v4.copy(p0 = v27)
    val v139: Vector[s0] = v66(1)
    val v59: Vector[Double] = v1.p0
    v4 = v4.copy(p1 = v24)
    v11 = v11.updated(1, v14)
    v20 = v20.updated(1, v4)
    v11 = v11.updated(2, v14)
    val v52: s0 = v54(3)
    v4 = v4.copy(p0 = v23)
    v20 = v20.updated(2, v39)
    v10 = v38
    v9 = v9.copy(p0 = v7)
    val v58: s0 = v139(1)
    v9 = v9.copy(p1 = v8)
    val v162: s0 = v54(0)
    v4 = v4.copy(p0 = v30)
    v20 = v20.updated(3, v1)
    v39 = v39.copy(p0 = v59)
    var v293: s0 = v162
    val v220: Double = v58.p1
    v9 = v9.copy(p0 = v3)
    v39 = v39.copy(p1 = v220)
    v11 = v11.updated(2, v52)
    v20 = v20.updated(0, v52)
    v293
  }
  def f26(v0: s2): s2 = {
    var v1: s2 = v0
    val v4: s1 = v0.p1
    v1 = v1.copy(p1 = v4)
    v1 = v1.copy(p1 = v4)
    var v5: s2 = v1
    var v2: s2 = v0
    v5 = v5.copy(p1 = v4)
    val v3: Vector[Vector[s0]] = v4.p0
    var v9: s2 = v0
    v1 = v1.copy(p1 = v4)
    val v10: s1 = v2.p1
    var v12: s1 = v4
    val v11: Vector[s0] = v3(0)
    v1 = v1.copy(p1 = v10)
    v5 = v5.copy(p1 = v10)
    val v22: s0 = v11(0)
    var v14: s2 = v5
    val v28: Vector[s1] = v9.p0
    v1 = v1.copy(p0 = v28)
    val v34: Vector[s2] = Vector(v2, v14, v9, v0, v2, v5)
    v12 = v12.copy(p1 = v22)
    v5 = v5.copy(p1 = v12)
    val v18: s1 = v2.p1
    var v36: Vector[s1] = v28
    var v40: s1 = v18
    v5 = v5.copy(p1 = v40)
    val v49: s2 = v34(4)
    val v39: Vector[s1] = v2.p0
    val v33: Vector[s1] = v49.p0
    var v69: Vector[s2] = v34
    v5 = v5.copy(p0 = v36)
    v14 = v14.copy(p0 = v39)
    val v86: s2 = v69(5)
    var v50: Vector[s1] = v33
    var v101: s2 = v86
    val v84: s1 = v28(0)
    val v52: Vector[Vector[s0]] = v10.p0
    v9 = v9.copy(p0 = v36)
    v5 = v5.copy(p1 = v84)
    v12 = v12.copy(p0 = v52)
    v14 = v14.copy(p0 = v50)
    v9 = v9.copy(p0 = v36)
    v14 = v14.copy(p0 = v36)
    v101
  }
  def f16(v0: s1): s1 = {
    val v2: Vector[Vector[s0]] = v0.p0
    val v8: Vector[Vector[s0]] = v0.p0
    var v3: Vector[Vector[s0]] = v2
    val v9: s0 = v0.p1
    val v7: s0 = f35(v9, v0)
    var v4: s1 = v0
    val v11: s0 = f30(v9)
    var v10: s0 = v9
    val v6: Double = v7.p1
    val v5: Double = v6 + v6
    val v1: s0 = v0.p1
    val v17: Vector[Double] = v11.p0
    var v12: Double = v5
    val v21: Vector[Vector[s0]] = v0.p0
    val v35: Double = v6 * v12
    val v19: s0 = s0(v17, v35)
    v10 = v10.copy(p1 = v35)
    v10 = v10.copy(p0 = v17)
    v12 = v5
    val v37: Vector[s0] = v2(1)
    val v15: Vector[s0] = v8(0)
    v3 = v3.updated(0, v15)
    val v48: Vector[s0] = v21(1)
    val v29: Vector[Vector[s0]] = v4.p0
    val v24: Double = v17(1)
    val v31: Vector[s0] = v3(1)
    val v60: Double = v17(0)
    val v52: s0 = f30(v9)
    val v54: s0 = v37(0)
    var v22: Vector[s0] = v37
    v3 = v8
    var v45: Double = v60
    val v65: Vector[Double] = v54.p0
    val v66: s0 = v22(0)
    val v46: Vector[s0] = v3(1)
    v3 = v3.updated(1, v22)
    val v121: s0 = f35(v1, v4)
    v4 = v4.copy(p0 = v29)
    var v71: Vector[s0] = v48
    val v51: Vector[Vector[s0]] = Vector(v46, v22, v31, v71, v31, v71)
    v4 = v4.copy(p0 = v8)
    val v74: s1 = s1(v21, v10)
    val v41: s0 = f35(v9, v74)
    val v59: Vector[s0] = v51(3)
    v10 = v10.copy(p0 = v65)
    val v80: s0 = f30(v52)
    v4 = v4.copy(p1 = v52)
    val v73: Vector[s1] = Vector(v0)
    v4 = v4.copy(p1 = v121)
    v4 = v4.copy(p1 = v19)
    v10 = v10.copy(p1 = v60)
    val v118: Vector[Double] = v19.p0
    var v95: s1 = v74
    v3 = v3.updated(1, v59)
    v71 = v71.updated(0, v11)
    val v120: s0 = f35(v41, v4)
    v71 = v71.updated(0, v120)
    v10 = v10.copy(p0 = v118)
    v4 = v4.copy(p0 = v2)
    v22 = v22.updated(0, v66)
    v45 = v60
    v95 = v95.copy(p0 = v3)
    v71 = v71.updated(0, v121)
    var v215: Vector[s1] = v73
    val v235: s1 = v215(0)
    var v150: s0 = v80
    v12 = v45
    v10 = v10.copy(p1 = v24)
    v95 = v95.copy(p1 = v120)
    v71 = v71.updated(0, v150)
    v215 = v215.updated(0, v95)
    v235
  }
  @noinline
  def f0(v0: Vector[s5], v1: Double): Double = {
    val v7: s5 = v0(0)
    val v5: Double = v1 * v1
    val v6: s0 = v7.p0
    val v14: s0 = f30(v6)
    val v3: s2 = v7.p1
    var v9: s2 = v3
    val v11: Vector[s1] = v3.p0
    var v10: s2 = v9
    v9 = v10
    val v25: s2 = f26(v3)
    val v59: s2 = f26(v10)
    v10 = v10.copy(p0 = v11)
    val v19: s1 = v59.p1
    val v23: Double = v14.p1
    v10 = v10.copy(p0 = v11)
    val v35: s0 = v19.p1
    val v62: s1 = v11(1)
    v10 = v59
    val v28: s1 = v11(2)
    val v31: Vector[Double] = v35.p0
    v9 = v9.copy(p1 = v62)
    v9 = v9.copy(p0 = v11)
    val v43: s1 = f16(v62)
    var v33: Vector[s1] = v11
    v33 = v33.updated(2, v43)
    v33 = v33.updated(1, v19)
    v33 = v33.updated(2, v28)
    v10 = v10.copy(p0 = v33)
    var v64: Vector[Double] = v31
    v64 = v64.updated(1, v5)
    v10 = v10.copy(p1 = v28)
    v33 = v33.updated(2, v28)
    v33 = v33.updated(2, v62)
    val v116: s1 = v25.p1
    val v274: Double = v64(0)
    v64 = v64.updated(1, v23)
    v33 = v33.updated(1, v116)
    v274
  }
  def benchmark(): Unit = {
    val v0: Vector[s5] = Vector(s5(s0(Vector(0.0, 1.0), 2.0), s2(Vector(s1(Vector(Vector(s0(Vector(3.0, 4.0), 5.0)), Vector(s0(Vector(6.0, 7.0), 8.0))), s0(Vector(9.0, 10.0), 11.0)), s1(Vector(Vector(s0(Vector(12.0, 13.0), 14.0)), Vector(s0(Vector(15.0, 16.0), 17.0))), s0(Vector(18.0, 19.0), 20.0)), s1(Vector(Vector(s0(Vector(21.0, 22.0), 23.0)), Vector(s0(Vector(24.0, 25.0), 26.0))), s0(Vector(27.0, 28.0), 29.0))), s1(Vector(Vector(s0(Vector(30.0, 31.0), 32.0)), Vector(s0(Vector(33.0, 34.0), 35.0))), s0(Vector(36.0, 37.0), 38.0)))))
    val v1: Double = 39.0
    val start = nanoTime()
    var result: Double = 39.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}