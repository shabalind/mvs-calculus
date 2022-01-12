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
    p0: Vector[s0],
    p1: s0
  )
  case class s3 (
    p0: Vector[s0],
    p1: Vector[s1]
  )
  case class s4 (
    p0: Vector[s1],
    p1: Vector[Vector[s0]]
  )
  case class s7 (
    p0: s3,
    p1: s4
  )
  case class s8 (
    p0: s2,
    p1: s2
  )
  case class s9 (
    p0: Vector[Vector[s0]],
    p1: s3
  )
  def f8(v0: s2): s2 = {
    var v6: s2 = v0
    val v5: s0 = v6.p1
    val v3: Vector[s0] = v6.p0
    var v7: Vector[s0] = v3
    var v4: s2 = v0
    val v12: s2 = s2(v3, v5)
    var v2: s0 = v5
    v4 = v6
    val v11: s0 = v3(0)
    var v15: s0 = v2
    v4 = v4.copy(p1 = v5)
    val v10: s0 = v7(0)
    val v9: s0 = v3(1)
    val v18: s0 = v4.p1
    val v21: Vector[Vector[Double]] = v11.p1
    v4 = v4.copy(p1 = v2)
    v6 = v6.copy(p1 = v10)
    var v13: s2 = v6
    v2 = v11
    var v27: Vector[s0] = v7
    v4 = v4.copy(p1 = v18)
    var v16: s0 = v10
    val v30: Vector[Vector[Double]] = v2.p1
    val v90: Vector[Vector[Double]] = v10.p0
    v7 = v7.updated(1, v15)
    val v67: s0 = s0(v90, v21)
    v6 = v6.copy(p1 = v11)
    var v86: s2 = v6
    val v44: s0 = v12.p1
    val v40: Vector[Double] = v30(0)
    val v50: Vector[Vector[Double]] = v18.p1
    v6 = v86
    val v64: Vector[s0] = v13.p0
    val v71: Vector[Vector[Double]] = v9.p1
    v7 = v7.updated(1, v44)
    val v82: Vector[s0] = v12.p0
    v6 = v6.copy(p0 = v27)
    val v52: s0 = v64(0)
    v16 = v16.copy(p1 = v50)
    v6 = v6.copy(p0 = v82)
    v15 = v15.copy(p0 = v71)
    var v47: Vector[Vector[Double]] = v90
    val v73: Vector[Vector[Double]] = v52.p0
    v47 = v47.updated(1, v40)
    val v53: Vector[Vector[Double]] = v16.p1
    v4 = v86
    v27 = v27.updated(0, v67)
    v2 = v2.copy(p1 = v47)
    var v144: Vector[s0] = v7
    val v216: Vector[Double] = v73(1)
    v2 = v2.copy(p0 = v53)
    v16 = v16.copy(p1 = v30)
    v47 = v47.updated(0, v216)
    v15 = v15.copy(p0 = v30)
    v15 = v15.copy(p1 = v50)
    v15 = v15.copy(p1 = v73)
    v86 = v86.copy(p0 = v144)
    v12
  }
  @noinline
  def f0(v0: s9, v1: s2, v2: s7, v3: Double): Double = {
    val v10: s2 = f8(v1)
    val v16: s8 = s8(v1, v10)
    val v22: s2 = v16.p1
    val v220: Vector[s0] = v22.p0
    val v67: s0 = v220(0)
    val v53: Vector[Vector[Double]] = v67.p0
    val v79: Vector[Double] = v53(1)
    var v206: Vector[Double] = v79
    val v231: Double = v206(0)
    v231
  }
  def benchmark(): Unit = {
    val v0: s9 = s9(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0))))), s3(Vector(s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0))), s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0)))), Vector(s1(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0))), s0(Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0)))), s1(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0))), s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0), Vector(27.0)))))))
    val v1: s2 = s2(Vector(s0(Vector(Vector(28.0), Vector(29.0)), Vector(Vector(30.0), Vector(31.0))), s0(Vector(Vector(32.0), Vector(33.0)), Vector(Vector(34.0), Vector(35.0)))), s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0))))
    val v2: s7 = s7(s3(Vector(s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0))), s0(Vector(Vector(44.0), Vector(45.0)), Vector(Vector(46.0), Vector(47.0)))), Vector(s1(s0(Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0), Vector(51.0))), s0(Vector(Vector(52.0), Vector(53.0)), Vector(Vector(54.0), Vector(55.0)))), s1(s0(Vector(Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0))), s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0), Vector(63.0)))))), s4(Vector(s1(s0(Vector(Vector(64.0), Vector(65.0)), Vector(Vector(66.0), Vector(67.0))), s0(Vector(Vector(68.0), Vector(69.0)), Vector(Vector(70.0), Vector(71.0))))), Vector(Vector(s0(Vector(Vector(72.0), Vector(73.0)), Vector(Vector(74.0), Vector(75.0)))), Vector(s0(Vector(Vector(76.0), Vector(77.0)), Vector(Vector(78.0), Vector(79.0)))))))
    val v3: Double = 80.0
    val start = nanoTime()
    var result: Double = 80.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}