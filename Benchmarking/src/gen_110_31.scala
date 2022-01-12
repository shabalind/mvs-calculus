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
  def f0(v0: s3, v1: Double): Double = {
    var v2: Double = v1
    val v7: Double = v1 * v2
    v2 = v1
    v2 = v7
    var v34: Double = v1
    val v58: Double = v7 - v34
    val v41: Double = v2 - v7
    var v202: Double = v58
    val v83: Double = v41 + v41
    val v63: Double = v83 - v202
    v63
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0))), Vector(Vector(s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0)))), Vector(s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0))))))
    val v1: Double = 9.0
    val start = nanoTime()
    var result: Double = 9.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}