import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]],
    p3: Vector[Vector[Double]],
    p4: Vector[Vector[Double]],
    p5: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s3 (
    p0: Vector[s1],
    p1: Vector[Vector[s1]]
  )
  case class s4 (
    p0: s0,
    p1: Vector[s3]
  )
  def f36(v0: s4): s4 = {
    var v3: s4 = v0
    val v5: s0 = v3.p0
    v3 = v3.copy(p0 = v5)
    v3 = v3.copy(p0 = v5)
    var v7: s4 = v3
    var v1: s4 = v7
    var v6: s4 = v1
    v3 = v3.copy(p0 = v5)
    v3 = v6
    v1
  }
  @noinline
  def f0(v0: s4, v1: Double): Double = {
    val v6: s4 = f36(v0)
    val v8: s0 = v6.p0
    var v5: Double = v1
    var v7: Double = v1
    val v19: Double = v5 + v7
    var v18: Double = v19
    v5 = v1
    v7 = v1
    val v20: Vector[Vector[Double]] = v8.p5
    val v21: Vector[Double] = v20(0)
    var v14: Vector[Double] = v21
    val v46: Vector[Double] = v20(0)
    v14 = v14.updated(0, v5)
    val v66: Double = v46(0)
    v14 = v14.updated(0, v7)
    v14 = v14.updated(0, v19)
    v14 = v14.updated(0, v18)
    v14 = v14.updated(0, v66)
    v14 = v14.updated(0, v18)
    val v199: Double = v14(0)
    var v136: Double = v199
    v136
  }
  def benchmark(): Unit = {
    val v0: s4 = s4(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0)), Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0)), Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0))), Vector(s3(Vector(s1(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0), Vector(16.0)), Vector(Vector(17.0), Vector(18.0)), Vector(Vector(19.0)), Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0))), s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0), Vector(27.0), Vector(28.0)), Vector(Vector(29.0), Vector(30.0)), Vector(Vector(31.0)), Vector(Vector(32.0), Vector(33.0), Vector(34.0)), Vector(Vector(35.0))))), Vector(Vector(s1(s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0), Vector(40.0)), Vector(Vector(41.0), Vector(42.0)), Vector(Vector(43.0)), Vector(Vector(44.0), Vector(45.0), Vector(46.0)), Vector(Vector(47.0))), s0(Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0), Vector(51.0), Vector(52.0)), Vector(Vector(53.0), Vector(54.0)), Vector(Vector(55.0)), Vector(Vector(56.0), Vector(57.0), Vector(58.0)), Vector(Vector(59.0))))), Vector(s1(s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0), Vector(63.0), Vector(64.0)), Vector(Vector(65.0), Vector(66.0)), Vector(Vector(67.0)), Vector(Vector(68.0), Vector(69.0), Vector(70.0)), Vector(Vector(71.0))), s0(Vector(Vector(72.0), Vector(73.0)), Vector(Vector(74.0), Vector(75.0), Vector(76.0)), Vector(Vector(77.0), Vector(78.0)), Vector(Vector(79.0)), Vector(Vector(80.0), Vector(81.0), Vector(82.0)), Vector(Vector(83.0))))), Vector(s1(s0(Vector(Vector(84.0), Vector(85.0)), Vector(Vector(86.0), Vector(87.0), Vector(88.0)), Vector(Vector(89.0), Vector(90.0)), Vector(Vector(91.0)), Vector(Vector(92.0), Vector(93.0), Vector(94.0)), Vector(Vector(95.0))), s0(Vector(Vector(96.0), Vector(97.0)), Vector(Vector(98.0), Vector(99.0), Vector(100.0)), Vector(Vector(101.0), Vector(102.0)), Vector(Vector(103.0)), Vector(Vector(104.0), Vector(105.0), Vector(106.0)), Vector(Vector(107.0))))))), s3(Vector(s1(s0(Vector(Vector(108.0), Vector(109.0)), Vector(Vector(110.0), Vector(111.0), Vector(112.0)), Vector(Vector(113.0), Vector(114.0)), Vector(Vector(115.0)), Vector(Vector(116.0), Vector(117.0), Vector(118.0)), Vector(Vector(119.0))), s0(Vector(Vector(120.0), Vector(121.0)), Vector(Vector(122.0), Vector(123.0), Vector(124.0)), Vector(Vector(125.0), Vector(126.0)), Vector(Vector(127.0)), Vector(Vector(128.0), Vector(129.0), Vector(130.0)), Vector(Vector(131.0))))), Vector(Vector(s1(s0(Vector(Vector(132.0), Vector(133.0)), Vector(Vector(134.0), Vector(135.0), Vector(136.0)), Vector(Vector(137.0), Vector(138.0)), Vector(Vector(139.0)), Vector(Vector(140.0), Vector(141.0), Vector(142.0)), Vector(Vector(143.0))), s0(Vector(Vector(144.0), Vector(145.0)), Vector(Vector(146.0), Vector(147.0), Vector(148.0)), Vector(Vector(149.0), Vector(150.0)), Vector(Vector(151.0)), Vector(Vector(152.0), Vector(153.0), Vector(154.0)), Vector(Vector(155.0))))), Vector(s1(s0(Vector(Vector(156.0), Vector(157.0)), Vector(Vector(158.0), Vector(159.0), Vector(160.0)), Vector(Vector(161.0), Vector(162.0)), Vector(Vector(163.0)), Vector(Vector(164.0), Vector(165.0), Vector(166.0)), Vector(Vector(167.0))), s0(Vector(Vector(168.0), Vector(169.0)), Vector(Vector(170.0), Vector(171.0), Vector(172.0)), Vector(Vector(173.0), Vector(174.0)), Vector(Vector(175.0)), Vector(Vector(176.0), Vector(177.0), Vector(178.0)), Vector(Vector(179.0))))), Vector(s1(s0(Vector(Vector(180.0), Vector(181.0)), Vector(Vector(182.0), Vector(183.0), Vector(184.0)), Vector(Vector(185.0), Vector(186.0)), Vector(Vector(187.0)), Vector(Vector(188.0), Vector(189.0), Vector(190.0)), Vector(Vector(191.0))), s0(Vector(Vector(192.0), Vector(193.0)), Vector(Vector(194.0), Vector(195.0), Vector(196.0)), Vector(Vector(197.0), Vector(198.0)), Vector(Vector(199.0)), Vector(Vector(200.0), Vector(201.0), Vector(202.0)), Vector(Vector(203.0)))))))))
    val v1: Double = 204.0
    val start = nanoTime()
    var result: Double = 204.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}