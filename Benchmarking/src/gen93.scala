import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  def f6(v0: Vector[Vector[Double]], v1: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v2: Vector[Double] = v1(0)
    var v3: Vector[Vector[Double]] = v1
    var v5: Vector[Vector[Double]] = v3
    var v7: Vector[Vector[Double]] = v5
    v3 = v3.updated(1, v2)
    val v8: Vector[Double] = v0(1)
    var v14: Vector[Double] = v8
    val v10: Double = v2(0)
    v3 = v5
    v14 = v14.updated(0, v10)
    v3 = v3.updated(1, v14)
    v7
  }
  @noinline
  def f0(v0: Vector[Vector[Double]], v1: Vector[Vector[Double]], v2: Vector[Vector[Double]], v3: Double): Double = {
    val v11: Vector[Vector[Double]] = f6(v1, v1)
    val v10: Vector[Double] = v0(2)
    val v12: Vector[Vector[Double]] = f6(v1, v1)
    var v16: Vector[Vector[Double]] = v1
    val v14: Vector[Vector[Double]] = f6(v11, v16)
    val v18: Vector[Vector[Double]] = f6(v12, v1)
    v16 = v16.updated(1, v10)
    val v27: Vector[Double] = v14(1)
    val v43: Vector[Double] = v11(0)
    val v79: Vector[Double] = v18(0)
    val v53: Vector[Double] = v11(0)
    var v96: Vector[Double] = v53
    var v102: Vector[Double] = v79
    val v146: Vector[Vector[Double]] = Vector(v79, v27, v96, v43, v102)
    v16 = v16.updated(0, v96)
    val v127: Vector[Double] = v146(0)
    v16 = v16.updated(0, v127)
    val v142: Double = v127(0)
    v142
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[Double]] = Vector(Vector(0.0), Vector(1.0), Vector(2.0))
    val v1: Vector[Vector[Double]] = Vector(Vector(3.0), Vector(4.0))
    val v2: Vector[Vector[Double]] = Vector(Vector(5.0), Vector(6.0), Vector(7.0))
    val v3: Double = 8.0
    val start = nanoTime()
    var result: Double = 8.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}