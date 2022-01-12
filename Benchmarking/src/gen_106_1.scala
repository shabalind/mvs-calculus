import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f22(v0: s0): s0 = {
    var v5: s0 = v0
    val v1: Vector[Vector[Double]] = v0.p0
    val v6: Vector[Vector[Double]] = v5.p0
    val v9: Vector[Vector[Double]] = v5.p1
    val v4: Vector[Double] = v9(0)
    var v2: s0 = v0
    val v20: Vector[Double] = v6(0)
    val v12: Vector[Vector[Double]] = v0.p0
    var v11: Vector[Vector[Double]] = v9
    var v27: s0 = v2
    v27 = v27.copy(p1 = v11)
    val v13: Vector[Double] = v1(0)
    v11 = v11.updated(0, v20)
    val v22: Vector[Vector[Double]] = v0.p1
    v11 = v11.updated(0, v13)
    v11 = v11.updated(0, v13)
    var v31: s0 = v0
    var v21: s0 = v27
    var v43: s0 = v31
    v21 = v21.copy(p0 = v12)
    val v63: Vector[Vector[Double]] = v21.p0
    val v73: Vector[Vector[Double]] = v0.p0
    val v131: Vector[s0] = Vector(v27, v43, v2, v31, v27, v27)
    v11 = v11.updated(0, v4)
    v43 = v31
    v2 = v2.copy(p0 = v63)
    var v118: Vector[Vector[Double]] = v1
    v11 = v11.updated(0, v4)
    v43 = v43.copy(p1 = v22)
    v31 = v31.copy(p0 = v118)
    val v111: s0 = v131(2)
    v43 = v43.copy(p1 = v9)
    v27 = v27.copy(p0 = v73)
    v111
  }
  def f12(v0: s0): s0 = {
    val v4: s0 = f22(v0)
    var v3: s0 = v4
    var v6: s0 = v4
    var v8: s0 = v3
    var v2: s0 = v6
    val v11: Vector[Vector[Double]] = v3.p0
    var v7: Vector[Vector[Double]] = v11
    v2 = v2.copy(p0 = v11)
    val v9: s0 = f22(v2)
    var v21: s0 = v4
    val v1: Vector[Vector[Double]] = v3.p1
    v21 = v8
    val v18: Vector[Vector[Vector[Double]]] = Vector(v1, v1, v1, v1, v1, v1, v1)
    val v20: Vector[Vector[Double]] = v4.p1
    var v19: Vector[Vector[Double]] = v20
    v8 = v8.copy(p1 = v19)
    v3 = v3.copy(p1 = v19)
    val v28: s0 = f22(v3)
    v8 = v28
    val v33: Vector[Vector[Double]] = v18(3)
    val v25: Vector[Vector[Double]] = v9.p0
    var v42: Vector[Vector[Double]] = v1
    val v41: Vector[Vector[Double]] = v21.p0
    val v43: Vector[Double] = v42(0)
    v7 = v7.updated(0, v43)
    val v27: Vector[Vector[Double]] = v8.p0
    val v37: Vector[Vector[Double]] = v2.p0
    val v87: s0 = s0(v37, v33)
    val v85: Vector[Double] = v1(0)
    v42 = v42.updated(0, v43)
    v19 = v19.updated(0, v85)
    val v59: s0 = f22(v87)
    v42 = v42.updated(0, v85)
    v21 = v21.copy(p0 = v25)
    val v47: s0 = f22(v59)
    var v46: Vector[Vector[Double]] = v27
    var v120: s0 = v47
    v3 = v3.copy(p0 = v25)
    v2 = v2.copy(p0 = v46)
    v8 = v8.copy(p1 = v20)
    v6 = v6.copy(p0 = v7)
    v2 = v2.copy(p0 = v41)
    val v258: s0 = f22(v120)
    v258
  }
  def f3(v0: s0): s0 = {
    var v5: s0 = v0
    val v4: Vector[Vector[Double]] = v5.p0
    v5 = v5.copy(p0 = v4)
    val v7: s0 = f22(v5)
    val v8: s0 = f22(v7)
    v5 = v5.copy(p0 = v4)
    val v6: Vector[Double] = v4(0)
    val v9: s0 = f22(v0)
    var v1: Vector[Vector[Double]] = v4
    var v10: Vector[Double] = v6
    val v3: s0 = f12(v0)
    val v15: Vector[Double] = v4(0)
    v1 = v1.updated(1, v15)
    val v11: Double = v15(0)
    v5 = v5.copy(p0 = v1)
    val v12: Vector[Vector[Double]] = v3.p0
    v1 = v1.updated(0, v15)
    val v13: s0 = f22(v7)
    v5 = v5.copy(p0 = v12)
    val v16: Vector[Vector[Double]] = v13.p0
    var v20: Vector[Double] = v15
    v10 = v20
    var v28: Vector[Vector[Double]] = v16
    val v29: Vector[Vector[Double]] = v0.p1
    var v26: Vector[Vector[Double]] = v28
    v5 = v5.copy(p0 = v4)
    val v34: Vector[Vector[Double]] = v9.p0
    val v18: Vector[Double] = v26(1)
    val v23: Vector[Vector[Double]] = v5.p1
    val v37: s0 = f22(v0)
    val v54: Double = v18(0)
    var v19: Double = v11
    val v32: Vector[Double] = v23(0)
    v5 = v5.copy(p0 = v12)
    v28 = v28.updated(0, v6)
    v5 = v5.copy(p1 = v23)
    v20 = v20.updated(0, v54)
    val v22: Vector[Vector[Double]] = v8.p1
    var v25: Vector[Double] = v32
    v26 = v26.updated(0, v10)
    val v47: Vector[Double] = v22(0)
    val v35: Vector[Vector[Double]] = v8.p0
    val v36: Double = v10(0)
    val v64: Vector[Double] = v35(1)
    v1 = v1.updated(0, v25)
    val v44: Vector[Vector[Double]] = v5.p0
    val v60: s0 = f22(v37)
    var v50: s0 = v60
    v10 = v10.updated(0, v36)
    v10 = v10.updated(0, v19)
    v50 = v50.copy(p1 = v29)
    v50 = v50.copy(p0 = v26)
    v28 = v44
    v10 = v10.updated(0, v11)
    v26 = v26.updated(1, v64)
    v26 = v26.updated(1, v47)
    v25 = v10
    v50 = v50.copy(p0 = v34)
    v50
  }
  @noinline
  def f0(v0: s0, v1: Double): Double = {
    var v3: s0 = v0
    val v9: Vector[Vector[Double]] = v0.p0
    var v7: Double = v1
    var v4: Vector[Vector[Double]] = v9
    val v6: Vector[Double] = v4(0)
    v3 = v3.copy(p0 = v9)
    val v12: Vector[Double] = v9(0)
    val v8: Double = v7 - v7
    val v5: s0 = f3(v3)
    v4 = v4.updated(0, v6)
    val v10: Vector[Vector[Double]] = v5.p1
    v4 = v4.updated(1, v12)
    v3 = v3.copy(p0 = v4)
    val v2: s0 = f22(v3)
    v3 = v3.copy(p1 = v10)
    val v19: Vector[Double] = v10(0)
    val v29: Vector[Vector[Double]] = v2.p1
    var v16: Double = v1
    v4 = v4.updated(1, v19)
    var v25: Vector[Double] = v12
    val v22: Vector[Double] = v29(0)
    v3 = v3.copy(p0 = v4)
    v4 = v4.updated(0, v25)
    v25 = v25.updated(0, v8)
    var v40: Vector[Vector[Double]] = v10
    val v53: Double = v19(0)
    val v26: Double = v53 - v16
    v40 = v40.updated(0, v6)
    v40 = v40.updated(0, v22)
    val v42: Vector[Double] = v40(0)
    val v60: Double = v42(0)
    v25 = v25.updated(0, v60)
    v25 = v25.updated(0, v16)
    v26
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0)))
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