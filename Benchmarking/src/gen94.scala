import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: s1,
    p1: Vector[Vector[s1]]
  )
  case class s5 (
    p0: s0,
    p1: s2
  )
  case class s6 (
    p0: Vector[s2]
  )
  case class s7 (
    p0: s5,
    p1: s0,
    p2: s6
  )
  def f9(v0: s0): s0 = {
    val v6: s1 = s1(v0, v0)
    val v15: s0 = v6.p0
    v15
  }
  @noinline
  def f0(v0: s0, v1: s2, v2: s7, v3: Double): Double = {
    val v7: s0 = f9(v0)
    var v11: Double = v3
    val v13: Vector[Vector[Double]] = v7.p0
    v11 = v3
    val v14: Vector[Double] = v13(0)
    val v40: Double = v3 * v11
    val v28: Double = v40 - v11
    v11 = v28
    val v66: Double = v14(0)
    val v60: Double = v3 + v40
    var v64: Vector[Double] = v14
    v64 = v64.updated(0, v11)
    v64 = v64.updated(0, v60)
    v64 = v64.updated(0, v66)
    val v127: Double = v64(0)
    v127
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0)))
    val v1: s2 = s2(s1(s0(Vector(Vector(1.0))), s0(Vector(Vector(2.0)))), Vector(Vector(s1(s0(Vector(Vector(3.0))), s0(Vector(Vector(4.0))))), Vector(s1(s0(Vector(Vector(5.0))), s0(Vector(Vector(6.0))))), Vector(s1(s0(Vector(Vector(7.0))), s0(Vector(Vector(8.0)))))))
    val v2: s7 = s7(s5(s0(Vector(Vector(9.0))), s2(s1(s0(Vector(Vector(10.0))), s0(Vector(Vector(11.0)))), Vector(Vector(s1(s0(Vector(Vector(12.0))), s0(Vector(Vector(13.0))))), Vector(s1(s0(Vector(Vector(14.0))), s0(Vector(Vector(15.0))))), Vector(s1(s0(Vector(Vector(16.0))), s0(Vector(Vector(17.0)))))))), s0(Vector(Vector(18.0))), s6(Vector(s2(s1(s0(Vector(Vector(19.0))), s0(Vector(Vector(20.0)))), Vector(Vector(s1(s0(Vector(Vector(21.0))), s0(Vector(Vector(22.0))))), Vector(s1(s0(Vector(Vector(23.0))), s0(Vector(Vector(24.0))))), Vector(s1(s0(Vector(Vector(25.0))), s0(Vector(Vector(26.0))))))))))
    val v3: Double = 27.0
    val start = nanoTime()
    var result: Double = 27.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}