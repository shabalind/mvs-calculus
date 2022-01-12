import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[Vector[s0]]
  )
  case class s2 (
    p0: s0,
    p1: s0
  )
  case class s4 (
    p0: s1,
    p1: s2
  )
  case class s5 (
    p0: Vector[Vector[s0]]
  )
  case class s8 (
    p0: Vector[s5],
    p1: Vector[s0]
  )
  @noinline
  def f0(v0: s4, v1: s8, v2: Double): Double = {
    val v8: Vector[s5] = v1.p0
    val v4: s5 = v8(2)
    val v7: Vector[Vector[s0]] = v4.p0
    var v11: Double = v2
    val v19: Vector[s0] = v7(0)
    val v14: s0 = v19(0)
    val v36: Vector[Vector[Double]] = v14.p0
    val v26: Double = v11 * v2
    val v39: Vector[Double] = v36(0)
    val v82: Double = v39(0)
    val v52: Double = v82 / v26
    v52
  }
  def benchmark(): Unit = {
    val v0: s4 = s4(s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))), Vector(Vector(s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0)))))), s2(s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0)))))
    val v1: s8 = s8(Vector(s5(Vector(Vector(s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0)))))), s5(Vector(Vector(s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0)))))), s5(Vector(Vector(s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0))))))), Vector(s0(Vector(Vector(28.0)), Vector(Vector(29.0), Vector(30.0), Vector(31.0))), s0(Vector(Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0)))))
    val v2: Double = 36.0
    val start = nanoTime()
    var result: Double = 36.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}