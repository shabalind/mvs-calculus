import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: Double
  )
  case class s2 (
    p0: Vector[s0],
    p1: Vector[Vector[s0]]
  )
  case class s4 (
    p0: s0,
    p1: Vector[s1]
  )
  case class s5 (
    p0: Vector[s2],
    p1: s4
  )
  @noinline
  def f0(v0: s4, v1: s5, v2: Double): Double = {
    val v5: Vector[s1] = v0.p1
    val v6: s0 = v0.p0
    val v10: s1 = v5(1)
    var v16: s1 = v10
    val v9: Vector[Vector[Double]] = v6.p0
    val v28: Double = v16.p1
    var v31: Double = v28
    val v41: Vector[Double] = v9(0)
    val v80: Vector[Double] = v9(0)
    v16 = v16.copy(p1 = v31)
    val v69: Double = v80(0)
    val v214: Double = v41(0)
    val v91: Double = v28 - v69
    val v94: Double = v214 / v91
    v94
  }
  def benchmark(): Unit = {
    val v0: s4 = s4(s0(Vector(Vector(0.0)), Vector(Vector(1.0))), Vector(s1(Vector(Vector(s0(Vector(Vector(2.0)), Vector(Vector(3.0))))), 4.0), s1(Vector(Vector(s0(Vector(Vector(5.0)), Vector(Vector(6.0))))), 7.0)))
    val v1: s5 = s5(Vector(s2(Vector(s0(Vector(Vector(8.0)), Vector(Vector(9.0))), s0(Vector(Vector(10.0)), Vector(Vector(11.0)))), Vector(Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0))))))), s4(s0(Vector(Vector(14.0)), Vector(Vector(15.0))), Vector(s1(Vector(Vector(s0(Vector(Vector(16.0)), Vector(Vector(17.0))))), 18.0), s1(Vector(Vector(s0(Vector(Vector(19.0)), Vector(Vector(20.0))))), 21.0))))
    val v2: Double = 22.0
    val start = nanoTime()
    var result: Double = 22.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}