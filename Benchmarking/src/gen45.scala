import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: s1,
    p1: Vector[Vector[s1]]
  )
  case class s3 (
    p0: s2,
    p1: Vector[Vector[s0]],
    p2: Vector[s1]
  )
  def f71(v0: s1): s1 = {
    val v4: s0 = v0.p1
    var v2: s0 = v4
    var v1: s1 = v0
    v1 = v1.copy(p0 = v2)
    var v7: s1 = v1
    var v3: s0 = v2
    val v6: Vector[Vector[Double]] = v4.p1
    v2 = v2.copy(p1 = v6)
    v2 = v3
    val v18: s0 = v7.p1
    v1 = v1.copy(p1 = v18)
    v3 = v3.copy(p1 = v6)
    val v35: Vector[Vector[Double]] = v2.p0
    var v26: Vector[Vector[Double]] = v35
    v2 = v2.copy(p0 = v26)
    v2 = v2.copy(p0 = v35)
    v7
  }
  def f70(v0: s1): s1 = {
    val v5: Vector[s1] = Vector(v0, v0, v0, v0, v0)
    val v7: s1 = f71(v0)
    var v8: Vector[s1] = v5
    var v4: Vector[s1] = v5
    val v6: s1 = f71(v7)
    val v1: s0 = v6.p1
    v8 = v4
    val v12: s1 = v8(0)
    var v11: s1 = v12
    v11 = v11.copy(p1 = v1)
    val v17: s1 = v4(4)
    val v9: Vector[Vector[Double]] = v1.p1
    v11 = v11.copy(p1 = v1)
    var v10: Vector[Vector[Double]] = v9
    var v16: s0 = v1
    var v27: Vector[Vector[Double]] = v9
    v27 = v9
    val v22: Vector[Double] = v27(0)
    v11 = v11.copy(p0 = v1)
    v16 = v16.copy(p1 = v10)
    v10 = v10.updated(2, v22)
    val v13: s1 = f71(v17)
    var v35: Vector[Vector[Double]] = v10
    v4 = v4.updated(1, v13)
    var v20: s0 = v1
    val v34: Vector[Vector[Double]] = v20.p0
    var v25: Vector[Vector[Double]] = v35
    val v41: Vector[Double] = v34(0)
    val v31: Vector[Double] = v34(0)
    var v37: Vector[Vector[Double]] = v9
    v16 = v16.copy(p1 = v37)
    v25 = v25.updated(2, v22)
    var v38: Vector[Double] = v41
    v16 = v16.copy(p1 = v10)
    v11 = v11.copy(p0 = v1)
    val v57: s1 = f71(v11)
    v27 = v27.updated(0, v38)
    v11 = v11.copy(p0 = v20)
    val v64: Vector[Vector[Double]] = v16.p0
    v35 = v35.updated(1, v31)
    v16 = v16.copy(p0 = v34)
    v10 = v10.updated(2, v38)
    v10 = v10.updated(2, v31)
    val v62: s0 = s0(v34, v9)
    v37 = v25
    v20 = v20.copy(p0 = v34)
    val v77: Vector[Double] = v64(1)
    v16 = v62
    v20 = v20.copy(p0 = v64)
    val v54: Vector[Vector[Double]] = v20.p0
    v27 = v27.updated(0, v77)
    v35 = v35.updated(2, v31)
    var v162: Vector[Vector[Double]] = v54
    v20 = v20.copy(p0 = v162)
    v35 = v35.updated(1, v31)
    v57
  }
  def f65(v0: s1): s1 = {
    val v2: s1 = f70(v0)
    val v4: s0 = v2.p1
    val v10: s0 = v0.p1
    var v8: s0 = v10
    val v15: Vector[Vector[Double]] = v8.p0
    var v13: Vector[Vector[Double]] = v15
    val v9: s1 = f70(v0)
    val v18: Vector[Vector[Double]] = v4.p1
    val v11: Vector[Vector[Double]] = v10.p1
    val v29: s0 = v2.p1
    v8 = v8.copy(p1 = v18)
    var v21: Vector[Vector[Double]] = v13
    val v22: Vector[Double] = v21(1)
    v13 = v13.updated(1, v22)
    v13 = v13.updated(1, v22)
    val v27: Vector[Double] = v13(0)
    val v32: s0 = v9.p1
    var v20: s1 = v9
    val v37: s0 = v0.p1
    val v106: s0 = v2.p1
    v13 = v13.updated(0, v22)
    val v113: s0 = s0(v21, v11)
    val v159: Vector[Vector[Double]] = v106.p1
    v21 = v21.updated(1, v27)
    val v119: s0 = s0(v15, v159)
    val v66: s1 = f71(v20)
    val v110: Vector[s0] = Vector(v119, v32, v37, v29)
    var v253: Vector[s0] = v110
    val v122: s0 = v66.p0
    v253 = v253.updated(0, v122)
    val v157: s0 = v253(2)
    val v142: s1 = s1(v113, v157)
    v142
  }
  def f50(v0: s1): s1 = {
    val v1: s0 = v0.p1
    val v4: s0 = v0.p1
    val v2: Vector[s0] = Vector(v1)
    val v9: s0 = v2(0)
    var v8: s0 = v9
    var v36: s0 = v4
    val v33: s1 = s1(v36, v8)
    v33
  }
  @noinline
  def f0(v0: Vector[s3], v1: Vector[s0], v2: Double): Double = {
    val v5: s0 = v1(1)
    val v4: Vector[Vector[Double]] = v5.p1
    val v8: s1 = s1(v5, v5)
    val v11: s1 = f50(v8)
    val v9: s1 = f65(v11)
    val v13: s0 = v9.p1
    val v17: Vector[Double] = v4(0)
    var v30: Vector[Double] = v17
    var v38: Double = v2
    val v24: Vector[Vector[Double]] = v13.p0
    var v28: Double = v38
    val v41: Vector[Double] = v24(1)
    var v116: Vector[Double] = v30
    v116 = v41
    val v139: Double = v2 + v28
    val v112: Double = v116(0)
    v30 = v30.updated(0, v139)
    v112
  }
  def benchmark(): Unit = {
    val v0: Vector[s3] = Vector(s3(s2(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0))), s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0)))), Vector(Vector(s1(s0(Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0), Vector(14.0))), s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0))))))), Vector(Vector(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0), Vector(24.0)))), Vector(s0(Vector(Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0)))), Vector(s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0), Vector(33.0), Vector(34.0))))), Vector(s1(s0(Vector(Vector(35.0), Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0))), s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0), Vector(44.0)))), s1(s0(Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0), Vector(48.0), Vector(49.0))), s0(Vector(Vector(50.0), Vector(51.0)), Vector(Vector(52.0), Vector(53.0), Vector(54.0)))))))
    val v1: Vector[s0] = Vector(s0(Vector(Vector(55.0), Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0))), s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0), Vector(63.0), Vector(64.0))))
    val v2: Double = 65.0
    val start = nanoTime()
    var result: Double = 65.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}