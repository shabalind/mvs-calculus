import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f46(v0: Double, v1: s0): s0 = {
    val v4: Vector[Vector[Double]] = v1.p1
    var v13: s0 = v1
    var v7: s0 = v1
    var v5: Vector[Vector[Double]] = v4
    val v9: Vector[Vector[Double]] = v13.p1
    val v2: Vector[Double] = v4(0)
    val v15: Vector[Vector[Double]] = Vector(v2)
    val v16: Vector[Vector[Double]] = v13.p0
    val v23: Double = v2(0)
    var v8: s0 = v13
    v8 = v8.copy(p1 = v5)
    v5 = v5.updated(1, v2)
    val v14: Vector[Vector[Double]] = v1.p1
    v5 = v5.updated(2, v2)
    v5 = v5.updated(1, v2)
    v8 = v8.copy(p0 = v16)
    var v20: Vector[Double] = v2
    var v11: Vector[Vector[Double]] = v15
    var v12: Vector[Vector[Double]] = v11
    val v22: Vector[Vector[Double]] = v7.p0
    v7 = v7.copy(p1 = v9)
    val v28: Vector[Vector[Vector[Double]]] = Vector(v9, v22, v16, v4)
    val v18: Vector[Vector[Double]] = v8.p1
    var v45: Vector[Vector[Double]] = v12
    v12 = v12.updated(0, v20)
    v45 = v45.updated(0, v2)
    var v30: Vector[Vector[Double]] = v9
    v8 = v8.copy(p1 = v30)
    v30 = v30.updated(0, v2)
    val v33: Vector[Vector[Double]] = v13.p1
    v45 = v45.updated(0, v2)
    val v24: Vector[Vector[Double]] = v7.p0
    v11 = v11.updated(0, v20)
    val v47: Vector[Double] = v24(2)
    v7 = v7.copy(p0 = v33)
    val v44: Vector[Vector[Double]] = v8.p0
    v8 = v8.copy(p1 = v4)
    val v38: Vector[Double] = v16(0)
    v5 = v5.updated(0, v2)
    v7 = v7.copy(p0 = v4)
    var v62: Vector[Vector[Double]] = v9
    v7 = v7.copy(p1 = v22)
    val v53: Vector[Vector[Double]] = v28(2)
    v62 = v62.updated(0, v47)
    v8 = v8.copy(p0 = v18)
    v12 = v12.updated(0, v2)
    var v71: Vector[Vector[Double]] = v44
    val v108: Double = v38(0)
    v13 = v13.copy(p1 = v9)
    v8 = v8.copy(p0 = v62)
    v7 = v7.copy(p0 = v62)
    var v97: Vector[Vector[Double]] = v62
    v13 = v13.copy(p1 = v14)
    val v41: Vector[Double] = v45(0)
    v8 = v8.copy(p0 = v71)
    var v146: Double = v23
    v20 = v20.updated(0, v146)
    v13 = v13.copy(p1 = v4)
    var v93: Vector[Vector[Double]] = v53
    v20 = v20.updated(0, v108)
    v13 = v13.copy(p1 = v97)
    v13 = v13.copy(p1 = v93)
    v97 = v97.updated(1, v41)
    v8
  }
  def f36(v0: s0): s0 = {
    val v7: Vector[Vector[Double]] = v0.p1
    val v6: Vector[Double] = v7(2)
    val v3: s0 = s0(v7, v7)
    val v4: Double = v6(0)
    val v5: Vector[Vector[Double]] = v0.p0
    val v8: s0 = f46(v4, v3)
    val v2: s0 = f46(v4, v0)
    val v10: s0 = f46(v4, v3)
    val v1: s0 = f46(v4, v10)
    var v9: Vector[Vector[Double]] = v5
    val v11: Double = v6(0)
    val v12: Vector[Vector[Double]] = v10.p0
    val v13: s0 = f46(v11, v8)
    var v15: Vector[Vector[Double]] = v9
    v9 = v9.updated(1, v6)
    val v22: Double = v6(0)
    val v18: Double = v6(0)
    val v19: Vector[Vector[Double]] = v1.p1
    v15 = v15.updated(2, v6)
    var v24: Vector[Double] = v6
    val v20: s0 = f46(v18, v2)
    val v21: Vector[Vector[Double]] = v1.p0
    v9 = v9.updated(2, v24)
    var v41: s0 = v20
    val v29: s0 = f46(v18, v13)
    val v28: Vector[Vector[Double]] = v41.p0
    v41 = v41.copy(p1 = v12)
    val v16: Double = v6(0)
    var v36: Vector[Double] = v6
    v24 = v24.updated(0, v18)
    v15 = v15.updated(1, v6)
    val v31: Vector[Double] = v9(1)
    val v47: Vector[Double] = v19(0)
    var v83: Vector[Double] = v47
    val v81: Double = v31(0)
    var v60: Vector[Vector[Double]] = v28
    v36 = v36.updated(0, v81)
    val v68: Double = v24(0)
    val v101: Vector[Vector[Double]] = v29.p1
    v36 = v36.updated(0, v11)
    var v87: Vector[Double] = v31
    v60 = v60.updated(0, v36)
    val v113: Double = v83(0)
    var v59: Vector[Double] = v83
    var v66: Vector[Vector[Double]] = v21
    val v50: Double = v59(0)
    v41 = v41.copy(p1 = v101)
    v36 = v36.updated(0, v22)
    val v71: Vector[Vector[Double]] = v41.p1
    v59 = v59.updated(0, v113)
    v66 = v15
    var v99: s0 = v1
    v9 = v9.updated(2, v36)
    var v63: Vector[Double] = v31
    var v75: Double = v68
    v83 = v83.updated(0, v18)
    val v120: Double = v6(0)
    val v142: s0 = f46(v50, v41)
    var v234: Double = v120
    v99 = v99.copy(p0 = v66)
    v24 = v87
    v41 = v41.copy(p1 = v19)
    v66 = v66.updated(2, v63)
    v24 = v24.updated(0, v234)
    v83 = v83.updated(0, v75)
    val v196: Vector[Double] = v5(1)
    v87 = v87.updated(0, v16)
    v41 = v41.copy(p1 = v71)
    val v180: Vector[s0] = Vector(v142, v99)
    v99 = v99.copy(p1 = v60)
    v63 = v196
    val v425: s0 = v180(1)
    v425
  }
  @noinline
  def f0(v0: s0, v1: Double): Double = {
    val v4: Vector[Vector[Double]] = v0.p0
    var v2: Double = v1
    var v7: s0 = v0
    val v5: Vector[Double] = v4(0)
    val v3: s0 = f36(v7)
    val v6: Vector[Vector[Double]] = v0.p0
    val v9: Vector[Vector[Double]] = v3.p1
    var v20: Double = v2
    v7 = v7.copy(p0 = v9)
    val v17: s0 = f36(v0)
    val v10: Vector[Vector[Double]] = v7.p1
    v7 = v7.copy(p1 = v10)
    val v23: s0 = f46(v20, v7)
    val v34: s0 = f36(v17)
    val v18: Vector[Vector[Double]] = v7.p1
    val v28: Vector[Vector[Double]] = v34.p1
    val v46: Vector[Vector[Double]] = v23.p0
    v7 = v7.copy(p0 = v18)
    v7 = v7.copy(p1 = v6)
    val v32: Vector[Vector[Double]] = v3.p1
    val v61: Vector[Double] = v6(1)
    val v130: Double = v5(0)
    var v71: Vector[Vector[Double]] = v46
    var v131: Double = v130
    v7 = v7.copy(p1 = v71)
    v71 = v71.updated(1, v61)
    var v124: Vector[Vector[Double]] = v28
    val v74: Vector[Vector[Vector[Double]]] = Vector(v124, v46, v18, v32)
    val v96: Vector[Vector[Double]] = v74(1)
    val v99: Vector[Double] = v96(0)
    val v55: s0 = f46(v1, v34)
    val v103: s0 = f36(v55)
    val v48: Double = v99(0)
    val v97: s0 = f46(v131, v103)
    val v72: Vector[Vector[Double]] = v97.p1
    v7 = v7.copy(p1 = v72)
    v48
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0)))
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