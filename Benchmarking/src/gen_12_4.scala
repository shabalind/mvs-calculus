import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Double,
    p1: s0
  )
  case class s3 (
    p0: s1,
    p1: Vector[s0]
  )
  case class s4 (
    p0: s3,
    p1: s1
  )
  case class s5 (
    p0: Vector[s0],
    p1: Vector[s4],
    p2: Vector[s4],
    p3: Vector[s1],
    p4: Vector[s3]
  )
  case class s8 (
    p0: s0,
    p1: Vector[s5]
  )
  def f49(v0: s8, v1: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    var v5: Vector[Vector[Double]] = v1
    var v4: Vector[Vector[Double]] = v1
    val v10: Vector[Vector[Vector[Double]]] = Vector(v4, v1, v1, v1, v4, v5)
    val v8: Vector[Vector[Vector[Double]]] = Vector(v1, v4, v4, v1, v1)
    var v6: Vector[Vector[Vector[Double]]] = v10
    val v29: Vector[Vector[Double]] = v8(0)
    v4 = v29
    val v203: Vector[Vector[Double]] = v6(5)
    v203
  }
  def f45(v0: s8): s8 = {
    var v5: s8 = v0
    var v3: s8 = v0
    val v6: Vector[s5] = v5.p1
    val v1: s0 = v5.p0
    val v7: Vector[s5] = v3.p1
    val v13: s8 = s8(v1, v7)
    var v4: s8 = v3
    v4 = v4.copy(p1 = v6)
    v5 = v5.copy(p1 = v7)
    var v11: s0 = v1
    v3 = v3.copy(p0 = v11)
    var v8: s0 = v11
    val v18: s5 = v7(0)
    val v32: Vector[s5] = v3.p1
    var v51: s0 = v1
    val v19: s8 = s8(v1, v6)
    v5 = v5.copy(p0 = v51)
    val v29: Vector[s4] = v18.p1
    val v36: s4 = v29(0)
    val v30: Vector[Vector[Double]] = v11.p0
    val v20: s1 = v36.p1
    v8 = v8.copy(p1 = v30)
    val v40: Vector[Vector[Double]] = v8.p0
    val v39: Vector[Double] = v30(2)
    val v45: Vector[Vector[Double]] = f49(v13, v40)
    val v46: s0 = v20.p1
    var v54: Vector[Vector[Double]] = v45
    val v78: Vector[Vector[Double]] = f49(v5, v54)
    val v86: Vector[Vector[Double]] = f49(v19, v40)
    val v56: s0 = v0.p0
    var v64: Vector[Double] = v39
    val v58: Vector[Double] = v40(2)
    v5 = v5.copy(p1 = v32)
    v4 = v4.copy(p0 = v56)
    v54 = v54.updated(2, v58)
    v8 = v8.copy(p1 = v86)
    var v124: s0 = v46
    v5 = v5.copy(p0 = v124)
    v11 = v11.copy(p1 = v54)
    v54 = v54.updated(1, v64)
    v11 = v11.copy(p0 = v78)
    v4
  }
  @noinline
  def f0(v0: s8, v1: Double): Double = {
    val v6: s8 = f45(v0)
    val v3: s0 = v6.p0
    var v7: s0 = v3
    val v11: Vector[Vector[Double]] = v7.p1
    val v13: Vector[Double] = v11(1)
    v7 = v7.copy(p0 = v11)
    val v63: Double = v13(0)
    v63
  }
  def benchmark(): Unit = {
    val v0: s8 = s8(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0))), Vector(s5(Vector(s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0)))), Vector(s4(s3(s1(18.0, s0(Vector(Vector(19.0), Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0), Vector(24.0)))), Vector(s0(Vector(Vector(25.0), Vector(26.0), Vector(27.0)), Vector(Vector(28.0), Vector(29.0), Vector(30.0))))), s1(31.0, s0(Vector(Vector(32.0), Vector(33.0), Vector(34.0)), Vector(Vector(35.0), Vector(36.0), Vector(37.0))))), s4(s3(s1(38.0, s0(Vector(Vector(39.0), Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0), Vector(44.0)))), Vector(s0(Vector(Vector(45.0), Vector(46.0), Vector(47.0)), Vector(Vector(48.0), Vector(49.0), Vector(50.0))))), s1(51.0, s0(Vector(Vector(52.0), Vector(53.0), Vector(54.0)), Vector(Vector(55.0), Vector(56.0), Vector(57.0)))))), Vector(s4(s3(s1(58.0, s0(Vector(Vector(59.0), Vector(60.0), Vector(61.0)), Vector(Vector(62.0), Vector(63.0), Vector(64.0)))), Vector(s0(Vector(Vector(65.0), Vector(66.0), Vector(67.0)), Vector(Vector(68.0), Vector(69.0), Vector(70.0))))), s1(71.0, s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)), Vector(Vector(75.0), Vector(76.0), Vector(77.0))))), s4(s3(s1(78.0, s0(Vector(Vector(79.0), Vector(80.0), Vector(81.0)), Vector(Vector(82.0), Vector(83.0), Vector(84.0)))), Vector(s0(Vector(Vector(85.0), Vector(86.0), Vector(87.0)), Vector(Vector(88.0), Vector(89.0), Vector(90.0))))), s1(91.0, s0(Vector(Vector(92.0), Vector(93.0), Vector(94.0)), Vector(Vector(95.0), Vector(96.0), Vector(97.0)))))), Vector(s1(98.0, s0(Vector(Vector(99.0), Vector(100.0), Vector(101.0)), Vector(Vector(102.0), Vector(103.0), Vector(104.0))))), Vector(s3(s1(105.0, s0(Vector(Vector(106.0), Vector(107.0), Vector(108.0)), Vector(Vector(109.0), Vector(110.0), Vector(111.0)))), Vector(s0(Vector(Vector(112.0), Vector(113.0), Vector(114.0)), Vector(Vector(115.0), Vector(116.0), Vector(117.0))))), s3(s1(118.0, s0(Vector(Vector(119.0), Vector(120.0), Vector(121.0)), Vector(Vector(122.0), Vector(123.0), Vector(124.0)))), Vector(s0(Vector(Vector(125.0), Vector(126.0), Vector(127.0)), Vector(Vector(128.0), Vector(129.0), Vector(130.0))))), s3(s1(131.0, s0(Vector(Vector(132.0), Vector(133.0), Vector(134.0)), Vector(Vector(135.0), Vector(136.0), Vector(137.0)))), Vector(s0(Vector(Vector(138.0), Vector(139.0), Vector(140.0)), Vector(Vector(141.0), Vector(142.0), Vector(143.0))))))), s5(Vector(s0(Vector(Vector(144.0), Vector(145.0), Vector(146.0)), Vector(Vector(147.0), Vector(148.0), Vector(149.0))), s0(Vector(Vector(150.0), Vector(151.0), Vector(152.0)), Vector(Vector(153.0), Vector(154.0), Vector(155.0)))), Vector(s4(s3(s1(156.0, s0(Vector(Vector(157.0), Vector(158.0), Vector(159.0)), Vector(Vector(160.0), Vector(161.0), Vector(162.0)))), Vector(s0(Vector(Vector(163.0), Vector(164.0), Vector(165.0)), Vector(Vector(166.0), Vector(167.0), Vector(168.0))))), s1(169.0, s0(Vector(Vector(170.0), Vector(171.0), Vector(172.0)), Vector(Vector(173.0), Vector(174.0), Vector(175.0))))), s4(s3(s1(176.0, s0(Vector(Vector(177.0), Vector(178.0), Vector(179.0)), Vector(Vector(180.0), Vector(181.0), Vector(182.0)))), Vector(s0(Vector(Vector(183.0), Vector(184.0), Vector(185.0)), Vector(Vector(186.0), Vector(187.0), Vector(188.0))))), s1(189.0, s0(Vector(Vector(190.0), Vector(191.0), Vector(192.0)), Vector(Vector(193.0), Vector(194.0), Vector(195.0)))))), Vector(s4(s3(s1(196.0, s0(Vector(Vector(197.0), Vector(198.0), Vector(199.0)), Vector(Vector(200.0), Vector(201.0), Vector(202.0)))), Vector(s0(Vector(Vector(203.0), Vector(204.0), Vector(205.0)), Vector(Vector(206.0), Vector(207.0), Vector(208.0))))), s1(209.0, s0(Vector(Vector(210.0), Vector(211.0), Vector(212.0)), Vector(Vector(213.0), Vector(214.0), Vector(215.0))))), s4(s3(s1(216.0, s0(Vector(Vector(217.0), Vector(218.0), Vector(219.0)), Vector(Vector(220.0), Vector(221.0), Vector(222.0)))), Vector(s0(Vector(Vector(223.0), Vector(224.0), Vector(225.0)), Vector(Vector(226.0), Vector(227.0), Vector(228.0))))), s1(229.0, s0(Vector(Vector(230.0), Vector(231.0), Vector(232.0)), Vector(Vector(233.0), Vector(234.0), Vector(235.0)))))), Vector(s1(236.0, s0(Vector(Vector(237.0), Vector(238.0), Vector(239.0)), Vector(Vector(240.0), Vector(241.0), Vector(242.0))))), Vector(s3(s1(243.0, s0(Vector(Vector(244.0), Vector(245.0), Vector(246.0)), Vector(Vector(247.0), Vector(248.0), Vector(249.0)))), Vector(s0(Vector(Vector(250.0), Vector(251.0), Vector(252.0)), Vector(Vector(253.0), Vector(254.0), Vector(255.0))))), s3(s1(256.0, s0(Vector(Vector(257.0), Vector(258.0), Vector(259.0)), Vector(Vector(260.0), Vector(261.0), Vector(262.0)))), Vector(s0(Vector(Vector(263.0), Vector(264.0), Vector(265.0)), Vector(Vector(266.0), Vector(267.0), Vector(268.0))))), s3(s1(269.0, s0(Vector(Vector(270.0), Vector(271.0), Vector(272.0)), Vector(Vector(273.0), Vector(274.0), Vector(275.0)))), Vector(s0(Vector(Vector(276.0), Vector(277.0), Vector(278.0)), Vector(Vector(279.0), Vector(280.0), Vector(281.0)))))))))
    val v1: Double = 282.0
    val start = nanoTime()
    var result: Double = 282.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}