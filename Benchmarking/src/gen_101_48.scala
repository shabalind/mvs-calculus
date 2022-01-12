import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s2 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  case class s3 (
    p0: s1,
    p1: s2,
    p2: Vector[s0]
  )
  case class s4 (
    p0: Vector[s3],
    p1: s1
  )
  case class s7 (
    p0: Vector[Double],
    p1: s2
  )
  def f110(v0: Double): Double = {
    val v6: Double = v0 - v0
    var v2: Double = v0
    var v8: Double = v2
    var v7: Double = v6
    v7 = v8
    val v14: Vector[Double] = Vector(v7)
    val v32: Vector[Vector[Double]] = Vector(v14, v14, v14, v14, v14, v14, v14)
    val v43: Vector[Double] = v32(4)
    var v36: Vector[Double] = v43
    val v35: Double = v36(0)
    v35
  }
  def f83(v0: s7): s7 = {
    val v3: s2 = v0.p1
    val v1: Vector[s0] = v3.p0
    val v4: s0 = v1(1)
    val v10: Vector[Vector[Double]] = v4.p0
    val v36: Vector[Double] = v0.p0
    val v35: Vector[Double] = v10(1)
    val v32: Double = v35(0)
    var v48: Vector[Double] = v36
    v48 = v48.updated(1, v32)
    val v130: s7 = s7(v48, v3)
    v130
  }
  def f80(v0: s7): s7 = {
    val v2: s2 = v0.p1
    var v3: s7 = v0
    val v5: s7 = f83(v3)
    val v19: s7 = f83(v3)
    val v30: Vector[Double] = v5.p0
    val v41: s7 = f83(v19)
    var v57: Vector[Double] = v30
    val v25: Double = v57(0)
    v3 = v3.copy(p0 = v57)
    v57 = v57.updated(0, v25)
    var v46: Vector[Double] = v30
    val v31: Vector[Double] = v41.p0
    val v158: Vector[Vector[Double]] = Vector(v30, v31, v46, v31, v57, v31, v30)
    val v54: Vector[Double] = v158(1)
    val v173: s7 = s7(v54, v2)
    var v143: s7 = v173
    v143
  }
  def f70(v0: s7): s7 = {
    val v4: s2 = v0.p1
    val v3: s7 = f80(v0)
    val v5: s7 = f83(v0)
    val v29: s2 = v5.p1
    val v23: s2 = v5.p1
    val v16: Vector[s0] = v23.p0
    var v25: s7 = v3
    val v21: Vector[s0] = v23.p1
    val v13: s2 = v0.p1
    val v17: s0 = v16(0)
    v25 = v25.copy(p1 = v4)
    val v26: s2 = s2(v21, v21)
    var v27: Vector[s0] = v16
    val v34: Vector[s0] = v26.p1
    v25 = v25.copy(p1 = v29)
    val v61: s2 = v25.p1
    val v78: Vector[s0] = v61.p0
    val v74: s0 = v34(0)
    val v43: s2 = s2(v27, v78)
    v27 = v27.updated(0, v17)
    v27 = v27.updated(1, v74)
    var v98: s7 = v3
    v25 = v25.copy(p1 = v29)
    val v118: s0 = v34(1)
    var v82: s0 = v118
    v25 = v98
    var v107: s7 = v5
    v107 = v107.copy(p1 = v43)
    v25 = v25.copy(p1 = v13)
    v27 = v27.updated(0, v82)
    v25 = v25.copy(p1 = v23)
    val v187: Vector[Vector[Double]] = v17.p0
    v82 = v82.copy(p0 = v187)
    v107
  }
  @noinline
  def f0(v0: s4, v1: s7, v2: Double): Double = {
    val v3: s7 = f70(v1)
    val v8: Vector[Double] = v3.p0
    val v4: Double = v8(0)
    val v12: Double = v4 / v2
    val v18: s2 = v1.p1
    var v61: s2 = v18
    val v24: Vector[s0] = v61.p0
    val v17: s0 = v24(0)
    var v50: Double = v4
    val v73: Vector[Vector[Double]] = v17.p0
    val v78: Vector[Double] = v73(2)
    val v62: Double = v78(0)
    val v74: Double = v12 - v50
    v50 = v62
    val v96: Double = v2 - v74
    val v271: Double = f110(v96)
    v271
  }
  def benchmark(): Unit = {
    val v0: s4 = s4(Vector(s3(s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0))), Vector(s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0))), s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))))), s2(Vector(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0))), s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0)))), Vector(s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0), Vector(40.0), Vector(41.0))), s0(Vector(Vector(42.0), Vector(43.0), Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0))))), Vector(s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0), Vector(52.0), Vector(53.0))))), s3(s1(s0(Vector(Vector(54.0), Vector(55.0), Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0))), Vector(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0), Vector(64.0), Vector(65.0))), s0(Vector(Vector(66.0), Vector(67.0), Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0))), s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)), Vector(Vector(75.0), Vector(76.0), Vector(77.0))))), s2(Vector(s0(Vector(Vector(78.0), Vector(79.0), Vector(80.0)), Vector(Vector(81.0), Vector(82.0), Vector(83.0))), s0(Vector(Vector(84.0), Vector(85.0), Vector(86.0)), Vector(Vector(87.0), Vector(88.0), Vector(89.0)))), Vector(s0(Vector(Vector(90.0), Vector(91.0), Vector(92.0)), Vector(Vector(93.0), Vector(94.0), Vector(95.0))), s0(Vector(Vector(96.0), Vector(97.0), Vector(98.0)), Vector(Vector(99.0), Vector(100.0), Vector(101.0))))), Vector(s0(Vector(Vector(102.0), Vector(103.0), Vector(104.0)), Vector(Vector(105.0), Vector(106.0), Vector(107.0)))))), s1(s0(Vector(Vector(108.0), Vector(109.0), Vector(110.0)), Vector(Vector(111.0), Vector(112.0), Vector(113.0))), Vector(s0(Vector(Vector(114.0), Vector(115.0), Vector(116.0)), Vector(Vector(117.0), Vector(118.0), Vector(119.0))), s0(Vector(Vector(120.0), Vector(121.0), Vector(122.0)), Vector(Vector(123.0), Vector(124.0), Vector(125.0))), s0(Vector(Vector(126.0), Vector(127.0), Vector(128.0)), Vector(Vector(129.0), Vector(130.0), Vector(131.0))))))
    val v1: s7 = s7(Vector(132.0, 133.0), s2(Vector(s0(Vector(Vector(134.0), Vector(135.0), Vector(136.0)), Vector(Vector(137.0), Vector(138.0), Vector(139.0))), s0(Vector(Vector(140.0), Vector(141.0), Vector(142.0)), Vector(Vector(143.0), Vector(144.0), Vector(145.0)))), Vector(s0(Vector(Vector(146.0), Vector(147.0), Vector(148.0)), Vector(Vector(149.0), Vector(150.0), Vector(151.0))), s0(Vector(Vector(152.0), Vector(153.0), Vector(154.0)), Vector(Vector(155.0), Vector(156.0), Vector(157.0))))))
    val v2: Double = 158.0
    val start = nanoTime()
    var result: Double = 158.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}