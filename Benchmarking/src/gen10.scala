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
    p0: s1,
    p1: Vector[s0]
  )
  case class s3 (
    p0: s1,
    p1: Vector[Vector[s2]],
    p2: Vector[s1]
  )
  case class s4 (
    p0: s0,
    p1: Vector[s3]
  )
  case class s5 (
    p0: s4,
    p1: s4
  )
  case class s7 (
    p0: Vector[s2],
    p1: Vector[s4]
  )
  case class s11 (
    p0: Vector[s5],
    p1: Vector[s2]
  )
  def f109(v0: s1): s1 = {
    val v4: s0 = v0.p1
    var v7: s0 = v4
    var v2: s1 = v0
    val v5: s0 = v0.p1
    var v3: s0 = v5
    var v10: s0 = v3
    v2 = v2.copy(p1 = v5)
    val v18: s1 = s1(v4, v10)
    v2 = v2.copy(p0 = v4)
    val v1: s0 = v18.p0
    v2 = v2.copy(p0 = v7)
    var v15: s1 = v0
    v2 = v2.copy(p0 = v7)
    val v23: Vector[s1] = Vector(v15, v2, v18, v0, v18, v15, v18)
    val v21: s1 = v23(3)
    val v13: s1 = v23(3)
    val v22: s1 = v23(5)
    val v24: Vector[Vector[Double]] = v1.p0
    v10 = v10.copy(p0 = v24)
    val v34: s1 = v23(1)
    val v47: s1 = v23(1)
    v2 = v13
    val v20: s1 = v23(3)
    var v25: Vector[s1] = v23
    val v27: s1 = v23(5)
    v25 = v25.updated(3, v47)
    var v39: s1 = v22
    v25 = v25.updated(0, v21)
    v25 = v25.updated(0, v0)
    val v58: s1 = v25(0)
    var v65: Vector[s1] = v25
    v25 = v25.updated(4, v27)
    v25 = v25.updated(2, v34)
    val v88: s0 = v34.p1
    var v71: Vector[s1] = v65
    v25 = v71
    v71 = v71.updated(2, v39)
    v65 = v65.updated(5, v20)
    v2 = v2.copy(p1 = v88)
    v58
  }
  def f94(v0: s1): s1 = {
    val v2: s0 = v0.p1
    var v4: s1 = v0
    v4 = v4.copy(p0 = v2)
    v4 = v4.copy(p0 = v2)
    v4 = v4.copy(p1 = v2)
    val v5: s0 = v0.p1
    v4 = v0
    v4 = v4.copy(p1 = v5)
    var v1: s1 = v4
    val v13: s0 = v4.p0
    var v12: s1 = v0
    var v11: s0 = v2
    val v18: s0 = v1.p1
    v4 = v4.copy(p0 = v2)
    val v86: s1 = s1(v18, v13)
    val v65: s1 = f109(v12)
    val v60: s0 = v12.p0
    val v96: s1 = f109(v86)
    v4 = v4.copy(p1 = v11)
    v1 = v65
    v12 = v12.copy(p1 = v60)
    v96
  }
  def f89(v0: Vector[s0]): Vector[s0] = {
    var v7: Vector[s0] = v0
    var v3: Vector[s0] = v0
    val v2: s0 = v7(0)
    v7 = v7.updated(0, v2)
    v7 = v7.updated(0, v2)
    v7 = v7.updated(0, v2)
    v3 = v3.updated(0, v2)
    v7 = v7.updated(0, v2)
    val v25: s0 = v7(0)
    val v40: s1 = s1(v25, v2)
    val v36: s0 = v40.p1
    v3 = v3.updated(0, v36)
    v3 = v3.updated(0, v2)
    v3 = v3.updated(0, v2)
    v3
  }
  def f83(v0: s2): s2 = {
    var v6: s2 = v0
    var v3: s2 = v6
    var v5: s2 = v3
    val v7: s1 = v0.p0
    val v17: s1 = f94(v7)
    val v4: s0 = v17.p1
    var v2: s2 = v3
    v5 = v5.copy(p0 = v7)
    val v13: Vector[s0] = v5.p1
    val v9: Vector[s0] = f89(v13)
    val v10: Vector[s0] = f89(v13)
    val v8: s1 = f94(v7)
    var v16: Vector[s0] = v9
    val v21: s0 = v10(0)
    var v28: s1 = v7
    v28 = v28.copy(p1 = v4)
    val v23: s1 = f94(v28)
    v16 = v16.updated(0, v21)
    v5 = v5.copy(p0 = v17)
    val v33: s1 = f94(v8)
    v3 = v3.copy(p0 = v33)
    val v49: s1 = f109(v33)
    v16 = v16.updated(0, v21)
    val v76: s0 = v28.p1
    v16 = v16.updated(0, v76)
    v2 = v0
    v3 = v3.copy(p0 = v49)
    var v139: s2 = v6
    val v124: Vector[s0] = f89(v16)
    v139 = v2
    v6 = v6.copy(p1 = v124)
    v3 = v3.copy(p0 = v23)
    v139
  }
  @noinline
  def f0(v0: s7, v1: Vector[s2], v2: s11, v3: Double): Double = {
    val v5: Vector[s2] = v0.p0
    val v9: s2 = v5(0)
    val v12: s2 = f83(v9)
    val v17: s2 = f83(v12)
    val v20: s1 = v17.p0
    val v24: s0 = v20.p1
    var v27: s0 = v24
    val v49: Vector[Vector[Double]] = v27.p1
    val v44: Vector[Double] = v49(1)
    val v52: Double = v44(0)
    v52
  }
  def benchmark(): Unit = {
    val v0: s7 = s7(Vector(s2(s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0))), s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0)))), Vector(s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0)))))), Vector(s4(s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0))), Vector(s3(s1(s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0), Vector(24.0))), s0(Vector(Vector(25.0), Vector(26.0), Vector(27.0)), Vector(Vector(28.0), Vector(29.0)))), Vector(Vector(s2(s1(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0))), s0(Vector(Vector(35.0), Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0)))), Vector(s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0), Vector(44.0)))))), Vector(s2(s1(s0(Vector(Vector(45.0), Vector(46.0), Vector(47.0)), Vector(Vector(48.0), Vector(49.0))), s0(Vector(Vector(50.0), Vector(51.0), Vector(52.0)), Vector(Vector(53.0), Vector(54.0)))), Vector(s0(Vector(Vector(55.0), Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0))))))), Vector(s1(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0), Vector(64.0))), s0(Vector(Vector(65.0), Vector(66.0), Vector(67.0)), Vector(Vector(68.0), Vector(69.0))))))))))
    val v1: Vector[s2] = Vector(s2(s1(s0(Vector(Vector(70.0), Vector(71.0), Vector(72.0)), Vector(Vector(73.0), Vector(74.0))), s0(Vector(Vector(75.0), Vector(76.0), Vector(77.0)), Vector(Vector(78.0), Vector(79.0)))), Vector(s0(Vector(Vector(80.0), Vector(81.0), Vector(82.0)), Vector(Vector(83.0), Vector(84.0))))))
    val v2: s11 = s11(Vector(s5(s4(s0(Vector(Vector(85.0), Vector(86.0), Vector(87.0)), Vector(Vector(88.0), Vector(89.0))), Vector(s3(s1(s0(Vector(Vector(90.0), Vector(91.0), Vector(92.0)), Vector(Vector(93.0), Vector(94.0))), s0(Vector(Vector(95.0), Vector(96.0), Vector(97.0)), Vector(Vector(98.0), Vector(99.0)))), Vector(Vector(s2(s1(s0(Vector(Vector(100.0), Vector(101.0), Vector(102.0)), Vector(Vector(103.0), Vector(104.0))), s0(Vector(Vector(105.0), Vector(106.0), Vector(107.0)), Vector(Vector(108.0), Vector(109.0)))), Vector(s0(Vector(Vector(110.0), Vector(111.0), Vector(112.0)), Vector(Vector(113.0), Vector(114.0)))))), Vector(s2(s1(s0(Vector(Vector(115.0), Vector(116.0), Vector(117.0)), Vector(Vector(118.0), Vector(119.0))), s0(Vector(Vector(120.0), Vector(121.0), Vector(122.0)), Vector(Vector(123.0), Vector(124.0)))), Vector(s0(Vector(Vector(125.0), Vector(126.0), Vector(127.0)), Vector(Vector(128.0), Vector(129.0))))))), Vector(s1(s0(Vector(Vector(130.0), Vector(131.0), Vector(132.0)), Vector(Vector(133.0), Vector(134.0))), s0(Vector(Vector(135.0), Vector(136.0), Vector(137.0)), Vector(Vector(138.0), Vector(139.0)))))))), s4(s0(Vector(Vector(140.0), Vector(141.0), Vector(142.0)), Vector(Vector(143.0), Vector(144.0))), Vector(s3(s1(s0(Vector(Vector(145.0), Vector(146.0), Vector(147.0)), Vector(Vector(148.0), Vector(149.0))), s0(Vector(Vector(150.0), Vector(151.0), Vector(152.0)), Vector(Vector(153.0), Vector(154.0)))), Vector(Vector(s2(s1(s0(Vector(Vector(155.0), Vector(156.0), Vector(157.0)), Vector(Vector(158.0), Vector(159.0))), s0(Vector(Vector(160.0), Vector(161.0), Vector(162.0)), Vector(Vector(163.0), Vector(164.0)))), Vector(s0(Vector(Vector(165.0), Vector(166.0), Vector(167.0)), Vector(Vector(168.0), Vector(169.0)))))), Vector(s2(s1(s0(Vector(Vector(170.0), Vector(171.0), Vector(172.0)), Vector(Vector(173.0), Vector(174.0))), s0(Vector(Vector(175.0), Vector(176.0), Vector(177.0)), Vector(Vector(178.0), Vector(179.0)))), Vector(s0(Vector(Vector(180.0), Vector(181.0), Vector(182.0)), Vector(Vector(183.0), Vector(184.0))))))), Vector(s1(s0(Vector(Vector(185.0), Vector(186.0), Vector(187.0)), Vector(Vector(188.0), Vector(189.0))), s0(Vector(Vector(190.0), Vector(191.0), Vector(192.0)), Vector(Vector(193.0), Vector(194.0)))))))))), Vector(s2(s1(s0(Vector(Vector(195.0), Vector(196.0), Vector(197.0)), Vector(Vector(198.0), Vector(199.0))), s0(Vector(Vector(200.0), Vector(201.0), Vector(202.0)), Vector(Vector(203.0), Vector(204.0)))), Vector(s0(Vector(Vector(205.0), Vector(206.0), Vector(207.0)), Vector(Vector(208.0), Vector(209.0))))), s2(s1(s0(Vector(Vector(210.0), Vector(211.0), Vector(212.0)), Vector(Vector(213.0), Vector(214.0))), s0(Vector(Vector(215.0), Vector(216.0), Vector(217.0)), Vector(Vector(218.0), Vector(219.0)))), Vector(s0(Vector(Vector(220.0), Vector(221.0), Vector(222.0)), Vector(Vector(223.0), Vector(224.0)))))))
    val v3: Double = 225.0
    val start = nanoTime()
    var result: Double = 225.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}