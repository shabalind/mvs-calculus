import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f35(v0: s0): s0 = {
    val v4: Vector[Vector[Double]] = v0.p1
    var v6: s0 = v0
    v6 = v6.copy(p1 = v4)
    var v1: s0 = v0
    val v2: Vector[Vector[Double]] = v0.p1
    val v9: Vector[Vector[Double]] = v6.p1
    val v5: Vector[Double] = v4(2)
    v6 = v6.copy(p1 = v9)
    val v8: Vector[Vector[Double]] = v0.p0
    val v16: Vector[Double] = v9(1)
    var v12: Vector[Double] = v16
    val v14: Vector[Vector[Double]] = v0.p1
    val v34: Vector[Vector[Double]] = v1.p0
    var v15: Vector[Vector[Double]] = v8
    var v24: Vector[Vector[Double]] = v2
    var v18: Vector[Vector[Double]] = v8
    val v19: Vector[Vector[Double]] = v0.p0
    val v40: Vector[Double] = v19(1)
    v6 = v6.copy(p0 = v8)
    var v22: Vector[Vector[Double]] = v14
    v18 = v18.updated(0, v12)
    val v27: Vector[Double] = v15(0)
    val v36: Double = v40(0)
    v1 = v1.copy(p1 = v9)
    v1 = v1.copy(p1 = v9)
    var v37: s0 = v6
    val v30: Double = v27(0)
    var v54: Vector[Vector[Double]] = v18
    val v38: Vector[Vector[Double]] = v37.p0
    v12 = v12.updated(0, v36)
    v22 = v22.updated(0, v5)
    v6 = v6.copy(p0 = v15)
    val v119: Vector[Vector[Double]] = v6.p1
    v1 = v1.copy(p1 = v119)
    v1 = v1.copy(p1 = v9)
    v54 = v54.updated(1, v40)
    var v108: Vector[Vector[Double]] = v14
    val v46: Vector[Double] = v34(1)
    v1 = v1.copy(p0 = v19)
    val v65: Vector[Double] = v22(0)
    val v56: Vector[Vector[Double]] = v37.p0
    val v49: Vector[Vector[Double]] = v37.p1
    val v73: Vector[Double] = v34(1)
    v15 = v8
    val v155: Vector[Double] = v108(1)
    v24 = v24.updated(0, v73)
    val v78: Vector[Vector[Double]] = v6.p0
    v1 = v1.copy(p0 = v15)
    v37 = v37.copy(p1 = v24)
    v6 = v6.copy(p0 = v34)
    val v106: s0 = s0(v38, v49)
    val v68: Vector[Double] = v54(0)
    v12 = v12.updated(0, v30)
    v6 = v6.copy(p0 = v19)
    v24 = v24.updated(0, v68)
    v108 = v108.updated(0, v65)
    v1 = v1.copy(p0 = v38)
    v37 = v37.copy(p1 = v22)
    v54 = v54.updated(1, v46)
    v37 = v37.copy(p0 = v78)
    v6 = v6.copy(p0 = v56)
    v18 = v18.updated(0, v155)
    v106
  }
  def f32(v0: s0, v1: s0, v2: s0, v3: s0): s0 = {
    var v6: s0 = v2
    val v4: Vector[Vector[Double]] = v0.p0
    val v5: Vector[Vector[Double]] = v3.p0
    val v8: Vector[Double] = v5(0)
    v6 = v6.copy(p0 = v5)
    var v14: Vector[Vector[Double]] = v5
    v6 = v6.copy(p0 = v4)
    v6 = v6.copy(p0 = v14)
    v6 = v6.copy(p0 = v14)
    v14 = v14.updated(1, v8)
    v6
  }
  def f26(v0: s0): s0 = {
    val v2: s0 = f35(v0)
    val v1: s0 = f35(v0)
    val v14: s0 = f32(v0, v2, v2, v2)
    val v35: s0 = f32(v2, v2, v0, v0)
    val v21: s0 = f32(v1, v35, v14, v2)
    val v17: s0 = f32(v1, v21, v0, v14)
    val v18: s0 = f32(v2, v1, v1, v17)
    val v15: s0 = f32(v1, v14, v18, v35)
    val v28: Vector[Vector[Double]] = v35.p0
    val v42: s0 = f35(v17)
    val v53: s0 = f35(v14)
    val v29: s0 = f32(v0, v15, v21, v0)
    val v36: s0 = f32(v53, v42, v29, v29)
    val v43: Vector[Vector[Double]] = v35.p0
    var v70: s0 = v36
    v70 = v70.copy(p0 = v28)
    val v46: s0 = f35(v70)
    val v73: Vector[Vector[Double]] = v46.p1
    val v133: s0 = s0(v43, v73)
    v133
  }
  def f25(v0: s0): s0 = {
    val v3: s0 = f26(v0)
    val v5: Vector[Vector[Double]] = v0.p1
    val v7: Vector[Vector[Double]] = v0.p0
    var v1: Vector[Vector[Double]] = v5
    val v4: s0 = f32(v3, v3, v3, v0)
    val v2: s0 = f35(v4)
    val v8: Vector[Double] = v7(0)
    val v11: Double = v8(0)
    var v10: Vector[Double] = v8
    var v12: Vector[Vector[Double]] = v1
    var v16: Vector[Vector[Double]] = v12
    v12 = v12.updated(2, v10)
    val v29: s0 = f26(v2)
    v12 = v12.updated(0, v8)
    val v24: s0 = f32(v4, v3, v4, v2)
    val v19: Vector[Double] = v7(0)
    val v22: Vector[Double] = v5(1)
    val v38: Double = v22(0)
    val v41: s0 = f26(v29)
    val v42: s0 = f35(v29)
    v12 = v12.updated(1, v19)
    val v59: Double = v38 * v11
    val v44: Vector[Vector[Double]] = v4.p0
    v12 = v1
    val v115: Vector[Vector[Double]] = v24.p1
    var v80: s0 = v0
    var v112: Vector[Vector[Double]] = v44
    val v82: s0 = f35(v80)
    v80 = v80.copy(p0 = v44)
    v80 = v80.copy(p1 = v115)
    val v125: s0 = f32(v42, v82, v80, v80)
    val v120: Vector[Vector[Double]] = v125.p1
    val v67: Vector[Vector[Double]] = v125.p0
    val v101: Vector[Vector[Double]] = v0.p1
    v80 = v80.copy(p0 = v67)
    var v93: s0 = v2
    v80 = v80.copy(p1 = v16)
    val v87: Vector[Vector[Double]] = v93.p0
    v80 = v80.copy(p1 = v101)
    val v131: s0 = s0(v87, v120)
    val v78: Vector[Vector[Double]] = v41.p1
    val v148: Vector[Double] = v78(1)
    val v150: s0 = f32(v42, v131, v2, v2)
    v10 = v10.updated(0, v59)
    val v178: s0 = f26(v150)
    v93 = v93.copy(p0 = v112)
    v16 = v16.updated(0, v148)
    v178
  }
  @noinline
  def f0(v0: Vector[s0], v1: Double): Double = {
    val v7: s0 = v0(0)
    val v3: s0 = f25(v7)
    val v6: Vector[Vector[Double]] = v3.p0
    var v2: Double = v1
    val v40: Vector[Double] = v6(1)
    val v130: Double = v40(0)
    val v76: Double = v130 - v2
    var v195: Double = v76
    v195
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0))), s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0))), s0(Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0), Vector(14.0))))
    val v1: Double = 15.0
    val start = nanoTime()
    var result: Double = 15.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}