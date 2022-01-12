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
    p1: Vector[s0]
  )
  case class s4 (
    p0: s2,
    p1: s1
  )
  case class s5 (
    p0: s2,
    p1: s4
  )
  case class s6 (
    p0: Vector[s4],
    p1: s2
  )
  case class s7 (
    p0: s0,
    p1: s5
  )
  def f13(v0: s7): s7 = {
    v0
  }
  @noinline
  def f0(v0: s7, v1: s6, v2: Double): Double = {
    val v6: s7 = f13(v0)
    val v8: s0 = v6.p0
    val v12: Vector[Vector[Double]] = v8.p0
    var v9: Vector[Vector[Double]] = v12
    val v25: Vector[Double] = v9(1)
    v9 = v9.updated(0, v25)
    val v34: Vector[Double] = v9(1)
    val v83: Double = v34(0)
    var v73: Double = v83
    v73
  }
  def benchmark(): Unit = {
    val v0: s7 = s7(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0))), s5(s2(s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0))), Vector(s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0))))), s4(s2(s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0))), Vector(s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0), Vector(24.0))))), s1(s0(Vector(Vector(25.0), Vector(26.0), Vector(27.0)), Vector(Vector(28.0), Vector(29.0))), Vector(Vector(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0)))))))))
    val v1: s6 = s6(Vector(s4(s2(s0(Vector(Vector(35.0), Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0))), Vector(s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0), Vector(44.0))))), s1(s0(Vector(Vector(45.0), Vector(46.0), Vector(47.0)), Vector(Vector(48.0), Vector(49.0))), Vector(Vector(s0(Vector(Vector(50.0), Vector(51.0), Vector(52.0)), Vector(Vector(53.0), Vector(54.0)))))))), s2(s0(Vector(Vector(55.0), Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0))), Vector(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0), Vector(64.0))))))
    val v2: Double = 65.0
    val start = nanoTime()
    var result: Double = 65.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}