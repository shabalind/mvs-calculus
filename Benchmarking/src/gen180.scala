import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  def f29(v0: Vector[Vector[Double]], v1: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v6: Vector[Vector[Vector[Double]]] = Vector(v1, v1, v1, v1)
    var v7: Vector[Vector[Vector[Double]]] = v6
    val v17: Vector[Vector[Double]] = v6(2)
    v7 = v7.updated(0, v17)
    val v33: Vector[Vector[Double]] = v7(1)
    v7 = v6
    var v82: Vector[Vector[Vector[Double]]] = v7
    v7 = v7.updated(1, v17)
    v7 = v82
    v33
  }
  def f26(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    v0
  }
  def f17(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v4: Vector[Vector[Double]] = f26(v0)
    val v13: Vector[Vector[Double]] = f26(v4)
    val v1: Vector[Vector[Double]] = f26(v4)
    var v18: Vector[Vector[Double]] = v1
    v18 = v13
    val v54: Vector[Vector[Double]] = f26(v18)
    v54
  }
  def f15(v0: Vector[Vector[Double]], v1: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v5: Vector[Vector[Double]] = f17(v1)
    val v28: Vector[Vector[Double]] = f26(v5)
    val v60: Vector[Vector[Double]] = f17(v28)
    v60
  }
  def f10(v0: Vector[Vector[Double]], v1: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v7: Vector[Double] = v0(1)
    var v3: Vector[Vector[Double]] = v0
    var v6: Vector[Double] = v7
    val v2: Double = v7(0)
    v6 = v6.updated(0, v2)
    val v13: Vector[Vector[Double]] = f15(v0, v3)
    val v5: Vector[Double] = v13(1)
    var v16: Vector[Double] = v5
    val v54: Vector[Vector[Double]] = Vector(v6, v16)
    var v26: Vector[Vector[Double]] = v54
    val v37: Vector[Vector[Double]] = f29(v26, v1)
    val v46: Vector[Double] = v1(1)
    v26 = v26.updated(1, v46)
    v37
  }
  @noinline
  def f0(v0: Vector[Vector[Double]], v1: Double): Double = {
    val v3: Vector[Vector[Double]] = f26(v0)
    val v4: Vector[Vector[Double]] = f10(v0, v3)
    val v5: Vector[Double] = v4(2)
    var v7: Vector[Double] = v5
    val v2: Vector[Double] = v3(0)
    v7 = v7.updated(0, v1)
    v7 = v7.updated(0, v1)
    v7 = v7.updated(0, v1)
    v7 = v7.updated(0, v1)
    v7 = v7.updated(0, v1)
    v7 = v7.updated(0, v1)
    val v10: Double = v1 / v1
    var v15: Double = v1
    val v11: Double = v2(0)
    v7 = v7.updated(0, v11)
    v15 = v11
    v7 = v7.updated(0, v10)
    val v29: Double = v7(0)
    val v16: Double = v29 * v15
    val v43: Vector[Double] = Vector(v1, v16, v10)
    v7 = v7.updated(0, v16)
    v7 = v7.updated(0, v11)
    val v37: Double = v43(2)
    v7 = v7.updated(0, v29)
    v37
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