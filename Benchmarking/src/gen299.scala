import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  @noinline
  def f0(v0: Vector[Vector[Double]], v1: Vector[Vector[Double]], v2: Double): Double = {
    var v7: Double = v2
    val v8: Vector[Double] = v1(1)
    val v5: Vector[Double] = v1(1)
    val v9: Double = v8(0)
    val v13: Vector[Double] = Vector(v7, v9, v9)
    val v28: Double = v5(0)
    val v21: Double = v13(0)
    var v50: Vector[Double] = v13
    v50 = v50.updated(0, v28)
    val v72: Double = v50(0)
    v7 = v21
    var v208: Double = v72
    v208
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[Double]] = Vector(Vector(0.0), Vector(1.0))
    val v1: Vector[Vector[Double]] = Vector(Vector(2.0), Vector(3.0), Vector(4.0))
    val v2: Double = 5.0
    val start = nanoTime()
    var result: Double = 5.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}