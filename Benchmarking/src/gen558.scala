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
  case class s3 (
    p0: Vector[s0]
  )
  case class s4 (
    p0: Vector[s1],
    p1: s0
  )
  case class s6 (
    p0: Vector[Vector[s1]],
    p1: Vector[Vector[s1]]
  )
  case class s7 (
    p0: s3,
    p1: s6
  )
  def f7(v0: Double): Double = {
    val v1: Vector[Double] = Vector(v0, v0, v0, v0)
    var v4: Vector[Double] = v1
    var v3: Double = v0
    val v6: Double = v1(3)
    var v8: Vector[Double] = v4
    v3 = v0
    var v5: Vector[Double] = v4
    val v2: Double = v3 / v6
    v4 = v4.updated(2, v0)
    v8 = v8.updated(1, v2)
    val v11: Double = v4(3)
    var v14: Double = v11
    val v18: Double = v5(2)
    v4 = v4.updated(0, v3)
    val v9: Double = v1(2)
    v4 = v4.updated(2, v18)
    var v23: Double = v14
    v4 = v4.updated(3, v2)
    v8 = v5
    var v35: Vector[Double] = v5
    val v10: Double = v35(3)
    var v16: Double = v23
    val v32: Vector[Double] = Vector(v23, v6)
    val v21: Double = v16 * v23
    var v22: Double = v10
    v5 = v5.updated(2, v11)
    v5 = v5.updated(2, v11)
    var v36: Vector[Double] = v32
    val v24: Double = v8(3)
    var v31: Vector[Double] = v36
    val v52: Double = v31(0)
    v5 = v5.updated(1, v24)
    var v45: Vector[Double] = v36
    var v66: Vector[Double] = v45
    val v44: Vector[Vector[Double]] = Vector(v66, v36)
    val v46: Vector[Double] = v44(0)
    v31 = v31.updated(1, v21)
    var v41: Vector[Vector[Double]] = v44
    v4 = v4.updated(1, v52)
    v4 = v4.updated(3, v9)
    val v139: Vector[Vector[Vector[Double]]] = Vector(v41, v44, v41, v41, v41)
    val v143: Double = v46(0)
    v23 = v21
    v8 = v8.updated(1, v22)
    var v132: Vector[Double] = v1
    val v72: Vector[Vector[Double]] = v139(2)
    val v85: Vector[Double] = v72(1)
    v4 = v4.updated(2, v18)
    val v167: Double = v85(0)
    v8 = v132
    var v150: Double = v167
    v31 = v31.updated(1, v143)
    v150
  }
  @noinline
  def f0(v0: Vector[s7], v1: s1, v2: Vector[s7], v3: Vector[s4], v4: Vector[Vector[s0]], v5: s3, v6: Double): Double = {
    val v20: Vector[s0] = v5.p0
    val v17: Double = f7(v6)
    var v50: Double = v17
    var v77: Vector[s0] = v20
    val v56: s0 = v77(1)
    val v99: Vector[Vector[Double]] = v56.p0
    val v71: Vector[Double] = v99(1)
    val v113: Double = v71(0)
    val v64: Double = v113 + v50
    var v107: Double = v64
    v107
  }
  def benchmark(): Unit = {
    val v0: Vector[s7] = Vector(s7(s3(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0))))), s6(Vector(Vector(s1(Vector(s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0)))), s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0))))), Vector(s1(Vector(s0(Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0)))), s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0))))), Vector(s1(Vector(s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0), Vector(27.0)))), s0(Vector(Vector(28.0), Vector(29.0)), Vector(Vector(30.0), Vector(31.0)))))), Vector(Vector(s1(Vector(s0(Vector(Vector(32.0), Vector(33.0)), Vector(Vector(34.0), Vector(35.0)))), s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0)))))))), s7(s3(Vector(s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0))), s0(Vector(Vector(44.0), Vector(45.0)), Vector(Vector(46.0), Vector(47.0))))), s6(Vector(Vector(s1(Vector(s0(Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0), Vector(51.0)))), s0(Vector(Vector(52.0), Vector(53.0)), Vector(Vector(54.0), Vector(55.0))))), Vector(s1(Vector(s0(Vector(Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0)))), s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0), Vector(63.0))))), Vector(s1(Vector(s0(Vector(Vector(64.0), Vector(65.0)), Vector(Vector(66.0), Vector(67.0)))), s0(Vector(Vector(68.0), Vector(69.0)), Vector(Vector(70.0), Vector(71.0)))))), Vector(Vector(s1(Vector(s0(Vector(Vector(72.0), Vector(73.0)), Vector(Vector(74.0), Vector(75.0)))), s0(Vector(Vector(76.0), Vector(77.0)), Vector(Vector(78.0), Vector(79.0)))))))))
    val v1: s1 = s1(Vector(s0(Vector(Vector(80.0), Vector(81.0)), Vector(Vector(82.0), Vector(83.0)))), s0(Vector(Vector(84.0), Vector(85.0)), Vector(Vector(86.0), Vector(87.0))))
    val v2: Vector[s7] = Vector(s7(s3(Vector(s0(Vector(Vector(88.0), Vector(89.0)), Vector(Vector(90.0), Vector(91.0))), s0(Vector(Vector(92.0), Vector(93.0)), Vector(Vector(94.0), Vector(95.0))))), s6(Vector(Vector(s1(Vector(s0(Vector(Vector(96.0), Vector(97.0)), Vector(Vector(98.0), Vector(99.0)))), s0(Vector(Vector(100.0), Vector(101.0)), Vector(Vector(102.0), Vector(103.0))))), Vector(s1(Vector(s0(Vector(Vector(104.0), Vector(105.0)), Vector(Vector(106.0), Vector(107.0)))), s0(Vector(Vector(108.0), Vector(109.0)), Vector(Vector(110.0), Vector(111.0))))), Vector(s1(Vector(s0(Vector(Vector(112.0), Vector(113.0)), Vector(Vector(114.0), Vector(115.0)))), s0(Vector(Vector(116.0), Vector(117.0)), Vector(Vector(118.0), Vector(119.0)))))), Vector(Vector(s1(Vector(s0(Vector(Vector(120.0), Vector(121.0)), Vector(Vector(122.0), Vector(123.0)))), s0(Vector(Vector(124.0), Vector(125.0)), Vector(Vector(126.0), Vector(127.0)))))))), s7(s3(Vector(s0(Vector(Vector(128.0), Vector(129.0)), Vector(Vector(130.0), Vector(131.0))), s0(Vector(Vector(132.0), Vector(133.0)), Vector(Vector(134.0), Vector(135.0))))), s6(Vector(Vector(s1(Vector(s0(Vector(Vector(136.0), Vector(137.0)), Vector(Vector(138.0), Vector(139.0)))), s0(Vector(Vector(140.0), Vector(141.0)), Vector(Vector(142.0), Vector(143.0))))), Vector(s1(Vector(s0(Vector(Vector(144.0), Vector(145.0)), Vector(Vector(146.0), Vector(147.0)))), s0(Vector(Vector(148.0), Vector(149.0)), Vector(Vector(150.0), Vector(151.0))))), Vector(s1(Vector(s0(Vector(Vector(152.0), Vector(153.0)), Vector(Vector(154.0), Vector(155.0)))), s0(Vector(Vector(156.0), Vector(157.0)), Vector(Vector(158.0), Vector(159.0)))))), Vector(Vector(s1(Vector(s0(Vector(Vector(160.0), Vector(161.0)), Vector(Vector(162.0), Vector(163.0)))), s0(Vector(Vector(164.0), Vector(165.0)), Vector(Vector(166.0), Vector(167.0)))))))))
    val v3: Vector[s4] = Vector(s4(Vector(s1(Vector(s0(Vector(Vector(168.0), Vector(169.0)), Vector(Vector(170.0), Vector(171.0)))), s0(Vector(Vector(172.0), Vector(173.0)), Vector(Vector(174.0), Vector(175.0)))), s1(Vector(s0(Vector(Vector(176.0), Vector(177.0)), Vector(Vector(178.0), Vector(179.0)))), s0(Vector(Vector(180.0), Vector(181.0)), Vector(Vector(182.0), Vector(183.0))))), s0(Vector(Vector(184.0), Vector(185.0)), Vector(Vector(186.0), Vector(187.0)))), s4(Vector(s1(Vector(s0(Vector(Vector(188.0), Vector(189.0)), Vector(Vector(190.0), Vector(191.0)))), s0(Vector(Vector(192.0), Vector(193.0)), Vector(Vector(194.0), Vector(195.0)))), s1(Vector(s0(Vector(Vector(196.0), Vector(197.0)), Vector(Vector(198.0), Vector(199.0)))), s0(Vector(Vector(200.0), Vector(201.0)), Vector(Vector(202.0), Vector(203.0))))), s0(Vector(Vector(204.0), Vector(205.0)), Vector(Vector(206.0), Vector(207.0)))))
    val v4: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(208.0), Vector(209.0)), Vector(Vector(210.0), Vector(211.0)))), Vector(s0(Vector(Vector(212.0), Vector(213.0)), Vector(Vector(214.0), Vector(215.0)))), Vector(s0(Vector(Vector(216.0), Vector(217.0)), Vector(Vector(218.0), Vector(219.0)))))
    val v5: s3 = s3(Vector(s0(Vector(Vector(220.0), Vector(221.0)), Vector(Vector(222.0), Vector(223.0))), s0(Vector(Vector(224.0), Vector(225.0)), Vector(Vector(226.0), Vector(227.0)))))
    val v6: Double = 228.0
    val start = nanoTime()
    var result: Double = 228.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4, v5, v6)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}