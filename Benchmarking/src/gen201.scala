import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Double],
    p1: Vector[Vector[Double]]
  )
  def f33(v0: s0): s0 = {
    val v4: Vector[Vector[Double]] = v0.p1
    var v5: s0 = v0
    val v3: Vector[Double] = v4(0)
    val v8: Vector[Vector[Double]] = v5.p1
    v5 = v5.copy(p1 = v4)
    val v1: Vector[Double] = v5.p0
    val v9: Vector[Double] = v5.p0
    v5 = v5.copy(p0 = v1)
    val v11: Vector[Double] = v0.p0
    val v12: Vector[Double] = v5.p0
    val v20: Vector[Vector[Double]] = v0.p1
    val v30: Vector[Vector[Double]] = v0.p1
    v5 = v5.copy(p1 = v30)
    val v21: Double = v12(1)
    v5 = v0
    val v48: Double = v3(0)
    v5 = v5.copy(p0 = v9)
    val v23: Vector[Vector[Double]] = v0.p1
    v5 = v5.copy(p0 = v11)
    v5 = v5.copy(p1 = v23)
    val v22: s0 = s0(v12, v8)
    val v25: Vector[Vector[Double]] = v0.p1
    var v26: Vector[Vector[Double]] = v8
    val v34: Vector[Double] = v22.p0
    v26 = v8
    v26 = v26.updated(1, v3)
    v5 = v5.copy(p0 = v9)
    val v27: Vector[Vector[Vector[Double]]] = Vector(v23, v8, v25, v8, v25, v26, v23)
    var v32: Vector[Double] = v1
    val v24: Vector[Double] = v0.p0
    v5 = v5.copy(p1 = v8)
    val v15: Vector[Double] = v5.p0
    v5 = v5.copy(p0 = v32)
    v32 = v32.updated(0, v21)
    val v49: Vector[Double] = v5.p0
    v5 = v5.copy(p0 = v15)
    val v56: Vector[Vector[Double]] = v0.p1
    v32 = v32.updated(1, v48)
    val v35: s0 = s0(v49, v8)
    var v71: Vector[Vector[Double]] = v4
    val v28: s0 = s0(v12, v20)
    val v42: Vector[Double] = v5.p0
    v5 = v5.copy(p1 = v56)
    v5 = v5.copy(p1 = v23)
    val v33: Vector[Vector[Double]] = v28.p1
    val v47: Double = v24(1)
    v32 = v1
    v5 = v5.copy(p0 = v1)
    val v94: Vector[Double] = v28.p0
    val v37: Vector[Double] = v5.p0
    var v64: s0 = v22
    v64 = v64.copy(p1 = v20)
    v5 = v5.copy(p0 = v24)
    v5 = v5.copy(p0 = v11)
    val v110: Vector[Double] = v35.p0
    val v96: Vector[Vector[Double]] = v0.p1
    v32 = v32.updated(0, v47)
    v64 = v64.copy(p0 = v15)
    v64 = v64.copy(p0 = v34)
    val v92: Vector[Vector[Double]] = v64.p1
    val v79: s0 = s0(v110, v96)
    val v52: Vector[Vector[Double]] = v27(5)
    v5 = v5.copy(p1 = v92)
    val v66: Vector[Vector[Double]] = v79.p1
    v5 = v5.copy(p1 = v26)
    v5 = v5.copy(p1 = v8)
    v5 = v5.copy(p1 = v33)
    v5 = v5.copy(p1 = v52)
    v5 = v5.copy(p0 = v42)
    v64 = v64.copy(p1 = v71)
    v5 = v5.copy(p0 = v94)
    val v89: s0 = s0(v24, v66)
    v64 = v64.copy(p0 = v37)
    v5 = v5.copy(p0 = v1)
    v89
  }
  def f8(v0: s0): s0 = {
    var v6: s0 = v0
    val v5: Vector[s0] = Vector(v0, v0, v6, v6, v6, v0)
    var v4: Vector[s0] = v5
    val v7: s0 = v4(5)
    val v1: Vector[Vector[Double]] = v7.p1
    val v2: Vector[Double] = v0.p0
    val v13: s0 = v5(5)
    val v12: s0 = f33(v13)
    var v23: Vector[s0] = v4
    v23 = v23.updated(3, v6)
    val v17: Double = v2(0)
    val v21: s0 = f33(v7)
    v4 = v4.updated(0, v21)
    val v14: Vector[Double] = v7.p0
    v6 = v6.copy(p1 = v1)
    var v41: Vector[Double] = v2
    val v20: s0 = f33(v0)
    v6 = v6.copy(p0 = v41)
    v41 = v41.updated(1, v17)
    val v37: s0 = f33(v13)
    v6 = v6.copy(p0 = v41)
    val v87: s0 = v23(3)
    v23 = v23.updated(3, v20)
    val v78: Vector[Vector[Double]] = v87.p1
    var v93: s0 = v37
    val v197: Vector[Vector[Double]] = v12.p1
    v93 = v93.copy(p1 = v78)
    v6 = v6.copy(p0 = v14)
    v6 = v6.copy(p1 = v197)
    v93
  }
  def f4(v0: s0, v1: Double): Double = {
    val v6: s0 = f8(v0)
    val v9: Vector[s0] = Vector(v6, v6, v0)
    val v11: s0 = v9(1)
    val v25: s0 = f33(v11)
    val v14: Vector[Double] = v25.p0
    var v30: Vector[Double] = v14
    var v56: Double = v1
    v30 = v30.updated(0, v56)
    val v80: Double = v30(1)
    v80
  }
  @noinline
  def f0(v0: s0, v1: Double): Double = {
    val v2: s0 = f33(v0)
    var v8: s0 = v2
    val v3: Vector[Double] = v2.p0
    val v6: Vector[Double] = v2.p0
    val v10: Vector[Double] = v2.p0
    val v11: s0 = f8(v8)
    val v12: Double = v10(1)
    val v29: Vector[Vector[Double]] = v11.p1
    val v15: Vector[Double] = v29(1)
    val v25: Vector[Double] = v2.p0
    var v27: Vector[Double] = v3
    val v18: s0 = f33(v8)
    val v17: Double = v15(0)
    v8 = v8.copy(p0 = v10)
    val v79: Vector[Double] = v0.p0
    val v34: s0 = f33(v18)
    val v16: s0 = f33(v34)
    val v61: s0 = f8(v18)
    v27 = v27.updated(1, v17)
    val v51: Double = v25(1)
    var v35: Vector[Double] = v10
    v8 = v8.copy(p0 = v3)
    v8 = v8.copy(p0 = v35)
    val v31: Vector[s0] = Vector(v8, v16, v16, v8, v61, v2)
    val v73: s0 = v31(5)
    v27 = v27.updated(0, v12)
    v8 = v8.copy(p0 = v27)
    v8 = v8.copy(p0 = v6)
    v8 = v8.copy(p0 = v79)
    val v59: s0 = f8(v73)
    val v93: Double = f4(v59, v1)
    v35 = v35.updated(1, v51)
    v27 = v27.updated(1, v93)
    v8 = v8.copy(p0 = v25)
    v8 = v8.copy(p0 = v3)
    v93
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(0.0, 1.0), Vector(Vector(2.0), Vector(3.0)))
    val v1: Double = 4.0
    val start = nanoTime()
    var result: Double = 4.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}