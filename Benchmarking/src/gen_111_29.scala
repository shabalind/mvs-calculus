import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Double],
    p2: Vector[Vector[Double]],
    p3: Vector[Vector[Double]],
    p4: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: Vector[s0],
    p1: Vector[Vector[s1]]
  )
  case class s3 (
    p0: Double,
    p1: Vector[Vector[s1]]
  )
  case class s4 (
    p0: s3,
    p1: s3,
    p2: Vector[Vector[s0]],
    p3: Vector[s1],
    p4: s2
  )
  case class s9 (
    p0: Vector[Vector[s4]],
    p1: s2
  )
  def f26(v0: Double): Double = {
    var v7: Double = v0
    var v4: Double = v0
    v7 = v4
    var v8: Double = v4
    var v5: Double = v7
    var v3: Double = v8
    var v1: Double = v0
    v4 = v7
    var v2: Double = v7
    var v13: Double = v7
    var v9: Double = v5
    var v10: Double = v1
    val v6: Double = v8 + v5
    var v21: Double = v9
    var v11: Double = v2
    var v18: Double = v3
    var v12: Double = v1
    var v22: Double = v10
    var v14: Double = v2
    v5 = v18
    var v55: Double = v11
    var v43: Double = v6
    v7 = v22
    var v49: Double = v14
    v5 = v43
    var v30: Double = v11
    var v54: Double = v10
    var v19: Double = v21
    val v45: Double = v4 * v30
    v21 = v43
    var v56: Double = v54
    var v74: Double = v45
    val v52: Vector[Double] = Vector(v4, v49, v19, v74, v12)
    var v119: Vector[Double] = v52
    v119 = v119.updated(4, v56)
    v119 = v119.updated(0, v43)
    v119 = v119.updated(3, v55)
    val v48: Double = v119(0)
    v74 = v13
    v48
  }
  @noinline
  def f0(v0: s9, v1: Double): Double = {
    var v2: Double = v1
    val v4: Double = f26(v2)
    var v10: Double = v2
    val v11: Double = v10 - v4
    val v25: Double = v11 / v1
    val v61: Double = v4 * v25
    v61
  }
  def benchmark(): Unit = {
    val v0: s9 = s9(Vector(Vector(s4(s3(0.0, Vector(Vector(s1(s0(Vector(Vector(1.0), Vector(2.0)), Vector(3.0, 4.0, 5.0), Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0)), Vector(14.0, 15.0, 16.0), Vector(Vector(17.0), Vector(18.0)), Vector(Vector(19.0), Vector(20.0), Vector(21.0)), Vector(Vector(22.0))))), Vector(s1(s0(Vector(Vector(23.0), Vector(24.0)), Vector(25.0, 26.0, 27.0), Vector(Vector(28.0), Vector(29.0)), Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0))), s0(Vector(Vector(34.0), Vector(35.0)), Vector(36.0, 37.0, 38.0), Vector(Vector(39.0), Vector(40.0)), Vector(Vector(41.0), Vector(42.0), Vector(43.0)), Vector(Vector(44.0))))), Vector(s1(s0(Vector(Vector(45.0), Vector(46.0)), Vector(47.0, 48.0, 49.0), Vector(Vector(50.0), Vector(51.0)), Vector(Vector(52.0), Vector(53.0), Vector(54.0)), Vector(Vector(55.0))), s0(Vector(Vector(56.0), Vector(57.0)), Vector(58.0, 59.0, 60.0), Vector(Vector(61.0), Vector(62.0)), Vector(Vector(63.0), Vector(64.0), Vector(65.0)), Vector(Vector(66.0))))))), s3(67.0, Vector(Vector(s1(s0(Vector(Vector(68.0), Vector(69.0)), Vector(70.0, 71.0, 72.0), Vector(Vector(73.0), Vector(74.0)), Vector(Vector(75.0), Vector(76.0), Vector(77.0)), Vector(Vector(78.0))), s0(Vector(Vector(79.0), Vector(80.0)), Vector(81.0, 82.0, 83.0), Vector(Vector(84.0), Vector(85.0)), Vector(Vector(86.0), Vector(87.0), Vector(88.0)), Vector(Vector(89.0))))), Vector(s1(s0(Vector(Vector(90.0), Vector(91.0)), Vector(92.0, 93.0, 94.0), Vector(Vector(95.0), Vector(96.0)), Vector(Vector(97.0), Vector(98.0), Vector(99.0)), Vector(Vector(100.0))), s0(Vector(Vector(101.0), Vector(102.0)), Vector(103.0, 104.0, 105.0), Vector(Vector(106.0), Vector(107.0)), Vector(Vector(108.0), Vector(109.0), Vector(110.0)), Vector(Vector(111.0))))), Vector(s1(s0(Vector(Vector(112.0), Vector(113.0)), Vector(114.0, 115.0, 116.0), Vector(Vector(117.0), Vector(118.0)), Vector(Vector(119.0), Vector(120.0), Vector(121.0)), Vector(Vector(122.0))), s0(Vector(Vector(123.0), Vector(124.0)), Vector(125.0, 126.0, 127.0), Vector(Vector(128.0), Vector(129.0)), Vector(Vector(130.0), Vector(131.0), Vector(132.0)), Vector(Vector(133.0))))))), Vector(Vector(s0(Vector(Vector(134.0), Vector(135.0)), Vector(136.0, 137.0, 138.0), Vector(Vector(139.0), Vector(140.0)), Vector(Vector(141.0), Vector(142.0), Vector(143.0)), Vector(Vector(144.0)))), Vector(s0(Vector(Vector(145.0), Vector(146.0)), Vector(147.0, 148.0, 149.0), Vector(Vector(150.0), Vector(151.0)), Vector(Vector(152.0), Vector(153.0), Vector(154.0)), Vector(Vector(155.0))))), Vector(s1(s0(Vector(Vector(156.0), Vector(157.0)), Vector(158.0, 159.0, 160.0), Vector(Vector(161.0), Vector(162.0)), Vector(Vector(163.0), Vector(164.0), Vector(165.0)), Vector(Vector(166.0))), s0(Vector(Vector(167.0), Vector(168.0)), Vector(169.0, 170.0, 171.0), Vector(Vector(172.0), Vector(173.0)), Vector(Vector(174.0), Vector(175.0), Vector(176.0)), Vector(Vector(177.0)))), s1(s0(Vector(Vector(178.0), Vector(179.0)), Vector(180.0, 181.0, 182.0), Vector(Vector(183.0), Vector(184.0)), Vector(Vector(185.0), Vector(186.0), Vector(187.0)), Vector(Vector(188.0))), s0(Vector(Vector(189.0), Vector(190.0)), Vector(191.0, 192.0, 193.0), Vector(Vector(194.0), Vector(195.0)), Vector(Vector(196.0), Vector(197.0), Vector(198.0)), Vector(Vector(199.0)))), s1(s0(Vector(Vector(200.0), Vector(201.0)), Vector(202.0, 203.0, 204.0), Vector(Vector(205.0), Vector(206.0)), Vector(Vector(207.0), Vector(208.0), Vector(209.0)), Vector(Vector(210.0))), s0(Vector(Vector(211.0), Vector(212.0)), Vector(213.0, 214.0, 215.0), Vector(Vector(216.0), Vector(217.0)), Vector(Vector(218.0), Vector(219.0), Vector(220.0)), Vector(Vector(221.0))))), s2(Vector(s0(Vector(Vector(222.0), Vector(223.0)), Vector(224.0, 225.0, 226.0), Vector(Vector(227.0), Vector(228.0)), Vector(Vector(229.0), Vector(230.0), Vector(231.0)), Vector(Vector(232.0))), s0(Vector(Vector(233.0), Vector(234.0)), Vector(235.0, 236.0, 237.0), Vector(Vector(238.0), Vector(239.0)), Vector(Vector(240.0), Vector(241.0), Vector(242.0)), Vector(Vector(243.0))), s0(Vector(Vector(244.0), Vector(245.0)), Vector(246.0, 247.0, 248.0), Vector(Vector(249.0), Vector(250.0)), Vector(Vector(251.0), Vector(252.0), Vector(253.0)), Vector(Vector(254.0)))), Vector(Vector(s1(s0(Vector(Vector(255.0), Vector(256.0)), Vector(257.0, 258.0, 259.0), Vector(Vector(260.0), Vector(261.0)), Vector(Vector(262.0), Vector(263.0), Vector(264.0)), Vector(Vector(265.0))), s0(Vector(Vector(266.0), Vector(267.0)), Vector(268.0, 269.0, 270.0), Vector(Vector(271.0), Vector(272.0)), Vector(Vector(273.0), Vector(274.0), Vector(275.0)), Vector(Vector(276.0)))))))))), s2(Vector(s0(Vector(Vector(277.0), Vector(278.0)), Vector(279.0, 280.0, 281.0), Vector(Vector(282.0), Vector(283.0)), Vector(Vector(284.0), Vector(285.0), Vector(286.0)), Vector(Vector(287.0))), s0(Vector(Vector(288.0), Vector(289.0)), Vector(290.0, 291.0, 292.0), Vector(Vector(293.0), Vector(294.0)), Vector(Vector(295.0), Vector(296.0), Vector(297.0)), Vector(Vector(298.0))), s0(Vector(Vector(299.0), Vector(300.0)), Vector(301.0, 302.0, 303.0), Vector(Vector(304.0), Vector(305.0)), Vector(Vector(306.0), Vector(307.0), Vector(308.0)), Vector(Vector(309.0)))), Vector(Vector(s1(s0(Vector(Vector(310.0), Vector(311.0)), Vector(312.0, 313.0, 314.0), Vector(Vector(315.0), Vector(316.0)), Vector(Vector(317.0), Vector(318.0), Vector(319.0)), Vector(Vector(320.0))), s0(Vector(Vector(321.0), Vector(322.0)), Vector(323.0, 324.0, 325.0), Vector(Vector(326.0), Vector(327.0)), Vector(Vector(328.0), Vector(329.0), Vector(330.0)), Vector(Vector(331.0))))))))
    val v1: Double = 332.0
    val start = nanoTime()
    var result: Double = 332.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}