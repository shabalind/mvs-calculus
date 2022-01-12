import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Double,
    p2: Vector[Vector[Double]],
    p3: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: s0
  )
  case class s2 (
    p0: Vector[s1],
    p1: Vector[s1],
    p2: s0,
    p3: s1
  )
  case class s4 (
    p0: Vector[s0],
    p1: Vector[s2]
  )
  def f22(v0: s0): s0 = {
    var v3: s0 = v0
    val v2: Vector[Vector[Double]] = v0.p3
    var v4: s0 = v3
    val v7: Vector[Vector[Double]] = v0.p0
    val v8: Vector[Double] = v2(1)
    val v6: Vector[s0] = Vector(v4, v4, v4, v0, v0, v3)
    var v5: s0 = v0
    var v11: Vector[Double] = v8
    val v1: s0 = v6(2)
    val v9: Double = v11(0)
    var v10: Vector[Vector[Double]] = v2
    val v14: Double = v9 / v9
    val v28: Vector[Vector[Double]] = v1.p3
    val v17: Vector[Double] = v28(2)
    val v13: Vector[Vector[Double]] = v1.p0
    val v22: s0 = v6(0)
    v10 = v10.updated(1, v17)
    val v29: Double = v17(0)
    v3 = v3.copy(p0 = v7)
    val v19: s0 = v6(4)
    v4 = v4.copy(p0 = v13)
    v4 = v4.copy(p3 = v10)
    v11 = v11.updated(0, v9)
    var v15: Double = v29
    val v40: Vector[Vector[Double]] = v5.p0
    v11 = v11.updated(0, v15)
    v3 = v3.copy(p0 = v13)
    v3 = v3.copy(p0 = v13)
    val v47: Vector[Vector[Double]] = v0.p0
    v4 = v4.copy(p1 = v14)
    v5 = v5.copy(p3 = v28)
    v3 = v3.copy(p2 = v47)
    val v49: Vector[Vector[Double]] = v19.p2
    v3 = v3.copy(p2 = v49)
    v4 = v4.copy(p0 = v40)
    v11 = v11.updated(0, v15)
    var v89: s0 = v22
    v89
  }
  @noinline
  def f0(v0: Vector[s2], v1: s0, v2: s4, v3: Double): Double = {
    val v4: s0 = f22(v1)
    val v18: Vector[Vector[Double]] = v4.p2
    val v38: Vector[Double] = v18(1)
    val v66: Double = v38(0)
    v66
  }
  def benchmark(): Unit = {
    val v0: Vector[s2] = Vector(s2(Vector(s1(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0)), 2.0, Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0)))), Vector(s0(Vector(Vector(8.0), Vector(9.0)), 10.0, Vector(Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0))))), s0(Vector(Vector(16.0), Vector(17.0)), 18.0, Vector(Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))))), Vector(s1(Vector(Vector(s0(Vector(Vector(24.0), Vector(25.0)), 26.0, Vector(Vector(27.0), Vector(28.0)), Vector(Vector(29.0), Vector(30.0), Vector(31.0)))), Vector(s0(Vector(Vector(32.0), Vector(33.0)), 34.0, Vector(Vector(35.0), Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0))))), s0(Vector(Vector(40.0), Vector(41.0)), 42.0, Vector(Vector(43.0), Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0)))), s1(Vector(Vector(s0(Vector(Vector(48.0), Vector(49.0)), 50.0, Vector(Vector(51.0), Vector(52.0)), Vector(Vector(53.0), Vector(54.0), Vector(55.0)))), Vector(s0(Vector(Vector(56.0), Vector(57.0)), 58.0, Vector(Vector(59.0), Vector(60.0)), Vector(Vector(61.0), Vector(62.0), Vector(63.0))))), s0(Vector(Vector(64.0), Vector(65.0)), 66.0, Vector(Vector(67.0), Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0)))), s1(Vector(Vector(s0(Vector(Vector(72.0), Vector(73.0)), 74.0, Vector(Vector(75.0), Vector(76.0)), Vector(Vector(77.0), Vector(78.0), Vector(79.0)))), Vector(s0(Vector(Vector(80.0), Vector(81.0)), 82.0, Vector(Vector(83.0), Vector(84.0)), Vector(Vector(85.0), Vector(86.0), Vector(87.0))))), s0(Vector(Vector(88.0), Vector(89.0)), 90.0, Vector(Vector(91.0), Vector(92.0)), Vector(Vector(93.0), Vector(94.0), Vector(95.0))))), s0(Vector(Vector(96.0), Vector(97.0)), 98.0, Vector(Vector(99.0), Vector(100.0)), Vector(Vector(101.0), Vector(102.0), Vector(103.0))), s1(Vector(Vector(s0(Vector(Vector(104.0), Vector(105.0)), 106.0, Vector(Vector(107.0), Vector(108.0)), Vector(Vector(109.0), Vector(110.0), Vector(111.0)))), Vector(s0(Vector(Vector(112.0), Vector(113.0)), 114.0, Vector(Vector(115.0), Vector(116.0)), Vector(Vector(117.0), Vector(118.0), Vector(119.0))))), s0(Vector(Vector(120.0), Vector(121.0)), 122.0, Vector(Vector(123.0), Vector(124.0)), Vector(Vector(125.0), Vector(126.0), Vector(127.0))))))
    val v1: s0 = s0(Vector(Vector(128.0), Vector(129.0)), 130.0, Vector(Vector(131.0), Vector(132.0)), Vector(Vector(133.0), Vector(134.0), Vector(135.0)))
    val v2: s4 = s4(Vector(s0(Vector(Vector(136.0), Vector(137.0)), 138.0, Vector(Vector(139.0), Vector(140.0)), Vector(Vector(141.0), Vector(142.0), Vector(143.0))), s0(Vector(Vector(144.0), Vector(145.0)), 146.0, Vector(Vector(147.0), Vector(148.0)), Vector(Vector(149.0), Vector(150.0), Vector(151.0))), s0(Vector(Vector(152.0), Vector(153.0)), 154.0, Vector(Vector(155.0), Vector(156.0)), Vector(Vector(157.0), Vector(158.0), Vector(159.0)))), Vector(s2(Vector(s1(Vector(Vector(s0(Vector(Vector(160.0), Vector(161.0)), 162.0, Vector(Vector(163.0), Vector(164.0)), Vector(Vector(165.0), Vector(166.0), Vector(167.0)))), Vector(s0(Vector(Vector(168.0), Vector(169.0)), 170.0, Vector(Vector(171.0), Vector(172.0)), Vector(Vector(173.0), Vector(174.0), Vector(175.0))))), s0(Vector(Vector(176.0), Vector(177.0)), 178.0, Vector(Vector(179.0), Vector(180.0)), Vector(Vector(181.0), Vector(182.0), Vector(183.0))))), Vector(s1(Vector(Vector(s0(Vector(Vector(184.0), Vector(185.0)), 186.0, Vector(Vector(187.0), Vector(188.0)), Vector(Vector(189.0), Vector(190.0), Vector(191.0)))), Vector(s0(Vector(Vector(192.0), Vector(193.0)), 194.0, Vector(Vector(195.0), Vector(196.0)), Vector(Vector(197.0), Vector(198.0), Vector(199.0))))), s0(Vector(Vector(200.0), Vector(201.0)), 202.0, Vector(Vector(203.0), Vector(204.0)), Vector(Vector(205.0), Vector(206.0), Vector(207.0)))), s1(Vector(Vector(s0(Vector(Vector(208.0), Vector(209.0)), 210.0, Vector(Vector(211.0), Vector(212.0)), Vector(Vector(213.0), Vector(214.0), Vector(215.0)))), Vector(s0(Vector(Vector(216.0), Vector(217.0)), 218.0, Vector(Vector(219.0), Vector(220.0)), Vector(Vector(221.0), Vector(222.0), Vector(223.0))))), s0(Vector(Vector(224.0), Vector(225.0)), 226.0, Vector(Vector(227.0), Vector(228.0)), Vector(Vector(229.0), Vector(230.0), Vector(231.0)))), s1(Vector(Vector(s0(Vector(Vector(232.0), Vector(233.0)), 234.0, Vector(Vector(235.0), Vector(236.0)), Vector(Vector(237.0), Vector(238.0), Vector(239.0)))), Vector(s0(Vector(Vector(240.0), Vector(241.0)), 242.0, Vector(Vector(243.0), Vector(244.0)), Vector(Vector(245.0), Vector(246.0), Vector(247.0))))), s0(Vector(Vector(248.0), Vector(249.0)), 250.0, Vector(Vector(251.0), Vector(252.0)), Vector(Vector(253.0), Vector(254.0), Vector(255.0))))), s0(Vector(Vector(256.0), Vector(257.0)), 258.0, Vector(Vector(259.0), Vector(260.0)), Vector(Vector(261.0), Vector(262.0), Vector(263.0))), s1(Vector(Vector(s0(Vector(Vector(264.0), Vector(265.0)), 266.0, Vector(Vector(267.0), Vector(268.0)), Vector(Vector(269.0), Vector(270.0), Vector(271.0)))), Vector(s0(Vector(Vector(272.0), Vector(273.0)), 274.0, Vector(Vector(275.0), Vector(276.0)), Vector(Vector(277.0), Vector(278.0), Vector(279.0))))), s0(Vector(Vector(280.0), Vector(281.0)), 282.0, Vector(Vector(283.0), Vector(284.0)), Vector(Vector(285.0), Vector(286.0), Vector(287.0)))))))
    val v3: Double = 288.0
    val start = nanoTime()
    var result: Double = 288.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}