import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: Vector[s1],
    p1: Vector[Vector[s1]],
    p2: Vector[Double]
  )
  case class s3 (
    p0: Vector[Vector[s1]],
    p1: Vector[s1]
  )
  case class s4 (
    p0: s3,
    p1: Vector[s2]
  )
  case class s5 (
    p0: s3,
    p1: s1
  )
  @noinline
  def f0(v0: s5, v1: Vector[s4], v2: Double): Double = {
    val v4: s3 = v0.p0
    val v18: Vector[s1] = v4.p1
    val v20: s1 = v18(0)
    val v43: Double = v2 * v2
    val v45: s0 = v20.p1
    val v51: Vector[Vector[Double]] = v45.p1
    val v56: Double = v43 * v2
    val v46: Double = v43 * v56
    val v104: Double = v46 + v56
    val v184: Vector[Double] = v51(2)
    val v125: Double = v184(0)
    val v149: Double = v125 + v104
    v149
  }
  def benchmark(): Unit = {
    val v0: s5 = s5(s3(Vector(Vector(s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0))))), Vector(s1(s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0))))), Vector(s1(s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0))), s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0)))))), Vector(s1(s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0))), s0(Vector(Vector(28.0)), Vector(Vector(29.0), Vector(30.0), Vector(31.0)))), s1(s0(Vector(Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0))), s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0)))))), s1(s0(Vector(Vector(40.0)), Vector(Vector(41.0), Vector(42.0), Vector(43.0))), s0(Vector(Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0)))))
    val v1: Vector[s4] = Vector(s4(s3(Vector(Vector(s1(s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0), Vector(51.0))), s0(Vector(Vector(52.0)), Vector(Vector(53.0), Vector(54.0), Vector(55.0))))), Vector(s1(s0(Vector(Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0))), s0(Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0), Vector(63.0))))), Vector(s1(s0(Vector(Vector(64.0)), Vector(Vector(65.0), Vector(66.0), Vector(67.0))), s0(Vector(Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0)))))), Vector(s1(s0(Vector(Vector(72.0)), Vector(Vector(73.0), Vector(74.0), Vector(75.0))), s0(Vector(Vector(76.0)), Vector(Vector(77.0), Vector(78.0), Vector(79.0)))), s1(s0(Vector(Vector(80.0)), Vector(Vector(81.0), Vector(82.0), Vector(83.0))), s0(Vector(Vector(84.0)), Vector(Vector(85.0), Vector(86.0), Vector(87.0)))))), Vector(s2(Vector(s1(s0(Vector(Vector(88.0)), Vector(Vector(89.0), Vector(90.0), Vector(91.0))), s0(Vector(Vector(92.0)), Vector(Vector(93.0), Vector(94.0), Vector(95.0)))), s1(s0(Vector(Vector(96.0)), Vector(Vector(97.0), Vector(98.0), Vector(99.0))), s0(Vector(Vector(100.0)), Vector(Vector(101.0), Vector(102.0), Vector(103.0))))), Vector(Vector(s1(s0(Vector(Vector(104.0)), Vector(Vector(105.0), Vector(106.0), Vector(107.0))), s0(Vector(Vector(108.0)), Vector(Vector(109.0), Vector(110.0), Vector(111.0)))))), Vector(112.0, 113.0)), s2(Vector(s1(s0(Vector(Vector(114.0)), Vector(Vector(115.0), Vector(116.0), Vector(117.0))), s0(Vector(Vector(118.0)), Vector(Vector(119.0), Vector(120.0), Vector(121.0)))), s1(s0(Vector(Vector(122.0)), Vector(Vector(123.0), Vector(124.0), Vector(125.0))), s0(Vector(Vector(126.0)), Vector(Vector(127.0), Vector(128.0), Vector(129.0))))), Vector(Vector(s1(s0(Vector(Vector(130.0)), Vector(Vector(131.0), Vector(132.0), Vector(133.0))), s0(Vector(Vector(134.0)), Vector(Vector(135.0), Vector(136.0), Vector(137.0)))))), Vector(138.0, 139.0)), s2(Vector(s1(s0(Vector(Vector(140.0)), Vector(Vector(141.0), Vector(142.0), Vector(143.0))), s0(Vector(Vector(144.0)), Vector(Vector(145.0), Vector(146.0), Vector(147.0)))), s1(s0(Vector(Vector(148.0)), Vector(Vector(149.0), Vector(150.0), Vector(151.0))), s0(Vector(Vector(152.0)), Vector(Vector(153.0), Vector(154.0), Vector(155.0))))), Vector(Vector(s1(s0(Vector(Vector(156.0)), Vector(Vector(157.0), Vector(158.0), Vector(159.0))), s0(Vector(Vector(160.0)), Vector(Vector(161.0), Vector(162.0), Vector(163.0)))))), Vector(164.0, 165.0)))), s4(s3(Vector(Vector(s1(s0(Vector(Vector(166.0)), Vector(Vector(167.0), Vector(168.0), Vector(169.0))), s0(Vector(Vector(170.0)), Vector(Vector(171.0), Vector(172.0), Vector(173.0))))), Vector(s1(s0(Vector(Vector(174.0)), Vector(Vector(175.0), Vector(176.0), Vector(177.0))), s0(Vector(Vector(178.0)), Vector(Vector(179.0), Vector(180.0), Vector(181.0))))), Vector(s1(s0(Vector(Vector(182.0)), Vector(Vector(183.0), Vector(184.0), Vector(185.0))), s0(Vector(Vector(186.0)), Vector(Vector(187.0), Vector(188.0), Vector(189.0)))))), Vector(s1(s0(Vector(Vector(190.0)), Vector(Vector(191.0), Vector(192.0), Vector(193.0))), s0(Vector(Vector(194.0)), Vector(Vector(195.0), Vector(196.0), Vector(197.0)))), s1(s0(Vector(Vector(198.0)), Vector(Vector(199.0), Vector(200.0), Vector(201.0))), s0(Vector(Vector(202.0)), Vector(Vector(203.0), Vector(204.0), Vector(205.0)))))), Vector(s2(Vector(s1(s0(Vector(Vector(206.0)), Vector(Vector(207.0), Vector(208.0), Vector(209.0))), s0(Vector(Vector(210.0)), Vector(Vector(211.0), Vector(212.0), Vector(213.0)))), s1(s0(Vector(Vector(214.0)), Vector(Vector(215.0), Vector(216.0), Vector(217.0))), s0(Vector(Vector(218.0)), Vector(Vector(219.0), Vector(220.0), Vector(221.0))))), Vector(Vector(s1(s0(Vector(Vector(222.0)), Vector(Vector(223.0), Vector(224.0), Vector(225.0))), s0(Vector(Vector(226.0)), Vector(Vector(227.0), Vector(228.0), Vector(229.0)))))), Vector(230.0, 231.0)), s2(Vector(s1(s0(Vector(Vector(232.0)), Vector(Vector(233.0), Vector(234.0), Vector(235.0))), s0(Vector(Vector(236.0)), Vector(Vector(237.0), Vector(238.0), Vector(239.0)))), s1(s0(Vector(Vector(240.0)), Vector(Vector(241.0), Vector(242.0), Vector(243.0))), s0(Vector(Vector(244.0)), Vector(Vector(245.0), Vector(246.0), Vector(247.0))))), Vector(Vector(s1(s0(Vector(Vector(248.0)), Vector(Vector(249.0), Vector(250.0), Vector(251.0))), s0(Vector(Vector(252.0)), Vector(Vector(253.0), Vector(254.0), Vector(255.0)))))), Vector(256.0, 257.0)), s2(Vector(s1(s0(Vector(Vector(258.0)), Vector(Vector(259.0), Vector(260.0), Vector(261.0))), s0(Vector(Vector(262.0)), Vector(Vector(263.0), Vector(264.0), Vector(265.0)))), s1(s0(Vector(Vector(266.0)), Vector(Vector(267.0), Vector(268.0), Vector(269.0))), s0(Vector(Vector(270.0)), Vector(Vector(271.0), Vector(272.0), Vector(273.0))))), Vector(Vector(s1(s0(Vector(Vector(274.0)), Vector(Vector(275.0), Vector(276.0), Vector(277.0))), s0(Vector(Vector(278.0)), Vector(Vector(279.0), Vector(280.0), Vector(281.0)))))), Vector(282.0, 283.0)))))
    val v2: Double = 284.0
    val start = nanoTime()
    var result: Double = 284.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}