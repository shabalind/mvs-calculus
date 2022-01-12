import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  case class s2 (
    p0: s0,
    p1: Vector[s1]
  )
  case class s4 (
    p0: s1,
    p1: Vector[Double]
  )
  @noinline
  def f0(v0: Vector[s4], v1: Vector[s2], v2: Double): Double = {
    val v6: s4 = v0(0)
    val v8: Double = v2 * v2
    val v3: s4 = v0(0)
    var v10: Double = v2
    val v13: Double = v8 / v2
    val v12: Vector[Double] = v6.p1
    val v16: Vector[Double] = v3.p1
    var v17: Vector[Double] = v16
    v17 = v12
    var v87: Double = v2
    v10 = v2
    val v28: Double = v16(0)
    v17 = v17.updated(0, v10)
    val v51: Double = v17(0)
    v17 = v17.updated(0, v28)
    v17 = v17.updated(0, v87)
    v87 = v13
    v51
  }
  def benchmark(): Unit = {
    val v0: Vector[s4] = Vector(s4(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0)))), Vector(s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0))), s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0))), s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0))))), Vector(20.0)))
    val v1: Vector[s2] = Vector(s2(s0(Vector(Vector(21.0), Vector(22.0), Vector(23.0)), Vector(Vector(24.0), Vector(25.0))), Vector(s1(Vector(s0(Vector(Vector(26.0), Vector(27.0), Vector(28.0)), Vector(Vector(29.0), Vector(30.0)))), Vector(s0(Vector(Vector(31.0), Vector(32.0), Vector(33.0)), Vector(Vector(34.0), Vector(35.0))), s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0), Vector(40.0))), s0(Vector(Vector(41.0), Vector(42.0), Vector(43.0)), Vector(Vector(44.0), Vector(45.0))))), s1(Vector(s0(Vector(Vector(46.0), Vector(47.0), Vector(48.0)), Vector(Vector(49.0), Vector(50.0)))), Vector(s0(Vector(Vector(51.0), Vector(52.0), Vector(53.0)), Vector(Vector(54.0), Vector(55.0))), s0(Vector(Vector(56.0), Vector(57.0), Vector(58.0)), Vector(Vector(59.0), Vector(60.0))), s0(Vector(Vector(61.0), Vector(62.0), Vector(63.0)), Vector(Vector(64.0), Vector(65.0))))), s1(Vector(s0(Vector(Vector(66.0), Vector(67.0), Vector(68.0)), Vector(Vector(69.0), Vector(70.0)))), Vector(s0(Vector(Vector(71.0), Vector(72.0), Vector(73.0)), Vector(Vector(74.0), Vector(75.0))), s0(Vector(Vector(76.0), Vector(77.0), Vector(78.0)), Vector(Vector(79.0), Vector(80.0))), s0(Vector(Vector(81.0), Vector(82.0), Vector(83.0)), Vector(Vector(84.0), Vector(85.0))))))), s2(s0(Vector(Vector(86.0), Vector(87.0), Vector(88.0)), Vector(Vector(89.0), Vector(90.0))), Vector(s1(Vector(s0(Vector(Vector(91.0), Vector(92.0), Vector(93.0)), Vector(Vector(94.0), Vector(95.0)))), Vector(s0(Vector(Vector(96.0), Vector(97.0), Vector(98.0)), Vector(Vector(99.0), Vector(100.0))), s0(Vector(Vector(101.0), Vector(102.0), Vector(103.0)), Vector(Vector(104.0), Vector(105.0))), s0(Vector(Vector(106.0), Vector(107.0), Vector(108.0)), Vector(Vector(109.0), Vector(110.0))))), s1(Vector(s0(Vector(Vector(111.0), Vector(112.0), Vector(113.0)), Vector(Vector(114.0), Vector(115.0)))), Vector(s0(Vector(Vector(116.0), Vector(117.0), Vector(118.0)), Vector(Vector(119.0), Vector(120.0))), s0(Vector(Vector(121.0), Vector(122.0), Vector(123.0)), Vector(Vector(124.0), Vector(125.0))), s0(Vector(Vector(126.0), Vector(127.0), Vector(128.0)), Vector(Vector(129.0), Vector(130.0))))), s1(Vector(s0(Vector(Vector(131.0), Vector(132.0), Vector(133.0)), Vector(Vector(134.0), Vector(135.0)))), Vector(s0(Vector(Vector(136.0), Vector(137.0), Vector(138.0)), Vector(Vector(139.0), Vector(140.0))), s0(Vector(Vector(141.0), Vector(142.0), Vector(143.0)), Vector(Vector(144.0), Vector(145.0))), s0(Vector(Vector(146.0), Vector(147.0), Vector(148.0)), Vector(Vector(149.0), Vector(150.0))))))), s2(s0(Vector(Vector(151.0), Vector(152.0), Vector(153.0)), Vector(Vector(154.0), Vector(155.0))), Vector(s1(Vector(s0(Vector(Vector(156.0), Vector(157.0), Vector(158.0)), Vector(Vector(159.0), Vector(160.0)))), Vector(s0(Vector(Vector(161.0), Vector(162.0), Vector(163.0)), Vector(Vector(164.0), Vector(165.0))), s0(Vector(Vector(166.0), Vector(167.0), Vector(168.0)), Vector(Vector(169.0), Vector(170.0))), s0(Vector(Vector(171.0), Vector(172.0), Vector(173.0)), Vector(Vector(174.0), Vector(175.0))))), s1(Vector(s0(Vector(Vector(176.0), Vector(177.0), Vector(178.0)), Vector(Vector(179.0), Vector(180.0)))), Vector(s0(Vector(Vector(181.0), Vector(182.0), Vector(183.0)), Vector(Vector(184.0), Vector(185.0))), s0(Vector(Vector(186.0), Vector(187.0), Vector(188.0)), Vector(Vector(189.0), Vector(190.0))), s0(Vector(Vector(191.0), Vector(192.0), Vector(193.0)), Vector(Vector(194.0), Vector(195.0))))), s1(Vector(s0(Vector(Vector(196.0), Vector(197.0), Vector(198.0)), Vector(Vector(199.0), Vector(200.0)))), Vector(s0(Vector(Vector(201.0), Vector(202.0), Vector(203.0)), Vector(Vector(204.0), Vector(205.0))), s0(Vector(Vector(206.0), Vector(207.0), Vector(208.0)), Vector(Vector(209.0), Vector(210.0))), s0(Vector(Vector(211.0), Vector(212.0), Vector(213.0)), Vector(Vector(214.0), Vector(215.0))))))))
    val v2: Double = 216.0
    val start = nanoTime()
    var result: Double = 216.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}