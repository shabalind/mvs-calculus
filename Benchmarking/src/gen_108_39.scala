import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[Vector[s0]]
  )
  case class s2 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s4 (
    p0: s2,
    p1: s0
  )
  case class s5 (
    p0: s1,
    p1: s4
  )
  @noinline
  def f0(v0: Vector[s5], v1: Double): Double = {
    val v5: s5 = v0(0)
    val v3: s4 = v5.p1
    val v15: s2 = v3.p0
    val v13: s0 = v15.p0
    val v22: s0 = v3.p1
    val v53: Vector[Vector[Double]] = v22.p0
    val v39: Vector[Double] = v53(0)
    val v52: Vector[Double] = v53(1)
    val v49: Vector[Vector[Double]] = v13.p0
    val v58: Vector[Double] = v53(1)
    val v61: Vector[Double] = v49(1)
    val v101: Vector[Vector[Double]] = Vector(v39, v61, v58, v52, v61, v61)
    val v79: Vector[Double] = v101(0)
    val v106: Double = v79(0)
    v106
  }
  def benchmark(): Unit = {
    val v0: Vector[s5] = Vector(s5(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))), s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0))), s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0)))), Vector(Vector(s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0)))))), s4(s2(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0))), Vector(s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0))), s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0))))), s0(Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0))))), s5(s1(Vector(s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0))), s0(Vector(Vector(27.0), Vector(28.0)), Vector(Vector(29.0))), s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0)))), Vector(Vector(s0(Vector(Vector(33.0), Vector(34.0)), Vector(Vector(35.0)))))), s4(s2(s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0))), Vector(s0(Vector(Vector(39.0), Vector(40.0)), Vector(Vector(41.0))), s0(Vector(Vector(42.0), Vector(43.0)), Vector(Vector(44.0))))), s0(Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0))))), s5(s1(Vector(s0(Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0))), s0(Vector(Vector(51.0), Vector(52.0)), Vector(Vector(53.0))), s0(Vector(Vector(54.0), Vector(55.0)), Vector(Vector(56.0)))), Vector(Vector(s0(Vector(Vector(57.0), Vector(58.0)), Vector(Vector(59.0)))))), s4(s2(s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0))), Vector(s0(Vector(Vector(63.0), Vector(64.0)), Vector(Vector(65.0))), s0(Vector(Vector(66.0), Vector(67.0)), Vector(Vector(68.0))))), s0(Vector(Vector(69.0), Vector(70.0)), Vector(Vector(71.0))))))
    val v1: Double = 72.0
    val start = nanoTime()
    var result: Double = 72.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}