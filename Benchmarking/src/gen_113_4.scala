import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: Vector[s0]
  )
  case class s2 (
    p0: Vector[Vector[s0]],
    p1: s1
  )
  case class s3 (
    p0: s2,
    p1: s0
  )
  case class s5 (
    p0: s0,
    p1: Vector[Vector[s3]]
  )
  case class s6 (
    p0: s1,
    p1: s5
  )
  def f7(v0: s0): s0 = {
    val v5: Vector[Vector[Double]] = v0.p1
    val v4: Vector[Vector[Double]] = v0.p0
    val v1: Vector[Vector[Double]] = v0.p1
    val v8: Vector[Vector[Double]] = v0.p0
    var v14: Vector[Vector[Double]] = v8
    val v15: Vector[Vector[Double]] = v0.p0
    val v35: s0 = s0(v4, v1)
    var v53: Vector[Vector[Double]] = v1
    var v26: s0 = v35
    v26 = v26.copy(p0 = v5)
    v26 = v26.copy(p0 = v53)
    v26 = v26.copy(p0 = v15)
    v26 = v26.copy(p1 = v14)
    v26 = v26.copy(p1 = v15)
    v26
  }
  def f6(v0: s3, v1: s0): s0 = {
    var v6: s0 = v1
    var v7: s0 = v6
    val v9: Vector[Vector[Double]] = v6.p0
    val v8: Vector[Double] = v9(1)
    var v11: Vector[Vector[Double]] = v9
    val v13: Vector[Vector[Double]] = v6.p1
    v6 = v6.copy(p0 = v9)
    var v14: Vector[Double] = v8
    v7 = v7.copy(p0 = v9)
    v11 = v11.updated(2, v14)
    val v20: Vector[Vector[Double]] = v7.p0
    v11 = v11.updated(0, v8)
    val v24: Vector[Vector[Vector[Double]]] = Vector(v13)
    v11 = v11.updated(0, v8)
    val v34: s0 = s0(v11, v11)
    val v50: Vector[Double] = v13(1)
    val v29: Double = v50(0)
    v6 = v6.copy(p1 = v20)
    var v38: Vector[Vector[Vector[Double]]] = v24
    v11 = v11.updated(2, v14)
    v14 = v14.updated(0, v29)
    val v136: Vector[Vector[Double]] = v38(0)
    v6 = v6.copy(p0 = v9)
    v6 = v6.copy(p1 = v9)
    val v94: Vector[Double] = v136(2)
    v11 = v11.updated(2, v94)
    v34
  }
  def f4(v0: s0): s0 = {
    val v4: s0 = f7(v0)
    val v6: Vector[Vector[Double]] = v0.p0
    val v5: Vector[Vector[Double]] = v4.p1
    var v3: s0 = v0
    val v1: s0 = f7(v4)
    val v11: Vector[Vector[Double]] = v0.p1
    val v8: Vector[Vector[Double]] = v0.p0
    var v13: s0 = v0
    val v15: s0 = f7(v3)
    val v23: Vector[Double] = v11(1)
    val v9: s0 = f7(v15)
    v13 = v13.copy(p1 = v8)
    v13 = v13.copy(p0 = v8)
    v13 = v1
    val v19: Vector[Vector[Double]] = v1.p1
    val v37: Double = v23(0)
    var v25: Double = v37
    val v16: s0 = f7(v3)
    var v35: Vector[Vector[Double]] = v5
    v13 = v13.copy(p1 = v5)
    var v26: Vector[Double] = v23
    var v30: Vector[Double] = v26
    val v24: s0 = f7(v3)
    v13 = v9
    val v40: Vector[Vector[Double]] = v0.p1
    var v42: Vector[Vector[Double]] = v35
    val v56: Vector[s0] = Vector(v4)
    val v31: s0 = v56(0)
    val v38: s0 = f7(v15)
    val v69: Vector[Vector[Double]] = v38.p0
    v3 = v3.copy(p0 = v69)
    v3 = v3.copy(p1 = v8)
    val v53: s0 = f7(v24)
    v30 = v30.updated(0, v25)
    val v54: Vector[Vector[Double]] = v53.p0
    var v58: s0 = v13
    var v50: Vector[Vector[Double]] = v40
    val v47: Vector[Vector[Double]] = v31.p1
    v13 = v13.copy(p1 = v47)
    v42 = v50
    val v73: s0 = f7(v58)
    val v75: Vector[Vector[Double]] = v58.p0
    v3 = v16
    v26 = v26.updated(0, v37)
    val v187: Vector[Double] = v54(2)
    v13 = v13.copy(p0 = v6)
    v3 = v3.copy(p1 = v19)
    v50 = v50.updated(0, v30)
    v42 = v42.updated(0, v187)
    v42 = v75
    v58 = v58.copy(p1 = v42)
    val v149: s0 = f7(v73)
    v13 = v13.copy(p0 = v8)
    v3 = v3.copy(p0 = v11)
    v149
  }
  @noinline
  def f0(v0: Vector[Vector[s6]], v1: s5, v2: s2, v3: Double): Double = {
    val v8: Vector[s6] = v0(0)
    val v6: s6 = v8(0)
    val v13: s5 = v6.p1
    val v12: Vector[Vector[s3]] = v13.p1
    val v33: Vector[s3] = v12(0)
    val v10: Vector[Vector[s3]] = v1.p1
    var v24: s6 = v6
    val v49: s1 = v24.p0
    var v79: s5 = v1
    val v19: Vector[s0] = v49.p1
    val v23: s0 = v79.p0
    val v61: s3 = v33(0)
    val v41: s0 = v19(0)
    val v65: s0 = f6(v61, v23)
    v79 = v79.copy(p1 = v10)
    v79 = v79.copy(p1 = v10)
    val v48: s0 = f4(v41)
    v79 = v79.copy(p0 = v48)
    val v164: Vector[Vector[Double]] = v65.p0
    val v139: Vector[Double] = v164(0)
    val v103: Double = v139(0)
    v103
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s6]] = Vector(Vector(s6(s1(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0)))), Vector(s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))))), Vector(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0))), s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))))), s5(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0))), Vector(Vector(s3(s2(Vector(Vector(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0))))), s1(Vector(Vector(s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0), Vector(40.0), Vector(41.0)))), Vector(s0(Vector(Vector(42.0), Vector(43.0), Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0))))), Vector(s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0), Vector(52.0), Vector(53.0))), s0(Vector(Vector(54.0), Vector(55.0), Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0)))))), s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0), Vector(64.0), Vector(65.0))))), Vector(s3(s2(Vector(Vector(s0(Vector(Vector(66.0), Vector(67.0), Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0))))), s1(Vector(Vector(s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)), Vector(Vector(75.0), Vector(76.0), Vector(77.0)))), Vector(s0(Vector(Vector(78.0), Vector(79.0), Vector(80.0)), Vector(Vector(81.0), Vector(82.0), Vector(83.0))))), Vector(s0(Vector(Vector(84.0), Vector(85.0), Vector(86.0)), Vector(Vector(87.0), Vector(88.0), Vector(89.0))), s0(Vector(Vector(90.0), Vector(91.0), Vector(92.0)), Vector(Vector(93.0), Vector(94.0), Vector(95.0)))))), s0(Vector(Vector(96.0), Vector(97.0), Vector(98.0)), Vector(Vector(99.0), Vector(100.0), Vector(101.0))))))))), Vector(s6(s1(Vector(Vector(s0(Vector(Vector(102.0), Vector(103.0), Vector(104.0)), Vector(Vector(105.0), Vector(106.0), Vector(107.0)))), Vector(s0(Vector(Vector(108.0), Vector(109.0), Vector(110.0)), Vector(Vector(111.0), Vector(112.0), Vector(113.0))))), Vector(s0(Vector(Vector(114.0), Vector(115.0), Vector(116.0)), Vector(Vector(117.0), Vector(118.0), Vector(119.0))), s0(Vector(Vector(120.0), Vector(121.0), Vector(122.0)), Vector(Vector(123.0), Vector(124.0), Vector(125.0))))), s5(s0(Vector(Vector(126.0), Vector(127.0), Vector(128.0)), Vector(Vector(129.0), Vector(130.0), Vector(131.0))), Vector(Vector(s3(s2(Vector(Vector(s0(Vector(Vector(132.0), Vector(133.0), Vector(134.0)), Vector(Vector(135.0), Vector(136.0), Vector(137.0))))), s1(Vector(Vector(s0(Vector(Vector(138.0), Vector(139.0), Vector(140.0)), Vector(Vector(141.0), Vector(142.0), Vector(143.0)))), Vector(s0(Vector(Vector(144.0), Vector(145.0), Vector(146.0)), Vector(Vector(147.0), Vector(148.0), Vector(149.0))))), Vector(s0(Vector(Vector(150.0), Vector(151.0), Vector(152.0)), Vector(Vector(153.0), Vector(154.0), Vector(155.0))), s0(Vector(Vector(156.0), Vector(157.0), Vector(158.0)), Vector(Vector(159.0), Vector(160.0), Vector(161.0)))))), s0(Vector(Vector(162.0), Vector(163.0), Vector(164.0)), Vector(Vector(165.0), Vector(166.0), Vector(167.0))))), Vector(s3(s2(Vector(Vector(s0(Vector(Vector(168.0), Vector(169.0), Vector(170.0)), Vector(Vector(171.0), Vector(172.0), Vector(173.0))))), s1(Vector(Vector(s0(Vector(Vector(174.0), Vector(175.0), Vector(176.0)), Vector(Vector(177.0), Vector(178.0), Vector(179.0)))), Vector(s0(Vector(Vector(180.0), Vector(181.0), Vector(182.0)), Vector(Vector(183.0), Vector(184.0), Vector(185.0))))), Vector(s0(Vector(Vector(186.0), Vector(187.0), Vector(188.0)), Vector(Vector(189.0), Vector(190.0), Vector(191.0))), s0(Vector(Vector(192.0), Vector(193.0), Vector(194.0)), Vector(Vector(195.0), Vector(196.0), Vector(197.0)))))), s0(Vector(Vector(198.0), Vector(199.0), Vector(200.0)), Vector(Vector(201.0), Vector(202.0), Vector(203.0))))))))))
    val v1: s5 = s5(s0(Vector(Vector(204.0), Vector(205.0), Vector(206.0)), Vector(Vector(207.0), Vector(208.0), Vector(209.0))), Vector(Vector(s3(s2(Vector(Vector(s0(Vector(Vector(210.0), Vector(211.0), Vector(212.0)), Vector(Vector(213.0), Vector(214.0), Vector(215.0))))), s1(Vector(Vector(s0(Vector(Vector(216.0), Vector(217.0), Vector(218.0)), Vector(Vector(219.0), Vector(220.0), Vector(221.0)))), Vector(s0(Vector(Vector(222.0), Vector(223.0), Vector(224.0)), Vector(Vector(225.0), Vector(226.0), Vector(227.0))))), Vector(s0(Vector(Vector(228.0), Vector(229.0), Vector(230.0)), Vector(Vector(231.0), Vector(232.0), Vector(233.0))), s0(Vector(Vector(234.0), Vector(235.0), Vector(236.0)), Vector(Vector(237.0), Vector(238.0), Vector(239.0)))))), s0(Vector(Vector(240.0), Vector(241.0), Vector(242.0)), Vector(Vector(243.0), Vector(244.0), Vector(245.0))))), Vector(s3(s2(Vector(Vector(s0(Vector(Vector(246.0), Vector(247.0), Vector(248.0)), Vector(Vector(249.0), Vector(250.0), Vector(251.0))))), s1(Vector(Vector(s0(Vector(Vector(252.0), Vector(253.0), Vector(254.0)), Vector(Vector(255.0), Vector(256.0), Vector(257.0)))), Vector(s0(Vector(Vector(258.0), Vector(259.0), Vector(260.0)), Vector(Vector(261.0), Vector(262.0), Vector(263.0))))), Vector(s0(Vector(Vector(264.0), Vector(265.0), Vector(266.0)), Vector(Vector(267.0), Vector(268.0), Vector(269.0))), s0(Vector(Vector(270.0), Vector(271.0), Vector(272.0)), Vector(Vector(273.0), Vector(274.0), Vector(275.0)))))), s0(Vector(Vector(276.0), Vector(277.0), Vector(278.0)), Vector(Vector(279.0), Vector(280.0), Vector(281.0)))))))
    val v2: s2 = s2(Vector(Vector(s0(Vector(Vector(282.0), Vector(283.0), Vector(284.0)), Vector(Vector(285.0), Vector(286.0), Vector(287.0))))), s1(Vector(Vector(s0(Vector(Vector(288.0), Vector(289.0), Vector(290.0)), Vector(Vector(291.0), Vector(292.0), Vector(293.0)))), Vector(s0(Vector(Vector(294.0), Vector(295.0), Vector(296.0)), Vector(Vector(297.0), Vector(298.0), Vector(299.0))))), Vector(s0(Vector(Vector(300.0), Vector(301.0), Vector(302.0)), Vector(Vector(303.0), Vector(304.0), Vector(305.0))), s0(Vector(Vector(306.0), Vector(307.0), Vector(308.0)), Vector(Vector(309.0), Vector(310.0), Vector(311.0))))))
    val v3: Double = 312.0
    val start = nanoTime()
    var result: Double = 312.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}