import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]],
    p3: Vector[Vector[Double]],
    p4: Vector[Vector[Double]],
    p5: Vector[Vector[Double]],
    p6: Vector[Vector[Double]],
    p7: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  case class s3 (
    p0: s0,
    p1: s1
  )
  def f4(v0: s0): s0 = {
    var v1: s0 = v0
    val v3: Vector[Vector[Double]] = v0.p7
    val v4: Vector[Double] = v3(0)
    val v11: Vector[Double] = v3(0)
    val v8: Vector[Vector[Double]] = v0.p0
    val v14: Vector[Vector[Double]] = v0.p3
    val v9: Vector[Vector[Double]] = v0.p3
    val v15: Vector[Vector[Double]] = v0.p5
    v1 = v1.copy(p3 = v14)
    var v10: Vector[Vector[Double]] = v8
    val v7: Vector[Vector[Double]] = v0.p5
    v10 = v10.updated(0, v4)
    val v13: Vector[Vector[Double]] = v0.p1
    var v12: Vector[Vector[Double]] = v10
    v1 = v1.copy(p5 = v7)
    val v19: Vector[Double] = v10(0)
    v10 = v8
    v1 = v1.copy(p4 = v15)
    val v22: Vector[Vector[Double]] = v1.p7
    v1 = v1.copy(p5 = v9)
    var v28: s0 = v0
    val v50: Vector[Vector[Double]] = v28.p5
    var v21: Vector[Vector[Double]] = v12
    v1 = v1.copy(p1 = v13)
    v28 = v28.copy(p7 = v7)
    val v16: Vector[Vector[Double]] = v0.p0
    val v54: Vector[Double] = v50(1)
    val v20: Vector[Vector[Double]] = v1.p6
    v21 = v21.updated(0, v54)
    v10 = v16
    val v27: Vector[Double] = v21(0)
    v12 = v12.updated(0, v19)
    v28 = v28.copy(p2 = v22)
    val v43: Vector[Double] = v20(0)
    v28 = v28.copy(p7 = v3)
    v1 = v1.copy(p3 = v50)
    v12 = v12.updated(0, v11)
    v10 = v10.updated(0, v43)
    v28 = v28.copy(p0 = v21)
    val v88: Vector[Vector[Double]] = v1.p7
    v12 = v12.updated(0, v27)
    v28 = v28.copy(p4 = v88)
    var v91: s0 = v28
    v91
  }
  def f2(v0: s1): s1 = {
    var v4: s1 = v0
    val v1: Vector[s0] = v4.p0
    val v2: Vector[s0] = v0.p0
    var v5: s1 = v0
    v4 = v0
    var v8: Vector[s0] = v1
    val v9: Vector[s0] = v4.p0
    v5 = v5.copy(p0 = v8)
    val v6: s0 = v5.p1
    val v13: Vector[s0] = v5.p0
    val v10: s0 = v2(0)
    val v15: s0 = f4(v6)
    val v25: s1 = s1(v9, v15)
    val v40: s0 = v4.p1
    v8 = v8.updated(1, v40)
    v8 = v8.updated(0, v6)
    val v29: s1 = s1(v13, v40)
    v5 = v5.copy(p0 = v13)
    val v41: s0 = v5.p1
    var v39: s1 = v25
    var v86: s0 = v41
    val v56: s0 = v13(0)
    v39 = v39.copy(p1 = v10)
    v39 = v39.copy(p0 = v1)
    val v30: s0 = f4(v56)
    var v54: s0 = v86
    val v78: s0 = f4(v40)
    v8 = v8.updated(0, v30)
    val v113: Vector[s0] = v29.p0
    v39 = v39.copy(p0 = v113)
    v4 = v4.copy(p1 = v41)
    v8 = v8.updated(1, v78)
    var v125: s1 = v39
    var v111: Vector[s0] = v13
    v4 = v4.copy(p1 = v54)
    v4 = v4.copy(p0 = v111)
    v125
  }
  @noinline
  def f0(v0: Vector[s3], v1: Vector[s1], v2: s0, v3: Vector[s0], v4: Double): Double = {
    val v6: s3 = v0(0)
    val v8: s0 = f4(v2)
    val v11: s0 = f4(v2)
    val v10: s0 = v3(1)
    var v9: s3 = v6
    val v18: Vector[Vector[Double]] = v10.p5
    v9 = v9.copy(p0 = v11)
    val v22: s1 = v9.p1
    v9 = v9.copy(p0 = v8)
    var v13: s1 = v22
    val v29: s1 = f2(v13)
    val v23: s0 = v9.p0
    v13 = v29
    val v28: s0 = f4(v23)
    v13 = v13.copy(p0 = v3)
    val v16: Vector[Double] = v18(0)
    val v26: s0 = f4(v28)
    v9 = v9.copy(p1 = v13)
    var v35: Vector[Double] = v16
    val v52: Double = v16(0)
    val v49: s0 = f4(v26)
    val v36: s0 = v13.p1
    v35 = v35.updated(0, v52)
    val v43: s3 = s3(v49, v13)
    val v42: s0 = f4(v49)
    val v56: Vector[Vector[Double]] = Vector(v16, v16, v35, v16, v35)
    v13 = v13.copy(p1 = v23)
    val v57: Vector[Vector[Double]] = v42.p0
    val v111: Vector[Double] = v57(0)
    val v138: s3 = v0(0)
    v9 = v43
    var v128: Vector[Vector[Double]] = v56
    val v69: Vector[Double] = v56(4)
    v128 = v56
    val v125: Vector[Double] = v128(0)
    v9 = v138
    val v89: Vector[Vector[Double]] = Vector(v69, v125, v125)
    var v77: Vector[Vector[Double]] = v89
    val v150: s0 = f4(v36)
    val v196: Vector[Double] = v77(0)
    val v135: Double = v111(0)
    val v221: Double = v196(0)
    val v136: Double = v135 + v221
    v9 = v9.copy(p0 = v150)
    v13 = v13.copy(p1 = v42)
    v35 = v35.updated(0, v135)
    v136
  }
  def benchmark(): Unit = {
    val v0: Vector[s3] = Vector(s3(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0)), Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0))), s1(Vector(s0(Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0), Vector(24.0)), Vector(Vector(25.0), Vector(26.0)), Vector(Vector(27.0)), Vector(Vector(28.0), Vector(29.0))), s0(Vector(Vector(30.0)), Vector(Vector(31.0), Vector(32.0), Vector(33.0)), Vector(Vector(34.0), Vector(35.0)), Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0)), Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0)), Vector(Vector(43.0), Vector(44.0)))), s0(Vector(Vector(45.0)), Vector(Vector(46.0), Vector(47.0), Vector(48.0)), Vector(Vector(49.0), Vector(50.0)), Vector(Vector(51.0), Vector(52.0)), Vector(Vector(53.0), Vector(54.0)), Vector(Vector(55.0), Vector(56.0)), Vector(Vector(57.0)), Vector(Vector(58.0), Vector(59.0))))))
    val v1: Vector[s1] = Vector(s1(Vector(s0(Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0), Vector(63.0)), Vector(Vector(64.0), Vector(65.0)), Vector(Vector(66.0), Vector(67.0)), Vector(Vector(68.0), Vector(69.0)), Vector(Vector(70.0), Vector(71.0)), Vector(Vector(72.0)), Vector(Vector(73.0), Vector(74.0))), s0(Vector(Vector(75.0)), Vector(Vector(76.0), Vector(77.0), Vector(78.0)), Vector(Vector(79.0), Vector(80.0)), Vector(Vector(81.0), Vector(82.0)), Vector(Vector(83.0), Vector(84.0)), Vector(Vector(85.0), Vector(86.0)), Vector(Vector(87.0)), Vector(Vector(88.0), Vector(89.0)))), s0(Vector(Vector(90.0)), Vector(Vector(91.0), Vector(92.0), Vector(93.0)), Vector(Vector(94.0), Vector(95.0)), Vector(Vector(96.0), Vector(97.0)), Vector(Vector(98.0), Vector(99.0)), Vector(Vector(100.0), Vector(101.0)), Vector(Vector(102.0)), Vector(Vector(103.0), Vector(104.0)))), s1(Vector(s0(Vector(Vector(105.0)), Vector(Vector(106.0), Vector(107.0), Vector(108.0)), Vector(Vector(109.0), Vector(110.0)), Vector(Vector(111.0), Vector(112.0)), Vector(Vector(113.0), Vector(114.0)), Vector(Vector(115.0), Vector(116.0)), Vector(Vector(117.0)), Vector(Vector(118.0), Vector(119.0))), s0(Vector(Vector(120.0)), Vector(Vector(121.0), Vector(122.0), Vector(123.0)), Vector(Vector(124.0), Vector(125.0)), Vector(Vector(126.0), Vector(127.0)), Vector(Vector(128.0), Vector(129.0)), Vector(Vector(130.0), Vector(131.0)), Vector(Vector(132.0)), Vector(Vector(133.0), Vector(134.0)))), s0(Vector(Vector(135.0)), Vector(Vector(136.0), Vector(137.0), Vector(138.0)), Vector(Vector(139.0), Vector(140.0)), Vector(Vector(141.0), Vector(142.0)), Vector(Vector(143.0), Vector(144.0)), Vector(Vector(145.0), Vector(146.0)), Vector(Vector(147.0)), Vector(Vector(148.0), Vector(149.0)))), s1(Vector(s0(Vector(Vector(150.0)), Vector(Vector(151.0), Vector(152.0), Vector(153.0)), Vector(Vector(154.0), Vector(155.0)), Vector(Vector(156.0), Vector(157.0)), Vector(Vector(158.0), Vector(159.0)), Vector(Vector(160.0), Vector(161.0)), Vector(Vector(162.0)), Vector(Vector(163.0), Vector(164.0))), s0(Vector(Vector(165.0)), Vector(Vector(166.0), Vector(167.0), Vector(168.0)), Vector(Vector(169.0), Vector(170.0)), Vector(Vector(171.0), Vector(172.0)), Vector(Vector(173.0), Vector(174.0)), Vector(Vector(175.0), Vector(176.0)), Vector(Vector(177.0)), Vector(Vector(178.0), Vector(179.0)))), s0(Vector(Vector(180.0)), Vector(Vector(181.0), Vector(182.0), Vector(183.0)), Vector(Vector(184.0), Vector(185.0)), Vector(Vector(186.0), Vector(187.0)), Vector(Vector(188.0), Vector(189.0)), Vector(Vector(190.0), Vector(191.0)), Vector(Vector(192.0)), Vector(Vector(193.0), Vector(194.0)))))
    val v2: s0 = s0(Vector(Vector(195.0)), Vector(Vector(196.0), Vector(197.0), Vector(198.0)), Vector(Vector(199.0), Vector(200.0)), Vector(Vector(201.0), Vector(202.0)), Vector(Vector(203.0), Vector(204.0)), Vector(Vector(205.0), Vector(206.0)), Vector(Vector(207.0)), Vector(Vector(208.0), Vector(209.0)))
    val v3: Vector[s0] = Vector(s0(Vector(Vector(210.0)), Vector(Vector(211.0), Vector(212.0), Vector(213.0)), Vector(Vector(214.0), Vector(215.0)), Vector(Vector(216.0), Vector(217.0)), Vector(Vector(218.0), Vector(219.0)), Vector(Vector(220.0), Vector(221.0)), Vector(Vector(222.0)), Vector(Vector(223.0), Vector(224.0))), s0(Vector(Vector(225.0)), Vector(Vector(226.0), Vector(227.0), Vector(228.0)), Vector(Vector(229.0), Vector(230.0)), Vector(Vector(231.0), Vector(232.0)), Vector(Vector(233.0), Vector(234.0)), Vector(Vector(235.0), Vector(236.0)), Vector(Vector(237.0)), Vector(Vector(238.0), Vector(239.0))))
    val v4: Double = 240.0
    val start = nanoTime()
    var result: Double = 240.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}