import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[Vector[s0]],
    p2: s0,
    p3: Vector[Vector[s0]],
    p4: Vector[Vector[s0]]
  )
  case class s2 (
    p0: Vector[Double],
    p1: Vector[s0]
  )
  case class s3 (
    p0: Vector[Vector[s0]],
    p1: Vector[s2],
    p2: s0,
    p3: s1
  )
  @noinline
  def f0(v0: Vector[s3], v1: Vector[s3], v2: Double): Double = {
    var v5: Double = v2
    val v8: s3 = v1(0)
    val v6: Vector[s2] = v8.p1
    val v3: s2 = v6(1)
    val v13: Vector[s0] = v3.p1
    val v34: s0 = v13(2)
    val v25: Vector[Vector[Double]] = v34.p1
    val v22: Vector[Double] = v25(0)
    val v32: Double = v22(0)
    val v71: Double = v2 / v5
    val v114: Double = v71 / v32
    val v197: Double = v32 + v114
    v197
  }
  def benchmark(): Unit = {
    val v0: Vector[s3] = Vector(s3(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0)))), Vector(s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0))))), Vector(s2(Vector(8.0), Vector(s0(Vector(Vector(9.0), Vector(10.0), Vector(11.0)), Vector(Vector(12.0))), s0(Vector(Vector(13.0), Vector(14.0), Vector(15.0)), Vector(Vector(16.0))), s0(Vector(Vector(17.0), Vector(18.0), Vector(19.0)), Vector(Vector(20.0))))), s2(Vector(21.0), Vector(s0(Vector(Vector(22.0), Vector(23.0), Vector(24.0)), Vector(Vector(25.0))), s0(Vector(Vector(26.0), Vector(27.0), Vector(28.0)), Vector(Vector(29.0))), s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0)))))), s0(Vector(Vector(34.0), Vector(35.0), Vector(36.0)), Vector(Vector(37.0))), s1(s0(Vector(Vector(38.0), Vector(39.0), Vector(40.0)), Vector(Vector(41.0))), Vector(Vector(s0(Vector(Vector(42.0), Vector(43.0), Vector(44.0)), Vector(Vector(45.0)))), Vector(s0(Vector(Vector(46.0), Vector(47.0), Vector(48.0)), Vector(Vector(49.0))))), s0(Vector(Vector(50.0), Vector(51.0), Vector(52.0)), Vector(Vector(53.0))), Vector(Vector(s0(Vector(Vector(54.0), Vector(55.0), Vector(56.0)), Vector(Vector(57.0)))), Vector(s0(Vector(Vector(58.0), Vector(59.0), Vector(60.0)), Vector(Vector(61.0)))), Vector(s0(Vector(Vector(62.0), Vector(63.0), Vector(64.0)), Vector(Vector(65.0))))), Vector(Vector(s0(Vector(Vector(66.0), Vector(67.0), Vector(68.0)), Vector(Vector(69.0)))), Vector(s0(Vector(Vector(70.0), Vector(71.0), Vector(72.0)), Vector(Vector(73.0)))), Vector(s0(Vector(Vector(74.0), Vector(75.0), Vector(76.0)), Vector(Vector(77.0))))))), s3(Vector(Vector(s0(Vector(Vector(78.0), Vector(79.0), Vector(80.0)), Vector(Vector(81.0)))), Vector(s0(Vector(Vector(82.0), Vector(83.0), Vector(84.0)), Vector(Vector(85.0))))), Vector(s2(Vector(86.0), Vector(s0(Vector(Vector(87.0), Vector(88.0), Vector(89.0)), Vector(Vector(90.0))), s0(Vector(Vector(91.0), Vector(92.0), Vector(93.0)), Vector(Vector(94.0))), s0(Vector(Vector(95.0), Vector(96.0), Vector(97.0)), Vector(Vector(98.0))))), s2(Vector(99.0), Vector(s0(Vector(Vector(100.0), Vector(101.0), Vector(102.0)), Vector(Vector(103.0))), s0(Vector(Vector(104.0), Vector(105.0), Vector(106.0)), Vector(Vector(107.0))), s0(Vector(Vector(108.0), Vector(109.0), Vector(110.0)), Vector(Vector(111.0)))))), s0(Vector(Vector(112.0), Vector(113.0), Vector(114.0)), Vector(Vector(115.0))), s1(s0(Vector(Vector(116.0), Vector(117.0), Vector(118.0)), Vector(Vector(119.0))), Vector(Vector(s0(Vector(Vector(120.0), Vector(121.0), Vector(122.0)), Vector(Vector(123.0)))), Vector(s0(Vector(Vector(124.0), Vector(125.0), Vector(126.0)), Vector(Vector(127.0))))), s0(Vector(Vector(128.0), Vector(129.0), Vector(130.0)), Vector(Vector(131.0))), Vector(Vector(s0(Vector(Vector(132.0), Vector(133.0), Vector(134.0)), Vector(Vector(135.0)))), Vector(s0(Vector(Vector(136.0), Vector(137.0), Vector(138.0)), Vector(Vector(139.0)))), Vector(s0(Vector(Vector(140.0), Vector(141.0), Vector(142.0)), Vector(Vector(143.0))))), Vector(Vector(s0(Vector(Vector(144.0), Vector(145.0), Vector(146.0)), Vector(Vector(147.0)))), Vector(s0(Vector(Vector(148.0), Vector(149.0), Vector(150.0)), Vector(Vector(151.0)))), Vector(s0(Vector(Vector(152.0), Vector(153.0), Vector(154.0)), Vector(Vector(155.0))))))))
    val v1: Vector[s3] = Vector(s3(Vector(Vector(s0(Vector(Vector(156.0), Vector(157.0), Vector(158.0)), Vector(Vector(159.0)))), Vector(s0(Vector(Vector(160.0), Vector(161.0), Vector(162.0)), Vector(Vector(163.0))))), Vector(s2(Vector(164.0), Vector(s0(Vector(Vector(165.0), Vector(166.0), Vector(167.0)), Vector(Vector(168.0))), s0(Vector(Vector(169.0), Vector(170.0), Vector(171.0)), Vector(Vector(172.0))), s0(Vector(Vector(173.0), Vector(174.0), Vector(175.0)), Vector(Vector(176.0))))), s2(Vector(177.0), Vector(s0(Vector(Vector(178.0), Vector(179.0), Vector(180.0)), Vector(Vector(181.0))), s0(Vector(Vector(182.0), Vector(183.0), Vector(184.0)), Vector(Vector(185.0))), s0(Vector(Vector(186.0), Vector(187.0), Vector(188.0)), Vector(Vector(189.0)))))), s0(Vector(Vector(190.0), Vector(191.0), Vector(192.0)), Vector(Vector(193.0))), s1(s0(Vector(Vector(194.0), Vector(195.0), Vector(196.0)), Vector(Vector(197.0))), Vector(Vector(s0(Vector(Vector(198.0), Vector(199.0), Vector(200.0)), Vector(Vector(201.0)))), Vector(s0(Vector(Vector(202.0), Vector(203.0), Vector(204.0)), Vector(Vector(205.0))))), s0(Vector(Vector(206.0), Vector(207.0), Vector(208.0)), Vector(Vector(209.0))), Vector(Vector(s0(Vector(Vector(210.0), Vector(211.0), Vector(212.0)), Vector(Vector(213.0)))), Vector(s0(Vector(Vector(214.0), Vector(215.0), Vector(216.0)), Vector(Vector(217.0)))), Vector(s0(Vector(Vector(218.0), Vector(219.0), Vector(220.0)), Vector(Vector(221.0))))), Vector(Vector(s0(Vector(Vector(222.0), Vector(223.0), Vector(224.0)), Vector(Vector(225.0)))), Vector(s0(Vector(Vector(226.0), Vector(227.0), Vector(228.0)), Vector(Vector(229.0)))), Vector(s0(Vector(Vector(230.0), Vector(231.0), Vector(232.0)), Vector(Vector(233.0))))))))
    val v2: Double = 234.0
    val start = nanoTime()
    var result: Double = 234.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}