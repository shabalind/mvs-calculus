import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Double],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[Vector[s0]]
  )
  case class s2 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s3 (
    p0: Vector[s2],
    p1: Vector[Vector[s0]]
  )
  case class s4 (
    p0: Vector[Vector[s0]],
    p1: Vector[Vector[s2]],
    p2: s0,
    p3: s1,
    p4: Vector[s0],
    p5: Vector[Vector[s3]]
  )
  case class s5 (
    p0: s0,
    p1: s3
  )
  case class s6 (
    p0: s5,
    p1: s1
  )
  case class s10 (
    p0: s6,
    p1: s4
  )
  @noinline
  def f0(v0: s10, v1: Double): Double = {
    var v4: Double = v1
    var v5: Double = v4
    var v2: Double = v1
    var v14: Double = v5
    var v11: Double = v5
    val v13: Double = v2 / v14
    var v47: Double = v11
    var v26: Double = v11
    v11 = v47
    v2 = v26
    v13
  }
  def benchmark(): Unit = {
    val v0: s10 = s10(s6(s5(s0(Vector(0.0, 1.0), Vector(Vector(2.0), Vector(3.0), Vector(4.0))), s3(Vector(s2(s0(Vector(5.0, 6.0), Vector(Vector(7.0), Vector(8.0), Vector(9.0))), Vector(s0(Vector(10.0, 11.0), Vector(Vector(12.0), Vector(13.0), Vector(14.0))), s0(Vector(15.0, 16.0), Vector(Vector(17.0), Vector(18.0), Vector(19.0))), s0(Vector(20.0, 21.0), Vector(Vector(22.0), Vector(23.0), Vector(24.0))))), s2(s0(Vector(25.0, 26.0), Vector(Vector(27.0), Vector(28.0), Vector(29.0))), Vector(s0(Vector(30.0, 31.0), Vector(Vector(32.0), Vector(33.0), Vector(34.0))), s0(Vector(35.0, 36.0), Vector(Vector(37.0), Vector(38.0), Vector(39.0))), s0(Vector(40.0, 41.0), Vector(Vector(42.0), Vector(43.0), Vector(44.0))))), s2(s0(Vector(45.0, 46.0), Vector(Vector(47.0), Vector(48.0), Vector(49.0))), Vector(s0(Vector(50.0, 51.0), Vector(Vector(52.0), Vector(53.0), Vector(54.0))), s0(Vector(55.0, 56.0), Vector(Vector(57.0), Vector(58.0), Vector(59.0))), s0(Vector(60.0, 61.0), Vector(Vector(62.0), Vector(63.0), Vector(64.0)))))), Vector(Vector(s0(Vector(65.0, 66.0), Vector(Vector(67.0), Vector(68.0), Vector(69.0))))))), s1(Vector(s0(Vector(70.0, 71.0), Vector(Vector(72.0), Vector(73.0), Vector(74.0)))), Vector(Vector(s0(Vector(75.0, 76.0), Vector(Vector(77.0), Vector(78.0), Vector(79.0)))), Vector(s0(Vector(80.0, 81.0), Vector(Vector(82.0), Vector(83.0), Vector(84.0))))))), s4(Vector(Vector(s0(Vector(85.0, 86.0), Vector(Vector(87.0), Vector(88.0), Vector(89.0)))), Vector(s0(Vector(90.0, 91.0), Vector(Vector(92.0), Vector(93.0), Vector(94.0))))), Vector(Vector(s2(s0(Vector(95.0, 96.0), Vector(Vector(97.0), Vector(98.0), Vector(99.0))), Vector(s0(Vector(100.0, 101.0), Vector(Vector(102.0), Vector(103.0), Vector(104.0))), s0(Vector(105.0, 106.0), Vector(Vector(107.0), Vector(108.0), Vector(109.0))), s0(Vector(110.0, 111.0), Vector(Vector(112.0), Vector(113.0), Vector(114.0)))))), Vector(s2(s0(Vector(115.0, 116.0), Vector(Vector(117.0), Vector(118.0), Vector(119.0))), Vector(s0(Vector(120.0, 121.0), Vector(Vector(122.0), Vector(123.0), Vector(124.0))), s0(Vector(125.0, 126.0), Vector(Vector(127.0), Vector(128.0), Vector(129.0))), s0(Vector(130.0, 131.0), Vector(Vector(132.0), Vector(133.0), Vector(134.0))))))), s0(Vector(135.0, 136.0), Vector(Vector(137.0), Vector(138.0), Vector(139.0))), s1(Vector(s0(Vector(140.0, 141.0), Vector(Vector(142.0), Vector(143.0), Vector(144.0)))), Vector(Vector(s0(Vector(145.0, 146.0), Vector(Vector(147.0), Vector(148.0), Vector(149.0)))), Vector(s0(Vector(150.0, 151.0), Vector(Vector(152.0), Vector(153.0), Vector(154.0)))))), Vector(s0(Vector(155.0, 156.0), Vector(Vector(157.0), Vector(158.0), Vector(159.0))), s0(Vector(160.0, 161.0), Vector(Vector(162.0), Vector(163.0), Vector(164.0))), s0(Vector(165.0, 166.0), Vector(Vector(167.0), Vector(168.0), Vector(169.0)))), Vector(Vector(s3(Vector(s2(s0(Vector(170.0, 171.0), Vector(Vector(172.0), Vector(173.0), Vector(174.0))), Vector(s0(Vector(175.0, 176.0), Vector(Vector(177.0), Vector(178.0), Vector(179.0))), s0(Vector(180.0, 181.0), Vector(Vector(182.0), Vector(183.0), Vector(184.0))), s0(Vector(185.0, 186.0), Vector(Vector(187.0), Vector(188.0), Vector(189.0))))), s2(s0(Vector(190.0, 191.0), Vector(Vector(192.0), Vector(193.0), Vector(194.0))), Vector(s0(Vector(195.0, 196.0), Vector(Vector(197.0), Vector(198.0), Vector(199.0))), s0(Vector(200.0, 201.0), Vector(Vector(202.0), Vector(203.0), Vector(204.0))), s0(Vector(205.0, 206.0), Vector(Vector(207.0), Vector(208.0), Vector(209.0))))), s2(s0(Vector(210.0, 211.0), Vector(Vector(212.0), Vector(213.0), Vector(214.0))), Vector(s0(Vector(215.0, 216.0), Vector(Vector(217.0), Vector(218.0), Vector(219.0))), s0(Vector(220.0, 221.0), Vector(Vector(222.0), Vector(223.0), Vector(224.0))), s0(Vector(225.0, 226.0), Vector(Vector(227.0), Vector(228.0), Vector(229.0)))))), Vector(Vector(s0(Vector(230.0, 231.0), Vector(Vector(232.0), Vector(233.0), Vector(234.0))))))), Vector(s3(Vector(s2(s0(Vector(235.0, 236.0), Vector(Vector(237.0), Vector(238.0), Vector(239.0))), Vector(s0(Vector(240.0, 241.0), Vector(Vector(242.0), Vector(243.0), Vector(244.0))), s0(Vector(245.0, 246.0), Vector(Vector(247.0), Vector(248.0), Vector(249.0))), s0(Vector(250.0, 251.0), Vector(Vector(252.0), Vector(253.0), Vector(254.0))))), s2(s0(Vector(255.0, 256.0), Vector(Vector(257.0), Vector(258.0), Vector(259.0))), Vector(s0(Vector(260.0, 261.0), Vector(Vector(262.0), Vector(263.0), Vector(264.0))), s0(Vector(265.0, 266.0), Vector(Vector(267.0), Vector(268.0), Vector(269.0))), s0(Vector(270.0, 271.0), Vector(Vector(272.0), Vector(273.0), Vector(274.0))))), s2(s0(Vector(275.0, 276.0), Vector(Vector(277.0), Vector(278.0), Vector(279.0))), Vector(s0(Vector(280.0, 281.0), Vector(Vector(282.0), Vector(283.0), Vector(284.0))), s0(Vector(285.0, 286.0), Vector(Vector(287.0), Vector(288.0), Vector(289.0))), s0(Vector(290.0, 291.0), Vector(Vector(292.0), Vector(293.0), Vector(294.0)))))), Vector(Vector(s0(Vector(295.0, 296.0), Vector(Vector(297.0), Vector(298.0), Vector(299.0))))))))))
    val v1: Double = 300.0
    val start = nanoTime()
    var result: Double = 300.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}