import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  def f29(v0: s0): s0 = {
    val v1: Vector[Vector[Double]] = v0.p0
    val v3: Vector[Vector[Double]] = v0.p0
    val v7: s0 = s0(v1)
    var v6: s0 = v0
    val v2: Vector[Vector[Double]] = v6.p0
    var v4: Vector[Vector[Double]] = v1
    val v9: Vector[Vector[Double]] = v6.p0
    var v8: Vector[Vector[Double]] = v1
    v6 = v6.copy(p0 = v8)
    val v12: Vector[Double] = v4(0)
    v4 = v4.updated(0, v12)
    val v5: Vector[Double] = v9(0)
    val v13: Double = v5(0)
    val v30: Vector[Double] = v1(0)
    var v11: s0 = v0
    val v10: Vector[Double] = v8(0)
    val v23: Vector[Vector[Double]] = v6.p0
    v11 = v11.copy(p0 = v4)
    val v18: Double = v5(0)
    val v16: Vector[Vector[Double]] = v6.p0
    v4 = v4.updated(0, v5)
    val v17: Vector[Vector[Double]] = v0.p0
    v6 = v6.copy(p0 = v2)
    v11 = v11.copy(p0 = v1)
    v6 = v6.copy(p0 = v16)
    val v15: Vector[Vector[Double]] = v7.p0
    val v25: Double = v18 / v18
    var v21: Vector[Vector[Double]] = v15
    var v29: Vector[Double] = v30
    val v34: Vector[Double] = v23(0)
    val v20: Vector[Double] = v16(0)
    var v24: s0 = v0
    var v28: Vector[Double] = v10
    v11 = v11.copy(p0 = v8)
    v24 = v24.copy(p0 = v17)
    val v22: Vector[Vector[Double]] = v24.p0
    v4 = v9
    v4 = v21
    var v27: Vector[Double] = v29
    var v85: Vector[Vector[Double]] = v17
    val v73: Double = v29(0)
    val v36: Vector[Vector[Double]] = v7.p0
    v28 = v28.updated(0, v25)
    val v42: Vector[Double] = v4(0)
    val v53: Vector[Vector[Double]] = v6.p0
    v24 = v24.copy(p0 = v22)
    val v19: Vector[Double] = v2(0)
    var v52: Vector[Vector[Double]] = v1
    var v64: Vector[Vector[Double]] = v52
    v4 = v4.updated(0, v19)
    val v32: Vector[Vector[Double]] = v24.p0
    val v35: Double = v34(0)
    v11 = v11.copy(p0 = v21)
    v27 = v27.updated(0, v18)
    val v49: Vector[Vector[Double]] = v7.p0
    val v122: Double = v28(0)
    v11 = v11.copy(p0 = v32)
    v28 = v28.updated(0, v122)
    val v60: Vector[Double] = v3(0)
    v64 = v64.updated(0, v34)
    val v97: Double = v73 - v13
    v11 = v11.copy(p0 = v21)
    val v55: Vector[Vector[Double]] = Vector(v60)
    v6 = v6.copy(p0 = v2)
    v6 = v6.copy(p0 = v36)
    v11 = v11.copy(p0 = v49)
    val v74: Vector[Vector[Double]] = v6.p0
    val v71: s1 = s1(v24, v11)
    var v125: Vector[Vector[Double]] = v2
    v6 = v6.copy(p0 = v125)
    val v90: Double = v10(0)
    val v67: s0 = v71.p0
    v125 = v125.updated(0, v42)
    val v39: s1 = s1(v24, v7)
    val v46: Vector[Vector[Double]] = v6.p0
    v4 = v4.updated(0, v20)
    v24 = v24.copy(p0 = v125)
    v8 = v8.updated(0, v28)
    v6 = v6.copy(p0 = v85)
    v29 = v29.updated(0, v18)
    v85 = v46
    v6 = v6.copy(p0 = v55)
    v24 = v24.copy(p0 = v4)
    var v57: s1 = v39
    val v66: Vector[Vector[Vector[Double]]] = Vector(v64, v53, v74, v53, v125, v36, v46)
    v57 = v57.copy(p1 = v67)
    v57 = v57.copy(p1 = v11)
    v24 = v24.copy(p0 = v4)
    val v69: Vector[Vector[Double]] = v66(4)
    v85 = v85.updated(0, v27)
    val v151: Vector[Double] = v22(0)
    v29 = v30
    val v96: Double = v90 + v97
    v64 = v64.updated(0, v19)
    val v144: s0 = v57.p0
    v52 = v52.updated(0, v151)
    v28 = v28.updated(0, v18)
    v6 = v6.copy(p0 = v69)
    v29 = v29.updated(0, v35)
    v24 = v24.copy(p0 = v36)
    v125 = v125.updated(0, v34)
    v28 = v28.updated(0, v96)
    v57 = v57.copy(p0 = v67)
    v29 = v29.updated(0, v13)
    v144
  }
  @noinline
  def f0(v0: Vector[s0], v1: Double): Double = {
    val v9: Vector[Double] = Vector(v1, v1)
    var v4: Vector[Double] = v9
    var v7: Vector[Double] = v4
    val v6: s0 = v0(2)
    v4 = v4.updated(1, v1)
    val v11: s0 = f29(v6)
    val v5: Double = v7(0)
    v4 = v7
    val v2: Vector[Vector[Double]] = v11.p0
    val v39: Vector[Double] = v2(0)
    v7 = v7.updated(1, v5)
    var v18: Vector[Double] = v39
    val v57: Double = v18(0)
    v7 = v7.updated(0, v57)
    v5
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0))), s0(Vector(Vector(1.0))), s0(Vector(Vector(2.0))))
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