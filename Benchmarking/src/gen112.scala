import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f111(v0: s0): s0 = {
    val v4: Vector[Vector[Double]] = v0.p0
    val v5: Vector[Vector[Double]] = v0.p1
    val v6: Vector[Double] = v5(0)
    var v7: Vector[Vector[Double]] = v4
    val v2: s0 = s0(v4, v7)
    var v10: s0 = v0
    val v1: Vector[Vector[Double]] = v2.p1
    v10 = v10.copy(p1 = v1)
    v7 = v7.updated(0, v6)
    val v25: Vector[Vector[Double]] = v0.p0
    val v22: Vector[Vector[Double]] = v2.p0
    val v73: Vector[Vector[Double]] = v2.p1
    v10 = v10.copy(p1 = v25)
    val v32: Vector[s0] = Vector(v0, v10, v2, v10, v0, v2, v10)
    var v41: Vector[s0] = v32
    val v33: s0 = v41(0)
    val v71: Vector[Double] = v22(0)
    v7 = v7.updated(0, v71)
    v10 = v10.copy(p1 = v73)
    v33
  }
  def f109(v0: s0, v1: Vector[s0]): s0 = {
    val v3: s0 = v1(0)
    val v6: Vector[Vector[Double]] = v0.p1
    var v5: Vector[Vector[Double]] = v6
    v5 = v6
    val v4: Vector[Vector[Double]] = v3.p0
    val v2: s0 = s0(v4, v5)
    val v11: Vector[Vector[Double]] = v0.p0
    val v13: s0 = f111(v2)
    val v23: s0 = f111(v3)
    val v35: s0 = v1(0)
    val v21: s0 = f111(v13)
    val v16: Vector[Vector[Double]] = v23.p0
    val v15: Vector[Vector[Double]] = v35.p0
    val v24: Vector[Double] = v11(0)
    v5 = v5.updated(0, v24)
    var v17: Vector[Double] = v24
    var v42: s0 = v21
    v42 = v42.copy(p1 = v6)
    v5 = v5.updated(0, v24)
    val v50: Vector[Double] = v16(0)
    v42 = v42.copy(p1 = v6)
    val v68: Vector[Double] = v15(0)
    v5 = v5.updated(0, v50)
    v5 = v5.updated(0, v17)
    val v92: Double = v68(0)
    v17 = v17.updated(0, v92)
    v42
  }
  def f101(v0: Double, v1: s0): Double = {
    val v8: Vector[Vector[Double]] = v1.p0
    val v4: Vector[Double] = v8(0)
    val v11: Double = v4(0)
    val v3: s0 = f111(v1)
    var v6: Vector[Double] = v4
    val v9: Double = v4(0)
    val v12: s0 = f111(v3)
    val v19: Vector[Vector[Double]] = v12.p1
    v6 = v4
    val v56: Double = v9 + v11
    val v39: Vector[Double] = v19(0)
    v6 = v6.updated(0, v0)
    val v80: Double = v6(0)
    v6 = v4
    v6 = v39
    val v140: Double = v80 - v56
    v140
  }
  def f95(v0: s0): s0 = {
    val v1: Vector[s0] = Vector(v0)
    val v8: s0 = f109(v0, v1)
    val v9: s0 = f109(v8, v1)
    v9
  }
  def f90(v0: s0): s0 = {
    val v5: Vector[Vector[Double]] = v0.p1
    var v7: s0 = v0
    var v6: s0 = v7
    val v3: Vector[Vector[Vector[Double]]] = Vector(v5, v5, v5)
    var v4: Vector[Vector[Double]] = v5
    val v10: Vector[Vector[Double]] = v0.p0
    v7 = v7.copy(p0 = v5)
    var v2: s0 = v7
    val v8: s0 = f111(v6)
    val v1: s0 = f111(v2)
    val v9: s0 = f111(v1)
    val v15: Vector[Vector[Double]] = v3(2)
    v2 = v2.copy(p0 = v10)
    var v16: Vector[Vector[Double]] = v15
    var v12: Vector[Vector[Double]] = v16
    val v14: Vector[Vector[Double]] = v1.p1
    val v22: s0 = f111(v2)
    v7 = v1
    v6 = v6.copy(p0 = v12)
    val v38: Vector[Vector[Double]] = v9.p1
    val v17: Vector[Vector[Double]] = v3(2)
    v7 = v7.copy(p1 = v38)
    val v19: s0 = f111(v8)
    val v28: Vector[Vector[Double]] = v8.p0
    v7 = v7.copy(p0 = v28)
    var v60: Vector[Vector[Double]] = v17
    v7 = v19
    val v43: Vector[Vector[Double]] = v22.p0
    v2 = v2.copy(p1 = v4)
    v7 = v7.copy(p0 = v60)
    v6 = v6.copy(p1 = v5)
    v4 = v14
    v16 = v12
    v6 = v6.copy(p0 = v43)
    var v58: s0 = v1
    v58
  }
  def f83(v0: s0): s0 = {
    var v3: s0 = v0
    val v1: Vector[Vector[Double]] = v0.p0
    var v4: s0 = v3
    var v5: Vector[Vector[Double]] = v1
    val v2: Vector[Vector[Double]] = v3.p0
    var v12: s0 = v4
    var v27: s0 = v12
    val v15: Vector[Vector[Vector[Double]]] = Vector(v1, v2)
    val v13: Vector[Vector[Double]] = v27.p0
    val v23: s0 = f90(v12)
    val v24: s0 = f90(v23)
    v3 = v24
    val v38: Vector[Double] = v13(0)
    val v42: Vector[Vector[Double]] = v15(1)
    var v19: Vector[Double] = v38
    val v28: Vector[Vector[Double]] = v3.p0
    val v31: Double = v19(0)
    val v22: Vector[Vector[Double]] = v23.p1
    val v36: Double = v31 + v31
    val v122: s0 = s0(v5, v42)
    v19 = v19.updated(0, v36)
    var v50: s0 = v0
    val v47: Vector[Vector[Double]] = v50.p1
    v19 = v19.updated(0, v36)
    val v66: s0 = s0(v47, v28)
    v50 = v50.copy(p0 = v22)
    val v52: Vector[Vector[Double]] = v122.p1
    var v78: Vector[Double] = v19
    v50 = v50.copy(p1 = v52)
    v50 = v50.copy(p1 = v28)
    v5 = v5.updated(0, v78)
    val v217: s0 = f111(v66)
    v217
  }
  def f81(v0: s0): s0 = {
    val v7: Vector[Vector[Double]] = v0.p1
    val v4: s0 = f90(v0)
    val v5: Vector[Vector[Double]] = v4.p0
    val v6: Vector[Vector[Double]] = v0.p1
    val v1: Vector[s0] = Vector(v0, v0, v0, v4, v4, v0, v4)
    val v2: s0 = v1(6)
    var v3: s0 = v2
    val v9: s0 = v1(6)
    val v8: s0 = f83(v3)
    val v18: Vector[Vector[Double]] = v9.p0
    val v13: s0 = v1(6)
    val v14: s0 = f83(v13)
    val v39: s0 = f95(v8)
    var v26: s0 = v0
    v26 = v26.copy(p1 = v5)
    val v31: Vector[Vector[Double]] = v14.p0
    val v33: Vector[Vector[Double]] = v26.p1
    var v50: s0 = v39
    v50 = v50.copy(p0 = v18)
    v50 = v50.copy(p0 = v7)
    v26 = v26.copy(p1 = v31)
    val v80: Vector[Vector[Double]] = v26.p1
    v50 = v50.copy(p0 = v33)
    val v82: Vector[Vector[Double]] = v0.p1
    v26 = v26.copy(p1 = v31)
    v50 = v50.copy(p0 = v6)
    v3 = v3.copy(p1 = v82)
    v26 = v26.copy(p1 = v80)
    v50
  }
  @noinline
  def f0(v0: Vector[s0], v1: s0, v2: Double): Double = {
    val v4: s0 = v0(2)
    val v17: s0 = f81(v4)
    var v23: Double = v2
    val v21: s0 = v0(2)
    var v30: Double = v23
    val v20: Vector[Vector[Double]] = v17.p0
    val v39: Double = f101(v30, v21)
    var v29: Double = v23
    val v58: Vector[Double] = v20(0)
    val v61: Double = v58(0)
    var v54: Double = v29
    v29 = v61
    val v106: Vector[Double] = Vector(v54, v29, v2, v39, v54, v61, v2)
    var v195: Vector[Double] = v106
    val v114: Double = v195(6)
    v195 = v195.updated(1, v2)
    v114
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0))), s0(Vector(Vector(2.0)), Vector(Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0))))
    val v1: s0 = s0(Vector(Vector(6.0)), Vector(Vector(7.0)))
    val v2: Double = 8.0
    val start = nanoTime()
    var result: Double = 8.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}