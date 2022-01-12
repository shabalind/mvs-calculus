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
    p0: Vector[s0],
    p1: Vector[s0]
  )
  case class s3 (
    p0: Vector[s1],
    p1: s0
  )
  case class s5 (
    p0: Vector[s3],
    p1: Vector[s1]
  )
  case class s6 (
    p0: Vector[s0],
    p1: Vector[s5]
  )
  case class s7 (
    p0: s0,
    p1: Vector[s1]
  )
  case class s9 (
    p0: Vector[s7],
    p1: s7
  )
  case class s11 (
    p0: s2,
    p1: s9
  )
  case class s12 (
    p0: Vector[Vector[s2]],
    p1: s0
  )
  def f18(v0: Double): Double = {
    val v2: Vector[Double] = Vector(v0, v0, v0)
    val v4: Double = v2(0)
    var v1: Vector[Double] = v2
    val v7: Vector[Double] = Vector(v0, v0, v4, v4, v4, v4)
    val v8: Double = v4 + v4
    var v3: Vector[Double] = v2
    v3 = v2
    v1 = v1.updated(2, v8)
    var v6: Vector[Double] = v1
    v1 = v1.updated(1, v0)
    v1 = v1.updated(1, v0)
    v3 = v3.updated(1, v4)
    var v15: Vector[Double] = v7
    v15 = v15.updated(2, v0)
    v15 = v15.updated(2, v0)
    val v5: Double = v7(1)
    v3 = v3.updated(0, v5)
    var v9: Double = v8
    val v16: Double = v7(1)
    val v13: Double = v6(0)
    v3 = v2
    v6 = v6.updated(1, v16)
    v1 = v1.updated(1, v8)
    var v14: Double = v16
    val v11: Double = v3(2)
    val v26: Double = v15(4)
    v3 = v3.updated(1, v5)
    val v32: Vector[Double] = Vector(v8, v26, v0, v14, v4, v9, v11)
    v6 = v6.updated(0, v13)
    val v31: Double = v32(1)
    val v40: Double = v32(6)
    v3 = v3.updated(1, v13)
    v15 = v15.updated(1, v31)
    v6 = v6.updated(1, v13)
    v40
  }
  @noinline
  def f0(v0: Vector[s12], v1: s11, v2: Vector[Vector[s7]], v3: Vector[s6], v4: Double): Double = {
    val v5: Double = f18(v4)
    val v12: Double = v5 * v4
    val v19: Double = f18(v5)
    val v28: Double = f18(v5)
    val v37: Double = f18(v28)
    val v33: Double = f18(v19)
    val v43: Double = v12 - v5
    val v54: Double = v19 + v33
    val v97: Double = f18(v43)
    val v63: Double = v54 + v97
    val v102: Double = v37 + v63
    v102
  }
  def benchmark(): Unit = {
    val v0: Vector[s12] = Vector(s12(Vector(Vector(s2(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0)))), Vector(s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0)))))), Vector(s2(Vector(s0(Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0), Vector(14.0)))), Vector(s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0)))))), Vector(s2(Vector(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0), Vector(24.0)))), Vector(s0(Vector(Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0))))))), s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0), Vector(33.0), Vector(34.0)))), s12(Vector(Vector(s2(Vector(s0(Vector(Vector(35.0), Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0)))), Vector(s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0), Vector(44.0)))))), Vector(s2(Vector(s0(Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0), Vector(48.0), Vector(49.0)))), Vector(s0(Vector(Vector(50.0), Vector(51.0)), Vector(Vector(52.0), Vector(53.0), Vector(54.0)))))), Vector(s2(Vector(s0(Vector(Vector(55.0), Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0)))), Vector(s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0), Vector(63.0), Vector(64.0))))))), s0(Vector(Vector(65.0), Vector(66.0)), Vector(Vector(67.0), Vector(68.0), Vector(69.0)))))
    val v1: s11 = s11(s2(Vector(s0(Vector(Vector(70.0), Vector(71.0)), Vector(Vector(72.0), Vector(73.0), Vector(74.0)))), Vector(s0(Vector(Vector(75.0), Vector(76.0)), Vector(Vector(77.0), Vector(78.0), Vector(79.0))))), s9(Vector(s7(s0(Vector(Vector(80.0), Vector(81.0)), Vector(Vector(82.0), Vector(83.0), Vector(84.0))), Vector(s1(s0(Vector(Vector(85.0), Vector(86.0)), Vector(Vector(87.0), Vector(88.0), Vector(89.0))), s0(Vector(Vector(90.0), Vector(91.0)), Vector(Vector(92.0), Vector(93.0), Vector(94.0)))))), s7(s0(Vector(Vector(95.0), Vector(96.0)), Vector(Vector(97.0), Vector(98.0), Vector(99.0))), Vector(s1(s0(Vector(Vector(100.0), Vector(101.0)), Vector(Vector(102.0), Vector(103.0), Vector(104.0))), s0(Vector(Vector(105.0), Vector(106.0)), Vector(Vector(107.0), Vector(108.0), Vector(109.0)))))), s7(s0(Vector(Vector(110.0), Vector(111.0)), Vector(Vector(112.0), Vector(113.0), Vector(114.0))), Vector(s1(s0(Vector(Vector(115.0), Vector(116.0)), Vector(Vector(117.0), Vector(118.0), Vector(119.0))), s0(Vector(Vector(120.0), Vector(121.0)), Vector(Vector(122.0), Vector(123.0), Vector(124.0))))))), s7(s0(Vector(Vector(125.0), Vector(126.0)), Vector(Vector(127.0), Vector(128.0), Vector(129.0))), Vector(s1(s0(Vector(Vector(130.0), Vector(131.0)), Vector(Vector(132.0), Vector(133.0), Vector(134.0))), s0(Vector(Vector(135.0), Vector(136.0)), Vector(Vector(137.0), Vector(138.0), Vector(139.0))))))))
    val v2: Vector[Vector[s7]] = Vector(Vector(s7(s0(Vector(Vector(140.0), Vector(141.0)), Vector(Vector(142.0), Vector(143.0), Vector(144.0))), Vector(s1(s0(Vector(Vector(145.0), Vector(146.0)), Vector(Vector(147.0), Vector(148.0), Vector(149.0))), s0(Vector(Vector(150.0), Vector(151.0)), Vector(Vector(152.0), Vector(153.0), Vector(154.0))))))))
    val v3: Vector[s6] = Vector(s6(Vector(s0(Vector(Vector(155.0), Vector(156.0)), Vector(Vector(157.0), Vector(158.0), Vector(159.0)))), Vector(s5(Vector(s3(Vector(s1(s0(Vector(Vector(160.0), Vector(161.0)), Vector(Vector(162.0), Vector(163.0), Vector(164.0))), s0(Vector(Vector(165.0), Vector(166.0)), Vector(Vector(167.0), Vector(168.0), Vector(169.0)))), s1(s0(Vector(Vector(170.0), Vector(171.0)), Vector(Vector(172.0), Vector(173.0), Vector(174.0))), s0(Vector(Vector(175.0), Vector(176.0)), Vector(Vector(177.0), Vector(178.0), Vector(179.0)))), s1(s0(Vector(Vector(180.0), Vector(181.0)), Vector(Vector(182.0), Vector(183.0), Vector(184.0))), s0(Vector(Vector(185.0), Vector(186.0)), Vector(Vector(187.0), Vector(188.0), Vector(189.0))))), s0(Vector(Vector(190.0), Vector(191.0)), Vector(Vector(192.0), Vector(193.0), Vector(194.0)))), s3(Vector(s1(s0(Vector(Vector(195.0), Vector(196.0)), Vector(Vector(197.0), Vector(198.0), Vector(199.0))), s0(Vector(Vector(200.0), Vector(201.0)), Vector(Vector(202.0), Vector(203.0), Vector(204.0)))), s1(s0(Vector(Vector(205.0), Vector(206.0)), Vector(Vector(207.0), Vector(208.0), Vector(209.0))), s0(Vector(Vector(210.0), Vector(211.0)), Vector(Vector(212.0), Vector(213.0), Vector(214.0)))), s1(s0(Vector(Vector(215.0), Vector(216.0)), Vector(Vector(217.0), Vector(218.0), Vector(219.0))), s0(Vector(Vector(220.0), Vector(221.0)), Vector(Vector(222.0), Vector(223.0), Vector(224.0))))), s0(Vector(Vector(225.0), Vector(226.0)), Vector(Vector(227.0), Vector(228.0), Vector(229.0))))), Vector(s1(s0(Vector(Vector(230.0), Vector(231.0)), Vector(Vector(232.0), Vector(233.0), Vector(234.0))), s0(Vector(Vector(235.0), Vector(236.0)), Vector(Vector(237.0), Vector(238.0), Vector(239.0)))), s1(s0(Vector(Vector(240.0), Vector(241.0)), Vector(Vector(242.0), Vector(243.0), Vector(244.0))), s0(Vector(Vector(245.0), Vector(246.0)), Vector(Vector(247.0), Vector(248.0), Vector(249.0)))))))), s6(Vector(s0(Vector(Vector(250.0), Vector(251.0)), Vector(Vector(252.0), Vector(253.0), Vector(254.0)))), Vector(s5(Vector(s3(Vector(s1(s0(Vector(Vector(255.0), Vector(256.0)), Vector(Vector(257.0), Vector(258.0), Vector(259.0))), s0(Vector(Vector(260.0), Vector(261.0)), Vector(Vector(262.0), Vector(263.0), Vector(264.0)))), s1(s0(Vector(Vector(265.0), Vector(266.0)), Vector(Vector(267.0), Vector(268.0), Vector(269.0))), s0(Vector(Vector(270.0), Vector(271.0)), Vector(Vector(272.0), Vector(273.0), Vector(274.0)))), s1(s0(Vector(Vector(275.0), Vector(276.0)), Vector(Vector(277.0), Vector(278.0), Vector(279.0))), s0(Vector(Vector(280.0), Vector(281.0)), Vector(Vector(282.0), Vector(283.0), Vector(284.0))))), s0(Vector(Vector(285.0), Vector(286.0)), Vector(Vector(287.0), Vector(288.0), Vector(289.0)))), s3(Vector(s1(s0(Vector(Vector(290.0), Vector(291.0)), Vector(Vector(292.0), Vector(293.0), Vector(294.0))), s0(Vector(Vector(295.0), Vector(296.0)), Vector(Vector(297.0), Vector(298.0), Vector(299.0)))), s1(s0(Vector(Vector(300.0), Vector(301.0)), Vector(Vector(302.0), Vector(303.0), Vector(304.0))), s0(Vector(Vector(305.0), Vector(306.0)), Vector(Vector(307.0), Vector(308.0), Vector(309.0)))), s1(s0(Vector(Vector(310.0), Vector(311.0)), Vector(Vector(312.0), Vector(313.0), Vector(314.0))), s0(Vector(Vector(315.0), Vector(316.0)), Vector(Vector(317.0), Vector(318.0), Vector(319.0))))), s0(Vector(Vector(320.0), Vector(321.0)), Vector(Vector(322.0), Vector(323.0), Vector(324.0))))), Vector(s1(s0(Vector(Vector(325.0), Vector(326.0)), Vector(Vector(327.0), Vector(328.0), Vector(329.0))), s0(Vector(Vector(330.0), Vector(331.0)), Vector(Vector(332.0), Vector(333.0), Vector(334.0)))), s1(s0(Vector(Vector(335.0), Vector(336.0)), Vector(Vector(337.0), Vector(338.0), Vector(339.0))), s0(Vector(Vector(340.0), Vector(341.0)), Vector(Vector(342.0), Vector(343.0), Vector(344.0)))))))), s6(Vector(s0(Vector(Vector(345.0), Vector(346.0)), Vector(Vector(347.0), Vector(348.0), Vector(349.0)))), Vector(s5(Vector(s3(Vector(s1(s0(Vector(Vector(350.0), Vector(351.0)), Vector(Vector(352.0), Vector(353.0), Vector(354.0))), s0(Vector(Vector(355.0), Vector(356.0)), Vector(Vector(357.0), Vector(358.0), Vector(359.0)))), s1(s0(Vector(Vector(360.0), Vector(361.0)), Vector(Vector(362.0), Vector(363.0), Vector(364.0))), s0(Vector(Vector(365.0), Vector(366.0)), Vector(Vector(367.0), Vector(368.0), Vector(369.0)))), s1(s0(Vector(Vector(370.0), Vector(371.0)), Vector(Vector(372.0), Vector(373.0), Vector(374.0))), s0(Vector(Vector(375.0), Vector(376.0)), Vector(Vector(377.0), Vector(378.0), Vector(379.0))))), s0(Vector(Vector(380.0), Vector(381.0)), Vector(Vector(382.0), Vector(383.0), Vector(384.0)))), s3(Vector(s1(s0(Vector(Vector(385.0), Vector(386.0)), Vector(Vector(387.0), Vector(388.0), Vector(389.0))), s0(Vector(Vector(390.0), Vector(391.0)), Vector(Vector(392.0), Vector(393.0), Vector(394.0)))), s1(s0(Vector(Vector(395.0), Vector(396.0)), Vector(Vector(397.0), Vector(398.0), Vector(399.0))), s0(Vector(Vector(400.0), Vector(401.0)), Vector(Vector(402.0), Vector(403.0), Vector(404.0)))), s1(s0(Vector(Vector(405.0), Vector(406.0)), Vector(Vector(407.0), Vector(408.0), Vector(409.0))), s0(Vector(Vector(410.0), Vector(411.0)), Vector(Vector(412.0), Vector(413.0), Vector(414.0))))), s0(Vector(Vector(415.0), Vector(416.0)), Vector(Vector(417.0), Vector(418.0), Vector(419.0))))), Vector(s1(s0(Vector(Vector(420.0), Vector(421.0)), Vector(Vector(422.0), Vector(423.0), Vector(424.0))), s0(Vector(Vector(425.0), Vector(426.0)), Vector(Vector(427.0), Vector(428.0), Vector(429.0)))), s1(s0(Vector(Vector(430.0), Vector(431.0)), Vector(Vector(432.0), Vector(433.0), Vector(434.0))), s0(Vector(Vector(435.0), Vector(436.0)), Vector(Vector(437.0), Vector(438.0), Vector(439.0)))))))))
    val v4: Double = 440.0
    val start = nanoTime()
    var result: Double = 440.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}