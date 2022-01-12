import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Double],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  case class s2 (
    p0: Vector[Vector[s1]],
    p1: Vector[s0]
  )
  case class s4 (
    p0: Vector[Vector[s0]],
    p1: Vector[Vector[s0]]
  )
  case class s7 (
    p0: Vector[Vector[s4]],
    p1: s1
  )
  @noinline
  def f0(v0: Vector[s2], v1: s7, v2: Double): Double = {
    val v4: s2 = v0(0)
    val v13: Vector[s0] = v4.p1
    val v5: s0 = v13(0)
    val v11: Vector[Double] = v5.p0
    val v24: Double = v11(0)
    val v23: Vector[Double] = v5.p0
    val v36: Double = v24 - v2
    val v71: Double = v36 / v24
    val v35: Double = v23(0)
    val v45: Double = v35 - v71
    val v380: Double = v45 + v71
    v380
  }
  def benchmark(): Unit = {
    val v0: Vector[s2] = Vector(s2(Vector(Vector(s1(Vector(s0(Vector(0.0), Vector(Vector(1.0))), s0(Vector(2.0), Vector(Vector(3.0)))), Vector(s0(Vector(4.0), Vector(Vector(5.0))), s0(Vector(6.0), Vector(Vector(7.0))))))), Vector(s0(Vector(8.0), Vector(Vector(9.0))), s0(Vector(10.0), Vector(Vector(11.0))), s0(Vector(12.0), Vector(Vector(13.0))))))
    val v1: s7 = s7(Vector(Vector(s4(Vector(Vector(s0(Vector(14.0), Vector(Vector(15.0))))), Vector(Vector(s0(Vector(16.0), Vector(Vector(17.0))))))), Vector(s4(Vector(Vector(s0(Vector(18.0), Vector(Vector(19.0))))), Vector(Vector(s0(Vector(20.0), Vector(Vector(21.0))))))), Vector(s4(Vector(Vector(s0(Vector(22.0), Vector(Vector(23.0))))), Vector(Vector(s0(Vector(24.0), Vector(Vector(25.0)))))))), s1(Vector(s0(Vector(26.0), Vector(Vector(27.0))), s0(Vector(28.0), Vector(Vector(29.0)))), Vector(s0(Vector(30.0), Vector(Vector(31.0))), s0(Vector(32.0), Vector(Vector(33.0))))))
    val v2: Double = 34.0
    val start = nanoTime()
    var result: Double = 34.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}