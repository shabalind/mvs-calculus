import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  @noinline
  def f0(v0: Vector[Vector[Double]], v1: Double): Double = {
    var v6: Double = v1
    var v4: Double = v6
    val v10: Vector[Double] = Vector(v6, v1, v6, v4, v1, v1, v6)
    v6 = v1
    var v17: Vector[Double] = v10
    val v32: Double = v10(5)
    val v42: Double = v4 * v32
    v17 = v17.updated(1, v42)
    var v26: Vector[Double] = v17
    val v97: Double = v26(3)
    v26 = v26.updated(4, v1)
    v97
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[Double]] = Vector(Vector(0.0), Vector(1.0), Vector(2.0))
    val v1: Double = 3.0
    val start = nanoTime()
    var result: Double = 3.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}