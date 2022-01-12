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
    p0: Vector[s1],
    p1: s1
  )
  case class s3 (
    p0: s2,
    p1: s0
  )
  def f97(v0: s2): s2 = {
    val v8: Vector[s2] = Vector(v0, v0)
    val v11: s2 = v8(0)
    v11
  }
  def f92(v0: s2): s2 = {
    val v6: s2 = f97(v0)
    val v15: s2 = f97(v6)
    val v46: Vector[s2] = Vector(v15, v15)
    val v44: s2 = v46(1)
    val v83: s2 = f97(v44)
    val v136: s2 = f97(v83)
    v136
  }
  def f68(v0: Double): Double = {
    val v7: Double = v0 / v0
    var v4: Double = v0
    val v6: Vector[Double] = Vector(v7)
    var v2: Vector[Double] = v6
    val v1: Double = v6(0)
    val v5: Double = v2(0)
    v2 = v2.updated(0, v4)
    val v9: Double = v2(0)
    val v8: Vector[Double] = Vector(v5, v0)
    v2 = v2.updated(0, v7)
    val v18: Double = v2(0)
    v2 = v2.updated(0, v1)
    var v10: Vector[Double] = v8
    v10 = v10.updated(1, v9)
    val v16: Double = v10(0)
    v4 = v5
    v2 = v2.updated(0, v18)
    var v42: Double = v16
    v42
  }
  def f48(v0: s2): s2 = {
    val v1: Vector[s1] = v0.p0
    val v5: s1 = v0.p1
    val v7: s2 = s2(v1, v5)
    var v6: Vector[s1] = v1
    val v3: s1 = v1(0)
    var v4: s2 = v7
    v4 = v4.copy(p0 = v6)
    val v22: s1 = v1(0)
    var v14: s1 = v22
    v6 = v6.updated(0, v22)
    val v18: s1 = v1(0)
    val v15: Vector[Vector[s1]] = Vector(v1)
    v6 = v6.updated(0, v14)
    val v16: s0 = v18.p0
    val v28: Vector[s1] = v15(0)
    val v20: Vector[s1] = v4.p0
    v4 = v4.copy(p1 = v3)
    val v38: s1 = v28(0)
    v6 = v20
    val v40: s2 = s2(v6, v38)
    v14 = v14.copy(p0 = v16)
    val v37: s0 = v22.p0
    v6 = v6.updated(0, v18)
    val v81: s3 = s3(v40, v37)
    val v148: s2 = v81.p0
    val v91: s2 = f92(v148)
    v91
  }
  @noinline
  def f0(v0: s2, v1: Double): Double = {
    val v6: Vector[s1] = v0.p0
    var v4: Vector[s1] = v6
    val v5: s1 = v4(1)
    var v3: s2 = v0
    v3 = v3.copy(p1 = v5)
    val v8: s1 = v0.p1
    val v9: Vector[s1] = v3.p0
    val v2: s2 = f48(v0)
    val v17: s2 = f97(v0)
    v4 = v4.updated(0, v5)
    val v11: s1 = v2.p1
    v4 = v4.updated(0, v11)
    val v19: Vector[s1] = v17.p0
    v3 = v3.copy(p1 = v5)
    v4 = v19
    val v27: Vector[s0] = v5.p1
    val v36: s0 = v27(2)
    val v23: Vector[Vector[Double]] = v36.p1
    v3 = v3.copy(p1 = v5)
    v3 = v3.copy(p1 = v8)
    v3 = v17
    v3 = v3.copy(p0 = v9)
    val v76: Vector[Double] = v23(0)
    v4 = v9
    v4 = v6
    val v211: Double = v76(0)
    var v98: Double = v211
    v4 = v4.updated(0, v11)
    val v191: Double = f68(v98)
    v191
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(Vector(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))), Vector(s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0))), s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0))), s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0))))), s1(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0))), Vector(s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0))), s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0))), s0(Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0)))))), s1(s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0))), Vector(s0(Vector(Vector(27.0), Vector(28.0)), Vector(Vector(29.0))), s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0))), s0(Vector(Vector(33.0), Vector(34.0)), Vector(Vector(35.0))))))
    val v1: Double = 36.0
    val start = nanoTime()
    var result: Double = 36.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}