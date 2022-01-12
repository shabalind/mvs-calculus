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
    p0: Vector[s1]
  )
  case class s3 (
    p0: s2,
    p1: s2
  )
  @noinline
  def f0(v0: s3, v1: Double): Double = {
    val v5: Vector[Double] = Vector(v1, v1, v1, v1)
    val v7: Vector[Double] = Vector(v1, v1, v1, v1, v1, v1, v1)
    val v3: Double = v5(1)
    val v2: Double = v7(2)
    val v13: Double = v7(0)
    val v15: Double = v2 * v13
    val v25: Double = v5(2)
    val v38: Double = v5(0)
    val v35: Double = v15 / v25
    val v43: Double = v35 * v3
    val v181: Double = v43 * v38
    v181
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(s2(Vector(s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0))), s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0)))))), s2(Vector(s1(s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0))), s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0)))))))
    val v1: Double = 12.0
    val start = nanoTime()
    var result: Double = 12.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}