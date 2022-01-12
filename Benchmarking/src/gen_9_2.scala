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
  def f50(v0: s1): s1 = {
    val v4: s0 = v0.p1
    var v1: s0 = v4
    val v6: Vector[Vector[Double]] = v1.p0
    val v8: Vector[Vector[Double]] = v1.p1
    var v3: Vector[Vector[Double]] = v8
    val v5: s0 = s0(v6, v3)
    val v2: Vector[s0] = v0.p0
    val v11: Vector[Vector[Double]] = v4.p0
    val v7: Vector[Double] = v8(0)
    val v10: Vector[Double] = v8(1)
    val v18: s0 = v2(2)
    val v20: Vector[s0] = v0.p0
    var v16: Vector[Vector[Double]] = v6
    val v12: s0 = v0.p1
    v16 = v11
    val v22: Vector[s0] = v0.p0
    var v24: Vector[Double] = v7
    val v26: s0 = v2(1)
    val v19: Double = v24(0)
    var v50: Vector[s0] = v20
    v50 = v50.updated(1, v4)
    v1 = v1.copy(p1 = v3)
    v1 = v1.copy(p1 = v8)
    val v21: Vector[Double] = v6(1)
    v1 = v1.copy(p0 = v16)
    val v72: Vector[Vector[Double]] = v12.p0
    v1 = v1.copy(p0 = v6)
    v1 = v1.copy(p0 = v16)
    val v34: Vector[Double] = v72(1)
    v3 = v3.updated(1, v21)
    var v28: Vector[s0] = v50
    v50 = v50.updated(1, v1)
    val v23: Vector[Vector[Double]] = Vector(v21, v34)
    val v125: Vector[Vector[Double]] = v5.p0
    v16 = v125
    val v38: Double = v10(0)
    val v31: Vector[Vector[Double]] = v18.p1
    val v47: Vector[s0] = v0.p0
    v24 = v24.updated(0, v19)
    v1 = v1.copy(p1 = v8)
    v3 = v3.updated(0, v7)
    v3 = v23
    var v91: Vector[Vector[Double]] = v31
    var v55: Vector[Vector[Double]] = v91
    var v56: Vector[Double] = v10
    v1 = v1.copy(p0 = v16)
    val v114: Double = v38 + v19
    val v70: Vector[Vector[s0]] = Vector(v22, v47, v22, v22, v47, v2, v28)
    val v83: Vector[Double] = v72(2)
    val v69: Vector[s0] = v70(6)
    v91 = v91.updated(1, v56)
    var v78: s1 = v0
    v16 = v16.updated(2, v34)
    var v61: Double = v114
    val v128: s0 = v0.p1
    v56 = v56.updated(0, v61)
    v1 = v1.copy(p1 = v91)
    v3 = v3.updated(1, v83)
    v1 = v1.copy(p1 = v55)
    v50 = v50.updated(2, v128)
    v78 = v78.copy(p0 = v69)
    v28 = v28.updated(2, v26)
    v78
  }
  def f40(v0: s0): s0 = {
    var v1: s0 = v0
    val v5: Vector[Vector[Double]] = v1.p0
    val v7: Vector[Vector[Double]] = v0.p1
    val v6: Vector[Vector[Double]] = v1.p0
    var v3: Vector[Vector[Double]] = v5
    val v4: Vector[Vector[Double]] = v0.p0
    val v2: Vector[s0] = Vector(v0, v0, v0)
    val v8: Vector[Vector[Double]] = v1.p1
    val v19: Vector[Vector[Double]] = v1.p1
    v1 = v1.copy(p1 = v7)
    val v25: Vector[Vector[Double]] = v0.p1
    var v17: Vector[Vector[Double]] = v4
    var v15: s0 = v1
    val v14: s0 = v2(0)
    v15 = v15.copy(p0 = v17)
    val v31: Vector[Vector[Vector[Double]]] = Vector(v5, v4, v6)
    val v21: Vector[Vector[Double]] = v15.p1
    val v26: Vector[Double] = v19(1)
    v1 = v14
    val v35: Vector[Vector[Double]] = v14.p0
    val v38: s0 = v2(0)
    val v41: s0 = s0(v3, v21)
    v3 = v3.updated(2, v26)
    val v33: s0 = v2(1)
    val v56: Vector[Vector[Double]] = v38.p1
    v15 = v15.copy(p0 = v3)
    v17 = v35
    val v20: s1 = s1(v2, v41)
    val v45: s1 = f50(v20)
    val v46: Vector[Vector[Double]] = v31(0)
    v15 = v15.copy(p1 = v25)
    val v44: Vector[s0] = v45.p0
    val v66: s1 = s1(v44, v33)
    v15 = v15.copy(p1 = v8)
    v1 = v1.copy(p1 = v56)
    val v95: Vector[s0] = v66.p0
    v15 = v15.copy(p0 = v46)
    val v74: s0 = v95(2)
    v74
  }
  def f24(v0: s0): s0 = {
    var v5: s0 = v0
    var v2: s0 = v5
    val v3: Vector[Vector[Double]] = v0.p0
    val v6: s0 = f40(v2)
    val v8: Vector[Vector[Double]] = v5.p0
    val v11: Vector[Vector[Double]] = v6.p1
    var v12: Vector[Vector[Double]] = v11
    var v1: Vector[Vector[Double]] = v11
    val v20: Vector[Vector[Double]] = v6.p1
    val v4: Vector[Vector[Vector[Double]]] = Vector(v8, v3, v3, v3, v8, v3)
    var v15: Vector[Vector[Double]] = v8
    var v10: Vector[Vector[Vector[Double]]] = v4
    var v9: Vector[Vector[Double]] = v20
    val v13: s0 = s0(v15, v9)
    v10 = v10.updated(2, v15)
    v5 = v5.copy(p1 = v12)
    val v16: Vector[Vector[Double]] = v10(1)
    val v25: Vector[Vector[Double]] = v13.p0
    val v19: Vector[Vector[Double]] = v2.p1
    val v29: Vector[Double] = v19(0)
    v1 = v1.updated(0, v29)
    v1 = v1.updated(0, v29)
    var v34: Vector[Double] = v29
    val v50: Vector[Vector[Double]] = v0.p0
    val v46: Vector[Double] = v1(0)
    v15 = v15.updated(1, v46)
    v1 = v1.updated(1, v34)
    v1 = v1.updated(1, v29)
    v1 = v1.updated(1, v46)
    val v67: Vector[Double] = v16(0)
    v2 = v2.copy(p0 = v50)
    val v88: Vector[Double] = v25(1)
    v1 = v1.updated(1, v88)
    v15 = v15.updated(1, v67)
    v10 = v10.updated(3, v25)
    v13
  }
  def f9(v0: s0): s0 = {
    var v4: s0 = v0
    val v5: s0 = f40(v0)
    val v8: s0 = f40(v5)
    val v2: Vector[Vector[Double]] = v4.p0
    var v6: s0 = v8
    var v3: Vector[Vector[Double]] = v2
    val v1: Vector[s0] = Vector(v0, v6, v8, v6, v6, v6)
    v4 = v6
    var v9: Vector[Vector[Double]] = v2
    v6 = v6.copy(p0 = v3)
    v6 = v6.copy(p0 = v3)
    val v11: s0 = v1(5)
    val v10: s0 = f40(v4)
    val v12: Vector[Double] = v9(1)
    v9 = v9.updated(1, v12)
    var v19: Vector[Vector[Double]] = v2
    val v21: Vector[Vector[Double]] = v4.p0
    val v23: s0 = f40(v0)
    var v15: s0 = v4
    v15 = v6
    val v14: Vector[Vector[Double]] = v5.p0
    val v25: Vector[Vector[Double]] = v4.p0
    var v22: Vector[Double] = v12
    val v28: s0 = f40(v10)
    var v34: Vector[Double] = v22
    val v26: Vector[Vector[Double]] = v8.p1
    val v49: s0 = f24(v15)
    v6 = v6.copy(p1 = v26)
    val v50: Vector[Double] = v19(1)
    v3 = v3.updated(2, v22)
    var v35: Vector[Vector[Double]] = v3
    val v20: s0 = f24(v5)
    v19 = v19.updated(1, v34)
    v19 = v19.updated(2, v22)
    v6 = v6.copy(p1 = v26)
    val v41: s0 = f40(v28)
    v4 = v49
    var v91: Vector[Vector[Double]] = v26
    val v64: Vector[Vector[Double]] = v20.p0
    var v39: Vector[Vector[Double]] = v91
    v15 = v15.copy(p1 = v26)
    val v69: Vector[Vector[Double]] = v4.p0
    val v73: Vector[Double] = v14(2)
    val v44: s0 = v1(1)
    val v93: Vector[Vector[Vector[Double]]] = Vector(v64, v19, v21, v25, v69)
    val v30: s0 = f24(v41)
    v6 = v6.copy(p0 = v64)
    v15 = v15.copy(p0 = v64)
    var v48: Vector[Vector[Double]] = v91
    var v114: s0 = v11
    val v55: s0 = f24(v44)
    v6 = v55
    val v104: Vector[Vector[Double]] = v93(1)
    var v85: Vector[Vector[Double]] = v48
    v15 = v15.copy(p1 = v48)
    v91 = v85
    val v112: Vector[Vector[Double]] = v30.p1
    v114 = v114.copy(p0 = v35)
    val v136: Vector[Vector[Double]] = v6.p1
    val v109: Vector[Vector[Double]] = v23.p1
    v114 = v114.copy(p1 = v91)
    var v52: Vector[Vector[Double]] = v39
    v6 = v6.copy(p0 = v104)
    v114 = v114.copy(p0 = v3)
    v114 = v114.copy(p1 = v112)
    v52 = v52.updated(1, v73)
    v6 = v6.copy(p1 = v109)
    v6 = v6.copy(p1 = v136)
    v22 = v50
    v6 = v6.copy(p1 = v52)
    v114
  }
  @noinline
  def f0(v0: s0, v1: Double): Double = {
    val v4: s0 = f9(v0)
    val v6: Vector[Vector[Double]] = v0.p1
    var v9: s0 = v0
    val v8: Vector[Vector[Double]] = v0.p1
    val v12: Vector[Vector[Double]] = v0.p0
    var v13: Vector[Vector[Double]] = v8
    v9 = v9.copy(p0 = v12)
    val v18: Vector[Double] = v6(0)
    v9 = v9.copy(p1 = v8)
    val v20: s0 = f40(v0)
    val v21: s0 = f40(v0)
    val v25: s0 = f9(v20)
    v9 = v9.copy(p1 = v6)
    val v16: s0 = f40(v25)
    val v29: Vector[Vector[Double]] = v21.p0
    v9 = v9.copy(p0 = v29)
    val v23: Vector[Vector[Double]] = v9.p1
    v9 = v9.copy(p0 = v29)
    val v36: s0 = f40(v16)
    val v30: Vector[Double] = v23(0)
    v13 = v13.updated(0, v18)
    v13 = v13.updated(0, v30)
    val v82: Vector[Double] = v23(0)
    var v38: Vector[Double] = v82
    var v43: Vector[Double] = v38
    v9 = v9.copy(p1 = v23)
    v9 = v9.copy(p1 = v13)
    var v44: Vector[Vector[Double]] = v8
    v9 = v9.copy(p1 = v44)
    val v72: Vector[Vector[Double]] = v4.p1
    val v79: Double = v43(0)
    val v53: Vector[Vector[Double]] = v36.p1
    v9 = v9.copy(p1 = v53)
    v9 = v9.copy(p1 = v72)
    v79
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0)))
    val v1: Double = 5.0
    val start = nanoTime()
    var result: Double = 5.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}