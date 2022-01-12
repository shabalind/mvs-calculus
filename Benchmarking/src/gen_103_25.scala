import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  case class s2 (
    p0: s0,
    p1: s1
  )
  case class s3 (
    p0: s2,
    p1: s1
  )
  def f39(v0: Double): Double = {
    var v4: Double = v0
    var v6: Double = v4
    v6 = v4
    var v2: Double = v6
    var v12: Double = v2
    var v19: Double = v12
    v19
  }
  @noinline
  def f0(v0: Vector[Vector[s3]], v1: Double): Double = {
    val v6: Double = f39(v1)
    val v2: Vector[Double] = Vector(v6, v1, v6, v1, v6, v6)
    val v12: Double = v2(5)
    val v18: Double = f39(v12)
    v18
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s3]] = Vector(Vector(s3(s2(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))), s1(Vector(s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0))), s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0)))), s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0))))), s1(Vector(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0))), s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0)))), s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0)))))), Vector(s3(s2(s0(Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0))), s1(Vector(s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0))), s0(Vector(Vector(27.0), Vector(28.0)), Vector(Vector(29.0)))), s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0))))), s1(Vector(s0(Vector(Vector(33.0), Vector(34.0)), Vector(Vector(35.0))), s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0)))), s0(Vector(Vector(39.0), Vector(40.0)), Vector(Vector(41.0)))))))
    val v1: Double = 42.0
    val start = nanoTime()
    var result: Double = 42.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}