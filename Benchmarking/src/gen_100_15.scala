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
    p0: s1,
    p1: Vector[Vector[s1]]
  )
  case class s3 (
    p0: Vector[s2],
    p1: s2,
    p2: s1
  )
  case class s4 (
    p0: s2,
    p1: s0
  )
  @noinline
  def f0(v0: s3, v1: Vector[s4], v2: s1, v3: Double): Double = {
    var v4: Double = v3
    val v8: s4 = v1(0)
    val v5: s0 = v8.p1
    val v16: Vector[Vector[Double]] = v5.p1
    val v20: Vector[Double] = v16(0)
    val v65: Double = v3 / v4
    var v63: Vector[Double] = v20
    v63 = v63.updated(0, v3)
    v63 = v63.updated(0, v65)
    val v94: Double = v63(0)
    v63 = v63.updated(0, v4)
    v63 = v63.updated(0, v3)
    v94
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(Vector(s2(s1(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0))), s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0))), s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0)))), s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0)))), Vector(Vector(s1(Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0))), s0(Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0))), s0(Vector(Vector(18.0)), Vector(Vector(19.0), Vector(20.0)))), s0(Vector(Vector(21.0)), Vector(Vector(22.0), Vector(23.0))))), Vector(s1(Vector(s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0))), s0(Vector(Vector(27.0)), Vector(Vector(28.0), Vector(29.0))), s0(Vector(Vector(30.0)), Vector(Vector(31.0), Vector(32.0)))), s0(Vector(Vector(33.0)), Vector(Vector(34.0), Vector(35.0))))), Vector(s1(Vector(s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0))), s0(Vector(Vector(39.0)), Vector(Vector(40.0), Vector(41.0))), s0(Vector(Vector(42.0)), Vector(Vector(43.0), Vector(44.0)))), s0(Vector(Vector(45.0)), Vector(Vector(46.0), Vector(47.0))))))), s2(s1(Vector(s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0))), s0(Vector(Vector(51.0)), Vector(Vector(52.0), Vector(53.0))), s0(Vector(Vector(54.0)), Vector(Vector(55.0), Vector(56.0)))), s0(Vector(Vector(57.0)), Vector(Vector(58.0), Vector(59.0)))), Vector(Vector(s1(Vector(s0(Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0))), s0(Vector(Vector(63.0)), Vector(Vector(64.0), Vector(65.0))), s0(Vector(Vector(66.0)), Vector(Vector(67.0), Vector(68.0)))), s0(Vector(Vector(69.0)), Vector(Vector(70.0), Vector(71.0))))), Vector(s1(Vector(s0(Vector(Vector(72.0)), Vector(Vector(73.0), Vector(74.0))), s0(Vector(Vector(75.0)), Vector(Vector(76.0), Vector(77.0))), s0(Vector(Vector(78.0)), Vector(Vector(79.0), Vector(80.0)))), s0(Vector(Vector(81.0)), Vector(Vector(82.0), Vector(83.0))))), Vector(s1(Vector(s0(Vector(Vector(84.0)), Vector(Vector(85.0), Vector(86.0))), s0(Vector(Vector(87.0)), Vector(Vector(88.0), Vector(89.0))), s0(Vector(Vector(90.0)), Vector(Vector(91.0), Vector(92.0)))), s0(Vector(Vector(93.0)), Vector(Vector(94.0), Vector(95.0)))))))), s2(s1(Vector(s0(Vector(Vector(96.0)), Vector(Vector(97.0), Vector(98.0))), s0(Vector(Vector(99.0)), Vector(Vector(100.0), Vector(101.0))), s0(Vector(Vector(102.0)), Vector(Vector(103.0), Vector(104.0)))), s0(Vector(Vector(105.0)), Vector(Vector(106.0), Vector(107.0)))), Vector(Vector(s1(Vector(s0(Vector(Vector(108.0)), Vector(Vector(109.0), Vector(110.0))), s0(Vector(Vector(111.0)), Vector(Vector(112.0), Vector(113.0))), s0(Vector(Vector(114.0)), Vector(Vector(115.0), Vector(116.0)))), s0(Vector(Vector(117.0)), Vector(Vector(118.0), Vector(119.0))))), Vector(s1(Vector(s0(Vector(Vector(120.0)), Vector(Vector(121.0), Vector(122.0))), s0(Vector(Vector(123.0)), Vector(Vector(124.0), Vector(125.0))), s0(Vector(Vector(126.0)), Vector(Vector(127.0), Vector(128.0)))), s0(Vector(Vector(129.0)), Vector(Vector(130.0), Vector(131.0))))), Vector(s1(Vector(s0(Vector(Vector(132.0)), Vector(Vector(133.0), Vector(134.0))), s0(Vector(Vector(135.0)), Vector(Vector(136.0), Vector(137.0))), s0(Vector(Vector(138.0)), Vector(Vector(139.0), Vector(140.0)))), s0(Vector(Vector(141.0)), Vector(Vector(142.0), Vector(143.0))))))), s1(Vector(s0(Vector(Vector(144.0)), Vector(Vector(145.0), Vector(146.0))), s0(Vector(Vector(147.0)), Vector(Vector(148.0), Vector(149.0))), s0(Vector(Vector(150.0)), Vector(Vector(151.0), Vector(152.0)))), s0(Vector(Vector(153.0)), Vector(Vector(154.0), Vector(155.0)))))
    val v1: Vector[s4] = Vector(s4(s2(s1(Vector(s0(Vector(Vector(156.0)), Vector(Vector(157.0), Vector(158.0))), s0(Vector(Vector(159.0)), Vector(Vector(160.0), Vector(161.0))), s0(Vector(Vector(162.0)), Vector(Vector(163.0), Vector(164.0)))), s0(Vector(Vector(165.0)), Vector(Vector(166.0), Vector(167.0)))), Vector(Vector(s1(Vector(s0(Vector(Vector(168.0)), Vector(Vector(169.0), Vector(170.0))), s0(Vector(Vector(171.0)), Vector(Vector(172.0), Vector(173.0))), s0(Vector(Vector(174.0)), Vector(Vector(175.0), Vector(176.0)))), s0(Vector(Vector(177.0)), Vector(Vector(178.0), Vector(179.0))))), Vector(s1(Vector(s0(Vector(Vector(180.0)), Vector(Vector(181.0), Vector(182.0))), s0(Vector(Vector(183.0)), Vector(Vector(184.0), Vector(185.0))), s0(Vector(Vector(186.0)), Vector(Vector(187.0), Vector(188.0)))), s0(Vector(Vector(189.0)), Vector(Vector(190.0), Vector(191.0))))), Vector(s1(Vector(s0(Vector(Vector(192.0)), Vector(Vector(193.0), Vector(194.0))), s0(Vector(Vector(195.0)), Vector(Vector(196.0), Vector(197.0))), s0(Vector(Vector(198.0)), Vector(Vector(199.0), Vector(200.0)))), s0(Vector(Vector(201.0)), Vector(Vector(202.0), Vector(203.0))))))), s0(Vector(Vector(204.0)), Vector(Vector(205.0), Vector(206.0)))))
    val v2: s1 = s1(Vector(s0(Vector(Vector(207.0)), Vector(Vector(208.0), Vector(209.0))), s0(Vector(Vector(210.0)), Vector(Vector(211.0), Vector(212.0))), s0(Vector(Vector(213.0)), Vector(Vector(214.0), Vector(215.0)))), s0(Vector(Vector(216.0)), Vector(Vector(217.0), Vector(218.0))))
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