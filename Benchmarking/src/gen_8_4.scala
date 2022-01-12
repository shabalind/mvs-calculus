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
  case class s2 (
    p0: Vector[s1],
    p1: Vector[Vector[s1]]
  )
  def f11(v0: s0): s0 = {
    var v4: s0 = v0
    var v2: s0 = v4
    var v3: s0 = v4
    val v11: Vector[Vector[Double]] = v3.p0
    v2 = v2.copy(p0 = v11)
    val v6: Vector[Double] = v11(0)
    val v5: Vector[Vector[Double]] = v4.p0
    val v8: Vector[Double] = v5(1)
    val v9: Vector[Vector[Double]] = v2.p0
    var v10: Vector[Double] = v6
    val v7: Vector[Vector[Double]] = v0.p0
    var v24: Vector[Vector[Double]] = v9
    val v16: Vector[Vector[Double]] = v2.p0
    val v28: Double = v8(0)
    v2 = v2.copy(p0 = v7)
    var v17: Double = v28
    v4 = v4.copy(p0 = v11)
    v24 = v24.updated(1, v10)
    v4 = v4.copy(p0 = v16)
    var v26: Double = v17
    v10 = v10.updated(0, v28)
    v24 = v24.updated(0, v8)
    val v22: s0 = s0(v24, v24)
    v4 = v22
    v10 = v10.updated(0, v26)
    v10 = v10.updated(0, v28)
    v22
  }
  @noinline
  def f0(v0: s2, v1: Double): Double = {
    var v6: s2 = v0
    val v10: Vector[Vector[s1]] = v6.p1
    val v7: Vector[Vector[s1]] = v0.p1
    val v9: Vector[s1] = v10(0)
    val v15: Vector[s1] = v10(1)
    v6 = v6.copy(p1 = v7)
    val v5: s1 = v9(0)
    var v30: s2 = v0
    val v11: Vector[s2] = Vector(v6, v6, v30, v6, v30, v30)
    val v36: s2 = v11(3)
    var v22: s1 = v5
    val v18: Vector[Vector[s1]] = v6.p1
    val v23: Vector[s0] = v22.p0
    val v34: Vector[Vector[s1]] = v36.p1
    val v20: Vector[s1] = v34(2)
    val v38: s1 = v9(0)
    v22 = v22.copy(p0 = v23)
    val v53: s0 = v23(1)
    val v51: Vector[Vector[Double]] = v53.p0
    val v54: s0 = v23(1)
    var v28: s1 = v22
    v22 = v28
    v28 = v22
    val v24: Vector[Double] = v51(1)
    val v37: s0 = v5.p1
    val v55: Vector[s0] = v5.p0
    val v103: s0 = f11(v37)
    val v65: s0 = f11(v54)
    v6 = v6.copy(p0 = v20)
    var v40: Vector[s0] = v55
    v30 = v30.copy(p1 = v18)
    val v57: s0 = f11(v37)
    v6 = v6.copy(p1 = v34)
    val v71: s0 = f11(v65)
    v28 = v28.copy(p0 = v40)
    v40 = v40.updated(1, v57)
    val v73: s0 = f11(v103)
    v6 = v6.copy(p1 = v10)
    var v44: s1 = v38
    v40 = v40.updated(0, v103)
    v28 = v28.copy(p1 = v71)
    val v80: Vector[s0] = v44.p0
    v28 = v28.copy(p0 = v80)
    val v56: s1 = v15(0)
    v22 = v22.copy(p1 = v71)
    val v116: s0 = v56.p1
    v40 = v40.updated(0, v73)
    val v157: Double = v24(0)
    v22 = v22.copy(p1 = v116)
    v157
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(Vector(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0)))), s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0))))), Vector(Vector(s1(Vector(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0))), s0(Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0)))), s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0))))), Vector(s1(Vector(s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0), Vector(27.0))), s0(Vector(Vector(28.0), Vector(29.0)), Vector(Vector(30.0), Vector(31.0)))), s0(Vector(Vector(32.0), Vector(33.0)), Vector(Vector(34.0), Vector(35.0))))), Vector(s1(Vector(s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0))), s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0)))), s0(Vector(Vector(44.0), Vector(45.0)), Vector(Vector(46.0), Vector(47.0)))))))
    val v1: Double = 48.0
    val start = nanoTime()
    var result: Double = 48.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}