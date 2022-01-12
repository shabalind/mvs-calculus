import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  case class s7 (
    p0: Vector[Vector[s1]],
    p1: s0
  )
  def f53(v0: s0): s0 = {
    val v6: Vector[Vector[Double]] = v0.p0
    val v2: Vector[Double] = v6(0)
    var v5: s0 = v0
    val v3: Double = v2(0)
    val v1: Vector[Vector[Double]] = v0.p0
    val v9: Vector[Vector[Double]] = v5.p0
    v5 = v5.copy(p0 = v1)
    var v8: Vector[Double] = v2
    var v11: Double = v3
    v8 = v8.updated(0, v11)
    v5 = v5.copy(p0 = v1)
    val v10: Vector[Vector[Double]] = v5.p1
    val v4: Vector[Double] = v10(0)
    v5 = v5.copy(p1 = v10)
    val v27: Vector[Vector[Double]] = v5.p1
    var v15: Vector[Vector[Double]] = v27
    val v19: Vector[Vector[Double]] = v5.p1
    val v14: Vector[Double] = v27(0)
    val v18: s0 = s0(v6, v19)
    var v24: s0 = v18
    val v50: Double = v4(0)
    v24 = v24.copy(p0 = v6)
    v8 = v8.updated(0, v50)
    v24 = v24.copy(p0 = v9)
    var v21: s0 = v18
    v24 = v24.copy(p1 = v10)
    var v17: Double = v50
    v21 = v21.copy(p0 = v9)
    var v31: Vector[Vector[Double]] = v15
    v5 = v5.copy(p1 = v31)
    val v49: Double = v4(0)
    v15 = v15.updated(0, v14)
    v8 = v8.updated(0, v17)
    v31 = v31.updated(0, v8)
    var v32: s0 = v24
    var v47: Double = v49
    val v61: Vector[Vector[Double]] = v24.p0
    v5 = v5.copy(p1 = v19)
    v24 = v21
    v31 = v31.updated(0, v8)
    v11 = v47
    v5 = v5.copy(p0 = v9)
    v21 = v21.copy(p0 = v61)
    v24 = v24.copy(p0 = v9)
    v5 = v5.copy(p1 = v27)
    v32
  }
  def f51(v0: s0): s0 = {
    val v2: s0 = f53(v0)
    val v5: s0 = f53(v0)
    val v4: s0 = f53(v0)
    val v6: Vector[Vector[Double]] = v5.p0
    val v3: Vector[Double] = v6(0)
    val v9: Vector[Vector[Double]] = v2.p0
    var v1: Vector[Double] = v3
    val v7: s0 = f53(v0)
    val v13: Vector[Vector[Double]] = v5.p1
    val v8: Vector[Vector[Double]] = v0.p1
    val v11: Vector[Vector[Double]] = v7.p1
    var v14: s0 = v4
    v14 = v14.copy(p0 = v6)
    var v12: s0 = v0
    v12 = v12.copy(p1 = v13)
    val v19: Vector[Double] = v6(0)
    v14 = v4
    var v23: Vector[Double] = v3
    var v25: Vector[Vector[Double]] = v11
    var v17: s0 = v14
    var v16: Vector[Vector[Double]] = v25
    var v28: s0 = v12
    val v24: Double = v19(0)
    val v22: Vector[Vector[Double]] = v4.p0
    var v33: Vector[Vector[Double]] = v16
    v12 = v12.copy(p1 = v25)
    v23 = v23.updated(0, v24)
    val v27: Vector[Vector[Double]] = v28.p0
    val v31: s0 = f53(v17)
    val v46: Vector[Double] = v27(1)
    val v30: Vector[Vector[Double]] = v14.p0
    v17 = v17.copy(p0 = v6)
    val v34: Vector[Vector[Double]] = v4.p1
    v33 = v33.updated(0, v1)
    val v32: Vector[Vector[Double]] = v0.p0
    v28 = v28.copy(p0 = v30)
    val v20: Vector[Vector[Double]] = v17.p1
    val v62: Double = v1(0)
    val v45: s0 = f53(v14)
    v14 = v14.copy(p1 = v8)
    v25 = v25.updated(0, v19)
    val v72: Vector[Double] = v25(0)
    var v43: s0 = v31
    var v71: Vector[Double] = v3
    var v57: Double = v62
    v71 = v71.updated(0, v57)
    v14 = v14.copy(p1 = v34)
    v33 = v33.updated(0, v72)
    v23 = v23.updated(0, v62)
    val v70: Vector[Vector[Double]] = v0.p0
    v43 = v45
    v12 = v12.copy(p0 = v9)
    v43 = v43.copy(p0 = v9)
    v14 = v2
    v14 = v14.copy(p0 = v27)
    v25 = v25.updated(0, v71)
    val v75: Vector[Double] = v32(1)
    val v86: Vector[Vector[Vector[Double]]] = Vector(v70, v22)
    v25 = v25.updated(0, v23)
    var v161: Vector[Vector[Vector[Double]]] = v86
    v25 = v20
    val v159: Vector[Vector[Double]] = v86(1)
    v1 = v1.updated(0, v57)
    v43 = v43.copy(p0 = v6)
    v43 = v43.copy(p1 = v8)
    v12 = v12.copy(p0 = v159)
    v25 = v25.updated(0, v46)
    val v74: s0 = f53(v43)
    var v96: Vector[Vector[Vector[Double]]] = v161
    val v90: Vector[Vector[Double]] = v96(1)
    v12 = v12.copy(p1 = v33)
    v33 = v33.updated(0, v75)
    v14 = v14.copy(p0 = v90)
    v74
  }
  def f36(v0: s7): s7 = {
    var v4: s7 = v0
    v4 = v0
    val v8: Vector[Vector[s1]] = v4.p0
    var v3: Vector[Vector[s1]] = v8
    val v19: s0 = v4.p1
    val v6: s0 = f51(v19)
    val v21: Vector[s1] = v8(1)
    val v10: s7 = s7(v3, v6)
    var v30: s7 = v0
    val v14: Vector[Vector[s1]] = v30.p0
    v4 = v0
    val v24: Vector[Vector[s1]] = v10.p0
    val v25: Vector[s1] = v14(2)
    var v37: Vector[Vector[s1]] = v24
    var v17: s7 = v10
    v30 = v30.copy(p0 = v24)
    var v38: Vector[Vector[s1]] = v37
    v3 = v3.updated(1, v21)
    v38 = v38.updated(1, v25)
    v3 = v38
    v17
  }
  def f4(v0: s7): s7 = {
    val v7: Vector[s7] = Vector(v0, v0, v0, v0)
    val v2: s7 = f36(v0)
    var v5: Vector[s7] = v7
    var v12: Vector[s7] = v5
    val v11: s7 = v12(3)
    val v19: s7 = f36(v2)
    v5 = v5.updated(1, v19)
    val v36: s7 = f36(v11)
    val v58: s7 = f36(v36)
    v12 = v12.updated(1, v58)
    val v85: s7 = f36(v58)
    v5 = v5.updated(2, v85)
    v85
  }
  @noinline
  def f0(v0: s7, v1: Double): Double = {
    var v4: s7 = v0
    var v3: s7 = v4
    val v6: s7 = f4(v0)
    val v5: Vector[Vector[s1]] = v6.p0
    v4 = v4.copy(p0 = v5)
    v3 = v3.copy(p0 = v5)
    val v11: s7 = f4(v3)
    val v12: s0 = v11.p1
    val v10: Vector[Vector[Double]] = v12.p1
    v3 = v3.copy(p1 = v12)
    val v54: s0 = v6.p1
    v4 = v4.copy(p1 = v54)
    v4 = v4.copy(p1 = v54)
    val v41: Vector[Double] = v10(0)
    val v49: Double = v41(0)
    v49
  }
  def benchmark(): Unit = {
    val v0: s7 = s7(Vector(Vector(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))), s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0)))), s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0))))), Vector(s1(Vector(s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0)))), s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0))))), Vector(s1(Vector(s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0))), s0(Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0)))), s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0)))))), s0(Vector(Vector(27.0), Vector(28.0)), Vector(Vector(29.0))))
    val v1: Double = 30.0
    val start = nanoTime()
    var result: Double = 30.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}