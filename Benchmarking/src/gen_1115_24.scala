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
    p1: s0,
    p2: s0,
    p3: s0
  )
  case class s3 (
    p0: Vector[s2],
    p1: Vector[Double]
  )
  case class s4 (
    p0: s0,
    p1: Vector[s3]
  )
  case class s9 (
    p0: Vector[s2],
    p1: Vector[s4]
  )
  @noinline
  def f0(v0: s9, v1: Double): Double = {
    val v3: Vector[s4] = v0.p1
    val v5: s4 = v3(0)
    var v10: Double = v1
    val v6: Double = v10 - v1
    var v11: Double = v6
    val v2: Vector[s3] = v5.p1
    val v13: s3 = v2(1)
    val v23: Vector[Double] = v13.p1
    val v51: Double = v23(0)
    val v38: Double = v11 - v51
    v38
  }
  def benchmark(): Unit = {
    val v0: s9 = s9(Vector(s2(Vector(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0)))), s1(s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0)))), s1(s0(Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0))), s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0))))), s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0), Vector(27.0))), s0(Vector(Vector(28.0), Vector(29.0)), Vector(Vector(30.0), Vector(31.0))), s0(Vector(Vector(32.0), Vector(33.0)), Vector(Vector(34.0), Vector(35.0)))), s2(Vector(s1(s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0))), s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0)))), s1(s0(Vector(Vector(44.0), Vector(45.0)), Vector(Vector(46.0), Vector(47.0))), s0(Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0), Vector(51.0)))), s1(s0(Vector(Vector(52.0), Vector(53.0)), Vector(Vector(54.0), Vector(55.0))), s0(Vector(Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0))))), s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0), Vector(63.0))), s0(Vector(Vector(64.0), Vector(65.0)), Vector(Vector(66.0), Vector(67.0))), s0(Vector(Vector(68.0), Vector(69.0)), Vector(Vector(70.0), Vector(71.0))))), Vector(s4(s0(Vector(Vector(72.0), Vector(73.0)), Vector(Vector(74.0), Vector(75.0))), Vector(s3(Vector(s2(Vector(s1(s0(Vector(Vector(76.0), Vector(77.0)), Vector(Vector(78.0), Vector(79.0))), s0(Vector(Vector(80.0), Vector(81.0)), Vector(Vector(82.0), Vector(83.0)))), s1(s0(Vector(Vector(84.0), Vector(85.0)), Vector(Vector(86.0), Vector(87.0))), s0(Vector(Vector(88.0), Vector(89.0)), Vector(Vector(90.0), Vector(91.0)))), s1(s0(Vector(Vector(92.0), Vector(93.0)), Vector(Vector(94.0), Vector(95.0))), s0(Vector(Vector(96.0), Vector(97.0)), Vector(Vector(98.0), Vector(99.0))))), s0(Vector(Vector(100.0), Vector(101.0)), Vector(Vector(102.0), Vector(103.0))), s0(Vector(Vector(104.0), Vector(105.0)), Vector(Vector(106.0), Vector(107.0))), s0(Vector(Vector(108.0), Vector(109.0)), Vector(Vector(110.0), Vector(111.0))))), Vector(112.0)), s3(Vector(s2(Vector(s1(s0(Vector(Vector(113.0), Vector(114.0)), Vector(Vector(115.0), Vector(116.0))), s0(Vector(Vector(117.0), Vector(118.0)), Vector(Vector(119.0), Vector(120.0)))), s1(s0(Vector(Vector(121.0), Vector(122.0)), Vector(Vector(123.0), Vector(124.0))), s0(Vector(Vector(125.0), Vector(126.0)), Vector(Vector(127.0), Vector(128.0)))), s1(s0(Vector(Vector(129.0), Vector(130.0)), Vector(Vector(131.0), Vector(132.0))), s0(Vector(Vector(133.0), Vector(134.0)), Vector(Vector(135.0), Vector(136.0))))), s0(Vector(Vector(137.0), Vector(138.0)), Vector(Vector(139.0), Vector(140.0))), s0(Vector(Vector(141.0), Vector(142.0)), Vector(Vector(143.0), Vector(144.0))), s0(Vector(Vector(145.0), Vector(146.0)), Vector(Vector(147.0), Vector(148.0))))), Vector(149.0)), s3(Vector(s2(Vector(s1(s0(Vector(Vector(150.0), Vector(151.0)), Vector(Vector(152.0), Vector(153.0))), s0(Vector(Vector(154.0), Vector(155.0)), Vector(Vector(156.0), Vector(157.0)))), s1(s0(Vector(Vector(158.0), Vector(159.0)), Vector(Vector(160.0), Vector(161.0))), s0(Vector(Vector(162.0), Vector(163.0)), Vector(Vector(164.0), Vector(165.0)))), s1(s0(Vector(Vector(166.0), Vector(167.0)), Vector(Vector(168.0), Vector(169.0))), s0(Vector(Vector(170.0), Vector(171.0)), Vector(Vector(172.0), Vector(173.0))))), s0(Vector(Vector(174.0), Vector(175.0)), Vector(Vector(176.0), Vector(177.0))), s0(Vector(Vector(178.0), Vector(179.0)), Vector(Vector(180.0), Vector(181.0))), s0(Vector(Vector(182.0), Vector(183.0)), Vector(Vector(184.0), Vector(185.0))))), Vector(186.0)))), s4(s0(Vector(Vector(187.0), Vector(188.0)), Vector(Vector(189.0), Vector(190.0))), Vector(s3(Vector(s2(Vector(s1(s0(Vector(Vector(191.0), Vector(192.0)), Vector(Vector(193.0), Vector(194.0))), s0(Vector(Vector(195.0), Vector(196.0)), Vector(Vector(197.0), Vector(198.0)))), s1(s0(Vector(Vector(199.0), Vector(200.0)), Vector(Vector(201.0), Vector(202.0))), s0(Vector(Vector(203.0), Vector(204.0)), Vector(Vector(205.0), Vector(206.0)))), s1(s0(Vector(Vector(207.0), Vector(208.0)), Vector(Vector(209.0), Vector(210.0))), s0(Vector(Vector(211.0), Vector(212.0)), Vector(Vector(213.0), Vector(214.0))))), s0(Vector(Vector(215.0), Vector(216.0)), Vector(Vector(217.0), Vector(218.0))), s0(Vector(Vector(219.0), Vector(220.0)), Vector(Vector(221.0), Vector(222.0))), s0(Vector(Vector(223.0), Vector(224.0)), Vector(Vector(225.0), Vector(226.0))))), Vector(227.0)), s3(Vector(s2(Vector(s1(s0(Vector(Vector(228.0), Vector(229.0)), Vector(Vector(230.0), Vector(231.0))), s0(Vector(Vector(232.0), Vector(233.0)), Vector(Vector(234.0), Vector(235.0)))), s1(s0(Vector(Vector(236.0), Vector(237.0)), Vector(Vector(238.0), Vector(239.0))), s0(Vector(Vector(240.0), Vector(241.0)), Vector(Vector(242.0), Vector(243.0)))), s1(s0(Vector(Vector(244.0), Vector(245.0)), Vector(Vector(246.0), Vector(247.0))), s0(Vector(Vector(248.0), Vector(249.0)), Vector(Vector(250.0), Vector(251.0))))), s0(Vector(Vector(252.0), Vector(253.0)), Vector(Vector(254.0), Vector(255.0))), s0(Vector(Vector(256.0), Vector(257.0)), Vector(Vector(258.0), Vector(259.0))), s0(Vector(Vector(260.0), Vector(261.0)), Vector(Vector(262.0), Vector(263.0))))), Vector(264.0)), s3(Vector(s2(Vector(s1(s0(Vector(Vector(265.0), Vector(266.0)), Vector(Vector(267.0), Vector(268.0))), s0(Vector(Vector(269.0), Vector(270.0)), Vector(Vector(271.0), Vector(272.0)))), s1(s0(Vector(Vector(273.0), Vector(274.0)), Vector(Vector(275.0), Vector(276.0))), s0(Vector(Vector(277.0), Vector(278.0)), Vector(Vector(279.0), Vector(280.0)))), s1(s0(Vector(Vector(281.0), Vector(282.0)), Vector(Vector(283.0), Vector(284.0))), s0(Vector(Vector(285.0), Vector(286.0)), Vector(Vector(287.0), Vector(288.0))))), s0(Vector(Vector(289.0), Vector(290.0)), Vector(Vector(291.0), Vector(292.0))), s0(Vector(Vector(293.0), Vector(294.0)), Vector(Vector(295.0), Vector(296.0))), s0(Vector(Vector(297.0), Vector(298.0)), Vector(Vector(299.0), Vector(300.0))))), Vector(301.0))))))
    val v1: Double = 302.0
    val start = nanoTime()
    var result: Double = 302.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}