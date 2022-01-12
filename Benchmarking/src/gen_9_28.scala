import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Double],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[s0],
    p2: Vector[s0],
    p3: s0,
    p4: s0
  )
  @noinline
  def f0(v0: Vector[s1], v1: Vector[Vector[s0]], v2: Double): Double = {
    val v8: Vector[s0] = v1(0)
    val v6: s0 = v8(0)
    val v4: Vector[Vector[Double]] = v6.p1
    val v66: Vector[Double] = v4(0)
    var v81: Vector[Double] = v66
    val v136: Double = v66(0)
    var v156: Double = v136
    val v86: Double = v81(0)
    val v85: Double = v86 + v156
    val v106: Double = v86 / v85
    v106
  }
  def benchmark(): Unit = {
    val v0: Vector[s1] = Vector(s1(Vector(s0(Vector(0.0, 1.0, 2.0), Vector(Vector(3.0)))), Vector(s0(Vector(4.0, 5.0, 6.0), Vector(Vector(7.0)))), Vector(s0(Vector(8.0, 9.0, 10.0), Vector(Vector(11.0))), s0(Vector(12.0, 13.0, 14.0), Vector(Vector(15.0))), s0(Vector(16.0, 17.0, 18.0), Vector(Vector(19.0)))), s0(Vector(20.0, 21.0, 22.0), Vector(Vector(23.0))), s0(Vector(24.0, 25.0, 26.0), Vector(Vector(27.0)))), s1(Vector(s0(Vector(28.0, 29.0, 30.0), Vector(Vector(31.0)))), Vector(s0(Vector(32.0, 33.0, 34.0), Vector(Vector(35.0)))), Vector(s0(Vector(36.0, 37.0, 38.0), Vector(Vector(39.0))), s0(Vector(40.0, 41.0, 42.0), Vector(Vector(43.0))), s0(Vector(44.0, 45.0, 46.0), Vector(Vector(47.0)))), s0(Vector(48.0, 49.0, 50.0), Vector(Vector(51.0))), s0(Vector(52.0, 53.0, 54.0), Vector(Vector(55.0)))), s1(Vector(s0(Vector(56.0, 57.0, 58.0), Vector(Vector(59.0)))), Vector(s0(Vector(60.0, 61.0, 62.0), Vector(Vector(63.0)))), Vector(s0(Vector(64.0, 65.0, 66.0), Vector(Vector(67.0))), s0(Vector(68.0, 69.0, 70.0), Vector(Vector(71.0))), s0(Vector(72.0, 73.0, 74.0), Vector(Vector(75.0)))), s0(Vector(76.0, 77.0, 78.0), Vector(Vector(79.0))), s0(Vector(80.0, 81.0, 82.0), Vector(Vector(83.0)))))
    val v1: Vector[Vector[s0]] = Vector(Vector(s0(Vector(84.0, 85.0, 86.0), Vector(Vector(87.0)))), Vector(s0(Vector(88.0, 89.0, 90.0), Vector(Vector(91.0)))), Vector(s0(Vector(92.0, 93.0, 94.0), Vector(Vector(95.0)))))
    val v2: Double = 96.0
    val start = nanoTime()
    var result: Double = 96.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}