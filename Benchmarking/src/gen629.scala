import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f52(v0: s0, v1: s0): s0 = {
    var v3: s0 = v0
    v3 = v0
    val v4: Vector[Vector[Double]] = v3.p0
    v3 = v3.copy(p1 = v4)
    val v2: s0 = s0(v4, v4)
    val v6: Vector[Vector[Double]] = v1.p1
    v3 = v3.copy(p1 = v6)
    v3 = v3.copy(p1 = v6)
    v2
  }
  def f49(v0: s0): s0 = {
    var v2: s0 = v0
    var v9: s0 = v2
    val v4: Vector[Vector[Double]] = v2.p1
    var v7: Vector[Vector[Double]] = v4
    val v1: Vector[Double] = v7(0)
    val v3: Vector[Vector[Double]] = v2.p1
    val v8: Vector[Double] = v7(1)
    v7 = v7.updated(0, v1)
    val v5: Vector[Vector[Double]] = v0.p1
    val v13: Vector[Double] = v7(0)
    var v6: s0 = v0
    val v18: s0 = f52(v0, v9)
    var v14: Vector[Vector[Double]] = v4
    v7 = v7.updated(1, v13)
    var v12: Vector[Vector[Double]] = v7
    val v20: Vector[Vector[Double]] = v0.p1
    val v29: s0 = f52(v0, v9)
    v6 = v6.copy(p0 = v7)
    v12 = v12.updated(1, v1)
    val v25: s0 = f52(v18, v29)
    val v15: Vector[Double] = v5(1)
    val v10: s0 = f52(v2, v25)
    v7 = v3
    var v43: s0 = v10
    val v36: Vector[Vector[Double]] = v10.p1
    v14 = v14.updated(0, v13)
    val v19: Vector[Double] = v12(0)
    v6 = v6.copy(p1 = v36)
    val v17: s0 = f52(v2, v6)
    val v27: Vector[Vector[Double]] = Vector(v19, v8, v13)
    val v26: s0 = f52(v43, v6)
    val v30: Vector[Vector[Double]] = v0.p1
    val v34: Vector[Vector[Vector[Double]]] = Vector(v27, v27)
    val v22: Vector[Vector[Double]] = v34(1)
    val v56: Vector[Vector[Double]] = v17.p1
    var v49: s0 = v25
    val v37: s0 = s0(v20, v14)
    v2 = v0
    v9 = v10
    val v80: s0 = f52(v25, v26)
    val v62: Vector[Double] = v22(2)
    v43 = v43.copy(p1 = v30)
    val v39: s0 = f52(v18, v49)
    v49 = v49.copy(p1 = v7)
    val v83: Vector[Vector[Double]] = v2.p0
    val v137: s0 = f52(v37, v80)
    v12 = v12.updated(1, v15)
    v12 = v12.updated(1, v19)
    val v99: Vector[Double] = v27(2)
    val v91: Vector[Double] = v27(0)
    v7 = v7.updated(0, v13)
    val v124: Vector[Vector[Double]] = v9.p1
    v7 = v7.updated(1, v62)
    v14 = v56
    v12 = v12.updated(1, v99)
    v49 = v49.copy(p0 = v83)
    val v86: s0 = f52(v39, v137)
    v9 = v9.copy(p1 = v124)
    val v211: Vector[Vector[Double]] = v0.p0
    v12 = v12.updated(0, v91)
    v49 = v49.copy(p1 = v211)
    v86
  }
  def f48(v0: s0): s0 = {
    var v5: s0 = v0
    val v1: Vector[Vector[Double]] = v0.p1
    val v4: s0 = f49(v5)
    val v2: s0 = f49(v4)
    v5 = v5.copy(p1 = v1)
    val v12: s0 = f52(v0, v0)
    val v11: s0 = f52(v0, v5)
    var v10: Vector[Vector[Double]] = v1
    val v15: Vector[Vector[Double]] = v12.p0
    val v30: Vector[s0] = Vector(v0)
    val v20: s0 = f52(v2, v0)
    val v26: Vector[Vector[Double]] = v12.p1
    val v31: s0 = f49(v12)
    val v38: s0 = f49(v4)
    val v16: s0 = s0(v15, v15)
    val v44: Vector[Vector[Double]] = v5.p1
    v5 = v5.copy(p0 = v10)
    var v47: Vector[s0] = v30
    var v78: Vector[Vector[Double]] = v1
    val v32: s0 = f49(v20)
    v5 = v4
    val v43: Vector[Vector[Double]] = v31.p1
    val v56: Vector[Vector[Vector[Double]]] = Vector(v78, v10, v26, v26, v10)
    val v41: Vector[Vector[Double]] = v38.p0
    val v45: Vector[Vector[Double]] = v56(1)
    val v51: s0 = f52(v20, v2)
    v5 = v5.copy(p0 = v44)
    var v98: Vector[Vector[Double]] = v43
    v5 = v5.copy(p0 = v98)
    v5 = v5.copy(p1 = v98)
    val v66: s0 = v47(0)
    val v63: s0 = f52(v66, v51)
    val v91: s0 = f52(v32, v16)
    val v112: s0 = f52(v11, v63)
    v47 = v47.updated(0, v2)
    val v159: Vector[Vector[Double]] = v2.p1
    val v93: Vector[Double] = v45(0)
    v5 = v5.copy(p0 = v159)
    v5 = v5.copy(p0 = v15)
    val v113: Vector[Vector[Double]] = v91.p1
    v10 = v10.updated(0, v93)
    var v153: s0 = v112
    val v188: Vector[Double] = v113(0)
    v153 = v153.copy(p0 = v41)
    v10 = v10.updated(0, v188)
    v153
  }
  def f44(v0: s0): s0 = {
    val v3: Vector[Vector[Double]] = v0.p1
    val v6: Vector[Vector[Double]] = v0.p0
    var v2: Vector[Vector[Double]] = v6
    val v10: s0 = f52(v0, v0)
    val v8: s0 = f48(v10)
    val v1: Vector[Double] = v3(1)
    var v11: Vector[Double] = v1
    val v19: s0 = s0(v2, v2)
    val v26: Vector[Vector[Double]] = v0.p0
    val v16: s0 = f49(v8)
    v2 = v2.updated(1, v11)
    v2 = v26
    val v48: s0 = f52(v19, v16)
    v2 = v2.updated(1, v11)
    v2 = v2.updated(1, v1)
    val v23: s0 = f49(v48)
    var v53: Vector[Double] = v11
    v2 = v2.updated(1, v53)
    v23
  }
  @noinline
  def f0(v0: Vector[s0], v1: Double): Double = {
    val v3: s0 = v0(0)
    val v2: s0 = f44(v3)
    val v9: Vector[Vector[Double]] = v2.p0
    val v6: Vector[Double] = v9(1)
    val v21: Double = v6(0)
    v21
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0))), s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0))))
    val v1: Double = 12.0
    val start = nanoTime()
    var result: Double = 12.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}