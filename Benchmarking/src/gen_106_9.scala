import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: s0,
    p1: s0
  )
  case class s3 (
    p0: s1,
    p1: Vector[s0]
  )
  case class s5 (
    p0: Vector[Vector[s3]],
    p1: Vector[Vector[s0]]
  )
  @noinline
  def f0(v0: Vector[s5], v1: Double): Double = {
    var v7: Vector[s5] = v0
    val v3: s5 = v7(1)
    val v6: s5 = v7(1)
    val v2: s5 = v0(0)
    val v5: Vector[Vector[s0]] = v6.p1
    val v11: Vector[s0] = v5(1)
    val v12: Vector[Vector[s3]] = v2.p0
    val v15: s0 = v11(0)
    var v16: Vector[s0] = v11
    val v29: s5 = v0(0)
    val v30: Vector[Vector[Double]] = v15.p1
    var v18: s0 = v15
    val v21: s0 = v16(0)
    val v36: s2 = s2(v15, v18)
    val v31: Vector[s3] = v12(0)
    val v27: Vector[Vector[Double]] = v21.p0
    var v35: Vector[s3] = v31
    v7 = v7.updated(1, v3)
    var v25: Vector[Vector[Double]] = v27
    val v20: s0 = v36.p0
    v7 = v7.updated(2, v29)
    val v44: Vector[Vector[Double]] = v20.p1
    var v46: Vector[Vector[Double]] = v27
    var v38: Vector[s3] = v31
    val v41: Vector[Double] = v44(0)
    v16 = v16.updated(0, v18)
    val v78: Vector[Vector[s3]] = Vector(v38, v38, v35, v31, v31, v31)
    var v80: Vector[Vector[s3]] = v78
    var v47: s2 = v36
    val v71: Vector[Double] = v30(1)
    v80 = v78
    v46 = v46.updated(2, v41)
    val v73: s5 = v0(1)
    val v133: s0 = v47.p1
    var v63: Vector[Vector[Double]] = v46
    v18 = v18.copy(p0 = v25)
    var v59: Vector[s5] = v0
    val v94: Vector[s3] = v80(5)
    var v136: s0 = v133
    val v65: s5 = v59(2)
    val v67: s3 = v94(0)
    val v108: Vector[Vector[Double]] = v136.p1
    v25 = v25.updated(0, v71)
    v16 = v16.updated(0, v20)
    v7 = v7.updated(0, v73)
    v136 = v136.copy(p0 = v63)
    val v149: s1 = v67.p0
    v7 = v7.updated(1, v65)
    val v318: s5 = v0(2)
    val v196: Vector[Double] = v108(1)
    val v238: s0 = v149.p0
    v59 = v59.updated(1, v318)
    v47 = v47.copy(p0 = v238)
    val v159: Double = v196(0)
    v35 = v35.updated(0, v67)
    v63 = v63.updated(1, v41)
    v159
  }
  def benchmark(): Unit = {
    val v0: Vector[s5] = Vector(s5(Vector(Vector(s3(s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0))), s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0)))), Vector(s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0))), s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0))), s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0), Vector(24.0)))))), Vector(s3(s1(s0(Vector(Vector(25.0), Vector(26.0), Vector(27.0)), Vector(Vector(28.0), Vector(29.0))), s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0)))), Vector(s0(Vector(Vector(35.0), Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0))), s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0), Vector(44.0))), s0(Vector(Vector(45.0), Vector(46.0), Vector(47.0)), Vector(Vector(48.0), Vector(49.0))))))), Vector(Vector(s0(Vector(Vector(50.0), Vector(51.0), Vector(52.0)), Vector(Vector(53.0), Vector(54.0)))), Vector(s0(Vector(Vector(55.0), Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0)))))), s5(Vector(Vector(s3(s1(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0), Vector(64.0))), s0(Vector(Vector(65.0), Vector(66.0), Vector(67.0)), Vector(Vector(68.0), Vector(69.0)))), Vector(s0(Vector(Vector(70.0), Vector(71.0), Vector(72.0)), Vector(Vector(73.0), Vector(74.0))), s0(Vector(Vector(75.0), Vector(76.0), Vector(77.0)), Vector(Vector(78.0), Vector(79.0))), s0(Vector(Vector(80.0), Vector(81.0), Vector(82.0)), Vector(Vector(83.0), Vector(84.0)))))), Vector(s3(s1(s0(Vector(Vector(85.0), Vector(86.0), Vector(87.0)), Vector(Vector(88.0), Vector(89.0))), s0(Vector(Vector(90.0), Vector(91.0), Vector(92.0)), Vector(Vector(93.0), Vector(94.0)))), Vector(s0(Vector(Vector(95.0), Vector(96.0), Vector(97.0)), Vector(Vector(98.0), Vector(99.0))), s0(Vector(Vector(100.0), Vector(101.0), Vector(102.0)), Vector(Vector(103.0), Vector(104.0))), s0(Vector(Vector(105.0), Vector(106.0), Vector(107.0)), Vector(Vector(108.0), Vector(109.0))))))), Vector(Vector(s0(Vector(Vector(110.0), Vector(111.0), Vector(112.0)), Vector(Vector(113.0), Vector(114.0)))), Vector(s0(Vector(Vector(115.0), Vector(116.0), Vector(117.0)), Vector(Vector(118.0), Vector(119.0)))))), s5(Vector(Vector(s3(s1(s0(Vector(Vector(120.0), Vector(121.0), Vector(122.0)), Vector(Vector(123.0), Vector(124.0))), s0(Vector(Vector(125.0), Vector(126.0), Vector(127.0)), Vector(Vector(128.0), Vector(129.0)))), Vector(s0(Vector(Vector(130.0), Vector(131.0), Vector(132.0)), Vector(Vector(133.0), Vector(134.0))), s0(Vector(Vector(135.0), Vector(136.0), Vector(137.0)), Vector(Vector(138.0), Vector(139.0))), s0(Vector(Vector(140.0), Vector(141.0), Vector(142.0)), Vector(Vector(143.0), Vector(144.0)))))), Vector(s3(s1(s0(Vector(Vector(145.0), Vector(146.0), Vector(147.0)), Vector(Vector(148.0), Vector(149.0))), s0(Vector(Vector(150.0), Vector(151.0), Vector(152.0)), Vector(Vector(153.0), Vector(154.0)))), Vector(s0(Vector(Vector(155.0), Vector(156.0), Vector(157.0)), Vector(Vector(158.0), Vector(159.0))), s0(Vector(Vector(160.0), Vector(161.0), Vector(162.0)), Vector(Vector(163.0), Vector(164.0))), s0(Vector(Vector(165.0), Vector(166.0), Vector(167.0)), Vector(Vector(168.0), Vector(169.0))))))), Vector(Vector(s0(Vector(Vector(170.0), Vector(171.0), Vector(172.0)), Vector(Vector(173.0), Vector(174.0)))), Vector(s0(Vector(Vector(175.0), Vector(176.0), Vector(177.0)), Vector(Vector(178.0), Vector(179.0)))))))
    val v1: Double = 180.0
    val start = nanoTime()
    var result: Double = 180.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}