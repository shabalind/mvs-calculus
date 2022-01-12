import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Double],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: Vector[s0],
    p1: Double,
    p2: s0,
    p3: Vector[s1]
  )
  case class s3 (
    p0: Vector[s0],
    p1: s2
  )
  case class s4 (
    p0: Vector[Vector[Double]],
    p1: s3
  )
  case class s6 (
    p0: s3,
    p1: Vector[s1]
  )
  case class s7 (
    p0: s0,
    p1: s6
  )
  def f23(v0: Double): Double = {
    var v4: Double = v0
    var v5: Double = v4
    var v6: Double = v5
    var v2: Double = v5
    var v10: Double = v2
    val v1: Double = v6 + v6
    var v12: Double = v2
    var v11: Double = v12
    var v14: Double = v12
    var v9: Double = v14
    var v20: Double = v6
    var v13: Double = v11
    var v15: Double = v9
    var v46: Double = v15
    val v23: Vector[Double] = Vector(v46)
    val v30: Double = v23(0)
    var v60: Double = v20
    var v32: Double = v1
    val v39: Vector[Double] = Vector(v32, v13, v30, v11)
    var v65: Vector[Double] = v39
    v65 = v65.updated(1, v11)
    v65 = v65.updated(0, v32)
    val v55: Double = v65(2)
    v65 = v65.updated(1, v60)
    v65 = v65.updated(2, v10)
    v55
  }
  def f6(v0: Double): Double = {
    var v4: Double = v0
    var v7: Double = v4
    val v1: Double = f23(v7)
    val v3: Double = f23(v1)
    val v9: Double = f23(v0)
    var v10: Double = v9
    var v14: Double = v4
    val v11: Double = f23(v14)
    val v15: Double = f23(v7)
    var v22: Double = v1
    var v33: Double = v11
    var v12: Double = v33
    var v16: Double = v22
    var v30: Double = v10
    var v20: Double = v22
    val v24: Double = f23(v3)
    val v21: Double = f23(v9)
    v30 = v20
    val v31: Double = f23(v12)
    val v44: Double = f23(v16)
    var v49: Double = v24
    var v72: Double = v10
    v7 = v31
    val v41: Double = v11 - v15
    var v57: Double = v3
    v57 = v72
    val v78: Vector[Double] = Vector(v21, v57)
    var v87: Vector[Double] = v78
    var v83: Double = v41
    v87 = v87.updated(0, v83)
    v87 = v87.updated(1, v7)
    v22 = v49
    var v76: Vector[Double] = v87
    var v130: Vector[Double] = v76
    v130 = v130.updated(1, v44)
    var v111: Vector[Double] = v130
    val v180: Double = v111(0)
    v76 = v76.updated(1, v30)
    v180
  }
  @noinline
  def f0(v0: s6, v1: Vector[s4], v2: Vector[Double], v3: Vector[s7], v4: Double): Double = {
    val v39: Double = f6(v4)
    var v38: Vector[Double] = v2
    val v26: Double = v38(0)
    val v40: Double = f6(v39)
    v38 = v38.updated(1, v40)
    v26
  }
  def benchmark(): Unit = {
    val v0: s6 = s6(s3(Vector(s0(Vector(0.0), Vector(Vector(1.0), Vector(2.0)))), s2(Vector(s0(Vector(3.0), Vector(Vector(4.0), Vector(5.0)))), 6.0, s0(Vector(7.0), Vector(Vector(8.0), Vector(9.0))), Vector(s1(s0(Vector(10.0), Vector(Vector(11.0), Vector(12.0))), s0(Vector(13.0), Vector(Vector(14.0), Vector(15.0))))))), Vector(s1(s0(Vector(16.0), Vector(Vector(17.0), Vector(18.0))), s0(Vector(19.0), Vector(Vector(20.0), Vector(21.0)))), s1(s0(Vector(22.0), Vector(Vector(23.0), Vector(24.0))), s0(Vector(25.0), Vector(Vector(26.0), Vector(27.0))))))
    val v1: Vector[s4] = Vector(s4(Vector(Vector(28.0), Vector(29.0)), s3(Vector(s0(Vector(30.0), Vector(Vector(31.0), Vector(32.0)))), s2(Vector(s0(Vector(33.0), Vector(Vector(34.0), Vector(35.0)))), 36.0, s0(Vector(37.0), Vector(Vector(38.0), Vector(39.0))), Vector(s1(s0(Vector(40.0), Vector(Vector(41.0), Vector(42.0))), s0(Vector(43.0), Vector(Vector(44.0), Vector(45.0)))))))), s4(Vector(Vector(46.0), Vector(47.0)), s3(Vector(s0(Vector(48.0), Vector(Vector(49.0), Vector(50.0)))), s2(Vector(s0(Vector(51.0), Vector(Vector(52.0), Vector(53.0)))), 54.0, s0(Vector(55.0), Vector(Vector(56.0), Vector(57.0))), Vector(s1(s0(Vector(58.0), Vector(Vector(59.0), Vector(60.0))), s0(Vector(61.0), Vector(Vector(62.0), Vector(63.0)))))))))
    val v2: Vector[Double] = Vector(64.0, 65.0)
    val v3: Vector[s7] = Vector(s7(s0(Vector(66.0), Vector(Vector(67.0), Vector(68.0))), s6(s3(Vector(s0(Vector(69.0), Vector(Vector(70.0), Vector(71.0)))), s2(Vector(s0(Vector(72.0), Vector(Vector(73.0), Vector(74.0)))), 75.0, s0(Vector(76.0), Vector(Vector(77.0), Vector(78.0))), Vector(s1(s0(Vector(79.0), Vector(Vector(80.0), Vector(81.0))), s0(Vector(82.0), Vector(Vector(83.0), Vector(84.0))))))), Vector(s1(s0(Vector(85.0), Vector(Vector(86.0), Vector(87.0))), s0(Vector(88.0), Vector(Vector(89.0), Vector(90.0)))), s1(s0(Vector(91.0), Vector(Vector(92.0), Vector(93.0))), s0(Vector(94.0), Vector(Vector(95.0), Vector(96.0))))))), s7(s0(Vector(97.0), Vector(Vector(98.0), Vector(99.0))), s6(s3(Vector(s0(Vector(100.0), Vector(Vector(101.0), Vector(102.0)))), s2(Vector(s0(Vector(103.0), Vector(Vector(104.0), Vector(105.0)))), 106.0, s0(Vector(107.0), Vector(Vector(108.0), Vector(109.0))), Vector(s1(s0(Vector(110.0), Vector(Vector(111.0), Vector(112.0))), s0(Vector(113.0), Vector(Vector(114.0), Vector(115.0))))))), Vector(s1(s0(Vector(116.0), Vector(Vector(117.0), Vector(118.0))), s0(Vector(119.0), Vector(Vector(120.0), Vector(121.0)))), s1(s0(Vector(122.0), Vector(Vector(123.0), Vector(124.0))), s0(Vector(125.0), Vector(Vector(126.0), Vector(127.0))))))), s7(s0(Vector(128.0), Vector(Vector(129.0), Vector(130.0))), s6(s3(Vector(s0(Vector(131.0), Vector(Vector(132.0), Vector(133.0)))), s2(Vector(s0(Vector(134.0), Vector(Vector(135.0), Vector(136.0)))), 137.0, s0(Vector(138.0), Vector(Vector(139.0), Vector(140.0))), Vector(s1(s0(Vector(141.0), Vector(Vector(142.0), Vector(143.0))), s0(Vector(144.0), Vector(Vector(145.0), Vector(146.0))))))), Vector(s1(s0(Vector(147.0), Vector(Vector(148.0), Vector(149.0))), s0(Vector(150.0), Vector(Vector(151.0), Vector(152.0)))), s1(s0(Vector(153.0), Vector(Vector(154.0), Vector(155.0))), s0(Vector(156.0), Vector(Vector(157.0), Vector(158.0))))))))
    val v4: Double = 159.0
    val start = nanoTime()
    var result: Double = 159.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}