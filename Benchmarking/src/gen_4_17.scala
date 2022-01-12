import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  @noinline
  def f0(v0: s0, v1: Double): Double = {
    val v5: Double = v1 * v1
    val v7: Vector[Vector[Double]] = v0.p0
    val v6: Vector[Vector[Double]] = v0.p0
    val v8: Vector[Double] = v7(1)
    val v12: Vector[Double] = v7(1)
    var v47: Vector[Double] = v8
    v47 = v12
    v47 = v47.updated(0, v5)
    val v21: Vector[Double] = v6(0)
    val v26: Double = v47(0)
    v47 = v12
    v47 = v21
    v26
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0)))
    val v1: Double = 5.0
    val start = nanoTime()
    var result: Double = 5.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}