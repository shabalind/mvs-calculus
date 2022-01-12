import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  @noinline
  def f0(v0: Vector[Vector[Double]], v1: Double): Double = {
    val v3: Vector[Double] = v0(1)
    val v5: Double = v3(0)
    val v7: Double = v3(0)
    val v10: Double = v3(0)
    val v21: Vector[Double] = Vector(v7, v7, v7, v7, v5, v10)
    var v35: Vector[Double] = v21
    val v20: Double = v21(0)
    v35 = v35.updated(5, v20)
    var v32: Vector[Double] = v21
    v32 = v32.updated(1, v7)
    var v31: Vector[Double] = v32
    var v180: Vector[Double] = v31
    v180 = v35
    val v98: Double = v180(0)
    v98
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