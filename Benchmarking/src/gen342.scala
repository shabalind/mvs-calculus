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
    p1: Vector[Double]
  )
  case class s3 (
    p0: Vector[s2],
    p1: s2
  )
  def f51(v0: s2): s2 = {
    var v4: s2 = v0
    var v2: s2 = v0
    val v8: Vector[Double] = v4.p1
    val v12: Vector[s1] = v0.p0
    v4 = v4.copy(p1 = v8)
    val v3: Vector[Double] = v4.p1
    v2 = v2.copy(p1 = v3)
    v2 = v2.copy(p1 = v8)
    val v7: s1 = v12(1)
    v4 = v4.copy(p1 = v8)
    val v11: Vector[Double] = v4.p1
    val v18: Vector[Double] = v0.p1
    val v10: Vector[s1] = v4.p0
    v2 = v2.copy(p1 = v18)
    val v17: Vector[Double] = v4.p1
    v2 = v2.copy(p1 = v3)
    val v20: Double = v11(1)
    v2 = v2.copy(p0 = v10)
    v2 = v2.copy(p1 = v3)
    val v22: Vector[s1] = v2.p0
    v4 = v4.copy(p1 = v11)
    var v35: Double = v20
    val v24: s1 = v10(1)
    v4 = v4.copy(p1 = v3)
    val v60: Double = v35 / v35
    v4 = v4.copy(p0 = v12)
    v2 = v2.copy(p1 = v17)
    v2 = v2.copy(p1 = v11)
    val v42: Vector[Double] = v4.p1
    v4 = v4.copy(p0 = v22)
    var v37: Vector[s1] = v22
    var v25: Vector[Double] = v8
    val v49: s2 = s2(v37, v11)
    v2 = v2.copy(p1 = v42)
    v4 = v4.copy(p1 = v25)
    v37 = v37.updated(0, v24)
    v4 = v49
    v2 = v2.copy(p1 = v18)
    val v46: Vector[s1] = v0.p0
    v25 = v25.updated(0, v60)
    v2 = v2.copy(p0 = v46)
    v4 = v4.copy(p0 = v46)
    v4 = v4.copy(p1 = v18)
    v37 = v37.updated(1, v7)
    v4 = v4.copy(p1 = v17)
    v2
  }
  def f40(v0: s3): s3 = {
    val v4: s2 = v0.p1
    var v3: s2 = v4
    val v1: s2 = f51(v4)
    var v7: s3 = v0
    var v6: s2 = v4
    var v2: s3 = v7
    v7 = v7.copy(p1 = v6)
    val v9: s2 = f51(v1)
    val v15: Vector[Double] = v9.p1
    var v18: s3 = v2
    v18 = v18.copy(p1 = v3)
    v3 = v3.copy(p1 = v15)
    v7 = v18
    v7
  }
  def f36(v0: s2): s2 = {
    val v7: s2 = f51(v0)
    val v6: s2 = f51(v0)
    var v1: s2 = v0
    val v2: Vector[s1] = v1.p0
    val v8: s2 = f51(v1)
    val v4: s2 = f51(v6)
    val v10: Vector[Double] = v7.p1
    var v3: Vector[Double] = v10
    val v5: Vector[s1] = v6.p0
    val v9: Vector[Double] = v7.p1
    var v12: Vector[s1] = v2
    v1 = v1.copy(p0 = v12)
    val v13: Double = v10(1)
    var v18: Double = v13
    v3 = v3.updated(1, v18)
    v1 = v1.copy(p1 = v9)
    val v17: s2 = f51(v8)
    v3 = v3.updated(0, v13)
    v1 = v1.copy(p0 = v5)
    v1 = v1.copy(p0 = v2)
    val v15: s2 = f51(v17)
    v3 = v3.updated(1, v13)
    v1 = v1.copy(p0 = v5)
    var v34: Vector[Double] = v3
    v1 = v1.copy(p1 = v3)
    var v29: s2 = v4
    v29 = v15
    val v30: Vector[Double] = v17.p1
    v29 = v29.copy(p1 = v30)
    v1 = v1.copy(p1 = v34)
    v1 = v1.copy(p0 = v2)
    v29
  }
  def f29(v0: s3): s3 = {
    var v1: s3 = v0
    val v8: s3 = f40(v0)
    val v6: s3 = f40(v8)
    val v3: Vector[s2] = v8.p0
    val v2: Vector[s2] = v6.p0
    val v4: s2 = v2(0)
    val v10: s2 = f36(v4)
    val v20: s2 = f36(v10)
    var v33: s3 = v1
    v33 = v33.copy(p1 = v20)
    v33 = v33.copy(p1 = v4)
    v33 = v33.copy(p0 = v3)
    v33
  }
  @noinline
  def f0(v0: s3, v1: Double): Double = {
    val v4: s3 = f29(v0)
    val v7: s2 = v4.p1
    val v11: Vector[Double] = v7.p1
    val v19: Vector[Vector[Double]] = Vector(v11, v11, v11, v11, v11, v11)
    val v57: Vector[Double] = v19(1)
    var v28: Vector[Vector[Double]] = v19
    val v46: Vector[Double] = v28(3)
    v28 = v28.updated(4, v57)
    val v108: Double = v46(0)
    v108
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(Vector(s2(Vector(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))), Vector(s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0))), s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0))), s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0))))), s1(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0))), Vector(s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0))), s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0))), s0(Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0)))))), Vector(24.0, 25.0))), s2(Vector(s1(s0(Vector(Vector(26.0), Vector(27.0)), Vector(Vector(28.0))), Vector(s0(Vector(Vector(29.0), Vector(30.0)), Vector(Vector(31.0))), s0(Vector(Vector(32.0), Vector(33.0)), Vector(Vector(34.0))), s0(Vector(Vector(35.0), Vector(36.0)), Vector(Vector(37.0))))), s1(s0(Vector(Vector(38.0), Vector(39.0)), Vector(Vector(40.0))), Vector(s0(Vector(Vector(41.0), Vector(42.0)), Vector(Vector(43.0))), s0(Vector(Vector(44.0), Vector(45.0)), Vector(Vector(46.0))), s0(Vector(Vector(47.0), Vector(48.0)), Vector(Vector(49.0)))))), Vector(50.0, 51.0)))
    val v1: Double = 52.0
    val start = nanoTime()
    var result: Double = 52.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}