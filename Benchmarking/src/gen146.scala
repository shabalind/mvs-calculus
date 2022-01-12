import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s2 (
    p0: Vector[Vector[s0]],
    p1: Vector[s0]
  )
  case class s3 (
    p0: Vector[Vector[s2]],
    p1: s0
  )
  case class s5 (
    p0: Vector[Vector[s3]],
    p1: s2
  )
  case class s6 (
    p0: s5,
    p1: Vector[Vector[s0]]
  )
  case class s8 (
    p0: Double,
    p1: Vector[Vector[s0]]
  )
  def f52(v0: Double): Double = {
    var v2: Double = v0
    var v4: Double = v0
    var v6: Double = v4
    var v3: Double = v6
    var v9: Double = v0
    val v13: Vector[Double] = Vector(v3, v4, v0, v9)
    val v10: Double = v13(1)
    var v12: Double = v6
    var v16: Vector[Double] = v13
    var v25: Vector[Double] = v16
    v25 = v25.updated(2, v2)
    v16 = v16.updated(0, v12)
    v4 = v10
    val v19: Double = v25(2)
    v19
  }
  @noinline
  def f0(v0: s0, v1: Vector[s8], v2: Vector[s6], v3: s3, v4: Double): Double = {
    val v9: Double = f52(v4)
    val v21: Double = v9 + v4
    val v23: Double = v21 * v21
    v23
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0)))
    val v1: Vector[s8] = Vector(s8(3.0, Vector(Vector(s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0)))), Vector(s0(Vector(Vector(7.0), Vector(8.0)), Vector(Vector(9.0)))), Vector(s0(Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0)))))), s8(13.0, Vector(Vector(s0(Vector(Vector(14.0), Vector(15.0)), Vector(Vector(16.0)))), Vector(s0(Vector(Vector(17.0), Vector(18.0)), Vector(Vector(19.0)))), Vector(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0)))))))
    val v2: Vector[s6] = Vector(s6(s5(Vector(Vector(s3(Vector(Vector(s2(Vector(Vector(s0(Vector(Vector(23.0), Vector(24.0)), Vector(Vector(25.0)))), Vector(s0(Vector(Vector(26.0), Vector(27.0)), Vector(Vector(28.0)))), Vector(s0(Vector(Vector(29.0), Vector(30.0)), Vector(Vector(31.0))))), Vector(s0(Vector(Vector(32.0), Vector(33.0)), Vector(Vector(34.0))), s0(Vector(Vector(35.0), Vector(36.0)), Vector(Vector(37.0)))))), Vector(s2(Vector(Vector(s0(Vector(Vector(38.0), Vector(39.0)), Vector(Vector(40.0)))), Vector(s0(Vector(Vector(41.0), Vector(42.0)), Vector(Vector(43.0)))), Vector(s0(Vector(Vector(44.0), Vector(45.0)), Vector(Vector(46.0))))), Vector(s0(Vector(Vector(47.0), Vector(48.0)), Vector(Vector(49.0))), s0(Vector(Vector(50.0), Vector(51.0)), Vector(Vector(52.0)))))), Vector(s2(Vector(Vector(s0(Vector(Vector(53.0), Vector(54.0)), Vector(Vector(55.0)))), Vector(s0(Vector(Vector(56.0), Vector(57.0)), Vector(Vector(58.0)))), Vector(s0(Vector(Vector(59.0), Vector(60.0)), Vector(Vector(61.0))))), Vector(s0(Vector(Vector(62.0), Vector(63.0)), Vector(Vector(64.0))), s0(Vector(Vector(65.0), Vector(66.0)), Vector(Vector(67.0))))))), s0(Vector(Vector(68.0), Vector(69.0)), Vector(Vector(70.0)))))), s2(Vector(Vector(s0(Vector(Vector(71.0), Vector(72.0)), Vector(Vector(73.0)))), Vector(s0(Vector(Vector(74.0), Vector(75.0)), Vector(Vector(76.0)))), Vector(s0(Vector(Vector(77.0), Vector(78.0)), Vector(Vector(79.0))))), Vector(s0(Vector(Vector(80.0), Vector(81.0)), Vector(Vector(82.0))), s0(Vector(Vector(83.0), Vector(84.0)), Vector(Vector(85.0)))))), Vector(Vector(s0(Vector(Vector(86.0), Vector(87.0)), Vector(Vector(88.0)))), Vector(s0(Vector(Vector(89.0), Vector(90.0)), Vector(Vector(91.0)))))), s6(s5(Vector(Vector(s3(Vector(Vector(s2(Vector(Vector(s0(Vector(Vector(92.0), Vector(93.0)), Vector(Vector(94.0)))), Vector(s0(Vector(Vector(95.0), Vector(96.0)), Vector(Vector(97.0)))), Vector(s0(Vector(Vector(98.0), Vector(99.0)), Vector(Vector(100.0))))), Vector(s0(Vector(Vector(101.0), Vector(102.0)), Vector(Vector(103.0))), s0(Vector(Vector(104.0), Vector(105.0)), Vector(Vector(106.0)))))), Vector(s2(Vector(Vector(s0(Vector(Vector(107.0), Vector(108.0)), Vector(Vector(109.0)))), Vector(s0(Vector(Vector(110.0), Vector(111.0)), Vector(Vector(112.0)))), Vector(s0(Vector(Vector(113.0), Vector(114.0)), Vector(Vector(115.0))))), Vector(s0(Vector(Vector(116.0), Vector(117.0)), Vector(Vector(118.0))), s0(Vector(Vector(119.0), Vector(120.0)), Vector(Vector(121.0)))))), Vector(s2(Vector(Vector(s0(Vector(Vector(122.0), Vector(123.0)), Vector(Vector(124.0)))), Vector(s0(Vector(Vector(125.0), Vector(126.0)), Vector(Vector(127.0)))), Vector(s0(Vector(Vector(128.0), Vector(129.0)), Vector(Vector(130.0))))), Vector(s0(Vector(Vector(131.0), Vector(132.0)), Vector(Vector(133.0))), s0(Vector(Vector(134.0), Vector(135.0)), Vector(Vector(136.0))))))), s0(Vector(Vector(137.0), Vector(138.0)), Vector(Vector(139.0)))))), s2(Vector(Vector(s0(Vector(Vector(140.0), Vector(141.0)), Vector(Vector(142.0)))), Vector(s0(Vector(Vector(143.0), Vector(144.0)), Vector(Vector(145.0)))), Vector(s0(Vector(Vector(146.0), Vector(147.0)), Vector(Vector(148.0))))), Vector(s0(Vector(Vector(149.0), Vector(150.0)), Vector(Vector(151.0))), s0(Vector(Vector(152.0), Vector(153.0)), Vector(Vector(154.0)))))), Vector(Vector(s0(Vector(Vector(155.0), Vector(156.0)), Vector(Vector(157.0)))), Vector(s0(Vector(Vector(158.0), Vector(159.0)), Vector(Vector(160.0)))))), s6(s5(Vector(Vector(s3(Vector(Vector(s2(Vector(Vector(s0(Vector(Vector(161.0), Vector(162.0)), Vector(Vector(163.0)))), Vector(s0(Vector(Vector(164.0), Vector(165.0)), Vector(Vector(166.0)))), Vector(s0(Vector(Vector(167.0), Vector(168.0)), Vector(Vector(169.0))))), Vector(s0(Vector(Vector(170.0), Vector(171.0)), Vector(Vector(172.0))), s0(Vector(Vector(173.0), Vector(174.0)), Vector(Vector(175.0)))))), Vector(s2(Vector(Vector(s0(Vector(Vector(176.0), Vector(177.0)), Vector(Vector(178.0)))), Vector(s0(Vector(Vector(179.0), Vector(180.0)), Vector(Vector(181.0)))), Vector(s0(Vector(Vector(182.0), Vector(183.0)), Vector(Vector(184.0))))), Vector(s0(Vector(Vector(185.0), Vector(186.0)), Vector(Vector(187.0))), s0(Vector(Vector(188.0), Vector(189.0)), Vector(Vector(190.0)))))), Vector(s2(Vector(Vector(s0(Vector(Vector(191.0), Vector(192.0)), Vector(Vector(193.0)))), Vector(s0(Vector(Vector(194.0), Vector(195.0)), Vector(Vector(196.0)))), Vector(s0(Vector(Vector(197.0), Vector(198.0)), Vector(Vector(199.0))))), Vector(s0(Vector(Vector(200.0), Vector(201.0)), Vector(Vector(202.0))), s0(Vector(Vector(203.0), Vector(204.0)), Vector(Vector(205.0))))))), s0(Vector(Vector(206.0), Vector(207.0)), Vector(Vector(208.0)))))), s2(Vector(Vector(s0(Vector(Vector(209.0), Vector(210.0)), Vector(Vector(211.0)))), Vector(s0(Vector(Vector(212.0), Vector(213.0)), Vector(Vector(214.0)))), Vector(s0(Vector(Vector(215.0), Vector(216.0)), Vector(Vector(217.0))))), Vector(s0(Vector(Vector(218.0), Vector(219.0)), Vector(Vector(220.0))), s0(Vector(Vector(221.0), Vector(222.0)), Vector(Vector(223.0)))))), Vector(Vector(s0(Vector(Vector(224.0), Vector(225.0)), Vector(Vector(226.0)))), Vector(s0(Vector(Vector(227.0), Vector(228.0)), Vector(Vector(229.0)))))))
    val v3: s3 = s3(Vector(Vector(s2(Vector(Vector(s0(Vector(Vector(230.0), Vector(231.0)), Vector(Vector(232.0)))), Vector(s0(Vector(Vector(233.0), Vector(234.0)), Vector(Vector(235.0)))), Vector(s0(Vector(Vector(236.0), Vector(237.0)), Vector(Vector(238.0))))), Vector(s0(Vector(Vector(239.0), Vector(240.0)), Vector(Vector(241.0))), s0(Vector(Vector(242.0), Vector(243.0)), Vector(Vector(244.0)))))), Vector(s2(Vector(Vector(s0(Vector(Vector(245.0), Vector(246.0)), Vector(Vector(247.0)))), Vector(s0(Vector(Vector(248.0), Vector(249.0)), Vector(Vector(250.0)))), Vector(s0(Vector(Vector(251.0), Vector(252.0)), Vector(Vector(253.0))))), Vector(s0(Vector(Vector(254.0), Vector(255.0)), Vector(Vector(256.0))), s0(Vector(Vector(257.0), Vector(258.0)), Vector(Vector(259.0)))))), Vector(s2(Vector(Vector(s0(Vector(Vector(260.0), Vector(261.0)), Vector(Vector(262.0)))), Vector(s0(Vector(Vector(263.0), Vector(264.0)), Vector(Vector(265.0)))), Vector(s0(Vector(Vector(266.0), Vector(267.0)), Vector(Vector(268.0))))), Vector(s0(Vector(Vector(269.0), Vector(270.0)), Vector(Vector(271.0))), s0(Vector(Vector(272.0), Vector(273.0)), Vector(Vector(274.0))))))), s0(Vector(Vector(275.0), Vector(276.0)), Vector(Vector(277.0))))
    val v4: Double = 278.0
    val start = nanoTime()
    var result: Double = 278.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}