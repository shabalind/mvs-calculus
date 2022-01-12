import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s2 (
    p0: s1,
    p1: Double
  )
  case class s3 (
    p0: Double,
    p1: Vector[s2]
  )
  case class s4 (
    p0: s3,
    p1: s0
  )
  case class s7 (
    p0: s2,
    p1: Vector[s4]
  )
  case class s10 (
    p0: s7,
    p1: s2
  )
  def f96(v0: s7): s7 = {
    val v6: Vector[s7] = Vector(v0, v0, v0, v0, v0, v0, v0)
    val v9: s7 = v6(4)
    v9
  }
  def f68(v0: s7): s7 = {
    var v5: s7 = v0
    val v6: s7 = f96(v5)
    val v14: s7 = f96(v6)
    v14
  }
  def f6(v0: s7): s7 = {
    val v8: s7 = f68(v0)
    val v15: Vector[s7] = Vector(v8)
    val v13: s7 = v15(0)
    val v11: s7 = f96(v13)
    val v38: s7 = f96(v11)
    v38
  }
  @noinline
  def f0(v0: Vector[s7], v1: Double): Double = {
    var v3: Vector[s7] = v0
    val v2: s7 = v3(2)
    val v6: s7 = v3(1)
    val v7: s2 = v2.p0
    val v5: s1 = v7.p0
    val v11: s7 = f96(v6)
    val v9: s7 = f6(v6)
    v3 = v3.updated(1, v6)
    val v13: s0 = v5.p0
    val v21: s10 = s10(v6, v7)
    v3 = v3.updated(2, v6)
    val v40: s7 = v3(0)
    var v71: s10 = v21
    val v50: s7 = v3(2)
    v3 = v3.updated(1, v9)
    v71 = v71.copy(p1 = v7)
    v3 = v3.updated(0, v40)
    v3 = v3.updated(1, v50)
    val v61: Vector[Vector[Double]] = v13.p1
    var v48: Vector[s7] = v0
    val v77: s2 = v71.p1
    val v193: Vector[Double] = v61(2)
    v71 = v71.copy(p0 = v11)
    val v73: Double = v193(0)
    val v291: s7 = v48(1)
    val v60: Double = v77.p1
    val v178: Double = v1 + v60
    v3 = v3.updated(2, v291)
    val v124: Double = v178 * v73
    v124
  }
  def benchmark(): Unit = {
    val v0: Vector[s7] = Vector(s7(s2(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0))), Vector(s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0))))), 10.0), Vector(s4(s3(11.0, Vector(s2(s1(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0), Vector(16.0))), Vector(s0(Vector(Vector(17.0), Vector(18.0)), Vector(Vector(19.0), Vector(20.0), Vector(21.0))))), 22.0), s2(s1(s0(Vector(Vector(23.0), Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0))), Vector(s0(Vector(Vector(28.0), Vector(29.0)), Vector(Vector(30.0), Vector(31.0), Vector(32.0))))), 33.0))), s0(Vector(Vector(34.0), Vector(35.0)), Vector(Vector(36.0), Vector(37.0), Vector(38.0)))), s4(s3(39.0, Vector(s2(s1(s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0), Vector(44.0))), Vector(s0(Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0), Vector(48.0), Vector(49.0))))), 50.0), s2(s1(s0(Vector(Vector(51.0), Vector(52.0)), Vector(Vector(53.0), Vector(54.0), Vector(55.0))), Vector(s0(Vector(Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0), Vector(60.0))))), 61.0))), s0(Vector(Vector(62.0), Vector(63.0)), Vector(Vector(64.0), Vector(65.0), Vector(66.0)))), s4(s3(67.0, Vector(s2(s1(s0(Vector(Vector(68.0), Vector(69.0)), Vector(Vector(70.0), Vector(71.0), Vector(72.0))), Vector(s0(Vector(Vector(73.0), Vector(74.0)), Vector(Vector(75.0), Vector(76.0), Vector(77.0))))), 78.0), s2(s1(s0(Vector(Vector(79.0), Vector(80.0)), Vector(Vector(81.0), Vector(82.0), Vector(83.0))), Vector(s0(Vector(Vector(84.0), Vector(85.0)), Vector(Vector(86.0), Vector(87.0), Vector(88.0))))), 89.0))), s0(Vector(Vector(90.0), Vector(91.0)), Vector(Vector(92.0), Vector(93.0), Vector(94.0)))))), s7(s2(s1(s0(Vector(Vector(95.0), Vector(96.0)), Vector(Vector(97.0), Vector(98.0), Vector(99.0))), Vector(s0(Vector(Vector(100.0), Vector(101.0)), Vector(Vector(102.0), Vector(103.0), Vector(104.0))))), 105.0), Vector(s4(s3(106.0, Vector(s2(s1(s0(Vector(Vector(107.0), Vector(108.0)), Vector(Vector(109.0), Vector(110.0), Vector(111.0))), Vector(s0(Vector(Vector(112.0), Vector(113.0)), Vector(Vector(114.0), Vector(115.0), Vector(116.0))))), 117.0), s2(s1(s0(Vector(Vector(118.0), Vector(119.0)), Vector(Vector(120.0), Vector(121.0), Vector(122.0))), Vector(s0(Vector(Vector(123.0), Vector(124.0)), Vector(Vector(125.0), Vector(126.0), Vector(127.0))))), 128.0))), s0(Vector(Vector(129.0), Vector(130.0)), Vector(Vector(131.0), Vector(132.0), Vector(133.0)))), s4(s3(134.0, Vector(s2(s1(s0(Vector(Vector(135.0), Vector(136.0)), Vector(Vector(137.0), Vector(138.0), Vector(139.0))), Vector(s0(Vector(Vector(140.0), Vector(141.0)), Vector(Vector(142.0), Vector(143.0), Vector(144.0))))), 145.0), s2(s1(s0(Vector(Vector(146.0), Vector(147.0)), Vector(Vector(148.0), Vector(149.0), Vector(150.0))), Vector(s0(Vector(Vector(151.0), Vector(152.0)), Vector(Vector(153.0), Vector(154.0), Vector(155.0))))), 156.0))), s0(Vector(Vector(157.0), Vector(158.0)), Vector(Vector(159.0), Vector(160.0), Vector(161.0)))), s4(s3(162.0, Vector(s2(s1(s0(Vector(Vector(163.0), Vector(164.0)), Vector(Vector(165.0), Vector(166.0), Vector(167.0))), Vector(s0(Vector(Vector(168.0), Vector(169.0)), Vector(Vector(170.0), Vector(171.0), Vector(172.0))))), 173.0), s2(s1(s0(Vector(Vector(174.0), Vector(175.0)), Vector(Vector(176.0), Vector(177.0), Vector(178.0))), Vector(s0(Vector(Vector(179.0), Vector(180.0)), Vector(Vector(181.0), Vector(182.0), Vector(183.0))))), 184.0))), s0(Vector(Vector(185.0), Vector(186.0)), Vector(Vector(187.0), Vector(188.0), Vector(189.0)))))), s7(s2(s1(s0(Vector(Vector(190.0), Vector(191.0)), Vector(Vector(192.0), Vector(193.0), Vector(194.0))), Vector(s0(Vector(Vector(195.0), Vector(196.0)), Vector(Vector(197.0), Vector(198.0), Vector(199.0))))), 200.0), Vector(s4(s3(201.0, Vector(s2(s1(s0(Vector(Vector(202.0), Vector(203.0)), Vector(Vector(204.0), Vector(205.0), Vector(206.0))), Vector(s0(Vector(Vector(207.0), Vector(208.0)), Vector(Vector(209.0), Vector(210.0), Vector(211.0))))), 212.0), s2(s1(s0(Vector(Vector(213.0), Vector(214.0)), Vector(Vector(215.0), Vector(216.0), Vector(217.0))), Vector(s0(Vector(Vector(218.0), Vector(219.0)), Vector(Vector(220.0), Vector(221.0), Vector(222.0))))), 223.0))), s0(Vector(Vector(224.0), Vector(225.0)), Vector(Vector(226.0), Vector(227.0), Vector(228.0)))), s4(s3(229.0, Vector(s2(s1(s0(Vector(Vector(230.0), Vector(231.0)), Vector(Vector(232.0), Vector(233.0), Vector(234.0))), Vector(s0(Vector(Vector(235.0), Vector(236.0)), Vector(Vector(237.0), Vector(238.0), Vector(239.0))))), 240.0), s2(s1(s0(Vector(Vector(241.0), Vector(242.0)), Vector(Vector(243.0), Vector(244.0), Vector(245.0))), Vector(s0(Vector(Vector(246.0), Vector(247.0)), Vector(Vector(248.0), Vector(249.0), Vector(250.0))))), 251.0))), s0(Vector(Vector(252.0), Vector(253.0)), Vector(Vector(254.0), Vector(255.0), Vector(256.0)))), s4(s3(257.0, Vector(s2(s1(s0(Vector(Vector(258.0), Vector(259.0)), Vector(Vector(260.0), Vector(261.0), Vector(262.0))), Vector(s0(Vector(Vector(263.0), Vector(264.0)), Vector(Vector(265.0), Vector(266.0), Vector(267.0))))), 268.0), s2(s1(s0(Vector(Vector(269.0), Vector(270.0)), Vector(Vector(271.0), Vector(272.0), Vector(273.0))), Vector(s0(Vector(Vector(274.0), Vector(275.0)), Vector(Vector(276.0), Vector(277.0), Vector(278.0))))), 279.0))), s0(Vector(Vector(280.0), Vector(281.0)), Vector(Vector(282.0), Vector(283.0), Vector(284.0)))))))
    val v1: Double = 285.0
    val start = nanoTime()
    var result: Double = 285.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}