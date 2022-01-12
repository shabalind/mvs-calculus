import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  case class s2 (
    p0: s0,
    p1: s0,
    p2: Vector[Vector[s0]],
    p3: Vector[s0],
    p4: Vector[s1],
    p5: Vector[Vector[s0]]
  )
  @noinline
  def f0(v0: s2, v1: Double): Double = {
    var v2: Double = v1
    val v7: s0 = v0.p1
    val v5: Vector[Vector[Double]] = v7.p1
    val v12: Vector[Double] = v5(0)
    val v14: Double = v12(0)
    val v8: Double = v12(0)
    val v38: Double = v14 * v8
    var v36: Double = v2
    v2 = v38
    val v60: Double = v36 - v38
    v60
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(s0(Vector(Vector(0.0)), Vector(Vector(1.0))), s0(Vector(Vector(2.0)), Vector(Vector(3.0))), Vector(Vector(s0(Vector(Vector(4.0)), Vector(Vector(5.0)))), Vector(s0(Vector(Vector(6.0)), Vector(Vector(7.0))))), Vector(s0(Vector(Vector(8.0)), Vector(Vector(9.0))), s0(Vector(Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0)))), Vector(s1(Vector(s0(Vector(Vector(14.0)), Vector(Vector(15.0)))), Vector(s0(Vector(Vector(16.0)), Vector(Vector(17.0))))), s1(Vector(s0(Vector(Vector(18.0)), Vector(Vector(19.0)))), Vector(s0(Vector(Vector(20.0)), Vector(Vector(21.0))))), s1(Vector(s0(Vector(Vector(22.0)), Vector(Vector(23.0)))), Vector(s0(Vector(Vector(24.0)), Vector(Vector(25.0)))))), Vector(Vector(s0(Vector(Vector(26.0)), Vector(Vector(27.0)))), Vector(s0(Vector(Vector(28.0)), Vector(Vector(29.0)))), Vector(s0(Vector(Vector(30.0)), Vector(Vector(31.0))))))
    val v1: Double = 32.0
    val start = nanoTime()
    var result: Double = 32.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}