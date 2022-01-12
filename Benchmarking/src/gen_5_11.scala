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
  case class s3 (
    p0: s1,
    p1: s1
  )
  case class s4 (
    p0: s3,
    p1: s3
  )
  case class s6 (
    p0: Vector[s4],
    p1: Vector[Vector[s4]]
  )
  @noinline
  def f0(v0: s6, v1: Vector[Vector[s4]], v2: Double): Double = {
    val v6: Vector[s4] = v1(0)
    val v3: s4 = v6(0)
    val v9: s3 = v3.p1
    val v48: s1 = v9.p0
    val v23: Vector[s0] = v48.p1
    val v56: s0 = v23(1)
    val v92: Vector[Vector[Double]] = v56.p1
    val v145: Vector[Double] = v92(0)
    var v46: Vector[Double] = v145
    val v45: Vector[Double] = Vector(v2, v2, v2)
    var v76: Vector[Double] = v45
    var v94: Vector[Double] = v76
    v94 = v94.updated(0, v2)
    var v96: Vector[Double] = v46
    val v78: Double = v94(1)
    val v88: Double = v96(0)
    val v105: Double = v45(1)
    v96 = v96.updated(0, v105)
    v76 = v45
    val v172: Double = v78 + v88
    v46 = v46.updated(0, v2)
    v172
  }
  def benchmark(): Unit = {
    val v0: s6 = s6(Vector(s4(s3(s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0))), Vector(s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0))), s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0))))), s1(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0))), Vector(s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0))), s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0)))))), s3(s1(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0))), Vector(s0(Vector(Vector(28.0), Vector(29.0), Vector(30.0)), Vector(Vector(31.0))), s0(Vector(Vector(32.0), Vector(33.0), Vector(34.0)), Vector(Vector(35.0))))), s1(s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0))), Vector(s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0))), s0(Vector(Vector(44.0), Vector(45.0), Vector(46.0)), Vector(Vector(47.0))))))), s4(s3(s1(s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0))), Vector(s0(Vector(Vector(52.0), Vector(53.0), Vector(54.0)), Vector(Vector(55.0))), s0(Vector(Vector(56.0), Vector(57.0), Vector(58.0)), Vector(Vector(59.0))))), s1(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0))), Vector(s0(Vector(Vector(64.0), Vector(65.0), Vector(66.0)), Vector(Vector(67.0))), s0(Vector(Vector(68.0), Vector(69.0), Vector(70.0)), Vector(Vector(71.0)))))), s3(s1(s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)), Vector(Vector(75.0))), Vector(s0(Vector(Vector(76.0), Vector(77.0), Vector(78.0)), Vector(Vector(79.0))), s0(Vector(Vector(80.0), Vector(81.0), Vector(82.0)), Vector(Vector(83.0))))), s1(s0(Vector(Vector(84.0), Vector(85.0), Vector(86.0)), Vector(Vector(87.0))), Vector(s0(Vector(Vector(88.0), Vector(89.0), Vector(90.0)), Vector(Vector(91.0))), s0(Vector(Vector(92.0), Vector(93.0), Vector(94.0)), Vector(Vector(95.0)))))))), Vector(Vector(s4(s3(s1(s0(Vector(Vector(96.0), Vector(97.0), Vector(98.0)), Vector(Vector(99.0))), Vector(s0(Vector(Vector(100.0), Vector(101.0), Vector(102.0)), Vector(Vector(103.0))), s0(Vector(Vector(104.0), Vector(105.0), Vector(106.0)), Vector(Vector(107.0))))), s1(s0(Vector(Vector(108.0), Vector(109.0), Vector(110.0)), Vector(Vector(111.0))), Vector(s0(Vector(Vector(112.0), Vector(113.0), Vector(114.0)), Vector(Vector(115.0))), s0(Vector(Vector(116.0), Vector(117.0), Vector(118.0)), Vector(Vector(119.0)))))), s3(s1(s0(Vector(Vector(120.0), Vector(121.0), Vector(122.0)), Vector(Vector(123.0))), Vector(s0(Vector(Vector(124.0), Vector(125.0), Vector(126.0)), Vector(Vector(127.0))), s0(Vector(Vector(128.0), Vector(129.0), Vector(130.0)), Vector(Vector(131.0))))), s1(s0(Vector(Vector(132.0), Vector(133.0), Vector(134.0)), Vector(Vector(135.0))), Vector(s0(Vector(Vector(136.0), Vector(137.0), Vector(138.0)), Vector(Vector(139.0))), s0(Vector(Vector(140.0), Vector(141.0), Vector(142.0)), Vector(Vector(143.0)))))))), Vector(s4(s3(s1(s0(Vector(Vector(144.0), Vector(145.0), Vector(146.0)), Vector(Vector(147.0))), Vector(s0(Vector(Vector(148.0), Vector(149.0), Vector(150.0)), Vector(Vector(151.0))), s0(Vector(Vector(152.0), Vector(153.0), Vector(154.0)), Vector(Vector(155.0))))), s1(s0(Vector(Vector(156.0), Vector(157.0), Vector(158.0)), Vector(Vector(159.0))), Vector(s0(Vector(Vector(160.0), Vector(161.0), Vector(162.0)), Vector(Vector(163.0))), s0(Vector(Vector(164.0), Vector(165.0), Vector(166.0)), Vector(Vector(167.0)))))), s3(s1(s0(Vector(Vector(168.0), Vector(169.0), Vector(170.0)), Vector(Vector(171.0))), Vector(s0(Vector(Vector(172.0), Vector(173.0), Vector(174.0)), Vector(Vector(175.0))), s0(Vector(Vector(176.0), Vector(177.0), Vector(178.0)), Vector(Vector(179.0))))), s1(s0(Vector(Vector(180.0), Vector(181.0), Vector(182.0)), Vector(Vector(183.0))), Vector(s0(Vector(Vector(184.0), Vector(185.0), Vector(186.0)), Vector(Vector(187.0))), s0(Vector(Vector(188.0), Vector(189.0), Vector(190.0)), Vector(Vector(191.0))))))))))
    val v1: Vector[Vector[s4]] = Vector(Vector(s4(s3(s1(s0(Vector(Vector(192.0), Vector(193.0), Vector(194.0)), Vector(Vector(195.0))), Vector(s0(Vector(Vector(196.0), Vector(197.0), Vector(198.0)), Vector(Vector(199.0))), s0(Vector(Vector(200.0), Vector(201.0), Vector(202.0)), Vector(Vector(203.0))))), s1(s0(Vector(Vector(204.0), Vector(205.0), Vector(206.0)), Vector(Vector(207.0))), Vector(s0(Vector(Vector(208.0), Vector(209.0), Vector(210.0)), Vector(Vector(211.0))), s0(Vector(Vector(212.0), Vector(213.0), Vector(214.0)), Vector(Vector(215.0)))))), s3(s1(s0(Vector(Vector(216.0), Vector(217.0), Vector(218.0)), Vector(Vector(219.0))), Vector(s0(Vector(Vector(220.0), Vector(221.0), Vector(222.0)), Vector(Vector(223.0))), s0(Vector(Vector(224.0), Vector(225.0), Vector(226.0)), Vector(Vector(227.0))))), s1(s0(Vector(Vector(228.0), Vector(229.0), Vector(230.0)), Vector(Vector(231.0))), Vector(s0(Vector(Vector(232.0), Vector(233.0), Vector(234.0)), Vector(Vector(235.0))), s0(Vector(Vector(236.0), Vector(237.0), Vector(238.0)), Vector(Vector(239.0)))))))))
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