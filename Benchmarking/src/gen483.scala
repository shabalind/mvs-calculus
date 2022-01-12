import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]],
    p3: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  case class s2 (
    p0: s0,
    p1: s1
  )
  case class s3 (
    p0: s1,
    p1: Vector[s0],
    p2: s2,
    p3: s1
  )
  def f73(v0: Double): Double = {
    var v6: Double = v0
    var v1: Double = v6
    var v4: Double = v1
    var v2: Double = v1
    var v5: Double = v1
    var v10: Double = v6
    var v8: Double = v2
    var v11: Double = v1
    var v27: Double = v4
    var v14: Double = v1
    val v12: Vector[Double] = Vector(v4)
    var v18: Vector[Double] = v12
    var v46: Vector[Double] = v18
    var v21: Vector[Double] = v18
    var v25: Vector[Double] = v21
    var v32: Vector[Double] = v46
    var v40: Vector[Double] = v18
    var v23: Double = v2
    var v37: Double = v5
    val v83: Vector[Vector[Double]] = Vector(v18, v40, v21, v25, v40, v21, v40)
    v18 = v18.updated(0, v37)
    val v39: Vector[Double] = v83(0)
    var v70: Vector[Double] = v40
    v32 = v39
    v70 = v46
    var v45: Double = v2
    v40 = v40.updated(0, v14)
    v18 = v18.updated(0, v6)
    val v78: Vector[Double] = v83(6)
    v2 = v10
    v70 = v70.updated(0, v11)
    v32 = v32.updated(0, v23)
    v70 = v70.updated(0, v45)
    val v138: Double = v70(0)
    v40 = v40.updated(0, v138)
    val v92: Vector[Vector[Double]] = Vector(v78, v32)
    v18 = v18.updated(0, v11)
    var v84: Vector[Vector[Double]] = v92
    v46 = v46.updated(0, v27)
    val v96: Vector[Double] = v84(0)
    val v130: Double = v96(0)
    v46 = v46.updated(0, v8)
    v130
  }
  def f10(v0: Double): Double = {
    var v6: Double = v0
    val v3: Double = f73(v0)
    var v1: Double = v6
    var v9: Double = v6
    var v12: Double = v3
    val v10: Double = f73(v9)
    val v4: Double = f73(v10)
    val v20: Double = f73(v4)
    val v22: Vector[Double] = Vector(v4, v3, v20, v1, v9)
    var v26: Vector[Double] = v22
    var v18: Vector[Double] = v26
    v18 = v18.updated(1, v12)
    v26 = v26.updated(3, v3)
    v18 = v26
    val v44: Double = v18(1)
    var v125: Double = v44
    v125
  }
  @noinline
  def f0(v0: Vector[s3], v1: Double): Double = {
    val v4: s3 = v0(2)
    val v2: Double = f10(v1)
    val v7: s2 = v4.p2
    val v16: Double = f10(v1)
    val v20: Double = f10(v2)
    val v37: Double = v20 + v16
    val v24: s0 = v7.p0
    val v82: Double = f10(v37)
    val v39: Vector[Vector[Double]] = v24.p2
    val v75: Vector[Double] = v39(1)
    var v92: Vector[Double] = v75
    v92 = v92.updated(0, v82)
    val v78: Double = v92(0)
    v78
  }
  def benchmark(): Unit = {
    val v0: Vector[s3] = Vector(s3(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0)), Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0))), s0(Vector(Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0), Vector(12.0)), Vector(Vector(13.0)))), s0(Vector(Vector(14.0), Vector(15.0)), Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0)))), Vector(s0(Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0), Vector(24.0)), Vector(Vector(25.0), Vector(26.0)), Vector(Vector(27.0))), s0(Vector(Vector(28.0), Vector(29.0)), Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0), Vector(33.0)), Vector(Vector(34.0))), s0(Vector(Vector(35.0), Vector(36.0)), Vector(Vector(37.0), Vector(38.0)), Vector(Vector(39.0), Vector(40.0)), Vector(Vector(41.0)))), s2(s0(Vector(Vector(42.0), Vector(43.0)), Vector(Vector(44.0), Vector(45.0)), Vector(Vector(46.0), Vector(47.0)), Vector(Vector(48.0))), s1(Vector(s0(Vector(Vector(49.0), Vector(50.0)), Vector(Vector(51.0), Vector(52.0)), Vector(Vector(53.0), Vector(54.0)), Vector(Vector(55.0))), s0(Vector(Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0)), Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0)))), s0(Vector(Vector(63.0), Vector(64.0)), Vector(Vector(65.0), Vector(66.0)), Vector(Vector(67.0), Vector(68.0)), Vector(Vector(69.0))))), s1(Vector(s0(Vector(Vector(70.0), Vector(71.0)), Vector(Vector(72.0), Vector(73.0)), Vector(Vector(74.0), Vector(75.0)), Vector(Vector(76.0))), s0(Vector(Vector(77.0), Vector(78.0)), Vector(Vector(79.0), Vector(80.0)), Vector(Vector(81.0), Vector(82.0)), Vector(Vector(83.0)))), s0(Vector(Vector(84.0), Vector(85.0)), Vector(Vector(86.0), Vector(87.0)), Vector(Vector(88.0), Vector(89.0)), Vector(Vector(90.0))))), s3(s1(Vector(s0(Vector(Vector(91.0), Vector(92.0)), Vector(Vector(93.0), Vector(94.0)), Vector(Vector(95.0), Vector(96.0)), Vector(Vector(97.0))), s0(Vector(Vector(98.0), Vector(99.0)), Vector(Vector(100.0), Vector(101.0)), Vector(Vector(102.0), Vector(103.0)), Vector(Vector(104.0)))), s0(Vector(Vector(105.0), Vector(106.0)), Vector(Vector(107.0), Vector(108.0)), Vector(Vector(109.0), Vector(110.0)), Vector(Vector(111.0)))), Vector(s0(Vector(Vector(112.0), Vector(113.0)), Vector(Vector(114.0), Vector(115.0)), Vector(Vector(116.0), Vector(117.0)), Vector(Vector(118.0))), s0(Vector(Vector(119.0), Vector(120.0)), Vector(Vector(121.0), Vector(122.0)), Vector(Vector(123.0), Vector(124.0)), Vector(Vector(125.0))), s0(Vector(Vector(126.0), Vector(127.0)), Vector(Vector(128.0), Vector(129.0)), Vector(Vector(130.0), Vector(131.0)), Vector(Vector(132.0)))), s2(s0(Vector(Vector(133.0), Vector(134.0)), Vector(Vector(135.0), Vector(136.0)), Vector(Vector(137.0), Vector(138.0)), Vector(Vector(139.0))), s1(Vector(s0(Vector(Vector(140.0), Vector(141.0)), Vector(Vector(142.0), Vector(143.0)), Vector(Vector(144.0), Vector(145.0)), Vector(Vector(146.0))), s0(Vector(Vector(147.0), Vector(148.0)), Vector(Vector(149.0), Vector(150.0)), Vector(Vector(151.0), Vector(152.0)), Vector(Vector(153.0)))), s0(Vector(Vector(154.0), Vector(155.0)), Vector(Vector(156.0), Vector(157.0)), Vector(Vector(158.0), Vector(159.0)), Vector(Vector(160.0))))), s1(Vector(s0(Vector(Vector(161.0), Vector(162.0)), Vector(Vector(163.0), Vector(164.0)), Vector(Vector(165.0), Vector(166.0)), Vector(Vector(167.0))), s0(Vector(Vector(168.0), Vector(169.0)), Vector(Vector(170.0), Vector(171.0)), Vector(Vector(172.0), Vector(173.0)), Vector(Vector(174.0)))), s0(Vector(Vector(175.0), Vector(176.0)), Vector(Vector(177.0), Vector(178.0)), Vector(Vector(179.0), Vector(180.0)), Vector(Vector(181.0))))), s3(s1(Vector(s0(Vector(Vector(182.0), Vector(183.0)), Vector(Vector(184.0), Vector(185.0)), Vector(Vector(186.0), Vector(187.0)), Vector(Vector(188.0))), s0(Vector(Vector(189.0), Vector(190.0)), Vector(Vector(191.0), Vector(192.0)), Vector(Vector(193.0), Vector(194.0)), Vector(Vector(195.0)))), s0(Vector(Vector(196.0), Vector(197.0)), Vector(Vector(198.0), Vector(199.0)), Vector(Vector(200.0), Vector(201.0)), Vector(Vector(202.0)))), Vector(s0(Vector(Vector(203.0), Vector(204.0)), Vector(Vector(205.0), Vector(206.0)), Vector(Vector(207.0), Vector(208.0)), Vector(Vector(209.0))), s0(Vector(Vector(210.0), Vector(211.0)), Vector(Vector(212.0), Vector(213.0)), Vector(Vector(214.0), Vector(215.0)), Vector(Vector(216.0))), s0(Vector(Vector(217.0), Vector(218.0)), Vector(Vector(219.0), Vector(220.0)), Vector(Vector(221.0), Vector(222.0)), Vector(Vector(223.0)))), s2(s0(Vector(Vector(224.0), Vector(225.0)), Vector(Vector(226.0), Vector(227.0)), Vector(Vector(228.0), Vector(229.0)), Vector(Vector(230.0))), s1(Vector(s0(Vector(Vector(231.0), Vector(232.0)), Vector(Vector(233.0), Vector(234.0)), Vector(Vector(235.0), Vector(236.0)), Vector(Vector(237.0))), s0(Vector(Vector(238.0), Vector(239.0)), Vector(Vector(240.0), Vector(241.0)), Vector(Vector(242.0), Vector(243.0)), Vector(Vector(244.0)))), s0(Vector(Vector(245.0), Vector(246.0)), Vector(Vector(247.0), Vector(248.0)), Vector(Vector(249.0), Vector(250.0)), Vector(Vector(251.0))))), s1(Vector(s0(Vector(Vector(252.0), Vector(253.0)), Vector(Vector(254.0), Vector(255.0)), Vector(Vector(256.0), Vector(257.0)), Vector(Vector(258.0))), s0(Vector(Vector(259.0), Vector(260.0)), Vector(Vector(261.0), Vector(262.0)), Vector(Vector(263.0), Vector(264.0)), Vector(Vector(265.0)))), s0(Vector(Vector(266.0), Vector(267.0)), Vector(Vector(268.0), Vector(269.0)), Vector(Vector(270.0), Vector(271.0)), Vector(Vector(272.0))))))
    val v1: Double = 273.0
    val start = nanoTime()
    var result: Double = 273.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}