import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[Vector[s0]]
  )
  case class s2 (
    p0: s1
  )
  case class s3 (
    p0: s0,
    p1: s1
  )
  case class s4 (
    p0: s0,
    p1: Vector[s1]
  )
  case class s7 (
    p0: Vector[s0],
    p1: Vector[Vector[s3]]
  )
  case class s8 (
    p0: Vector[s2],
    p1: s4
  )
  def f52(v0: Vector[Vector[s1]]): Vector[Vector[s1]] = {
    var v4: Vector[Vector[s1]] = v0
    val v2: Vector[s1] = v0(2)
    v4 = v4.updated(2, v2)
    var v1: Vector[s1] = v2
    val v7: Vector[Vector[s1]] = Vector(v1, v1, v2)
    val v3: Vector[Vector[s1]] = Vector(v1, v1, v2, v2, v2, v1, v1)
    var v13: Vector[Vector[s1]] = v3
    val v12: Vector[s1] = v4(0)
    var v15: Vector[Vector[s1]] = v7
    val v8: Vector[s1] = v13(6)
    val v14: s1 = v12(0)
    val v17: Vector[s1] = v13(0)
    v13 = v13.updated(1, v2)
    val v30: Vector[Vector[s0]] = v14.p1
    var v9: s1 = v14
    val v19: Vector[Vector[s0]] = v9.p1
    val v18: Vector[s1] = v13(0)
    var v22: Vector[s1] = v17
    v15 = v15.updated(0, v18)
    v1 = v1.updated(0, v9)
    val v21: Vector[s0] = v19(0)
    val v59: Vector[s0] = v14.p0
    val v42: s1 = s1(v59, v30)
    var v23: Vector[s1] = v18
    var v32: Vector[s0] = v59
    var v33: Vector[Vector[s0]] = v19
    v1 = v1.updated(0, v42)
    var v29: s1 = v9
    val v44: Vector[Vector[s0]] = v42.p1
    v29 = v29.copy(p0 = v59)
    val v28: s1 = v18(0)
    var v47: Vector[Vector[s0]] = v30
    var v58: s1 = v14
    val v41: s1 = v23(0)
    v29 = v29.copy(p0 = v32)
    var v51: Vector[Vector[s0]] = v19
    v9 = v9.copy(p1 = v51)
    var v56: Vector[Vector[s1]] = v15
    v47 = v44
    v15 = v15.updated(1, v8)
    v23 = v23.updated(0, v58)
    v29 = v29.copy(p1 = v44)
    val v60: Vector[s0] = v33(0)
    v4 = v4.updated(0, v1)
    val v63: Vector[s0] = v44(2)
    val v73: Vector[s0] = v28.p0
    val v54: Vector[s0] = v44(2)
    val v78: Vector[Vector[s0]] = v41.p1
    v15 = v15.updated(2, v2)
    v58 = v58.copy(p0 = v60)
    v58 = v58.copy(p0 = v63)
    val v112: Vector[Vector[s0]] = v29.p1
    v58 = v58.copy(p1 = v44)
    v1 = v1.updated(0, v42)
    v33 = v33.updated(2, v21)
    v58 = v42
    v58 = v58.copy(p1 = v112)
    val v97: s1 = s1(v54, v78)
    v33 = v47
    v9 = v9.copy(p1 = v78)
    v23 = v23.updated(0, v97)
    v56 = v56.updated(1, v22)
    v29 = v29.copy(p0 = v60)
    v15 = v15.updated(1, v18)
    v58 = v58.copy(p0 = v73)
    v4 = v4.updated(1, v2)
    v29 = v29.copy(p0 = v32)
    v1 = v1.updated(0, v58)
    v56
  }
  @noinline
  def f0(v0: Vector[Vector[s1]], v1: Double, v2: Vector[s8], v3: Vector[s7]): Double = {
    val v10: Vector[Vector[s1]] = f52(v0)
    val v21: Vector[s1] = v10(0)
    val v27: s1 = v21(0)
    val v22: Vector[s0] = v27.p0
    val v74: s0 = v22(0)
    val v69: Vector[Vector[Double]] = v74.p1
    val v65: Vector[Double] = v69(0)
    val v55: Double = v65(0)
    v55
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s1]] = Vector(Vector(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0)))), Vector(Vector(s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0)))), Vector(s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0)))), Vector(s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0))))))), Vector(s1(Vector(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0)))), Vector(Vector(s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0)))), Vector(s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0)))), Vector(s0(Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0))))))), Vector(s1(Vector(s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0)))), Vector(Vector(s0(Vector(Vector(27.0), Vector(28.0)), Vector(Vector(29.0)))), Vector(s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0)))), Vector(s0(Vector(Vector(33.0), Vector(34.0)), Vector(Vector(35.0))))))))
    val v1: Double = 36.0
    val v2: Vector[s8] = Vector(s8(Vector(s2(s1(Vector(s0(Vector(Vector(37.0), Vector(38.0)), Vector(Vector(39.0)))), Vector(Vector(s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0)))), Vector(s0(Vector(Vector(43.0), Vector(44.0)), Vector(Vector(45.0)))), Vector(s0(Vector(Vector(46.0), Vector(47.0)), Vector(Vector(48.0)))))))), s4(s0(Vector(Vector(49.0), Vector(50.0)), Vector(Vector(51.0))), Vector(s1(Vector(s0(Vector(Vector(52.0), Vector(53.0)), Vector(Vector(54.0)))), Vector(Vector(s0(Vector(Vector(55.0), Vector(56.0)), Vector(Vector(57.0)))), Vector(s0(Vector(Vector(58.0), Vector(59.0)), Vector(Vector(60.0)))), Vector(s0(Vector(Vector(61.0), Vector(62.0)), Vector(Vector(63.0)))))), s1(Vector(s0(Vector(Vector(64.0), Vector(65.0)), Vector(Vector(66.0)))), Vector(Vector(s0(Vector(Vector(67.0), Vector(68.0)), Vector(Vector(69.0)))), Vector(s0(Vector(Vector(70.0), Vector(71.0)), Vector(Vector(72.0)))), Vector(s0(Vector(Vector(73.0), Vector(74.0)), Vector(Vector(75.0)))))), s1(Vector(s0(Vector(Vector(76.0), Vector(77.0)), Vector(Vector(78.0)))), Vector(Vector(s0(Vector(Vector(79.0), Vector(80.0)), Vector(Vector(81.0)))), Vector(s0(Vector(Vector(82.0), Vector(83.0)), Vector(Vector(84.0)))), Vector(s0(Vector(Vector(85.0), Vector(86.0)), Vector(Vector(87.0))))))))), s8(Vector(s2(s1(Vector(s0(Vector(Vector(88.0), Vector(89.0)), Vector(Vector(90.0)))), Vector(Vector(s0(Vector(Vector(91.0), Vector(92.0)), Vector(Vector(93.0)))), Vector(s0(Vector(Vector(94.0), Vector(95.0)), Vector(Vector(96.0)))), Vector(s0(Vector(Vector(97.0), Vector(98.0)), Vector(Vector(99.0)))))))), s4(s0(Vector(Vector(100.0), Vector(101.0)), Vector(Vector(102.0))), Vector(s1(Vector(s0(Vector(Vector(103.0), Vector(104.0)), Vector(Vector(105.0)))), Vector(Vector(s0(Vector(Vector(106.0), Vector(107.0)), Vector(Vector(108.0)))), Vector(s0(Vector(Vector(109.0), Vector(110.0)), Vector(Vector(111.0)))), Vector(s0(Vector(Vector(112.0), Vector(113.0)), Vector(Vector(114.0)))))), s1(Vector(s0(Vector(Vector(115.0), Vector(116.0)), Vector(Vector(117.0)))), Vector(Vector(s0(Vector(Vector(118.0), Vector(119.0)), Vector(Vector(120.0)))), Vector(s0(Vector(Vector(121.0), Vector(122.0)), Vector(Vector(123.0)))), Vector(s0(Vector(Vector(124.0), Vector(125.0)), Vector(Vector(126.0)))))), s1(Vector(s0(Vector(Vector(127.0), Vector(128.0)), Vector(Vector(129.0)))), Vector(Vector(s0(Vector(Vector(130.0), Vector(131.0)), Vector(Vector(132.0)))), Vector(s0(Vector(Vector(133.0), Vector(134.0)), Vector(Vector(135.0)))), Vector(s0(Vector(Vector(136.0), Vector(137.0)), Vector(Vector(138.0))))))))))
    val v3: Vector[s7] = Vector(s7(Vector(s0(Vector(Vector(139.0), Vector(140.0)), Vector(Vector(141.0))), s0(Vector(Vector(142.0), Vector(143.0)), Vector(Vector(144.0))), s0(Vector(Vector(145.0), Vector(146.0)), Vector(Vector(147.0)))), Vector(Vector(s3(s0(Vector(Vector(148.0), Vector(149.0)), Vector(Vector(150.0))), s1(Vector(s0(Vector(Vector(151.0), Vector(152.0)), Vector(Vector(153.0)))), Vector(Vector(s0(Vector(Vector(154.0), Vector(155.0)), Vector(Vector(156.0)))), Vector(s0(Vector(Vector(157.0), Vector(158.0)), Vector(Vector(159.0)))), Vector(s0(Vector(Vector(160.0), Vector(161.0)), Vector(Vector(162.0)))))))), Vector(s3(s0(Vector(Vector(163.0), Vector(164.0)), Vector(Vector(165.0))), s1(Vector(s0(Vector(Vector(166.0), Vector(167.0)), Vector(Vector(168.0)))), Vector(Vector(s0(Vector(Vector(169.0), Vector(170.0)), Vector(Vector(171.0)))), Vector(s0(Vector(Vector(172.0), Vector(173.0)), Vector(Vector(174.0)))), Vector(s0(Vector(Vector(175.0), Vector(176.0)), Vector(Vector(177.0)))))))))), s7(Vector(s0(Vector(Vector(178.0), Vector(179.0)), Vector(Vector(180.0))), s0(Vector(Vector(181.0), Vector(182.0)), Vector(Vector(183.0))), s0(Vector(Vector(184.0), Vector(185.0)), Vector(Vector(186.0)))), Vector(Vector(s3(s0(Vector(Vector(187.0), Vector(188.0)), Vector(Vector(189.0))), s1(Vector(s0(Vector(Vector(190.0), Vector(191.0)), Vector(Vector(192.0)))), Vector(Vector(s0(Vector(Vector(193.0), Vector(194.0)), Vector(Vector(195.0)))), Vector(s0(Vector(Vector(196.0), Vector(197.0)), Vector(Vector(198.0)))), Vector(s0(Vector(Vector(199.0), Vector(200.0)), Vector(Vector(201.0)))))))), Vector(s3(s0(Vector(Vector(202.0), Vector(203.0)), Vector(Vector(204.0))), s1(Vector(s0(Vector(Vector(205.0), Vector(206.0)), Vector(Vector(207.0)))), Vector(Vector(s0(Vector(Vector(208.0), Vector(209.0)), Vector(Vector(210.0)))), Vector(s0(Vector(Vector(211.0), Vector(212.0)), Vector(Vector(213.0)))), Vector(s0(Vector(Vector(214.0), Vector(215.0)), Vector(Vector(216.0)))))))))))
    val start = nanoTime()
    var result: Double = [StructValue(Name(str='s7', ty=None), [[StructValue(Name(str='s0', ty=None), [[[139.0], [140.0]], [[141.0]]]), StructValue(Name(str='s0', ty=None), [[[142.0], [143.0]], [[144.0]]]), StructValue(Name(str='s0', ty=None), [[[145.0], [146.0]], [[147.0]]])], [[StructValue(Name(str='s3', ty=None), [StructValue(Name(str='s0', ty=None), [[[148.0], [149.0]], [[150.0]]]), StructValue(Name(str='s1', ty=None), [[StructValue(Name(str='s0', ty=None), [[[151.0], [152.0]], [[153.0]]])], [[StructValue(Name(str='s0', ty=None), [[[154.0], [155.0]], [[156.0]]])], [StructValue(Name(str='s0', ty=None), [[[157.0], [158.0]], [[159.0]]])], [StructValue(Name(str='s0', ty=None), [[[160.0], [161.0]], [[162.0]]])]]])])], [StructValue(Name(str='s3', ty=None), [StructValue(Name(str='s0', ty=None), [[[163.0], [164.0]], [[165.0]]]), StructValue(Name(str='s1', ty=None), [[StructValue(Name(str='s0', ty=None), [[[166.0], [167.0]], [[168.0]]])], [[StructValue(Name(str='s0', ty=None), [[[169.0], [170.0]], [[171.0]]])], [StructValue(Name(str='s0', ty=None), [[[172.0], [173.0]], [[174.0]]])], [StructValue(Name(str='s0', ty=None), [[[175.0], [176.0]], [[177.0]]])]]])])]]]), StructValue(Name(str='s7', ty=None), [[StructValue(Name(str='s0', ty=None), [[[178.0], [179.0]], [[180.0]]]), StructValue(Name(str='s0', ty=None), [[[181.0], [182.0]], [[183.0]]]), StructValue(Name(str='s0', ty=None), [[[184.0], [185.0]], [[186.0]]])], [[StructValue(Name(str='s3', ty=None), [StructValue(Name(str='s0', ty=None), [[[187.0], [188.0]], [[189.0]]]), StructValue(Name(str='s1', ty=None), [[StructValue(Name(str='s0', ty=None), [[[190.0], [191.0]], [[192.0]]])], [[StructValue(Name(str='s0', ty=None), [[[193.0], [194.0]], [[195.0]]])], [StructValue(Name(str='s0', ty=None), [[[196.0], [197.0]], [[198.0]]])], [StructValue(Name(str='s0', ty=None), [[[199.0], [200.0]], [[201.0]]])]]])])], [StructValue(Name(str='s3', ty=None), [StructValue(Name(str='s0', ty=None), [[[202.0], [203.0]], [[204.0]]]), StructValue(Name(str='s1', ty=None), [[StructValue(Name(str='s0', ty=None), [[[205.0], [206.0]], [[207.0]]])], [[StructValue(Name(str='s0', ty=None), [[[208.0], [209.0]], [[210.0]]])], [StructValue(Name(str='s0', ty=None), [[[211.0], [212.0]], [[213.0]]])], [StructValue(Name(str='s0', ty=None), [[[214.0], [215.0]], [[216.0]]])]]])])]]])]
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}