import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Double]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s2 (
    p0: s0,
    p1: s0
  )
  case class s3 (
    p0: s2,
    p1: Vector[s2]
  )
  case class s4 (
    p0: s0,
    p1: s3,
    p2: s1,
    p3: Vector[s0]
  )
  @noinline
  def f0(v0: s3, v1: Vector[s0], v2: s4, v3: Double): Double = {
    val v9: s3 = v2.p1
    val v8: s2 = v9.p0
    val v23: s0 = v8.p1
    val v31: Vector[Vector[Double]] = v23.p0
    var v32: s0 = v23
    var v43: Vector[Vector[Double]] = v31
    val v76: Vector[Double] = v43(1)
    v43 = v43.updated(1, v76)
    val v69: Vector[Vector[Double]] = v32.p0
    v43 = v43.updated(0, v76)
    val v90: Vector[Double] = v69(2)
    val v113: Double = v76(0)
    val v71: Double = v113 / v113
    val v425: Vector[Double] = v43(2)
    v43 = v43.updated(0, v90)
    v43 = v43.updated(0, v425)
    v71
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(s2(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(3.0, 4.0, 5.0)), s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(9.0, 10.0, 11.0))), Vector(s2(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(15.0, 16.0, 17.0)), s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(21.0, 22.0, 23.0)))))
    val v1: Vector[s0] = Vector(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(27.0, 28.0, 29.0)))
    val v2: s4 = s4(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(33.0, 34.0, 35.0)), s3(s2(s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(39.0, 40.0, 41.0)), s0(Vector(Vector(42.0), Vector(43.0), Vector(44.0)), Vector(45.0, 46.0, 47.0))), Vector(s2(s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(51.0, 52.0, 53.0)), s0(Vector(Vector(54.0), Vector(55.0), Vector(56.0)), Vector(57.0, 58.0, 59.0))))), s1(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(63.0, 64.0, 65.0)), Vector(s0(Vector(Vector(66.0), Vector(67.0), Vector(68.0)), Vector(69.0, 70.0, 71.0)), s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)), Vector(75.0, 76.0, 77.0)), s0(Vector(Vector(78.0), Vector(79.0), Vector(80.0)), Vector(81.0, 82.0, 83.0)))), Vector(s0(Vector(Vector(84.0), Vector(85.0), Vector(86.0)), Vector(87.0, 88.0, 89.0)), s0(Vector(Vector(90.0), Vector(91.0), Vector(92.0)), Vector(93.0, 94.0, 95.0))))
    val v3: Double = 96.0
    val start = nanoTime()
    var result: Double = 96.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}