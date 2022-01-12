import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  case class s2 (
    p0: s0,
    p1: s1,
    p2: s0,
    p3: Vector[Vector[s0]]
  )
  case class s3 (
    p0: s0,
    p1: Vector[s2]
  )
  @noinline
  def f0(v0: Vector[s3], v1: Double): Double = {
    val v6: Vector[Double] = Vector(v1, v1, v1)
    var v7: Vector[Double] = v6
    val v2: s3 = v0(0)
    val v4: s0 = v2.p0
    val v15: Double = v7(1)
    val v17: Double = v6(2)
    v7 = v7.updated(1, v1)
    val v20: Vector[Vector[Double]] = v4.p1
    val v43: Vector[Double] = v20(2)
    val v31: Double = v15 * v17
    val v91: Double = v43(0)
    v7 = v7.updated(2, v91)
    v31
  }
  def benchmark(): Unit = {
    val v0: Vector[s3] = Vector(s3(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0)), Vector(Vector(4.0), Vector(5.0))), Vector(s2(s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0))), s1(Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0)), Vector(Vector(16.0), Vector(17.0))), s0(Vector(Vector(18.0)), Vector(Vector(19.0), Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0)))), Vector(s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0)), Vector(Vector(28.0), Vector(29.0))))), s0(Vector(Vector(30.0)), Vector(Vector(31.0), Vector(32.0), Vector(33.0)), Vector(Vector(34.0), Vector(35.0))), Vector(Vector(s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0)), Vector(Vector(40.0), Vector(41.0)))), Vector(s0(Vector(Vector(42.0)), Vector(Vector(43.0), Vector(44.0), Vector(45.0)), Vector(Vector(46.0), Vector(47.0)))))), s2(s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0), Vector(51.0)), Vector(Vector(52.0), Vector(53.0))), s1(Vector(s0(Vector(Vector(54.0)), Vector(Vector(55.0), Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0))), s0(Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0), Vector(63.0)), Vector(Vector(64.0), Vector(65.0)))), Vector(s0(Vector(Vector(66.0)), Vector(Vector(67.0), Vector(68.0), Vector(69.0)), Vector(Vector(70.0), Vector(71.0))))), s0(Vector(Vector(72.0)), Vector(Vector(73.0), Vector(74.0), Vector(75.0)), Vector(Vector(76.0), Vector(77.0))), Vector(Vector(s0(Vector(Vector(78.0)), Vector(Vector(79.0), Vector(80.0), Vector(81.0)), Vector(Vector(82.0), Vector(83.0)))), Vector(s0(Vector(Vector(84.0)), Vector(Vector(85.0), Vector(86.0), Vector(87.0)), Vector(Vector(88.0), Vector(89.0)))))), s2(s0(Vector(Vector(90.0)), Vector(Vector(91.0), Vector(92.0), Vector(93.0)), Vector(Vector(94.0), Vector(95.0))), s1(Vector(s0(Vector(Vector(96.0)), Vector(Vector(97.0), Vector(98.0), Vector(99.0)), Vector(Vector(100.0), Vector(101.0))), s0(Vector(Vector(102.0)), Vector(Vector(103.0), Vector(104.0), Vector(105.0)), Vector(Vector(106.0), Vector(107.0)))), Vector(s0(Vector(Vector(108.0)), Vector(Vector(109.0), Vector(110.0), Vector(111.0)), Vector(Vector(112.0), Vector(113.0))))), s0(Vector(Vector(114.0)), Vector(Vector(115.0), Vector(116.0), Vector(117.0)), Vector(Vector(118.0), Vector(119.0))), Vector(Vector(s0(Vector(Vector(120.0)), Vector(Vector(121.0), Vector(122.0), Vector(123.0)), Vector(Vector(124.0), Vector(125.0)))), Vector(s0(Vector(Vector(126.0)), Vector(Vector(127.0), Vector(128.0), Vector(129.0)), Vector(Vector(130.0), Vector(131.0)))))))))
    val v1: Double = 132.0
    val start = nanoTime()
    var result: Double = 132.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}