import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Double],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[Vector[s0]],
    p2: s0,
    p3: Vector[s0],
    p4: Vector[Vector[s0]],
    p5: Vector[Vector[s0]]
  )
  case class s2 (
    p0: s1,
    p1: s0
  )
  def f51(v0: Vector[Double]): Vector[Double] = {
    var v5: Vector[Double] = v0
    val v1: Double = v0(0)
    var v7: Double = v1
    var v2: Vector[Double] = v5
    var v23: Vector[Double] = v2
    var v17: Vector[Double] = v0
    val v13: Double = v23(0)
    var v15: Double = v7
    var v22: Vector[Double] = v2
    val v47: Double = v23(1)
    v5 = v5.updated(1, v15)
    var v27: Vector[Double] = v22
    var v70: Vector[Double] = v0
    v22 = v22.updated(0, v13)
    var v33: Double = v47
    v5 = v70
    v5 = v5.updated(1, v33)
    v5 = v17
    v22 = v22.updated(1, v15)
    v27
  }
  def f48(v0: s0, v1: s0): s0 = {
    v1
  }
  def f31(v0: Vector[Vector[Double]], v1: s0): Vector[Vector[Double]] = {
    val v6: Vector[Vector[Double]] = v1.p1
    val v19: Vector[Double] = v1.p0
    val v17: s0 = s0(v19, v6)
    val v14: s0 = f48(v17, v17)
    val v22: Vector[Vector[Double]] = v14.p1
    v22
  }
  def f22(v0: s0): s0 = {
    val v2: Vector[Vector[Double]] = v0.p1
    val v4: Vector[Double] = v2(2)
    var v9: s0 = v0
    var v7: Vector[Vector[Double]] = v2
    var v6: Vector[Vector[Double]] = v7
    val v3: Vector[Vector[Double]] = f31(v7, v0)
    val v1: s0 = f48(v0, v0)
    val v13: Vector[Double] = v9.p0
    val v17: s0 = s0(v13, v6)
    v6 = v6.updated(0, v4)
    val v27: Vector[Double] = f51(v13)
    v7 = v7.updated(0, v4)
    val v11: Vector[Double] = v9.p0
    val v14: s0 = f48(v9, v1)
    val v24: Vector[Double] = f51(v11)
    var v29: Vector[Double] = v27
    var v40: Vector[Double] = v24
    v9 = v9.copy(p1 = v3)
    v9 = v9.copy(p0 = v40)
    v9 = v9.copy(p1 = v6)
    val v46: Vector[Vector[Double]] = v14.p1
    v9 = v9.copy(p0 = v29)
    v6 = v46
    val v30: s0 = f48(v9, v17)
    v30
  }
  @noinline
  def f0(v0: Vector[s2], v1: Double): Double = {
    var v2: Vector[s2] = v0
    val v6: s2 = v2(2)
    val v10: s1 = v6.p0
    val v13: Vector[Vector[s0]] = v10.p5
    val v23: s2 = v2(0)
    val v12: s1 = v23.p0
    val v18: Vector[s0] = v13(0)
    val v24: Vector[Vector[s0]] = v12.p4
    var v29: Vector[Vector[s0]] = v24
    val v27: Vector[s0] = v29(1)
    v2 = v2.updated(1, v23)
    v29 = v29.updated(1, v18)
    val v73: s0 = v27(0)
    val v59: Vector[s0] = v13(0)
    val v123: s0 = f22(v73)
    v29 = v29.updated(1, v59)
    val v248: Vector[Vector[Double]] = v123.p1
    val v126: Vector[Double] = v248(2)
    val v214: Double = v126(0)
    v214
  }
  def benchmark(): Unit = {
    val v0: Vector[s2] = Vector(s2(s1(Vector(s0(Vector(0.0, 1.0), Vector(Vector(2.0), Vector(3.0), Vector(4.0))), s0(Vector(5.0, 6.0), Vector(Vector(7.0), Vector(8.0), Vector(9.0)))), Vector(Vector(s0(Vector(10.0, 11.0), Vector(Vector(12.0), Vector(13.0), Vector(14.0))))), s0(Vector(15.0, 16.0), Vector(Vector(17.0), Vector(18.0), Vector(19.0))), Vector(s0(Vector(20.0, 21.0), Vector(Vector(22.0), Vector(23.0), Vector(24.0))), s0(Vector(25.0, 26.0), Vector(Vector(27.0), Vector(28.0), Vector(29.0))), s0(Vector(30.0, 31.0), Vector(Vector(32.0), Vector(33.0), Vector(34.0)))), Vector(Vector(s0(Vector(35.0, 36.0), Vector(Vector(37.0), Vector(38.0), Vector(39.0)))), Vector(s0(Vector(40.0, 41.0), Vector(Vector(42.0), Vector(43.0), Vector(44.0))))), Vector(Vector(s0(Vector(45.0, 46.0), Vector(Vector(47.0), Vector(48.0), Vector(49.0)))))), s0(Vector(50.0, 51.0), Vector(Vector(52.0), Vector(53.0), Vector(54.0)))), s2(s1(Vector(s0(Vector(55.0, 56.0), Vector(Vector(57.0), Vector(58.0), Vector(59.0))), s0(Vector(60.0, 61.0), Vector(Vector(62.0), Vector(63.0), Vector(64.0)))), Vector(Vector(s0(Vector(65.0, 66.0), Vector(Vector(67.0), Vector(68.0), Vector(69.0))))), s0(Vector(70.0, 71.0), Vector(Vector(72.0), Vector(73.0), Vector(74.0))), Vector(s0(Vector(75.0, 76.0), Vector(Vector(77.0), Vector(78.0), Vector(79.0))), s0(Vector(80.0, 81.0), Vector(Vector(82.0), Vector(83.0), Vector(84.0))), s0(Vector(85.0, 86.0), Vector(Vector(87.0), Vector(88.0), Vector(89.0)))), Vector(Vector(s0(Vector(90.0, 91.0), Vector(Vector(92.0), Vector(93.0), Vector(94.0)))), Vector(s0(Vector(95.0, 96.0), Vector(Vector(97.0), Vector(98.0), Vector(99.0))))), Vector(Vector(s0(Vector(100.0, 101.0), Vector(Vector(102.0), Vector(103.0), Vector(104.0)))))), s0(Vector(105.0, 106.0), Vector(Vector(107.0), Vector(108.0), Vector(109.0)))), s2(s1(Vector(s0(Vector(110.0, 111.0), Vector(Vector(112.0), Vector(113.0), Vector(114.0))), s0(Vector(115.0, 116.0), Vector(Vector(117.0), Vector(118.0), Vector(119.0)))), Vector(Vector(s0(Vector(120.0, 121.0), Vector(Vector(122.0), Vector(123.0), Vector(124.0))))), s0(Vector(125.0, 126.0), Vector(Vector(127.0), Vector(128.0), Vector(129.0))), Vector(s0(Vector(130.0, 131.0), Vector(Vector(132.0), Vector(133.0), Vector(134.0))), s0(Vector(135.0, 136.0), Vector(Vector(137.0), Vector(138.0), Vector(139.0))), s0(Vector(140.0, 141.0), Vector(Vector(142.0), Vector(143.0), Vector(144.0)))), Vector(Vector(s0(Vector(145.0, 146.0), Vector(Vector(147.0), Vector(148.0), Vector(149.0)))), Vector(s0(Vector(150.0, 151.0), Vector(Vector(152.0), Vector(153.0), Vector(154.0))))), Vector(Vector(s0(Vector(155.0, 156.0), Vector(Vector(157.0), Vector(158.0), Vector(159.0)))))), s0(Vector(160.0, 161.0), Vector(Vector(162.0), Vector(163.0), Vector(164.0)))))
    val v1: Double = 165.0
    val start = nanoTime()
    var result: Double = 165.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}