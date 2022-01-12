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
  case class s2 (
    p0: Vector[Vector[s1]],
    p1: Vector[Double]
  )
  case class s6 (
    p0: Vector[Vector[s2]],
    p1: Vector[s1]
  )
  case class s9 (
    p0: Vector[s2],
    p1: s1,
    p2: s6
  )
  def f11(v0: Double): Double = {
    var v4: Double = v0
    var v2: Double = v4
    val v5: Vector[Double] = Vector(v2, v0, v0)
    val v6: Double = v5(2)
    v6
  }
  @noinline
  def f0(v0: s9, v1: Double): Double = {
    val v4: Double = f11(v1)
    var v3: Double = v4
    val v18: Double = f11(v3)
    v18
  }
  def benchmark(): Unit = {
    val v0: s9 = s9(Vector(s2(Vector(Vector(s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0))), s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0)))))), Vector(8.0))), s1(s0(Vector(Vector(9.0), Vector(10.0), Vector(11.0)), Vector(Vector(12.0))), s0(Vector(Vector(13.0), Vector(14.0), Vector(15.0)), Vector(Vector(16.0)))), s6(Vector(Vector(s2(Vector(Vector(s1(s0(Vector(Vector(17.0), Vector(18.0), Vector(19.0)), Vector(Vector(20.0))), s0(Vector(Vector(21.0), Vector(22.0), Vector(23.0)), Vector(Vector(24.0)))))), Vector(25.0))), Vector(s2(Vector(Vector(s1(s0(Vector(Vector(26.0), Vector(27.0), Vector(28.0)), Vector(Vector(29.0))), s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0)))))), Vector(34.0))), Vector(s2(Vector(Vector(s1(s0(Vector(Vector(35.0), Vector(36.0), Vector(37.0)), Vector(Vector(38.0))), s0(Vector(Vector(39.0), Vector(40.0), Vector(41.0)), Vector(Vector(42.0)))))), Vector(43.0)))), Vector(s1(s0(Vector(Vector(44.0), Vector(45.0), Vector(46.0)), Vector(Vector(47.0))), s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0)))), s1(s0(Vector(Vector(52.0), Vector(53.0), Vector(54.0)), Vector(Vector(55.0))), s0(Vector(Vector(56.0), Vector(57.0), Vector(58.0)), Vector(Vector(59.0)))), s1(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0))), s0(Vector(Vector(64.0), Vector(65.0), Vector(66.0)), Vector(Vector(67.0)))))))
    val v1: Double = 68.0
    val start = nanoTime()
    var result: Double = 68.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}