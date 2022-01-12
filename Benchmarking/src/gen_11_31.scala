import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  @noinline
  def f0(v0: Vector[Vector[Double]], v1: Vector[Vector[Double]], v2: Vector[Vector[Double]], v3: Double): Double = {
    val v5: Vector[Double] = v2(0)
    val v7: Vector[Double] = v2(1)
    val v10: Double = v7(0)
    val v9: Double = v5(0)
    var v19: Double = v10
    v19 = v10
    val v70: Vector[Double] = Vector(v3, v3, v19, v9)
    val v16: Vector[Vector[Double]] = Vector(v70, v70, v70)
    val v44: Vector[Double] = v2(1)
    val v37: Vector[Double] = v16(2)
    val v152: Double = v37(2)
    val v108: Double = v44(0)
    val v124: Double = v108 * v152
    var v137: Double = v124
    v137
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[Double]] = Vector(Vector(0.0), Vector(1.0))
    val v1: Vector[Vector[Double]] = Vector(Vector(2.0), Vector(3.0))
    val v2: Vector[Vector[Double]] = Vector(Vector(4.0), Vector(5.0))
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