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
    p0: s1,
    p1: s2
  )
  case class s4 (
    p0: s0,
    p1: s0,
    p2: s0
  )
  case class s5 (
    p0: s2,
    p1: Vector[s2]
  )
  case class s6 (
    p0: s0,
    p1: s4
  )
  case class s7 (
    p0: s1,
    p1: Vector[s0],
    p2: Vector[s5]
  )
  case class s8 (
    p0: s7,
    p1: s3
  )
  def f122(v0: Vector[Double]): Vector[Double] = {
    var v7: Vector[Double] = v0
    var v2: Vector[Double] = v0
    var v5: Vector[Double] = v2
    var v8: Vector[Double] = v5
    val v6: Double = v2(0)
    val v3: Double = v0(1)
    var v13: Vector[Double] = v8
    val v1: Double = v0(1)
    var v9: Double = v1
    val v11: Double = v13(1)
    val v12: Double = v2(0)
    v13 = v13.updated(0, v12)
    var v34: Vector[Double] = v7
    var v18: Vector[Double] = v0
    var v21: Vector[Double] = v18
    val v10: Double = v13(0)
    var v17: Vector[Double] = v34
    v18 = v18.updated(0, v3)
    var v19: Double = v9
    v2 = v21
    val v25: Double = v8(1)
    var v33: Double = v25
    v8 = v8.updated(0, v6)
    val v30: Double = v21(0)
    v21 = v21.updated(0, v30)
    var v53: Vector[Double] = v21
    v2 = v53
    v34 = v34.updated(1, v19)
    v13 = v13.updated(0, v11)
    var v55: Double = v33
    var v80: Vector[Double] = v18
    val v27: Double = v11 + v6
    v7 = v7.updated(0, v55)
    v53 = v53.updated(1, v27)
    v21 = v21.updated(0, v12)
    var v82: Vector[Double] = v80
    val v62: Vector[Vector[Double]] = Vector(v18, v7, v21, v18, v17, v80)
    v34 = v34.updated(1, v10)
    v80 = v80.updated(0, v12)
    v18 = v18.updated(0, v33)
    var v87: Vector[Vector[Double]] = v62
    val v124: Double = v8(0)
    val v79: Vector[Double] = v87(0)
    v8 = v82
    v13 = v13.updated(1, v10)
    v18 = v13
    v53 = v53.updated(0, v25)
    v18 = v18.updated(0, v124)
    v13 = v13.updated(0, v6)
    v21 = v21.updated(1, v27)
    v79
  }
  @noinline
  def f0(v0: Vector[s7], v1: Vector[s8], v2: Vector[s6], v3: Vector[s1], v4: Double): Double = {
    val v6: Vector[Double] = Vector(v4, v4)
    val v7: Vector[Double] = f122(v6)
    val v5: Vector[Double] = f122(v7)
    val v61: Double = v5(0)
    v61
  }
  def benchmark(): Unit = {
    val v0: Vector[s7] = Vector(s7(s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0))), s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0)))), Vector(s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0)))), Vector(s5(s2(s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0))), s1(s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0), Vector(24.0))), s0(Vector(Vector(25.0), Vector(26.0), Vector(27.0)), Vector(Vector(28.0), Vector(29.0))))), Vector(s2(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0))), s1(s0(Vector(Vector(35.0), Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0))), s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0), Vector(44.0))))))))), s7(s1(s0(Vector(Vector(45.0), Vector(46.0), Vector(47.0)), Vector(Vector(48.0), Vector(49.0))), s0(Vector(Vector(50.0), Vector(51.0), Vector(52.0)), Vector(Vector(53.0), Vector(54.0)))), Vector(s0(Vector(Vector(55.0), Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0)))), Vector(s5(s2(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0), Vector(64.0))), s1(s0(Vector(Vector(65.0), Vector(66.0), Vector(67.0)), Vector(Vector(68.0), Vector(69.0))), s0(Vector(Vector(70.0), Vector(71.0), Vector(72.0)), Vector(Vector(73.0), Vector(74.0))))), Vector(s2(s0(Vector(Vector(75.0), Vector(76.0), Vector(77.0)), Vector(Vector(78.0), Vector(79.0))), s1(s0(Vector(Vector(80.0), Vector(81.0), Vector(82.0)), Vector(Vector(83.0), Vector(84.0))), s0(Vector(Vector(85.0), Vector(86.0), Vector(87.0)), Vector(Vector(88.0), Vector(89.0))))))))))
    val v1: Vector[s8] = Vector(s8(s7(s1(s0(Vector(Vector(90.0), Vector(91.0), Vector(92.0)), Vector(Vector(93.0), Vector(94.0))), s0(Vector(Vector(95.0), Vector(96.0), Vector(97.0)), Vector(Vector(98.0), Vector(99.0)))), Vector(s0(Vector(Vector(100.0), Vector(101.0), Vector(102.0)), Vector(Vector(103.0), Vector(104.0)))), Vector(s5(s2(s0(Vector(Vector(105.0), Vector(106.0), Vector(107.0)), Vector(Vector(108.0), Vector(109.0))), s1(s0(Vector(Vector(110.0), Vector(111.0), Vector(112.0)), Vector(Vector(113.0), Vector(114.0))), s0(Vector(Vector(115.0), Vector(116.0), Vector(117.0)), Vector(Vector(118.0), Vector(119.0))))), Vector(s2(s0(Vector(Vector(120.0), Vector(121.0), Vector(122.0)), Vector(Vector(123.0), Vector(124.0))), s1(s0(Vector(Vector(125.0), Vector(126.0), Vector(127.0)), Vector(Vector(128.0), Vector(129.0))), s0(Vector(Vector(130.0), Vector(131.0), Vector(132.0)), Vector(Vector(133.0), Vector(134.0))))))))), s3(s1(s0(Vector(Vector(135.0), Vector(136.0), Vector(137.0)), Vector(Vector(138.0), Vector(139.0))), s0(Vector(Vector(140.0), Vector(141.0), Vector(142.0)), Vector(Vector(143.0), Vector(144.0)))), s2(s0(Vector(Vector(145.0), Vector(146.0), Vector(147.0)), Vector(Vector(148.0), Vector(149.0))), s1(s0(Vector(Vector(150.0), Vector(151.0), Vector(152.0)), Vector(Vector(153.0), Vector(154.0))), s0(Vector(Vector(155.0), Vector(156.0), Vector(157.0)), Vector(Vector(158.0), Vector(159.0))))))))
    val v2: Vector[s6] = Vector(s6(s0(Vector(Vector(160.0), Vector(161.0), Vector(162.0)), Vector(Vector(163.0), Vector(164.0))), s4(s0(Vector(Vector(165.0), Vector(166.0), Vector(167.0)), Vector(Vector(168.0), Vector(169.0))), s0(Vector(Vector(170.0), Vector(171.0), Vector(172.0)), Vector(Vector(173.0), Vector(174.0))), s0(Vector(Vector(175.0), Vector(176.0), Vector(177.0)), Vector(Vector(178.0), Vector(179.0))))), s6(s0(Vector(Vector(180.0), Vector(181.0), Vector(182.0)), Vector(Vector(183.0), Vector(184.0))), s4(s0(Vector(Vector(185.0), Vector(186.0), Vector(187.0)), Vector(Vector(188.0), Vector(189.0))), s0(Vector(Vector(190.0), Vector(191.0), Vector(192.0)), Vector(Vector(193.0), Vector(194.0))), s0(Vector(Vector(195.0), Vector(196.0), Vector(197.0)), Vector(Vector(198.0), Vector(199.0))))), s6(s0(Vector(Vector(200.0), Vector(201.0), Vector(202.0)), Vector(Vector(203.0), Vector(204.0))), s4(s0(Vector(Vector(205.0), Vector(206.0), Vector(207.0)), Vector(Vector(208.0), Vector(209.0))), s0(Vector(Vector(210.0), Vector(211.0), Vector(212.0)), Vector(Vector(213.0), Vector(214.0))), s0(Vector(Vector(215.0), Vector(216.0), Vector(217.0)), Vector(Vector(218.0), Vector(219.0))))))
    val v3: Vector[s1] = Vector(s1(s0(Vector(Vector(220.0), Vector(221.0), Vector(222.0)), Vector(Vector(223.0), Vector(224.0))), s0(Vector(Vector(225.0), Vector(226.0), Vector(227.0)), Vector(Vector(228.0), Vector(229.0)))), s1(s0(Vector(Vector(230.0), Vector(231.0), Vector(232.0)), Vector(Vector(233.0), Vector(234.0))), s0(Vector(Vector(235.0), Vector(236.0), Vector(237.0)), Vector(Vector(238.0), Vector(239.0)))), s1(s0(Vector(Vector(240.0), Vector(241.0), Vector(242.0)), Vector(Vector(243.0), Vector(244.0))), s0(Vector(Vector(245.0), Vector(246.0), Vector(247.0)), Vector(Vector(248.0), Vector(249.0)))))
    val v4: Double = 250.0
    val start = nanoTime()
    var result: Double = 250.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}