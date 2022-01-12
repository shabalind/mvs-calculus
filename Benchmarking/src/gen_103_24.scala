import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  case class s3 (
    p0: s0,
    p1: Vector[Vector[s1]]
  )
  case class s5 (
    p0: Vector[s1],
    p1: s3
  )
  @noinline
  def f0(v0: s3, v1: Vector[s5], v2: Double, v3: Vector[s3]): Double = {
    val v8: s0 = v0.p0
    val v6: Vector[Vector[Double]] = v8.p0
    val v5: Vector[Double] = v6(0)
    val v15: Double = v5(0)
    var v29: Double = v15
    val v70: Double = v2 - v29
    val v39: Double = v29 * v2
    val v77: Vector[Double] = Vector(v15, v29, v70)
    val v94: Double = v77(0)
    val v176: Double = v94 - v39
    v176
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0))), Vector(Vector(s1(Vector(s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0))), s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0)))), Vector(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0))), s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0))))))))
    val v1: Vector[s5] = Vector(s5(Vector(s1(Vector(s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0), Vector(40.0), Vector(41.0))), s0(Vector(Vector(42.0), Vector(43.0), Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0))), s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0), Vector(52.0), Vector(53.0)))), Vector(s0(Vector(Vector(54.0), Vector(55.0), Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0))), s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0), Vector(64.0), Vector(65.0)))))), s3(s0(Vector(Vector(66.0), Vector(67.0), Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0))), Vector(Vector(s1(Vector(s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)), Vector(Vector(75.0), Vector(76.0), Vector(77.0))), s0(Vector(Vector(78.0), Vector(79.0), Vector(80.0)), Vector(Vector(81.0), Vector(82.0), Vector(83.0))), s0(Vector(Vector(84.0), Vector(85.0), Vector(86.0)), Vector(Vector(87.0), Vector(88.0), Vector(89.0)))), Vector(s0(Vector(Vector(90.0), Vector(91.0), Vector(92.0)), Vector(Vector(93.0), Vector(94.0), Vector(95.0))), s0(Vector(Vector(96.0), Vector(97.0), Vector(98.0)), Vector(Vector(99.0), Vector(100.0), Vector(101.0))))))))), s5(Vector(s1(Vector(s0(Vector(Vector(102.0), Vector(103.0), Vector(104.0)), Vector(Vector(105.0), Vector(106.0), Vector(107.0))), s0(Vector(Vector(108.0), Vector(109.0), Vector(110.0)), Vector(Vector(111.0), Vector(112.0), Vector(113.0))), s0(Vector(Vector(114.0), Vector(115.0), Vector(116.0)), Vector(Vector(117.0), Vector(118.0), Vector(119.0)))), Vector(s0(Vector(Vector(120.0), Vector(121.0), Vector(122.0)), Vector(Vector(123.0), Vector(124.0), Vector(125.0))), s0(Vector(Vector(126.0), Vector(127.0), Vector(128.0)), Vector(Vector(129.0), Vector(130.0), Vector(131.0)))))), s3(s0(Vector(Vector(132.0), Vector(133.0), Vector(134.0)), Vector(Vector(135.0), Vector(136.0), Vector(137.0))), Vector(Vector(s1(Vector(s0(Vector(Vector(138.0), Vector(139.0), Vector(140.0)), Vector(Vector(141.0), Vector(142.0), Vector(143.0))), s0(Vector(Vector(144.0), Vector(145.0), Vector(146.0)), Vector(Vector(147.0), Vector(148.0), Vector(149.0))), s0(Vector(Vector(150.0), Vector(151.0), Vector(152.0)), Vector(Vector(153.0), Vector(154.0), Vector(155.0)))), Vector(s0(Vector(Vector(156.0), Vector(157.0), Vector(158.0)), Vector(Vector(159.0), Vector(160.0), Vector(161.0))), s0(Vector(Vector(162.0), Vector(163.0), Vector(164.0)), Vector(Vector(165.0), Vector(166.0), Vector(167.0))))))))))
    val v2: Double = 168.0
    val v3: Vector[s3] = Vector(s3(s0(Vector(Vector(169.0), Vector(170.0), Vector(171.0)), Vector(Vector(172.0), Vector(173.0), Vector(174.0))), Vector(Vector(s1(Vector(s0(Vector(Vector(175.0), Vector(176.0), Vector(177.0)), Vector(Vector(178.0), Vector(179.0), Vector(180.0))), s0(Vector(Vector(181.0), Vector(182.0), Vector(183.0)), Vector(Vector(184.0), Vector(185.0), Vector(186.0))), s0(Vector(Vector(187.0), Vector(188.0), Vector(189.0)), Vector(Vector(190.0), Vector(191.0), Vector(192.0)))), Vector(s0(Vector(Vector(193.0), Vector(194.0), Vector(195.0)), Vector(Vector(196.0), Vector(197.0), Vector(198.0))), s0(Vector(Vector(199.0), Vector(200.0), Vector(201.0)), Vector(Vector(202.0), Vector(203.0), Vector(204.0)))))))), s3(s0(Vector(Vector(205.0), Vector(206.0), Vector(207.0)), Vector(Vector(208.0), Vector(209.0), Vector(210.0))), Vector(Vector(s1(Vector(s0(Vector(Vector(211.0), Vector(212.0), Vector(213.0)), Vector(Vector(214.0), Vector(215.0), Vector(216.0))), s0(Vector(Vector(217.0), Vector(218.0), Vector(219.0)), Vector(Vector(220.0), Vector(221.0), Vector(222.0))), s0(Vector(Vector(223.0), Vector(224.0), Vector(225.0)), Vector(Vector(226.0), Vector(227.0), Vector(228.0)))), Vector(s0(Vector(Vector(229.0), Vector(230.0), Vector(231.0)), Vector(Vector(232.0), Vector(233.0), Vector(234.0))), s0(Vector(Vector(235.0), Vector(236.0), Vector(237.0)), Vector(Vector(238.0), Vector(239.0), Vector(240.0)))))))))
    val start = nanoTime()
    var result: Double = [StructValue(Name(str='s3', ty=None), [StructValue(Name(str='s0', ty=None), [[[169.0], [170.0], [171.0]], [[172.0], [173.0], [174.0]]]), [[StructValue(Name(str='s1', ty=None), [[StructValue(Name(str='s0', ty=None), [[[175.0], [176.0], [177.0]], [[178.0], [179.0], [180.0]]]), StructValue(Name(str='s0', ty=None), [[[181.0], [182.0], [183.0]], [[184.0], [185.0], [186.0]]]), StructValue(Name(str='s0', ty=None), [[[187.0], [188.0], [189.0]], [[190.0], [191.0], [192.0]]])], [StructValue(Name(str='s0', ty=None), [[[193.0], [194.0], [195.0]], [[196.0], [197.0], [198.0]]]), StructValue(Name(str='s0', ty=None), [[[199.0], [200.0], [201.0]], [[202.0], [203.0], [204.0]]])]])]]]), StructValue(Name(str='s3', ty=None), [StructValue(Name(str='s0', ty=None), [[[205.0], [206.0], [207.0]], [[208.0], [209.0], [210.0]]]), [[StructValue(Name(str='s1', ty=None), [[StructValue(Name(str='s0', ty=None), [[[211.0], [212.0], [213.0]], [[214.0], [215.0], [216.0]]]), StructValue(Name(str='s0', ty=None), [[[217.0], [218.0], [219.0]], [[220.0], [221.0], [222.0]]]), StructValue(Name(str='s0', ty=None), [[[223.0], [224.0], [225.0]], [[226.0], [227.0], [228.0]]])], [StructValue(Name(str='s0', ty=None), [[[229.0], [230.0], [231.0]], [[232.0], [233.0], [234.0]]]), StructValue(Name(str='s0', ty=None), [[[235.0], [236.0], [237.0]], [[238.0], [239.0], [240.0]]])]])]]])]
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}