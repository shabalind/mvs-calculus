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
    p0: s0,
    p1: s0,
    p2: s0
  )
  case class s2 (
    p0: s0,
    p1: Vector[s0],
    p2: s0
  )
  case class s3 (
    p0: s2,
    p1: s2
  )
  case class s4 (
    p0: Vector[s1],
    p1: s0,
    p2: s1,
    p3: s3
  )
  case class s6 (
    p0: Vector[Vector[s1]],
    p1: Vector[s4]
  )
  case class s7 (
    p0: s6,
    p1: Vector[Vector[s3]]
  )
  def f44(v0: Double): Double = {
    var v4: Double = v0
    var v6: Double = v4
    val v2: Vector[Double] = Vector(v4, v6, v6, v4, v6, v4, v6)
    val v8: Double = v2(2)
    var v5: Double = v8
    var v1: Vector[Double] = v2
    val v11: Double = v1(5)
    var v3: Vector[Double] = v2
    v3 = v3.updated(4, v8)
    val v15: Double = v1(0)
    v1 = v1.updated(4, v8)
    v3 = v1
    var v7: Double = v15
    val v12: Double = v1(6)
    var v10: Vector[Double] = v3
    var v9: Vector[Double] = v1
    v1 = v1.updated(2, v4)
    v10 = v10.updated(0, v8)
    v3 = v3.updated(2, v12)
    var v27: Vector[Double] = v1
    v1 = v1.updated(3, v12)
    v1 = v1.updated(3, v0)
    var v14: Double = v5
    v3 = v3.updated(3, v7)
    val v19: Double = v9(5)
    v1 = v1.updated(4, v11)
    val v25: Double = v1(5)
    var v30: Double = v7
    var v45: Vector[Double] = v27
    v5 = v25
    var v23: Double = v0
    v3 = v3.updated(4, v8)
    var v35: Double = v19
    var v36: Vector[Double] = v3
    val v32: Double = v10(1)
    val v33: Double = v27(5)
    v9 = v9.updated(2, v35)
    val v41: Double = v3(5)
    val v46: Double = v2(3)
    val v20: Double = v45(3)
    val v57: Double = v36(1)
    val v58: Double = v36(4)
    v45 = v45.updated(2, v25)
    var v49: Vector[Double] = v45
    var v42: Vector[Double] = v49
    var v39: Double = v6
    v10 = v10.updated(3, v33)
    v36 = v36.updated(3, v30)
    v9 = v9.updated(2, v32)
    val v67: Double = v45(6)
    var v51: Double = v14
    var v66: Double = v41
    v1 = v1.updated(1, v57)
    v5 = v23
    v10 = v10.updated(4, v41)
    v3 = v3.updated(1, v39)
    var v60: Vector[Double] = v9
    var v37: Vector[Double] = v45
    v36 = v36.updated(0, v11)
    var v38: Vector[Double] = v1
    val v141: Vector[Vector[Double]] = Vector(v36, v49, v60, v37, v38, v42)
    v42 = v42.updated(3, v33)
    var v127: Vector[Vector[Double]] = v141
    val v47: Vector[Double] = v127(0)
    val v81: Vector[Double] = Vector(v51)
    v45 = v45.updated(3, v66)
    v38 = v38.updated(0, v7)
    var v106: Vector[Double] = v81
    val v78: Double = v47(5)
    var v92: Vector[Double] = v106
    val v120: Double = v92(0)
    v10 = v10.updated(0, v30)
    v3 = v3.updated(5, v20)
    v38 = v38.updated(2, v58)
    v38 = v38.updated(0, v46)
    v9 = v9.updated(6, v67)
    v38 = v38.updated(5, v120)
    v78
  }
  @noinline
  def f0(v0: s7, v1: Double): Double = {
    val v4: Double = f44(v1)
    val v24: Double = v4 / v4
    val v13: Double = f44(v4)
    val v15: Double = v13 * v24
    val v53: Double = v15 - v4
    v53
  }
  def benchmark(): Unit = {
    val v0: s7 = s7(s6(Vector(Vector(s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0)), Vector(Vector(6.0))), s0(Vector(Vector(7.0)), Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0))), s0(Vector(Vector(14.0)), Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0)), Vector(Vector(20.0))))), Vector(s1(s0(Vector(Vector(21.0)), Vector(Vector(22.0), Vector(23.0)), Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0))), s0(Vector(Vector(28.0)), Vector(Vector(29.0), Vector(30.0)), Vector(Vector(31.0), Vector(32.0), Vector(33.0)), Vector(Vector(34.0))), s0(Vector(Vector(35.0)), Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0), Vector(40.0)), Vector(Vector(41.0)))))), Vector(s4(Vector(s1(s0(Vector(Vector(42.0)), Vector(Vector(43.0), Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0)), Vector(Vector(48.0))), s0(Vector(Vector(49.0)), Vector(Vector(50.0), Vector(51.0)), Vector(Vector(52.0), Vector(53.0), Vector(54.0)), Vector(Vector(55.0))), s0(Vector(Vector(56.0)), Vector(Vector(57.0), Vector(58.0)), Vector(Vector(59.0), Vector(60.0), Vector(61.0)), Vector(Vector(62.0))))), s0(Vector(Vector(63.0)), Vector(Vector(64.0), Vector(65.0)), Vector(Vector(66.0), Vector(67.0), Vector(68.0)), Vector(Vector(69.0))), s1(s0(Vector(Vector(70.0)), Vector(Vector(71.0), Vector(72.0)), Vector(Vector(73.0), Vector(74.0), Vector(75.0)), Vector(Vector(76.0))), s0(Vector(Vector(77.0)), Vector(Vector(78.0), Vector(79.0)), Vector(Vector(80.0), Vector(81.0), Vector(82.0)), Vector(Vector(83.0))), s0(Vector(Vector(84.0)), Vector(Vector(85.0), Vector(86.0)), Vector(Vector(87.0), Vector(88.0), Vector(89.0)), Vector(Vector(90.0)))), s3(s2(s0(Vector(Vector(91.0)), Vector(Vector(92.0), Vector(93.0)), Vector(Vector(94.0), Vector(95.0), Vector(96.0)), Vector(Vector(97.0))), Vector(s0(Vector(Vector(98.0)), Vector(Vector(99.0), Vector(100.0)), Vector(Vector(101.0), Vector(102.0), Vector(103.0)), Vector(Vector(104.0))), s0(Vector(Vector(105.0)), Vector(Vector(106.0), Vector(107.0)), Vector(Vector(108.0), Vector(109.0), Vector(110.0)), Vector(Vector(111.0))), s0(Vector(Vector(112.0)), Vector(Vector(113.0), Vector(114.0)), Vector(Vector(115.0), Vector(116.0), Vector(117.0)), Vector(Vector(118.0)))), s0(Vector(Vector(119.0)), Vector(Vector(120.0), Vector(121.0)), Vector(Vector(122.0), Vector(123.0), Vector(124.0)), Vector(Vector(125.0)))), s2(s0(Vector(Vector(126.0)), Vector(Vector(127.0), Vector(128.0)), Vector(Vector(129.0), Vector(130.0), Vector(131.0)), Vector(Vector(132.0))), Vector(s0(Vector(Vector(133.0)), Vector(Vector(134.0), Vector(135.0)), Vector(Vector(136.0), Vector(137.0), Vector(138.0)), Vector(Vector(139.0))), s0(Vector(Vector(140.0)), Vector(Vector(141.0), Vector(142.0)), Vector(Vector(143.0), Vector(144.0), Vector(145.0)), Vector(Vector(146.0))), s0(Vector(Vector(147.0)), Vector(Vector(148.0), Vector(149.0)), Vector(Vector(150.0), Vector(151.0), Vector(152.0)), Vector(Vector(153.0)))), s0(Vector(Vector(154.0)), Vector(Vector(155.0), Vector(156.0)), Vector(Vector(157.0), Vector(158.0), Vector(159.0)), Vector(Vector(160.0)))))))), Vector(Vector(s3(s2(s0(Vector(Vector(161.0)), Vector(Vector(162.0), Vector(163.0)), Vector(Vector(164.0), Vector(165.0), Vector(166.0)), Vector(Vector(167.0))), Vector(s0(Vector(Vector(168.0)), Vector(Vector(169.0), Vector(170.0)), Vector(Vector(171.0), Vector(172.0), Vector(173.0)), Vector(Vector(174.0))), s0(Vector(Vector(175.0)), Vector(Vector(176.0), Vector(177.0)), Vector(Vector(178.0), Vector(179.0), Vector(180.0)), Vector(Vector(181.0))), s0(Vector(Vector(182.0)), Vector(Vector(183.0), Vector(184.0)), Vector(Vector(185.0), Vector(186.0), Vector(187.0)), Vector(Vector(188.0)))), s0(Vector(Vector(189.0)), Vector(Vector(190.0), Vector(191.0)), Vector(Vector(192.0), Vector(193.0), Vector(194.0)), Vector(Vector(195.0)))), s2(s0(Vector(Vector(196.0)), Vector(Vector(197.0), Vector(198.0)), Vector(Vector(199.0), Vector(200.0), Vector(201.0)), Vector(Vector(202.0))), Vector(s0(Vector(Vector(203.0)), Vector(Vector(204.0), Vector(205.0)), Vector(Vector(206.0), Vector(207.0), Vector(208.0)), Vector(Vector(209.0))), s0(Vector(Vector(210.0)), Vector(Vector(211.0), Vector(212.0)), Vector(Vector(213.0), Vector(214.0), Vector(215.0)), Vector(Vector(216.0))), s0(Vector(Vector(217.0)), Vector(Vector(218.0), Vector(219.0)), Vector(Vector(220.0), Vector(221.0), Vector(222.0)), Vector(Vector(223.0)))), s0(Vector(Vector(224.0)), Vector(Vector(225.0), Vector(226.0)), Vector(Vector(227.0), Vector(228.0), Vector(229.0)), Vector(Vector(230.0)))))), Vector(s3(s2(s0(Vector(Vector(231.0)), Vector(Vector(232.0), Vector(233.0)), Vector(Vector(234.0), Vector(235.0), Vector(236.0)), Vector(Vector(237.0))), Vector(s0(Vector(Vector(238.0)), Vector(Vector(239.0), Vector(240.0)), Vector(Vector(241.0), Vector(242.0), Vector(243.0)), Vector(Vector(244.0))), s0(Vector(Vector(245.0)), Vector(Vector(246.0), Vector(247.0)), Vector(Vector(248.0), Vector(249.0), Vector(250.0)), Vector(Vector(251.0))), s0(Vector(Vector(252.0)), Vector(Vector(253.0), Vector(254.0)), Vector(Vector(255.0), Vector(256.0), Vector(257.0)), Vector(Vector(258.0)))), s0(Vector(Vector(259.0)), Vector(Vector(260.0), Vector(261.0)), Vector(Vector(262.0), Vector(263.0), Vector(264.0)), Vector(Vector(265.0)))), s2(s0(Vector(Vector(266.0)), Vector(Vector(267.0), Vector(268.0)), Vector(Vector(269.0), Vector(270.0), Vector(271.0)), Vector(Vector(272.0))), Vector(s0(Vector(Vector(273.0)), Vector(Vector(274.0), Vector(275.0)), Vector(Vector(276.0), Vector(277.0), Vector(278.0)), Vector(Vector(279.0))), s0(Vector(Vector(280.0)), Vector(Vector(281.0), Vector(282.0)), Vector(Vector(283.0), Vector(284.0), Vector(285.0)), Vector(Vector(286.0))), s0(Vector(Vector(287.0)), Vector(Vector(288.0), Vector(289.0)), Vector(Vector(290.0), Vector(291.0), Vector(292.0)), Vector(Vector(293.0)))), s0(Vector(Vector(294.0)), Vector(Vector(295.0), Vector(296.0)), Vector(Vector(297.0), Vector(298.0), Vector(299.0)), Vector(Vector(300.0)))))), Vector(s3(s2(s0(Vector(Vector(301.0)), Vector(Vector(302.0), Vector(303.0)), Vector(Vector(304.0), Vector(305.0), Vector(306.0)), Vector(Vector(307.0))), Vector(s0(Vector(Vector(308.0)), Vector(Vector(309.0), Vector(310.0)), Vector(Vector(311.0), Vector(312.0), Vector(313.0)), Vector(Vector(314.0))), s0(Vector(Vector(315.0)), Vector(Vector(316.0), Vector(317.0)), Vector(Vector(318.0), Vector(319.0), Vector(320.0)), Vector(Vector(321.0))), s0(Vector(Vector(322.0)), Vector(Vector(323.0), Vector(324.0)), Vector(Vector(325.0), Vector(326.0), Vector(327.0)), Vector(Vector(328.0)))), s0(Vector(Vector(329.0)), Vector(Vector(330.0), Vector(331.0)), Vector(Vector(332.0), Vector(333.0), Vector(334.0)), Vector(Vector(335.0)))), s2(s0(Vector(Vector(336.0)), Vector(Vector(337.0), Vector(338.0)), Vector(Vector(339.0), Vector(340.0), Vector(341.0)), Vector(Vector(342.0))), Vector(s0(Vector(Vector(343.0)), Vector(Vector(344.0), Vector(345.0)), Vector(Vector(346.0), Vector(347.0), Vector(348.0)), Vector(Vector(349.0))), s0(Vector(Vector(350.0)), Vector(Vector(351.0), Vector(352.0)), Vector(Vector(353.0), Vector(354.0), Vector(355.0)), Vector(Vector(356.0))), s0(Vector(Vector(357.0)), Vector(Vector(358.0), Vector(359.0)), Vector(Vector(360.0), Vector(361.0), Vector(362.0)), Vector(Vector(363.0)))), s0(Vector(Vector(364.0)), Vector(Vector(365.0), Vector(366.0)), Vector(Vector(367.0), Vector(368.0), Vector(369.0)), Vector(Vector(370.0))))))))
    val v1: Double = 371.0
    val start = nanoTime()
    var result: Double = 371.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}