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
    p1: Vector[Vector[s1]]
  )
  case class s3 (
    p0: Double,
    p1: Vector[s0]
  )
  case class s5 (
    p0: Vector[s2],
    p1: s3
  )
  case class s6 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s8 (
    p0: Vector[Vector[s3]],
    p1: s5
  )
  case class s10 (
    p0: Vector[Vector[s6]],
    p1: s8
  )
  def f11(v0: s1): s1 = {
    var v7: s1 = v0
    v7 = v0
    v7 = v0
    val v5: Vector[s0] = v0.p1
    val v4: s0 = v5(0)
    var v6: s0 = v4
    v7 = v7.copy(p1 = v5)
    val v1: s0 = v7.p0
    var v2: s1 = v0
    v6 = v1
    v2 = v2.copy(p0 = v6)
    val v10: Vector[s0] = v2.p1
    v7 = v0
    var v33: s1 = v2
    v2 = v2.copy(p1 = v10)
    v2 = v2.copy(p1 = v10)
    v33
  }
  @noinline
  def f0(v0: s1, v1: Vector[Vector[s1]], v2: s10, v3: s3, v4: Double): Double = {
    val v7: Vector[s1] = v1(0)
    val v6: s1 = v7(0)
    val v10: s1 = f11(v6)
    var v13: s1 = v10
    val v16: s0 = v13.p0
    v13 = v13.copy(p0 = v16)
    v13 = v6
    val v31: Vector[Vector[Double]] = v16.p0
    val v47: Vector[Double] = v31(0)
    val v25: s0 = s0(v31, v31)
    v13 = v13.copy(p0 = v25)
    val v51: Double = v47(0)
    v51
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0))), Vector(s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0)))))
    val v1: Vector[Vector[s1]] = Vector(Vector(s1(s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))), Vector(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0))), s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0)))))))
    val v2: s10 = s10(Vector(Vector(s6(s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0), Vector(40.0), Vector(41.0))), Vector(s0(Vector(Vector(42.0), Vector(43.0), Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0))), s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0), Vector(52.0), Vector(53.0))), s0(Vector(Vector(54.0), Vector(55.0), Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0)))))), Vector(s6(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0), Vector(64.0), Vector(65.0))), Vector(s0(Vector(Vector(66.0), Vector(67.0), Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0))), s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)), Vector(Vector(75.0), Vector(76.0), Vector(77.0))), s0(Vector(Vector(78.0), Vector(79.0), Vector(80.0)), Vector(Vector(81.0), Vector(82.0), Vector(83.0)))))), Vector(s6(s0(Vector(Vector(84.0), Vector(85.0), Vector(86.0)), Vector(Vector(87.0), Vector(88.0), Vector(89.0))), Vector(s0(Vector(Vector(90.0), Vector(91.0), Vector(92.0)), Vector(Vector(93.0), Vector(94.0), Vector(95.0))), s0(Vector(Vector(96.0), Vector(97.0), Vector(98.0)), Vector(Vector(99.0), Vector(100.0), Vector(101.0))), s0(Vector(Vector(102.0), Vector(103.0), Vector(104.0)), Vector(Vector(105.0), Vector(106.0), Vector(107.0))))))), s8(Vector(Vector(s3(108.0, Vector(s0(Vector(Vector(109.0), Vector(110.0), Vector(111.0)), Vector(Vector(112.0), Vector(113.0), Vector(114.0))), s0(Vector(Vector(115.0), Vector(116.0), Vector(117.0)), Vector(Vector(118.0), Vector(119.0), Vector(120.0))))))), s5(Vector(s2(s1(s0(Vector(Vector(121.0), Vector(122.0), Vector(123.0)), Vector(Vector(124.0), Vector(125.0), Vector(126.0))), Vector(s0(Vector(Vector(127.0), Vector(128.0), Vector(129.0)), Vector(Vector(130.0), Vector(131.0), Vector(132.0))), s0(Vector(Vector(133.0), Vector(134.0), Vector(135.0)), Vector(Vector(136.0), Vector(137.0), Vector(138.0))))), Vector(Vector(s1(s0(Vector(Vector(139.0), Vector(140.0), Vector(141.0)), Vector(Vector(142.0), Vector(143.0), Vector(144.0))), Vector(s0(Vector(Vector(145.0), Vector(146.0), Vector(147.0)), Vector(Vector(148.0), Vector(149.0), Vector(150.0))), s0(Vector(Vector(151.0), Vector(152.0), Vector(153.0)), Vector(Vector(154.0), Vector(155.0), Vector(156.0)))))), Vector(s1(s0(Vector(Vector(157.0), Vector(158.0), Vector(159.0)), Vector(Vector(160.0), Vector(161.0), Vector(162.0))), Vector(s0(Vector(Vector(163.0), Vector(164.0), Vector(165.0)), Vector(Vector(166.0), Vector(167.0), Vector(168.0))), s0(Vector(Vector(169.0), Vector(170.0), Vector(171.0)), Vector(Vector(172.0), Vector(173.0), Vector(174.0)))))))), s2(s1(s0(Vector(Vector(175.0), Vector(176.0), Vector(177.0)), Vector(Vector(178.0), Vector(179.0), Vector(180.0))), Vector(s0(Vector(Vector(181.0), Vector(182.0), Vector(183.0)), Vector(Vector(184.0), Vector(185.0), Vector(186.0))), s0(Vector(Vector(187.0), Vector(188.0), Vector(189.0)), Vector(Vector(190.0), Vector(191.0), Vector(192.0))))), Vector(Vector(s1(s0(Vector(Vector(193.0), Vector(194.0), Vector(195.0)), Vector(Vector(196.0), Vector(197.0), Vector(198.0))), Vector(s0(Vector(Vector(199.0), Vector(200.0), Vector(201.0)), Vector(Vector(202.0), Vector(203.0), Vector(204.0))), s0(Vector(Vector(205.0), Vector(206.0), Vector(207.0)), Vector(Vector(208.0), Vector(209.0), Vector(210.0)))))), Vector(s1(s0(Vector(Vector(211.0), Vector(212.0), Vector(213.0)), Vector(Vector(214.0), Vector(215.0), Vector(216.0))), Vector(s0(Vector(Vector(217.0), Vector(218.0), Vector(219.0)), Vector(Vector(220.0), Vector(221.0), Vector(222.0))), s0(Vector(Vector(223.0), Vector(224.0), Vector(225.0)), Vector(Vector(226.0), Vector(227.0), Vector(228.0)))))))), s2(s1(s0(Vector(Vector(229.0), Vector(230.0), Vector(231.0)), Vector(Vector(232.0), Vector(233.0), Vector(234.0))), Vector(s0(Vector(Vector(235.0), Vector(236.0), Vector(237.0)), Vector(Vector(238.0), Vector(239.0), Vector(240.0))), s0(Vector(Vector(241.0), Vector(242.0), Vector(243.0)), Vector(Vector(244.0), Vector(245.0), Vector(246.0))))), Vector(Vector(s1(s0(Vector(Vector(247.0), Vector(248.0), Vector(249.0)), Vector(Vector(250.0), Vector(251.0), Vector(252.0))), Vector(s0(Vector(Vector(253.0), Vector(254.0), Vector(255.0)), Vector(Vector(256.0), Vector(257.0), Vector(258.0))), s0(Vector(Vector(259.0), Vector(260.0), Vector(261.0)), Vector(Vector(262.0), Vector(263.0), Vector(264.0)))))), Vector(s1(s0(Vector(Vector(265.0), Vector(266.0), Vector(267.0)), Vector(Vector(268.0), Vector(269.0), Vector(270.0))), Vector(s0(Vector(Vector(271.0), Vector(272.0), Vector(273.0)), Vector(Vector(274.0), Vector(275.0), Vector(276.0))), s0(Vector(Vector(277.0), Vector(278.0), Vector(279.0)), Vector(Vector(280.0), Vector(281.0), Vector(282.0))))))))), s3(283.0, Vector(s0(Vector(Vector(284.0), Vector(285.0), Vector(286.0)), Vector(Vector(287.0), Vector(288.0), Vector(289.0))), s0(Vector(Vector(290.0), Vector(291.0), Vector(292.0)), Vector(Vector(293.0), Vector(294.0), Vector(295.0))))))))
    val v3: s3 = s3(296.0, Vector(s0(Vector(Vector(297.0), Vector(298.0), Vector(299.0)), Vector(Vector(300.0), Vector(301.0), Vector(302.0))), s0(Vector(Vector(303.0), Vector(304.0), Vector(305.0)), Vector(Vector(306.0), Vector(307.0), Vector(308.0)))))
    val v4: Double = 309.0
    val start = nanoTime()
    var result: Double = 309.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}