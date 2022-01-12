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
    p1: s1,
    p2: Vector[s0]
  )
  case class s3 (
    p0: s1,
    p1: Vector[Vector[s2]]
  )
  case class s4 (
    p0: Vector[Vector[s0]],
    p1: s3
  )
  case class s6 (
    p0: s2,
    p1: s1
  )
  def f18(v0: Double): Double = {
    var v2: Double = v0
    var v7: Double = v2
    v7 = v0
    var v1: Double = v7
    var v6: Double = v0
    val v8: Vector[Double] = Vector(v2, v1, v0, v6, v0)
    val v14: Double = v8(2)
    var v10: Double = v7
    val v15: Vector[Vector[Double]] = Vector(v8, v8, v8, v8, v8, v8, v8)
    var v12: Vector[Double] = v8
    var v3: Double = v2
    v12 = v12.updated(4, v10)
    val v43: Vector[Double] = v15(6)
    var v19: Vector[Vector[Double]] = v15
    val v37: Vector[Double] = v19(5)
    var v27: Double = v0
    var v34: Vector[Vector[Double]] = v19
    v34 = v34.updated(3, v43)
    var v24: Double = v14
    var v25: Vector[Double] = v12
    v19 = v19.updated(3, v25)
    var v20: Double = v24
    val v45: Vector[Double] = v34(1)
    var v28: Vector[Double] = v37
    val v48: Vector[Double] = v19(0)
    var v30: Vector[Vector[Double]] = v34
    var v60: Vector[Vector[Double]] = v15
    v25 = v25.updated(1, v3)
    val v50: Double = v48(4)
    val v42: Vector[Double] = v30(2)
    v19 = v19.updated(3, v45)
    val v79: Vector[Vector[Double]] = Vector(v28, v45, v25)
    var v55: Vector[Vector[Double]] = v30
    val v53: Vector[Double] = v79(2)
    val v57: Vector[Vector[Vector[Double]]] = Vector(v60, v30, v60, v34)
    v25 = v25.updated(1, v27)
    v25 = v25.updated(1, v20)
    val v88: Vector[Vector[Double]] = v57(2)
    var v91: Vector[Vector[Double]] = v88
    val v77: Vector[Double] = v88(0)
    var v202: Vector[Vector[Vector[Double]]] = v57
    v34 = v91
    val v110: Vector[Double] = v55(2)
    val v106: Vector[Vector[Double]] = v202(0)
    v55 = v55.updated(5, v37)
    val v122: Vector[Double] = v106(2)
    v19 = v19.updated(3, v42)
    val v65: Double = v53(0)
    v24 = v27
    v30 = v30.updated(5, v110)
    v34 = v34.updated(4, v77)
    v24 = v50
    v55 = v55.updated(6, v122)
    v65
  }
  @noinline
  def f0(v0: Vector[Vector[s6]], v1: Vector[Vector[s3]], v2: Vector[s4], v3: Double): Double = {
    val v5: Double = f18(v3)
    val v6: Double = f18(v5)
    val v25: Double = f18(v6)
    val v48: Double = f18(v25)
    val v34: Double = v48 * v25
    v34
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s6]] = Vector(Vector(s6(s2(Vector(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0))), s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0))))), s1(s0(Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0), Vector(14.0))), s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0)))), Vector(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0), Vector(24.0))), s0(Vector(Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0))), s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0), Vector(33.0), Vector(34.0))))), s1(s0(Vector(Vector(35.0), Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0))), s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0), Vector(44.0)))))), Vector(s6(s2(Vector(s1(s0(Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0), Vector(48.0), Vector(49.0))), s0(Vector(Vector(50.0), Vector(51.0)), Vector(Vector(52.0), Vector(53.0), Vector(54.0))))), s1(s0(Vector(Vector(55.0), Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0))), s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0), Vector(63.0), Vector(64.0)))), Vector(s0(Vector(Vector(65.0), Vector(66.0)), Vector(Vector(67.0), Vector(68.0), Vector(69.0))), s0(Vector(Vector(70.0), Vector(71.0)), Vector(Vector(72.0), Vector(73.0), Vector(74.0))), s0(Vector(Vector(75.0), Vector(76.0)), Vector(Vector(77.0), Vector(78.0), Vector(79.0))))), s1(s0(Vector(Vector(80.0), Vector(81.0)), Vector(Vector(82.0), Vector(83.0), Vector(84.0))), s0(Vector(Vector(85.0), Vector(86.0)), Vector(Vector(87.0), Vector(88.0), Vector(89.0)))))), Vector(s6(s2(Vector(s1(s0(Vector(Vector(90.0), Vector(91.0)), Vector(Vector(92.0), Vector(93.0), Vector(94.0))), s0(Vector(Vector(95.0), Vector(96.0)), Vector(Vector(97.0), Vector(98.0), Vector(99.0))))), s1(s0(Vector(Vector(100.0), Vector(101.0)), Vector(Vector(102.0), Vector(103.0), Vector(104.0))), s0(Vector(Vector(105.0), Vector(106.0)), Vector(Vector(107.0), Vector(108.0), Vector(109.0)))), Vector(s0(Vector(Vector(110.0), Vector(111.0)), Vector(Vector(112.0), Vector(113.0), Vector(114.0))), s0(Vector(Vector(115.0), Vector(116.0)), Vector(Vector(117.0), Vector(118.0), Vector(119.0))), s0(Vector(Vector(120.0), Vector(121.0)), Vector(Vector(122.0), Vector(123.0), Vector(124.0))))), s1(s0(Vector(Vector(125.0), Vector(126.0)), Vector(Vector(127.0), Vector(128.0), Vector(129.0))), s0(Vector(Vector(130.0), Vector(131.0)), Vector(Vector(132.0), Vector(133.0), Vector(134.0)))))))
    val v1: Vector[Vector[s3]] = Vector(Vector(s3(s1(s0(Vector(Vector(135.0), Vector(136.0)), Vector(Vector(137.0), Vector(138.0), Vector(139.0))), s0(Vector(Vector(140.0), Vector(141.0)), Vector(Vector(142.0), Vector(143.0), Vector(144.0)))), Vector(Vector(s2(Vector(s1(s0(Vector(Vector(145.0), Vector(146.0)), Vector(Vector(147.0), Vector(148.0), Vector(149.0))), s0(Vector(Vector(150.0), Vector(151.0)), Vector(Vector(152.0), Vector(153.0), Vector(154.0))))), s1(s0(Vector(Vector(155.0), Vector(156.0)), Vector(Vector(157.0), Vector(158.0), Vector(159.0))), s0(Vector(Vector(160.0), Vector(161.0)), Vector(Vector(162.0), Vector(163.0), Vector(164.0)))), Vector(s0(Vector(Vector(165.0), Vector(166.0)), Vector(Vector(167.0), Vector(168.0), Vector(169.0))), s0(Vector(Vector(170.0), Vector(171.0)), Vector(Vector(172.0), Vector(173.0), Vector(174.0))), s0(Vector(Vector(175.0), Vector(176.0)), Vector(Vector(177.0), Vector(178.0), Vector(179.0))))))))), Vector(s3(s1(s0(Vector(Vector(180.0), Vector(181.0)), Vector(Vector(182.0), Vector(183.0), Vector(184.0))), s0(Vector(Vector(185.0), Vector(186.0)), Vector(Vector(187.0), Vector(188.0), Vector(189.0)))), Vector(Vector(s2(Vector(s1(s0(Vector(Vector(190.0), Vector(191.0)), Vector(Vector(192.0), Vector(193.0), Vector(194.0))), s0(Vector(Vector(195.0), Vector(196.0)), Vector(Vector(197.0), Vector(198.0), Vector(199.0))))), s1(s0(Vector(Vector(200.0), Vector(201.0)), Vector(Vector(202.0), Vector(203.0), Vector(204.0))), s0(Vector(Vector(205.0), Vector(206.0)), Vector(Vector(207.0), Vector(208.0), Vector(209.0)))), Vector(s0(Vector(Vector(210.0), Vector(211.0)), Vector(Vector(212.0), Vector(213.0), Vector(214.0))), s0(Vector(Vector(215.0), Vector(216.0)), Vector(Vector(217.0), Vector(218.0), Vector(219.0))), s0(Vector(Vector(220.0), Vector(221.0)), Vector(Vector(222.0), Vector(223.0), Vector(224.0))))))))), Vector(s3(s1(s0(Vector(Vector(225.0), Vector(226.0)), Vector(Vector(227.0), Vector(228.0), Vector(229.0))), s0(Vector(Vector(230.0), Vector(231.0)), Vector(Vector(232.0), Vector(233.0), Vector(234.0)))), Vector(Vector(s2(Vector(s1(s0(Vector(Vector(235.0), Vector(236.0)), Vector(Vector(237.0), Vector(238.0), Vector(239.0))), s0(Vector(Vector(240.0), Vector(241.0)), Vector(Vector(242.0), Vector(243.0), Vector(244.0))))), s1(s0(Vector(Vector(245.0), Vector(246.0)), Vector(Vector(247.0), Vector(248.0), Vector(249.0))), s0(Vector(Vector(250.0), Vector(251.0)), Vector(Vector(252.0), Vector(253.0), Vector(254.0)))), Vector(s0(Vector(Vector(255.0), Vector(256.0)), Vector(Vector(257.0), Vector(258.0), Vector(259.0))), s0(Vector(Vector(260.0), Vector(261.0)), Vector(Vector(262.0), Vector(263.0), Vector(264.0))), s0(Vector(Vector(265.0), Vector(266.0)), Vector(Vector(267.0), Vector(268.0), Vector(269.0))))))))))
    val v2: Vector[s4] = Vector(s4(Vector(Vector(s0(Vector(Vector(270.0), Vector(271.0)), Vector(Vector(272.0), Vector(273.0), Vector(274.0)))), Vector(s0(Vector(Vector(275.0), Vector(276.0)), Vector(Vector(277.0), Vector(278.0), Vector(279.0))))), s3(s1(s0(Vector(Vector(280.0), Vector(281.0)), Vector(Vector(282.0), Vector(283.0), Vector(284.0))), s0(Vector(Vector(285.0), Vector(286.0)), Vector(Vector(287.0), Vector(288.0), Vector(289.0)))), Vector(Vector(s2(Vector(s1(s0(Vector(Vector(290.0), Vector(291.0)), Vector(Vector(292.0), Vector(293.0), Vector(294.0))), s0(Vector(Vector(295.0), Vector(296.0)), Vector(Vector(297.0), Vector(298.0), Vector(299.0))))), s1(s0(Vector(Vector(300.0), Vector(301.0)), Vector(Vector(302.0), Vector(303.0), Vector(304.0))), s0(Vector(Vector(305.0), Vector(306.0)), Vector(Vector(307.0), Vector(308.0), Vector(309.0)))), Vector(s0(Vector(Vector(310.0), Vector(311.0)), Vector(Vector(312.0), Vector(313.0), Vector(314.0))), s0(Vector(Vector(315.0), Vector(316.0)), Vector(Vector(317.0), Vector(318.0), Vector(319.0))), s0(Vector(Vector(320.0), Vector(321.0)), Vector(Vector(322.0), Vector(323.0), Vector(324.0))))))))), s4(Vector(Vector(s0(Vector(Vector(325.0), Vector(326.0)), Vector(Vector(327.0), Vector(328.0), Vector(329.0)))), Vector(s0(Vector(Vector(330.0), Vector(331.0)), Vector(Vector(332.0), Vector(333.0), Vector(334.0))))), s3(s1(s0(Vector(Vector(335.0), Vector(336.0)), Vector(Vector(337.0), Vector(338.0), Vector(339.0))), s0(Vector(Vector(340.0), Vector(341.0)), Vector(Vector(342.0), Vector(343.0), Vector(344.0)))), Vector(Vector(s2(Vector(s1(s0(Vector(Vector(345.0), Vector(346.0)), Vector(Vector(347.0), Vector(348.0), Vector(349.0))), s0(Vector(Vector(350.0), Vector(351.0)), Vector(Vector(352.0), Vector(353.0), Vector(354.0))))), s1(s0(Vector(Vector(355.0), Vector(356.0)), Vector(Vector(357.0), Vector(358.0), Vector(359.0))), s0(Vector(Vector(360.0), Vector(361.0)), Vector(Vector(362.0), Vector(363.0), Vector(364.0)))), Vector(s0(Vector(Vector(365.0), Vector(366.0)), Vector(Vector(367.0), Vector(368.0), Vector(369.0))), s0(Vector(Vector(370.0), Vector(371.0)), Vector(Vector(372.0), Vector(373.0), Vector(374.0))), s0(Vector(Vector(375.0), Vector(376.0)), Vector(Vector(377.0), Vector(378.0), Vector(379.0))))))))), s4(Vector(Vector(s0(Vector(Vector(380.0), Vector(381.0)), Vector(Vector(382.0), Vector(383.0), Vector(384.0)))), Vector(s0(Vector(Vector(385.0), Vector(386.0)), Vector(Vector(387.0), Vector(388.0), Vector(389.0))))), s3(s1(s0(Vector(Vector(390.0), Vector(391.0)), Vector(Vector(392.0), Vector(393.0), Vector(394.0))), s0(Vector(Vector(395.0), Vector(396.0)), Vector(Vector(397.0), Vector(398.0), Vector(399.0)))), Vector(Vector(s2(Vector(s1(s0(Vector(Vector(400.0), Vector(401.0)), Vector(Vector(402.0), Vector(403.0), Vector(404.0))), s0(Vector(Vector(405.0), Vector(406.0)), Vector(Vector(407.0), Vector(408.0), Vector(409.0))))), s1(s0(Vector(Vector(410.0), Vector(411.0)), Vector(Vector(412.0), Vector(413.0), Vector(414.0))), s0(Vector(Vector(415.0), Vector(416.0)), Vector(Vector(417.0), Vector(418.0), Vector(419.0)))), Vector(s0(Vector(Vector(420.0), Vector(421.0)), Vector(Vector(422.0), Vector(423.0), Vector(424.0))), s0(Vector(Vector(425.0), Vector(426.0)), Vector(Vector(427.0), Vector(428.0), Vector(429.0))), s0(Vector(Vector(430.0), Vector(431.0)), Vector(Vector(432.0), Vector(433.0), Vector(434.0))))))))))
    val v3: Double = 435.0
    val start = nanoTime()
    var result: Double = 435.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}