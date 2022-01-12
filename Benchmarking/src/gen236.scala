import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s6 (
    p0: Vector[s1],
    p1: Vector[s1]
  )
  def f46(v0: s6, v1: s6): s6 = {
    var v17: s6 = v1
    v17 = v0
    v17
  }
  def f31(v0: s6, v1: s6): s6 = {
    val v7: s6 = f46(v0, v1)
    var v9: s6 = v0
    val v2: Vector[s1] = v0.p1
    v9 = v9.copy(p1 = v2)
    val v6: Vector[s1] = v9.p0
    var v4: Vector[s1] = v6
    val v3: s6 = s6(v6, v2)
    val v14: Vector[s1] = v0.p0
    v9 = v9.copy(p1 = v2)
    val v19: s6 = f46(v9, v7)
    v9 = v9.copy(p1 = v2)
    var v24: Vector[s1] = v14
    v9 = v9.copy(p0 = v4)
    val v30: s6 = f46(v0, v9)
    val v11: s1 = v24(0)
    var v13: s6 = v19
    v24 = v24.updated(0, v11)
    val v20: s6 = f46(v19, v30)
    v9 = v13
    v4 = v4.updated(1, v11)
    v13 = v13.copy(p0 = v14)
    v13 = v13.copy(p0 = v14)
    v24 = v24.updated(0, v11)
    var v73: Vector[s1] = v14
    v73 = v73.updated(0, v11)
    v13 = v13.copy(p0 = v14)
    val v72: s6 = f46(v3, v30)
    v9 = v9.copy(p0 = v73)
    v13 = v13.copy(p0 = v14)
    val v87: s6 = f46(v20, v72)
    v9 = v9.copy(p0 = v73)
    v87
  }
  def f12(v0: Vector[s6]): Vector[s6] = {
    val v7: s6 = v0(2)
    val v6: Vector[s1] = v7.p1
    val v5: s6 = v0(0)
    var v2: Vector[s6] = v0
    var v3: s6 = v7
    var v4: Vector[s6] = v2
    val v10: Vector[Vector[s1]] = Vector(v6, v6, v6, v6)
    val v15: s6 = f46(v5, v5)
    val v9: Vector[s1] = v7.p0
    val v11: s6 = f46(v7, v5)
    val v1: s6 = f46(v5, v3)
    val v20: Vector[s1] = v10(3)
    var v12: s6 = v11
    val v23: s6 = f31(v15, v15)
    val v8: s6 = f31(v1, v1)
    val v29: s6 = f31(v7, v23)
    v12 = v12.copy(p0 = v9)
    v3 = v3.copy(p1 = v20)
    val v51: Vector[s1] = v12.p1
    var v19: Vector[s6] = v4
    val v78: s6 = f46(v29, v8)
    v3 = v3.copy(p1 = v51)
    val v33: Vector[s1] = v12.p0
    v12 = v12.copy(p1 = v6)
    v19 = v19.updated(2, v3)
    val v59: Vector[s1] = v10(1)
    v12 = v12.copy(p0 = v33)
    v12 = v12.copy(p1 = v20)
    val v148: s6 = f31(v5, v12)
    v3 = v3.copy(p1 = v59)
    v4 = v4.updated(2, v78)
    v12 = v12.copy(p1 = v51)
    v4 = v4.updated(0, v148)
    v19
  }
  @noinline
  def f0(v0: Vector[s6], v1: Double): Double = {
    var v7: Vector[s6] = v0
    val v8: s6 = v7(0)
    val v14: Vector[s1] = v8.p1
    val v18: s1 = v14(1)
    val v16: Vector[s0] = v18.p1
    val v30: s0 = v16(1)
    val v23: Vector[Vector[Double]] = v30.p1
    val v24: Vector[Double] = v23(2)
    val v52: Vector[s6] = f12(v0)
    var v112: Vector[s6] = v52
    v7 = v112
    val v171: Double = v24(0)
    v171
  }
  def benchmark(): Unit = {
    val v0: Vector[s6] = Vector(s6(Vector(s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))), Vector(s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0))), s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0))))), s1(s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0))), Vector(s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))), s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0))), s0(Vector(Vector(28.0)), Vector(Vector(29.0), Vector(30.0), Vector(31.0)))))), Vector(s1(s0(Vector(Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0))), Vector(s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0))), s0(Vector(Vector(40.0)), Vector(Vector(41.0), Vector(42.0), Vector(43.0))), s0(Vector(Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0))))), s1(s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0), Vector(51.0))), Vector(s0(Vector(Vector(52.0)), Vector(Vector(53.0), Vector(54.0), Vector(55.0))), s0(Vector(Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0))), s0(Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0), Vector(63.0))))), s1(s0(Vector(Vector(64.0)), Vector(Vector(65.0), Vector(66.0), Vector(67.0))), Vector(s0(Vector(Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0))), s0(Vector(Vector(72.0)), Vector(Vector(73.0), Vector(74.0), Vector(75.0))), s0(Vector(Vector(76.0)), Vector(Vector(77.0), Vector(78.0), Vector(79.0))))))), s6(Vector(s1(s0(Vector(Vector(80.0)), Vector(Vector(81.0), Vector(82.0), Vector(83.0))), Vector(s0(Vector(Vector(84.0)), Vector(Vector(85.0), Vector(86.0), Vector(87.0))), s0(Vector(Vector(88.0)), Vector(Vector(89.0), Vector(90.0), Vector(91.0))), s0(Vector(Vector(92.0)), Vector(Vector(93.0), Vector(94.0), Vector(95.0))))), s1(s0(Vector(Vector(96.0)), Vector(Vector(97.0), Vector(98.0), Vector(99.0))), Vector(s0(Vector(Vector(100.0)), Vector(Vector(101.0), Vector(102.0), Vector(103.0))), s0(Vector(Vector(104.0)), Vector(Vector(105.0), Vector(106.0), Vector(107.0))), s0(Vector(Vector(108.0)), Vector(Vector(109.0), Vector(110.0), Vector(111.0)))))), Vector(s1(s0(Vector(Vector(112.0)), Vector(Vector(113.0), Vector(114.0), Vector(115.0))), Vector(s0(Vector(Vector(116.0)), Vector(Vector(117.0), Vector(118.0), Vector(119.0))), s0(Vector(Vector(120.0)), Vector(Vector(121.0), Vector(122.0), Vector(123.0))), s0(Vector(Vector(124.0)), Vector(Vector(125.0), Vector(126.0), Vector(127.0))))), s1(s0(Vector(Vector(128.0)), Vector(Vector(129.0), Vector(130.0), Vector(131.0))), Vector(s0(Vector(Vector(132.0)), Vector(Vector(133.0), Vector(134.0), Vector(135.0))), s0(Vector(Vector(136.0)), Vector(Vector(137.0), Vector(138.0), Vector(139.0))), s0(Vector(Vector(140.0)), Vector(Vector(141.0), Vector(142.0), Vector(143.0))))), s1(s0(Vector(Vector(144.0)), Vector(Vector(145.0), Vector(146.0), Vector(147.0))), Vector(s0(Vector(Vector(148.0)), Vector(Vector(149.0), Vector(150.0), Vector(151.0))), s0(Vector(Vector(152.0)), Vector(Vector(153.0), Vector(154.0), Vector(155.0))), s0(Vector(Vector(156.0)), Vector(Vector(157.0), Vector(158.0), Vector(159.0))))))), s6(Vector(s1(s0(Vector(Vector(160.0)), Vector(Vector(161.0), Vector(162.0), Vector(163.0))), Vector(s0(Vector(Vector(164.0)), Vector(Vector(165.0), Vector(166.0), Vector(167.0))), s0(Vector(Vector(168.0)), Vector(Vector(169.0), Vector(170.0), Vector(171.0))), s0(Vector(Vector(172.0)), Vector(Vector(173.0), Vector(174.0), Vector(175.0))))), s1(s0(Vector(Vector(176.0)), Vector(Vector(177.0), Vector(178.0), Vector(179.0))), Vector(s0(Vector(Vector(180.0)), Vector(Vector(181.0), Vector(182.0), Vector(183.0))), s0(Vector(Vector(184.0)), Vector(Vector(185.0), Vector(186.0), Vector(187.0))), s0(Vector(Vector(188.0)), Vector(Vector(189.0), Vector(190.0), Vector(191.0)))))), Vector(s1(s0(Vector(Vector(192.0)), Vector(Vector(193.0), Vector(194.0), Vector(195.0))), Vector(s0(Vector(Vector(196.0)), Vector(Vector(197.0), Vector(198.0), Vector(199.0))), s0(Vector(Vector(200.0)), Vector(Vector(201.0), Vector(202.0), Vector(203.0))), s0(Vector(Vector(204.0)), Vector(Vector(205.0), Vector(206.0), Vector(207.0))))), s1(s0(Vector(Vector(208.0)), Vector(Vector(209.0), Vector(210.0), Vector(211.0))), Vector(s0(Vector(Vector(212.0)), Vector(Vector(213.0), Vector(214.0), Vector(215.0))), s0(Vector(Vector(216.0)), Vector(Vector(217.0), Vector(218.0), Vector(219.0))), s0(Vector(Vector(220.0)), Vector(Vector(221.0), Vector(222.0), Vector(223.0))))), s1(s0(Vector(Vector(224.0)), Vector(Vector(225.0), Vector(226.0), Vector(227.0))), Vector(s0(Vector(Vector(228.0)), Vector(Vector(229.0), Vector(230.0), Vector(231.0))), s0(Vector(Vector(232.0)), Vector(Vector(233.0), Vector(234.0), Vector(235.0))), s0(Vector(Vector(236.0)), Vector(Vector(237.0), Vector(238.0), Vector(239.0))))))))
    val v1: Double = 240.0
    val start = nanoTime()
    var result: Double = 240.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}