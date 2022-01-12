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
    p1: s1,
    p2: Vector[s0],
    p3: s1
  )
  case class s3 (
    p0: s2,
    p1: s0
  )
  case class s4 (
    p0: s2,
    p1: s0
  )
  case class s5 (
    p0: s1,
    p1: s1
  )
  case class s6 (
    p0: Vector[s5],
    p1: s3
  )
  case class s7 (
    p0: s3,
    p1: s6,
    p2: Vector[Vector[s4]]
  )
  def f32(v0: s0): s0 = {
    val v2: Vector[Vector[Double]] = v0.p1
    val v1: Vector[Double] = v2(0)
    val v4: Vector[Vector[Double]] = v0.p1
    var v5: s0 = v0
    val v9: Vector[Vector[Double]] = v0.p1
    val v3: Vector[Vector[Double]] = v0.p1
    val v8: Vector[s0] = Vector(v5, v0, v5, v5, v0, v0)
    val v16: Vector[Vector[Double]] = v5.p0
    val v11: Vector[Double] = v9(2)
    val v12: Vector[Vector[Double]] = v0.p1
    var v10: Vector[Vector[Double]] = v4
    v10 = v10.updated(0, v1)
    v5 = v5.copy(p1 = v10)
    var v27: Vector[Vector[Double]] = v4
    v27 = v27.updated(1, v1)
    val v20: Vector[Vector[Double]] = v5.p0
    v27 = v27.updated(2, v1)
    val v15: s1 = s1(v5, v5)
    val v36: Vector[Vector[Double]] = v5.p1
    v5 = v5.copy(p1 = v36)
    v10 = v10.updated(2, v11)
    v27 = v36
    v5 = v5.copy(p1 = v12)
    val v39: s0 = v8(2)
    v5 = v5.copy(p0 = v16)
    val v44: s0 = v15.p1
    val v24: s1 = s1(v44, v39)
    v5 = v5.copy(p1 = v27)
    v5 = v5.copy(p0 = v20)
    v5 = v5.copy(p1 = v3)
    val v102: s0 = v24.p0
    v102
  }
  def f27(v0: s0): s0 = {
    val v4: s0 = f32(v0)
    val v1: s1 = s1(v4, v0)
    val v17: s0 = v1.p1
    val v35: s0 = f32(v17)
    v35
  }
  @noinline
  def f0(v0: Vector[s5], v1: s7, v2: Double): Double = {
    val v13: s5 = v0(0)
    val v24: s1 = v13.p1
    val v31: s0 = v24.p0
    var v25: s0 = v31
    val v42: s0 = f27(v25)
    val v30: Vector[s0] = Vector(v42, v31, v42, v31, v42)
    val v48: s0 = v24.p0
    var v45: Vector[s0] = v30
    val v38: s0 = v45(4)
    val v62: Vector[Vector[Double]] = v48.p0
    val v100: Vector[Vector[Double]] = v38.p1
    val v56: Vector[Double] = v100(2)
    var v39: Vector[Double] = v56
    val v80: Double = v39(0)
    v25 = v25.copy(p0 = v62)
    v25 = v25.copy(p0 = v62)
    v45 = v45.updated(1, v42)
    v80
  }
  def benchmark(): Unit = {
    val v0: Vector[s5] = Vector(s5(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0))), s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0)))), s1(s0(Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0), Vector(14.0))), s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0))))))
    val v1: s7 = s7(s3(s2(s1(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0), Vector(24.0))), s0(Vector(Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0)))), s1(s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0), Vector(33.0), Vector(34.0))), s0(Vector(Vector(35.0), Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0)))), Vector(s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0), Vector(44.0))), s0(Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0), Vector(48.0), Vector(49.0)))), s1(s0(Vector(Vector(50.0), Vector(51.0)), Vector(Vector(52.0), Vector(53.0), Vector(54.0))), s0(Vector(Vector(55.0), Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0))))), s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0), Vector(63.0), Vector(64.0)))), s6(Vector(s5(s1(s0(Vector(Vector(65.0), Vector(66.0)), Vector(Vector(67.0), Vector(68.0), Vector(69.0))), s0(Vector(Vector(70.0), Vector(71.0)), Vector(Vector(72.0), Vector(73.0), Vector(74.0)))), s1(s0(Vector(Vector(75.0), Vector(76.0)), Vector(Vector(77.0), Vector(78.0), Vector(79.0))), s0(Vector(Vector(80.0), Vector(81.0)), Vector(Vector(82.0), Vector(83.0), Vector(84.0)))))), s3(s2(s1(s0(Vector(Vector(85.0), Vector(86.0)), Vector(Vector(87.0), Vector(88.0), Vector(89.0))), s0(Vector(Vector(90.0), Vector(91.0)), Vector(Vector(92.0), Vector(93.0), Vector(94.0)))), s1(s0(Vector(Vector(95.0), Vector(96.0)), Vector(Vector(97.0), Vector(98.0), Vector(99.0))), s0(Vector(Vector(100.0), Vector(101.0)), Vector(Vector(102.0), Vector(103.0), Vector(104.0)))), Vector(s0(Vector(Vector(105.0), Vector(106.0)), Vector(Vector(107.0), Vector(108.0), Vector(109.0))), s0(Vector(Vector(110.0), Vector(111.0)), Vector(Vector(112.0), Vector(113.0), Vector(114.0)))), s1(s0(Vector(Vector(115.0), Vector(116.0)), Vector(Vector(117.0), Vector(118.0), Vector(119.0))), s0(Vector(Vector(120.0), Vector(121.0)), Vector(Vector(122.0), Vector(123.0), Vector(124.0))))), s0(Vector(Vector(125.0), Vector(126.0)), Vector(Vector(127.0), Vector(128.0), Vector(129.0))))), Vector(Vector(s4(s2(s1(s0(Vector(Vector(130.0), Vector(131.0)), Vector(Vector(132.0), Vector(133.0), Vector(134.0))), s0(Vector(Vector(135.0), Vector(136.0)), Vector(Vector(137.0), Vector(138.0), Vector(139.0)))), s1(s0(Vector(Vector(140.0), Vector(141.0)), Vector(Vector(142.0), Vector(143.0), Vector(144.0))), s0(Vector(Vector(145.0), Vector(146.0)), Vector(Vector(147.0), Vector(148.0), Vector(149.0)))), Vector(s0(Vector(Vector(150.0), Vector(151.0)), Vector(Vector(152.0), Vector(153.0), Vector(154.0))), s0(Vector(Vector(155.0), Vector(156.0)), Vector(Vector(157.0), Vector(158.0), Vector(159.0)))), s1(s0(Vector(Vector(160.0), Vector(161.0)), Vector(Vector(162.0), Vector(163.0), Vector(164.0))), s0(Vector(Vector(165.0), Vector(166.0)), Vector(Vector(167.0), Vector(168.0), Vector(169.0))))), s0(Vector(Vector(170.0), Vector(171.0)), Vector(Vector(172.0), Vector(173.0), Vector(174.0))))), Vector(s4(s2(s1(s0(Vector(Vector(175.0), Vector(176.0)), Vector(Vector(177.0), Vector(178.0), Vector(179.0))), s0(Vector(Vector(180.0), Vector(181.0)), Vector(Vector(182.0), Vector(183.0), Vector(184.0)))), s1(s0(Vector(Vector(185.0), Vector(186.0)), Vector(Vector(187.0), Vector(188.0), Vector(189.0))), s0(Vector(Vector(190.0), Vector(191.0)), Vector(Vector(192.0), Vector(193.0), Vector(194.0)))), Vector(s0(Vector(Vector(195.0), Vector(196.0)), Vector(Vector(197.0), Vector(198.0), Vector(199.0))), s0(Vector(Vector(200.0), Vector(201.0)), Vector(Vector(202.0), Vector(203.0), Vector(204.0)))), s1(s0(Vector(Vector(205.0), Vector(206.0)), Vector(Vector(207.0), Vector(208.0), Vector(209.0))), s0(Vector(Vector(210.0), Vector(211.0)), Vector(Vector(212.0), Vector(213.0), Vector(214.0))))), s0(Vector(Vector(215.0), Vector(216.0)), Vector(Vector(217.0), Vector(218.0), Vector(219.0)))))))
    val v2: Double = 220.0
    val start = nanoTime()
    var result: Double = 220.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}