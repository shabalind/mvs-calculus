import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f24(v0: s0): s0 = {
    val v3: Vector[Vector[Double]] = v0.p0
    val v4: Vector[Vector[Double]] = v0.p1
    val v13: s0 = s0(v3, v4)
    v13
  }
  def f22(v0: s0): s0 = {
    val v1: s0 = f24(v0)
    val v2: s0 = f24(v1)
    val v3: Vector[Vector[Double]] = v0.p0
    var v5: Vector[Vector[Double]] = v3
    val v6: Vector[Double] = v5(1)
    v5 = v5.updated(0, v6)
    val v9: s0 = f24(v2)
    val v11: Vector[Vector[Double]] = v2.p0
    v5 = v5.updated(2, v6)
    val v16: s0 = f24(v9)
    val v12: s0 = f24(v0)
    val v8: s0 = f24(v12)
    v5 = v5.updated(1, v6)
    var v19: Vector[Double] = v6
    val v26: s0 = f24(v8)
    var v28: s0 = v26
    v28 = v28.copy(p0 = v11)
    v5 = v5.updated(2, v19)
    val v27: Vector[Vector[Double]] = v16.p0
    v28 = v28.copy(p0 = v5)
    v28 = v28.copy(p0 = v27)
    v5 = v5.updated(1, v6)
    v28 = v28.copy(p0 = v27)
    val v41: s0 = f24(v28)
    val v43: s0 = f24(v16)
    val v70: Vector[Vector[Double]] = v43.p1
    v28 = v28.copy(p1 = v70)
    v41
  }
  def f21(v0: Vector[Vector[s0]]): Vector[Vector[s0]] = {
    var v4: Vector[Vector[s0]] = v0
    val v3: Vector[Vector[Vector[s0]]] = Vector(v4, v0, v4, v0, v0, v0, v4)
    val v15: Vector[Vector[s0]] = v3(0)
    v15
  }
  def f20(v0: s0): s0 = {
    val v3: s0 = f22(v0)
    var v2: s0 = v0
    var v10: s0 = v0
    var v5: s0 = v0
    val v1: s0 = f22(v0)
    val v4: Vector[Vector[Double]] = v0.p1
    val v8: Vector[Vector[Double]] = v3.p1
    val v6: Vector[Vector[Double]] = v10.p1
    val v20: s0 = f22(v10)
    val v11: s0 = f24(v1)
    v10 = v10.copy(p1 = v4)
    v5 = v20
    val v12: s0 = f24(v5)
    val v19: Vector[Vector[Double]] = v3.p0
    v5 = v5.copy(p1 = v6)
    val v14: s0 = f22(v1)
    val v24: Vector[Vector[Double]] = v11.p1
    v5 = v5.copy(p1 = v24)
    val v25: s0 = f22(v2)
    v2 = v2.copy(p1 = v6)
    v2 = v2.copy(p0 = v19)
    val v68: s0 = f24(v12)
    val v28: Vector[Vector[Double]] = v2.p0
    val v48: Vector[Vector[Double]] = v14.p1
    v2 = v2.copy(p1 = v8)
    val v58: Vector[Vector[Double]] = v10.p0
    v5 = v5.copy(p0 = v28)
    v5 = v25
    v10 = v10.copy(p0 = v28)
    v10 = v10.copy(p1 = v48)
    v2 = v2.copy(p0 = v58)
    v68
  }
  def f15(v0: s0, v1: Vector[s0]): Vector[s0] = {
    v1
  }
  def f13(v0: s0): s0 = {
    val v3: s0 = f22(v0)
    val v5: s0 = f22(v0)
    val v1: Vector[s0] = Vector(v3, v0, v3, v3, v3, v3)
    val v2: s0 = v1(5)
    var v8: Vector[s0] = v1
    v8 = v1
    var v10: Vector[s0] = v8
    val v7: s0 = v1(4)
    var v13: Vector[s0] = v8
    v10 = v10.updated(5, v7)
    var v6: Vector[s0] = v1
    v6 = v6.updated(4, v3)
    var v12: Vector[s0] = v1
    val v16: s0 = v6(5)
    val v26: s0 = v12(2)
    val v9: s0 = v8(5)
    val v28: Vector[Vector[Double]] = v2.p1
    var v17: s0 = v5
    v10 = v12
    var v19: Vector[Vector[Double]] = v28
    var v33: s0 = v16
    val v23: Vector[Vector[Double]] = v9.p1
    val v20: s0 = v13(5)
    val v29: s0 = f22(v26)
    var v30: s0 = v16
    v17 = v17.copy(p1 = v19)
    var v46: s0 = v30
    val v48: s0 = v10(3)
    val v22: Vector[Vector[Double]] = v33.p1
    v46 = v46.copy(p1 = v23)
    v33 = v33.copy(p1 = v22)
    val v35: Vector[s0] = Vector(v29, v48, v20, v33)
    val v56: Vector[Double] = v19(0)
    val v25: Vector[Vector[Double]] = v46.p0
    v13 = v13.updated(4, v16)
    v17 = v17.copy(p1 = v23)
    v30 = v30.copy(p0 = v25)
    var v50: Vector[s0] = v35
    var v89: Vector[Vector[Double]] = v19
    v17 = v17.copy(p0 = v25)
    v46 = v46.copy(p1 = v89)
    var v102: Vector[s0] = v10
    v89 = v89.updated(0, v56)
    val v134: Vector[Vector[Double]] = v5.p1
    val v60: s0 = f20(v3)
    v12 = v12.updated(3, v60)
    val v78: s0 = v102(2)
    v8 = v8.updated(4, v78)
    v10 = v10.updated(1, v17)
    val v85: s0 = f20(v48)
    v17 = v17.copy(p1 = v134)
    v50 = v50.updated(3, v2)
    v12 = v12.updated(3, v85)
    val v122: s0 = v50(1)
    v122
  }
  def f6(v0: Vector[s0]): Vector[s0] = {
    var v4: Vector[s0] = v0
    val v6: s0 = v4(0)
    val v2: s0 = f13(v6)
    val v5: Vector[Vector[Double]] = v2.p1
    val v7: s0 = f24(v2)
    var v9: s0 = v6
    var v3: s0 = v7
    v4 = v4.updated(0, v3)
    val v15: s0 = f22(v7)
    val v8: s0 = f13(v15)
    v4 = v4.updated(0, v8)
    val v14: s0 = f20(v7)
    val v40: Vector[Vector[Double]] = v8.p0
    v3 = v3.copy(p0 = v40)
    val v29: s0 = f13(v6)
    var v19: Vector[s0] = v4
    val v24: Vector[Vector[Double]] = v29.p1
    v9 = v9.copy(p1 = v5)
    val v36: s0 = f24(v9)
    val v39: Vector[Vector[Double]] = v8.p0
    val v31: s0 = f24(v3)
    v9 = v9.copy(p0 = v39)
    val v21: Vector[Vector[Double]] = v29.p0
    val v30: Vector[Vector[Double]] = v15.p1
    val v46: Vector[Vector[Double]] = v9.p0
    val v64: Vector[s0] = f15(v14, v19)
    v4 = v4.updated(0, v36)
    v4 = v0
    v3 = v3.copy(p1 = v24)
    v4 = v4.updated(0, v31)
    v9 = v9.copy(p1 = v30)
    v9 = v9.copy(p0 = v46)
    val v69: s0 = f20(v7)
    v9 = v9.copy(p0 = v21)
    v4 = v4.updated(0, v69)
    v64
  }
  @noinline
  def f0(v0: Vector[Vector[s0]], v1: Double): Double = {
    val v2: Vector[Vector[s0]] = f21(v0)
    val v7: Vector[s0] = v2(0)
    val v19: Vector[s0] = f6(v7)
    val v21: s0 = v19(0)
    val v23: Vector[Vector[Double]] = v21.p0
    val v80: Vector[Double] = v23(0)
    val v215: Double = v80(0)
    v215
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0)))), Vector(s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0)))), Vector(s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0)))))
    val v1: Double = 12.0
    val start = nanoTime()
    var result: Double = 12.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}