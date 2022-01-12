import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0],
    p2: Vector[s0]
  )
  case class s3 (
    p0: s1,
    p1: s0
  )
  case class s4 (
    p0: Vector[s3],
    p1: Vector[s1]
  )
  @noinline
  def f0(v0: s4, v1: Double): Double = {
    var v5: Double = v1
    val v2: Double = v1 - v1
    val v15: Vector[Double] = Vector(v1, v2, v1)
    var v13: Vector[Double] = v15
    v5 = v2
    var v30: Double = v5
    v13 = v13.updated(0, v2)
    v13 = v13.updated(1, v5)
    var v46: Double = v30
    v13 = v13.updated(2, v46)
    v13 = v13.updated(1, v30)
    val v124: Double = v13(0)
    v124
  }
  def benchmark(): Unit = {
    val v0: s4 = s4(Vector(s3(s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0))), Vector(s0(Vector(Vector(2.0)), Vector(Vector(3.0)))), Vector(s0(Vector(Vector(4.0)), Vector(Vector(5.0))))), s0(Vector(Vector(6.0)), Vector(Vector(7.0)))), s3(s1(s0(Vector(Vector(8.0)), Vector(Vector(9.0))), Vector(s0(Vector(Vector(10.0)), Vector(Vector(11.0)))), Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0))))), s0(Vector(Vector(14.0)), Vector(Vector(15.0)))), s3(s1(s0(Vector(Vector(16.0)), Vector(Vector(17.0))), Vector(s0(Vector(Vector(18.0)), Vector(Vector(19.0)))), Vector(s0(Vector(Vector(20.0)), Vector(Vector(21.0))))), s0(Vector(Vector(22.0)), Vector(Vector(23.0))))), Vector(s1(s0(Vector(Vector(24.0)), Vector(Vector(25.0))), Vector(s0(Vector(Vector(26.0)), Vector(Vector(27.0)))), Vector(s0(Vector(Vector(28.0)), Vector(Vector(29.0))))), s1(s0(Vector(Vector(30.0)), Vector(Vector(31.0))), Vector(s0(Vector(Vector(32.0)), Vector(Vector(33.0)))), Vector(s0(Vector(Vector(34.0)), Vector(Vector(35.0))))), s1(s0(Vector(Vector(36.0)), Vector(Vector(37.0))), Vector(s0(Vector(Vector(38.0)), Vector(Vector(39.0)))), Vector(s0(Vector(Vector(40.0)), Vector(Vector(41.0)))))))
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