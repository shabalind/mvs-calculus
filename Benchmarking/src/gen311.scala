import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]],
    p3: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  case class s2 (
    p0: s1,
    p1: Vector[s0]
  )
  case class s3 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  case class s4 (
    p0: Vector[Vector[s0]],
    p1: Vector[Vector[s0]]
  )
  case class s5 (
    p0: s2,
    p1: s3
  )
  case class s7 (
    p0: s2,
    p1: s2
  )
  def f4(v0: Double, v1: s0): Double = {
    var v7: Double = v0
    var v6: Double = v7
    v6
  }
  @noinline
  def f0(v0: s5, v1: Vector[Vector[s2]], v2: s1, v3: Vector[Vector[s7]], v4: Vector[s3], v5: s4, v6: Double): Double = {
    val v11: Double = v6 + v6
    val v15: s3 = v4(1)
    val v84: Vector[s0] = v15.p0
    val v82: s0 = v84(0)
    val v62: Double = f4(v6, v82)
    val v199: Double = f4(v62, v82)
    val v173: Double = v11 - v199
    v173
  }
  def benchmark(): Unit = {
    val v0: s5 = s5(s2(s1(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0)))), s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0)))), Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0))))), s3(Vector(s0(Vector(Vector(18.0)), Vector(Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0))), s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0)), Vector(Vector(29.0))), s0(Vector(Vector(30.0)), Vector(Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0)), Vector(Vector(35.0)))), Vector(s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0)), Vector(Vector(39.0), Vector(40.0)), Vector(Vector(41.0))), s0(Vector(Vector(42.0)), Vector(Vector(43.0), Vector(44.0)), Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0))))))
    val v1: Vector[Vector[s2]] = Vector(Vector(s2(s1(Vector(s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0)), Vector(Vector(51.0), Vector(52.0)), Vector(Vector(53.0)))), s0(Vector(Vector(54.0)), Vector(Vector(55.0), Vector(56.0)), Vector(Vector(57.0), Vector(58.0)), Vector(Vector(59.0)))), Vector(s0(Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0)), Vector(Vector(63.0), Vector(64.0)), Vector(Vector(65.0)))))), Vector(s2(s1(Vector(s0(Vector(Vector(66.0)), Vector(Vector(67.0), Vector(68.0)), Vector(Vector(69.0), Vector(70.0)), Vector(Vector(71.0)))), s0(Vector(Vector(72.0)), Vector(Vector(73.0), Vector(74.0)), Vector(Vector(75.0), Vector(76.0)), Vector(Vector(77.0)))), Vector(s0(Vector(Vector(78.0)), Vector(Vector(79.0), Vector(80.0)), Vector(Vector(81.0), Vector(82.0)), Vector(Vector(83.0)))))))
    val v2: s1 = s1(Vector(s0(Vector(Vector(84.0)), Vector(Vector(85.0), Vector(86.0)), Vector(Vector(87.0), Vector(88.0)), Vector(Vector(89.0)))), s0(Vector(Vector(90.0)), Vector(Vector(91.0), Vector(92.0)), Vector(Vector(93.0), Vector(94.0)), Vector(Vector(95.0))))
    val v3: Vector[Vector[s7]] = Vector(Vector(s7(s2(s1(Vector(s0(Vector(Vector(96.0)), Vector(Vector(97.0), Vector(98.0)), Vector(Vector(99.0), Vector(100.0)), Vector(Vector(101.0)))), s0(Vector(Vector(102.0)), Vector(Vector(103.0), Vector(104.0)), Vector(Vector(105.0), Vector(106.0)), Vector(Vector(107.0)))), Vector(s0(Vector(Vector(108.0)), Vector(Vector(109.0), Vector(110.0)), Vector(Vector(111.0), Vector(112.0)), Vector(Vector(113.0))))), s2(s1(Vector(s0(Vector(Vector(114.0)), Vector(Vector(115.0), Vector(116.0)), Vector(Vector(117.0), Vector(118.0)), Vector(Vector(119.0)))), s0(Vector(Vector(120.0)), Vector(Vector(121.0), Vector(122.0)), Vector(Vector(123.0), Vector(124.0)), Vector(Vector(125.0)))), Vector(s0(Vector(Vector(126.0)), Vector(Vector(127.0), Vector(128.0)), Vector(Vector(129.0), Vector(130.0)), Vector(Vector(131.0))))))), Vector(s7(s2(s1(Vector(s0(Vector(Vector(132.0)), Vector(Vector(133.0), Vector(134.0)), Vector(Vector(135.0), Vector(136.0)), Vector(Vector(137.0)))), s0(Vector(Vector(138.0)), Vector(Vector(139.0), Vector(140.0)), Vector(Vector(141.0), Vector(142.0)), Vector(Vector(143.0)))), Vector(s0(Vector(Vector(144.0)), Vector(Vector(145.0), Vector(146.0)), Vector(Vector(147.0), Vector(148.0)), Vector(Vector(149.0))))), s2(s1(Vector(s0(Vector(Vector(150.0)), Vector(Vector(151.0), Vector(152.0)), Vector(Vector(153.0), Vector(154.0)), Vector(Vector(155.0)))), s0(Vector(Vector(156.0)), Vector(Vector(157.0), Vector(158.0)), Vector(Vector(159.0), Vector(160.0)), Vector(Vector(161.0)))), Vector(s0(Vector(Vector(162.0)), Vector(Vector(163.0), Vector(164.0)), Vector(Vector(165.0), Vector(166.0)), Vector(Vector(167.0))))))))
    val v4: Vector[s3] = Vector(s3(Vector(s0(Vector(Vector(168.0)), Vector(Vector(169.0), Vector(170.0)), Vector(Vector(171.0), Vector(172.0)), Vector(Vector(173.0))), s0(Vector(Vector(174.0)), Vector(Vector(175.0), Vector(176.0)), Vector(Vector(177.0), Vector(178.0)), Vector(Vector(179.0))), s0(Vector(Vector(180.0)), Vector(Vector(181.0), Vector(182.0)), Vector(Vector(183.0), Vector(184.0)), Vector(Vector(185.0)))), Vector(s0(Vector(Vector(186.0)), Vector(Vector(187.0), Vector(188.0)), Vector(Vector(189.0), Vector(190.0)), Vector(Vector(191.0))), s0(Vector(Vector(192.0)), Vector(Vector(193.0), Vector(194.0)), Vector(Vector(195.0), Vector(196.0)), Vector(Vector(197.0))))), s3(Vector(s0(Vector(Vector(198.0)), Vector(Vector(199.0), Vector(200.0)), Vector(Vector(201.0), Vector(202.0)), Vector(Vector(203.0))), s0(Vector(Vector(204.0)), Vector(Vector(205.0), Vector(206.0)), Vector(Vector(207.0), Vector(208.0)), Vector(Vector(209.0))), s0(Vector(Vector(210.0)), Vector(Vector(211.0), Vector(212.0)), Vector(Vector(213.0), Vector(214.0)), Vector(Vector(215.0)))), Vector(s0(Vector(Vector(216.0)), Vector(Vector(217.0), Vector(218.0)), Vector(Vector(219.0), Vector(220.0)), Vector(Vector(221.0))), s0(Vector(Vector(222.0)), Vector(Vector(223.0), Vector(224.0)), Vector(Vector(225.0), Vector(226.0)), Vector(Vector(227.0))))))
    val v5: s4 = s4(Vector(Vector(s0(Vector(Vector(228.0)), Vector(Vector(229.0), Vector(230.0)), Vector(Vector(231.0), Vector(232.0)), Vector(Vector(233.0)))), Vector(s0(Vector(Vector(234.0)), Vector(Vector(235.0), Vector(236.0)), Vector(Vector(237.0), Vector(238.0)), Vector(Vector(239.0))))), Vector(Vector(s0(Vector(Vector(240.0)), Vector(Vector(241.0), Vector(242.0)), Vector(Vector(243.0), Vector(244.0)), Vector(Vector(245.0)))), Vector(s0(Vector(Vector(246.0)), Vector(Vector(247.0), Vector(248.0)), Vector(Vector(249.0), Vector(250.0)), Vector(Vector(251.0))))))
    val v6: Double = 252.0
    val start = nanoTime()
    var result: Double = 252.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4, v5, v6)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}