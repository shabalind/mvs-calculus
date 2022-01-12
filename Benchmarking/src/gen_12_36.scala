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
  case class s2 (
    p0: s0,
    p1: Vector[s1]
  )
  case class s3 (
    p0: s1,
    p1: s0
  )
  case class s4 (
    p0: Vector[s1],
    p1: Vector[s0]
  )
  case class s7 (
    p0: Vector[s4],
    p1: Vector[Vector[s1]]
  )
  def f45(v0: Double): Double = {
    var v1: Double = v0
    var v5: Double = v1
    var v7: Double = v5
    val v3: Vector[Double] = Vector(v5, v0, v0, v0, v1, v5)
    var v4: Vector[Double] = v3
    var v6: Vector[Double] = v4
    var v2: Double = v1
    v1 = v0
    v6 = v6.updated(1, v2)
    val v9: Double = v3(2)
    val v10: Double = v6(4)
    var v12: Double = v9
    val v15: Double = v3(3)
    var v25: Double = v7
    val v29: Double = v6(5)
    val v14: Double = v4(5)
    val v17: Double = v3(3)
    var v11: Vector[Double] = v4
    val v20: Vector[Double] = Vector(v1, v12, v14)
    var v13: Vector[Double] = v20
    v13 = v13.updated(0, v29)
    var v30: Vector[Double] = v11
    v6 = v6.updated(4, v25)
    v6 = v6.updated(0, v12)
    val v21: Double = v13(1)
    var v50: Vector[Double] = v13
    v50 = v50.updated(2, v5)
    var v23: Vector[Double] = v20
    var v27: Vector[Double] = v20
    val v18: Double = v50(1)
    v50 = v23
    v30 = v30.updated(4, v9)
    val v40: Double = v18 + v21
    var v80: Double = v10
    v13 = v27
    val v49: Double = v30(0)
    v27 = v27.updated(2, v17)
    var v63: Double = v49
    val v61: Vector[Double] = Vector(v7)
    v13 = v13.updated(0, v15)
    val v65: Double = v61(0)
    v23 = v23.updated(2, v65)
    v13 = v13.updated(1, v5)
    v30 = v30.updated(0, v80)
    v6 = v6.updated(2, v63)
    v40
  }
  @noinline
  def f0(v0: s7, v1: Vector[s3], v2: s2, v3: Double): Double = {
    val v4: Double = v3 * v3
    val v18: Double = v3 + v4
    val v27: Double = f45(v18)
    v27
  }
  def benchmark(): Unit = {
    val v0: s7 = s7(Vector(s4(Vector(s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0))), Vector(Vector(s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0)))), Vector(s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0)))), Vector(s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0))))))), Vector(s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0), Vector(24.0))))), s4(Vector(s1(s0(Vector(Vector(25.0), Vector(26.0), Vector(27.0)), Vector(Vector(28.0), Vector(29.0))), Vector(Vector(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0)))), Vector(s0(Vector(Vector(35.0), Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0)))), Vector(s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0), Vector(44.0))))))), Vector(s0(Vector(Vector(45.0), Vector(46.0), Vector(47.0)), Vector(Vector(48.0), Vector(49.0)))))), Vector(Vector(s1(s0(Vector(Vector(50.0), Vector(51.0), Vector(52.0)), Vector(Vector(53.0), Vector(54.0))), Vector(Vector(s0(Vector(Vector(55.0), Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0)))), Vector(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0), Vector(64.0)))), Vector(s0(Vector(Vector(65.0), Vector(66.0), Vector(67.0)), Vector(Vector(68.0), Vector(69.0)))))))))
    val v1: Vector[s3] = Vector(s3(s1(s0(Vector(Vector(70.0), Vector(71.0), Vector(72.0)), Vector(Vector(73.0), Vector(74.0))), Vector(Vector(s0(Vector(Vector(75.0), Vector(76.0), Vector(77.0)), Vector(Vector(78.0), Vector(79.0)))), Vector(s0(Vector(Vector(80.0), Vector(81.0), Vector(82.0)), Vector(Vector(83.0), Vector(84.0)))), Vector(s0(Vector(Vector(85.0), Vector(86.0), Vector(87.0)), Vector(Vector(88.0), Vector(89.0)))))), s0(Vector(Vector(90.0), Vector(91.0), Vector(92.0)), Vector(Vector(93.0), Vector(94.0)))), s3(s1(s0(Vector(Vector(95.0), Vector(96.0), Vector(97.0)), Vector(Vector(98.0), Vector(99.0))), Vector(Vector(s0(Vector(Vector(100.0), Vector(101.0), Vector(102.0)), Vector(Vector(103.0), Vector(104.0)))), Vector(s0(Vector(Vector(105.0), Vector(106.0), Vector(107.0)), Vector(Vector(108.0), Vector(109.0)))), Vector(s0(Vector(Vector(110.0), Vector(111.0), Vector(112.0)), Vector(Vector(113.0), Vector(114.0)))))), s0(Vector(Vector(115.0), Vector(116.0), Vector(117.0)), Vector(Vector(118.0), Vector(119.0)))))
    val v2: s2 = s2(s0(Vector(Vector(120.0), Vector(121.0), Vector(122.0)), Vector(Vector(123.0), Vector(124.0))), Vector(s1(s0(Vector(Vector(125.0), Vector(126.0), Vector(127.0)), Vector(Vector(128.0), Vector(129.0))), Vector(Vector(s0(Vector(Vector(130.0), Vector(131.0), Vector(132.0)), Vector(Vector(133.0), Vector(134.0)))), Vector(s0(Vector(Vector(135.0), Vector(136.0), Vector(137.0)), Vector(Vector(138.0), Vector(139.0)))), Vector(s0(Vector(Vector(140.0), Vector(141.0), Vector(142.0)), Vector(Vector(143.0), Vector(144.0)))))), s1(s0(Vector(Vector(145.0), Vector(146.0), Vector(147.0)), Vector(Vector(148.0), Vector(149.0))), Vector(Vector(s0(Vector(Vector(150.0), Vector(151.0), Vector(152.0)), Vector(Vector(153.0), Vector(154.0)))), Vector(s0(Vector(Vector(155.0), Vector(156.0), Vector(157.0)), Vector(Vector(158.0), Vector(159.0)))), Vector(s0(Vector(Vector(160.0), Vector(161.0), Vector(162.0)), Vector(Vector(163.0), Vector(164.0))))))))
    val v3: Double = 165.0
    val start = nanoTime()
    var result: Double = 165.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}