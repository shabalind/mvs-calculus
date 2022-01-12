import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: s0
  )
  case class s2 (
    p0: s1,
    p1: Vector[Vector[s1]]
  )
  case class s3 (
    p0: Vector[Vector[s0]],
    p1: Vector[s0]
  )
  case class s4 (
    p0: s2,
    p1: Vector[s3]
  )
  case class s5 (
    p0: Vector[Vector[s2]],
    p1: s1
  )
  case class s6 (
    p0: s4,
    p1: Vector[Double]
  )
  def f3(v0: s1, v1: Double, v2: s4): Double = {
    val v7: s0 = v0.p1
    val v26: Vector[Vector[Double]] = v7.p0
    val v28: Vector[Double] = v26(0)
    val v58: Double = v28(0)
    val v96: Double = v58 / v58
    v96
  }
  def f2(v0: s1): s1 = {
    var v3: s1 = v0
    v3
  }
  @noinline
  def f0(v0: Vector[Vector[s2]], v1: s6, v2: Vector[s5], v3: Vector[s3], v4: Vector[s0], v5: s0, v6: Vector[s6], v7: Double): Double = {
    val v21: s4 = v1.p0
    val v60: s2 = v21.p0
    val v37: s1 = v60.p0
    val v103: s1 = f2(v37)
    val v33: Double = f3(v37, v7, v21)
    val v41: Double = f3(v103, v7, v21)
    val v74: Double = v33 + v33
    val v112: Double = v74 + v41
    v112
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s2]] = Vector(Vector(s2(s1(Vector(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))))), s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0)))), Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))))), s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0)))))))), Vector(s2(s1(Vector(Vector(s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0))))), s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0)))), Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0))))), s0(Vector(Vector(28.0)), Vector(Vector(29.0), Vector(30.0), Vector(31.0)))))))), Vector(s2(s1(Vector(Vector(s0(Vector(Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0))))), s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0)))), Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(40.0)), Vector(Vector(41.0), Vector(42.0), Vector(43.0))))), s0(Vector(Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0)))))))))
    val v1: s6 = s6(s4(s2(s1(Vector(Vector(s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0), Vector(51.0))))), s0(Vector(Vector(52.0)), Vector(Vector(53.0), Vector(54.0), Vector(55.0)))), Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0))))), s0(Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0), Vector(63.0))))))), Vector(s3(Vector(Vector(s0(Vector(Vector(64.0)), Vector(Vector(65.0), Vector(66.0), Vector(67.0))))), Vector(s0(Vector(Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0))))), s3(Vector(Vector(s0(Vector(Vector(72.0)), Vector(Vector(73.0), Vector(74.0), Vector(75.0))))), Vector(s0(Vector(Vector(76.0)), Vector(Vector(77.0), Vector(78.0), Vector(79.0))))))), Vector(80.0))
    val v2: Vector[s5] = Vector(s5(Vector(Vector(s2(s1(Vector(Vector(s0(Vector(Vector(81.0)), Vector(Vector(82.0), Vector(83.0), Vector(84.0))))), s0(Vector(Vector(85.0)), Vector(Vector(86.0), Vector(87.0), Vector(88.0)))), Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(89.0)), Vector(Vector(90.0), Vector(91.0), Vector(92.0))))), s0(Vector(Vector(93.0)), Vector(Vector(94.0), Vector(95.0), Vector(96.0))))))))), s1(Vector(Vector(s0(Vector(Vector(97.0)), Vector(Vector(98.0), Vector(99.0), Vector(100.0))))), s0(Vector(Vector(101.0)), Vector(Vector(102.0), Vector(103.0), Vector(104.0))))))
    val v3: Vector[s3] = Vector(s3(Vector(Vector(s0(Vector(Vector(105.0)), Vector(Vector(106.0), Vector(107.0), Vector(108.0))))), Vector(s0(Vector(Vector(109.0)), Vector(Vector(110.0), Vector(111.0), Vector(112.0))))), s3(Vector(Vector(s0(Vector(Vector(113.0)), Vector(Vector(114.0), Vector(115.0), Vector(116.0))))), Vector(s0(Vector(Vector(117.0)), Vector(Vector(118.0), Vector(119.0), Vector(120.0))))))
    val v4: Vector[s0] = Vector(s0(Vector(Vector(121.0)), Vector(Vector(122.0), Vector(123.0), Vector(124.0))))
    val v5: s0 = s0(Vector(Vector(125.0)), Vector(Vector(126.0), Vector(127.0), Vector(128.0)))
    val v6: Vector[s6] = Vector(s6(s4(s2(s1(Vector(Vector(s0(Vector(Vector(129.0)), Vector(Vector(130.0), Vector(131.0), Vector(132.0))))), s0(Vector(Vector(133.0)), Vector(Vector(134.0), Vector(135.0), Vector(136.0)))), Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(137.0)), Vector(Vector(138.0), Vector(139.0), Vector(140.0))))), s0(Vector(Vector(141.0)), Vector(Vector(142.0), Vector(143.0), Vector(144.0))))))), Vector(s3(Vector(Vector(s0(Vector(Vector(145.0)), Vector(Vector(146.0), Vector(147.0), Vector(148.0))))), Vector(s0(Vector(Vector(149.0)), Vector(Vector(150.0), Vector(151.0), Vector(152.0))))), s3(Vector(Vector(s0(Vector(Vector(153.0)), Vector(Vector(154.0), Vector(155.0), Vector(156.0))))), Vector(s0(Vector(Vector(157.0)), Vector(Vector(158.0), Vector(159.0), Vector(160.0))))))), Vector(161.0)), s6(s4(s2(s1(Vector(Vector(s0(Vector(Vector(162.0)), Vector(Vector(163.0), Vector(164.0), Vector(165.0))))), s0(Vector(Vector(166.0)), Vector(Vector(167.0), Vector(168.0), Vector(169.0)))), Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(170.0)), Vector(Vector(171.0), Vector(172.0), Vector(173.0))))), s0(Vector(Vector(174.0)), Vector(Vector(175.0), Vector(176.0), Vector(177.0))))))), Vector(s3(Vector(Vector(s0(Vector(Vector(178.0)), Vector(Vector(179.0), Vector(180.0), Vector(181.0))))), Vector(s0(Vector(Vector(182.0)), Vector(Vector(183.0), Vector(184.0), Vector(185.0))))), s3(Vector(Vector(s0(Vector(Vector(186.0)), Vector(Vector(187.0), Vector(188.0), Vector(189.0))))), Vector(s0(Vector(Vector(190.0)), Vector(Vector(191.0), Vector(192.0), Vector(193.0))))))), Vector(194.0)))
    val v7: Double = 195.0
    val start = nanoTime()
    var result: Double = 195.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4, v5, v6, v7)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}