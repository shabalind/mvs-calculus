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
  case class s4 (
    p0: Vector[s1],
    p1: Vector[s1]
  )
  @noinline
  def f0(v0: Vector[s4], v1: Double): Double = {
    val v7: s4 = v0(0)
    val v15: Vector[s1] = v7.p0
    val v10: s1 = v15(1)
    var v18: s1 = v10
    val v22: s0 = v18.p0
    val v32: Vector[Vector[Double]] = v22.p0
    val v41: Vector[Vector[Double]] = v22.p0
    val v57: Vector[Double] = v41(0)
    val v78: Vector[Double] = v32(0)
    val v67: Double = v78(0)
    val v69: s0 = v10.p0
    v18 = v18.copy(p0 = v69)
    val v80: Double = v57(0)
    val v244: Double = v67 / v80
    var v170: Double = v244
    v170
  }
  def benchmark(): Unit = {
    val v0: Vector[s4] = Vector(s4(Vector(s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0))), Vector(s0(Vector(Vector(2.0)), Vector(Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0))), s0(Vector(Vector(6.0)), Vector(Vector(7.0))))), s1(s0(Vector(Vector(8.0)), Vector(Vector(9.0))), Vector(s0(Vector(Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0))), s0(Vector(Vector(14.0)), Vector(Vector(15.0)))))), Vector(s1(s0(Vector(Vector(16.0)), Vector(Vector(17.0))), Vector(s0(Vector(Vector(18.0)), Vector(Vector(19.0))), s0(Vector(Vector(20.0)), Vector(Vector(21.0))), s0(Vector(Vector(22.0)), Vector(Vector(23.0))))), s1(s0(Vector(Vector(24.0)), Vector(Vector(25.0))), Vector(s0(Vector(Vector(26.0)), Vector(Vector(27.0))), s0(Vector(Vector(28.0)), Vector(Vector(29.0))), s0(Vector(Vector(30.0)), Vector(Vector(31.0))))), s1(s0(Vector(Vector(32.0)), Vector(Vector(33.0))), Vector(s0(Vector(Vector(34.0)), Vector(Vector(35.0))), s0(Vector(Vector(36.0)), Vector(Vector(37.0))), s0(Vector(Vector(38.0)), Vector(Vector(39.0))))))))
    val v1: Double = 40.0
    val start = nanoTime()
    var result: Double = 40.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}