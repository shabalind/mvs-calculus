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
  case class s3 (
    p0: s1,
    p1: Vector[s0]
  )
  def f38(v0: s0): s0 = {
    var v4: s0 = v0
    var v1: s0 = v0
    var v8: s0 = v4
    val v9: Vector[Vector[Double]] = v8.p1
    v4 = v4.copy(p1 = v9)
    val v2: Vector[Vector[Double]] = v0.p1
    val v3: Vector[Vector[Double]] = v0.p0
    val v12: Vector[Vector[Double]] = v0.p0
    v8 = v8.copy(p1 = v2)
    var v7: s0 = v8
    v7 = v7.copy(p1 = v9)
    val v15: Vector[Vector[Double]] = v4.p0
    v7 = v1
    v4 = v4.copy(p0 = v3)
    val v19: Vector[Vector[Double]] = v7.p0
    val v11: Vector[Vector[Double]] = v8.p1
    var v47: s0 = v1
    v47 = v47.copy(p0 = v15)
    val v32: Vector[Vector[Double]] = v47.p1
    v7 = v7.copy(p1 = v11)
    v1 = v1.copy(p1 = v32)
    val v72: Vector[Vector[Double]] = v1.p0
    val v29: Vector[Vector[Double]] = v7.p0
    v7 = v7.copy(p0 = v19)
    v4 = v4.copy(p1 = v11)
    v47 = v47.copy(p0 = v29)
    var v106: s0 = v47
    val v63: Vector[Vector[Double]] = v47.p0
    val v91: Vector[Vector[Double]] = v8.p1
    v47 = v47.copy(p0 = v12)
    v47 = v47.copy(p0 = v63)
    v1 = v1.copy(p1 = v91)
    v106 = v106.copy(p1 = v11)
    v47 = v47.copy(p1 = v91)
    v106 = v106.copy(p0 = v72)
    v106
  }
  def f33(v0: Vector[s0], v1: s3): s3 = {
    var v2: Vector[s0] = v0
    val v3: s0 = v2(1)
    val v6: s0 = f38(v3)
    val v13: Vector[s0] = v1.p1
    v2 = v2.updated(0, v6)
    val v12: Vector[s0] = v1.p1
    var v16: s3 = v1
    val v20: s0 = v12(1)
    var v44: s3 = v16
    v16 = v16.copy(p1 = v13)
    v2 = v2.updated(1, v20)
    v44 = v44.copy(p1 = v12)
    val v35: s1 = v44.p0
    val v46: s3 = s3(v35, v13)
    val v80: Vector[s0] = v1.p1
    val v41: s0 = f38(v6)
    v44 = v44.copy(p1 = v13)
    val v48: s0 = f38(v41)
    val v51: s3 = s3(v35, v80)
    v2 = v2.updated(0, v41)
    var v49: Vector[s0] = v13
    v16 = v16.copy(p1 = v12)
    val v52: s0 = f38(v48)
    val v139: s1 = v51.p0
    v44 = v44.copy(p0 = v139)
    val v64: s0 = f38(v48)
    var v57: Vector[s0] = v49
    v2 = v2.updated(0, v52)
    v16 = v16.copy(p1 = v57)
    v49 = v49.updated(2, v64)
    v46
  }
  def f29(v0: s3): s3 = {
    val v1: s1 = v0.p0
    val v7: Vector[s0] = v0.p1
    val v4: Vector[s1] = Vector(v1)
    val v5: s0 = v7(1)
    val v3: s1 = v4(0)
    var v12: Vector[s1] = v4
    v12 = v4
    val v30: s1 = v4(0)
    var v18: s1 = v3
    val v13: s1 = v12(0)
    val v20: s0 = v7(0)
    val v27: s1 = v12(0)
    v12 = v12.updated(0, v3)
    v18 = v18.copy(p1 = v5)
    val v39: s0 = f38(v20)
    v12 = v12.updated(0, v13)
    val v77: s0 = v7(0)
    v12 = v12.updated(0, v30)
    val v66: s0 = f38(v39)
    v12 = v12.updated(0, v18)
    val v81: Vector[s0] = v30.p0
    v18 = v18.copy(p1 = v66)
    v18 = v18.copy(p1 = v77)
    var v61: Vector[s1] = v12
    v12 = v61
    val v162: Vector[s0] = v27.p0
    v61 = v61.updated(0, v1)
    v18 = v18.copy(p0 = v162)
    val v184: s1 = v12(0)
    var v95: s3 = v0
    v18 = v18.copy(p0 = v81)
    v95 = v95.copy(p0 = v184)
    v95
  }
  def f23(v0: s3, v1: Double): Double = {
    val v5: s3 = f29(v0)
    var v4: Double = v1
    val v3: Vector[s0] = v5.p1
    val v2: s0 = v3(0)
    v4 = v1
    val v19: Double = v1 + v4
    val v22: Vector[Vector[Double]] = v2.p1
    val v26: Vector[Double] = v22(2)
    val v15: Double = v26(0)
    v4 = v19
    val v36: Double = v19 * v15
    val v72: Double = v26(0)
    var v70: Double = v36
    var v62: Double = v70
    v4 = v72
    v62
  }
  @noinline
  def f0(v0: Vector[s0], v1: s1, v2: s1, v3: s0, v4: Vector[Vector[s3]], v5: Double): Double = {
    val v10: Vector[s3] = v4(0)
    val v13: s3 = v10(0)
    var v14: Double = v5
    val v22: Double = v5 / v14
    var v103: Vector[s0] = v0
    val v35: s3 = f29(v13)
    val v68: s3 = f33(v103, v35)
    val v73: Double = v14 / v22
    val v55: Double = f23(v68, v73)
    v55
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0))))
    val v1: s1 = s1(Vector(s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))), s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0))))
    val v2: s1 = s1(Vector(s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0)))), s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))))
    val v3: s0 = s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0)))
    val v4: Vector[Vector[s3]] = Vector(Vector(s3(s1(Vector(s0(Vector(Vector(28.0)), Vector(Vector(29.0), Vector(30.0), Vector(31.0)))), s0(Vector(Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0)))), Vector(s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0))), s0(Vector(Vector(40.0)), Vector(Vector(41.0), Vector(42.0), Vector(43.0))), s0(Vector(Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0)))))), Vector(s3(s1(Vector(s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0), Vector(51.0)))), s0(Vector(Vector(52.0)), Vector(Vector(53.0), Vector(54.0), Vector(55.0)))), Vector(s0(Vector(Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0))), s0(Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0), Vector(63.0))), s0(Vector(Vector(64.0)), Vector(Vector(65.0), Vector(66.0), Vector(67.0)))))))
    val v5: Double = 68.0
    val start = nanoTime()
    var result: Double = 68.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4, v5)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}