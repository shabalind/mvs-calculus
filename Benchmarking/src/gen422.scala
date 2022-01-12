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
  case class s3 (
    p0: Vector[s0],
    p1: s0
  )
  case class s5 (
    p0: s3,
    p1: Vector[s1]
  )
  case class s6 (
    p0: Vector[s5],
    p1: Double
  )
  def f32(v0: s5): s5 = {
    var v1: s5 = v0
    v1
  }
  @noinline
  def f0(v0: s6, v1: Double): Double = {
    val v7: Vector[s5] = v0.p0
    var v14: Vector[s5] = v7
    val v13: s5 = v14(1)
    v14 = v14.updated(2, v13)
    val v11: s5 = f32(v13)
    val v25: s6 = s6(v14, v1)
    val v22: s5 = f32(v11)
    v14 = v14.updated(2, v11)
    v14 = v14.updated(0, v22)
    val v72: Double = v25.p1
    v72
  }
  def benchmark(): Unit = {
    val v0: s6 = s6(Vector(s5(s3(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0))), s0(Vector(Vector(2.0)), Vector(Vector(3.0)))), s0(Vector(Vector(4.0)), Vector(Vector(5.0)))), Vector(s1(s0(Vector(Vector(6.0)), Vector(Vector(7.0))), s0(Vector(Vector(8.0)), Vector(Vector(9.0)))), s1(s0(Vector(Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0)))), s1(s0(Vector(Vector(14.0)), Vector(Vector(15.0))), s0(Vector(Vector(16.0)), Vector(Vector(17.0)))))), s5(s3(Vector(s0(Vector(Vector(18.0)), Vector(Vector(19.0))), s0(Vector(Vector(20.0)), Vector(Vector(21.0)))), s0(Vector(Vector(22.0)), Vector(Vector(23.0)))), Vector(s1(s0(Vector(Vector(24.0)), Vector(Vector(25.0))), s0(Vector(Vector(26.0)), Vector(Vector(27.0)))), s1(s0(Vector(Vector(28.0)), Vector(Vector(29.0))), s0(Vector(Vector(30.0)), Vector(Vector(31.0)))), s1(s0(Vector(Vector(32.0)), Vector(Vector(33.0))), s0(Vector(Vector(34.0)), Vector(Vector(35.0)))))), s5(s3(Vector(s0(Vector(Vector(36.0)), Vector(Vector(37.0))), s0(Vector(Vector(38.0)), Vector(Vector(39.0)))), s0(Vector(Vector(40.0)), Vector(Vector(41.0)))), Vector(s1(s0(Vector(Vector(42.0)), Vector(Vector(43.0))), s0(Vector(Vector(44.0)), Vector(Vector(45.0)))), s1(s0(Vector(Vector(46.0)), Vector(Vector(47.0))), s0(Vector(Vector(48.0)), Vector(Vector(49.0)))), s1(s0(Vector(Vector(50.0)), Vector(Vector(51.0))), s0(Vector(Vector(52.0)), Vector(Vector(53.0))))))), 54.0)
    val v1: Double = 55.0
    val start = nanoTime()
    var result: Double = 55.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}