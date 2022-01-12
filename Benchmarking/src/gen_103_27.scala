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
    p0: Vector[Vector[s1]],
    p1: s1
  )
  case class s6 (
    p0: s2,
    p1: s0
  )
  case class s8 (
    p0: Vector[s0],
    p1: Vector[s6]
  )
  @noinline
  def f0(v0: Vector[Vector[s8]], v1: Double): Double = {
    val v5: Vector[s8] = v0(0)
    var v2: Vector[Vector[s8]] = v0
    val v7: Vector[s8] = v2(0)
    val v6: s8 = v7(0)
    val v8: Vector[s6] = v6.p1
    val v34: s6 = v8(1)
    val v15: s2 = v34.p0
    val v36: s1 = v15.p1
    v2 = v2.updated(0, v7)
    v2 = v2.updated(0, v5)
    val v61: Double = v1 + v1
    val v67: s0 = v36.p1
    val v89: Vector[Vector[Double]] = v67.p0
    val v64: Vector[Double] = v89(2)
    val v108: Double = v64(0)
    val v79: Double = v61 + v108
    v79
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s8]] = Vector(Vector(s8(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0)))), Vector(s6(s2(Vector(Vector(s1(s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0))), s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0)))))), s1(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0))), s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0))))), s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0)))), s6(s2(Vector(Vector(s1(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0))), s0(Vector(Vector(28.0), Vector(29.0), Vector(30.0)), Vector(Vector(31.0)))))), s1(s0(Vector(Vector(32.0), Vector(33.0), Vector(34.0)), Vector(Vector(35.0))), s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0))))), s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0))))))))
    val v1: Double = 44.0
    val start = nanoTime()
    var result: Double = 44.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}