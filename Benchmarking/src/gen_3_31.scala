import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: s0
  )
  case class s2 (
    p0: s1,
    p1: Vector[Vector[s1]]
  )
  case class s3 (
    p0: Vector[s0],
    p1: s0
  )
  case class s6 (
    p0: s0,
    p1: Vector[s1]
  )
  case class s9 (
    p0: s6,
    p1: Vector[s6]
  )
  case class s11 (
    p0: s2,
    p1: Vector[s0]
  )
  @noinline
  def f0(v0: s9, v1: s3, v2: Vector[s11], v3: Double): Double = {
    var v6: Double = v3
    val v7: s11 = v2(1)
    val v10: Vector[s0] = v7.p1
    val v45: Double = v6 + v6
    val v14: s0 = v10(0)
    val v40: Double = v3 * v45
    val v36: Vector[Vector[Double]] = v14.p0
    var v28: Double = v6
    val v78: Vector[Double] = v36(0)
    var v68: Vector[Double] = v78
    val v90: Double = v68(0)
    v6 = v40
    v68 = v68.updated(0, v28)
    v90
  }
  def benchmark(): Unit = {
    val v0: s9 = s9(s6(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0))), Vector(s1(Vector(Vector(s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0)))), Vector(s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0))))), s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0)))), s1(Vector(Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0)))), Vector(s0(Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0))))), s0(Vector(Vector(18.0)), Vector(Vector(19.0), Vector(20.0)))), s1(Vector(Vector(s0(Vector(Vector(21.0)), Vector(Vector(22.0), Vector(23.0)))), Vector(s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0))))), s0(Vector(Vector(27.0)), Vector(Vector(28.0), Vector(29.0)))))), Vector(s6(s0(Vector(Vector(30.0)), Vector(Vector(31.0), Vector(32.0))), Vector(s1(Vector(Vector(s0(Vector(Vector(33.0)), Vector(Vector(34.0), Vector(35.0)))), Vector(s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0))))), s0(Vector(Vector(39.0)), Vector(Vector(40.0), Vector(41.0)))), s1(Vector(Vector(s0(Vector(Vector(42.0)), Vector(Vector(43.0), Vector(44.0)))), Vector(s0(Vector(Vector(45.0)), Vector(Vector(46.0), Vector(47.0))))), s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0)))), s1(Vector(Vector(s0(Vector(Vector(51.0)), Vector(Vector(52.0), Vector(53.0)))), Vector(s0(Vector(Vector(54.0)), Vector(Vector(55.0), Vector(56.0))))), s0(Vector(Vector(57.0)), Vector(Vector(58.0), Vector(59.0))))))))
    val v1: s3 = s3(Vector(s0(Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0)))), s0(Vector(Vector(63.0)), Vector(Vector(64.0), Vector(65.0))))
    val v2: Vector[s11] = Vector(s11(s2(s1(Vector(Vector(s0(Vector(Vector(66.0)), Vector(Vector(67.0), Vector(68.0)))), Vector(s0(Vector(Vector(69.0)), Vector(Vector(70.0), Vector(71.0))))), s0(Vector(Vector(72.0)), Vector(Vector(73.0), Vector(74.0)))), Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(75.0)), Vector(Vector(76.0), Vector(77.0)))), Vector(s0(Vector(Vector(78.0)), Vector(Vector(79.0), Vector(80.0))))), s0(Vector(Vector(81.0)), Vector(Vector(82.0), Vector(83.0))))), Vector(s1(Vector(Vector(s0(Vector(Vector(84.0)), Vector(Vector(85.0), Vector(86.0)))), Vector(s0(Vector(Vector(87.0)), Vector(Vector(88.0), Vector(89.0))))), s0(Vector(Vector(90.0)), Vector(Vector(91.0), Vector(92.0))))))), Vector(s0(Vector(Vector(93.0)), Vector(Vector(94.0), Vector(95.0))))), s11(s2(s1(Vector(Vector(s0(Vector(Vector(96.0)), Vector(Vector(97.0), Vector(98.0)))), Vector(s0(Vector(Vector(99.0)), Vector(Vector(100.0), Vector(101.0))))), s0(Vector(Vector(102.0)), Vector(Vector(103.0), Vector(104.0)))), Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(105.0)), Vector(Vector(106.0), Vector(107.0)))), Vector(s0(Vector(Vector(108.0)), Vector(Vector(109.0), Vector(110.0))))), s0(Vector(Vector(111.0)), Vector(Vector(112.0), Vector(113.0))))), Vector(s1(Vector(Vector(s0(Vector(Vector(114.0)), Vector(Vector(115.0), Vector(116.0)))), Vector(s0(Vector(Vector(117.0)), Vector(Vector(118.0), Vector(119.0))))), s0(Vector(Vector(120.0)), Vector(Vector(121.0), Vector(122.0))))))), Vector(s0(Vector(Vector(123.0)), Vector(Vector(124.0), Vector(125.0))))))
    val v3: Double = 126.0
    val start = nanoTime()
    var result: Double = 126.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}