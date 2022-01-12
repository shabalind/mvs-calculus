import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]]
  )
  def f38(v0: s0): s0 = {
    val v1: Vector[Vector[Double]] = v0.p0
    var v4: s0 = v0
    val v7: Vector[Vector[Double]] = v4.p0
    v4 = v4.copy(p0 = v7)
    val v8: Vector[Vector[Double]] = v0.p0
    var v5: s0 = v4
    var v3: Vector[Vector[Double]] = v1
    val v9: Vector[Vector[Double]] = v4.p0
    val v2: s0 = s0(v8)
    val v6: Vector[Double] = v1(0)
    val v15: Vector[Vector[Double]] = v4.p0
    val v11: Double = v6(0)
    val v13: Vector[Vector[Double]] = v5.p0
    val v14: Vector[Vector[Double]] = v0.p0
    var v12: Double = v11
    v5 = v5.copy(p0 = v8)
    val v37: Vector[Double] = v8(0)
    val v19: Double = v12 + v12
    val v18: Vector[Double] = v15(0)
    var v20: Vector[Vector[Double]] = v1
    v3 = v3.updated(0, v18)
    v4 = v4.copy(p0 = v3)
    val v17: Vector[Double] = v7(0)
    val v26: Vector[Vector[Double]] = v5.p0
    v4 = v4.copy(p0 = v9)
    v3 = v3.updated(0, v37)
    val v22: Vector[Vector[Vector[Double]]] = Vector(v26, v15)
    v3 = v7
    v5 = v5.copy(p0 = v20)
    val v25: Vector[Vector[Double]] = v4.p0
    val v34: Vector[Vector[Double]] = v4.p0
    var v27: Vector[Vector[Vector[Double]]] = v22
    var v16: Double = v11
    v4 = v4.copy(p0 = v34)
    v16 = v19
    v3 = v9
    var v42: s0 = v5
    var v43: Double = v16
    v4 = v4.copy(p0 = v13)
    var v29: s0 = v5
    v29 = v29.copy(p0 = v25)
    var v49: Vector[Double] = v18
    v5 = v5.copy(p0 = v14)
    var v87: Vector[Vector[Double]] = v9
    val v70: Vector[Vector[Double]] = v29.p0
    val v82: Vector[Vector[Double]] = v0.p0
    var v56: Vector[Double] = v6
    v42 = v42.copy(p0 = v9)
    val v85: Vector[Double] = v1(0)
    v56 = v6
    val v44: Vector[Vector[Double]] = v22(0)
    v87 = v87.updated(0, v56)
    v4 = v4.copy(p0 = v9)
    v5 = v5.copy(p0 = v20)
    v3 = v3.updated(0, v17)
    val v58: Vector[Vector[Double]] = v4.p0
    val v64: Vector[Vector[Double]] = v0.p0
    v42 = v42.copy(p0 = v70)
    v49 = v49.updated(0, v43)
    val v57: Vector[Vector[Double]] = v27(1)
    v42 = v42.copy(p0 = v58)
    var v79: Vector[Vector[Vector[Double]]] = v22
    val v32: Vector[Vector[Double]] = v79(0)
    v42 = v42.copy(p0 = v87)
    val v147: Vector[Vector[Double]] = v5.p0
    var v67: Vector[Vector[Double]] = v147
    v4 = v4.copy(p0 = v57)
    val v65: Vector[Vector[Double]] = v42.p0
    v87 = v87.updated(0, v49)
    val v48: Vector[Vector[Double]] = v29.p0
    v79 = v79.updated(0, v82)
    val v95: Vector[Vector[Double]] = v2.p0
    v42 = v42.copy(p0 = v44)
    val v68: Vector[Double] = v1(0)
    v87 = v87.updated(0, v68)
    v27 = v27.updated(0, v48)
    val v110: s0 = s0(v65)
    v3 = v3.updated(0, v56)
    v3 = v3.updated(0, v85)
    v29 = v29.copy(p0 = v64)
    v42 = v42.copy(p0 = v95)
    v42 = v42.copy(p0 = v32)
    v29 = v29.copy(p0 = v58)
    v5 = v5.copy(p0 = v67)
    v87 = v87.updated(0, v17)
    v110
  }
  def f33(v0: s0): s0 = {
    val v5: Vector[Vector[Double]] = v0.p0
    val v3: Vector[Vector[Double]] = v0.p0
    val v1: s0 = f38(v0)
    var v4: s0 = v1
    v4 = v4.copy(p0 = v3)
    var v13: s0 = v4
    v4 = v4.copy(p0 = v5)
    val v9: s0 = f38(v4)
    var v11: s0 = v1
    val v7: Vector[Vector[Double]] = v1.p0
    v4 = v4.copy(p0 = v7)
    val v14: s0 = f38(v11)
    val v21: s0 = f38(v11)
    v11 = v11.copy(p0 = v7)
    val v20: Vector[Vector[Double]] = v11.p0
    val v50: Vector[Vector[Double]] = v9.p0
    val v42: s0 = f38(v13)
    var v44: s0 = v42
    v13 = v13.copy(p0 = v50)
    val v71: s0 = f38(v14)
    val v51: s0 = f38(v0)
    val v39: s0 = f38(v71)
    v13 = v13.copy(p0 = v7)
    v4 = v4.copy(p0 = v5)
    v13 = v13.copy(p0 = v50)
    val v147: Vector[Vector[Double]] = v39.p0
    v4 = v4.copy(p0 = v147)
    val v98: Vector[s0] = Vector(v51, v42, v44, v71, v21, v1, v44)
    var v145: Vector[s0] = v98
    val v129: s0 = v145(5)
    v4 = v4.copy(p0 = v20)
    val v148: s0 = f38(v129)
    val v82: s0 = f38(v148)
    v82
  }
  def f31(v0: s0): s0 = {
    var v1: s0 = v0
    var v4: s0 = v1
    val v5: s0 = f33(v0)
    val v6: s0 = f38(v5)
    var v3: s0 = v0
    val v12: s0 = f33(v3)
    val v2: Vector[Vector[Double]] = v5.p0
    val v11: Vector[Vector[Double]] = v4.p0
    var v10: s0 = v12
    val v28: Vector[Double] = v2(0)
    val v13: Vector[Vector[Double]] = v5.p0
    v4 = v4.copy(p0 = v13)
    val v20: Vector[Vector[Double]] = v10.p0
    v3 = v3.copy(p0 = v20)
    val v57: s0 = f38(v10)
    v10 = v10.copy(p0 = v2)
    v10 = v10.copy(p0 = v2)
    val v30: s0 = f33(v57)
    val v31: Vector[Vector[Double]] = v6.p0
    val v35: s0 = f38(v30)
    val v36: Vector[Vector[Double]] = v10.p0
    v3 = v3.copy(p0 = v31)
    val v53: s0 = f33(v35)
    val v119: Vector[Double] = v36(0)
    val v50: Vector[Double] = v13(0)
    var v139: Vector[Vector[Double]] = v31
    val v98: s0 = f38(v35)
    val v116: Vector[Vector[Double]] = v98.p0
    val v62: Vector[Vector[Double]] = v53.p0
    val v99: s0 = s0(v139)
    v3 = v3.copy(p0 = v62)
    v3 = v3.copy(p0 = v20)
    v4 = v4.copy(p0 = v116)
    v3 = v3.copy(p0 = v11)
    v139 = v139.updated(0, v119)
    v139 = v139.updated(0, v28)
    v139 = v139.updated(0, v50)
    v99
  }
  @noinline
  def f0(v0: s0, v1: Double): Double = {
    val v6: s0 = f31(v0)
    val v3: Vector[Vector[Double]] = v6.p0
    val v24: Vector[Double] = v3(0)
    val v26: Double = v24(0)
    var v38: Double = v26
    val v71: Vector[Double] = v3(0)
    var v83: Vector[Double] = v71
    v83 = v83.updated(0, v38)
    var v57: Double = v38
    v83 = v83.updated(0, v57)
    val v176: Double = v83(0)
    val v97: Double = v176 + v38
    v97
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0)))
    val v1: Double = 1.0
    val start = nanoTime()
    var result: Double = 1.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}