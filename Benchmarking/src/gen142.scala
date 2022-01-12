import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s2 (
    p0: s0,
    p1: s0
  )
  case class s3 (
    p0: s0,
    p1: Vector[Vector[s0]],
    p2: Vector[Vector[s2]]
  )
  case class s7 (
    p0: s3,
    p1: Vector[Vector[s3]]
  )
  def f115(v0: s3): s3 = {
    var v4: s3 = v0
    v4 = v0
    val v2: Vector[Vector[s2]] = v4.p2
    var v5: s3 = v4
    v5 = v5.copy(p2 = v2)
    v5 = v5.copy(p2 = v2)
    val v8: Vector[s2] = v2(0)
    var v3: Vector[Vector[s2]] = v2
    var v1: s3 = v5
    v3 = v3.updated(0, v8)
    val v10: Vector[s2] = v2(2)
    v4 = v4.copy(p2 = v3)
    v3 = v3.updated(2, v10)
    v5 = v5.copy(p2 = v3)
    v3 = v3.updated(1, v10)
    val v7: Vector[Vector[s0]] = v5.p1
    v5 = v5.copy(p2 = v2)
    v1 = v1.copy(p1 = v7)
    val v9: Vector[Vector[s2]] = v5.p2
    val v27: Vector[Vector[s0]] = v5.p1
    var v12: Vector[Vector[s2]] = v9
    val v67: Vector[s2] = v12(1)
    v1 = v1.copy(p1 = v27)
    v1 = v1.copy(p1 = v7)
    v3 = v3.updated(1, v67)
    v12 = v12.updated(0, v10)
    v1
  }
  def f103(v0: s0): s0 = {
    val v5: Vector[Vector[Double]] = v0.p0
    val v1: Vector[Vector[Double]] = v0.p1
    val v7: s2 = s2(v0, v0)
    var v4: s0 = v0
    var v3: s2 = v7
    v3 = v3.copy(p0 = v0)
    var v6: s2 = v7
    var v2: Vector[Vector[Double]] = v5
    val v19: Vector[Vector[Double]] = v4.p0
    var v10: s0 = v0
    val v15: Vector[Vector[Double]] = v10.p1
    val v12: Vector[Double] = v1(2)
    v6 = v6.copy(p1 = v10)
    var v14: s0 = v10
    var v16: s2 = v7
    val v17: s0 = v7.p1
    val v35: s0 = v6.p1
    val v41: Vector[Vector[Double]] = v35.p0
    v14 = v14.copy(p1 = v15)
    val v25: s0 = v16.p0
    val v39: Vector[Double] = v5(1)
    val v21: Double = v12(0)
    v4 = v4.copy(p0 = v2)
    v6 = v3
    val v34: s2 = s2(v14, v14)
    v14 = v14.copy(p0 = v5)
    v6 = v6.copy(p0 = v25)
    val v95: Vector[Double] = v41(1)
    val v44: s0 = v7.p0
    v2 = v2.updated(1, v95)
    v10 = v14
    var v60: s2 = v34
    var v101: Double = v21
    var v42: s0 = v44
    v6 = v6.copy(p0 = v42)
    v60 = v60.copy(p0 = v4)
    v4 = v17
    val v79: Vector[Vector[Double]] = v14.p1
    var v125: Vector[Double] = v39
    v10 = v10.copy(p0 = v19)
    v2 = v2.updated(0, v125)
    v4 = v4.copy(p1 = v79)
    val v85: s0 = v60.p1
    v125 = v125.updated(0, v101)
    v85
  }
  def f101(v0: s3, v1: Vector[s7]): s3 = {
    val v5: s3 = f115(v0)
    val v12: s3 = f115(v5)
    val v15: s3 = f115(v5)
    val v29: s0 = v5.p0
    val v21: Vector[Vector[s0]] = v12.p1
    val v28: s3 = f115(v12)
    val v24: Vector[Vector[Double]] = v29.p1
    var v54: Vector[Vector[Double]] = v24
    val v85: s3 = f115(v28)
    var v27: s3 = v15
    val v53: Vector[Double] = v54(0)
    var v50: s0 = v29
    v50 = v50.copy(p1 = v54)
    v27 = v27.copy(p0 = v50)
    val v68: s0 = v85.p0
    v54 = v54.updated(1, v53)
    v27 = v27.copy(p0 = v68)
    v27 = v27.copy(p0 = v29)
    v27 = v27.copy(p1 = v21)
    val v90: s3 = f115(v27)
    v90
  }
  @noinline
  def f0(v0: Vector[s7], v1: Double): Double = {
    val v2: s7 = v0(1)
    val v6: s3 = v2.p0
    val v3: s3 = f101(v6, v0)
    val v10: s7 = v0(0)
    val v36: s3 = f101(v3, v0)
    val v27: s0 = v36.p0
    var v22: s0 = v27
    val v46: s0 = v6.p0
    val v26: Vector[Vector[Double]] = v46.p1
    v22 = v22.copy(p1 = v26)
    v22 = v27
    val v65: s0 = f103(v22)
    val v62: Vector[Vector[Double]] = v65.p1
    v22 = v22.copy(p1 = v62)
    val v53: s3 = v10.p0
    val v174: Vector[Vector[Double]] = v27.p1
    v22 = v22.copy(p1 = v174)
    val v111: Vector[Double] = v62(0)
    val v90: Double = v111(0)
    val v119: s0 = v53.p0
    val v197: Vector[Vector[Double]] = v119.p1
    v22 = v22.copy(p1 = v197)
    v22 = v22.copy(p1 = v174)
    v22 = v22.copy(p1 = v197)
    v90
  }
  def benchmark(): Unit = {
    val v0: Vector[s7] = Vector(s7(s3(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0))), Vector(Vector(s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0)))), Vector(s0(Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0), Vector(14.0))))), Vector(Vector(s2(s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0))), s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0), Vector(24.0))))), Vector(s2(s0(Vector(Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0))), s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0), Vector(33.0), Vector(34.0))))), Vector(s2(s0(Vector(Vector(35.0), Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0))), s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0), Vector(44.0))))))), Vector(Vector(s3(s0(Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0), Vector(48.0), Vector(49.0))), Vector(Vector(s0(Vector(Vector(50.0), Vector(51.0)), Vector(Vector(52.0), Vector(53.0), Vector(54.0)))), Vector(s0(Vector(Vector(55.0), Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0))))), Vector(Vector(s2(s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0), Vector(63.0), Vector(64.0))), s0(Vector(Vector(65.0), Vector(66.0)), Vector(Vector(67.0), Vector(68.0), Vector(69.0))))), Vector(s2(s0(Vector(Vector(70.0), Vector(71.0)), Vector(Vector(72.0), Vector(73.0), Vector(74.0))), s0(Vector(Vector(75.0), Vector(76.0)), Vector(Vector(77.0), Vector(78.0), Vector(79.0))))), Vector(s2(s0(Vector(Vector(80.0), Vector(81.0)), Vector(Vector(82.0), Vector(83.0), Vector(84.0))), s0(Vector(Vector(85.0), Vector(86.0)), Vector(Vector(87.0), Vector(88.0), Vector(89.0)))))))))), s7(s3(s0(Vector(Vector(90.0), Vector(91.0)), Vector(Vector(92.0), Vector(93.0), Vector(94.0))), Vector(Vector(s0(Vector(Vector(95.0), Vector(96.0)), Vector(Vector(97.0), Vector(98.0), Vector(99.0)))), Vector(s0(Vector(Vector(100.0), Vector(101.0)), Vector(Vector(102.0), Vector(103.0), Vector(104.0))))), Vector(Vector(s2(s0(Vector(Vector(105.0), Vector(106.0)), Vector(Vector(107.0), Vector(108.0), Vector(109.0))), s0(Vector(Vector(110.0), Vector(111.0)), Vector(Vector(112.0), Vector(113.0), Vector(114.0))))), Vector(s2(s0(Vector(Vector(115.0), Vector(116.0)), Vector(Vector(117.0), Vector(118.0), Vector(119.0))), s0(Vector(Vector(120.0), Vector(121.0)), Vector(Vector(122.0), Vector(123.0), Vector(124.0))))), Vector(s2(s0(Vector(Vector(125.0), Vector(126.0)), Vector(Vector(127.0), Vector(128.0), Vector(129.0))), s0(Vector(Vector(130.0), Vector(131.0)), Vector(Vector(132.0), Vector(133.0), Vector(134.0))))))), Vector(Vector(s3(s0(Vector(Vector(135.0), Vector(136.0)), Vector(Vector(137.0), Vector(138.0), Vector(139.0))), Vector(Vector(s0(Vector(Vector(140.0), Vector(141.0)), Vector(Vector(142.0), Vector(143.0), Vector(144.0)))), Vector(s0(Vector(Vector(145.0), Vector(146.0)), Vector(Vector(147.0), Vector(148.0), Vector(149.0))))), Vector(Vector(s2(s0(Vector(Vector(150.0), Vector(151.0)), Vector(Vector(152.0), Vector(153.0), Vector(154.0))), s0(Vector(Vector(155.0), Vector(156.0)), Vector(Vector(157.0), Vector(158.0), Vector(159.0))))), Vector(s2(s0(Vector(Vector(160.0), Vector(161.0)), Vector(Vector(162.0), Vector(163.0), Vector(164.0))), s0(Vector(Vector(165.0), Vector(166.0)), Vector(Vector(167.0), Vector(168.0), Vector(169.0))))), Vector(s2(s0(Vector(Vector(170.0), Vector(171.0)), Vector(Vector(172.0), Vector(173.0), Vector(174.0))), s0(Vector(Vector(175.0), Vector(176.0)), Vector(Vector(177.0), Vector(178.0), Vector(179.0)))))))))), s7(s3(s0(Vector(Vector(180.0), Vector(181.0)), Vector(Vector(182.0), Vector(183.0), Vector(184.0))), Vector(Vector(s0(Vector(Vector(185.0), Vector(186.0)), Vector(Vector(187.0), Vector(188.0), Vector(189.0)))), Vector(s0(Vector(Vector(190.0), Vector(191.0)), Vector(Vector(192.0), Vector(193.0), Vector(194.0))))), Vector(Vector(s2(s0(Vector(Vector(195.0), Vector(196.0)), Vector(Vector(197.0), Vector(198.0), Vector(199.0))), s0(Vector(Vector(200.0), Vector(201.0)), Vector(Vector(202.0), Vector(203.0), Vector(204.0))))), Vector(s2(s0(Vector(Vector(205.0), Vector(206.0)), Vector(Vector(207.0), Vector(208.0), Vector(209.0))), s0(Vector(Vector(210.0), Vector(211.0)), Vector(Vector(212.0), Vector(213.0), Vector(214.0))))), Vector(s2(s0(Vector(Vector(215.0), Vector(216.0)), Vector(Vector(217.0), Vector(218.0), Vector(219.0))), s0(Vector(Vector(220.0), Vector(221.0)), Vector(Vector(222.0), Vector(223.0), Vector(224.0))))))), Vector(Vector(s3(s0(Vector(Vector(225.0), Vector(226.0)), Vector(Vector(227.0), Vector(228.0), Vector(229.0))), Vector(Vector(s0(Vector(Vector(230.0), Vector(231.0)), Vector(Vector(232.0), Vector(233.0), Vector(234.0)))), Vector(s0(Vector(Vector(235.0), Vector(236.0)), Vector(Vector(237.0), Vector(238.0), Vector(239.0))))), Vector(Vector(s2(s0(Vector(Vector(240.0), Vector(241.0)), Vector(Vector(242.0), Vector(243.0), Vector(244.0))), s0(Vector(Vector(245.0), Vector(246.0)), Vector(Vector(247.0), Vector(248.0), Vector(249.0))))), Vector(s2(s0(Vector(Vector(250.0), Vector(251.0)), Vector(Vector(252.0), Vector(253.0), Vector(254.0))), s0(Vector(Vector(255.0), Vector(256.0)), Vector(Vector(257.0), Vector(258.0), Vector(259.0))))), Vector(s2(s0(Vector(Vector(260.0), Vector(261.0)), Vector(Vector(262.0), Vector(263.0), Vector(264.0))), s0(Vector(Vector(265.0), Vector(266.0)), Vector(Vector(267.0), Vector(268.0), Vector(269.0)))))))))))
    val v1: Double = 270.0
    val start = nanoTime()
    var result: Double = 270.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}