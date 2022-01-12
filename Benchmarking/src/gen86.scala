import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s4 (
    p0: s1,
    p1: s1
  )
  def f29(v0: s0, v1: s0): s0 = {
    val v2: Vector[Vector[Double]] = v1.p0
    val v3: Vector[s0] = Vector(v0, v1, v0, v1, v1)
    val v4: s0 = v3(3)
    val v8: Vector[Double] = v2(0)
    val v10: s0 = v3(3)
    val v5: Vector[Vector[Double]] = v1.p0
    val v11: s0 = v3(1)
    val v12: Vector[Vector[Double]] = v10.p1
    val v21: Vector[Vector[Double]] = v4.p1
    var v23: s0 = v0
    var v15: Vector[Vector[Double]] = v2
    var v28: s0 = v1
    v23 = v23.copy(p0 = v5)
    v28 = v28.copy(p1 = v12)
    val v25: Vector[Vector[Double]] = v11.p1
    v28 = v28.copy(p0 = v5)
    v15 = v15.updated(2, v8)
    v23 = v23.copy(p1 = v25)
    val v16: Vector[Vector[Double]] = v28.p0
    v28 = v28.copy(p0 = v5)
    val v38: Vector[Double] = v15(2)
    v23 = v23.copy(p1 = v21)
    v28 = v28.copy(p1 = v21)
    v28 = v28.copy(p1 = v12)
    val v52: Vector[Vector[Double]] = v10.p0
    val v41: s0 = v3(3)
    v28 = v28.copy(p1 = v25)
    val v78: Vector[Vector[Double]] = v10.p1
    val v32: Vector[Vector[Double]] = v11.p0
    var v70: Vector[Vector[Double]] = v32
    var v85: Vector[Vector[Double]] = v70
    var v51: Vector[s0] = v3
    v23 = v23.copy(p1 = v12)
    v15 = v16
    val v66: Vector[Vector[Double]] = v28.p0
    var v93: Vector[s0] = v51
    v28 = v28.copy(p0 = v15)
    v85 = v85.updated(2, v38)
    v93 = v93.updated(1, v28)
    val v86: Vector[Vector[Double]] = v41.p0
    val v74: Vector[Double] = v78(0)
    v28 = v28.copy(p0 = v52)
    v23 = v23.copy(p0 = v66)
    val v176: s0 = v93(1)
    v28 = v28.copy(p0 = v2)
    v51 = v51.updated(4, v28)
    v28 = v28.copy(p1 = v21)
    v23 = v23.copy(p0 = v86)
    val v109: Vector[Double] = v85(1)
    v15 = v15.updated(1, v109)
    v85 = v85.updated(0, v74)
    v93 = v93.updated(3, v23)
    v23 = v23.copy(p0 = v70)
    v176
  }
  def f28(v0: s0): s0 = {
    var v7: s0 = v0
    val v1: Vector[Vector[Double]] = v7.p1
    val v6: s0 = f29(v0, v7)
    val v11: Vector[Double] = v1(0)
    var v9: Vector[Vector[Double]] = v1
    var v8: Vector[Double] = v11
    var v16: Vector[Double] = v8
    v7 = v7.copy(p1 = v1)
    var v31: Vector[Double] = v16
    val v21: Double = v16(0)
    v8 = v31
    v7 = v7.copy(p1 = v9)
    val v15: Double = v16(0)
    val v17: Vector[Vector[Double]] = v7.p0
    v9 = v9.updated(0, v31)
    v8 = v8.updated(0, v15)
    v16 = v16.updated(0, v21)
    val v27: s0 = s0(v17, v9)
    val v55: s0 = f29(v6, v27)
    v9 = v9.updated(0, v31)
    val v43: s0 = f29(v55, v7)
    v43
  }
  def f24(v0: s1): s1 = {
    val v7: s0 = v0.p0
    var v2: s1 = v0
    v2 = v0
    v2 = v2.copy(p0 = v7)
    v2 = v2.copy(p0 = v7)
    v2
  }
  def f19(v0: s4): s4 = {
    var v5: s4 = v0
    val v6: s1 = v0.p1
    v5 = v5.copy(p1 = v6)
    v5
  }
  def f11(v0: s0): s0 = {
    var v2: s0 = v0
    val v6: Vector[Vector[Double]] = v2.p1
    val v1: Vector[Vector[Double]] = v2.p1
    v2 = v2.copy(p1 = v1)
    val v4: s0 = f28(v0)
    v2 = v2.copy(p1 = v1)
    v2 = v2.copy(p1 = v1)
    var v5: s0 = v0
    val v14: Vector[Vector[Double]] = v0.p0
    val v20: s0 = f29(v4, v5)
    v2 = v2.copy(p0 = v14)
    val v15: Vector[Vector[Double]] = v20.p0
    v5 = v5.copy(p0 = v15)
    val v26: s0 = f28(v0)
    v2 = v2.copy(p1 = v1)
    val v30: Vector[s0] = Vector(v20, v26)
    val v38: s0 = v30(0)
    val v46: Vector[Vector[Double]] = v2.p0
    var v125: s0 = v38
    v125 = v125.copy(p1 = v6)
    v5 = v5.copy(p0 = v46)
    v125
  }
  def f6(v0: s1, v1: Double, v2: s4): Double = {
    val v5: s0 = v0.p0
    val v8: Vector[Vector[Double]] = v5.p0
    val v12: Vector[Double] = v8(1)
    val v58: Double = v12(0)
    val v45: Double = v1 + v58
    var v63: Double = v45
    v63
  }
  def f1(v0: s0): s0 = {
    var v6: s0 = v0
    val v8: s0 = f11(v6)
    val v4: Vector[s0] = Vector(v8, v0, v6, v8)
    val v1: s0 = v4(0)
    val v7: s0 = v4(3)
    val v5: s0 = v4(3)
    val v2: Vector[Vector[Double]] = v7.p0
    v6 = v6.copy(p0 = v2)
    val v12: Vector[Vector[Double]] = v5.p1
    var v10: Vector[Vector[Double]] = v2
    var v21: s0 = v7
    val v3: Vector[Double] = v12(0)
    v10 = v10.updated(1, v3)
    val v13: Vector[Double] = v2(0)
    v6 = v6.copy(p0 = v2)
    v10 = v10.updated(0, v3)
    v10 = v10.updated(1, v13)
    v21 = v21.copy(p0 = v10)
    v21 = v21.copy(p1 = v12)
    v21 = v21.copy(p1 = v12)
    val v25: s0 = f11(v21)
    val v43: s0 = f29(v1, v25)
    v43
  }
  @noinline
  def f0(v0: s1, v1: s1, v2: s0, v3: Double): Double = {
    val v5: s0 = f1(v2)
    val v9: s0 = f29(v5, v5)
    val v13: s0 = f28(v9)
    val v8: Vector[Vector[Double]] = v13.p0
    val v10: Vector[Double] = v8(0)
    var v21: Double = v3
    val v15: Double = v10(0)
    val v31: s1 = f24(v0)
    val v76: Vector[s1] = Vector(v1, v0, v0)
    val v71: s1 = v76(1)
    val v64: s4 = s4(v1, v31)
    val v125: s4 = f19(v64)
    val v104: Double = v15 * v21
    val v205: Double = f6(v71, v104, v125)
    v205
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0))), Vector(s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0))), s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0)))))
    val v1: s1 = s1(s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0))), Vector(s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0))), s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0))), s0(Vector(Vector(28.0), Vector(29.0), Vector(30.0)), Vector(Vector(31.0)))))
    val v2: s0 = s0(Vector(Vector(32.0), Vector(33.0), Vector(34.0)), Vector(Vector(35.0)))
    val v3: Double = 36.0
    val start = nanoTime()
    var result: Double = 36.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}