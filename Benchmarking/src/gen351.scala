import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  def f57(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v2: Vector[Double] = v0(0)
    var v1: Vector[Vector[Double]] = v0
    val v4: Vector[Vector[Vector[Double]]] = Vector(v0, v1)
    var v5: Vector[Vector[Double]] = v0
    v5 = v5.updated(0, v2)
    v1 = v1.updated(0, v2)
    var v15: Vector[Vector[Double]] = v5
    val v12: Vector[Double] = v15(0)
    var v28: Vector[Vector[Vector[Double]]] = v4
    v15 = v15.updated(0, v12)
    var v23: Vector[Vector[Vector[Double]]] = v28
    v23 = v23.updated(0, v15)
    v15 = v5
    v28 = v28.updated(1, v1)
    val v157: Vector[Vector[Double]] = v23(0)
    v157
  }
  def f56(v0: Vector[Vector[Double]], v1: Vector[Vector[Double]], v2: Vector[Vector[Double]], v3: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v5: Vector[Vector[Double]] = f57(v2)
    var v15: Vector[Vector[Double]] = v5
    var v9: Vector[Vector[Double]] = v15
    v9
  }
  def f54(v0: Vector[Double]): Vector[Double] = {
    val v6: Double = v0(0)
    val v8: Double = v0(0)
    var v4: Double = v6
    var v3: Vector[Double] = v0
    v3 = v3.updated(0, v4)
    v3 = v0
    v3 = v3.updated(0, v8)
    v3
  }
  def f29(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v6: Vector[Vector[Double]] = f56(v0, v0, v0, v0)
    val v2: Vector[Vector[Double]] = f57(v6)
    v2
  }
  def f13(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v6: Vector[Vector[Double]] = f56(v0, v0, v0, v0)
    var v5: Vector[Vector[Double]] = v6
    var v9: Vector[Vector[Double]] = v5
    val v104: Vector[Vector[Double]] = f56(v6, v5, v0, v9)
    val v55: Vector[Vector[Double]] = f29(v104)
    v55
  }
  def f12(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    var v5: Vector[Vector[Double]] = v0
    val v6: Vector[Double] = v5(0)
    val v2: Vector[Vector[Double]] = f13(v5)
    val v1: Vector[Double] = v5(0)
    val v7: Double = v1(0)
    var v4: Vector[Double] = v6
    v5 = v5.updated(0, v6)
    val v13: Vector[Vector[Double]] = f56(v2, v0, v5, v0)
    v4 = v4.updated(0, v7)
    val v10: Vector[Double] = v2(0)
    v5 = v5.updated(0, v10)
    val v15: Vector[Vector[Double]] = f56(v0, v5, v0, v13)
    v5 = v5.updated(0, v4)
    val v18: Vector[Vector[Double]] = f57(v15)
    v18
  }
  @noinline
  def f0(v0: Vector[Vector[Double]], v1: Vector[Double], v2: Double): Double = {
    val v11: Vector[Vector[Double]] = f12(v0)
    val v10: Vector[Double] = v11(0)
    val v18: Vector[Vector[Double]] = Vector(v1, v1, v1)
    val v14: Vector[Double] = f54(v10)
    var v20: Vector[Vector[Double]] = v18
    val v46: Vector[Double] = v20(2)
    val v30: Double = v46(1)
    var v22: Vector[Double] = v14
    val v60: Double = v22(0)
    val v32: Vector[Vector[Double]] = Vector(v46, v46)
    var v16: Vector[Double] = v46
    v20 = v20.updated(0, v46)
    v16 = v16.updated(1, v60)
    var v92: Vector[Vector[Double]] = v32
    var v63: Vector[Double] = v46
    var v54: Vector[Vector[Double]] = v92
    v20 = v20.updated(1, v16)
    v92 = v92.updated(1, v46)
    val v53: Vector[Double] = v54(0)
    val v98: Double = v53(0)
    v63 = v63.updated(2, v30)
    v54 = v54.updated(1, v63)
    v98
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[Double]] = Vector(Vector(0.0))
    val v1: Vector[Double] = Vector(1.0, 2.0, 3.0)
    val v2: Double = 4.0
    val start = nanoTime()
    var result: Double = 4.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}