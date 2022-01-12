import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0
  )
  case class s2 (
    p0: Vector[s1],
    p1: Vector[s1]
  )
  case class s3 (
    p0: Vector[Vector[s2]],
    p1: s0
  )
  case class s4 (
    p0: s3,
    p1: Vector[Vector[s3]]
  )
  case class s5 (
    p0: s0,
    p1: Vector[Double]
  )
  case class s9 (
    p0: Vector[s4],
    p1: s0
  )
  def f9(v0: Double, v1: s3): Double = {
    var v6: s3 = v1
    val v4: Vector[Vector[s2]] = v6.p0
    val v2: Vector[s2] = v4(0)
    var v12: Vector[Vector[s2]] = v4
    v12 = v12.updated(0, v2)
    val v15: s0 = v6.p1
    v6 = v6.copy(p0 = v12)
    val v26: Vector[Vector[Double]] = v15.p0
    var v63: Vector[Vector[Double]] = v26
    val v118: Vector[Double] = v63(0)
    v6 = v1
    var v112: Vector[Double] = v118
    val v254: Double = v112(0)
    var v171: Double = v254
    v171
  }
  @noinline
  def f0(v0: s5, v1: Vector[Vector[s3]], v2: Vector[s9], v3: Double): Double = {
    val v4: Vector[s3] = v1(1)
    var v6: Double = v3
    var v12: Vector[s3] = v4
    val v10: s3 = v12(0)
    val v13: Double = f9(v6, v10)
    v12 = v12.updated(0, v10)
    v12 = v12.updated(0, v10)
    v12 = v12.updated(0, v10)
    val v21: Vector[s3] = v1(0)
    v12 = v12.updated(0, v10)
    val v83: s3 = v21(0)
    v12 = v12.updated(0, v10)
    v12 = v12.updated(0, v83)
    val v35: s3 = v12(0)
    val v73: Double = f9(v13, v35)
    v73
  }
  def benchmark(): Unit = {
    val v0: s5 = s5(s0(Vector(Vector(0.0)), Vector(Vector(1.0))), Vector(2.0, 3.0))
    val v1: Vector[Vector[s3]] = Vector(Vector(s3(Vector(Vector(s2(Vector(s1(s0(Vector(Vector(4.0)), Vector(Vector(5.0)))), s1(s0(Vector(Vector(6.0)), Vector(Vector(7.0))))), Vector(s1(s0(Vector(Vector(8.0)), Vector(Vector(9.0)))), s1(s0(Vector(Vector(10.0)), Vector(Vector(11.0)))), s1(s0(Vector(Vector(12.0)), Vector(Vector(13.0)))))))), s0(Vector(Vector(14.0)), Vector(Vector(15.0))))), Vector(s3(Vector(Vector(s2(Vector(s1(s0(Vector(Vector(16.0)), Vector(Vector(17.0)))), s1(s0(Vector(Vector(18.0)), Vector(Vector(19.0))))), Vector(s1(s0(Vector(Vector(20.0)), Vector(Vector(21.0)))), s1(s0(Vector(Vector(22.0)), Vector(Vector(23.0)))), s1(s0(Vector(Vector(24.0)), Vector(Vector(25.0)))))))), s0(Vector(Vector(26.0)), Vector(Vector(27.0))))), Vector(s3(Vector(Vector(s2(Vector(s1(s0(Vector(Vector(28.0)), Vector(Vector(29.0)))), s1(s0(Vector(Vector(30.0)), Vector(Vector(31.0))))), Vector(s1(s0(Vector(Vector(32.0)), Vector(Vector(33.0)))), s1(s0(Vector(Vector(34.0)), Vector(Vector(35.0)))), s1(s0(Vector(Vector(36.0)), Vector(Vector(37.0)))))))), s0(Vector(Vector(38.0)), Vector(Vector(39.0))))))
    val v2: Vector[s9] = Vector(s9(Vector(s4(s3(Vector(Vector(s2(Vector(s1(s0(Vector(Vector(40.0)), Vector(Vector(41.0)))), s1(s0(Vector(Vector(42.0)), Vector(Vector(43.0))))), Vector(s1(s0(Vector(Vector(44.0)), Vector(Vector(45.0)))), s1(s0(Vector(Vector(46.0)), Vector(Vector(47.0)))), s1(s0(Vector(Vector(48.0)), Vector(Vector(49.0)))))))), s0(Vector(Vector(50.0)), Vector(Vector(51.0)))), Vector(Vector(s3(Vector(Vector(s2(Vector(s1(s0(Vector(Vector(52.0)), Vector(Vector(53.0)))), s1(s0(Vector(Vector(54.0)), Vector(Vector(55.0))))), Vector(s1(s0(Vector(Vector(56.0)), Vector(Vector(57.0)))), s1(s0(Vector(Vector(58.0)), Vector(Vector(59.0)))), s1(s0(Vector(Vector(60.0)), Vector(Vector(61.0)))))))), s0(Vector(Vector(62.0)), Vector(Vector(63.0))))), Vector(s3(Vector(Vector(s2(Vector(s1(s0(Vector(Vector(64.0)), Vector(Vector(65.0)))), s1(s0(Vector(Vector(66.0)), Vector(Vector(67.0))))), Vector(s1(s0(Vector(Vector(68.0)), Vector(Vector(69.0)))), s1(s0(Vector(Vector(70.0)), Vector(Vector(71.0)))), s1(s0(Vector(Vector(72.0)), Vector(Vector(73.0)))))))), s0(Vector(Vector(74.0)), Vector(Vector(75.0))))), Vector(s3(Vector(Vector(s2(Vector(s1(s0(Vector(Vector(76.0)), Vector(Vector(77.0)))), s1(s0(Vector(Vector(78.0)), Vector(Vector(79.0))))), Vector(s1(s0(Vector(Vector(80.0)), Vector(Vector(81.0)))), s1(s0(Vector(Vector(82.0)), Vector(Vector(83.0)))), s1(s0(Vector(Vector(84.0)), Vector(Vector(85.0)))))))), s0(Vector(Vector(86.0)), Vector(Vector(87.0)))))))), s0(Vector(Vector(88.0)), Vector(Vector(89.0)))), s9(Vector(s4(s3(Vector(Vector(s2(Vector(s1(s0(Vector(Vector(90.0)), Vector(Vector(91.0)))), s1(s0(Vector(Vector(92.0)), Vector(Vector(93.0))))), Vector(s1(s0(Vector(Vector(94.0)), Vector(Vector(95.0)))), s1(s0(Vector(Vector(96.0)), Vector(Vector(97.0)))), s1(s0(Vector(Vector(98.0)), Vector(Vector(99.0)))))))), s0(Vector(Vector(100.0)), Vector(Vector(101.0)))), Vector(Vector(s3(Vector(Vector(s2(Vector(s1(s0(Vector(Vector(102.0)), Vector(Vector(103.0)))), s1(s0(Vector(Vector(104.0)), Vector(Vector(105.0))))), Vector(s1(s0(Vector(Vector(106.0)), Vector(Vector(107.0)))), s1(s0(Vector(Vector(108.0)), Vector(Vector(109.0)))), s1(s0(Vector(Vector(110.0)), Vector(Vector(111.0)))))))), s0(Vector(Vector(112.0)), Vector(Vector(113.0))))), Vector(s3(Vector(Vector(s2(Vector(s1(s0(Vector(Vector(114.0)), Vector(Vector(115.0)))), s1(s0(Vector(Vector(116.0)), Vector(Vector(117.0))))), Vector(s1(s0(Vector(Vector(118.0)), Vector(Vector(119.0)))), s1(s0(Vector(Vector(120.0)), Vector(Vector(121.0)))), s1(s0(Vector(Vector(122.0)), Vector(Vector(123.0)))))))), s0(Vector(Vector(124.0)), Vector(Vector(125.0))))), Vector(s3(Vector(Vector(s2(Vector(s1(s0(Vector(Vector(126.0)), Vector(Vector(127.0)))), s1(s0(Vector(Vector(128.0)), Vector(Vector(129.0))))), Vector(s1(s0(Vector(Vector(130.0)), Vector(Vector(131.0)))), s1(s0(Vector(Vector(132.0)), Vector(Vector(133.0)))), s1(s0(Vector(Vector(134.0)), Vector(Vector(135.0)))))))), s0(Vector(Vector(136.0)), Vector(Vector(137.0)))))))), s0(Vector(Vector(138.0)), Vector(Vector(139.0)))), s9(Vector(s4(s3(Vector(Vector(s2(Vector(s1(s0(Vector(Vector(140.0)), Vector(Vector(141.0)))), s1(s0(Vector(Vector(142.0)), Vector(Vector(143.0))))), Vector(s1(s0(Vector(Vector(144.0)), Vector(Vector(145.0)))), s1(s0(Vector(Vector(146.0)), Vector(Vector(147.0)))), s1(s0(Vector(Vector(148.0)), Vector(Vector(149.0)))))))), s0(Vector(Vector(150.0)), Vector(Vector(151.0)))), Vector(Vector(s3(Vector(Vector(s2(Vector(s1(s0(Vector(Vector(152.0)), Vector(Vector(153.0)))), s1(s0(Vector(Vector(154.0)), Vector(Vector(155.0))))), Vector(s1(s0(Vector(Vector(156.0)), Vector(Vector(157.0)))), s1(s0(Vector(Vector(158.0)), Vector(Vector(159.0)))), s1(s0(Vector(Vector(160.0)), Vector(Vector(161.0)))))))), s0(Vector(Vector(162.0)), Vector(Vector(163.0))))), Vector(s3(Vector(Vector(s2(Vector(s1(s0(Vector(Vector(164.0)), Vector(Vector(165.0)))), s1(s0(Vector(Vector(166.0)), Vector(Vector(167.0))))), Vector(s1(s0(Vector(Vector(168.0)), Vector(Vector(169.0)))), s1(s0(Vector(Vector(170.0)), Vector(Vector(171.0)))), s1(s0(Vector(Vector(172.0)), Vector(Vector(173.0)))))))), s0(Vector(Vector(174.0)), Vector(Vector(175.0))))), Vector(s3(Vector(Vector(s2(Vector(s1(s0(Vector(Vector(176.0)), Vector(Vector(177.0)))), s1(s0(Vector(Vector(178.0)), Vector(Vector(179.0))))), Vector(s1(s0(Vector(Vector(180.0)), Vector(Vector(181.0)))), s1(s0(Vector(Vector(182.0)), Vector(Vector(183.0)))), s1(s0(Vector(Vector(184.0)), Vector(Vector(185.0)))))))), s0(Vector(Vector(186.0)), Vector(Vector(187.0)))))))), s0(Vector(Vector(188.0)), Vector(Vector(189.0)))))
    val v3: Double = 190.0
    val start = nanoTime()
    var result: Double = 190.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}