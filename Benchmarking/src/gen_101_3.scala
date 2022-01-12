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
  case class s5 (
    p0: s0,
    p1: s1
  )
  def f67(v0: s0): s0 = {
    var v7: s0 = v0
    val v3: Vector[Vector[Double]] = v7.p1
    var v5: s0 = v7
    var v8: s0 = v5
    v7 = v7.copy(p1 = v3)
    val v4: Vector[Vector[Double]] = v8.p1
    val v2: Vector[Vector[Double]] = v7.p1
    v5 = v5.copy(p1 = v2)
    val v10: Vector[Vector[Double]] = v8.p1
    v8 = v8.copy(p1 = v3)
    val v15: Vector[Vector[Double]] = v0.p1
    val v23: Vector[Vector[Double]] = v7.p1
    v7 = v7.copy(p1 = v23)
    v5 = v5.copy(p1 = v2)
    val v29: Vector[s0] = Vector(v8, v7)
    v7 = v7.copy(p1 = v15)
    val v37: Vector[Vector[Double]] = v5.p1
    val v59: Vector[Vector[Double]] = v5.p0
    var v80: Vector[Vector[Double]] = v59
    val v49: s0 = s0(v59, v4)
    v8 = v8.copy(p1 = v37)
    var v42: Vector[s0] = v29
    val v38: Vector[Vector[Double]] = v49.p0
    val v124: Vector[Vector[Double]] = v8.p1
    v5 = v5.copy(p0 = v80)
    v5 = v5.copy(p0 = v80)
    val v119: s0 = v42(1)
    v7 = v7.copy(p1 = v10)
    var v101: s0 = v119
    v101 = v101.copy(p1 = v2)
    v5 = v5.copy(p1 = v124)
    v101 = v101.copy(p0 = v38)
    v101
  }
  def f60(v0: s1): s1 = {
    var v2: s1 = v0
    val v4: Vector[s1] = Vector(v0)
    val v6: s1 = v4(0)
    var v5: s1 = v2
    v5 = v6
    val v15: s1 = v4(0)
    var v1: s1 = v5
    val v8: Vector[s0] = v1.p0
    val v13: Vector[s0] = v5.p0
    var v9: Vector[s0] = v13
    val v10: s0 = v2.p1
    v2 = v2.copy(p0 = v9)
    val v19: s0 = v9(0)
    var v12: Vector[s0] = v13
    v9 = v9.updated(0, v10)
    val v17: s5 = s5(v19, v15)
    val v21: s0 = v8(0)
    val v25: s0 = v12(0)
    v5 = v5.copy(p0 = v8)
    v2 = v2.copy(p0 = v12)
    val v16: Vector[Vector[s0]] = Vector(v12, v12, v8)
    v9 = v9.updated(0, v21)
    v5 = v5.copy(p1 = v21)
    var v23: Vector[Vector[s0]] = v16
    val v56: Vector[s0] = v23(2)
    v12 = v12.updated(0, v25)
    v5 = v5.copy(p0 = v56)
    val v104: s1 = v17.p1
    v23 = v23.updated(2, v56)
    v104
  }
  def f31(v0: s1): s1 = {
    var v7: s1 = v0
    val v1: Vector[s0] = v0.p0
    val v2: s0 = v1(0)
    v7 = v7.copy(p1 = v2)
    val v6: s1 = f60(v7)
    var v5: s1 = v6
    val v9: s1 = f60(v0)
    val v38: s0 = v1(0)
    val v15: s0 = v0.p1
    v7 = v7.copy(p0 = v1)
    val v18: Vector[s0] = v0.p0
    val v29: s5 = s5(v15, v9)
    val v24: s0 = v29.p0
    val v22: s0 = f67(v24)
    v7 = v7.copy(p1 = v22)
    v7 = v7.copy(p1 = v38)
    val v32: s0 = v6.p1
    v7 = v7.copy(p0 = v18)
    val v58: Vector[s0] = v9.p0
    v5 = v5.copy(p0 = v58)
    v5 = v5.copy(p1 = v32)
    v7 = v7.copy(p0 = v58)
    v5
  }
  @noinline
  def f0(v0: Vector[s1], v1: Double): Double = {
    val v4: s1 = v0(1)
    val v9: s1 = f31(v4)
    val v8: Vector[s0] = v9.p0
    val v11: s0 = v8(0)
    val v5: s0 = v8(0)
    var v10: s0 = v5
    val v29: Vector[Vector[Double]] = v10.p1
    val v12: Vector[Double] = v29(1)
    val v24: s0 = f67(v11)
    val v21: Vector[Vector[Double]] = v11.p0
    v10 = v10.copy(p1 = v29)
    v10 = v10.copy(p0 = v21)
    val v62: Double = v12(0)
    val v32: Double = v1 / v62
    val v90: Vector[Vector[Double]] = v24.p0
    val v125: Double = v32 + v1
    v10 = v10.copy(p0 = v90)
    val v101: Vector[Vector[Double]] = v11.p1
    v10 = v10.copy(p1 = v101)
    var v184: Double = v125
    v184
  }
  def benchmark(): Unit = {
    val v0: Vector[s1] = Vector(s1(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0)))), s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0)))), s1(Vector(s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))), s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0)))), s1(Vector(s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0)))), s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0)))))
    val v1: Double = 24.0
    val start = nanoTime()
    var result: Double = 24.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}