import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0]
  )
  case class s2 (
    p0: Vector[s1],
    p1: Vector[s1]
  )
  case class s4 (
    p0: Vector[Vector[s2]],
    p1: s2
  )
  case class s6 (
    p0: s2,
    p1: Vector[Vector[s4]]
  )
  @noinline
  def f0(v0: s6, v1: Double): Double = {
    val v5: s2 = v0.p0
    val v8: Vector[s1] = v5.p0
    var v10: Vector[s1] = v8
    val v17: s1 = v10(2)
    val v27: Vector[s0] = v17.p0
    val v16: s0 = v27(0)
    v10 = v10.updated(2, v17)
    var v40: s1 = v17
    v10 = v10.updated(1, v40)
    val v33: Vector[Vector[Double]] = v16.p1
    v10 = v10.updated(2, v17)
    val v29: Vector[Double] = v33(0)
    val v124: s1 = v10(1)
    v10 = v10.updated(1, v17)
    v10 = v10.updated(1, v124)
    val v78: Double = v29(0)
    v10 = v10.updated(2, v17)
    v40 = v40.copy(p0 = v27)
    val v95: Double = v1 + v78
    v95
  }
  def benchmark(): Unit = {
    val v0: s6 = s6(s2(Vector(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0))), s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0))))), s1(Vector(s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0))))), s1(Vector(s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0))), s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0)))))), Vector(s1(Vector(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0))), s0(Vector(Vector(28.0), Vector(29.0), Vector(30.0)), Vector(Vector(31.0))))), s1(Vector(s0(Vector(Vector(32.0), Vector(33.0), Vector(34.0)), Vector(Vector(35.0))), s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0))))), s1(Vector(s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0))), s0(Vector(Vector(44.0), Vector(45.0), Vector(46.0)), Vector(Vector(47.0))))))), Vector(Vector(s4(Vector(Vector(s2(Vector(s1(Vector(s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0))), s0(Vector(Vector(52.0), Vector(53.0), Vector(54.0)), Vector(Vector(55.0))))), s1(Vector(s0(Vector(Vector(56.0), Vector(57.0), Vector(58.0)), Vector(Vector(59.0))), s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0))))), s1(Vector(s0(Vector(Vector(64.0), Vector(65.0), Vector(66.0)), Vector(Vector(67.0))), s0(Vector(Vector(68.0), Vector(69.0), Vector(70.0)), Vector(Vector(71.0)))))), Vector(s1(Vector(s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)), Vector(Vector(75.0))), s0(Vector(Vector(76.0), Vector(77.0), Vector(78.0)), Vector(Vector(79.0))))), s1(Vector(s0(Vector(Vector(80.0), Vector(81.0), Vector(82.0)), Vector(Vector(83.0))), s0(Vector(Vector(84.0), Vector(85.0), Vector(86.0)), Vector(Vector(87.0))))), s1(Vector(s0(Vector(Vector(88.0), Vector(89.0), Vector(90.0)), Vector(Vector(91.0))), s0(Vector(Vector(92.0), Vector(93.0), Vector(94.0)), Vector(Vector(95.0))))))))), s2(Vector(s1(Vector(s0(Vector(Vector(96.0), Vector(97.0), Vector(98.0)), Vector(Vector(99.0))), s0(Vector(Vector(100.0), Vector(101.0), Vector(102.0)), Vector(Vector(103.0))))), s1(Vector(s0(Vector(Vector(104.0), Vector(105.0), Vector(106.0)), Vector(Vector(107.0))), s0(Vector(Vector(108.0), Vector(109.0), Vector(110.0)), Vector(Vector(111.0))))), s1(Vector(s0(Vector(Vector(112.0), Vector(113.0), Vector(114.0)), Vector(Vector(115.0))), s0(Vector(Vector(116.0), Vector(117.0), Vector(118.0)), Vector(Vector(119.0)))))), Vector(s1(Vector(s0(Vector(Vector(120.0), Vector(121.0), Vector(122.0)), Vector(Vector(123.0))), s0(Vector(Vector(124.0), Vector(125.0), Vector(126.0)), Vector(Vector(127.0))))), s1(Vector(s0(Vector(Vector(128.0), Vector(129.0), Vector(130.0)), Vector(Vector(131.0))), s0(Vector(Vector(132.0), Vector(133.0), Vector(134.0)), Vector(Vector(135.0))))), s1(Vector(s0(Vector(Vector(136.0), Vector(137.0), Vector(138.0)), Vector(Vector(139.0))), s0(Vector(Vector(140.0), Vector(141.0), Vector(142.0)), Vector(Vector(143.0))))))))), Vector(s4(Vector(Vector(s2(Vector(s1(Vector(s0(Vector(Vector(144.0), Vector(145.0), Vector(146.0)), Vector(Vector(147.0))), s0(Vector(Vector(148.0), Vector(149.0), Vector(150.0)), Vector(Vector(151.0))))), s1(Vector(s0(Vector(Vector(152.0), Vector(153.0), Vector(154.0)), Vector(Vector(155.0))), s0(Vector(Vector(156.0), Vector(157.0), Vector(158.0)), Vector(Vector(159.0))))), s1(Vector(s0(Vector(Vector(160.0), Vector(161.0), Vector(162.0)), Vector(Vector(163.0))), s0(Vector(Vector(164.0), Vector(165.0), Vector(166.0)), Vector(Vector(167.0)))))), Vector(s1(Vector(s0(Vector(Vector(168.0), Vector(169.0), Vector(170.0)), Vector(Vector(171.0))), s0(Vector(Vector(172.0), Vector(173.0), Vector(174.0)), Vector(Vector(175.0))))), s1(Vector(s0(Vector(Vector(176.0), Vector(177.0), Vector(178.0)), Vector(Vector(179.0))), s0(Vector(Vector(180.0), Vector(181.0), Vector(182.0)), Vector(Vector(183.0))))), s1(Vector(s0(Vector(Vector(184.0), Vector(185.0), Vector(186.0)), Vector(Vector(187.0))), s0(Vector(Vector(188.0), Vector(189.0), Vector(190.0)), Vector(Vector(191.0))))))))), s2(Vector(s1(Vector(s0(Vector(Vector(192.0), Vector(193.0), Vector(194.0)), Vector(Vector(195.0))), s0(Vector(Vector(196.0), Vector(197.0), Vector(198.0)), Vector(Vector(199.0))))), s1(Vector(s0(Vector(Vector(200.0), Vector(201.0), Vector(202.0)), Vector(Vector(203.0))), s0(Vector(Vector(204.0), Vector(205.0), Vector(206.0)), Vector(Vector(207.0))))), s1(Vector(s0(Vector(Vector(208.0), Vector(209.0), Vector(210.0)), Vector(Vector(211.0))), s0(Vector(Vector(212.0), Vector(213.0), Vector(214.0)), Vector(Vector(215.0)))))), Vector(s1(Vector(s0(Vector(Vector(216.0), Vector(217.0), Vector(218.0)), Vector(Vector(219.0))), s0(Vector(Vector(220.0), Vector(221.0), Vector(222.0)), Vector(Vector(223.0))))), s1(Vector(s0(Vector(Vector(224.0), Vector(225.0), Vector(226.0)), Vector(Vector(227.0))), s0(Vector(Vector(228.0), Vector(229.0), Vector(230.0)), Vector(Vector(231.0))))), s1(Vector(s0(Vector(Vector(232.0), Vector(233.0), Vector(234.0)), Vector(Vector(235.0))), s0(Vector(Vector(236.0), Vector(237.0), Vector(238.0)), Vector(Vector(239.0))))))))), Vector(s4(Vector(Vector(s2(Vector(s1(Vector(s0(Vector(Vector(240.0), Vector(241.0), Vector(242.0)), Vector(Vector(243.0))), s0(Vector(Vector(244.0), Vector(245.0), Vector(246.0)), Vector(Vector(247.0))))), s1(Vector(s0(Vector(Vector(248.0), Vector(249.0), Vector(250.0)), Vector(Vector(251.0))), s0(Vector(Vector(252.0), Vector(253.0), Vector(254.0)), Vector(Vector(255.0))))), s1(Vector(s0(Vector(Vector(256.0), Vector(257.0), Vector(258.0)), Vector(Vector(259.0))), s0(Vector(Vector(260.0), Vector(261.0), Vector(262.0)), Vector(Vector(263.0)))))), Vector(s1(Vector(s0(Vector(Vector(264.0), Vector(265.0), Vector(266.0)), Vector(Vector(267.0))), s0(Vector(Vector(268.0), Vector(269.0), Vector(270.0)), Vector(Vector(271.0))))), s1(Vector(s0(Vector(Vector(272.0), Vector(273.0), Vector(274.0)), Vector(Vector(275.0))), s0(Vector(Vector(276.0), Vector(277.0), Vector(278.0)), Vector(Vector(279.0))))), s1(Vector(s0(Vector(Vector(280.0), Vector(281.0), Vector(282.0)), Vector(Vector(283.0))), s0(Vector(Vector(284.0), Vector(285.0), Vector(286.0)), Vector(Vector(287.0))))))))), s2(Vector(s1(Vector(s0(Vector(Vector(288.0), Vector(289.0), Vector(290.0)), Vector(Vector(291.0))), s0(Vector(Vector(292.0), Vector(293.0), Vector(294.0)), Vector(Vector(295.0))))), s1(Vector(s0(Vector(Vector(296.0), Vector(297.0), Vector(298.0)), Vector(Vector(299.0))), s0(Vector(Vector(300.0), Vector(301.0), Vector(302.0)), Vector(Vector(303.0))))), s1(Vector(s0(Vector(Vector(304.0), Vector(305.0), Vector(306.0)), Vector(Vector(307.0))), s0(Vector(Vector(308.0), Vector(309.0), Vector(310.0)), Vector(Vector(311.0)))))), Vector(s1(Vector(s0(Vector(Vector(312.0), Vector(313.0), Vector(314.0)), Vector(Vector(315.0))), s0(Vector(Vector(316.0), Vector(317.0), Vector(318.0)), Vector(Vector(319.0))))), s1(Vector(s0(Vector(Vector(320.0), Vector(321.0), Vector(322.0)), Vector(Vector(323.0))), s0(Vector(Vector(324.0), Vector(325.0), Vector(326.0)), Vector(Vector(327.0))))), s1(Vector(s0(Vector(Vector(328.0), Vector(329.0), Vector(330.0)), Vector(Vector(331.0))), s0(Vector(Vector(332.0), Vector(333.0), Vector(334.0)), Vector(Vector(335.0)))))))))))
    val v1: Double = 336.0
    val start = nanoTime()
    var result: Double = 336.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}