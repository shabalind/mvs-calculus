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
    p0: Vector[Vector[s2]],
    p1: s1
  )
  case class s4 (
    p0: s1,
    p1: s1
  )
  case class s5 (
    p0: Vector[s3],
    p1: Vector[s1]
  )
  case class s7 (
    p0: s5,
    p1: Vector[s4]
  )
  case class s9 (
    p0: Vector[s5],
    p1: s7
  )
  def f87(v0: Double): Double = {
    var v2: Double = v0
    var v4: Double = v0
    var v3: Double = v2
    var v6: Double = v2
    val v5: Double = v3 - v6
    var v11: Double = v4
    var v10: Double = v3
    var v15: Double = v4
    val v13: Double = v3 + v0
    var v16: Double = v2
    var v12: Double = v3
    v3 = v15
    var v19: Double = v10
    var v26: Double = v4
    var v29: Double = v19
    var v22: Double = v12
    val v18: Double = v11 * v16
    v10 = v18
    var v17: Double = v18
    var v20: Double = v4
    var v32: Double = v29
    var v28: Double = v10
    v28 = v4
    var v65: Double = v26
    var v43: Double = v32
    var v39: Double = v11
    val v37: Vector[Double] = Vector(v15, v43, v65)
    val v52: Double = v37(2)
    val v61: Double = v37(0)
    var v23: Vector[Double] = v37
    v23 = v23.updated(1, v65)
    val v96: Double = v37(2)
    v23 = v23.updated(2, v13)
    val v31: Double = v37(2)
    v23 = v23.updated(0, v28)
    v23 = v23.updated(2, v2)
    v23 = v23.updated(0, v17)
    val v84: Double = v52 - v32
    v23 = v23.updated(0, v19)
    v23 = v23.updated(0, v39)
    v23 = v23.updated(1, v0)
    var v51: Vector[Double] = v23
    val v50: Vector[Double] = Vector(v43, v0, v39, v5, v22, v84, v3)
    v20 = v65
    v51 = v51.updated(1, v31)
    v23 = v23.updated(1, v20)
    val v106: Double = v50(3)
    v23 = v23.updated(1, v3)
    val v40: Double = v51(0)
    var v58: Vector[Double] = v37
    var v101: Vector[Double] = v58
    v51 = v51.updated(0, v106)
    v23 = v23.updated(1, v61)
    v23 = v23.updated(0, v40)
    var v150: Vector[Double] = v58
    var v191: Vector[Double] = v37
    val v141: Vector[Vector[Double]] = Vector(v150, v101, v23, v51, v191)
    val v209: Vector[Double] = v141(0)
    val v119: Double = v209(2)
    v150 = v150.updated(0, v96)
    v119
  }
  @noinline
  def f0(v0: s9, v1: Vector[Vector[s1]], v2: Double): Double = {
    val v4: Double = f87(v2)
    v4
  }
  def benchmark(): Unit = {
    val v0: s9 = s9(Vector(s5(Vector(s3(Vector(Vector(s2(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0))))), s1(s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0))), Vector(s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0)))))))), s1(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0))), Vector(s0(Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0)))))), s3(Vector(Vector(s2(Vector(Vector(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0))))), s1(s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0), Vector(27.0))), Vector(s0(Vector(Vector(28.0), Vector(29.0)), Vector(Vector(30.0), Vector(31.0)))))))), s1(s0(Vector(Vector(32.0), Vector(33.0)), Vector(Vector(34.0), Vector(35.0))), Vector(s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0))))))), Vector(s1(s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0))), Vector(s0(Vector(Vector(44.0), Vector(45.0)), Vector(Vector(46.0), Vector(47.0))))), s1(s0(Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0), Vector(51.0))), Vector(s0(Vector(Vector(52.0), Vector(53.0)), Vector(Vector(54.0), Vector(55.0))))))), s5(Vector(s3(Vector(Vector(s2(Vector(Vector(s0(Vector(Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0))))), s1(s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0), Vector(63.0))), Vector(s0(Vector(Vector(64.0), Vector(65.0)), Vector(Vector(66.0), Vector(67.0)))))))), s1(s0(Vector(Vector(68.0), Vector(69.0)), Vector(Vector(70.0), Vector(71.0))), Vector(s0(Vector(Vector(72.0), Vector(73.0)), Vector(Vector(74.0), Vector(75.0)))))), s3(Vector(Vector(s2(Vector(Vector(s0(Vector(Vector(76.0), Vector(77.0)), Vector(Vector(78.0), Vector(79.0))))), s1(s0(Vector(Vector(80.0), Vector(81.0)), Vector(Vector(82.0), Vector(83.0))), Vector(s0(Vector(Vector(84.0), Vector(85.0)), Vector(Vector(86.0), Vector(87.0)))))))), s1(s0(Vector(Vector(88.0), Vector(89.0)), Vector(Vector(90.0), Vector(91.0))), Vector(s0(Vector(Vector(92.0), Vector(93.0)), Vector(Vector(94.0), Vector(95.0))))))), Vector(s1(s0(Vector(Vector(96.0), Vector(97.0)), Vector(Vector(98.0), Vector(99.0))), Vector(s0(Vector(Vector(100.0), Vector(101.0)), Vector(Vector(102.0), Vector(103.0))))), s1(s0(Vector(Vector(104.0), Vector(105.0)), Vector(Vector(106.0), Vector(107.0))), Vector(s0(Vector(Vector(108.0), Vector(109.0)), Vector(Vector(110.0), Vector(111.0)))))))), s7(s5(Vector(s3(Vector(Vector(s2(Vector(Vector(s0(Vector(Vector(112.0), Vector(113.0)), Vector(Vector(114.0), Vector(115.0))))), s1(s0(Vector(Vector(116.0), Vector(117.0)), Vector(Vector(118.0), Vector(119.0))), Vector(s0(Vector(Vector(120.0), Vector(121.0)), Vector(Vector(122.0), Vector(123.0)))))))), s1(s0(Vector(Vector(124.0), Vector(125.0)), Vector(Vector(126.0), Vector(127.0))), Vector(s0(Vector(Vector(128.0), Vector(129.0)), Vector(Vector(130.0), Vector(131.0)))))), s3(Vector(Vector(s2(Vector(Vector(s0(Vector(Vector(132.0), Vector(133.0)), Vector(Vector(134.0), Vector(135.0))))), s1(s0(Vector(Vector(136.0), Vector(137.0)), Vector(Vector(138.0), Vector(139.0))), Vector(s0(Vector(Vector(140.0), Vector(141.0)), Vector(Vector(142.0), Vector(143.0)))))))), s1(s0(Vector(Vector(144.0), Vector(145.0)), Vector(Vector(146.0), Vector(147.0))), Vector(s0(Vector(Vector(148.0), Vector(149.0)), Vector(Vector(150.0), Vector(151.0))))))), Vector(s1(s0(Vector(Vector(152.0), Vector(153.0)), Vector(Vector(154.0), Vector(155.0))), Vector(s0(Vector(Vector(156.0), Vector(157.0)), Vector(Vector(158.0), Vector(159.0))))), s1(s0(Vector(Vector(160.0), Vector(161.0)), Vector(Vector(162.0), Vector(163.0))), Vector(s0(Vector(Vector(164.0), Vector(165.0)), Vector(Vector(166.0), Vector(167.0))))))), Vector(s4(s1(s0(Vector(Vector(168.0), Vector(169.0)), Vector(Vector(170.0), Vector(171.0))), Vector(s0(Vector(Vector(172.0), Vector(173.0)), Vector(Vector(174.0), Vector(175.0))))), s1(s0(Vector(Vector(176.0), Vector(177.0)), Vector(Vector(178.0), Vector(179.0))), Vector(s0(Vector(Vector(180.0), Vector(181.0)), Vector(Vector(182.0), Vector(183.0)))))), s4(s1(s0(Vector(Vector(184.0), Vector(185.0)), Vector(Vector(186.0), Vector(187.0))), Vector(s0(Vector(Vector(188.0), Vector(189.0)), Vector(Vector(190.0), Vector(191.0))))), s1(s0(Vector(Vector(192.0), Vector(193.0)), Vector(Vector(194.0), Vector(195.0))), Vector(s0(Vector(Vector(196.0), Vector(197.0)), Vector(Vector(198.0), Vector(199.0)))))), s4(s1(s0(Vector(Vector(200.0), Vector(201.0)), Vector(Vector(202.0), Vector(203.0))), Vector(s0(Vector(Vector(204.0), Vector(205.0)), Vector(Vector(206.0), Vector(207.0))))), s1(s0(Vector(Vector(208.0), Vector(209.0)), Vector(Vector(210.0), Vector(211.0))), Vector(s0(Vector(Vector(212.0), Vector(213.0)), Vector(Vector(214.0), Vector(215.0)))))))))
    val v1: Vector[Vector[s1]] = Vector(Vector(s1(s0(Vector(Vector(216.0), Vector(217.0)), Vector(Vector(218.0), Vector(219.0))), Vector(s0(Vector(Vector(220.0), Vector(221.0)), Vector(Vector(222.0), Vector(223.0)))))), Vector(s1(s0(Vector(Vector(224.0), Vector(225.0)), Vector(Vector(226.0), Vector(227.0))), Vector(s0(Vector(Vector(228.0), Vector(229.0)), Vector(Vector(230.0), Vector(231.0)))))))
    val v2: Double = 232.0
    val start = nanoTime()
    var result: Double = 232.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}