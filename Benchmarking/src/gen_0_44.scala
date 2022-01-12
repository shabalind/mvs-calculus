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
    p0: Vector[Vector[s1]],
    p1: s0
  )
  def f29(v0: s3): s3 = {
    var v8: s3 = v0
    v8
  }
  @noinline
  def f0(v0: s3, v1: Double): Double = {
    val v4: s3 = f29(v0)
    val v2: Double = v1 / v1
    val v11: s0 = v4.p1
    val v23: Vector[Vector[Double]] = v11.p0
    var v21: Double = v2
    val v46: Vector[Double] = v23(0)
    var v95: Vector[Double] = v46
    v95 = v95.updated(0, v1)
    val v131: Double = v95(0)
    v95 = v95.updated(0, v21)
    val v171: Double = v21 * v131
    v171
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(Vector(Vector(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))), s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0)))), Vector(s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0))), s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0))))))), s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0))))
    val v1: Double = 18.0
    val start = nanoTime()
    var result: Double = 18.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}