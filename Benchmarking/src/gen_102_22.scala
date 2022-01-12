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
  case class s2 (
    p0: s0,
    p1: s1
  )
  case class s3 (
    p0: s1,
    p1: Vector[Vector[s0]]
  )
  case class s4 (
    p0: Vector[s0],
    p1: s2
  )
  case class s5 (
    p0: Vector[s2],
    p1: s0
  )
  case class s6 (
    p0: s5,
    p1: s3
  )
  def f18(v0: Double): Double = {
    var v9: Double = v0
    var v7: Double = v9
    var v6: Double = v9
    var v1: Double = v6
    var v8: Double = v7
    var v5: Double = v8
    var v3: Double = v7
    var v14: Double = v3
    var v11: Double = v0
    var v13: Double = v11
    var v19: Double = v14
    var v17: Double = v14
    val v30: Vector[Double] = Vector(v17, v1, v5, v3, v13)
    val v35: Double = v30(3)
    var v39: Vector[Double] = v30
    var v15: Vector[Double] = v30
    var v20: Double = v9
    val v24: Double = v15(0)
    v15 = v15.updated(4, v7)
    var v21: Vector[Double] = v39
    val v42: Double = v21(0)
    val v33: Vector[Double] = Vector(v35, v42, v6, v9, v17, v6, v5)
    v39 = v39.updated(1, v17)
    val v47: Double = v33(1)
    v21 = v21.updated(2, v19)
    v39 = v39.updated(4, v20)
    val v52: Vector[Double] = Vector(v24, v47)
    val v174: Double = v52(1)
    v174
  }
  @noinline
  def f0(v0: Vector[s6], v1: Vector[s4], v2: Double): Double = {
    val v5: Double = f18(v2)
    val v4: Double = f18(v5)
    val v6: Double = f18(v4)
    val v14: Double = f18(v6)
    val v67: Double = v14 / v6
    val v79: Double = f18(v67)
    v79
  }
  def benchmark(): Unit = {
    val v0: Vector[s6] = Vector(s6(s5(Vector(s2(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0))), s1(Vector(s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0))), s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0)))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0))))), s2(s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0))), s1(Vector(s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0))), s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0)))), s0(Vector(Vector(28.0), Vector(29.0), Vector(30.0)), Vector(Vector(31.0)))))), s0(Vector(Vector(32.0), Vector(33.0), Vector(34.0)), Vector(Vector(35.0)))), s3(s1(Vector(s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0))), s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0)))), s0(Vector(Vector(44.0), Vector(45.0), Vector(46.0)), Vector(Vector(47.0)))), Vector(Vector(s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0)))), Vector(s0(Vector(Vector(52.0), Vector(53.0), Vector(54.0)), Vector(Vector(55.0)))), Vector(s0(Vector(Vector(56.0), Vector(57.0), Vector(58.0)), Vector(Vector(59.0))))))), s6(s5(Vector(s2(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0))), s1(Vector(s0(Vector(Vector(64.0), Vector(65.0), Vector(66.0)), Vector(Vector(67.0))), s0(Vector(Vector(68.0), Vector(69.0), Vector(70.0)), Vector(Vector(71.0)))), s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)), Vector(Vector(75.0))))), s2(s0(Vector(Vector(76.0), Vector(77.0), Vector(78.0)), Vector(Vector(79.0))), s1(Vector(s0(Vector(Vector(80.0), Vector(81.0), Vector(82.0)), Vector(Vector(83.0))), s0(Vector(Vector(84.0), Vector(85.0), Vector(86.0)), Vector(Vector(87.0)))), s0(Vector(Vector(88.0), Vector(89.0), Vector(90.0)), Vector(Vector(91.0)))))), s0(Vector(Vector(92.0), Vector(93.0), Vector(94.0)), Vector(Vector(95.0)))), s3(s1(Vector(s0(Vector(Vector(96.0), Vector(97.0), Vector(98.0)), Vector(Vector(99.0))), s0(Vector(Vector(100.0), Vector(101.0), Vector(102.0)), Vector(Vector(103.0)))), s0(Vector(Vector(104.0), Vector(105.0), Vector(106.0)), Vector(Vector(107.0)))), Vector(Vector(s0(Vector(Vector(108.0), Vector(109.0), Vector(110.0)), Vector(Vector(111.0)))), Vector(s0(Vector(Vector(112.0), Vector(113.0), Vector(114.0)), Vector(Vector(115.0)))), Vector(s0(Vector(Vector(116.0), Vector(117.0), Vector(118.0)), Vector(Vector(119.0))))))), s6(s5(Vector(s2(s0(Vector(Vector(120.0), Vector(121.0), Vector(122.0)), Vector(Vector(123.0))), s1(Vector(s0(Vector(Vector(124.0), Vector(125.0), Vector(126.0)), Vector(Vector(127.0))), s0(Vector(Vector(128.0), Vector(129.0), Vector(130.0)), Vector(Vector(131.0)))), s0(Vector(Vector(132.0), Vector(133.0), Vector(134.0)), Vector(Vector(135.0))))), s2(s0(Vector(Vector(136.0), Vector(137.0), Vector(138.0)), Vector(Vector(139.0))), s1(Vector(s0(Vector(Vector(140.0), Vector(141.0), Vector(142.0)), Vector(Vector(143.0))), s0(Vector(Vector(144.0), Vector(145.0), Vector(146.0)), Vector(Vector(147.0)))), s0(Vector(Vector(148.0), Vector(149.0), Vector(150.0)), Vector(Vector(151.0)))))), s0(Vector(Vector(152.0), Vector(153.0), Vector(154.0)), Vector(Vector(155.0)))), s3(s1(Vector(s0(Vector(Vector(156.0), Vector(157.0), Vector(158.0)), Vector(Vector(159.0))), s0(Vector(Vector(160.0), Vector(161.0), Vector(162.0)), Vector(Vector(163.0)))), s0(Vector(Vector(164.0), Vector(165.0), Vector(166.0)), Vector(Vector(167.0)))), Vector(Vector(s0(Vector(Vector(168.0), Vector(169.0), Vector(170.0)), Vector(Vector(171.0)))), Vector(s0(Vector(Vector(172.0), Vector(173.0), Vector(174.0)), Vector(Vector(175.0)))), Vector(s0(Vector(Vector(176.0), Vector(177.0), Vector(178.0)), Vector(Vector(179.0))))))))
    val v1: Vector[s4] = Vector(s4(Vector(s0(Vector(Vector(180.0), Vector(181.0), Vector(182.0)), Vector(Vector(183.0))), s0(Vector(Vector(184.0), Vector(185.0), Vector(186.0)), Vector(Vector(187.0)))), s2(s0(Vector(Vector(188.0), Vector(189.0), Vector(190.0)), Vector(Vector(191.0))), s1(Vector(s0(Vector(Vector(192.0), Vector(193.0), Vector(194.0)), Vector(Vector(195.0))), s0(Vector(Vector(196.0), Vector(197.0), Vector(198.0)), Vector(Vector(199.0)))), s0(Vector(Vector(200.0), Vector(201.0), Vector(202.0)), Vector(Vector(203.0)))))), s4(Vector(s0(Vector(Vector(204.0), Vector(205.0), Vector(206.0)), Vector(Vector(207.0))), s0(Vector(Vector(208.0), Vector(209.0), Vector(210.0)), Vector(Vector(211.0)))), s2(s0(Vector(Vector(212.0), Vector(213.0), Vector(214.0)), Vector(Vector(215.0))), s1(Vector(s0(Vector(Vector(216.0), Vector(217.0), Vector(218.0)), Vector(Vector(219.0))), s0(Vector(Vector(220.0), Vector(221.0), Vector(222.0)), Vector(Vector(223.0)))), s0(Vector(Vector(224.0), Vector(225.0), Vector(226.0)), Vector(Vector(227.0)))))))
    val v2: Double = 228.0
    val start = nanoTime()
    var result: Double = 228.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}