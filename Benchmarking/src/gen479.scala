import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  case class s2 (
    p0: s1,
    p1: Vector[s1]
  )
  case class s3 (
    p0: s0,
    p1: s0
  )
  def f87(v0: s1, v1: s3): s1 = {
    var v4: s1 = v0
    val v3: Vector[s1] = Vector(v0, v4, v4, v0, v0, v0)
    val v6: s0 = v1.p1
    v4 = v4.copy(p1 = v6)
    v4 = v4.copy(p1 = v6)
    val v19: Vector[s0] = v4.p0
    var v18: Vector[s1] = v3
    val v12: s1 = v18(5)
    v18 = v18.updated(2, v4)
    var v32: Vector[s0] = v19
    v4 = v4.copy(p0 = v32)
    v32 = v32.updated(2, v6)
    v18 = v18.updated(2, v0)
    v12
  }
  def f86(v0: s1): s1 = {
    var v1: s1 = v0
    val v6: Vector[s0] = v0.p0
    val v3: s0 = v6(2)
    v1 = v1.copy(p0 = v6)
    var v9: s0 = v3
    val v16: Vector[s0] = v0.p0
    val v28: s0 = v6(0)
    val v13: s0 = v6(1)
    v1 = v1.copy(p1 = v13)
    val v32: s0 = v0.p1
    v1 = v1.copy(p1 = v9)
    val v29: s0 = v16(2)
    val v31: Vector[Vector[Double]] = v28.p0
    v9 = v9.copy(p0 = v31)
    val v43: s3 = s3(v9, v9)
    val v69: s1 = f87(v1, v43)
    var v36: s3 = v43
    val v30: s0 = v36.p0
    val v85: s3 = s3(v3, v29)
    var v95: s1 = v69
    val v118: s1 = f87(v95, v36)
    v36 = v36.copy(p0 = v32)
    val v49: s1 = f87(v118, v85)
    v95 = v95.copy(p1 = v30)
    val v125: s1 = f87(v49, v43)
    v125
  }
  def f84(v0: s1): s1 = {
    val v4: s0 = v0.p1
    val v3: Vector[s0] = v0.p0
    val v7: s1 = s1(v3, v4)
    val v2: s1 = f86(v7)
    val v14: s1 = f86(v2)
    val v21: s1 = f86(v14)
    val v34: s1 = f86(v21)
    val v72: s1 = f86(v34)
    val v124: s1 = f86(v72)
    v124
  }
  def f71(v0: s0, v1: s1): s0 = {
    val v4: s1 = f84(v1)
    val v14: s1 = f84(v1)
    val v11: s0 = v14.p1
    val v17: s3 = s3(v11, v0)
    val v33: s1 = f87(v4, v17)
    val v59: Vector[s0] = v33.p0
    var v141: Vector[s0] = v59
    val v108: s0 = v141(2)
    v141 = v141.updated(2, v11)
    v108
  }
  @noinline
  def f0(v0: Vector[s2], v1: Double): Double = {
    val v7: s2 = v0(0)
    val v2: s2 = v0(0)
    val v11: s1 = v7.p0
    val v9: Vector[s1] = v7.p1
    val v10: s1 = v7.p0
    val v6: Vector[s0] = v11.p0
    val v13: s1 = v2.p0
    val v15: s0 = v6(2)
    val v20: s0 = f71(v15, v10)
    var v28: Vector[s0] = v6
    val v22: Double = v1 + v1
    var v29: Vector[s0] = v28
    val v58: s0 = v6(0)
    v28 = v28.updated(0, v58)
    v28 = v28.updated(1, v20)
    val v32: s0 = v29(1)
    var v35: s0 = v20
    val v37: s0 = v28(0)
    val v52: Vector[Vector[Double]] = v32.p0
    val v60: s0 = v13.p1
    val v57: s1 = v9(0)
    val v68: s0 = f71(v35, v57)
    v28 = v28.updated(2, v32)
    val v124: Vector[Vector[Double]] = v68.p1
    v29 = v29.updated(2, v35)
    val v110: Vector[Vector[Vector[Double]]] = Vector(v124, v124, v124, v124, v124, v124)
    v28 = v28.updated(1, v32)
    val v185: Vector[Double] = v52(1)
    v28 = v28.updated(1, v60)
    var v162: Vector[Vector[Vector[Double]]] = v110
    val v192: Vector[Vector[Double]] = v162(3)
    val v133: Double = v185(0)
    v35 = v35.copy(p1 = v192)
    val v90: Double = v133 - v22
    v29 = v29.updated(1, v37)
    v90
  }
  def benchmark(): Unit = {
    val v0: Vector[s2] = Vector(s2(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0))), s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0))), s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0)))), s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0)))), Vector(s1(Vector(s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0), Vector(24.0))), s0(Vector(Vector(25.0), Vector(26.0), Vector(27.0)), Vector(Vector(28.0), Vector(29.0))), s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0)))), s0(Vector(Vector(35.0), Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0)))), s1(Vector(s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0), Vector(44.0))), s0(Vector(Vector(45.0), Vector(46.0), Vector(47.0)), Vector(Vector(48.0), Vector(49.0))), s0(Vector(Vector(50.0), Vector(51.0), Vector(52.0)), Vector(Vector(53.0), Vector(54.0)))), s0(Vector(Vector(55.0), Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0)))))), s2(s1(Vector(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0), Vector(64.0))), s0(Vector(Vector(65.0), Vector(66.0), Vector(67.0)), Vector(Vector(68.0), Vector(69.0))), s0(Vector(Vector(70.0), Vector(71.0), Vector(72.0)), Vector(Vector(73.0), Vector(74.0)))), s0(Vector(Vector(75.0), Vector(76.0), Vector(77.0)), Vector(Vector(78.0), Vector(79.0)))), Vector(s1(Vector(s0(Vector(Vector(80.0), Vector(81.0), Vector(82.0)), Vector(Vector(83.0), Vector(84.0))), s0(Vector(Vector(85.0), Vector(86.0), Vector(87.0)), Vector(Vector(88.0), Vector(89.0))), s0(Vector(Vector(90.0), Vector(91.0), Vector(92.0)), Vector(Vector(93.0), Vector(94.0)))), s0(Vector(Vector(95.0), Vector(96.0), Vector(97.0)), Vector(Vector(98.0), Vector(99.0)))), s1(Vector(s0(Vector(Vector(100.0), Vector(101.0), Vector(102.0)), Vector(Vector(103.0), Vector(104.0))), s0(Vector(Vector(105.0), Vector(106.0), Vector(107.0)), Vector(Vector(108.0), Vector(109.0))), s0(Vector(Vector(110.0), Vector(111.0), Vector(112.0)), Vector(Vector(113.0), Vector(114.0)))), s0(Vector(Vector(115.0), Vector(116.0), Vector(117.0)), Vector(Vector(118.0), Vector(119.0)))))), s2(s1(Vector(s0(Vector(Vector(120.0), Vector(121.0), Vector(122.0)), Vector(Vector(123.0), Vector(124.0))), s0(Vector(Vector(125.0), Vector(126.0), Vector(127.0)), Vector(Vector(128.0), Vector(129.0))), s0(Vector(Vector(130.0), Vector(131.0), Vector(132.0)), Vector(Vector(133.0), Vector(134.0)))), s0(Vector(Vector(135.0), Vector(136.0), Vector(137.0)), Vector(Vector(138.0), Vector(139.0)))), Vector(s1(Vector(s0(Vector(Vector(140.0), Vector(141.0), Vector(142.0)), Vector(Vector(143.0), Vector(144.0))), s0(Vector(Vector(145.0), Vector(146.0), Vector(147.0)), Vector(Vector(148.0), Vector(149.0))), s0(Vector(Vector(150.0), Vector(151.0), Vector(152.0)), Vector(Vector(153.0), Vector(154.0)))), s0(Vector(Vector(155.0), Vector(156.0), Vector(157.0)), Vector(Vector(158.0), Vector(159.0)))), s1(Vector(s0(Vector(Vector(160.0), Vector(161.0), Vector(162.0)), Vector(Vector(163.0), Vector(164.0))), s0(Vector(Vector(165.0), Vector(166.0), Vector(167.0)), Vector(Vector(168.0), Vector(169.0))), s0(Vector(Vector(170.0), Vector(171.0), Vector(172.0)), Vector(Vector(173.0), Vector(174.0)))), s0(Vector(Vector(175.0), Vector(176.0), Vector(177.0)), Vector(Vector(178.0), Vector(179.0)))))))
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