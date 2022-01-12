import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0]
  )
  case class s2 (
    p0: Vector[s1],
    p1: s1
  )
  case class s3 (
    p0: s0,
    p1: Vector[Vector[s0]],
    p2: s2
  )
  case class s4 (
    p0: Vector[Vector[s3]],
    p1: Vector[s3]
  )
  case class s5 (
    p0: s4,
    p1: s1
  )
  def f3(v0: Double): Double = {
    var v3: Double = v0
    var v6: Double = v3
    var v1: Double = v6
    var v9: Double = v6
    var v4: Double = v9
    var v7: Double = v9
    var v8: Double = v9
    var v14: Double = v6
    var v12: Double = v9
    val v10: Double = v4 * v7
    var v2: Double = v7
    var v5: Double = v12
    val v20: Double = v12 * v2
    var v19: Double = v4
    v7 = v20
    var v13: Double = v8
    var v25: Double = v8
    val v18: Vector[Double] = Vector(v25, v0, v19, v10, v19, v5)
    var v15: Double = v19
    val v24: Double = v15 - v7
    v25 = v10
    val v23: Double = v18(4)
    v19 = v0
    val v22: Double = v1 + v1
    var v30: Vector[Double] = v18
    v30 = v30.updated(3, v20)
    v30 = v30.updated(4, v24)
    val v17: Double = v30(2)
    val v21: Double = v30(4)
    var v65: Double = v19
    v30 = v30.updated(3, v17)
    val v47: Vector[Double] = Vector(v14, v21, v23, v12)
    var v54: Vector[Double] = v47
    var v76: Vector[Double] = v47
    val v55: Double = v54(1)
    v5 = v65
    val v123: Double = v76(1)
    var v93: Vector[Double] = v47
    v30 = v30.updated(5, v123)
    val v125: Vector[Vector[Double]] = Vector(v93, v47, v76, v76, v93, v54, v76)
    var v120: Vector[Vector[Double]] = v125
    var v85: Double = v20
    v120 = v120.updated(4, v76)
    v76 = v76.updated(2, v23)
    val v86: Vector[Double] = v120(2)
    v120 = v120.updated(6, v86)
    val v56: Vector[Double] = v120(1)
    val v91: Double = v56(0)
    v93 = v93.updated(3, v19)
    var v112: Double = v91
    v30 = v30.updated(1, v85)
    v76 = v76.updated(1, v55)
    v120 = v120.updated(4, v86)
    v30 = v30.updated(3, v13)
    v9 = v22
    v112
  }
  @noinline
  def f0(v0: Vector[s5], v1: Double): Double = {
    val v21: Double = f3(v1)
    val v180: Double = v1 / v21
    var v146: Double = v180
    val v207: Double = v146 * v1
    val v116: Double = f3(v180)
    val v295: Double = v116 / v207
    v295
  }
  def benchmark(): Unit = {
    val v0: Vector[s5] = Vector(s5(s4(Vector(Vector(s3(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0))), Vector(Vector(s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0)))), Vector(s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0)))), Vector(s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0))))), s2(Vector(s1(Vector(s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0), Vector(24.0))))), s1(Vector(s0(Vector(Vector(25.0), Vector(26.0), Vector(27.0)), Vector(Vector(28.0), Vector(29.0))))), s1(Vector(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0)))))), s1(Vector(s0(Vector(Vector(35.0), Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0))))))))), Vector(s3(s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0), Vector(44.0))), Vector(Vector(s0(Vector(Vector(45.0), Vector(46.0), Vector(47.0)), Vector(Vector(48.0), Vector(49.0)))), Vector(s0(Vector(Vector(50.0), Vector(51.0), Vector(52.0)), Vector(Vector(53.0), Vector(54.0)))), Vector(s0(Vector(Vector(55.0), Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0))))), s2(Vector(s1(Vector(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0), Vector(64.0))))), s1(Vector(s0(Vector(Vector(65.0), Vector(66.0), Vector(67.0)), Vector(Vector(68.0), Vector(69.0))))), s1(Vector(s0(Vector(Vector(70.0), Vector(71.0), Vector(72.0)), Vector(Vector(73.0), Vector(74.0)))))), s1(Vector(s0(Vector(Vector(75.0), Vector(76.0), Vector(77.0)), Vector(Vector(78.0), Vector(79.0))))))))), s1(Vector(s0(Vector(Vector(80.0), Vector(81.0), Vector(82.0)), Vector(Vector(83.0), Vector(84.0)))))), s5(s4(Vector(Vector(s3(s0(Vector(Vector(85.0), Vector(86.0), Vector(87.0)), Vector(Vector(88.0), Vector(89.0))), Vector(Vector(s0(Vector(Vector(90.0), Vector(91.0), Vector(92.0)), Vector(Vector(93.0), Vector(94.0)))), Vector(s0(Vector(Vector(95.0), Vector(96.0), Vector(97.0)), Vector(Vector(98.0), Vector(99.0)))), Vector(s0(Vector(Vector(100.0), Vector(101.0), Vector(102.0)), Vector(Vector(103.0), Vector(104.0))))), s2(Vector(s1(Vector(s0(Vector(Vector(105.0), Vector(106.0), Vector(107.0)), Vector(Vector(108.0), Vector(109.0))))), s1(Vector(s0(Vector(Vector(110.0), Vector(111.0), Vector(112.0)), Vector(Vector(113.0), Vector(114.0))))), s1(Vector(s0(Vector(Vector(115.0), Vector(116.0), Vector(117.0)), Vector(Vector(118.0), Vector(119.0)))))), s1(Vector(s0(Vector(Vector(120.0), Vector(121.0), Vector(122.0)), Vector(Vector(123.0), Vector(124.0))))))))), Vector(s3(s0(Vector(Vector(125.0), Vector(126.0), Vector(127.0)), Vector(Vector(128.0), Vector(129.0))), Vector(Vector(s0(Vector(Vector(130.0), Vector(131.0), Vector(132.0)), Vector(Vector(133.0), Vector(134.0)))), Vector(s0(Vector(Vector(135.0), Vector(136.0), Vector(137.0)), Vector(Vector(138.0), Vector(139.0)))), Vector(s0(Vector(Vector(140.0), Vector(141.0), Vector(142.0)), Vector(Vector(143.0), Vector(144.0))))), s2(Vector(s1(Vector(s0(Vector(Vector(145.0), Vector(146.0), Vector(147.0)), Vector(Vector(148.0), Vector(149.0))))), s1(Vector(s0(Vector(Vector(150.0), Vector(151.0), Vector(152.0)), Vector(Vector(153.0), Vector(154.0))))), s1(Vector(s0(Vector(Vector(155.0), Vector(156.0), Vector(157.0)), Vector(Vector(158.0), Vector(159.0)))))), s1(Vector(s0(Vector(Vector(160.0), Vector(161.0), Vector(162.0)), Vector(Vector(163.0), Vector(164.0))))))))), s1(Vector(s0(Vector(Vector(165.0), Vector(166.0), Vector(167.0)), Vector(Vector(168.0), Vector(169.0)))))))
    val v1: Double = 170.0
    val start = nanoTime()
    var result: Double = 170.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}