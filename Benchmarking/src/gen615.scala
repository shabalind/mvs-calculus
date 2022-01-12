import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  case class s2 (
    p0: s0,
    p1: Vector[Double]
  )
  case class s4 (
    p0: Vector[s2],
    p1: s2
  )
  case class s7 (
    p0: s0,
    p1: Vector[s4]
  )
  case class s8 (
    p0: s7,
    p1: s1
  )
  case class s10 (
    p0: Vector[s1],
    p1: s0
  )
  case class s11 (
    p0: Vector[s10],
    p1: s0
  )
  def f57(v0: Double): Double = {
    val v6: Vector[Double] = Vector(v0, v0, v0, v0)
    var v3: Vector[Double] = v6
    v3 = v6
    val v5: Double = v0 + v0
    var v4: Double = v5
    val v9: Double = v3(1)
    var v7: Double = v4
    val v1: Double = v3(0)
    v4 = v5
    v3 = v3.updated(2, v4)
    var v23: Double = v7
    val v11: Double = v9 * v1
    var v22: Double = v1
    var v8: Vector[Double] = v6
    val v10: Double = v0 / v23
    val v14: Double = v8(1)
    var v19: Double = v4
    var v21: Double = v10
    v22 = v19
    var v38: Double = v11
    val v32: Vector[Double] = Vector(v5, v4)
    var v51: Vector[Double] = v32
    v8 = v8.updated(0, v22)
    var v24: Vector[Double] = v51
    val v41: Double = v32(0)
    val v37: Double = v32(0)
    val v55: Vector[Double] = Vector(v0, v21, v41)
    var v73: Vector[Double] = v32
    var v31: Vector[Double] = v55
    var v46: Vector[Double] = v51
    v24 = v24.updated(0, v37)
    val v147: Vector[Vector[Double]] = Vector(v46, v73, v24, v73)
    val v84: Vector[Double] = v147(1)
    var v74: Vector[Vector[Double]] = v147
    var v63: Double = v38
    var v61: Vector[Double] = v55
    val v54: Vector[Double] = v74(3)
    v51 = v51.updated(1, v63)
    val v103: Double = v54(0)
    v46 = v46.updated(0, v14)
    val v80: Double = v61(0)
    v19 = v37
    val v151: Double = v8(0)
    val v133: Double = v31(2)
    val v93: Double = v80 / v103
    v73 = v84
    v46 = v46.updated(1, v37)
    v8 = v8.updated(2, v151)
    v4 = v133
    v93
  }
  @noinline
  def f0(v0: Vector[Vector[s8]], v1: s11, v2: s1, v3: Double): Double = {
    var v11: Double = v3
    var v18: Double = v11
    val v25: Double = f57(v18)
    v25
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s8]] = Vector(Vector(s8(s7(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0))), Vector(s4(Vector(s2(s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0))), Vector(10.0, 11.0))), s2(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0))), Vector(17.0, 18.0))), s4(Vector(s2(s0(Vector(Vector(19.0), Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0))), Vector(24.0, 25.0))), s2(s0(Vector(Vector(26.0), Vector(27.0), Vector(28.0)), Vector(Vector(29.0), Vector(30.0))), Vector(31.0, 32.0))), s4(Vector(s2(s0(Vector(Vector(33.0), Vector(34.0), Vector(35.0)), Vector(Vector(36.0), Vector(37.0))), Vector(38.0, 39.0))), s2(s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0), Vector(44.0))), Vector(45.0, 46.0))))), s1(Vector(s0(Vector(Vector(47.0), Vector(48.0), Vector(49.0)), Vector(Vector(50.0), Vector(51.0)))), Vector(s0(Vector(Vector(52.0), Vector(53.0), Vector(54.0)), Vector(Vector(55.0), Vector(56.0))))))))
    val v1: s11 = s11(Vector(s10(Vector(s1(Vector(s0(Vector(Vector(57.0), Vector(58.0), Vector(59.0)), Vector(Vector(60.0), Vector(61.0)))), Vector(s0(Vector(Vector(62.0), Vector(63.0), Vector(64.0)), Vector(Vector(65.0), Vector(66.0))))), s1(Vector(s0(Vector(Vector(67.0), Vector(68.0), Vector(69.0)), Vector(Vector(70.0), Vector(71.0)))), Vector(s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)), Vector(Vector(75.0), Vector(76.0)))))), s0(Vector(Vector(77.0), Vector(78.0), Vector(79.0)), Vector(Vector(80.0), Vector(81.0)))), s10(Vector(s1(Vector(s0(Vector(Vector(82.0), Vector(83.0), Vector(84.0)), Vector(Vector(85.0), Vector(86.0)))), Vector(s0(Vector(Vector(87.0), Vector(88.0), Vector(89.0)), Vector(Vector(90.0), Vector(91.0))))), s1(Vector(s0(Vector(Vector(92.0), Vector(93.0), Vector(94.0)), Vector(Vector(95.0), Vector(96.0)))), Vector(s0(Vector(Vector(97.0), Vector(98.0), Vector(99.0)), Vector(Vector(100.0), Vector(101.0)))))), s0(Vector(Vector(102.0), Vector(103.0), Vector(104.0)), Vector(Vector(105.0), Vector(106.0)))), s10(Vector(s1(Vector(s0(Vector(Vector(107.0), Vector(108.0), Vector(109.0)), Vector(Vector(110.0), Vector(111.0)))), Vector(s0(Vector(Vector(112.0), Vector(113.0), Vector(114.0)), Vector(Vector(115.0), Vector(116.0))))), s1(Vector(s0(Vector(Vector(117.0), Vector(118.0), Vector(119.0)), Vector(Vector(120.0), Vector(121.0)))), Vector(s0(Vector(Vector(122.0), Vector(123.0), Vector(124.0)), Vector(Vector(125.0), Vector(126.0)))))), s0(Vector(Vector(127.0), Vector(128.0), Vector(129.0)), Vector(Vector(130.0), Vector(131.0))))), s0(Vector(Vector(132.0), Vector(133.0), Vector(134.0)), Vector(Vector(135.0), Vector(136.0))))
    val v2: s1 = s1(Vector(s0(Vector(Vector(137.0), Vector(138.0), Vector(139.0)), Vector(Vector(140.0), Vector(141.0)))), Vector(s0(Vector(Vector(142.0), Vector(143.0), Vector(144.0)), Vector(Vector(145.0), Vector(146.0)))))
    val v3: Double = 147.0
    val start = nanoTime()
    var result: Double = 147.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}