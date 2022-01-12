import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  @noinline
  def f0(v0: Vector[Double], v1: Double): Double = {
    var v6: Double = v1
    var v2: Double = v6
    var v4: Double = v2
    var v3: Vector[Double] = v0
    v3 = v3.updated(1, v4)
    var v13: Double = v2
    v3 = v3.updated(1, v13)
    v2 = v13
    val v10: Double = v3(1)
    var v9: Double = v1
    var v19: Vector[Double] = v0
    v3 = v0
    v3 = v3.updated(1, v1)
    v9 = v10
    val v63: Double = v2 - v9
    v3 = v3.updated(0, v13)
    v3 = v19
    v19 = v19.updated(1, v13)
    v63
  }
  def benchmark(): Unit = {
    val v0: Vector[Double] = Vector(0.0, 1.0)
    val v1: Double = 2.0
    val start = nanoTime()
    var result: Double = 2.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}