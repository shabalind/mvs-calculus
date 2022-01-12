import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f8(v0: s0): s0 = {
    var v3: s0 = v0
    val v6: Vector[Vector[Double]] = v3.p0
    var v4: Vector[Vector[Double]] = v6
    val v7: Vector[Double] = v4(1)
    val v5: Vector[Vector[Double]] = v3.p0
    val v1: Vector[Vector[Double]] = Vector(v7, v7)
    v4 = v4.updated(1, v7)
    val v9: Double = v7(0)
    v3 = v3.copy(p0 = v6)
    val v8: Vector[Vector[Double]] = v3.p1
    v4 = v4.updated(1, v7)
    var v13: Vector[Double] = v7
    val v14: Vector[Double] = v6(0)
    val v10: Vector[Double] = v1(1)
    v3 = v3.copy(p1 = v8)
    v4 = v4.updated(0, v14)
    v13 = v13.updated(0, v9)
    val v20: Double = v7(0)
    v4 = v6
    val v35: Double = v14(0)
    val v17: Vector[Vector[Double]] = v3.p0
    val v21: Vector[Vector[Double]] = v3.p1
    val v15: Vector[Vector[Double]] = v3.p1
    v13 = v13.updated(0, v9)
    val v19: Vector[Vector[Double]] = v3.p1
    val v25: Vector[Double] = v19(0)
    v3 = v3.copy(p1 = v8)
    val v60: Vector[Vector[Double]] = v3.p0
    v3 = v3.copy(p0 = v1)
    v3 = v3.copy(p0 = v60)
    v3 = v3.copy(p0 = v17)
    val v30: Vector[Vector[Double]] = v0.p1
    val v39: Vector[Double] = v21(0)
    var v31: Vector[Vector[Double]] = v30
    val v42: Double = v35 * v20
    v4 = v4.updated(1, v25)
    var v22: Vector[Double] = v13
    var v36: Vector[Vector[Double]] = v15
    v3 = v3.copy(p0 = v6)
    var v24: Double = v9
    val v34: Double = v35 - v9
    val v50: Vector[Vector[Vector[Double]]] = Vector(v36, v15, v30, v8, v31, v31)
    v36 = v36.updated(0, v10)
    v36 = v36.updated(0, v14)
    var v32: Vector[Vector[Double]] = v31
    val v112: Vector[Vector[Double]] = v50(2)
    v31 = v32
    v3 = v3.copy(p1 = v31)
    val v87: Double = v10(0)
    val v74: Vector[Double] = Vector(v42, v24, v34, v20, v87)
    val v59: Double = v74(2)
    val v57: s0 = s0(v5, v112)
    v31 = v31.updated(0, v22)
    v31 = v31.updated(0, v39)
    v13 = v13.updated(0, v59)
    v3 = v3.copy(p1 = v21)
    v57
  }
  def f6(v0: s0, v1: s0, v2: Vector[s0], v3: s0, v4: Vector[s0], v5: s0, v6: s0, v7: s0): s0 = {
    val v9: Vector[Vector[Double]] = v3.p1
    val v16: Vector[Vector[Double]] = v3.p0
    val v8: Vector[Vector[Double]] = v7.p1
    val v23: Vector[Vector[Double]] = v5.p0
    val v28: s0 = f8(v0)
    val v31: Vector[Double] = v23(1)
    val v51: s0 = f8(v28)
    val v35: s0 = s0(v23, v9)
    val v91: s0 = f8(v51)
    val v76: Vector[Vector[Double]] = v35.p0
    val v60: s0 = s0(v76, v8)
    val v41: Vector[Vector[Double]] = v91.p1
    var v65: Vector[Vector[Double]] = v9
    var v197: s0 = v60
    v197 = v197.copy(p1 = v41)
    v197 = v197.copy(p0 = v16)
    v65 = v65.updated(0, v31)
    v197 = v197.copy(p1 = v65)
    v197
  }
  def f4(v0: Vector[s0], v1: s0, v2: Vector[s0], v3: s0, v4: Vector[s0], v5: s0, v6: Vector[s0], v7: Vector[s0]): s0 = {
    var v14: Vector[s0] = v2
    val v9: s0 = f8(v3)
    val v10: s0 = f8(v5)
    val v8: Vector[Vector[Double]] = v10.p0
    val v15: Vector[Double] = v8(1)
    v14 = v14.updated(0, v3)
    var v36: Vector[Double] = v15
    val v23: Vector[Vector[Double]] = v1.p0
    val v18: s0 = f8(v10)
    val v19: s0 = v6(0)
    val v20: s0 = f8(v9)
    val v28: s0 = f8(v10)
    val v46: s0 = v6(0)
    var v33: Vector[Vector[Double]] = v23
    v14 = v14.updated(2, v18)
    var v42: Vector[Double] = v36
    val v34: s0 = v14(2)
    val v31: Vector[Vector[Double]] = v28.p1
    val v24: Vector[Vector[Double]] = v34.p0
    v33 = v33.updated(0, v15)
    val v40: s0 = f8(v19)
    var v25: s0 = v40
    v14 = v14.updated(2, v20)
    val v32: Vector[Vector[Double]] = v5.p1
    v25 = v5
    val v85: Vector[Vector[Double]] = v25.p1
    var v91: Vector[Vector[Double]] = v85
    val v68: Vector[Vector[Double]] = v5.p1
    val v73: Vector[Vector[Double]] = v46.p0
    val v41: Vector[Vector[Double]] = v25.p0
    v25 = v25.copy(p1 = v32)
    v25 = v25.copy(p1 = v68)
    v25 = v25.copy(p0 = v73)
    val v82: s0 = s0(v24, v91)
    v91 = v91.updated(0, v42)
    v25 = v25.copy(p0 = v41)
    v25 = v25.copy(p1 = v31)
    v25 = v25.copy(p0 = v33)
    v82
  }
  @noinline
  def f0(v0: Vector[s0], v1: Vector[s0], v2: s0, v3: Vector[s0], v4: Double): Double = {
    var v8: Vector[s0] = v0
    val v5: s0 = v8(0)
    val v9: Vector[Vector[Double]] = v5.p0
    val v10: s0 = v3(1)
    val v11: Vector[Vector[Double]] = v5.p0
    val v15: s0 = v8(0)
    val v6: Vector[Double] = v11(0)
    val v27: s0 = v8(0)
    v8 = v8.updated(0, v15)
    val v12: Vector[Vector[Double]] = v2.p1
    val v13: s0 = f6(v2, v15, v0, v5, v3, v15, v5, v2)
    val v30: s0 = s0(v9, v12)
    val v25: s0 = f4(v1, v15, v3, v2, v1, v27, v1, v1)
    var v21: s0 = v30
    val v16: Vector[Vector[Double]] = v10.p1
    val v40: Vector[Vector[Double]] = v13.p1
    val v23: Double = v6(0)
    val v24: Double = v23 + v4
    v21 = v21.copy(p1 = v12)
    v21 = v21.copy(p1 = v40)
    v21 = v21.copy(p1 = v16)
    val v43: Vector[Vector[Double]] = v25.p1
    v21 = v21.copy(p1 = v43)
    v21 = v21.copy(p0 = v11)
    v21 = v21.copy(p1 = v43)
    v8 = v8.updated(0, v21)
    v24
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))))
    val v1: Vector[s0] = Vector(s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0))), s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0))))
    val v2: s0 = s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0)))
    val v3: Vector[s0] = Vector(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0))), s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0))), s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0))))
    val v4: Double = 21.0
    val start = nanoTime()
    var result: Double = 21.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}