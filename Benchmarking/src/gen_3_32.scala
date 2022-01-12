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
    p0: s1,
    p1: s0
  )
  case class s3 (
    p0: Vector[Vector[s2]],
    p1: s1
  )
  case class s9 (
    p0: s3,
    p1: s0
  )
  @noinline
  def f0(v0: s9, v1: Vector[s1], v2: Vector[s0], v3: Double): Double = {
    val v8: s3 = v0.p0
    val v7: Vector[Vector[s2]] = v8.p0
    val v4: Vector[s2] = v7(0)
    var v13: Vector[s2] = v4
    val v16: Vector[Vector[s2]] = v8.p0
    val v26: Vector[s2] = v16(1)
    val v31: s2 = v13(0)
    val v25: s0 = v31.p1
    v13 = v26
    val v50: Vector[Vector[Double]] = v25.p0
    val v83: Vector[Double] = v50(0)
    val v73: Double = v83(0)
    val v108: Double = v73 / v73
    v108
  }
  def benchmark(): Unit = {
    val v0: s9 = s9(s3(Vector(Vector(s2(s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0))), s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0)))), s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0))))), Vector(s2(s1(s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0)))), s0(Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0))))), Vector(s2(s1(s0(Vector(Vector(18.0)), Vector(Vector(19.0), Vector(20.0))), s0(Vector(Vector(21.0)), Vector(Vector(22.0), Vector(23.0)))), s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0)))))), s1(s0(Vector(Vector(27.0)), Vector(Vector(28.0), Vector(29.0))), s0(Vector(Vector(30.0)), Vector(Vector(31.0), Vector(32.0))))), s0(Vector(Vector(33.0)), Vector(Vector(34.0), Vector(35.0))))
    val v1: Vector[s1] = Vector(s1(s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0))), s0(Vector(Vector(39.0)), Vector(Vector(40.0), Vector(41.0)))), s1(s0(Vector(Vector(42.0)), Vector(Vector(43.0), Vector(44.0))), s0(Vector(Vector(45.0)), Vector(Vector(46.0), Vector(47.0)))), s1(s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0))), s0(Vector(Vector(51.0)), Vector(Vector(52.0), Vector(53.0)))))
    val v2: Vector[s0] = Vector(s0(Vector(Vector(54.0)), Vector(Vector(55.0), Vector(56.0))), s0(Vector(Vector(57.0)), Vector(Vector(58.0), Vector(59.0))))
    val v3: Double = 60.0
    val start = nanoTime()
    var result: Double = 60.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}