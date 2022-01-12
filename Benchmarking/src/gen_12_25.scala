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
    p0: Vector[Vector[s1]],
    p1: s0
  )
  case class s3 (
    p0: s1,
    p1: Vector[s0]
  )
  case class s4 (
    p0: s2,
    p1: Vector[Vector[s1]]
  )
  case class s5 (
    p0: s3
  )
  case class s6 (
    p0: s5,
    p1: Vector[Vector[s4]]
  )
  def f55(v0: Vector[s2]): Vector[s2] = {
    var v2: Vector[s2] = v0
    var v1: Vector[s2] = v0
    val v7: s2 = v0(0)
    val v6: s2 = v1(0)
    v1 = v1.updated(0, v6)
    v1 = v0
    v1 = v1.updated(0, v7)
    v2 = v2.updated(0, v6)
    v1 = v2
    v2 = v1
    val v35: s2 = v2(0)
    val v29: s2 = v1(0)
    var v32: Vector[s2] = v0
    val v34: Vector[s2] = Vector(v7, v6)
    val v26: s2 = v34(1)
    v32 = v32.updated(0, v6)
    v2 = v2.updated(0, v35)
    v2 = v2.updated(0, v26)
    v32 = v32.updated(0, v26)
    v32 = v2
    v32 = v32.updated(0, v29)
    v32
  }
  def f38(v0: s0): s0 = {
    val v2: Vector[Vector[Double]] = v0.p1
    val v3: Vector[Double] = v2(0)
    val v7: Vector[Vector[Double]] = v0.p1
    val v6: Vector[Vector[Double]] = v0.p1
    val v4: Vector[Vector[Double]] = v0.p0
    val v8: Vector[Vector[Double]] = v0.p1
    var v5: Vector[Double] = v3
    var v14: Vector[Vector[Double]] = v7
    val v10: Vector[Vector[Double]] = v0.p1
    v14 = v14.updated(0, v3)
    var v22: Vector[Vector[Double]] = v8
    v14 = v14.updated(2, v3)
    val v1: Double = v5(0)
    val v13: Vector[Vector[Double]] = v0.p1
    val v9: Vector[Vector[Double]] = v0.p1
    val v12: Vector[Double] = v13(0)
    val v15: Double = v3(0)
    var v21: Vector[Vector[Double]] = v6
    val v19: Double = v1 * v15
    val v24: Vector[Vector[Double]] = v0.p1
    var v32: Vector[Double] = v12
    var v26: s0 = v0
    val v29: Vector[Vector[Double]] = v0.p1
    v21 = v21.updated(0, v5)
    var v37: Vector[Vector[Double]] = v24
    v22 = v9
    val v33: Vector[Vector[Double]] = v26.p1
    v26 = v26.copy(p0 = v29)
    v5 = v5.updated(0, v19)
    val v64: Vector[Vector[Double]] = v26.p0
    val v56: Vector[Vector[Double]] = v26.p0
    val v34: Vector[Double] = v4(0)
    v26 = v26.copy(p0 = v56)
    v26 = v26.copy(p0 = v7)
    val v45: s0 = s0(v37, v22)
    val v51: Vector[Vector[Double]] = v26.p1
    v26 = v26.copy(p0 = v56)
    v21 = v21.updated(0, v3)
    var v53: s0 = v45
    val v50: Vector[Vector[Double]] = v53.p0
    v26 = v26.copy(p0 = v6)
    val v86: Double = v34(0)
    v21 = v21.updated(2, v5)
    v53 = v53.copy(p0 = v21)
    val v75: s0 = s0(v33, v10)
    v21 = v21.updated(1, v32)
    v26 = v26.copy(p0 = v51)
    v21 = v14
    v37 = v37.updated(0, v3)
    val v52: s0 = s0(v50, v51)
    v53 = v53.copy(p0 = v14)
    val v110: Vector[Vector[Double]] = v75.p1
    v32 = v32.updated(0, v86)
    v26 = v26.copy(p1 = v110)
    v26 = v26.copy(p0 = v64)
    v52
  }
  def f37(v0: s2): s2 = {
    val v5: s0 = v0.p1
    var v12: s2 = v0
    val v23: s0 = f38(v5)
    val v34: s0 = f38(v23)
    v12 = v12.copy(p1 = v34)
    val v87: Vector[s2] = Vector(v12, v0)
    val v120: s2 = v87(1)
    v120
  }
  def f30(v0: s0): s0 = {
    val v2: s0 = f38(v0)
    val v5: Vector[Vector[Double]] = v0.p1
    val v7: s0 = f38(v2)
    val v11: s0 = f38(v2)
    val v15: Vector[Vector[Double]] = v11.p1
    val v14: Vector[Vector[Double]] = v0.p1
    val v25: s0 = f38(v0)
    var v18: s0 = v0
    v18 = v18.copy(p0 = v15)
    val v27: Vector[Vector[Double]] = v18.p0
    val v21: s0 = f38(v18)
    val v33: Vector[Vector[Double]] = v21.p0
    v18 = v18.copy(p1 = v33)
    var v92: s0 = v7
    v18 = v18.copy(p0 = v5)
    v92 = v92.copy(p1 = v14)
    val v149: s0 = f38(v92)
    val v124: Vector[s0] = Vector(v2, v25, v92, v149, v149)
    var v142: Vector[s0] = v124
    var v126: Vector[s0] = v142
    var v105: Vector[s0] = v126
    v92 = v92.copy(p1 = v27)
    val v243: s0 = v105(3)
    v243
  }
  def f16(v0: s2): s2 = {
    val v19: s2 = f37(v0)
    val v32: s2 = f37(v19)
    val v51: s2 = f37(v32)
    v51
  }
  def f10(v0: s0): s0 = {
    val v9: s0 = f38(v0)
    val v14: s0 = f30(v9)
    val v5: Vector[Vector[Double]] = v14.p1
    val v2: s0 = s0(v5, v5)
    val v33: s0 = f30(v2)
    v33
  }
  @noinline
  def f0(v0: Vector[Vector[s6]], v1: Vector[s2], v2: Vector[s1], v3: Double): Double = {
    val v4: Vector[s2] = f55(v1)
    var v7: Vector[s2] = v4
    val v14: Vector[s2] = f55(v7)
    val v11: s2 = v7(0)
    var v8: s2 = v11
    var v10: s2 = v8
    val v28: s2 = f16(v10)
    var v13: s2 = v10
    val v24: s0 = v11.p1
    val v16: s2 = v4(0)
    val v9: Vector[Vector[s1]] = v28.p0
    val v19: Vector[Vector[Double]] = v24.p1
    val v33: s2 = v14(0)
    val v30: Vector[Double] = v19(0)
    val v29: s0 = v28.p1
    val v17: s2 = f37(v10)
    var v23: s0 = v29
    val v49: Vector[s2] = Vector(v13, v13, v33, v33, v16, v17, v17)
    val v42: s0 = f38(v24)
    v13 = v13.copy(p1 = v23)
    val v65: Vector[Vector[Double]] = v42.p1
    val v59: Double = v30(0)
    v10 = v10.copy(p1 = v23)
    v23 = v24
    var v36: Vector[s2] = v49
    var v55: Vector[Vector[Double]] = v65
    val v45: s0 = v33.p1
    v8 = v8.copy(p1 = v45)
    val v73: s0 = f38(v42)
    v10 = v10.copy(p1 = v45)
    v13 = v13.copy(p0 = v9)
    val v172: s2 = v36(5)
    v23 = v23.copy(p0 = v55)
    v13 = v172
    val v84: s0 = f10(v42)
    v10 = v10.copy(p1 = v73)
    val v175: s2 = f37(v172)
    v8 = v8.copy(p1 = v84)
    v7 = v7.updated(0, v175)
    v59
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s6]] = Vector(Vector(s6(s5(s3(s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0))), Vector(s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0))), s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))))), Vector(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0))), s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0))), s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0), Vector(40.0), Vector(41.0)))))), Vector(Vector(s4(s2(Vector(Vector(s1(s0(Vector(Vector(42.0), Vector(43.0), Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0))), Vector(s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0), Vector(52.0), Vector(53.0))), s0(Vector(Vector(54.0), Vector(55.0), Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0))), s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0), Vector(64.0), Vector(65.0)))))), Vector(s1(s0(Vector(Vector(66.0), Vector(67.0), Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0))), Vector(s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)), Vector(Vector(75.0), Vector(76.0), Vector(77.0))), s0(Vector(Vector(78.0), Vector(79.0), Vector(80.0)), Vector(Vector(81.0), Vector(82.0), Vector(83.0))), s0(Vector(Vector(84.0), Vector(85.0), Vector(86.0)), Vector(Vector(87.0), Vector(88.0), Vector(89.0))))))), s0(Vector(Vector(90.0), Vector(91.0), Vector(92.0)), Vector(Vector(93.0), Vector(94.0), Vector(95.0)))), Vector(Vector(s1(s0(Vector(Vector(96.0), Vector(97.0), Vector(98.0)), Vector(Vector(99.0), Vector(100.0), Vector(101.0))), Vector(s0(Vector(Vector(102.0), Vector(103.0), Vector(104.0)), Vector(Vector(105.0), Vector(106.0), Vector(107.0))), s0(Vector(Vector(108.0), Vector(109.0), Vector(110.0)), Vector(Vector(111.0), Vector(112.0), Vector(113.0))), s0(Vector(Vector(114.0), Vector(115.0), Vector(116.0)), Vector(Vector(117.0), Vector(118.0), Vector(119.0)))))))))))))
    val v1: Vector[s2] = Vector(s2(Vector(Vector(s1(s0(Vector(Vector(120.0), Vector(121.0), Vector(122.0)), Vector(Vector(123.0), Vector(124.0), Vector(125.0))), Vector(s0(Vector(Vector(126.0), Vector(127.0), Vector(128.0)), Vector(Vector(129.0), Vector(130.0), Vector(131.0))), s0(Vector(Vector(132.0), Vector(133.0), Vector(134.0)), Vector(Vector(135.0), Vector(136.0), Vector(137.0))), s0(Vector(Vector(138.0), Vector(139.0), Vector(140.0)), Vector(Vector(141.0), Vector(142.0), Vector(143.0)))))), Vector(s1(s0(Vector(Vector(144.0), Vector(145.0), Vector(146.0)), Vector(Vector(147.0), Vector(148.0), Vector(149.0))), Vector(s0(Vector(Vector(150.0), Vector(151.0), Vector(152.0)), Vector(Vector(153.0), Vector(154.0), Vector(155.0))), s0(Vector(Vector(156.0), Vector(157.0), Vector(158.0)), Vector(Vector(159.0), Vector(160.0), Vector(161.0))), s0(Vector(Vector(162.0), Vector(163.0), Vector(164.0)), Vector(Vector(165.0), Vector(166.0), Vector(167.0))))))), s0(Vector(Vector(168.0), Vector(169.0), Vector(170.0)), Vector(Vector(171.0), Vector(172.0), Vector(173.0)))))
    val v2: Vector[s1] = Vector(s1(s0(Vector(Vector(174.0), Vector(175.0), Vector(176.0)), Vector(Vector(177.0), Vector(178.0), Vector(179.0))), Vector(s0(Vector(Vector(180.0), Vector(181.0), Vector(182.0)), Vector(Vector(183.0), Vector(184.0), Vector(185.0))), s0(Vector(Vector(186.0), Vector(187.0), Vector(188.0)), Vector(Vector(189.0), Vector(190.0), Vector(191.0))), s0(Vector(Vector(192.0), Vector(193.0), Vector(194.0)), Vector(Vector(195.0), Vector(196.0), Vector(197.0))))))
    val v3: Double = 198.0
    val start = nanoTime()
    var result: Double = 198.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}