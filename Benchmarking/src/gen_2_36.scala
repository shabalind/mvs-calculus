import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]],
    p3: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: s0
  )
  case class s3 (
    p0: Vector[s1],
    p1: Vector[Vector[s0]]
  )
  @noinline
  def f0(v0: s3, v1: s3, v2: Double): Double = {
    val v7: Vector[s1] = v0.p0
    val v4: s1 = v7(1)
    val v6: s0 = v4.p1
    val v5: s0 = v4.p1
    val v8: Vector[Vector[Double]] = v5.p0
    val v9: Vector[Vector[Double]] = v6.p1
    val v11: Vector[Vector[Vector[Double]]] = Vector(v9, v9, v9, v8, v8)
    val v41: Vector[Vector[Double]] = v11(4)
    val v29: Vector[Double] = v41(0)
    val v56: Double = v29(0)
    var v87: Double = v56
    val v116: Double = v87 - v2
    val v74: Double = v2 - v116
    val v83: Double = v74 - v116
    v83
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(Vector(s1(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0)), Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0)))), Vector(s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0)), Vector(Vector(16.0), Vector(17.0)))), Vector(s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0), Vector(24.0)), Vector(Vector(25.0), Vector(26.0))))), s0(Vector(Vector(27.0), Vector(28.0)), Vector(Vector(29.0), Vector(30.0)), Vector(Vector(31.0), Vector(32.0), Vector(33.0)), Vector(Vector(34.0), Vector(35.0)))), s1(Vector(Vector(s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0)), Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0), Vector(44.0)))), Vector(s0(Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0), Vector(48.0)), Vector(Vector(49.0), Vector(50.0), Vector(51.0)), Vector(Vector(52.0), Vector(53.0)))), Vector(s0(Vector(Vector(54.0), Vector(55.0)), Vector(Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0), Vector(60.0)), Vector(Vector(61.0), Vector(62.0))))), s0(Vector(Vector(63.0), Vector(64.0)), Vector(Vector(65.0), Vector(66.0)), Vector(Vector(67.0), Vector(68.0), Vector(69.0)), Vector(Vector(70.0), Vector(71.0))))), Vector(Vector(s0(Vector(Vector(72.0), Vector(73.0)), Vector(Vector(74.0), Vector(75.0)), Vector(Vector(76.0), Vector(77.0), Vector(78.0)), Vector(Vector(79.0), Vector(80.0))))))
    val v1: s3 = s3(Vector(s1(Vector(Vector(s0(Vector(Vector(81.0), Vector(82.0)), Vector(Vector(83.0), Vector(84.0)), Vector(Vector(85.0), Vector(86.0), Vector(87.0)), Vector(Vector(88.0), Vector(89.0)))), Vector(s0(Vector(Vector(90.0), Vector(91.0)), Vector(Vector(92.0), Vector(93.0)), Vector(Vector(94.0), Vector(95.0), Vector(96.0)), Vector(Vector(97.0), Vector(98.0)))), Vector(s0(Vector(Vector(99.0), Vector(100.0)), Vector(Vector(101.0), Vector(102.0)), Vector(Vector(103.0), Vector(104.0), Vector(105.0)), Vector(Vector(106.0), Vector(107.0))))), s0(Vector(Vector(108.0), Vector(109.0)), Vector(Vector(110.0), Vector(111.0)), Vector(Vector(112.0), Vector(113.0), Vector(114.0)), Vector(Vector(115.0), Vector(116.0)))), s1(Vector(Vector(s0(Vector(Vector(117.0), Vector(118.0)), Vector(Vector(119.0), Vector(120.0)), Vector(Vector(121.0), Vector(122.0), Vector(123.0)), Vector(Vector(124.0), Vector(125.0)))), Vector(s0(Vector(Vector(126.0), Vector(127.0)), Vector(Vector(128.0), Vector(129.0)), Vector(Vector(130.0), Vector(131.0), Vector(132.0)), Vector(Vector(133.0), Vector(134.0)))), Vector(s0(Vector(Vector(135.0), Vector(136.0)), Vector(Vector(137.0), Vector(138.0)), Vector(Vector(139.0), Vector(140.0), Vector(141.0)), Vector(Vector(142.0), Vector(143.0))))), s0(Vector(Vector(144.0), Vector(145.0)), Vector(Vector(146.0), Vector(147.0)), Vector(Vector(148.0), Vector(149.0), Vector(150.0)), Vector(Vector(151.0), Vector(152.0))))), Vector(Vector(s0(Vector(Vector(153.0), Vector(154.0)), Vector(Vector(155.0), Vector(156.0)), Vector(Vector(157.0), Vector(158.0), Vector(159.0)), Vector(Vector(160.0), Vector(161.0))))))
    val v2: Double = 162.0
    val start = nanoTime()
    var result: Double = 162.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}