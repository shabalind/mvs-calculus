import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f88(v0: s0): s0 = {
    val v5: Vector[s0] = Vector(v0, v0, v0, v0, v0, v0, v0)
    val v3: s0 = v5(3)
    var v1: Vector[s0] = v5
    var v7: s0 = v0
    val v4: Vector[Vector[Double]] = v7.p1
    val v6: Vector[Vector[Double]] = v3.p0
    v7 = v7.copy(p1 = v6)
    var v8: Vector[s0] = v1
    val v9: Vector[Double] = v4(0)
    v7 = v7.copy(p1 = v4)
    v8 = v8.updated(0, v7)
    val v12: s0 = v8(6)
    v8 = v8.updated(0, v3)
    v1 = v1.updated(0, v3)
    v8 = v8.updated(3, v0)
    var v11: Vector[Double] = v9
    val v13: Vector[Vector[Double]] = v0.p0
    v1 = v1.updated(4, v12)
    v7 = v7.copy(p1 = v4)
    val v50: Vector[Vector[Double]] = v12.p1
    v7 = v7.copy(p0 = v50)
    val v16: Vector[Vector[Double]] = v0.p0
    v1 = v1.updated(0, v7)
    var v10: s0 = v7
    val v19: Vector[Vector[Double]] = v3.p0
    val v18: Vector[Double] = v4(0)
    val v31: Vector[Vector[Double]] = v10.p0
    val v23: Vector[Vector[Double]] = Vector(v18, v11, v18, v9)
    v7 = v7.copy(p1 = v19)
    val v24: Vector[Vector[Double]] = v12.p0
    val v30: Vector[Vector[Double]] = v0.p1
    val v29: Vector[Vector[Double]] = v0.p1
    val v37: Vector[s0] = Vector(v0, v12, v10, v0, v12, v7)
    v8 = v8.updated(6, v3)
    var v43: Vector[Vector[Double]] = v13
    v10 = v10.copy(p1 = v43)
    var v26: Vector[s0] = v5
    val v60: Vector[Vector[Double]] = v0.p1
    val v41: s0 = v26(3)
    v10 = v10.copy(p1 = v50)
    v7 = v7.copy(p1 = v24)
    v7 = v10
    val v87: Vector[Vector[Double]] = v0.p0
    v10 = v10.copy(p0 = v31)
    v10 = v10.copy(p0 = v16)
    val v47: Vector[Vector[Double]] = v10.p1
    val v40: Vector[Double] = v23(1)
    var v108: Vector[s0] = v37
    v10 = v10.copy(p1 = v30)
    v10 = v10.copy(p0 = v29)
    v10 = v10.copy(p1 = v47)
    v7 = v7.copy(p0 = v60)
    v43 = v43.updated(0, v40)
    v10 = v10.copy(p1 = v50)
    val v162: s0 = v108(0)
    val v64: Vector[Vector[Double]] = v41.p0
    v10 = v10.copy(p1 = v4)
    v10 = v10.copy(p1 = v64)
    v7 = v7.copy(p1 = v87)
    v162
  }
  def f83(v0: s0): s0 = {
    var v4: s0 = v0
    val v3: s0 = f88(v0)
    val v2: Vector[Vector[Double]] = v0.p1
    val v7: Vector[Vector[Double]] = v3.p1
    var v5: Vector[Vector[Double]] = v7
    var v6: s0 = v0
    v4 = v4.copy(p0 = v5)
    val v16: s0 = f88(v6)
    val v9: Vector[Vector[Double]] = v4.p1
    var v1: Vector[Vector[Double]] = v5
    v6 = v6.copy(p1 = v7)
    val v25: Vector[Vector[Double]] = v3.p0
    val v10: s0 = f88(v3)
    val v8: Vector[Vector[Double]] = v4.p0
    v4 = v4.copy(p1 = v9)
    val v12: Vector[Double] = v7(0)
    v1 = v1.updated(0, v12)
    v4 = v4.copy(p0 = v1)
    val v18: s0 = f88(v4)
    v4 = v4.copy(p1 = v25)
    var v13: Vector[Double] = v12
    val v20: Vector[Vector[Double]] = v18.p0
    val v11: Vector[Vector[Double]] = v10.p0
    val v15: Vector[Double] = v7(0)
    val v19: s0 = s0(v9, v1)
    val v26: s0 = f88(v19)
    val v36: Vector[Double] = v8(0)
    val v37: Vector[Vector[Double]] = v6.p1
    val v32: Vector[Vector[Double]] = v16.p1
    val v56: s0 = s0(v2, v2)
    val v49: s0 = f88(v56)
    val v46: Double = v15(0)
    v5 = v5.updated(0, v12)
    val v68: Vector[Double] = v32(0)
    val v24: s0 = s0(v11, v20)
    val v41: Vector[Double] = Vector(v46)
    val v53: s0 = f88(v49)
    val v54: Vector[Vector[Double]] = v53.p1
    var v64: Vector[Double] = v12
    v1 = v1.updated(0, v41)
    v4 = v4.copy(p0 = v54)
    val v72: Vector[Vector[Double]] = v4.p1
    val v89: Vector[s0] = Vector(v26, v24, v49, v18)
    v6 = v26
    var v106: Vector[s0] = v89
    val v147: s0 = v106(1)
    v1 = v1.updated(0, v13)
    v5 = v5.updated(0, v68)
    v1 = v1.updated(0, v64)
    v4 = v4.copy(p1 = v72)
    v4 = v4.copy(p1 = v72)
    v4 = v4.copy(p1 = v37)
    v1 = v1.updated(0, v36)
    v147
  }
  def f79(v0: s0): s0 = {
    val v5: s0 = f83(v0)
    val v7: Vector[Vector[Double]] = v5.p0
    val v11: s0 = f83(v5)
    val v25: s0 = f88(v11)
    var v13: s0 = v11
    val v38: Vector[Vector[Double]] = v25.p0
    var v31: s0 = v0
    v31 = v31.copy(p0 = v7)
    val v41: Vector[Vector[Double]] = v13.p1
    v31 = v31.copy(p1 = v38)
    v31 = v31.copy(p1 = v41)
    v31
  }
  def f66(v0: Double): Double = {
    var v1: Double = v0
    var v6: Double = v0
    val v4: Vector[Double] = Vector(v0, v6)
    var v7: Double = v0
    v6 = v1
    val v8: Double = v4(1)
    val v5: Double = v4(0)
    v7 = v8
    val v13: Double = v7 * v0
    var v2: Double = v8
    val v42: Double = v4(1)
    val v15: Double = v4(1)
    val v14: Double = v4(0)
    var v10: Vector[Double] = v4
    v10 = v10.updated(1, v0)
    v10 = v10.updated(1, v14)
    val v11: Double = v4(0)
    var v9: Double = v13
    var v36: Vector[Double] = v4
    val v16: Vector[Vector[Double]] = Vector(v10)
    var v12: Vector[Vector[Double]] = v16
    val v19: Double = v36(0)
    v36 = v36.updated(1, v13)
    v10 = v10.updated(1, v15)
    val v32: Double = v19 + v42
    v12 = v12.updated(0, v36)
    val v26: Double = v10(1)
    var v21: Double = v32
    var v22: Double = v5
    v36 = v36.updated(1, v9)
    val v43: Vector[Double] = Vector(v15, v1, v26, v11, v9, v11)
    var v106: Vector[Double] = v43
    val v35: Vector[Double] = v16(0)
    v36 = v36.updated(1, v22)
    var v96: Vector[Double] = v106
    val v48: Double = v43(4)
    var v63: Double = v0
    var v37: Vector[Double] = v43
    v12 = v12.updated(0, v35)
    v37 = v37.updated(0, v0)
    var v58: Vector[Double] = v43
    v36 = v36.updated(1, v15)
    var v90: Vector[Double] = v106
    val v38: Vector[Double] = v12(0)
    v36 = v36.updated(1, v15)
    var v77: Vector[Double] = v58
    v10 = v38
    var v131: Vector[Double] = v37
    v37 = v37.updated(4, v63)
    var v67: Double = v48
    var v85: Vector[Double] = v96
    v85 = v77
    val v65: Double = v85(3)
    v12 = v12.updated(0, v36)
    v36 = v36.updated(1, v21)
    val v167: Double = v4(0)
    val v117: Double = v90(1)
    v90 = v90.updated(5, v167)
    v77 = v131
    val v123: Double = v36(1)
    val v216: Double = v9 / v117
    val v112: Double = v67 / v216
    v37 = v37.updated(5, v112)
    v106 = v106.updated(1, v2)
    v10 = v10.updated(1, v123)
    v36 = v36.updated(0, v0)
    val v95: Double = v65 / v32
    v95
  }
  def f44(v0: Double): Double = {
    val v3: Double = f66(v0)
    val v4: Double = f66(v3)
    var v8: Double = v4
    val v1: Double = f66(v4)
    val v7: Double = f66(v1)
    val v17: Vector[Double] = Vector(v8, v3, v0)
    val v11: Double = v17(0)
    val v13: Double = f66(v0)
    var v37: Vector[Double] = v17
    var v15: Vector[Double] = v37
    val v20: Double = v15(2)
    v15 = v15.updated(2, v11)
    val v25: Double = f66(v20)
    val v23: Double = v15(2)
    val v19: Double = f66(v7)
    var v32: Double = v23
    v37 = v37.updated(1, v0)
    var v34: Double = v32
    v37 = v37.updated(2, v34)
    v37 = v37.updated(0, v13)
    v15 = v15.updated(2, v19)
    val v42: Vector[Double] = Vector(v11)
    val v29: Double = v37(1)
    var v35: Vector[Double] = v42
    v37 = v37.updated(0, v25)
    val v75: Vector[Vector[Double]] = Vector(v35)
    v35 = v35.updated(0, v29)
    val v76: s0 = s0(v75, v75)
    val v84: Vector[Vector[Double]] = v76.p0
    val v95: s0 = f88(v76)
    val v104: Vector[Double] = v84(0)
    val v127: Vector[Vector[Double]] = v95.p0
    var v214: Vector[Vector[Double]] = v127
    v214 = v214.updated(0, v104)
    val v306: Vector[Double] = v214(0)
    val v242: Double = v306(0)
    v34 = v3
    v242
  }
  def f9(v0: Double, v1: s0): Double = {
    val v7: Vector[Vector[Double]] = v1.p1
    val v11: Vector[Double] = v7(0)
    val v24: Double = v11(0)
    val v45: Double = f44(v24)
    val v32: Double = f66(v45)
    val v33: Double = f66(v32)
    v33
  }
  @noinline
  def f0(v0: s0, v1: Double): Double = {
    var v4: Double = v1
    var v9: Double = v4
    val v5: s0 = f79(v0)
    val v3: Vector[Vector[Double]] = v5.p0
    val v6: Vector[Double] = v3(0)
    val v26: s0 = f79(v0)
    var v27: Vector[Double] = v6
    val v34: Double = v4 / v1
    v27 = v27.updated(0, v9)
    val v32: Double = v27(0)
    var v36: s0 = v26
    v27 = v27.updated(0, v34)
    val v55: Double = f9(v32, v36)
    v55
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