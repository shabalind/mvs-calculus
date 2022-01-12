import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Double]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  case class s2 (
    p0: Vector[Vector[s1]],
    p1: Vector[s1],
    p2: Double,
    p3: Vector[s1]
  )
  case class s3 (
    p0: Vector[Vector[s0]],
    p1: s0
  )
  case class s4 (
    p0: Vector[Vector[s1]],
    p1: Vector[s3]
  )
  case class s5 (
    p0: Vector[s1],
    p1: Vector[s0]
  )
  case class s7 (
    p0: Vector[s1],
    p1: s4,
    p2: Vector[Vector[s5]]
  )
  @noinline
  def f0(v0: Vector[s5], v1: Vector[Double], v2: Vector[s3], v3: s2, v4: s2, v5: Vector[s7], v6: Double): Double = {
    val v8: s3 = v2(0)
    var v12: s3 = v8
    val v16: Vector[Vector[s0]] = v12.p0
    v12 = v12.copy(p0 = v16)
    val v13: s0 = v12.p1
    var v25: Vector[Vector[s0]] = v16
    val v61: Vector[Double] = v13.p1
    val v37: s0 = v12.p1
    val v69: Vector[s0] = v16(0)
    val v34: Double = v61(0)
    v25 = v25.updated(0, v69)
    v12 = v12.copy(p1 = v37)
    v12 = v12.copy(p0 = v25)
    v34
  }
  def benchmark(): Unit = {
    val v0: Vector[s5] = Vector(s5(Vector(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(2.0))), s0(Vector(Vector(3.0), Vector(4.0)), Vector(5.0)))), Vector(s0(Vector(Vector(6.0), Vector(7.0)), Vector(8.0)), s0(Vector(Vector(9.0), Vector(10.0)), Vector(11.0)), s0(Vector(Vector(12.0), Vector(13.0)), Vector(14.0)))), s5(Vector(s1(Vector(s0(Vector(Vector(15.0), Vector(16.0)), Vector(17.0))), s0(Vector(Vector(18.0), Vector(19.0)), Vector(20.0)))), Vector(s0(Vector(Vector(21.0), Vector(22.0)), Vector(23.0)), s0(Vector(Vector(24.0), Vector(25.0)), Vector(26.0)), s0(Vector(Vector(27.0), Vector(28.0)), Vector(29.0)))), s5(Vector(s1(Vector(s0(Vector(Vector(30.0), Vector(31.0)), Vector(32.0))), s0(Vector(Vector(33.0), Vector(34.0)), Vector(35.0)))), Vector(s0(Vector(Vector(36.0), Vector(37.0)), Vector(38.0)), s0(Vector(Vector(39.0), Vector(40.0)), Vector(41.0)), s0(Vector(Vector(42.0), Vector(43.0)), Vector(44.0)))))
    val v1: Vector[Double] = Vector(45.0, 46.0, 47.0)
    val v2: Vector[s3] = Vector(s3(Vector(Vector(s0(Vector(Vector(48.0), Vector(49.0)), Vector(50.0)))), s0(Vector(Vector(51.0), Vector(52.0)), Vector(53.0))), s3(Vector(Vector(s0(Vector(Vector(54.0), Vector(55.0)), Vector(56.0)))), s0(Vector(Vector(57.0), Vector(58.0)), Vector(59.0))), s3(Vector(Vector(s0(Vector(Vector(60.0), Vector(61.0)), Vector(62.0)))), s0(Vector(Vector(63.0), Vector(64.0)), Vector(65.0))))
    val v3: s2 = s2(Vector(Vector(s1(Vector(s0(Vector(Vector(66.0), Vector(67.0)), Vector(68.0))), s0(Vector(Vector(69.0), Vector(70.0)), Vector(71.0))))), Vector(s1(Vector(s0(Vector(Vector(72.0), Vector(73.0)), Vector(74.0))), s0(Vector(Vector(75.0), Vector(76.0)), Vector(77.0))), s1(Vector(s0(Vector(Vector(78.0), Vector(79.0)), Vector(80.0))), s0(Vector(Vector(81.0), Vector(82.0)), Vector(83.0))), s1(Vector(s0(Vector(Vector(84.0), Vector(85.0)), Vector(86.0))), s0(Vector(Vector(87.0), Vector(88.0)), Vector(89.0)))), 90.0, Vector(s1(Vector(s0(Vector(Vector(91.0), Vector(92.0)), Vector(93.0))), s0(Vector(Vector(94.0), Vector(95.0)), Vector(96.0)))))
    val v4: s2 = s2(Vector(Vector(s1(Vector(s0(Vector(Vector(97.0), Vector(98.0)), Vector(99.0))), s0(Vector(Vector(100.0), Vector(101.0)), Vector(102.0))))), Vector(s1(Vector(s0(Vector(Vector(103.0), Vector(104.0)), Vector(105.0))), s0(Vector(Vector(106.0), Vector(107.0)), Vector(108.0))), s1(Vector(s0(Vector(Vector(109.0), Vector(110.0)), Vector(111.0))), s0(Vector(Vector(112.0), Vector(113.0)), Vector(114.0))), s1(Vector(s0(Vector(Vector(115.0), Vector(116.0)), Vector(117.0))), s0(Vector(Vector(118.0), Vector(119.0)), Vector(120.0)))), 121.0, Vector(s1(Vector(s0(Vector(Vector(122.0), Vector(123.0)), Vector(124.0))), s0(Vector(Vector(125.0), Vector(126.0)), Vector(127.0)))))
    val v5: Vector[s7] = Vector(s7(Vector(s1(Vector(s0(Vector(Vector(128.0), Vector(129.0)), Vector(130.0))), s0(Vector(Vector(131.0), Vector(132.0)), Vector(133.0)))), s4(Vector(Vector(s1(Vector(s0(Vector(Vector(134.0), Vector(135.0)), Vector(136.0))), s0(Vector(Vector(137.0), Vector(138.0)), Vector(139.0))))), Vector(s3(Vector(Vector(s0(Vector(Vector(140.0), Vector(141.0)), Vector(142.0)))), s0(Vector(Vector(143.0), Vector(144.0)), Vector(145.0))), s3(Vector(Vector(s0(Vector(Vector(146.0), Vector(147.0)), Vector(148.0)))), s0(Vector(Vector(149.0), Vector(150.0)), Vector(151.0))))), Vector(Vector(s5(Vector(s1(Vector(s0(Vector(Vector(152.0), Vector(153.0)), Vector(154.0))), s0(Vector(Vector(155.0), Vector(156.0)), Vector(157.0)))), Vector(s0(Vector(Vector(158.0), Vector(159.0)), Vector(160.0)), s0(Vector(Vector(161.0), Vector(162.0)), Vector(163.0)), s0(Vector(Vector(164.0), Vector(165.0)), Vector(166.0))))))))
    val v6: Double = 167.0
    val start = nanoTime()
    var result: Double = 167.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4, v5, v6)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}