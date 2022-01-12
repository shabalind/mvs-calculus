import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]],
    p3: Vector[Vector[Double]],
    p4: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[Vector[s0]]
  )
  case class s2 (
    p0: s0,
    p1: Vector[s1]
  )
  case class s3 (
    p0: Vector[s2],
    p1: s0
  )
  @noinline
  def f0(v0: Vector[Vector[s2]], v1: s3, v2: Double): Double = {
    val v6: Vector[Double] = Vector(v2, v2, v2, v2)
    val v7: Double = v6(1)
    val v11: Double = v2 / v7
    val v9: Double = v6(2)
    var v18: Vector[Double] = v6
    v18 = v18.updated(1, v11)
    val v16: Double = v11 * v11
    v18 = v18.updated(3, v9)
    var v29: Double = v2
    v18 = v18.updated(2, v16)
    var v27: Vector[Double] = v6
    val v34: Double = v27(0)
    v27 = v27.updated(0, v2)
    v27 = v27.updated(1, v11)
    v18 = v18.updated(1, v29)
    val v37: Double = v18(3)
    val v66: Double = v34 / v37
    v18 = v18.updated(3, v29)
    v66
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s2]] = Vector(Vector(s2(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0)), Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0)), Vector(Vector(8.0), Vector(9.0), Vector(10.0))), Vector(s1(Vector(s0(Vector(Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0)), Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0)), Vector(Vector(19.0), Vector(20.0), Vector(21.0))), s0(Vector(Vector(22.0), Vector(23.0)), Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0)), Vector(Vector(29.0)), Vector(Vector(30.0), Vector(31.0), Vector(32.0)))), Vector(Vector(s0(Vector(Vector(33.0), Vector(34.0)), Vector(Vector(35.0), Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0)), Vector(Vector(40.0)), Vector(Vector(41.0), Vector(42.0), Vector(43.0)))), Vector(s0(Vector(Vector(44.0), Vector(45.0)), Vector(Vector(46.0), Vector(47.0), Vector(48.0)), Vector(Vector(49.0), Vector(50.0)), Vector(Vector(51.0)), Vector(Vector(52.0), Vector(53.0), Vector(54.0)))))), s1(Vector(s0(Vector(Vector(55.0), Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0)), Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0)), Vector(Vector(63.0), Vector(64.0), Vector(65.0))), s0(Vector(Vector(66.0), Vector(67.0)), Vector(Vector(68.0), Vector(69.0), Vector(70.0)), Vector(Vector(71.0), Vector(72.0)), Vector(Vector(73.0)), Vector(Vector(74.0), Vector(75.0), Vector(76.0)))), Vector(Vector(s0(Vector(Vector(77.0), Vector(78.0)), Vector(Vector(79.0), Vector(80.0), Vector(81.0)), Vector(Vector(82.0), Vector(83.0)), Vector(Vector(84.0)), Vector(Vector(85.0), Vector(86.0), Vector(87.0)))), Vector(s0(Vector(Vector(88.0), Vector(89.0)), Vector(Vector(90.0), Vector(91.0), Vector(92.0)), Vector(Vector(93.0), Vector(94.0)), Vector(Vector(95.0)), Vector(Vector(96.0), Vector(97.0), Vector(98.0))))))))))
    val v1: s3 = s3(Vector(s2(s0(Vector(Vector(99.0), Vector(100.0)), Vector(Vector(101.0), Vector(102.0), Vector(103.0)), Vector(Vector(104.0), Vector(105.0)), Vector(Vector(106.0)), Vector(Vector(107.0), Vector(108.0), Vector(109.0))), Vector(s1(Vector(s0(Vector(Vector(110.0), Vector(111.0)), Vector(Vector(112.0), Vector(113.0), Vector(114.0)), Vector(Vector(115.0), Vector(116.0)), Vector(Vector(117.0)), Vector(Vector(118.0), Vector(119.0), Vector(120.0))), s0(Vector(Vector(121.0), Vector(122.0)), Vector(Vector(123.0), Vector(124.0), Vector(125.0)), Vector(Vector(126.0), Vector(127.0)), Vector(Vector(128.0)), Vector(Vector(129.0), Vector(130.0), Vector(131.0)))), Vector(Vector(s0(Vector(Vector(132.0), Vector(133.0)), Vector(Vector(134.0), Vector(135.0), Vector(136.0)), Vector(Vector(137.0), Vector(138.0)), Vector(Vector(139.0)), Vector(Vector(140.0), Vector(141.0), Vector(142.0)))), Vector(s0(Vector(Vector(143.0), Vector(144.0)), Vector(Vector(145.0), Vector(146.0), Vector(147.0)), Vector(Vector(148.0), Vector(149.0)), Vector(Vector(150.0)), Vector(Vector(151.0), Vector(152.0), Vector(153.0)))))), s1(Vector(s0(Vector(Vector(154.0), Vector(155.0)), Vector(Vector(156.0), Vector(157.0), Vector(158.0)), Vector(Vector(159.0), Vector(160.0)), Vector(Vector(161.0)), Vector(Vector(162.0), Vector(163.0), Vector(164.0))), s0(Vector(Vector(165.0), Vector(166.0)), Vector(Vector(167.0), Vector(168.0), Vector(169.0)), Vector(Vector(170.0), Vector(171.0)), Vector(Vector(172.0)), Vector(Vector(173.0), Vector(174.0), Vector(175.0)))), Vector(Vector(s0(Vector(Vector(176.0), Vector(177.0)), Vector(Vector(178.0), Vector(179.0), Vector(180.0)), Vector(Vector(181.0), Vector(182.0)), Vector(Vector(183.0)), Vector(Vector(184.0), Vector(185.0), Vector(186.0)))), Vector(s0(Vector(Vector(187.0), Vector(188.0)), Vector(Vector(189.0), Vector(190.0), Vector(191.0)), Vector(Vector(192.0), Vector(193.0)), Vector(Vector(194.0)), Vector(Vector(195.0), Vector(196.0), Vector(197.0))))))))), s0(Vector(Vector(198.0), Vector(199.0)), Vector(Vector(200.0), Vector(201.0), Vector(202.0)), Vector(Vector(203.0), Vector(204.0)), Vector(Vector(205.0)), Vector(Vector(206.0), Vector(207.0), Vector(208.0))))
    val v2: Double = 209.0
    val start = nanoTime()
    var result: Double = 209.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}