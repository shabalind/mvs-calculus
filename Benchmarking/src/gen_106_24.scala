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
    p1: Vector[Vector[s1]]
  )
  case class s4 (
    p0: Vector[Vector[s2]],
    p1: Vector[s1]
  )
  case class s5 (
    p0: Vector[Vector[s4]],
    p1: Vector[Vector[s2]]
  )
  def f70(v0: Double): Double = {
    var v1: Double = v0
    var v3: Double = v0
    var v4: Double = v0
    var v7: Double = v0
    var v12: Double = v4
    var v6: Double = v3
    var v8: Double = v0
    val v10: Double = v1 + v3
    var v5: Double = v6
    var v18: Double = v12
    var v11: Double = v0
    var v9: Double = v4
    var v17: Double = v3
    var v14: Double = v5
    var v29: Double = v14
    var v20: Double = v9
    var v46: Double = v14
    var v28: Double = v11
    var v42: Double = v28
    var v25: Double = v8
    var v57: Double = v20
    var v56: Double = v28
    val v50: Vector[Double] = Vector(v25, v7, v8, v57, v42, v57, v17)
    var v33: Vector[Double] = v50
    v33 = v33.updated(2, v56)
    var v39: Vector[Double] = v50
    v39 = v39.updated(5, v18)
    var v48: Double = v10
    v33 = v33.updated(2, v48)
    v33 = v33.updated(4, v1)
    v33 = v33.updated(2, v28)
    var v52: Double = v46
    v33 = v33.updated(4, v5)
    v33 = v33.updated(0, v29)
    val v44: Double = v50(3)
    val v59: Vector[Vector[Double]] = Vector(v39, v39, v39, v50, v33, v39)
    v33 = v33.updated(0, v10)
    v33 = v33.updated(2, v52)
    val v55: Vector[Double] = v59(5)
    val v77: Double = v33(6)
    v33 = v55
    v33 = v33.updated(4, v3)
    v1 = v44
    v39 = v39.updated(5, v46)
    v77
  }
  @noinline
  def f0(v0: s5, v1: Double): Double = {
    var v3: Double = v1
    v3 = v1
    var v7: Double = v3
    var v27: Double = v7
    val v31: Double = f70(v27)
    v31
  }
  def benchmark(): Unit = {
    val v0: s5 = s5(Vector(Vector(s4(Vector(Vector(s2(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0)))), Vector(Vector(s1(Vector(s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0)))), Vector(s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0))), s0(Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0)))))), Vector(s1(Vector(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0)))), Vector(s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0), Vector(27.0))), s0(Vector(Vector(28.0), Vector(29.0)), Vector(Vector(30.0), Vector(31.0))), s0(Vector(Vector(32.0), Vector(33.0)), Vector(Vector(34.0), Vector(35.0))))))))), Vector(s2(Vector(s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0)))), Vector(Vector(s1(Vector(s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0)))), Vector(s0(Vector(Vector(44.0), Vector(45.0)), Vector(Vector(46.0), Vector(47.0))), s0(Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0), Vector(51.0))), s0(Vector(Vector(52.0), Vector(53.0)), Vector(Vector(54.0), Vector(55.0)))))), Vector(s1(Vector(s0(Vector(Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0)))), Vector(s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0), Vector(63.0))), s0(Vector(Vector(64.0), Vector(65.0)), Vector(Vector(66.0), Vector(67.0))), s0(Vector(Vector(68.0), Vector(69.0)), Vector(Vector(70.0), Vector(71.0)))))))))), Vector(s1(Vector(s0(Vector(Vector(72.0), Vector(73.0)), Vector(Vector(74.0), Vector(75.0)))), Vector(s0(Vector(Vector(76.0), Vector(77.0)), Vector(Vector(78.0), Vector(79.0))), s0(Vector(Vector(80.0), Vector(81.0)), Vector(Vector(82.0), Vector(83.0))), s0(Vector(Vector(84.0), Vector(85.0)), Vector(Vector(86.0), Vector(87.0))))), s1(Vector(s0(Vector(Vector(88.0), Vector(89.0)), Vector(Vector(90.0), Vector(91.0)))), Vector(s0(Vector(Vector(92.0), Vector(93.0)), Vector(Vector(94.0), Vector(95.0))), s0(Vector(Vector(96.0), Vector(97.0)), Vector(Vector(98.0), Vector(99.0))), s0(Vector(Vector(100.0), Vector(101.0)), Vector(Vector(102.0), Vector(103.0)))))))), Vector(s4(Vector(Vector(s2(Vector(s0(Vector(Vector(104.0), Vector(105.0)), Vector(Vector(106.0), Vector(107.0)))), Vector(Vector(s1(Vector(s0(Vector(Vector(108.0), Vector(109.0)), Vector(Vector(110.0), Vector(111.0)))), Vector(s0(Vector(Vector(112.0), Vector(113.0)), Vector(Vector(114.0), Vector(115.0))), s0(Vector(Vector(116.0), Vector(117.0)), Vector(Vector(118.0), Vector(119.0))), s0(Vector(Vector(120.0), Vector(121.0)), Vector(Vector(122.0), Vector(123.0)))))), Vector(s1(Vector(s0(Vector(Vector(124.0), Vector(125.0)), Vector(Vector(126.0), Vector(127.0)))), Vector(s0(Vector(Vector(128.0), Vector(129.0)), Vector(Vector(130.0), Vector(131.0))), s0(Vector(Vector(132.0), Vector(133.0)), Vector(Vector(134.0), Vector(135.0))), s0(Vector(Vector(136.0), Vector(137.0)), Vector(Vector(138.0), Vector(139.0))))))))), Vector(s2(Vector(s0(Vector(Vector(140.0), Vector(141.0)), Vector(Vector(142.0), Vector(143.0)))), Vector(Vector(s1(Vector(s0(Vector(Vector(144.0), Vector(145.0)), Vector(Vector(146.0), Vector(147.0)))), Vector(s0(Vector(Vector(148.0), Vector(149.0)), Vector(Vector(150.0), Vector(151.0))), s0(Vector(Vector(152.0), Vector(153.0)), Vector(Vector(154.0), Vector(155.0))), s0(Vector(Vector(156.0), Vector(157.0)), Vector(Vector(158.0), Vector(159.0)))))), Vector(s1(Vector(s0(Vector(Vector(160.0), Vector(161.0)), Vector(Vector(162.0), Vector(163.0)))), Vector(s0(Vector(Vector(164.0), Vector(165.0)), Vector(Vector(166.0), Vector(167.0))), s0(Vector(Vector(168.0), Vector(169.0)), Vector(Vector(170.0), Vector(171.0))), s0(Vector(Vector(172.0), Vector(173.0)), Vector(Vector(174.0), Vector(175.0)))))))))), Vector(s1(Vector(s0(Vector(Vector(176.0), Vector(177.0)), Vector(Vector(178.0), Vector(179.0)))), Vector(s0(Vector(Vector(180.0), Vector(181.0)), Vector(Vector(182.0), Vector(183.0))), s0(Vector(Vector(184.0), Vector(185.0)), Vector(Vector(186.0), Vector(187.0))), s0(Vector(Vector(188.0), Vector(189.0)), Vector(Vector(190.0), Vector(191.0))))), s1(Vector(s0(Vector(Vector(192.0), Vector(193.0)), Vector(Vector(194.0), Vector(195.0)))), Vector(s0(Vector(Vector(196.0), Vector(197.0)), Vector(Vector(198.0), Vector(199.0))), s0(Vector(Vector(200.0), Vector(201.0)), Vector(Vector(202.0), Vector(203.0))), s0(Vector(Vector(204.0), Vector(205.0)), Vector(Vector(206.0), Vector(207.0))))))))), Vector(Vector(s2(Vector(s0(Vector(Vector(208.0), Vector(209.0)), Vector(Vector(210.0), Vector(211.0)))), Vector(Vector(s1(Vector(s0(Vector(Vector(212.0), Vector(213.0)), Vector(Vector(214.0), Vector(215.0)))), Vector(s0(Vector(Vector(216.0), Vector(217.0)), Vector(Vector(218.0), Vector(219.0))), s0(Vector(Vector(220.0), Vector(221.0)), Vector(Vector(222.0), Vector(223.0))), s0(Vector(Vector(224.0), Vector(225.0)), Vector(Vector(226.0), Vector(227.0)))))), Vector(s1(Vector(s0(Vector(Vector(228.0), Vector(229.0)), Vector(Vector(230.0), Vector(231.0)))), Vector(s0(Vector(Vector(232.0), Vector(233.0)), Vector(Vector(234.0), Vector(235.0))), s0(Vector(Vector(236.0), Vector(237.0)), Vector(Vector(238.0), Vector(239.0))), s0(Vector(Vector(240.0), Vector(241.0)), Vector(Vector(242.0), Vector(243.0))))))))), Vector(s2(Vector(s0(Vector(Vector(244.0), Vector(245.0)), Vector(Vector(246.0), Vector(247.0)))), Vector(Vector(s1(Vector(s0(Vector(Vector(248.0), Vector(249.0)), Vector(Vector(250.0), Vector(251.0)))), Vector(s0(Vector(Vector(252.0), Vector(253.0)), Vector(Vector(254.0), Vector(255.0))), s0(Vector(Vector(256.0), Vector(257.0)), Vector(Vector(258.0), Vector(259.0))), s0(Vector(Vector(260.0), Vector(261.0)), Vector(Vector(262.0), Vector(263.0)))))), Vector(s1(Vector(s0(Vector(Vector(264.0), Vector(265.0)), Vector(Vector(266.0), Vector(267.0)))), Vector(s0(Vector(Vector(268.0), Vector(269.0)), Vector(Vector(270.0), Vector(271.0))), s0(Vector(Vector(272.0), Vector(273.0)), Vector(Vector(274.0), Vector(275.0))), s0(Vector(Vector(276.0), Vector(277.0)), Vector(Vector(278.0), Vector(279.0))))))))), Vector(s2(Vector(s0(Vector(Vector(280.0), Vector(281.0)), Vector(Vector(282.0), Vector(283.0)))), Vector(Vector(s1(Vector(s0(Vector(Vector(284.0), Vector(285.0)), Vector(Vector(286.0), Vector(287.0)))), Vector(s0(Vector(Vector(288.0), Vector(289.0)), Vector(Vector(290.0), Vector(291.0))), s0(Vector(Vector(292.0), Vector(293.0)), Vector(Vector(294.0), Vector(295.0))), s0(Vector(Vector(296.0), Vector(297.0)), Vector(Vector(298.0), Vector(299.0)))))), Vector(s1(Vector(s0(Vector(Vector(300.0), Vector(301.0)), Vector(Vector(302.0), Vector(303.0)))), Vector(s0(Vector(Vector(304.0), Vector(305.0)), Vector(Vector(306.0), Vector(307.0))), s0(Vector(Vector(308.0), Vector(309.0)), Vector(Vector(310.0), Vector(311.0))), s0(Vector(Vector(312.0), Vector(313.0)), Vector(Vector(314.0), Vector(315.0)))))))))))
    val v1: Double = 316.0
    val start = nanoTime()
    var result: Double = 316.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}