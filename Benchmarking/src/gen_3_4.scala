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
    p0: s1,
    p1: s0
  )
  case class s3 (
    p0: Vector[s2],
    p1: s1
  )
  case class s4 (
    p0: Vector[Vector[s3]],
    p1: Vector[s2]
  )
  case class s5 (
    p0: s1,
    p1: s3
  )
  case class s7 (
    p0: s4,
    p1: Vector[Vector[s5]],
    p2: Vector[Vector[s1]],
    p3: s3
  )
  case class s9 (
    p0: s7,
    p1: s1
  )
  def f40(v0: Double): Double = {
    var v1: Double = v0
    var v4: Double = v0
    var v3: Double = v0
    var v5: Double = v4
    v3 = v1
    var v6: Double = v3
    val v11: Vector[Double] = Vector(v0, v3, v5, v6)
    val v17: Double = v11(0)
    var v10: Vector[Double] = v11
    v3 = v6
    val v14: Double = v11(1)
    v1 = v4
    v6 = v5
    val v18: Double = v3 * v5
    v10 = v10.updated(1, v18)
    val v13: Double = v11(2)
    val v23: Double = v11(3)
    val v37: Double = v11(0)
    val v34: Vector[Double] = Vector(v5, v5, v0, v13, v17, v23, v14)
    val v19: Double = v10(0)
    v10 = v10.updated(1, v17)
    val v36: Double = v34(0)
    val v40: Double = v37 * v19
    val v67: Double = v36 + v40
    v67
  }
  @noinline
  def f0(v0: s9, v1: Double): Double = {
    val v3: Double = v1 - v1
    val v4: Double = f40(v3)
    var v7: Double = v1
    val v13: Double = v7 - v4
    v13
  }
  def benchmark(): Unit = {
    val v0: s9 = s9(s7(s4(Vector(Vector(s3(Vector(s2(s1(Vector(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0)))), Vector(s0(Vector(Vector(2.0)), Vector(Vector(3.0))))), Vector(s0(Vector(Vector(4.0)), Vector(Vector(5.0))), s0(Vector(Vector(6.0)), Vector(Vector(7.0))), s0(Vector(Vector(8.0)), Vector(Vector(9.0))))), s0(Vector(Vector(10.0)), Vector(Vector(11.0))))), s1(Vector(Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0)))), Vector(s0(Vector(Vector(14.0)), Vector(Vector(15.0))))), Vector(s0(Vector(Vector(16.0)), Vector(Vector(17.0))), s0(Vector(Vector(18.0)), Vector(Vector(19.0))), s0(Vector(Vector(20.0)), Vector(Vector(21.0))))))), Vector(s3(Vector(s2(s1(Vector(Vector(s0(Vector(Vector(22.0)), Vector(Vector(23.0)))), Vector(s0(Vector(Vector(24.0)), Vector(Vector(25.0))))), Vector(s0(Vector(Vector(26.0)), Vector(Vector(27.0))), s0(Vector(Vector(28.0)), Vector(Vector(29.0))), s0(Vector(Vector(30.0)), Vector(Vector(31.0))))), s0(Vector(Vector(32.0)), Vector(Vector(33.0))))), s1(Vector(Vector(s0(Vector(Vector(34.0)), Vector(Vector(35.0)))), Vector(s0(Vector(Vector(36.0)), Vector(Vector(37.0))))), Vector(s0(Vector(Vector(38.0)), Vector(Vector(39.0))), s0(Vector(Vector(40.0)), Vector(Vector(41.0))), s0(Vector(Vector(42.0)), Vector(Vector(43.0)))))))), Vector(s2(s1(Vector(Vector(s0(Vector(Vector(44.0)), Vector(Vector(45.0)))), Vector(s0(Vector(Vector(46.0)), Vector(Vector(47.0))))), Vector(s0(Vector(Vector(48.0)), Vector(Vector(49.0))), s0(Vector(Vector(50.0)), Vector(Vector(51.0))), s0(Vector(Vector(52.0)), Vector(Vector(53.0))))), s0(Vector(Vector(54.0)), Vector(Vector(55.0)))))), Vector(Vector(s5(s1(Vector(Vector(s0(Vector(Vector(56.0)), Vector(Vector(57.0)))), Vector(s0(Vector(Vector(58.0)), Vector(Vector(59.0))))), Vector(s0(Vector(Vector(60.0)), Vector(Vector(61.0))), s0(Vector(Vector(62.0)), Vector(Vector(63.0))), s0(Vector(Vector(64.0)), Vector(Vector(65.0))))), s3(Vector(s2(s1(Vector(Vector(s0(Vector(Vector(66.0)), Vector(Vector(67.0)))), Vector(s0(Vector(Vector(68.0)), Vector(Vector(69.0))))), Vector(s0(Vector(Vector(70.0)), Vector(Vector(71.0))), s0(Vector(Vector(72.0)), Vector(Vector(73.0))), s0(Vector(Vector(74.0)), Vector(Vector(75.0))))), s0(Vector(Vector(76.0)), Vector(Vector(77.0))))), s1(Vector(Vector(s0(Vector(Vector(78.0)), Vector(Vector(79.0)))), Vector(s0(Vector(Vector(80.0)), Vector(Vector(81.0))))), Vector(s0(Vector(Vector(82.0)), Vector(Vector(83.0))), s0(Vector(Vector(84.0)), Vector(Vector(85.0))), s0(Vector(Vector(86.0)), Vector(Vector(87.0)))))))), Vector(s5(s1(Vector(Vector(s0(Vector(Vector(88.0)), Vector(Vector(89.0)))), Vector(s0(Vector(Vector(90.0)), Vector(Vector(91.0))))), Vector(s0(Vector(Vector(92.0)), Vector(Vector(93.0))), s0(Vector(Vector(94.0)), Vector(Vector(95.0))), s0(Vector(Vector(96.0)), Vector(Vector(97.0))))), s3(Vector(s2(s1(Vector(Vector(s0(Vector(Vector(98.0)), Vector(Vector(99.0)))), Vector(s0(Vector(Vector(100.0)), Vector(Vector(101.0))))), Vector(s0(Vector(Vector(102.0)), Vector(Vector(103.0))), s0(Vector(Vector(104.0)), Vector(Vector(105.0))), s0(Vector(Vector(106.0)), Vector(Vector(107.0))))), s0(Vector(Vector(108.0)), Vector(Vector(109.0))))), s1(Vector(Vector(s0(Vector(Vector(110.0)), Vector(Vector(111.0)))), Vector(s0(Vector(Vector(112.0)), Vector(Vector(113.0))))), Vector(s0(Vector(Vector(114.0)), Vector(Vector(115.0))), s0(Vector(Vector(116.0)), Vector(Vector(117.0))), s0(Vector(Vector(118.0)), Vector(Vector(119.0))))))))), Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(120.0)), Vector(Vector(121.0)))), Vector(s0(Vector(Vector(122.0)), Vector(Vector(123.0))))), Vector(s0(Vector(Vector(124.0)), Vector(Vector(125.0))), s0(Vector(Vector(126.0)), Vector(Vector(127.0))), s0(Vector(Vector(128.0)), Vector(Vector(129.0)))))), Vector(s1(Vector(Vector(s0(Vector(Vector(130.0)), Vector(Vector(131.0)))), Vector(s0(Vector(Vector(132.0)), Vector(Vector(133.0))))), Vector(s0(Vector(Vector(134.0)), Vector(Vector(135.0))), s0(Vector(Vector(136.0)), Vector(Vector(137.0))), s0(Vector(Vector(138.0)), Vector(Vector(139.0))))))), s3(Vector(s2(s1(Vector(Vector(s0(Vector(Vector(140.0)), Vector(Vector(141.0)))), Vector(s0(Vector(Vector(142.0)), Vector(Vector(143.0))))), Vector(s0(Vector(Vector(144.0)), Vector(Vector(145.0))), s0(Vector(Vector(146.0)), Vector(Vector(147.0))), s0(Vector(Vector(148.0)), Vector(Vector(149.0))))), s0(Vector(Vector(150.0)), Vector(Vector(151.0))))), s1(Vector(Vector(s0(Vector(Vector(152.0)), Vector(Vector(153.0)))), Vector(s0(Vector(Vector(154.0)), Vector(Vector(155.0))))), Vector(s0(Vector(Vector(156.0)), Vector(Vector(157.0))), s0(Vector(Vector(158.0)), Vector(Vector(159.0))), s0(Vector(Vector(160.0)), Vector(Vector(161.0))))))), s1(Vector(Vector(s0(Vector(Vector(162.0)), Vector(Vector(163.0)))), Vector(s0(Vector(Vector(164.0)), Vector(Vector(165.0))))), Vector(s0(Vector(Vector(166.0)), Vector(Vector(167.0))), s0(Vector(Vector(168.0)), Vector(Vector(169.0))), s0(Vector(Vector(170.0)), Vector(Vector(171.0))))))
    val v1: Double = 172.0
    val start = nanoTime()
    var result: Double = 172.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}