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
  case class s2 (
    p0: Vector[s0],
    p1: s0
  )
  case class s4 (
    p0: Vector[s1],
    p1: s0
  )
  def f26(v0: s2, v1: s0): s2 = {
    var v5: s2 = v0
    var v4: s0 = v1
    var v8: s0 = v1
    var v26: s2 = v5
    val v28: Vector[s0] = v0.p0
    val v20: Vector[Vector[Double]] = v4.p1
    var v23: Vector[s0] = v28
    val v38: s0 = v23(1)
    v26 = v26.copy(p1 = v8)
    var v49: s2 = v26
    v8 = v8.copy(p1 = v20)
    v26 = v26.copy(p0 = v28)
    v5 = v5.copy(p1 = v38)
    v49
  }
  def f24(v0: s0): s0 = {
    val v1: Vector[s0] = Vector(v0, v0, v0)
    var v3: s0 = v0
    var v5: Vector[s0] = v1
    v5 = v5.updated(1, v3)
    val v6: Vector[Vector[Double]] = v0.p1
    var v12: Vector[Vector[Double]] = v6
    val v7: Vector[Vector[Double]] = v0.p1
    val v4: Vector[Vector[Double]] = v0.p1
    v3 = v0
    v3 = v3.copy(p1 = v12)
    val v10: Vector[Vector[Vector[Double]]] = Vector(v4, v6, v6, v6, v4, v4, v12)
    val v15: Vector[Vector[Double]] = v10(3)
    v3 = v3.copy(p1 = v6)
    val v9: Vector[Vector[Double]] = v0.p1
    v3 = v0
    val v11: s2 = s2(v5, v0)
    val v40: Vector[Vector[Double]] = v3.p0
    val v23: Vector[Double] = v6(2)
    var v28: Vector[Vector[Double]] = v6
    v12 = v9
    v12 = v12.updated(2, v23)
    val v20: s2 = f26(v11, v0)
    v3 = v3.copy(p0 = v40)
    v3 = v3.copy(p0 = v40)
    val v27: Vector[Vector[Double]] = v0.p0
    v3 = v3.copy(p1 = v28)
    val v24: Vector[Vector[Vector[Double]]] = Vector(v15, v12, v7)
    v28 = v28.updated(2, v23)
    v5 = v5.updated(2, v3)
    v5 = v5.updated(0, v0)
    val v38: Vector[s0] = v11.p0
    v3 = v3.copy(p0 = v40)
    v3 = v3.copy(p0 = v40)
    val v77: Vector[Vector[Double]] = v24(0)
    val v70: Vector[Vector[Double]] = v3.p0
    v3 = v3.copy(p0 = v70)
    val v63: s0 = v20.p1
    v5 = v38
    v3 = v3.copy(p0 = v27)
    v3 = v3.copy(p0 = v70)
    v3 = v3.copy(p1 = v77)
    v3 = v3.copy(p0 = v70)
    v3 = v3.copy(p0 = v27)
    v63
  }
  def f22(v0: s0): s0 = {
    var v2: s0 = v0
    v2 = v0
    val v12: s0 = f24(v2)
    val v40: s0 = f24(v12)
    v40
  }
  def f6(v0: s0): s0 = {
    val v6: s0 = f24(v0)
    val v44: s0 = f22(v6)
    v44
  }
  @noinline
  def f0(v0: Vector[Vector[s4]], v1: Double): Double = {
    val v2: Vector[s4] = v0(0)
    var v5: Double = v1
    val v7: s4 = v2(0)
    var v6: s4 = v7
    val v11: s0 = v7.p1
    val v9: s0 = f24(v11)
    val v8: Vector[s1] = v6.p0
    v6 = v6.copy(p1 = v9)
    v6 = v6.copy(p0 = v8)
    v6 = v6.copy(p0 = v8)
    v6 = v6.copy(p1 = v11)
    var v29: s4 = v6
    val v13: s0 = v29.p1
    val v24: s0 = f6(v13)
    v29 = v29.copy(p0 = v8)
    var v17: Vector[s1] = v8
    val v26: Vector[Vector[Double]] = v24.p1
    v6 = v6.copy(p0 = v17)
    val v23: s0 = f6(v11)
    val v59: Vector[s4] = v0(0)
    var v28: s4 = v6
    var v31: Vector[s1] = v8
    var v60: s4 = v28
    val v57: Vector[Double] = v26(2)
    val v80: s4 = v59(0)
    val v93: Double = v57(0)
    v29 = v29.copy(p1 = v24)
    val v113: Double = v93 - v5
    val v62: Vector[s1] = v80.p0
    v28 = v28.copy(p0 = v17)
    v29 = v29.copy(p0 = v8)
    v29 = v29.copy(p0 = v31)
    v60 = v60.copy(p1 = v23)
    var v85: Vector[Double] = v57
    val v77: Vector[s1] = v60.p0
    var v106: Vector[Double] = v85
    val v108: Double = v106(0)
    v31 = v77
    v28 = v28.copy(p0 = v62)
    val v324: Double = v108 / v113
    v324
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s4]] = Vector(Vector(s4(Vector(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0))), Vector(s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0))))), s1(s0(Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0), Vector(14.0))), Vector(s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0))))), s1(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0), Vector(24.0))), Vector(s0(Vector(Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0)))))), s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0), Vector(33.0), Vector(34.0))))))
    val v1: Double = 35.0
    val start = nanoTime()
    var result: Double = 35.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}