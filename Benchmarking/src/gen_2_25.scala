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
    p0: Vector[Vector[s1]],
    p1: Vector[Vector[s1]]
  )
  def f66(v0: s3): s3 = {
    v0
  }
  def f58(v0: s3): s3 = {
    var v3: s3 = v0
    val v4: s3 = f66(v3)
    val v13: Vector[Vector[s1]] = v0.p1
    v3 = v3.copy(p1 = v13)
    var v17: s3 = v4
    val v10: s3 = f66(v17)
    v10
  }
  @noinline
  def f0(v0: s3, v1: Double): Double = {
    val v3: s3 = f58(v0)
    val v2: Vector[Vector[s1]] = v3.p0
    val v4: Vector[s1] = v2(0)
    val v7: s1 = v4(0)
    val v10: s0 = v7.p1
    val v21: Vector[Vector[Double]] = v10.p0
    val v18: Vector[Double] = v21(0)
    val v67: Double = v18(0)
    v67
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(Vector(Vector(s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0))), s0(Vector(Vector(2.0)), Vector(Vector(3.0))))), Vector(s1(s0(Vector(Vector(4.0)), Vector(Vector(5.0))), s0(Vector(Vector(6.0)), Vector(Vector(7.0))))), Vector(s1(s0(Vector(Vector(8.0)), Vector(Vector(9.0))), s0(Vector(Vector(10.0)), Vector(Vector(11.0)))))), Vector(Vector(s1(s0(Vector(Vector(12.0)), Vector(Vector(13.0))), s0(Vector(Vector(14.0)), Vector(Vector(15.0))))), Vector(s1(s0(Vector(Vector(16.0)), Vector(Vector(17.0))), s0(Vector(Vector(18.0)), Vector(Vector(19.0)))))))
    val v1: Double = 20.0
    val start = nanoTime()
    var result: Double = 20.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}