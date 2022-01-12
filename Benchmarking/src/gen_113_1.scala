import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
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
    p0: s2,
    p1: Vector[s0]
  )
  case class s4 (
    p0: Vector[s2],
    p1: Vector[s1]
  )
  case class s5 (
    p0: Vector[Vector[s1]],
    p1: Vector[Vector[s3]]
  )
  case class s6 (
    p0: s4,
    p1: s5
  )
  case class s7 (
    p0: s6,
    p1: s3
  )
  case class s9 (
    p0: s7,
    p1: s7
  )
  def f28(v0: s0): s0 = {
    val v7: Vector[Vector[Double]] = v0.p0
    val v1: Vector[s0] = Vector(v0, v0, v0)
    val v3: s0 = v1(1)
    val v8: Vector[Vector[Double]] = v3.p1
    var v14: Vector[Vector[Double]] = v8
    val v17: Vector[Double] = v14(2)
    val v21: s0 = v1(0)
    val v31: s0 = v1(2)
    val v25: Vector[Double] = v8(1)
    var v26: Vector[Vector[Double]] = v7
    val v45: s0 = s0(v26, v14)
    v26 = v26.updated(0, v17)
    val v117: Vector[Vector[Double]] = v31.p0
    val v67: Vector[Vector[Double]] = v21.p1
    var v60: s0 = v21
    val v66: Vector[Vector[Double]] = v45.p1
    v14 = v14.updated(0, v25)
    v60 = v60.copy(p1 = v66)
    val v76: Vector[Vector[Double]] = v3.p1
    val v125: Vector[Vector[Double]] = v60.p1
    v60 = v60.copy(p1 = v125)
    v60 = v60.copy(p1 = v76)
    v60 = v60.copy(p0 = v117)
    v60 = v60.copy(p1 = v67)
    v60
  }
  def f15(v0: s0): s0 = {
    val v3: s0 = f28(v0)
    val v1: s0 = f28(v3)
    val v8: Vector[Vector[Double]] = v1.p0
    val v4: Vector[Vector[Vector[Double]]] = Vector(v8, v8, v8, v8, v8, v8)
    val v6: Vector[Vector[Double]] = v1.p1
    val v16: Vector[Vector[Double]] = v4(2)
    val v28: s0 = s0(v16, v6)
    v28
  }
  @noinline
  def f0(v0: Vector[s0], v1: s9, v2: Double): Double = {
    val v6: Double = v2 - v2
    var v13: Vector[s0] = v0
    val v20: s0 = v0(1)
    val v38: s0 = v13(1)
    v13 = v13.updated(2, v38)
    val v29: Vector[Vector[Double]] = v38.p1
    var v26: s0 = v20
    val v28: Vector[Double] = v29(0)
    v26 = v26.copy(p1 = v29)
    val v68: s0 = f15(v20)
    v26 = v26.copy(p1 = v29)
    v26 = v26.copy(p1 = v29)
    val v27: Double = v6 + v6
    v13 = v13.updated(2, v26)
    val v43: Double = v28(0)
    var v67: Double = v43
    val v89: Double = v67 + v6
    val v63: s0 = f15(v38)
    val v96: Vector[Vector[Double]] = v63.p0
    v26 = v26.copy(p0 = v96)
    v26 = v26.copy(p0 = v96)
    v13 = v13.updated(0, v68)
    val v146: Double = v89 * v27
    v146
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0))), s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))))
    val v1: s9 = s9(s7(s6(s4(Vector(s2(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0))), s1(Vector(s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0))), s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0)))), s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0)))))), Vector(s1(Vector(s0(Vector(Vector(28.0)), Vector(Vector(29.0), Vector(30.0), Vector(31.0))), s0(Vector(Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0)))), s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0)))), s1(Vector(s0(Vector(Vector(40.0)), Vector(Vector(41.0), Vector(42.0), Vector(43.0))), s0(Vector(Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0)))), s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0), Vector(51.0)))))), s5(Vector(Vector(s1(Vector(s0(Vector(Vector(52.0)), Vector(Vector(53.0), Vector(54.0), Vector(55.0))), s0(Vector(Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0)))), s0(Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0), Vector(63.0)))))), Vector(Vector(s3(s2(s0(Vector(Vector(64.0)), Vector(Vector(65.0), Vector(66.0), Vector(67.0))), s1(Vector(s0(Vector(Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0))), s0(Vector(Vector(72.0)), Vector(Vector(73.0), Vector(74.0), Vector(75.0)))), s0(Vector(Vector(76.0)), Vector(Vector(77.0), Vector(78.0), Vector(79.0))))), Vector(s0(Vector(Vector(80.0)), Vector(Vector(81.0), Vector(82.0), Vector(83.0))), s0(Vector(Vector(84.0)), Vector(Vector(85.0), Vector(86.0), Vector(87.0))), s0(Vector(Vector(88.0)), Vector(Vector(89.0), Vector(90.0), Vector(91.0))))))))), s3(s2(s0(Vector(Vector(92.0)), Vector(Vector(93.0), Vector(94.0), Vector(95.0))), s1(Vector(s0(Vector(Vector(96.0)), Vector(Vector(97.0), Vector(98.0), Vector(99.0))), s0(Vector(Vector(100.0)), Vector(Vector(101.0), Vector(102.0), Vector(103.0)))), s0(Vector(Vector(104.0)), Vector(Vector(105.0), Vector(106.0), Vector(107.0))))), Vector(s0(Vector(Vector(108.0)), Vector(Vector(109.0), Vector(110.0), Vector(111.0))), s0(Vector(Vector(112.0)), Vector(Vector(113.0), Vector(114.0), Vector(115.0))), s0(Vector(Vector(116.0)), Vector(Vector(117.0), Vector(118.0), Vector(119.0)))))), s7(s6(s4(Vector(s2(s0(Vector(Vector(120.0)), Vector(Vector(121.0), Vector(122.0), Vector(123.0))), s1(Vector(s0(Vector(Vector(124.0)), Vector(Vector(125.0), Vector(126.0), Vector(127.0))), s0(Vector(Vector(128.0)), Vector(Vector(129.0), Vector(130.0), Vector(131.0)))), s0(Vector(Vector(132.0)), Vector(Vector(133.0), Vector(134.0), Vector(135.0)))))), Vector(s1(Vector(s0(Vector(Vector(136.0)), Vector(Vector(137.0), Vector(138.0), Vector(139.0))), s0(Vector(Vector(140.0)), Vector(Vector(141.0), Vector(142.0), Vector(143.0)))), s0(Vector(Vector(144.0)), Vector(Vector(145.0), Vector(146.0), Vector(147.0)))), s1(Vector(s0(Vector(Vector(148.0)), Vector(Vector(149.0), Vector(150.0), Vector(151.0))), s0(Vector(Vector(152.0)), Vector(Vector(153.0), Vector(154.0), Vector(155.0)))), s0(Vector(Vector(156.0)), Vector(Vector(157.0), Vector(158.0), Vector(159.0)))))), s5(Vector(Vector(s1(Vector(s0(Vector(Vector(160.0)), Vector(Vector(161.0), Vector(162.0), Vector(163.0))), s0(Vector(Vector(164.0)), Vector(Vector(165.0), Vector(166.0), Vector(167.0)))), s0(Vector(Vector(168.0)), Vector(Vector(169.0), Vector(170.0), Vector(171.0)))))), Vector(Vector(s3(s2(s0(Vector(Vector(172.0)), Vector(Vector(173.0), Vector(174.0), Vector(175.0))), s1(Vector(s0(Vector(Vector(176.0)), Vector(Vector(177.0), Vector(178.0), Vector(179.0))), s0(Vector(Vector(180.0)), Vector(Vector(181.0), Vector(182.0), Vector(183.0)))), s0(Vector(Vector(184.0)), Vector(Vector(185.0), Vector(186.0), Vector(187.0))))), Vector(s0(Vector(Vector(188.0)), Vector(Vector(189.0), Vector(190.0), Vector(191.0))), s0(Vector(Vector(192.0)), Vector(Vector(193.0), Vector(194.0), Vector(195.0))), s0(Vector(Vector(196.0)), Vector(Vector(197.0), Vector(198.0), Vector(199.0))))))))), s3(s2(s0(Vector(Vector(200.0)), Vector(Vector(201.0), Vector(202.0), Vector(203.0))), s1(Vector(s0(Vector(Vector(204.0)), Vector(Vector(205.0), Vector(206.0), Vector(207.0))), s0(Vector(Vector(208.0)), Vector(Vector(209.0), Vector(210.0), Vector(211.0)))), s0(Vector(Vector(212.0)), Vector(Vector(213.0), Vector(214.0), Vector(215.0))))), Vector(s0(Vector(Vector(216.0)), Vector(Vector(217.0), Vector(218.0), Vector(219.0))), s0(Vector(Vector(220.0)), Vector(Vector(221.0), Vector(222.0), Vector(223.0))), s0(Vector(Vector(224.0)), Vector(Vector(225.0), Vector(226.0), Vector(227.0)))))))
    val v2: Double = 228.0
    val start = nanoTime()
    var result: Double = 228.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}