import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f40(v0: Vector[s0]): Vector[s0] = {
    var v5: Vector[s0] = v0
    var v2: Vector[s0] = v5
    val v3: s0 = v0(0)
    var v8: s0 = v3
    val v7: Vector[Vector[Double]] = v8.p0
    val v1: Vector[Double] = v7(0)
    v2 = v2.updated(0, v3)
    val v6: Vector[Double] = v7(0)
    v5 = v5.updated(1, v8)
    v8 = v8.copy(p0 = v7)
    v2 = v2.updated(0, v8)
    v8 = v8.copy(p0 = v7)
    v8 = v8.copy(p0 = v7)
    var v10: Vector[Double] = v1
    val v11: Vector[Vector[Double]] = v3.p0
    val v14: Vector[Vector[Double]] = v3.p1
    val v12: Vector[Vector[Double]] = v8.p0
    val v13: Vector[Vector[Vector[Double]]] = Vector(v11, v7, v12, v11, v11, v7)
    var v20: Vector[Double] = v10
    var v19: Vector[Vector[Double]] = v7
    v8 = v8.copy(p1 = v14)
    val v27: Vector[Double] = v7(0)
    v8 = v8.copy(p1 = v14)
    v5 = v5.updated(0, v3)
    var v17: Vector[Vector[Vector[Double]]] = v13
    v19 = v12
    val v29: Vector[Vector[Double]] = v3.p1
    v8 = v8.copy(p1 = v14)
    val v21: Vector[Vector[Double]] = v8.p1
    val v24: Vector[Vector[Double]] = v3.p0
    val v40: Vector[Vector[Double]] = v17(2)
    var v18: Vector[Vector[Double]] = v40
    v8 = v8.copy(p0 = v24)
    v18 = v18.updated(0, v6)
    v8 = v8.copy(p0 = v19)
    val v43: s0 = v0(1)
    var v28: s0 = v3
    v28 = v28.copy(p1 = v29)
    v18 = v18.updated(0, v20)
    var v31: s0 = v43
    val v59: Double = v10(0)
    val v30: Vector[Vector[Double]] = v8.p1
    var v50: Vector[Vector[Double]] = v21
    v31 = v31.copy(p0 = v18)
    val v39: Vector[Vector[s0]] = Vector(v5, v2, v2, v5, v5, v0)
    val v72: s0 = v0(1)
    v20 = v1
    v8 = v8.copy(p0 = v40)
    var v63: Vector[Vector[Double]] = v30
    v63 = v63.updated(0, v1)
    val v56: s0 = v5(1)
    val v70: Vector[Vector[Double]] = v56.p1
    v10 = v10.updated(0, v59)
    v31 = v31.copy(p1 = v14)
    val v62: Vector[Vector[Double]] = v72.p1
    val v58: Vector[Vector[Double]] = v17(1)
    val v60: Vector[Vector[Double]] = v17(5)
    v8 = v8.copy(p1 = v14)
    v31 = v31.copy(p0 = v58)
    v18 = v18.updated(0, v27)
    v28 = v28.copy(p1 = v70)
    v31 = v31.copy(p1 = v63)
    val v33: Vector[Vector[Double]] = v28.p0
    val v76: s0 = s0(v58, v62)
    val v68: Double = v27(0)
    v8 = v8.copy(p0 = v60)
    val v77: Vector[s0] = v39(2)
    val v69: Double = v59 * v68
    v31 = v31.copy(p1 = v30)
    val v122: Vector[Vector[Double]] = v31.p0
    v20 = v20.updated(0, v69)
    v8 = v8.copy(p0 = v122)
    v63 = v50
    var v116: Vector[s0] = v2
    v116 = v116.updated(1, v76)
    v8 = v8.copy(p0 = v33)
    v116 = v77
    v116
  }
  def f37(v0: s0): s0 = {
    val v4: Vector[Vector[Double]] = v0.p1
    var v6: s0 = v0
    var v5: Vector[Vector[Double]] = v4
    v6 = v6.copy(p1 = v4)
    val v2: Vector[Double] = v5(1)
    v6 = v6.copy(p1 = v5)
    v6 = v6.copy(p1 = v5)
    val v3: Vector[Vector[Double]] = v6.p1
    v5 = v5.updated(0, v2)
    var v1: s0 = v6
    v1 = v1.copy(p1 = v3)
    v1 = v0
    val v38: Vector[Vector[Double]] = v1.p1
    v1 = v1.copy(p1 = v38)
    v1 = v1.copy(p1 = v38)
    var v46: s0 = v1
    v6 = v0
    v46
  }
  def f36(v0: s0, v1: s0): s0 = {
    val v2: Vector[Vector[Double]] = v1.p0
    var v5: Vector[Vector[Double]] = v2
    val v8: s0 = f37(v0)
    val v9: Vector[Double] = v2(0)
    val v15: Vector[Vector[Double]] = v8.p1
    v5 = v2
    var v12: Vector[Vector[Double]] = v15
    v12 = v12.updated(0, v9)
    val v33: Vector[Double] = v12(0)
    var v13: Vector[Vector[Double]] = v5
    v5 = v5.updated(0, v33)
    var v28: Vector[Vector[Double]] = v13
    val v70: s0 = s0(v28, v12)
    v12 = v12.updated(1, v33)
    v13 = v13.updated(0, v33)
    val v65: Vector[Double] = v28(0)
    v12 = v12.updated(0, v65)
    v70
  }
  def f35(v0: s0, v1: s0): s0 = {
    val v5: s0 = f36(v0, v0)
    val v4: s0 = f37(v1)
    val v6: s0 = f36(v0, v5)
    val v2: s0 = f37(v5)
    var v7: s0 = v0
    val v3: Vector[Vector[Double]] = v2.p0
    val v13: s0 = f37(v5)
    val v12: Vector[Vector[Double]] = v4.p0
    val v15: Vector[Vector[Double]] = v6.p0
    v7 = v7.copy(p0 = v12)
    val v24: s0 = f37(v7)
    val v22: s0 = f36(v5, v4)
    val v63: Vector[Double] = v12(0)
    var v36: Vector[Vector[Double]] = v3
    val v32: Vector[Vector[Double]] = v7.p1
    v36 = v36.updated(0, v63)
    val v17: Vector[Vector[Double]] = v5.p1
    v7 = v7.copy(p1 = v17)
    val v28: Vector[Vector[Double]] = v13.p1
    v7 = v7.copy(p0 = v15)
    val v87: Vector[Double] = v28(0)
    var v90: Vector[Vector[Double]] = v36
    val v43: Vector[Double] = v17(1)
    val v102: Vector[Vector[Double]] = v22.p0
    v7 = v7.copy(p0 = v90)
    var v85: s0 = v24
    val v134: Vector[Vector[Double]] = v13.p0
    v85 = v85.copy(p0 = v102)
    v85 = v85.copy(p1 = v32)
    val v137: s0 = f36(v85, v85)
    v7 = v7.copy(p0 = v90)
    v90 = v90.updated(0, v87)
    val v65: Vector[Vector[Double]] = v4.p1
    v36 = v134
    v90 = v15
    v7 = v7.copy(p1 = v65)
    v36 = v36.updated(0, v43)
    v7 = v7.copy(p0 = v36)
    v137
  }
  def f29(v0: Vector[s0]): Vector[s0] = {
    var v6: Vector[s0] = v0
    val v3: Vector[s0] = f40(v6)
    val v1: s0 = v0(1)
    val v4: s0 = f37(v1)
    val v13: s0 = v3(1)
    val v10: Vector[s0] = f40(v3)
    val v25: Vector[s0] = f40(v10)
    val v41: s0 = f35(v13, v4)
    val v22: Vector[s0] = f40(v25)
    v6 = v6.updated(1, v41)
    v22
  }
  @noinline
  def f0(v0: Vector[s0], v1: Double): Double = {
    val v8: Vector[s0] = f29(v0)
    val v11: s0 = v8(1)
    val v3: Double = v1 + v1
    val v30: Double = v3 + v1
    val v20: Vector[Vector[Double]] = v11.p0
    var v35: Vector[Vector[Double]] = v20
    val v40: Vector[Double] = v35(0)
    val v27: Double = v40(0)
    var v54: Vector[Double] = v40
    val v37: Double = v54(0)
    val v72: Double = v3 * v37
    v54 = v54.updated(0, v30)
    v54 = v54.updated(0, v37)
    var v148: Double = v27
    v54 = v54.updated(0, v148)
    v72
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0))), s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0))))
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