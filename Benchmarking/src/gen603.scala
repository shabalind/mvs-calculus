import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[Vector[s0]]
  )
  case class s3 (
    p0: s0,
    p1: s0
  )
  case class s4 (
    p0: Vector[s1]
  )
  case class s5 (
    p0: Vector[s4],
    p1: s0
  )
  case class s6 (
    p0: s3,
    p1: Vector[s1],
    p2: Vector[Vector[s0]],
    p3: Vector[s4],
    p4: s4,
    p5: s3
  )
  case class s8 (
    p0: s5
  )
  def f10(v0: Double): Double = {
    var v1: Double = v0
    var v4: Double = v0
    val v9: Vector[Double] = Vector(v0, v4, v4, v1, v4)
    val v6: Double = v9(0)
    val v10: Double = v9(2)
    val v3: Double = v9(0)
    val v7: Double = v9(0)
    val v13: Double = v9(2)
    val v5: Double = v9(3)
    val v14: Vector[Double] = Vector(v5, v7, v1, v1, v10, v5, v13)
    var v8: Double = v3
    var v11: Vector[Double] = v14
    v11 = v11.updated(6, v6)
    v11 = v11.updated(0, v0)
    v11 = v14
    val v28: Double = v11(2)
    val v35: Double = v13 * v8
    var v40: Double = v28
    v4 = v35
    v40
  }
  @noinline
  def f0(v0: Vector[s8], v1: Vector[s6], v2: Double): Double = {
    val v4: Double = f10(v2)
    v4
  }
  def benchmark(): Unit = {
    val v0: Vector[s8] = Vector(s8(s5(Vector(s4(Vector(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))), Vector(Vector(s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0)))), Vector(s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0)))))), s1(s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0))), Vector(Vector(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0)))), Vector(s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0)))))))), s4(Vector(s1(s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0))), Vector(Vector(s0(Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0)))), Vector(s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0)))))), s1(s0(Vector(Vector(27.0), Vector(28.0)), Vector(Vector(29.0))), Vector(Vector(s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0)))), Vector(s0(Vector(Vector(33.0), Vector(34.0)), Vector(Vector(35.0))))))))), s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0))))), s8(s5(Vector(s4(Vector(s1(s0(Vector(Vector(39.0), Vector(40.0)), Vector(Vector(41.0))), Vector(Vector(s0(Vector(Vector(42.0), Vector(43.0)), Vector(Vector(44.0)))), Vector(s0(Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0)))))), s1(s0(Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0))), Vector(Vector(s0(Vector(Vector(51.0), Vector(52.0)), Vector(Vector(53.0)))), Vector(s0(Vector(Vector(54.0), Vector(55.0)), Vector(Vector(56.0)))))))), s4(Vector(s1(s0(Vector(Vector(57.0), Vector(58.0)), Vector(Vector(59.0))), Vector(Vector(s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0)))), Vector(s0(Vector(Vector(63.0), Vector(64.0)), Vector(Vector(65.0)))))), s1(s0(Vector(Vector(66.0), Vector(67.0)), Vector(Vector(68.0))), Vector(Vector(s0(Vector(Vector(69.0), Vector(70.0)), Vector(Vector(71.0)))), Vector(s0(Vector(Vector(72.0), Vector(73.0)), Vector(Vector(74.0))))))))), s0(Vector(Vector(75.0), Vector(76.0)), Vector(Vector(77.0))))))
    val v1: Vector[s6] = Vector(s6(s3(s0(Vector(Vector(78.0), Vector(79.0)), Vector(Vector(80.0))), s0(Vector(Vector(81.0), Vector(82.0)), Vector(Vector(83.0)))), Vector(s1(s0(Vector(Vector(84.0), Vector(85.0)), Vector(Vector(86.0))), Vector(Vector(s0(Vector(Vector(87.0), Vector(88.0)), Vector(Vector(89.0)))), Vector(s0(Vector(Vector(90.0), Vector(91.0)), Vector(Vector(92.0)))))), s1(s0(Vector(Vector(93.0), Vector(94.0)), Vector(Vector(95.0))), Vector(Vector(s0(Vector(Vector(96.0), Vector(97.0)), Vector(Vector(98.0)))), Vector(s0(Vector(Vector(99.0), Vector(100.0)), Vector(Vector(101.0))))))), Vector(Vector(s0(Vector(Vector(102.0), Vector(103.0)), Vector(Vector(104.0)))), Vector(s0(Vector(Vector(105.0), Vector(106.0)), Vector(Vector(107.0)))), Vector(s0(Vector(Vector(108.0), Vector(109.0)), Vector(Vector(110.0))))), Vector(s4(Vector(s1(s0(Vector(Vector(111.0), Vector(112.0)), Vector(Vector(113.0))), Vector(Vector(s0(Vector(Vector(114.0), Vector(115.0)), Vector(Vector(116.0)))), Vector(s0(Vector(Vector(117.0), Vector(118.0)), Vector(Vector(119.0)))))), s1(s0(Vector(Vector(120.0), Vector(121.0)), Vector(Vector(122.0))), Vector(Vector(s0(Vector(Vector(123.0), Vector(124.0)), Vector(Vector(125.0)))), Vector(s0(Vector(Vector(126.0), Vector(127.0)), Vector(Vector(128.0)))))))), s4(Vector(s1(s0(Vector(Vector(129.0), Vector(130.0)), Vector(Vector(131.0))), Vector(Vector(s0(Vector(Vector(132.0), Vector(133.0)), Vector(Vector(134.0)))), Vector(s0(Vector(Vector(135.0), Vector(136.0)), Vector(Vector(137.0)))))), s1(s0(Vector(Vector(138.0), Vector(139.0)), Vector(Vector(140.0))), Vector(Vector(s0(Vector(Vector(141.0), Vector(142.0)), Vector(Vector(143.0)))), Vector(s0(Vector(Vector(144.0), Vector(145.0)), Vector(Vector(146.0)))))))), s4(Vector(s1(s0(Vector(Vector(147.0), Vector(148.0)), Vector(Vector(149.0))), Vector(Vector(s0(Vector(Vector(150.0), Vector(151.0)), Vector(Vector(152.0)))), Vector(s0(Vector(Vector(153.0), Vector(154.0)), Vector(Vector(155.0)))))), s1(s0(Vector(Vector(156.0), Vector(157.0)), Vector(Vector(158.0))), Vector(Vector(s0(Vector(Vector(159.0), Vector(160.0)), Vector(Vector(161.0)))), Vector(s0(Vector(Vector(162.0), Vector(163.0)), Vector(Vector(164.0))))))))), s4(Vector(s1(s0(Vector(Vector(165.0), Vector(166.0)), Vector(Vector(167.0))), Vector(Vector(s0(Vector(Vector(168.0), Vector(169.0)), Vector(Vector(170.0)))), Vector(s0(Vector(Vector(171.0), Vector(172.0)), Vector(Vector(173.0)))))), s1(s0(Vector(Vector(174.0), Vector(175.0)), Vector(Vector(176.0))), Vector(Vector(s0(Vector(Vector(177.0), Vector(178.0)), Vector(Vector(179.0)))), Vector(s0(Vector(Vector(180.0), Vector(181.0)), Vector(Vector(182.0)))))))), s3(s0(Vector(Vector(183.0), Vector(184.0)), Vector(Vector(185.0))), s0(Vector(Vector(186.0), Vector(187.0)), Vector(Vector(188.0))))))
    val v2: Double = 189.0
    val start = nanoTime()
    var result: Double = 189.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}