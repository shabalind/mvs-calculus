import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0,
    p2: s0,
    p3: Vector[s0],
    p4: s0,
    p5: s0
  )
  case class s3 (
    p0: s1,
    p1: s1
  )
  case class s4 (
    p0: s0,
    p1: Vector[Vector[s3]]
  )
  case class s5 (
    p0: s0,
    p1: s0
  )
  case class s11 (
    p0: s5,
    p1: s4
  )
  def f18(v0: s4): s4 = {
    val v7: s0 = v0.p0
    val v4: Vector[Vector[s3]] = v0.p1
    val v1: Vector[s0] = Vector(v7, v7)
    val v8: s0 = v1(0)
    var v3: Vector[Vector[s3]] = v4
    var v5: s0 = v8
    var v15: Vector[s0] = v1
    v15 = v15.updated(0, v5)
    var v9: s0 = v5
    val v11: Vector[Vector[Double]] = v9.p0
    var v17: s4 = v0
    v15 = v15.updated(1, v8)
    var v16: Vector[s0] = v15
    val v14: Vector[Vector[Double]] = v9.p1
    var v18: s0 = v9
    v16 = v16.updated(0, v18)
    val v21: s0 = v15(1)
    v5 = v5.copy(p0 = v11)
    val v19: Vector[Vector[Double]] = v21.p0
    v5 = v5.copy(p1 = v14)
    val v23: Vector[Vector[Double]] = v9.p1
    v15 = v15.updated(1, v9)
    v9 = v9.copy(p1 = v23)
    v5 = v5.copy(p1 = v14)
    v17 = v17.copy(p1 = v3)
    val v38: s0 = v16(0)
    v15 = v15.updated(1, v38)
    val v65: s0 = s0(v19, v23)
    var v105: Vector[Vector[Double]] = v11
    v17 = v17.copy(p0 = v21)
    v17 = v17.copy(p0 = v65)
    v5 = v5.copy(p0 = v105)
    v17
  }
  def f17(v0: s11): s11 = {
    var v2: s11 = v0
    var v6: s11 = v2
    var v1: s11 = v6
    val v3: s4 = v0.p1
    val v7: s4 = v1.p1
    var v8: s4 = v3
    var v9: s4 = v8
    val v17: s4 = v2.p1
    var v4: s11 = v1
    var v10: s4 = v17
    val v21: s4 = f18(v9)
    v2 = v2.copy(p1 = v21)
    val v25: Vector[Vector[s3]] = v10.p1
    val v12: Vector[s11] = Vector(v2, v4, v1)
    val v15: s0 = v8.p0
    v4 = v4.copy(p1 = v7)
    val v41: s11 = v12(2)
    v10 = v10.copy(p0 = v15)
    v9 = v9.copy(p1 = v25)
    val v71: Vector[Vector[s3]] = v8.p1
    val v98: s11 = v12(1)
    val v33: s4 = f18(v8)
    var v51: s11 = v41
    v4 = v98
    val v83: s4 = f18(v9)
    v1 = v1.copy(p1 = v83)
    v51 = v51.copy(p1 = v33)
    v8 = v8.copy(p1 = v71)
    v51
  }
  @noinline
  def f0(v0: s11, v1: Double): Double = {
    val v2: s11 = f17(v0)
    val v7: s11 = f17(v2)
    val v6: s5 = v7.p0
    var v4: s5 = v6
    val v12: s0 = v4.p1
    var v21: s0 = v12
    v4 = v6
    v4 = v4.copy(p0 = v12)
    val v29: Vector[Vector[Double]] = v12.p0
    v21 = v21.copy(p0 = v29)
    val v33: Vector[Double] = v29(1)
    var v41: Vector[Double] = v33
    val v40: Double = v33(0)
    val v80: Vector[Vector[Double]] = Vector(v33, v41)
    v41 = v41.updated(0, v40)
    val v55: Vector[Double] = Vector(v40, v40)
    val v30: Double = v55(0)
    v4 = v4.copy(p1 = v21)
    val v45: Double = v55(1)
    v21 = v21.copy(p0 = v80)
    val v71: Double = v30 + v45
    v71
  }
  def benchmark(): Unit = {
    val v0: s11 = s11(s5(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0))), s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0)))), s4(s0(Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0), Vector(14.0))), Vector(Vector(s3(s1(s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0))), s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0), Vector(24.0))), s0(Vector(Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0))), Vector(s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0), Vector(33.0), Vector(34.0))), s0(Vector(Vector(35.0), Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0)))), s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0), Vector(44.0))), s0(Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0), Vector(48.0), Vector(49.0)))), s1(s0(Vector(Vector(50.0), Vector(51.0)), Vector(Vector(52.0), Vector(53.0), Vector(54.0))), s0(Vector(Vector(55.0), Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0))), s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0), Vector(63.0), Vector(64.0))), Vector(s0(Vector(Vector(65.0), Vector(66.0)), Vector(Vector(67.0), Vector(68.0), Vector(69.0))), s0(Vector(Vector(70.0), Vector(71.0)), Vector(Vector(72.0), Vector(73.0), Vector(74.0)))), s0(Vector(Vector(75.0), Vector(76.0)), Vector(Vector(77.0), Vector(78.0), Vector(79.0))), s0(Vector(Vector(80.0), Vector(81.0)), Vector(Vector(82.0), Vector(83.0), Vector(84.0)))))), Vector(s3(s1(s0(Vector(Vector(85.0), Vector(86.0)), Vector(Vector(87.0), Vector(88.0), Vector(89.0))), s0(Vector(Vector(90.0), Vector(91.0)), Vector(Vector(92.0), Vector(93.0), Vector(94.0))), s0(Vector(Vector(95.0), Vector(96.0)), Vector(Vector(97.0), Vector(98.0), Vector(99.0))), Vector(s0(Vector(Vector(100.0), Vector(101.0)), Vector(Vector(102.0), Vector(103.0), Vector(104.0))), s0(Vector(Vector(105.0), Vector(106.0)), Vector(Vector(107.0), Vector(108.0), Vector(109.0)))), s0(Vector(Vector(110.0), Vector(111.0)), Vector(Vector(112.0), Vector(113.0), Vector(114.0))), s0(Vector(Vector(115.0), Vector(116.0)), Vector(Vector(117.0), Vector(118.0), Vector(119.0)))), s1(s0(Vector(Vector(120.0), Vector(121.0)), Vector(Vector(122.0), Vector(123.0), Vector(124.0))), s0(Vector(Vector(125.0), Vector(126.0)), Vector(Vector(127.0), Vector(128.0), Vector(129.0))), s0(Vector(Vector(130.0), Vector(131.0)), Vector(Vector(132.0), Vector(133.0), Vector(134.0))), Vector(s0(Vector(Vector(135.0), Vector(136.0)), Vector(Vector(137.0), Vector(138.0), Vector(139.0))), s0(Vector(Vector(140.0), Vector(141.0)), Vector(Vector(142.0), Vector(143.0), Vector(144.0)))), s0(Vector(Vector(145.0), Vector(146.0)), Vector(Vector(147.0), Vector(148.0), Vector(149.0))), s0(Vector(Vector(150.0), Vector(151.0)), Vector(Vector(152.0), Vector(153.0), Vector(154.0)))))), Vector(s3(s1(s0(Vector(Vector(155.0), Vector(156.0)), Vector(Vector(157.0), Vector(158.0), Vector(159.0))), s0(Vector(Vector(160.0), Vector(161.0)), Vector(Vector(162.0), Vector(163.0), Vector(164.0))), s0(Vector(Vector(165.0), Vector(166.0)), Vector(Vector(167.0), Vector(168.0), Vector(169.0))), Vector(s0(Vector(Vector(170.0), Vector(171.0)), Vector(Vector(172.0), Vector(173.0), Vector(174.0))), s0(Vector(Vector(175.0), Vector(176.0)), Vector(Vector(177.0), Vector(178.0), Vector(179.0)))), s0(Vector(Vector(180.0), Vector(181.0)), Vector(Vector(182.0), Vector(183.0), Vector(184.0))), s0(Vector(Vector(185.0), Vector(186.0)), Vector(Vector(187.0), Vector(188.0), Vector(189.0)))), s1(s0(Vector(Vector(190.0), Vector(191.0)), Vector(Vector(192.0), Vector(193.0), Vector(194.0))), s0(Vector(Vector(195.0), Vector(196.0)), Vector(Vector(197.0), Vector(198.0), Vector(199.0))), s0(Vector(Vector(200.0), Vector(201.0)), Vector(Vector(202.0), Vector(203.0), Vector(204.0))), Vector(s0(Vector(Vector(205.0), Vector(206.0)), Vector(Vector(207.0), Vector(208.0), Vector(209.0))), s0(Vector(Vector(210.0), Vector(211.0)), Vector(Vector(212.0), Vector(213.0), Vector(214.0)))), s0(Vector(Vector(215.0), Vector(216.0)), Vector(Vector(217.0), Vector(218.0), Vector(219.0))), s0(Vector(Vector(220.0), Vector(221.0)), Vector(Vector(222.0), Vector(223.0), Vector(224.0)))))))))
    val v1: Double = 225.0
    val start = nanoTime()
    var result: Double = 225.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}