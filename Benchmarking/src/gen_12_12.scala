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
  def f88(v0: s0): s0 = {
    val v4: Vector[s0] = Vector(v0, v0, v0)
    val v2: s0 = v4(1)
    val v5: s0 = v4(2)
    val v9: Vector[Vector[Double]] = v5.p0
    val v1: Vector[Double] = v9(1)
    val v3: Vector[Vector[Double]] = v5.p0
    var v6: s0 = v5
    var v7: Vector[s0] = v4
    val v17: Vector[Vector[Double]] = v0.p0
    var v22: Vector[Vector[Double]] = v17
    var v21: s0 = v6
    val v12: s0 = v4(0)
    val v11: Vector[Double] = v9(1)
    val v24: Vector[Vector[Double]] = v2.p1
    val v14: Vector[Vector[Double]] = v5.p0
    val v23: Vector[Vector[Double]] = v21.p0
    v6 = v6.copy(p1 = v24)
    var v50: Vector[Double] = v1
    v21 = v21.copy(p0 = v22)
    val v35: Vector[Vector[Double]] = v12.p1
    val v33: Vector[Vector[Double]] = v12.p1
    v6 = v6.copy(p1 = v24)
    v6 = v6.copy(p0 = v14)
    v21 = v21.copy(p1 = v35)
    var v47: Vector[Vector[Double]] = v24
    var v45: Vector[s0] = v7
    var v32: Vector[Vector[Double]] = v33
    v7 = v7.updated(0, v6)
    val v72: s0 = v45(0)
    val v48: Vector[Double] = v23(0)
    v32 = v33
    val v42: s1 = s1(v2, v21)
    var v62: s1 = v42
    v21 = v21.copy(p0 = v3)
    v22 = v22.updated(0, v50)
    var v77: Vector[Vector[Double]] = v47
    val v36: Double = v48(0)
    var v70: Vector[Double] = v50
    v32 = v32.updated(0, v11)
    val v85: s0 = v62.p0
    v22 = v22.updated(0, v70)
    var v73: Double = v36
    var v54: Vector[Vector[Double]] = v77
    v21 = v21.copy(p1 = v32)
    v70 = v70.updated(0, v73)
    v6 = v6.copy(p1 = v24)
    v32 = v32.updated(0, v11)
    v47 = v54
    v62 = v62.copy(p1 = v85)
    v62 = v62.copy(p0 = v6)
    val v80: s0 = v62.p1
    v6 = v6.copy(p1 = v47)
    v62 = v62.copy(p0 = v21)
    v62 = v62.copy(p1 = v0)
    v62 = v62.copy(p1 = v72)
    v80
  }
  def f74(v0: s0): s0 = {
    var v6: s0 = v0
    val v4: s0 = f88(v0)
    var v1: s0 = v6
    var v8: s0 = v6
    val v11: s0 = f88(v8)
    val v3: Vector[Vector[Double]] = v4.p0
    var v12: s0 = v1
    val v5: s0 = f88(v4)
    val v9: s0 = f88(v5)
    v12 = v12.copy(p0 = v3)
    var v10: s0 = v11
    var v18: Vector[Vector[Double]] = v3
    val v21: Vector[Double] = v3(0)
    val v30: Vector[Vector[Double]] = v10.p0
    val v14: Vector[Vector[Double]] = v1.p0
    v6 = v6.copy(p0 = v3)
    v18 = v18.updated(1, v21)
    val v24: Vector[Vector[Double]] = v9.p1
    val v15: Vector[Double] = v24(1)
    val v13: s0 = f88(v10)
    val v23: s0 = f88(v12)
    v18 = v18.updated(1, v15)
    v6 = v13
    val v42: Vector[Vector[Double]] = v6.p1
    val v25: Vector[Double] = v42(1)
    val v16: Vector[Double] = v24(0)
    var v20: Vector[Vector[Double]] = v24
    val v29: Vector[Double] = v30(1)
    var v44: Vector[Vector[Double]] = v18
    v18 = v18.updated(0, v29)
    v8 = v8.copy(p1 = v20)
    v44 = v44.updated(1, v16)
    v12 = v12.copy(p0 = v14)
    var v37: Vector[Vector[Double]] = v24
    var v102: Vector[Vector[Double]] = v44
    v8 = v8.copy(p1 = v20)
    val v38: Vector[Vector[Double]] = v0.p1
    v18 = v18.updated(0, v15)
    v6 = v6.copy(p0 = v102)
    val v87: s0 = f88(v23)
    v102 = v102.updated(1, v15)
    var v45: s0 = v87
    v12 = v12.copy(p1 = v38)
    v12 = v12.copy(p1 = v37)
    v8 = v8.copy(p0 = v18)
    v20 = v20.updated(0, v25)
    v45 = v45.copy(p0 = v18)
    v45
  }
  def f45(v0: Double): Double = {
    var v5: Double = v0
    var v3: Double = v5
    var v2: Double = v5
    var v1: Double = v2
    var v4: Double = v0
    v5 = v1
    var v7: Double = v5
    var v18: Double = v5
    var v9: Double = v18
    var v8: Double = v7
    var v10: Double = v8
    var v13: Double = v4
    var v19: Double = v10
    var v11: Double = v2
    v9 = v1
    val v23: Double = v9 / v5
    var v15: Double = v18
    var v16: Double = v7
    v3 = v16
    v1 = v3
    var v46: Double = v15
    var v36: Double = v19
    val v21: Vector[Double] = Vector(v1, v36, v0)
    val v35: Double = v21(0)
    var v48: Vector[Double] = v21
    val v30: Double = v48(2)
    v48 = v48.updated(1, v4)
    var v51: Double = v3
    val v52: Vector[Double] = Vector(v51, v4, v2, v2, v23, v11)
    val v74: Vector[Vector[Double]] = Vector(v52, v52, v52, v52)
    var v71: Vector[Vector[Double]] = v74
    v48 = v48.updated(2, v8)
    val v84: Vector[Double] = v71(0)
    val v79: Vector[Double] = v71(2)
    v36 = v35
    var v83: Vector[Double] = v84
    var v55: Double = v13
    var v64: Vector[Double] = v79
    v71 = v71.updated(1, v64)
    v4 = v55
    val v95: Double = v83(3)
    v71 = v71.updated(0, v52)
    v64 = v64.updated(3, v46)
    v64 = v64.updated(4, v30)
    v95
  }
  @noinline
  def f0(v0: Vector[s0], v1: Double): Double = {
    val v3: s0 = v0(0)
    val v6: Vector[Vector[Double]] = v3.p1
    val v5: Double = f45(v1)
    var v4: s0 = v3
    val v2: s0 = f88(v4)
    var v8: Double = v1
    val v7: s0 = v0(0)
    val v12: Vector[Vector[Double]] = v2.p1
    var v9: Double = v1
    val v14: Vector[Vector[Double]] = v7.p1
    v4 = v4.copy(p1 = v6)
    v4 = v4.copy(p1 = v14)
    val v13: s0 = v0(1)
    v4 = v4.copy(p1 = v12)
    var v22: s0 = v13
    val v45: Vector[Double] = v6(2)
    val v24: Vector[Vector[Double]] = v22.p0
    val v29: Vector[Double] = v24(1)
    val v26: s0 = f74(v3)
    val v33: Vector[Vector[Double]] = v3.p1
    v22 = v22.copy(p1 = v12)
    val v16: Double = v29(0)
    val v34: Double = v45(0)
    val v49: Double = v34 + v8
    val v56: Vector[Vector[Double]] = v26.p0
    val v38: Vector[Vector[Double]] = v4.p0
    val v37: Double = v34 - v49
    v4 = v4.copy(p1 = v12)
    v4 = v4.copy(p0 = v38)
    v22 = v22.copy(p0 = v56)
    v4 = v4.copy(p1 = v33)
    v8 = v1
    var v76: Double = v1
    val v52: Double = v37 - v49
    val v114: Vector[Double] = Vector(v52, v76, v5, v16, v9, v76)
    var v110: Vector[Double] = v114
    val v98: Double = v110(2)
    v98
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0))), s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0))))
    val v1: Double = 10.0
    val start = nanoTime()
    var result: Double = 10.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}