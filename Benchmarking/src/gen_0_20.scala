import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s2 (
    p0: s1,
    p1: Vector[s1],
    p2: s0
  )
  case class s4 (
    p0: s0
  )
  case class s5 (
    p0: Vector[Vector[s2]],
    p1: s0
  )
  def f65(v0: s0): s0 = {
    var v4: s0 = v0
    val v3: Vector[Vector[Double]] = v0.p1
    v4 = v4.copy(p1 = v3)
    v4 = v4.copy(p1 = v3)
    v4 = v4.copy(p1 = v3)
    v4 = v4.copy(p1 = v3)
    v4 = v4.copy(p1 = v3)
    v4
  }
  def f60(v0: s0): s0 = {
    val v7: Vector[Vector[Double]] = v0.p1
    var v5: Vector[Vector[Double]] = v7
    val v6: s0 = f65(v0)
    val v4: Vector[Vector[Double]] = v6.p1
    val v1: s0 = f65(v0)
    var v3: Vector[Vector[Double]] = v5
    var v30: s0 = v0
    val v16: s0 = f65(v0)
    v30 = v30.copy(p1 = v5)
    v30 = v30.copy(p1 = v5)
    val v14: s4 = s4(v1)
    val v17: s0 = v14.p0
    val v8: Vector[Vector[Double]] = v17.p1
    val v10: s0 = f65(v30)
    val v13: s0 = f65(v10)
    var v25: Vector[Vector[Double]] = v5
    v30 = v30.copy(p1 = v7)
    v30 = v30.copy(p1 = v4)
    val v29: s4 = s4(v30)
    val v46: s0 = v29.p0
    val v22: Vector[Vector[Double]] = v10.p1
    val v19: s0 = f65(v13)
    val v24: Vector[Double] = v3(1)
    v30 = v30.copy(p1 = v22)
    val v38: s0 = f65(v16)
    v5 = v5.updated(1, v24)
    v30 = v30.copy(p1 = v25)
    val v27: s0 = f65(v38)
    val v26: s0 = f65(v27)
    val v34: s0 = f65(v46)
    v30 = v30.copy(p1 = v22)
    v30 = v30.copy(p1 = v8)
    val v73: s0 = v14.p0
    val v32: Vector[Vector[Double]] = v19.p1
    v30 = v30.copy(p1 = v4)
    val v37: Vector[Vector[Double]] = v1.p0
    val v171: Vector[s0] = Vector(v6, v13, v0, v10, v26, v73, v34)
    val v75: Vector[Double] = v37(0)
    v3 = v3.updated(0, v75)
    val v48: s0 = f65(v34)
    var v63: Vector[s0] = v171
    v30 = v30.copy(p1 = v32)
    v63 = v63.updated(2, v30)
    val v93: s0 = v63(2)
    v63 = v63.updated(2, v48)
    val v141: s0 = f65(v93)
    v141
  }
  @noinline
  def f0(v0: Vector[s5], v1: Double): Double = {
    val v4: s5 = v0(2)
    val v2: s0 = v4.p1
    val v12: s0 = f60(v2)
    val v5: Vector[Vector[Double]] = v12.p1
    val v14: Vector[Double] = v5(0)
    val v21: Double = v14(0)
    var v30: Double = v21
    var v36: Double = v30
    val v26: Double = v36 + v30
    v26
  }
  def benchmark(): Unit = {
    val v0: Vector[s5] = Vector(s5(Vector(Vector(s2(s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0))), Vector(s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0))), s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0))), s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0))))), Vector(s1(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0))), Vector(s0(Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0))), s0(Vector(Vector(18.0)), Vector(Vector(19.0), Vector(20.0))), s0(Vector(Vector(21.0)), Vector(Vector(22.0), Vector(23.0))))), s1(s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0))), Vector(s0(Vector(Vector(27.0)), Vector(Vector(28.0), Vector(29.0))), s0(Vector(Vector(30.0)), Vector(Vector(31.0), Vector(32.0))), s0(Vector(Vector(33.0)), Vector(Vector(34.0), Vector(35.0))))), s1(s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0))), Vector(s0(Vector(Vector(39.0)), Vector(Vector(40.0), Vector(41.0))), s0(Vector(Vector(42.0)), Vector(Vector(43.0), Vector(44.0))), s0(Vector(Vector(45.0)), Vector(Vector(46.0), Vector(47.0)))))), s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0))))), Vector(s2(s1(s0(Vector(Vector(51.0)), Vector(Vector(52.0), Vector(53.0))), Vector(s0(Vector(Vector(54.0)), Vector(Vector(55.0), Vector(56.0))), s0(Vector(Vector(57.0)), Vector(Vector(58.0), Vector(59.0))), s0(Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0))))), Vector(s1(s0(Vector(Vector(63.0)), Vector(Vector(64.0), Vector(65.0))), Vector(s0(Vector(Vector(66.0)), Vector(Vector(67.0), Vector(68.0))), s0(Vector(Vector(69.0)), Vector(Vector(70.0), Vector(71.0))), s0(Vector(Vector(72.0)), Vector(Vector(73.0), Vector(74.0))))), s1(s0(Vector(Vector(75.0)), Vector(Vector(76.0), Vector(77.0))), Vector(s0(Vector(Vector(78.0)), Vector(Vector(79.0), Vector(80.0))), s0(Vector(Vector(81.0)), Vector(Vector(82.0), Vector(83.0))), s0(Vector(Vector(84.0)), Vector(Vector(85.0), Vector(86.0))))), s1(s0(Vector(Vector(87.0)), Vector(Vector(88.0), Vector(89.0))), Vector(s0(Vector(Vector(90.0)), Vector(Vector(91.0), Vector(92.0))), s0(Vector(Vector(93.0)), Vector(Vector(94.0), Vector(95.0))), s0(Vector(Vector(96.0)), Vector(Vector(97.0), Vector(98.0)))))), s0(Vector(Vector(99.0)), Vector(Vector(100.0), Vector(101.0)))))), s0(Vector(Vector(102.0)), Vector(Vector(103.0), Vector(104.0)))), s5(Vector(Vector(s2(s1(s0(Vector(Vector(105.0)), Vector(Vector(106.0), Vector(107.0))), Vector(s0(Vector(Vector(108.0)), Vector(Vector(109.0), Vector(110.0))), s0(Vector(Vector(111.0)), Vector(Vector(112.0), Vector(113.0))), s0(Vector(Vector(114.0)), Vector(Vector(115.0), Vector(116.0))))), Vector(s1(s0(Vector(Vector(117.0)), Vector(Vector(118.0), Vector(119.0))), Vector(s0(Vector(Vector(120.0)), Vector(Vector(121.0), Vector(122.0))), s0(Vector(Vector(123.0)), Vector(Vector(124.0), Vector(125.0))), s0(Vector(Vector(126.0)), Vector(Vector(127.0), Vector(128.0))))), s1(s0(Vector(Vector(129.0)), Vector(Vector(130.0), Vector(131.0))), Vector(s0(Vector(Vector(132.0)), Vector(Vector(133.0), Vector(134.0))), s0(Vector(Vector(135.0)), Vector(Vector(136.0), Vector(137.0))), s0(Vector(Vector(138.0)), Vector(Vector(139.0), Vector(140.0))))), s1(s0(Vector(Vector(141.0)), Vector(Vector(142.0), Vector(143.0))), Vector(s0(Vector(Vector(144.0)), Vector(Vector(145.0), Vector(146.0))), s0(Vector(Vector(147.0)), Vector(Vector(148.0), Vector(149.0))), s0(Vector(Vector(150.0)), Vector(Vector(151.0), Vector(152.0)))))), s0(Vector(Vector(153.0)), Vector(Vector(154.0), Vector(155.0))))), Vector(s2(s1(s0(Vector(Vector(156.0)), Vector(Vector(157.0), Vector(158.0))), Vector(s0(Vector(Vector(159.0)), Vector(Vector(160.0), Vector(161.0))), s0(Vector(Vector(162.0)), Vector(Vector(163.0), Vector(164.0))), s0(Vector(Vector(165.0)), Vector(Vector(166.0), Vector(167.0))))), Vector(s1(s0(Vector(Vector(168.0)), Vector(Vector(169.0), Vector(170.0))), Vector(s0(Vector(Vector(171.0)), Vector(Vector(172.0), Vector(173.0))), s0(Vector(Vector(174.0)), Vector(Vector(175.0), Vector(176.0))), s0(Vector(Vector(177.0)), Vector(Vector(178.0), Vector(179.0))))), s1(s0(Vector(Vector(180.0)), Vector(Vector(181.0), Vector(182.0))), Vector(s0(Vector(Vector(183.0)), Vector(Vector(184.0), Vector(185.0))), s0(Vector(Vector(186.0)), Vector(Vector(187.0), Vector(188.0))), s0(Vector(Vector(189.0)), Vector(Vector(190.0), Vector(191.0))))), s1(s0(Vector(Vector(192.0)), Vector(Vector(193.0), Vector(194.0))), Vector(s0(Vector(Vector(195.0)), Vector(Vector(196.0), Vector(197.0))), s0(Vector(Vector(198.0)), Vector(Vector(199.0), Vector(200.0))), s0(Vector(Vector(201.0)), Vector(Vector(202.0), Vector(203.0)))))), s0(Vector(Vector(204.0)), Vector(Vector(205.0), Vector(206.0)))))), s0(Vector(Vector(207.0)), Vector(Vector(208.0), Vector(209.0)))), s5(Vector(Vector(s2(s1(s0(Vector(Vector(210.0)), Vector(Vector(211.0), Vector(212.0))), Vector(s0(Vector(Vector(213.0)), Vector(Vector(214.0), Vector(215.0))), s0(Vector(Vector(216.0)), Vector(Vector(217.0), Vector(218.0))), s0(Vector(Vector(219.0)), Vector(Vector(220.0), Vector(221.0))))), Vector(s1(s0(Vector(Vector(222.0)), Vector(Vector(223.0), Vector(224.0))), Vector(s0(Vector(Vector(225.0)), Vector(Vector(226.0), Vector(227.0))), s0(Vector(Vector(228.0)), Vector(Vector(229.0), Vector(230.0))), s0(Vector(Vector(231.0)), Vector(Vector(232.0), Vector(233.0))))), s1(s0(Vector(Vector(234.0)), Vector(Vector(235.0), Vector(236.0))), Vector(s0(Vector(Vector(237.0)), Vector(Vector(238.0), Vector(239.0))), s0(Vector(Vector(240.0)), Vector(Vector(241.0), Vector(242.0))), s0(Vector(Vector(243.0)), Vector(Vector(244.0), Vector(245.0))))), s1(s0(Vector(Vector(246.0)), Vector(Vector(247.0), Vector(248.0))), Vector(s0(Vector(Vector(249.0)), Vector(Vector(250.0), Vector(251.0))), s0(Vector(Vector(252.0)), Vector(Vector(253.0), Vector(254.0))), s0(Vector(Vector(255.0)), Vector(Vector(256.0), Vector(257.0)))))), s0(Vector(Vector(258.0)), Vector(Vector(259.0), Vector(260.0))))), Vector(s2(s1(s0(Vector(Vector(261.0)), Vector(Vector(262.0), Vector(263.0))), Vector(s0(Vector(Vector(264.0)), Vector(Vector(265.0), Vector(266.0))), s0(Vector(Vector(267.0)), Vector(Vector(268.0), Vector(269.0))), s0(Vector(Vector(270.0)), Vector(Vector(271.0), Vector(272.0))))), Vector(s1(s0(Vector(Vector(273.0)), Vector(Vector(274.0), Vector(275.0))), Vector(s0(Vector(Vector(276.0)), Vector(Vector(277.0), Vector(278.0))), s0(Vector(Vector(279.0)), Vector(Vector(280.0), Vector(281.0))), s0(Vector(Vector(282.0)), Vector(Vector(283.0), Vector(284.0))))), s1(s0(Vector(Vector(285.0)), Vector(Vector(286.0), Vector(287.0))), Vector(s0(Vector(Vector(288.0)), Vector(Vector(289.0), Vector(290.0))), s0(Vector(Vector(291.0)), Vector(Vector(292.0), Vector(293.0))), s0(Vector(Vector(294.0)), Vector(Vector(295.0), Vector(296.0))))), s1(s0(Vector(Vector(297.0)), Vector(Vector(298.0), Vector(299.0))), Vector(s0(Vector(Vector(300.0)), Vector(Vector(301.0), Vector(302.0))), s0(Vector(Vector(303.0)), Vector(Vector(304.0), Vector(305.0))), s0(Vector(Vector(306.0)), Vector(Vector(307.0), Vector(308.0)))))), s0(Vector(Vector(309.0)), Vector(Vector(310.0), Vector(311.0)))))), s0(Vector(Vector(312.0)), Vector(Vector(313.0), Vector(314.0)))))
    val v1: Double = 315.0
    val start = nanoTime()
    var result: Double = 315.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}