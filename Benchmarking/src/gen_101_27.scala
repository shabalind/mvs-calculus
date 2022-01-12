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
  case class s3 (
    p0: Vector[s1],
    p1: s0
  )
  case class s4 (
    p0: Vector[Vector[s1]],
    p1: s3
  )
  case class s5 (
    p0: s4,
    p1: s0
  )
  case class s6 (
    p0: s3,
    p1: s4
  )
  case class s9 (
    p0: s3,
    p1: Vector[s1]
  )
  case class s10 (
    p0: Vector[s3],
    p1: s9
  )
  def f87(v0: Double): Double = {
    var v2: Double = v0
    var v1: Double = v0
    var v4: Double = v1
    var v7: Double = v2
    var v9: Double = v1
    var v3: Double = v4
    v9 = v3
    var v5: Double = v2
    var v12: Double = v2
    var v13: Double = v7
    var v6: Double = v13
    v2 = v5
    var v18: Double = v1
    val v10: Vector[Double] = Vector(v5, v0, v2)
    var v16: Vector[Double] = v10
    v1 = v6
    var v21: Double = v9
    val v15: Double = v10(1)
    v16 = v16.updated(0, v3)
    v16 = v16.updated(2, v15)
    v16 = v16.updated(0, v4)
    var v27: Double = v7
    var v34: Vector[Double] = v16
    val v30: Double = v1 - v1
    var v58: Vector[Double] = v34
    v58 = v58.updated(1, v5)
    v34 = v34.updated(2, v18)
    v2 = v1
    var v33: Vector[Double] = v58
    val v43: Double = v33(2)
    var v61: Vector[Double] = v34
    val v147: Double = v61(0)
    v61 = v61.updated(2, v13)
    val v39: Double = v12 - v27
    val v40: Double = v33(0)
    v13 = v40
    v33 = v33.updated(1, v39)
    v58 = v58.updated(2, v30)
    v61 = v61.updated(0, v43)
    v27 = v15
    v12 = v21
    v61 = v61.updated(2, v12)
    var v64: Double = v147
    v64
  }
  @noinline
  def f0(v0: Vector[Vector[s10]], v1: s6, v2: s5, v3: Double): Double = {
    var v5: Double = v3
    val v9: Double = f87(v5)
    v5 = v3
    val v50: Double = v9 / v3
    val v42: Double = f87(v50)
    val v83: Double = v50 / v50
    val v151: Double = v42 * v83
    v151
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s10]] = Vector(Vector(s10(Vector(s3(Vector(s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0))), s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0)))), s1(s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0)))), s1(s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0))), s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0))))), s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0))))), s9(s3(Vector(s1(s0(Vector(Vector(28.0), Vector(29.0), Vector(30.0)), Vector(Vector(31.0))), s0(Vector(Vector(32.0), Vector(33.0), Vector(34.0)), Vector(Vector(35.0)))), s1(s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0))), s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0)))), s1(s0(Vector(Vector(44.0), Vector(45.0), Vector(46.0)), Vector(Vector(47.0))), s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0))))), s0(Vector(Vector(52.0), Vector(53.0), Vector(54.0)), Vector(Vector(55.0)))), Vector(s1(s0(Vector(Vector(56.0), Vector(57.0), Vector(58.0)), Vector(Vector(59.0))), s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0)))), s1(s0(Vector(Vector(64.0), Vector(65.0), Vector(66.0)), Vector(Vector(67.0))), s0(Vector(Vector(68.0), Vector(69.0), Vector(70.0)), Vector(Vector(71.0)))))))), Vector(s10(Vector(s3(Vector(s1(s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)), Vector(Vector(75.0))), s0(Vector(Vector(76.0), Vector(77.0), Vector(78.0)), Vector(Vector(79.0)))), s1(s0(Vector(Vector(80.0), Vector(81.0), Vector(82.0)), Vector(Vector(83.0))), s0(Vector(Vector(84.0), Vector(85.0), Vector(86.0)), Vector(Vector(87.0)))), s1(s0(Vector(Vector(88.0), Vector(89.0), Vector(90.0)), Vector(Vector(91.0))), s0(Vector(Vector(92.0), Vector(93.0), Vector(94.0)), Vector(Vector(95.0))))), s0(Vector(Vector(96.0), Vector(97.0), Vector(98.0)), Vector(Vector(99.0))))), s9(s3(Vector(s1(s0(Vector(Vector(100.0), Vector(101.0), Vector(102.0)), Vector(Vector(103.0))), s0(Vector(Vector(104.0), Vector(105.0), Vector(106.0)), Vector(Vector(107.0)))), s1(s0(Vector(Vector(108.0), Vector(109.0), Vector(110.0)), Vector(Vector(111.0))), s0(Vector(Vector(112.0), Vector(113.0), Vector(114.0)), Vector(Vector(115.0)))), s1(s0(Vector(Vector(116.0), Vector(117.0), Vector(118.0)), Vector(Vector(119.0))), s0(Vector(Vector(120.0), Vector(121.0), Vector(122.0)), Vector(Vector(123.0))))), s0(Vector(Vector(124.0), Vector(125.0), Vector(126.0)), Vector(Vector(127.0)))), Vector(s1(s0(Vector(Vector(128.0), Vector(129.0), Vector(130.0)), Vector(Vector(131.0))), s0(Vector(Vector(132.0), Vector(133.0), Vector(134.0)), Vector(Vector(135.0)))), s1(s0(Vector(Vector(136.0), Vector(137.0), Vector(138.0)), Vector(Vector(139.0))), s0(Vector(Vector(140.0), Vector(141.0), Vector(142.0)), Vector(Vector(143.0)))))))))
    val v1: s6 = s6(s3(Vector(s1(s0(Vector(Vector(144.0), Vector(145.0), Vector(146.0)), Vector(Vector(147.0))), s0(Vector(Vector(148.0), Vector(149.0), Vector(150.0)), Vector(Vector(151.0)))), s1(s0(Vector(Vector(152.0), Vector(153.0), Vector(154.0)), Vector(Vector(155.0))), s0(Vector(Vector(156.0), Vector(157.0), Vector(158.0)), Vector(Vector(159.0)))), s1(s0(Vector(Vector(160.0), Vector(161.0), Vector(162.0)), Vector(Vector(163.0))), s0(Vector(Vector(164.0), Vector(165.0), Vector(166.0)), Vector(Vector(167.0))))), s0(Vector(Vector(168.0), Vector(169.0), Vector(170.0)), Vector(Vector(171.0)))), s4(Vector(Vector(s1(s0(Vector(Vector(172.0), Vector(173.0), Vector(174.0)), Vector(Vector(175.0))), s0(Vector(Vector(176.0), Vector(177.0), Vector(178.0)), Vector(Vector(179.0))))), Vector(s1(s0(Vector(Vector(180.0), Vector(181.0), Vector(182.0)), Vector(Vector(183.0))), s0(Vector(Vector(184.0), Vector(185.0), Vector(186.0)), Vector(Vector(187.0)))))), s3(Vector(s1(s0(Vector(Vector(188.0), Vector(189.0), Vector(190.0)), Vector(Vector(191.0))), s0(Vector(Vector(192.0), Vector(193.0), Vector(194.0)), Vector(Vector(195.0)))), s1(s0(Vector(Vector(196.0), Vector(197.0), Vector(198.0)), Vector(Vector(199.0))), s0(Vector(Vector(200.0), Vector(201.0), Vector(202.0)), Vector(Vector(203.0)))), s1(s0(Vector(Vector(204.0), Vector(205.0), Vector(206.0)), Vector(Vector(207.0))), s0(Vector(Vector(208.0), Vector(209.0), Vector(210.0)), Vector(Vector(211.0))))), s0(Vector(Vector(212.0), Vector(213.0), Vector(214.0)), Vector(Vector(215.0))))))
    val v2: s5 = s5(s4(Vector(Vector(s1(s0(Vector(Vector(216.0), Vector(217.0), Vector(218.0)), Vector(Vector(219.0))), s0(Vector(Vector(220.0), Vector(221.0), Vector(222.0)), Vector(Vector(223.0))))), Vector(s1(s0(Vector(Vector(224.0), Vector(225.0), Vector(226.0)), Vector(Vector(227.0))), s0(Vector(Vector(228.0), Vector(229.0), Vector(230.0)), Vector(Vector(231.0)))))), s3(Vector(s1(s0(Vector(Vector(232.0), Vector(233.0), Vector(234.0)), Vector(Vector(235.0))), s0(Vector(Vector(236.0), Vector(237.0), Vector(238.0)), Vector(Vector(239.0)))), s1(s0(Vector(Vector(240.0), Vector(241.0), Vector(242.0)), Vector(Vector(243.0))), s0(Vector(Vector(244.0), Vector(245.0), Vector(246.0)), Vector(Vector(247.0)))), s1(s0(Vector(Vector(248.0), Vector(249.0), Vector(250.0)), Vector(Vector(251.0))), s0(Vector(Vector(252.0), Vector(253.0), Vector(254.0)), Vector(Vector(255.0))))), s0(Vector(Vector(256.0), Vector(257.0), Vector(258.0)), Vector(Vector(259.0))))), s0(Vector(Vector(260.0), Vector(261.0), Vector(262.0)), Vector(Vector(263.0))))
    val v3: Double = 264.0
    val start = nanoTime()
    var result: Double = 264.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}