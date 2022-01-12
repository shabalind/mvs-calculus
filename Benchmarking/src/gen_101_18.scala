import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Double
  )
  def f36(v0: s1, v1: s1): s1 = {
    val v4: Vector[s0] = v1.p0
    val v3: Vector[s0] = v1.p0
    var v7: s1 = v0
    val v9: Vector[s0] = v1.p0
    val v6: s0 = v3(0)
    v7 = v7.copy(p0 = v3)
    val v25: Vector[Vector[Double]] = v6.p0
    val v15: Double = v7.p1
    val v17: Vector[Double] = v25(0)
    val v20: Vector[Double] = Vector(v15, v15, v15, v15)
    val v40: Double = v17(0)
    var v73: Vector[Double] = v20
    v7 = v7.copy(p0 = v4)
    v7 = v7.copy(p1 = v40)
    val v24: Double = v40 * v40
    val v28: Double = v20(1)
    val v46: Vector[s0] = v7.p0
    val v37: Double = v24 * v28
    v73 = v73.updated(1, v40)
    val v41: Double = v73(1)
    val v36: Double = v41 - v37
    val v34: Double = v0.p1
    v7 = v7.copy(p0 = v46)
    v7 = v7.copy(p0 = v46)
    val v80: s1 = s1(v46, v36)
    v7 = v7.copy(p0 = v9)
    v73 = v73.updated(2, v34)
    v80
  }
  def f27(v0: s1): s1 = {
    val v4: Vector[s0] = v0.p0
    val v2: s1 = f36(v0, v0)
    val v6: s0 = v4(0)
    val v21: Vector[Vector[Double]] = v6.p0
    val v14: Vector[Double] = v21(0)
    var v18: Vector[Vector[Double]] = v21
    v18 = v18.updated(0, v14)
    val v43: Vector[Double] = v18(0)
    val v26: Double = v43(0)
    val v69: Vector[s0] = v2.p0
    val v50: s1 = s1(v69, v26)
    v50
  }
  def f17(v0: s0): s0 = {
    var v6: s0 = v0
    val v7: Vector[Vector[Double]] = v0.p1
    val v4: Vector[Double] = v7(1)
    var v2: s0 = v0
    val v5: Vector[Vector[Double]] = v6.p0
    v2 = v2.copy(p0 = v5)
    val v1: Vector[Vector[Double]] = v2.p1
    var v12: Vector[Double] = v4
    val v13: Vector[Vector[Double]] = v2.p0
    var v15: s0 = v6
    v15 = v15.copy(p1 = v1)
    v6 = v6.copy(p0 = v13)
    val v23: Vector[Vector[Double]] = v6.p0
    var v28: Vector[Vector[Double]] = v7
    var v16: Vector[Vector[Double]] = v28
    v2 = v2.copy(p1 = v16)
    val v22: Vector[Vector[Double]] = v15.p0
    var v27: Vector[Vector[Double]] = v13
    v28 = v28.updated(0, v12)
    v15 = v15.copy(p0 = v27)
    v15 = v15.copy(p0 = v23)
    var v39: s0 = v6
    val v61: Vector[Vector[Double]] = v6.p0
    var v32: Vector[Vector[Double]] = v22
    v2 = v2.copy(p0 = v32)
    v15 = v15.copy(p0 = v22)
    v6 = v6.copy(p0 = v61)
    v39
  }
  def f14(v0: s1): s1 = {
    var v4: s1 = v0
    var v7: s1 = v4
    val v2: Double = v4.p1
    val v6: s1 = f27(v7)
    val v3: s1 = f27(v0)
    var v14: s1 = v3
    val v1: Vector[s0] = v7.p0
    val v8: Double = v7.p1
    val v11: Double = v14.p1
    v7 = v7.copy(p1 = v2)
    val v9: s0 = v1(0)
    val v15: Double = v11 / v8
    var v13: Double = v2
    val v10: s0 = v1(0)
    v7 = v7.copy(p1 = v2)
    val v16: Vector[Vector[Double]] = v10.p0
    val v20: Vector[s0] = v14.p0
    val v25: Double = v6.p1
    var v29: Vector[s0] = v20
    var v36: Vector[Vector[Double]] = v16
    val v30: Vector[Double] = v36(0)
    v14 = v14.copy(p1 = v13)
    v4 = v4.copy(p0 = v1)
    val v24: s0 = v29(0)
    val v23: Double = v30(0)
    v14 = v14.copy(p1 = v23)
    val v19: Vector[Double] = v36(0)
    v7 = v7.copy(p0 = v1)
    v29 = v29.updated(0, v24)
    val v39: Vector[Double] = v16(0)
    v36 = v36.updated(0, v39)
    val v48: s0 = f17(v9)
    v14 = v14.copy(p0 = v29)
    v4 = v4.copy(p0 = v1)
    v7 = v7.copy(p1 = v25)
    v14 = v14.copy(p0 = v1)
    val v87: s1 = f36(v14, v7)
    v7 = v7.copy(p1 = v23)
    v36 = v36.updated(0, v19)
    v29 = v29.updated(0, v48)
    v4 = v4.copy(p1 = v15)
    v4 = v4.copy(p0 = v1)
    v87
  }
  def f9(v0: s0, v1: Vector[s0]): Vector[s0] = {
    v1
  }
  @noinline
  def f0(v0: Vector[Vector[s0]], v1: s0, v2: Double): Double = {
    val v4: Vector[Vector[Double]] = v1.p0
    var v6: Double = v2
    val v5: Vector[s0] = v0(0)
    val v8: Vector[Double] = v4(0)
    var v7: Vector[Double] = v8
    v7 = v7.updated(0, v2)
    v6 = v2
    val v14: Double = v7(0)
    val v3: Vector[s0] = f9(v1, v5)
    val v10: s0 = f17(v1)
    val v12: Vector[s0] = f9(v10, v5)
    val v24: Vector[s0] = f9(v1, v3)
    v7 = v7.updated(0, v6)
    v7 = v7.updated(0, v2)
    val v18: Double = v6 + v6
    var v36: Double = v14
    val v33: Double = v18 + v18
    val v57: s0 = v24(0)
    var v31: Vector[s0] = v5
    v7 = v7.updated(0, v33)
    val v60: Double = v8(0)
    val v39: s1 = s1(v12, v33)
    v31 = v31.updated(0, v1)
    val v32: s1 = f14(v39)
    val v48: Vector[s0] = f9(v57, v5)
    val v87: s0 = v48(0)
    val v52: Double = v32.p1
    v31 = v31.updated(0, v10)
    val v112: s1 = s1(v31, v14)
    v7 = v7.updated(0, v60)
    val v261: Double = v112.p1
    val v110: Double = v36 * v261
    v31 = v31.updated(0, v87)
    v7 = v7.updated(0, v52)
    var v215: Double = v110
    v215
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0)))), Vector(s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0)))), Vector(s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0)))))
    val v1: s0 = s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0)))
    val v2: Double = 12.0
    val start = nanoTime()
    var result: Double = 12.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}