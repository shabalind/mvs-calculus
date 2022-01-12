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
    p1: Vector[s1]
  )
  def f17(v0: Double): Double = {
    var v1: Double = v0
    var v2: Double = v1
    var v5: Double = v2
    v1 = v0
    var v7: Double = v2
    val v6: Vector[Double] = Vector(v7, v1, v5, v0, v0, v1)
    val v3: Double = v6(0)
    val v8: Double = v6(2)
    val v15: Double = v6(5)
    var v17: Vector[Double] = v6
    var v4: Vector[Double] = v17
    v17 = v17.updated(2, v7)
    v4 = v4.updated(0, v3)
    val v9: Vector[Vector[Double]] = Vector(v4, v6)
    v1 = v15
    var v11: Double = v8
    val v13: Double = v17(0)
    var v10: Vector[Vector[Double]] = v9
    val v24: Vector[Double] = v10(0)
    val v31: Double = v6(3)
    v4 = v4.updated(0, v13)
    val v22: Double = v6(1)
    val v21: Double = v15 * v1
    v11 = v22
    val v23: Double = v0 + v11
    var v40: Vector[Double] = v24
    var v47: Double = v8
    val v33: Double = v4(2)
    v40 = v40.updated(3, v23)
    var v27: Vector[Double] = v40
    var v34: Double = v2
    var v41: Vector[Vector[Double]] = v9
    v10 = v10.updated(0, v17)
    val v42: Vector[Double] = v9(1)
    val v36: Vector[Double] = v41(1)
    v27 = v27.updated(4, v15)
    val v50: Double = v36(0)
    var v74: Double = v47
    v41 = v41.updated(0, v42)
    var v49: Vector[Vector[Double]] = v10
    var v83: Vector[Double] = v27
    val v44: Vector[Double] = v41(0)
    v40 = v40.updated(1, v33)
    var v38: Vector[Vector[Double]] = v49
    v17 = v17.updated(3, v21)
    v49 = v49.updated(1, v44)
    v49 = v49.updated(0, v40)
    v40 = v40.updated(1, v5)
    v74 = v13
    val v37: Vector[Double] = v38(0)
    v27 = v27.updated(3, v1)
    val v32: Vector[Double] = v10(1)
    v49 = v49.updated(1, v32)
    val v93: Vector[Double] = v38(0)
    var v81: Vector[Double] = v17
    val v250: Vector[Double] = v41(0)
    var v137: Double = v50
    v49 = v49.updated(1, v37)
    v49 = v49.updated(0, v81)
    var v144: Vector[Double] = v93
    v81 = v81.updated(1, v0)
    v81 = v81.updated(2, v74)
    v10 = v10.updated(1, v83)
    v41 = v41.updated(0, v250)
    v40 = v40.updated(4, v31)
    val v120: Double = v144(3)
    v40 = v40.updated(0, v137)
    val v134: Double = v120 + v34
    v134
  }
  @noinline
  def f0(v0: Vector[Vector[s2]], v1: s2, v2: s1, v3: s2, v4: Double): Double = {
    val v5: Double = v4 - v4
    var v25: Double = v4
    var v95: Double = v5
    val v141: Double = f17(v95)
    val v192: Double = v141 / v25
    val v144: Double = v192 + v25
    v144
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s2]] = Vector(Vector(s2(Vector(s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0))), s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0)))), s1(s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0)))), s1(s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0))), s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0))))), Vector(s1(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0))), s0(Vector(Vector(28.0), Vector(29.0), Vector(30.0)), Vector(Vector(31.0)))), s1(s0(Vector(Vector(32.0), Vector(33.0), Vector(34.0)), Vector(Vector(35.0))), s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0))))))), Vector(s2(Vector(s1(s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0))), s0(Vector(Vector(44.0), Vector(45.0), Vector(46.0)), Vector(Vector(47.0)))), s1(s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0))), s0(Vector(Vector(52.0), Vector(53.0), Vector(54.0)), Vector(Vector(55.0)))), s1(s0(Vector(Vector(56.0), Vector(57.0), Vector(58.0)), Vector(Vector(59.0))), s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0))))), Vector(s1(s0(Vector(Vector(64.0), Vector(65.0), Vector(66.0)), Vector(Vector(67.0))), s0(Vector(Vector(68.0), Vector(69.0), Vector(70.0)), Vector(Vector(71.0)))), s1(s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)), Vector(Vector(75.0))), s0(Vector(Vector(76.0), Vector(77.0), Vector(78.0)), Vector(Vector(79.0))))))))
    val v1: s2 = s2(Vector(s1(s0(Vector(Vector(80.0), Vector(81.0), Vector(82.0)), Vector(Vector(83.0))), s0(Vector(Vector(84.0), Vector(85.0), Vector(86.0)), Vector(Vector(87.0)))), s1(s0(Vector(Vector(88.0), Vector(89.0), Vector(90.0)), Vector(Vector(91.0))), s0(Vector(Vector(92.0), Vector(93.0), Vector(94.0)), Vector(Vector(95.0)))), s1(s0(Vector(Vector(96.0), Vector(97.0), Vector(98.0)), Vector(Vector(99.0))), s0(Vector(Vector(100.0), Vector(101.0), Vector(102.0)), Vector(Vector(103.0))))), Vector(s1(s0(Vector(Vector(104.0), Vector(105.0), Vector(106.0)), Vector(Vector(107.0))), s0(Vector(Vector(108.0), Vector(109.0), Vector(110.0)), Vector(Vector(111.0)))), s1(s0(Vector(Vector(112.0), Vector(113.0), Vector(114.0)), Vector(Vector(115.0))), s0(Vector(Vector(116.0), Vector(117.0), Vector(118.0)), Vector(Vector(119.0))))))
    val v2: s1 = s1(s0(Vector(Vector(120.0), Vector(121.0), Vector(122.0)), Vector(Vector(123.0))), s0(Vector(Vector(124.0), Vector(125.0), Vector(126.0)), Vector(Vector(127.0))))
    val v3: s2 = s2(Vector(s1(s0(Vector(Vector(128.0), Vector(129.0), Vector(130.0)), Vector(Vector(131.0))), s0(Vector(Vector(132.0), Vector(133.0), Vector(134.0)), Vector(Vector(135.0)))), s1(s0(Vector(Vector(136.0), Vector(137.0), Vector(138.0)), Vector(Vector(139.0))), s0(Vector(Vector(140.0), Vector(141.0), Vector(142.0)), Vector(Vector(143.0)))), s1(s0(Vector(Vector(144.0), Vector(145.0), Vector(146.0)), Vector(Vector(147.0))), s0(Vector(Vector(148.0), Vector(149.0), Vector(150.0)), Vector(Vector(151.0))))), Vector(s1(s0(Vector(Vector(152.0), Vector(153.0), Vector(154.0)), Vector(Vector(155.0))), s0(Vector(Vector(156.0), Vector(157.0), Vector(158.0)), Vector(Vector(159.0)))), s1(s0(Vector(Vector(160.0), Vector(161.0), Vector(162.0)), Vector(Vector(163.0))), s0(Vector(Vector(164.0), Vector(165.0), Vector(166.0)), Vector(Vector(167.0))))))
    val v4: Double = 168.0
    val start = nanoTime()
    var result: Double = 168.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}