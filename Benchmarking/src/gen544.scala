import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  @noinline
  def f0(v0: Vector[Vector[Double]], v1: Vector[Vector[Double]], v2: Vector[Vector[Double]], v3: Vector[Vector[Double]], v4: Vector[Vector[Double]], v5: Vector[Double], v6: Double, v7: Vector[Vector[Double]]): Double = {
    val v11: Vector[Double] = v1(1)
    val v20: Vector[Double] = v2(0)
    var v12: Double = v6
    val v15: Double = v11(0)
    val v9: Double = v20(0)
    val v13: Double = v20(0)
    val v59: Vector[Double] = Vector(v13, v15, v9, v6, v12)
    val v77: Double = v11(0)
    v12 = v77
    val v132: Vector[Vector[Double]] = Vector(v59, v59)
    val v105: Vector[Double] = v132(0)
    val v154: Double = v105(3)
    v154
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[Double]] = Vector(Vector(0.0))
    val v1: Vector[Vector[Double]] = Vector(Vector(1.0), Vector(2.0), Vector(3.0))
    val v2: Vector[Vector[Double]] = Vector(Vector(4.0))
    val v3: Vector[Vector[Double]] = Vector(Vector(5.0), Vector(6.0), Vector(7.0))
    val v4: Vector[Vector[Double]] = Vector(Vector(8.0), Vector(9.0), Vector(10.0))
    val v5: Vector[Double] = Vector(11.0)
    val v6: Double = 12.0
    val v7: Vector[Vector[Double]] = Vector(Vector(13.0))
    val start = nanoTime()
    var result: Double = [[13.0]]
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4, v5, v6, v7)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}