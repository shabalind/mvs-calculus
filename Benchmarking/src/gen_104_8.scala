import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0,
    p2: Vector[Vector[s0]],
    p3: s0,
    p4: Vector[s0]
  )
  case class s6 (
    p0: Vector[s1],
    p1: s1
  )
  case class s9 (
    p0: s6,
    p1: s0
  )
  def f35(v0: Double): Double = {
    var v2: Double = v0
    var v1: Double = v0
    val v6: Double = v2 - v0
    var v8: Double = v0
    var v5: Double = v6
    var v13: Double = v1
    val v7: Vector[Double] = Vector(v13, v0, v5)
    var v10: Vector[Double] = v7
    var v22: Double = v0
    v10 = v10.updated(0, v5)
    var v14: Vector[Double] = v10
    v10 = v10.updated(0, v0)
    v10 = v10.updated(1, v13)
    v14 = v14.updated(2, v2)
    v10 = v10.updated(0, v8)
    v14 = v7
    v10 = v10.updated(2, v22)
    v10 = v10.updated(1, v5)
    var v17: Vector[Double] = v7
    val v31: Double = v14(1)
    val v36: Double = v17(2)
    var v58: Vector[Double] = v7
    v2 = v0
    val v23: Double = v58(1)
    val v26: Double = v5 * v23
    v13 = v36
    v58 = v58.updated(1, v31)
    v26
  }
  @noinline
  def f0(v0: s9, v1: Double): Double = {
    var v7: s9 = v0
    val v5: Vector[s9] = Vector(v7, v7, v0, v7, v0, v0, v7)
    val v9: s9 = v5(1)
    val v3: s0 = v7.p1
    val v8: Vector[Vector[Double]] = v3.p0
    val v14: Double = f35(v1)
    val v10: Vector[Vector[s9]] = Vector(v5)
    val v21: Double = f35(v14)
    val v13: Vector[s9] = v10(0)
    val v11: s6 = v7.p0
    var v17: Vector[s9] = v5
    v7 = v7.copy(p1 = v3)
    v17 = v13
    v17 = v17.updated(0, v9)
    val v16: s9 = v17(0)
    val v26: s6 = v16.p0
    val v25: Double = f35(v21)
    v7 = v7.copy(p0 = v26)
    val v35: Vector[Double] = v8(1)
    val v42: Double = v35(0)
    val v24: s9 = v5(2)
    val v18: Double = f35(v42)
    val v49: s1 = v11.p1
    val v33: s9 = v5(1)
    var v82: Vector[s9] = v5
    val v44: s9 = v13(6)
    val v57: Double = v25 * v18
    val v40: s9 = v82(1)
    val v47: s0 = v40.p1
    val v43: Double = f35(v57)
    v17 = v17.updated(6, v24)
    var v38: s9 = v44
    val v70: s6 = v44.p0
    v38 = v38.copy(p0 = v11)
    v7 = v7.copy(p0 = v70)
    v82 = v82.updated(5, v33)
    v17 = v17.updated(3, v38)
    var v131: s1 = v49
    var v91: s9 = v7
    v82 = v82.updated(4, v91)
    val v125: s0 = v49.p3
    v91 = v91.copy(p1 = v47)
    v38 = v38.copy(p1 = v125)
    val v176: Vector[s0] = v131.p0
    v91 = v91.copy(p0 = v11)
    v17 = v17.updated(5, v91)
    val v207: s0 = v176(0)
    v7 = v7.copy(p1 = v207)
    val v150: Double = f35(v43)
    v131 = v131.copy(p4 = v176)
    v150
  }
  def benchmark(): Unit = {
    val v0: s9 = s9(s6(Vector(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0))), s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0))), Vector(Vector(s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))))), s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0))), Vector(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0))), s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0), Vector(40.0), Vector(41.0))))), s1(Vector(s0(Vector(Vector(42.0), Vector(43.0), Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0))), s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0), Vector(52.0), Vector(53.0)))), s0(Vector(Vector(54.0), Vector(55.0), Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0))), Vector(Vector(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0), Vector(64.0), Vector(65.0))))), s0(Vector(Vector(66.0), Vector(67.0), Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0))), Vector(s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)), Vector(Vector(75.0), Vector(76.0), Vector(77.0))), s0(Vector(Vector(78.0), Vector(79.0), Vector(80.0)), Vector(Vector(81.0), Vector(82.0), Vector(83.0))))), s1(Vector(s0(Vector(Vector(84.0), Vector(85.0), Vector(86.0)), Vector(Vector(87.0), Vector(88.0), Vector(89.0))), s0(Vector(Vector(90.0), Vector(91.0), Vector(92.0)), Vector(Vector(93.0), Vector(94.0), Vector(95.0)))), s0(Vector(Vector(96.0), Vector(97.0), Vector(98.0)), Vector(Vector(99.0), Vector(100.0), Vector(101.0))), Vector(Vector(s0(Vector(Vector(102.0), Vector(103.0), Vector(104.0)), Vector(Vector(105.0), Vector(106.0), Vector(107.0))))), s0(Vector(Vector(108.0), Vector(109.0), Vector(110.0)), Vector(Vector(111.0), Vector(112.0), Vector(113.0))), Vector(s0(Vector(Vector(114.0), Vector(115.0), Vector(116.0)), Vector(Vector(117.0), Vector(118.0), Vector(119.0))), s0(Vector(Vector(120.0), Vector(121.0), Vector(122.0)), Vector(Vector(123.0), Vector(124.0), Vector(125.0)))))), s1(Vector(s0(Vector(Vector(126.0), Vector(127.0), Vector(128.0)), Vector(Vector(129.0), Vector(130.0), Vector(131.0))), s0(Vector(Vector(132.0), Vector(133.0), Vector(134.0)), Vector(Vector(135.0), Vector(136.0), Vector(137.0)))), s0(Vector(Vector(138.0), Vector(139.0), Vector(140.0)), Vector(Vector(141.0), Vector(142.0), Vector(143.0))), Vector(Vector(s0(Vector(Vector(144.0), Vector(145.0), Vector(146.0)), Vector(Vector(147.0), Vector(148.0), Vector(149.0))))), s0(Vector(Vector(150.0), Vector(151.0), Vector(152.0)), Vector(Vector(153.0), Vector(154.0), Vector(155.0))), Vector(s0(Vector(Vector(156.0), Vector(157.0), Vector(158.0)), Vector(Vector(159.0), Vector(160.0), Vector(161.0))), s0(Vector(Vector(162.0), Vector(163.0), Vector(164.0)), Vector(Vector(165.0), Vector(166.0), Vector(167.0)))))), s0(Vector(Vector(168.0), Vector(169.0), Vector(170.0)), Vector(Vector(171.0), Vector(172.0), Vector(173.0))))
    val v1: Double = 174.0
    val start = nanoTime()
    var result: Double = 174.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}