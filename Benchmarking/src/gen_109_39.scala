import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Double,
    p1: s0
  )
  case class s2 (
    p0: Vector[s1],
    p1: Vector[Vector[s1]]
  )
  case class s4 (
    p0: s1,
    p1: s1
  )
  case class s5 (
    p0: s2,
    p1: Vector[Vector[s0]]
  )
  case class s9 (
    p0: Vector[s5],
    p1: s4
  )
  case class s10 (
    p0: s9,
    p1: s2
  )
  @noinline
  def f0(v0: Vector[s10], v1: Double): Double = {
    val v6: s10 = v0(0)
    val v4: s9 = v6.p0
    val v26: s4 = v4.p1
    val v47: s1 = v26.p1
    val v104: s0 = v47.p1
    var v62: s0 = v104
    v62 = v104
    val v220: Vector[Vector[Double]] = v62.p1
    val v130: Vector[Double] = v220(0)
    val v168: Double = v130(0)
    v168
  }
  def benchmark(): Unit = {
    val v0: Vector[s10] = Vector(s10(s9(Vector(s5(s2(Vector(s1(0.0, s0(Vector(Vector(1.0), Vector(2.0), Vector(3.0)), Vector(Vector(4.0), Vector(5.0), Vector(6.0)))), s1(7.0, s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0), Vector(12.0), Vector(13.0)))), s1(14.0, s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0), Vector(20.0))))), Vector(Vector(s1(21.0, s0(Vector(Vector(22.0), Vector(23.0), Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0))))))), Vector(Vector(s0(Vector(Vector(28.0), Vector(29.0), Vector(30.0)), Vector(Vector(31.0), Vector(32.0), Vector(33.0)))))), s5(s2(Vector(s1(34.0, s0(Vector(Vector(35.0), Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0), Vector(40.0)))), s1(41.0, s0(Vector(Vector(42.0), Vector(43.0), Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0)))), s1(48.0, s0(Vector(Vector(49.0), Vector(50.0), Vector(51.0)), Vector(Vector(52.0), Vector(53.0), Vector(54.0))))), Vector(Vector(s1(55.0, s0(Vector(Vector(56.0), Vector(57.0), Vector(58.0)), Vector(Vector(59.0), Vector(60.0), Vector(61.0))))))), Vector(Vector(s0(Vector(Vector(62.0), Vector(63.0), Vector(64.0)), Vector(Vector(65.0), Vector(66.0), Vector(67.0))))))), s4(s1(68.0, s0(Vector(Vector(69.0), Vector(70.0), Vector(71.0)), Vector(Vector(72.0), Vector(73.0), Vector(74.0)))), s1(75.0, s0(Vector(Vector(76.0), Vector(77.0), Vector(78.0)), Vector(Vector(79.0), Vector(80.0), Vector(81.0)))))), s2(Vector(s1(82.0, s0(Vector(Vector(83.0), Vector(84.0), Vector(85.0)), Vector(Vector(86.0), Vector(87.0), Vector(88.0)))), s1(89.0, s0(Vector(Vector(90.0), Vector(91.0), Vector(92.0)), Vector(Vector(93.0), Vector(94.0), Vector(95.0)))), s1(96.0, s0(Vector(Vector(97.0), Vector(98.0), Vector(99.0)), Vector(Vector(100.0), Vector(101.0), Vector(102.0))))), Vector(Vector(s1(103.0, s0(Vector(Vector(104.0), Vector(105.0), Vector(106.0)), Vector(Vector(107.0), Vector(108.0), Vector(109.0)))))))))
    val v1: Double = 110.0
    val start = nanoTime()
    var result: Double = 110.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}