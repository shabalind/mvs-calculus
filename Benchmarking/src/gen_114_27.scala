import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]],
    p3: Vector[Vector[Double]],
    p4: Vector[Vector[Double]],
    p5: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  case class s2 (
    p0: Double,
    p1: s1,
    p2: s1,
    p3: s0
  )
  case class s3 (
    p0: s2,
    p1: s2
  )
  case class s5 (
    p0: Vector[Vector[s0]],
    p1: Vector[s0]
  )
  def f120(v0: Double): Double = {
    var v3: Double = v0
    var v7: Double = v3
    var v4: Double = v7
    v4 = v3
    var v1: Double = v0
    var v6: Double = v0
    var v9: Double = v3
    var v24: Double = v3
    var v8: Double = v24
    var v12: Double = v8
    var v11: Double = v3
    val v25: Vector[Double] = Vector(v24, v11, v1)
    var v18: Double = v9
    var v29: Vector[Double] = v25
    var v48: Vector[Double] = v25
    val v14: Double = v48(0)
    v48 = v48.updated(1, v18)
    val v43: Double = v24 / v14
    v9 = v0
    var v22: Double = v0
    val v37: Vector[Double] = Vector(v22, v24, v6, v24, v43)
    v29 = v29.updated(0, v9)
    val v16: Double = v29(2)
    var v39: Double = v16
    v29 = v29.updated(0, v3)
    val v33: Double = v37(0)
    var v53: Vector[Double] = v37
    var v70: Vector[Double] = v53
    var v41: Vector[Double] = v53
    val v57: Double = v37(4)
    var v42: Double = v4
    v41 = v41.updated(3, v39)
    var v67: Double = v1
    var v77: Vector[Double] = v37
    val v49: Vector[Vector[Double]] = Vector(v70, v70, v77, v41)
    v53 = v53.updated(2, v12)
    var v55: Vector[Vector[Double]] = v49
    v53 = v53.updated(3, v42)
    var v79: Vector[Vector[Double]] = v55
    var v92: Vector[Vector[Double]] = v79
    v53 = v53.updated(0, v42)
    val v102: Vector[Double] = v92(3)
    v41 = v41.updated(2, v67)
    var v58: Vector[Double] = v102
    val v130: Double = v58(3)
    v7 = v57
    val v256: Double = v33 + v130
    v256
  }
  @noinline
  def f0(v0: Vector[Vector[s0]], v1: Vector[s3], v2: Vector[Vector[s0]], v3: s5, v4: Double): Double = {
    val v6: Double = f120(v4)
    var v11: Double = v6
    val v16: Double = f120(v6)
    val v24: Double = f120(v11)
    val v43: Double = v6 / v11
    v11 = v4
    v11 = v43
    val v70: Double = v24 * v16
    v70
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0)), Vector(Vector(11.0), Vector(12.0)))), Vector(s0(Vector(Vector(13.0), Vector(14.0), Vector(15.0)), Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0)), Vector(Vector(24.0), Vector(25.0)))))
    val v1: Vector[s3] = Vector(s3(s2(26.0, s1(Vector(s0(Vector(Vector(27.0), Vector(28.0), Vector(29.0)), Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0)), Vector(Vector(35.0), Vector(36.0)), Vector(Vector(37.0)), Vector(Vector(38.0), Vector(39.0)))), s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0), Vector(44.0), Vector(45.0)), Vector(Vector(46.0), Vector(47.0)), Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0)), Vector(Vector(51.0), Vector(52.0)))), s1(Vector(s0(Vector(Vector(53.0), Vector(54.0), Vector(55.0)), Vector(Vector(56.0), Vector(57.0), Vector(58.0)), Vector(Vector(59.0), Vector(60.0)), Vector(Vector(61.0), Vector(62.0)), Vector(Vector(63.0)), Vector(Vector(64.0), Vector(65.0)))), s0(Vector(Vector(66.0), Vector(67.0), Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0)), Vector(Vector(72.0), Vector(73.0)), Vector(Vector(74.0), Vector(75.0)), Vector(Vector(76.0)), Vector(Vector(77.0), Vector(78.0)))), s0(Vector(Vector(79.0), Vector(80.0), Vector(81.0)), Vector(Vector(82.0), Vector(83.0), Vector(84.0)), Vector(Vector(85.0), Vector(86.0)), Vector(Vector(87.0), Vector(88.0)), Vector(Vector(89.0)), Vector(Vector(90.0), Vector(91.0)))), s2(92.0, s1(Vector(s0(Vector(Vector(93.0), Vector(94.0), Vector(95.0)), Vector(Vector(96.0), Vector(97.0), Vector(98.0)), Vector(Vector(99.0), Vector(100.0)), Vector(Vector(101.0), Vector(102.0)), Vector(Vector(103.0)), Vector(Vector(104.0), Vector(105.0)))), s0(Vector(Vector(106.0), Vector(107.0), Vector(108.0)), Vector(Vector(109.0), Vector(110.0), Vector(111.0)), Vector(Vector(112.0), Vector(113.0)), Vector(Vector(114.0), Vector(115.0)), Vector(Vector(116.0)), Vector(Vector(117.0), Vector(118.0)))), s1(Vector(s0(Vector(Vector(119.0), Vector(120.0), Vector(121.0)), Vector(Vector(122.0), Vector(123.0), Vector(124.0)), Vector(Vector(125.0), Vector(126.0)), Vector(Vector(127.0), Vector(128.0)), Vector(Vector(129.0)), Vector(Vector(130.0), Vector(131.0)))), s0(Vector(Vector(132.0), Vector(133.0), Vector(134.0)), Vector(Vector(135.0), Vector(136.0), Vector(137.0)), Vector(Vector(138.0), Vector(139.0)), Vector(Vector(140.0), Vector(141.0)), Vector(Vector(142.0)), Vector(Vector(143.0), Vector(144.0)))), s0(Vector(Vector(145.0), Vector(146.0), Vector(147.0)), Vector(Vector(148.0), Vector(149.0), Vector(150.0)), Vector(Vector(151.0), Vector(152.0)), Vector(Vector(153.0), Vector(154.0)), Vector(Vector(155.0)), Vector(Vector(156.0), Vector(157.0))))))
    val v2: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(158.0), Vector(159.0), Vector(160.0)), Vector(Vector(161.0), Vector(162.0), Vector(163.0)), Vector(Vector(164.0), Vector(165.0)), Vector(Vector(166.0), Vector(167.0)), Vector(Vector(168.0)), Vector(Vector(169.0), Vector(170.0)))), Vector(s0(Vector(Vector(171.0), Vector(172.0), Vector(173.0)), Vector(Vector(174.0), Vector(175.0), Vector(176.0)), Vector(Vector(177.0), Vector(178.0)), Vector(Vector(179.0), Vector(180.0)), Vector(Vector(181.0)), Vector(Vector(182.0), Vector(183.0)))), Vector(s0(Vector(Vector(184.0), Vector(185.0), Vector(186.0)), Vector(Vector(187.0), Vector(188.0), Vector(189.0)), Vector(Vector(190.0), Vector(191.0)), Vector(Vector(192.0), Vector(193.0)), Vector(Vector(194.0)), Vector(Vector(195.0), Vector(196.0)))))
    val v3: s5 = s5(Vector(Vector(s0(Vector(Vector(197.0), Vector(198.0), Vector(199.0)), Vector(Vector(200.0), Vector(201.0), Vector(202.0)), Vector(Vector(203.0), Vector(204.0)), Vector(Vector(205.0), Vector(206.0)), Vector(Vector(207.0)), Vector(Vector(208.0), Vector(209.0))))), Vector(s0(Vector(Vector(210.0), Vector(211.0), Vector(212.0)), Vector(Vector(213.0), Vector(214.0), Vector(215.0)), Vector(Vector(216.0), Vector(217.0)), Vector(Vector(218.0), Vector(219.0)), Vector(Vector(220.0)), Vector(Vector(221.0), Vector(222.0))), s0(Vector(Vector(223.0), Vector(224.0), Vector(225.0)), Vector(Vector(226.0), Vector(227.0), Vector(228.0)), Vector(Vector(229.0), Vector(230.0)), Vector(Vector(231.0), Vector(232.0)), Vector(Vector(233.0)), Vector(Vector(234.0), Vector(235.0))), s0(Vector(Vector(236.0), Vector(237.0), Vector(238.0)), Vector(Vector(239.0), Vector(240.0), Vector(241.0)), Vector(Vector(242.0), Vector(243.0)), Vector(Vector(244.0), Vector(245.0)), Vector(Vector(246.0)), Vector(Vector(247.0), Vector(248.0)))))
    val v4: Double = 249.0
    val start = nanoTime()
    var result: Double = 249.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}