import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  case class s2 (
    p0: Vector[s0],
    p1: s1,
    p2: s1,
    p3: s0,
    p4: Vector[s0]
  )
  case class s3 (
    p0: Vector[s2],
    p1: s1
  )
  case class s5 (
    p0: s3,
    p1: s0
  )
  case class s6 (
    p0: Vector[s5],
    p1: s0
  )
  case class s7 (
    p0: s5,
    p1: s6
  )
  case class s12 (
    p0: Vector[s0],
    p1: s1
  )
  def f74(v0: s0): s0 = {
    val v1: Vector[Vector[Double]] = v0.p1
    var v2: s0 = v0
    val v7: Vector[Double] = v1(0)
    var v9: Vector[Vector[Double]] = v1
    val v5: Vector[Double] = v9(0)
    val v13: Vector[Vector[Double]] = v0.p0
    var v6: Vector[Vector[Double]] = v13
    var v3: Vector[Vector[Double]] = v9
    val v8: Vector[Vector[Double]] = v2.p1
    v6 = v6.updated(0, v5)
    val v10: Vector[Vector[Vector[Double]]] = Vector(v3, v8, v6, v9, v9, v3, v8)
    val v12: Vector[Vector[Double]] = v2.p0
    v3 = v1
    v2 = v2.copy(p1 = v3)
    var v19: Vector[Double] = v7
    v3 = v3.updated(0, v19)
    v2 = v2.copy(p0 = v1)
    val v17: Vector[Vector[Double]] = v2.p0
    v2 = v2.copy(p0 = v13)
    var v11: s0 = v2
    val v18: Vector[Vector[Double]] = v2.p1
    val v21: Vector[Vector[Double]] = v11.p0
    v2 = v2.copy(p0 = v8)
    val v15: Vector[Double] = v6(0)
    val v23: Vector[Double] = v21(0)
    val v16: Vector[Vector[Double]] = Vector(v23, v5, v23, v15, v23)
    var v20: Vector[Double] = v19
    var v24: s0 = v2
    var v25: Vector[Double] = v7
    v6 = v6.updated(0, v19)
    v24 = v11
    val v30: s0 = s0(v3, v3)
    val v14: Double = v20(0)
    var v28: Double = v14
    v2 = v2.copy(p0 = v6)
    val v49: Vector[Vector[Double]] = v2.p0
    v20 = v20.updated(0, v28)
    var v29: Vector[Vector[Vector[Double]]] = v10
    var v44: s0 = v24
    val v56: s0 = s0(v18, v12)
    v29 = v29.updated(1, v3)
    val v27: Double = v23(0)
    v20 = v20.updated(0, v14)
    val v55: Vector[Vector[Double]] = v2.p1
    val v33: Vector[s0] = Vector(v56, v56, v44, v0)
    val v54: s0 = v33(2)
    val v62: Vector[Double] = v55(0)
    val v78: Vector[Vector[Double]] = v10(5)
    v25 = v25.updated(0, v28)
    val v43: Vector[s0] = Vector(v56, v44, v54, v0, v24)
    val v105: Vector[Double] = v16(2)
    v25 = v25.updated(0, v27)
    val v83: Vector[Vector[Double]] = v30.p1
    v25 = v25.updated(0, v27)
    v19 = v25
    v44 = v44.copy(p1 = v49)
    v24 = v24.copy(p1 = v1)
    v11 = v11.copy(p0 = v18)
    val v84: Vector[Vector[Double]] = v0.p0
    v11 = v11.copy(p0 = v21)
    val v98: Vector[Vector[Double]] = v29(6)
    var v145: Vector[s0] = v43
    v24 = v24.copy(p1 = v98)
    v20 = v62
    v24 = v24.copy(p1 = v84)
    v2 = v2.copy(p1 = v17)
    var v107: Vector[s0] = v145
    val v122: s0 = s0(v78, v83)
    v3 = v3.updated(0, v15)
    var v208: Vector[s0] = v33
    val v197: s0 = v107(3)
    v29 = v29.updated(3, v84)
    val v140: s0 = v208(2)
    v107 = v107.updated(2, v122)
    v145 = v145.updated(0, v140)
    var v196: s0 = v197
    var v75: s0 = v196
    v3 = v3.updated(0, v105)
    v75
  }
  def f55(v0: s6): s6 = {
    var v4: s6 = v0
    val v6: s0 = v0.p1
    val v2: s0 = v0.p1
    val v5: s0 = f74(v2)
    val v8: Vector[s5] = v4.p0
    val v11: s0 = v4.p1
    v4 = v4.copy(p1 = v11)
    val v12: s0 = f74(v11)
    val v9: s0 = f74(v6)
    var v14: s6 = v4
    var v15: Vector[s5] = v8
    val v23: Vector[Vector[Double]] = v12.p1
    val v18: s5 = v15(0)
    v14 = v14.copy(p1 = v11)
    v14 = v14.copy(p0 = v15)
    val v26: s0 = f74(v6)
    v15 = v15.updated(1, v18)
    v15 = v15.updated(0, v18)
    var v30: s0 = v5
    v15 = v15.updated(0, v18)
    var v36: s5 = v18
    v15 = v15.updated(1, v36)
    val v50: Vector[Vector[Double]] = v26.p1
    v15 = v15.updated(1, v36)
    var v63: s0 = v9
    v30 = v30.copy(p1 = v23)
    v63 = v63.copy(p0 = v50)
    v30 = v63
    v14 = v14.copy(p1 = v30)
    v14
  }
  @noinline
  def f0(v0: Vector[Vector[s12]], v1: s7, v2: s3, v3: Double): Double = {
    val v6: s6 = v1.p1
    val v10: s6 = f55(v6)
    val v31: s0 = v10.p1
    val v36: s0 = f74(v31)
    val v22: Vector[Vector[Double]] = v36.p0
    val v49: Vector[Double] = v22(0)
    val v97: Double = v49(0)
    val v77: Double = v97 / v97
    v77
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s12]] = Vector(Vector(s12(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0)))), s1(Vector(s0(Vector(Vector(2.0)), Vector(Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0))), s0(Vector(Vector(6.0)), Vector(Vector(7.0)))), Vector(s0(Vector(Vector(8.0)), Vector(Vector(9.0))), s0(Vector(Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0))))))), Vector(s12(Vector(s0(Vector(Vector(14.0)), Vector(Vector(15.0)))), s1(Vector(s0(Vector(Vector(16.0)), Vector(Vector(17.0))), s0(Vector(Vector(18.0)), Vector(Vector(19.0))), s0(Vector(Vector(20.0)), Vector(Vector(21.0)))), Vector(s0(Vector(Vector(22.0)), Vector(Vector(23.0))), s0(Vector(Vector(24.0)), Vector(Vector(25.0))), s0(Vector(Vector(26.0)), Vector(Vector(27.0))))))))
    val v1: s7 = s7(s5(s3(Vector(s2(Vector(s0(Vector(Vector(28.0)), Vector(Vector(29.0))), s0(Vector(Vector(30.0)), Vector(Vector(31.0)))), s1(Vector(s0(Vector(Vector(32.0)), Vector(Vector(33.0))), s0(Vector(Vector(34.0)), Vector(Vector(35.0))), s0(Vector(Vector(36.0)), Vector(Vector(37.0)))), Vector(s0(Vector(Vector(38.0)), Vector(Vector(39.0))), s0(Vector(Vector(40.0)), Vector(Vector(41.0))), s0(Vector(Vector(42.0)), Vector(Vector(43.0))))), s1(Vector(s0(Vector(Vector(44.0)), Vector(Vector(45.0))), s0(Vector(Vector(46.0)), Vector(Vector(47.0))), s0(Vector(Vector(48.0)), Vector(Vector(49.0)))), Vector(s0(Vector(Vector(50.0)), Vector(Vector(51.0))), s0(Vector(Vector(52.0)), Vector(Vector(53.0))), s0(Vector(Vector(54.0)), Vector(Vector(55.0))))), s0(Vector(Vector(56.0)), Vector(Vector(57.0))), Vector(s0(Vector(Vector(58.0)), Vector(Vector(59.0))), s0(Vector(Vector(60.0)), Vector(Vector(61.0))), s0(Vector(Vector(62.0)), Vector(Vector(63.0))))), s2(Vector(s0(Vector(Vector(64.0)), Vector(Vector(65.0))), s0(Vector(Vector(66.0)), Vector(Vector(67.0)))), s1(Vector(s0(Vector(Vector(68.0)), Vector(Vector(69.0))), s0(Vector(Vector(70.0)), Vector(Vector(71.0))), s0(Vector(Vector(72.0)), Vector(Vector(73.0)))), Vector(s0(Vector(Vector(74.0)), Vector(Vector(75.0))), s0(Vector(Vector(76.0)), Vector(Vector(77.0))), s0(Vector(Vector(78.0)), Vector(Vector(79.0))))), s1(Vector(s0(Vector(Vector(80.0)), Vector(Vector(81.0))), s0(Vector(Vector(82.0)), Vector(Vector(83.0))), s0(Vector(Vector(84.0)), Vector(Vector(85.0)))), Vector(s0(Vector(Vector(86.0)), Vector(Vector(87.0))), s0(Vector(Vector(88.0)), Vector(Vector(89.0))), s0(Vector(Vector(90.0)), Vector(Vector(91.0))))), s0(Vector(Vector(92.0)), Vector(Vector(93.0))), Vector(s0(Vector(Vector(94.0)), Vector(Vector(95.0))), s0(Vector(Vector(96.0)), Vector(Vector(97.0))), s0(Vector(Vector(98.0)), Vector(Vector(99.0)))))), s1(Vector(s0(Vector(Vector(100.0)), Vector(Vector(101.0))), s0(Vector(Vector(102.0)), Vector(Vector(103.0))), s0(Vector(Vector(104.0)), Vector(Vector(105.0)))), Vector(s0(Vector(Vector(106.0)), Vector(Vector(107.0))), s0(Vector(Vector(108.0)), Vector(Vector(109.0))), s0(Vector(Vector(110.0)), Vector(Vector(111.0)))))), s0(Vector(Vector(112.0)), Vector(Vector(113.0)))), s6(Vector(s5(s3(Vector(s2(Vector(s0(Vector(Vector(114.0)), Vector(Vector(115.0))), s0(Vector(Vector(116.0)), Vector(Vector(117.0)))), s1(Vector(s0(Vector(Vector(118.0)), Vector(Vector(119.0))), s0(Vector(Vector(120.0)), Vector(Vector(121.0))), s0(Vector(Vector(122.0)), Vector(Vector(123.0)))), Vector(s0(Vector(Vector(124.0)), Vector(Vector(125.0))), s0(Vector(Vector(126.0)), Vector(Vector(127.0))), s0(Vector(Vector(128.0)), Vector(Vector(129.0))))), s1(Vector(s0(Vector(Vector(130.0)), Vector(Vector(131.0))), s0(Vector(Vector(132.0)), Vector(Vector(133.0))), s0(Vector(Vector(134.0)), Vector(Vector(135.0)))), Vector(s0(Vector(Vector(136.0)), Vector(Vector(137.0))), s0(Vector(Vector(138.0)), Vector(Vector(139.0))), s0(Vector(Vector(140.0)), Vector(Vector(141.0))))), s0(Vector(Vector(142.0)), Vector(Vector(143.0))), Vector(s0(Vector(Vector(144.0)), Vector(Vector(145.0))), s0(Vector(Vector(146.0)), Vector(Vector(147.0))), s0(Vector(Vector(148.0)), Vector(Vector(149.0))))), s2(Vector(s0(Vector(Vector(150.0)), Vector(Vector(151.0))), s0(Vector(Vector(152.0)), Vector(Vector(153.0)))), s1(Vector(s0(Vector(Vector(154.0)), Vector(Vector(155.0))), s0(Vector(Vector(156.0)), Vector(Vector(157.0))), s0(Vector(Vector(158.0)), Vector(Vector(159.0)))), Vector(s0(Vector(Vector(160.0)), Vector(Vector(161.0))), s0(Vector(Vector(162.0)), Vector(Vector(163.0))), s0(Vector(Vector(164.0)), Vector(Vector(165.0))))), s1(Vector(s0(Vector(Vector(166.0)), Vector(Vector(167.0))), s0(Vector(Vector(168.0)), Vector(Vector(169.0))), s0(Vector(Vector(170.0)), Vector(Vector(171.0)))), Vector(s0(Vector(Vector(172.0)), Vector(Vector(173.0))), s0(Vector(Vector(174.0)), Vector(Vector(175.0))), s0(Vector(Vector(176.0)), Vector(Vector(177.0))))), s0(Vector(Vector(178.0)), Vector(Vector(179.0))), Vector(s0(Vector(Vector(180.0)), Vector(Vector(181.0))), s0(Vector(Vector(182.0)), Vector(Vector(183.0))), s0(Vector(Vector(184.0)), Vector(Vector(185.0)))))), s1(Vector(s0(Vector(Vector(186.0)), Vector(Vector(187.0))), s0(Vector(Vector(188.0)), Vector(Vector(189.0))), s0(Vector(Vector(190.0)), Vector(Vector(191.0)))), Vector(s0(Vector(Vector(192.0)), Vector(Vector(193.0))), s0(Vector(Vector(194.0)), Vector(Vector(195.0))), s0(Vector(Vector(196.0)), Vector(Vector(197.0)))))), s0(Vector(Vector(198.0)), Vector(Vector(199.0)))), s5(s3(Vector(s2(Vector(s0(Vector(Vector(200.0)), Vector(Vector(201.0))), s0(Vector(Vector(202.0)), Vector(Vector(203.0)))), s1(Vector(s0(Vector(Vector(204.0)), Vector(Vector(205.0))), s0(Vector(Vector(206.0)), Vector(Vector(207.0))), s0(Vector(Vector(208.0)), Vector(Vector(209.0)))), Vector(s0(Vector(Vector(210.0)), Vector(Vector(211.0))), s0(Vector(Vector(212.0)), Vector(Vector(213.0))), s0(Vector(Vector(214.0)), Vector(Vector(215.0))))), s1(Vector(s0(Vector(Vector(216.0)), Vector(Vector(217.0))), s0(Vector(Vector(218.0)), Vector(Vector(219.0))), s0(Vector(Vector(220.0)), Vector(Vector(221.0)))), Vector(s0(Vector(Vector(222.0)), Vector(Vector(223.0))), s0(Vector(Vector(224.0)), Vector(Vector(225.0))), s0(Vector(Vector(226.0)), Vector(Vector(227.0))))), s0(Vector(Vector(228.0)), Vector(Vector(229.0))), Vector(s0(Vector(Vector(230.0)), Vector(Vector(231.0))), s0(Vector(Vector(232.0)), Vector(Vector(233.0))), s0(Vector(Vector(234.0)), Vector(Vector(235.0))))), s2(Vector(s0(Vector(Vector(236.0)), Vector(Vector(237.0))), s0(Vector(Vector(238.0)), Vector(Vector(239.0)))), s1(Vector(s0(Vector(Vector(240.0)), Vector(Vector(241.0))), s0(Vector(Vector(242.0)), Vector(Vector(243.0))), s0(Vector(Vector(244.0)), Vector(Vector(245.0)))), Vector(s0(Vector(Vector(246.0)), Vector(Vector(247.0))), s0(Vector(Vector(248.0)), Vector(Vector(249.0))), s0(Vector(Vector(250.0)), Vector(Vector(251.0))))), s1(Vector(s0(Vector(Vector(252.0)), Vector(Vector(253.0))), s0(Vector(Vector(254.0)), Vector(Vector(255.0))), s0(Vector(Vector(256.0)), Vector(Vector(257.0)))), Vector(s0(Vector(Vector(258.0)), Vector(Vector(259.0))), s0(Vector(Vector(260.0)), Vector(Vector(261.0))), s0(Vector(Vector(262.0)), Vector(Vector(263.0))))), s0(Vector(Vector(264.0)), Vector(Vector(265.0))), Vector(s0(Vector(Vector(266.0)), Vector(Vector(267.0))), s0(Vector(Vector(268.0)), Vector(Vector(269.0))), s0(Vector(Vector(270.0)), Vector(Vector(271.0)))))), s1(Vector(s0(Vector(Vector(272.0)), Vector(Vector(273.0))), s0(Vector(Vector(274.0)), Vector(Vector(275.0))), s0(Vector(Vector(276.0)), Vector(Vector(277.0)))), Vector(s0(Vector(Vector(278.0)), Vector(Vector(279.0))), s0(Vector(Vector(280.0)), Vector(Vector(281.0))), s0(Vector(Vector(282.0)), Vector(Vector(283.0)))))), s0(Vector(Vector(284.0)), Vector(Vector(285.0))))), s0(Vector(Vector(286.0)), Vector(Vector(287.0)))))
    val v2: s3 = s3(Vector(s2(Vector(s0(Vector(Vector(288.0)), Vector(Vector(289.0))), s0(Vector(Vector(290.0)), Vector(Vector(291.0)))), s1(Vector(s0(Vector(Vector(292.0)), Vector(Vector(293.0))), s0(Vector(Vector(294.0)), Vector(Vector(295.0))), s0(Vector(Vector(296.0)), Vector(Vector(297.0)))), Vector(s0(Vector(Vector(298.0)), Vector(Vector(299.0))), s0(Vector(Vector(300.0)), Vector(Vector(301.0))), s0(Vector(Vector(302.0)), Vector(Vector(303.0))))), s1(Vector(s0(Vector(Vector(304.0)), Vector(Vector(305.0))), s0(Vector(Vector(306.0)), Vector(Vector(307.0))), s0(Vector(Vector(308.0)), Vector(Vector(309.0)))), Vector(s0(Vector(Vector(310.0)), Vector(Vector(311.0))), s0(Vector(Vector(312.0)), Vector(Vector(313.0))), s0(Vector(Vector(314.0)), Vector(Vector(315.0))))), s0(Vector(Vector(316.0)), Vector(Vector(317.0))), Vector(s0(Vector(Vector(318.0)), Vector(Vector(319.0))), s0(Vector(Vector(320.0)), Vector(Vector(321.0))), s0(Vector(Vector(322.0)), Vector(Vector(323.0))))), s2(Vector(s0(Vector(Vector(324.0)), Vector(Vector(325.0))), s0(Vector(Vector(326.0)), Vector(Vector(327.0)))), s1(Vector(s0(Vector(Vector(328.0)), Vector(Vector(329.0))), s0(Vector(Vector(330.0)), Vector(Vector(331.0))), s0(Vector(Vector(332.0)), Vector(Vector(333.0)))), Vector(s0(Vector(Vector(334.0)), Vector(Vector(335.0))), s0(Vector(Vector(336.0)), Vector(Vector(337.0))), s0(Vector(Vector(338.0)), Vector(Vector(339.0))))), s1(Vector(s0(Vector(Vector(340.0)), Vector(Vector(341.0))), s0(Vector(Vector(342.0)), Vector(Vector(343.0))), s0(Vector(Vector(344.0)), Vector(Vector(345.0)))), Vector(s0(Vector(Vector(346.0)), Vector(Vector(347.0))), s0(Vector(Vector(348.0)), Vector(Vector(349.0))), s0(Vector(Vector(350.0)), Vector(Vector(351.0))))), s0(Vector(Vector(352.0)), Vector(Vector(353.0))), Vector(s0(Vector(Vector(354.0)), Vector(Vector(355.0))), s0(Vector(Vector(356.0)), Vector(Vector(357.0))), s0(Vector(Vector(358.0)), Vector(Vector(359.0)))))), s1(Vector(s0(Vector(Vector(360.0)), Vector(Vector(361.0))), s0(Vector(Vector(362.0)), Vector(Vector(363.0))), s0(Vector(Vector(364.0)), Vector(Vector(365.0)))), Vector(s0(Vector(Vector(366.0)), Vector(Vector(367.0))), s0(Vector(Vector(368.0)), Vector(Vector(369.0))), s0(Vector(Vector(370.0)), Vector(Vector(371.0))))))
    val v3: Double = 372.0
    val start = nanoTime()
    var result: Double = 372.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}