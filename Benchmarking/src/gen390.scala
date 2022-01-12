import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s7 (
    p0: Double,
    p1: s0
  )
  @noinline
  def f0(v0: s7, v1: Double): Double = {
    val v6: Double = v1 + v1
    val v3: Vector[Double] = Vector(v1, v6, v6)
    val v5: Double = v0.p0
    var v10: Vector[Double] = v3
    val v7: Double = v10(2)
    val v28: Double = v3(2)
    v10 = v10.updated(1, v28)
    v10 = v10.updated(2, v1)
    val v31: Double = v10(2)
    val v21: Double = v28 * v31
    val v25: Vector[Double] = Vector(v7, v5, v5, v5)
    val v53: Double = v25(0)
    v10 = v10.updated(2, v21)
    v53
  }
  def benchmark(): Unit = {
    val v0: s7 = s7(0.0, s0(Vector(Vector(1.0), Vector(2.0), Vector(3.0)), Vector(Vector(4.0), Vector(5.0))))
    val v1: Double = 6.0
    val start = nanoTime()
    var result: Double = 6.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}