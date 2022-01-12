import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Double]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: Vector[Vector[s1]],
    p1: Vector[s0]
  )
  case class s3 (
    p0: s1,
    p1: s0
  )
  case class s6 (
    p0: Vector[s3],
    p1: s2
  )
  @noinline
  def f0(v0: Vector[s6], v1: Double): Double = {
    val v7: s6 = v0(0)
    val v8: Vector[s3] = v7.p0
    var v6: s6 = v7
    v6 = v6.copy(p0 = v8)
    val v15: Vector[s3] = v6.p0
    val v13: s2 = v7.p1
    val v10: Vector[s3] = v6.p0
    v6 = v6.copy(p0 = v15)
    v6 = v6.copy(p1 = v13)
    val v41: s3 = v10(1)
    val v35: s1 = v41.p0
    val v30: s0 = v35.p1
    val v27: Vector[Double] = v30.p1
    val v46: Double = v27(0)
    v46
  }
  def benchmark(): Unit = {
    val v0: Vector[s6] = Vector(s6(Vector(s3(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(2.0, 3.0)), s0(Vector(Vector(4.0), Vector(5.0)), Vector(6.0, 7.0))), s0(Vector(Vector(8.0), Vector(9.0)), Vector(10.0, 11.0))), s3(s1(s0(Vector(Vector(12.0), Vector(13.0)), Vector(14.0, 15.0)), s0(Vector(Vector(16.0), Vector(17.0)), Vector(18.0, 19.0))), s0(Vector(Vector(20.0), Vector(21.0)), Vector(22.0, 23.0))), s3(s1(s0(Vector(Vector(24.0), Vector(25.0)), Vector(26.0, 27.0)), s0(Vector(Vector(28.0), Vector(29.0)), Vector(30.0, 31.0))), s0(Vector(Vector(32.0), Vector(33.0)), Vector(34.0, 35.0)))), s2(Vector(Vector(s1(s0(Vector(Vector(36.0), Vector(37.0)), Vector(38.0, 39.0)), s0(Vector(Vector(40.0), Vector(41.0)), Vector(42.0, 43.0)))), Vector(s1(s0(Vector(Vector(44.0), Vector(45.0)), Vector(46.0, 47.0)), s0(Vector(Vector(48.0), Vector(49.0)), Vector(50.0, 51.0))))), Vector(s0(Vector(Vector(52.0), Vector(53.0)), Vector(54.0, 55.0)), s0(Vector(Vector(56.0), Vector(57.0)), Vector(58.0, 59.0))))), s6(Vector(s3(s1(s0(Vector(Vector(60.0), Vector(61.0)), Vector(62.0, 63.0)), s0(Vector(Vector(64.0), Vector(65.0)), Vector(66.0, 67.0))), s0(Vector(Vector(68.0), Vector(69.0)), Vector(70.0, 71.0))), s3(s1(s0(Vector(Vector(72.0), Vector(73.0)), Vector(74.0, 75.0)), s0(Vector(Vector(76.0), Vector(77.0)), Vector(78.0, 79.0))), s0(Vector(Vector(80.0), Vector(81.0)), Vector(82.0, 83.0))), s3(s1(s0(Vector(Vector(84.0), Vector(85.0)), Vector(86.0, 87.0)), s0(Vector(Vector(88.0), Vector(89.0)), Vector(90.0, 91.0))), s0(Vector(Vector(92.0), Vector(93.0)), Vector(94.0, 95.0)))), s2(Vector(Vector(s1(s0(Vector(Vector(96.0), Vector(97.0)), Vector(98.0, 99.0)), s0(Vector(Vector(100.0), Vector(101.0)), Vector(102.0, 103.0)))), Vector(s1(s0(Vector(Vector(104.0), Vector(105.0)), Vector(106.0, 107.0)), s0(Vector(Vector(108.0), Vector(109.0)), Vector(110.0, 111.0))))), Vector(s0(Vector(Vector(112.0), Vector(113.0)), Vector(114.0, 115.0)), s0(Vector(Vector(116.0), Vector(117.0)), Vector(118.0, 119.0))))), s6(Vector(s3(s1(s0(Vector(Vector(120.0), Vector(121.0)), Vector(122.0, 123.0)), s0(Vector(Vector(124.0), Vector(125.0)), Vector(126.0, 127.0))), s0(Vector(Vector(128.0), Vector(129.0)), Vector(130.0, 131.0))), s3(s1(s0(Vector(Vector(132.0), Vector(133.0)), Vector(134.0, 135.0)), s0(Vector(Vector(136.0), Vector(137.0)), Vector(138.0, 139.0))), s0(Vector(Vector(140.0), Vector(141.0)), Vector(142.0, 143.0))), s3(s1(s0(Vector(Vector(144.0), Vector(145.0)), Vector(146.0, 147.0)), s0(Vector(Vector(148.0), Vector(149.0)), Vector(150.0, 151.0))), s0(Vector(Vector(152.0), Vector(153.0)), Vector(154.0, 155.0)))), s2(Vector(Vector(s1(s0(Vector(Vector(156.0), Vector(157.0)), Vector(158.0, 159.0)), s0(Vector(Vector(160.0), Vector(161.0)), Vector(162.0, 163.0)))), Vector(s1(s0(Vector(Vector(164.0), Vector(165.0)), Vector(166.0, 167.0)), s0(Vector(Vector(168.0), Vector(169.0)), Vector(170.0, 171.0))))), Vector(s0(Vector(Vector(172.0), Vector(173.0)), Vector(174.0, 175.0)), s0(Vector(Vector(176.0), Vector(177.0)), Vector(178.0, 179.0))))))
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