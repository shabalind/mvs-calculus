import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Double],
    p1: Vector[Vector[Double]]
  )
  def f64(v0: s0): s0 = {
    val v3: Vector[Vector[Double]] = v0.p1
    val v7: Vector[Vector[Double]] = v0.p1
    val v4: Vector[Double] = v7(0)
    val v5: Vector[Vector[Double]] = v0.p1
    var v8: Vector[Double] = v4
    var v6: s0 = v0
    val v1: Vector[Double] = v0.p0
    v6 = v0
    val v9: Vector[Double] = v6.p0
    val v2: Vector[Double] = v6.p0
    var v10: Vector[Vector[Double]] = v5
    val v12: Vector[Double] = v10(0)
    v10 = v10.updated(0, v8)
    val v11: Vector[Vector[Double]] = v6.p1
    val v17: Vector[Double] = v0.p0
    val v15: Vector[Double] = v11(0)
    var v24: Vector[Double] = v9
    val v28: Double = v1(1)
    val v36: Vector[Vector[Double]] = Vector(v17, v9, v9)
    var v19: s0 = v0
    v10 = v10.updated(0, v4)
    val v27: Vector[Double] = v36(1)
    v6 = v6.copy(p1 = v3)
    var v29: Vector[Double] = v12
    var v26: Vector[Double] = v24
    var v100: s0 = v6
    val v34: Vector[Double] = v6.p0
    var v32: Double = v28
    var v73: s0 = v100
    var v43: Vector[Double] = v8
    v73 = v73.copy(p0 = v2)
    val v46: Vector[Double] = v0.p0
    var v30: Vector[Double] = v15
    val v47: Double = v28 - v32
    v10 = v7
    v10 = v10.updated(0, v43)
    val v38: Vector[Double] = v36(2)
    v19 = v19.copy(p1 = v11)
    v26 = v26.updated(0, v32)
    var v58: Double = v47
    v8 = v8.updated(0, v28)
    v8 = v8.updated(0, v58)
    val v35: Vector[Vector[Double]] = v19.p1
    val v61: Double = v46(0)
    v30 = v29
    v24 = v24.updated(0, v28)
    val v37: Vector[Double] = v6.p0
    val v91: Vector[Vector[Double]] = v19.p1
    v73 = v73.copy(p0 = v26)
    val v57: Vector[Vector[Double]] = v6.p1
    var v99: Double = v61
    v73 = v73.copy(p1 = v91)
    v8 = v8.updated(0, v99)
    v10 = v10.updated(0, v30)
    v43 = v43.updated(0, v61)
    v6 = v6.copy(p1 = v57)
    val v83: Vector[Vector[Double]] = v73.p1
    val v84: Double = v12(0)
    val v60: Vector[Vector[Double]] = v6.p1
    val v67: Vector[Vector[Double]] = v0.p1
    v6 = v6.copy(p1 = v60)
    v19 = v19.copy(p0 = v38)
    val v97: Double = v34(1)
    v24 = v24.updated(1, v97)
    v19 = v19.copy(p0 = v27)
    v100 = v100.copy(p1 = v83)
    v73 = v73.copy(p1 = v67)
    v19 = v19.copy(p1 = v83)
    v24 = v24.updated(0, v84)
    v73 = v73.copy(p0 = v37)
    v100 = v100.copy(p1 = v35)
    v73
  }
  def f54(v0: s0, v1: s0): s0 = {
    val v4: s0 = f64(v1)
    val v3: Vector[Double] = v1.p0
    val v5: s0 = f64(v0)
    val v8: Double = v3(1)
    val v19: Vector[Double] = v4.p0
    var v31: Vector[Double] = v19
    var v25: s0 = v5
    v31 = v31.updated(0, v8)
    v25 = v25.copy(p0 = v31)
    val v38: s0 = f64(v25)
    v38
  }
  def f29(v0: Vector[Double]): Vector[Double] = {
    val v2: Double = v0(0)
    var v3: Double = v2
    val v9: Double = v0(0)
    val v7: Double = v2 * v3
    var v5: Double = v7
    val v1: Double = v0(0)
    var v14: Vector[Double] = v0
    val v11: Double = v0(0)
    val v15: Double = v0(0)
    v14 = v14.updated(0, v15)
    val v6: Double = v0(0)
    v14 = v14.updated(0, v6)
    val v13: Double = v0(0)
    var v12: Double = v5
    val v10: Double = v0(0)
    var v25: Vector[Double] = v14
    val v17: Vector[Double] = Vector(v13, v1, v9)
    var v51: Vector[Double] = v0
    v12 = v10
    val v23: Double = v0(0)
    val v16: Double = v0(0)
    val v19: Vector[Vector[Double]] = Vector(v51, v0)
    var v24: Vector[Vector[Double]] = v19
    val v21: Double = v17(0)
    v24 = v19
    val v28: Double = v51(0)
    v25 = v25.updated(0, v23)
    v51 = v51.updated(0, v21)
    val v70: Vector[Double] = v24(1)
    val v30: Double = v28 + v15
    var v45: Vector[Double] = v70
    v45 = v45.updated(0, v30)
    var v44: Vector[Double] = v0
    v24 = v24.updated(0, v45)
    var v27: Double = v11
    val v31: Vector[Vector[Double]] = Vector(v44, v25, v70)
    v24 = v24.updated(1, v51)
    v45 = v70
    v25 = v25.updated(0, v27)
    v25 = v25.updated(0, v16)
    v24 = v24.updated(0, v0)
    var v47: Double = v12
    val v66: Vector[Double] = v31(0)
    var v38: Vector[Double] = v45
    var v73: Vector[Double] = v66
    v73 = v73.updated(0, v47)
    val v80: Double = v38(0)
    v12 = v6
    v5 = v80
    v73
  }
  @noinline
  def f0(v0: s0, v1: Double): Double = {
    val v6: s0 = f54(v0, v0)
    val v4: Vector[Vector[Double]] = v6.p1
    val v8: Vector[Double] = v4(0)
    var v10: s0 = v6
    val v7: Vector[Vector[Double]] = Vector(v8, v8)
    val v11: Double = v8(0)
    val v15: Vector[Double] = f29(v8)
    val v9: Vector[Double] = v7(1)
    val v17: Vector[Double] = f29(v15)
    val v42: Double = v17(0)
    val v14: Double = v9(0)
    var v23: s0 = v10
    var v27: Double = v1
    val v28: Vector[Double] = v23.p0
    v23 = v23.copy(p0 = v28)
    val v37: Double = v9(0)
    val v38: Double = v14 / v11
    var v19: Vector[Double] = v28
    val v50: Double = v19(0)
    v23 = v23.copy(p1 = v4)
    val v25: Vector[Vector[Double]] = v6.p1
    v19 = v19.updated(1, v27)
    val v41: Vector[Double] = Vector(v38, v37, v50, v1, v14, v14, v11)
    val v51: Double = v41(0)
    v27 = v42
    v23 = v23.copy(p1 = v4)
    v23 = v23.copy(p1 = v25)
    v51
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(0.0, 1.0), Vector(Vector(2.0)))
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