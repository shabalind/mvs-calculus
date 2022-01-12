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
  case class s4 (
    p0: Vector[s0],
    p1: s1
  )
  case class s5 (
    p0: s0,
    p1: Vector[s1]
  )
  case class s6 (
    p0: Vector[s4],
    p1: Vector[s0]
  )
  case class s9 (
    p0: s6,
    p1: s0
  )
  case class s10 (
    p0: s9,
    p1: s5
  )
  @noinline
  def f0(v0: Vector[Vector[s10]], v1: s6, v2: Double): Double = {
    var v9: Double = v2
    val v8: Vector[s0] = v1.p1
    val v14: s0 = v8(0)
    val v18: Vector[Vector[Double]] = v14.p1
    val v93: Vector[Double] = v18(0)
    val v64: Vector[Double] = v18(0)
    val v66: Double = v93(0)
    val v96: Double = v64(0)
    var v82: Vector[Double] = v93
    v82 = v82.updated(0, v66)
    v82 = v82.updated(0, v96)
    val v98: Double = v82(0)
    v82 = v82.updated(0, v9)
    v98
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s10]] = Vector(Vector(s10(s9(s6(Vector(s4(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0))), s0(Vector(Vector(2.0)), Vector(Vector(3.0)))), s1(s0(Vector(Vector(4.0)), Vector(Vector(5.0))), s0(Vector(Vector(6.0)), Vector(Vector(7.0)))))), Vector(s0(Vector(Vector(8.0)), Vector(Vector(9.0))))), s0(Vector(Vector(10.0)), Vector(Vector(11.0)))), s5(s0(Vector(Vector(12.0)), Vector(Vector(13.0))), Vector(s1(s0(Vector(Vector(14.0)), Vector(Vector(15.0))), s0(Vector(Vector(16.0)), Vector(Vector(17.0)))), s1(s0(Vector(Vector(18.0)), Vector(Vector(19.0))), s0(Vector(Vector(20.0)), Vector(Vector(21.0)))))))))
    val v1: s6 = s6(Vector(s4(Vector(s0(Vector(Vector(22.0)), Vector(Vector(23.0))), s0(Vector(Vector(24.0)), Vector(Vector(25.0)))), s1(s0(Vector(Vector(26.0)), Vector(Vector(27.0))), s0(Vector(Vector(28.0)), Vector(Vector(29.0)))))), Vector(s0(Vector(Vector(30.0)), Vector(Vector(31.0)))))
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