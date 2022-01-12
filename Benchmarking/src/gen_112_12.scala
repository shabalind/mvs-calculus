import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s2 (
    p0: s0
  )
  case class s3 (
    p0: s1,
    p1: Vector[Vector[s2]]
  )
  @noinline
  def f0(v0: Vector[s3], v1: s0, v2: Double): Double = {
    val v7: Vector[Double] = Vector(v2, v2, v2, v2, v2)
    var v5: Vector[Double] = v7
    val v9: Double = v7(2)
    var v11: Double = v2
    v5 = v5.updated(1, v9)
    var v12: Double = v9
    v5 = v5.updated(1, v11)
    val v18: Double = v5(2)
    v5 = v5.updated(2, v18)
    v5 = v5.updated(3, v18)
    v5 = v5.updated(3, v12)
    v5 = v5.updated(3, v12)
    v5 = v5.updated(4, v2)
    val v46: Double = v5(0)
    val v41: Double = v9 * v11
    var v50: Double = v18
    v5 = v5.updated(1, v41)
    v5 = v5.updated(3, v46)
    v12 = v46
    v50
  }
  def benchmark(): Unit = {
    val v0: Vector[s3] = Vector(s3(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0))), Vector(s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0))))), Vector(Vector(s2(s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0))))))))
    val v1: s0 = s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0)))
    val v2: Double = 16.0
    val start = nanoTime()
    var result: Double = 16.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}