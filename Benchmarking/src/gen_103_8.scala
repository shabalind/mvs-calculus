import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Double],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[Vector[s0]]
  )
  case class s2 (
    p0: s0,
    p1: Vector[Vector[s1]]
  )
  case class s3 (
    p0: s1,
    p1: s0
  )
  case class s4 (
    p0: s3,
    p1: Vector[s1]
  )
  case class s6 (
    p0: s1,
    p1: Vector[Vector[s2]]
  )
  def f92(v0: Double): Double = {
    var v11: Double = v0
    var v15: Double = v11
    val v18: Double = v15 / v11
    v18
  }
  @noinline
  def f0(v0: Vector[Vector[s6]], v1: Vector[Vector[s4]], v2: Double): Double = {
    val v5: Double = f92(v2)
    val v9: Double = f92(v5)
    val v36: Double = v9 * v2
    v36
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s6]] = Vector(Vector(s6(s1(s0(Vector(0.0, 1.0, 2.0), Vector(Vector(3.0))), Vector(Vector(s0(Vector(4.0, 5.0, 6.0), Vector(Vector(7.0)))), Vector(s0(Vector(8.0, 9.0, 10.0), Vector(Vector(11.0)))))), Vector(Vector(s2(s0(Vector(12.0, 13.0, 14.0), Vector(Vector(15.0))), Vector(Vector(s1(s0(Vector(16.0, 17.0, 18.0), Vector(Vector(19.0))), Vector(Vector(s0(Vector(20.0, 21.0, 22.0), Vector(Vector(23.0)))), Vector(s0(Vector(24.0, 25.0, 26.0), Vector(Vector(27.0))))))), Vector(s1(s0(Vector(28.0, 29.0, 30.0), Vector(Vector(31.0))), Vector(Vector(s0(Vector(32.0, 33.0, 34.0), Vector(Vector(35.0)))), Vector(s0(Vector(36.0, 37.0, 38.0), Vector(Vector(39.0))))))))))))))
    val v1: Vector[Vector[s4]] = Vector(Vector(s4(s3(s1(s0(Vector(40.0, 41.0, 42.0), Vector(Vector(43.0))), Vector(Vector(s0(Vector(44.0, 45.0, 46.0), Vector(Vector(47.0)))), Vector(s0(Vector(48.0, 49.0, 50.0), Vector(Vector(51.0)))))), s0(Vector(52.0, 53.0, 54.0), Vector(Vector(55.0)))), Vector(s1(s0(Vector(56.0, 57.0, 58.0), Vector(Vector(59.0))), Vector(Vector(s0(Vector(60.0, 61.0, 62.0), Vector(Vector(63.0)))), Vector(s0(Vector(64.0, 65.0, 66.0), Vector(Vector(67.0))))))))))
    val v2: Double = 68.0
    val start = nanoTime()
    var result: Double = 68.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}