import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s2 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s4 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s5 (
    p0: s4,
    p1: s0
  )
  def f106(v0: s0): s0 = {
    var v1: s0 = v0
    var v4: s0 = v1
    val v3: Vector[Vector[Double]] = v0.p1
    val v2: Vector[Double] = v3(0)
    val v9: Vector[Vector[Double]] = v4.p0
    v1 = v1.copy(p1 = v3)
    v4 = v4.copy(p0 = v9)
    val v24: Vector[Vector[Double]] = v0.p0
    v4 = v4.copy(p1 = v3)
    val v8: Vector[Double] = v24(0)
    val v11: Vector[Vector[Double]] = v1.p0
    var v20: Vector[Vector[Double]] = v11
    val v29: Vector[Vector[Double]] = v4.p0
    val v19: Vector[Vector[Double]] = v4.p1
    val v58: Vector[Vector[Double]] = v0.p1
    v1 = v1.copy(p0 = v9)
    v4 = v4.copy(p1 = v58)
    val v37: Vector[Vector[Double]] = v1.p0
    var v35: Vector[Vector[Double]] = v24
    val v65: Vector[Double] = v9(0)
    v35 = v35.updated(0, v65)
    v35 = v35.updated(0, v2)
    v4 = v4.copy(p0 = v24)
    v4 = v4.copy(p0 = v29)
    val v49: Vector[Double] = v20(0)
    val v39: Vector[Vector[Double]] = v0.p1
    v4 = v4.copy(p0 = v37)
    v4 = v4.copy(p1 = v39)
    v35 = v35.updated(0, v49)
    v35 = v35.updated(0, v8)
    val v86: s0 = s0(v35, v19)
    v86
  }
  def f99(v0: s2): s2 = {
    var v4: s2 = v0
    var v5: s2 = v4
    val v3: Vector[s0] = v4.p1
    val v1: Vector[s0] = v0.p1
    var v7: Vector[s0] = v1
    val v2: s0 = v0.p0
    v7 = v7.updated(0, v2)
    v5 = v5.copy(p0 = v2)
    val v8: Vector[s0] = v0.p1
    val v9: s0 = f106(v2)
    var v6: s0 = v2
    var v11: s0 = v6
    var v13: s0 = v2
    v5 = v5.copy(p1 = v7)
    val v30: s0 = v3(0)
    val v15: Vector[s0] = v4.p1
    var v16: s2 = v4
    v7 = v7.updated(0, v13)
    val v19: Vector[Vector[Double]] = v6.p1
    val v25: s0 = f106(v13)
    val v47: Vector[s0] = v16.p1
    v13 = v13.copy(p1 = v19)
    val v12: s0 = v47(0)
    v7 = v7.updated(0, v30)
    v6 = v11
    v7 = v7.updated(0, v2)
    val v20: Vector[Double] = v19(1)
    var v34: Vector[Vector[Double]] = v19
    val v18: s0 = v15(0)
    var v23: Vector[s0] = v15
    var v22: Vector[Vector[Double]] = v19
    val v27: Vector[Double] = v34(0)
    v11 = v11.copy(p1 = v22)
    v13 = v13.copy(p1 = v19)
    val v28: s0 = f106(v30)
    v23 = v23.updated(0, v30)
    val v45: Vector[s0] = v4.p1
    val v29: Vector[Vector[Double]] = v12.p0
    val v32: Vector[s0] = v0.p1
    val v36: Vector[Vector[Double]] = v25.p0
    var v42: Vector[s0] = v47
    var v26: s0 = v11
    var v53: Vector[Vector[Double]] = v36
    v16 = v16.copy(p1 = v8)
    val v58: s0 = f106(v9)
    val v38: s0 = f106(v18)
    val v49: Vector[Vector[Double]] = v58.p1
    val v68: s0 = v45(0)
    v5 = v5.copy(p1 = v23)
    val v54: s2 = s2(v13, v45)
    var v48: Vector[Vector[Double]] = v49
    val v70: Vector[Vector[Double]] = v68.p0
    v7 = v7.updated(0, v25)
    val v143: Vector[Vector[Double]] = v38.p0
    val v73: Vector[Vector[Double]] = v68.p0
    v7 = v7.updated(0, v2)
    v53 = v73
    val v62: Vector[Vector[Double]] = v26.p1
    var v89: Vector[Vector[Double]] = v143
    v23 = v23.updated(0, v68)
    v11 = v11.copy(p1 = v48)
    val v60: s0 = s0(v53, v62)
    val v69: s0 = f106(v18)
    val v82: Vector[Vector[Double]] = v18.p1
    val v75: s2 = s2(v60, v15)
    val v55: Vector[Double] = v36(0)
    val v101: s0 = v5.p0
    var v74: Vector[Vector[Double]] = v19
    v11 = v11.copy(p0 = v29)
    v4 = v4.copy(p1 = v32)
    v13 = v13.copy(p1 = v48)
    v11 = v11.copy(p0 = v89)
    var v104: Vector[s0] = v47
    v11 = v11.copy(p0 = v70)
    v11 = v11.copy(p0 = v29)
    val v83: s0 = f106(v11)
    v23 = v23.updated(0, v69)
    v16 = v16.copy(p1 = v104)
    var v59: Vector[Vector[Double]] = v53
    v16 = v16.copy(p0 = v83)
    v48 = v48.updated(0, v27)
    v11 = v11.copy(p1 = v74)
    v11 = v11.copy(p1 = v34)
    val v137: Vector[Vector[Double]] = v101.p0
    v89 = v89.updated(0, v20)
    v13 = v13.copy(p0 = v59)
    v4 = v4.copy(p0 = v68)
    v26 = v26.copy(p0 = v137)
    v34 = v34.updated(0, v27)
    val v253: Vector[Vector[Double]] = v28.p1
    v4 = v4.copy(p1 = v32)
    v4 = v4.copy(p1 = v42)
    val v87: Vector[Vector[Vector[Double]]] = Vector(v49, v19, v253, v253, v253)
    v23 = v23.updated(0, v11)
    val v140: s0 = v54.p0
    val v109: Vector[Vector[Double]] = v87(0)
    v26 = v26.copy(p1 = v109)
    v5 = v5.copy(p0 = v140)
    v11 = v11.copy(p1 = v82)
    v6 = v6.copy(p1 = v62)
    v22 = v22.updated(1, v55)
    v16 = v16.copy(p0 = v28)
    v75
  }
  def f90(v0: s2): s2 = {
    val v2: s2 = f99(v0)
    val v1: Vector[s0] = v0.p1
    val v5: s2 = f99(v0)
    var v6: Vector[s0] = v1
    val v8: s0 = v2.p0
    val v9: s0 = f106(v8)
    val v19: s2 = f99(v5)
    val v16: s0 = f106(v8)
    val v13: s2 = f99(v19)
    v6 = v6.updated(0, v9)
    val v17: s0 = v13.p0
    val v36: s0 = f106(v16)
    val v28: s2 = s2(v36, v6)
    val v53: s0 = v13.p0
    v6 = v6.updated(0, v17)
    v6 = v6.updated(0, v53)
    v28
  }
  def f73(v0: Double): Double = {
    var v7: Double = v0
    var v3: Double = v0
    val v5: Vector[Double] = Vector(v3, v7, v3, v7, v7, v7)
    val v11: Double = v5(4)
    val v13: Double = v11 + v11
    v13
  }
  @noinline
  def f0(v0: s2, v1: s5, v2: s0, v3: Double): Double = {
    val v7: s2 = f90(v0)
    val v4: Vector[s0] = v7.p1
    val v12: s0 = v4(0)
    val v25: Vector[Vector[Double]] = v12.p1
    val v16: Vector[Double] = v25(0)
    var v24: Vector[Double] = v16
    val v43: Double = v16(0)
    val v39: Double = f73(v3)
    val v37: Double = v3 + v39
    v24 = v24.updated(0, v39)
    val v61: Double = v43 / v43
    val v72: Double = v24(0)
    val v77: Vector[Double] = Vector(v43, v37, v61, v72, v43, v37)
    val v116: Double = v77(3)
    v116
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0))), Vector(s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0)))))
    val v1: s5 = s5(s4(s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0))), Vector(s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0))))), s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0))))
    val v2: s0 = s0(Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0)))
    val v3: Double = 18.0
    val start = nanoTime()
    var result: Double = 18.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}