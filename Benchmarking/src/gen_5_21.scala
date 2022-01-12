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
    p0: Double,
    p1: s0
  )
  case class s3 (
    p0: Vector[s1],
    p1: s2
  )
  case class s4 (
    p0: Vector[s2],
    p1: Vector[s1]
  )
  case class s6 (
    p0: s3,
    p1: Vector[s2]
  )
  case class s7 (
    p0: Vector[Double],
    p1: Vector[Vector[s4]],
    p2: s3
  )
  case class s8 (
    p0: s1,
    p1: s3,
    p2: Vector[s6],
    p3: s7
  )
  case class s10 (
    p0: s8,
    p1: s3
  )
  def f40(v0: s1): s1 = {
    var v7: s1 = v0
    v7 = v0
    var v3: s1 = v7
    var v2: s1 = v3
    val v1: s0 = v0.p0
    val v4: Vector[s0] = Vector(v1, v1, v1, v1, v1, v1, v1)
    val v8: s0 = v7.p0
    val v13: s0 = v4(1)
    val v5: s0 = v4(4)
    val v6: s0 = v4(3)
    val v25: s0 = v3.p1
    var v14: s0 = v8
    val v29: Vector[Vector[Double]] = v6.p1
    val v30: Vector[Vector[Double]] = v8.p0
    v3 = v2
    val v15: Vector[Vector[Double]] = v5.p1
    val v58: s0 = v4(1)
    v2 = v2.copy(p0 = v25)
    val v11: s0 = v4(1)
    v2 = v2.copy(p0 = v11)
    v3 = v3.copy(p1 = v14)
    val v32: Vector[Vector[Double]] = v8.p0
    val v41: s0 = s0(v30, v15)
    v2 = v2.copy(p0 = v58)
    var v28: Vector[Vector[Double]] = v32
    val v40: s0 = s0(v28, v29)
    v2 = v2.copy(p0 = v8)
    v3 = v3.copy(p1 = v40)
    val v51: s0 = v0.p1
    var v100: s1 = v2
    v100 = v100.copy(p0 = v13)
    v7 = v7.copy(p1 = v11)
    v100 = v100.copy(p0 = v58)
    v3 = v3.copy(p0 = v1)
    v3 = v3.copy(p0 = v41)
    v2 = v2.copy(p0 = v51)
    v100
  }
  @noinline
  def f0(v0: Vector[s10], v1: s8, v2: Double): Double = {
    val v4: s1 = v1.p0
    var v3: s1 = v4
    val v8: s0 = v3.p0
    val v9: s0 = v4.p1
    var v10: s0 = v9
    val v11: s1 = f40(v3)
    v3 = v3.copy(p0 = v10)
    val v13: Vector[Vector[Double]] = v8.p1
    val v17: Double = v2 - v2
    val v41: Vector[Double] = v13(0)
    val v26: s0 = v11.p1
    v10 = v10.copy(p1 = v13)
    val v29: Double = v41(0)
    val v25: Double = v17 * v29
    v3 = v3.copy(p1 = v26)
    v10 = v9
    v3 = v3.copy(p0 = v10)
    val v35: s0 = v4.p1
    val v51: Vector[Vector[Double]] = v35.p1
    v10 = v10.copy(p1 = v51)
    val v50: Double = v29 - v25
    v50
  }
  def benchmark(): Unit = {
    val v0: Vector[s10] = Vector(s10(s8(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))), s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0)))), s3(Vector(s1(s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0))), s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0)))), s1(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0))), s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0)))), s1(s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0))), s0(Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0))))), s2(24.0, s0(Vector(Vector(25.0), Vector(26.0)), Vector(Vector(27.0))))), Vector(s6(s3(Vector(s1(s0(Vector(Vector(28.0), Vector(29.0)), Vector(Vector(30.0))), s0(Vector(Vector(31.0), Vector(32.0)), Vector(Vector(33.0)))), s1(s0(Vector(Vector(34.0), Vector(35.0)), Vector(Vector(36.0))), s0(Vector(Vector(37.0), Vector(38.0)), Vector(Vector(39.0)))), s1(s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0))), s0(Vector(Vector(43.0), Vector(44.0)), Vector(Vector(45.0))))), s2(46.0, s0(Vector(Vector(47.0), Vector(48.0)), Vector(Vector(49.0))))), Vector(s2(50.0, s0(Vector(Vector(51.0), Vector(52.0)), Vector(Vector(53.0)))), s2(54.0, s0(Vector(Vector(55.0), Vector(56.0)), Vector(Vector(57.0))))))), s7(Vector(58.0), Vector(Vector(s4(Vector(s2(59.0, s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0)))), s2(63.0, s0(Vector(Vector(64.0), Vector(65.0)), Vector(Vector(66.0)))), s2(67.0, s0(Vector(Vector(68.0), Vector(69.0)), Vector(Vector(70.0))))), Vector(s1(s0(Vector(Vector(71.0), Vector(72.0)), Vector(Vector(73.0))), s0(Vector(Vector(74.0), Vector(75.0)), Vector(Vector(76.0)))), s1(s0(Vector(Vector(77.0), Vector(78.0)), Vector(Vector(79.0))), s0(Vector(Vector(80.0), Vector(81.0)), Vector(Vector(82.0)))))))), s3(Vector(s1(s0(Vector(Vector(83.0), Vector(84.0)), Vector(Vector(85.0))), s0(Vector(Vector(86.0), Vector(87.0)), Vector(Vector(88.0)))), s1(s0(Vector(Vector(89.0), Vector(90.0)), Vector(Vector(91.0))), s0(Vector(Vector(92.0), Vector(93.0)), Vector(Vector(94.0)))), s1(s0(Vector(Vector(95.0), Vector(96.0)), Vector(Vector(97.0))), s0(Vector(Vector(98.0), Vector(99.0)), Vector(Vector(100.0))))), s2(101.0, s0(Vector(Vector(102.0), Vector(103.0)), Vector(Vector(104.0))))))), s3(Vector(s1(s0(Vector(Vector(105.0), Vector(106.0)), Vector(Vector(107.0))), s0(Vector(Vector(108.0), Vector(109.0)), Vector(Vector(110.0)))), s1(s0(Vector(Vector(111.0), Vector(112.0)), Vector(Vector(113.0))), s0(Vector(Vector(114.0), Vector(115.0)), Vector(Vector(116.0)))), s1(s0(Vector(Vector(117.0), Vector(118.0)), Vector(Vector(119.0))), s0(Vector(Vector(120.0), Vector(121.0)), Vector(Vector(122.0))))), s2(123.0, s0(Vector(Vector(124.0), Vector(125.0)), Vector(Vector(126.0)))))))
    val v1: s8 = s8(s1(s0(Vector(Vector(127.0), Vector(128.0)), Vector(Vector(129.0))), s0(Vector(Vector(130.0), Vector(131.0)), Vector(Vector(132.0)))), s3(Vector(s1(s0(Vector(Vector(133.0), Vector(134.0)), Vector(Vector(135.0))), s0(Vector(Vector(136.0), Vector(137.0)), Vector(Vector(138.0)))), s1(s0(Vector(Vector(139.0), Vector(140.0)), Vector(Vector(141.0))), s0(Vector(Vector(142.0), Vector(143.0)), Vector(Vector(144.0)))), s1(s0(Vector(Vector(145.0), Vector(146.0)), Vector(Vector(147.0))), s0(Vector(Vector(148.0), Vector(149.0)), Vector(Vector(150.0))))), s2(151.0, s0(Vector(Vector(152.0), Vector(153.0)), Vector(Vector(154.0))))), Vector(s6(s3(Vector(s1(s0(Vector(Vector(155.0), Vector(156.0)), Vector(Vector(157.0))), s0(Vector(Vector(158.0), Vector(159.0)), Vector(Vector(160.0)))), s1(s0(Vector(Vector(161.0), Vector(162.0)), Vector(Vector(163.0))), s0(Vector(Vector(164.0), Vector(165.0)), Vector(Vector(166.0)))), s1(s0(Vector(Vector(167.0), Vector(168.0)), Vector(Vector(169.0))), s0(Vector(Vector(170.0), Vector(171.0)), Vector(Vector(172.0))))), s2(173.0, s0(Vector(Vector(174.0), Vector(175.0)), Vector(Vector(176.0))))), Vector(s2(177.0, s0(Vector(Vector(178.0), Vector(179.0)), Vector(Vector(180.0)))), s2(181.0, s0(Vector(Vector(182.0), Vector(183.0)), Vector(Vector(184.0))))))), s7(Vector(185.0), Vector(Vector(s4(Vector(s2(186.0, s0(Vector(Vector(187.0), Vector(188.0)), Vector(Vector(189.0)))), s2(190.0, s0(Vector(Vector(191.0), Vector(192.0)), Vector(Vector(193.0)))), s2(194.0, s0(Vector(Vector(195.0), Vector(196.0)), Vector(Vector(197.0))))), Vector(s1(s0(Vector(Vector(198.0), Vector(199.0)), Vector(Vector(200.0))), s0(Vector(Vector(201.0), Vector(202.0)), Vector(Vector(203.0)))), s1(s0(Vector(Vector(204.0), Vector(205.0)), Vector(Vector(206.0))), s0(Vector(Vector(207.0), Vector(208.0)), Vector(Vector(209.0)))))))), s3(Vector(s1(s0(Vector(Vector(210.0), Vector(211.0)), Vector(Vector(212.0))), s0(Vector(Vector(213.0), Vector(214.0)), Vector(Vector(215.0)))), s1(s0(Vector(Vector(216.0), Vector(217.0)), Vector(Vector(218.0))), s0(Vector(Vector(219.0), Vector(220.0)), Vector(Vector(221.0)))), s1(s0(Vector(Vector(222.0), Vector(223.0)), Vector(Vector(224.0))), s0(Vector(Vector(225.0), Vector(226.0)), Vector(Vector(227.0))))), s2(228.0, s0(Vector(Vector(229.0), Vector(230.0)), Vector(Vector(231.0)))))))
    val v2: Double = 232.0
    val start = nanoTime()
    var result: Double = 232.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}