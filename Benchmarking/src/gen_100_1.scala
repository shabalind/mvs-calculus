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
    p1: Vector[s1]
  )
  case class s3 (
    p0: s2,
    p1: Double
  )
  @noinline
  def f0(v0: Vector[Vector[s3]], v1: Double): Double = {
    val v5: Vector[s3] = v0(0)
    val v4: s3 = v5(0)
    val v3: Vector[s3] = v0(0)
    var v6: s3 = v4
    val v8: s3 = v3(0)
    val v7: s3 = v3(0)
    val v10: s2 = v8.p0
    v6 = v6.copy(p1 = v1)
    v6 = v6.copy(p0 = v10)
    v6 = v7
    val v23: s3 = v3(0)
    val v17: Double = v1 * v1
    v6 = v23
    var v32: s3 = v6
    v6 = v6.copy(p0 = v10)
    var v30: Double = v1
    v32 = v32.copy(p0 = v10)
    v6 = v6.copy(p0 = v10)
    v6 = v6.copy(p1 = v1)
    v30 = v17
    val v41: Double = v32.p1
    val v87: Double = v30 * v41
    v87
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s3]] = Vector(Vector(s3(s2(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))), s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0)))), Vector(s1(s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0))), s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0)))), s1(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0))), s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0)))))), 18.0)))
    val v1: Double = 19.0
    val start = nanoTime()
    var result: Double = 19.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}