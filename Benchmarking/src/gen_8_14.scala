import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Double],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s6 (
    p0: Vector[s1],
    p1: Vector[Vector[s0]]
  )
  @noinline
  def f0(v0: s6, v1: Vector[Vector[s1]], v2: Double): Double = {
    val v7: Vector[Vector[s0]] = v0.p1
    val v20: Vector[s0] = v7(1)
    val v14: Double = v2 + v2
    val v18: s0 = v20(0)
    var v32: Double = v2
    val v23: Double = v2 * v2
    val v47: Double = v23 + v32
    val v34: Vector[Vector[Double]] = v18.p1
    val v46: Vector[Double] = v34(2)
    v32 = v47
    var v36: Vector[Double] = v46
    v36 = v36.updated(0, v14)
    v36 = v36.updated(0, v32)
    val v72: Double = v36(0)
    var v191: Double = v72
    v191
  }
  def benchmark(): Unit = {
    val v0: s6 = s6(Vector(s1(s0(Vector(0.0, 1.0, 2.0), Vector(Vector(3.0), Vector(4.0), Vector(5.0))), Vector(s0(Vector(6.0, 7.0, 8.0), Vector(Vector(9.0), Vector(10.0), Vector(11.0))))), s1(s0(Vector(12.0, 13.0, 14.0), Vector(Vector(15.0), Vector(16.0), Vector(17.0))), Vector(s0(Vector(18.0, 19.0, 20.0), Vector(Vector(21.0), Vector(22.0), Vector(23.0))))), s1(s0(Vector(24.0, 25.0, 26.0), Vector(Vector(27.0), Vector(28.0), Vector(29.0))), Vector(s0(Vector(30.0, 31.0, 32.0), Vector(Vector(33.0), Vector(34.0), Vector(35.0)))))), Vector(Vector(s0(Vector(36.0, 37.0, 38.0), Vector(Vector(39.0), Vector(40.0), Vector(41.0)))), Vector(s0(Vector(42.0, 43.0, 44.0), Vector(Vector(45.0), Vector(46.0), Vector(47.0)))), Vector(s0(Vector(48.0, 49.0, 50.0), Vector(Vector(51.0), Vector(52.0), Vector(53.0))))))
    val v1: Vector[Vector[s1]] = Vector(Vector(s1(s0(Vector(54.0, 55.0, 56.0), Vector(Vector(57.0), Vector(58.0), Vector(59.0))), Vector(s0(Vector(60.0, 61.0, 62.0), Vector(Vector(63.0), Vector(64.0), Vector(65.0)))))))
    val v2: Double = 66.0
    val start = nanoTime()
    var result: Double = 66.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}