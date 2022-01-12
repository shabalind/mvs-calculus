import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Double
  )
  case class s2 (
    p0: s1,
    p1: s1
  )
  case class s3 (
    p0: Vector[s0],
    p1: Vector[s1]
  )
  case class s8 (
    p0: s2,
    p1: s3
  )
  @noinline
  def f0(v0: Vector[s8], v1: Vector[s1], v2: Double): Double = {
    val v8: s8 = v0(0)
    val v6: s3 = v8.p1
    val v7: s1 = v1(0)
    val v10: Vector[s1] = Vector(v7, v7, v7, v7, v7)
    val v24: Vector[s1] = v6.p1
    val v85: s1 = v24(0)
    val v46: s1 = v10(1)
    val v57: Double = v46.p1
    val v44: Double = v57 / v57
    val v99: Double = v85.p1
    val v151: Double = v99 - v2
    val v141: Double = v151 + v44
    v141
  }
  def benchmark(): Unit = {
    val v0: Vector[s8] = Vector(s8(s2(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0))), 4.0), s1(s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0))), 9.0)), s3(Vector(s0(Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0))), s0(Vector(Vector(14.0), Vector(15.0)), Vector(Vector(16.0), Vector(17.0)))), Vector(s1(s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0), Vector(21.0))), 22.0), s1(s0(Vector(Vector(23.0), Vector(24.0)), Vector(Vector(25.0), Vector(26.0))), 27.0)))), s8(s2(s1(s0(Vector(Vector(28.0), Vector(29.0)), Vector(Vector(30.0), Vector(31.0))), 32.0), s1(s0(Vector(Vector(33.0), Vector(34.0)), Vector(Vector(35.0), Vector(36.0))), 37.0)), s3(Vector(s0(Vector(Vector(38.0), Vector(39.0)), Vector(Vector(40.0), Vector(41.0))), s0(Vector(Vector(42.0), Vector(43.0)), Vector(Vector(44.0), Vector(45.0)))), Vector(s1(s0(Vector(Vector(46.0), Vector(47.0)), Vector(Vector(48.0), Vector(49.0))), 50.0), s1(s0(Vector(Vector(51.0), Vector(52.0)), Vector(Vector(53.0), Vector(54.0))), 55.0)))))
    val v1: Vector[s1] = Vector(s1(s0(Vector(Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0))), 60.0))
    val v2: Double = 61.0
    val start = nanoTime()
    var result: Double = 61.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}