import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  def f6(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v16: Vector[Double] = v0(1)
    var v12: Vector[Vector[Double]] = v0
    var v29: Vector[Double] = v16
    var v51: Vector[Vector[Double]] = v12
    v12 = v12.updated(1, v29)
    v51
  }
  def f3(v0: Vector[Vector[Double]], v1: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v8: Vector[Vector[Double]] = f6(v0)
    val v4: Vector[Double] = v8(1)
    var v7: Vector[Vector[Double]] = v0
    val v6: Vector[Vector[Double]] = f6(v0)
    var v9: Vector[Double] = v4
    val v12: Vector[Vector[Double]] = f6(v7)
    val v17: Vector[Vector[Vector[Double]]] = Vector(v8, v8, v1, v6, v12, v8)
    val v18: Double = v9(0)
    v9 = v9.updated(0, v18)
    v7 = v7.updated(1, v9)
    val v29: Vector[Vector[Double]] = v17(5)
    v29
  }
  @noinline
  def f0(v0: Double, v1: Vector[Vector[Double]]): Double = {
    var v2: Vector[Vector[Double]] = v1
    val v7: Vector[Vector[Double]] = f6(v2)
    val v6: Vector[Double] = Vector(v0, v0, v0)
    val v3: Vector[Double] = v7(0)
    v2 = v2.updated(1, v3)
    v2 = v2.updated(1, v3)
    val v5: Vector[Vector[Double]] = f6(v7)
    val v9: Vector[Vector[Double]] = f3(v2, v1)
    v2 = v1
    val v18: Vector[Vector[Double]] = Vector(v3, v3, v3, v3, v3, v3)
    val v8: Vector[Vector[Double]] = f3(v7, v9)
    val v19: Vector[Vector[Double]] = f3(v7, v1)
    val v25: Vector[Vector[Double]] = f3(v1, v19)
    v2 = v2.updated(2, v3)
    v2 = v7
    val v29: Vector[Vector[Double]] = f3(v8, v5)
    var v41: Vector[Double] = v6
    val v36: Vector[Vector[Double]] = f6(v5)
    var v58: Vector[Double] = v3
    var v15: Vector[Vector[Double]] = v18
    val v35: Vector[Double] = v29(1)
    var v24: Vector[Double] = v58
    val v27: Vector[Vector[Double]] = f3(v36, v5)
    var v37: Vector[Vector[Double]] = v15
    v15 = v15.updated(5, v24)
    v2 = v25
    val v47: Vector[Double] = v37(3)
    val v39: Vector[Double] = v27(2)
    v15 = v37
    val v88: Double = v47(0)
    v2 = v2.updated(0, v24)
    v37 = v37.updated(4, v35)
    val v59: Double = v41(0)
    v24 = v24.updated(0, v59)
    v37 = v37.updated(5, v39)
    v37 = v37.updated(2, v24)
    v88
  }
  def benchmark(): Unit = {
    val v0: Double = 0.0
    val v1: Vector[Vector[Double]] = Vector(Vector(1.0), Vector(2.0), Vector(3.0))
    val start = nanoTime()
    var result: Double = [[1.0], [2.0], [3.0]]
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}