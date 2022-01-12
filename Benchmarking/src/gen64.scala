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
    p2: Vector[Vector[s0]],
    p3: s0,
    p4: Vector[s0]
  )
  case class s3 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  case class s5 (
    p0: Vector[Vector[s1]],
    p1: s3
  )
  def f21(v0: Double): Double = {
    var v6: Double = v0
    var v5: Double = v6
    var v4: Double = v5
    var v7: Double = v6
    v7 = v6
    v7 = v5
    var v13: Double = v5
    var v10: Double = v13
    v5 = v4
    val v24: Vector[Double] = Vector(v0, v0, v7)
    var v16: Vector[Double] = v24
    v16 = v16.updated(0, v10)
    val v42: Double = v16(0)
    v42
  }
  @noinline
  def f0(v0: Vector[Vector[s5]], v1: Double): Double = {
    val v3: Double = f21(v1)
    val v7: Double = v1 - v3
    val v58: Double = f21(v7)
    val v31: Double = f21(v58)
    v31
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s5]] = Vector(Vector(s5(Vector(Vector(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))), s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0))), Vector(Vector(s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0)))), Vector(s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0)))), Vector(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0))))), s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0))), Vector(s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0))), s0(Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0)))))), Vector(s1(s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0))), s0(Vector(Vector(27.0), Vector(28.0)), Vector(Vector(29.0))), Vector(Vector(s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0)))), Vector(s0(Vector(Vector(33.0), Vector(34.0)), Vector(Vector(35.0)))), Vector(s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0))))), s0(Vector(Vector(39.0), Vector(40.0)), Vector(Vector(41.0))), Vector(s0(Vector(Vector(42.0), Vector(43.0)), Vector(Vector(44.0))), s0(Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0)))))), Vector(s1(s0(Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0))), s0(Vector(Vector(51.0), Vector(52.0)), Vector(Vector(53.0))), Vector(Vector(s0(Vector(Vector(54.0), Vector(55.0)), Vector(Vector(56.0)))), Vector(s0(Vector(Vector(57.0), Vector(58.0)), Vector(Vector(59.0)))), Vector(s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0))))), s0(Vector(Vector(63.0), Vector(64.0)), Vector(Vector(65.0))), Vector(s0(Vector(Vector(66.0), Vector(67.0)), Vector(Vector(68.0))), s0(Vector(Vector(69.0), Vector(70.0)), Vector(Vector(71.0))))))), s3(Vector(s0(Vector(Vector(72.0), Vector(73.0)), Vector(Vector(74.0)))), Vector(s0(Vector(Vector(75.0), Vector(76.0)), Vector(Vector(77.0))), s0(Vector(Vector(78.0), Vector(79.0)), Vector(Vector(80.0))), s0(Vector(Vector(81.0), Vector(82.0)), Vector(Vector(83.0))))))), Vector(s5(Vector(Vector(s1(s0(Vector(Vector(84.0), Vector(85.0)), Vector(Vector(86.0))), s0(Vector(Vector(87.0), Vector(88.0)), Vector(Vector(89.0))), Vector(Vector(s0(Vector(Vector(90.0), Vector(91.0)), Vector(Vector(92.0)))), Vector(s0(Vector(Vector(93.0), Vector(94.0)), Vector(Vector(95.0)))), Vector(s0(Vector(Vector(96.0), Vector(97.0)), Vector(Vector(98.0))))), s0(Vector(Vector(99.0), Vector(100.0)), Vector(Vector(101.0))), Vector(s0(Vector(Vector(102.0), Vector(103.0)), Vector(Vector(104.0))), s0(Vector(Vector(105.0), Vector(106.0)), Vector(Vector(107.0)))))), Vector(s1(s0(Vector(Vector(108.0), Vector(109.0)), Vector(Vector(110.0))), s0(Vector(Vector(111.0), Vector(112.0)), Vector(Vector(113.0))), Vector(Vector(s0(Vector(Vector(114.0), Vector(115.0)), Vector(Vector(116.0)))), Vector(s0(Vector(Vector(117.0), Vector(118.0)), Vector(Vector(119.0)))), Vector(s0(Vector(Vector(120.0), Vector(121.0)), Vector(Vector(122.0))))), s0(Vector(Vector(123.0), Vector(124.0)), Vector(Vector(125.0))), Vector(s0(Vector(Vector(126.0), Vector(127.0)), Vector(Vector(128.0))), s0(Vector(Vector(129.0), Vector(130.0)), Vector(Vector(131.0)))))), Vector(s1(s0(Vector(Vector(132.0), Vector(133.0)), Vector(Vector(134.0))), s0(Vector(Vector(135.0), Vector(136.0)), Vector(Vector(137.0))), Vector(Vector(s0(Vector(Vector(138.0), Vector(139.0)), Vector(Vector(140.0)))), Vector(s0(Vector(Vector(141.0), Vector(142.0)), Vector(Vector(143.0)))), Vector(s0(Vector(Vector(144.0), Vector(145.0)), Vector(Vector(146.0))))), s0(Vector(Vector(147.0), Vector(148.0)), Vector(Vector(149.0))), Vector(s0(Vector(Vector(150.0), Vector(151.0)), Vector(Vector(152.0))), s0(Vector(Vector(153.0), Vector(154.0)), Vector(Vector(155.0))))))), s3(Vector(s0(Vector(Vector(156.0), Vector(157.0)), Vector(Vector(158.0)))), Vector(s0(Vector(Vector(159.0), Vector(160.0)), Vector(Vector(161.0))), s0(Vector(Vector(162.0), Vector(163.0)), Vector(Vector(164.0))), s0(Vector(Vector(165.0), Vector(166.0)), Vector(Vector(167.0))))))), Vector(s5(Vector(Vector(s1(s0(Vector(Vector(168.0), Vector(169.0)), Vector(Vector(170.0))), s0(Vector(Vector(171.0), Vector(172.0)), Vector(Vector(173.0))), Vector(Vector(s0(Vector(Vector(174.0), Vector(175.0)), Vector(Vector(176.0)))), Vector(s0(Vector(Vector(177.0), Vector(178.0)), Vector(Vector(179.0)))), Vector(s0(Vector(Vector(180.0), Vector(181.0)), Vector(Vector(182.0))))), s0(Vector(Vector(183.0), Vector(184.0)), Vector(Vector(185.0))), Vector(s0(Vector(Vector(186.0), Vector(187.0)), Vector(Vector(188.0))), s0(Vector(Vector(189.0), Vector(190.0)), Vector(Vector(191.0)))))), Vector(s1(s0(Vector(Vector(192.0), Vector(193.0)), Vector(Vector(194.0))), s0(Vector(Vector(195.0), Vector(196.0)), Vector(Vector(197.0))), Vector(Vector(s0(Vector(Vector(198.0), Vector(199.0)), Vector(Vector(200.0)))), Vector(s0(Vector(Vector(201.0), Vector(202.0)), Vector(Vector(203.0)))), Vector(s0(Vector(Vector(204.0), Vector(205.0)), Vector(Vector(206.0))))), s0(Vector(Vector(207.0), Vector(208.0)), Vector(Vector(209.0))), Vector(s0(Vector(Vector(210.0), Vector(211.0)), Vector(Vector(212.0))), s0(Vector(Vector(213.0), Vector(214.0)), Vector(Vector(215.0)))))), Vector(s1(s0(Vector(Vector(216.0), Vector(217.0)), Vector(Vector(218.0))), s0(Vector(Vector(219.0), Vector(220.0)), Vector(Vector(221.0))), Vector(Vector(s0(Vector(Vector(222.0), Vector(223.0)), Vector(Vector(224.0)))), Vector(s0(Vector(Vector(225.0), Vector(226.0)), Vector(Vector(227.0)))), Vector(s0(Vector(Vector(228.0), Vector(229.0)), Vector(Vector(230.0))))), s0(Vector(Vector(231.0), Vector(232.0)), Vector(Vector(233.0))), Vector(s0(Vector(Vector(234.0), Vector(235.0)), Vector(Vector(236.0))), s0(Vector(Vector(237.0), Vector(238.0)), Vector(Vector(239.0))))))), s3(Vector(s0(Vector(Vector(240.0), Vector(241.0)), Vector(Vector(242.0)))), Vector(s0(Vector(Vector(243.0), Vector(244.0)), Vector(Vector(245.0))), s0(Vector(Vector(246.0), Vector(247.0)), Vector(Vector(248.0))), s0(Vector(Vector(249.0), Vector(250.0)), Vector(Vector(251.0))))))))
    val v1: Double = 252.0
    val start = nanoTime()
    var result: Double = 252.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}