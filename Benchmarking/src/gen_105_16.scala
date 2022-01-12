import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Double,
    p1: s0
  )
  case class s2 (
    p0: s1,
    p1: Vector[Vector[s1]]
  )
  case class s3 (
    p0: s2,
    p1: Vector[s0]
  )
  case class s4 (
    p0: Vector[s3],
    p1: Vector[s0]
  )
  case class s5 (
    p0: Vector[s4],
    p1: Vector[s3]
  )
  case class s6 (
    p0: Vector[Vector[s5]],
    p1: s2
  )
  @noinline
  def f0(v0: s6, v1: Double): Double = {
    var v7: Double = v1
    var v9: s6 = v0
    val v10: s2 = v9.p1
    val v11: Vector[Vector[s1]] = v10.p1
    val v16: Vector[s1] = v11(1)
    val v21: Vector[Vector[s5]] = v9.p0
    v9 = v9.copy(p0 = v21)
    val v13: s1 = v10.p0
    var v20: Vector[Vector[s5]] = v21
    val v33: Vector[Vector[s5]] = v0.p0
    val v22: Vector[s1] = v11(1)
    val v19: s1 = v16(0)
    v20 = v21
    var v29: Vector[s1] = v22
    v9 = v9.copy(p0 = v33)
    var v32: Double = v7
    val v24: s1 = v16(0)
    var v28: s1 = v19
    var v66: Vector[Vector[s5]] = v33
    val v40: Double = v24.p0
    val v44: Vector[s5] = v20(0)
    val v34: s0 = v24.p1
    val v91: s1 = v29(0)
    val v81: Vector[Vector[s5]] = Vector(v44, v44, v44, v44, v44, v44)
    var v115: s1 = v13
    v20 = v33
    var v43: s1 = v91
    val v37: Vector[Vector[Double]] = v34.p1
    var v61: Double = v40
    val v75: s0 = v43.p1
    var v169: Vector[Vector[s1]] = v11
    var v76: s1 = v13
    val v247: Vector[Double] = v37(1)
    var v125: Vector[Double] = v247
    val v92: Vector[s5] = v81(4)
    v115 = v115.copy(p0 = v61)
    val v74: Double = v125(0)
    val v96: s1 = s1(v74, v75)
    v28 = v28.copy(p0 = v32)
    val v106: s2 = s2(v115, v169)
    val v99: Double = v96.p0
    val v114: s0 = v28.p1
    v9 = v9.copy(p1 = v106)
    v61 = v99
    v43 = v43.copy(p1 = v75)
    v76 = v76.copy(p1 = v75)
    v115 = v115.copy(p1 = v114)
    val v98: Double = v76.p0
    v9 = v9.copy(p0 = v66)
    v66 = v66.updated(0, v92)
    var v124: Vector[s5] = v92
    v66 = v66.updated(0, v124)
    v98
  }
  def benchmark(): Unit = {
    val v0: s6 = s6(Vector(Vector(s5(Vector(s4(Vector(s3(s2(s1(0.0, s0(Vector(Vector(1.0), Vector(2.0), Vector(3.0)), Vector(Vector(4.0), Vector(5.0)))), Vector(Vector(s1(6.0, s0(Vector(Vector(7.0), Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0))))), Vector(s1(12.0, s0(Vector(Vector(13.0), Vector(14.0), Vector(15.0)), Vector(Vector(16.0), Vector(17.0))))))), Vector(s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0))))), s3(s2(s1(23.0, s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0)))), Vector(Vector(s1(29.0, s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0))))), Vector(s1(35.0, s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0), Vector(40.0))))))), Vector(s0(Vector(Vector(41.0), Vector(42.0), Vector(43.0)), Vector(Vector(44.0), Vector(45.0))))), s3(s2(s1(46.0, s0(Vector(Vector(47.0), Vector(48.0), Vector(49.0)), Vector(Vector(50.0), Vector(51.0)))), Vector(Vector(s1(52.0, s0(Vector(Vector(53.0), Vector(54.0), Vector(55.0)), Vector(Vector(56.0), Vector(57.0))))), Vector(s1(58.0, s0(Vector(Vector(59.0), Vector(60.0), Vector(61.0)), Vector(Vector(62.0), Vector(63.0))))))), Vector(s0(Vector(Vector(64.0), Vector(65.0), Vector(66.0)), Vector(Vector(67.0), Vector(68.0)))))), Vector(s0(Vector(Vector(69.0), Vector(70.0), Vector(71.0)), Vector(Vector(72.0), Vector(73.0))), s0(Vector(Vector(74.0), Vector(75.0), Vector(76.0)), Vector(Vector(77.0), Vector(78.0))))), s4(Vector(s3(s2(s1(79.0, s0(Vector(Vector(80.0), Vector(81.0), Vector(82.0)), Vector(Vector(83.0), Vector(84.0)))), Vector(Vector(s1(85.0, s0(Vector(Vector(86.0), Vector(87.0), Vector(88.0)), Vector(Vector(89.0), Vector(90.0))))), Vector(s1(91.0, s0(Vector(Vector(92.0), Vector(93.0), Vector(94.0)), Vector(Vector(95.0), Vector(96.0))))))), Vector(s0(Vector(Vector(97.0), Vector(98.0), Vector(99.0)), Vector(Vector(100.0), Vector(101.0))))), s3(s2(s1(102.0, s0(Vector(Vector(103.0), Vector(104.0), Vector(105.0)), Vector(Vector(106.0), Vector(107.0)))), Vector(Vector(s1(108.0, s0(Vector(Vector(109.0), Vector(110.0), Vector(111.0)), Vector(Vector(112.0), Vector(113.0))))), Vector(s1(114.0, s0(Vector(Vector(115.0), Vector(116.0), Vector(117.0)), Vector(Vector(118.0), Vector(119.0))))))), Vector(s0(Vector(Vector(120.0), Vector(121.0), Vector(122.0)), Vector(Vector(123.0), Vector(124.0))))), s3(s2(s1(125.0, s0(Vector(Vector(126.0), Vector(127.0), Vector(128.0)), Vector(Vector(129.0), Vector(130.0)))), Vector(Vector(s1(131.0, s0(Vector(Vector(132.0), Vector(133.0), Vector(134.0)), Vector(Vector(135.0), Vector(136.0))))), Vector(s1(137.0, s0(Vector(Vector(138.0), Vector(139.0), Vector(140.0)), Vector(Vector(141.0), Vector(142.0))))))), Vector(s0(Vector(Vector(143.0), Vector(144.0), Vector(145.0)), Vector(Vector(146.0), Vector(147.0)))))), Vector(s0(Vector(Vector(148.0), Vector(149.0), Vector(150.0)), Vector(Vector(151.0), Vector(152.0))), s0(Vector(Vector(153.0), Vector(154.0), Vector(155.0)), Vector(Vector(156.0), Vector(157.0))))), s4(Vector(s3(s2(s1(158.0, s0(Vector(Vector(159.0), Vector(160.0), Vector(161.0)), Vector(Vector(162.0), Vector(163.0)))), Vector(Vector(s1(164.0, s0(Vector(Vector(165.0), Vector(166.0), Vector(167.0)), Vector(Vector(168.0), Vector(169.0))))), Vector(s1(170.0, s0(Vector(Vector(171.0), Vector(172.0), Vector(173.0)), Vector(Vector(174.0), Vector(175.0))))))), Vector(s0(Vector(Vector(176.0), Vector(177.0), Vector(178.0)), Vector(Vector(179.0), Vector(180.0))))), s3(s2(s1(181.0, s0(Vector(Vector(182.0), Vector(183.0), Vector(184.0)), Vector(Vector(185.0), Vector(186.0)))), Vector(Vector(s1(187.0, s0(Vector(Vector(188.0), Vector(189.0), Vector(190.0)), Vector(Vector(191.0), Vector(192.0))))), Vector(s1(193.0, s0(Vector(Vector(194.0), Vector(195.0), Vector(196.0)), Vector(Vector(197.0), Vector(198.0))))))), Vector(s0(Vector(Vector(199.0), Vector(200.0), Vector(201.0)), Vector(Vector(202.0), Vector(203.0))))), s3(s2(s1(204.0, s0(Vector(Vector(205.0), Vector(206.0), Vector(207.0)), Vector(Vector(208.0), Vector(209.0)))), Vector(Vector(s1(210.0, s0(Vector(Vector(211.0), Vector(212.0), Vector(213.0)), Vector(Vector(214.0), Vector(215.0))))), Vector(s1(216.0, s0(Vector(Vector(217.0), Vector(218.0), Vector(219.0)), Vector(Vector(220.0), Vector(221.0))))))), Vector(s0(Vector(Vector(222.0), Vector(223.0), Vector(224.0)), Vector(Vector(225.0), Vector(226.0)))))), Vector(s0(Vector(Vector(227.0), Vector(228.0), Vector(229.0)), Vector(Vector(230.0), Vector(231.0))), s0(Vector(Vector(232.0), Vector(233.0), Vector(234.0)), Vector(Vector(235.0), Vector(236.0)))))), Vector(s3(s2(s1(237.0, s0(Vector(Vector(238.0), Vector(239.0), Vector(240.0)), Vector(Vector(241.0), Vector(242.0)))), Vector(Vector(s1(243.0, s0(Vector(Vector(244.0), Vector(245.0), Vector(246.0)), Vector(Vector(247.0), Vector(248.0))))), Vector(s1(249.0, s0(Vector(Vector(250.0), Vector(251.0), Vector(252.0)), Vector(Vector(253.0), Vector(254.0))))))), Vector(s0(Vector(Vector(255.0), Vector(256.0), Vector(257.0)), Vector(Vector(258.0), Vector(259.0))))), s3(s2(s1(260.0, s0(Vector(Vector(261.0), Vector(262.0), Vector(263.0)), Vector(Vector(264.0), Vector(265.0)))), Vector(Vector(s1(266.0, s0(Vector(Vector(267.0), Vector(268.0), Vector(269.0)), Vector(Vector(270.0), Vector(271.0))))), Vector(s1(272.0, s0(Vector(Vector(273.0), Vector(274.0), Vector(275.0)), Vector(Vector(276.0), Vector(277.0))))))), Vector(s0(Vector(Vector(278.0), Vector(279.0), Vector(280.0)), Vector(Vector(281.0), Vector(282.0))))), s3(s2(s1(283.0, s0(Vector(Vector(284.0), Vector(285.0), Vector(286.0)), Vector(Vector(287.0), Vector(288.0)))), Vector(Vector(s1(289.0, s0(Vector(Vector(290.0), Vector(291.0), Vector(292.0)), Vector(Vector(293.0), Vector(294.0))))), Vector(s1(295.0, s0(Vector(Vector(296.0), Vector(297.0), Vector(298.0)), Vector(Vector(299.0), Vector(300.0))))))), Vector(s0(Vector(Vector(301.0), Vector(302.0), Vector(303.0)), Vector(Vector(304.0), Vector(305.0))))))))), s2(s1(306.0, s0(Vector(Vector(307.0), Vector(308.0), Vector(309.0)), Vector(Vector(310.0), Vector(311.0)))), Vector(Vector(s1(312.0, s0(Vector(Vector(313.0), Vector(314.0), Vector(315.0)), Vector(Vector(316.0), Vector(317.0))))), Vector(s1(318.0, s0(Vector(Vector(319.0), Vector(320.0), Vector(321.0)), Vector(Vector(322.0), Vector(323.0))))))))
    val v1: Double = 324.0
    val start = nanoTime()
    var result: Double = 324.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}