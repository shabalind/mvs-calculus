import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]],
    p3: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[Double]
  )
  case class s2 (
    p0: Vector[s0],
    p1: s1
  )
  case class s3 (
    p0: Vector[s2],
    p1: Vector[s1]
  )
  case class s4 (
    p0: s3,
    p1: s0,
    p2: s0
  )
  case class s7 (
    p0: s3,
    p1: Vector[s1]
  )
  def f43(v0: s4): s4 = {
    var v1: s4 = v0
    var v12: s4 = v1
    v12
  }
  def f41(v0: Vector[Double]): Vector[Double] = {
    var v3: Vector[Double] = v0
    var v8: Vector[Double] = v0
    var v1: Vector[Double] = v0
    var v2: Vector[Double] = v8
    val v9: Double = v3(0)
    val v5: Double = v3(0)
    val v7: Double = v2(0)
    v8 = v1
    var v13: Double = v7
    var v14: Double = v13
    var v11: Vector[Double] = v3
    v8 = v8.updated(1, v9)
    val v20: Vector[Double] = Vector(v9, v14, v5)
    v1 = v1.updated(1, v5)
    var v26: Vector[Double] = v20
    val v16: Double = v26(1)
    v11 = v11.updated(1, v14)
    v3 = v3.updated(1, v16)
    v2 = v2.updated(0, v14)
    v11
  }
  def f37(v0: s3, v1: s3): s3 = {
    val v2: Vector[s2] = v1.p0
    var v4: Vector[s2] = v2
    val v10: s2 = v4(0)
    val v3: Vector[s2] = v1.p0
    var v8: Vector[s2] = v3
    val v7: s2 = v2(0)
    v8 = v8.updated(0, v7)
    val v6: s2 = v4(0)
    var v13: s2 = v7
    var v22: s2 = v6
    val v9: s2 = v8(0)
    var v11: s3 = v1
    val v12: s2 = v3(0)
    v4 = v2
    val v18: Vector[s2] = v0.p0
    val v20: Vector[s1] = v11.p1
    v8 = v8.updated(0, v13)
    v11 = v11.copy(p0 = v4)
    val v15: s1 = v20(2)
    val v17: s0 = v15.p0
    val v21: Vector[s1] = v0.p1
    v11 = v11.copy(p0 = v2)
    v22 = v22.copy(p1 = v15)
    val v51: Vector[s0] = v9.p0
    val v31: Vector[Double] = v15.p1
    val v23: s0 = v51(0)
    v8 = v8.updated(0, v10)
    val v45: s1 = v21(0)
    val v35: s4 = s4(v1, v23, v17)
    v13 = v12
    v13 = v13.copy(p0 = v51)
    v8 = v8.updated(0, v6)
    val v76: s4 = f43(v35)
    v11 = v11.copy(p0 = v18)
    v8 = v8.updated(0, v6)
    var v105: s1 = v45
    v8 = v8.updated(0, v12)
    val v102: Vector[Double] = f41(v31)
    v13 = v13.copy(p0 = v51)
    val v131: s3 = v76.p0
    v105 = v105.copy(p1 = v102)
    v13 = v13.copy(p1 = v105)
    v8 = v8.updated(0, v22)
    v8 = v8.updated(0, v9)
    v8 = v4
    v131
  }
  def f5(v0: Vector[s2]): Vector[s2] = {
    var v7: Vector[s2] = v0
    val v6: s2 = v7(0)
    val v4: Vector[s0] = v6.p0
    val v8: Vector[s0] = v6.p0
    var v9: s2 = v6
    var v11: s2 = v9
    v7 = v7.updated(0, v11)
    v11 = v11.copy(p0 = v4)
    val v3: s2 = v0(0)
    v7 = v7.updated(0, v3)
    var v29: Vector[s0] = v8
    v9 = v9.copy(p0 = v29)
    v7
  }
  @noinline
  def f0(v0: s7, v1: Vector[s3], v2: s3, v3: Double): Double = {
    var v5: s3 = v2
    val v15: s3 = f37(v2, v5)
    val v18: Vector[s2] = v15.p0
    val v13: Vector[s2] = v15.p0
    val v29: s2 = v18(0)
    val v10: Vector[s2] = f5(v13)
    val v19: Vector[s1] = v0.p1
    v5 = v5.copy(p0 = v10)
    val v50: Vector[s0] = v29.p0
    val v49: s0 = v50(0)
    var v23: Vector[s1] = v19
    v5 = v5.copy(p1 = v23)
    val v51: Vector[Vector[Double]] = v49.p3
    val v97: Vector[Double] = v51(0)
    val v265: Double = v97(0)
    v265
  }
  def benchmark(): Unit = {
    val v0: s7 = s7(s3(Vector(s2(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0)), Vector(Vector(5.0)), Vector(Vector(6.0), Vector(7.0), Vector(8.0))), s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0), Vector(12.0), Vector(13.0)), Vector(Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0))), s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0)), Vector(Vector(24.0), Vector(25.0), Vector(26.0)))), s1(s0(Vector(Vector(27.0), Vector(28.0)), Vector(Vector(29.0), Vector(30.0), Vector(31.0)), Vector(Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0))), Vector(36.0, 37.0)))), Vector(s1(s0(Vector(Vector(38.0), Vector(39.0)), Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0)), Vector(Vector(44.0), Vector(45.0), Vector(46.0))), Vector(47.0, 48.0)), s1(s0(Vector(Vector(49.0), Vector(50.0)), Vector(Vector(51.0), Vector(52.0), Vector(53.0)), Vector(Vector(54.0)), Vector(Vector(55.0), Vector(56.0), Vector(57.0))), Vector(58.0, 59.0)), s1(s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0), Vector(63.0), Vector(64.0)), Vector(Vector(65.0)), Vector(Vector(66.0), Vector(67.0), Vector(68.0))), Vector(69.0, 70.0)))), Vector(s1(s0(Vector(Vector(71.0), Vector(72.0)), Vector(Vector(73.0), Vector(74.0), Vector(75.0)), Vector(Vector(76.0)), Vector(Vector(77.0), Vector(78.0), Vector(79.0))), Vector(80.0, 81.0)), s1(s0(Vector(Vector(82.0), Vector(83.0)), Vector(Vector(84.0), Vector(85.0), Vector(86.0)), Vector(Vector(87.0)), Vector(Vector(88.0), Vector(89.0), Vector(90.0))), Vector(91.0, 92.0)), s1(s0(Vector(Vector(93.0), Vector(94.0)), Vector(Vector(95.0), Vector(96.0), Vector(97.0)), Vector(Vector(98.0)), Vector(Vector(99.0), Vector(100.0), Vector(101.0))), Vector(102.0, 103.0))))
    val v1: Vector[s3] = Vector(s3(Vector(s2(Vector(s0(Vector(Vector(104.0), Vector(105.0)), Vector(Vector(106.0), Vector(107.0), Vector(108.0)), Vector(Vector(109.0)), Vector(Vector(110.0), Vector(111.0), Vector(112.0))), s0(Vector(Vector(113.0), Vector(114.0)), Vector(Vector(115.0), Vector(116.0), Vector(117.0)), Vector(Vector(118.0)), Vector(Vector(119.0), Vector(120.0), Vector(121.0))), s0(Vector(Vector(122.0), Vector(123.0)), Vector(Vector(124.0), Vector(125.0), Vector(126.0)), Vector(Vector(127.0)), Vector(Vector(128.0), Vector(129.0), Vector(130.0)))), s1(s0(Vector(Vector(131.0), Vector(132.0)), Vector(Vector(133.0), Vector(134.0), Vector(135.0)), Vector(Vector(136.0)), Vector(Vector(137.0), Vector(138.0), Vector(139.0))), Vector(140.0, 141.0)))), Vector(s1(s0(Vector(Vector(142.0), Vector(143.0)), Vector(Vector(144.0), Vector(145.0), Vector(146.0)), Vector(Vector(147.0)), Vector(Vector(148.0), Vector(149.0), Vector(150.0))), Vector(151.0, 152.0)), s1(s0(Vector(Vector(153.0), Vector(154.0)), Vector(Vector(155.0), Vector(156.0), Vector(157.0)), Vector(Vector(158.0)), Vector(Vector(159.0), Vector(160.0), Vector(161.0))), Vector(162.0, 163.0)), s1(s0(Vector(Vector(164.0), Vector(165.0)), Vector(Vector(166.0), Vector(167.0), Vector(168.0)), Vector(Vector(169.0)), Vector(Vector(170.0), Vector(171.0), Vector(172.0))), Vector(173.0, 174.0)))))
    val v2: s3 = s3(Vector(s2(Vector(s0(Vector(Vector(175.0), Vector(176.0)), Vector(Vector(177.0), Vector(178.0), Vector(179.0)), Vector(Vector(180.0)), Vector(Vector(181.0), Vector(182.0), Vector(183.0))), s0(Vector(Vector(184.0), Vector(185.0)), Vector(Vector(186.0), Vector(187.0), Vector(188.0)), Vector(Vector(189.0)), Vector(Vector(190.0), Vector(191.0), Vector(192.0))), s0(Vector(Vector(193.0), Vector(194.0)), Vector(Vector(195.0), Vector(196.0), Vector(197.0)), Vector(Vector(198.0)), Vector(Vector(199.0), Vector(200.0), Vector(201.0)))), s1(s0(Vector(Vector(202.0), Vector(203.0)), Vector(Vector(204.0), Vector(205.0), Vector(206.0)), Vector(Vector(207.0)), Vector(Vector(208.0), Vector(209.0), Vector(210.0))), Vector(211.0, 212.0)))), Vector(s1(s0(Vector(Vector(213.0), Vector(214.0)), Vector(Vector(215.0), Vector(216.0), Vector(217.0)), Vector(Vector(218.0)), Vector(Vector(219.0), Vector(220.0), Vector(221.0))), Vector(222.0, 223.0)), s1(s0(Vector(Vector(224.0), Vector(225.0)), Vector(Vector(226.0), Vector(227.0), Vector(228.0)), Vector(Vector(229.0)), Vector(Vector(230.0), Vector(231.0), Vector(232.0))), Vector(233.0, 234.0)), s1(s0(Vector(Vector(235.0), Vector(236.0)), Vector(Vector(237.0), Vector(238.0), Vector(239.0)), Vector(Vector(240.0)), Vector(Vector(241.0), Vector(242.0), Vector(243.0))), Vector(244.0, 245.0))))
    val v3: Double = 246.0
    val start = nanoTime()
    var result: Double = 246.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}