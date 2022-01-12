import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  case class s2 (
    p0: Vector[s0],
    p1: Vector[Double]
  )
  case class s4 (
    p0: s2,
    p1: s2
  )
  @noinline
  def f0(v0: s1, v1: Vector[Vector[s1]], v2: Vector[s4], v3: Vector[Vector[s0]], v4: Double): Double = {
    var v6: Double = v4
    val v5: s4 = v2(1)
    val v18: s2 = v5.p1
    val v38: Vector[Double] = v18.p1
    var v109: Double = v4
    val v49: Double = v38(0)
    var v71: Double = v109
    val v85: Double = v49 * v6
    val v107: Double = v85 + v6
    val v54: Double = v71 * v85
    val v86: Double = v54 + v107
    v86
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0)))), s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0))))
    val v1: Vector[Vector[s1]] = Vector(Vector(s1(Vector(s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0)))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0))))))
    val v2: Vector[s4] = Vector(s4(s2(Vector(s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0))), s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0)))), Vector(24.0, 25.0)), s2(Vector(s0(Vector(Vector(26.0), Vector(27.0), Vector(28.0)), Vector(Vector(29.0))), s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0)))), Vector(34.0, 35.0))), s4(s2(Vector(s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0))), s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0)))), Vector(44.0, 45.0)), s2(Vector(s0(Vector(Vector(46.0), Vector(47.0), Vector(48.0)), Vector(Vector(49.0))), s0(Vector(Vector(50.0), Vector(51.0), Vector(52.0)), Vector(Vector(53.0)))), Vector(54.0, 55.0))))
    val v3: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(56.0), Vector(57.0), Vector(58.0)), Vector(Vector(59.0)))), Vector(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0)))))
    val v4: Double = 64.0
    val start = nanoTime()
    var result: Double = 64.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}