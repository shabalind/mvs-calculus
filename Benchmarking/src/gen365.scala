import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0,
    p2: s0,
    p3: s0
  )
  case class s4 (
    p0: s1,
    p1: s1
  )
  def f93(v0: s4): s4 = {
    var v3: s4 = v0
    var v1: s4 = v0
    var v9: s4 = v3
    var v4: s4 = v3
    val v13: s1 = v9.p1
    var v2: s4 = v1
    var v12: s1 = v13
    var v14: s1 = v13
    val v6: s1 = v2.p0
    val v11: Vector[s1] = Vector(v6, v6, v14, v6)
    var v8: s1 = v12
    val v17: s0 = v6.p3
    val v16: s1 = v4.p1
    val v10: s1 = v11(3)
    v3 = v3.copy(p0 = v16)
    var v18: s4 = v4
    val v25: s1 = v11(0)
    v14 = v14.copy(p1 = v17)
    val v36: s1 = v11(0)
    v8 = v8.copy(p1 = v17)
    v4 = v4.copy(p1 = v8)
    v18 = v18.copy(p1 = v25)
    v2 = v2.copy(p1 = v10)
    v1 = v1.copy(p0 = v36)
    v18
  }
  def f89(v0: s1): s1 = {
    val v4: s0 = v0.p3
    var v1: s1 = v0
    v1 = v1.copy(p2 = v4)
    v1 = v1.copy(p2 = v4)
    var v2: s1 = v1
    v2
  }
  def f82(v0: s1): s1 = {
    val v5: s1 = f89(v0)
    var v25: s1 = v5
    v25
  }
  @noinline
  def f0(v0: s4, v1: Double): Double = {
    val v7: s4 = f93(v0)
    var v6: s4 = v0
    val v3: s1 = v6.p0
    v6 = v7
    var v2: s4 = v7
    val v5: s0 = v3.p1
    val v15: s0 = v3.p3
    v2 = v2.copy(p0 = v3)
    var v12: s4 = v7
    val v10: s0 = v3.p0
    var v13: s1 = v3
    v6 = v6.copy(p1 = v13)
    var v24: s0 = v10
    val v17: Vector[Vector[Double]] = v24.p2
    var v20: Double = v1
    val v18: Vector[Vector[Double]] = v10.p2
    v24 = v24.copy(p2 = v18)
    val v14: s1 = v2.p0
    val v32: Vector[Vector[Double]] = v15.p0
    val v25: s1 = f89(v14)
    val v34: Vector[Double] = v32(0)
    var v29: s0 = v5
    v13 = v13.copy(p1 = v29)
    var v31: Vector[Double] = v34
    val v30: Double = v1 + v20
    val v53: s1 = v12.p0
    v31 = v31.updated(0, v30)
    val v119: s1 = f82(v13)
    var v44: s1 = v119
    val v70: Double = v31(0)
    v12 = v12.copy(p0 = v44)
    v13 = v13.copy(p3 = v24)
    v24 = v24.copy(p2 = v17)
    v6 = v6.copy(p0 = v25)
    v6 = v6.copy(p0 = v53)
    v2 = v2.copy(p1 = v53)
    v70
  }
  def benchmark(): Unit = {
    val v0: s4 = s4(s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0)), Vector(Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0)), Vector(Vector(6.0), Vector(7.0))), s0(Vector(Vector(8.0)), Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0)), Vector(Vector(14.0), Vector(15.0)))), s1(s0(Vector(Vector(16.0)), Vector(Vector(17.0)), Vector(Vector(18.0), Vector(19.0))), s0(Vector(Vector(20.0)), Vector(Vector(21.0)), Vector(Vector(22.0), Vector(23.0))), s0(Vector(Vector(24.0)), Vector(Vector(25.0)), Vector(Vector(26.0), Vector(27.0))), s0(Vector(Vector(28.0)), Vector(Vector(29.0)), Vector(Vector(30.0), Vector(31.0)))))
    val v1: Double = 32.0
    val start = nanoTime()
    var result: Double = 32.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}