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
    p0: Vector[Vector[s0]],
    p1: Vector[Vector[s1]]
  )
  case class s4 (
    p0: Vector[Double],
    p1: s0,
    p2: s1,
    p3: s2,
    p4: Vector[Vector[s0]]
  )
  case class s5 (
    p0: s4,
    p1: s4
  )
  case class s10 (
    p0: s5,
    p1: s1
  )
  def f13(v0: Double): Double = {
    var v2: Double = v0
    val v1: Double = v0 + v0
    var v7: Double = v1
    v2 = v7
    v2 = v1
    var v4: Double = v1
    var v3: Double = v0
    var v5: Double = v2
    var v18: Double = v4
    var v13: Double = v3
    v13 = v0
    val v14: Double = v3 - v4
    v7 = v5
    val v20: Double = v18 - v5
    val v41: Vector[Double] = Vector(v13, v14)
    var v30: Vector[Double] = v41
    v30 = v30.updated(0, v13)
    var v16: Double = v7
    val v36: Double = v30(1)
    var v63: Double = v16
    v4 = v20
    v30 = v30.updated(1, v63)
    v36
  }
  @noinline
  def f0(v0: Vector[s10], v1: Double): Double = {
    val v7: Double = f13(v1)
    var v9: Double = v7
    val v13: Double = f13(v9)
    var v27: Double = v13
    var v39: Double = v13
    val v66: Double = v27 - v39
    v66
  }
  def benchmark(): Unit = {
    val v0: Vector[s10] = Vector(s10(s5(s4(Vector(0.0), s0(Vector(Vector(1.0), Vector(2.0), Vector(3.0)), Vector(Vector(4.0))), s1(Vector(s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0)))), s0(Vector(Vector(9.0), Vector(10.0), Vector(11.0)), Vector(Vector(12.0)))), s2(Vector(Vector(s0(Vector(Vector(13.0), Vector(14.0), Vector(15.0)), Vector(Vector(16.0))))), Vector(Vector(s1(Vector(s0(Vector(Vector(17.0), Vector(18.0), Vector(19.0)), Vector(Vector(20.0)))), s0(Vector(Vector(21.0), Vector(22.0), Vector(23.0)), Vector(Vector(24.0))))), Vector(s1(Vector(s0(Vector(Vector(25.0), Vector(26.0), Vector(27.0)), Vector(Vector(28.0)))), s0(Vector(Vector(29.0), Vector(30.0), Vector(31.0)), Vector(Vector(32.0))))), Vector(s1(Vector(s0(Vector(Vector(33.0), Vector(34.0), Vector(35.0)), Vector(Vector(36.0)))), s0(Vector(Vector(37.0), Vector(38.0), Vector(39.0)), Vector(Vector(40.0))))))), Vector(Vector(s0(Vector(Vector(41.0), Vector(42.0), Vector(43.0)), Vector(Vector(44.0)))), Vector(s0(Vector(Vector(45.0), Vector(46.0), Vector(47.0)), Vector(Vector(48.0)))))), s4(Vector(49.0), s0(Vector(Vector(50.0), Vector(51.0), Vector(52.0)), Vector(Vector(53.0))), s1(Vector(s0(Vector(Vector(54.0), Vector(55.0), Vector(56.0)), Vector(Vector(57.0)))), s0(Vector(Vector(58.0), Vector(59.0), Vector(60.0)), Vector(Vector(61.0)))), s2(Vector(Vector(s0(Vector(Vector(62.0), Vector(63.0), Vector(64.0)), Vector(Vector(65.0))))), Vector(Vector(s1(Vector(s0(Vector(Vector(66.0), Vector(67.0), Vector(68.0)), Vector(Vector(69.0)))), s0(Vector(Vector(70.0), Vector(71.0), Vector(72.0)), Vector(Vector(73.0))))), Vector(s1(Vector(s0(Vector(Vector(74.0), Vector(75.0), Vector(76.0)), Vector(Vector(77.0)))), s0(Vector(Vector(78.0), Vector(79.0), Vector(80.0)), Vector(Vector(81.0))))), Vector(s1(Vector(s0(Vector(Vector(82.0), Vector(83.0), Vector(84.0)), Vector(Vector(85.0)))), s0(Vector(Vector(86.0), Vector(87.0), Vector(88.0)), Vector(Vector(89.0))))))), Vector(Vector(s0(Vector(Vector(90.0), Vector(91.0), Vector(92.0)), Vector(Vector(93.0)))), Vector(s0(Vector(Vector(94.0), Vector(95.0), Vector(96.0)), Vector(Vector(97.0))))))), s1(Vector(s0(Vector(Vector(98.0), Vector(99.0), Vector(100.0)), Vector(Vector(101.0)))), s0(Vector(Vector(102.0), Vector(103.0), Vector(104.0)), Vector(Vector(105.0))))), s10(s5(s4(Vector(106.0), s0(Vector(Vector(107.0), Vector(108.0), Vector(109.0)), Vector(Vector(110.0))), s1(Vector(s0(Vector(Vector(111.0), Vector(112.0), Vector(113.0)), Vector(Vector(114.0)))), s0(Vector(Vector(115.0), Vector(116.0), Vector(117.0)), Vector(Vector(118.0)))), s2(Vector(Vector(s0(Vector(Vector(119.0), Vector(120.0), Vector(121.0)), Vector(Vector(122.0))))), Vector(Vector(s1(Vector(s0(Vector(Vector(123.0), Vector(124.0), Vector(125.0)), Vector(Vector(126.0)))), s0(Vector(Vector(127.0), Vector(128.0), Vector(129.0)), Vector(Vector(130.0))))), Vector(s1(Vector(s0(Vector(Vector(131.0), Vector(132.0), Vector(133.0)), Vector(Vector(134.0)))), s0(Vector(Vector(135.0), Vector(136.0), Vector(137.0)), Vector(Vector(138.0))))), Vector(s1(Vector(s0(Vector(Vector(139.0), Vector(140.0), Vector(141.0)), Vector(Vector(142.0)))), s0(Vector(Vector(143.0), Vector(144.0), Vector(145.0)), Vector(Vector(146.0))))))), Vector(Vector(s0(Vector(Vector(147.0), Vector(148.0), Vector(149.0)), Vector(Vector(150.0)))), Vector(s0(Vector(Vector(151.0), Vector(152.0), Vector(153.0)), Vector(Vector(154.0)))))), s4(Vector(155.0), s0(Vector(Vector(156.0), Vector(157.0), Vector(158.0)), Vector(Vector(159.0))), s1(Vector(s0(Vector(Vector(160.0), Vector(161.0), Vector(162.0)), Vector(Vector(163.0)))), s0(Vector(Vector(164.0), Vector(165.0), Vector(166.0)), Vector(Vector(167.0)))), s2(Vector(Vector(s0(Vector(Vector(168.0), Vector(169.0), Vector(170.0)), Vector(Vector(171.0))))), Vector(Vector(s1(Vector(s0(Vector(Vector(172.0), Vector(173.0), Vector(174.0)), Vector(Vector(175.0)))), s0(Vector(Vector(176.0), Vector(177.0), Vector(178.0)), Vector(Vector(179.0))))), Vector(s1(Vector(s0(Vector(Vector(180.0), Vector(181.0), Vector(182.0)), Vector(Vector(183.0)))), s0(Vector(Vector(184.0), Vector(185.0), Vector(186.0)), Vector(Vector(187.0))))), Vector(s1(Vector(s0(Vector(Vector(188.0), Vector(189.0), Vector(190.0)), Vector(Vector(191.0)))), s0(Vector(Vector(192.0), Vector(193.0), Vector(194.0)), Vector(Vector(195.0))))))), Vector(Vector(s0(Vector(Vector(196.0), Vector(197.0), Vector(198.0)), Vector(Vector(199.0)))), Vector(s0(Vector(Vector(200.0), Vector(201.0), Vector(202.0)), Vector(Vector(203.0))))))), s1(Vector(s0(Vector(Vector(204.0), Vector(205.0), Vector(206.0)), Vector(Vector(207.0)))), s0(Vector(Vector(208.0), Vector(209.0), Vector(210.0)), Vector(Vector(211.0))))))
    val v1: Double = 212.0
    val start = nanoTime()
    var result: Double = 212.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}