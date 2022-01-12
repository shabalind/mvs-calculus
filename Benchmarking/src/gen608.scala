import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  @noinline
  def f0(v0: Vector[Vector[Double]], v1: Vector[Vector[Double]], v2: Double): Double = {
    val v5: Vector[Double] = Vector(v2, v2, v2, v2)
    var v11: Vector[Double] = v5
    var v3: Double = v2
    v11 = v11.updated(0, v2)
    val v6: Double = v11(2)
    v11 = v11.updated(1, v6)
    v11 = v11.updated(2, v6)
    val v22: Vector[Vector[Double]] = Vector(v5, v11, v5)
    var v59: Vector[Vector[Double]] = v22
    v11 = v11.updated(0, v3)
    var v51: Vector[Vector[Double]] = v22
    v51 = v51.updated(0, v11)
    val v76: Vector[Double] = v51(0)
    val v74: Vector[Double] = v59(1)
    val v58: Double = v74(3)
    v59 = v59.updated(2, v76)
    v58
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[Double]] = Vector(Vector(0.0))
    val v1: Vector[Vector[Double]] = Vector(Vector(1.0))
    val v2: Double = 2.0
    val start = nanoTime()
    var result: Double = 2.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}