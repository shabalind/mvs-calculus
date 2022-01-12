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
    p0: s0,
    p1: s1
  )
  case class s4 (
    p0: Vector[s1],
    p1: s1
  )
  case class s5 (
    p0: s1,
    p1: Vector[Vector[s0]],
    p2: s2
  )
  case class s6 (
    p0: Vector[s1],
    p1: s4
  )
  @noinline
  def f0(v0: Vector[s5], v1: s6, v2: Vector[Vector[s0]], v3: Double): Double = {
    var v14: Vector[Vector[s0]] = v2
    var v41: Double = v3
    val v26: Vector[s0] = v14(0)
    val v28: Double = v41 - v41
    val v20: Double = v28 + v28
    v14 = v14.updated(1, v26)
    val v52: Vector[s0] = v14(1)
    val v49: s0 = v52(0)
    val v104: Vector[Vector[Double]] = v49.p1
    val v95: Vector[Double] = v104(0)
    val v113: Double = v95(0)
    val v60: Double = v113 + v20
    v14 = v14.updated(1, v26)
    v60
  }
  def benchmark(): Unit = {
    val v0: Vector[s5] = Vector(s5(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0)))), Vector(Vector(s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0)))), Vector(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0))))), s2(s0(Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0))), s1(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0))), s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0), Vector(27.0)))))))
    val v1: s6 = s6(Vector(s1(s0(Vector(Vector(28.0), Vector(29.0)), Vector(Vector(30.0), Vector(31.0))), s0(Vector(Vector(32.0), Vector(33.0)), Vector(Vector(34.0), Vector(35.0)))), s1(s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0))), s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0)))), s1(s0(Vector(Vector(44.0), Vector(45.0)), Vector(Vector(46.0), Vector(47.0))), s0(Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0), Vector(51.0))))), s4(Vector(s1(s0(Vector(Vector(52.0), Vector(53.0)), Vector(Vector(54.0), Vector(55.0))), s0(Vector(Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0)))), s1(s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0), Vector(63.0))), s0(Vector(Vector(64.0), Vector(65.0)), Vector(Vector(66.0), Vector(67.0)))), s1(s0(Vector(Vector(68.0), Vector(69.0)), Vector(Vector(70.0), Vector(71.0))), s0(Vector(Vector(72.0), Vector(73.0)), Vector(Vector(74.0), Vector(75.0))))), s1(s0(Vector(Vector(76.0), Vector(77.0)), Vector(Vector(78.0), Vector(79.0))), s0(Vector(Vector(80.0), Vector(81.0)), Vector(Vector(82.0), Vector(83.0))))))
    val v2: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(84.0), Vector(85.0)), Vector(Vector(86.0), Vector(87.0)))), Vector(s0(Vector(Vector(88.0), Vector(89.0)), Vector(Vector(90.0), Vector(91.0)))))
    val v3: Double = 92.0
    val start = nanoTime()
    var result: Double = 92.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}