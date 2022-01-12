import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  @noinline
  def f0(v0: Vector[Vector[Double]], v1: Vector[Vector[Double]], v2: Double): Double = {
    val v5: Vector[Double] = Vector(v2, v2, v2, v2, v2)
    val v28: Double = v2 + v2
    var v13: Vector[Double] = v5
    var v16: Vector[Double] = v13
    v13 = v16
    v13 = v13.updated(1, v28)
    v13 = v5
    val v31: Double = v13(1)
    val v38: Double = v16(4)
    val v60: Double = v16(4)
    val v44: Double = v38 - v31
    val v96: Double = v44 / v60
    v96
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[Double]] = Vector(Vector(0.0), Vector(1.0), Vector(2.0))
    val v1: Vector[Vector[Double]] = Vector(Vector(3.0), Vector(4.0), Vector(5.0))
    val v2: Double = 6.0
    val start = nanoTime()
    var result: Double = 6.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}