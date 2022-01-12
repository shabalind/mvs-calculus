import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  @noinline
  def f0(v0: Vector[Vector[Double]], v1: Vector[Vector[Double]], v2: Vector[Vector[Double]], v3: Vector[Vector[Double]], v4: Double): Double = {
    var v9: Double = v4
    v9 = v4
    var v28: Double = v4
    val v22: Vector[Double] = Vector(v9, v4, v28, v28, v9, v9)
    var v16: Vector[Double] = v22
    val v35: Vector[Double] = v1(1)
    v16 = v16.updated(2, v9)
    val v33: Double = v35(0)
    v16 = v22
    v28 = v33
    val v95: Vector[Vector[Double]] = Vector(v22, v16, v22, v16, v22, v16)
    var v219: Vector[Vector[Double]] = v95
    val v62: Vector[Double] = v219(1)
    val v105: Double = v62(5)
    v105
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[Double]] = Vector(Vector(0.0))
    val v1: Vector[Vector[Double]] = Vector(Vector(1.0), Vector(2.0), Vector(3.0))
    val v2: Vector[Vector[Double]] = Vector(Vector(4.0), Vector(5.0), Vector(6.0))
    val v3: Vector[Vector[Double]] = Vector(Vector(7.0))
    val v4: Double = 8.0
    val start = nanoTime()
    var result: Double = 8.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}