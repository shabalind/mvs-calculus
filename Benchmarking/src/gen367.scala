import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  case class s2 (
    p0: s1,
    p1: s1
  )
  case class s3 (
    p0: s1,
    p1: Vector[Vector[s0]]
  )
  case class s4 (
    p0: Vector[s3],
    p1: Vector[s2]
  )
  case class s5 (
    p0: Vector[s1],
    p1: Double
  )
  def f7(v0: s5): s5 = {
    var v5: s5 = v0
    var v4: s5 = v5
    val v7: Vector[s1] = v4.p0
    v4 = v4.copy(p0 = v7)
    v4
  }
  @noinline
  def f0(v0: Vector[Vector[s2]], v1: Vector[Vector[s1]], v2: s5, v3: s4, v4: Double): Double = {
    val v7: Vector[s1] = v2.p0
    val v12: s5 = f7(v2)
    val v23: s5 = f7(v2)
    val v40: Double = v23.p1
    val v37: Double = v4 * v40
    var v65: s5 = v12
    val v119: Double = v65.p1
    v65 = v65.copy(p0 = v7)
    val v39: Double = v119 - v37
    var v225: Double = v39
    v225
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s2]] = Vector(Vector(s2(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0))), s0(Vector(Vector(3.0), Vector(4.0), Vector(5.0))), s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)))), Vector(s0(Vector(Vector(9.0), Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0))))), s1(Vector(s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0))), s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0))), s0(Vector(Vector(21.0), Vector(22.0), Vector(23.0)))), Vector(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0))), s0(Vector(Vector(27.0), Vector(28.0), Vector(29.0))))))), Vector(s2(s1(Vector(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0))), s0(Vector(Vector(33.0), Vector(34.0), Vector(35.0))), s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)))), Vector(s0(Vector(Vector(39.0), Vector(40.0), Vector(41.0))), s0(Vector(Vector(42.0), Vector(43.0), Vector(44.0))))), s1(Vector(s0(Vector(Vector(45.0), Vector(46.0), Vector(47.0))), s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0))), s0(Vector(Vector(51.0), Vector(52.0), Vector(53.0)))), Vector(s0(Vector(Vector(54.0), Vector(55.0), Vector(56.0))), s0(Vector(Vector(57.0), Vector(58.0), Vector(59.0))))))))
    val v1: Vector[Vector[s1]] = Vector(Vector(s1(Vector(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0))), s0(Vector(Vector(63.0), Vector(64.0), Vector(65.0))), s0(Vector(Vector(66.0), Vector(67.0), Vector(68.0)))), Vector(s0(Vector(Vector(69.0), Vector(70.0), Vector(71.0))), s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)))))))
    val v2: s5 = s5(Vector(s1(Vector(s0(Vector(Vector(75.0), Vector(76.0), Vector(77.0))), s0(Vector(Vector(78.0), Vector(79.0), Vector(80.0))), s0(Vector(Vector(81.0), Vector(82.0), Vector(83.0)))), Vector(s0(Vector(Vector(84.0), Vector(85.0), Vector(86.0))), s0(Vector(Vector(87.0), Vector(88.0), Vector(89.0))))), s1(Vector(s0(Vector(Vector(90.0), Vector(91.0), Vector(92.0))), s0(Vector(Vector(93.0), Vector(94.0), Vector(95.0))), s0(Vector(Vector(96.0), Vector(97.0), Vector(98.0)))), Vector(s0(Vector(Vector(99.0), Vector(100.0), Vector(101.0))), s0(Vector(Vector(102.0), Vector(103.0), Vector(104.0))))), s1(Vector(s0(Vector(Vector(105.0), Vector(106.0), Vector(107.0))), s0(Vector(Vector(108.0), Vector(109.0), Vector(110.0))), s0(Vector(Vector(111.0), Vector(112.0), Vector(113.0)))), Vector(s0(Vector(Vector(114.0), Vector(115.0), Vector(116.0))), s0(Vector(Vector(117.0), Vector(118.0), Vector(119.0)))))), 120.0)
    val v3: s4 = s4(Vector(s3(s1(Vector(s0(Vector(Vector(121.0), Vector(122.0), Vector(123.0))), s0(Vector(Vector(124.0), Vector(125.0), Vector(126.0))), s0(Vector(Vector(127.0), Vector(128.0), Vector(129.0)))), Vector(s0(Vector(Vector(130.0), Vector(131.0), Vector(132.0))), s0(Vector(Vector(133.0), Vector(134.0), Vector(135.0))))), Vector(Vector(s0(Vector(Vector(136.0), Vector(137.0), Vector(138.0)))), Vector(s0(Vector(Vector(139.0), Vector(140.0), Vector(141.0))))))), Vector(s2(s1(Vector(s0(Vector(Vector(142.0), Vector(143.0), Vector(144.0))), s0(Vector(Vector(145.0), Vector(146.0), Vector(147.0))), s0(Vector(Vector(148.0), Vector(149.0), Vector(150.0)))), Vector(s0(Vector(Vector(151.0), Vector(152.0), Vector(153.0))), s0(Vector(Vector(154.0), Vector(155.0), Vector(156.0))))), s1(Vector(s0(Vector(Vector(157.0), Vector(158.0), Vector(159.0))), s0(Vector(Vector(160.0), Vector(161.0), Vector(162.0))), s0(Vector(Vector(163.0), Vector(164.0), Vector(165.0)))), Vector(s0(Vector(Vector(166.0), Vector(167.0), Vector(168.0))), s0(Vector(Vector(169.0), Vector(170.0), Vector(171.0)))))), s2(s1(Vector(s0(Vector(Vector(172.0), Vector(173.0), Vector(174.0))), s0(Vector(Vector(175.0), Vector(176.0), Vector(177.0))), s0(Vector(Vector(178.0), Vector(179.0), Vector(180.0)))), Vector(s0(Vector(Vector(181.0), Vector(182.0), Vector(183.0))), s0(Vector(Vector(184.0), Vector(185.0), Vector(186.0))))), s1(Vector(s0(Vector(Vector(187.0), Vector(188.0), Vector(189.0))), s0(Vector(Vector(190.0), Vector(191.0), Vector(192.0))), s0(Vector(Vector(193.0), Vector(194.0), Vector(195.0)))), Vector(s0(Vector(Vector(196.0), Vector(197.0), Vector(198.0))), s0(Vector(Vector(199.0), Vector(200.0), Vector(201.0))))))))
    val v4: Double = 202.0
    val start = nanoTime()
    var result: Double = 202.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}