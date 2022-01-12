import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[Vector[s0]]
  )
  case class s2 (
    p0: s1,
    p1: Vector[Vector[s0]]
  )
  case class s6 (
    p0: s0,
    p1: Double
  )
  case class s7 (
    p0: Vector[s2],
    p1: Vector[s6]
  )
  def f14(v0: s0): s0 = {
    val v6: Vector[s0] = Vector(v0, v0)
    val v4: s0 = v6(0)
    val v7: Vector[Vector[Double]] = v4.p0
    var v3: Vector[Vector[Double]] = v7
    val v1: Vector[Vector[Double]] = v4.p1
    val v2: s0 = v6(0)
    val v9: Vector[Double] = v7(0)
    val v8: Vector[Double] = v1(0)
    val v15: s0 = v6(0)
    v3 = v3.updated(0, v8)
    val v11: Vector[Vector[Double]] = v4.p1
    var v47: Vector[s0] = v6
    val v32: Vector[Vector[Double]] = v2.p1
    var v24: Vector[s0] = v47
    val v33: s0 = v24(0)
    var v42: Vector[Vector[Double]] = v3
    var v40: s0 = v33
    val v59: Vector[Vector[Double]] = v33.p0
    val v28: Vector[Vector[Double]] = v15.p1
    var v72: Vector[Double] = v9
    val v46: Vector[Vector[Double]] = v33.p1
    val v67: s0 = v6(0)
    v3 = v3.updated(0, v72)
    v40 = v40.copy(p1 = v42)
    v47 = v47.updated(0, v67)
    val v71: Vector[Double] = v46(0)
    v40 = v40.copy(p0 = v42)
    v40 = v40.copy(p0 = v11)
    v40 = v40.copy(p0 = v59)
    v72 = v71
    v40 = v40.copy(p0 = v32)
    v40 = v40.copy(p0 = v28)
    v40
  }
  def f4(v0: s0): s0 = {
    val v2: Vector[Vector[Double]] = v0.p1
    val v1: s0 = f14(v0)
    val v7: Vector[Vector[Double]] = v1.p1
    val v3: Vector[Double] = v7(0)
    val v8: Vector[Double] = v2(0)
    val v6: Double = v3(0)
    val v4: Double = v8(0)
    val v52: s0 = f14(v0)
    val v33: s6 = s6(v52, v6)
    var v83: s6 = v33
    v83 = v83.copy(p1 = v4)
    val v160: s0 = v83.p0
    v160
  }
  @noinline
  def f0(v0: s0, v1: s7, v2: Double): Double = {
    val v6: s0 = f4(v0)
    var v11: Double = v2
    val v13: Vector[Double] = Vector(v11, v11, v11)
    val v16: Vector[Vector[Double]] = v6.p1
    val v12: Vector[Double] = v16(0)
    val v30: Double = v12(0)
    val v21: Double = v13(0)
    val v166: Double = v21 / v30
    val v57: Double = v12(0)
    val v328: Double = v57 * v166
    v328
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0)), Vector(Vector(1.0)))
    val v1: s7 = s7(Vector(s2(s1(Vector(s0(Vector(Vector(2.0)), Vector(Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0)))), Vector(Vector(s0(Vector(Vector(6.0)), Vector(Vector(7.0)))), Vector(s0(Vector(Vector(8.0)), Vector(Vector(9.0)))), Vector(s0(Vector(Vector(10.0)), Vector(Vector(11.0)))))), Vector(Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0)))))), s2(s1(Vector(s0(Vector(Vector(14.0)), Vector(Vector(15.0))), s0(Vector(Vector(16.0)), Vector(Vector(17.0)))), Vector(Vector(s0(Vector(Vector(18.0)), Vector(Vector(19.0)))), Vector(s0(Vector(Vector(20.0)), Vector(Vector(21.0)))), Vector(s0(Vector(Vector(22.0)), Vector(Vector(23.0)))))), Vector(Vector(s0(Vector(Vector(24.0)), Vector(Vector(25.0))))))), Vector(s6(s0(Vector(Vector(26.0)), Vector(Vector(27.0))), 28.0), s6(s0(Vector(Vector(29.0)), Vector(Vector(30.0))), 31.0)))
    val v2: Double = 32.0
    val start = nanoTime()
    var result: Double = 32.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}