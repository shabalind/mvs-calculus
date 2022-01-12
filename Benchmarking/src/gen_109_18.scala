import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f11(v0: s0): s0 = {
    val v5: Vector[Vector[Double]] = v0.p1
    val v4: Vector[Vector[Vector[Double]]] = Vector(v5, v5)
    val v10: Vector[Vector[Double]] = v0.p1
    var v17: s0 = v0
    v17 = v17.copy(p0 = v10)
    var v24: s0 = v17
    val v31: Vector[Vector[Double]] = v17.p0
    val v13: Vector[Vector[Double]] = v0.p1
    val v26: Vector[Vector[Double]] = v24.p1
    v17 = v17.copy(p1 = v31)
    var v37: Vector[Vector[Vector[Double]]] = v4
    val v28: Vector[Vector[Double]] = v37(1)
    v17 = v17.copy(p0 = v28)
    v17 = v17.copy(p1 = v13)
    val v57: Vector[Vector[Double]] = v17.p1
    val v61: s0 = s0(v57, v26)
    v61
  }
  def f9(v0: s0, v1: s0): s0 = {
    val v4: Vector[Vector[Double]] = v1.p1
    val v7: Vector[Double] = v4(0)
    val v8: Vector[Vector[Double]] = v0.p1
    var v6: s0 = v1
    v6 = v6.copy(p0 = v4)
    val v17: s0 = f11(v0)
    var v15: s0 = v1
    val v20: Vector[Double] = v8(0)
    var v14: s0 = v17
    val v19: s0 = f11(v14)
    val v16: Vector[Vector[Double]] = v14.p0
    var v24: Vector[Vector[Double]] = v8
    var v29: s0 = v0
    val v38: Vector[Vector[Double]] = v19.p0
    val v31: s0 = s0(v38, v16)
    val v28: Vector[Vector[Double]] = v15.p1
    val v25: s0 = s0(v8, v24)
    v15 = v15.copy(p0 = v28)
    val v50: s0 = f11(v14)
    v24 = v24.updated(0, v20)
    v24 = v24.updated(0, v7)
    val v57: Vector[Vector[Double]] = v31.p1
    val v65: s0 = f11(v31)
    val v94: s0 = f11(v1)
    val v51: s0 = f11(v15)
    val v86: Vector[Vector[Double]] = v50.p1
    val v67: s0 = f11(v94)
    val v81: s0 = f11(v29)
    val v83: Vector[Vector[Double]] = v67.p1
    val v90: Vector[Vector[Double]] = v25.p1
    val v115: s0 = s0(v83, v90)
    val v79: s0 = f11(v6)
    v14 = v14.copy(p1 = v57)
    val v133: Vector[Vector[Double]] = v51.p0
    val v134: Vector[s0] = Vector(v115, v65, v115, v81)
    val v147: Vector[Vector[Double]] = v79.p1
    val v173: s0 = v134(1)
    v14 = v14.copy(p0 = v86)
    v29 = v29.copy(p1 = v133)
    val v178: s0 = f11(v173)
    v24 = v147
    v178
  }
  def f8(v0: s0): s0 = {
    var v6: s0 = v0
    val v5: Vector[Vector[Double]] = v6.p1
    val v1: Vector[Double] = v5(0)
    var v3: Vector[Double] = v1
    val v2: s0 = f11(v0)
    val v4: Vector[Double] = v5(0)
    var v8: s0 = v2
    val v18: s0 = f9(v6, v0)
    var v7: Vector[Vector[Double]] = v5
    v6 = v6.copy(p0 = v5)
    val v10: Double = v3(0)
    val v13: Vector[Vector[Double]] = v8.p0
    v8 = v8.copy(p1 = v13)
    val v9: Vector[Vector[Double]] = v0.p1
    var v11: Vector[Vector[Double]] = v7
    val v19: s0 = f9(v18, v8)
    val v12: Vector[Vector[Double]] = v19.p1
    val v17: Vector[Vector[Double]] = v18.p1
    var v22: Vector[Vector[Double]] = v12
    var v28: Vector[Vector[Double]] = v7
    v28 = v28.updated(0, v4)
    val v16: Double = v3(0)
    v3 = v3.updated(0, v16)
    val v35: Vector[Double] = v17(0)
    v7 = v7.updated(0, v3)
    v3 = v3.updated(0, v10)
    v28 = v28.updated(0, v35)
    v22 = v22.updated(0, v4)
    v8 = v8.copy(p1 = v9)
    val v49: Vector[Double] = v22(0)
    val v60: s0 = s0(v7, v28)
    v7 = v7.updated(0, v49)
    v8 = v8.copy(p0 = v11)
    v6 = v6.copy(p0 = v13)
    v6 = v6.copy(p1 = v7)
    v60
  }
  def f7(v0: s0, v1: s0): s0 = {
    val v6: s0 = f9(v1, v1)
    val v3: Vector[Vector[Double]] = v0.p0
    val v7: s0 = f9(v0, v6)
    val v2: Vector[Vector[Double]] = v1.p1
    val v11: s0 = f8(v1)
    val v13: s0 = f11(v0)
    val v12: s0 = s0(v2, v2)
    val v19: s0 = f9(v12, v13)
    val v21: s0 = f8(v7)
    val v38: Vector[Vector[Double]] = v19.p1
    val v30: s0 = f9(v7, v11)
    val v37: Vector[Vector[Double]] = v7.p1
    val v80: s0 = f9(v21, v6)
    var v39: s0 = v30
    v39 = v39.copy(p0 = v3)
    val v36: Vector[Vector[Double]] = v80.p0
    v39 = v39.copy(p0 = v38)
    v39 = v39.copy(p0 = v37)
    v39 = v39.copy(p1 = v36)
    v39
  }
  @noinline
  def f0(v0: s0, v1: Double): Double = {
    val v5: Vector[Vector[Double]] = v0.p1
    val v6: Vector[Vector[Double]] = v0.p0
    val v4: Vector[Vector[Double]] = v0.p0
    var v2: s0 = v0
    val v8: s0 = f9(v0, v0)
    val v12: s0 = f8(v0)
    v2 = v2.copy(p0 = v6)
    v2 = v2.copy(p0 = v5)
    val v10: s0 = f9(v2, v2)
    v2 = v2.copy(p0 = v6)
    v2 = v12
    val v3: Vector[Vector[Double]] = v10.p0
    val v18: Vector[Double] = v3(0)
    val v14: s0 = f11(v8)
    var v20: s0 = v14
    v20 = v20.copy(p0 = v3)
    var v39: s0 = v14
    val v44: Vector[Vector[Double]] = v20.p1
    val v51: Vector[Double] = v44(0)
    val v26: Vector[Vector[Double]] = v0.p0
    val v61: Vector[Vector[Double]] = v0.p1
    val v34: s0 = f9(v12, v20)
    var v35: Vector[Vector[Double]] = v4
    var v23: Vector[Vector[Double]] = v26
    val v97: Vector[Vector[Double]] = v2.p0
    var v43: s0 = v34
    val v53: Vector[Vector[Vector[Double]]] = Vector(v97, v97, v44, v61, v3)
    var v37: s0 = v12
    val v65: Vector[Vector[Double]] = v20.p1
    v2 = v2.copy(p1 = v65)
    val v73: s0 = f9(v39, v37)
    val v47: s0 = f7(v12, v43)
    val v68: Vector[Vector[Double]] = v73.p0
    val v78: Vector[Vector[Double]] = v47.p1
    var v104: Vector[Vector[Double]] = v5
    v39 = v39.copy(p0 = v78)
    v2 = v2.copy(p1 = v61)
    v20 = v20.copy(p1 = v35)
    v37 = v37.copy(p0 = v104)
    val v127: Vector[Vector[Double]] = v53(1)
    v104 = v104.updated(0, v18)
    v2 = v2.copy(p1 = v127)
    v23 = v23.updated(0, v51)
    v39 = v39.copy(p1 = v23)
    val v108: Double = v51(0)
    v2 = v2.copy(p0 = v68)
    v108
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0)), Vector(Vector(1.0)))
    val v1: Double = 2.0
    val start = nanoTime()
    var result: Double = 2.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}