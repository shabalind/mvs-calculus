import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  @noinline
  def f0(v0: Vector[Vector[Double]], v1: Vector[Vector[Double]], v2: Vector[Vector[Double]], v3: Double): Double = {
    val v4: Vector[Double] = v2(2)
    val v19: Double = v4(0)
    var v34: Double = v19
    val v50: Double = v19 * v19
    val v92: Vector[Double] = Vector(v50, v50, v34, v3, v3)
    val v84: Double = v92(1)
    var v132: Vector[Double] = v92
    v132 = v132.updated(3, v84)
    var v347: Vector[Double] = v132
    val v441: Double = v347(1)
    v441
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[Double]] = Vector(Vector(0.0))
    val v1: Vector[Vector[Double]] = Vector(Vector(1.0), Vector(2.0))
    val v2: Vector[Vector[Double]] = Vector(Vector(3.0), Vector(4.0), Vector(5.0))
    val v3: Double = 6.0
    val start = nanoTime()
    var result: Double = 6.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}