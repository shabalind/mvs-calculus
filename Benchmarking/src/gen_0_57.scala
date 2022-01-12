import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: s0
  )
  case class s2 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s3 (
    p0: s0,
    p1: Vector[s2]
  )
  case class s9 (
    p0: s3,
    p1: Vector[Vector[s1]]
  )
  @noinline
  def f0(v0: Vector[Vector[s9]], v1: Double): Double = {
    val v7: Vector[s9] = v0(2)
    val v11: s9 = v7(0)
    val v3: Vector[Vector[s1]] = v11.p1
    val v12: Vector[s1] = v3(0)
    val v17: s1 = v12(0)
    val v30: s0 = v17.p1
    val v25: Vector[Vector[Double]] = v30.p0
    val v29: Vector[Double] = v25(2)
    val v36: Double = v29(0)
    val v57: Double = v29(0)
    val v109: Double = v57 - v36
    v109
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s9]] = Vector(Vector(s9(s3(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0), Vector(6.0))), Vector(s2(s0(Vector(Vector(7.0), Vector(8.0), Vector(9.0)), Vector(Vector(10.0)), Vector(Vector(11.0), Vector(12.0), Vector(13.0))), Vector(s0(Vector(Vector(14.0), Vector(15.0), Vector(16.0)), Vector(Vector(17.0)), Vector(Vector(18.0), Vector(19.0), Vector(20.0))))), s2(s0(Vector(Vector(21.0), Vector(22.0), Vector(23.0)), Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0))), Vector(s0(Vector(Vector(28.0), Vector(29.0), Vector(30.0)), Vector(Vector(31.0)), Vector(Vector(32.0), Vector(33.0), Vector(34.0))))))), Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(35.0), Vector(36.0), Vector(37.0)), Vector(Vector(38.0)), Vector(Vector(39.0), Vector(40.0), Vector(41.0))))), s0(Vector(Vector(42.0), Vector(43.0), Vector(44.0)), Vector(Vector(45.0)), Vector(Vector(46.0), Vector(47.0), Vector(48.0)))))))), Vector(s9(s3(s0(Vector(Vector(49.0), Vector(50.0), Vector(51.0)), Vector(Vector(52.0)), Vector(Vector(53.0), Vector(54.0), Vector(55.0))), Vector(s2(s0(Vector(Vector(56.0), Vector(57.0), Vector(58.0)), Vector(Vector(59.0)), Vector(Vector(60.0), Vector(61.0), Vector(62.0))), Vector(s0(Vector(Vector(63.0), Vector(64.0), Vector(65.0)), Vector(Vector(66.0)), Vector(Vector(67.0), Vector(68.0), Vector(69.0))))), s2(s0(Vector(Vector(70.0), Vector(71.0), Vector(72.0)), Vector(Vector(73.0)), Vector(Vector(74.0), Vector(75.0), Vector(76.0))), Vector(s0(Vector(Vector(77.0), Vector(78.0), Vector(79.0)), Vector(Vector(80.0)), Vector(Vector(81.0), Vector(82.0), Vector(83.0))))))), Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(84.0), Vector(85.0), Vector(86.0)), Vector(Vector(87.0)), Vector(Vector(88.0), Vector(89.0), Vector(90.0))))), s0(Vector(Vector(91.0), Vector(92.0), Vector(93.0)), Vector(Vector(94.0)), Vector(Vector(95.0), Vector(96.0), Vector(97.0)))))))), Vector(s9(s3(s0(Vector(Vector(98.0), Vector(99.0), Vector(100.0)), Vector(Vector(101.0)), Vector(Vector(102.0), Vector(103.0), Vector(104.0))), Vector(s2(s0(Vector(Vector(105.0), Vector(106.0), Vector(107.0)), Vector(Vector(108.0)), Vector(Vector(109.0), Vector(110.0), Vector(111.0))), Vector(s0(Vector(Vector(112.0), Vector(113.0), Vector(114.0)), Vector(Vector(115.0)), Vector(Vector(116.0), Vector(117.0), Vector(118.0))))), s2(s0(Vector(Vector(119.0), Vector(120.0), Vector(121.0)), Vector(Vector(122.0)), Vector(Vector(123.0), Vector(124.0), Vector(125.0))), Vector(s0(Vector(Vector(126.0), Vector(127.0), Vector(128.0)), Vector(Vector(129.0)), Vector(Vector(130.0), Vector(131.0), Vector(132.0))))))), Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(133.0), Vector(134.0), Vector(135.0)), Vector(Vector(136.0)), Vector(Vector(137.0), Vector(138.0), Vector(139.0))))), s0(Vector(Vector(140.0), Vector(141.0), Vector(142.0)), Vector(Vector(143.0)), Vector(Vector(144.0), Vector(145.0), Vector(146.0)))))))))
    val v1: Double = 147.0
    val start = nanoTime()
    var result: Double = 147.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}