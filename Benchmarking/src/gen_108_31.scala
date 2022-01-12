import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Double
  )
  case class s1 (
    p0: s0,
    p1: s0,
    p2: Vector[Vector[s0]]
  )
  case class s3 (
    p0: Vector[Vector[s1]],
    p1: Vector[s1]
  )
  case class s4 (
    p0: s0,
    p1: s0,
    p2: Vector[s3]
  )
  @noinline
  def f0(v0: Vector[s4], v1: Double): Double = {
    val v3: s4 = v0(0)
    val v6: Vector[s3] = v3.p2
    val v12: s3 = v6(0)
    val v2: Vector[s1] = v12.p1
    val v14: s1 = v2(0)
    val v24: s0 = v14.p1
    val v30: Double = v24.p1
    var v114: Double = v1
    var v159: Double = v114
    val v131: Double = v159 / v30
    v131
  }
  def benchmark(): Unit = {
    val v0: Vector[s4] = Vector(s4(s0(Vector(Vector(0.0), Vector(1.0)), 2.0), s0(Vector(Vector(3.0), Vector(4.0)), 5.0), Vector(s3(Vector(Vector(s1(s0(Vector(Vector(6.0), Vector(7.0)), 8.0), s0(Vector(Vector(9.0), Vector(10.0)), 11.0), Vector(Vector(s0(Vector(Vector(12.0), Vector(13.0)), 14.0)), Vector(s0(Vector(Vector(15.0), Vector(16.0)), 17.0)), Vector(s0(Vector(Vector(18.0), Vector(19.0)), 20.0))))), Vector(s1(s0(Vector(Vector(21.0), Vector(22.0)), 23.0), s0(Vector(Vector(24.0), Vector(25.0)), 26.0), Vector(Vector(s0(Vector(Vector(27.0), Vector(28.0)), 29.0)), Vector(s0(Vector(Vector(30.0), Vector(31.0)), 32.0)), Vector(s0(Vector(Vector(33.0), Vector(34.0)), 35.0)))))), Vector(s1(s0(Vector(Vector(36.0), Vector(37.0)), 38.0), s0(Vector(Vector(39.0), Vector(40.0)), 41.0), Vector(Vector(s0(Vector(Vector(42.0), Vector(43.0)), 44.0)), Vector(s0(Vector(Vector(45.0), Vector(46.0)), 47.0)), Vector(s0(Vector(Vector(48.0), Vector(49.0)), 50.0)))), s1(s0(Vector(Vector(51.0), Vector(52.0)), 53.0), s0(Vector(Vector(54.0), Vector(55.0)), 56.0), Vector(Vector(s0(Vector(Vector(57.0), Vector(58.0)), 59.0)), Vector(s0(Vector(Vector(60.0), Vector(61.0)), 62.0)), Vector(s0(Vector(Vector(63.0), Vector(64.0)), 65.0)))), s1(s0(Vector(Vector(66.0), Vector(67.0)), 68.0), s0(Vector(Vector(69.0), Vector(70.0)), 71.0), Vector(Vector(s0(Vector(Vector(72.0), Vector(73.0)), 74.0)), Vector(s0(Vector(Vector(75.0), Vector(76.0)), 77.0)), Vector(s0(Vector(Vector(78.0), Vector(79.0)), 80.0)))))))))
    val v1: Double = 81.0
    val start = nanoTime()
    var result: Double = 81.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}