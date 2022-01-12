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
    p1: s0
  )
  case class s4 (
    p0: Vector[Vector[s1]],
    p1: s0
  )
  case class s6 (
    p0: Vector[s4],
    p1: s2
  )
  @noinline
  def f0(v0: s6, v1: s4, v2: Double): Double = {
    val v5: Double = v2 - v2
    val v14: s0 = v1.p1
    val v39: Vector[Vector[Double]] = v14.p1
    val v35: Vector[Double] = v39(0)
    val v30: Vector[Double] = v39(0)
    var v45: Vector[Vector[Double]] = v39
    val v75: Double = v2 + v5
    val v98: Vector[Double] = v45(0)
    var v63: Vector[Double] = v35
    val v101: Double = v98(0)
    var v136: Double = v101
    v45 = v45.updated(0, v30)
    val v78: Double = v63(0)
    v63 = v63.updated(0, v136)
    v63 = v63.updated(0, v75)
    v78
  }
  def benchmark(): Unit = {
    val v0: s6 = s6(Vector(s4(Vector(Vector(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0)))), Vector(s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0)))))), Vector(s1(Vector(s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0)))), Vector(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0))))))), s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0)))), s4(Vector(Vector(s1(Vector(s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0)))), Vector(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0)))))), Vector(s1(Vector(s0(Vector(Vector(28.0), Vector(29.0), Vector(30.0)), Vector(Vector(31.0)))), Vector(s0(Vector(Vector(32.0), Vector(33.0), Vector(34.0)), Vector(Vector(35.0))))))), s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0))))), s2(s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0))), s0(Vector(Vector(44.0), Vector(45.0), Vector(46.0)), Vector(Vector(47.0)))))
    val v1: s4 = s4(Vector(Vector(s1(Vector(s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0)))), Vector(s0(Vector(Vector(52.0), Vector(53.0), Vector(54.0)), Vector(Vector(55.0)))))), Vector(s1(Vector(s0(Vector(Vector(56.0), Vector(57.0), Vector(58.0)), Vector(Vector(59.0)))), Vector(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0))))))), s0(Vector(Vector(64.0), Vector(65.0), Vector(66.0)), Vector(Vector(67.0))))
    val v2: Double = 68.0
    val start = nanoTime()
    var result: Double = 68.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}