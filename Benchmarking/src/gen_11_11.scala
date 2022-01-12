import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  @noinline
  def f0(v0: Vector[Vector[Double]], v1: Double): Double = {
    val v4: Double = v1 + v1
    var v3: Double = v4
    var v8: Double = v4
    val v13: Vector[Double] = Vector(v3, v3, v8, v1, v3, v3)
    var v17: Double = v1
    val v11: Double = v13(0)
    var v18: Vector[Double] = v13
    val v22: Double = v13(1)
    var v21: Vector[Double] = v13
    v21 = v18
    v18 = v18.updated(5, v11)
    var v19: Vector[Double] = v21
    val v55: Double = v19(0)
    v19 = v19.updated(1, v1)
    v19 = v19.updated(3, v22)
    v18 = v18.updated(0, v17)
    v19 = v18
    v55
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[Double]] = Vector(Vector(0.0))
    val v1: Double = 1.0
    val start = nanoTime()
    var result: Double = 1.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}