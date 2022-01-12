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
    p0: s1,
    p1: Vector[s1]
  )
  case class s3 (
    p0: s0,
    p1: s2
  )
  case class s4 (
    p0: s0,
    p1: s0
  )
  case class s5 (
    p0: s3,
    p1: Vector[Vector[s1]]
  )
  case class s8 (
    p0: Vector[Vector[s4]],
    p1: Vector[Vector[s3]],
    p2: Vector[s2],
    p3: s5
  )
  def f60(v0: s3): s3 = {
    v0
  }
  def f58(v0: s3): s3 = {
    val v2: s0 = v0.p0
    val v5: Vector[s0] = Vector(v2, v2, v2, v2)
    val v4: s3 = f60(v0)
    val v1: s3 = f60(v4)
    val v7: s0 = v5(1)
    val v18: s3 = f60(v0)
    var v12: s3 = v18
    val v16: s3 = f60(v1)
    v12 = v12.copy(p0 = v7)
    v12 = v0
    v12 = v16
    v12 = v12.copy(p0 = v7)
    val v117: s3 = f60(v12)
    v117
  }
  def f54(v0: s3): s3 = {
    val v2: s3 = f60(v0)
    var v4: s3 = v0
    val v5: s0 = v0.p0
    v4 = v0
    val v6: s2 = v2.p1
    val v8: s1 = v6.p0
    var v1: s3 = v4
    v4 = v4.copy(p0 = v5)
    var v10: s2 = v6
    var v7: s1 = v8
    val v15: s3 = s3(v5, v6)
    val v17: s3 = f58(v1)
    var v13: s2 = v6
    val v11: Vector[s0] = v7.p0
    val v21: Vector[s0] = v8.p1
    v13 = v13.copy(p0 = v7)
    var v18: s2 = v13
    val v28: Vector[s1] = v6.p1
    val v16: s1 = v28(0)
    v18 = v13
    v4 = v4.copy(p1 = v10)
    val v36: s3 = f58(v15)
    v10 = v10.copy(p0 = v16)
    val v20: s3 = f60(v36)
    v1 = v1.copy(p1 = v18)
    val v45: s0 = v21(1)
    var v31: s2 = v6
    v7 = v7.copy(p1 = v11)
    val v64: s3 = f60(v20)
    val v68: s2 = v64.p1
    v1 = v1.copy(p1 = v68)
    v18 = v18.copy(p1 = v28)
    v1 = v1.copy(p1 = v31)
    v1 = v1.copy(p0 = v45)
    val v85: s3 = f58(v17)
    v85
  }
  def f47(v0: s0): s0 = {
    var v3: s0 = v0
    var v9: s0 = v0
    val v7: Vector[Vector[Double]] = v3.p0
    val v12: Vector[s0] = Vector(v3, v3, v3, v9, v9, v0, v9)
    var v6: s0 = v9
    var v5: Vector[s0] = v12
    var v11: s0 = v6
    v3 = v3.copy(p0 = v7)
    v9 = v9.copy(p0 = v7)
    val v10: s0 = v5(6)
    v5 = v5.updated(4, v0)
    v5 = v5.updated(3, v3)
    v5 = v5.updated(1, v11)
    val v1: Vector[Vector[Double]] = v0.p0
    v5 = v5.updated(6, v9)
    val v25: Vector[Vector[Double]] = v10.p1
    var v16: Vector[Vector[Double]] = v25
    v11 = v11.copy(p0 = v1)
    var v18: Vector[s0] = v5
    v9 = v9.copy(p0 = v1)
    var v29: Vector[s0] = v18
    val v32: Vector[Vector[Double]] = v3.p0
    val v57: s0 = v29(2)
    var v43: s0 = v0
    v18 = v18.updated(0, v9)
    val v22: Vector[Vector[Double]] = v6.p1
    var v61: Vector[Vector[Double]] = v22
    v43 = v43.copy(p1 = v16)
    v43 = v43.copy(p0 = v32)
    var v51: s0 = v43
    val v68: s4 = s4(v51, v10)
    v5 = v5.updated(5, v57)
    var v99: s4 = v68
    v9 = v9.copy(p1 = v61)
    v11 = v6
    v99 = v99.copy(p1 = v0)
    val v65: s0 = v99.p1
    v65
  }
  def f33(v0: s0): s0 = {
    var v3: s0 = v0
    var v2: s0 = v3
    val v1: s0 = f47(v2)
    val v4: s0 = f47(v1)
    v3 = v0
    val v7: Vector[Vector[Double]] = v4.p0
    val v5: Vector[Vector[Double]] = v1.p0
    v3 = v3.copy(p0 = v7)
    val v8: Vector[Vector[Double]] = v0.p1
    var v13: Vector[Vector[Double]] = v7
    val v10: Vector[Vector[Double]] = v3.p0
    val v9: s0 = f47(v1)
    v3 = v3.copy(p0 = v13)
    val v19: Vector[Double] = v5(0)
    val v41: Vector[Vector[Double]] = v4.p0
    val v23: s0 = s0(v10, v8)
    val v17: Vector[Vector[Double]] = v23.p1
    v3 = v3.copy(p1 = v17)
    v13 = v41
    val v27: s0 = f47(v1)
    v3 = v3.copy(p1 = v17)
    v2 = v2.copy(p0 = v10)
    val v42: Vector[Vector[Double]] = v0.p0
    v3 = v3.copy(p1 = v17)
    val v80: s4 = s4(v9, v3)
    v3 = v3.copy(p0 = v42)
    v3 = v27
    v3 = v3.copy(p0 = v13)
    v13 = v13.updated(0, v19)
    val v64: s0 = v80.p1
    v64
  }
  def f29(v0: s0): s0 = {
    val v28: s0 = f47(v0)
    val v36: s0 = f33(v28)
    val v42: s0 = f33(v36)
    v42
  }
  @noinline
  def f0(v0: s5, v1: Vector[s8], v2: Double): Double = {
    val v5: s8 = v1(0)
    val v8: Double = v2 + v2
    var v13: Double = v2
    val v15: Vector[Vector[s3]] = v5.p1
    val v11: Double = v8 * v2
    val v9: Double = v13 / v8
    val v25: Vector[s3] = v15(0)
    val v24: s3 = v25(0)
    val v30: s3 = f54(v24)
    val v43: s0 = v30.p0
    val v73: s0 = f29(v43)
    val v46: Vector[Vector[Double]] = v73.p1
    var v59: s0 = v73
    val v44: Vector[Vector[Double]] = v73.p0
    val v57: s4 = s4(v59, v59)
    var v52: Double = v11
    val v88: s0 = v57.p1
    var v102: Vector[Vector[Double]] = v44
    val v50: Vector[Vector[Double]] = v88.p1
    val v49: Vector[Double] = Vector(v11, v52, v8, v9, v13)
    val v180: Vector[Double] = v102(0)
    val v75: Double = v180(0)
    v59 = v59.copy(p1 = v46)
    val v122: Double = v49(0)
    val v303: Vector[Double] = Vector(v122, v2, v75)
    val v166: Vector[Double] = v50(2)
    val v326: Double = v303(2)
    v102 = v102.updated(0, v166)
    v326
  }
  def benchmark(): Unit = {
    val v0: s5 = s5(s3(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))), s2(s1(Vector(s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0))), s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))), Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0))), s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0))))), Vector(s1(Vector(s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))), s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0)))), Vector(s0(Vector(Vector(28.0)), Vector(Vector(29.0), Vector(30.0), Vector(31.0))), s0(Vector(Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0)))))))), Vector(Vector(s1(Vector(s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0))), s0(Vector(Vector(40.0)), Vector(Vector(41.0), Vector(42.0), Vector(43.0)))), Vector(s0(Vector(Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0))), s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0), Vector(51.0)))))), Vector(s1(Vector(s0(Vector(Vector(52.0)), Vector(Vector(53.0), Vector(54.0), Vector(55.0))), s0(Vector(Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0)))), Vector(s0(Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0), Vector(63.0))), s0(Vector(Vector(64.0)), Vector(Vector(65.0), Vector(66.0), Vector(67.0)))))), Vector(s1(Vector(s0(Vector(Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0))), s0(Vector(Vector(72.0)), Vector(Vector(73.0), Vector(74.0), Vector(75.0)))), Vector(s0(Vector(Vector(76.0)), Vector(Vector(77.0), Vector(78.0), Vector(79.0))), s0(Vector(Vector(80.0)), Vector(Vector(81.0), Vector(82.0), Vector(83.0))))))))
    val v1: Vector[s8] = Vector(s8(Vector(Vector(s4(s0(Vector(Vector(84.0)), Vector(Vector(85.0), Vector(86.0), Vector(87.0))), s0(Vector(Vector(88.0)), Vector(Vector(89.0), Vector(90.0), Vector(91.0))))), Vector(s4(s0(Vector(Vector(92.0)), Vector(Vector(93.0), Vector(94.0), Vector(95.0))), s0(Vector(Vector(96.0)), Vector(Vector(97.0), Vector(98.0), Vector(99.0)))))), Vector(Vector(s3(s0(Vector(Vector(100.0)), Vector(Vector(101.0), Vector(102.0), Vector(103.0))), s2(s1(Vector(s0(Vector(Vector(104.0)), Vector(Vector(105.0), Vector(106.0), Vector(107.0))), s0(Vector(Vector(108.0)), Vector(Vector(109.0), Vector(110.0), Vector(111.0)))), Vector(s0(Vector(Vector(112.0)), Vector(Vector(113.0), Vector(114.0), Vector(115.0))), s0(Vector(Vector(116.0)), Vector(Vector(117.0), Vector(118.0), Vector(119.0))))), Vector(s1(Vector(s0(Vector(Vector(120.0)), Vector(Vector(121.0), Vector(122.0), Vector(123.0))), s0(Vector(Vector(124.0)), Vector(Vector(125.0), Vector(126.0), Vector(127.0)))), Vector(s0(Vector(Vector(128.0)), Vector(Vector(129.0), Vector(130.0), Vector(131.0))), s0(Vector(Vector(132.0)), Vector(Vector(133.0), Vector(134.0), Vector(135.0))))))))), Vector(s3(s0(Vector(Vector(136.0)), Vector(Vector(137.0), Vector(138.0), Vector(139.0))), s2(s1(Vector(s0(Vector(Vector(140.0)), Vector(Vector(141.0), Vector(142.0), Vector(143.0))), s0(Vector(Vector(144.0)), Vector(Vector(145.0), Vector(146.0), Vector(147.0)))), Vector(s0(Vector(Vector(148.0)), Vector(Vector(149.0), Vector(150.0), Vector(151.0))), s0(Vector(Vector(152.0)), Vector(Vector(153.0), Vector(154.0), Vector(155.0))))), Vector(s1(Vector(s0(Vector(Vector(156.0)), Vector(Vector(157.0), Vector(158.0), Vector(159.0))), s0(Vector(Vector(160.0)), Vector(Vector(161.0), Vector(162.0), Vector(163.0)))), Vector(s0(Vector(Vector(164.0)), Vector(Vector(165.0), Vector(166.0), Vector(167.0))), s0(Vector(Vector(168.0)), Vector(Vector(169.0), Vector(170.0), Vector(171.0)))))))))), Vector(s2(s1(Vector(s0(Vector(Vector(172.0)), Vector(Vector(173.0), Vector(174.0), Vector(175.0))), s0(Vector(Vector(176.0)), Vector(Vector(177.0), Vector(178.0), Vector(179.0)))), Vector(s0(Vector(Vector(180.0)), Vector(Vector(181.0), Vector(182.0), Vector(183.0))), s0(Vector(Vector(184.0)), Vector(Vector(185.0), Vector(186.0), Vector(187.0))))), Vector(s1(Vector(s0(Vector(Vector(188.0)), Vector(Vector(189.0), Vector(190.0), Vector(191.0))), s0(Vector(Vector(192.0)), Vector(Vector(193.0), Vector(194.0), Vector(195.0)))), Vector(s0(Vector(Vector(196.0)), Vector(Vector(197.0), Vector(198.0), Vector(199.0))), s0(Vector(Vector(200.0)), Vector(Vector(201.0), Vector(202.0), Vector(203.0))))))), s2(s1(Vector(s0(Vector(Vector(204.0)), Vector(Vector(205.0), Vector(206.0), Vector(207.0))), s0(Vector(Vector(208.0)), Vector(Vector(209.0), Vector(210.0), Vector(211.0)))), Vector(s0(Vector(Vector(212.0)), Vector(Vector(213.0), Vector(214.0), Vector(215.0))), s0(Vector(Vector(216.0)), Vector(Vector(217.0), Vector(218.0), Vector(219.0))))), Vector(s1(Vector(s0(Vector(Vector(220.0)), Vector(Vector(221.0), Vector(222.0), Vector(223.0))), s0(Vector(Vector(224.0)), Vector(Vector(225.0), Vector(226.0), Vector(227.0)))), Vector(s0(Vector(Vector(228.0)), Vector(Vector(229.0), Vector(230.0), Vector(231.0))), s0(Vector(Vector(232.0)), Vector(Vector(233.0), Vector(234.0), Vector(235.0))))))), s2(s1(Vector(s0(Vector(Vector(236.0)), Vector(Vector(237.0), Vector(238.0), Vector(239.0))), s0(Vector(Vector(240.0)), Vector(Vector(241.0), Vector(242.0), Vector(243.0)))), Vector(s0(Vector(Vector(244.0)), Vector(Vector(245.0), Vector(246.0), Vector(247.0))), s0(Vector(Vector(248.0)), Vector(Vector(249.0), Vector(250.0), Vector(251.0))))), Vector(s1(Vector(s0(Vector(Vector(252.0)), Vector(Vector(253.0), Vector(254.0), Vector(255.0))), s0(Vector(Vector(256.0)), Vector(Vector(257.0), Vector(258.0), Vector(259.0)))), Vector(s0(Vector(Vector(260.0)), Vector(Vector(261.0), Vector(262.0), Vector(263.0))), s0(Vector(Vector(264.0)), Vector(Vector(265.0), Vector(266.0), Vector(267.0)))))))), s5(s3(s0(Vector(Vector(268.0)), Vector(Vector(269.0), Vector(270.0), Vector(271.0))), s2(s1(Vector(s0(Vector(Vector(272.0)), Vector(Vector(273.0), Vector(274.0), Vector(275.0))), s0(Vector(Vector(276.0)), Vector(Vector(277.0), Vector(278.0), Vector(279.0)))), Vector(s0(Vector(Vector(280.0)), Vector(Vector(281.0), Vector(282.0), Vector(283.0))), s0(Vector(Vector(284.0)), Vector(Vector(285.0), Vector(286.0), Vector(287.0))))), Vector(s1(Vector(s0(Vector(Vector(288.0)), Vector(Vector(289.0), Vector(290.0), Vector(291.0))), s0(Vector(Vector(292.0)), Vector(Vector(293.0), Vector(294.0), Vector(295.0)))), Vector(s0(Vector(Vector(296.0)), Vector(Vector(297.0), Vector(298.0), Vector(299.0))), s0(Vector(Vector(300.0)), Vector(Vector(301.0), Vector(302.0), Vector(303.0)))))))), Vector(Vector(s1(Vector(s0(Vector(Vector(304.0)), Vector(Vector(305.0), Vector(306.0), Vector(307.0))), s0(Vector(Vector(308.0)), Vector(Vector(309.0), Vector(310.0), Vector(311.0)))), Vector(s0(Vector(Vector(312.0)), Vector(Vector(313.0), Vector(314.0), Vector(315.0))), s0(Vector(Vector(316.0)), Vector(Vector(317.0), Vector(318.0), Vector(319.0)))))), Vector(s1(Vector(s0(Vector(Vector(320.0)), Vector(Vector(321.0), Vector(322.0), Vector(323.0))), s0(Vector(Vector(324.0)), Vector(Vector(325.0), Vector(326.0), Vector(327.0)))), Vector(s0(Vector(Vector(328.0)), Vector(Vector(329.0), Vector(330.0), Vector(331.0))), s0(Vector(Vector(332.0)), Vector(Vector(333.0), Vector(334.0), Vector(335.0)))))), Vector(s1(Vector(s0(Vector(Vector(336.0)), Vector(Vector(337.0), Vector(338.0), Vector(339.0))), s0(Vector(Vector(340.0)), Vector(Vector(341.0), Vector(342.0), Vector(343.0)))), Vector(s0(Vector(Vector(344.0)), Vector(Vector(345.0), Vector(346.0), Vector(347.0))), s0(Vector(Vector(348.0)), Vector(Vector(349.0), Vector(350.0), Vector(351.0))))))))))
    val v2: Double = 352.0
    val start = nanoTime()
    var result: Double = 352.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}