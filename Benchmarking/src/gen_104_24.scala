import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  @noinline
  def f0(v0: s0, v1: s0, v2: Double): Double = {
    val v6: Vector[Vector[Double]] = v0.p1
    val v3: Vector[Double] = v6(0)
    val v7: Double = v3(0)
    var v9: Vector[Double] = v3
    v9 = v9.updated(0, v7)
    val v12: Vector[Double] = v6(0)
    val v23: Double = v3(0)
    val v28: Double = v12(0)
    v9 = v9.updated(0, v23)
    v9 = v9.updated(0, v28)
    val v65: Double = v9(0)
    v65
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0)), Vector(Vector(1.0)))
    val v1: s0 = s0(Vector(Vector(2.0)), Vector(Vector(3.0)))
    val v2: Double = 4.0
    val start = nanoTime()
    var result: Double = 4.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}