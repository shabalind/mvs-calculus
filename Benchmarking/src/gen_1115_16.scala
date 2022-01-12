import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: Vector[s0],
    p1: s1,
    p2: s1,
    p3: Vector[Vector[s0]],
    p4: Vector[Vector[s0]]
  )
  case class s3 (
    p0: Vector[s1],
    p1: Vector[s2]
  )
  def f10(v0: Double): Double = {
    var v6: Double = v0
    var v5: Double = v6
    var v2: Double = v5
    var v4: Double = v2
    var v7: Double = v2
    v5 = v7
    val v11: Vector[Double] = Vector(v6, v4, v7)
    v5 = v0
    val v14: Double = v11(1)
    v14
  }
  @noinline
  def f0(v0: Vector[s1], v1: s3, v2: Double): Double = {
    val v5: Double = f10(v2)
    val v11: Double = f10(v5)
    val v4: Double = f10(v11)
    var v9: Double = v4
    val v16: Double = v11 - v5
    val v21: Vector[Double] = Vector(v2, v16, v2, v16, v9, v4)
    val v45: Double = v21(2)
    v45
  }
  def benchmark(): Unit = {
    val v0: Vector[s1] = Vector(s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0))), s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0)))))
    val v1: s3 = s3(Vector(s1(s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0)))), s1(s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0))), s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0)))), s1(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0))), s0(Vector(Vector(28.0), Vector(29.0), Vector(30.0)), Vector(Vector(31.0))))), Vector(s2(Vector(s0(Vector(Vector(32.0), Vector(33.0), Vector(34.0)), Vector(Vector(35.0))), s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0))), s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0)))), s1(s0(Vector(Vector(44.0), Vector(45.0), Vector(46.0)), Vector(Vector(47.0))), s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0)))), s1(s0(Vector(Vector(52.0), Vector(53.0), Vector(54.0)), Vector(Vector(55.0))), s0(Vector(Vector(56.0), Vector(57.0), Vector(58.0)), Vector(Vector(59.0)))), Vector(Vector(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0)))), Vector(s0(Vector(Vector(64.0), Vector(65.0), Vector(66.0)), Vector(Vector(67.0))))), Vector(Vector(s0(Vector(Vector(68.0), Vector(69.0), Vector(70.0)), Vector(Vector(71.0)))), Vector(s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)), Vector(Vector(75.0)))))), s2(Vector(s0(Vector(Vector(76.0), Vector(77.0), Vector(78.0)), Vector(Vector(79.0))), s0(Vector(Vector(80.0), Vector(81.0), Vector(82.0)), Vector(Vector(83.0))), s0(Vector(Vector(84.0), Vector(85.0), Vector(86.0)), Vector(Vector(87.0)))), s1(s0(Vector(Vector(88.0), Vector(89.0), Vector(90.0)), Vector(Vector(91.0))), s0(Vector(Vector(92.0), Vector(93.0), Vector(94.0)), Vector(Vector(95.0)))), s1(s0(Vector(Vector(96.0), Vector(97.0), Vector(98.0)), Vector(Vector(99.0))), s0(Vector(Vector(100.0), Vector(101.0), Vector(102.0)), Vector(Vector(103.0)))), Vector(Vector(s0(Vector(Vector(104.0), Vector(105.0), Vector(106.0)), Vector(Vector(107.0)))), Vector(s0(Vector(Vector(108.0), Vector(109.0), Vector(110.0)), Vector(Vector(111.0))))), Vector(Vector(s0(Vector(Vector(112.0), Vector(113.0), Vector(114.0)), Vector(Vector(115.0)))), Vector(s0(Vector(Vector(116.0), Vector(117.0), Vector(118.0)), Vector(Vector(119.0))))))))
    val v2: Double = 120.0
    val start = nanoTime()
    var result: Double = 120.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}