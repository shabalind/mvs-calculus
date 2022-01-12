import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  @noinline
  def f0(v0: Vector[Double], v1: Double): Double = {
    val v3: Double = v1 * v1
    var v7: Vector[Double] = v0
    val v6: Double = v7(0)
    v7 = v7.updated(1, v3)
    val v10: Double = v7(1)
    val v16: Double = v0(0)
    v7 = v7.updated(0, v16)
    val v18: Double = v0(0)
    val v14: Double = v0(0)
    var v29: Vector[Double] = v0
    v29 = v29.updated(0, v6)
    val v30: Double = v29(1)
    v7 = v7.updated(1, v14)
    v29 = v29.updated(0, v10)
    val v22: Double = v7(1)
    var v165: Vector[Double] = v29
    val v56: Vector[Vector[Double]] = Vector(v165, v165)
    var v87: Double = v18
    v7 = v7.updated(1, v87)
    v165 = v165.updated(0, v87)
    val v82: Vector[Double] = v56(1)
    val v95: Double = v82(0)
    v7 = v7.updated(1, v22)
    v165 = v165.updated(1, v30)
    v95
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