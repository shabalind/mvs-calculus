import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f32(v0: s0): s0 = {
    var v7: s0 = v0
    val v1: Vector[Vector[Double]] = v7.p1
    var v4: Vector[Vector[Double]] = v1
    var v6: s0 = v0
    var v2: s0 = v6
    val v5: Vector[Double] = v1(1)
    var v3: Vector[Double] = v5
    v4 = v4.updated(2, v5)
    val v11: Vector[Vector[Double]] = v6.p0
    v7 = v7.copy(p1 = v1)
    val v9: Double = v5(0)
    val v8: Vector[Double] = Vector(v9, v9, v9, v9, v9)
    var v18: Vector[Vector[Double]] = v11
    val v22: Vector[Vector[Double]] = v2.p1
    v6 = v6.copy(p0 = v11)
    var v10: Vector[Vector[Double]] = v22
    v18 = v18.updated(0, v3)
    v7 = v2
    val v26: s0 = s0(v18, v1)
    val v27: Double = v8(1)
    var v45: s0 = v0
    val v23: Vector[Double] = v4(0)
    val v28: Vector[Vector[Double]] = v2.p1
    v6 = v6.copy(p1 = v10)
    val v38: Vector[Vector[Double]] = v2.p1
    val v34: Vector[Double] = v28(1)
    val v41: Double = v23(0)
    v2 = v2.copy(p0 = v11)
    var v33: s0 = v0
    v6 = v6.copy(p1 = v38)
    v3 = v3.updated(0, v41)
    val v42: Vector[Double] = v18(1)
    val v116: Vector[Vector[Double]] = v26.p0
    val v112: Vector[Vector[Double]] = v0.p1
    val v109: Double = v9 + v41
    val v63: Vector[Vector[Double]] = v26.p0
    val v51: Vector[Vector[Double]] = v45.p0
    val v72: Vector[Vector[Double]] = v33.p0
    var v49: s0 = v7
    val v80: Vector[Vector[Double]] = v2.p1
    v33 = v33.copy(p0 = v11)
    val v70: s0 = s0(v72, v4)
    val v75: Vector[Vector[Double]] = v49.p0
    val v90: Vector[Vector[Double]] = v0.p0
    v33 = v33.copy(p0 = v18)
    v7 = v7.copy(p1 = v80)
    v33 = v33.copy(p0 = v51)
    var v175: Vector[Double] = v42
    v2 = v2.copy(p0 = v116)
    val v79: Vector[Vector[Double]] = v45.p1
    v45 = v45.copy(p0 = v75)
    val v117: Vector[Vector[Double]] = v33.p1
    v6 = v6.copy(p1 = v79)
    v3 = v3.updated(0, v109)
    v49 = v49.copy(p0 = v18)
    v18 = v18.updated(0, v5)
    v6 = v6.copy(p0 = v90)
    val v148: Vector[Vector[Double]] = v45.p0
    v10 = v10.updated(1, v34)
    v2 = v2.copy(p1 = v117)
    v18 = v18.updated(0, v175)
    v45 = v45.copy(p0 = v148)
    v49 = v49.copy(p1 = v112)
    v175 = v175.updated(0, v27)
    v45 = v45.copy(p0 = v63)
    v70
  }
  def f2(v0: s0): s0 = {
    val v4: s0 = f32(v0)
    val v2: s0 = f32(v0)
    var v1: s0 = v4
    var v6: s0 = v0
    var v5: s0 = v2
    val v9: s0 = f32(v6)
    var v8: s0 = v9
    var v11: s0 = v4
    val v13: Vector[Vector[Double]] = v11.p1
    v1 = v1.copy(p1 = v13)
    val v12: Vector[Double] = v13(0)
    v8 = v8.copy(p1 = v13)
    var v7: Vector[Vector[Double]] = v13
    val v15: Vector[Vector[Double]] = v5.p0
    val v19: Vector[Double] = v7(2)
    val v10: Vector[Vector[Double]] = v2.p1
    var v27: Vector[Vector[Double]] = v15
    val v33: Vector[Double] = v27(1)
    val v26: Double = v12(0)
    val v23: Vector[Vector[Double]] = v1.p1
    var v21: Double = v26
    v8 = v8.copy(p1 = v7)
    var v43: Vector[Double] = v33
    v8 = v8.copy(p1 = v10)
    val v31: s0 = f32(v5)
    val v29: Vector[Vector[Double]] = v0.p0
    v7 = v7.updated(2, v43)
    val v30: Vector[s0] = Vector(v31, v2, v8, v31, v31, v8, v1)
    val v32: Vector[Double] = v7(2)
    v43 = v43.updated(0, v21)
    val v37: Vector[Double] = v29(0)
    var v22: Vector[Vector[Double]] = v23
    val v28: s0 = f32(v2)
    var v36: Vector[Vector[Double]] = v15
    var v16: Vector[Vector[Double]] = v15
    v27 = v27.updated(1, v43)
    val v50: s0 = s0(v36, v22)
    v16 = v16.updated(1, v37)
    var v58: Double = v21
    v8 = v8.copy(p1 = v13)
    val v256: Vector[Vector[s0]] = Vector(v30, v30, v30, v30, v30, v30, v30)
    val v46: Double = v19(0)
    v7 = v7.updated(1, v43)
    val v68: Vector[s0] = v256(6)
    var v88: Vector[Vector[Double]] = v16
    val v98: Vector[Double] = v13(0)
    val v76: Double = v26 / v58
    val v99: Double = v26 / v46
    v11 = v50
    var v86: Vector[s0] = v68
    v58 = v76
    val v125: Vector[Double] = v7(0)
    var v103: Vector[Vector[Double]] = v88
    v5 = v5.copy(p0 = v103)
    val v106: Double = v125(0)
    var v80: Vector[Double] = v32
    v80 = v80.updated(0, v106)
    v11 = v11.copy(p0 = v16)
    v43 = v43.updated(0, v58)
    var v112: Double = v99
    v88 = v88.updated(0, v80)
    v8 = v8.copy(p1 = v7)
    v80 = v80.updated(0, v112)
    val v115: Vector[Vector[Double]] = v28.p1
    v22 = v22.updated(0, v98)
    v1 = v1.copy(p1 = v115)
    val v130: s0 = v86(1)
    v88 = v88.updated(1, v98)
    v22 = v22.updated(0, v43)
    v80 = v80.updated(0, v46)
    v130
  }
  @noinline
  def f0(v0: s0, v1: Double): Double = {
    val v4: s0 = f2(v0)
    val v8: Vector[Vector[Double]] = v4.p1
    val v9: Vector[Double] = v8(0)
    val v59: Double = v9(0)
    v59
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0)))
    val v1: Double = 5.0
    val start = nanoTime()
    var result: Double = 5.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}