import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  def f44(v0: Vector[Double]): Vector[Double] = {
    var v7: Vector[Double] = v0
    var v4: Vector[Double] = v0
    var v3: Vector[Double] = v4
    val v5: Double = v7(0)
    val v1: Double = v7(0)
    v4 = v7
    val v2: Double = v7(0)
    val v12: Double = v5 * v1
    v3 = v3.updated(0, v2)
    var v11: Double = v12
    v3 = v0
    var v14: Double = v5
    var v18: Double = v1
    var v13: Double = v11
    v3 = v3.updated(0, v13)
    v3 = v4
    v3 = v3.updated(0, v13)
    v13 = v18
    v7 = v7.updated(0, v12)
    var v27: Vector[Double] = v3
    v27 = v27.updated(0, v11)
    v27 = v27.updated(0, v14)
    v3 = v3.updated(0, v12)
    var v37: Vector[Double] = v27
    v37
  }
  @noinline
  def f0(v0: Vector[Vector[Double]], v1: Double): Double = {
    val v5: Vector[Double] = v0(2)
    val v16: Vector[Double] = Vector(v1)
    val v12: Double = v5(0)
    val v17: Vector[Double] = f44(v5)
    val v14: Double = v16(0)
    var v28: Vector[Double] = v17
    v28 = v28.updated(0, v12)
    val v58: Double = v28(0)
    v28 = v28.updated(0, v14)
    v58
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