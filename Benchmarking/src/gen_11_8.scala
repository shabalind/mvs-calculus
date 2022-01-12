import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: s0
  )
  case class s2 (
    p0: Vector[s0],
    p1: s1
  )
  case class s3 (
    p0: s2,
    p1: Vector[s2]
  )
  @noinline
  def f0(v0: s3, v1: s1, v2: s1, v3: s0, v4: Double): Double = {
    var v11: Double = v4
    val v7: Vector[Vector[Double]] = v3.p1
    val v17: Vector[Double] = v7(0)
    var v63: Double = v11
    var v45: Vector[Double] = v17
    var v34: Vector[Double] = v45
    var v54: Double = v4
    val v58: Double = v34(0)
    v45 = v45.updated(0, v54)
    val v91: Double = v17(0)
    val v67: Double = v63 + v58
    v34 = v34.updated(0, v58)
    val v112: Double = v67 + v67
    v45 = v34
    v34 = v34.updated(0, v63)
    v45 = v45.updated(0, v91)
    v112
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(s2(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0)), Vector(Vector(4.0), Vector(5.0), Vector(6.0)))), s1(Vector(Vector(s0(Vector(Vector(7.0)), Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0), Vector(12.0), Vector(13.0)))), Vector(s0(Vector(Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0), Vector(20.0))))), s0(Vector(Vector(21.0)), Vector(Vector(22.0), Vector(23.0), Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0))))), Vector(s2(Vector(s0(Vector(Vector(28.0)), Vector(Vector(29.0), Vector(30.0), Vector(31.0)), Vector(Vector(32.0), Vector(33.0), Vector(34.0)))), s1(Vector(Vector(s0(Vector(Vector(35.0)), Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0), Vector(40.0), Vector(41.0)))), Vector(s0(Vector(Vector(42.0)), Vector(Vector(43.0), Vector(44.0), Vector(45.0)), Vector(Vector(46.0), Vector(47.0), Vector(48.0))))), s0(Vector(Vector(49.0)), Vector(Vector(50.0), Vector(51.0), Vector(52.0)), Vector(Vector(53.0), Vector(54.0), Vector(55.0)))))))
    val v1: s1 = s1(Vector(Vector(s0(Vector(Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0)), Vector(Vector(60.0), Vector(61.0), Vector(62.0)))), Vector(s0(Vector(Vector(63.0)), Vector(Vector(64.0), Vector(65.0), Vector(66.0)), Vector(Vector(67.0), Vector(68.0), Vector(69.0))))), s0(Vector(Vector(70.0)), Vector(Vector(71.0), Vector(72.0), Vector(73.0)), Vector(Vector(74.0), Vector(75.0), Vector(76.0))))
    val v2: s1 = s1(Vector(Vector(s0(Vector(Vector(77.0)), Vector(Vector(78.0), Vector(79.0), Vector(80.0)), Vector(Vector(81.0), Vector(82.0), Vector(83.0)))), Vector(s0(Vector(Vector(84.0)), Vector(Vector(85.0), Vector(86.0), Vector(87.0)), Vector(Vector(88.0), Vector(89.0), Vector(90.0))))), s0(Vector(Vector(91.0)), Vector(Vector(92.0), Vector(93.0), Vector(94.0)), Vector(Vector(95.0), Vector(96.0), Vector(97.0))))
    val v3: s0 = s0(Vector(Vector(98.0)), Vector(Vector(99.0), Vector(100.0), Vector(101.0)), Vector(Vector(102.0), Vector(103.0), Vector(104.0)))
    val v4: Double = 105.0
    val start = nanoTime()
    var result: Double = 105.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}