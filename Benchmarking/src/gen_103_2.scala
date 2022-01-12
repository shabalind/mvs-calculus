import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: s0,
    p1: s0
  )
  case class s3 (
    p0: Vector[Vector[s1]],
    p1: s2
  )
  case class s4 (
    p0: s1,
    p1: Vector[s3]
  )
  case class s5 (
    p0: s4
  )
  case class s7 (
    p0: s2,
    p1: s5
  )
  case class s8 (
    p0: s7,
    p1: Vector[s7]
  )
  case class s9 (
    p0: s8,
    p1: Vector[s1]
  )
  case class s11 (
    p0: s9,
    p1: s2
  )
  case class s13 (
    p0: s11,
    p1: Vector[s5]
  )
  def f109(v0: s4): s4 = {
    val v3: s1 = v0.p0
    var v6: s1 = v3
    var v7: s1 = v6
    v6 = v3
    var v5: s1 = v3
    v5 = v6
    var v4: s1 = v7
    val v11: Vector[s3] = v0.p1
    val v9: s3 = v11(0)
    val v2: s2 = v9.p1
    val v25: s0 = v4.p1
    var v17: s4 = v0
    v17 = v17.copy(p0 = v7)
    v7 = v7.copy(p0 = v25)
    var v21: s2 = v2
    v4 = v5
    val v28: s0 = v21.p0
    val v16: s0 = v7.p0
    val v23: s0 = v21.p0
    var v38: s0 = v16
    val v62: Vector[Vector[Double]] = v25.p1
    v21 = v21.copy(p0 = v25)
    val v49: Vector[s3] = v17.p1
    v6 = v6.copy(p1 = v28)
    v6 = v6.copy(p0 = v23)
    val v53: Vector[Vector[Double]] = v23.p0
    val v40: s0 = s0(v53, v62)
    val v57: s5 = s5(v17)
    var v56: s5 = v57
    v5 = v5.copy(p0 = v40)
    var v92: s5 = v56
    val v75: s0 = v21.p0
    v7 = v7.copy(p0 = v75)
    v7 = v7.copy(p1 = v38)
    v92 = v92.copy(p0 = v0)
    val v142: s4 = v92.p0
    v17 = v17.copy(p1 = v49)
    v21 = v21.copy(p1 = v38)
    var v144: s4 = v142
    v38 = v38.copy(p0 = v53)
    v144
  }
  def f100(v0: s4): s4 = {
    val v7: s4 = f109(v0)
    val v4: Vector[s3] = v0.p1
    val v6: s1 = v7.p0
    var v8: s1 = v6
    var v3: s4 = v7
    val v9: s4 = f109(v3)
    var v5: s1 = v6
    val v21: s4 = f109(v9)
    v3 = v3.copy(p1 = v4)
    val v1: Vector[s3] = v3.p1
    var v2: s4 = v7
    var v13: Vector[s3] = v1
    val v11: s3 = v4(0)
    var v14: s3 = v11
    v13 = v13.updated(0, v14)
    val v16: s4 = f109(v21)
    var v19: s4 = v7
    v13 = v13.updated(0, v11)
    var v24: Vector[s3] = v1
    val v25: s3 = v13(0)
    v3 = v3.copy(p1 = v24)
    val v26: s3 = v4(0)
    val v52: s3 = v24(0)
    v3 = v3.copy(p1 = v13)
    var v39: s3 = v25
    val v47: s4 = f109(v7)
    var v54: s4 = v16
    val v30: s4 = f109(v2)
    v2 = v2.copy(p1 = v24)
    val v32: Vector[Vector[s1]] = v26.p0
    v3 = v3.copy(p1 = v1)
    val v22: s3 = v4(0)
    val v38: s3 = v13(0)
    val v35: s3 = v4(0)
    v14 = v14.copy(p0 = v32)
    v8 = v5
    v24 = v24.updated(0, v14)
    v24 = v24.updated(0, v22)
    v2 = v47
    val v61: Vector[s3] = v19.p1
    v19 = v19.copy(p0 = v5)
    val v45: s3 = v61(0)
    val v40: s3 = v4(0)
    v24 = v24.updated(0, v26)
    val v31: s2 = v26.p1
    val v84: s2 = v40.p1
    val v71: s0 = v8.p0
    var v36: s2 = v84
    v8 = v8.copy(p0 = v71)
    val v58: s0 = v31.p1
    v54 = v54.copy(p0 = v5)
    val v78: s2 = v52.p1
    val v41: s0 = v6.p1
    var v44: s1 = v8
    val v77: s0 = v8.p0
    v24 = v24.updated(0, v35)
    var v67: s3 = v39
    v24 = v24.updated(0, v52)
    v3 = v30
    v24 = v24.updated(0, v67)
    v13 = v13.updated(0, v45)
    v14 = v14.copy(p0 = v32)
    val v226: s0 = v78.p0
    v24 = v24.updated(0, v52)
    v44 = v44.copy(p1 = v226)
    val v140: s0 = v5.p0
    val v75: s0 = v36.p1
    v3 = v3.copy(p0 = v44)
    v36 = v36.copy(p0 = v77)
    v3 = v3.copy(p1 = v1)
    v67 = v67.copy(p1 = v78)
    v5 = v5.copy(p0 = v75)
    v24 = v24.updated(0, v26)
    v13 = v13.updated(0, v38)
    v44 = v44.copy(p1 = v58)
    v44 = v44.copy(p1 = v140)
    v39 = v39.copy(p1 = v84)
    v8 = v8.copy(p0 = v41)
    v54
  }
  def f68(v0: s0): s0 = {
    v0
  }
  def f49(v0: s1): s1 = {
    var v21: s1 = v0
    val v13: s0 = v21.p0
    val v31: s0 = f68(v13)
    v21 = v21.copy(p0 = v31)
    v21
  }
  def f32(v0: s1): s1 = {
    var v6: s1 = v0
    val v2: s1 = f49(v6)
    val v7: Vector[s1] = Vector(v6, v6, v6, v2, v2, v0)
    var v4: Vector[s1] = v7
    val v3: s1 = f49(v0)
    var v1: Vector[s1] = v4
    val v10: Vector[Vector[s1]] = Vector(v1, v7)
    val v5: s1 = f49(v3)
    var v19: Vector[s1] = v4
    v4 = v4.updated(4, v3)
    v1 = v1.updated(3, v6)
    val v15: s0 = v0.p0
    val v12: s0 = f68(v15)
    var v14: s0 = v12
    v19 = v19.updated(1, v6)
    val v16: s0 = v5.p0
    val v11: s1 = v19(5)
    var v30: Vector[Vector[s1]] = v10
    val v13: Vector[s1] = v30(1)
    var v17: s0 = v14
    val v20: s1 = f49(v11)
    v6 = v6.copy(p1 = v14)
    v4 = v13
    v19 = v19.updated(4, v20)
    v6 = v6.copy(p0 = v17)
    val v47: s1 = f49(v2)
    v6 = v6.copy(p0 = v15)
    val v27: s0 = v5.p1
    val v35: s0 = f68(v27)
    val v174: s1 = f49(v47)
    v4 = v4.updated(1, v47)
    val v62: Vector[Vector[Double]] = v16.p1
    val v41: s1 = f49(v174)
    v1 = v1.updated(1, v47)
    v6 = v6.copy(p1 = v35)
    v14 = v14.copy(p1 = v62)
    v19 = v19.updated(5, v41)
    var v94: s1 = v20
    v94
  }
  def f25(v0: s5): s5 = {
    val v1: s4 = v0.p0
    val v4: s4 = f109(v1)
    var v62: s5 = v0
    v62 = v62.copy(p0 = v4)
    v62
  }
  def f20(v0: Double, v1: s5): Double = {
    val v8: s5 = f25(v1)
    var v5: Double = v0
    val v4: s4 = v8.p0
    val v2: Double = v5 - v0
    var v13: Double = v2
    val v20: s1 = v4.p0
    var v33: Double = v0
    val v43: s1 = f49(v20)
    val v36: s0 = v43.p1
    val v51: Vector[Vector[Double]] = v36.p1
    val v39: Vector[Double] = v51(0)
    val v16: Double = v39(0)
    val v40: Double = v13 - v16
    v13 = v33
    v40
  }
  def f16(v0: s1): s1 = {
    val v4: s1 = f49(v0)
    val v3: Vector[s1] = Vector(v0, v4, v4, v4, v4, v4)
    var v8: Vector[s1] = v3
    val v11: s1 = v8(4)
    v11
  }
  def f5(v0: s5): s5 = {
    val v3: s4 = v0.p0
    val v4: s5 = f25(v0)
    var v8: s5 = v4
    v8 = v8.copy(p0 = v3)
    v8 = v8.copy(p0 = v3)
    val v19: s4 = v4.p0
    val v16: s4 = v8.p0
    val v15: s4 = f109(v3)
    var v12: s5 = v8
    val v36: s5 = f25(v0)
    v8 = v8.copy(p0 = v15)
    val v27: s4 = f109(v3)
    val v49: Vector[s4] = Vector(v3, v3, v19, v15)
    v8 = v8.copy(p0 = v27)
    val v29: s4 = f109(v16)
    v12 = v12.copy(p0 = v27)
    val v60: s4 = v49(0)
    v8 = v8.copy(p0 = v60)
    v8 = v8.copy(p0 = v19)
    var v42: s4 = v15
    val v37: s5 = f25(v36)
    val v61: s4 = v37.p0
    v12 = v12.copy(p0 = v27)
    v12 = v12.copy(p0 = v29)
    v8 = v8.copy(p0 = v61)
    v8 = v8.copy(p0 = v61)
    v42 = v27
    v12 = v12.copy(p0 = v3)
    val v101: s4 = f100(v42)
    v8 = v8.copy(p0 = v101)
    v12 = v12.copy(p0 = v3)
    var v89: s5 = v8
    v12 = v89
    v12
  }
  @noinline
  def f0(v0: s13, v1: s13, v2: Double): Double = {
    val v6: s11 = v0.p0
    var v7: Double = v2
    var v3: s13 = v1
    val v4: Vector[s5] = v3.p1
    v7 = v2
    val v5: s5 = v4(0)
    val v11: s4 = v5.p0
    val v14: s5 = v4(0)
    v3 = v3.copy(p1 = v4)
    v3 = v3.copy(p0 = v6)
    v3 = v3.copy(p0 = v6)
    val v30: s5 = v4(1)
    v3 = v3.copy(p0 = v6)
    v3 = v3.copy(p1 = v4)
    val v18: s4 = v30.p0
    v3 = v0
    v7 = v2
    var v12: s4 = v11
    val v26: s1 = v11.p0
    var v49: s5 = v14
    val v32: s1 = f32(v26)
    var v20: s11 = v6
    v49 = v49.copy(p0 = v18)
    var v50: s1 = v32
    val v74: s1 = f16(v26)
    val v41: s1 = f32(v74)
    var v75: s11 = v20
    v12 = v12.copy(p0 = v26)
    val v67: s5 = f5(v49)
    v12 = v12.copy(p0 = v74)
    v50 = v41
    v12 = v12.copy(p0 = v50)
    v12 = v12.copy(p0 = v50)
    var v82: Double = v2
    v49 = v49.copy(p0 = v12)
    val v220: Double = f20(v82, v67)
    v3 = v3.copy(p0 = v75)
    val v343: Double = v7 - v220
    v343
  }
  def benchmark(): Unit = {
    val v0: s13 = s13(s11(s9(s8(s7(s2(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0))), s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0)))), s5(s4(s1(s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0))), s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0)))), Vector(s3(Vector(Vector(s1(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0))), s0(Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0)))))), s2(s0(Vector(Vector(18.0)), Vector(Vector(19.0), Vector(20.0))), s0(Vector(Vector(21.0)), Vector(Vector(22.0), Vector(23.0))))))))), Vector(s7(s2(s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0))), s0(Vector(Vector(27.0)), Vector(Vector(28.0), Vector(29.0)))), s5(s4(s1(s0(Vector(Vector(30.0)), Vector(Vector(31.0), Vector(32.0))), s0(Vector(Vector(33.0)), Vector(Vector(34.0), Vector(35.0)))), Vector(s3(Vector(Vector(s1(s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0))), s0(Vector(Vector(39.0)), Vector(Vector(40.0), Vector(41.0)))))), s2(s0(Vector(Vector(42.0)), Vector(Vector(43.0), Vector(44.0))), s0(Vector(Vector(45.0)), Vector(Vector(46.0), Vector(47.0))))))))))), Vector(s1(s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0))), s0(Vector(Vector(51.0)), Vector(Vector(52.0), Vector(53.0)))), s1(s0(Vector(Vector(54.0)), Vector(Vector(55.0), Vector(56.0))), s0(Vector(Vector(57.0)), Vector(Vector(58.0), Vector(59.0)))))), s2(s0(Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0))), s0(Vector(Vector(63.0)), Vector(Vector(64.0), Vector(65.0))))), Vector(s5(s4(s1(s0(Vector(Vector(66.0)), Vector(Vector(67.0), Vector(68.0))), s0(Vector(Vector(69.0)), Vector(Vector(70.0), Vector(71.0)))), Vector(s3(Vector(Vector(s1(s0(Vector(Vector(72.0)), Vector(Vector(73.0), Vector(74.0))), s0(Vector(Vector(75.0)), Vector(Vector(76.0), Vector(77.0)))))), s2(s0(Vector(Vector(78.0)), Vector(Vector(79.0), Vector(80.0))), s0(Vector(Vector(81.0)), Vector(Vector(82.0), Vector(83.0)))))))), s5(s4(s1(s0(Vector(Vector(84.0)), Vector(Vector(85.0), Vector(86.0))), s0(Vector(Vector(87.0)), Vector(Vector(88.0), Vector(89.0)))), Vector(s3(Vector(Vector(s1(s0(Vector(Vector(90.0)), Vector(Vector(91.0), Vector(92.0))), s0(Vector(Vector(93.0)), Vector(Vector(94.0), Vector(95.0)))))), s2(s0(Vector(Vector(96.0)), Vector(Vector(97.0), Vector(98.0))), s0(Vector(Vector(99.0)), Vector(Vector(100.0), Vector(101.0)))))))), s5(s4(s1(s0(Vector(Vector(102.0)), Vector(Vector(103.0), Vector(104.0))), s0(Vector(Vector(105.0)), Vector(Vector(106.0), Vector(107.0)))), Vector(s3(Vector(Vector(s1(s0(Vector(Vector(108.0)), Vector(Vector(109.0), Vector(110.0))), s0(Vector(Vector(111.0)), Vector(Vector(112.0), Vector(113.0)))))), s2(s0(Vector(Vector(114.0)), Vector(Vector(115.0), Vector(116.0))), s0(Vector(Vector(117.0)), Vector(Vector(118.0), Vector(119.0))))))))))
    val v1: s13 = s13(s11(s9(s8(s7(s2(s0(Vector(Vector(120.0)), Vector(Vector(121.0), Vector(122.0))), s0(Vector(Vector(123.0)), Vector(Vector(124.0), Vector(125.0)))), s5(s4(s1(s0(Vector(Vector(126.0)), Vector(Vector(127.0), Vector(128.0))), s0(Vector(Vector(129.0)), Vector(Vector(130.0), Vector(131.0)))), Vector(s3(Vector(Vector(s1(s0(Vector(Vector(132.0)), Vector(Vector(133.0), Vector(134.0))), s0(Vector(Vector(135.0)), Vector(Vector(136.0), Vector(137.0)))))), s2(s0(Vector(Vector(138.0)), Vector(Vector(139.0), Vector(140.0))), s0(Vector(Vector(141.0)), Vector(Vector(142.0), Vector(143.0))))))))), Vector(s7(s2(s0(Vector(Vector(144.0)), Vector(Vector(145.0), Vector(146.0))), s0(Vector(Vector(147.0)), Vector(Vector(148.0), Vector(149.0)))), s5(s4(s1(s0(Vector(Vector(150.0)), Vector(Vector(151.0), Vector(152.0))), s0(Vector(Vector(153.0)), Vector(Vector(154.0), Vector(155.0)))), Vector(s3(Vector(Vector(s1(s0(Vector(Vector(156.0)), Vector(Vector(157.0), Vector(158.0))), s0(Vector(Vector(159.0)), Vector(Vector(160.0), Vector(161.0)))))), s2(s0(Vector(Vector(162.0)), Vector(Vector(163.0), Vector(164.0))), s0(Vector(Vector(165.0)), Vector(Vector(166.0), Vector(167.0))))))))))), Vector(s1(s0(Vector(Vector(168.0)), Vector(Vector(169.0), Vector(170.0))), s0(Vector(Vector(171.0)), Vector(Vector(172.0), Vector(173.0)))), s1(s0(Vector(Vector(174.0)), Vector(Vector(175.0), Vector(176.0))), s0(Vector(Vector(177.0)), Vector(Vector(178.0), Vector(179.0)))))), s2(s0(Vector(Vector(180.0)), Vector(Vector(181.0), Vector(182.0))), s0(Vector(Vector(183.0)), Vector(Vector(184.0), Vector(185.0))))), Vector(s5(s4(s1(s0(Vector(Vector(186.0)), Vector(Vector(187.0), Vector(188.0))), s0(Vector(Vector(189.0)), Vector(Vector(190.0), Vector(191.0)))), Vector(s3(Vector(Vector(s1(s0(Vector(Vector(192.0)), Vector(Vector(193.0), Vector(194.0))), s0(Vector(Vector(195.0)), Vector(Vector(196.0), Vector(197.0)))))), s2(s0(Vector(Vector(198.0)), Vector(Vector(199.0), Vector(200.0))), s0(Vector(Vector(201.0)), Vector(Vector(202.0), Vector(203.0)))))))), s5(s4(s1(s0(Vector(Vector(204.0)), Vector(Vector(205.0), Vector(206.0))), s0(Vector(Vector(207.0)), Vector(Vector(208.0), Vector(209.0)))), Vector(s3(Vector(Vector(s1(s0(Vector(Vector(210.0)), Vector(Vector(211.0), Vector(212.0))), s0(Vector(Vector(213.0)), Vector(Vector(214.0), Vector(215.0)))))), s2(s0(Vector(Vector(216.0)), Vector(Vector(217.0), Vector(218.0))), s0(Vector(Vector(219.0)), Vector(Vector(220.0), Vector(221.0)))))))), s5(s4(s1(s0(Vector(Vector(222.0)), Vector(Vector(223.0), Vector(224.0))), s0(Vector(Vector(225.0)), Vector(Vector(226.0), Vector(227.0)))), Vector(s3(Vector(Vector(s1(s0(Vector(Vector(228.0)), Vector(Vector(229.0), Vector(230.0))), s0(Vector(Vector(231.0)), Vector(Vector(232.0), Vector(233.0)))))), s2(s0(Vector(Vector(234.0)), Vector(Vector(235.0), Vector(236.0))), s0(Vector(Vector(237.0)), Vector(Vector(238.0), Vector(239.0))))))))))
    val v2: Double = 240.0
    val start = nanoTime()
    var result: Double = 240.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}