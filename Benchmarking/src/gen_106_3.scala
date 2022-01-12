import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: s0
  )
  case class s2 (
    p0: s1,
    p1: Vector[s0]
  )
  case class s3 (
    p0: s2,
    p1: s1
  )
  case class s5 (
    p0: s3,
    p1: Vector[Vector[s3]]
  )
  case class s7 (
    p0: s5,
    p1: Vector[s5]
  )
  def f51(v0: s0): s0 = {
    var v4: s0 = v0
    var v7: s0 = v4
    val v2: Vector[Vector[Double]] = v0.p1
    val v5: Vector[Vector[Double]] = v4.p0
    val v8: Vector[Vector[Double]] = v0.p1
    val v9: s0 = s0(v5, v8)
    val v11: Vector[Vector[Double]] = v7.p1
    v7 = v7.copy(p0 = v5)
    val v13: Vector[Vector[Double]] = v0.p0
    v7 = v7.copy(p0 = v5)
    v7 = v7.copy(p1 = v2)
    v4 = v4.copy(p0 = v13)
    val v19: Vector[Vector[Double]] = v7.p0
    val v12: Vector[Vector[Double]] = v7.p1
    val v54: Vector[s0] = Vector(v9)
    v4 = v4.copy(p1 = v8)
    var v27: Vector[Vector[Double]] = v12
    val v46: Vector[Double] = v19(0)
    val v36: Vector[Vector[s0]] = Vector(v54, v54, v54, v54)
    val v72: Vector[s0] = v36(2)
    val v29: s0 = v72(0)
    val v31: Vector[Vector[Double]] = v29.p1
    val v43: Vector[Vector[Double]] = v29.p0
    val v32: Vector[Double] = v19(1)
    val v60: Vector[s0] = v36(1)
    v7 = v7.copy(p1 = v31)
    v7 = v7.copy(p0 = v43)
    val v33: Vector[Vector[s0]] = Vector(v60, v72)
    v4 = v4.copy(p0 = v43)
    val v101: Vector[Vector[Double]] = v7.p0
    var v89: Vector[Vector[s0]] = v33
    var v58: Vector[Vector[Double]] = v2
    v58 = v11
    val v44: Vector[Vector[Double]] = v9.p1
    v4 = v4.copy(p0 = v13)
    v7 = v7.copy(p0 = v43)
    v4 = v4.copy(p1 = v27)
    v27 = v27.updated(2, v32)
    val v109: Vector[Vector[Double]] = v7.p1
    v89 = v89.updated(0, v60)
    v7 = v7.copy(p0 = v101)
    v7 = v7.copy(p1 = v58)
    v89 = v89.updated(0, v72)
    val v64: s1 = s1(v89, v4)
    val v100: s0 = v64.p1
    v4 = v4.copy(p1 = v109)
    val v150: Vector[Vector[s0]] = v64.p0
    val v79: Vector[s0] = Vector(v0, v100, v7)
    v89 = v150
    v58 = v44
    v27 = v27.updated(1, v46)
    val v290: s0 = v79(0)
    v4 = v4.copy(p1 = v11)
    v290
  }
  @noinline
  def f0(v0: s7, v1: Vector[Vector[s0]], v2: Double): Double = {
    val v5: Vector[s0] = v1(0)
    val v36: s0 = v5(0)
    val v43: s0 = f51(v36)
    val v32: Vector[Vector[Double]] = v43.p1
    val v59: Vector[Double] = v32(1)
    val v118: Double = v59(0)
    v118
  }
  def benchmark(): Unit = {
    val v0: s7 = s7(s5(s3(s2(s1(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0)))), Vector(s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0))))), s0(Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0), Vector(14.0)))), Vector(s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0))), s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0), Vector(24.0))), s0(Vector(Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0))))), s1(Vector(Vector(s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0), Vector(33.0), Vector(34.0)))), Vector(s0(Vector(Vector(35.0), Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0))))), s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0), Vector(44.0))))), Vector(Vector(s3(s2(s1(Vector(Vector(s0(Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0), Vector(48.0), Vector(49.0)))), Vector(s0(Vector(Vector(50.0), Vector(51.0)), Vector(Vector(52.0), Vector(53.0), Vector(54.0))))), s0(Vector(Vector(55.0), Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0)))), Vector(s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0), Vector(63.0), Vector(64.0))), s0(Vector(Vector(65.0), Vector(66.0)), Vector(Vector(67.0), Vector(68.0), Vector(69.0))), s0(Vector(Vector(70.0), Vector(71.0)), Vector(Vector(72.0), Vector(73.0), Vector(74.0))))), s1(Vector(Vector(s0(Vector(Vector(75.0), Vector(76.0)), Vector(Vector(77.0), Vector(78.0), Vector(79.0)))), Vector(s0(Vector(Vector(80.0), Vector(81.0)), Vector(Vector(82.0), Vector(83.0), Vector(84.0))))), s0(Vector(Vector(85.0), Vector(86.0)), Vector(Vector(87.0), Vector(88.0), Vector(89.0)))))), Vector(s3(s2(s1(Vector(Vector(s0(Vector(Vector(90.0), Vector(91.0)), Vector(Vector(92.0), Vector(93.0), Vector(94.0)))), Vector(s0(Vector(Vector(95.0), Vector(96.0)), Vector(Vector(97.0), Vector(98.0), Vector(99.0))))), s0(Vector(Vector(100.0), Vector(101.0)), Vector(Vector(102.0), Vector(103.0), Vector(104.0)))), Vector(s0(Vector(Vector(105.0), Vector(106.0)), Vector(Vector(107.0), Vector(108.0), Vector(109.0))), s0(Vector(Vector(110.0), Vector(111.0)), Vector(Vector(112.0), Vector(113.0), Vector(114.0))), s0(Vector(Vector(115.0), Vector(116.0)), Vector(Vector(117.0), Vector(118.0), Vector(119.0))))), s1(Vector(Vector(s0(Vector(Vector(120.0), Vector(121.0)), Vector(Vector(122.0), Vector(123.0), Vector(124.0)))), Vector(s0(Vector(Vector(125.0), Vector(126.0)), Vector(Vector(127.0), Vector(128.0), Vector(129.0))))), s0(Vector(Vector(130.0), Vector(131.0)), Vector(Vector(132.0), Vector(133.0), Vector(134.0)))))))), Vector(s5(s3(s2(s1(Vector(Vector(s0(Vector(Vector(135.0), Vector(136.0)), Vector(Vector(137.0), Vector(138.0), Vector(139.0)))), Vector(s0(Vector(Vector(140.0), Vector(141.0)), Vector(Vector(142.0), Vector(143.0), Vector(144.0))))), s0(Vector(Vector(145.0), Vector(146.0)), Vector(Vector(147.0), Vector(148.0), Vector(149.0)))), Vector(s0(Vector(Vector(150.0), Vector(151.0)), Vector(Vector(152.0), Vector(153.0), Vector(154.0))), s0(Vector(Vector(155.0), Vector(156.0)), Vector(Vector(157.0), Vector(158.0), Vector(159.0))), s0(Vector(Vector(160.0), Vector(161.0)), Vector(Vector(162.0), Vector(163.0), Vector(164.0))))), s1(Vector(Vector(s0(Vector(Vector(165.0), Vector(166.0)), Vector(Vector(167.0), Vector(168.0), Vector(169.0)))), Vector(s0(Vector(Vector(170.0), Vector(171.0)), Vector(Vector(172.0), Vector(173.0), Vector(174.0))))), s0(Vector(Vector(175.0), Vector(176.0)), Vector(Vector(177.0), Vector(178.0), Vector(179.0))))), Vector(Vector(s3(s2(s1(Vector(Vector(s0(Vector(Vector(180.0), Vector(181.0)), Vector(Vector(182.0), Vector(183.0), Vector(184.0)))), Vector(s0(Vector(Vector(185.0), Vector(186.0)), Vector(Vector(187.0), Vector(188.0), Vector(189.0))))), s0(Vector(Vector(190.0), Vector(191.0)), Vector(Vector(192.0), Vector(193.0), Vector(194.0)))), Vector(s0(Vector(Vector(195.0), Vector(196.0)), Vector(Vector(197.0), Vector(198.0), Vector(199.0))), s0(Vector(Vector(200.0), Vector(201.0)), Vector(Vector(202.0), Vector(203.0), Vector(204.0))), s0(Vector(Vector(205.0), Vector(206.0)), Vector(Vector(207.0), Vector(208.0), Vector(209.0))))), s1(Vector(Vector(s0(Vector(Vector(210.0), Vector(211.0)), Vector(Vector(212.0), Vector(213.0), Vector(214.0)))), Vector(s0(Vector(Vector(215.0), Vector(216.0)), Vector(Vector(217.0), Vector(218.0), Vector(219.0))))), s0(Vector(Vector(220.0), Vector(221.0)), Vector(Vector(222.0), Vector(223.0), Vector(224.0)))))), Vector(s3(s2(s1(Vector(Vector(s0(Vector(Vector(225.0), Vector(226.0)), Vector(Vector(227.0), Vector(228.0), Vector(229.0)))), Vector(s0(Vector(Vector(230.0), Vector(231.0)), Vector(Vector(232.0), Vector(233.0), Vector(234.0))))), s0(Vector(Vector(235.0), Vector(236.0)), Vector(Vector(237.0), Vector(238.0), Vector(239.0)))), Vector(s0(Vector(Vector(240.0), Vector(241.0)), Vector(Vector(242.0), Vector(243.0), Vector(244.0))), s0(Vector(Vector(245.0), Vector(246.0)), Vector(Vector(247.0), Vector(248.0), Vector(249.0))), s0(Vector(Vector(250.0), Vector(251.0)), Vector(Vector(252.0), Vector(253.0), Vector(254.0))))), s1(Vector(Vector(s0(Vector(Vector(255.0), Vector(256.0)), Vector(Vector(257.0), Vector(258.0), Vector(259.0)))), Vector(s0(Vector(Vector(260.0), Vector(261.0)), Vector(Vector(262.0), Vector(263.0), Vector(264.0))))), s0(Vector(Vector(265.0), Vector(266.0)), Vector(Vector(267.0), Vector(268.0), Vector(269.0))))))))))
    val v1: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(270.0), Vector(271.0)), Vector(Vector(272.0), Vector(273.0), Vector(274.0)))))
    val v2: Double = 275.0
    val start = nanoTime()
    var result: Double = 275.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}