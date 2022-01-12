import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Double
  )
  case class s1 (
    p0: s0,
    p1: Vector[Vector[s0]]
  )
  def f21(v0: s0): s0 = {
    v0
  }
  def f16(v0: s0): s0 = {
    var v4: s0 = v0
    val v1: Double = v4.p1
    val v8: Vector[Vector[Double]] = v4.p0
    var v3: Vector[Vector[Double]] = v8
    var v6: Vector[Vector[Double]] = v3
    v4 = v4.copy(p1 = v1)
    val v7: Vector[Double] = v6(0)
    val v9: Vector[Vector[Double]] = v0.p0
    val v15: Double = v7(0)
    var v5: Vector[Vector[Double]] = v9
    var v10: Double = v1
    val v23: Vector[Vector[Double]] = Vector(v7, v7, v7, v7, v7)
    val v16: s0 = f21(v4)
    val v12: Vector[Double] = v23(4)
    val v25: s0 = f21(v16)
    val v14: Vector[Double] = v8(0)
    val v17: Vector[Vector[Double]] = v4.p0
    val v20: s0 = f21(v25)
    val v19: Double = v7(0)
    v4 = v4.copy(p1 = v15)
    val v29: Double = v15 * v15
    v4 = v4.copy(p1 = v10)
    val v39: Vector[Double] = v23(4)
    val v38: Vector[Vector[Double]] = v16.p0
    var v37: Vector[Vector[Double]] = v23
    val v42: Double = v20.p1
    val v24: Vector[Vector[Double]] = v0.p0
    var v35: Vector[Vector[Double]] = v17
    v4 = v4.copy(p1 = v29)
    v4 = v4.copy(p1 = v42)
    var v34: Vector[Vector[Double]] = v37
    v4 = v4.copy(p0 = v24)
    var v32: Double = v15
    val v51: Vector[Double] = v5(1)
    v6 = v6.updated(0, v12)
    var v49: Vector[Vector[Double]] = v38
    v4 = v4.copy(p0 = v35)
    val v43: Vector[Double] = v34(4)
    val v31: Double = v29 * v19
    v37 = v37.updated(0, v12)
    v37 = v37.updated(3, v14)
    val v55: Vector[Vector[Double]] = v4.p0
    val v99: s0 = s0(v3, v31)
    v4 = v4.copy(p1 = v32)
    var v86: Vector[Double] = v39
    v35 = v35.updated(1, v7)
    val v101: s0 = f21(v99)
    v4 = v4.copy(p0 = v55)
    v5 = v5.updated(1, v43)
    v34 = v34.updated(1, v12)
    v34 = v34.updated(0, v7)
    v3 = v3.updated(1, v51)
    v4 = v4.copy(p0 = v49)
    v5 = v5.updated(0, v86)
    v101
  }
  @noinline
  def f0(v0: s0, v1: s1, v2: Double): Double = {
    var v5: s0 = v0
    val v3: s0 = f16(v5)
    var v7: s1 = v1
    val v10: Vector[Vector[Double]] = v3.p0
    v7 = v1
    var v11: Vector[Vector[Double]] = v10
    v11 = v10
    val v8: Vector[Double] = v11(1)
    v5 = v5.copy(p1 = v2)
    v11 = v11.updated(0, v8)
    val v30: Vector[Vector[s0]] = v7.p1
    val v32: Vector[s0] = v30(0)
    val v23: s0 = v32(0)
    v5 = v23
    v11 = v11.updated(0, v8)
    v7 = v1
    val v38: Double = v8(0)
    v38
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0)), 2.0)
    val v1: s1 = s1(s0(Vector(Vector(3.0), Vector(4.0)), 5.0), Vector(Vector(s0(Vector(Vector(6.0), Vector(7.0)), 8.0)), Vector(s0(Vector(Vector(9.0), Vector(10.0)), 11.0))))
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