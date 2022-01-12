import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  def f8(v0: Vector[Vector[Double]], v1: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    var v4: Vector[Vector[Double]] = v0
    val v3: Vector[Vector[Vector[Double]]] = Vector(v0, v4, v4, v0, v1)
    var v7: Vector[Vector[Double]] = v1
    val v6: Vector[Vector[Double]] = v3(4)
    var v8: Vector[Vector[Double]] = v7
    var v9: Vector[Vector[Vector[Double]]] = v3
    v9 = v9.updated(3, v6)
    var v5: Vector[Vector[Vector[Double]]] = v9
    val v11: Vector[Double] = v8(0)
    v4 = v4.updated(1, v11)
    v9 = v9.updated(1, v1)
    var v17: Vector[Vector[Vector[Double]]] = v9
    val v20: Vector[Vector[Double]] = v5(4)
    v17 = v17.updated(3, v20)
    var v42: Vector[Vector[Vector[Double]]] = v5
    v9 = v5
    v9 = v9.updated(3, v4)
    v17 = v42
    val v39: Vector[Vector[Double]] = v17(3)
    var v51: Vector[Vector[Double]] = v1
    v5 = v5.updated(1, v8)
    v17 = v17.updated(0, v51)
    v39
  }
  @noinline
  def f0(v0: Vector[Vector[Double]], v1: Double): Double = {
    val v2: Vector[Vector[Double]] = f8(v0, v0)
    var v5: Vector[Vector[Double]] = v2
    val v9: Vector[Vector[Double]] = f8(v0, v5)
    val v6: Vector[Double] = v5(0)
    v5 = v5.updated(1, v6)
    val v18: Vector[Double] = v0(1)
    val v11: Vector[Double] = v5(1)
    val v14: Vector[Vector[Double]] = Vector(v6, v6, v11, v6)
    val v10: Vector[Vector[Double]] = f8(v0, v9)
    v5 = v5.updated(1, v6)
    val v15: Vector[Vector[Double]] = f8(v5, v10)
    val v35: Vector[Vector[Double]] = f8(v9, v10)
    val v21: Vector[Vector[Double]] = f8(v9, v35)
    var v22: Vector[Vector[Double]] = v14
    val v42: Vector[Vector[Double]] = f8(v15, v21)
    val v33: Vector[Vector[Double]] = f8(v2, v42)
    val v58: Vector[Double] = v33(1)
    val v48: Double = v58(0)
    val v47: Vector[Double] = v22(2)
    v22 = v22.updated(1, v18)
    val v53: Vector[Double] = v33(0)
    v5 = v5.updated(1, v47)
    v5 = v5.updated(1, v53)
    v48
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