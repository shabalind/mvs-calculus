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
  case class s2 (
    p0: Vector[Vector[s0]],
    p1: s1
  )
  case class s3 (
    p0: s0,
    p1: Vector[s2]
  )
  case class s4 (
    p0: s2,
    p1: s0
  )
  case class s5 (
    p0: s3,
    p1: s4
  )
  case class s6 (
    p0: s1,
    p1: s3
  )
  case class s8 (
    p0: Vector[Vector[s6]],
    p1: s5
  )
  def f20(v0: Double): Double = {
    var v2: Double = v0
    var v4: Double = v2
    var v1: Double = v0
    var v6: Double = v0
    var v3: Double = v2
    var v8: Double = v6
    var v11: Double = v2
    var v7: Double = v8
    val v15: Vector[Double] = Vector(v8, v7, v11, v6, v3, v4, v1)
    var v14: Vector[Double] = v15
    val v12: Double = v15(6)
    v14 = v14.updated(1, v1)
    v7 = v12
    v14 = v14.updated(5, v7)
    val v19: Vector[Vector[Double]] = Vector(v15, v15, v14)
    val v17: Vector[Double] = v19(0)
    val v25: Double = v17(5)
    v3 = v2
    v8 = v4
    v14 = v14.updated(3, v7)
    v25
  }
  @noinline
  def f0(v0: Vector[s0], v1: s8, v2: Double, v3: Vector[Vector[s5]]): Double = {
    val v14: Double = f20(v2)
    val v26: Double = f20(v14)
    val v33: Double = f20(v14)
    val v136: Double = v26 - v33
    val v133: Double = f20(v136)
    v133
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0))), s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))))
    val v1: s8 = s8(Vector(Vector(s6(s1(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0))), Vector(s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0))))), s3(s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))), Vector(s2(Vector(Vector(s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0)))), Vector(s0(Vector(Vector(28.0)), Vector(Vector(29.0), Vector(30.0), Vector(31.0))))), s1(s0(Vector(Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0))), Vector(s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0)))))))))), Vector(s6(s1(s0(Vector(Vector(40.0)), Vector(Vector(41.0), Vector(42.0), Vector(43.0))), Vector(s0(Vector(Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0))))), s3(s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0), Vector(51.0))), Vector(s2(Vector(Vector(s0(Vector(Vector(52.0)), Vector(Vector(53.0), Vector(54.0), Vector(55.0)))), Vector(s0(Vector(Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0))))), s1(s0(Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0), Vector(63.0))), Vector(s0(Vector(Vector(64.0)), Vector(Vector(65.0), Vector(66.0), Vector(67.0))))))))))), s5(s3(s0(Vector(Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0))), Vector(s2(Vector(Vector(s0(Vector(Vector(72.0)), Vector(Vector(73.0), Vector(74.0), Vector(75.0)))), Vector(s0(Vector(Vector(76.0)), Vector(Vector(77.0), Vector(78.0), Vector(79.0))))), s1(s0(Vector(Vector(80.0)), Vector(Vector(81.0), Vector(82.0), Vector(83.0))), Vector(s0(Vector(Vector(84.0)), Vector(Vector(85.0), Vector(86.0), Vector(87.0)))))))), s4(s2(Vector(Vector(s0(Vector(Vector(88.0)), Vector(Vector(89.0), Vector(90.0), Vector(91.0)))), Vector(s0(Vector(Vector(92.0)), Vector(Vector(93.0), Vector(94.0), Vector(95.0))))), s1(s0(Vector(Vector(96.0)), Vector(Vector(97.0), Vector(98.0), Vector(99.0))), Vector(s0(Vector(Vector(100.0)), Vector(Vector(101.0), Vector(102.0), Vector(103.0)))))), s0(Vector(Vector(104.0)), Vector(Vector(105.0), Vector(106.0), Vector(107.0))))))
    val v2: Double = 108.0
    val v3: Vector[Vector[s5]] = Vector(Vector(s5(s3(s0(Vector(Vector(109.0)), Vector(Vector(110.0), Vector(111.0), Vector(112.0))), Vector(s2(Vector(Vector(s0(Vector(Vector(113.0)), Vector(Vector(114.0), Vector(115.0), Vector(116.0)))), Vector(s0(Vector(Vector(117.0)), Vector(Vector(118.0), Vector(119.0), Vector(120.0))))), s1(s0(Vector(Vector(121.0)), Vector(Vector(122.0), Vector(123.0), Vector(124.0))), Vector(s0(Vector(Vector(125.0)), Vector(Vector(126.0), Vector(127.0), Vector(128.0)))))))), s4(s2(Vector(Vector(s0(Vector(Vector(129.0)), Vector(Vector(130.0), Vector(131.0), Vector(132.0)))), Vector(s0(Vector(Vector(133.0)), Vector(Vector(134.0), Vector(135.0), Vector(136.0))))), s1(s0(Vector(Vector(137.0)), Vector(Vector(138.0), Vector(139.0), Vector(140.0))), Vector(s0(Vector(Vector(141.0)), Vector(Vector(142.0), Vector(143.0), Vector(144.0)))))), s0(Vector(Vector(145.0)), Vector(Vector(146.0), Vector(147.0), Vector(148.0)))))), Vector(s5(s3(s0(Vector(Vector(149.0)), Vector(Vector(150.0), Vector(151.0), Vector(152.0))), Vector(s2(Vector(Vector(s0(Vector(Vector(153.0)), Vector(Vector(154.0), Vector(155.0), Vector(156.0)))), Vector(s0(Vector(Vector(157.0)), Vector(Vector(158.0), Vector(159.0), Vector(160.0))))), s1(s0(Vector(Vector(161.0)), Vector(Vector(162.0), Vector(163.0), Vector(164.0))), Vector(s0(Vector(Vector(165.0)), Vector(Vector(166.0), Vector(167.0), Vector(168.0)))))))), s4(s2(Vector(Vector(s0(Vector(Vector(169.0)), Vector(Vector(170.0), Vector(171.0), Vector(172.0)))), Vector(s0(Vector(Vector(173.0)), Vector(Vector(174.0), Vector(175.0), Vector(176.0))))), s1(s0(Vector(Vector(177.0)), Vector(Vector(178.0), Vector(179.0), Vector(180.0))), Vector(s0(Vector(Vector(181.0)), Vector(Vector(182.0), Vector(183.0), Vector(184.0)))))), s0(Vector(Vector(185.0)), Vector(Vector(186.0), Vector(187.0), Vector(188.0)))))), Vector(s5(s3(s0(Vector(Vector(189.0)), Vector(Vector(190.0), Vector(191.0), Vector(192.0))), Vector(s2(Vector(Vector(s0(Vector(Vector(193.0)), Vector(Vector(194.0), Vector(195.0), Vector(196.0)))), Vector(s0(Vector(Vector(197.0)), Vector(Vector(198.0), Vector(199.0), Vector(200.0))))), s1(s0(Vector(Vector(201.0)), Vector(Vector(202.0), Vector(203.0), Vector(204.0))), Vector(s0(Vector(Vector(205.0)), Vector(Vector(206.0), Vector(207.0), Vector(208.0)))))))), s4(s2(Vector(Vector(s0(Vector(Vector(209.0)), Vector(Vector(210.0), Vector(211.0), Vector(212.0)))), Vector(s0(Vector(Vector(213.0)), Vector(Vector(214.0), Vector(215.0), Vector(216.0))))), s1(s0(Vector(Vector(217.0)), Vector(Vector(218.0), Vector(219.0), Vector(220.0))), Vector(s0(Vector(Vector(221.0)), Vector(Vector(222.0), Vector(223.0), Vector(224.0)))))), s0(Vector(Vector(225.0)), Vector(Vector(226.0), Vector(227.0), Vector(228.0)))))))
    val start = nanoTime()
    var result: Double = [[StructValue(Name(str='s5', ty=None), [StructValue(Name(str='s3', ty=None), [StructValue(Name(str='s0', ty=None), [[[109.0]], [[110.0], [111.0], [112.0]]]), [StructValue(Name(str='s2', ty=None), [[[StructValue(Name(str='s0', ty=None), [[[113.0]], [[114.0], [115.0], [116.0]]])], [StructValue(Name(str='s0', ty=None), [[[117.0]], [[118.0], [119.0], [120.0]]])]], StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[121.0]], [[122.0], [123.0], [124.0]]]), [StructValue(Name(str='s0', ty=None), [[[125.0]], [[126.0], [127.0], [128.0]]])]])])]]), StructValue(Name(str='s4', ty=None), [StructValue(Name(str='s2', ty=None), [[[StructValue(Name(str='s0', ty=None), [[[129.0]], [[130.0], [131.0], [132.0]]])], [StructValue(Name(str='s0', ty=None), [[[133.0]], [[134.0], [135.0], [136.0]]])]], StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[137.0]], [[138.0], [139.0], [140.0]]]), [StructValue(Name(str='s0', ty=None), [[[141.0]], [[142.0], [143.0], [144.0]]])]])]), StructValue(Name(str='s0', ty=None), [[[145.0]], [[146.0], [147.0], [148.0]]])])])], [StructValue(Name(str='s5', ty=None), [StructValue(Name(str='s3', ty=None), [StructValue(Name(str='s0', ty=None), [[[149.0]], [[150.0], [151.0], [152.0]]]), [StructValue(Name(str='s2', ty=None), [[[StructValue(Name(str='s0', ty=None), [[[153.0]], [[154.0], [155.0], [156.0]]])], [StructValue(Name(str='s0', ty=None), [[[157.0]], [[158.0], [159.0], [160.0]]])]], StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[161.0]], [[162.0], [163.0], [164.0]]]), [StructValue(Name(str='s0', ty=None), [[[165.0]], [[166.0], [167.0], [168.0]]])]])])]]), StructValue(Name(str='s4', ty=None), [StructValue(Name(str='s2', ty=None), [[[StructValue(Name(str='s0', ty=None), [[[169.0]], [[170.0], [171.0], [172.0]]])], [StructValue(Name(str='s0', ty=None), [[[173.0]], [[174.0], [175.0], [176.0]]])]], StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[177.0]], [[178.0], [179.0], [180.0]]]), [StructValue(Name(str='s0', ty=None), [[[181.0]], [[182.0], [183.0], [184.0]]])]])]), StructValue(Name(str='s0', ty=None), [[[185.0]], [[186.0], [187.0], [188.0]]])])])], [StructValue(Name(str='s5', ty=None), [StructValue(Name(str='s3', ty=None), [StructValue(Name(str='s0', ty=None), [[[189.0]], [[190.0], [191.0], [192.0]]]), [StructValue(Name(str='s2', ty=None), [[[StructValue(Name(str='s0', ty=None), [[[193.0]], [[194.0], [195.0], [196.0]]])], [StructValue(Name(str='s0', ty=None), [[[197.0]], [[198.0], [199.0], [200.0]]])]], StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[201.0]], [[202.0], [203.0], [204.0]]]), [StructValue(Name(str='s0', ty=None), [[[205.0]], [[206.0], [207.0], [208.0]]])]])])]]), StructValue(Name(str='s4', ty=None), [StructValue(Name(str='s2', ty=None), [[[StructValue(Name(str='s0', ty=None), [[[209.0]], [[210.0], [211.0], [212.0]]])], [StructValue(Name(str='s0', ty=None), [[[213.0]], [[214.0], [215.0], [216.0]]])]], StructValue(Name(str='s1', ty=None), [StructValue(Name(str='s0', ty=None), [[[217.0]], [[218.0], [219.0], [220.0]]]), [StructValue(Name(str='s0', ty=None), [[[221.0]], [[222.0], [223.0], [224.0]]])]])]), StructValue(Name(str='s0', ty=None), [[[225.0]], [[226.0], [227.0], [228.0]]])])])]]
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}