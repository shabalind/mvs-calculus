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
    p0: s0,
    p1: Vector[s1]
  )
  case class s3 (
    p0: Vector[Double],
    p1: Vector[s1],
    p2: s2
  )
  case class s4 (
    p0: s3,
    p1: s3
  )
  case class s6 (
    p0: s2,
    p1: Vector[Vector[s4]]
  )
  def f59(v0: Double): Double = {
    var v4: Double = v0
    var v8: Double = v4
    var v3: Double = v4
    var v2: Double = v8
    var v6: Double = v2
    val v7: Double = v2 / v8
    var v5: Double = v3
    var v11: Double = v3
    var v15: Double = v7
    val v17: Double = v2 + v11
    var v21: Double = v0
    var v29: Double = v5
    var v14: Double = v0
    var v30: Double = v4
    var v9: Double = v14
    var v44: Double = v6
    var v19: Double = v21
    val v23: Double = v5 - v21
    var v13: Double = v30
    var v16: Double = v44
    var v26: Double = v17
    v21 = v23
    val v25: Vector[Double] = Vector(v13, v17, v19, v19)
    var v24: Vector[Double] = v25
    v24 = v24.updated(0, v29)
    v24 = v24.updated(2, v15)
    var v41: Vector[Double] = v24
    v41 = v41.updated(0, v8)
    var v51: Vector[Double] = v41
    v8 = v16
    v41 = v41.updated(2, v26)
    v51 = v51.updated(3, v21)
    v51 = v51.updated(0, v23)
    v51 = v51.updated(3, v9)
    var v45: Vector[Double] = v51
    val v48: Double = v45(1)
    v48
  }
  @noinline
  def f0(v0: Vector[s6], v1: Double): Double = {
    var v6: Double = v1
    val v4: Double = f59(v6)
    val v5: Double = f59(v4)
    v6 = v5
    v5
  }
  def benchmark(): Unit = {
    val v0: Vector[s6] = Vector(s6(s2(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0))), Vector(s1(Vector(Vector(s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0))))), Vector(s0(Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0), Vector(14.0))), s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0))))))), Vector(Vector(s4(s3(Vector(20.0, 21.0), Vector(s1(Vector(Vector(s0(Vector(Vector(22.0), Vector(23.0)), Vector(Vector(24.0), Vector(25.0), Vector(26.0))))), Vector(s0(Vector(Vector(27.0), Vector(28.0)), Vector(Vector(29.0), Vector(30.0), Vector(31.0))), s0(Vector(Vector(32.0), Vector(33.0)), Vector(Vector(34.0), Vector(35.0), Vector(36.0)))))), s2(s0(Vector(Vector(37.0), Vector(38.0)), Vector(Vector(39.0), Vector(40.0), Vector(41.0))), Vector(s1(Vector(Vector(s0(Vector(Vector(42.0), Vector(43.0)), Vector(Vector(44.0), Vector(45.0), Vector(46.0))))), Vector(s0(Vector(Vector(47.0), Vector(48.0)), Vector(Vector(49.0), Vector(50.0), Vector(51.0))), s0(Vector(Vector(52.0), Vector(53.0)), Vector(Vector(54.0), Vector(55.0), Vector(56.0)))))))), s3(Vector(57.0, 58.0), Vector(s1(Vector(Vector(s0(Vector(Vector(59.0), Vector(60.0)), Vector(Vector(61.0), Vector(62.0), Vector(63.0))))), Vector(s0(Vector(Vector(64.0), Vector(65.0)), Vector(Vector(66.0), Vector(67.0), Vector(68.0))), s0(Vector(Vector(69.0), Vector(70.0)), Vector(Vector(71.0), Vector(72.0), Vector(73.0)))))), s2(s0(Vector(Vector(74.0), Vector(75.0)), Vector(Vector(76.0), Vector(77.0), Vector(78.0))), Vector(s1(Vector(Vector(s0(Vector(Vector(79.0), Vector(80.0)), Vector(Vector(81.0), Vector(82.0), Vector(83.0))))), Vector(s0(Vector(Vector(84.0), Vector(85.0)), Vector(Vector(86.0), Vector(87.0), Vector(88.0))), s0(Vector(Vector(89.0), Vector(90.0)), Vector(Vector(91.0), Vector(92.0), Vector(93.0)))))))))), Vector(s4(s3(Vector(94.0, 95.0), Vector(s1(Vector(Vector(s0(Vector(Vector(96.0), Vector(97.0)), Vector(Vector(98.0), Vector(99.0), Vector(100.0))))), Vector(s0(Vector(Vector(101.0), Vector(102.0)), Vector(Vector(103.0), Vector(104.0), Vector(105.0))), s0(Vector(Vector(106.0), Vector(107.0)), Vector(Vector(108.0), Vector(109.0), Vector(110.0)))))), s2(s0(Vector(Vector(111.0), Vector(112.0)), Vector(Vector(113.0), Vector(114.0), Vector(115.0))), Vector(s1(Vector(Vector(s0(Vector(Vector(116.0), Vector(117.0)), Vector(Vector(118.0), Vector(119.0), Vector(120.0))))), Vector(s0(Vector(Vector(121.0), Vector(122.0)), Vector(Vector(123.0), Vector(124.0), Vector(125.0))), s0(Vector(Vector(126.0), Vector(127.0)), Vector(Vector(128.0), Vector(129.0), Vector(130.0)))))))), s3(Vector(131.0, 132.0), Vector(s1(Vector(Vector(s0(Vector(Vector(133.0), Vector(134.0)), Vector(Vector(135.0), Vector(136.0), Vector(137.0))))), Vector(s0(Vector(Vector(138.0), Vector(139.0)), Vector(Vector(140.0), Vector(141.0), Vector(142.0))), s0(Vector(Vector(143.0), Vector(144.0)), Vector(Vector(145.0), Vector(146.0), Vector(147.0)))))), s2(s0(Vector(Vector(148.0), Vector(149.0)), Vector(Vector(150.0), Vector(151.0), Vector(152.0))), Vector(s1(Vector(Vector(s0(Vector(Vector(153.0), Vector(154.0)), Vector(Vector(155.0), Vector(156.0), Vector(157.0))))), Vector(s0(Vector(Vector(158.0), Vector(159.0)), Vector(Vector(160.0), Vector(161.0), Vector(162.0))), s0(Vector(Vector(163.0), Vector(164.0)), Vector(Vector(165.0), Vector(166.0), Vector(167.0)))))))))))), s6(s2(s0(Vector(Vector(168.0), Vector(169.0)), Vector(Vector(170.0), Vector(171.0), Vector(172.0))), Vector(s1(Vector(Vector(s0(Vector(Vector(173.0), Vector(174.0)), Vector(Vector(175.0), Vector(176.0), Vector(177.0))))), Vector(s0(Vector(Vector(178.0), Vector(179.0)), Vector(Vector(180.0), Vector(181.0), Vector(182.0))), s0(Vector(Vector(183.0), Vector(184.0)), Vector(Vector(185.0), Vector(186.0), Vector(187.0))))))), Vector(Vector(s4(s3(Vector(188.0, 189.0), Vector(s1(Vector(Vector(s0(Vector(Vector(190.0), Vector(191.0)), Vector(Vector(192.0), Vector(193.0), Vector(194.0))))), Vector(s0(Vector(Vector(195.0), Vector(196.0)), Vector(Vector(197.0), Vector(198.0), Vector(199.0))), s0(Vector(Vector(200.0), Vector(201.0)), Vector(Vector(202.0), Vector(203.0), Vector(204.0)))))), s2(s0(Vector(Vector(205.0), Vector(206.0)), Vector(Vector(207.0), Vector(208.0), Vector(209.0))), Vector(s1(Vector(Vector(s0(Vector(Vector(210.0), Vector(211.0)), Vector(Vector(212.0), Vector(213.0), Vector(214.0))))), Vector(s0(Vector(Vector(215.0), Vector(216.0)), Vector(Vector(217.0), Vector(218.0), Vector(219.0))), s0(Vector(Vector(220.0), Vector(221.0)), Vector(Vector(222.0), Vector(223.0), Vector(224.0)))))))), s3(Vector(225.0, 226.0), Vector(s1(Vector(Vector(s0(Vector(Vector(227.0), Vector(228.0)), Vector(Vector(229.0), Vector(230.0), Vector(231.0))))), Vector(s0(Vector(Vector(232.0), Vector(233.0)), Vector(Vector(234.0), Vector(235.0), Vector(236.0))), s0(Vector(Vector(237.0), Vector(238.0)), Vector(Vector(239.0), Vector(240.0), Vector(241.0)))))), s2(s0(Vector(Vector(242.0), Vector(243.0)), Vector(Vector(244.0), Vector(245.0), Vector(246.0))), Vector(s1(Vector(Vector(s0(Vector(Vector(247.0), Vector(248.0)), Vector(Vector(249.0), Vector(250.0), Vector(251.0))))), Vector(s0(Vector(Vector(252.0), Vector(253.0)), Vector(Vector(254.0), Vector(255.0), Vector(256.0))), s0(Vector(Vector(257.0), Vector(258.0)), Vector(Vector(259.0), Vector(260.0), Vector(261.0)))))))))), Vector(s4(s3(Vector(262.0, 263.0), Vector(s1(Vector(Vector(s0(Vector(Vector(264.0), Vector(265.0)), Vector(Vector(266.0), Vector(267.0), Vector(268.0))))), Vector(s0(Vector(Vector(269.0), Vector(270.0)), Vector(Vector(271.0), Vector(272.0), Vector(273.0))), s0(Vector(Vector(274.0), Vector(275.0)), Vector(Vector(276.0), Vector(277.0), Vector(278.0)))))), s2(s0(Vector(Vector(279.0), Vector(280.0)), Vector(Vector(281.0), Vector(282.0), Vector(283.0))), Vector(s1(Vector(Vector(s0(Vector(Vector(284.0), Vector(285.0)), Vector(Vector(286.0), Vector(287.0), Vector(288.0))))), Vector(s0(Vector(Vector(289.0), Vector(290.0)), Vector(Vector(291.0), Vector(292.0), Vector(293.0))), s0(Vector(Vector(294.0), Vector(295.0)), Vector(Vector(296.0), Vector(297.0), Vector(298.0)))))))), s3(Vector(299.0, 300.0), Vector(s1(Vector(Vector(s0(Vector(Vector(301.0), Vector(302.0)), Vector(Vector(303.0), Vector(304.0), Vector(305.0))))), Vector(s0(Vector(Vector(306.0), Vector(307.0)), Vector(Vector(308.0), Vector(309.0), Vector(310.0))), s0(Vector(Vector(311.0), Vector(312.0)), Vector(Vector(313.0), Vector(314.0), Vector(315.0)))))), s2(s0(Vector(Vector(316.0), Vector(317.0)), Vector(Vector(318.0), Vector(319.0), Vector(320.0))), Vector(s1(Vector(Vector(s0(Vector(Vector(321.0), Vector(322.0)), Vector(Vector(323.0), Vector(324.0), Vector(325.0))))), Vector(s0(Vector(Vector(326.0), Vector(327.0)), Vector(Vector(328.0), Vector(329.0), Vector(330.0))), s0(Vector(Vector(331.0), Vector(332.0)), Vector(Vector(333.0), Vector(334.0), Vector(335.0)))))))))))))
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