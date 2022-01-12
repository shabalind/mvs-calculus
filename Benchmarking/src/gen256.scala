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
    p0: s0,
    p1: s0
  )
  case class s3 (
    p0: Double,
    p1: s2
  )
  case class s4 (
    p0: Vector[s2],
    p1: Vector[Vector[s0]],
    p2: s3,
    p3: s3,
    p4: s0,
    p5: s2,
    p6: s1
  )
  case class s5 (
    p0: s4,
    p1: s3
  )
  case class s6 (
    p0: s4,
    p1: s4
  )
  case class s7 (
    p0: s6,
    p1: s5,
    p2: s0,
    p3: s3
  )
  def f83(v0: s3): s3 = {
    var v2: s3 = v0
    val v12: s2 = v0.p1
    var v5: s3 = v2
    v5 = v5.copy(p1 = v12)
    val v11: s0 = v12.p0
    val v30: s0 = v12.p0
    v2 = v2.copy(p1 = v12)
    v2 = v2.copy(p1 = v12)
    var v22: s0 = v11
    val v66: Vector[Double] = v22.p0
    var v17: Vector[Double] = v66
    val v20: Double = v17(0)
    v22 = v22.copy(p0 = v66)
    v5 = v5.copy(p0 = v20)
    val v71: s2 = v5.p1
    v22 = v30
    v2 = v2.copy(p1 = v71)
    v2
  }
  @noinline
  def f0(v0: Vector[s7], v1: Vector[Vector[s3]], v2: Vector[s1], v3: Double): Double = {
    var v5: Double = v3
    val v25: Double = v5 - v5
    var v19: Double = v5
    var v21: Vector[s7] = v0
    var v18: Vector[s7] = v21
    val v46: Double = v3 / v19
    v19 = v3
    val v17: s7 = v18(0)
    val v26: s3 = v17.p3
    val v30: s3 = f83(v26)
    v18 = v21
    val v32: Double = v30.p0
    var v47: Double = v32
    v21 = v21.updated(0, v17)
    val v43: Vector[Double] = Vector(v25, v46, v47, v3, v19)
    val v49: s7 = v0(0)
    val v93: Double = v43(1)
    v18 = v18.updated(0, v49)
    v93
  }
  def benchmark(): Unit = {
    val v0: Vector[s7] = Vector(s7(s6(s4(Vector(s2(s0(Vector(0.0, 1.0), Vector(Vector(2.0))), s0(Vector(3.0, 4.0), Vector(Vector(5.0))))), Vector(Vector(s0(Vector(6.0, 7.0), Vector(Vector(8.0))))), s3(9.0, s2(s0(Vector(10.0, 11.0), Vector(Vector(12.0))), s0(Vector(13.0, 14.0), Vector(Vector(15.0))))), s3(16.0, s2(s0(Vector(17.0, 18.0), Vector(Vector(19.0))), s0(Vector(20.0, 21.0), Vector(Vector(22.0))))), s0(Vector(23.0, 24.0), Vector(Vector(25.0))), s2(s0(Vector(26.0, 27.0), Vector(Vector(28.0))), s0(Vector(29.0, 30.0), Vector(Vector(31.0)))), s1(s0(Vector(32.0, 33.0), Vector(Vector(34.0))), s0(Vector(35.0, 36.0), Vector(Vector(37.0))))), s4(Vector(s2(s0(Vector(38.0, 39.0), Vector(Vector(40.0))), s0(Vector(41.0, 42.0), Vector(Vector(43.0))))), Vector(Vector(s0(Vector(44.0, 45.0), Vector(Vector(46.0))))), s3(47.0, s2(s0(Vector(48.0, 49.0), Vector(Vector(50.0))), s0(Vector(51.0, 52.0), Vector(Vector(53.0))))), s3(54.0, s2(s0(Vector(55.0, 56.0), Vector(Vector(57.0))), s0(Vector(58.0, 59.0), Vector(Vector(60.0))))), s0(Vector(61.0, 62.0), Vector(Vector(63.0))), s2(s0(Vector(64.0, 65.0), Vector(Vector(66.0))), s0(Vector(67.0, 68.0), Vector(Vector(69.0)))), s1(s0(Vector(70.0, 71.0), Vector(Vector(72.0))), s0(Vector(73.0, 74.0), Vector(Vector(75.0)))))), s5(s4(Vector(s2(s0(Vector(76.0, 77.0), Vector(Vector(78.0))), s0(Vector(79.0, 80.0), Vector(Vector(81.0))))), Vector(Vector(s0(Vector(82.0, 83.0), Vector(Vector(84.0))))), s3(85.0, s2(s0(Vector(86.0, 87.0), Vector(Vector(88.0))), s0(Vector(89.0, 90.0), Vector(Vector(91.0))))), s3(92.0, s2(s0(Vector(93.0, 94.0), Vector(Vector(95.0))), s0(Vector(96.0, 97.0), Vector(Vector(98.0))))), s0(Vector(99.0, 100.0), Vector(Vector(101.0))), s2(s0(Vector(102.0, 103.0), Vector(Vector(104.0))), s0(Vector(105.0, 106.0), Vector(Vector(107.0)))), s1(s0(Vector(108.0, 109.0), Vector(Vector(110.0))), s0(Vector(111.0, 112.0), Vector(Vector(113.0))))), s3(114.0, s2(s0(Vector(115.0, 116.0), Vector(Vector(117.0))), s0(Vector(118.0, 119.0), Vector(Vector(120.0)))))), s0(Vector(121.0, 122.0), Vector(Vector(123.0))), s3(124.0, s2(s0(Vector(125.0, 126.0), Vector(Vector(127.0))), s0(Vector(128.0, 129.0), Vector(Vector(130.0)))))))
    val v1: Vector[Vector[s3]] = Vector(Vector(s3(131.0, s2(s0(Vector(132.0, 133.0), Vector(Vector(134.0))), s0(Vector(135.0, 136.0), Vector(Vector(137.0)))))), Vector(s3(138.0, s2(s0(Vector(139.0, 140.0), Vector(Vector(141.0))), s0(Vector(142.0, 143.0), Vector(Vector(144.0)))))))
    val v2: Vector[s1] = Vector(s1(s0(Vector(145.0, 146.0), Vector(Vector(147.0))), s0(Vector(148.0, 149.0), Vector(Vector(150.0)))))
    val v3: Double = 151.0
    val start = nanoTime()
    var result: Double = 151.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}