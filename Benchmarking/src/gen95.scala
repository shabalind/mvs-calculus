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
    p1: Vector[Vector[s1]]
  )
  case class s3 (
    p0: s0,
    p1: Vector[s1]
  )
  case class s4 (
    p0: Vector[Vector[s1]],
    p1: s2
  )
  case class s5 (
    p0: Vector[s2],
    p1: s3
  )
  case class s8 (
    p0: s2,
    p1: Vector[s3]
  )
  case class s10 (
    p0: Vector[s8],
    p1: s4
  )
  @noinline
  def f0(v0: Vector[Vector[s5]], v1: Double, v2: Vector[s2], v3: Vector[s10]): Double = {
    val v4: Vector[s5] = v0(0)
    val v8: s5 = v4(0)
    val v10: Vector[s2] = v8.p0
    val v14: s2 = v10(0)
    val v17: Vector[s1] = v14.p0
    val v29: s1 = v17(1)
    val v45: s0 = v29.p0
    val v80: Vector[Vector[Double]] = v45.p0
    val v127: Vector[Double] = v80(0)
    val v147: Double = v127(0)
    v147
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s5]] = Vector(Vector(s5(Vector(s2(Vector(s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0))), s0(Vector(Vector(2.0)), Vector(Vector(3.0)))), s1(s0(Vector(Vector(4.0)), Vector(Vector(5.0))), s0(Vector(Vector(6.0)), Vector(Vector(7.0))))), Vector(Vector(s1(s0(Vector(Vector(8.0)), Vector(Vector(9.0))), s0(Vector(Vector(10.0)), Vector(Vector(11.0))))), Vector(s1(s0(Vector(Vector(12.0)), Vector(Vector(13.0))), s0(Vector(Vector(14.0)), Vector(Vector(15.0))))), Vector(s1(s0(Vector(Vector(16.0)), Vector(Vector(17.0))), s0(Vector(Vector(18.0)), Vector(Vector(19.0)))))))), s3(s0(Vector(Vector(20.0)), Vector(Vector(21.0))), Vector(s1(s0(Vector(Vector(22.0)), Vector(Vector(23.0))), s0(Vector(Vector(24.0)), Vector(Vector(25.0)))), s1(s0(Vector(Vector(26.0)), Vector(Vector(27.0))), s0(Vector(Vector(28.0)), Vector(Vector(29.0)))), s1(s0(Vector(Vector(30.0)), Vector(Vector(31.0))), s0(Vector(Vector(32.0)), Vector(Vector(33.0)))))))), Vector(s5(Vector(s2(Vector(s1(s0(Vector(Vector(34.0)), Vector(Vector(35.0))), s0(Vector(Vector(36.0)), Vector(Vector(37.0)))), s1(s0(Vector(Vector(38.0)), Vector(Vector(39.0))), s0(Vector(Vector(40.0)), Vector(Vector(41.0))))), Vector(Vector(s1(s0(Vector(Vector(42.0)), Vector(Vector(43.0))), s0(Vector(Vector(44.0)), Vector(Vector(45.0))))), Vector(s1(s0(Vector(Vector(46.0)), Vector(Vector(47.0))), s0(Vector(Vector(48.0)), Vector(Vector(49.0))))), Vector(s1(s0(Vector(Vector(50.0)), Vector(Vector(51.0))), s0(Vector(Vector(52.0)), Vector(Vector(53.0)))))))), s3(s0(Vector(Vector(54.0)), Vector(Vector(55.0))), Vector(s1(s0(Vector(Vector(56.0)), Vector(Vector(57.0))), s0(Vector(Vector(58.0)), Vector(Vector(59.0)))), s1(s0(Vector(Vector(60.0)), Vector(Vector(61.0))), s0(Vector(Vector(62.0)), Vector(Vector(63.0)))), s1(s0(Vector(Vector(64.0)), Vector(Vector(65.0))), s0(Vector(Vector(66.0)), Vector(Vector(67.0)))))))), Vector(s5(Vector(s2(Vector(s1(s0(Vector(Vector(68.0)), Vector(Vector(69.0))), s0(Vector(Vector(70.0)), Vector(Vector(71.0)))), s1(s0(Vector(Vector(72.0)), Vector(Vector(73.0))), s0(Vector(Vector(74.0)), Vector(Vector(75.0))))), Vector(Vector(s1(s0(Vector(Vector(76.0)), Vector(Vector(77.0))), s0(Vector(Vector(78.0)), Vector(Vector(79.0))))), Vector(s1(s0(Vector(Vector(80.0)), Vector(Vector(81.0))), s0(Vector(Vector(82.0)), Vector(Vector(83.0))))), Vector(s1(s0(Vector(Vector(84.0)), Vector(Vector(85.0))), s0(Vector(Vector(86.0)), Vector(Vector(87.0)))))))), s3(s0(Vector(Vector(88.0)), Vector(Vector(89.0))), Vector(s1(s0(Vector(Vector(90.0)), Vector(Vector(91.0))), s0(Vector(Vector(92.0)), Vector(Vector(93.0)))), s1(s0(Vector(Vector(94.0)), Vector(Vector(95.0))), s0(Vector(Vector(96.0)), Vector(Vector(97.0)))), s1(s0(Vector(Vector(98.0)), Vector(Vector(99.0))), s0(Vector(Vector(100.0)), Vector(Vector(101.0)))))))))
    val v1: Double = 102.0
    val v2: Vector[s2] = Vector(s2(Vector(s1(s0(Vector(Vector(103.0)), Vector(Vector(104.0))), s0(Vector(Vector(105.0)), Vector(Vector(106.0)))), s1(s0(Vector(Vector(107.0)), Vector(Vector(108.0))), s0(Vector(Vector(109.0)), Vector(Vector(110.0))))), Vector(Vector(s1(s0(Vector(Vector(111.0)), Vector(Vector(112.0))), s0(Vector(Vector(113.0)), Vector(Vector(114.0))))), Vector(s1(s0(Vector(Vector(115.0)), Vector(Vector(116.0))), s0(Vector(Vector(117.0)), Vector(Vector(118.0))))), Vector(s1(s0(Vector(Vector(119.0)), Vector(Vector(120.0))), s0(Vector(Vector(121.0)), Vector(Vector(122.0))))))), s2(Vector(s1(s0(Vector(Vector(123.0)), Vector(Vector(124.0))), s0(Vector(Vector(125.0)), Vector(Vector(126.0)))), s1(s0(Vector(Vector(127.0)), Vector(Vector(128.0))), s0(Vector(Vector(129.0)), Vector(Vector(130.0))))), Vector(Vector(s1(s0(Vector(Vector(131.0)), Vector(Vector(132.0))), s0(Vector(Vector(133.0)), Vector(Vector(134.0))))), Vector(s1(s0(Vector(Vector(135.0)), Vector(Vector(136.0))), s0(Vector(Vector(137.0)), Vector(Vector(138.0))))), Vector(s1(s0(Vector(Vector(139.0)), Vector(Vector(140.0))), s0(Vector(Vector(141.0)), Vector(Vector(142.0))))))))
    val v3: Vector[s10] = Vector(s10(Vector(s8(s2(Vector(s1(s0(Vector(Vector(143.0)), Vector(Vector(144.0))), s0(Vector(Vector(145.0)), Vector(Vector(146.0)))), s1(s0(Vector(Vector(147.0)), Vector(Vector(148.0))), s0(Vector(Vector(149.0)), Vector(Vector(150.0))))), Vector(Vector(s1(s0(Vector(Vector(151.0)), Vector(Vector(152.0))), s0(Vector(Vector(153.0)), Vector(Vector(154.0))))), Vector(s1(s0(Vector(Vector(155.0)), Vector(Vector(156.0))), s0(Vector(Vector(157.0)), Vector(Vector(158.0))))), Vector(s1(s0(Vector(Vector(159.0)), Vector(Vector(160.0))), s0(Vector(Vector(161.0)), Vector(Vector(162.0))))))), Vector(s3(s0(Vector(Vector(163.0)), Vector(Vector(164.0))), Vector(s1(s0(Vector(Vector(165.0)), Vector(Vector(166.0))), s0(Vector(Vector(167.0)), Vector(Vector(168.0)))), s1(s0(Vector(Vector(169.0)), Vector(Vector(170.0))), s0(Vector(Vector(171.0)), Vector(Vector(172.0)))), s1(s0(Vector(Vector(173.0)), Vector(Vector(174.0))), s0(Vector(Vector(175.0)), Vector(Vector(176.0)))))), s3(s0(Vector(Vector(177.0)), Vector(Vector(178.0))), Vector(s1(s0(Vector(Vector(179.0)), Vector(Vector(180.0))), s0(Vector(Vector(181.0)), Vector(Vector(182.0)))), s1(s0(Vector(Vector(183.0)), Vector(Vector(184.0))), s0(Vector(Vector(185.0)), Vector(Vector(186.0)))), s1(s0(Vector(Vector(187.0)), Vector(Vector(188.0))), s0(Vector(Vector(189.0)), Vector(Vector(190.0)))))))), s8(s2(Vector(s1(s0(Vector(Vector(191.0)), Vector(Vector(192.0))), s0(Vector(Vector(193.0)), Vector(Vector(194.0)))), s1(s0(Vector(Vector(195.0)), Vector(Vector(196.0))), s0(Vector(Vector(197.0)), Vector(Vector(198.0))))), Vector(Vector(s1(s0(Vector(Vector(199.0)), Vector(Vector(200.0))), s0(Vector(Vector(201.0)), Vector(Vector(202.0))))), Vector(s1(s0(Vector(Vector(203.0)), Vector(Vector(204.0))), s0(Vector(Vector(205.0)), Vector(Vector(206.0))))), Vector(s1(s0(Vector(Vector(207.0)), Vector(Vector(208.0))), s0(Vector(Vector(209.0)), Vector(Vector(210.0))))))), Vector(s3(s0(Vector(Vector(211.0)), Vector(Vector(212.0))), Vector(s1(s0(Vector(Vector(213.0)), Vector(Vector(214.0))), s0(Vector(Vector(215.0)), Vector(Vector(216.0)))), s1(s0(Vector(Vector(217.0)), Vector(Vector(218.0))), s0(Vector(Vector(219.0)), Vector(Vector(220.0)))), s1(s0(Vector(Vector(221.0)), Vector(Vector(222.0))), s0(Vector(Vector(223.0)), Vector(Vector(224.0)))))), s3(s0(Vector(Vector(225.0)), Vector(Vector(226.0))), Vector(s1(s0(Vector(Vector(227.0)), Vector(Vector(228.0))), s0(Vector(Vector(229.0)), Vector(Vector(230.0)))), s1(s0(Vector(Vector(231.0)), Vector(Vector(232.0))), s0(Vector(Vector(233.0)), Vector(Vector(234.0)))), s1(s0(Vector(Vector(235.0)), Vector(Vector(236.0))), s0(Vector(Vector(237.0)), Vector(Vector(238.0))))))))), s4(Vector(Vector(s1(s0(Vector(Vector(239.0)), Vector(Vector(240.0))), s0(Vector(Vector(241.0)), Vector(Vector(242.0))))), Vector(s1(s0(Vector(Vector(243.0)), Vector(Vector(244.0))), s0(Vector(Vector(245.0)), Vector(Vector(246.0))))), Vector(s1(s0(Vector(Vector(247.0)), Vector(Vector(248.0))), s0(Vector(Vector(249.0)), Vector(Vector(250.0)))))), s2(Vector(s1(s0(Vector(Vector(251.0)), Vector(Vector(252.0))), s0(Vector(Vector(253.0)), Vector(Vector(254.0)))), s1(s0(Vector(Vector(255.0)), Vector(Vector(256.0))), s0(Vector(Vector(257.0)), Vector(Vector(258.0))))), Vector(Vector(s1(s0(Vector(Vector(259.0)), Vector(Vector(260.0))), s0(Vector(Vector(261.0)), Vector(Vector(262.0))))), Vector(s1(s0(Vector(Vector(263.0)), Vector(Vector(264.0))), s0(Vector(Vector(265.0)), Vector(Vector(266.0))))), Vector(s1(s0(Vector(Vector(267.0)), Vector(Vector(268.0))), s0(Vector(Vector(269.0)), Vector(Vector(270.0))))))))), s10(Vector(s8(s2(Vector(s1(s0(Vector(Vector(271.0)), Vector(Vector(272.0))), s0(Vector(Vector(273.0)), Vector(Vector(274.0)))), s1(s0(Vector(Vector(275.0)), Vector(Vector(276.0))), s0(Vector(Vector(277.0)), Vector(Vector(278.0))))), Vector(Vector(s1(s0(Vector(Vector(279.0)), Vector(Vector(280.0))), s0(Vector(Vector(281.0)), Vector(Vector(282.0))))), Vector(s1(s0(Vector(Vector(283.0)), Vector(Vector(284.0))), s0(Vector(Vector(285.0)), Vector(Vector(286.0))))), Vector(s1(s0(Vector(Vector(287.0)), Vector(Vector(288.0))), s0(Vector(Vector(289.0)), Vector(Vector(290.0))))))), Vector(s3(s0(Vector(Vector(291.0)), Vector(Vector(292.0))), Vector(s1(s0(Vector(Vector(293.0)), Vector(Vector(294.0))), s0(Vector(Vector(295.0)), Vector(Vector(296.0)))), s1(s0(Vector(Vector(297.0)), Vector(Vector(298.0))), s0(Vector(Vector(299.0)), Vector(Vector(300.0)))), s1(s0(Vector(Vector(301.0)), Vector(Vector(302.0))), s0(Vector(Vector(303.0)), Vector(Vector(304.0)))))), s3(s0(Vector(Vector(305.0)), Vector(Vector(306.0))), Vector(s1(s0(Vector(Vector(307.0)), Vector(Vector(308.0))), s0(Vector(Vector(309.0)), Vector(Vector(310.0)))), s1(s0(Vector(Vector(311.0)), Vector(Vector(312.0))), s0(Vector(Vector(313.0)), Vector(Vector(314.0)))), s1(s0(Vector(Vector(315.0)), Vector(Vector(316.0))), s0(Vector(Vector(317.0)), Vector(Vector(318.0)))))))), s8(s2(Vector(s1(s0(Vector(Vector(319.0)), Vector(Vector(320.0))), s0(Vector(Vector(321.0)), Vector(Vector(322.0)))), s1(s0(Vector(Vector(323.0)), Vector(Vector(324.0))), s0(Vector(Vector(325.0)), Vector(Vector(326.0))))), Vector(Vector(s1(s0(Vector(Vector(327.0)), Vector(Vector(328.0))), s0(Vector(Vector(329.0)), Vector(Vector(330.0))))), Vector(s1(s0(Vector(Vector(331.0)), Vector(Vector(332.0))), s0(Vector(Vector(333.0)), Vector(Vector(334.0))))), Vector(s1(s0(Vector(Vector(335.0)), Vector(Vector(336.0))), s0(Vector(Vector(337.0)), Vector(Vector(338.0))))))), Vector(s3(s0(Vector(Vector(339.0)), Vector(Vector(340.0))), Vector(s1(s0(Vector(Vector(341.0)), Vector(Vector(342.0))), s0(Vector(Vector(343.0)), Vector(Vector(344.0)))), s1(s0(Vector(Vector(345.0)), Vector(Vector(346.0))), s0(Vector(Vector(347.0)), Vector(Vector(348.0)))), s1(s0(Vector(Vector(349.0)), Vector(Vector(350.0))), s0(Vector(Vector(351.0)), Vector(Vector(352.0)))))), s3(s0(Vector(Vector(353.0)), Vector(Vector(354.0))), Vector(s1(s0(Vector(Vector(355.0)), Vector(Vector(356.0))), s0(Vector(Vector(357.0)), Vector(Vector(358.0)))), s1(s0(Vector(Vector(359.0)), Vector(Vector(360.0))), s0(Vector(Vector(361.0)), Vector(Vector(362.0)))), s1(s0(Vector(Vector(363.0)), Vector(Vector(364.0))), s0(Vector(Vector(365.0)), Vector(Vector(366.0))))))))), s4(Vector(Vector(s1(s0(Vector(Vector(367.0)), Vector(Vector(368.0))), s0(Vector(Vector(369.0)), Vector(Vector(370.0))))), Vector(s1(s0(Vector(Vector(371.0)), Vector(Vector(372.0))), s0(Vector(Vector(373.0)), Vector(Vector(374.0))))), Vector(s1(s0(Vector(Vector(375.0)), Vector(Vector(376.0))), s0(Vector(Vector(377.0)), Vector(Vector(378.0)))))), s2(Vector(s1(s0(Vector(Vector(379.0)), Vector(Vector(380.0))), s0(Vector(Vector(381.0)), Vector(Vector(382.0)))), s1(s0(Vector(Vector(383.0)), Vector(Vector(384.0))), s0(Vector(Vector(385.0)), Vector(Vector(386.0))))), Vector(Vector(s1(s0(Vector(Vector(387.0)), Vector(Vector(388.0))), s0(Vector(Vector(389.0)), Vector(Vector(390.0))))), Vector(s1(s0(Vector(Vector(391.0)), Vector(Vector(392.0))), s0(Vector(Vector(393.0)), Vector(Vector(394.0))))), Vector(s1(s0(Vector(Vector(395.0)), Vector(Vector(396.0))), s0(Vector(Vector(397.0)), Vector(Vector(398.0))))))))))
    val start = nanoTime()
    var result: Double = [StructValue(Name(str='s10', ty=None), [[StructValue(Name(str='s8', ty=None), [StructValue(Name(str='s2', ty=None), [[StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[143.0]], [[144.0]]]), StructValue(Name(str='s0', ty=None), [[[145.0]], [[146.0]]])]), StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[147.0]], [[148.0]]]), StructValue(Name(str='s0', ty=None), [[[149.0]], [[150.0]]])])], [[StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[151.0]], [[152.0]]]), StructValue(Name(str='s0', ty=None), [[[153.0]], [[154.0]]])])], [StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[155.0]], [[156.0]]]), StructValue(Name(str='s0', ty=None), [[[157.0]], [[158.0]]])])], [StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[159.0]], [[160.0]]]), StructValue(Name(str='s0', ty=None), [[[161.0]], [[162.0]]])])]]]), [StructValue(Name(str='s3', ty=None), [StructValue(Name(str='s0', ty=None), [[[163.0]], [[164.0]]]), [StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[165.0]], [[166.0]]]), StructValue(Name(str='s0', ty=None), [[[167.0]], [[168.0]]])]), StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[169.0]], [[170.0]]]), StructValue(Name(str='s0', ty=None), [[[171.0]], [[172.0]]])]), StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[173.0]], [[174.0]]]), StructValue(Name(str='s0', ty=None), [[[175.0]], [[176.0]]])])]]), StructValue(Name(str='s3', ty=None), [StructValue(Name(str='s0', ty=None), [[[177.0]], [[178.0]]]), [StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[179.0]], [[180.0]]]), StructValue(Name(str='s0', ty=None), [[[181.0]], [[182.0]]])]), StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[183.0]], [[184.0]]]), StructValue(Name(str='s0', ty=None), [[[185.0]], [[186.0]]])]), StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[187.0]], [[188.0]]]), StructValue(Name(str='s0', ty=None), [[[189.0]], [[190.0]]])])]])]]), StructValue(Name(str='s8', ty=None), [StructValue(Name(str='s2', ty=None), [[StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[191.0]], [[192.0]]]), StructValue(Name(str='s0', ty=None), [[[193.0]], [[194.0]]])]), StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[195.0]], [[196.0]]]), StructValue(Name(str='s0', ty=None), [[[197.0]], [[198.0]]])])], [[StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[199.0]], [[200.0]]]), StructValue(Name(str='s0', ty=None), [[[201.0]], [[202.0]]])])], [StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[203.0]], [[204.0]]]), StructValue(Name(str='s0', ty=None), [[[205.0]], [[206.0]]])])], [StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[207.0]], [[208.0]]]), StructValue(Name(str='s0', ty=None), [[[209.0]], [[210.0]]])])]]]), [StructValue(Name(str='s3', ty=None), [StructValue(Name(str='s0', ty=None), [[[211.0]], [[212.0]]]), [StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[213.0]], [[214.0]]]), StructValue(Name(str='s0', ty=None), [[[215.0]], [[216.0]]])]), StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[217.0]], [[218.0]]]), StructValue(Name(str='s0', ty=None), [[[219.0]], [[220.0]]])]), StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[221.0]], [[222.0]]]), StructValue(Name(str='s0', ty=None), [[[223.0]], [[224.0]]])])]]), StructValue(Name(str='s3', ty=None), [StructValue(Name(str='s0', ty=None), [[[225.0]], [[226.0]]]), [StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[227.0]], [[228.0]]]), StructValue(Name(str='s0', ty=None), [[[229.0]], [[230.0]]])]), StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[231.0]], [[232.0]]]), StructValue(Name(str='s0', ty=None), [[[233.0]], [[234.0]]])]), StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[235.0]], [[236.0]]]), StructValue(Name(str='s0', ty=None), [[[237.0]], [[238.0]]])])]])]])], StructValue(Name(str='s4', ty=None), [[[StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[239.0]], [[240.0]]]), StructValue(Name(str='s0', ty=None), [[[241.0]], [[242.0]]])])], [StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[243.0]], [[244.0]]]), StructValue(Name(str='s0', ty=None), [[[245.0]], [[246.0]]])])], [StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[247.0]], [[248.0]]]), StructValue(Name(str='s0', ty=None), [[[249.0]], [[250.0]]])])]], StructValue(Name(str='s2', ty=None), [[StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[251.0]], [[252.0]]]), StructValue(Name(str='s0', ty=None), [[[253.0]], [[254.0]]])]), StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[255.0]], [[256.0]]]), StructValue(Name(str='s0', ty=None), [[[257.0]], [[258.0]]])])], [[StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[259.0]], [[260.0]]]), StructValue(Name(str='s0', ty=None), [[[261.0]], [[262.0]]])])], [StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[263.0]], [[264.0]]]), StructValue(Name(str='s0', ty=None), [[[265.0]], [[266.0]]])])], [StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[267.0]], [[268.0]]]), StructValue(Name(str='s0', ty=None), [[[269.0]], [[270.0]]])])]]])])]), StructValue(Name(str='s10', ty=None), [[StructValue(Name(str='s8', ty=None), [StructValue(Name(str='s2', ty=None), [[StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[271.0]], [[272.0]]]), StructValue(Name(str='s0', ty=None), [[[273.0]], [[274.0]]])]), StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[275.0]], [[276.0]]]), StructValue(Name(str='s0', ty=None), [[[277.0]], [[278.0]]])])], [[StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[279.0]], [[280.0]]]), StructValue(Name(str='s0', ty=None), [[[281.0]], [[282.0]]])])], [StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[283.0]], [[284.0]]]), StructValue(Name(str='s0', ty=None), [[[285.0]], [[286.0]]])])], [StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[287.0]], [[288.0]]]), StructValue(Name(str='s0', ty=None), [[[289.0]], [[290.0]]])])]]]), [StructValue(Name(str='s3', ty=None), [StructValue(Name(str='s0', ty=None), [[[291.0]], [[292.0]]]), [StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[293.0]], [[294.0]]]), StructValue(Name(str='s0', ty=None), [[[295.0]], [[296.0]]])]), StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[297.0]], [[298.0]]]), StructValue(Name(str='s0', ty=None), [[[299.0]], [[300.0]]])]), StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[301.0]], [[302.0]]]), StructValue(Name(str='s0', ty=None), [[[303.0]], [[304.0]]])])]]), StructValue(Name(str='s3', ty=None), [StructValue(Name(str='s0', ty=None), [[[305.0]], [[306.0]]]), [StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[307.0]], [[308.0]]]), StructValue(Name(str='s0', ty=None), [[[309.0]], [[310.0]]])]), StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[311.0]], [[312.0]]]), StructValue(Name(str='s0', ty=None), [[[313.0]], [[314.0]]])]), StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[315.0]], [[316.0]]]), StructValue(Name(str='s0', ty=None), [[[317.0]], [[318.0]]])])]])]]), StructValue(Name(str='s8', ty=None), [StructValue(Name(str='s2', ty=None), [[StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[319.0]], [[320.0]]]), StructValue(Name(str='s0', ty=None), [[[321.0]], [[322.0]]])]), StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[323.0]], [[324.0]]]), StructValue(Name(str='s0', ty=None), [[[325.0]], [[326.0]]])])], [[StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[327.0]], [[328.0]]]), StructValue(Name(str='s0', ty=None), [[[329.0]], [[330.0]]])])], [StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[331.0]], [[332.0]]]), StructValue(Name(str='s0', ty=None), [[[333.0]], [[334.0]]])])], [StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[335.0]], [[336.0]]]), StructValue(Name(str='s0', ty=None), [[[337.0]], [[338.0]]])])]]]), [StructValue(Name(str='s3', ty=None), [StructValue(Name(str='s0', ty=None), [[[339.0]], [[340.0]]]), [StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[341.0]], [[342.0]]]), StructValue(Name(str='s0', ty=None), [[[343.0]], [[344.0]]])]), StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[345.0]], [[346.0]]]), StructValue(Name(str='s0', ty=None), [[[347.0]], [[348.0]]])]), StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[349.0]], [[350.0]]]), StructValue(Name(str='s0', ty=None), [[[351.0]], [[352.0]]])])]]), StructValue(Name(str='s3', ty=None), [StructValue(Name(str='s0', ty=None), [[[353.0]], [[354.0]]]), [StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[355.0]], [[356.0]]]), StructValue(Name(str='s0', ty=None), [[[357.0]], [[358.0]]])]), StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[359.0]], [[360.0]]]), StructValue(Name(str='s0', ty=None), [[[361.0]], [[362.0]]])]), StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[363.0]], [[364.0]]]), StructValue(Name(str='s0', ty=None), [[[365.0]], [[366.0]]])])]])]])], StructValue(Name(str='s4', ty=None), [[[StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[367.0]], [[368.0]]]), StructValue(Name(str='s0', ty=None), [[[369.0]], [[370.0]]])])], [StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[371.0]], [[372.0]]]), StructValue(Name(str='s0', ty=None), [[[373.0]], [[374.0]]])])], [StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[375.0]], [[376.0]]]), StructValue(Name(str='s0', ty=None), [[[377.0]], [[378.0]]])])]], StructValue(Name(str='s2', ty=None), [[StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[379.0]], [[380.0]]]), StructValue(Name(str='s0', ty=None), [[[381.0]], [[382.0]]])]), StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[383.0]], [[384.0]]]), StructValue(Name(str='s0', ty=None), [[[385.0]], [[386.0]]])])], [[StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[387.0]], [[388.0]]]), StructValue(Name(str='s0', ty=None), [[[389.0]], [[390.0]]])])], [StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[391.0]], [[392.0]]]), StructValue(Name(str='s0', ty=None), [[[393.0]], [[394.0]]])])], [StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[395.0]], [[396.0]]]), StructValue(Name(str='s0', ty=None), [[[397.0]], [[398.0]]])])]]])])])]
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}