import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: s0,
    p1: s1
  )
  case class s3 (
    p0: s2,
    p1: s2
  )
  case class s4 (
    p0: s2,
    p1: s2
  )
  case class s5 (
    p0: s2,
    p1: s3
  )
  def f50(v0: s2, v1: s2): s2 = {
    var v11: s2 = v0
    v11
  }
  def f21(v0: s2): s2 = {
    val v6: s2 = f50(v0, v0)
    val v4: s2 = f50(v6, v0)
    val v1: s1 = v0.p1
    var v3: s2 = v6
    val v8: s2 = f50(v4, v3)
    val v11: s2 = f50(v6, v4)
    val v21: s2 = f50(v6, v8)
    v3 = v3.copy(p1 = v1)
    val v17: s0 = v1.p1
    val v29: s0 = v1.p0
    var v18: s1 = v1
    var v41: s0 = v17
    v18 = v18.copy(p0 = v29)
    v3 = v3.copy(p1 = v18)
    val v69: s1 = v21.p1
    val v24: s2 = f50(v11, v3)
    val v59: s2 = s2(v41, v69)
    val v60: s2 = f50(v59, v59)
    val v64: s2 = f50(v24, v59)
    v18 = v69
    val v39: s2 = f50(v64, v4)
    val v78: s2 = f50(v60, v39)
    v78
  }
  @noinline
  def f0(v0: Vector[s4], v1: Vector[s5], v2: s4, v3: Vector[Vector[s1]], v4: Double): Double = {
    val v7: s2 = v2.p1
    val v6: s2 = f21(v7)
    val v8: s0 = v6.p0
    val v22: Vector[Vector[Double]] = v8.p1
    val v36: Vector[Double] = v22(1)
    val v61: Double = v36(0)
    v61
  }
  def benchmark(): Unit = {
    val v0: Vector[s4] = Vector(s4(s2(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0))), s1(s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0))), s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0))))), s2(s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0))), s1(s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0), Vector(24.0))), s0(Vector(Vector(25.0), Vector(26.0), Vector(27.0)), Vector(Vector(28.0), Vector(29.0)))))), s4(s2(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0))), s1(s0(Vector(Vector(35.0), Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0))), s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0), Vector(44.0))))), s2(s0(Vector(Vector(45.0), Vector(46.0), Vector(47.0)), Vector(Vector(48.0), Vector(49.0))), s1(s0(Vector(Vector(50.0), Vector(51.0), Vector(52.0)), Vector(Vector(53.0), Vector(54.0))), s0(Vector(Vector(55.0), Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0)))))))
    val v1: Vector[s5] = Vector(s5(s2(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0), Vector(64.0))), s1(s0(Vector(Vector(65.0), Vector(66.0), Vector(67.0)), Vector(Vector(68.0), Vector(69.0))), s0(Vector(Vector(70.0), Vector(71.0), Vector(72.0)), Vector(Vector(73.0), Vector(74.0))))), s3(s2(s0(Vector(Vector(75.0), Vector(76.0), Vector(77.0)), Vector(Vector(78.0), Vector(79.0))), s1(s0(Vector(Vector(80.0), Vector(81.0), Vector(82.0)), Vector(Vector(83.0), Vector(84.0))), s0(Vector(Vector(85.0), Vector(86.0), Vector(87.0)), Vector(Vector(88.0), Vector(89.0))))), s2(s0(Vector(Vector(90.0), Vector(91.0), Vector(92.0)), Vector(Vector(93.0), Vector(94.0))), s1(s0(Vector(Vector(95.0), Vector(96.0), Vector(97.0)), Vector(Vector(98.0), Vector(99.0))), s0(Vector(Vector(100.0), Vector(101.0), Vector(102.0)), Vector(Vector(103.0), Vector(104.0))))))), s5(s2(s0(Vector(Vector(105.0), Vector(106.0), Vector(107.0)), Vector(Vector(108.0), Vector(109.0))), s1(s0(Vector(Vector(110.0), Vector(111.0), Vector(112.0)), Vector(Vector(113.0), Vector(114.0))), s0(Vector(Vector(115.0), Vector(116.0), Vector(117.0)), Vector(Vector(118.0), Vector(119.0))))), s3(s2(s0(Vector(Vector(120.0), Vector(121.0), Vector(122.0)), Vector(Vector(123.0), Vector(124.0))), s1(s0(Vector(Vector(125.0), Vector(126.0), Vector(127.0)), Vector(Vector(128.0), Vector(129.0))), s0(Vector(Vector(130.0), Vector(131.0), Vector(132.0)), Vector(Vector(133.0), Vector(134.0))))), s2(s0(Vector(Vector(135.0), Vector(136.0), Vector(137.0)), Vector(Vector(138.0), Vector(139.0))), s1(s0(Vector(Vector(140.0), Vector(141.0), Vector(142.0)), Vector(Vector(143.0), Vector(144.0))), s0(Vector(Vector(145.0), Vector(146.0), Vector(147.0)), Vector(Vector(148.0), Vector(149.0))))))), s5(s2(s0(Vector(Vector(150.0), Vector(151.0), Vector(152.0)), Vector(Vector(153.0), Vector(154.0))), s1(s0(Vector(Vector(155.0), Vector(156.0), Vector(157.0)), Vector(Vector(158.0), Vector(159.0))), s0(Vector(Vector(160.0), Vector(161.0), Vector(162.0)), Vector(Vector(163.0), Vector(164.0))))), s3(s2(s0(Vector(Vector(165.0), Vector(166.0), Vector(167.0)), Vector(Vector(168.0), Vector(169.0))), s1(s0(Vector(Vector(170.0), Vector(171.0), Vector(172.0)), Vector(Vector(173.0), Vector(174.0))), s0(Vector(Vector(175.0), Vector(176.0), Vector(177.0)), Vector(Vector(178.0), Vector(179.0))))), s2(s0(Vector(Vector(180.0), Vector(181.0), Vector(182.0)), Vector(Vector(183.0), Vector(184.0))), s1(s0(Vector(Vector(185.0), Vector(186.0), Vector(187.0)), Vector(Vector(188.0), Vector(189.0))), s0(Vector(Vector(190.0), Vector(191.0), Vector(192.0)), Vector(Vector(193.0), Vector(194.0))))))))
    val v2: s4 = s4(s2(s0(Vector(Vector(195.0), Vector(196.0), Vector(197.0)), Vector(Vector(198.0), Vector(199.0))), s1(s0(Vector(Vector(200.0), Vector(201.0), Vector(202.0)), Vector(Vector(203.0), Vector(204.0))), s0(Vector(Vector(205.0), Vector(206.0), Vector(207.0)), Vector(Vector(208.0), Vector(209.0))))), s2(s0(Vector(Vector(210.0), Vector(211.0), Vector(212.0)), Vector(Vector(213.0), Vector(214.0))), s1(s0(Vector(Vector(215.0), Vector(216.0), Vector(217.0)), Vector(Vector(218.0), Vector(219.0))), s0(Vector(Vector(220.0), Vector(221.0), Vector(222.0)), Vector(Vector(223.0), Vector(224.0))))))
    val v3: Vector[Vector[s1]] = Vector(Vector(s1(s0(Vector(Vector(225.0), Vector(226.0), Vector(227.0)), Vector(Vector(228.0), Vector(229.0))), s0(Vector(Vector(230.0), Vector(231.0), Vector(232.0)), Vector(Vector(233.0), Vector(234.0))))), Vector(s1(s0(Vector(Vector(235.0), Vector(236.0), Vector(237.0)), Vector(Vector(238.0), Vector(239.0))), s0(Vector(Vector(240.0), Vector(241.0), Vector(242.0)), Vector(Vector(243.0), Vector(244.0))))), Vector(s1(s0(Vector(Vector(245.0), Vector(246.0), Vector(247.0)), Vector(Vector(248.0), Vector(249.0))), s0(Vector(Vector(250.0), Vector(251.0), Vector(252.0)), Vector(Vector(253.0), Vector(254.0))))))
    val v4: Double = 255.0
    val start = nanoTime()
    var result: Double = 255.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}