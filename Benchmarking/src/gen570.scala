import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0,
    p2: Vector[Vector[s0]],
    p3: Vector[s0],
    p4: s0,
    p5: Double
  )
  case class s2 (
    p0: Vector[s0],
    p1: s1
  )
  case class s3 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s4 (
    p0: s2,
    p1: s0,
    p2: Vector[s3],
    p3: Vector[s0]
  )
  case class s6 (
    p0: s0,
    p1: s0
  )
  def f83(v0: Double): Double = {
    var v4: Double = v0
    var v1: Double = v0
    val v3: Vector[Double] = Vector(v4, v1, v4)
    val v5: Double = v3(2)
    val v8: Double = v3(0)
    var v10: Vector[Double] = v3
    v10 = v10.updated(0, v8)
    val v6: Double = v8 + v8
    var v9: Vector[Double] = v10
    v9 = v9.updated(0, v1)
    var v17: Vector[Double] = v9
    val v16: Double = v17(0)
    v10 = v10.updated(2, v16)
    val v7: Double = v9(2)
    val v18: Double = v16 / v6
    v17 = v17.updated(2, v7)
    v10 = v10.updated(1, v5)
    v10 = v10.updated(1, v0)
    v10 = v10.updated(0, v16)
    v18
  }
  @noinline
  def f0(v0: Vector[Vector[s6]], v1: Vector[s0], v2: s4, v3: s3, v4: Double): Double = {
    val v17: Double = f83(v4)
    v17
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s6]] = Vector(Vector(s6(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0))), s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))))))
    val v1: Vector[s0] = Vector(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0))))
    val v2: s4 = s4(s2(Vector(s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))), s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0)))), s1(Vector(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0))), s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0), Vector(40.0), Vector(41.0)))), s0(Vector(Vector(42.0), Vector(43.0), Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0))), Vector(Vector(s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0), Vector(52.0), Vector(53.0)))), Vector(s0(Vector(Vector(54.0), Vector(55.0), Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0)))), Vector(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0), Vector(64.0), Vector(65.0))))), Vector(s0(Vector(Vector(66.0), Vector(67.0), Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0))), s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)), Vector(Vector(75.0), Vector(76.0), Vector(77.0)))), s0(Vector(Vector(78.0), Vector(79.0), Vector(80.0)), Vector(Vector(81.0), Vector(82.0), Vector(83.0))), 84.0)), s0(Vector(Vector(85.0), Vector(86.0), Vector(87.0)), Vector(Vector(88.0), Vector(89.0), Vector(90.0))), Vector(s3(s0(Vector(Vector(91.0), Vector(92.0), Vector(93.0)), Vector(Vector(94.0), Vector(95.0), Vector(96.0))), Vector(s0(Vector(Vector(97.0), Vector(98.0), Vector(99.0)), Vector(Vector(100.0), Vector(101.0), Vector(102.0))), s0(Vector(Vector(103.0), Vector(104.0), Vector(105.0)), Vector(Vector(106.0), Vector(107.0), Vector(108.0))), s0(Vector(Vector(109.0), Vector(110.0), Vector(111.0)), Vector(Vector(112.0), Vector(113.0), Vector(114.0))))), s3(s0(Vector(Vector(115.0), Vector(116.0), Vector(117.0)), Vector(Vector(118.0), Vector(119.0), Vector(120.0))), Vector(s0(Vector(Vector(121.0), Vector(122.0), Vector(123.0)), Vector(Vector(124.0), Vector(125.0), Vector(126.0))), s0(Vector(Vector(127.0), Vector(128.0), Vector(129.0)), Vector(Vector(130.0), Vector(131.0), Vector(132.0))), s0(Vector(Vector(133.0), Vector(134.0), Vector(135.0)), Vector(Vector(136.0), Vector(137.0), Vector(138.0)))))), Vector(s0(Vector(Vector(139.0), Vector(140.0), Vector(141.0)), Vector(Vector(142.0), Vector(143.0), Vector(144.0))), s0(Vector(Vector(145.0), Vector(146.0), Vector(147.0)), Vector(Vector(148.0), Vector(149.0), Vector(150.0))), s0(Vector(Vector(151.0), Vector(152.0), Vector(153.0)), Vector(Vector(154.0), Vector(155.0), Vector(156.0)))))
    val v3: s3 = s3(s0(Vector(Vector(157.0), Vector(158.0), Vector(159.0)), Vector(Vector(160.0), Vector(161.0), Vector(162.0))), Vector(s0(Vector(Vector(163.0), Vector(164.0), Vector(165.0)), Vector(Vector(166.0), Vector(167.0), Vector(168.0))), s0(Vector(Vector(169.0), Vector(170.0), Vector(171.0)), Vector(Vector(172.0), Vector(173.0), Vector(174.0))), s0(Vector(Vector(175.0), Vector(176.0), Vector(177.0)), Vector(Vector(178.0), Vector(179.0), Vector(180.0)))))
    val v4: Double = 181.0
    val start = nanoTime()
    var result: Double = 181.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}