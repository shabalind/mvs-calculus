import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  @noinline
  def f0(v0: Vector[Double], v1: Double): Double = {
    val v4: Double = v0(2)
    val v3: Vector[Double] = Vector(v1, v4)
    val v2: Double = v3(0)
    val v15: Double = v3(0)
    var v11: Double = v4
    var v6: Double = v2
    val v26: Double = v0(2)
    val v23: Double = v11 - v11
    val v18: Double = v23 * v1
    var v21: Double = v6
    val v27: Vector[Double] = Vector(v18, v21, v1, v26, v15, v26)
    val v69: Double = v27(5)
    v69
  }
  def benchmark(): Unit = {
    val v0: Vector[Double] = Vector(0.0, 1.0, 2.0)
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