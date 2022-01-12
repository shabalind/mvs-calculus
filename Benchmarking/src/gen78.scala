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
    p1: s0,
    p2: Vector[s0]
  )
  case class s2 (
    p0: Vector[s0],
    p1: Vector[Vector[s1]],
    p2: Vector[s0]
  )
  def f79(v0: Double): Double = {
    var v3: Double = v0
    val v6: Vector[Double] = Vector(v3, v3, v3, v3, v0)
    val v16: Double = v6(2)
    var v10: Double = v16
    v10
  }
  @noinline
  def f0(v0: s2, v1: Vector[s2], v2: Double): Double = {
    val v4: Double = f79(v2)
    val v7: Double = f79(v2)
    var v21: Double = v4
    val v14: Double = v7 + v21
    v14
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0)), Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0)), Vector(Vector(10.0))), s0(Vector(Vector(11.0)), Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0)))), Vector(Vector(s1(s0(Vector(Vector(22.0)), Vector(Vector(23.0), Vector(24.0)), Vector(Vector(25.0)), Vector(Vector(26.0), Vector(27.0), Vector(28.0)), Vector(Vector(29.0), Vector(30.0), Vector(31.0)), Vector(Vector(32.0))), s0(Vector(Vector(33.0)), Vector(Vector(34.0), Vector(35.0)), Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0)), Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0))), Vector(s0(Vector(Vector(44.0)), Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0)), Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0), Vector(52.0), Vector(53.0)), Vector(Vector(54.0))), s0(Vector(Vector(55.0)), Vector(Vector(56.0), Vector(57.0)), Vector(Vector(58.0)), Vector(Vector(59.0), Vector(60.0), Vector(61.0)), Vector(Vector(62.0), Vector(63.0), Vector(64.0)), Vector(Vector(65.0))), s0(Vector(Vector(66.0)), Vector(Vector(67.0), Vector(68.0)), Vector(Vector(69.0)), Vector(Vector(70.0), Vector(71.0), Vector(72.0)), Vector(Vector(73.0), Vector(74.0), Vector(75.0)), Vector(Vector(76.0)))))), Vector(s1(s0(Vector(Vector(77.0)), Vector(Vector(78.0), Vector(79.0)), Vector(Vector(80.0)), Vector(Vector(81.0), Vector(82.0), Vector(83.0)), Vector(Vector(84.0), Vector(85.0), Vector(86.0)), Vector(Vector(87.0))), s0(Vector(Vector(88.0)), Vector(Vector(89.0), Vector(90.0)), Vector(Vector(91.0)), Vector(Vector(92.0), Vector(93.0), Vector(94.0)), Vector(Vector(95.0), Vector(96.0), Vector(97.0)), Vector(Vector(98.0))), Vector(s0(Vector(Vector(99.0)), Vector(Vector(100.0), Vector(101.0)), Vector(Vector(102.0)), Vector(Vector(103.0), Vector(104.0), Vector(105.0)), Vector(Vector(106.0), Vector(107.0), Vector(108.0)), Vector(Vector(109.0))), s0(Vector(Vector(110.0)), Vector(Vector(111.0), Vector(112.0)), Vector(Vector(113.0)), Vector(Vector(114.0), Vector(115.0), Vector(116.0)), Vector(Vector(117.0), Vector(118.0), Vector(119.0)), Vector(Vector(120.0))), s0(Vector(Vector(121.0)), Vector(Vector(122.0), Vector(123.0)), Vector(Vector(124.0)), Vector(Vector(125.0), Vector(126.0), Vector(127.0)), Vector(Vector(128.0), Vector(129.0), Vector(130.0)), Vector(Vector(131.0))))))), Vector(s0(Vector(Vector(132.0)), Vector(Vector(133.0), Vector(134.0)), Vector(Vector(135.0)), Vector(Vector(136.0), Vector(137.0), Vector(138.0)), Vector(Vector(139.0), Vector(140.0), Vector(141.0)), Vector(Vector(142.0))), s0(Vector(Vector(143.0)), Vector(Vector(144.0), Vector(145.0)), Vector(Vector(146.0)), Vector(Vector(147.0), Vector(148.0), Vector(149.0)), Vector(Vector(150.0), Vector(151.0), Vector(152.0)), Vector(Vector(153.0)))))
    val v1: Vector[s2] = Vector(s2(Vector(s0(Vector(Vector(154.0)), Vector(Vector(155.0), Vector(156.0)), Vector(Vector(157.0)), Vector(Vector(158.0), Vector(159.0), Vector(160.0)), Vector(Vector(161.0), Vector(162.0), Vector(163.0)), Vector(Vector(164.0))), s0(Vector(Vector(165.0)), Vector(Vector(166.0), Vector(167.0)), Vector(Vector(168.0)), Vector(Vector(169.0), Vector(170.0), Vector(171.0)), Vector(Vector(172.0), Vector(173.0), Vector(174.0)), Vector(Vector(175.0)))), Vector(Vector(s1(s0(Vector(Vector(176.0)), Vector(Vector(177.0), Vector(178.0)), Vector(Vector(179.0)), Vector(Vector(180.0), Vector(181.0), Vector(182.0)), Vector(Vector(183.0), Vector(184.0), Vector(185.0)), Vector(Vector(186.0))), s0(Vector(Vector(187.0)), Vector(Vector(188.0), Vector(189.0)), Vector(Vector(190.0)), Vector(Vector(191.0), Vector(192.0), Vector(193.0)), Vector(Vector(194.0), Vector(195.0), Vector(196.0)), Vector(Vector(197.0))), Vector(s0(Vector(Vector(198.0)), Vector(Vector(199.0), Vector(200.0)), Vector(Vector(201.0)), Vector(Vector(202.0), Vector(203.0), Vector(204.0)), Vector(Vector(205.0), Vector(206.0), Vector(207.0)), Vector(Vector(208.0))), s0(Vector(Vector(209.0)), Vector(Vector(210.0), Vector(211.0)), Vector(Vector(212.0)), Vector(Vector(213.0), Vector(214.0), Vector(215.0)), Vector(Vector(216.0), Vector(217.0), Vector(218.0)), Vector(Vector(219.0))), s0(Vector(Vector(220.0)), Vector(Vector(221.0), Vector(222.0)), Vector(Vector(223.0)), Vector(Vector(224.0), Vector(225.0), Vector(226.0)), Vector(Vector(227.0), Vector(228.0), Vector(229.0)), Vector(Vector(230.0)))))), Vector(s1(s0(Vector(Vector(231.0)), Vector(Vector(232.0), Vector(233.0)), Vector(Vector(234.0)), Vector(Vector(235.0), Vector(236.0), Vector(237.0)), Vector(Vector(238.0), Vector(239.0), Vector(240.0)), Vector(Vector(241.0))), s0(Vector(Vector(242.0)), Vector(Vector(243.0), Vector(244.0)), Vector(Vector(245.0)), Vector(Vector(246.0), Vector(247.0), Vector(248.0)), Vector(Vector(249.0), Vector(250.0), Vector(251.0)), Vector(Vector(252.0))), Vector(s0(Vector(Vector(253.0)), Vector(Vector(254.0), Vector(255.0)), Vector(Vector(256.0)), Vector(Vector(257.0), Vector(258.0), Vector(259.0)), Vector(Vector(260.0), Vector(261.0), Vector(262.0)), Vector(Vector(263.0))), s0(Vector(Vector(264.0)), Vector(Vector(265.0), Vector(266.0)), Vector(Vector(267.0)), Vector(Vector(268.0), Vector(269.0), Vector(270.0)), Vector(Vector(271.0), Vector(272.0), Vector(273.0)), Vector(Vector(274.0))), s0(Vector(Vector(275.0)), Vector(Vector(276.0), Vector(277.0)), Vector(Vector(278.0)), Vector(Vector(279.0), Vector(280.0), Vector(281.0)), Vector(Vector(282.0), Vector(283.0), Vector(284.0)), Vector(Vector(285.0))))))), Vector(s0(Vector(Vector(286.0)), Vector(Vector(287.0), Vector(288.0)), Vector(Vector(289.0)), Vector(Vector(290.0), Vector(291.0), Vector(292.0)), Vector(Vector(293.0), Vector(294.0), Vector(295.0)), Vector(Vector(296.0))), s0(Vector(Vector(297.0)), Vector(Vector(298.0), Vector(299.0)), Vector(Vector(300.0)), Vector(Vector(301.0), Vector(302.0), Vector(303.0)), Vector(Vector(304.0), Vector(305.0), Vector(306.0)), Vector(Vector(307.0))))))
    val v2: Double = 308.0
    val start = nanoTime()
    var result: Double = 308.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}