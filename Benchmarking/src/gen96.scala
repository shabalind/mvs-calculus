import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Double],
    p1: Vector[Vector[Double]]
  )
  def f7(v0: s0): s0 = {
    val v4: Vector[Double] = v0.p0
    val v3: Vector[Vector[Double]] = v0.p1
    val v7: Vector[Double] = v0.p0
    val v11: Vector[Double] = v3(0)
    val v1: Vector[Vector[Double]] = v0.p1
    var v8: s0 = v0
    var v6: Vector[Vector[Double]] = v3
    var v13: Vector[Vector[Double]] = v6
    v6 = v6.updated(0, v4)
    v6 = v6.updated(0, v7)
    val v5: Vector[Vector[Double]] = v0.p1
    v8 = v8.copy(p1 = v13)
    val v15: Vector[Double] = v6(1)
    v8 = v8.copy(p1 = v3)
    v8 = v8.copy(p1 = v6)
    v8 = v8.copy(p1 = v5)
    val v10: Vector[Double] = v5(0)
    val v9: Vector[Double] = v0.p0
    val v12: Vector[Double] = v3(0)
    var v27: Vector[Vector[Double]] = v13
    v6 = v1
    v8 = v8.copy(p0 = v10)
    var v40: Vector[Vector[Double]] = v1
    val v30: Vector[Double] = v40(1)
    v27 = v27.updated(1, v4)
    v13 = v13.updated(1, v4)
    val v36: Vector[Double] = v27(0)
    var v43: s0 = v8
    val v53: Vector[Vector[Double]] = Vector(v15, v36, v10)
    v43 = v43.copy(p0 = v12)
    val v46: Vector[Double] = v53(2)
    val v69: Vector[Vector[Double]] = v43.p1
    v43 = v43.copy(p0 = v11)
    var v71: Vector[Vector[Double]] = v53
    val v76: Vector[Double] = v5(1)
    v40 = v40.updated(0, v46)
    val v72: Vector[Double] = v71(1)
    v8 = v8.copy(p0 = v76)
    val v94: Vector[Vector[Double]] = v8.p1
    v27 = v27.updated(1, v9)
    v43 = v43.copy(p1 = v3)
    val v211: s0 = s0(v72, v94)
    v13 = v69
    v8 = v8.copy(p0 = v30)
    v211
  }
  def f5(v0: s0): s0 = {
    var v6: s0 = v0
    val v7: Vector[Vector[Double]] = v0.p1
    val v2: Vector[Double] = v6.p0
    val v5: Vector[Double] = v7(1)
    v6 = v6.copy(p1 = v7)
    val v8: Double = v5(0)
    var v4: Double = v8
    val v1: s0 = s0(v2, v7)
    val v3: s0 = f7(v6)
    val v11: Vector[Double] = v7(1)
    v6 = v6.copy(p0 = v5)
    val v12: s0 = f7(v3)
    var v10: s0 = v6
    val v13: Vector[Double] = v12.p0
    val v17: Double = v5(0)
    var v20: s0 = v0
    var v24: Vector[Double] = v11
    var v18: Vector[Double] = v11
    v24 = v24.updated(0, v4)
    val v21: Double = v24(0)
    var v15: Vector[Vector[Double]] = v7
    val v33: Vector[Vector[Double]] = v12.p1
    v6 = v6.copy(p0 = v2)
    val v30: Vector[Vector[Double]] = v1.p1
    v6 = v6.copy(p1 = v30)
    val v27: Double = v18(0)
    var v32: s0 = v12
    v6 = v10
    var v62: Double = v27
    v18 = v18.updated(0, v17)
    v24 = v24.updated(0, v21)
    val v38: Vector[Vector[Double]] = v12.p1
    v20 = v20.copy(p1 = v33)
    val v41: Vector[s0] = Vector(v32, v0, v0, v3, v20, v20)
    v6 = v6.copy(p1 = v38)
    var v74: Vector[s0] = v41
    v20 = v20.copy(p0 = v13)
    val v34: Vector[Double] = v7(1)
    var v64: Vector[s0] = v74
    val v45: s0 = f7(v1)
    val v135: s0 = f7(v0)
    v32 = v32.copy(p1 = v15)
    v18 = v18.updated(0, v8)
    v20 = v20.copy(p0 = v34)
    val v170: s0 = v64(5)
    v6 = v6.copy(p0 = v24)
    v20 = v20.copy(p0 = v24)
    v6 = v6.copy(p1 = v7)
    v4 = v62
    val v60: s0 = f7(v170)
    v74 = v74.updated(3, v45)
    v74 = v74.updated(2, v6)
    v10 = v135
    v60
  }
  def f4(v0: s0, v1: s0): s0 = {
    val v5: s0 = f5(v1)
    val v7: s0 = f7(v5)
    val v3: Vector[Double] = v0.p0
    val v8: Vector[Double] = v1.p0
    var v9: s0 = v7
    var v2: Vector[Double] = v8
    val v6: Double = v8(0)
    val v10: Double = v6 / v6
    val v18: Double = v2(0)
    val v13: s0 = f7(v1)
    val v19: s0 = f5(v1)
    val v26: s0 = f5(v13)
    val v12: Vector[Vector[Double]] = v13.p1
    val v14: s0 = f5(v26)
    var v34: Double = v6
    val v46: Vector[Double] = v14.p0
    val v22: Vector[Double] = v26.p0
    v2 = v2.updated(0, v34)
    v2 = v2.updated(0, v18)
    val v32: s0 = f7(v9)
    val v25: s0 = f5(v1)
    var v15: Double = v10
    v9 = v9.copy(p1 = v12)
    val v51: Double = v3(0)
    v9 = v9.copy(p0 = v2)
    val v71: s0 = f5(v7)
    v2 = v2.updated(0, v51)
    val v64: Vector[Vector[Double]] = v25.p1
    v9 = v9.copy(p0 = v46)
    var v35: Vector[Double] = v22
    var v85: s0 = v71
    v35 = v35.updated(0, v15)
    var v58: Double = v10
    val v54: Vector[s0] = Vector(v85, v14, v71, v9, v71, v32, v19)
    v9 = v9.copy(p0 = v22)
    v35 = v35.updated(0, v58)
    v2 = v2.updated(0, v34)
    v85 = v85.copy(p0 = v35)
    v85 = v85.copy(p1 = v64)
    val v241: s0 = v54(1)
    v241
  }
  @noinline
  def f0(v0: s0, v1: Double): Double = {
    val v2: s0 = f5(v0)
    var v6: Double = v1
    var v8: s0 = v0
    val v9: Vector[Vector[Double]] = v2.p1
    val v4: s0 = f4(v0, v2)
    v8 = v8.copy(p1 = v9)
    val v5: Vector[Vector[Double]] = v8.p1
    val v3: s0 = f7(v0)
    v8 = v8.copy(p1 = v9)
    v8 = v8.copy(p1 = v5)
    val v7: Vector[Double] = v9(0)
    val v15: s0 = f5(v2)
    val v11: Vector[Double] = v15.p0
    var v14: Double = v1
    v14 = v6
    val v18: Vector[Vector[Double]] = v15.p1
    v8 = v8.copy(p0 = v11)
    val v21: Vector[Double] = v5(0)
    val v19: Double = v21(0)
    val v25: Vector[Double] = v3.p0
    v8 = v8.copy(p0 = v25)
    var v30: Vector[Double] = v25
    val v24: Vector[Double] = v18(0)
    val v27: Double = v19 / v14
    var v46: Double = v19
    v8 = v8.copy(p1 = v5)
    var v54: Double = v19
    val v91: Double = v7(0)
    val v29: Vector[Double] = v9(1)
    v8 = v8.copy(p0 = v29)
    var v40: Double = v46
    val v32: Double = v29(0)
    v30 = v30.updated(0, v54)
    val v77: Vector[Double] = Vector(v91, v54, v32, v40, v27)
    v8 = v8.copy(p1 = v18)
    v30 = v30.updated(0, v91)
    val v114: Vector[Double] = v3.p0
    val v135: Vector[Vector[Double]] = v4.p1
    var v102: Vector[Double] = v77
    v8 = v8.copy(p0 = v114)
    v8 = v8.copy(p0 = v30)
    v8 = v8.copy(p1 = v135)
    v8 = v8.copy(p0 = v24)
    val v188: Double = v102(2)
    v188
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(0.0), Vector(Vector(1.0), Vector(2.0)))
    val v1: Double = 3.0
    val start = nanoTime()
    var result: Double = 3.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}