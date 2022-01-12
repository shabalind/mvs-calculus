import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Double],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0]
  )
  case class s5 (
    p0: Vector[s1],
    p1: s0
  )
  def f49(v0: s0): s0 = {
    var v5: s0 = v0
    val v3: Vector[s0] = Vector(v0, v0, v5, v5, v5, v5)
    var v1: s0 = v0
    val v10: s0 = v3(3)
    val v12: Vector[Double] = v10.p0
    var v24: Vector[s0] = v3
    v5 = v1
    v24 = v24.updated(4, v10)
    v24 = v24.updated(0, v0)
    v1 = v1.copy(p0 = v12)
    val v21: s0 = v24(3)
    v21
  }
  def f44(v0: s1): s1 = {
    val v1: Vector[s0] = v0.p0
    var v2: s1 = v0
    var v6: s1 = v0
    v6 = v6.copy(p0 = v1)
    v6 = v2
    v6 = v6.copy(p0 = v1)
    v6
  }
  def f40(v0: Vector[Vector[Double]], v1: s1): s1 = {
    val v7: Vector[s0] = v1.p0
    val v3: s1 = f44(v1)
    val v5: Vector[s0] = v3.p0
    val v6: s0 = v5(0)
    val v13: s0 = f49(v6)
    val v9: s0 = v5(1)
    val v12: s1 = f44(v1)
    var v23: Vector[s0] = v7
    val v17: s0 = f49(v6)
    val v50: Vector[Double] = v9.p0
    var v77: s0 = v17
    val v22: s0 = s0(v50, v0)
    val v30: s0 = f49(v22)
    v23 = v23.updated(0, v6)
    var v63: s1 = v12
    v23 = v23.updated(0, v77)
    v23 = v23.updated(0, v30)
    var v61: Vector[s0] = v23
    v61 = v61.updated(0, v77)
    v61 = v61.updated(1, v13)
    v23 = v23.updated(0, v9)
    v63 = v63.copy(p0 = v61)
    var v84: s1 = v63
    v84
  }
  def f29(v0: s0): s0 = {
    var v3: s0 = v0
    var v1: s0 = v0
    var v2: s0 = v0
    val v7: s0 = f49(v2)
    var v5: s0 = v7
    val v13: Vector[Double] = v5.p0
    val v4: Vector[Vector[Double]] = v1.p1
    v2 = v2.copy(p0 = v13)
    val v10: s0 = f49(v3)
    val v18: Vector[Double] = v1.p0
    v5 = v5.copy(p1 = v4)
    val v20: Vector[Vector[Double]] = v10.p1
    val v142: s0 = s0(v13, v4)
    v1 = v1.copy(p0 = v18)
    v2 = v2.copy(p1 = v20)
    v142
  }
  def f24(v0: s0): s0 = {
    val v1: s0 = f29(v0)
    var v2: s0 = v0
    val v9: s0 = f49(v0)
    val v7: s0 = f29(v9)
    val v5: s0 = f29(v1)
    val v4: Vector[Vector[Double]] = v7.p1
    val v8: s0 = f29(v7)
    val v3: Vector[s0] = Vector(v5, v2)
    v2 = v2.copy(p1 = v4)
    val v12: Vector[Vector[Double]] = v5.p1
    val v11: Vector[Double] = v1.p0
    val v10: Vector[Double] = v12(0)
    val v17: Vector[Double] = v9.p0
    v2 = v2.copy(p1 = v4)
    val v23: s0 = f49(v7)
    val v13: Double = v11(0)
    val v21: Vector[Vector[Double]] = Vector(v10, v10)
    var v25: Double = v13
    v2 = v2.copy(p0 = v17)
    val v50: Vector[Double] = v8.p0
    var v22: Vector[Double] = v50
    v22 = v22.updated(0, v13)
    v2 = v2.copy(p1 = v12)
    val v18: Vector[Double] = v21(1)
    v22 = v22.updated(2, v25)
    val v36: s1 = s1(v3)
    val v16: Double = v18(0)
    v2 = v2.copy(p0 = v22)
    val v54: s1 = f40(v4, v36)
    val v29: Vector[s0] = v54.p0
    v2 = v2.copy(p0 = v50)
    var v87: Double = v25
    val v65: Double = v10(0)
    v22 = v22.updated(2, v65)
    val v64: s0 = v29(0)
    val v77: Double = v11(1)
    v22 = v22.updated(2, v16)
    val v47: Double = v50(0)
    v22 = v22.updated(2, v87)
    v22 = v22.updated(2, v77)
    v22 = v22.updated(2, v77)
    val v99: Vector[s0] = Vector(v8, v0, v0, v64, v5, v8)
    var v96: Vector[s0] = v99
    v22 = v22.updated(2, v77)
    v25 = v47
    v2 = v23
    val v164: s0 = v96(3)
    v164
  }
  def f4(v0: s0): s0 = {
    var v4: s0 = v0
    var v5: s0 = v0
    var v1: s0 = v5
    val v2: s0 = f49(v1)
    val v3: s0 = f49(v5)
    val v8: s0 = f49(v3)
    val v6: Vector[s0] = Vector(v4, v3, v2, v8)
    val v11: Vector[Double] = v1.p0
    val v10: Vector[Double] = v8.p0
    val v9: s0 = f29(v4)
    val v13: s0 = f29(v5)
    v4 = v4.copy(p0 = v10)
    val v15: s0 = f49(v2)
    var v19: Vector[s0] = v6
    val v14: Vector[Double] = v2.p0
    v19 = v19.updated(2, v13)
    v19 = v19.updated(1, v0)
    var v18: s0 = v15
    v4 = v4.copy(p0 = v11)
    val v23: Vector[Vector[Double]] = v13.p1
    var v28: Vector[Double] = v10
    v19 = v6
    var v30: Vector[Vector[Double]] = v23
    v19 = v19.updated(1, v18)
    v19 = v19.updated(3, v0)
    val v31: Double = v28(2)
    val v38: Double = v31 - v31
    var v53: Vector[Double] = v11
    val v86: Vector[Double] = v9.p0
    v1 = v1.copy(p0 = v86)
    var v72: Vector[Vector[Double]] = v30
    val v32: Vector[Double] = v30(1)
    var v87: Vector[Double] = v32
    v18 = v18.copy(p0 = v10)
    v87 = v87.updated(0, v31)
    v5 = v5.copy(p1 = v72)
    v28 = v28.updated(0, v31)
    v1 = v1.copy(p0 = v10)
    v87 = v87.updated(0, v31)
    v5 = v5.copy(p0 = v14)
    val v83: s0 = v19(3)
    v53 = v53.updated(2, v38)
    v72 = v72.updated(0, v87)
    v1 = v1.copy(p0 = v53)
    v72 = v72.updated(1, v32)
    v72 = v72.updated(0, v32)
    v18 = v18.copy(p0 = v28)
    v87 = v87.updated(0, v31)
    v83
  }
  @noinline
  def f0(v0: Vector[s5], v1: Double): Double = {
    val v2: s5 = v0(0)
    val v7: s0 = v2.p1
    val v9: s0 = f29(v7)
    val v8: s0 = f24(v7)
    val v10: s0 = f4(v8)
    val v13: Vector[Double] = v7.p0
    var v5: s0 = v7
    v5 = v5.copy(p0 = v13)
    v5 = v5.copy(p0 = v13)
    val v17: Vector[Double] = v10.p0
    val v28: Vector[Vector[Double]] = v5.p1
    val v23: Vector[Vector[Double]] = v9.p1
    val v34: Vector[Double] = v28(1)
    v5 = v5.copy(p1 = v23)
    val v49: Double = v17(1)
    var v26: Vector[Double] = v34
    val v61: Double = v26(0)
    val v85: Vector[Vector[Double]] = v8.p1
    v5 = v5.copy(p1 = v85)
    val v66: Double = v34(0)
    val v54: Double = v61 * v49
    v26 = v26.updated(0, v66)
    v26 = v26.updated(0, v61)
    var v123: Double = v54
    val v258: Double = v54 * v123
    v258
  }
  def benchmark(): Unit = {
    val v0: Vector[s5] = Vector(s5(Vector(s1(Vector(s0(Vector(0.0, 1.0, 2.0), Vector(Vector(3.0), Vector(4.0))), s0(Vector(5.0, 6.0, 7.0), Vector(Vector(8.0), Vector(9.0))))), s1(Vector(s0(Vector(10.0, 11.0, 12.0), Vector(Vector(13.0), Vector(14.0))), s0(Vector(15.0, 16.0, 17.0), Vector(Vector(18.0), Vector(19.0)))))), s0(Vector(20.0, 21.0, 22.0), Vector(Vector(23.0), Vector(24.0)))))
    val v1: Double = 25.0
    val start = nanoTime()
    var result: Double = 25.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}