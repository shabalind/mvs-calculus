import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f18(v0: s0, v1: Vector[Vector[s0]]): Vector[Vector[s0]] = {
    var v44: Vector[Vector[s0]] = v1
    var v98: Vector[Vector[s0]] = v44
    v98
  }
  def f17(v0: Double): Double = {
    var v6: Double = v0
    val v5: Vector[Double] = Vector(v0, v0, v6, v6, v0, v0, v6)
    val v1: Double = v5(6)
    var v8: Double = v6
    val v12: Double = v5(5)
    var v7: Double = v1
    var v3: Vector[Double] = v5
    val v9: Double = v3(2)
    v6 = v9
    val v4: Double = v3(0)
    val v11: Double = v5(2)
    val v16: Double = v5(1)
    var v20: Double = v16
    val v19: Double = v5(1)
    val v30: Double = v5(0)
    var v21: Vector[Double] = v5
    v21 = v21.updated(5, v1)
    v21 = v21.updated(4, v30)
    var v14: Vector[Double] = v3
    v3 = v3.updated(3, v11)
    val v25: Double = v14(2)
    val v28: Vector[Double] = Vector(v8, v16, v4, v6, v7)
    v21 = v21.updated(1, v19)
    v14 = v14.updated(4, v12)
    v21 = v21.updated(1, v11)
    v21 = v21.updated(1, v9)
    v3 = v21
    val v46: Vector[Vector[Double]] = Vector(v28, v28, v28, v28, v28, v28, v28)
    v21 = v21.updated(0, v6)
    var v37: Vector[Vector[Double]] = v46
    v14 = v14.updated(5, v20)
    val v52: Vector[Double] = v37(2)
    var v53: Vector[Double] = v52
    v20 = v11
    v53 = v53.updated(4, v30)
    v3 = v3.updated(5, v25)
    val v98: Double = v53(2)
    v98
  }
  def f16(v0: s0): s0 = {
    var v5: s0 = v0
    v5 = v0
    val v4: Vector[Vector[Double]] = v0.p1
    val v1: Vector[Vector[Double]] = v5.p1
    v5 = v5.copy(p0 = v4)
    val v8: s0 = s0(v4, v1)
    var v23: Vector[Vector[Double]] = v4
    v5 = v5.copy(p0 = v23)
    val v9: Vector[s0] = Vector(v5, v0, v0, v5, v8, v5)
    var v31: Vector[s0] = v9
    val v48: s0 = v31(0)
    v48
  }
  def f15(v0: s0, v1: Vector[Vector[s0]]): s0 = {
    val v5: s0 = f16(v0)
    val v32: Vector[Vector[s0]] = f18(v5, v1)
    val v23: s0 = f16(v0)
    val v34: Vector[Vector[s0]] = f18(v23, v32)
    val v74: Vector[s0] = v34(1)
    val v138: s0 = v74(0)
    v138
  }
  def f9(v0: s0): s0 = {
    var v5: s0 = v0
    val v10: Vector[s0] = Vector(v5)
    var v6: s0 = v5
    val v4: s0 = f16(v6)
    val v2: s0 = f16(v4)
    val v18: Vector[Vector[s0]] = Vector(v10, v10, v10)
    var v23: Vector[Vector[s0]] = v18
    val v54: s0 = f15(v2, v23)
    v54
  }
  def f5(v0: s0, v1: Double, v2: s0, v3: s0, v4: s0): Double = {
    val v7: Vector[Vector[Double]] = v4.p1
    val v6: Vector[Vector[Double]] = v2.p1
    val v5: s0 = s0(v6, v7)
    var v15: s0 = v3
    v15 = v15.copy(p0 = v6)
    val v8: Vector[Double] = v6(0)
    val v10: Vector[Double] = v6(0)
    val v14: Vector[Double] = v7(0)
    v15 = v15.copy(p0 = v7)
    val v21: Double = f17(v1)
    val v20: s0 = f9(v15)
    var v18: Vector[Vector[Double]] = v7
    var v29: Vector[Double] = v8
    v18 = v18.updated(0, v14)
    var v23: Vector[Double] = v10
    v23 = v23.updated(0, v21)
    val v33: s0 = f16(v20)
    val v34: Vector[Vector[Double]] = v20.p1
    val v16: Double = v23(0)
    val v36: Vector[Vector[Double]] = v15.p1
    v15 = v15.copy(p0 = v7)
    var v24: Vector[Vector[Double]] = v36
    val v27: Vector[Vector[Double]] = v5.p1
    val v59: Vector[Double] = v27(0)
    val v88: Vector[Vector[Double]] = v33.p1
    v15 = v15.copy(p1 = v34)
    v23 = v23.updated(0, v16)
    val v57: s0 = f9(v3)
    val v99: Vector[Double] = v88(0)
    val v71: Vector[Vector[Double]] = v57.p0
    v18 = v18.updated(0, v59)
    val v62: Double = v99(0)
    v29 = v29.updated(0, v16)
    v15 = v15.copy(p1 = v24)
    v18 = v71
    var v121: Vector[Double] = v29
    val v58: Double = v16 / v62
    v15 = v15.copy(p0 = v18)
    v23 = v121
    v58
  }
  def f4(v0: s0, v1: s0): s0 = {
    var v2: s0 = v0
    val v4: s0 = f9(v2)
    var v7: s0 = v0
    val v5: s0 = f9(v4)
    val v3: Vector[Vector[Double]] = v0.p1
    val v13: Vector[Vector[Double]] = v5.p1
    val v6: s0 = f9(v7)
    val v9: Vector[Double] = v13(0)
    val v15: s0 = f16(v4)
    val v10: s0 = f16(v5)
    val v20: s0 = f16(v6)
    val v8: s0 = f9(v0)
    val v25: Vector[Vector[Double]] = v4.p1
    var v18: Vector[Vector[Double]] = v3
    v7 = v7.copy(p0 = v3)
    val v21: Vector[Vector[Double]] = v4.p1
    val v17: Double = v9(0)
    v7 = v7.copy(p1 = v18)
    val v37: Vector[Vector[Double]] = v20.p1
    val v34: Vector[Vector[Double]] = v10.p1
    v2 = v2.copy(p0 = v34)
    v2 = v2.copy(p1 = v18)
    val v22: Vector[Vector[Double]] = v15.p1
    val v32: Vector[Double] = v34(0)
    var v40: Vector[Vector[Double]] = v25
    v7 = v7.copy(p1 = v40)
    val v53: Vector[Double] = v3(0)
    val v31: Vector[Double] = v22(0)
    v40 = v40.updated(0, v53)
    v18 = v18.updated(0, v31)
    v2 = v2.copy(p1 = v25)
    v40 = v40.updated(0, v9)
    val v67: s0 = f16(v2)
    v40 = v40.updated(0, v53)
    v18 = v18.updated(0, v32)
    v18 = v18.updated(0, v32)
    var v23: Vector[Double] = v32
    v18 = v18.updated(0, v32)
    val v24: Vector[Vector[Double]] = v20.p0
    val v47: s0 = s0(v21, v13)
    val v48: Double = v9(0)
    v18 = v18.updated(0, v9)
    var v84: s0 = v8
    v18 = v18.updated(0, v23)
    v84 = v84.copy(p0 = v37)
    val v30: s0 = f9(v47)
    v18 = v18.updated(0, v31)
    v23 = v23.updated(0, v48)
    v84 = v30
    v7 = v7.copy(p1 = v24)
    v84 = v84.copy(p1 = v21)
    val v42: Double = f17(v17)
    v84 = v84.copy(p0 = v21)
    v7 = v7.copy(p1 = v37)
    val v60: Vector[Vector[Double]] = v67.p0
    val v125: Vector[Vector[Double]] = v7.p0
    v84 = v84.copy(p1 = v125)
    v2 = v2.copy(p1 = v60)
    v23 = v23.updated(0, v42)
    v84 = v84.copy(p1 = v40)
    v2 = v2.copy(p0 = v40)
    val v143: Vector[Vector[Double]] = v47.p0
    val v183: Vector[Double] = v143(0)
    v18 = v18.updated(0, v183)
    v84
  }
  @noinline
  def f0(v0: s0, v1: s0, v2: Double): Double = {
    val v5: Vector[Vector[Double]] = v1.p1
    val v9: s0 = f9(v1)
    val v7: Vector[Double] = v5(0)
    val v11: s0 = f4(v0, v0)
    val v48: Double = v7(0)
    val v41: s0 = f4(v9, v9)
    val v24: Double = f5(v1, v48, v1, v0, v41)
    val v27: Double = v7(0)
    val v42: s0 = f9(v0)
    val v47: Double = f17(v24)
    val v59: Double = f5(v11, v27, v9, v42, v1)
    var v71: Double = v59
    var v75: Double = v47
    val v79: Double = v71 + v75
    v79
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0)), Vector(Vector(1.0)))
    val v1: s0 = s0(Vector(Vector(2.0)), Vector(Vector(3.0)))
    val v2: Double = 4.0
    val start = nanoTime()
    var result: Double = 4.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}