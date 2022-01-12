import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0
  )
  case class s2 (
    p0: s1,
    p1: s0
  )
  case class s3 (
    p0: Vector[s2],
    p1: Vector[s2]
  )
  case class s4 (
    p0: Vector[s2],
    p1: Vector[s1]
  )
  case class s5 (
    p0: Vector[s1],
    p1: s4
  )
  case class s6 (
    p0: Vector[s2],
    p1: Vector[s0]
  )
  case class s7 (
    p0: Vector[Vector[s3]],
    p1: s5
  )
  @noinline
  def f0(v0: Double, v1: Vector[Vector[s0]], v2: s3, v3: Vector[s7], v4: Vector[Vector[s1]], v5: Vector[s7], v6: s6): Double = {
    val v21: Vector[s0] = v6.p1
    val v47: Double = v0 - v0
    val v25: s0 = v21(0)
    var v61: s0 = v25
    v61 = v25
    var v53: Double = v47
    val v60: Vector[Vector[Double]] = v61.p1
    var v63: Vector[Vector[Double]] = v60
    val v85: Double = v47 * v53
    val v65: Vector[Double] = v63(0)
    val v132: Double = v65(0)
    val v118: Double = v85 + v132
    v118
  }
  def benchmark(): Unit = {
    val v0: Double = 0.0
    val v1: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(1.0), Vector(2.0), Vector(3.0)), Vector(Vector(4.0), Vector(5.0), Vector(6.0)))))
    val v2: s3 = s3(Vector(s2(s1(s0(Vector(Vector(7.0), Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0), Vector(12.0)))), s0(Vector(Vector(13.0), Vector(14.0), Vector(15.0)), Vector(Vector(16.0), Vector(17.0), Vector(18.0))))), Vector(s2(s1(s0(Vector(Vector(19.0), Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0), Vector(24.0)))), s0(Vector(Vector(25.0), Vector(26.0), Vector(27.0)), Vector(Vector(28.0), Vector(29.0), Vector(30.0)))), s2(s1(s0(Vector(Vector(31.0), Vector(32.0), Vector(33.0)), Vector(Vector(34.0), Vector(35.0), Vector(36.0)))), s0(Vector(Vector(37.0), Vector(38.0), Vector(39.0)), Vector(Vector(40.0), Vector(41.0), Vector(42.0))))))
    val v3: Vector[s7] = Vector(s7(Vector(Vector(s3(Vector(s2(s1(s0(Vector(Vector(43.0), Vector(44.0), Vector(45.0)), Vector(Vector(46.0), Vector(47.0), Vector(48.0)))), s0(Vector(Vector(49.0), Vector(50.0), Vector(51.0)), Vector(Vector(52.0), Vector(53.0), Vector(54.0))))), Vector(s2(s1(s0(Vector(Vector(55.0), Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0), Vector(60.0)))), s0(Vector(Vector(61.0), Vector(62.0), Vector(63.0)), Vector(Vector(64.0), Vector(65.0), Vector(66.0)))), s2(s1(s0(Vector(Vector(67.0), Vector(68.0), Vector(69.0)), Vector(Vector(70.0), Vector(71.0), Vector(72.0)))), s0(Vector(Vector(73.0), Vector(74.0), Vector(75.0)), Vector(Vector(76.0), Vector(77.0), Vector(78.0)))))))), s5(Vector(s1(s0(Vector(Vector(79.0), Vector(80.0), Vector(81.0)), Vector(Vector(82.0), Vector(83.0), Vector(84.0)))), s1(s0(Vector(Vector(85.0), Vector(86.0), Vector(87.0)), Vector(Vector(88.0), Vector(89.0), Vector(90.0))))), s4(Vector(s2(s1(s0(Vector(Vector(91.0), Vector(92.0), Vector(93.0)), Vector(Vector(94.0), Vector(95.0), Vector(96.0)))), s0(Vector(Vector(97.0), Vector(98.0), Vector(99.0)), Vector(Vector(100.0), Vector(101.0), Vector(102.0))))), Vector(s1(s0(Vector(Vector(103.0), Vector(104.0), Vector(105.0)), Vector(Vector(106.0), Vector(107.0), Vector(108.0)))), s1(s0(Vector(Vector(109.0), Vector(110.0), Vector(111.0)), Vector(Vector(112.0), Vector(113.0), Vector(114.0)))))))))
    val v4: Vector[Vector[s1]] = Vector(Vector(s1(s0(Vector(Vector(115.0), Vector(116.0), Vector(117.0)), Vector(Vector(118.0), Vector(119.0), Vector(120.0))))), Vector(s1(s0(Vector(Vector(121.0), Vector(122.0), Vector(123.0)), Vector(Vector(124.0), Vector(125.0), Vector(126.0))))), Vector(s1(s0(Vector(Vector(127.0), Vector(128.0), Vector(129.0)), Vector(Vector(130.0), Vector(131.0), Vector(132.0))))))
    val v5: Vector[s7] = Vector(s7(Vector(Vector(s3(Vector(s2(s1(s0(Vector(Vector(133.0), Vector(134.0), Vector(135.0)), Vector(Vector(136.0), Vector(137.0), Vector(138.0)))), s0(Vector(Vector(139.0), Vector(140.0), Vector(141.0)), Vector(Vector(142.0), Vector(143.0), Vector(144.0))))), Vector(s2(s1(s0(Vector(Vector(145.0), Vector(146.0), Vector(147.0)), Vector(Vector(148.0), Vector(149.0), Vector(150.0)))), s0(Vector(Vector(151.0), Vector(152.0), Vector(153.0)), Vector(Vector(154.0), Vector(155.0), Vector(156.0)))), s2(s1(s0(Vector(Vector(157.0), Vector(158.0), Vector(159.0)), Vector(Vector(160.0), Vector(161.0), Vector(162.0)))), s0(Vector(Vector(163.0), Vector(164.0), Vector(165.0)), Vector(Vector(166.0), Vector(167.0), Vector(168.0)))))))), s5(Vector(s1(s0(Vector(Vector(169.0), Vector(170.0), Vector(171.0)), Vector(Vector(172.0), Vector(173.0), Vector(174.0)))), s1(s0(Vector(Vector(175.0), Vector(176.0), Vector(177.0)), Vector(Vector(178.0), Vector(179.0), Vector(180.0))))), s4(Vector(s2(s1(s0(Vector(Vector(181.0), Vector(182.0), Vector(183.0)), Vector(Vector(184.0), Vector(185.0), Vector(186.0)))), s0(Vector(Vector(187.0), Vector(188.0), Vector(189.0)), Vector(Vector(190.0), Vector(191.0), Vector(192.0))))), Vector(s1(s0(Vector(Vector(193.0), Vector(194.0), Vector(195.0)), Vector(Vector(196.0), Vector(197.0), Vector(198.0)))), s1(s0(Vector(Vector(199.0), Vector(200.0), Vector(201.0)), Vector(Vector(202.0), Vector(203.0), Vector(204.0)))))))), s7(Vector(Vector(s3(Vector(s2(s1(s0(Vector(Vector(205.0), Vector(206.0), Vector(207.0)), Vector(Vector(208.0), Vector(209.0), Vector(210.0)))), s0(Vector(Vector(211.0), Vector(212.0), Vector(213.0)), Vector(Vector(214.0), Vector(215.0), Vector(216.0))))), Vector(s2(s1(s0(Vector(Vector(217.0), Vector(218.0), Vector(219.0)), Vector(Vector(220.0), Vector(221.0), Vector(222.0)))), s0(Vector(Vector(223.0), Vector(224.0), Vector(225.0)), Vector(Vector(226.0), Vector(227.0), Vector(228.0)))), s2(s1(s0(Vector(Vector(229.0), Vector(230.0), Vector(231.0)), Vector(Vector(232.0), Vector(233.0), Vector(234.0)))), s0(Vector(Vector(235.0), Vector(236.0), Vector(237.0)), Vector(Vector(238.0), Vector(239.0), Vector(240.0)))))))), s5(Vector(s1(s0(Vector(Vector(241.0), Vector(242.0), Vector(243.0)), Vector(Vector(244.0), Vector(245.0), Vector(246.0)))), s1(s0(Vector(Vector(247.0), Vector(248.0), Vector(249.0)), Vector(Vector(250.0), Vector(251.0), Vector(252.0))))), s4(Vector(s2(s1(s0(Vector(Vector(253.0), Vector(254.0), Vector(255.0)), Vector(Vector(256.0), Vector(257.0), Vector(258.0)))), s0(Vector(Vector(259.0), Vector(260.0), Vector(261.0)), Vector(Vector(262.0), Vector(263.0), Vector(264.0))))), Vector(s1(s0(Vector(Vector(265.0), Vector(266.0), Vector(267.0)), Vector(Vector(268.0), Vector(269.0), Vector(270.0)))), s1(s0(Vector(Vector(271.0), Vector(272.0), Vector(273.0)), Vector(Vector(274.0), Vector(275.0), Vector(276.0)))))))), s7(Vector(Vector(s3(Vector(s2(s1(s0(Vector(Vector(277.0), Vector(278.0), Vector(279.0)), Vector(Vector(280.0), Vector(281.0), Vector(282.0)))), s0(Vector(Vector(283.0), Vector(284.0), Vector(285.0)), Vector(Vector(286.0), Vector(287.0), Vector(288.0))))), Vector(s2(s1(s0(Vector(Vector(289.0), Vector(290.0), Vector(291.0)), Vector(Vector(292.0), Vector(293.0), Vector(294.0)))), s0(Vector(Vector(295.0), Vector(296.0), Vector(297.0)), Vector(Vector(298.0), Vector(299.0), Vector(300.0)))), s2(s1(s0(Vector(Vector(301.0), Vector(302.0), Vector(303.0)), Vector(Vector(304.0), Vector(305.0), Vector(306.0)))), s0(Vector(Vector(307.0), Vector(308.0), Vector(309.0)), Vector(Vector(310.0), Vector(311.0), Vector(312.0)))))))), s5(Vector(s1(s0(Vector(Vector(313.0), Vector(314.0), Vector(315.0)), Vector(Vector(316.0), Vector(317.0), Vector(318.0)))), s1(s0(Vector(Vector(319.0), Vector(320.0), Vector(321.0)), Vector(Vector(322.0), Vector(323.0), Vector(324.0))))), s4(Vector(s2(s1(s0(Vector(Vector(325.0), Vector(326.0), Vector(327.0)), Vector(Vector(328.0), Vector(329.0), Vector(330.0)))), s0(Vector(Vector(331.0), Vector(332.0), Vector(333.0)), Vector(Vector(334.0), Vector(335.0), Vector(336.0))))), Vector(s1(s0(Vector(Vector(337.0), Vector(338.0), Vector(339.0)), Vector(Vector(340.0), Vector(341.0), Vector(342.0)))), s1(s0(Vector(Vector(343.0), Vector(344.0), Vector(345.0)), Vector(Vector(346.0), Vector(347.0), Vector(348.0)))))))))
    val v6: s6 = s6(Vector(s2(s1(s0(Vector(Vector(349.0), Vector(350.0), Vector(351.0)), Vector(Vector(352.0), Vector(353.0), Vector(354.0)))), s0(Vector(Vector(355.0), Vector(356.0), Vector(357.0)), Vector(Vector(358.0), Vector(359.0), Vector(360.0)))), s2(s1(s0(Vector(Vector(361.0), Vector(362.0), Vector(363.0)), Vector(Vector(364.0), Vector(365.0), Vector(366.0)))), s0(Vector(Vector(367.0), Vector(368.0), Vector(369.0)), Vector(Vector(370.0), Vector(371.0), Vector(372.0))))), Vector(s0(Vector(Vector(373.0), Vector(374.0), Vector(375.0)), Vector(Vector(376.0), Vector(377.0), Vector(378.0))), s0(Vector(Vector(379.0), Vector(380.0), Vector(381.0)), Vector(Vector(382.0), Vector(383.0), Vector(384.0))), s0(Vector(Vector(385.0), Vector(386.0), Vector(387.0)), Vector(Vector(388.0), Vector(389.0), Vector(390.0)))))
    val start = nanoTime()
    var result: Double = StructValue(Name(str='s6', ty=None), [[StructValue(Name(str='s2', ty=None), [StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[349.0], [350.0], [351.0]], [[352.0], [353.0], [354.0]]])]), StructValue(Name(str='s0', ty=None), [[[355.0], [356.0], [357.0]], [[358.0], [359.0], [360.0]]])]), StructValue(Name(str='s2', ty=None), [StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[361.0], [362.0], [363.0]], [[364.0], [365.0], [366.0]]])]), StructValue(Name(str='s0', ty=None), [[[367.0], [368.0], [369.0]], [[370.0], [371.0], [372.0]]])])], [StructValue(Name(str='s0', ty=None), [[[373.0], [374.0], [375.0]], [[376.0], [377.0], [378.0]]]), StructValue(Name(str='s0', ty=None), [[[379.0], [380.0], [381.0]], [[382.0], [383.0], [384.0]]]), StructValue(Name(str='s0', ty=None), [[[385.0], [386.0], [387.0]], [[388.0], [389.0], [390.0]]])]])
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4, v5, v6)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}