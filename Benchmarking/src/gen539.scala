import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  @noinline
  def f0(v0: Double): Double = {
    var v1: Double = v0
    var v5: Double = v1
    val v3: Vector[Double] = Vector(v1, v5, v1, v0, v5, v1, v0)
    v1 = v5
    val v6: Double = v3(3)
    val v2: Double = v3(1)
    val v10: Double = v3(3)
    var v8: Double = v10
    var v7: Vector[Double] = v3
    var v18: Double = v8
    var v23: Double = v18
    v7 = v7.updated(1, v1)
    v7 = v7.updated(3, v23)
    v7 = v7.updated(0, v2)
    v7 = v7.updated(5, v6)
    val v38: Double = v7(0)
    var v36: Vector[Double] = v3
    v36 = v36.updated(0, v38)
    val v79: Double = v36(2)
    v79
  }
  def benchmark(): Unit = {
    val v0: Double = 0.0
    val start = nanoTime()
    var result: Double = 0.0
    (1 to 1000).foreach { _ =>
      result = f0(v0)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}