import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  case class s2 (
    p0: Vector[s1],
    p1: Vector[Vector[s0]],
    p2: s0
  )
  case class s4 (
    p0: s2,
    p1: Vector[s0]
  )
  case class s7 (
    p0: Vector[s4],
    p1: Vector[s0]
  )
  def f44(v0: s0): s0 = {
    var v1: s0 = v0
    var v3: s0 = v1
    var v5: s0 = v1
    val v2: Vector[Vector[Double]] = v5.p0
    var v12: Vector[Vector[Double]] = v2
    val v9: Vector[Vector[Double]] = v3.p0
    var v7: Vector[Vector[Double]] = v12
    v1 = v1.copy(p1 = v2)
    var v8: s0 = v3
    val v14: Vector[Double] = v9(2)
    val v11: Vector[Double] = v2(2)
    v7 = v7.updated(1, v14)
    val v17: Vector[Vector[Double]] = v5.p0
    v8 = v8.copy(p1 = v17)
    v3 = v3.copy(p0 = v9)
    val v35: Vector[Vector[Double]] = v8.p2
    var v16: s0 = v1
    v5 = v5.copy(p1 = v7)
    val v20: Vector[Vector[Double]] = v16.p2
    val v28: Vector[Vector[Double]] = v8.p0
    v7 = v7.updated(2, v11)
    var v38: Vector[Vector[Double]] = v9
    var v24: Vector[Vector[Double]] = v20
    val v36: Vector[Vector[Double]] = v0.p2
    v16 = v16.copy(p0 = v28)
    v1 = v1.copy(p0 = v28)
    v8 = v8.copy(p1 = v38)
    v16 = v16.copy(p0 = v9)
    v24 = v36
    v1 = v1.copy(p1 = v28)
    v16 = v16.copy(p2 = v24)
    val v61: Vector[Vector[Double]] = v0.p2
    v16 = v16.copy(p2 = v61)
    v38 = v12
    v16 = v16.copy(p0 = v12)
    v24 = v35
    v3 = v3.copy(p2 = v35)
    val v110: Vector[Vector[Double]] = v16.p0
    v16 = v16.copy(p2 = v24)
    v3 = v3.copy(p2 = v20)
    var v94: s0 = v16
    v3 = v3.copy(p1 = v38)
    v94 = v16
    v94 = v94.copy(p1 = v110)
    v94 = v94.copy(p2 = v35)
    v8 = v8.copy(p0 = v110)
    v94
  }
  @noinline
  def f0(v0: Vector[s7], v1: Double): Double = {
    var v7: Double = v1
    val v3: s7 = v0(0)
    val v11: Vector[s0] = v3.p1
    val v15: s0 = v11(0)
    val v13: s0 = f44(v15)
    val v9: Vector[Vector[Double]] = v13.p2
    val v32: Vector[Double] = v9(0)
    val v36: Double = v32(0)
    val v23: Double = v7 - v36
    v23
  }
  def benchmark(): Unit = {
    val v0: Vector[s7] = Vector(s7(Vector(s4(s2(Vector(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0)), Vector(Vector(6.0)))), Vector(s0(Vector(Vector(7.0), Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0))), s0(Vector(Vector(14.0), Vector(15.0), Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0)), Vector(Vector(20.0))), s0(Vector(Vector(21.0), Vector(22.0), Vector(23.0)), Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0)))))), Vector(Vector(s0(Vector(Vector(28.0), Vector(29.0), Vector(30.0)), Vector(Vector(31.0), Vector(32.0), Vector(33.0)), Vector(Vector(34.0))))), s0(Vector(Vector(35.0), Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0), Vector(40.0)), Vector(Vector(41.0)))), Vector(s0(Vector(Vector(42.0), Vector(43.0), Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0)), Vector(Vector(48.0))))), s4(s2(Vector(s1(Vector(s0(Vector(Vector(49.0), Vector(50.0), Vector(51.0)), Vector(Vector(52.0), Vector(53.0), Vector(54.0)), Vector(Vector(55.0)))), Vector(s0(Vector(Vector(56.0), Vector(57.0), Vector(58.0)), Vector(Vector(59.0), Vector(60.0), Vector(61.0)), Vector(Vector(62.0))), s0(Vector(Vector(63.0), Vector(64.0), Vector(65.0)), Vector(Vector(66.0), Vector(67.0), Vector(68.0)), Vector(Vector(69.0))), s0(Vector(Vector(70.0), Vector(71.0), Vector(72.0)), Vector(Vector(73.0), Vector(74.0), Vector(75.0)), Vector(Vector(76.0)))))), Vector(Vector(s0(Vector(Vector(77.0), Vector(78.0), Vector(79.0)), Vector(Vector(80.0), Vector(81.0), Vector(82.0)), Vector(Vector(83.0))))), s0(Vector(Vector(84.0), Vector(85.0), Vector(86.0)), Vector(Vector(87.0), Vector(88.0), Vector(89.0)), Vector(Vector(90.0)))), Vector(s0(Vector(Vector(91.0), Vector(92.0), Vector(93.0)), Vector(Vector(94.0), Vector(95.0), Vector(96.0)), Vector(Vector(97.0))))), s4(s2(Vector(s1(Vector(s0(Vector(Vector(98.0), Vector(99.0), Vector(100.0)), Vector(Vector(101.0), Vector(102.0), Vector(103.0)), Vector(Vector(104.0)))), Vector(s0(Vector(Vector(105.0), Vector(106.0), Vector(107.0)), Vector(Vector(108.0), Vector(109.0), Vector(110.0)), Vector(Vector(111.0))), s0(Vector(Vector(112.0), Vector(113.0), Vector(114.0)), Vector(Vector(115.0), Vector(116.0), Vector(117.0)), Vector(Vector(118.0))), s0(Vector(Vector(119.0), Vector(120.0), Vector(121.0)), Vector(Vector(122.0), Vector(123.0), Vector(124.0)), Vector(Vector(125.0)))))), Vector(Vector(s0(Vector(Vector(126.0), Vector(127.0), Vector(128.0)), Vector(Vector(129.0), Vector(130.0), Vector(131.0)), Vector(Vector(132.0))))), s0(Vector(Vector(133.0), Vector(134.0), Vector(135.0)), Vector(Vector(136.0), Vector(137.0), Vector(138.0)), Vector(Vector(139.0)))), Vector(s0(Vector(Vector(140.0), Vector(141.0), Vector(142.0)), Vector(Vector(143.0), Vector(144.0), Vector(145.0)), Vector(Vector(146.0)))))), Vector(s0(Vector(Vector(147.0), Vector(148.0), Vector(149.0)), Vector(Vector(150.0), Vector(151.0), Vector(152.0)), Vector(Vector(153.0))))), s7(Vector(s4(s2(Vector(s1(Vector(s0(Vector(Vector(154.0), Vector(155.0), Vector(156.0)), Vector(Vector(157.0), Vector(158.0), Vector(159.0)), Vector(Vector(160.0)))), Vector(s0(Vector(Vector(161.0), Vector(162.0), Vector(163.0)), Vector(Vector(164.0), Vector(165.0), Vector(166.0)), Vector(Vector(167.0))), s0(Vector(Vector(168.0), Vector(169.0), Vector(170.0)), Vector(Vector(171.0), Vector(172.0), Vector(173.0)), Vector(Vector(174.0))), s0(Vector(Vector(175.0), Vector(176.0), Vector(177.0)), Vector(Vector(178.0), Vector(179.0), Vector(180.0)), Vector(Vector(181.0)))))), Vector(Vector(s0(Vector(Vector(182.0), Vector(183.0), Vector(184.0)), Vector(Vector(185.0), Vector(186.0), Vector(187.0)), Vector(Vector(188.0))))), s0(Vector(Vector(189.0), Vector(190.0), Vector(191.0)), Vector(Vector(192.0), Vector(193.0), Vector(194.0)), Vector(Vector(195.0)))), Vector(s0(Vector(Vector(196.0), Vector(197.0), Vector(198.0)), Vector(Vector(199.0), Vector(200.0), Vector(201.0)), Vector(Vector(202.0))))), s4(s2(Vector(s1(Vector(s0(Vector(Vector(203.0), Vector(204.0), Vector(205.0)), Vector(Vector(206.0), Vector(207.0), Vector(208.0)), Vector(Vector(209.0)))), Vector(s0(Vector(Vector(210.0), Vector(211.0), Vector(212.0)), Vector(Vector(213.0), Vector(214.0), Vector(215.0)), Vector(Vector(216.0))), s0(Vector(Vector(217.0), Vector(218.0), Vector(219.0)), Vector(Vector(220.0), Vector(221.0), Vector(222.0)), Vector(Vector(223.0))), s0(Vector(Vector(224.0), Vector(225.0), Vector(226.0)), Vector(Vector(227.0), Vector(228.0), Vector(229.0)), Vector(Vector(230.0)))))), Vector(Vector(s0(Vector(Vector(231.0), Vector(232.0), Vector(233.0)), Vector(Vector(234.0), Vector(235.0), Vector(236.0)), Vector(Vector(237.0))))), s0(Vector(Vector(238.0), Vector(239.0), Vector(240.0)), Vector(Vector(241.0), Vector(242.0), Vector(243.0)), Vector(Vector(244.0)))), Vector(s0(Vector(Vector(245.0), Vector(246.0), Vector(247.0)), Vector(Vector(248.0), Vector(249.0), Vector(250.0)), Vector(Vector(251.0))))), s4(s2(Vector(s1(Vector(s0(Vector(Vector(252.0), Vector(253.0), Vector(254.0)), Vector(Vector(255.0), Vector(256.0), Vector(257.0)), Vector(Vector(258.0)))), Vector(s0(Vector(Vector(259.0), Vector(260.0), Vector(261.0)), Vector(Vector(262.0), Vector(263.0), Vector(264.0)), Vector(Vector(265.0))), s0(Vector(Vector(266.0), Vector(267.0), Vector(268.0)), Vector(Vector(269.0), Vector(270.0), Vector(271.0)), Vector(Vector(272.0))), s0(Vector(Vector(273.0), Vector(274.0), Vector(275.0)), Vector(Vector(276.0), Vector(277.0), Vector(278.0)), Vector(Vector(279.0)))))), Vector(Vector(s0(Vector(Vector(280.0), Vector(281.0), Vector(282.0)), Vector(Vector(283.0), Vector(284.0), Vector(285.0)), Vector(Vector(286.0))))), s0(Vector(Vector(287.0), Vector(288.0), Vector(289.0)), Vector(Vector(290.0), Vector(291.0), Vector(292.0)), Vector(Vector(293.0)))), Vector(s0(Vector(Vector(294.0), Vector(295.0), Vector(296.0)), Vector(Vector(297.0), Vector(298.0), Vector(299.0)), Vector(Vector(300.0)))))), Vector(s0(Vector(Vector(301.0), Vector(302.0), Vector(303.0)), Vector(Vector(304.0), Vector(305.0), Vector(306.0)), Vector(Vector(307.0))))))
    val v1: Double = 308.0
    val start = nanoTime()
    var result: Double = 308.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}