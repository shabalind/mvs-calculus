import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  @noinline
  def f0(v0: Vector[Vector[Double]], v1: Double): Double = {
    val v7: Vector[Double] = v0(1)
    var v3: Double = v1
    val v4: Vector[Double] = v0(0)
    val v8: Vector[Double] = v0(1)
    var v15: Vector[Double] = v7
    val v9: Vector[Double] = v0(1)
    val v13: Vector[Vector[Double]] = Vector(v8, v7, v9, v4, v8, v15)
    val v11: Vector[Double] = v0(0)
    v15 = v15.updated(0, v3)
    val v6: Vector[Double] = v0(1)
    val v18: Vector[Double] = v0(0)
    var v14: Vector[Vector[Double]] = v13
    val v16: Double = v6(0)
    v15 = v15.updated(0, v16)
    v14 = v13
    v14 = v14.updated(0, v6)
    val v30: Vector[Double] = v0(1)
    v14 = v14.updated(0, v18)
    v15 = v15.updated(0, v16)
    v14 = v14.updated(0, v11)
    val v39: Double = v30(0)
    v15 = v15.updated(0, v39)
    val v41: Vector[Double] = v14(3)
    val v219: Double = v41(0)
    v219
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[Double]] = Vector(Vector(0.0), Vector(1.0))
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