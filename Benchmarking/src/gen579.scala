import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[Vector[s0]],
    p2: s0
  )
  case class s2 (
    p0: s1,
    p1: s0
  )
  case class s3 (
    p0: Vector[Double]
  )
  case class s6 (
    p0: Vector[s2],
    p1: s2,
    p2: Double,
    p3: s2,
    p4: s2,
    p5: s3
  )
  def f84(v0: Double): Double = {
    var v3: Double = v0
    var v7: Double = v3
    var v4: Double = v3
    val v5: Vector[Double] = Vector(v7, v0, v7, v3, v3, v4)
    val v2: Double = v5(3)
    var v6: Double = v4
    var v35: Vector[Double] = v5
    var v25: Vector[Double] = v35
    val v33: Double = v35(3)
    v35 = v35.updated(4, v2)
    val v22: Double = v25(1)
    val v47: Vector[Vector[Double]] = Vector(v5, v25)
    val v23: Vector[Vector[Vector[Double]]] = Vector(v47)
    v35 = v35.updated(5, v22)
    val v36: Vector[Vector[Double]] = v23(0)
    v35 = v35.updated(2, v0)
    val v31: Vector[Vector[Double]] = v23(0)
    v25 = v25.updated(4, v6)
    val v124: Vector[Double] = v31(0)
    val v41: Double = v124(5)
    val v96: Vector[Double] = v36(1)
    v25 = v96
    val v205: Vector[Double] = Vector(v41, v0, v33)
    var v71: Vector[Double] = v205
    val v147: Double = v71(0)
    v147
  }
  @noinline
  def f0(v0: Vector[s6], v1: Double): Double = {
    val v4: s6 = v0(1)
    val v7: s2 = v4.p3
    val v2: s0 = v7.p1
    val v11: Vector[Vector[Double]] = v2.p0
    val v35: Double = f84(v1)
    val v69: Vector[Double] = v11(0)
    val v127: Double = v69(0)
    val v52: Vector[Double] = Vector(v35, v127, v35, v127, v35)
    val v84: Double = v52(2)
    val v87: Double = f84(v84)
    v87
  }
  def benchmark(): Unit = {
    val v0: Vector[s6] = Vector(s6(Vector(s2(s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0))), Vector(Vector(s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0)))), Vector(s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0)))), Vector(s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0))))), s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0)))), s0(Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0)))), s2(s1(s0(Vector(Vector(18.0)), Vector(Vector(19.0), Vector(20.0))), Vector(Vector(s0(Vector(Vector(21.0)), Vector(Vector(22.0), Vector(23.0)))), Vector(s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0)))), Vector(s0(Vector(Vector(27.0)), Vector(Vector(28.0), Vector(29.0))))), s0(Vector(Vector(30.0)), Vector(Vector(31.0), Vector(32.0)))), s0(Vector(Vector(33.0)), Vector(Vector(34.0), Vector(35.0))))), s2(s1(s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0))), Vector(Vector(s0(Vector(Vector(39.0)), Vector(Vector(40.0), Vector(41.0)))), Vector(s0(Vector(Vector(42.0)), Vector(Vector(43.0), Vector(44.0)))), Vector(s0(Vector(Vector(45.0)), Vector(Vector(46.0), Vector(47.0))))), s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0)))), s0(Vector(Vector(51.0)), Vector(Vector(52.0), Vector(53.0)))), 54.0, s2(s1(s0(Vector(Vector(55.0)), Vector(Vector(56.0), Vector(57.0))), Vector(Vector(s0(Vector(Vector(58.0)), Vector(Vector(59.0), Vector(60.0)))), Vector(s0(Vector(Vector(61.0)), Vector(Vector(62.0), Vector(63.0)))), Vector(s0(Vector(Vector(64.0)), Vector(Vector(65.0), Vector(66.0))))), s0(Vector(Vector(67.0)), Vector(Vector(68.0), Vector(69.0)))), s0(Vector(Vector(70.0)), Vector(Vector(71.0), Vector(72.0)))), s2(s1(s0(Vector(Vector(73.0)), Vector(Vector(74.0), Vector(75.0))), Vector(Vector(s0(Vector(Vector(76.0)), Vector(Vector(77.0), Vector(78.0)))), Vector(s0(Vector(Vector(79.0)), Vector(Vector(80.0), Vector(81.0)))), Vector(s0(Vector(Vector(82.0)), Vector(Vector(83.0), Vector(84.0))))), s0(Vector(Vector(85.0)), Vector(Vector(86.0), Vector(87.0)))), s0(Vector(Vector(88.0)), Vector(Vector(89.0), Vector(90.0)))), s3(Vector(91.0, 92.0))), s6(Vector(s2(s1(s0(Vector(Vector(93.0)), Vector(Vector(94.0), Vector(95.0))), Vector(Vector(s0(Vector(Vector(96.0)), Vector(Vector(97.0), Vector(98.0)))), Vector(s0(Vector(Vector(99.0)), Vector(Vector(100.0), Vector(101.0)))), Vector(s0(Vector(Vector(102.0)), Vector(Vector(103.0), Vector(104.0))))), s0(Vector(Vector(105.0)), Vector(Vector(106.0), Vector(107.0)))), s0(Vector(Vector(108.0)), Vector(Vector(109.0), Vector(110.0)))), s2(s1(s0(Vector(Vector(111.0)), Vector(Vector(112.0), Vector(113.0))), Vector(Vector(s0(Vector(Vector(114.0)), Vector(Vector(115.0), Vector(116.0)))), Vector(s0(Vector(Vector(117.0)), Vector(Vector(118.0), Vector(119.0)))), Vector(s0(Vector(Vector(120.0)), Vector(Vector(121.0), Vector(122.0))))), s0(Vector(Vector(123.0)), Vector(Vector(124.0), Vector(125.0)))), s0(Vector(Vector(126.0)), Vector(Vector(127.0), Vector(128.0))))), s2(s1(s0(Vector(Vector(129.0)), Vector(Vector(130.0), Vector(131.0))), Vector(Vector(s0(Vector(Vector(132.0)), Vector(Vector(133.0), Vector(134.0)))), Vector(s0(Vector(Vector(135.0)), Vector(Vector(136.0), Vector(137.0)))), Vector(s0(Vector(Vector(138.0)), Vector(Vector(139.0), Vector(140.0))))), s0(Vector(Vector(141.0)), Vector(Vector(142.0), Vector(143.0)))), s0(Vector(Vector(144.0)), Vector(Vector(145.0), Vector(146.0)))), 147.0, s2(s1(s0(Vector(Vector(148.0)), Vector(Vector(149.0), Vector(150.0))), Vector(Vector(s0(Vector(Vector(151.0)), Vector(Vector(152.0), Vector(153.0)))), Vector(s0(Vector(Vector(154.0)), Vector(Vector(155.0), Vector(156.0)))), Vector(s0(Vector(Vector(157.0)), Vector(Vector(158.0), Vector(159.0))))), s0(Vector(Vector(160.0)), Vector(Vector(161.0), Vector(162.0)))), s0(Vector(Vector(163.0)), Vector(Vector(164.0), Vector(165.0)))), s2(s1(s0(Vector(Vector(166.0)), Vector(Vector(167.0), Vector(168.0))), Vector(Vector(s0(Vector(Vector(169.0)), Vector(Vector(170.0), Vector(171.0)))), Vector(s0(Vector(Vector(172.0)), Vector(Vector(173.0), Vector(174.0)))), Vector(s0(Vector(Vector(175.0)), Vector(Vector(176.0), Vector(177.0))))), s0(Vector(Vector(178.0)), Vector(Vector(179.0), Vector(180.0)))), s0(Vector(Vector(181.0)), Vector(Vector(182.0), Vector(183.0)))), s3(Vector(184.0, 185.0))), s6(Vector(s2(s1(s0(Vector(Vector(186.0)), Vector(Vector(187.0), Vector(188.0))), Vector(Vector(s0(Vector(Vector(189.0)), Vector(Vector(190.0), Vector(191.0)))), Vector(s0(Vector(Vector(192.0)), Vector(Vector(193.0), Vector(194.0)))), Vector(s0(Vector(Vector(195.0)), Vector(Vector(196.0), Vector(197.0))))), s0(Vector(Vector(198.0)), Vector(Vector(199.0), Vector(200.0)))), s0(Vector(Vector(201.0)), Vector(Vector(202.0), Vector(203.0)))), s2(s1(s0(Vector(Vector(204.0)), Vector(Vector(205.0), Vector(206.0))), Vector(Vector(s0(Vector(Vector(207.0)), Vector(Vector(208.0), Vector(209.0)))), Vector(s0(Vector(Vector(210.0)), Vector(Vector(211.0), Vector(212.0)))), Vector(s0(Vector(Vector(213.0)), Vector(Vector(214.0), Vector(215.0))))), s0(Vector(Vector(216.0)), Vector(Vector(217.0), Vector(218.0)))), s0(Vector(Vector(219.0)), Vector(Vector(220.0), Vector(221.0))))), s2(s1(s0(Vector(Vector(222.0)), Vector(Vector(223.0), Vector(224.0))), Vector(Vector(s0(Vector(Vector(225.0)), Vector(Vector(226.0), Vector(227.0)))), Vector(s0(Vector(Vector(228.0)), Vector(Vector(229.0), Vector(230.0)))), Vector(s0(Vector(Vector(231.0)), Vector(Vector(232.0), Vector(233.0))))), s0(Vector(Vector(234.0)), Vector(Vector(235.0), Vector(236.0)))), s0(Vector(Vector(237.0)), Vector(Vector(238.0), Vector(239.0)))), 240.0, s2(s1(s0(Vector(Vector(241.0)), Vector(Vector(242.0), Vector(243.0))), Vector(Vector(s0(Vector(Vector(244.0)), Vector(Vector(245.0), Vector(246.0)))), Vector(s0(Vector(Vector(247.0)), Vector(Vector(248.0), Vector(249.0)))), Vector(s0(Vector(Vector(250.0)), Vector(Vector(251.0), Vector(252.0))))), s0(Vector(Vector(253.0)), Vector(Vector(254.0), Vector(255.0)))), s0(Vector(Vector(256.0)), Vector(Vector(257.0), Vector(258.0)))), s2(s1(s0(Vector(Vector(259.0)), Vector(Vector(260.0), Vector(261.0))), Vector(Vector(s0(Vector(Vector(262.0)), Vector(Vector(263.0), Vector(264.0)))), Vector(s0(Vector(Vector(265.0)), Vector(Vector(266.0), Vector(267.0)))), Vector(s0(Vector(Vector(268.0)), Vector(Vector(269.0), Vector(270.0))))), s0(Vector(Vector(271.0)), Vector(Vector(272.0), Vector(273.0)))), s0(Vector(Vector(274.0)), Vector(Vector(275.0), Vector(276.0)))), s3(Vector(277.0, 278.0))))
    val v1: Double = 279.0
    val start = nanoTime()
    var result: Double = 279.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}