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
    p0: Vector[Vector[s0]],
    p1: s0
  )
  case class s2 (
    p0: Vector[s1],
    p1: s0
  )
  case class s3 (
    p0: Vector[s1],
    p1: s2,
    p2: s0
  )
  case class s4 (
    p0: Vector[Vector[s2]],
    p1: Vector[s3]
  )
  @noinline
  def f0(v0: Vector[Vector[s1]], v1: s4, v2: Vector[Vector[s1]], v3: Double): Double = {
    val v5: Vector[s1] = v2(0)
    var v11: Double = v3
    val v4: s1 = v5(0)
    val v24: Double = v11 - v11
    var v19: Double = v24
    val v43: Double = v24 * v19
    val v25: s0 = v4.p1
    val v35: Vector[Vector[Double]] = v25.p1
    val v48: Vector[Double] = v35(0)
    val v32: Double = v48(0)
    val v100: Double = v43 / v32
    var v130: Double = v100
    v130
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s1]] = Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0)), Vector(Vector(2.0), Vector(3.0)), Vector(Vector(4.0)))), Vector(s0(Vector(Vector(5.0)), Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0)), Vector(Vector(9.0))))), s0(Vector(Vector(10.0)), Vector(Vector(11.0)), Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0))))))
    val v1: s4 = s4(Vector(Vector(s2(Vector(s1(Vector(Vector(s0(Vector(Vector(15.0)), Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0)), Vector(Vector(19.0)))), Vector(s0(Vector(Vector(20.0)), Vector(Vector(21.0)), Vector(Vector(22.0), Vector(23.0)), Vector(Vector(24.0))))), s0(Vector(Vector(25.0)), Vector(Vector(26.0)), Vector(Vector(27.0), Vector(28.0)), Vector(Vector(29.0)))), s1(Vector(Vector(s0(Vector(Vector(30.0)), Vector(Vector(31.0)), Vector(Vector(32.0), Vector(33.0)), Vector(Vector(34.0)))), Vector(s0(Vector(Vector(35.0)), Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0)), Vector(Vector(39.0))))), s0(Vector(Vector(40.0)), Vector(Vector(41.0)), Vector(Vector(42.0), Vector(43.0)), Vector(Vector(44.0)))), s1(Vector(Vector(s0(Vector(Vector(45.0)), Vector(Vector(46.0)), Vector(Vector(47.0), Vector(48.0)), Vector(Vector(49.0)))), Vector(s0(Vector(Vector(50.0)), Vector(Vector(51.0)), Vector(Vector(52.0), Vector(53.0)), Vector(Vector(54.0))))), s0(Vector(Vector(55.0)), Vector(Vector(56.0)), Vector(Vector(57.0), Vector(58.0)), Vector(Vector(59.0))))), s0(Vector(Vector(60.0)), Vector(Vector(61.0)), Vector(Vector(62.0), Vector(63.0)), Vector(Vector(64.0))))), Vector(s2(Vector(s1(Vector(Vector(s0(Vector(Vector(65.0)), Vector(Vector(66.0)), Vector(Vector(67.0), Vector(68.0)), Vector(Vector(69.0)))), Vector(s0(Vector(Vector(70.0)), Vector(Vector(71.0)), Vector(Vector(72.0), Vector(73.0)), Vector(Vector(74.0))))), s0(Vector(Vector(75.0)), Vector(Vector(76.0)), Vector(Vector(77.0), Vector(78.0)), Vector(Vector(79.0)))), s1(Vector(Vector(s0(Vector(Vector(80.0)), Vector(Vector(81.0)), Vector(Vector(82.0), Vector(83.0)), Vector(Vector(84.0)))), Vector(s0(Vector(Vector(85.0)), Vector(Vector(86.0)), Vector(Vector(87.0), Vector(88.0)), Vector(Vector(89.0))))), s0(Vector(Vector(90.0)), Vector(Vector(91.0)), Vector(Vector(92.0), Vector(93.0)), Vector(Vector(94.0)))), s1(Vector(Vector(s0(Vector(Vector(95.0)), Vector(Vector(96.0)), Vector(Vector(97.0), Vector(98.0)), Vector(Vector(99.0)))), Vector(s0(Vector(Vector(100.0)), Vector(Vector(101.0)), Vector(Vector(102.0), Vector(103.0)), Vector(Vector(104.0))))), s0(Vector(Vector(105.0)), Vector(Vector(106.0)), Vector(Vector(107.0), Vector(108.0)), Vector(Vector(109.0))))), s0(Vector(Vector(110.0)), Vector(Vector(111.0)), Vector(Vector(112.0), Vector(113.0)), Vector(Vector(114.0)))))), Vector(s3(Vector(s1(Vector(Vector(s0(Vector(Vector(115.0)), Vector(Vector(116.0)), Vector(Vector(117.0), Vector(118.0)), Vector(Vector(119.0)))), Vector(s0(Vector(Vector(120.0)), Vector(Vector(121.0)), Vector(Vector(122.0), Vector(123.0)), Vector(Vector(124.0))))), s0(Vector(Vector(125.0)), Vector(Vector(126.0)), Vector(Vector(127.0), Vector(128.0)), Vector(Vector(129.0))))), s2(Vector(s1(Vector(Vector(s0(Vector(Vector(130.0)), Vector(Vector(131.0)), Vector(Vector(132.0), Vector(133.0)), Vector(Vector(134.0)))), Vector(s0(Vector(Vector(135.0)), Vector(Vector(136.0)), Vector(Vector(137.0), Vector(138.0)), Vector(Vector(139.0))))), s0(Vector(Vector(140.0)), Vector(Vector(141.0)), Vector(Vector(142.0), Vector(143.0)), Vector(Vector(144.0)))), s1(Vector(Vector(s0(Vector(Vector(145.0)), Vector(Vector(146.0)), Vector(Vector(147.0), Vector(148.0)), Vector(Vector(149.0)))), Vector(s0(Vector(Vector(150.0)), Vector(Vector(151.0)), Vector(Vector(152.0), Vector(153.0)), Vector(Vector(154.0))))), s0(Vector(Vector(155.0)), Vector(Vector(156.0)), Vector(Vector(157.0), Vector(158.0)), Vector(Vector(159.0)))), s1(Vector(Vector(s0(Vector(Vector(160.0)), Vector(Vector(161.0)), Vector(Vector(162.0), Vector(163.0)), Vector(Vector(164.0)))), Vector(s0(Vector(Vector(165.0)), Vector(Vector(166.0)), Vector(Vector(167.0), Vector(168.0)), Vector(Vector(169.0))))), s0(Vector(Vector(170.0)), Vector(Vector(171.0)), Vector(Vector(172.0), Vector(173.0)), Vector(Vector(174.0))))), s0(Vector(Vector(175.0)), Vector(Vector(176.0)), Vector(Vector(177.0), Vector(178.0)), Vector(Vector(179.0)))), s0(Vector(Vector(180.0)), Vector(Vector(181.0)), Vector(Vector(182.0), Vector(183.0)), Vector(Vector(184.0)))), s3(Vector(s1(Vector(Vector(s0(Vector(Vector(185.0)), Vector(Vector(186.0)), Vector(Vector(187.0), Vector(188.0)), Vector(Vector(189.0)))), Vector(s0(Vector(Vector(190.0)), Vector(Vector(191.0)), Vector(Vector(192.0), Vector(193.0)), Vector(Vector(194.0))))), s0(Vector(Vector(195.0)), Vector(Vector(196.0)), Vector(Vector(197.0), Vector(198.0)), Vector(Vector(199.0))))), s2(Vector(s1(Vector(Vector(s0(Vector(Vector(200.0)), Vector(Vector(201.0)), Vector(Vector(202.0), Vector(203.0)), Vector(Vector(204.0)))), Vector(s0(Vector(Vector(205.0)), Vector(Vector(206.0)), Vector(Vector(207.0), Vector(208.0)), Vector(Vector(209.0))))), s0(Vector(Vector(210.0)), Vector(Vector(211.0)), Vector(Vector(212.0), Vector(213.0)), Vector(Vector(214.0)))), s1(Vector(Vector(s0(Vector(Vector(215.0)), Vector(Vector(216.0)), Vector(Vector(217.0), Vector(218.0)), Vector(Vector(219.0)))), Vector(s0(Vector(Vector(220.0)), Vector(Vector(221.0)), Vector(Vector(222.0), Vector(223.0)), Vector(Vector(224.0))))), s0(Vector(Vector(225.0)), Vector(Vector(226.0)), Vector(Vector(227.0), Vector(228.0)), Vector(Vector(229.0)))), s1(Vector(Vector(s0(Vector(Vector(230.0)), Vector(Vector(231.0)), Vector(Vector(232.0), Vector(233.0)), Vector(Vector(234.0)))), Vector(s0(Vector(Vector(235.0)), Vector(Vector(236.0)), Vector(Vector(237.0), Vector(238.0)), Vector(Vector(239.0))))), s0(Vector(Vector(240.0)), Vector(Vector(241.0)), Vector(Vector(242.0), Vector(243.0)), Vector(Vector(244.0))))), s0(Vector(Vector(245.0)), Vector(Vector(246.0)), Vector(Vector(247.0), Vector(248.0)), Vector(Vector(249.0)))), s0(Vector(Vector(250.0)), Vector(Vector(251.0)), Vector(Vector(252.0), Vector(253.0)), Vector(Vector(254.0))))))
    val v2: Vector[Vector[s1]] = Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(255.0)), Vector(Vector(256.0)), Vector(Vector(257.0), Vector(258.0)), Vector(Vector(259.0)))), Vector(s0(Vector(Vector(260.0)), Vector(Vector(261.0)), Vector(Vector(262.0), Vector(263.0)), Vector(Vector(264.0))))), s0(Vector(Vector(265.0)), Vector(Vector(266.0)), Vector(Vector(267.0), Vector(268.0)), Vector(Vector(269.0))))))
    val v3: Double = 270.0
    val start = nanoTime()
    var result: Double = 270.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}