import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f74(v0: s0): s0 = {
    var v3: s0 = v0
    v3 = v0
    var v6: s0 = v3
    val v5: Vector[Vector[Double]] = v3.p0
    var v1: s0 = v3
    val v9: Vector[Double] = v5(0)
    var v8: Vector[Vector[Double]] = v5
    val v10: Vector[Vector[Double]] = v3.p1
    v1 = v3
    val v7: Vector[Vector[Double]] = v0.p0
    val v11: Vector[Double] = v7(0)
    var v12: Vector[Vector[Double]] = v8
    val v13: s0 = s0(v12, v10)
    v1 = v1.copy(p0 = v10)
    var v21: Vector[Vector[Double]] = v10
    val v22: Vector[Vector[Double]] = v6.p1
    val v26: Vector[Vector[Double]] = v1.p1
    v3 = v3.copy(p0 = v7)
    val v17: Vector[Double] = v22(0)
    val v18: Vector[Vector[Double]] = v13.p0
    val v31: Vector[s0] = Vector(v6, v0, v6, v6, v1, v6)
    var v15: Vector[s0] = v31
    var v27: Vector[s0] = v15
    val v37: Vector[Vector[Double]] = v1.p1
    val v28: Vector[Vector[Double]] = v1.p0
    v3 = v3.copy(p0 = v37)
    v3 = v3.copy(p1 = v28)
    v21 = v21.updated(0, v17)
    v1 = v1.copy(p1 = v21)
    val v29: Vector[Vector[Double]] = v0.p1
    v1 = v1.copy(p0 = v5)
    val v30: Vector[Vector[Double]] = v3.p0
    v3 = v1
    var v24: Vector[Vector[Double]] = v12
    v24 = v24.updated(0, v11)
    v1 = v1.copy(p1 = v26)
    v6 = v0
    v21 = v21.updated(0, v17)
    val v34: Vector[Double] = v10(0)
    v6 = v6.copy(p0 = v24)
    v1 = v1.copy(p0 = v12)
    v27 = v27.updated(4, v1)
    val v64: s0 = v15(3)
    val v23: Vector[Vector[Double]] = v1.p0
    v12 = v12.updated(0, v17)
    v15 = v15.updated(4, v64)
    v1 = v1.copy(p0 = v22)
    v6 = v6.copy(p0 = v29)
    v1 = v1.copy(p1 = v29)
    v21 = v21.updated(0, v34)
    v27 = v27.updated(5, v3)
    val v289: s0 = v27(0)
    v3 = v3.copy(p1 = v23)
    v15 = v27
    v1 = v1.copy(p0 = v7)
    v6 = v6.copy(p0 = v23)
    v1 = v289
    v3 = v3.copy(p1 = v18)
    v21 = v21.updated(0, v9)
    v6 = v6.copy(p1 = v30)
    val v148: Vector[Vector[Double]] = v6.p1
    v6 = v6.copy(p0 = v148)
    v289
  }
  def f66(v0: s0): s0 = {
    var v1: s0 = v0
    val v6: Vector[Vector[Double]] = v1.p0
    var v4: s0 = v0
    val v2: Vector[Vector[Double]] = v0.p0
    val v5: Vector[Vector[Double]] = v4.p1
    v4 = v4.copy(p0 = v5)
    var v12: s0 = v0
    v12 = v1
    v4 = v4.copy(p0 = v6)
    val v30: Vector[Vector[Double]] = v12.p1
    val v28: s0 = f74(v4)
    v12 = v12.copy(p1 = v6)
    v1 = v1.copy(p0 = v30)
    val v31: s0 = f74(v28)
    val v35: Vector[Vector[Double]] = v4.p1
    v1 = v1.copy(p1 = v2)
    val v45: Vector[Vector[Double]] = v12.p0
    val v57: s0 = f74(v31)
    val v72: s0 = s0(v45, v5)
    val v105: s0 = f74(v72)
    v1 = v1.copy(p1 = v35)
    val v76: Vector[Vector[Double]] = v57.p1
    v1 = v1.copy(p0 = v76)
    v105
  }
  def f49(v0: s0): s0 = {
    val v1: s0 = f74(v0)
    var v5: s0 = v1
    v5
  }
  def f33(v0: s0): s0 = {
    val v3: Vector[s0] = Vector(v0, v0)
    val v6: s0 = f49(v0)
    var v4: s0 = v6
    val v1: Vector[Vector[Double]] = v0.p1
    val v5: Vector[Vector[Double]] = v4.p0
    val v9: s0 = v3(0)
    v4 = v4.copy(p0 = v1)
    var v24: Vector[s0] = v3
    v4 = v4.copy(p0 = v5)
    v4 = v4.copy(p0 = v1)
    val v16: Vector[Vector[Double]] = v6.p0
    val v12: Vector[Vector[Double]] = v6.p1
    var v10: Vector[s0] = v24
    val v26: Vector[Vector[Double]] = v9.p0
    val v21: Vector[Vector[Double]] = v0.p0
    val v17: Vector[Vector[Double]] = v4.p1
    val v13: s0 = f74(v6)
    val v15: Vector[Vector[Double]] = v6.p0
    val v19: Vector[Vector[Double]] = v9.p0
    val v23: s0 = f49(v9)
    val v77: s0 = v10(1)
    v4 = v4.copy(p0 = v26)
    v4 = v4.copy(p0 = v17)
    val v62: Vector[Double] = v15(0)
    val v36: Vector[Vector[Double]] = v4.p0
    val v28: Vector[Vector[Double]] = v23.p1
    val v41: Vector[Double] = v12(0)
    val v33: s0 = f49(v9)
    val v45: s0 = v3(1)
    v4 = v4.copy(p1 = v12)
    v4 = v4.copy(p0 = v21)
    val v27: s0 = f74(v45)
    val v38: Double = v62(0)
    v4 = v4.copy(p1 = v16)
    var v59: Double = v38
    v4 = v4.copy(p0 = v28)
    val v22: s0 = f66(v13)
    v4 = v4.copy(p1 = v17)
    v4 = v4.copy(p1 = v36)
    val v100: s0 = f74(v6)
    v4 = v4.copy(p0 = v19)
    val v79: s0 = s0(v15, v5)
    v4 = v4.copy(p0 = v21)
    val v44: Vector[Vector[Double]] = v79.p1
    var v48: Vector[Vector[Double]] = v44
    val v60: Double = v59 + v59
    var v58: Double = v60
    val v76: Double = v62(0)
    v4 = v4.copy(p1 = v5)
    val v70: Vector[Double] = Vector(v58)
    val v71: s0 = f74(v27)
    val v84: Double = v59 / v58
    val v89: Vector[s0] = Vector(v100, v79, v71, v33, v22, v77, v45)
    v4 = v4.copy(p1 = v12)
    val v136: Vector[Vector[Double]] = v79.p1
    var v83: Vector[Vector[Double]] = v136
    v4 = v4.copy(p0 = v28)
    v4 = v4.copy(p1 = v48)
    var v105: Vector[Double] = v70
    var v119: Vector[s0] = v89
    val v169: s0 = v119(2)
    v105 = v105.updated(0, v59)
    v4 = v4.copy(p1 = v83)
    var v90: Double = v76
    v48 = v48.updated(0, v105)
    v48 = v48.updated(0, v41)
    val v127: Double = v90 + v60
    val v224: Double = v84 * v127
    v58 = v224
    v169
  }
  @noinline
  def f0(v0: Vector[s0], v1: Double): Double = {
    var v8: Double = v1
    val v3: s0 = v0(0)
    val v6: s0 = f49(v3)
    val v4: Vector[Vector[Double]] = v3.p0
    val v7: s0 = f33(v6)
    val v12: Vector[Vector[Double]] = v7.p0
    val v16: s0 = s0(v4, v12)
    val v26: Vector[Vector[Double]] = v16.p0
    var v15: Double = v1
    var v23: Double = v8
    val v31: Vector[Double] = v26(0)
    var v56: Double = v23
    val v57: Double = v31(0)
    val v92: Vector[Double] = Vector(v56, v1, v1, v57, v15, v15)
    val v136: Vector[Vector[Double]] = Vector(v92, v92, v92, v92, v92, v92)
    val v104: Vector[Double] = v136(0)
    var v97: Double = v56
    var v126: Vector[Double] = v104
    var v125: Vector[Double] = v126
    var v242: Vector[Double] = v125
    val v257: Double = v242(2)
    v125 = v125.updated(4, v97)
    v257
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0))))
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