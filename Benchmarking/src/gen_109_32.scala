import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Double
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: Double
  )
  case class s2 (
    p0: Double,
    p1: Vector[Vector[s1]]
  )
  case class s3 (
    p0: s0,
    p1: Vector[s1]
  )
  case class s6 (
    p0: Vector[s2],
    p1: Vector[s3]
  )
  @noinline
  def f0(v0: Vector[s6], v1: Double): Double = {
    val v8: s6 = v0(1)
    val v6: s6 = v0(2)
    val v4: Vector[s2] = v6.p0
    val v7: Vector[s3] = v8.p1
    val v10: s2 = v4(0)
    var v5: Vector[s3] = v7
    val v17: s3 = v5(0)
    v5 = v5.updated(2, v17)
    val v21: s0 = v17.p0
    val v22: Double = v10.p0
    val v33: Double = v21.p1
    val v44: Double = v22 - v33
    v44
  }
  def benchmark(): Unit = {
    val v0: Vector[s6] = Vector(s6(Vector(s2(0.0, Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(1.0), Vector(2.0), Vector(3.0)), 4.0))), 5.0)), Vector(s1(Vector(Vector(s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), 9.0))), 10.0))))), Vector(s3(s0(Vector(Vector(11.0), Vector(12.0), Vector(13.0)), 14.0), Vector(s1(Vector(Vector(s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), 18.0))), 19.0), s1(Vector(Vector(s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), 23.0))), 24.0))), s3(s0(Vector(Vector(25.0), Vector(26.0), Vector(27.0)), 28.0), Vector(s1(Vector(Vector(s0(Vector(Vector(29.0), Vector(30.0), Vector(31.0)), 32.0))), 33.0), s1(Vector(Vector(s0(Vector(Vector(34.0), Vector(35.0), Vector(36.0)), 37.0))), 38.0))), s3(s0(Vector(Vector(39.0), Vector(40.0), Vector(41.0)), 42.0), Vector(s1(Vector(Vector(s0(Vector(Vector(43.0), Vector(44.0), Vector(45.0)), 46.0))), 47.0), s1(Vector(Vector(s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), 51.0))), 52.0))))), s6(Vector(s2(53.0, Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(54.0), Vector(55.0), Vector(56.0)), 57.0))), 58.0)), Vector(s1(Vector(Vector(s0(Vector(Vector(59.0), Vector(60.0), Vector(61.0)), 62.0))), 63.0))))), Vector(s3(s0(Vector(Vector(64.0), Vector(65.0), Vector(66.0)), 67.0), Vector(s1(Vector(Vector(s0(Vector(Vector(68.0), Vector(69.0), Vector(70.0)), 71.0))), 72.0), s1(Vector(Vector(s0(Vector(Vector(73.0), Vector(74.0), Vector(75.0)), 76.0))), 77.0))), s3(s0(Vector(Vector(78.0), Vector(79.0), Vector(80.0)), 81.0), Vector(s1(Vector(Vector(s0(Vector(Vector(82.0), Vector(83.0), Vector(84.0)), 85.0))), 86.0), s1(Vector(Vector(s0(Vector(Vector(87.0), Vector(88.0), Vector(89.0)), 90.0))), 91.0))), s3(s0(Vector(Vector(92.0), Vector(93.0), Vector(94.0)), 95.0), Vector(s1(Vector(Vector(s0(Vector(Vector(96.0), Vector(97.0), Vector(98.0)), 99.0))), 100.0), s1(Vector(Vector(s0(Vector(Vector(101.0), Vector(102.0), Vector(103.0)), 104.0))), 105.0))))), s6(Vector(s2(106.0, Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(107.0), Vector(108.0), Vector(109.0)), 110.0))), 111.0)), Vector(s1(Vector(Vector(s0(Vector(Vector(112.0), Vector(113.0), Vector(114.0)), 115.0))), 116.0))))), Vector(s3(s0(Vector(Vector(117.0), Vector(118.0), Vector(119.0)), 120.0), Vector(s1(Vector(Vector(s0(Vector(Vector(121.0), Vector(122.0), Vector(123.0)), 124.0))), 125.0), s1(Vector(Vector(s0(Vector(Vector(126.0), Vector(127.0), Vector(128.0)), 129.0))), 130.0))), s3(s0(Vector(Vector(131.0), Vector(132.0), Vector(133.0)), 134.0), Vector(s1(Vector(Vector(s0(Vector(Vector(135.0), Vector(136.0), Vector(137.0)), 138.0))), 139.0), s1(Vector(Vector(s0(Vector(Vector(140.0), Vector(141.0), Vector(142.0)), 143.0))), 144.0))), s3(s0(Vector(Vector(145.0), Vector(146.0), Vector(147.0)), 148.0), Vector(s1(Vector(Vector(s0(Vector(Vector(149.0), Vector(150.0), Vector(151.0)), 152.0))), 153.0), s1(Vector(Vector(s0(Vector(Vector(154.0), Vector(155.0), Vector(156.0)), 157.0))), 158.0))))))
    val v1: Double = 159.0
    val start = nanoTime()
    var result: Double = 159.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}