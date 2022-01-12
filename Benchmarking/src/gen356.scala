import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Double,
    p1: Vector[Vector[s0]]
  )
  case class s2 (
    p0: Vector[s1],
    p1: s1
  )
  case class s3 (
    p0: s2,
    p1: s2
  )
  case class s4 (
    p0: Vector[Vector[s3]],
    p1: Vector[Vector[s0]]
  )
  case class s5 (
    p0: s0,
    p1: Vector[s1]
  )
  case class s9 (
    p0: s5,
    p1: Vector[Vector[s5]]
  )
  def f43(v0: s1): s1 = {
    val v6: Double = v0.p0
    var v5: Double = v6
    val v7: Vector[Vector[s0]] = v0.p1
    val v8: s1 = s1(v5, v7)
    v8
  }
  def f34(v0: s0): s0 = {
    val v6: Vector[Vector[Double]] = v0.p0
    val v9: Vector[Vector[Double]] = v0.p1
    val v5: Vector[Vector[Double]] = v0.p0
    val v4: Vector[Vector[Double]] = v0.p0
    val v8: Vector[Double] = v4(0)
    var v18: Vector[Vector[Double]] = v4
    var v13: s0 = v0
    val v10: Vector[Double] = v6(0)
    var v41: Vector[Vector[Double]] = v9
    val v25: Double = v8(0)
    var v16: Double = v25
    var v15: Vector[Double] = v10
    v15 = v15.updated(0, v16)
    var v19: Vector[Vector[Double]] = v9
    val v37: Vector[Vector[Double]] = v13.p1
    v18 = v18.updated(0, v15)
    v13 = v13.copy(p1 = v9)
    val v23: Vector[Double] = v5(0)
    val v24: s0 = s0(v18, v41)
    val v54: Vector[Double] = v18(0)
    v41 = v37
    v13 = v24
    val v75: Vector[Vector[Double]] = v24.p1
    v19 = v19.updated(1, v23)
    v13 = v13.copy(p1 = v19)
    val v77: Vector[Double] = v75(0)
    val v32: Vector[Double] = v37(1)
    var v30: s0 = v13
    val v67: Vector[Vector[Double]] = v30.p0
    v30 = v30.copy(p1 = v19)
    v18 = v18.updated(0, v15)
    v41 = v41.updated(2, v77)
    v30 = v30.copy(p1 = v75)
    v41 = v41.updated(0, v32)
    val v69: Vector[Double] = v4(0)
    v18 = v18.updated(0, v54)
    v41 = v41.updated(2, v54)
    val v89: Vector[Double] = v67(0)
    v41 = v41.updated(1, v89)
    val v114: Vector[Vector[Double]] = v13.p1
    v30 = v30.copy(p1 = v114)
    v41 = v41.updated(1, v69)
    v30 = v30.copy(p1 = v9)
    v30 = v30.copy(p1 = v41)
    v13 = v13.copy(p1 = v75)
    v30
  }
  def f32(v0: s1): s1 = {
    val v4: s1 = f43(v0)
    val v2: Vector[Vector[s0]] = v4.p1
    val v1: Vector[s0] = v2(0)
    val v8: Vector[s0] = v2(0)
    var v5: Vector[s0] = v1
    val v29: Vector[s0] = v2(0)
    val v13: s1 = f43(v0)
    var v15: Vector[Vector[s0]] = v2
    v15 = v15.updated(0, v5)
    val v11: Double = v13.p0
    val v19: s1 = s1(v11, v15)
    v15 = v15.updated(0, v29)
    val v22: s0 = v8(0)
    val v52: Vector[Vector[s0]] = v19.p1
    v5 = v5.updated(0, v22)
    v5 = v5.updated(0, v22)
    v5 = v5.updated(0, v22)
    val v69: Double = v0.p0
    val v77: s0 = f34(v22)
    val v82: s0 = f34(v77)
    val v51: s0 = f34(v82)
    v5 = v5.updated(0, v51)
    val v84: s1 = s1(v69, v52)
    v5 = v5.updated(0, v22)
    v84
  }
  def f31(v0: s1): s1 = {
    val v4: s1 = f43(v0)
    val v2: s1 = f43(v4)
    val v1: s1 = f32(v2)
    var v3: s1 = v1
    val v6: Double = v3.p0
    v3 = v3.copy(p0 = v6)
    var v7: Double = v6
    v3 = v3.copy(p0 = v6)
    val v5: s1 = f32(v0)
    val v11: s1 = f32(v5)
    val v8: Vector[Vector[s0]] = v11.p1
    val v18: Vector[s0] = v8(0)
    val v12: Double = v2.p0
    v3 = v3.copy(p0 = v7)
    val v15: Vector[Vector[s0]] = v0.p1
    val v17: s1 = f43(v4)
    val v20: s1 = s1(v12, v8)
    var v73: s1 = v17
    val v30: s1 = f32(v3)
    v73 = v73.copy(p1 = v8)
    v73 = v73.copy(p1 = v15)
    val v38: s1 = f43(v73)
    var v32: Vector[Vector[s0]] = v8
    val v58: Double = v38.p0
    v3 = v3.copy(p1 = v15)
    v73 = v73.copy(p1 = v15)
    val v39: Vector[s0] = v32(0)
    v32 = v32.updated(0, v39)
    val v80: Vector[Vector[Vector[s0]]] = Vector(v8, v8, v8, v8, v32, v8, v32)
    val v182: Vector[Vector[s0]] = v3.p1
    val v46: s1 = f32(v30)
    val v94: Vector[s0] = v8(0)
    v3 = v46
    val v63: s1 = f32(v20)
    val v162: Vector[Vector[s0]] = v63.p1
    var v90: Vector[Vector[s0]] = v182
    v90 = v90.updated(0, v94)
    val v207: Vector[Vector[s0]] = v80(4)
    v73 = v73.copy(p1 = v162)
    val v131: s1 = s1(v58, v207)
    v90 = v90.updated(0, v18)
    v73 = v73.copy(p1 = v90)
    v131
  }
  def f12(v0: s1): s1 = {
    val v6: s1 = f43(v0)
    var v3: s1 = v6
    val v4: s1 = f43(v3)
    val v7: s1 = f31(v4)
    val v8: s1 = f32(v6)
    var v11: s1 = v3
    val v2: s1 = f31(v7)
    val v9: Double = v11.p0
    val v14: Vector[Vector[s0]] = v8.p1
    val v13: Double = v2.p0
    v3 = v2
    val v16: Vector[Vector[s0]] = v8.p1
    val v12: s1 = f43(v2)
    val v25: s1 = s1(v9, v16)
    v3 = v3.copy(p0 = v9)
    val v18: Double = v3.p0
    var v32: Double = v9
    v3 = v12
    val v17: s1 = f32(v4)
    v3 = v3.copy(p0 = v18)
    var v21: s1 = v8
    v21 = v21.copy(p0 = v18)
    var v19: Vector[Vector[s0]] = v16
    val v41: Vector[s0] = v19(0)
    v19 = v19.updated(0, v41)
    var v49: s1 = v17
    v32 = v13
    v3 = v3.copy(p1 = v19)
    val v27: Double = v25.p0
    v11 = v11.copy(p1 = v14)
    v11 = v11.copy(p0 = v27)
    v49 = v49.copy(p0 = v32)
    v11 = v11.copy(p1 = v16)
    var v66: Vector[Vector[s0]] = v14
    v21 = v21.copy(p1 = v19)
    val v54: Double = v21.p0
    var v209: s1 = v49
    v11 = v11.copy(p1 = v66)
    v49 = v49.copy(p0 = v54)
    v209
  }
  @noinline
  def f0(v0: Vector[Vector[s2]], v1: s4, v2: Vector[s9], v3: Double): Double = {
    val v4: Vector[s2] = v0(0)
    val v9: s2 = v4(0)
    val v14: s1 = v9.p1
    val v19: s1 = f12(v14)
    val v143: Double = v19.p0
    val v56: Double = v3 / v3
    val v79: Double = v56 - v143
    v79
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s2]] = Vector(Vector(s2(Vector(s1(0.0, Vector(Vector(s0(Vector(Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0)))))), s1(5.0, Vector(Vector(s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0))))))), s1(10.0, Vector(Vector(s0(Vector(Vector(11.0)), Vector(Vector(12.0), Vector(13.0), Vector(14.0)))))))))
    val v1: s4 = s4(Vector(Vector(s3(s2(Vector(s1(15.0, Vector(Vector(s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0)))))), s1(20.0, Vector(Vector(s0(Vector(Vector(21.0)), Vector(Vector(22.0), Vector(23.0), Vector(24.0))))))), s1(25.0, Vector(Vector(s0(Vector(Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0))))))), s2(Vector(s1(30.0, Vector(Vector(s0(Vector(Vector(31.0)), Vector(Vector(32.0), Vector(33.0), Vector(34.0)))))), s1(35.0, Vector(Vector(s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0))))))), s1(40.0, Vector(Vector(s0(Vector(Vector(41.0)), Vector(Vector(42.0), Vector(43.0), Vector(44.0))))))))), Vector(s3(s2(Vector(s1(45.0, Vector(Vector(s0(Vector(Vector(46.0)), Vector(Vector(47.0), Vector(48.0), Vector(49.0)))))), s1(50.0, Vector(Vector(s0(Vector(Vector(51.0)), Vector(Vector(52.0), Vector(53.0), Vector(54.0))))))), s1(55.0, Vector(Vector(s0(Vector(Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0))))))), s2(Vector(s1(60.0, Vector(Vector(s0(Vector(Vector(61.0)), Vector(Vector(62.0), Vector(63.0), Vector(64.0)))))), s1(65.0, Vector(Vector(s0(Vector(Vector(66.0)), Vector(Vector(67.0), Vector(68.0), Vector(69.0))))))), s1(70.0, Vector(Vector(s0(Vector(Vector(71.0)), Vector(Vector(72.0), Vector(73.0), Vector(74.0))))))))), Vector(s3(s2(Vector(s1(75.0, Vector(Vector(s0(Vector(Vector(76.0)), Vector(Vector(77.0), Vector(78.0), Vector(79.0)))))), s1(80.0, Vector(Vector(s0(Vector(Vector(81.0)), Vector(Vector(82.0), Vector(83.0), Vector(84.0))))))), s1(85.0, Vector(Vector(s0(Vector(Vector(86.0)), Vector(Vector(87.0), Vector(88.0), Vector(89.0))))))), s2(Vector(s1(90.0, Vector(Vector(s0(Vector(Vector(91.0)), Vector(Vector(92.0), Vector(93.0), Vector(94.0)))))), s1(95.0, Vector(Vector(s0(Vector(Vector(96.0)), Vector(Vector(97.0), Vector(98.0), Vector(99.0))))))), s1(100.0, Vector(Vector(s0(Vector(Vector(101.0)), Vector(Vector(102.0), Vector(103.0), Vector(104.0)))))))))), Vector(Vector(s0(Vector(Vector(105.0)), Vector(Vector(106.0), Vector(107.0), Vector(108.0))))))
    val v2: Vector[s9] = Vector(s9(s5(s0(Vector(Vector(109.0)), Vector(Vector(110.0), Vector(111.0), Vector(112.0))), Vector(s1(113.0, Vector(Vector(s0(Vector(Vector(114.0)), Vector(Vector(115.0), Vector(116.0), Vector(117.0)))))), s1(118.0, Vector(Vector(s0(Vector(Vector(119.0)), Vector(Vector(120.0), Vector(121.0), Vector(122.0)))))), s1(123.0, Vector(Vector(s0(Vector(Vector(124.0)), Vector(Vector(125.0), Vector(126.0), Vector(127.0)))))))), Vector(Vector(s5(s0(Vector(Vector(128.0)), Vector(Vector(129.0), Vector(130.0), Vector(131.0))), Vector(s1(132.0, Vector(Vector(s0(Vector(Vector(133.0)), Vector(Vector(134.0), Vector(135.0), Vector(136.0)))))), s1(137.0, Vector(Vector(s0(Vector(Vector(138.0)), Vector(Vector(139.0), Vector(140.0), Vector(141.0)))))), s1(142.0, Vector(Vector(s0(Vector(Vector(143.0)), Vector(Vector(144.0), Vector(145.0), Vector(146.0))))))))))), s9(s5(s0(Vector(Vector(147.0)), Vector(Vector(148.0), Vector(149.0), Vector(150.0))), Vector(s1(151.0, Vector(Vector(s0(Vector(Vector(152.0)), Vector(Vector(153.0), Vector(154.0), Vector(155.0)))))), s1(156.0, Vector(Vector(s0(Vector(Vector(157.0)), Vector(Vector(158.0), Vector(159.0), Vector(160.0)))))), s1(161.0, Vector(Vector(s0(Vector(Vector(162.0)), Vector(Vector(163.0), Vector(164.0), Vector(165.0)))))))), Vector(Vector(s5(s0(Vector(Vector(166.0)), Vector(Vector(167.0), Vector(168.0), Vector(169.0))), Vector(s1(170.0, Vector(Vector(s0(Vector(Vector(171.0)), Vector(Vector(172.0), Vector(173.0), Vector(174.0)))))), s1(175.0, Vector(Vector(s0(Vector(Vector(176.0)), Vector(Vector(177.0), Vector(178.0), Vector(179.0)))))), s1(180.0, Vector(Vector(s0(Vector(Vector(181.0)), Vector(Vector(182.0), Vector(183.0), Vector(184.0))))))))))), s9(s5(s0(Vector(Vector(185.0)), Vector(Vector(186.0), Vector(187.0), Vector(188.0))), Vector(s1(189.0, Vector(Vector(s0(Vector(Vector(190.0)), Vector(Vector(191.0), Vector(192.0), Vector(193.0)))))), s1(194.0, Vector(Vector(s0(Vector(Vector(195.0)), Vector(Vector(196.0), Vector(197.0), Vector(198.0)))))), s1(199.0, Vector(Vector(s0(Vector(Vector(200.0)), Vector(Vector(201.0), Vector(202.0), Vector(203.0)))))))), Vector(Vector(s5(s0(Vector(Vector(204.0)), Vector(Vector(205.0), Vector(206.0), Vector(207.0))), Vector(s1(208.0, Vector(Vector(s0(Vector(Vector(209.0)), Vector(Vector(210.0), Vector(211.0), Vector(212.0)))))), s1(213.0, Vector(Vector(s0(Vector(Vector(214.0)), Vector(Vector(215.0), Vector(216.0), Vector(217.0)))))), s1(218.0, Vector(Vector(s0(Vector(Vector(219.0)), Vector(Vector(220.0), Vector(221.0), Vector(222.0))))))))))))
    val v3: Double = 223.0
    val start = nanoTime()
    var result: Double = 223.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}