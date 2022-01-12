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
    p0: s1,
    p1: Vector[Vector[s0]]
  )
  case class s3 (
    p0: s2,
    p1: s1
  )
  case class s4 (
    p0: s1,
    p1: Vector[s3]
  )
  case class s5 (
    p0: Vector[Vector[s3]],
    p1: s0
  )
  case class s6 (
    p0: Vector[s5],
    p1: s0,
    p2: s3,
    p3: Vector[Vector[s4]]
  )
  def f48(v0: Double): Double = {
    var v2: Double = v0
    var v9: Double = v0
    var v5: Double = v2
    var v8: Double = v5
    var v3: Double = v0
    val v6: Double = v8 + v9
    var v4: Double = v8
    val v11: Vector[Double] = Vector(v3, v6, v2, v4)
    val v13: Double = v11(0)
    val v14: Double = v11(1)
    var v18: Vector[Double] = v11
    v18 = v18.updated(0, v14)
    v18 = v18.updated(0, v14)
    v18 = v18.updated(0, v6)
    v5 = v13
    v18 = v18.updated(0, v3)
    v18 = v18.updated(3, v6)
    val v68: Double = v18(0)
    v68
  }
  def f21(v0: s0): s0 = {
    val v7: Vector[Vector[Double]] = v0.p1
    val v6: Vector[Vector[Vector[Double]]] = Vector(v7, v7, v7, v7, v7, v7)
    val v1: Vector[Double] = v7(2)
    val v2: Vector[Vector[Double]] = v6(2)
    val v8: Vector[Vector[Double]] = v0.p0
    val v12: Vector[Vector[Double]] = v0.p1
    val v11: Vector[Vector[Double]] = v0.p1
    var v14: Vector[Vector[Double]] = v8
    val v15: Vector[Vector[Double]] = v0.p1
    var v23: Vector[Vector[Double]] = v8
    v14 = v14.updated(0, v1)
    v14 = v14.updated(0, v1)
    val v19: Vector[Vector[Vector[Double]]] = Vector(v8)
    val v25: Vector[Vector[Double]] = v19(0)
    val v28: Vector[Vector[Double]] = v0.p1
    var v24: s0 = v0
    val v41: Vector[Vector[Double]] = v24.p0
    val v59: Vector[Vector[Double]] = v0.p1
    v24 = v24.copy(p1 = v28)
    val v51: Vector[Vector[Double]] = v24.p1
    val v53: Vector[Vector[Double]] = v0.p0
    v24 = v24.copy(p0 = v14)
    v24 = v24.copy(p1 = v15)
    v24 = v24.copy(p1 = v2)
    val v33: Vector[Double] = v51(0)
    var v103: Vector[Vector[Double]] = v53
    val v42: Vector[Double] = v28(0)
    v14 = v14.updated(0, v33)
    v24 = v24.copy(p1 = v15)
    v24 = v24.copy(p0 = v23)
    v24 = v24.copy(p0 = v41)
    v24 = v24.copy(p1 = v12)
    val v86: Vector[Vector[Double]] = v24.p1
    var v67: s0 = v0
    var v69: Vector[Vector[Double]] = v86
    v24 = v24.copy(p0 = v41)
    v67 = v67.copy(p1 = v7)
    val v161: Vector[Vector[Double]] = v67.p1
    v67 = v67.copy(p1 = v161)
    v67 = v67.copy(p0 = v25)
    val v52: Vector[Vector[Double]] = v0.p0
    var v60: s0 = v0
    v24 = v24.copy(p0 = v103)
    val v180: Vector[Double] = v53(0)
    v69 = v161
    v24 = v24.copy(p0 = v52)
    v24 = v24.copy(p1 = v59)
    var v46: Vector[Double] = v42
    v67 = v67.copy(p1 = v7)
    val v66: Vector[Vector[Double]] = v60.p1
    v69 = v69.updated(1, v180)
    var v96: s0 = v60
    v60 = v60.copy(p1 = v51)
    v96 = v96.copy(p1 = v66)
    val v163: Vector[Vector[Double]] = v0.p1
    v24 = v24.copy(p0 = v25)
    v24 = v24.copy(p1 = v11)
    v24 = v24.copy(p1 = v163)
    v96 = v96.copy(p1 = v69)
    v23 = v23.updated(0, v46)
    v103 = v103.updated(0, v33)
    v96
  }
  def f18(v0: s1): s1 = {
    var v5: s1 = v0
    var v1: s1 = v5
    val v6: s0 = v1.p1
    val v7: s0 = f21(v6)
    val v2: s0 = f21(v6)
    val v10: s0 = f21(v2)
    val v9: Vector[Vector[Double]] = v2.p0
    val v8: s0 = f21(v7)
    val v15: s0 = f21(v10)
    val v11: s0 = v1.p0
    var v13: s0 = v8
    v5 = v5.copy(p0 = v15)
    val v14: s0 = f21(v7)
    var v34: s0 = v11
    val v32: Vector[Vector[Double]] = v11.p0
    val v28: Vector[Vector[Double]] = v15.p0
    v5 = v5.copy(p1 = v11)
    v34 = v34.copy(p0 = v9)
    val v24: Vector[Vector[Double]] = v34.p1
    v34 = v34.copy(p0 = v32)
    var v51: Vector[Vector[Double]] = v24
    var v26: Vector[Vector[Double]] = v28
    var v54: s1 = v5
    v13 = v13.copy(p1 = v51)
    v34 = v34.copy(p0 = v26)
    v34 = v15
    v54 = v54.copy(p1 = v10)
    v54 = v54.copy(p1 = v14)
    v5 = v5.copy(p0 = v13)
    v13 = v13.copy(p0 = v28)
    v54
  }
  @noinline
  def f0(v0: Vector[s3], v1: Vector[s6], v2: Double): Double = {
    val v8: s3 = v0(0)
    val v11: s3 = v0(0)
    val v13: s3 = v0(0)
    val v30: s1 = v8.p1
    var v23: s3 = v13
    val v45: s2 = v8.p0
    val v33: s1 = v23.p1
    val v32: s1 = f18(v33)
    v23 = v11
    v23 = v23.copy(p1 = v30)
    v23 = v23.copy(p0 = v45)
    val v41: s1 = f18(v32)
    val v31: s0 = v41.p0
    val v42: Vector[Vector[Double]] = v31.p0
    val v64: Vector[Double] = v42(0)
    val v96: Double = v64(0)
    val v175: Double = f48(v96)
    v175
  }
  def benchmark(): Unit = {
    val v0: Vector[s3] = Vector(s3(s2(s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0)))), Vector(Vector(s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))))), s1(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0))), s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0))))))
    val v1: Vector[s6] = Vector(s6(Vector(s5(Vector(Vector(s3(s2(s1(s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))), s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0)))), Vector(Vector(s0(Vector(Vector(28.0)), Vector(Vector(29.0), Vector(30.0), Vector(31.0)))))), s1(s0(Vector(Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0))), s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0)))))), Vector(s3(s2(s1(s0(Vector(Vector(40.0)), Vector(Vector(41.0), Vector(42.0), Vector(43.0))), s0(Vector(Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0)))), Vector(Vector(s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0), Vector(51.0)))))), s1(s0(Vector(Vector(52.0)), Vector(Vector(53.0), Vector(54.0), Vector(55.0))), s0(Vector(Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0))))))), s0(Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0), Vector(63.0)))), s5(Vector(Vector(s3(s2(s1(s0(Vector(Vector(64.0)), Vector(Vector(65.0), Vector(66.0), Vector(67.0))), s0(Vector(Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0)))), Vector(Vector(s0(Vector(Vector(72.0)), Vector(Vector(73.0), Vector(74.0), Vector(75.0)))))), s1(s0(Vector(Vector(76.0)), Vector(Vector(77.0), Vector(78.0), Vector(79.0))), s0(Vector(Vector(80.0)), Vector(Vector(81.0), Vector(82.0), Vector(83.0)))))), Vector(s3(s2(s1(s0(Vector(Vector(84.0)), Vector(Vector(85.0), Vector(86.0), Vector(87.0))), s0(Vector(Vector(88.0)), Vector(Vector(89.0), Vector(90.0), Vector(91.0)))), Vector(Vector(s0(Vector(Vector(92.0)), Vector(Vector(93.0), Vector(94.0), Vector(95.0)))))), s1(s0(Vector(Vector(96.0)), Vector(Vector(97.0), Vector(98.0), Vector(99.0))), s0(Vector(Vector(100.0)), Vector(Vector(101.0), Vector(102.0), Vector(103.0))))))), s0(Vector(Vector(104.0)), Vector(Vector(105.0), Vector(106.0), Vector(107.0)))), s5(Vector(Vector(s3(s2(s1(s0(Vector(Vector(108.0)), Vector(Vector(109.0), Vector(110.0), Vector(111.0))), s0(Vector(Vector(112.0)), Vector(Vector(113.0), Vector(114.0), Vector(115.0)))), Vector(Vector(s0(Vector(Vector(116.0)), Vector(Vector(117.0), Vector(118.0), Vector(119.0)))))), s1(s0(Vector(Vector(120.0)), Vector(Vector(121.0), Vector(122.0), Vector(123.0))), s0(Vector(Vector(124.0)), Vector(Vector(125.0), Vector(126.0), Vector(127.0)))))), Vector(s3(s2(s1(s0(Vector(Vector(128.0)), Vector(Vector(129.0), Vector(130.0), Vector(131.0))), s0(Vector(Vector(132.0)), Vector(Vector(133.0), Vector(134.0), Vector(135.0)))), Vector(Vector(s0(Vector(Vector(136.0)), Vector(Vector(137.0), Vector(138.0), Vector(139.0)))))), s1(s0(Vector(Vector(140.0)), Vector(Vector(141.0), Vector(142.0), Vector(143.0))), s0(Vector(Vector(144.0)), Vector(Vector(145.0), Vector(146.0), Vector(147.0))))))), s0(Vector(Vector(148.0)), Vector(Vector(149.0), Vector(150.0), Vector(151.0))))), s0(Vector(Vector(152.0)), Vector(Vector(153.0), Vector(154.0), Vector(155.0))), s3(s2(s1(s0(Vector(Vector(156.0)), Vector(Vector(157.0), Vector(158.0), Vector(159.0))), s0(Vector(Vector(160.0)), Vector(Vector(161.0), Vector(162.0), Vector(163.0)))), Vector(Vector(s0(Vector(Vector(164.0)), Vector(Vector(165.0), Vector(166.0), Vector(167.0)))))), s1(s0(Vector(Vector(168.0)), Vector(Vector(169.0), Vector(170.0), Vector(171.0))), s0(Vector(Vector(172.0)), Vector(Vector(173.0), Vector(174.0), Vector(175.0))))), Vector(Vector(s4(s1(s0(Vector(Vector(176.0)), Vector(Vector(177.0), Vector(178.0), Vector(179.0))), s0(Vector(Vector(180.0)), Vector(Vector(181.0), Vector(182.0), Vector(183.0)))), Vector(s3(s2(s1(s0(Vector(Vector(184.0)), Vector(Vector(185.0), Vector(186.0), Vector(187.0))), s0(Vector(Vector(188.0)), Vector(Vector(189.0), Vector(190.0), Vector(191.0)))), Vector(Vector(s0(Vector(Vector(192.0)), Vector(Vector(193.0), Vector(194.0), Vector(195.0)))))), s1(s0(Vector(Vector(196.0)), Vector(Vector(197.0), Vector(198.0), Vector(199.0))), s0(Vector(Vector(200.0)), Vector(Vector(201.0), Vector(202.0), Vector(203.0)))))))))), s6(Vector(s5(Vector(Vector(s3(s2(s1(s0(Vector(Vector(204.0)), Vector(Vector(205.0), Vector(206.0), Vector(207.0))), s0(Vector(Vector(208.0)), Vector(Vector(209.0), Vector(210.0), Vector(211.0)))), Vector(Vector(s0(Vector(Vector(212.0)), Vector(Vector(213.0), Vector(214.0), Vector(215.0)))))), s1(s0(Vector(Vector(216.0)), Vector(Vector(217.0), Vector(218.0), Vector(219.0))), s0(Vector(Vector(220.0)), Vector(Vector(221.0), Vector(222.0), Vector(223.0)))))), Vector(s3(s2(s1(s0(Vector(Vector(224.0)), Vector(Vector(225.0), Vector(226.0), Vector(227.0))), s0(Vector(Vector(228.0)), Vector(Vector(229.0), Vector(230.0), Vector(231.0)))), Vector(Vector(s0(Vector(Vector(232.0)), Vector(Vector(233.0), Vector(234.0), Vector(235.0)))))), s1(s0(Vector(Vector(236.0)), Vector(Vector(237.0), Vector(238.0), Vector(239.0))), s0(Vector(Vector(240.0)), Vector(Vector(241.0), Vector(242.0), Vector(243.0))))))), s0(Vector(Vector(244.0)), Vector(Vector(245.0), Vector(246.0), Vector(247.0)))), s5(Vector(Vector(s3(s2(s1(s0(Vector(Vector(248.0)), Vector(Vector(249.0), Vector(250.0), Vector(251.0))), s0(Vector(Vector(252.0)), Vector(Vector(253.0), Vector(254.0), Vector(255.0)))), Vector(Vector(s0(Vector(Vector(256.0)), Vector(Vector(257.0), Vector(258.0), Vector(259.0)))))), s1(s0(Vector(Vector(260.0)), Vector(Vector(261.0), Vector(262.0), Vector(263.0))), s0(Vector(Vector(264.0)), Vector(Vector(265.0), Vector(266.0), Vector(267.0)))))), Vector(s3(s2(s1(s0(Vector(Vector(268.0)), Vector(Vector(269.0), Vector(270.0), Vector(271.0))), s0(Vector(Vector(272.0)), Vector(Vector(273.0), Vector(274.0), Vector(275.0)))), Vector(Vector(s0(Vector(Vector(276.0)), Vector(Vector(277.0), Vector(278.0), Vector(279.0)))))), s1(s0(Vector(Vector(280.0)), Vector(Vector(281.0), Vector(282.0), Vector(283.0))), s0(Vector(Vector(284.0)), Vector(Vector(285.0), Vector(286.0), Vector(287.0))))))), s0(Vector(Vector(288.0)), Vector(Vector(289.0), Vector(290.0), Vector(291.0)))), s5(Vector(Vector(s3(s2(s1(s0(Vector(Vector(292.0)), Vector(Vector(293.0), Vector(294.0), Vector(295.0))), s0(Vector(Vector(296.0)), Vector(Vector(297.0), Vector(298.0), Vector(299.0)))), Vector(Vector(s0(Vector(Vector(300.0)), Vector(Vector(301.0), Vector(302.0), Vector(303.0)))))), s1(s0(Vector(Vector(304.0)), Vector(Vector(305.0), Vector(306.0), Vector(307.0))), s0(Vector(Vector(308.0)), Vector(Vector(309.0), Vector(310.0), Vector(311.0)))))), Vector(s3(s2(s1(s0(Vector(Vector(312.0)), Vector(Vector(313.0), Vector(314.0), Vector(315.0))), s0(Vector(Vector(316.0)), Vector(Vector(317.0), Vector(318.0), Vector(319.0)))), Vector(Vector(s0(Vector(Vector(320.0)), Vector(Vector(321.0), Vector(322.0), Vector(323.0)))))), s1(s0(Vector(Vector(324.0)), Vector(Vector(325.0), Vector(326.0), Vector(327.0))), s0(Vector(Vector(328.0)), Vector(Vector(329.0), Vector(330.0), Vector(331.0))))))), s0(Vector(Vector(332.0)), Vector(Vector(333.0), Vector(334.0), Vector(335.0))))), s0(Vector(Vector(336.0)), Vector(Vector(337.0), Vector(338.0), Vector(339.0))), s3(s2(s1(s0(Vector(Vector(340.0)), Vector(Vector(341.0), Vector(342.0), Vector(343.0))), s0(Vector(Vector(344.0)), Vector(Vector(345.0), Vector(346.0), Vector(347.0)))), Vector(Vector(s0(Vector(Vector(348.0)), Vector(Vector(349.0), Vector(350.0), Vector(351.0)))))), s1(s0(Vector(Vector(352.0)), Vector(Vector(353.0), Vector(354.0), Vector(355.0))), s0(Vector(Vector(356.0)), Vector(Vector(357.0), Vector(358.0), Vector(359.0))))), Vector(Vector(s4(s1(s0(Vector(Vector(360.0)), Vector(Vector(361.0), Vector(362.0), Vector(363.0))), s0(Vector(Vector(364.0)), Vector(Vector(365.0), Vector(366.0), Vector(367.0)))), Vector(s3(s2(s1(s0(Vector(Vector(368.0)), Vector(Vector(369.0), Vector(370.0), Vector(371.0))), s0(Vector(Vector(372.0)), Vector(Vector(373.0), Vector(374.0), Vector(375.0)))), Vector(Vector(s0(Vector(Vector(376.0)), Vector(Vector(377.0), Vector(378.0), Vector(379.0)))))), s1(s0(Vector(Vector(380.0)), Vector(Vector(381.0), Vector(382.0), Vector(383.0))), s0(Vector(Vector(384.0)), Vector(Vector(385.0), Vector(386.0), Vector(387.0)))))))))))
    val v2: Double = 388.0
    val start = nanoTime()
    var result: Double = 388.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}