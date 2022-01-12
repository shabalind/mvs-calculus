import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f50(v0: s0): s0 = {
    val v6: Vector[Vector[Double]] = v0.p0
    val v1: Vector[Double] = v6(0)
    val v5: Vector[Vector[Double]] = v0.p0
    var v2: s0 = v0
    var v7: Vector[Double] = v1
    var v3: Vector[Double] = v7
    val v11: Vector[Vector[Double]] = v2.p1
    val v4: Vector[s0] = Vector(v0, v2, v0, v2)
    var v10: Vector[Vector[Double]] = v5
    v7 = v1
    var v8: Vector[s0] = v4
    var v12: Vector[Vector[Double]] = v11
    val v14: Vector[Vector[Double]] = v0.p1
    v8 = v8.updated(1, v2)
    val v21: Vector[Double] = v12(2)
    v8 = v8.updated(0, v0)
    v8 = v4
    val v24: Vector[Double] = v12(0)
    var v15: Vector[s0] = v8
    var v31: Vector[Vector[Double]] = v14
    v2 = v2.copy(p1 = v12)
    v31 = v31.updated(1, v7)
    val v17: s0 = v15(1)
    var v18: s0 = v17
    v2 = v2.copy(p0 = v10)
    val v26: Vector[Vector[Double]] = v18.p1
    v12 = v12.updated(2, v21)
    val v45: s0 = s0(v5, v31)
    v31 = v31.updated(0, v7)
    v18 = v18.copy(p1 = v31)
    val v59: Vector[Vector[Double]] = v17.p0
    v31 = v31.updated(1, v24)
    val v69: Vector[Vector[Double]] = v17.p1
    var v42: Vector[Vector[Double]] = v59
    v18 = v18.copy(p1 = v69)
    v15 = v15.updated(1, v45)
    val v33: Vector[Double] = v26(0)
    v2 = v2.copy(p0 = v42)
    v31 = v31.updated(1, v3)
    val v36: Vector[Vector[Double]] = v45.p0
    val v43: Vector[Vector[Double]] = v17.p1
    v2 = v2.copy(p1 = v43)
    var v46: Vector[Double] = v7
    val v67: Double = v46(0)
    v12 = v12.updated(0, v33)
    var v98: Double = v67
    v2 = v2.copy(p1 = v11)
    v3 = v3.updated(0, v98)
    v2 = v2.copy(p0 = v36)
    v18
  }
  def f32(v0: s0): s0 = {
    val v8: s0 = f50(v0)
    val v3: Vector[Vector[Double]] = v0.p0
    val v7: s0 = f50(v0)
    val v5: Vector[Vector[Double]] = v8.p0
    val v15: Vector[Vector[Double]] = v8.p1
    var v6: s0 = v8
    val v2: Vector[Vector[Double]] = v6.p1
    val v11: s0 = s0(v3, v2)
    val v19: Vector[Vector[Double]] = v11.p0
    v6 = v11
    val v9: s0 = f50(v8)
    val v20: s0 = f50(v7)
    val v24: Vector[Vector[Double]] = v8.p0
    var v12: s0 = v7
    var v25: s0 = v0
    val v18: s0 = f50(v0)
    var v10: Vector[Vector[Double]] = v15
    val v36: s0 = f50(v0)
    val v23: Vector[Double] = v3(1)
    val v17: Vector[Vector[Double]] = v25.p0
    val v14: s0 = f50(v0)
    val v22: s0 = f50(v7)
    var v29: Vector[Vector[Double]] = v17
    v10 = v10.updated(2, v23)
    v10 = v10.updated(1, v23)
    v29 = v29.updated(0, v23)
    v6 = v6.copy(p1 = v2)
    var v43: Vector[Double] = v23
    val v87: s0 = f50(v20)
    v6 = v6.copy(p1 = v15)
    v25 = v25.copy(p0 = v24)
    v25 = v25.copy(p0 = v5)
    val v57: Vector[Vector[Double]] = v22.p1
    var v34: s0 = v12
    v6 = v14
    v29 = v29.updated(0, v23)
    v6 = v6.copy(p0 = v29)
    val v64: s0 = f50(v9)
    var v35: Vector[Double] = v43
    val v30: s0 = f50(v87)
    val v82: Vector[Vector[Double]] = v36.p1
    var v56: s0 = v36
    val v98: Vector[Vector[Double]] = v14.p0
    v12 = v12.copy(p0 = v3)
    val v83: Vector[Vector[Double]] = v7.p1
    val v69: Vector[Vector[Double]] = v56.p1
    val v71: Vector[Vector[Double]] = v12.p0
    v12 = v12.copy(p1 = v82)
    val v54: Vector[Vector[Double]] = v6.p0
    v6 = v6.copy(p1 = v10)
    val v74: s0 = f50(v30)
    v29 = v29.updated(1, v35)
    val v99: s0 = f50(v74)
    val v283: Vector[Double] = v98(1)
    val v79: s0 = f50(v99)
    v6 = v6.copy(p1 = v57)
    val v61: Vector[Vector[Double]] = v64.p1
    v12 = v12.copy(p1 = v69)
    v34 = v34.copy(p1 = v83)
    val v140: s0 = f50(v99)
    var v150: Vector[Vector[Double]] = v82
    val v182: Vector[Vector[Double]] = v140.p0
    v56 = v56.copy(p0 = v71)
    v34 = v34.copy(p0 = v98)
    v56 = v56.copy(p1 = v150)
    v34 = v34.copy(p1 = v15)
    val v218: Vector[Vector[Double]] = v79.p0
    v25 = v25.copy(p0 = v54)
    v34 = v34.copy(p1 = v61)
    v34 = v34.copy(p0 = v19)
    v56 = v56.copy(p0 = v218)
    v29 = v29.updated(1, v283)
    v25 = v25.copy(p1 = v61)
    v56 = v18
    v34 = v34.copy(p0 = v182)
    v34
  }
  @noinline
  def f0(v0: Double, v1: Vector[s0]): Double = {
    var v6: Vector[s0] = v1
    var v4: Vector[s0] = v6
    val v9: s0 = v1(1)
    var v12: Vector[s0] = v4
    val v14: s0 = v12(0)
    val v3: s0 = f50(v9)
    val v10: Vector[Vector[Double]] = v14.p0
    v4 = v4.updated(1, v3)
    var v11: Vector[s0] = v6
    val v24: Vector[Vector[Vector[Double]]] = Vector(v10, v10, v10, v10, v10, v10)
    val v34: Vector[Vector[Double]] = v24(3)
    val v23: s0 = v4(0)
    val v22: s0 = f32(v23)
    v6 = v6.updated(1, v22)
    var v136: Vector[Vector[Double]] = v34
    val v49: Vector[Double] = v136(1)
    val v307: Double = v49(0)
    v6 = v11
    var v359: Double = v307
    v359
  }
  def benchmark(): Unit = {
    val v0: Double = 0.0
    val v1: Vector[s0] = Vector(s0(Vector(Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0))), s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0), Vector(10.0))))
    val start = nanoTime()
    var result: Double = [StructValue(Name(str='s0', ty=None), [[[1.0], [2.0]], [[3.0], [4.0], [5.0]]]), StructValue(Name(str='s0', ty=None), [[[6.0], [7.0]], [[8.0], [9.0], [10.0]]])]
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}