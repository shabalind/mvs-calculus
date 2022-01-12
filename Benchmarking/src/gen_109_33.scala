import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  @noinline
  def f0(v0: Vector[Vector[Double]], v1: Vector[Vector[Double]], v2: Vector[Vector[Double]], v3: Vector[Vector[Double]], v4: Vector[Vector[Double]], v5: Double): Double = {
    val v6: Vector[Double] = v3(0)
    val v9: Vector[Double] = v2(0)
    val v15: Double = v6(0)
    val v11: Vector[Double] = v1(0)
    val v29: Double = v11(0)
    var v27: Double = v15
    val v19: Double = v29 / v27
    val v40: Double = v9(0)
    v27 = v15
    val v59: Double = v19 / v40
    v59
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[Double]] = Vector(Vector(0.0))
    val v1: Vector[Vector[Double]] = Vector(Vector(1.0))
    val v2: Vector[Vector[Double]] = Vector(Vector(2.0))
    val v3: Vector[Vector[Double]] = Vector(Vector(3.0))
    val v4: Vector[Vector[Double]] = Vector(Vector(4.0), Vector(5.0))
    val v5: Double = 6.0
    val start = nanoTime()
    var result: Double = 6.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4, v5)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}