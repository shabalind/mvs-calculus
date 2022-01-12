import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s3 (
    p0: s0,
    p1: Vector[Vector[s0]]
  )
  @noinline
  def f0(v0: s3, v1: s0, v2: Double): Double = {
    val v5: Vector[Vector[s0]] = v0.p1
    val v3: Vector[s0] = v5(0)
    val v9: s0 = v3(0)
    val v8: Vector[Vector[Double]] = v9.p1
    val v23: Vector[Double] = v8(1)
    val v20: Double = v23(0)
    var v59: Vector[Double] = v23
    val v34: Double = v59(0)
    var v53: Double = v2
    val v54: Double = v20 + v34
    var v85: Double = v53
    v59 = v59.updated(0, v85)
    v54
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))), Vector(Vector(s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0))))))
    val v1: s0 = s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))
    val v2: Double = 12.0
    val start = nanoTime()
    var result: Double = 12.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}