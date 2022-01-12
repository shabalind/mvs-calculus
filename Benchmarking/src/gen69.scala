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
    p2: Vector[s0],
    p3: s0
  )
  case class s3 (
    p0: Vector[s0],
    p1: Vector[s2]
  )
  case class s4 (
    p0: Vector[s2],
    p1: s3
  )
  def f32(v0: s0, v1: s4): s4 = {
    var v4: s4 = v1
    var v7: s4 = v4
    val v2: s3 = v7.p1
    val v6: Vector[s2] = v2.p1
    v7 = v7.copy(p0 = v6)
    val v20: s3 = v7.p1
    v7 = v7.copy(p1 = v20)
    v7 = v7.copy(p1 = v2)
    val v24: Vector[s2] = v1.p0
    v4 = v4.copy(p0 = v24)
    v4 = v4.copy(p0 = v24)
    v7
  }
  def f25(v0: s2): s2 = {
    v0
  }
  def f5(v0: Double): Double = {
    var v3: Double = v0
    var v1: Double = v3
    var v6: Double = v1
    var v2: Double = v1
    val v4: Vector[Double] = Vector(v6, v0, v1, v2, v1, v0)
    val v7: Double = v4(3)
    var v12: Vector[Double] = v4
    v12 = v12.updated(3, v7)
    val v11: Double = v12(4)
    v11
  }
  def f3(v0: s0): s0 = {
    var v3: s0 = v0
    var v1: s0 = v3
    val v2: Vector[Vector[Double]] = v1.p0
    v1 = v1.copy(p0 = v2)
    val v6: Vector[Vector[Double]] = v3.p0
    var v4: s0 = v0
    val v7: Vector[Vector[Double]] = v4.p1
    v3 = v3.copy(p1 = v2)
    v3 = v3.copy(p0 = v7)
    v3 = v3.copy(p0 = v6)
    v3
  }
  @noinline
  def f0(v0: s4, v1: s4, v2: Double): Double = {
    val v3: s3 = v1.p1
    var v5: s4 = v0
    var v8: Double = v2
    val v4: Vector[s2] = v5.p0
    val v10: s2 = v4(0)
    val v6: Vector[s2] = v3.p1
    val v14: s2 = v6(1)
    val v11: Vector[s2] = v3.p1
    val v12: s4 = s4(v6, v3)
    var v13: Vector[s2] = v11
    v13 = v13.updated(0, v14)
    val v16: s2 = f25(v10)
    val v18: s3 = v1.p1
    val v17: s2 = v4(1)
    v13 = v13.updated(0, v10)
    v5 = v5.copy(p0 = v13)
    val v30: s0 = v17.p3
    v13 = v13.updated(0, v17)
    val v29: Double = f5(v8)
    val v48: Vector[Vector[Double]] = v30.p1
    var v21: s3 = v18
    val v31: Vector[Double] = v48(0)
    var v33: s2 = v16
    val v115: s4 = f32(v30, v12)
    val v26: s0 = f3(v30)
    v13 = v13.updated(0, v16)
    val v27: Vector[s2] = v115.p0
    var v37: Double = v29
    val v72: Double = v31(0)
    v33 = v33.copy(p3 = v26)
    val v39: Vector[s0] = v21.p0
    val v40: s0 = v39(1)
    v13 = v13.updated(0, v33)
    v33 = v33.copy(p3 = v40)
    val v116: Double = v2 + v72
    v5 = v5.copy(p0 = v27)
    val v61: Double = v116 + v37
    v61
  }
  def benchmark(): Unit = {
    val v0: s4 = s4(Vector(s2(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0)))), s1(Vector(s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))), Vector(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0))), s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))), s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0))))), Vector(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0))), s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0), Vector(40.0), Vector(41.0)))), s0(Vector(Vector(42.0), Vector(43.0), Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0)))), s2(Vector(s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0), Vector(52.0), Vector(53.0)))), s1(Vector(s0(Vector(Vector(54.0), Vector(55.0), Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0)))), Vector(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0), Vector(64.0), Vector(65.0))), s0(Vector(Vector(66.0), Vector(67.0), Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0))), s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)), Vector(Vector(75.0), Vector(76.0), Vector(77.0))))), Vector(s0(Vector(Vector(78.0), Vector(79.0), Vector(80.0)), Vector(Vector(81.0), Vector(82.0), Vector(83.0))), s0(Vector(Vector(84.0), Vector(85.0), Vector(86.0)), Vector(Vector(87.0), Vector(88.0), Vector(89.0)))), s0(Vector(Vector(90.0), Vector(91.0), Vector(92.0)), Vector(Vector(93.0), Vector(94.0), Vector(95.0))))), s3(Vector(s0(Vector(Vector(96.0), Vector(97.0), Vector(98.0)), Vector(Vector(99.0), Vector(100.0), Vector(101.0))), s0(Vector(Vector(102.0), Vector(103.0), Vector(104.0)), Vector(Vector(105.0), Vector(106.0), Vector(107.0)))), Vector(s2(Vector(s0(Vector(Vector(108.0), Vector(109.0), Vector(110.0)), Vector(Vector(111.0), Vector(112.0), Vector(113.0)))), s1(Vector(s0(Vector(Vector(114.0), Vector(115.0), Vector(116.0)), Vector(Vector(117.0), Vector(118.0), Vector(119.0)))), Vector(s0(Vector(Vector(120.0), Vector(121.0), Vector(122.0)), Vector(Vector(123.0), Vector(124.0), Vector(125.0))), s0(Vector(Vector(126.0), Vector(127.0), Vector(128.0)), Vector(Vector(129.0), Vector(130.0), Vector(131.0))), s0(Vector(Vector(132.0), Vector(133.0), Vector(134.0)), Vector(Vector(135.0), Vector(136.0), Vector(137.0))))), Vector(s0(Vector(Vector(138.0), Vector(139.0), Vector(140.0)), Vector(Vector(141.0), Vector(142.0), Vector(143.0))), s0(Vector(Vector(144.0), Vector(145.0), Vector(146.0)), Vector(Vector(147.0), Vector(148.0), Vector(149.0)))), s0(Vector(Vector(150.0), Vector(151.0), Vector(152.0)), Vector(Vector(153.0), Vector(154.0), Vector(155.0)))), s2(Vector(s0(Vector(Vector(156.0), Vector(157.0), Vector(158.0)), Vector(Vector(159.0), Vector(160.0), Vector(161.0)))), s1(Vector(s0(Vector(Vector(162.0), Vector(163.0), Vector(164.0)), Vector(Vector(165.0), Vector(166.0), Vector(167.0)))), Vector(s0(Vector(Vector(168.0), Vector(169.0), Vector(170.0)), Vector(Vector(171.0), Vector(172.0), Vector(173.0))), s0(Vector(Vector(174.0), Vector(175.0), Vector(176.0)), Vector(Vector(177.0), Vector(178.0), Vector(179.0))), s0(Vector(Vector(180.0), Vector(181.0), Vector(182.0)), Vector(Vector(183.0), Vector(184.0), Vector(185.0))))), Vector(s0(Vector(Vector(186.0), Vector(187.0), Vector(188.0)), Vector(Vector(189.0), Vector(190.0), Vector(191.0))), s0(Vector(Vector(192.0), Vector(193.0), Vector(194.0)), Vector(Vector(195.0), Vector(196.0), Vector(197.0)))), s0(Vector(Vector(198.0), Vector(199.0), Vector(200.0)), Vector(Vector(201.0), Vector(202.0), Vector(203.0)))))))
    val v1: s4 = s4(Vector(s2(Vector(s0(Vector(Vector(204.0), Vector(205.0), Vector(206.0)), Vector(Vector(207.0), Vector(208.0), Vector(209.0)))), s1(Vector(s0(Vector(Vector(210.0), Vector(211.0), Vector(212.0)), Vector(Vector(213.0), Vector(214.0), Vector(215.0)))), Vector(s0(Vector(Vector(216.0), Vector(217.0), Vector(218.0)), Vector(Vector(219.0), Vector(220.0), Vector(221.0))), s0(Vector(Vector(222.0), Vector(223.0), Vector(224.0)), Vector(Vector(225.0), Vector(226.0), Vector(227.0))), s0(Vector(Vector(228.0), Vector(229.0), Vector(230.0)), Vector(Vector(231.0), Vector(232.0), Vector(233.0))))), Vector(s0(Vector(Vector(234.0), Vector(235.0), Vector(236.0)), Vector(Vector(237.0), Vector(238.0), Vector(239.0))), s0(Vector(Vector(240.0), Vector(241.0), Vector(242.0)), Vector(Vector(243.0), Vector(244.0), Vector(245.0)))), s0(Vector(Vector(246.0), Vector(247.0), Vector(248.0)), Vector(Vector(249.0), Vector(250.0), Vector(251.0)))), s2(Vector(s0(Vector(Vector(252.0), Vector(253.0), Vector(254.0)), Vector(Vector(255.0), Vector(256.0), Vector(257.0)))), s1(Vector(s0(Vector(Vector(258.0), Vector(259.0), Vector(260.0)), Vector(Vector(261.0), Vector(262.0), Vector(263.0)))), Vector(s0(Vector(Vector(264.0), Vector(265.0), Vector(266.0)), Vector(Vector(267.0), Vector(268.0), Vector(269.0))), s0(Vector(Vector(270.0), Vector(271.0), Vector(272.0)), Vector(Vector(273.0), Vector(274.0), Vector(275.0))), s0(Vector(Vector(276.0), Vector(277.0), Vector(278.0)), Vector(Vector(279.0), Vector(280.0), Vector(281.0))))), Vector(s0(Vector(Vector(282.0), Vector(283.0), Vector(284.0)), Vector(Vector(285.0), Vector(286.0), Vector(287.0))), s0(Vector(Vector(288.0), Vector(289.0), Vector(290.0)), Vector(Vector(291.0), Vector(292.0), Vector(293.0)))), s0(Vector(Vector(294.0), Vector(295.0), Vector(296.0)), Vector(Vector(297.0), Vector(298.0), Vector(299.0))))), s3(Vector(s0(Vector(Vector(300.0), Vector(301.0), Vector(302.0)), Vector(Vector(303.0), Vector(304.0), Vector(305.0))), s0(Vector(Vector(306.0), Vector(307.0), Vector(308.0)), Vector(Vector(309.0), Vector(310.0), Vector(311.0)))), Vector(s2(Vector(s0(Vector(Vector(312.0), Vector(313.0), Vector(314.0)), Vector(Vector(315.0), Vector(316.0), Vector(317.0)))), s1(Vector(s0(Vector(Vector(318.0), Vector(319.0), Vector(320.0)), Vector(Vector(321.0), Vector(322.0), Vector(323.0)))), Vector(s0(Vector(Vector(324.0), Vector(325.0), Vector(326.0)), Vector(Vector(327.0), Vector(328.0), Vector(329.0))), s0(Vector(Vector(330.0), Vector(331.0), Vector(332.0)), Vector(Vector(333.0), Vector(334.0), Vector(335.0))), s0(Vector(Vector(336.0), Vector(337.0), Vector(338.0)), Vector(Vector(339.0), Vector(340.0), Vector(341.0))))), Vector(s0(Vector(Vector(342.0), Vector(343.0), Vector(344.0)), Vector(Vector(345.0), Vector(346.0), Vector(347.0))), s0(Vector(Vector(348.0), Vector(349.0), Vector(350.0)), Vector(Vector(351.0), Vector(352.0), Vector(353.0)))), s0(Vector(Vector(354.0), Vector(355.0), Vector(356.0)), Vector(Vector(357.0), Vector(358.0), Vector(359.0)))), s2(Vector(s0(Vector(Vector(360.0), Vector(361.0), Vector(362.0)), Vector(Vector(363.0), Vector(364.0), Vector(365.0)))), s1(Vector(s0(Vector(Vector(366.0), Vector(367.0), Vector(368.0)), Vector(Vector(369.0), Vector(370.0), Vector(371.0)))), Vector(s0(Vector(Vector(372.0), Vector(373.0), Vector(374.0)), Vector(Vector(375.0), Vector(376.0), Vector(377.0))), s0(Vector(Vector(378.0), Vector(379.0), Vector(380.0)), Vector(Vector(381.0), Vector(382.0), Vector(383.0))), s0(Vector(Vector(384.0), Vector(385.0), Vector(386.0)), Vector(Vector(387.0), Vector(388.0), Vector(389.0))))), Vector(s0(Vector(Vector(390.0), Vector(391.0), Vector(392.0)), Vector(Vector(393.0), Vector(394.0), Vector(395.0))), s0(Vector(Vector(396.0), Vector(397.0), Vector(398.0)), Vector(Vector(399.0), Vector(400.0), Vector(401.0)))), s0(Vector(Vector(402.0), Vector(403.0), Vector(404.0)), Vector(Vector(405.0), Vector(406.0), Vector(407.0)))))))
    val v2: Double = 408.0
    val start = nanoTime()
    var result: Double = 408.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}