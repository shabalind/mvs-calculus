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
    p0: Vector[Vector[s0]],
    p1: s0
  )
  case class s3 (
    p0: s2,
    p1: s0
  )
  case class s4 (
    p0: s0
  )
  case class s5 (
    p0: s0,
    p1: s2
  )
  case class s6 (
    p0: s4,
    p1: Vector[s3]
  )
  case class s7 (
    p0: s6,
    p1: s6
  )
  case class s9 (
    p0: Vector[s7],
    p1: Vector[Vector[s5]]
  )
  case class s10 (
    p0: s5,
    p1: Vector[s1]
  )
  case class s12 (
    p0: Double,
    p1: Vector[Vector[s10]]
  )
  @noinline
  def f0(v0: Vector[Vector[s9]], v1: s12, v2: s12, v3: Double): Double = {
    val v5: Double = v2.p0
    val v7: Double = v2.p0
    val v24: Vector[Vector[s10]] = v1.p1
    val v14: Vector[Vector[s10]] = v2.p1
    val v9: s12 = s12(v7, v14)
    val v12: Vector[Double] = Vector(v5, v3, v5)
    val v20: Double = v9.p0
    var v25: s12 = v2
    v25 = v25.copy(p1 = v14)
    val v37: s12 = s12(v7, v24)
    var v86: s12 = v37
    v25 = v25.copy(p0 = v5)
    val v53: Double = v12(0)
    v25 = v25.copy(p0 = v53)
    v25 = v25.copy(p1 = v24)
    v25 = v25.copy(p0 = v20)
    val v79: Vector[Vector[s10]] = v86.p1
    val v186: Double = v25.p0
    v25 = v25.copy(p1 = v79)
    v186
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s9]] = Vector(Vector(s9(Vector(s7(s6(s4(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0)))), Vector(s3(s2(Vector(Vector(s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0))))), s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0)))), s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0)))))), s6(s4(s0(Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0)))), Vector(s3(s2(Vector(Vector(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0))))), s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0), Vector(27.0)))), s0(Vector(Vector(28.0), Vector(29.0)), Vector(Vector(30.0), Vector(31.0))))))), s7(s6(s4(s0(Vector(Vector(32.0), Vector(33.0)), Vector(Vector(34.0), Vector(35.0)))), Vector(s3(s2(Vector(Vector(s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0))))), s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0)))), s0(Vector(Vector(44.0), Vector(45.0)), Vector(Vector(46.0), Vector(47.0)))))), s6(s4(s0(Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0), Vector(51.0)))), Vector(s3(s2(Vector(Vector(s0(Vector(Vector(52.0), Vector(53.0)), Vector(Vector(54.0), Vector(55.0))))), s0(Vector(Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0)))), s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0), Vector(63.0)))))))), Vector(Vector(s5(s0(Vector(Vector(64.0), Vector(65.0)), Vector(Vector(66.0), Vector(67.0))), s2(Vector(Vector(s0(Vector(Vector(68.0), Vector(69.0)), Vector(Vector(70.0), Vector(71.0))))), s0(Vector(Vector(72.0), Vector(73.0)), Vector(Vector(74.0), Vector(75.0)))))), Vector(s5(s0(Vector(Vector(76.0), Vector(77.0)), Vector(Vector(78.0), Vector(79.0))), s2(Vector(Vector(s0(Vector(Vector(80.0), Vector(81.0)), Vector(Vector(82.0), Vector(83.0))))), s0(Vector(Vector(84.0), Vector(85.0)), Vector(Vector(86.0), Vector(87.0)))))), Vector(s5(s0(Vector(Vector(88.0), Vector(89.0)), Vector(Vector(90.0), Vector(91.0))), s2(Vector(Vector(s0(Vector(Vector(92.0), Vector(93.0)), Vector(Vector(94.0), Vector(95.0))))), s0(Vector(Vector(96.0), Vector(97.0)), Vector(Vector(98.0), Vector(99.0))))))))))
    val v1: s12 = s12(100.0, Vector(Vector(s10(s5(s0(Vector(Vector(101.0), Vector(102.0)), Vector(Vector(103.0), Vector(104.0))), s2(Vector(Vector(s0(Vector(Vector(105.0), Vector(106.0)), Vector(Vector(107.0), Vector(108.0))))), s0(Vector(Vector(109.0), Vector(110.0)), Vector(Vector(111.0), Vector(112.0))))), Vector(s1(s0(Vector(Vector(113.0), Vector(114.0)), Vector(Vector(115.0), Vector(116.0))), Vector(s0(Vector(Vector(117.0), Vector(118.0)), Vector(Vector(119.0), Vector(120.0))), s0(Vector(Vector(121.0), Vector(122.0)), Vector(Vector(123.0), Vector(124.0))), s0(Vector(Vector(125.0), Vector(126.0)), Vector(Vector(127.0), Vector(128.0))))))))))
    val v2: s12 = s12(129.0, Vector(Vector(s10(s5(s0(Vector(Vector(130.0), Vector(131.0)), Vector(Vector(132.0), Vector(133.0))), s2(Vector(Vector(s0(Vector(Vector(134.0), Vector(135.0)), Vector(Vector(136.0), Vector(137.0))))), s0(Vector(Vector(138.0), Vector(139.0)), Vector(Vector(140.0), Vector(141.0))))), Vector(s1(s0(Vector(Vector(142.0), Vector(143.0)), Vector(Vector(144.0), Vector(145.0))), Vector(s0(Vector(Vector(146.0), Vector(147.0)), Vector(Vector(148.0), Vector(149.0))), s0(Vector(Vector(150.0), Vector(151.0)), Vector(Vector(152.0), Vector(153.0))), s0(Vector(Vector(154.0), Vector(155.0)), Vector(Vector(156.0), Vector(157.0))))))))))
    val v3: Double = 158.0
    val start = nanoTime()
    var result: Double = 158.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}