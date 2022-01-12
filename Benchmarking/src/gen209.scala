import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: Vector[s0]
  )
  case class s2 (
    p0: Vector[s0],
    p1: s1
  )
  case class s3 (
    p0: s2,
    p1: s2,
    p2: s2,
    p3: s2
  )
  def f38(v0: Double): Double = {
    var v7: Double = v0
    val v4: Vector[Double] = Vector(v0, v7, v7, v0, v7)
    var v2: Vector[Double] = v4
    v7 = v0
    var v6: Vector[Double] = v4
    val v3: Double = v7 / v0
    v6 = v6.updated(3, v3)
    v6 = v6.updated(2, v0)
    var v5: Vector[Double] = v2
    v5 = v6
    v6 = v6.updated(2, v7)
    var v18: Double = v0
    val v65: Double = v6(2)
    var v37: Vector[Double] = v5
    v6 = v6.updated(2, v65)
    v6 = v6.updated(4, v18)
    val v30: Double = v37(0)
    v7 = v3
    v30
  }
  @noinline
  def f0(v0: s3, v1: Double): Double = {
    val v6: Double = f38(v1)
    val v110: Double = v6 + v6
    v110
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(s2(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0))), s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0))), s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0)))), s1(Vector(Vector(s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0)))), Vector(s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0), Vector(24.0)))), Vector(s0(Vector(Vector(25.0), Vector(26.0), Vector(27.0)), Vector(Vector(28.0), Vector(29.0))))), Vector(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0)))))), s2(Vector(s0(Vector(Vector(35.0), Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0))), s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0), Vector(44.0))), s0(Vector(Vector(45.0), Vector(46.0), Vector(47.0)), Vector(Vector(48.0), Vector(49.0)))), s1(Vector(Vector(s0(Vector(Vector(50.0), Vector(51.0), Vector(52.0)), Vector(Vector(53.0), Vector(54.0)))), Vector(s0(Vector(Vector(55.0), Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0)))), Vector(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0), Vector(64.0))))), Vector(s0(Vector(Vector(65.0), Vector(66.0), Vector(67.0)), Vector(Vector(68.0), Vector(69.0)))))), s2(Vector(s0(Vector(Vector(70.0), Vector(71.0), Vector(72.0)), Vector(Vector(73.0), Vector(74.0))), s0(Vector(Vector(75.0), Vector(76.0), Vector(77.0)), Vector(Vector(78.0), Vector(79.0))), s0(Vector(Vector(80.0), Vector(81.0), Vector(82.0)), Vector(Vector(83.0), Vector(84.0)))), s1(Vector(Vector(s0(Vector(Vector(85.0), Vector(86.0), Vector(87.0)), Vector(Vector(88.0), Vector(89.0)))), Vector(s0(Vector(Vector(90.0), Vector(91.0), Vector(92.0)), Vector(Vector(93.0), Vector(94.0)))), Vector(s0(Vector(Vector(95.0), Vector(96.0), Vector(97.0)), Vector(Vector(98.0), Vector(99.0))))), Vector(s0(Vector(Vector(100.0), Vector(101.0), Vector(102.0)), Vector(Vector(103.0), Vector(104.0)))))), s2(Vector(s0(Vector(Vector(105.0), Vector(106.0), Vector(107.0)), Vector(Vector(108.0), Vector(109.0))), s0(Vector(Vector(110.0), Vector(111.0), Vector(112.0)), Vector(Vector(113.0), Vector(114.0))), s0(Vector(Vector(115.0), Vector(116.0), Vector(117.0)), Vector(Vector(118.0), Vector(119.0)))), s1(Vector(Vector(s0(Vector(Vector(120.0), Vector(121.0), Vector(122.0)), Vector(Vector(123.0), Vector(124.0)))), Vector(s0(Vector(Vector(125.0), Vector(126.0), Vector(127.0)), Vector(Vector(128.0), Vector(129.0)))), Vector(s0(Vector(Vector(130.0), Vector(131.0), Vector(132.0)), Vector(Vector(133.0), Vector(134.0))))), Vector(s0(Vector(Vector(135.0), Vector(136.0), Vector(137.0)), Vector(Vector(138.0), Vector(139.0)))))))
    val v1: Double = 140.0
    val start = nanoTime()
    var result: Double = 140.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}