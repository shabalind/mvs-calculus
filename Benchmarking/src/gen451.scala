import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: Vector[s0]
  )
  def f47(v0: s0): s0 = {
    val v1: Vector[Vector[Double]] = v0.p0
    val v7: Vector[Double] = v1(1)
    val v3: Vector[Vector[Double]] = v0.p0
    val v4: Vector[Vector[Double]] = v0.p1
    val v2: Vector[Vector[Double]] = v0.p1
    val v18: Vector[Vector[Double]] = v0.p1
    val v9: s0 = s0(v1, v4)
    val v16: Vector[Vector[Double]] = v9.p1
    var v14: s0 = v9
    val v30: s0 = s0(v3, v4)
    v14 = v14.copy(p1 = v2)
    v14 = v14.copy(p0 = v3)
    val v35: Vector[Vector[Double]] = v9.p0
    v14 = v14.copy(p0 = v1)
    var v19: Vector[Vector[Double]] = v1
    val v69: Vector[Double] = v19(0)
    val v27: Vector[Vector[Double]] = v9.p0
    v14 = v14.copy(p1 = v18)
    v14 = v14.copy(p0 = v19)
    var v36: s0 = v30
    var v45: s0 = v30
    val v61: Vector[Vector[Double]] = v14.p1
    v14 = v14.copy(p0 = v27)
    val v49: s0 = s0(v1, v4)
    val v54: Vector[Vector[Double]] = v36.p1
    v14 = v14.copy(p1 = v54)
    v19 = v19.updated(2, v69)
    v14 = v14.copy(p1 = v2)
    v36 = v45
    val v60: Vector[Vector[Double]] = v14.p0
    v14 = v14.copy(p1 = v61)
    val v43: Vector[Vector[Double]] = v49.p1
    v19 = v19.updated(1, v7)
    val v82: Vector[Vector[Double]] = v36.p1
    v14 = v14.copy(p1 = v61)
    val v105: s0 = s0(v60, v16)
    v14 = v14.copy(p0 = v35)
    v45 = v45.copy(p0 = v35)
    v45 = v45.copy(p0 = v19)
    v36 = v36.copy(p1 = v16)
    v45 = v45.copy(p1 = v82)
    v14 = v14.copy(p1 = v43)
    v105
  }
  def f35(v0: Vector[s0], v1: s0): s0 = {
    val v5: s0 = v0(0)
    val v6: s0 = f47(v5)
    val v4: s0 = f47(v6)
    v4
  }
  def f27(v0: s0): s0 = {
    var v4: s0 = v0
    val v3: Vector[Vector[Double]] = v0.p0
    val v5: Vector[Double] = v3(0)
    val v7: s0 = f47(v4)
    var v6: Vector[Vector[Double]] = v3
    var v14: Vector[Vector[Double]] = v6
    v6 = v6.updated(0, v5)
    v4 = v4.copy(p0 = v14)
    val v12: Vector[Vector[Double]] = v4.p1
    v14 = v14.updated(1, v5)
    v4 = v4.copy(p1 = v12)
    val v10: Vector[Double] = v6(1)
    v6 = v6.updated(1, v10)
    val v20: Vector[Vector[Double]] = v7.p1
    v4 = v4.copy(p1 = v20)
    var v11: Vector[Vector[Double]] = v6
    var v23: Vector[Vector[Double]] = v20
    v4 = v4.copy(p1 = v12)
    var v47: Vector[Vector[Double]] = v23
    val v30: s0 = f47(v4)
    val v29: s0 = f47(v30)
    var v86: Vector[Vector[Double]] = v11
    v4 = v4.copy(p1 = v47)
    v4 = v4.copy(p1 = v20)
    var v21: Vector[Vector[Double]] = v86
    v4 = v4.copy(p0 = v21)
    val v28: s0 = f47(v29)
    v47 = v47.updated(0, v10)
    v4 = v4.copy(p1 = v12)
    v28
  }
  def f20(v0: s0): s0 = {
    val v7: Vector[Vector[Double]] = v0.p0
    var v3: s0 = v0
    var v1: s0 = v3
    val v2: s0 = f47(v1)
    v1 = v1.copy(p0 = v7)
    v1 = v1.copy(p0 = v7)
    v2
  }
  def f9(v0: s0): s0 = {
    val v5: s0 = f47(v0)
    val v2: Vector[Vector[Double]] = v5.p0
    val v1: Vector[Vector[Double]] = v0.p0
    var v6: Vector[Vector[Double]] = v2
    val v7: Vector[Double] = v6(2)
    v6 = v6.updated(0, v7)
    val v9: Double = v7(0)
    val v3: Vector[Vector[Double]] = v0.p1
    val v4: s0 = f47(v0)
    v6 = v6.updated(1, v7)
    var v12: Vector[Vector[Double]] = v1
    val v11: Vector[Vector[Double]] = v5.p0
    val v8: s0 = f27(v4)
    val v15: Vector[Vector[Double]] = v8.p0
    val v10: s0 = f20(v8)
    val v14: s0 = f47(v4)
    val v13: s0 = f20(v10)
    var v21: Vector[Double] = v7
    val v25: Vector[Vector[Double]] = v4.p0
    val v30: s0 = f20(v4)
    var v20: Vector[Vector[Double]] = v12
    val v23: Vector[Double] = v11(1)
    val v17: s0 = f27(v13)
    val v19: Vector[Double] = Vector(v9, v9, v9, v9, v9)
    val v29: Vector[Double] = v6(0)
    var v22: Vector[Vector[Double]] = v3
    v6 = v6.updated(0, v23)
    val v34: s0 = f47(v30)
    var v24: Vector[Double] = v19
    v20 = v25
    v20 = v20.updated(1, v23)
    var v60: Double = v9
    val v58: s0 = f20(v5)
    var v33: Vector[Double] = v19
    v21 = v21.updated(0, v9)
    val v28: Double = v19(2)
    var v48: Vector[Vector[Double]] = v3
    val v59: s0 = f20(v34)
    val v95: Vector[Double] = v15(2)
    val v73: Double = v60 * v60
    val v31: Vector[Vector[Double]] = v58.p0
    var v42: Vector[Vector[Double]] = v22
    var v26: Vector[Double] = v33
    v12 = v12.updated(2, v23)
    v33 = v33.updated(3, v28)
    v20 = v2
    val v61: Vector[Vector[Double]] = v14.p1
    v26 = v26.updated(0, v60)
    val v81: s0 = f27(v17)
    val v39: Vector[Double] = v3(0)
    val v55: Vector[Double] = v3(0)
    v48 = v48.updated(0, v7)
    v60 = v28
    v6 = v6.updated(2, v95)
    val v72: Vector[Double] = v20(0)
    v12 = v12.updated(2, v21)
    v21 = v21.updated(0, v28)
    val v98: Vector[Double] = v48(0)
    val v63: Double = v24(3)
    var v64: Vector[Vector[Double]] = v61
    val v38: Vector[Vector[Double]] = v30.p0
    var v41: Double = v63
    v48 = v48.updated(0, v55)
    val v66: Vector[Double] = v31(2)
    var v86: Vector[Vector[Double]] = v38
    v42 = v42.updated(0, v98)
    v64 = v64.updated(0, v66)
    var v108: Vector[Double] = v26
    v21 = v21.updated(0, v41)
    val v121: s0 = f20(v59)
    val v143: Vector[Vector[Double]] = v81.p1
    v48 = v143
    var v83: s0 = v121
    v83 = v83.copy(p0 = v31)
    v64 = v64.updated(0, v72)
    v83 = v83.copy(p1 = v42)
    v24 = v24.updated(1, v73)
    v83 = v83.copy(p0 = v20)
    v20 = v2
    val v196: Vector[Vector[Double]] = v8.p1
    v64 = v64.updated(0, v39)
    v83 = v83.copy(p1 = v196)
    v20 = v20.updated(2, v29)
    v83 = v83.copy(p0 = v86)
    v83 = v83.copy(p1 = v64)
    v24 = v108
    val v214: s0 = f27(v83)
    v214
  }
  def f1(v0: s0): s0 = {
    val v3: Vector[Vector[Double]] = v0.p0
    val v6: s0 = f47(v0)
    val v5: Vector[Vector[Double]] = v6.p1
    var v8: Vector[Vector[Double]] = v3
    val v51: s0 = s0(v8, v5)
    v51
  }
  @noinline
  def f0(v0: s1, v1: s1, v2: s0, v3: Double): Double = {
    val v6: Vector[Vector[s0]] = v1.p0
    var v4: s0 = v2
    val v8: Vector[Vector[Double]] = v4.p0
    val v16: s0 = f1(v2)
    val v9: Vector[Double] = v8(0)
    val v14: Vector[s0] = v6(0)
    val v29: Vector[Vector[Double]] = v16.p1
    val v18: s0 = f35(v14, v2)
    val v22: Vector[Vector[Double]] = v2.p1
    v4 = v4.copy(p1 = v29)
    val v35: Vector[Vector[Double]] = v2.p0
    val v30: Double = v9(0)
    val v59: s0 = f9(v4)
    v4 = v4.copy(p0 = v35)
    val v20: Vector[Vector[Double]] = v18.p0
    v4 = v4.copy(p0 = v20)
    v4 = v4.copy(p1 = v29)
    val v36: Vector[Double] = v22(0)
    val v46: Double = v36(0)
    v4 = v4.copy(p0 = v8)
    v4 = v4.copy(p0 = v35)
    val v70: Double = v3 - v30
    v4 = v59
    val v106: Double = v46 - v70
    v106
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0))))), Vector(s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0))), s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0)))))
    val v1: s1 = s1(Vector(Vector(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0))))), Vector(s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0))), s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0)))))
    val v2: s0 = s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0)))
    val v3: Double = 28.0
    val start = nanoTime()
    var result: Double = 28.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}