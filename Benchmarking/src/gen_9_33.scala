import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]],
    p3: Vector[Vector[Double]]
  )
  case class s2 (
    p0: s0,
    p1: s0
  )
  case class s3 (
    p0: Vector[Vector[s2]],
    p1: s2
  )
  case class s6 (
    p0: s3,
    p1: Vector[s2]
  )
  @noinline
  def f0(v0: s6, v1: s3, v2: Double): Double = {
    val v8: s2 = v1.p1
    val v16: s0 = v8.p0
    val v24: Vector[Vector[Double]] = v16.p1
    var v31: Vector[Vector[Double]] = v24
    val v19: Vector[Double] = v24(0)
    v31 = v31.updated(0, v19)
    val v49: Vector[Double] = v31(0)
    val v78: Double = v49(0)
    val v75: Double = v19(0)
    val v38: Double = v75 * v78
    val v85: Double = v75 * v38
    v85
  }
  def benchmark(): Unit = {
    val v0: s6 = s6(s3(Vector(Vector(s2(s0(Vector(Vector(0.0)), Vector(Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0)), Vector(Vector(5.0), Vector(6.0))), s0(Vector(Vector(7.0)), Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0))))), Vector(s2(s0(Vector(Vector(14.0)), Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0), Vector(20.0))), s0(Vector(Vector(21.0)), Vector(Vector(22.0)), Vector(Vector(23.0), Vector(24.0), Vector(25.0)), Vector(Vector(26.0), Vector(27.0))))), Vector(s2(s0(Vector(Vector(28.0)), Vector(Vector(29.0)), Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0))), s0(Vector(Vector(35.0)), Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0)), Vector(Vector(40.0), Vector(41.0)))))), s2(s0(Vector(Vector(42.0)), Vector(Vector(43.0)), Vector(Vector(44.0), Vector(45.0), Vector(46.0)), Vector(Vector(47.0), Vector(48.0))), s0(Vector(Vector(49.0)), Vector(Vector(50.0)), Vector(Vector(51.0), Vector(52.0), Vector(53.0)), Vector(Vector(54.0), Vector(55.0))))), Vector(s2(s0(Vector(Vector(56.0)), Vector(Vector(57.0)), Vector(Vector(58.0), Vector(59.0), Vector(60.0)), Vector(Vector(61.0), Vector(62.0))), s0(Vector(Vector(63.0)), Vector(Vector(64.0)), Vector(Vector(65.0), Vector(66.0), Vector(67.0)), Vector(Vector(68.0), Vector(69.0)))), s2(s0(Vector(Vector(70.0)), Vector(Vector(71.0)), Vector(Vector(72.0), Vector(73.0), Vector(74.0)), Vector(Vector(75.0), Vector(76.0))), s0(Vector(Vector(77.0)), Vector(Vector(78.0)), Vector(Vector(79.0), Vector(80.0), Vector(81.0)), Vector(Vector(82.0), Vector(83.0)))), s2(s0(Vector(Vector(84.0)), Vector(Vector(85.0)), Vector(Vector(86.0), Vector(87.0), Vector(88.0)), Vector(Vector(89.0), Vector(90.0))), s0(Vector(Vector(91.0)), Vector(Vector(92.0)), Vector(Vector(93.0), Vector(94.0), Vector(95.0)), Vector(Vector(96.0), Vector(97.0))))))
    val v1: s3 = s3(Vector(Vector(s2(s0(Vector(Vector(98.0)), Vector(Vector(99.0)), Vector(Vector(100.0), Vector(101.0), Vector(102.0)), Vector(Vector(103.0), Vector(104.0))), s0(Vector(Vector(105.0)), Vector(Vector(106.0)), Vector(Vector(107.0), Vector(108.0), Vector(109.0)), Vector(Vector(110.0), Vector(111.0))))), Vector(s2(s0(Vector(Vector(112.0)), Vector(Vector(113.0)), Vector(Vector(114.0), Vector(115.0), Vector(116.0)), Vector(Vector(117.0), Vector(118.0))), s0(Vector(Vector(119.0)), Vector(Vector(120.0)), Vector(Vector(121.0), Vector(122.0), Vector(123.0)), Vector(Vector(124.0), Vector(125.0))))), Vector(s2(s0(Vector(Vector(126.0)), Vector(Vector(127.0)), Vector(Vector(128.0), Vector(129.0), Vector(130.0)), Vector(Vector(131.0), Vector(132.0))), s0(Vector(Vector(133.0)), Vector(Vector(134.0)), Vector(Vector(135.0), Vector(136.0), Vector(137.0)), Vector(Vector(138.0), Vector(139.0)))))), s2(s0(Vector(Vector(140.0)), Vector(Vector(141.0)), Vector(Vector(142.0), Vector(143.0), Vector(144.0)), Vector(Vector(145.0), Vector(146.0))), s0(Vector(Vector(147.0)), Vector(Vector(148.0)), Vector(Vector(149.0), Vector(150.0), Vector(151.0)), Vector(Vector(152.0), Vector(153.0)))))
    val v2: Double = 154.0
    val start = nanoTime()
    var result: Double = 154.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}