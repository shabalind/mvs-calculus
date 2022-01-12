import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Double]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[Vector[s0]]
  )
  case class s2 (
    p0: Vector[s0],
    p1: s1
  )
  case class s3 (
    p0: s0,
    p1: s2
  )
  case class s4 (
    p0: Vector[s3],
    p1: Vector[s1]
  )
  @noinline
  def f0(v0: s4, v1: Double): Double = {
    val v2: Vector[s3] = v0.p0
    val v16: s3 = v2(0)
    val v27: s2 = v16.p1
    val v36: s1 = v27.p1
    val v18: Vector[s0] = v36.p0
    val v40: s0 = v18(2)
    val v55: Vector[Vector[Double]] = v40.p0
    val v41: Vector[Double] = v55(2)
    var v42: Vector[Double] = v41
    val v100: Double = v42(0)
    v100
  }
  def benchmark(): Unit = {
    val v0: s4 = s4(Vector(s3(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(3.0, 4.0)), s2(Vector(s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(8.0, 9.0)), s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(13.0, 14.0))), s1(Vector(s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(18.0, 19.0)), s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(23.0, 24.0)), s0(Vector(Vector(25.0), Vector(26.0), Vector(27.0)), Vector(28.0, 29.0))), Vector(Vector(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(33.0, 34.0))), Vector(s0(Vector(Vector(35.0), Vector(36.0), Vector(37.0)), Vector(38.0, 39.0)))))))), Vector(s1(Vector(s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(43.0, 44.0)), s0(Vector(Vector(45.0), Vector(46.0), Vector(47.0)), Vector(48.0, 49.0)), s0(Vector(Vector(50.0), Vector(51.0), Vector(52.0)), Vector(53.0, 54.0))), Vector(Vector(s0(Vector(Vector(55.0), Vector(56.0), Vector(57.0)), Vector(58.0, 59.0))), Vector(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(63.0, 64.0))))), s1(Vector(s0(Vector(Vector(65.0), Vector(66.0), Vector(67.0)), Vector(68.0, 69.0)), s0(Vector(Vector(70.0), Vector(71.0), Vector(72.0)), Vector(73.0, 74.0)), s0(Vector(Vector(75.0), Vector(76.0), Vector(77.0)), Vector(78.0, 79.0))), Vector(Vector(s0(Vector(Vector(80.0), Vector(81.0), Vector(82.0)), Vector(83.0, 84.0))), Vector(s0(Vector(Vector(85.0), Vector(86.0), Vector(87.0)), Vector(88.0, 89.0)))))))
    val v1: Double = 90.0
    val start = nanoTime()
    var result: Double = 90.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}