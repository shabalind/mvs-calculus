import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]],
    p3: Vector[Vector[Double]],
    p4: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  case class s2 (
    p0: s1,
    p1: Vector[s0]
  )
  case class s4 (
    p0: Vector[Vector[s1]],
    p1: s2
  )
  @noinline
  def f0(v0: Vector[s1], v1: s1, v2: Vector[Vector[s0]], v3: s4, v4: Double): Double = {
    var v5: Double = v4
    val v12: Vector[s0] = v1.p1
    val v11: s0 = v12(0)
    val v17: Vector[Vector[Double]] = v11.p4
    val v36: Vector[Double] = v17(0)
    val v61: Double = v36(0)
    var v82: Vector[Vector[Double]] = v17
    val v48: Vector[Double] = v82(0)
    val v102: Double = v48(0)
    var v147: Double = v5
    var v78: Double = v4
    val v81: Vector[Double] = Vector(v5, v147, v78, v102, v78, v4, v61)
    val v175: Double = v81(2)
    v175
  }
  def benchmark(): Unit = {
    val v0: Vector[s1] = Vector(s1(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0)), Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0)))), Vector(s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0))))), s1(Vector(s0(Vector(Vector(18.0)), Vector(Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0)), Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0)))), Vector(s0(Vector(Vector(27.0)), Vector(Vector(28.0), Vector(29.0)), Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0)), Vector(Vector(34.0), Vector(35.0))))))
    val v1: s1 = s1(Vector(s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0)), Vector(Vector(39.0), Vector(40.0), Vector(41.0)), Vector(Vector(42.0)), Vector(Vector(43.0), Vector(44.0)))), Vector(s0(Vector(Vector(45.0)), Vector(Vector(46.0), Vector(47.0)), Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0)), Vector(Vector(52.0), Vector(53.0)))))
    val v2: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(54.0)), Vector(Vector(55.0), Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0)), Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0)))), Vector(s0(Vector(Vector(63.0)), Vector(Vector(64.0), Vector(65.0)), Vector(Vector(66.0), Vector(67.0), Vector(68.0)), Vector(Vector(69.0)), Vector(Vector(70.0), Vector(71.0)))), Vector(s0(Vector(Vector(72.0)), Vector(Vector(73.0), Vector(74.0)), Vector(Vector(75.0), Vector(76.0), Vector(77.0)), Vector(Vector(78.0)), Vector(Vector(79.0), Vector(80.0)))))
    val v3: s4 = s4(Vector(Vector(s1(Vector(s0(Vector(Vector(81.0)), Vector(Vector(82.0), Vector(83.0)), Vector(Vector(84.0), Vector(85.0), Vector(86.0)), Vector(Vector(87.0)), Vector(Vector(88.0), Vector(89.0)))), Vector(s0(Vector(Vector(90.0)), Vector(Vector(91.0), Vector(92.0)), Vector(Vector(93.0), Vector(94.0), Vector(95.0)), Vector(Vector(96.0)), Vector(Vector(97.0), Vector(98.0)))))), Vector(s1(Vector(s0(Vector(Vector(99.0)), Vector(Vector(100.0), Vector(101.0)), Vector(Vector(102.0), Vector(103.0), Vector(104.0)), Vector(Vector(105.0)), Vector(Vector(106.0), Vector(107.0)))), Vector(s0(Vector(Vector(108.0)), Vector(Vector(109.0), Vector(110.0)), Vector(Vector(111.0), Vector(112.0), Vector(113.0)), Vector(Vector(114.0)), Vector(Vector(115.0), Vector(116.0)))))), Vector(s1(Vector(s0(Vector(Vector(117.0)), Vector(Vector(118.0), Vector(119.0)), Vector(Vector(120.0), Vector(121.0), Vector(122.0)), Vector(Vector(123.0)), Vector(Vector(124.0), Vector(125.0)))), Vector(s0(Vector(Vector(126.0)), Vector(Vector(127.0), Vector(128.0)), Vector(Vector(129.0), Vector(130.0), Vector(131.0)), Vector(Vector(132.0)), Vector(Vector(133.0), Vector(134.0))))))), s2(s1(Vector(s0(Vector(Vector(135.0)), Vector(Vector(136.0), Vector(137.0)), Vector(Vector(138.0), Vector(139.0), Vector(140.0)), Vector(Vector(141.0)), Vector(Vector(142.0), Vector(143.0)))), Vector(s0(Vector(Vector(144.0)), Vector(Vector(145.0), Vector(146.0)), Vector(Vector(147.0), Vector(148.0), Vector(149.0)), Vector(Vector(150.0)), Vector(Vector(151.0), Vector(152.0))))), Vector(s0(Vector(Vector(153.0)), Vector(Vector(154.0), Vector(155.0)), Vector(Vector(156.0), Vector(157.0), Vector(158.0)), Vector(Vector(159.0)), Vector(Vector(160.0), Vector(161.0))))))
    val v4: Double = 162.0
    val start = nanoTime()
    var result: Double = 162.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}