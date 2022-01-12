import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]]
  )
  def f13(v0: Double): Double = {
    val v6: Double = v0 * v0
    var v4: Double = v6
    val v3: Vector[Double] = Vector(v6, v0, v0, v0, v4)
    val v18: Double = v3(1)
    v18
  }
  def f9(v0: s0): s0 = {
    val v6: Vector[Vector[Double]] = v0.p0
    val v4: Vector[Vector[Double]] = v0.p0
    val v10: Vector[Vector[Double]] = v0.p1
    val v3: Vector[Vector[Double]] = v0.p1
    val v5: Vector[Vector[Double]] = v0.p2
    val v2: Vector[Vector[Vector[Double]]] = Vector(v3, v10, v3)
    val v1: Vector[Double] = v4(1)
    val v9: Vector[Vector[Double]] = v0.p2
    var v14: Vector[Vector[Double]] = v6
    val v12: Vector[Vector[Double]] = v0.p1
    v14 = v14.updated(0, v1)
    val v18: s0 = s0(v14, v12, v5)
    val v15: Vector[Vector[Double]] = v2(0)
    val v21: Vector[Vector[Double]] = v18.p0
    val v16: Vector[Vector[Double]] = v18.p0
    val v24: Vector[Double] = v21(2)
    val v30: Vector[Double] = v16(0)
    v14 = v14.updated(1, v24)
    v14 = v14.updated(0, v30)
    var v50: Vector[Double] = v1
    var v17: Vector[Vector[Double]] = v9
    var v62: Vector[Vector[Double]] = v16
    val v43: Vector[Vector[Double]] = v18.p0
    v62 = v62.updated(0, v50)
    val v20: Vector[Vector[Double]] = v0.p2
    var v31: s0 = v0
    v17 = v17.updated(1, v1)
    val v64: Vector[Vector[Double]] = v0.p2
    v31 = v31.copy(p0 = v62)
    v17 = v17.updated(1, v1)
    v14 = v14.updated(0, v24)
    val v44: Vector[Double] = v20(0)
    v14 = v14.updated(1, v1)
    v14 = v14.updated(1, v24)
    var v60: Vector[Vector[Double]] = v12
    v14 = v14.updated(1, v24)
    v31 = v31.copy(p2 = v17)
    var v135: Vector[Vector[Double]] = v15
    v17 = v17.updated(1, v1)
    v31 = v31.copy(p0 = v62)
    v31 = v31.copy(p0 = v4)
    val v80: Vector[Vector[Double]] = v18.p2
    v31 = v31.copy(p1 = v135)
    v31 = v31.copy(p0 = v16)
    var v68: s0 = v31
    val v98: Vector[Vector[Double]] = v31.p0
    var v86: s0 = v18
    val v79: Vector[Vector[Double]] = v86.p0
    val v77: Vector[Vector[Double]] = v68.p0
    v86 = v86.copy(p1 = v10)
    val v142: Vector[Vector[Double]] = v18.p2
    var v69: s0 = v31
    v14 = v14.updated(2, v44)
    v68 = v68.copy(p2 = v80)
    v69 = v69.copy(p2 = v17)
    v68 = v68.copy(p2 = v142)
    v31 = v31.copy(p0 = v98)
    v86 = v86.copy(p1 = v60)
    v86 = v86.copy(p0 = v21)
    v31 = v31.copy(p0 = v43)
    v69 = v69.copy(p0 = v77)
    v69 = v69.copy(p2 = v64)
    v69 = v69.copy(p0 = v79)
    v69
  }
  @noinline
  def f0(v0: s0, v1: Double): Double = {
    val v7: Vector[Vector[Double]] = v0.p0
    val v4: Vector[Vector[Double]] = v0.p1
    val v2: Vector[Double] = v7(2)
    val v11: Vector[Double] = v4(0)
    val v13: s0 = f9(v0)
    val v5: Vector[Double] = v7(0)
    val v15: Vector[Vector[Double]] = v13.p0
    var v8: Vector[Vector[Double]] = v15
    var v25: s0 = v13
    val v18: Vector[Double] = v8(0)
    v8 = v8.updated(2, v11)
    var v19: Vector[Vector[Double]] = v4
    var v26: s0 = v25
    val v12: Double = v18(0)
    v26 = v26.copy(p1 = v4)
    val v28: Double = f13(v12)
    v19 = v19.updated(0, v2)
    val v40: s0 = f9(v13)
    v25 = v25.copy(p0 = v15)
    val v24: Vector[Vector[Double]] = v25.p1
    val v29: Double = f13(v28)
    v26 = v26.copy(p1 = v24)
    val v45: Vector[Double] = v19(0)
    var v30: Vector[Double] = v5
    var v59: Vector[Vector[Double]] = v19
    val v33: Vector[Vector[Double]] = v25.p2
    v25 = v25.copy(p2 = v33)
    val v43: s0 = s0(v7, v59, v33)
    val v16: Vector[Vector[Double]] = v40.p2
    v25 = v25.copy(p0 = v7)
    val v38: Vector[Vector[Double]] = v25.p0
    v19 = v19.updated(0, v45)
    val v42: Vector[Double] = v33(0)
    v59 = v59.updated(0, v30)
    var v36: Vector[Vector[Double]] = v16
    val v46: Double = v45(0)
    val v60: Vector[Double] = v8(1)
    val v53: Vector[Vector[Double]] = v43.p2
    v25 = v25.copy(p2 = v33)
    v25 = v25.copy(p0 = v8)
    v36 = v53
    val v75: Double = f13(v46)
    var v85: Vector[Vector[Double]] = v33
    val v118: Double = v60(0)
    v59 = v59.updated(0, v11)
    v26 = v26.copy(p2 = v36)
    v26 = v26.copy(p0 = v38)
    v30 = v30.updated(0, v118)
    val v69: Vector[Vector[Double]] = v26.p1
    v19 = v69
    val v145: Double = f13(v29)
    val v97: Double = v75 * v118
    var v127: Vector[Vector[Double]] = v36
    var v152: Vector[Vector[Double]] = v127
    v25 = v25.copy(p2 = v85)
    v26 = v26.copy(p2 = v152)
    v36 = v36.updated(1, v42)
    v30 = v30.updated(0, v145)
    v97
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0)))
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