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
    p0: Vector[s0],
    p1: s1,
    p2: s0,
    p3: s1
  )
  case class s3 (
    p0: Vector[Vector[s1]],
    p1: s2
  )
  case class s5 (
    p0: s1,
    p1: s1
  )
  case class s6 (
    p0: s0,
    p1: s5
  )
  case class s10 (
    p0: s3,
    p1: s5
  )
  def f62(v0: s5): s5 = {
    val v3: s1 = v0.p1
    var v6: s1 = v3
    val v5: s0 = v6.p1
    v6 = v6.copy(p0 = v5)
    val v2: s1 = v0.p0
    var v4: s5 = v0
    val v12: s1 = v4.p1
    val v7: s1 = v0.p0
    val v1: s0 = v12.p1
    val v8: Vector[Vector[Double]] = v1.p1
    val v11: s0 = v2.p1
    val v10: s0 = v12.p1
    var v19: s1 = v7
    v19 = v19.copy(p1 = v1)
    v6 = v6.copy(p1 = v5)
    v6 = v6.copy(p1 = v5)
    val v16: s0 = v2.p0
    val v55: s1 = v4.p1
    val v38: s0 = v12.p0
    val v103: s1 = v0.p1
    v4 = v4.copy(p0 = v19)
    var v47: s0 = v38
    val v81: Vector[Vector[Double]] = v38.p0
    v6 = v6.copy(p1 = v11)
    v47 = v47.copy(p0 = v81)
    v19 = v19.copy(p0 = v5)
    var v112: s0 = v47
    val v82: s1 = s1(v10, v112)
    val v254: s0 = v55.p0
    v19 = v19.copy(p1 = v254)
    v6 = v6.copy(p0 = v16)
    v112 = v112.copy(p1 = v8)
    var v182: s1 = v103
    v19 = v19.copy(p0 = v5)
    val v137: s5 = s5(v82, v182)
    v137
  }
  def f57(v0: s5): s5 = {
    var v7: s5 = v0
    val v4: s1 = v0.p0
    var v5: s5 = v7
    v7 = v0
    val v9: s1 = v7.p1
    v7 = v7.copy(p0 = v9)
    v7 = v7.copy(p1 = v4)
    v5
  }
  def f52(v0: s6): s6 = {
    var v1: s6 = v0
    val v6: Vector[s6] = Vector(v1, v1, v1, v1, v0, v1, v1)
    val v3: s0 = v1.p0
    var v8: Vector[s6] = v6
    v8 = v8.updated(3, v0)
    var v2: s6 = v0
    val v7: s0 = v1.p0
    var v15: s6 = v0
    v1 = v1.copy(p0 = v3)
    val v12: s1 = s1(v3, v7)
    v2 = v2.copy(p0 = v3)
    val v16: s0 = v12.p0
    val v22: s1 = s1(v7, v3)
    v15 = v0
    var v29: Vector[s6] = v8
    v2 = v2.copy(p0 = v7)
    val v31: s0 = v22.p1
    v1 = v1.copy(p0 = v3)
    v8 = v8.updated(2, v2)
    var v25: Vector[s6] = v8
    val v49: s5 = v1.p1
    val v75: s5 = f57(v49)
    val v57: s6 = v25(6)
    val v54: s5 = f57(v75)
    var v56: s6 = v1
    val v23: Vector[s6] = Vector(v57, v15, v2, v56)
    v25 = v29
    val v59: s5 = f62(v54)
    val v36: s5 = f62(v59)
    val v58: s5 = f57(v54)
    v8 = v29
    val v68: s5 = f57(v49)
    var v103: Vector[s6] = v29
    val v55: s5 = v1.p1
    v1 = v1.copy(p0 = v7)
    val v92: s5 = f57(v68)
    val v82: s5 = f57(v92)
    val v63: s6 = v23(0)
    v29 = v29.updated(3, v63)
    v2 = v2.copy(p0 = v3)
    v56 = v56.copy(p0 = v31)
    v103 = v103.updated(4, v56)
    val v128: s6 = v103(1)
    v29 = v103
    v56 = v56.copy(p1 = v82)
    v103 = v103.updated(3, v57)
    v56 = v56.copy(p0 = v3)
    v29 = v29.updated(2, v63)
    v29 = v29.updated(5, v1)
    v25 = v25.updated(3, v56)
    v8 = v8.updated(2, v1)
    v1 = v1.copy(p0 = v16)
    v56 = v56.copy(p1 = v36)
    v29 = v29.updated(0, v128)
    var v162: s6 = v128
    v1 = v1.copy(p1 = v55)
    v2 = v2.copy(p1 = v58)
    v162
  }
  @noinline
  def f0(v0: s6, v1: s10, v2: s10, v3: Vector[s3], v4: Double): Double = {
    val v7: s6 = f52(v0)
    val v8: s5 = v7.p1
    val v13: s1 = v8.p1
    val v41: s0 = v13.p0
    val v32: Vector[Vector[Double]] = v41.p0
    val v29: Vector[Double] = v32(1)
    val v127: Double = v29(0)
    v127
  }
  def benchmark(): Unit = {
    val v0: s6 = s6(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0))), s5(s1(s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0))), s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0)))), s1(s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0))), s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0), Vector(24.0))))))
    val v1: s10 = s10(s3(Vector(Vector(s1(s0(Vector(Vector(25.0), Vector(26.0), Vector(27.0)), Vector(Vector(28.0), Vector(29.0))), s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0)))))), s2(Vector(s0(Vector(Vector(35.0), Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0)))), s1(s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0), Vector(44.0))), s0(Vector(Vector(45.0), Vector(46.0), Vector(47.0)), Vector(Vector(48.0), Vector(49.0)))), s0(Vector(Vector(50.0), Vector(51.0), Vector(52.0)), Vector(Vector(53.0), Vector(54.0))), s1(s0(Vector(Vector(55.0), Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0))), s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0), Vector(64.0)))))), s5(s1(s0(Vector(Vector(65.0), Vector(66.0), Vector(67.0)), Vector(Vector(68.0), Vector(69.0))), s0(Vector(Vector(70.0), Vector(71.0), Vector(72.0)), Vector(Vector(73.0), Vector(74.0)))), s1(s0(Vector(Vector(75.0), Vector(76.0), Vector(77.0)), Vector(Vector(78.0), Vector(79.0))), s0(Vector(Vector(80.0), Vector(81.0), Vector(82.0)), Vector(Vector(83.0), Vector(84.0))))))
    val v2: s10 = s10(s3(Vector(Vector(s1(s0(Vector(Vector(85.0), Vector(86.0), Vector(87.0)), Vector(Vector(88.0), Vector(89.0))), s0(Vector(Vector(90.0), Vector(91.0), Vector(92.0)), Vector(Vector(93.0), Vector(94.0)))))), s2(Vector(s0(Vector(Vector(95.0), Vector(96.0), Vector(97.0)), Vector(Vector(98.0), Vector(99.0)))), s1(s0(Vector(Vector(100.0), Vector(101.0), Vector(102.0)), Vector(Vector(103.0), Vector(104.0))), s0(Vector(Vector(105.0), Vector(106.0), Vector(107.0)), Vector(Vector(108.0), Vector(109.0)))), s0(Vector(Vector(110.0), Vector(111.0), Vector(112.0)), Vector(Vector(113.0), Vector(114.0))), s1(s0(Vector(Vector(115.0), Vector(116.0), Vector(117.0)), Vector(Vector(118.0), Vector(119.0))), s0(Vector(Vector(120.0), Vector(121.0), Vector(122.0)), Vector(Vector(123.0), Vector(124.0)))))), s5(s1(s0(Vector(Vector(125.0), Vector(126.0), Vector(127.0)), Vector(Vector(128.0), Vector(129.0))), s0(Vector(Vector(130.0), Vector(131.0), Vector(132.0)), Vector(Vector(133.0), Vector(134.0)))), s1(s0(Vector(Vector(135.0), Vector(136.0), Vector(137.0)), Vector(Vector(138.0), Vector(139.0))), s0(Vector(Vector(140.0), Vector(141.0), Vector(142.0)), Vector(Vector(143.0), Vector(144.0))))))
    val v3: Vector[s3] = Vector(s3(Vector(Vector(s1(s0(Vector(Vector(145.0), Vector(146.0), Vector(147.0)), Vector(Vector(148.0), Vector(149.0))), s0(Vector(Vector(150.0), Vector(151.0), Vector(152.0)), Vector(Vector(153.0), Vector(154.0)))))), s2(Vector(s0(Vector(Vector(155.0), Vector(156.0), Vector(157.0)), Vector(Vector(158.0), Vector(159.0)))), s1(s0(Vector(Vector(160.0), Vector(161.0), Vector(162.0)), Vector(Vector(163.0), Vector(164.0))), s0(Vector(Vector(165.0), Vector(166.0), Vector(167.0)), Vector(Vector(168.0), Vector(169.0)))), s0(Vector(Vector(170.0), Vector(171.0), Vector(172.0)), Vector(Vector(173.0), Vector(174.0))), s1(s0(Vector(Vector(175.0), Vector(176.0), Vector(177.0)), Vector(Vector(178.0), Vector(179.0))), s0(Vector(Vector(180.0), Vector(181.0), Vector(182.0)), Vector(Vector(183.0), Vector(184.0)))))), s3(Vector(Vector(s1(s0(Vector(Vector(185.0), Vector(186.0), Vector(187.0)), Vector(Vector(188.0), Vector(189.0))), s0(Vector(Vector(190.0), Vector(191.0), Vector(192.0)), Vector(Vector(193.0), Vector(194.0)))))), s2(Vector(s0(Vector(Vector(195.0), Vector(196.0), Vector(197.0)), Vector(Vector(198.0), Vector(199.0)))), s1(s0(Vector(Vector(200.0), Vector(201.0), Vector(202.0)), Vector(Vector(203.0), Vector(204.0))), s0(Vector(Vector(205.0), Vector(206.0), Vector(207.0)), Vector(Vector(208.0), Vector(209.0)))), s0(Vector(Vector(210.0), Vector(211.0), Vector(212.0)), Vector(Vector(213.0), Vector(214.0))), s1(s0(Vector(Vector(215.0), Vector(216.0), Vector(217.0)), Vector(Vector(218.0), Vector(219.0))), s0(Vector(Vector(220.0), Vector(221.0), Vector(222.0)), Vector(Vector(223.0), Vector(224.0)))))))
    val v4: Double = 225.0
    val start = nanoTime()
    var result: Double = 225.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}