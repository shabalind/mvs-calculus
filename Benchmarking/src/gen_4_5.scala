import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: s0
  )
  case class s2 (
    p0: Vector[s1],
    p1: Vector[Vector[s1]]
  )
  case class s3 (
    p0: s1,
    p1: Vector[s0]
  )
  case class s4 (
    p0: s0,
    p1: s0
  )
  case class s5 (
    p0: s4,
    p1: Double
  )
  case class s9 (
    p0: Vector[s2],
    p1: s5
  )
  case class s10 (
    p0: Vector[Vector[s4]],
    p1: Vector[s9]
  )
  def f22(v0: s9): s9 = {
    v0
  }
  def f21(v0: s10): s10 = {
    var v1: s10 = v0
    var v3: s10 = v0
    var v8: s10 = v1
    val v4: Vector[Vector[s4]] = v8.p0
    var v6: Vector[Vector[s4]] = v4
    v3 = v3.copy(p0 = v4)
    var v14: s10 = v0
    v14 = v14.copy(p0 = v4)
    v14 = v14.copy(p0 = v6)
    val v17: Vector[Vector[s4]] = v3.p0
    v8 = v8.copy(p0 = v6)
    v3 = v3.copy(p0 = v17)
    v8 = v8.copy(p0 = v17)
    v8 = v8.copy(p0 = v6)
    val v46: Vector[s9] = v1.p1
    v3 = v3.copy(p1 = v46)
    v14 = v14.copy(p1 = v46)
    v14
  }
  def f14(v0: s10): s10 = {
    var v2: s10 = v0
    val v1: s10 = f21(v2)
    val v7: Vector[s9] = v1.p1
    val v5: s9 = v7(0)
    val v9: Vector[s9] = v1.p1
    val v10: Vector[Vector[s4]] = v2.p0
    var v8: s10 = v0
    val v14: s10 = f21(v8)
    v8 = v8.copy(p0 = v10)
    v2 = v2.copy(p1 = v7)
    val v18: Vector[s4] = v10(0)
    val v15: Vector[s4] = v10(0)
    v8 = v8.copy(p1 = v9)
    v2 = v2.copy(p1 = v9)
    v8 = v8.copy(p1 = v7)
    val v35: s4 = v15(0)
    var v26: s4 = v35
    var v39: Vector[s4] = v15
    v8 = v8.copy(p0 = v10)
    val v51: Vector[s4] = v10(0)
    v39 = v39.updated(0, v35)
    v8 = v8.copy(p0 = v10)
    v39 = v39.updated(0, v35)
    val v21: s9 = f22(v5)
    v39 = v39.updated(0, v26)
    val v58: Vector[s4] = v10(0)
    val v57: s0 = v26.p1
    var v30: Vector[Vector[s4]] = v10
    val v69: s0 = v26.p0
    var v78: Vector[Vector[s4]] = v30
    v78 = v78.updated(0, v39)
    v26 = v26.copy(p1 = v69)
    val v59: s5 = v21.p1
    v26 = v26.copy(p0 = v57)
    v39 = v39.updated(0, v35)
    v30 = v30.updated(0, v51)
    val v88: s10 = f21(v14)
    v39 = v39.updated(0, v26)
    v30 = v78
    v8 = v8.copy(p0 = v30)
    val v52: s10 = f21(v88)
    val v102: s4 = v59.p0
    v30 = v30.updated(0, v58)
    v30 = v30.updated(0, v18)
    v39 = v39.updated(0, v102)
    v30 = v30.updated(0, v15)
    v8 = v8.copy(p0 = v10)
    v52
  }
  def f4(v0: Vector[s10], v1: Double): Double = {
    var v4: Double = v1
    v4
  }
  @noinline
  def f0(v0: s3, v1: Vector[Vector[s10]], v2: Double): Double = {
    val v4: Vector[s10] = v1(0)
    val v5: s10 = v4(0)
    val v8: s10 = v4(0)
    val v7: Double = f4(v4, v2)
    val v13: s10 = f21(v5)
    var v18: Vector[s10] = v4
    val v11: s10 = f21(v5)
    val v24: Vector[s10] = v1(0)
    val v22: s10 = f14(v11)
    v18 = v18.updated(0, v13)
    val v15: Vector[Vector[s10]] = Vector(v18, v24, v4, v4, v4)
    val v33: Vector[s10] = v15(4)
    var v19: Vector[Vector[s10]] = v15
    val v14: Vector[s9] = v22.p1
    var v36: Vector[s9] = v14
    var v30: Vector[Vector[s10]] = v19
    var v61: Vector[s10] = v33
    var v73: s10 = v8
    val v83: s10 = f14(v73)
    var v64: Vector[s10] = v61
    val v59: Vector[s10] = v30(3)
    v73 = v73.copy(p1 = v14)
    val v75: s10 = v18(0)
    val v127: s9 = v14(0)
    v64 = v59
    val v111: s10 = f21(v83)
    v73 = v73.copy(p1 = v36)
    v64 = v64.updated(0, v83)
    val v120: Double = f4(v64, v7)
    v36 = v36.updated(0, v127)
    val v150: s10 = f14(v75)
    v61 = v61.updated(0, v111)
    v18 = v18.updated(0, v5)
    v64 = v64.updated(0, v150)
    v120
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(s1(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0))))), s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0)))), Vector(s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0)))))
    val v1: Vector[Vector[s10]] = Vector(Vector(s10(Vector(Vector(s4(s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0))), s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0)))))), Vector(s9(Vector(s2(Vector(s1(Vector(Vector(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0))))), s0(Vector(Vector(28.0), Vector(29.0), Vector(30.0)), Vector(Vector(31.0)))), s1(Vector(Vector(s0(Vector(Vector(32.0), Vector(33.0), Vector(34.0)), Vector(Vector(35.0))))), s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0)))), s1(Vector(Vector(s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0))))), s0(Vector(Vector(44.0), Vector(45.0), Vector(46.0)), Vector(Vector(47.0))))), Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0))))), s0(Vector(Vector(52.0), Vector(53.0), Vector(54.0)), Vector(Vector(55.0))))))), s2(Vector(s1(Vector(Vector(s0(Vector(Vector(56.0), Vector(57.0), Vector(58.0)), Vector(Vector(59.0))))), s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0)))), s1(Vector(Vector(s0(Vector(Vector(64.0), Vector(65.0), Vector(66.0)), Vector(Vector(67.0))))), s0(Vector(Vector(68.0), Vector(69.0), Vector(70.0)), Vector(Vector(71.0)))), s1(Vector(Vector(s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)), Vector(Vector(75.0))))), s0(Vector(Vector(76.0), Vector(77.0), Vector(78.0)), Vector(Vector(79.0))))), Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(80.0), Vector(81.0), Vector(82.0)), Vector(Vector(83.0))))), s0(Vector(Vector(84.0), Vector(85.0), Vector(86.0)), Vector(Vector(87.0))))))), s2(Vector(s1(Vector(Vector(s0(Vector(Vector(88.0), Vector(89.0), Vector(90.0)), Vector(Vector(91.0))))), s0(Vector(Vector(92.0), Vector(93.0), Vector(94.0)), Vector(Vector(95.0)))), s1(Vector(Vector(s0(Vector(Vector(96.0), Vector(97.0), Vector(98.0)), Vector(Vector(99.0))))), s0(Vector(Vector(100.0), Vector(101.0), Vector(102.0)), Vector(Vector(103.0)))), s1(Vector(Vector(s0(Vector(Vector(104.0), Vector(105.0), Vector(106.0)), Vector(Vector(107.0))))), s0(Vector(Vector(108.0), Vector(109.0), Vector(110.0)), Vector(Vector(111.0))))), Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(112.0), Vector(113.0), Vector(114.0)), Vector(Vector(115.0))))), s0(Vector(Vector(116.0), Vector(117.0), Vector(118.0)), Vector(Vector(119.0)))))))), s5(s4(s0(Vector(Vector(120.0), Vector(121.0), Vector(122.0)), Vector(Vector(123.0))), s0(Vector(Vector(124.0), Vector(125.0), Vector(126.0)), Vector(Vector(127.0)))), 128.0))))), Vector(s10(Vector(Vector(s4(s0(Vector(Vector(129.0), Vector(130.0), Vector(131.0)), Vector(Vector(132.0))), s0(Vector(Vector(133.0), Vector(134.0), Vector(135.0)), Vector(Vector(136.0)))))), Vector(s9(Vector(s2(Vector(s1(Vector(Vector(s0(Vector(Vector(137.0), Vector(138.0), Vector(139.0)), Vector(Vector(140.0))))), s0(Vector(Vector(141.0), Vector(142.0), Vector(143.0)), Vector(Vector(144.0)))), s1(Vector(Vector(s0(Vector(Vector(145.0), Vector(146.0), Vector(147.0)), Vector(Vector(148.0))))), s0(Vector(Vector(149.0), Vector(150.0), Vector(151.0)), Vector(Vector(152.0)))), s1(Vector(Vector(s0(Vector(Vector(153.0), Vector(154.0), Vector(155.0)), Vector(Vector(156.0))))), s0(Vector(Vector(157.0), Vector(158.0), Vector(159.0)), Vector(Vector(160.0))))), Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(161.0), Vector(162.0), Vector(163.0)), Vector(Vector(164.0))))), s0(Vector(Vector(165.0), Vector(166.0), Vector(167.0)), Vector(Vector(168.0))))))), s2(Vector(s1(Vector(Vector(s0(Vector(Vector(169.0), Vector(170.0), Vector(171.0)), Vector(Vector(172.0))))), s0(Vector(Vector(173.0), Vector(174.0), Vector(175.0)), Vector(Vector(176.0)))), s1(Vector(Vector(s0(Vector(Vector(177.0), Vector(178.0), Vector(179.0)), Vector(Vector(180.0))))), s0(Vector(Vector(181.0), Vector(182.0), Vector(183.0)), Vector(Vector(184.0)))), s1(Vector(Vector(s0(Vector(Vector(185.0), Vector(186.0), Vector(187.0)), Vector(Vector(188.0))))), s0(Vector(Vector(189.0), Vector(190.0), Vector(191.0)), Vector(Vector(192.0))))), Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(193.0), Vector(194.0), Vector(195.0)), Vector(Vector(196.0))))), s0(Vector(Vector(197.0), Vector(198.0), Vector(199.0)), Vector(Vector(200.0))))))), s2(Vector(s1(Vector(Vector(s0(Vector(Vector(201.0), Vector(202.0), Vector(203.0)), Vector(Vector(204.0))))), s0(Vector(Vector(205.0), Vector(206.0), Vector(207.0)), Vector(Vector(208.0)))), s1(Vector(Vector(s0(Vector(Vector(209.0), Vector(210.0), Vector(211.0)), Vector(Vector(212.0))))), s0(Vector(Vector(213.0), Vector(214.0), Vector(215.0)), Vector(Vector(216.0)))), s1(Vector(Vector(s0(Vector(Vector(217.0), Vector(218.0), Vector(219.0)), Vector(Vector(220.0))))), s0(Vector(Vector(221.0), Vector(222.0), Vector(223.0)), Vector(Vector(224.0))))), Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(225.0), Vector(226.0), Vector(227.0)), Vector(Vector(228.0))))), s0(Vector(Vector(229.0), Vector(230.0), Vector(231.0)), Vector(Vector(232.0)))))))), s5(s4(s0(Vector(Vector(233.0), Vector(234.0), Vector(235.0)), Vector(Vector(236.0))), s0(Vector(Vector(237.0), Vector(238.0), Vector(239.0)), Vector(Vector(240.0)))), 241.0))))))
    val v2: Double = 242.0
    val start = nanoTime()
    var result: Double = 242.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}