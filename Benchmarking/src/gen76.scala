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
  def f80(v0: s0): s0 = {
    var v6: s0 = v0
    val v1: Vector[s0] = Vector(v6, v0, v0, v0, v0, v6, v6)
    val v2: s0 = v1(0)
    val v4: s0 = v1(6)
    val v5: s0 = v1(3)
    val v3: Vector[Vector[Double]] = v2.p1
    var v7: Vector[Vector[Double]] = v3
    val v12: Vector[Double] = v3(0)
    var v8: Vector[Vector[Double]] = v3
    val v9: Vector[s0] = Vector(v4, v2, v2, v6, v0, v6)
    val v13: Vector[Double] = v7(1)
    val v14: Vector[Vector[Double]] = v2.p1
    v6 = v6.copy(p1 = v3)
    var v25: Vector[Vector[Double]] = v14
    v6 = v6.copy(p1 = v8)
    var v34: s0 = v0
    v6 = v6.copy(p1 = v3)
    val v11: s0 = v1(1)
    var v10: Vector[s0] = v9
    val v21: Vector[Vector[Double]] = v6.p0
    var v24: s0 = v5
    val v16: s0 = v10(5)
    v7 = v7.updated(0, v12)
    val v36: s0 = v9(2)
    v7 = v7.updated(2, v13)
    val v26: Vector[Vector[Vector[Double]]] = Vector(v21, v21, v21, v21, v21, v21, v21)
    var v15: Vector[Vector[Double]] = v25
    var v17: Vector[Double] = v13
    val v18: Vector[Vector[Double]] = v6.p1
    val v19: Vector[Vector[Double]] = v16.p0
    val v28: Vector[Vector[Double]] = v26(4)
    v7 = v7.updated(0, v17)
    v25 = v25.updated(0, v17)
    v7 = v7.updated(0, v13)
    val v43: Vector[Vector[Double]] = v26(6)
    var v29: Vector[Double] = v17
    v25 = v25.updated(2, v12)
    val v23: Vector[Vector[Double]] = v26(5)
    val v54: s0 = v10(4)
    var v44: Vector[s0] = v10
    val v33: Vector[Vector[s0]] = Vector(v9, v9, v10, v44)
    v24 = v24.copy(p0 = v43)
    val v32: Vector[Vector[Double]] = v11.p0
    v34 = v34.copy(p0 = v32)
    v6 = v6.copy(p1 = v15)
    val v37: Vector[Vector[Double]] = v54.p0
    val v62: Vector[Double] = v15(2)
    v34 = v34.copy(p0 = v23)
    v6 = v6.copy(p0 = v37)
    v24 = v2
    v34 = v34.copy(p0 = v19)
    v34 = v34.copy(p0 = v28)
    val v82: Vector[Vector[Double]] = v4.p1
    v24 = v24.copy(p1 = v8)
    v34 = v34.copy(p1 = v15)
    v24 = v24.copy(p1 = v15)
    v7 = v82
    v7 = v7.updated(1, v17)
    v24 = v24.copy(p1 = v18)
    v34 = v34.copy(p0 = v28)
    v6 = v36
    v10 = v10.updated(2, v16)
    val v116: Vector[Vector[Double]] = v34.p0
    var v41: Vector[Vector[Double]] = v14
    val v65: Vector[Vector[Double]] = v36.p0
    v34 = v34.copy(p0 = v23)
    v6 = v6.copy(p0 = v65)
    v25 = v25.updated(2, v62)
    var v74: Vector[Vector[s0]] = v33
    val v53: Vector[s0] = v74(0)
    v34 = v24
    v34 = v34.copy(p1 = v41)
    v41 = v41.updated(2, v29)
    val v121: s0 = v53(0)
    v6 = v6.copy(p0 = v116)
    v121
  }
  def f79(v0: s1): s1 = {
    var v1: s1 = v0
    val v4: s0 = v0.p0
    var v2: s1 = v0
    val v3: s0 = f80(v4)
    val v7: s0 = f80(v3)
    val v5: s0 = v2.p0
    val v8: s0 = f80(v4)
    var v11: s1 = v1
    v11 = v11.copy(p1 = v4)
    val v15: s0 = f80(v5)
    val v16: Vector[s1] = Vector(v2, v11, v2, v1, v0)
    val v30: s1 = v16(2)
    v2 = v2.copy(p1 = v8)
    val v45: s0 = v11.p1
    v1 = v1.copy(p1 = v45)
    v2 = v2.copy(p1 = v7)
    v1 = v1.copy(p0 = v3)
    v2 = v2.copy(p1 = v15)
    v30
  }
  def f63(v0: s0): s0 = {
    var v3: s0 = v0
    var v2: s0 = v0
    val v7: Vector[Vector[Double]] = v2.p1
    val v4: Vector[Vector[Double]] = v3.p1
    val v15: Vector[Vector[Double]] = v2.p0
    val v11: s0 = f80(v3)
    val v13: s0 = f80(v11)
    v2 = v2.copy(p0 = v15)
    v3 = v3.copy(p0 = v15)
    var v30: Vector[Vector[Double]] = v15
    val v59: s1 = s1(v0, v11)
    val v41: Vector[Vector[Double]] = v13.p1
    v2 = v2.copy(p1 = v4)
    v2 = v2.copy(p0 = v30)
    val v31: s0 = v59.p1
    val v21: s0 = f80(v31)
    val v36: Vector[Vector[Double]] = v21.p0
    v3 = v3.copy(p1 = v7)
    v2 = v2.copy(p1 = v41)
    v3 = v3.copy(p1 = v41)
    val v53: s0 = v59.p1
    val v89: s1 = f79(v59)
    var v70: s0 = v53
    val v43: s1 = f79(v89)
    val v141: s0 = v43.p0
    v70 = v70.copy(p0 = v36)
    v2 = v141
    v70
  }
  def f46(v0: s0): s0 = {
    var v1: s0 = v0
    val v7: s0 = f80(v1)
    val v3: s0 = f63(v7)
    var v2: s0 = v3
    var v5: s0 = v3
    val v8: Vector[Vector[Double]] = v7.p0
    val v11: Vector[Vector[Double]] = v5.p0
    val v9: Vector[Double] = v11(0)
    v5 = v5.copy(p0 = v8)
    val v12: Vector[Vector[Double]] = v3.p0
    val v10: s1 = s1(v5, v0)
    val v16: Vector[Double] = v8(1)
    val v14: s0 = v10.p1
    v1 = v1.copy(p0 = v12)
    val v25: Vector[Vector[Double]] = v7.p1
    var v34: Vector[Vector[Double]] = v25
    v1 = v1.copy(p0 = v8)
    var v21: s0 = v2
    var v32: Vector[Double] = v9
    val v27: s0 = f80(v14)
    val v49: Vector[Vector[Double]] = v21.p1
    val v53: Vector[Vector[Double]] = v5.p0
    val v26: Vector[Vector[Double]] = v27.p0
    val v61: Double = v9(0)
    var v76: Vector[Vector[Double]] = v49
    var v72: Vector[Double] = v16
    v5 = v5.copy(p1 = v76)
    v21 = v21.copy(p0 = v53)
    v72 = v72.updated(0, v61)
    v34 = v34.updated(0, v72)
    val v47: Vector[Double] = v11(1)
    v21 = v21.copy(p1 = v76)
    v76 = v76.updated(1, v32)
    v76 = v76.updated(1, v47)
    val v84: s0 = s0(v26, v34)
    v84
  }
  @noinline
  def f0(v0: s1, v1: Double): Double = {
    val v5: s0 = v0.p1
    var v6: s0 = v5
    var v11: s0 = v5
    val v9: s0 = v0.p1
    val v8: s0 = f46(v9)
    val v7: Vector[Vector[Double]] = v11.p1
    v11 = v6
    val v14: Vector[Double] = v7(1)
    val v43: s0 = f63(v8)
    val v13: Double = v14(0)
    val v22: Vector[Vector[Double]] = v43.p1
    var v51: Vector[Vector[Double]] = v22
    v6 = v6.copy(p1 = v51)
    v11 = v11.copy(p1 = v7)
    var v29: Double = v13
    v6 = v6.copy(p1 = v7)
    v29
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0))), s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0))))
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