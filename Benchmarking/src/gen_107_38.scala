import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[Vector[s0]]
  )
  case class s2 (
    p0: Vector[Vector[s0]],
    p1: Vector[s1]
  )
  case class s3 (
    p0: s2,
    p1: Vector[Vector[s0]]
  )
  case class s5 (
    p0: Vector[s0],
    p1: Vector[s2]
  )
  case class s6 (
    p0: Vector[s5],
    p1: Vector[Vector[s3]]
  )
  def f117(v0: s1): s1 = {
    v0
  }
  def f101(v0: s1): s1 = {
    val v2: s1 = f117(v0)
    v2
  }
  def f85(v0: Vector[s0], v1: Vector[s5]): Vector[s0] = {
    val v174: s5 = v1(0)
    val v216: Vector[s0] = v174.p0
    v216
  }
  def f80(v0: s5, v1: s1): s1 = {
    var v5: s1 = v1
    val v3: Vector[Vector[s0]] = v1.p1
    val v7: s1 = f117(v5)
    val v9: Vector[Vector[s0]] = v1.p1
    val v6: s1 = f117(v7)
    val v10: Vector[s0] = v0.p0
    var v8: Vector[Vector[s0]] = v9
    v5 = v5.copy(p1 = v9)
    v5 = v5.copy(p1 = v3)
    val v32: Vector[s0] = v3(2)
    var v26: s1 = v7
    v5 = v5.copy(p1 = v8)
    val v33: s1 = f117(v26)
    val v22: s1 = f101(v6)
    val v16: s1 = f117(v7)
    val v40: Vector[Vector[s0]] = v6.p1
    v8 = v8.updated(0, v32)
    v8 = v8.updated(2, v10)
    val v47: Vector[Vector[s0]] = v22.p1
    val v38: Vector[s2] = v0.p1
    v8 = v8.updated(2, v32)
    v5 = v5.copy(p1 = v8)
    v26 = v26.copy(p1 = v40)
    v5 = v5.copy(p1 = v47)
    val v49: Vector[s0] = v16.p0
    var v64: Vector[s0] = v49
    val v57: s1 = f117(v33)
    val v120: s2 = v38(0)
    val v70: Vector[Vector[s0]] = v120.p0
    val v39: Vector[s0] = v70(1)
    v5 = v5.copy(p0 = v64)
    v5 = v5.copy(p0 = v49)
    val v188: s1 = f101(v57)
    v26 = v26.copy(p0 = v64)
    val v51: s1 = f117(v188)
    v8 = v8.updated(2, v39)
    v51
  }
  def f1(v0: s5, v1: s5): s5 = {
    var v58: s5 = v1
    v58
  }
  @noinline
  def f0(v0: s1, v1: s3, v2: s5, v3: s6, v4: Double): Double = {
    val v19: Vector[Vector[s0]] = v1.p1
    val v7: Vector[s5] = v3.p0
    val v6: Vector[s0] = v19(2)
    val v5: s1 = f101(v0)
    var v11: s5 = v2
    val v9: Vector[Vector[s0]] = v5.p1
    val v13: s5 = f1(v11, v2)
    var v15: Vector[Vector[s0]] = v9
    var v10: Vector[s0] = v6
    v15 = v15.updated(0, v10)
    val v30: s1 = f80(v11, v0)
    val v23: s5 = f1(v2, v11)
    v11 = v11.copy(p0 = v10)
    val v35: Vector[s0] = v15(1)
    val v12: s1 = f80(v23, v30)
    val v16: Vector[s0] = v12.p0
    val v29: s0 = v16(0)
    v15 = v15.updated(1, v6)
    val v34: Vector[s0] = f85(v35, v7)
    val v21: Vector[Vector[Double]] = v29.p1
    val v18: Vector[s2] = v2.p1
    v15 = v15.updated(2, v35)
    val v52: Vector[s2] = v13.p1
    v11 = v11.copy(p1 = v18)
    var v89: Vector[Vector[Double]] = v21
    val v48: s2 = v52(0)
    v11 = v11.copy(p0 = v10)
    val v38: Vector[Double] = v89(0)
    val v80: s0 = v16(0)
    v11 = v11.copy(p1 = v18)
    v89 = v89.updated(0, v38)
    v11 = v11.copy(p0 = v34)
    val v95: Vector[Vector[s0]] = v48.p0
    val v145: Vector[s0] = v95(1)
    v15 = v15.updated(2, v145)
    val v105: Double = v38(0)
    v15 = v15.updated(2, v145)
    v10 = v10.updated(0, v80)
    v105
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0))), s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0)))), Vector(Vector(s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0)))), Vector(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0)))), Vector(s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0))))))
    val v1: s3 = s3(s2(Vector(Vector(s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0)))), Vector(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0))))), Vector(s1(Vector(s0(Vector(Vector(28.0), Vector(29.0), Vector(30.0)), Vector(Vector(31.0))), s0(Vector(Vector(32.0), Vector(33.0), Vector(34.0)), Vector(Vector(35.0)))), Vector(Vector(s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0)))), Vector(s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0)))), Vector(s0(Vector(Vector(44.0), Vector(45.0), Vector(46.0)), Vector(Vector(47.0)))))))), Vector(Vector(s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0)))), Vector(s0(Vector(Vector(52.0), Vector(53.0), Vector(54.0)), Vector(Vector(55.0)))), Vector(s0(Vector(Vector(56.0), Vector(57.0), Vector(58.0)), Vector(Vector(59.0))))))
    val v2: s5 = s5(Vector(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0)))), Vector(s2(Vector(Vector(s0(Vector(Vector(64.0), Vector(65.0), Vector(66.0)), Vector(Vector(67.0)))), Vector(s0(Vector(Vector(68.0), Vector(69.0), Vector(70.0)), Vector(Vector(71.0))))), Vector(s1(Vector(s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)), Vector(Vector(75.0))), s0(Vector(Vector(76.0), Vector(77.0), Vector(78.0)), Vector(Vector(79.0)))), Vector(Vector(s0(Vector(Vector(80.0), Vector(81.0), Vector(82.0)), Vector(Vector(83.0)))), Vector(s0(Vector(Vector(84.0), Vector(85.0), Vector(86.0)), Vector(Vector(87.0)))), Vector(s0(Vector(Vector(88.0), Vector(89.0), Vector(90.0)), Vector(Vector(91.0)))))))), s2(Vector(Vector(s0(Vector(Vector(92.0), Vector(93.0), Vector(94.0)), Vector(Vector(95.0)))), Vector(s0(Vector(Vector(96.0), Vector(97.0), Vector(98.0)), Vector(Vector(99.0))))), Vector(s1(Vector(s0(Vector(Vector(100.0), Vector(101.0), Vector(102.0)), Vector(Vector(103.0))), s0(Vector(Vector(104.0), Vector(105.0), Vector(106.0)), Vector(Vector(107.0)))), Vector(Vector(s0(Vector(Vector(108.0), Vector(109.0), Vector(110.0)), Vector(Vector(111.0)))), Vector(s0(Vector(Vector(112.0), Vector(113.0), Vector(114.0)), Vector(Vector(115.0)))), Vector(s0(Vector(Vector(116.0), Vector(117.0), Vector(118.0)), Vector(Vector(119.0))))))))))
    val v3: s6 = s6(Vector(s5(Vector(s0(Vector(Vector(120.0), Vector(121.0), Vector(122.0)), Vector(Vector(123.0)))), Vector(s2(Vector(Vector(s0(Vector(Vector(124.0), Vector(125.0), Vector(126.0)), Vector(Vector(127.0)))), Vector(s0(Vector(Vector(128.0), Vector(129.0), Vector(130.0)), Vector(Vector(131.0))))), Vector(s1(Vector(s0(Vector(Vector(132.0), Vector(133.0), Vector(134.0)), Vector(Vector(135.0))), s0(Vector(Vector(136.0), Vector(137.0), Vector(138.0)), Vector(Vector(139.0)))), Vector(Vector(s0(Vector(Vector(140.0), Vector(141.0), Vector(142.0)), Vector(Vector(143.0)))), Vector(s0(Vector(Vector(144.0), Vector(145.0), Vector(146.0)), Vector(Vector(147.0)))), Vector(s0(Vector(Vector(148.0), Vector(149.0), Vector(150.0)), Vector(Vector(151.0)))))))), s2(Vector(Vector(s0(Vector(Vector(152.0), Vector(153.0), Vector(154.0)), Vector(Vector(155.0)))), Vector(s0(Vector(Vector(156.0), Vector(157.0), Vector(158.0)), Vector(Vector(159.0))))), Vector(s1(Vector(s0(Vector(Vector(160.0), Vector(161.0), Vector(162.0)), Vector(Vector(163.0))), s0(Vector(Vector(164.0), Vector(165.0), Vector(166.0)), Vector(Vector(167.0)))), Vector(Vector(s0(Vector(Vector(168.0), Vector(169.0), Vector(170.0)), Vector(Vector(171.0)))), Vector(s0(Vector(Vector(172.0), Vector(173.0), Vector(174.0)), Vector(Vector(175.0)))), Vector(s0(Vector(Vector(176.0), Vector(177.0), Vector(178.0)), Vector(Vector(179.0))))))))))), Vector(Vector(s3(s2(Vector(Vector(s0(Vector(Vector(180.0), Vector(181.0), Vector(182.0)), Vector(Vector(183.0)))), Vector(s0(Vector(Vector(184.0), Vector(185.0), Vector(186.0)), Vector(Vector(187.0))))), Vector(s1(Vector(s0(Vector(Vector(188.0), Vector(189.0), Vector(190.0)), Vector(Vector(191.0))), s0(Vector(Vector(192.0), Vector(193.0), Vector(194.0)), Vector(Vector(195.0)))), Vector(Vector(s0(Vector(Vector(196.0), Vector(197.0), Vector(198.0)), Vector(Vector(199.0)))), Vector(s0(Vector(Vector(200.0), Vector(201.0), Vector(202.0)), Vector(Vector(203.0)))), Vector(s0(Vector(Vector(204.0), Vector(205.0), Vector(206.0)), Vector(Vector(207.0)))))))), Vector(Vector(s0(Vector(Vector(208.0), Vector(209.0), Vector(210.0)), Vector(Vector(211.0)))), Vector(s0(Vector(Vector(212.0), Vector(213.0), Vector(214.0)), Vector(Vector(215.0)))), Vector(s0(Vector(Vector(216.0), Vector(217.0), Vector(218.0)), Vector(Vector(219.0))))))), Vector(s3(s2(Vector(Vector(s0(Vector(Vector(220.0), Vector(221.0), Vector(222.0)), Vector(Vector(223.0)))), Vector(s0(Vector(Vector(224.0), Vector(225.0), Vector(226.0)), Vector(Vector(227.0))))), Vector(s1(Vector(s0(Vector(Vector(228.0), Vector(229.0), Vector(230.0)), Vector(Vector(231.0))), s0(Vector(Vector(232.0), Vector(233.0), Vector(234.0)), Vector(Vector(235.0)))), Vector(Vector(s0(Vector(Vector(236.0), Vector(237.0), Vector(238.0)), Vector(Vector(239.0)))), Vector(s0(Vector(Vector(240.0), Vector(241.0), Vector(242.0)), Vector(Vector(243.0)))), Vector(s0(Vector(Vector(244.0), Vector(245.0), Vector(246.0)), Vector(Vector(247.0)))))))), Vector(Vector(s0(Vector(Vector(248.0), Vector(249.0), Vector(250.0)), Vector(Vector(251.0)))), Vector(s0(Vector(Vector(252.0), Vector(253.0), Vector(254.0)), Vector(Vector(255.0)))), Vector(s0(Vector(Vector(256.0), Vector(257.0), Vector(258.0)), Vector(Vector(259.0)))))))))
    val v4: Double = 260.0
    val start = nanoTime()
    var result: Double = 260.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}