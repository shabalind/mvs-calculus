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
    p0: s0,
    p1: s1
  )
  case class s4 (
    p0: Vector[Vector[s3]],
    p1: s0,
    p2: s3,
    p3: s3
  )
  case class s5 (
    p0: s4,
    p1: s0
  )
  case class s8 (
    p0: s5,
    p1: Vector[s3]
  )
  case class s9 (
    p0: s4,
    p1: Vector[s2],
    p2: s2,
    p3: Vector[s0]
  )
  def f4(v0: Double): Double = {
    var v3: Double = v0
    var v2: Double = v3
    var v6: Double = v2
    var v5: Double = v2
    val v8: Vector[Double] = Vector(v0, v5, v0, v5, v2, v6)
    v6 = v0
    var v7: Double = v0
    val v12: Double = v8(3)
    val v13: Double = v8(3)
    var v39: Double = v12
    var v25: Vector[Double] = v8
    val v16: Vector[Vector[Double]] = Vector(v25, v25, v25, v25, v8, v8, v8)
    val v22: Double = v12 / v12
    val v40: Vector[Double] = Vector(v13)
    val v24: Double = v40(0)
    var v21: Vector[Vector[Double]] = v16
    var v20: Vector[Vector[Double]] = v21
    val v34: Vector[Double] = v21(4)
    var v27: Vector[Double] = v40
    var v83: Vector[Double] = v27
    val v26: Vector[Double] = v20(3)
    val v45: Double = v27(0)
    var v55: Vector[Double] = v25
    val v41: Double = v25(4)
    v21 = v21.updated(4, v34)
    v83 = v83.updated(0, v45)
    v55 = v55.updated(5, v7)
    var v33: Vector[Double] = v83
    val v61: Vector[Double] = v16(2)
    var v106: Vector[Double] = v83
    var v46: Vector[Double] = v27
    v83 = v83.updated(0, v39)
    v20 = v20.updated(6, v61)
    val v37: Double = v55(5)
    v46 = v46.updated(0, v24)
    v33 = v33.updated(0, v37)
    val v66: Vector[Double] = v20(2)
    v25 = v66
    val v57: Vector[Double] = v20(6)
    v46 = v106
    val v47: Vector[Vector[Double]] = Vector(v46, v27, v33, v27, v106, v106)
    v33 = v33.updated(0, v41)
    val v49: Vector[Double] = v47(2)
    v33 = v33.updated(0, v12)
    v20 = v20.updated(4, v55)
    v21 = v21.updated(3, v57)
    v39 = v3
    var v168: Vector[Double] = v49
    v20 = v20.updated(0, v26)
    val v241: Double = v168(0)
    var v112: Double = v22
    v27 = v27.updated(0, v112)
    v241
  }
  @noinline
  def f0(v0: s8, v1: Vector[Vector[s4]], v2: Vector[s9], v3: Double): Double = {
    var v5: Double = v3
    val v6: Double = f4(v5)
    v5 = v6
    val v18: Double = f4(v6)
    var v25: Double = v18
    v25
  }
  def benchmark(): Unit = {
    val v0: s8 = s8(s5(s4(Vector(Vector(s3(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0))), s1(s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0))), s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0)))))), Vector(s3(s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0))), s1(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0))), s0(Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0))))))), s0(Vector(Vector(18.0)), Vector(Vector(19.0), Vector(20.0))), s3(s0(Vector(Vector(21.0)), Vector(Vector(22.0), Vector(23.0))), s1(s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0))), s0(Vector(Vector(27.0)), Vector(Vector(28.0), Vector(29.0))))), s3(s0(Vector(Vector(30.0)), Vector(Vector(31.0), Vector(32.0))), s1(s0(Vector(Vector(33.0)), Vector(Vector(34.0), Vector(35.0))), s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0)))))), s0(Vector(Vector(39.0)), Vector(Vector(40.0), Vector(41.0)))), Vector(s3(s0(Vector(Vector(42.0)), Vector(Vector(43.0), Vector(44.0))), s1(s0(Vector(Vector(45.0)), Vector(Vector(46.0), Vector(47.0))), s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0))))), s3(s0(Vector(Vector(51.0)), Vector(Vector(52.0), Vector(53.0))), s1(s0(Vector(Vector(54.0)), Vector(Vector(55.0), Vector(56.0))), s0(Vector(Vector(57.0)), Vector(Vector(58.0), Vector(59.0)))))))
    val v1: Vector[Vector[s4]] = Vector(Vector(s4(Vector(Vector(s3(s0(Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0))), s1(s0(Vector(Vector(63.0)), Vector(Vector(64.0), Vector(65.0))), s0(Vector(Vector(66.0)), Vector(Vector(67.0), Vector(68.0)))))), Vector(s3(s0(Vector(Vector(69.0)), Vector(Vector(70.0), Vector(71.0))), s1(s0(Vector(Vector(72.0)), Vector(Vector(73.0), Vector(74.0))), s0(Vector(Vector(75.0)), Vector(Vector(76.0), Vector(77.0))))))), s0(Vector(Vector(78.0)), Vector(Vector(79.0), Vector(80.0))), s3(s0(Vector(Vector(81.0)), Vector(Vector(82.0), Vector(83.0))), s1(s0(Vector(Vector(84.0)), Vector(Vector(85.0), Vector(86.0))), s0(Vector(Vector(87.0)), Vector(Vector(88.0), Vector(89.0))))), s3(s0(Vector(Vector(90.0)), Vector(Vector(91.0), Vector(92.0))), s1(s0(Vector(Vector(93.0)), Vector(Vector(94.0), Vector(95.0))), s0(Vector(Vector(96.0)), Vector(Vector(97.0), Vector(98.0))))))))
    val v2: Vector[s9] = Vector(s9(s4(Vector(Vector(s3(s0(Vector(Vector(99.0)), Vector(Vector(100.0), Vector(101.0))), s1(s0(Vector(Vector(102.0)), Vector(Vector(103.0), Vector(104.0))), s0(Vector(Vector(105.0)), Vector(Vector(106.0), Vector(107.0)))))), Vector(s3(s0(Vector(Vector(108.0)), Vector(Vector(109.0), Vector(110.0))), s1(s0(Vector(Vector(111.0)), Vector(Vector(112.0), Vector(113.0))), s0(Vector(Vector(114.0)), Vector(Vector(115.0), Vector(116.0))))))), s0(Vector(Vector(117.0)), Vector(Vector(118.0), Vector(119.0))), s3(s0(Vector(Vector(120.0)), Vector(Vector(121.0), Vector(122.0))), s1(s0(Vector(Vector(123.0)), Vector(Vector(124.0), Vector(125.0))), s0(Vector(Vector(126.0)), Vector(Vector(127.0), Vector(128.0))))), s3(s0(Vector(Vector(129.0)), Vector(Vector(130.0), Vector(131.0))), s1(s0(Vector(Vector(132.0)), Vector(Vector(133.0), Vector(134.0))), s0(Vector(Vector(135.0)), Vector(Vector(136.0), Vector(137.0)))))), Vector(s2(s1(s0(Vector(Vector(138.0)), Vector(Vector(139.0), Vector(140.0))), s0(Vector(Vector(141.0)), Vector(Vector(142.0), Vector(143.0)))), Vector(s0(Vector(Vector(144.0)), Vector(Vector(145.0), Vector(146.0)))))), s2(s1(s0(Vector(Vector(147.0)), Vector(Vector(148.0), Vector(149.0))), s0(Vector(Vector(150.0)), Vector(Vector(151.0), Vector(152.0)))), Vector(s0(Vector(Vector(153.0)), Vector(Vector(154.0), Vector(155.0))))), Vector(s0(Vector(Vector(156.0)), Vector(Vector(157.0), Vector(158.0))))), s9(s4(Vector(Vector(s3(s0(Vector(Vector(159.0)), Vector(Vector(160.0), Vector(161.0))), s1(s0(Vector(Vector(162.0)), Vector(Vector(163.0), Vector(164.0))), s0(Vector(Vector(165.0)), Vector(Vector(166.0), Vector(167.0)))))), Vector(s3(s0(Vector(Vector(168.0)), Vector(Vector(169.0), Vector(170.0))), s1(s0(Vector(Vector(171.0)), Vector(Vector(172.0), Vector(173.0))), s0(Vector(Vector(174.0)), Vector(Vector(175.0), Vector(176.0))))))), s0(Vector(Vector(177.0)), Vector(Vector(178.0), Vector(179.0))), s3(s0(Vector(Vector(180.0)), Vector(Vector(181.0), Vector(182.0))), s1(s0(Vector(Vector(183.0)), Vector(Vector(184.0), Vector(185.0))), s0(Vector(Vector(186.0)), Vector(Vector(187.0), Vector(188.0))))), s3(s0(Vector(Vector(189.0)), Vector(Vector(190.0), Vector(191.0))), s1(s0(Vector(Vector(192.0)), Vector(Vector(193.0), Vector(194.0))), s0(Vector(Vector(195.0)), Vector(Vector(196.0), Vector(197.0)))))), Vector(s2(s1(s0(Vector(Vector(198.0)), Vector(Vector(199.0), Vector(200.0))), s0(Vector(Vector(201.0)), Vector(Vector(202.0), Vector(203.0)))), Vector(s0(Vector(Vector(204.0)), Vector(Vector(205.0), Vector(206.0)))))), s2(s1(s0(Vector(Vector(207.0)), Vector(Vector(208.0), Vector(209.0))), s0(Vector(Vector(210.0)), Vector(Vector(211.0), Vector(212.0)))), Vector(s0(Vector(Vector(213.0)), Vector(Vector(214.0), Vector(215.0))))), Vector(s0(Vector(Vector(216.0)), Vector(Vector(217.0), Vector(218.0))))))
    val v3: Double = 219.0
    val start = nanoTime()
    var result: Double = 219.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}