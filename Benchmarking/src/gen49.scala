import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f27(v0: s0): s0 = {
    var v2: s0 = v0
    v2 = v0
    val v4: Vector[Vector[Double]] = v2.p0
    val v1: Vector[Vector[Double]] = v2.p1
    v2 = v0
    val v15: Vector[Vector[Double]] = v0.p0
    v2 = v2.copy(p0 = v4)
    v2 = v2.copy(p1 = v1)
    val v13: Vector[Vector[Double]] = v2.p0
    v2 = v2.copy(p1 = v1)
    val v24: Vector[Vector[Double]] = v2.p1
    val v12: Vector[Vector[Double]] = v2.p0
    v2 = v2.copy(p1 = v15)
    val v34: Vector[Vector[Vector[Double]]] = Vector(v15, v24, v13, v24)
    var v21: s0 = v2
    val v20: Vector[Vector[Double]] = v34(0)
    val v19: Vector[Vector[Double]] = v34(3)
    v21 = v21.copy(p0 = v12)
    v2 = v2.copy(p0 = v20)
    val v47: Vector[Vector[Double]] = v21.p1
    var v36: s0 = v21
    v21 = v21.copy(p0 = v13)
    var v61: Vector[Vector[Double]] = v13
    v21 = v21.copy(p1 = v19)
    val v57: Vector[Vector[Double]] = v21.p0
    v2 = v2.copy(p1 = v1)
    val v60: Vector[Vector[Double]] = v36.p1
    val v89: Vector[Vector[Double]] = v21.p0
    var v84: s0 = v36
    v2 = v2.copy(p1 = v24)
    v84 = v84.copy(p0 = v47)
    v2 = v2.copy(p0 = v57)
    v2 = v2.copy(p1 = v24)
    v21 = v21.copy(p0 = v60)
    v84 = v84.copy(p0 = v61)
    v36 = v36.copy(p0 = v89)
    v21 = v21.copy(p1 = v4)
    v84
  }
  def f26(v0: s0): s0 = {
    var v6: s0 = v0
    val v7: Vector[Vector[Double]] = v6.p0
    val v13: Vector[Vector[Double]] = v0.p0
    val v12: Vector[Vector[Double]] = v6.p1
    val v21: s0 = f27(v6)
    val v29: s0 = f27(v21)
    val v35: Vector[Vector[Double]] = v29.p1
    val v19: s0 = f27(v6)
    v6 = v6.copy(p1 = v35)
    var v32: s0 = v19
    v6 = v6.copy(p0 = v7)
    v32 = v32.copy(p1 = v12)
    v32 = v32.copy(p1 = v13)
    v32
  }
  def f23(v0: s0): s0 = {
    val v17: s0 = f27(v0)
    val v16: s0 = f27(v17)
    val v29: s0 = f26(v16)
    val v31: s0 = f27(v29)
    v31
  }
  def f19(v0: s0): s0 = {
    val v2: Vector[Vector[Double]] = v0.p1
    var v3: s0 = v0
    var v1: Vector[Vector[Double]] = v2
    val v7: s0 = f23(v3)
    val v4: Vector[Vector[Double]] = v0.p1
    val v5: Vector[Double] = v1(1)
    v3 = v3.copy(p1 = v2)
    val v8: Vector[Vector[Double]] = v0.p1
    val v6: s0 = f23(v3)
    val v9: s0 = f26(v6)
    v1 = v1.updated(1, v5)
    v1 = v1.updated(1, v5)
    val v10: Vector[Double] = v1(1)
    var v13: Vector[Double] = v5
    v3 = v3.copy(p0 = v4)
    v1 = v1.updated(2, v10)
    var v14: Vector[Vector[Double]] = v4
    val v18: s0 = f23(v3)
    val v11: Double = v13(0)
    v14 = v14.updated(1, v13)
    var v12: Vector[Vector[Double]] = v14
    val v16: s0 = f23(v9)
    v3 = v3.copy(p0 = v12)
    val v17: s0 = f27(v18)
    val v25: Vector[Vector[Double]] = v6.p1
    v12 = v12.updated(1, v13)
    val v20: Vector[Vector[Double]] = v16.p0
    val v46: Vector[Vector[Double]] = v7.p1
    val v49: s0 = f23(v3)
    val v42: Vector[Double] = v20(1)
    val v35: s0 = f23(v49)
    v12 = v20
    v13 = v13.updated(0, v11)
    val v51: Vector[Vector[Double]] = v16.p0
    val v72: s0 = f27(v49)
    val v82: Vector[Vector[Double]] = v6.p1
    v3 = v3.copy(p1 = v8)
    v14 = v14.updated(2, v5)
    val v44: Vector[Vector[Double]] = v17.p1
    v3 = v3.copy(p0 = v2)
    val v63: Vector[Vector[Double]] = v35.p1
    v3 = v3.copy(p0 = v82)
    var v95: s0 = v72
    val v66: s0 = f23(v95)
    v95 = v95.copy(p0 = v44)
    v3 = v3.copy(p0 = v25)
    v95 = v95.copy(p0 = v63)
    v12 = v12.updated(2, v42)
    val v76: s0 = f27(v66)
    val v321: Vector[Vector[Double]] = v3.p0
    val v137: Vector[Vector[Double]] = v76.p1
    val v112: Vector[Double] = v1(0)
    v12 = v12.updated(0, v112)
    v3 = v3.copy(p0 = v46)
    val v205: s0 = s0(v137, v51)
    v3 = v3.copy(p0 = v321)
    v205
  }
  def f15(v0: s0): s0 = {
    val v3: s0 = f27(v0)
    val v4: s0 = f23(v0)
    val v8: s0 = f23(v3)
    val v11: s0 = f23(v8)
    var v15: s0 = v11
    val v22: Vector[Vector[Double]] = v4.p0
    v15 = v15.copy(p0 = v22)
    v15
  }
  @noinline
  def f0(v0: s0, v1: Double): Double = {
    var v3: s0 = v0
    val v5: s0 = f15(v0)
    val v4: s0 = f19(v5)
    val v14: Vector[Vector[Double]] = v3.p1
    val v9: Vector[s0] = Vector(v4, v4, v4, v4, v0, v3)
    val v8: Vector[Double] = v14(0)
    var v15: Vector[Vector[Double]] = v14
    val v20: s0 = f19(v3)
    var v30: Vector[Vector[Double]] = v15
    v3 = v3.copy(p0 = v15)
    var v28: Vector[s0] = v9
    val v38: Vector[Double] = v30(2)
    var v33: Vector[Double] = v38
    val v19: s0 = v28(5)
    val v51: Vector[Vector[Double]] = v19.p1
    v3 = v3.copy(p0 = v51)
    v30 = v30.updated(0, v8)
    val v81: Double = v33(0)
    v28 = v28.updated(5, v20)
    v3 = v3.copy(p1 = v15)
    v3 = v3.copy(p0 = v30)
    v81
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0)))
    val v1: Double = 6.0
    val start = nanoTime()
    var result: Double = 6.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}