import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s2 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s3 (
    p0: Vector[s0],
    p1: s2
  )
  case class s4 (
    p0: Vector[Vector[s2]],
    p1: Vector[Vector[s2]],
    p2: s3,
    p3: s0,
    p4: Vector[Vector[s3]]
  )
  def f85(v0: Double): Double = {
    var v6: Double = v0
    var v2: Double = v0
    var v4: Double = v0
    var v8: Double = v6
    var v7: Double = v6
    var v3: Double = v8
    val v17: Vector[Double] = Vector(v3, v0, v0)
    v2 = v4
    val v10: Double = v17(1)
    var v12: Vector[Double] = v17
    v12 = v12.updated(0, v3)
    val v9: Double = v17(2)
    val v15: Double = v12(2)
    val v19: Double = v17(1)
    var v41: Vector[Double] = v12
    val v13: Vector[Double] = Vector(v10, v8, v9, v19)
    val v34: Vector[Double] = Vector(v4, v0, v19, v19)
    val v24: Double = v41(2)
    var v20: Double = v19
    var v32: Vector[Double] = v13
    val v39: Vector[Vector[Double]] = Vector(v32, v34, v13, v34)
    val v35: Vector[Double] = v39(2)
    var v36: Vector[Double] = v34
    v36 = v36.updated(1, v2)
    var v48: Vector[Vector[Double]] = v39
    val v38: Double = v41(2)
    val v57: Double = v2 * v20
    v48 = v48.updated(1, v34)
    var v27: Double = v38
    val v26: Vector[Vector[Double]] = Vector(v34, v35, v36)
    val v50: Vector[Double] = v48(1)
    val v25: Vector[Double] = v26(2)
    val v47: Double = v50(0)
    v4 = v7
    v32 = v32.updated(0, v27)
    v41 = v41.updated(1, v57)
    var v160: Double = v47
    v12 = v12.updated(0, v7)
    v48 = v48.updated(0, v25)
    v36 = v36.updated(3, v24)
    v36 = v36.updated(0, v15)
    v160
  }
  @noinline
  def f0(v0: s4, v1: s4, v2: Double): Double = {
    val v6: Double = f85(v2)
    var v51: Double = v2
    val v26: Double = f85(v6)
    val v23: Double = v51 + v26
    v23
  }
  def benchmark(): Unit = {
    val v0: s4 = s4(Vector(Vector(s2(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0))), Vector(s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0)))))), Vector(s2(s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0))), Vector(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0)))))), Vector(s2(s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0))), Vector(s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0))))))), Vector(Vector(s2(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0))), Vector(s0(Vector(Vector(28.0), Vector(29.0), Vector(30.0)), Vector(Vector(31.0)))))), Vector(s2(s0(Vector(Vector(32.0), Vector(33.0), Vector(34.0)), Vector(Vector(35.0))), Vector(s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0))))))), s3(Vector(s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0)))), s2(s0(Vector(Vector(44.0), Vector(45.0), Vector(46.0)), Vector(Vector(47.0))), Vector(s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0)))))), s0(Vector(Vector(52.0), Vector(53.0), Vector(54.0)), Vector(Vector(55.0))), Vector(Vector(s3(Vector(s0(Vector(Vector(56.0), Vector(57.0), Vector(58.0)), Vector(Vector(59.0)))), s2(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0))), Vector(s0(Vector(Vector(64.0), Vector(65.0), Vector(66.0)), Vector(Vector(67.0))))))), Vector(s3(Vector(s0(Vector(Vector(68.0), Vector(69.0), Vector(70.0)), Vector(Vector(71.0)))), s2(s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)), Vector(Vector(75.0))), Vector(s0(Vector(Vector(76.0), Vector(77.0), Vector(78.0)), Vector(Vector(79.0))))))), Vector(s3(Vector(s0(Vector(Vector(80.0), Vector(81.0), Vector(82.0)), Vector(Vector(83.0)))), s2(s0(Vector(Vector(84.0), Vector(85.0), Vector(86.0)), Vector(Vector(87.0))), Vector(s0(Vector(Vector(88.0), Vector(89.0), Vector(90.0)), Vector(Vector(91.0)))))))))
    val v1: s4 = s4(Vector(Vector(s2(s0(Vector(Vector(92.0), Vector(93.0), Vector(94.0)), Vector(Vector(95.0))), Vector(s0(Vector(Vector(96.0), Vector(97.0), Vector(98.0)), Vector(Vector(99.0)))))), Vector(s2(s0(Vector(Vector(100.0), Vector(101.0), Vector(102.0)), Vector(Vector(103.0))), Vector(s0(Vector(Vector(104.0), Vector(105.0), Vector(106.0)), Vector(Vector(107.0)))))), Vector(s2(s0(Vector(Vector(108.0), Vector(109.0), Vector(110.0)), Vector(Vector(111.0))), Vector(s0(Vector(Vector(112.0), Vector(113.0), Vector(114.0)), Vector(Vector(115.0))))))), Vector(Vector(s2(s0(Vector(Vector(116.0), Vector(117.0), Vector(118.0)), Vector(Vector(119.0))), Vector(s0(Vector(Vector(120.0), Vector(121.0), Vector(122.0)), Vector(Vector(123.0)))))), Vector(s2(s0(Vector(Vector(124.0), Vector(125.0), Vector(126.0)), Vector(Vector(127.0))), Vector(s0(Vector(Vector(128.0), Vector(129.0), Vector(130.0)), Vector(Vector(131.0))))))), s3(Vector(s0(Vector(Vector(132.0), Vector(133.0), Vector(134.0)), Vector(Vector(135.0)))), s2(s0(Vector(Vector(136.0), Vector(137.0), Vector(138.0)), Vector(Vector(139.0))), Vector(s0(Vector(Vector(140.0), Vector(141.0), Vector(142.0)), Vector(Vector(143.0)))))), s0(Vector(Vector(144.0), Vector(145.0), Vector(146.0)), Vector(Vector(147.0))), Vector(Vector(s3(Vector(s0(Vector(Vector(148.0), Vector(149.0), Vector(150.0)), Vector(Vector(151.0)))), s2(s0(Vector(Vector(152.0), Vector(153.0), Vector(154.0)), Vector(Vector(155.0))), Vector(s0(Vector(Vector(156.0), Vector(157.0), Vector(158.0)), Vector(Vector(159.0))))))), Vector(s3(Vector(s0(Vector(Vector(160.0), Vector(161.0), Vector(162.0)), Vector(Vector(163.0)))), s2(s0(Vector(Vector(164.0), Vector(165.0), Vector(166.0)), Vector(Vector(167.0))), Vector(s0(Vector(Vector(168.0), Vector(169.0), Vector(170.0)), Vector(Vector(171.0))))))), Vector(s3(Vector(s0(Vector(Vector(172.0), Vector(173.0), Vector(174.0)), Vector(Vector(175.0)))), s2(s0(Vector(Vector(176.0), Vector(177.0), Vector(178.0)), Vector(Vector(179.0))), Vector(s0(Vector(Vector(180.0), Vector(181.0), Vector(182.0)), Vector(Vector(183.0)))))))))
    val v2: Double = 184.0
    val start = nanoTime()
    var result: Double = 184.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}