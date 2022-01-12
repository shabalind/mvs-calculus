import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  case class s3 (
    p0: s0,
    p1: s0
  )
  case class s4 (
    p0: Vector[s1],
    p1: Vector[Vector[s3]]
  )
  case class s6 (
    p0: Vector[s0],
    p1: Vector[Vector[s4]]
  )
  case class s7 (
    p0: Vector[s6],
    p1: s3
  )
  case class s9 (
    p0: Vector[Double],
    p1: Vector[s6]
  )
  case class s10 (
    p0: Vector[Vector[s1]],
    p1: Vector[s9]
  )
  def f11(v0: s3): s3 = {
    val v2: s0 = v0.p0
    var v7: s3 = v0
    val v8: s0 = v7.p0
    var v9: s3 = v7
    val v1: Vector[Vector[Double]] = v8.p0
    val v3: s0 = v7.p0
    val v5: Vector[Double] = v1(0)
    var v6: Vector[Double] = v5
    v9 = v9.copy(p1 = v8)
    v9 = v9.copy(p0 = v8)
    var v12: s0 = v8
    val v14: Double = v5(0)
    val v10: Vector[Vector[Double]] = v3.p0
    var v16: Double = v14
    var v4: Vector[Vector[Double]] = v1
    val v20: Vector[Double] = v10(0)
    v7 = v7.copy(p1 = v12)
    var v15: s0 = v2
    v4 = v4.updated(0, v20)
    val v13: s3 = s3(v15, v15)
    v9 = v9.copy(p0 = v15)
    var v17: Double = v16
    val v30: Vector[Vector[Double]] = v15.p0
    val v51: Vector[s3] = Vector(v9, v9, v9, v9)
    v12 = v12.copy(p0 = v30)
    v7 = v7.copy(p0 = v15)
    var v24: s3 = v13
    v6 = v6.updated(0, v14)
    var v40: Vector[Double] = v6
    val v29: s3 = v51(3)
    val v26: s0 = v13.p1
    var v22: Vector[s3] = v51
    val v42: s0 = v0.p0
    v15 = v15.copy(p0 = v10)
    val v32: s0 = v29.p0
    var v43: s3 = v0
    var v28: s3 = v24
    var v46: Double = v16
    var v58: Vector[s3] = v51
    var v44: Vector[Double] = v40
    val v61: s0 = v0.p0
    v40 = v40.updated(0, v46)
    var v72: s3 = v0
    v44 = v44.updated(0, v17)
    var v48: Vector[s3] = v22
    val v50: s3 = s3(v15, v12)
    var v59: Vector[s3] = v58
    var v45: Vector[Vector[Double]] = v1
    v43 = v43.copy(p0 = v32)
    val v41: Vector[Vector[Double]] = v3.p0
    v45 = v4
    v9 = v9.copy(p1 = v61)
    v58 = v58.updated(1, v72)
    val v37: s3 = v59(0)
    v4 = v4.updated(0, v44)
    v24 = v24.copy(p0 = v3)
    var v113: Vector[s3] = v48
    var v62: s3 = v29
    v62 = v62.copy(p1 = v61)
    val v89: s3 = v48(2)
    v113 = v113.updated(0, v89)
    var v125: Vector[s3] = v113
    v7 = v7.copy(p0 = v42)
    v113 = v113.updated(1, v37)
    v6 = v6.updated(0, v14)
    val v63: s0 = v24.p1
    v9 = v9.copy(p1 = v63)
    val v274: s3 = v125(2)
    v113 = v113.updated(1, v62)
    v62 = v62.copy(p1 = v42)
    val v153: Vector[Vector[Double]] = v26.p0
    v12 = v12.copy(p0 = v4)
    v12 = v12.copy(p0 = v153)
    v15 = v15.copy(p0 = v45)
    v15 = v15.copy(p0 = v41)
    v9 = v50
    v58 = v58.updated(3, v28)
    v125 = v125.updated(0, v13)
    v72 = v72.copy(p1 = v32)
    v58 = v58.updated(3, v43)
    v274
  }
  @noinline
  def f0(v0: s3, v1: Vector[Vector[s10]], v2: Vector[s7], v3: Double): Double = {
    val v10: s3 = f11(v0)
    val v8: s0 = v10.p0
    val v11: Vector[s0] = Vector(v8, v8, v8, v8, v8, v8)
    val v9: s0 = v11(2)
    val v30: Double = v3 * v3
    val v52: Vector[Vector[Double]] = v9.p0
    val v49: Vector[Double] = v52(0)
    val v87: Double = v49(0)
    val v152: Double = v30 - v87
    var v114: Double = v152
    v114
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(s0(Vector(Vector(0.0))), s0(Vector(Vector(1.0))))
    val v1: Vector[Vector[s10]] = Vector(Vector(s10(Vector(Vector(s1(Vector(s0(Vector(Vector(2.0))), s0(Vector(Vector(3.0)))), s0(Vector(Vector(4.0)))))), Vector(s9(Vector(5.0), Vector(s6(Vector(s0(Vector(Vector(6.0))), s0(Vector(Vector(7.0)))), Vector(Vector(s4(Vector(s1(Vector(s0(Vector(Vector(8.0))), s0(Vector(Vector(9.0)))), s0(Vector(Vector(10.0)))), s1(Vector(s0(Vector(Vector(11.0))), s0(Vector(Vector(12.0)))), s0(Vector(Vector(13.0)))), s1(Vector(s0(Vector(Vector(14.0))), s0(Vector(Vector(15.0)))), s0(Vector(Vector(16.0))))), Vector(Vector(s3(s0(Vector(Vector(17.0))), s0(Vector(Vector(18.0))))), Vector(s3(s0(Vector(Vector(19.0))), s0(Vector(Vector(20.0))))), Vector(s3(s0(Vector(Vector(21.0))), s0(Vector(Vector(22.0)))))))))))), s9(Vector(23.0), Vector(s6(Vector(s0(Vector(Vector(24.0))), s0(Vector(Vector(25.0)))), Vector(Vector(s4(Vector(s1(Vector(s0(Vector(Vector(26.0))), s0(Vector(Vector(27.0)))), s0(Vector(Vector(28.0)))), s1(Vector(s0(Vector(Vector(29.0))), s0(Vector(Vector(30.0)))), s0(Vector(Vector(31.0)))), s1(Vector(s0(Vector(Vector(32.0))), s0(Vector(Vector(33.0)))), s0(Vector(Vector(34.0))))), Vector(Vector(s3(s0(Vector(Vector(35.0))), s0(Vector(Vector(36.0))))), Vector(s3(s0(Vector(Vector(37.0))), s0(Vector(Vector(38.0))))), Vector(s3(s0(Vector(Vector(39.0))), s0(Vector(Vector(40.0)))))))))))), s9(Vector(41.0), Vector(s6(Vector(s0(Vector(Vector(42.0))), s0(Vector(Vector(43.0)))), Vector(Vector(s4(Vector(s1(Vector(s0(Vector(Vector(44.0))), s0(Vector(Vector(45.0)))), s0(Vector(Vector(46.0)))), s1(Vector(s0(Vector(Vector(47.0))), s0(Vector(Vector(48.0)))), s0(Vector(Vector(49.0)))), s1(Vector(s0(Vector(Vector(50.0))), s0(Vector(Vector(51.0)))), s0(Vector(Vector(52.0))))), Vector(Vector(s3(s0(Vector(Vector(53.0))), s0(Vector(Vector(54.0))))), Vector(s3(s0(Vector(Vector(55.0))), s0(Vector(Vector(56.0))))), Vector(s3(s0(Vector(Vector(57.0))), s0(Vector(Vector(58.0))))))))))))))), Vector(s10(Vector(Vector(s1(Vector(s0(Vector(Vector(59.0))), s0(Vector(Vector(60.0)))), s0(Vector(Vector(61.0)))))), Vector(s9(Vector(62.0), Vector(s6(Vector(s0(Vector(Vector(63.0))), s0(Vector(Vector(64.0)))), Vector(Vector(s4(Vector(s1(Vector(s0(Vector(Vector(65.0))), s0(Vector(Vector(66.0)))), s0(Vector(Vector(67.0)))), s1(Vector(s0(Vector(Vector(68.0))), s0(Vector(Vector(69.0)))), s0(Vector(Vector(70.0)))), s1(Vector(s0(Vector(Vector(71.0))), s0(Vector(Vector(72.0)))), s0(Vector(Vector(73.0))))), Vector(Vector(s3(s0(Vector(Vector(74.0))), s0(Vector(Vector(75.0))))), Vector(s3(s0(Vector(Vector(76.0))), s0(Vector(Vector(77.0))))), Vector(s3(s0(Vector(Vector(78.0))), s0(Vector(Vector(79.0)))))))))))), s9(Vector(80.0), Vector(s6(Vector(s0(Vector(Vector(81.0))), s0(Vector(Vector(82.0)))), Vector(Vector(s4(Vector(s1(Vector(s0(Vector(Vector(83.0))), s0(Vector(Vector(84.0)))), s0(Vector(Vector(85.0)))), s1(Vector(s0(Vector(Vector(86.0))), s0(Vector(Vector(87.0)))), s0(Vector(Vector(88.0)))), s1(Vector(s0(Vector(Vector(89.0))), s0(Vector(Vector(90.0)))), s0(Vector(Vector(91.0))))), Vector(Vector(s3(s0(Vector(Vector(92.0))), s0(Vector(Vector(93.0))))), Vector(s3(s0(Vector(Vector(94.0))), s0(Vector(Vector(95.0))))), Vector(s3(s0(Vector(Vector(96.0))), s0(Vector(Vector(97.0)))))))))))), s9(Vector(98.0), Vector(s6(Vector(s0(Vector(Vector(99.0))), s0(Vector(Vector(100.0)))), Vector(Vector(s4(Vector(s1(Vector(s0(Vector(Vector(101.0))), s0(Vector(Vector(102.0)))), s0(Vector(Vector(103.0)))), s1(Vector(s0(Vector(Vector(104.0))), s0(Vector(Vector(105.0)))), s0(Vector(Vector(106.0)))), s1(Vector(s0(Vector(Vector(107.0))), s0(Vector(Vector(108.0)))), s0(Vector(Vector(109.0))))), Vector(Vector(s3(s0(Vector(Vector(110.0))), s0(Vector(Vector(111.0))))), Vector(s3(s0(Vector(Vector(112.0))), s0(Vector(Vector(113.0))))), Vector(s3(s0(Vector(Vector(114.0))), s0(Vector(Vector(115.0))))))))))))))), Vector(s10(Vector(Vector(s1(Vector(s0(Vector(Vector(116.0))), s0(Vector(Vector(117.0)))), s0(Vector(Vector(118.0)))))), Vector(s9(Vector(119.0), Vector(s6(Vector(s0(Vector(Vector(120.0))), s0(Vector(Vector(121.0)))), Vector(Vector(s4(Vector(s1(Vector(s0(Vector(Vector(122.0))), s0(Vector(Vector(123.0)))), s0(Vector(Vector(124.0)))), s1(Vector(s0(Vector(Vector(125.0))), s0(Vector(Vector(126.0)))), s0(Vector(Vector(127.0)))), s1(Vector(s0(Vector(Vector(128.0))), s0(Vector(Vector(129.0)))), s0(Vector(Vector(130.0))))), Vector(Vector(s3(s0(Vector(Vector(131.0))), s0(Vector(Vector(132.0))))), Vector(s3(s0(Vector(Vector(133.0))), s0(Vector(Vector(134.0))))), Vector(s3(s0(Vector(Vector(135.0))), s0(Vector(Vector(136.0)))))))))))), s9(Vector(137.0), Vector(s6(Vector(s0(Vector(Vector(138.0))), s0(Vector(Vector(139.0)))), Vector(Vector(s4(Vector(s1(Vector(s0(Vector(Vector(140.0))), s0(Vector(Vector(141.0)))), s0(Vector(Vector(142.0)))), s1(Vector(s0(Vector(Vector(143.0))), s0(Vector(Vector(144.0)))), s0(Vector(Vector(145.0)))), s1(Vector(s0(Vector(Vector(146.0))), s0(Vector(Vector(147.0)))), s0(Vector(Vector(148.0))))), Vector(Vector(s3(s0(Vector(Vector(149.0))), s0(Vector(Vector(150.0))))), Vector(s3(s0(Vector(Vector(151.0))), s0(Vector(Vector(152.0))))), Vector(s3(s0(Vector(Vector(153.0))), s0(Vector(Vector(154.0)))))))))))), s9(Vector(155.0), Vector(s6(Vector(s0(Vector(Vector(156.0))), s0(Vector(Vector(157.0)))), Vector(Vector(s4(Vector(s1(Vector(s0(Vector(Vector(158.0))), s0(Vector(Vector(159.0)))), s0(Vector(Vector(160.0)))), s1(Vector(s0(Vector(Vector(161.0))), s0(Vector(Vector(162.0)))), s0(Vector(Vector(163.0)))), s1(Vector(s0(Vector(Vector(164.0))), s0(Vector(Vector(165.0)))), s0(Vector(Vector(166.0))))), Vector(Vector(s3(s0(Vector(Vector(167.0))), s0(Vector(Vector(168.0))))), Vector(s3(s0(Vector(Vector(169.0))), s0(Vector(Vector(170.0))))), Vector(s3(s0(Vector(Vector(171.0))), s0(Vector(Vector(172.0))))))))))))))))
    val v2: Vector[s7] = Vector(s7(Vector(s6(Vector(s0(Vector(Vector(173.0))), s0(Vector(Vector(174.0)))), Vector(Vector(s4(Vector(s1(Vector(s0(Vector(Vector(175.0))), s0(Vector(Vector(176.0)))), s0(Vector(Vector(177.0)))), s1(Vector(s0(Vector(Vector(178.0))), s0(Vector(Vector(179.0)))), s0(Vector(Vector(180.0)))), s1(Vector(s0(Vector(Vector(181.0))), s0(Vector(Vector(182.0)))), s0(Vector(Vector(183.0))))), Vector(Vector(s3(s0(Vector(Vector(184.0))), s0(Vector(Vector(185.0))))), Vector(s3(s0(Vector(Vector(186.0))), s0(Vector(Vector(187.0))))), Vector(s3(s0(Vector(Vector(188.0))), s0(Vector(Vector(189.0)))))))))), s6(Vector(s0(Vector(Vector(190.0))), s0(Vector(Vector(191.0)))), Vector(Vector(s4(Vector(s1(Vector(s0(Vector(Vector(192.0))), s0(Vector(Vector(193.0)))), s0(Vector(Vector(194.0)))), s1(Vector(s0(Vector(Vector(195.0))), s0(Vector(Vector(196.0)))), s0(Vector(Vector(197.0)))), s1(Vector(s0(Vector(Vector(198.0))), s0(Vector(Vector(199.0)))), s0(Vector(Vector(200.0))))), Vector(Vector(s3(s0(Vector(Vector(201.0))), s0(Vector(Vector(202.0))))), Vector(s3(s0(Vector(Vector(203.0))), s0(Vector(Vector(204.0))))), Vector(s3(s0(Vector(Vector(205.0))), s0(Vector(Vector(206.0))))))))))), s3(s0(Vector(Vector(207.0))), s0(Vector(Vector(208.0))))))
    val v3: Double = 209.0
    val start = nanoTime()
    var result: Double = 209.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}