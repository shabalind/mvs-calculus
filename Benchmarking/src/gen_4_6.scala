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
    p0: s0,
    p1: Vector[s1]
  )
  case class s3 (
    p0: Vector[s1],
    p1: Vector[s2],
    p2: Vector[s2]
  )
  case class s4 (
    p0: Vector[s1],
    p1: Vector[s1]
  )
  def f32(v0: s1): s1 = {
    var v4: s1 = v0
    var v1: s1 = v0
    var v5: s1 = v1
    val v6: s0 = v0.p0
    v1 = v1.copy(p0 = v6)
    val v7: s0 = v5.p1
    v4 = v4.copy(p0 = v7)
    v4 = v4.copy(p1 = v6)
    val v2: s0 = v5.p1
    val v9: Vector[Vector[Double]] = v7.p1
    var v22: s0 = v2
    v22 = v22.copy(p1 = v9)
    v4 = v4.copy(p1 = v22)
    v1 = v1.copy(p1 = v6)
    v5 = v5.copy(p0 = v2)
    v4 = v5
    v4
  }
  def f28(v0: s1): s1 = {
    val v3: s0 = v0.p0
    val v1: s1 = f32(v0)
    val v4: s1 = f32(v0)
    var v9: s1 = v4
    val v8: s1 = f32(v1)
    val v7: s1 = f32(v9)
    val v5: s0 = v7.p0
    v9 = v4
    var v24: s0 = v5
    val v25: s1 = s1(v3, v24)
    var v12: s0 = v5
    val v38: s1 = f32(v8)
    val v19: s1 = s1(v12, v12)
    val v46: s0 = v4.p1
    val v39: Vector[Vector[Double]] = v12.p1
    val v34: s1 = f32(v38)
    val v33: s1 = f32(v34)
    val v52: s0 = v8.p0
    val v55: s1 = f32(v8)
    val v59: s1 = f32(v19)
    val v69: s0 = v8.p0
    v12 = v12.copy(p1 = v39)
    val v60: Vector[Vector[Double]] = v69.p0
    var v64: s1 = v25
    v24 = v46
    v24 = v24.copy(p0 = v60)
    v9 = v9.copy(p0 = v5)
    val v224: s0 = v33.p1
    v9 = v9.copy(p1 = v224)
    v64 = v64.copy(p0 = v24)
    v12 = v69
    val v114: s1 = f32(v55)
    v64 = v64.copy(p1 = v52)
    val v81: s0 = v59.p0
    val v175: s0 = v114.p0
    v9 = v9.copy(p0 = v81)
    val v156: s0 = v9.p0
    v9 = v9.copy(p1 = v69)
    v9 = v9.copy(p0 = v156)
    v64 = v64.copy(p1 = v175)
    v64
  }
  @noinline
  def f0(v0: Vector[s3], v1: Double): Double = {
    val v6: s3 = v0(0)
    var v4: s3 = v6
    var v2: s3 = v6
    val v3: s3 = v0(0)
    val v10: s3 = v0(0)
    val v27: s3 = v0(0)
    val v19: Vector[s1] = v4.p0
    val v17: s1 = v19(1)
    val v28: Vector[s2] = v3.p1
    v4 = v4.copy(p0 = v19)
    val v23: Vector[s2] = v10.p1
    val v25: s0 = v17.p1
    val v20: s1 = f28(v17)
    val v57: s1 = f32(v20)
    v4 = v4.copy(p1 = v23)
    v4 = v4.copy(p1 = v23)
    val v62: s2 = v28(0)
    val v85: Vector[Vector[Double]] = v25.p0
    val v41: Vector[s1] = v62.p1
    val v94: Vector[s2] = v27.p1
    var v60: s3 = v2
    val v140: Vector[Double] = v85(1)
    var v164: Vector[s1] = v41
    val v92: s4 = s4(v164, v19)
    var v133: s4 = v92
    val v131: Vector[s1] = v60.p0
    val v90: Vector[s1] = v133.p1
    v2 = v2.copy(p1 = v94)
    val v75: Double = v140(0)
    v4 = v4.copy(p0 = v90)
    v164 = v164.updated(0, v57)
    v4 = v4.copy(p0 = v131)
    v75
  }
  def benchmark(): Unit = {
    val v0: Vector[s3] = Vector(s3(Vector(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0))), s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0)))), s1(s0(Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0), Vector(14.0))), s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0))))), Vector(s2(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0), Vector(24.0))), Vector(s1(s0(Vector(Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0))), s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0), Vector(33.0), Vector(34.0))))))), Vector(s2(s0(Vector(Vector(35.0), Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0))), Vector(s1(s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0), Vector(44.0))), s0(Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0), Vector(48.0), Vector(49.0)))))), s2(s0(Vector(Vector(50.0), Vector(51.0)), Vector(Vector(52.0), Vector(53.0), Vector(54.0))), Vector(s1(s0(Vector(Vector(55.0), Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0))), s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0), Vector(63.0), Vector(64.0)))))))))
    val v1: Double = 65.0
    val start = nanoTime()
    var result: Double = 65.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}