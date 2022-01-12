import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  @noinline
  def f0(v0: Double): Double = {
    val v3: Vector[Double] = Vector(v0)
    val v1: Vector[Vector[Double]] = Vector(v3, v3, v3, v3, v3, v3, v3)
    var v12: Vector[Vector[Double]] = v1
    v12 = v12.updated(4, v3)
    v12 = v12.updated(6, v3)
    val v5: Vector[Vector[Vector[Double]]] = Vector(v12)
    v12 = v12.updated(3, v3)
    val v11: Vector[Vector[Vector[Vector[Double]]]] = Vector(v5, v5, v5, v5, v5)
    v12 = v12.updated(4, v3)
    var v14: Vector[Vector[Vector[Vector[Double]]]] = v11
    val v17: Vector[Vector[Vector[Double]]] = v11(3)
    val v16: Vector[Vector[Vector[Double]]] = v14(0)
    val v21: Vector[Double] = v12(6)
    v12 = v12.updated(1, v21)
    var v30: Vector[Vector[Double]] = v12
    v12 = v12.updated(0, v21)
    v14 = v14.updated(4, v17)
    val v54: Vector[Vector[Double]] = v16(0)
    var v89: Vector[Double] = v21
    val v46: Vector[Double] = v54(5)
    val v50: Vector[Double] = v30(5)
    v12 = v12.updated(5, v50)
    val v96: Double = v46(0)
    var v104: Vector[Double] = v89
    v30 = v30.updated(5, v46)
    v30 = v30.updated(2, v104)
    v96
  }
  def benchmark(): Unit = {
    val v0: Double = 0.0
    val start = nanoTime()
    var result: Double = 0.0
    (1 to 1000).foreach { _ =>
      result = f0(v0)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}