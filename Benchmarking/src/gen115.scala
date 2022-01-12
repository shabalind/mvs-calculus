import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f87(v0: s0): s0 = {
    val v5: Vector[Vector[Double]] = v0.p1
    val v2: Vector[Double] = v5(0)
    val v7: Vector[Vector[Double]] = v0.p0
    var v35: s0 = v0
    v35 = v35.copy(p1 = v5)
    var v24: s0 = v0
    v24 = v24.copy(p1 = v5)
    val v43: Vector[Vector[Double]] = v24.p1
    var v39: s0 = v0
    v39 = v39.copy(p1 = v5)
    val v20: Vector[Vector[Double]] = v0.p0
    val v26: Vector[Vector[Double]] = v24.p0
    v35 = v35.copy(p0 = v26)
    var v50: Vector[Vector[Double]] = v20
    v24 = v24.copy(p0 = v20)
    v39 = v35
    var v54: Vector[Vector[Double]] = v43
    val v58: Vector[Vector[Double]] = v0.p0
    v35 = v35.copy(p1 = v43)
    v39 = v39.copy(p1 = v54)
    v35 = v35.copy(p0 = v7)
    v35 = v24
    v24 = v24.copy(p0 = v50)
    val v112: Vector[Vector[Double]] = v0.p1
    v35 = v35.copy(p0 = v58)
    v39 = v39.copy(p1 = v43)
    var v79: Vector[Vector[Double]] = v43
    var v105: s0 = v39
    v39 = v39.copy(p1 = v112)
    v35 = v35.copy(p1 = v5)
    v79 = v79.updated(0, v2)
    val v252: Vector[Vector[Double]] = v39.p1
    v105 = v105.copy(p1 = v79)
    v39 = v39.copy(p1 = v252)
    v105
  }
  def f82(v0: s0, v1: s0): s0 = {
    var v7: s0 = v0
    val v10: s0 = f87(v1)
    val v4: Vector[Vector[Double]] = v0.p1
    val v5: s0 = f87(v1)
    val v8: Vector[Vector[Double]] = v7.p1
    var v3: Vector[Vector[Double]] = v8
    val v6: Vector[Double] = v3(0)
    var v9: Vector[Vector[Double]] = v4
    var v11: Vector[Double] = v6
    var v2: Vector[Double] = v11
    v9 = v9.updated(0, v6)
    val v15: Vector[Vector[Double]] = v5.p1
    v9 = v9.updated(0, v2)
    v7 = v7.copy(p1 = v15)
    v3 = v3.updated(0, v6)
    v7 = v7.copy(p1 = v3)
    v7 = v7.copy(p1 = v8)
    val v22: Double = v2(0)
    val v19: s0 = f87(v1)
    v2 = v11
    val v14: Vector[Double] = v4(0)
    v7 = v7.copy(p1 = v9)
    val v81: Vector[Vector[Double]] = Vector(v6, v2, v11, v14, v11)
    v9 = v8
    var v23: Double = v22
    val v42: Vector[Double] = v81(0)
    val v27: Vector[Vector[Double]] = v19.p0
    v3 = v15
    var v33: Vector[Double] = v14
    v7 = v7.copy(p1 = v9)
    val v26: Vector[Vector[Double]] = v10.p0
    var v21: Vector[Vector[Double]] = v26
    v7 = v7.copy(p0 = v21)
    v3 = v3.updated(0, v33)
    v9 = v9.updated(0, v2)
    v3 = v3.updated(0, v42)
    val v61: s0 = f87(v7)
    var v28: s0 = v61
    v2 = v2.updated(0, v23)
    v7 = v7.copy(p0 = v27)
    v28
  }
  def f59(v0: s0): s0 = {
    var v8: s0 = v0
    var v6: s0 = v0
    var v4: s0 = v0
    val v7: Vector[Vector[Double]] = v4.p1
    val v1: Vector[Vector[Double]] = v6.p0
    val v10: Vector[Double] = v7(0)
    val v5: s0 = f82(v4, v6)
    var v2: Vector[Vector[Double]] = v7
    val v3: Vector[Double] = v1(1)
    val v11: s0 = f87(v0)
    val v13: s0 = f87(v5)
    v6 = v6.copy(p0 = v1)
    val v12: Vector[Vector[Double]] = v0.p0
    v2 = v2.updated(0, v10)
    val v17: s0 = f82(v5, v11)
    v6 = v6.copy(p0 = v12)
    val v22: Vector[Vector[Double]] = v13.p0
    val v24: Vector[Double] = v12(0)
    val v34: s0 = f82(v17, v8)
    val v26: Vector[Vector[Double]] = v6.p0
    v8 = v8.copy(p0 = v12)
    var v30: Vector[Double] = v10
    var v16: Vector[Double] = v30
    var v27: Vector[Double] = v16
    val v31: Double = v3(0)
    v8 = v8.copy(p1 = v2)
    v8 = v8.copy(p0 = v26)
    v6 = v6.copy(p0 = v22)
    val v57: s0 = f87(v6)
    val v52: Vector[Vector[Double]] = v8.p1
    v6 = v6.copy(p1 = v52)
    v6 = v6.copy(p0 = v1)
    val v96: s0 = f82(v34, v8)
    v27 = v27.updated(0, v31)
    val v72: Vector[Vector[Double]] = v57.p1
    v4 = v4.copy(p1 = v72)
    val v62: Vector[Vector[Double]] = v0.p1
    v2 = v2.updated(0, v24)
    v8 = v8.copy(p0 = v26)
    v16 = v16.updated(0, v31)
    v2 = v2.updated(0, v27)
    v4 = v4.copy(p1 = v62)
    v96
  }
  def f52(v0: Vector[s0]): Vector[s0] = {
    val v4: s0 = v0(0)
    val v7: Vector[Vector[Double]] = v4.p0
    val v11: s0 = f82(v4, v4)
    val v5: Vector[Vector[Double]] = v11.p1
    var v2: Vector[s0] = v0
    val v9: s0 = f82(v4, v4)
    val v15: s0 = s0(v7, v5)
    val v18: s0 = f59(v15)
    val v20: s0 = f59(v9)
    v2 = v2.updated(0, v15)
    var v69: Vector[s0] = v2
    v69 = v69.updated(0, v20)
    v69 = v69.updated(0, v18)
    v69
  }
  @noinline
  def f0(v0: Vector[Vector[s0]], v1: Double): Double = {
    val v3: Vector[Double] = Vector(v1, v1, v1)
    val v7: Double = v3(2)
    val v22: Vector[s0] = v0(0)
    var v13: Double = v7
    var v10: Double = v1
    var v12: Double = v13
    val v28: Vector[s0] = f52(v22)
    val v15: s0 = v28(0)
    val v35: Double = v1 - v12
    val v55: Double = v35 * v12
    val v36: Vector[Vector[Double]] = v15.p0
    v13 = v10
    val v58: Vector[Double] = v36(0)
    val v34: Double = v58(0)
    val v87: Double = v55 * v34
    v87
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0)))), Vector(s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0)))), Vector(s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0)))))
    val v1: Double = 9.0
    val start = nanoTime()
    var result: Double = 9.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}