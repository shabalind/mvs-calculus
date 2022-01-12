import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s2 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s3 (
    p0: s2,
    p1: s2
  )
  case class s4 (
    p0: Vector[s3],
    p1: s2
  )
  case class s5 (
    p0: Vector[s0],
    p1: Vector[Vector[s2]]
  )
  case class s11 (
    p0: Vector[s4],
    p1: s2
  )
  def f21(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    var v7: Vector[Vector[Double]] = v0
    var v2: Vector[Vector[Double]] = v0
    val v3: Vector[Double] = v0(2)
    v2 = v2.updated(0, v3)
    v7 = v7.updated(2, v3)
    val v5: Vector[Double] = v7(2)
    val v9: Vector[Double] = v7(0)
    var v1: Vector[Vector[Double]] = v2
    v7 = v7.updated(0, v3)
    v7 = v0
    var v11: Vector[Vector[Double]] = v1
    v1 = v1.updated(1, v5)
    var v4: Vector[Double] = v5
    val v21: Vector[Double] = v7(0)
    v7 = v2
    v7 = v7.updated(1, v9)
    var v25: Vector[Double] = v21
    v2 = v2.updated(0, v9)
    v7 = v7.updated(1, v4)
    v2 = v2.updated(1, v4)
    var v66: Vector[Vector[Double]] = v11
    v7 = v7.updated(2, v25)
    v66
  }
  def f6(v0: s5): s5 = {
    var v3: s5 = v0
    var v4: s5 = v3
    v4
  }
  @noinline
  def f0(v0: s11, v1: Vector[s4], v2: s5, v3: Double): Double = {
    val v7: s5 = f6(v2)
    var v11: s5 = v2
    var v14: s5 = v7
    val v35: Vector[Vector[s2]] = v14.p1
    v14 = v14.copy(p1 = v35)
    v14 = v14.copy(p1 = v35)
    v14 = v14.copy(p1 = v35)
    v11 = v11.copy(p1 = v35)
    val v24: Vector[s0] = v11.p0
    var v64: Vector[s0] = v24
    val v62: s0 = v64(1)
    val v55: Vector[Vector[Double]] = v62.p1
    val v95: Vector[Vector[Double]] = f21(v55)
    val v119: Vector[Vector[Double]] = f21(v95)
    val v190: Vector[Double] = v119(2)
    v64 = v64.updated(1, v62)
    val v175: Double = v190(0)
    v175
  }
  def benchmark(): Unit = {
    val v0: s11 = s11(Vector(s4(Vector(s3(s2(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))), Vector(s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0))), s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0))))), s2(s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0))), Vector(s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))), s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0))), s0(Vector(Vector(28.0)), Vector(Vector(29.0), Vector(30.0), Vector(31.0)))))), s3(s2(s0(Vector(Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0))), Vector(s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0))), s0(Vector(Vector(40.0)), Vector(Vector(41.0), Vector(42.0), Vector(43.0))), s0(Vector(Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0))))), s2(s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0), Vector(51.0))), Vector(s0(Vector(Vector(52.0)), Vector(Vector(53.0), Vector(54.0), Vector(55.0))), s0(Vector(Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0))), s0(Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0), Vector(63.0)))))), s3(s2(s0(Vector(Vector(64.0)), Vector(Vector(65.0), Vector(66.0), Vector(67.0))), Vector(s0(Vector(Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0))), s0(Vector(Vector(72.0)), Vector(Vector(73.0), Vector(74.0), Vector(75.0))), s0(Vector(Vector(76.0)), Vector(Vector(77.0), Vector(78.0), Vector(79.0))))), s2(s0(Vector(Vector(80.0)), Vector(Vector(81.0), Vector(82.0), Vector(83.0))), Vector(s0(Vector(Vector(84.0)), Vector(Vector(85.0), Vector(86.0), Vector(87.0))), s0(Vector(Vector(88.0)), Vector(Vector(89.0), Vector(90.0), Vector(91.0))), s0(Vector(Vector(92.0)), Vector(Vector(93.0), Vector(94.0), Vector(95.0))))))), s2(s0(Vector(Vector(96.0)), Vector(Vector(97.0), Vector(98.0), Vector(99.0))), Vector(s0(Vector(Vector(100.0)), Vector(Vector(101.0), Vector(102.0), Vector(103.0))), s0(Vector(Vector(104.0)), Vector(Vector(105.0), Vector(106.0), Vector(107.0))), s0(Vector(Vector(108.0)), Vector(Vector(109.0), Vector(110.0), Vector(111.0)))))), s4(Vector(s3(s2(s0(Vector(Vector(112.0)), Vector(Vector(113.0), Vector(114.0), Vector(115.0))), Vector(s0(Vector(Vector(116.0)), Vector(Vector(117.0), Vector(118.0), Vector(119.0))), s0(Vector(Vector(120.0)), Vector(Vector(121.0), Vector(122.0), Vector(123.0))), s0(Vector(Vector(124.0)), Vector(Vector(125.0), Vector(126.0), Vector(127.0))))), s2(s0(Vector(Vector(128.0)), Vector(Vector(129.0), Vector(130.0), Vector(131.0))), Vector(s0(Vector(Vector(132.0)), Vector(Vector(133.0), Vector(134.0), Vector(135.0))), s0(Vector(Vector(136.0)), Vector(Vector(137.0), Vector(138.0), Vector(139.0))), s0(Vector(Vector(140.0)), Vector(Vector(141.0), Vector(142.0), Vector(143.0)))))), s3(s2(s0(Vector(Vector(144.0)), Vector(Vector(145.0), Vector(146.0), Vector(147.0))), Vector(s0(Vector(Vector(148.0)), Vector(Vector(149.0), Vector(150.0), Vector(151.0))), s0(Vector(Vector(152.0)), Vector(Vector(153.0), Vector(154.0), Vector(155.0))), s0(Vector(Vector(156.0)), Vector(Vector(157.0), Vector(158.0), Vector(159.0))))), s2(s0(Vector(Vector(160.0)), Vector(Vector(161.0), Vector(162.0), Vector(163.0))), Vector(s0(Vector(Vector(164.0)), Vector(Vector(165.0), Vector(166.0), Vector(167.0))), s0(Vector(Vector(168.0)), Vector(Vector(169.0), Vector(170.0), Vector(171.0))), s0(Vector(Vector(172.0)), Vector(Vector(173.0), Vector(174.0), Vector(175.0)))))), s3(s2(s0(Vector(Vector(176.0)), Vector(Vector(177.0), Vector(178.0), Vector(179.0))), Vector(s0(Vector(Vector(180.0)), Vector(Vector(181.0), Vector(182.0), Vector(183.0))), s0(Vector(Vector(184.0)), Vector(Vector(185.0), Vector(186.0), Vector(187.0))), s0(Vector(Vector(188.0)), Vector(Vector(189.0), Vector(190.0), Vector(191.0))))), s2(s0(Vector(Vector(192.0)), Vector(Vector(193.0), Vector(194.0), Vector(195.0))), Vector(s0(Vector(Vector(196.0)), Vector(Vector(197.0), Vector(198.0), Vector(199.0))), s0(Vector(Vector(200.0)), Vector(Vector(201.0), Vector(202.0), Vector(203.0))), s0(Vector(Vector(204.0)), Vector(Vector(205.0), Vector(206.0), Vector(207.0))))))), s2(s0(Vector(Vector(208.0)), Vector(Vector(209.0), Vector(210.0), Vector(211.0))), Vector(s0(Vector(Vector(212.0)), Vector(Vector(213.0), Vector(214.0), Vector(215.0))), s0(Vector(Vector(216.0)), Vector(Vector(217.0), Vector(218.0), Vector(219.0))), s0(Vector(Vector(220.0)), Vector(Vector(221.0), Vector(222.0), Vector(223.0))))))), s2(s0(Vector(Vector(224.0)), Vector(Vector(225.0), Vector(226.0), Vector(227.0))), Vector(s0(Vector(Vector(228.0)), Vector(Vector(229.0), Vector(230.0), Vector(231.0))), s0(Vector(Vector(232.0)), Vector(Vector(233.0), Vector(234.0), Vector(235.0))), s0(Vector(Vector(236.0)), Vector(Vector(237.0), Vector(238.0), Vector(239.0))))))
    val v1: Vector[s4] = Vector(s4(Vector(s3(s2(s0(Vector(Vector(240.0)), Vector(Vector(241.0), Vector(242.0), Vector(243.0))), Vector(s0(Vector(Vector(244.0)), Vector(Vector(245.0), Vector(246.0), Vector(247.0))), s0(Vector(Vector(248.0)), Vector(Vector(249.0), Vector(250.0), Vector(251.0))), s0(Vector(Vector(252.0)), Vector(Vector(253.0), Vector(254.0), Vector(255.0))))), s2(s0(Vector(Vector(256.0)), Vector(Vector(257.0), Vector(258.0), Vector(259.0))), Vector(s0(Vector(Vector(260.0)), Vector(Vector(261.0), Vector(262.0), Vector(263.0))), s0(Vector(Vector(264.0)), Vector(Vector(265.0), Vector(266.0), Vector(267.0))), s0(Vector(Vector(268.0)), Vector(Vector(269.0), Vector(270.0), Vector(271.0)))))), s3(s2(s0(Vector(Vector(272.0)), Vector(Vector(273.0), Vector(274.0), Vector(275.0))), Vector(s0(Vector(Vector(276.0)), Vector(Vector(277.0), Vector(278.0), Vector(279.0))), s0(Vector(Vector(280.0)), Vector(Vector(281.0), Vector(282.0), Vector(283.0))), s0(Vector(Vector(284.0)), Vector(Vector(285.0), Vector(286.0), Vector(287.0))))), s2(s0(Vector(Vector(288.0)), Vector(Vector(289.0), Vector(290.0), Vector(291.0))), Vector(s0(Vector(Vector(292.0)), Vector(Vector(293.0), Vector(294.0), Vector(295.0))), s0(Vector(Vector(296.0)), Vector(Vector(297.0), Vector(298.0), Vector(299.0))), s0(Vector(Vector(300.0)), Vector(Vector(301.0), Vector(302.0), Vector(303.0)))))), s3(s2(s0(Vector(Vector(304.0)), Vector(Vector(305.0), Vector(306.0), Vector(307.0))), Vector(s0(Vector(Vector(308.0)), Vector(Vector(309.0), Vector(310.0), Vector(311.0))), s0(Vector(Vector(312.0)), Vector(Vector(313.0), Vector(314.0), Vector(315.0))), s0(Vector(Vector(316.0)), Vector(Vector(317.0), Vector(318.0), Vector(319.0))))), s2(s0(Vector(Vector(320.0)), Vector(Vector(321.0), Vector(322.0), Vector(323.0))), Vector(s0(Vector(Vector(324.0)), Vector(Vector(325.0), Vector(326.0), Vector(327.0))), s0(Vector(Vector(328.0)), Vector(Vector(329.0), Vector(330.0), Vector(331.0))), s0(Vector(Vector(332.0)), Vector(Vector(333.0), Vector(334.0), Vector(335.0))))))), s2(s0(Vector(Vector(336.0)), Vector(Vector(337.0), Vector(338.0), Vector(339.0))), Vector(s0(Vector(Vector(340.0)), Vector(Vector(341.0), Vector(342.0), Vector(343.0))), s0(Vector(Vector(344.0)), Vector(Vector(345.0), Vector(346.0), Vector(347.0))), s0(Vector(Vector(348.0)), Vector(Vector(349.0), Vector(350.0), Vector(351.0)))))))
    val v2: s5 = s5(Vector(s0(Vector(Vector(352.0)), Vector(Vector(353.0), Vector(354.0), Vector(355.0))), s0(Vector(Vector(356.0)), Vector(Vector(357.0), Vector(358.0), Vector(359.0)))), Vector(Vector(s2(s0(Vector(Vector(360.0)), Vector(Vector(361.0), Vector(362.0), Vector(363.0))), Vector(s0(Vector(Vector(364.0)), Vector(Vector(365.0), Vector(366.0), Vector(367.0))), s0(Vector(Vector(368.0)), Vector(Vector(369.0), Vector(370.0), Vector(371.0))), s0(Vector(Vector(372.0)), Vector(Vector(373.0), Vector(374.0), Vector(375.0)))))), Vector(s2(s0(Vector(Vector(376.0)), Vector(Vector(377.0), Vector(378.0), Vector(379.0))), Vector(s0(Vector(Vector(380.0)), Vector(Vector(381.0), Vector(382.0), Vector(383.0))), s0(Vector(Vector(384.0)), Vector(Vector(385.0), Vector(386.0), Vector(387.0))), s0(Vector(Vector(388.0)), Vector(Vector(389.0), Vector(390.0), Vector(391.0))))))))
    val v3: Double = 392.0
    val start = nanoTime()
    var result: Double = 392.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}