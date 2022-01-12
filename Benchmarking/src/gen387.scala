import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0
  )
  case class s2 (
    p0: Vector[s0],
    p1: s0
  )
  case class s7 (
    p0: Vector[s2],
    p1: Vector[Vector[s1]]
  )
  @noinline
  def f0(v0: Vector[s7], v1: Vector[s7], v2: Double): Double = {
    val v11: Vector[Double] = Vector(v2, v2, v2, v2, v2, v2, v2)
    val v19: Double = v11(5)
    var v30: Vector[Double] = v11
    v30 = v30.updated(6, v2)
    val v27: Double = v30(1)
    var v81: Vector[Double] = v30
    val v73: Double = v27 + v27
    val v150: Double = v81(3)
    val v48: Vector[Double] = Vector(v73, v150, v27, v27)
    v30 = v30.updated(3, v19)
    val v66: Double = v48(2)
    v66
  }
  def benchmark(): Unit = {
    val v0: Vector[s7] = Vector(s7(Vector(s2(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0)), Vector(Vector(4.0), Vector(5.0))), s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0)))), s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0)), Vector(Vector(16.0), Vector(17.0))))), Vector(Vector(s1(s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0))))), Vector(s1(s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0), Vector(27.0)), Vector(Vector(28.0), Vector(29.0))))), Vector(s1(s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0), Vector(33.0)), Vector(Vector(34.0), Vector(35.0))))))), s7(Vector(s2(Vector(s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0)), Vector(Vector(40.0), Vector(41.0))), s0(Vector(Vector(42.0), Vector(43.0)), Vector(Vector(44.0), Vector(45.0)), Vector(Vector(46.0), Vector(47.0)))), s0(Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0), Vector(51.0)), Vector(Vector(52.0), Vector(53.0))))), Vector(Vector(s1(s0(Vector(Vector(54.0), Vector(55.0)), Vector(Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0))))), Vector(s1(s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0), Vector(63.0)), Vector(Vector(64.0), Vector(65.0))))), Vector(s1(s0(Vector(Vector(66.0), Vector(67.0)), Vector(Vector(68.0), Vector(69.0)), Vector(Vector(70.0), Vector(71.0))))))))
    val v1: Vector[s7] = Vector(s7(Vector(s2(Vector(s0(Vector(Vector(72.0), Vector(73.0)), Vector(Vector(74.0), Vector(75.0)), Vector(Vector(76.0), Vector(77.0))), s0(Vector(Vector(78.0), Vector(79.0)), Vector(Vector(80.0), Vector(81.0)), Vector(Vector(82.0), Vector(83.0)))), s0(Vector(Vector(84.0), Vector(85.0)), Vector(Vector(86.0), Vector(87.0)), Vector(Vector(88.0), Vector(89.0))))), Vector(Vector(s1(s0(Vector(Vector(90.0), Vector(91.0)), Vector(Vector(92.0), Vector(93.0)), Vector(Vector(94.0), Vector(95.0))))), Vector(s1(s0(Vector(Vector(96.0), Vector(97.0)), Vector(Vector(98.0), Vector(99.0)), Vector(Vector(100.0), Vector(101.0))))), Vector(s1(s0(Vector(Vector(102.0), Vector(103.0)), Vector(Vector(104.0), Vector(105.0)), Vector(Vector(106.0), Vector(107.0))))))))
    val v2: Double = 108.0
    val start = nanoTime()
    var result: Double = 108.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}