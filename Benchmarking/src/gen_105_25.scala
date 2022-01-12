import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Double,
    p1: s0,
    p2: s0,
    p3: s0
  )
  case class s3 (
    p0: Vector[s1],
    p1: s0
  )
  def f32(v0: Double): Double = {
    var v3: Double = v0
    var v5: Double = v0
    var v4: Double = v0
    var v7: Double = v5
    val v2: Double = v5 - v3
    var v6: Double = v4
    v7 = v6
    var v9: Double = v2
    val v1: Vector[Double] = Vector(v0, v0, v6, v2)
    v6 = v4
    val v11: Double = v7 + v7
    var v27: Vector[Double] = v1
    v7 = v11
    val v22: Double = v27(2)
    v27 = v27.updated(0, v6)
    val v40: Vector[Double] = Vector(v9, v9, v22, v9, v22, v11, v5)
    var v24: Vector[Double] = v40
    v27 = v27.updated(1, v7)
    v27 = v27.updated(1, v5)
    v9 = v5
    var v31: Vector[Double] = v24
    v7 = v4
    val v81: Vector[Vector[Double]] = Vector(v40, v40, v40, v40, v24, v40, v31)
    val v44: Vector[Double] = v81(1)
    val v191: Double = v44(2)
    v191
  }
  @noinline
  def f0(v0: Vector[Vector[s3]], v1: Double): Double = {
    var v11: Double = v1
    var v6: Double = v11
    val v10: Double = f32(v6)
    var v15: Double = v10
    v15
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s3]] = Vector(Vector(s3(Vector(s1(0.0, s0(Vector(Vector(1.0), Vector(2.0), Vector(3.0)), Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0))), s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0)), Vector(Vector(16.0), Vector(17.0), Vector(18.0))), s0(Vector(Vector(19.0), Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0), Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0)))), s1(28.0, s0(Vector(Vector(29.0), Vector(30.0), Vector(31.0)), Vector(Vector(32.0), Vector(33.0), Vector(34.0)), Vector(Vector(35.0), Vector(36.0), Vector(37.0))), s0(Vector(Vector(38.0), Vector(39.0), Vector(40.0)), Vector(Vector(41.0), Vector(42.0), Vector(43.0)), Vector(Vector(44.0), Vector(45.0), Vector(46.0))), s0(Vector(Vector(47.0), Vector(48.0), Vector(49.0)), Vector(Vector(50.0), Vector(51.0), Vector(52.0)), Vector(Vector(53.0), Vector(54.0), Vector(55.0)))), s1(56.0, s0(Vector(Vector(57.0), Vector(58.0), Vector(59.0)), Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0), Vector(64.0), Vector(65.0))), s0(Vector(Vector(66.0), Vector(67.0), Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0)), Vector(Vector(72.0), Vector(73.0), Vector(74.0))), s0(Vector(Vector(75.0), Vector(76.0), Vector(77.0)), Vector(Vector(78.0), Vector(79.0), Vector(80.0)), Vector(Vector(81.0), Vector(82.0), Vector(83.0))))), s0(Vector(Vector(84.0), Vector(85.0), Vector(86.0)), Vector(Vector(87.0), Vector(88.0), Vector(89.0)), Vector(Vector(90.0), Vector(91.0), Vector(92.0))))), Vector(s3(Vector(s1(93.0, s0(Vector(Vector(94.0), Vector(95.0), Vector(96.0)), Vector(Vector(97.0), Vector(98.0), Vector(99.0)), Vector(Vector(100.0), Vector(101.0), Vector(102.0))), s0(Vector(Vector(103.0), Vector(104.0), Vector(105.0)), Vector(Vector(106.0), Vector(107.0), Vector(108.0)), Vector(Vector(109.0), Vector(110.0), Vector(111.0))), s0(Vector(Vector(112.0), Vector(113.0), Vector(114.0)), Vector(Vector(115.0), Vector(116.0), Vector(117.0)), Vector(Vector(118.0), Vector(119.0), Vector(120.0)))), s1(121.0, s0(Vector(Vector(122.0), Vector(123.0), Vector(124.0)), Vector(Vector(125.0), Vector(126.0), Vector(127.0)), Vector(Vector(128.0), Vector(129.0), Vector(130.0))), s0(Vector(Vector(131.0), Vector(132.0), Vector(133.0)), Vector(Vector(134.0), Vector(135.0), Vector(136.0)), Vector(Vector(137.0), Vector(138.0), Vector(139.0))), s0(Vector(Vector(140.0), Vector(141.0), Vector(142.0)), Vector(Vector(143.0), Vector(144.0), Vector(145.0)), Vector(Vector(146.0), Vector(147.0), Vector(148.0)))), s1(149.0, s0(Vector(Vector(150.0), Vector(151.0), Vector(152.0)), Vector(Vector(153.0), Vector(154.0), Vector(155.0)), Vector(Vector(156.0), Vector(157.0), Vector(158.0))), s0(Vector(Vector(159.0), Vector(160.0), Vector(161.0)), Vector(Vector(162.0), Vector(163.0), Vector(164.0)), Vector(Vector(165.0), Vector(166.0), Vector(167.0))), s0(Vector(Vector(168.0), Vector(169.0), Vector(170.0)), Vector(Vector(171.0), Vector(172.0), Vector(173.0)), Vector(Vector(174.0), Vector(175.0), Vector(176.0))))), s0(Vector(Vector(177.0), Vector(178.0), Vector(179.0)), Vector(Vector(180.0), Vector(181.0), Vector(182.0)), Vector(Vector(183.0), Vector(184.0), Vector(185.0))))), Vector(s3(Vector(s1(186.0, s0(Vector(Vector(187.0), Vector(188.0), Vector(189.0)), Vector(Vector(190.0), Vector(191.0), Vector(192.0)), Vector(Vector(193.0), Vector(194.0), Vector(195.0))), s0(Vector(Vector(196.0), Vector(197.0), Vector(198.0)), Vector(Vector(199.0), Vector(200.0), Vector(201.0)), Vector(Vector(202.0), Vector(203.0), Vector(204.0))), s0(Vector(Vector(205.0), Vector(206.0), Vector(207.0)), Vector(Vector(208.0), Vector(209.0), Vector(210.0)), Vector(Vector(211.0), Vector(212.0), Vector(213.0)))), s1(214.0, s0(Vector(Vector(215.0), Vector(216.0), Vector(217.0)), Vector(Vector(218.0), Vector(219.0), Vector(220.0)), Vector(Vector(221.0), Vector(222.0), Vector(223.0))), s0(Vector(Vector(224.0), Vector(225.0), Vector(226.0)), Vector(Vector(227.0), Vector(228.0), Vector(229.0)), Vector(Vector(230.0), Vector(231.0), Vector(232.0))), s0(Vector(Vector(233.0), Vector(234.0), Vector(235.0)), Vector(Vector(236.0), Vector(237.0), Vector(238.0)), Vector(Vector(239.0), Vector(240.0), Vector(241.0)))), s1(242.0, s0(Vector(Vector(243.0), Vector(244.0), Vector(245.0)), Vector(Vector(246.0), Vector(247.0), Vector(248.0)), Vector(Vector(249.0), Vector(250.0), Vector(251.0))), s0(Vector(Vector(252.0), Vector(253.0), Vector(254.0)), Vector(Vector(255.0), Vector(256.0), Vector(257.0)), Vector(Vector(258.0), Vector(259.0), Vector(260.0))), s0(Vector(Vector(261.0), Vector(262.0), Vector(263.0)), Vector(Vector(264.0), Vector(265.0), Vector(266.0)), Vector(Vector(267.0), Vector(268.0), Vector(269.0))))), s0(Vector(Vector(270.0), Vector(271.0), Vector(272.0)), Vector(Vector(273.0), Vector(274.0), Vector(275.0)), Vector(Vector(276.0), Vector(277.0), Vector(278.0))))))
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