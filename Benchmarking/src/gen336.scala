import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Double]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  case class s2 (
    p0: s1,
    p1: Vector[s0]
  )
  case class s3 (
    p0: s2,
    p1: Vector[Vector[s1]]
  )
  def f45(v0: Double): Double = {
    var v8: Double = v0
    v8 = v0
    var v5: Double = v8
    var v1: Double = v5
    v1 = v8
    var v7: Double = v1
    var v6: Double = v8
    var v3: Double = v6
    var v10: Double = v3
    var v20: Double = v6
    var v19: Double = v5
    val v17: Vector[Double] = Vector(v5, v0, v19)
    val v12: Double = v17(1)
    val v34: Double = v17(0)
    var v13: Vector[Double] = v17
    val v23: Double = v13(0)
    v13 = v13.updated(2, v7)
    var v22: Double = v19
    val v21: Vector[Double] = Vector(v0, v1, v34, v20, v22, v1)
    v13 = v13.updated(0, v34)
    var v15: Double = v12
    v20 = v23
    var v38: Vector[Double] = v21
    val v60: Vector[Vector[Double]] = Vector(v38, v38, v38, v21)
    v19 = v0
    var v55: Vector[Vector[Double]] = v60
    val v100: Vector[Double] = v55(1)
    v19 = v10
    var v104: Vector[Double] = v100
    v104 = v104.updated(4, v15)
    v38 = v38.updated(2, v22)
    val v122: Double = v104(1)
    v122
  }
  def f43(v0: s2): s2 = {
    var v6: s2 = v0
    v6 = v0
    val v4: Vector[s0] = v6.p1
    v6 = v6.copy(p1 = v4)
    val v9: Vector[s0] = v0.p1
    var v1: s2 = v6
    v1 = v1.copy(p1 = v9)
    v1 = v1.copy(p1 = v4)
    v1 = v1.copy(p1 = v9)
    v6 = v6.copy(p1 = v9)
    var v60: s2 = v1
    v1 = v1.copy(p1 = v4)
    v1 = v60
    val v64: Vector[s0] = v60.p1
    v1 = v1.copy(p1 = v64)
    v60
  }
  def f42(v0: Vector[s3]): Vector[s3] = {
    val v5: s3 = v0(0)
    var v4: Vector[s3] = v0
    val v2: s3 = v4(0)
    val v6: s3 = v4(0)
    val v26: s2 = v2.p0
    val v15: s3 = v4(0)
    var v30: Vector[s3] = v4
    v4 = v4.updated(0, v15)
    v4 = v4.updated(0, v15)
    val v49: s3 = v0(0)
    val v86: s2 = v49.p0
    var v73: Vector[s3] = v30
    var v57: s3 = v5
    v4 = v4.updated(0, v6)
    v57 = v57.copy(p0 = v86)
    v30 = v73
    v4 = v30
    v57 = v57.copy(p0 = v26)
    v73 = v0
    v73 = v73.updated(0, v57)
    var v138: Vector[s3] = v73
    v138
  }
  def f22(v0: s1, v1: s3): s1 = {
    var v2: s3 = v1
    val v6: Vector[s3] = Vector(v2, v2, v2)
    var v4: Vector[s3] = v6
    v4 = v4.updated(2, v2)
    val v3: s3 = v4(0)
    val v8: s3 = v6(0)
    var v7: Vector[s3] = v4
    v4 = v4.updated(1, v2)
    v4 = v4.updated(2, v2)
    val v11: s3 = v6(0)
    v7 = v7.updated(1, v3)
    v4 = v4.updated(1, v1)
    var v10: Vector[s3] = v4
    v7 = v7.updated(0, v3)
    val v28: s3 = v10(2)
    v10 = v10.updated(1, v11)
    v10 = v4
    val v15: s2 = v28.p0
    val v19: s2 = f43(v15)
    v10 = v7
    var v27: s3 = v8
    v4 = v4.updated(2, v11)
    v4 = v4.updated(1, v8)
    val v82: s1 = v19.p0
    v10 = v10.updated(0, v27)
    var v142: Vector[s3] = v7
    v2 = v28
    v4 = v142
    v82
  }
  def f21(v0: s1): s1 = {
    val v6: Vector[s0] = v0.p0
    val v4: Vector[s0] = v0.p1
    var v2: s1 = v0
    v2 = v2.copy(p1 = v4)
    var v9: Vector[s0] = v4
    v9 = v4
    v2 = v2.copy(p1 = v4)
    var v10: s1 = v2
    val v16: Vector[s0] = v2.p1
    v2 = v2.copy(p1 = v16)
    val v26: Vector[s0] = v2.p0
    v10 = v10.copy(p1 = v9)
    val v27: s0 = v6(1)
    v2 = v2.copy(p1 = v9)
    v9 = v9.updated(1, v27)
    v2 = v2.copy(p1 = v4)
    v2 = v2.copy(p1 = v4)
    v2 = v2.copy(p0 = v26)
    v10
  }
  def f10(v0: Vector[s3]): Vector[s3] = {
    val v2: Vector[s3] = f42(v0)
    val v9: Vector[s3] = f42(v2)
    var v10: Vector[s3] = v9
    v10
  }
  @noinline
  def f0(v0: Vector[Vector[s3]], v1: s3, v2: Double): Double = {
    val v8: Vector[s3] = v0(0)
    var v11: Vector[s3] = v8
    val v13: s2 = v1.p0
    val v9: Vector[s3] = f10(v8)
    val v14: Vector[s3] = f10(v11)
    val v17: s3 = v14(0)
    val v16: s1 = v13.p0
    val v15: s3 = v8(0)
    val v12: s1 = f21(v16)
    val v20: Vector[s3] = f42(v9)
    v11 = v11.updated(0, v1)
    v11 = v11.updated(0, v1)
    val v28: s1 = f22(v12, v17)
    val v23: s3 = v20(0)
    val v46: Vector[s3] = v0(1)
    v11 = v11.updated(0, v1)
    v11 = v11.updated(0, v15)
    v11 = v11.updated(0, v1)
    val v60: Vector[s3] = f42(v46)
    val v48: Vector[s3] = f42(v60)
    val v31: Vector[s0] = v28.p0
    v11 = v11.updated(0, v23)
    val v62: Vector[s3] = f42(v48)
    val v56: s0 = v31(1)
    val v116: Vector[Vector[Double]] = v56.p0
    val v58: Vector[Double] = v116(2)
    v11 = v62
    val v134: Double = v58(0)
    val v142: Double = f45(v134)
    v142
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s3]] = Vector(Vector(s3(s2(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(3.0, 4.0)), s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(8.0, 9.0)), s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(13.0, 14.0))), Vector(s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(18.0, 19.0)), s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(23.0, 24.0)))), Vector(s0(Vector(Vector(25.0), Vector(26.0), Vector(27.0)), Vector(28.0, 29.0)), s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(33.0, 34.0)))), Vector(Vector(s1(Vector(s0(Vector(Vector(35.0), Vector(36.0), Vector(37.0)), Vector(38.0, 39.0)), s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(43.0, 44.0)), s0(Vector(Vector(45.0), Vector(46.0), Vector(47.0)), Vector(48.0, 49.0))), Vector(s0(Vector(Vector(50.0), Vector(51.0), Vector(52.0)), Vector(53.0, 54.0)), s0(Vector(Vector(55.0), Vector(56.0), Vector(57.0)), Vector(58.0, 59.0))))), Vector(s1(Vector(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(63.0, 64.0)), s0(Vector(Vector(65.0), Vector(66.0), Vector(67.0)), Vector(68.0, 69.0)), s0(Vector(Vector(70.0), Vector(71.0), Vector(72.0)), Vector(73.0, 74.0))), Vector(s0(Vector(Vector(75.0), Vector(76.0), Vector(77.0)), Vector(78.0, 79.0)), s0(Vector(Vector(80.0), Vector(81.0), Vector(82.0)), Vector(83.0, 84.0))))), Vector(s1(Vector(s0(Vector(Vector(85.0), Vector(86.0), Vector(87.0)), Vector(88.0, 89.0)), s0(Vector(Vector(90.0), Vector(91.0), Vector(92.0)), Vector(93.0, 94.0)), s0(Vector(Vector(95.0), Vector(96.0), Vector(97.0)), Vector(98.0, 99.0))), Vector(s0(Vector(Vector(100.0), Vector(101.0), Vector(102.0)), Vector(103.0, 104.0)), s0(Vector(Vector(105.0), Vector(106.0), Vector(107.0)), Vector(108.0, 109.0)))))))), Vector(s3(s2(s1(Vector(s0(Vector(Vector(110.0), Vector(111.0), Vector(112.0)), Vector(113.0, 114.0)), s0(Vector(Vector(115.0), Vector(116.0), Vector(117.0)), Vector(118.0, 119.0)), s0(Vector(Vector(120.0), Vector(121.0), Vector(122.0)), Vector(123.0, 124.0))), Vector(s0(Vector(Vector(125.0), Vector(126.0), Vector(127.0)), Vector(128.0, 129.0)), s0(Vector(Vector(130.0), Vector(131.0), Vector(132.0)), Vector(133.0, 134.0)))), Vector(s0(Vector(Vector(135.0), Vector(136.0), Vector(137.0)), Vector(138.0, 139.0)), s0(Vector(Vector(140.0), Vector(141.0), Vector(142.0)), Vector(143.0, 144.0)))), Vector(Vector(s1(Vector(s0(Vector(Vector(145.0), Vector(146.0), Vector(147.0)), Vector(148.0, 149.0)), s0(Vector(Vector(150.0), Vector(151.0), Vector(152.0)), Vector(153.0, 154.0)), s0(Vector(Vector(155.0), Vector(156.0), Vector(157.0)), Vector(158.0, 159.0))), Vector(s0(Vector(Vector(160.0), Vector(161.0), Vector(162.0)), Vector(163.0, 164.0)), s0(Vector(Vector(165.0), Vector(166.0), Vector(167.0)), Vector(168.0, 169.0))))), Vector(s1(Vector(s0(Vector(Vector(170.0), Vector(171.0), Vector(172.0)), Vector(173.0, 174.0)), s0(Vector(Vector(175.0), Vector(176.0), Vector(177.0)), Vector(178.0, 179.0)), s0(Vector(Vector(180.0), Vector(181.0), Vector(182.0)), Vector(183.0, 184.0))), Vector(s0(Vector(Vector(185.0), Vector(186.0), Vector(187.0)), Vector(188.0, 189.0)), s0(Vector(Vector(190.0), Vector(191.0), Vector(192.0)), Vector(193.0, 194.0))))), Vector(s1(Vector(s0(Vector(Vector(195.0), Vector(196.0), Vector(197.0)), Vector(198.0, 199.0)), s0(Vector(Vector(200.0), Vector(201.0), Vector(202.0)), Vector(203.0, 204.0)), s0(Vector(Vector(205.0), Vector(206.0), Vector(207.0)), Vector(208.0, 209.0))), Vector(s0(Vector(Vector(210.0), Vector(211.0), Vector(212.0)), Vector(213.0, 214.0)), s0(Vector(Vector(215.0), Vector(216.0), Vector(217.0)), Vector(218.0, 219.0)))))))))
    val v1: s3 = s3(s2(s1(Vector(s0(Vector(Vector(220.0), Vector(221.0), Vector(222.0)), Vector(223.0, 224.0)), s0(Vector(Vector(225.0), Vector(226.0), Vector(227.0)), Vector(228.0, 229.0)), s0(Vector(Vector(230.0), Vector(231.0), Vector(232.0)), Vector(233.0, 234.0))), Vector(s0(Vector(Vector(235.0), Vector(236.0), Vector(237.0)), Vector(238.0, 239.0)), s0(Vector(Vector(240.0), Vector(241.0), Vector(242.0)), Vector(243.0, 244.0)))), Vector(s0(Vector(Vector(245.0), Vector(246.0), Vector(247.0)), Vector(248.0, 249.0)), s0(Vector(Vector(250.0), Vector(251.0), Vector(252.0)), Vector(253.0, 254.0)))), Vector(Vector(s1(Vector(s0(Vector(Vector(255.0), Vector(256.0), Vector(257.0)), Vector(258.0, 259.0)), s0(Vector(Vector(260.0), Vector(261.0), Vector(262.0)), Vector(263.0, 264.0)), s0(Vector(Vector(265.0), Vector(266.0), Vector(267.0)), Vector(268.0, 269.0))), Vector(s0(Vector(Vector(270.0), Vector(271.0), Vector(272.0)), Vector(273.0, 274.0)), s0(Vector(Vector(275.0), Vector(276.0), Vector(277.0)), Vector(278.0, 279.0))))), Vector(s1(Vector(s0(Vector(Vector(280.0), Vector(281.0), Vector(282.0)), Vector(283.0, 284.0)), s0(Vector(Vector(285.0), Vector(286.0), Vector(287.0)), Vector(288.0, 289.0)), s0(Vector(Vector(290.0), Vector(291.0), Vector(292.0)), Vector(293.0, 294.0))), Vector(s0(Vector(Vector(295.0), Vector(296.0), Vector(297.0)), Vector(298.0, 299.0)), s0(Vector(Vector(300.0), Vector(301.0), Vector(302.0)), Vector(303.0, 304.0))))), Vector(s1(Vector(s0(Vector(Vector(305.0), Vector(306.0), Vector(307.0)), Vector(308.0, 309.0)), s0(Vector(Vector(310.0), Vector(311.0), Vector(312.0)), Vector(313.0, 314.0)), s0(Vector(Vector(315.0), Vector(316.0), Vector(317.0)), Vector(318.0, 319.0))), Vector(s0(Vector(Vector(320.0), Vector(321.0), Vector(322.0)), Vector(323.0, 324.0)), s0(Vector(Vector(325.0), Vector(326.0), Vector(327.0)), Vector(328.0, 329.0)))))))
    val v2: Double = 330.0
    val start = nanoTime()
    var result: Double = 330.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}