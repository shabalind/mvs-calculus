import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Double,
    p2: Vector[Vector[Double]],
    p3: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  @noinline
  def f0(v0: Vector[Vector[s0]], v1: Vector[s1], v2: s0, v3: Double): Double = {
    val v4: Vector[Vector[Double]] = v2.p3
    val v6: Vector[Vector[Double]] = v2.p0
    val v8: Double = v2.p1
    val v18: s0 = s0(v6, v8, v6, v4)
    val v28: Double = v8 + v8
    val v27: Vector[Double] = v6(0)
    val v37: Double = v18.p1
    val v81: Double = v27(0)
    val v73: Double = v81 * v28
    val v74: Double = v37 * v73
    v74
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0)), 2.0, Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0)))))
    val v1: Vector[s1] = Vector(s1(Vector(s0(Vector(Vector(8.0), Vector(9.0)), 10.0, Vector(Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0))), s0(Vector(Vector(16.0), Vector(17.0)), 18.0, Vector(Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0)))), Vector(s0(Vector(Vector(24.0), Vector(25.0)), 26.0, Vector(Vector(27.0), Vector(28.0)), Vector(Vector(29.0), Vector(30.0), Vector(31.0))), s0(Vector(Vector(32.0), Vector(33.0)), 34.0, Vector(Vector(35.0), Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0))), s0(Vector(Vector(40.0), Vector(41.0)), 42.0, Vector(Vector(43.0), Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0))))), s1(Vector(s0(Vector(Vector(48.0), Vector(49.0)), 50.0, Vector(Vector(51.0), Vector(52.0)), Vector(Vector(53.0), Vector(54.0), Vector(55.0))), s0(Vector(Vector(56.0), Vector(57.0)), 58.0, Vector(Vector(59.0), Vector(60.0)), Vector(Vector(61.0), Vector(62.0), Vector(63.0)))), Vector(s0(Vector(Vector(64.0), Vector(65.0)), 66.0, Vector(Vector(67.0), Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0))), s0(Vector(Vector(72.0), Vector(73.0)), 74.0, Vector(Vector(75.0), Vector(76.0)), Vector(Vector(77.0), Vector(78.0), Vector(79.0))), s0(Vector(Vector(80.0), Vector(81.0)), 82.0, Vector(Vector(83.0), Vector(84.0)), Vector(Vector(85.0), Vector(86.0), Vector(87.0))))), s1(Vector(s0(Vector(Vector(88.0), Vector(89.0)), 90.0, Vector(Vector(91.0), Vector(92.0)), Vector(Vector(93.0), Vector(94.0), Vector(95.0))), s0(Vector(Vector(96.0), Vector(97.0)), 98.0, Vector(Vector(99.0), Vector(100.0)), Vector(Vector(101.0), Vector(102.0), Vector(103.0)))), Vector(s0(Vector(Vector(104.0), Vector(105.0)), 106.0, Vector(Vector(107.0), Vector(108.0)), Vector(Vector(109.0), Vector(110.0), Vector(111.0))), s0(Vector(Vector(112.0), Vector(113.0)), 114.0, Vector(Vector(115.0), Vector(116.0)), Vector(Vector(117.0), Vector(118.0), Vector(119.0))), s0(Vector(Vector(120.0), Vector(121.0)), 122.0, Vector(Vector(123.0), Vector(124.0)), Vector(Vector(125.0), Vector(126.0), Vector(127.0))))))
    val v2: s0 = s0(Vector(Vector(128.0), Vector(129.0)), 130.0, Vector(Vector(131.0), Vector(132.0)), Vector(Vector(133.0), Vector(134.0), Vector(135.0)))
    val v3: Double = 136.0
    val start = nanoTime()
    var result: Double = 136.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}