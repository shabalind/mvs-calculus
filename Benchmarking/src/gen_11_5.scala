import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[Vector[s0]]
  )
  case class s2 (
    p0: s1,
    p1: s1
  )
  def f18(v0: s0): s0 = {
    val v1: Vector[Vector[Double]] = v0.p0
    val v6: Vector[Double] = v1(2)
    val v7: Vector[Vector[Double]] = v0.p0
    val v8: Vector[Vector[Double]] = v0.p1
    var v4: s0 = v0
    val v13: Vector[Vector[Double]] = v4.p1
    val v5: Vector[Vector[Double]] = v0.p1
    val v10: Vector[Vector[Double]] = v4.p0
    var v9: Vector[Vector[Double]] = v10
    var v18: Vector[Vector[Double]] = v1
    val v12: Vector[Vector[Double]] = v0.p1
    val v28: Vector[Double] = v8(2)
    val v16: Vector[Vector[Double]] = v4.p1
    val v34: Vector[s0] = Vector(v0, v0, v4)
    val v35: Vector[Vector[Vector[Double]]] = Vector(v1, v16, v9, v16, v13, v5, v7)
    v4 = v4.copy(p0 = v8)
    var v21: Vector[Vector[Vector[Double]]] = v35
    v4 = v4.copy(p1 = v7)
    val v26: Vector[Double] = v5(0)
    v18 = v18.updated(1, v6)
    val v17: s0 = v34(1)
    var v30: Vector[Vector[Double]] = v13
    val v20: Vector[Vector[Double]] = v21(4)
    val v25: Vector[Vector[Double]] = v35(1)
    v4 = v4.copy(p0 = v8)
    val v23: s0 = s0(v9, v12)
    v4 = v4.copy(p0 = v30)
    val v48: Vector[Double] = v7(0)
    v4 = v4.copy(p1 = v25)
    val v39: Vector[Vector[Double]] = v4.p1
    val v29: Vector[Vector[Double]] = v0.p0
    var v32: Vector[Vector[Double]] = v29
    val v94: s0 = s0(v25, v30)
    v9 = v9.updated(0, v26)
    var v54: Vector[Vector[Double]] = v39
    var v114: s0 = v0
    v114 = v114.copy(p1 = v30)
    val v103: Vector[s0] = Vector(v4, v94, v114, v4)
    val v140: Vector[Vector[Double]] = v23.p1
    v21 = v21.updated(1, v140)
    val v91: s0 = v103(3)
    v114 = v114.copy(p1 = v9)
    val v47: Vector[Vector[Double]] = v35(2)
    v30 = v54
    v114 = v114.copy(p1 = v32)
    val v100: Vector[Vector[Double]] = v17.p0
    var v176: Vector[Double] = v28
    v4 = v4.copy(p0 = v20)
    val v76: Vector[Vector[Double]] = v91.p0
    v114 = v114.copy(p1 = v10)
    val v93: s0 = s0(v100, v140)
    v4 = v4.copy(p0 = v47)
    val v195: Vector[Vector[Double]] = v93.p1
    v114 = v114.copy(p1 = v18)
    v4 = v4.copy(p1 = v39)
    v4 = v4.copy(p1 = v195)
    var v188: Vector[s0] = v103
    v18 = v18.updated(1, v176)
    v30 = v30.updated(1, v48)
    v18 = v18.updated(1, v28)
    v114 = v114.copy(p0 = v76)
    val v235: s0 = v188(1)
    v114 = v114.copy(p1 = v1)
    v235
  }
  @noinline
  def f0(v0: Vector[s2], v1: Vector[Vector[s2]], v2: Double): Double = {
    val v3: Vector[s2] = v1(0)
    val v7: s2 = v3(0)
    val v10: s1 = v7.p1
    val v5: Vector[Vector[s0]] = v10.p1
    val v12: Vector[s0] = v5(0)
    val v16: s0 = v12(0)
    val v41: s0 = f18(v16)
    val v96: Vector[Vector[Double]] = v41.p0
    val v71: Vector[Double] = v96(0)
    val v155: Double = v71(0)
    v155
  }
  def benchmark(): Unit = {
    val v0: Vector[s2] = Vector(s2(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0))), s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0)))), Vector(Vector(s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0)))), Vector(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0)))))), s1(Vector(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0))), s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0), Vector(40.0), Vector(41.0))), s0(Vector(Vector(42.0), Vector(43.0), Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0)))), Vector(Vector(s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0), Vector(52.0), Vector(53.0)))), Vector(s0(Vector(Vector(54.0), Vector(55.0), Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0))))))), s2(s1(Vector(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0), Vector(64.0), Vector(65.0))), s0(Vector(Vector(66.0), Vector(67.0), Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0))), s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)), Vector(Vector(75.0), Vector(76.0), Vector(77.0)))), Vector(Vector(s0(Vector(Vector(78.0), Vector(79.0), Vector(80.0)), Vector(Vector(81.0), Vector(82.0), Vector(83.0)))), Vector(s0(Vector(Vector(84.0), Vector(85.0), Vector(86.0)), Vector(Vector(87.0), Vector(88.0), Vector(89.0)))))), s1(Vector(s0(Vector(Vector(90.0), Vector(91.0), Vector(92.0)), Vector(Vector(93.0), Vector(94.0), Vector(95.0))), s0(Vector(Vector(96.0), Vector(97.0), Vector(98.0)), Vector(Vector(99.0), Vector(100.0), Vector(101.0))), s0(Vector(Vector(102.0), Vector(103.0), Vector(104.0)), Vector(Vector(105.0), Vector(106.0), Vector(107.0)))), Vector(Vector(s0(Vector(Vector(108.0), Vector(109.0), Vector(110.0)), Vector(Vector(111.0), Vector(112.0), Vector(113.0)))), Vector(s0(Vector(Vector(114.0), Vector(115.0), Vector(116.0)), Vector(Vector(117.0), Vector(118.0), Vector(119.0))))))), s2(s1(Vector(s0(Vector(Vector(120.0), Vector(121.0), Vector(122.0)), Vector(Vector(123.0), Vector(124.0), Vector(125.0))), s0(Vector(Vector(126.0), Vector(127.0), Vector(128.0)), Vector(Vector(129.0), Vector(130.0), Vector(131.0))), s0(Vector(Vector(132.0), Vector(133.0), Vector(134.0)), Vector(Vector(135.0), Vector(136.0), Vector(137.0)))), Vector(Vector(s0(Vector(Vector(138.0), Vector(139.0), Vector(140.0)), Vector(Vector(141.0), Vector(142.0), Vector(143.0)))), Vector(s0(Vector(Vector(144.0), Vector(145.0), Vector(146.0)), Vector(Vector(147.0), Vector(148.0), Vector(149.0)))))), s1(Vector(s0(Vector(Vector(150.0), Vector(151.0), Vector(152.0)), Vector(Vector(153.0), Vector(154.0), Vector(155.0))), s0(Vector(Vector(156.0), Vector(157.0), Vector(158.0)), Vector(Vector(159.0), Vector(160.0), Vector(161.0))), s0(Vector(Vector(162.0), Vector(163.0), Vector(164.0)), Vector(Vector(165.0), Vector(166.0), Vector(167.0)))), Vector(Vector(s0(Vector(Vector(168.0), Vector(169.0), Vector(170.0)), Vector(Vector(171.0), Vector(172.0), Vector(173.0)))), Vector(s0(Vector(Vector(174.0), Vector(175.0), Vector(176.0)), Vector(Vector(177.0), Vector(178.0), Vector(179.0))))))))
    val v1: Vector[Vector[s2]] = Vector(Vector(s2(s1(Vector(s0(Vector(Vector(180.0), Vector(181.0), Vector(182.0)), Vector(Vector(183.0), Vector(184.0), Vector(185.0))), s0(Vector(Vector(186.0), Vector(187.0), Vector(188.0)), Vector(Vector(189.0), Vector(190.0), Vector(191.0))), s0(Vector(Vector(192.0), Vector(193.0), Vector(194.0)), Vector(Vector(195.0), Vector(196.0), Vector(197.0)))), Vector(Vector(s0(Vector(Vector(198.0), Vector(199.0), Vector(200.0)), Vector(Vector(201.0), Vector(202.0), Vector(203.0)))), Vector(s0(Vector(Vector(204.0), Vector(205.0), Vector(206.0)), Vector(Vector(207.0), Vector(208.0), Vector(209.0)))))), s1(Vector(s0(Vector(Vector(210.0), Vector(211.0), Vector(212.0)), Vector(Vector(213.0), Vector(214.0), Vector(215.0))), s0(Vector(Vector(216.0), Vector(217.0), Vector(218.0)), Vector(Vector(219.0), Vector(220.0), Vector(221.0))), s0(Vector(Vector(222.0), Vector(223.0), Vector(224.0)), Vector(Vector(225.0), Vector(226.0), Vector(227.0)))), Vector(Vector(s0(Vector(Vector(228.0), Vector(229.0), Vector(230.0)), Vector(Vector(231.0), Vector(232.0), Vector(233.0)))), Vector(s0(Vector(Vector(234.0), Vector(235.0), Vector(236.0)), Vector(Vector(237.0), Vector(238.0), Vector(239.0)))))))))
    val v2: Double = 240.0
    val start = nanoTime()
    var result: Double = 240.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}