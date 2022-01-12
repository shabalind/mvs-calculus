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
  case class s3 (
    p0: s1,
    p1: Vector[s1]
  )
  case class s4 (
    p0: Vector[Vector[s0]],
    p1: s3
  )
  case class s6 (
    p0: Vector[Double],
    p1: Vector[s4]
  )
  @noinline
  def f0(v0: Vector[Vector[s6]], v1: Double): Double = {
    val v7: Vector[s6] = v0(1)
    val v8: s6 = v7(0)
    val v12: Vector[Double] = v8.p0
    val v10: Double = v12(2)
    val v38: Vector[Double] = Vector(v1, v10, v1, v1)
    val v37: Double = v1 + v10
    val v36: Double = v38(0)
    val v32: Double = v36 + v36
    val v41: Double = v32 * v37
    val v116: Double = v41 / v41
    v116
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s6]] = Vector(Vector(s6(Vector(0.0, 1.0, 2.0), Vector(s4(Vector(Vector(s0(Vector(Vector(3.0)), Vector(Vector(4.0))))), s3(s1(Vector(s0(Vector(Vector(5.0)), Vector(Vector(6.0)))), Vector(s0(Vector(Vector(7.0)), Vector(Vector(8.0))), s0(Vector(Vector(9.0)), Vector(Vector(10.0))))), Vector(s1(Vector(s0(Vector(Vector(11.0)), Vector(Vector(12.0)))), Vector(s0(Vector(Vector(13.0)), Vector(Vector(14.0))), s0(Vector(Vector(15.0)), Vector(Vector(16.0))))), s1(Vector(s0(Vector(Vector(17.0)), Vector(Vector(18.0)))), Vector(s0(Vector(Vector(19.0)), Vector(Vector(20.0))), s0(Vector(Vector(21.0)), Vector(Vector(22.0)))))))), s4(Vector(Vector(s0(Vector(Vector(23.0)), Vector(Vector(24.0))))), s3(s1(Vector(s0(Vector(Vector(25.0)), Vector(Vector(26.0)))), Vector(s0(Vector(Vector(27.0)), Vector(Vector(28.0))), s0(Vector(Vector(29.0)), Vector(Vector(30.0))))), Vector(s1(Vector(s0(Vector(Vector(31.0)), Vector(Vector(32.0)))), Vector(s0(Vector(Vector(33.0)), Vector(Vector(34.0))), s0(Vector(Vector(35.0)), Vector(Vector(36.0))))), s1(Vector(s0(Vector(Vector(37.0)), Vector(Vector(38.0)))), Vector(s0(Vector(Vector(39.0)), Vector(Vector(40.0))), s0(Vector(Vector(41.0)), Vector(Vector(42.0))))))))))), Vector(s6(Vector(43.0, 44.0, 45.0), Vector(s4(Vector(Vector(s0(Vector(Vector(46.0)), Vector(Vector(47.0))))), s3(s1(Vector(s0(Vector(Vector(48.0)), Vector(Vector(49.0)))), Vector(s0(Vector(Vector(50.0)), Vector(Vector(51.0))), s0(Vector(Vector(52.0)), Vector(Vector(53.0))))), Vector(s1(Vector(s0(Vector(Vector(54.0)), Vector(Vector(55.0)))), Vector(s0(Vector(Vector(56.0)), Vector(Vector(57.0))), s0(Vector(Vector(58.0)), Vector(Vector(59.0))))), s1(Vector(s0(Vector(Vector(60.0)), Vector(Vector(61.0)))), Vector(s0(Vector(Vector(62.0)), Vector(Vector(63.0))), s0(Vector(Vector(64.0)), Vector(Vector(65.0)))))))), s4(Vector(Vector(s0(Vector(Vector(66.0)), Vector(Vector(67.0))))), s3(s1(Vector(s0(Vector(Vector(68.0)), Vector(Vector(69.0)))), Vector(s0(Vector(Vector(70.0)), Vector(Vector(71.0))), s0(Vector(Vector(72.0)), Vector(Vector(73.0))))), Vector(s1(Vector(s0(Vector(Vector(74.0)), Vector(Vector(75.0)))), Vector(s0(Vector(Vector(76.0)), Vector(Vector(77.0))), s0(Vector(Vector(78.0)), Vector(Vector(79.0))))), s1(Vector(s0(Vector(Vector(80.0)), Vector(Vector(81.0)))), Vector(s0(Vector(Vector(82.0)), Vector(Vector(83.0))), s0(Vector(Vector(84.0)), Vector(Vector(85.0))))))))))), Vector(s6(Vector(86.0, 87.0, 88.0), Vector(s4(Vector(Vector(s0(Vector(Vector(89.0)), Vector(Vector(90.0))))), s3(s1(Vector(s0(Vector(Vector(91.0)), Vector(Vector(92.0)))), Vector(s0(Vector(Vector(93.0)), Vector(Vector(94.0))), s0(Vector(Vector(95.0)), Vector(Vector(96.0))))), Vector(s1(Vector(s0(Vector(Vector(97.0)), Vector(Vector(98.0)))), Vector(s0(Vector(Vector(99.0)), Vector(Vector(100.0))), s0(Vector(Vector(101.0)), Vector(Vector(102.0))))), s1(Vector(s0(Vector(Vector(103.0)), Vector(Vector(104.0)))), Vector(s0(Vector(Vector(105.0)), Vector(Vector(106.0))), s0(Vector(Vector(107.0)), Vector(Vector(108.0)))))))), s4(Vector(Vector(s0(Vector(Vector(109.0)), Vector(Vector(110.0))))), s3(s1(Vector(s0(Vector(Vector(111.0)), Vector(Vector(112.0)))), Vector(s0(Vector(Vector(113.0)), Vector(Vector(114.0))), s0(Vector(Vector(115.0)), Vector(Vector(116.0))))), Vector(s1(Vector(s0(Vector(Vector(117.0)), Vector(Vector(118.0)))), Vector(s0(Vector(Vector(119.0)), Vector(Vector(120.0))), s0(Vector(Vector(121.0)), Vector(Vector(122.0))))), s1(Vector(s0(Vector(Vector(123.0)), Vector(Vector(124.0)))), Vector(s0(Vector(Vector(125.0)), Vector(Vector(126.0))), s0(Vector(Vector(127.0)), Vector(Vector(128.0))))))))))))
    val v1: Double = 129.0
    val start = nanoTime()
    var result: Double = 129.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}