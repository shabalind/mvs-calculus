import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: Vector[s0]
  )
  case class s2 (
    p0: s1,
    p1: Vector[s0]
  )
  case class s3 (
    p0: s1,
    p1: Vector[s0]
  )
  case class s5 (
    p0: s2,
    p1: s0
  )
  case class s6 (
    p0: Double,
    p1: s2,
    p2: Vector[s5]
  )
  case class s9 (
    p0: Vector[s3],
    p1: Vector[Vector[s6]]
  )
  @noinline
  def f0(v0: Vector[Double], v1: Vector[Vector[s2]], v2: s9, v3: Double): Double = {
    val v9: Vector[s2] = v1(0)
    var v5: Vector[Vector[s2]] = v1
    val v7: Vector[s2] = v5(0)
    var v25: Double = v3
    v5 = v5.updated(0, v9)
    val v18: s2 = v7(0)
    val v28: Vector[s0] = v18.p1
    val v29: s0 = v28(0)
    val v48: Vector[Vector[Double]] = v29.p0
    val v70: Vector[Double] = v48(1)
    val v121: Double = v70(0)
    val v213: Double = v25 * v121
    v213
  }
  def benchmark(): Unit = {
    val v0: Vector[Double] = Vector(0.0, 1.0, 2.0)
    val v1: Vector[Vector[s2]] = Vector(Vector(s2(s1(Vector(Vector(s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0)))), Vector(s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0), Vector(12.0)))), Vector(s0(Vector(Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0))))), Vector(s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0), Vector(21.0), Vector(22.0))), s0(Vector(Vector(23.0), Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0))), s0(Vector(Vector(28.0), Vector(29.0)), Vector(Vector(30.0), Vector(31.0), Vector(32.0))))), Vector(s0(Vector(Vector(33.0), Vector(34.0)), Vector(Vector(35.0), Vector(36.0), Vector(37.0)))))))
    val v2: s9 = s9(Vector(s3(s1(Vector(Vector(s0(Vector(Vector(38.0), Vector(39.0)), Vector(Vector(40.0), Vector(41.0), Vector(42.0)))), Vector(s0(Vector(Vector(43.0), Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0)))), Vector(s0(Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0), Vector(51.0), Vector(52.0))))), Vector(s0(Vector(Vector(53.0), Vector(54.0)), Vector(Vector(55.0), Vector(56.0), Vector(57.0))), s0(Vector(Vector(58.0), Vector(59.0)), Vector(Vector(60.0), Vector(61.0), Vector(62.0))), s0(Vector(Vector(63.0), Vector(64.0)), Vector(Vector(65.0), Vector(66.0), Vector(67.0))))), Vector(s0(Vector(Vector(68.0), Vector(69.0)), Vector(Vector(70.0), Vector(71.0), Vector(72.0))), s0(Vector(Vector(73.0), Vector(74.0)), Vector(Vector(75.0), Vector(76.0), Vector(77.0))), s0(Vector(Vector(78.0), Vector(79.0)), Vector(Vector(80.0), Vector(81.0), Vector(82.0))))), s3(s1(Vector(Vector(s0(Vector(Vector(83.0), Vector(84.0)), Vector(Vector(85.0), Vector(86.0), Vector(87.0)))), Vector(s0(Vector(Vector(88.0), Vector(89.0)), Vector(Vector(90.0), Vector(91.0), Vector(92.0)))), Vector(s0(Vector(Vector(93.0), Vector(94.0)), Vector(Vector(95.0), Vector(96.0), Vector(97.0))))), Vector(s0(Vector(Vector(98.0), Vector(99.0)), Vector(Vector(100.0), Vector(101.0), Vector(102.0))), s0(Vector(Vector(103.0), Vector(104.0)), Vector(Vector(105.0), Vector(106.0), Vector(107.0))), s0(Vector(Vector(108.0), Vector(109.0)), Vector(Vector(110.0), Vector(111.0), Vector(112.0))))), Vector(s0(Vector(Vector(113.0), Vector(114.0)), Vector(Vector(115.0), Vector(116.0), Vector(117.0))), s0(Vector(Vector(118.0), Vector(119.0)), Vector(Vector(120.0), Vector(121.0), Vector(122.0))), s0(Vector(Vector(123.0), Vector(124.0)), Vector(Vector(125.0), Vector(126.0), Vector(127.0))))), s3(s1(Vector(Vector(s0(Vector(Vector(128.0), Vector(129.0)), Vector(Vector(130.0), Vector(131.0), Vector(132.0)))), Vector(s0(Vector(Vector(133.0), Vector(134.0)), Vector(Vector(135.0), Vector(136.0), Vector(137.0)))), Vector(s0(Vector(Vector(138.0), Vector(139.0)), Vector(Vector(140.0), Vector(141.0), Vector(142.0))))), Vector(s0(Vector(Vector(143.0), Vector(144.0)), Vector(Vector(145.0), Vector(146.0), Vector(147.0))), s0(Vector(Vector(148.0), Vector(149.0)), Vector(Vector(150.0), Vector(151.0), Vector(152.0))), s0(Vector(Vector(153.0), Vector(154.0)), Vector(Vector(155.0), Vector(156.0), Vector(157.0))))), Vector(s0(Vector(Vector(158.0), Vector(159.0)), Vector(Vector(160.0), Vector(161.0), Vector(162.0))), s0(Vector(Vector(163.0), Vector(164.0)), Vector(Vector(165.0), Vector(166.0), Vector(167.0))), s0(Vector(Vector(168.0), Vector(169.0)), Vector(Vector(170.0), Vector(171.0), Vector(172.0)))))), Vector(Vector(s6(173.0, s2(s1(Vector(Vector(s0(Vector(Vector(174.0), Vector(175.0)), Vector(Vector(176.0), Vector(177.0), Vector(178.0)))), Vector(s0(Vector(Vector(179.0), Vector(180.0)), Vector(Vector(181.0), Vector(182.0), Vector(183.0)))), Vector(s0(Vector(Vector(184.0), Vector(185.0)), Vector(Vector(186.0), Vector(187.0), Vector(188.0))))), Vector(s0(Vector(Vector(189.0), Vector(190.0)), Vector(Vector(191.0), Vector(192.0), Vector(193.0))), s0(Vector(Vector(194.0), Vector(195.0)), Vector(Vector(196.0), Vector(197.0), Vector(198.0))), s0(Vector(Vector(199.0), Vector(200.0)), Vector(Vector(201.0), Vector(202.0), Vector(203.0))))), Vector(s0(Vector(Vector(204.0), Vector(205.0)), Vector(Vector(206.0), Vector(207.0), Vector(208.0))))), Vector(s5(s2(s1(Vector(Vector(s0(Vector(Vector(209.0), Vector(210.0)), Vector(Vector(211.0), Vector(212.0), Vector(213.0)))), Vector(s0(Vector(Vector(214.0), Vector(215.0)), Vector(Vector(216.0), Vector(217.0), Vector(218.0)))), Vector(s0(Vector(Vector(219.0), Vector(220.0)), Vector(Vector(221.0), Vector(222.0), Vector(223.0))))), Vector(s0(Vector(Vector(224.0), Vector(225.0)), Vector(Vector(226.0), Vector(227.0), Vector(228.0))), s0(Vector(Vector(229.0), Vector(230.0)), Vector(Vector(231.0), Vector(232.0), Vector(233.0))), s0(Vector(Vector(234.0), Vector(235.0)), Vector(Vector(236.0), Vector(237.0), Vector(238.0))))), Vector(s0(Vector(Vector(239.0), Vector(240.0)), Vector(Vector(241.0), Vector(242.0), Vector(243.0))))), s0(Vector(Vector(244.0), Vector(245.0)), Vector(Vector(246.0), Vector(247.0), Vector(248.0)))), s5(s2(s1(Vector(Vector(s0(Vector(Vector(249.0), Vector(250.0)), Vector(Vector(251.0), Vector(252.0), Vector(253.0)))), Vector(s0(Vector(Vector(254.0), Vector(255.0)), Vector(Vector(256.0), Vector(257.0), Vector(258.0)))), Vector(s0(Vector(Vector(259.0), Vector(260.0)), Vector(Vector(261.0), Vector(262.0), Vector(263.0))))), Vector(s0(Vector(Vector(264.0), Vector(265.0)), Vector(Vector(266.0), Vector(267.0), Vector(268.0))), s0(Vector(Vector(269.0), Vector(270.0)), Vector(Vector(271.0), Vector(272.0), Vector(273.0))), s0(Vector(Vector(274.0), Vector(275.0)), Vector(Vector(276.0), Vector(277.0), Vector(278.0))))), Vector(s0(Vector(Vector(279.0), Vector(280.0)), Vector(Vector(281.0), Vector(282.0), Vector(283.0))))), s0(Vector(Vector(284.0), Vector(285.0)), Vector(Vector(286.0), Vector(287.0), Vector(288.0)))), s5(s2(s1(Vector(Vector(s0(Vector(Vector(289.0), Vector(290.0)), Vector(Vector(291.0), Vector(292.0), Vector(293.0)))), Vector(s0(Vector(Vector(294.0), Vector(295.0)), Vector(Vector(296.0), Vector(297.0), Vector(298.0)))), Vector(s0(Vector(Vector(299.0), Vector(300.0)), Vector(Vector(301.0), Vector(302.0), Vector(303.0))))), Vector(s0(Vector(Vector(304.0), Vector(305.0)), Vector(Vector(306.0), Vector(307.0), Vector(308.0))), s0(Vector(Vector(309.0), Vector(310.0)), Vector(Vector(311.0), Vector(312.0), Vector(313.0))), s0(Vector(Vector(314.0), Vector(315.0)), Vector(Vector(316.0), Vector(317.0), Vector(318.0))))), Vector(s0(Vector(Vector(319.0), Vector(320.0)), Vector(Vector(321.0), Vector(322.0), Vector(323.0))))), s0(Vector(Vector(324.0), Vector(325.0)), Vector(Vector(326.0), Vector(327.0), Vector(328.0)))))))))
    val v3: Double = 329.0
    val start = nanoTime()
    var result: Double = 329.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}