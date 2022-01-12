import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  @noinline
  def f0(v0: Vector[Vector[Double]], v1: Double): Double = {
    val v4: Vector[Double] = v0(0)
    var v7: Vector[Double] = v4
    var v13: Vector[Double] = v7
    v7 = v7.updated(0, v1)
    v7 = v7.updated(0, v1)
    var v9: Vector[Double] = v13
    var v20: Vector[Double] = v9
    var v23: Vector[Double] = v20
    var v51: Vector[Double] = v23
    val v120: Double = v51(0)
    v120
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