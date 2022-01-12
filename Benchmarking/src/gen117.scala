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
  def f66(v0: s1): s1 = {
    var v3: s1 = v0
    val v6: s0 = v3.p0
    val v4: s1 = s1(v6, v6)
    val v1: Vector[Vector[Double]] = v6.p0
    var v7: s0 = v6
    v3 = v3.copy(p1 = v7)
    val v15: Vector[Vector[Double]] = v6.p1
    v7 = v7.copy(p0 = v1)
    var v20: Vector[Vector[Double]] = v15
    v7 = v7.copy(p0 = v1)
    v7 = v7.copy(p1 = v20)
    v4
  }
  def f56(v0: Double, v1: s0): s0 = {
    val v7: Vector[Vector[Double]] = v1.p0
    val v2: Vector[Vector[Double]] = v1.p0
    val v6: Vector[Double] = v2(0)
    val v11: Vector[Double] = v7(0)
    var v9: Vector[Double] = v11
    val v3: Vector[Vector[Double]] = v1.p1
    var v4: s0 = v1
    v4 = v4.copy(p0 = v7)
    var v5: Vector[Vector[Double]] = v3
    val v8: Vector[Double] = v7(1)
    val v13: Vector[Vector[Double]] = v1.p0
    val v12: Vector[Double] = v3(0)
    var v18: Vector[Vector[Double]] = v5
    var v22: Vector[Vector[Double]] = v5
    v5 = v5.updated(0, v8)
    v4 = v4.copy(p1 = v22)
    v4 = v4.copy(p0 = v7)
    v4 = v4.copy(p1 = v5)
    var v21: s0 = v1
    v21 = v21.copy(p1 = v5)
    var v10: Vector[Vector[Double]] = v3
    val v28: Vector[Double] = v7(1)
    v4 = v4.copy(p0 = v13)
    val v14: Vector[Double] = v7(0)
    v18 = v18.updated(0, v14)
    v21 = v21.copy(p1 = v5)
    v21 = v21.copy(p0 = v13)
    v18 = v18.updated(0, v28)
    var v46: Vector[Vector[Double]] = v13
    val v19: Double = v12(0)
    val v23: Vector[Double] = v46(1)
    var v53: s0 = v4
    val v24: Vector[Vector[Double]] = v1.p1
    v4 = v4.copy(p0 = v13)
    var v31: s0 = v21
    val v35: Vector[Vector[Double]] = v53.p0
    v10 = v10.updated(0, v23)
    v10 = v22
    v53 = v53.copy(p0 = v46)
    v4 = v4.copy(p1 = v10)
    v21 = v21.copy(p0 = v46)
    v22 = v22.updated(0, v11)
    v9 = v8
    val v48: Vector[Vector[Double]] = v21.p0
    val v52: Vector[Vector[Double]] = v31.p0
    v5 = v5.updated(0, v8)
    val v56: Vector[Vector[Double]] = v31.p1
    val v62: Vector[Vector[Double]] = v21.p1
    val v30: Vector[Vector[Double]] = v21.p1
    val v72: Vector[Double] = v52(0)
    v21 = v21.copy(p0 = v52)
    var v32: Vector[Vector[Double]] = v7
    val v98: Vector[Vector[Double]] = v1.p0
    v21 = v21.copy(p0 = v2)
    v21 = v21.copy(p0 = v46)
    v31 = v31.copy(p1 = v30)
    val v96: Vector[Vector[Vector[Double]]] = Vector(v2, v46, v32)
    v46 = v32
    var v61: Double = v19
    var v99: Vector[Vector[Double]] = v24
    v10 = v10.updated(0, v9)
    val v80: Vector[Vector[Double]] = v1.p0
    val v65: Vector[Vector[Double]] = v1.p1
    v4 = v4.copy(p1 = v5)
    val v63: Vector[Vector[Double]] = v96(0)
    v4 = v4.copy(p0 = v35)
    v21 = v21.copy(p1 = v18)
    v21 = v21.copy(p1 = v65)
    val v55: s1 = s1(v31, v53)
    val v148: Vector[Vector[Double]] = v31.p1
    v21 = v21.copy(p1 = v56)
    v9 = v9.updated(0, v61)
    v21 = v21.copy(p0 = v98)
    val v178: Vector[Double] = v5(0)
    v5 = v5.updated(0, v178)
    val v201: Vector[Double] = v46(1)
    v46 = v46.updated(1, v6)
    v21 = v21.copy(p0 = v2)
    var v79: Vector[Vector[Double]] = v32
    v99 = v99.updated(0, v201)
    v9 = v28
    v99 = v99.updated(0, v8)
    v53 = v53.copy(p1 = v62)
    v32 = v32.updated(0, v72)
    v53 = v53.copy(p0 = v63)
    val v295: s0 = v55.p1
    v21 = v21.copy(p0 = v48)
    var v296: s0 = v295
    v21 = v21.copy(p0 = v79)
    v4 = v4.copy(p1 = v10)
    v296 = v296.copy(p1 = v148)
    v31 = v31.copy(p0 = v80)
    v4 = v4.copy(p1 = v99)
    v53 = v53.copy(p0 = v35)
    v53 = v53.copy(p1 = v10)
    v296
  }
  def f51(v0: s1): s1 = {
    val v1: s1 = f66(v0)
    val v8: s1 = f66(v1)
    var v7: s1 = v8
    var v9: s1 = v7
    v9
  }
  def f44(v0: Double, v1: Vector[Double]): Vector[Double] = {
    val v2: Double = v1(0)
    val v5: Double = v1(0)
    val v6: Double = v1(0)
    val v4: Double = v1(0)
    var v8: Vector[Double] = v1
    val v7: Double = v8(0)
    v8 = v8.updated(0, v5)
    v8 = v8.updated(0, v0)
    var v10: Vector[Double] = v8
    v10 = v10.updated(0, v0)
    val v9: Double = v1(0)
    val v22: Vector[Double] = Vector(v2)
    v8 = v8.updated(0, v9)
    val v12: Double = v8(0)
    v8 = v8.updated(0, v4)
    val v14: Double = v22(0)
    var v16: Double = v0
    v10 = v10.updated(0, v4)
    var v28: Double = v5
    v10 = v10.updated(0, v6)
    val v25: Double = v22(0)
    var v17: Vector[Double] = v10
    val v42: Double = v8(0)
    var v43: Vector[Double] = v17
    val v30: Double = v22(0)
    v8 = v43
    var v40: Vector[Double] = v10
    var v15: Double = v28
    val v27: Double = v43(0)
    var v24: Vector[Double] = v40
    val v19: Vector[Double] = Vector(v9, v2, v14, v25, v14, v16, v7)
    v10 = v10.updated(0, v27)
    v17 = v17.updated(0, v15)
    var v35: Vector[Double] = v19
    val v33: Double = v35(1)
    v17 = v40
    v40 = v24
    v40 = v17
    val v41: Double = v35(2)
    var v26: Vector[Double] = v1
    v26 = v40
    v10 = v10.updated(0, v33)
    v43 = v43.updated(0, v12)
    var v39: Vector[Double] = v19
    v40 = v40.updated(0, v16)
    v26 = v26.updated(0, v42)
    v26 = v26.updated(0, v5)
    v43 = v43.updated(0, v42)
    val v45: Double = v39(2)
    v40 = v40.updated(0, v41)
    v17 = v17.updated(0, v45)
    val v55: Double = v19(5)
    val v46: Double = v19(4)
    v26 = v26.updated(0, v55)
    v16 = v30
    v24 = v24.updated(0, v46)
    v43 = v43.updated(0, v27)
    v26
  }
  def f29(v0: Vector[s1]): Vector[s1] = {
    v0
  }
  def f21(v0: s1): s1 = {
    val v7: s0 = v0.p1
    val v3: s1 = f51(v0)
    var v6: s0 = v7
    val v4: s1 = f66(v0)
    val v9: s1 = s1(v6, v6)
    val v5: Vector[s1] = Vector(v3)
    var v8: s1 = v9
    val v2: Vector[Vector[Double]] = v7.p1
    val v13: s1 = v5(0)
    var v16: Vector[Vector[Double]] = v2
    val v14: s1 = f66(v4)
    val v11: s1 = f66(v13)
    val v35: Vector[s1] = f29(v5)
    v6 = v6.copy(p1 = v2)
    val v10: Vector[Vector[Double]] = v6.p0
    var v12: s0 = v6
    val v19: s1 = v35(0)
    var v24: s0 = v6
    val v22: Vector[Double] = v10(1)
    var v17: Vector[Vector[Double]] = v16
    val v68: Vector[Vector[Double]] = v6.p0
    val v81: Double = v22(0)
    v16 = v16.updated(0, v22)
    val v25: Vector[Double] = f44(v81, v22)
    v24 = v24.copy(p0 = v68)
    val v47: s0 = v14.p0
    v17 = v17.updated(0, v22)
    val v36: s0 = f56(v81, v24)
    v6 = v6.copy(p1 = v2)
    val v44: s0 = f56(v81, v47)
    val v85: Vector[Double] = v68(0)
    v17 = v17.updated(0, v85)
    val v52: Vector[Vector[Double]] = v36.p1
    val v218: Vector[Double] = v52(0)
    v8 = v8.copy(p1 = v12)
    v17 = v17.updated(0, v25)
    val v144: s0 = v4.p0
    v8 = v8.copy(p1 = v144)
    v8 = v11
    val v97: Vector[Double] = v17(0)
    v8 = v8.copy(p1 = v47)
    v16 = v16.updated(0, v97)
    var v171: s1 = v8
    v171 = v171.copy(p0 = v44)
    v12 = v12.copy(p1 = v16)
    val v186: s0 = v19.p1
    v16 = v16.updated(0, v218)
    v171 = v171.copy(p1 = v186)
    v171
  }
  def f14(v0: s1): s1 = {
    val v7: Vector[s1] = Vector(v0, v0)
    val v2: s0 = v0.p1
    val v8: s1 = v7(1)
    val v6: s1 = v7(1)
    var v4: s0 = v2
    val v3: s1 = f21(v8)
    val v11: s1 = s1(v2, v4)
    val v15: Vector[Vector[Double]] = v2.p1
    var v25: Vector[Vector[Double]] = v15
    val v39: Vector[Vector[Double]] = v4.p0
    val v21: s1 = f21(v11)
    val v34: Vector[Double] = v25(0)
    var v32: Vector[Vector[Double]] = v39
    v32 = v32.updated(1, v34)
    var v17: Vector[Double] = v34
    v32 = v32.updated(1, v17)
    var v72: s1 = v11
    val v31: Vector[s1] = Vector(v3, v72, v8, v21)
    val v127: s1 = v31(3)
    v4 = v4.copy(p0 = v32)
    v25 = v25.updated(0, v17)
    val v82: s0 = v6.p0
    v72 = v72.copy(p0 = v82)
    val v493: s1 = f51(v127)
    v493
  }
  @noinline
  def f0(v0: s1, v1: Double): Double = {
    val v7: s1 = f14(v0)
    val v6: s1 = f21(v7)
    val v2: s0 = v6.p1
    val v8: Vector[Vector[Double]] = v2.p0
    val v42: Vector[Double] = v8(1)
    var v103: Vector[Double] = v42
    val v73: Double = v103(0)
    v73
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))), s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0))))
    val v1: Double = 6.0
    val start = nanoTime()
    var result: Double = 6.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}