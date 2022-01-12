import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s2 (
    p0: Vector[s0],
    p1: s0,
    p2: Vector[s1]
  )
  @noinline
  def f0(v0: s2, v1: Vector[Vector[s1]], v2: Vector[s2], v3: Double): Double = {
    val v4: s0 = v0.p1
    val v17: Vector[Vector[Double]] = v4.p0
    val v21: Vector[Double] = v17(0)
    val v28: Double = v3 + v3
    val v110: Double = v3 + v28
    val v89: Double = v21(0)
    val v93: Double = v21(0)
    var v61: Double = v93
    val v84: Vector[Double] = Vector(v28, v89, v110, v89, v89, v61)
    val v121: Double = v84(1)
    v121
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0))), s0(Vector(Vector(2.0)), Vector(Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0)))), s0(Vector(Vector(6.0)), Vector(Vector(7.0))), Vector(s1(s0(Vector(Vector(8.0)), Vector(Vector(9.0))), Vector(s0(Vector(Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0))), s0(Vector(Vector(14.0)), Vector(Vector(15.0))))), s1(s0(Vector(Vector(16.0)), Vector(Vector(17.0))), Vector(s0(Vector(Vector(18.0)), Vector(Vector(19.0))), s0(Vector(Vector(20.0)), Vector(Vector(21.0))), s0(Vector(Vector(22.0)), Vector(Vector(23.0))))), s1(s0(Vector(Vector(24.0)), Vector(Vector(25.0))), Vector(s0(Vector(Vector(26.0)), Vector(Vector(27.0))), s0(Vector(Vector(28.0)), Vector(Vector(29.0))), s0(Vector(Vector(30.0)), Vector(Vector(31.0)))))))
    val v1: Vector[Vector[s1]] = Vector(Vector(s1(s0(Vector(Vector(32.0)), Vector(Vector(33.0))), Vector(s0(Vector(Vector(34.0)), Vector(Vector(35.0))), s0(Vector(Vector(36.0)), Vector(Vector(37.0))), s0(Vector(Vector(38.0)), Vector(Vector(39.0)))))), Vector(s1(s0(Vector(Vector(40.0)), Vector(Vector(41.0))), Vector(s0(Vector(Vector(42.0)), Vector(Vector(43.0))), s0(Vector(Vector(44.0)), Vector(Vector(45.0))), s0(Vector(Vector(46.0)), Vector(Vector(47.0)))))))
    val v2: Vector[s2] = Vector(s2(Vector(s0(Vector(Vector(48.0)), Vector(Vector(49.0))), s0(Vector(Vector(50.0)), Vector(Vector(51.0))), s0(Vector(Vector(52.0)), Vector(Vector(53.0)))), s0(Vector(Vector(54.0)), Vector(Vector(55.0))), Vector(s1(s0(Vector(Vector(56.0)), Vector(Vector(57.0))), Vector(s0(Vector(Vector(58.0)), Vector(Vector(59.0))), s0(Vector(Vector(60.0)), Vector(Vector(61.0))), s0(Vector(Vector(62.0)), Vector(Vector(63.0))))), s1(s0(Vector(Vector(64.0)), Vector(Vector(65.0))), Vector(s0(Vector(Vector(66.0)), Vector(Vector(67.0))), s0(Vector(Vector(68.0)), Vector(Vector(69.0))), s0(Vector(Vector(70.0)), Vector(Vector(71.0))))), s1(s0(Vector(Vector(72.0)), Vector(Vector(73.0))), Vector(s0(Vector(Vector(74.0)), Vector(Vector(75.0))), s0(Vector(Vector(76.0)), Vector(Vector(77.0))), s0(Vector(Vector(78.0)), Vector(Vector(79.0))))))), s2(Vector(s0(Vector(Vector(80.0)), Vector(Vector(81.0))), s0(Vector(Vector(82.0)), Vector(Vector(83.0))), s0(Vector(Vector(84.0)), Vector(Vector(85.0)))), s0(Vector(Vector(86.0)), Vector(Vector(87.0))), Vector(s1(s0(Vector(Vector(88.0)), Vector(Vector(89.0))), Vector(s0(Vector(Vector(90.0)), Vector(Vector(91.0))), s0(Vector(Vector(92.0)), Vector(Vector(93.0))), s0(Vector(Vector(94.0)), Vector(Vector(95.0))))), s1(s0(Vector(Vector(96.0)), Vector(Vector(97.0))), Vector(s0(Vector(Vector(98.0)), Vector(Vector(99.0))), s0(Vector(Vector(100.0)), Vector(Vector(101.0))), s0(Vector(Vector(102.0)), Vector(Vector(103.0))))), s1(s0(Vector(Vector(104.0)), Vector(Vector(105.0))), Vector(s0(Vector(Vector(106.0)), Vector(Vector(107.0))), s0(Vector(Vector(108.0)), Vector(Vector(109.0))), s0(Vector(Vector(110.0)), Vector(Vector(111.0))))))))
    val v3: Double = 112.0
    val start = nanoTime()
    var result: Double = 112.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}