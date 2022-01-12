import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  case class s3 (
    p0: Vector[s0],
    p1: s1
  )
  case class s6 (
    p0: s3,
    p1: Vector[Double]
  )
  @noinline
  def f0(v0: Vector[s6], v1: Double): Double = {
    val v6: s6 = v0(0)
    var v7: Double = v1
    val v4: Vector[Double] = v6.p1
    val v8: Double = v4(0)
    var v13: Vector[Double] = v4
    v13 = v13.updated(0, v7)
    val v12: Double = v7 / v1
    v13 = v4
    val v38: Double = v4(1)
    v7 = v12
    v13 = v13.updated(0, v8)
    v13 = v13.updated(0, v38)
    val v83: Double = v13(1)
    val v97: Double = v83 / v12
    v97
  }
  def benchmark(): Unit = {
    val v0: Vector[s6] = Vector(s6(s3(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0)))), s1(Vector(s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0))), s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0)))), Vector(s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0)))))), Vector(20.0, 21.0)), s6(s3(Vector(s0(Vector(Vector(22.0)), Vector(Vector(23.0), Vector(24.0), Vector(25.0)))), s1(Vector(s0(Vector(Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0))), s0(Vector(Vector(30.0)), Vector(Vector(31.0), Vector(32.0), Vector(33.0))), s0(Vector(Vector(34.0)), Vector(Vector(35.0), Vector(36.0), Vector(37.0)))), Vector(s0(Vector(Vector(38.0)), Vector(Vector(39.0), Vector(40.0), Vector(41.0)))))), Vector(42.0, 43.0)))
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