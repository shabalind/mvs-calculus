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
    p0: Vector[s1],
    p1: s0
  )
  case class s3 (
    p0: Vector[Vector[s2]],
    p1: Vector[Vector[s0]]
  )
  def f83(v0: Double): Double = {
    var v1: Double = v0
    var v7: Double = v0
    var v3: Double = v0
    val v4: Vector[Double] = Vector(v3, v0, v7, v3, v1, v3, v0)
    val v6: Double = v4(6)
    val v2: Double = v4(1)
    val v11: Double = v6 / v2
    val v8: Double = v4(0)
    v3 = v1
    val v10: Double = v4(1)
    var v13: Vector[Double] = v4
    var v19: Vector[Double] = v4
    v13 = v13.updated(4, v8)
    v19 = v19.updated(1, v11)
    v19 = v19.updated(6, v11)
    val v51: Double = v19(4)
    val v35: Double = v13(1)
    v19 = v19.updated(6, v1)
    var v33: Double = v6
    v19 = v19.updated(1, v6)
    v19 = v19.updated(5, v1)
    var v62: Double = v10
    v19 = v19.updated(2, v62)
    val v61: Vector[Double] = Vector(v33, v0, v51)
    var v50: Vector[Double] = v61
    var v37: Vector[Double] = v50
    v19 = v19.updated(6, v35)
    var v69: Vector[Double] = v37
    val v88: Double = v69(2)
    v88
  }
  def f60(v0: Double): Double = {
    val v7: Double = f83(v0)
    val v3: Double = f83(v7)
    val v1: Double = f83(v0)
    val v12: Double = f83(v0)
    val v4: Double = f83(v3)
    val v8: Double = f83(v7)
    val v6: Double = f83(v8)
    val v5: Double = f83(v3)
    val v19: Double = v12 + v8
    var v11: Double = v5
    var v22: Double = v1
    val v21: Double = f83(v22)
    var v37: Double = v11
    val v61: Vector[Double] = Vector(v37)
    val v30: Double = v61(0)
    val v73: Double = f83(v0)
    val v29: Double = f83(v73)
    var v79: Double = v4
    var v55: Vector[Double] = v61
    var v58: Vector[Double] = v55
    v58 = v58.updated(0, v37)
    v58 = v58.updated(0, v6)
    var v51: Vector[Double] = v58
    v58 = v58.updated(0, v29)
    v58 = v58.updated(0, v19)
    var v78: Vector[Double] = v51
    v78 = v78.updated(0, v21)
    v58 = v58.updated(0, v79)
    v78 = v78.updated(0, v73)
    val v70: Vector[Vector[Double]] = Vector(v61, v78)
    var v99: Vector[Vector[Double]] = v70
    val v173: Vector[Double] = v99(0)
    val v140: Double = v173(0)
    v51 = v51.updated(0, v30)
    v140
  }
  @noinline
  def f0(v0: s3, v1: s3, v2: s0, v3: Vector[s3], v4: Vector[Vector[s0]], v5: Double): Double = {
    var v6: s0 = v2
    val v13: Vector[Vector[Double]] = v6.p0
    var v20: Vector[Vector[Double]] = v13
    val v23: Vector[Double] = v20(0)
    val v24: Double = v23(0)
    val v27: Double = v23(0)
    v20 = v20.updated(0, v23)
    val v80: Double = v5 + v24
    val v76: Double = v80 - v27
    val v376: Double = f60(v76)
    v376
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(Vector(Vector(s2(Vector(s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0))), s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0)))), s1(s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0))), s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0)))), s1(s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0), Vector(24.0))), s0(Vector(Vector(25.0), Vector(26.0), Vector(27.0)), Vector(Vector(28.0), Vector(29.0))))), s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0)))))), Vector(Vector(s0(Vector(Vector(35.0), Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0)))), Vector(s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0), Vector(44.0)))), Vector(s0(Vector(Vector(45.0), Vector(46.0), Vector(47.0)), Vector(Vector(48.0), Vector(49.0))))))
    val v1: s3 = s3(Vector(Vector(s2(Vector(s1(s0(Vector(Vector(50.0), Vector(51.0), Vector(52.0)), Vector(Vector(53.0), Vector(54.0))), s0(Vector(Vector(55.0), Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0)))), s1(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0), Vector(64.0))), s0(Vector(Vector(65.0), Vector(66.0), Vector(67.0)), Vector(Vector(68.0), Vector(69.0)))), s1(s0(Vector(Vector(70.0), Vector(71.0), Vector(72.0)), Vector(Vector(73.0), Vector(74.0))), s0(Vector(Vector(75.0), Vector(76.0), Vector(77.0)), Vector(Vector(78.0), Vector(79.0))))), s0(Vector(Vector(80.0), Vector(81.0), Vector(82.0)), Vector(Vector(83.0), Vector(84.0)))))), Vector(Vector(s0(Vector(Vector(85.0), Vector(86.0), Vector(87.0)), Vector(Vector(88.0), Vector(89.0)))), Vector(s0(Vector(Vector(90.0), Vector(91.0), Vector(92.0)), Vector(Vector(93.0), Vector(94.0)))), Vector(s0(Vector(Vector(95.0), Vector(96.0), Vector(97.0)), Vector(Vector(98.0), Vector(99.0))))))
    val v2: s0 = s0(Vector(Vector(100.0), Vector(101.0), Vector(102.0)), Vector(Vector(103.0), Vector(104.0)))
    val v3: Vector[s3] = Vector(s3(Vector(Vector(s2(Vector(s1(s0(Vector(Vector(105.0), Vector(106.0), Vector(107.0)), Vector(Vector(108.0), Vector(109.0))), s0(Vector(Vector(110.0), Vector(111.0), Vector(112.0)), Vector(Vector(113.0), Vector(114.0)))), s1(s0(Vector(Vector(115.0), Vector(116.0), Vector(117.0)), Vector(Vector(118.0), Vector(119.0))), s0(Vector(Vector(120.0), Vector(121.0), Vector(122.0)), Vector(Vector(123.0), Vector(124.0)))), s1(s0(Vector(Vector(125.0), Vector(126.0), Vector(127.0)), Vector(Vector(128.0), Vector(129.0))), s0(Vector(Vector(130.0), Vector(131.0), Vector(132.0)), Vector(Vector(133.0), Vector(134.0))))), s0(Vector(Vector(135.0), Vector(136.0), Vector(137.0)), Vector(Vector(138.0), Vector(139.0)))))), Vector(Vector(s0(Vector(Vector(140.0), Vector(141.0), Vector(142.0)), Vector(Vector(143.0), Vector(144.0)))), Vector(s0(Vector(Vector(145.0), Vector(146.0), Vector(147.0)), Vector(Vector(148.0), Vector(149.0)))), Vector(s0(Vector(Vector(150.0), Vector(151.0), Vector(152.0)), Vector(Vector(153.0), Vector(154.0)))))))
    val v4: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(155.0), Vector(156.0), Vector(157.0)), Vector(Vector(158.0), Vector(159.0)))), Vector(s0(Vector(Vector(160.0), Vector(161.0), Vector(162.0)), Vector(Vector(163.0), Vector(164.0)))), Vector(s0(Vector(Vector(165.0), Vector(166.0), Vector(167.0)), Vector(Vector(168.0), Vector(169.0)))))
    val v5: Double = 170.0
    val start = nanoTime()
    var result: Double = 170.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4, v5)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}