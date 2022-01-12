import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: Vector[s0]
  )
  case class s2 (
    p0: Vector[s1],
    p1: Vector[Vector[s1]]
  )
  case class s3 (
    p0: s0,
    p1: s1
  )
  case class s8 (
    p0: Vector[s2],
    p1: s3
  )
  case class s14 (
    p0: Vector[s8],
    p1: s2
  )
  def f49(v0: Double): Double = {
    var v6: Double = v0
    var v2: Double = v0
    var v4: Double = v0
    var v8: Double = v0
    var v7: Double = v2
    var v5: Double = v8
    v7 = v5
    var v3: Double = v0
    var v12: Double = v6
    var v11: Double = v2
    val v15: Vector[Double] = Vector(v11, v7, v3, v12)
    var v9: Double = v11
    val v17: Double = v15(0)
    val v18: Vector[Double] = Vector(v17, v9, v17, v0)
    v5 = v9
    val v46: Double = v18(1)
    v4 = v2
    val v58: Double = v46 / v4
    v58
  }
  @noinline
  def f0(v0: Vector[Vector[s14]], v1: Double): Double = {
    val v3: Double = f49(v1)
    val v4: Double = f49(v3)
    val v10: Double = v4 * v4
    val v13: Double = v10 / v1
    val v14: Double = f49(v13)
    val v31: Double = f49(v14)
    var v48: Double = v13
    val v72: Double = v31 + v48
    v72
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s14]] = Vector(Vector(s14(Vector(s8(Vector(s2(Vector(s1(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0)))), Vector(s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0))))), Vector(s0(Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0), Vector(14.0))), s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0)))))), Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0), Vector(24.0)))), Vector(s0(Vector(Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0))))), Vector(s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0), Vector(33.0), Vector(34.0))), s0(Vector(Vector(35.0), Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0))))))))), s3(s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0), Vector(44.0))), s1(Vector(Vector(s0(Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0), Vector(48.0), Vector(49.0)))), Vector(s0(Vector(Vector(50.0), Vector(51.0)), Vector(Vector(52.0), Vector(53.0), Vector(54.0))))), Vector(s0(Vector(Vector(55.0), Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0))), s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0), Vector(63.0), Vector(64.0)))))))), s2(Vector(s1(Vector(Vector(s0(Vector(Vector(65.0), Vector(66.0)), Vector(Vector(67.0), Vector(68.0), Vector(69.0)))), Vector(s0(Vector(Vector(70.0), Vector(71.0)), Vector(Vector(72.0), Vector(73.0), Vector(74.0))))), Vector(s0(Vector(Vector(75.0), Vector(76.0)), Vector(Vector(77.0), Vector(78.0), Vector(79.0))), s0(Vector(Vector(80.0), Vector(81.0)), Vector(Vector(82.0), Vector(83.0), Vector(84.0)))))), Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(85.0), Vector(86.0)), Vector(Vector(87.0), Vector(88.0), Vector(89.0)))), Vector(s0(Vector(Vector(90.0), Vector(91.0)), Vector(Vector(92.0), Vector(93.0), Vector(94.0))))), Vector(s0(Vector(Vector(95.0), Vector(96.0)), Vector(Vector(97.0), Vector(98.0), Vector(99.0))), s0(Vector(Vector(100.0), Vector(101.0)), Vector(Vector(102.0), Vector(103.0), Vector(104.0)))))))))), Vector(s14(Vector(s8(Vector(s2(Vector(s1(Vector(Vector(s0(Vector(Vector(105.0), Vector(106.0)), Vector(Vector(107.0), Vector(108.0), Vector(109.0)))), Vector(s0(Vector(Vector(110.0), Vector(111.0)), Vector(Vector(112.0), Vector(113.0), Vector(114.0))))), Vector(s0(Vector(Vector(115.0), Vector(116.0)), Vector(Vector(117.0), Vector(118.0), Vector(119.0))), s0(Vector(Vector(120.0), Vector(121.0)), Vector(Vector(122.0), Vector(123.0), Vector(124.0)))))), Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(125.0), Vector(126.0)), Vector(Vector(127.0), Vector(128.0), Vector(129.0)))), Vector(s0(Vector(Vector(130.0), Vector(131.0)), Vector(Vector(132.0), Vector(133.0), Vector(134.0))))), Vector(s0(Vector(Vector(135.0), Vector(136.0)), Vector(Vector(137.0), Vector(138.0), Vector(139.0))), s0(Vector(Vector(140.0), Vector(141.0)), Vector(Vector(142.0), Vector(143.0), Vector(144.0))))))))), s3(s0(Vector(Vector(145.0), Vector(146.0)), Vector(Vector(147.0), Vector(148.0), Vector(149.0))), s1(Vector(Vector(s0(Vector(Vector(150.0), Vector(151.0)), Vector(Vector(152.0), Vector(153.0), Vector(154.0)))), Vector(s0(Vector(Vector(155.0), Vector(156.0)), Vector(Vector(157.0), Vector(158.0), Vector(159.0))))), Vector(s0(Vector(Vector(160.0), Vector(161.0)), Vector(Vector(162.0), Vector(163.0), Vector(164.0))), s0(Vector(Vector(165.0), Vector(166.0)), Vector(Vector(167.0), Vector(168.0), Vector(169.0)))))))), s2(Vector(s1(Vector(Vector(s0(Vector(Vector(170.0), Vector(171.0)), Vector(Vector(172.0), Vector(173.0), Vector(174.0)))), Vector(s0(Vector(Vector(175.0), Vector(176.0)), Vector(Vector(177.0), Vector(178.0), Vector(179.0))))), Vector(s0(Vector(Vector(180.0), Vector(181.0)), Vector(Vector(182.0), Vector(183.0), Vector(184.0))), s0(Vector(Vector(185.0), Vector(186.0)), Vector(Vector(187.0), Vector(188.0), Vector(189.0)))))), Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(190.0), Vector(191.0)), Vector(Vector(192.0), Vector(193.0), Vector(194.0)))), Vector(s0(Vector(Vector(195.0), Vector(196.0)), Vector(Vector(197.0), Vector(198.0), Vector(199.0))))), Vector(s0(Vector(Vector(200.0), Vector(201.0)), Vector(Vector(202.0), Vector(203.0), Vector(204.0))), s0(Vector(Vector(205.0), Vector(206.0)), Vector(Vector(207.0), Vector(208.0), Vector(209.0)))))))))))
    val v1: Double = 210.0
    val start = nanoTime()
    var result: Double = 210.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}