import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Double],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: s1,
    p1: Vector[s1]
  )
  case class s3 (
    p0: Vector[Vector[s0]],
    p1: Vector[s2]
  )
  case class s7 (
    p0: Vector[s3],
    p1: s0
  )
  def f112(v0: s1): s1 = {
    v0
  }
  @noinline
  def f0(v0: s1, v1: Vector[Vector[s7]], v2: Double): Double = {
    val v4: s0 = v0.p0
    val v11: s1 = f112(v0)
    val v12: Vector[Vector[Double]] = v4.p1
    val v13: s0 = v11.p1
    val v42: Vector[Double] = v12(0)
    val v53: Vector[Vector[Double]] = v13.p1
    val v19: Vector[Double] = v53(1)
    val v61: Vector[Vector[Double]] = Vector(v19, v42)
    var v68: Vector[Vector[Double]] = v61
    val v79: Vector[Double] = v68(1)
    val v289: Double = v79(0)
    v289
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(s0(Vector(0.0, 1.0), Vector(Vector(2.0), Vector(3.0))), s0(Vector(4.0, 5.0), Vector(Vector(6.0), Vector(7.0))))
    val v1: Vector[Vector[s7]] = Vector(Vector(s7(Vector(s3(Vector(Vector(s0(Vector(8.0, 9.0), Vector(Vector(10.0), Vector(11.0))))), Vector(s2(s1(s0(Vector(12.0, 13.0), Vector(Vector(14.0), Vector(15.0))), s0(Vector(16.0, 17.0), Vector(Vector(18.0), Vector(19.0)))), Vector(s1(s0(Vector(20.0, 21.0), Vector(Vector(22.0), Vector(23.0))), s0(Vector(24.0, 25.0), Vector(Vector(26.0), Vector(27.0)))), s1(s0(Vector(28.0, 29.0), Vector(Vector(30.0), Vector(31.0))), s0(Vector(32.0, 33.0), Vector(Vector(34.0), Vector(35.0)))))), s2(s1(s0(Vector(36.0, 37.0), Vector(Vector(38.0), Vector(39.0))), s0(Vector(40.0, 41.0), Vector(Vector(42.0), Vector(43.0)))), Vector(s1(s0(Vector(44.0, 45.0), Vector(Vector(46.0), Vector(47.0))), s0(Vector(48.0, 49.0), Vector(Vector(50.0), Vector(51.0)))), s1(s0(Vector(52.0, 53.0), Vector(Vector(54.0), Vector(55.0))), s0(Vector(56.0, 57.0), Vector(Vector(58.0), Vector(59.0)))))))), s3(Vector(Vector(s0(Vector(60.0, 61.0), Vector(Vector(62.0), Vector(63.0))))), Vector(s2(s1(s0(Vector(64.0, 65.0), Vector(Vector(66.0), Vector(67.0))), s0(Vector(68.0, 69.0), Vector(Vector(70.0), Vector(71.0)))), Vector(s1(s0(Vector(72.0, 73.0), Vector(Vector(74.0), Vector(75.0))), s0(Vector(76.0, 77.0), Vector(Vector(78.0), Vector(79.0)))), s1(s0(Vector(80.0, 81.0), Vector(Vector(82.0), Vector(83.0))), s0(Vector(84.0, 85.0), Vector(Vector(86.0), Vector(87.0)))))), s2(s1(s0(Vector(88.0, 89.0), Vector(Vector(90.0), Vector(91.0))), s0(Vector(92.0, 93.0), Vector(Vector(94.0), Vector(95.0)))), Vector(s1(s0(Vector(96.0, 97.0), Vector(Vector(98.0), Vector(99.0))), s0(Vector(100.0, 101.0), Vector(Vector(102.0), Vector(103.0)))), s1(s0(Vector(104.0, 105.0), Vector(Vector(106.0), Vector(107.0))), s0(Vector(108.0, 109.0), Vector(Vector(110.0), Vector(111.0)))))))), s3(Vector(Vector(s0(Vector(112.0, 113.0), Vector(Vector(114.0), Vector(115.0))))), Vector(s2(s1(s0(Vector(116.0, 117.0), Vector(Vector(118.0), Vector(119.0))), s0(Vector(120.0, 121.0), Vector(Vector(122.0), Vector(123.0)))), Vector(s1(s0(Vector(124.0, 125.0), Vector(Vector(126.0), Vector(127.0))), s0(Vector(128.0, 129.0), Vector(Vector(130.0), Vector(131.0)))), s1(s0(Vector(132.0, 133.0), Vector(Vector(134.0), Vector(135.0))), s0(Vector(136.0, 137.0), Vector(Vector(138.0), Vector(139.0)))))), s2(s1(s0(Vector(140.0, 141.0), Vector(Vector(142.0), Vector(143.0))), s0(Vector(144.0, 145.0), Vector(Vector(146.0), Vector(147.0)))), Vector(s1(s0(Vector(148.0, 149.0), Vector(Vector(150.0), Vector(151.0))), s0(Vector(152.0, 153.0), Vector(Vector(154.0), Vector(155.0)))), s1(s0(Vector(156.0, 157.0), Vector(Vector(158.0), Vector(159.0))), s0(Vector(160.0, 161.0), Vector(Vector(162.0), Vector(163.0))))))))), s0(Vector(164.0, 165.0), Vector(Vector(166.0), Vector(167.0))))), Vector(s7(Vector(s3(Vector(Vector(s0(Vector(168.0, 169.0), Vector(Vector(170.0), Vector(171.0))))), Vector(s2(s1(s0(Vector(172.0, 173.0), Vector(Vector(174.0), Vector(175.0))), s0(Vector(176.0, 177.0), Vector(Vector(178.0), Vector(179.0)))), Vector(s1(s0(Vector(180.0, 181.0), Vector(Vector(182.0), Vector(183.0))), s0(Vector(184.0, 185.0), Vector(Vector(186.0), Vector(187.0)))), s1(s0(Vector(188.0, 189.0), Vector(Vector(190.0), Vector(191.0))), s0(Vector(192.0, 193.0), Vector(Vector(194.0), Vector(195.0)))))), s2(s1(s0(Vector(196.0, 197.0), Vector(Vector(198.0), Vector(199.0))), s0(Vector(200.0, 201.0), Vector(Vector(202.0), Vector(203.0)))), Vector(s1(s0(Vector(204.0, 205.0), Vector(Vector(206.0), Vector(207.0))), s0(Vector(208.0, 209.0), Vector(Vector(210.0), Vector(211.0)))), s1(s0(Vector(212.0, 213.0), Vector(Vector(214.0), Vector(215.0))), s0(Vector(216.0, 217.0), Vector(Vector(218.0), Vector(219.0)))))))), s3(Vector(Vector(s0(Vector(220.0, 221.0), Vector(Vector(222.0), Vector(223.0))))), Vector(s2(s1(s0(Vector(224.0, 225.0), Vector(Vector(226.0), Vector(227.0))), s0(Vector(228.0, 229.0), Vector(Vector(230.0), Vector(231.0)))), Vector(s1(s0(Vector(232.0, 233.0), Vector(Vector(234.0), Vector(235.0))), s0(Vector(236.0, 237.0), Vector(Vector(238.0), Vector(239.0)))), s1(s0(Vector(240.0, 241.0), Vector(Vector(242.0), Vector(243.0))), s0(Vector(244.0, 245.0), Vector(Vector(246.0), Vector(247.0)))))), s2(s1(s0(Vector(248.0, 249.0), Vector(Vector(250.0), Vector(251.0))), s0(Vector(252.0, 253.0), Vector(Vector(254.0), Vector(255.0)))), Vector(s1(s0(Vector(256.0, 257.0), Vector(Vector(258.0), Vector(259.0))), s0(Vector(260.0, 261.0), Vector(Vector(262.0), Vector(263.0)))), s1(s0(Vector(264.0, 265.0), Vector(Vector(266.0), Vector(267.0))), s0(Vector(268.0, 269.0), Vector(Vector(270.0), Vector(271.0)))))))), s3(Vector(Vector(s0(Vector(272.0, 273.0), Vector(Vector(274.0), Vector(275.0))))), Vector(s2(s1(s0(Vector(276.0, 277.0), Vector(Vector(278.0), Vector(279.0))), s0(Vector(280.0, 281.0), Vector(Vector(282.0), Vector(283.0)))), Vector(s1(s0(Vector(284.0, 285.0), Vector(Vector(286.0), Vector(287.0))), s0(Vector(288.0, 289.0), Vector(Vector(290.0), Vector(291.0)))), s1(s0(Vector(292.0, 293.0), Vector(Vector(294.0), Vector(295.0))), s0(Vector(296.0, 297.0), Vector(Vector(298.0), Vector(299.0)))))), s2(s1(s0(Vector(300.0, 301.0), Vector(Vector(302.0), Vector(303.0))), s0(Vector(304.0, 305.0), Vector(Vector(306.0), Vector(307.0)))), Vector(s1(s0(Vector(308.0, 309.0), Vector(Vector(310.0), Vector(311.0))), s0(Vector(312.0, 313.0), Vector(Vector(314.0), Vector(315.0)))), s1(s0(Vector(316.0, 317.0), Vector(Vector(318.0), Vector(319.0))), s0(Vector(320.0, 321.0), Vector(Vector(322.0), Vector(323.0))))))))), s0(Vector(324.0, 325.0), Vector(Vector(326.0), Vector(327.0))))))
    val v2: Double = 328.0
    val start = nanoTime()
    var result: Double = 328.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}