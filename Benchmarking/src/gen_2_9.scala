import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0,
    p2: Vector[Vector[s0]]
  )
  case class s2 (
    p0: s1,
    p1: s0
  )
  case class s3 (
    p0: Vector[s2],
    p1: s0
  )
  case class s4 (
    p0: Vector[s0],
    p1: s2
  )
  @noinline
  def f0(v0: s4, v1: s3, v2: Vector[Double], v3: Double): Double = {
    val v5: Double = v2(1)
    val v4: s2 = v0.p1
    val v14: s0 = v4.p1
    val v18: Vector[Vector[Double]] = v14.p1
    val v13: Double = v2(1)
    val v29: Double = v3 + v3
    val v24: Vector[Double] = v18(0)
    val v49: Double = v24(0)
    val v84: Vector[Double] = Vector(v13, v29, v49, v3, v5)
    val v47: Double = v84(1)
    v47
  }
  def benchmark(): Unit = {
    val v0: s4 = s4(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0))), s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0)))), s2(s1(Vector(s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0)))), s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0))), Vector(Vector(s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0), Vector(24.0)))), Vector(s0(Vector(Vector(25.0), Vector(26.0), Vector(27.0)), Vector(Vector(28.0), Vector(29.0)))))), s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0)))))
    val v1: s3 = s3(Vector(s2(s1(Vector(s0(Vector(Vector(35.0), Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0)))), s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0), Vector(44.0))), Vector(Vector(s0(Vector(Vector(45.0), Vector(46.0), Vector(47.0)), Vector(Vector(48.0), Vector(49.0)))), Vector(s0(Vector(Vector(50.0), Vector(51.0), Vector(52.0)), Vector(Vector(53.0), Vector(54.0)))))), s0(Vector(Vector(55.0), Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0)))), s2(s1(Vector(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0), Vector(64.0)))), s0(Vector(Vector(65.0), Vector(66.0), Vector(67.0)), Vector(Vector(68.0), Vector(69.0))), Vector(Vector(s0(Vector(Vector(70.0), Vector(71.0), Vector(72.0)), Vector(Vector(73.0), Vector(74.0)))), Vector(s0(Vector(Vector(75.0), Vector(76.0), Vector(77.0)), Vector(Vector(78.0), Vector(79.0)))))), s0(Vector(Vector(80.0), Vector(81.0), Vector(82.0)), Vector(Vector(83.0), Vector(84.0))))), s0(Vector(Vector(85.0), Vector(86.0), Vector(87.0)), Vector(Vector(88.0), Vector(89.0))))
    val v2: Vector[Double] = Vector(90.0, 91.0, 92.0)
    val v3: Double = 93.0
    val start = nanoTime()
    var result: Double = 93.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}