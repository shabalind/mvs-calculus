import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  def f52(v0: Double): Double = {
    var v1: Double = v0
    var v2: Double = v0
    var v4: Double = v1
    var v8: Double = v0
    var v5: Double = v1
    var v3: Double = v8
    var v14: Double = v2
    var v12: Double = v5
    var v10: Double = v5
    var v9: Double = v14
    var v24: Double = v5
    val v6: Double = v2 + v3
    var v18: Double = v2
    val v15: Double = v8 / v6
    var v11: Double = v4
    val v35: Double = v18 * v4
    var v17: Double = v24
    var v20: Double = v5
    var v28: Double = v14
    v10 = v20
    var v25: Double = v12
    var v23: Double = v28
    var v21: Double = v6
    val v55: Vector[Double] = Vector(v35, v17, v21, v28, v8, v10, v15)
    val v49: Double = v55(0)
    v23 = v49
    val v67: Vector[Double] = Vector(v25, v11, v10)
    val v44: Vector[Vector[Double]] = Vector(v67, v67, v67, v67, v67, v67, v67)
    var v57: Vector[Double] = v67
    v57 = v57.updated(0, v23)
    var v58: Vector[Vector[Double]] = v44
    v58 = v58.updated(0, v57)
    val v304: Vector[Double] = v58(6)
    v57 = v57.updated(2, v9)
    val v147: Double = v304(0)
    v147
  }
  def f34(v0: Double): Double = {
    var v6: Double = v0
    v6 = v0
    val v1: Double = f52(v6)
    val v5: Double = f52(v1)
    var v7: Double = v5
    var v2: Double = v1
    val v10: Double = f52(v2)
    val v16: Vector[Double] = Vector(v5, v1, v2, v0, v7, v10)
    var v30: Vector[Double] = v16
    val v23: Double = v30(4)
    v30 = v30.updated(4, v0)
    val v51: Double = f52(v23)
    v51
  }
  @noinline
  def f0(v0: Vector[Vector[Double]], v1: Vector[Double], v2: Double): Double = {
    var v3: Vector[Double] = v1
    val v6: Double = v1(0)
    v3 = v3.updated(0, v2)
    var v20: Vector[Double] = v3
    v20 = v20.updated(0, v6)
    var v9: Double = v6
    var v24: Double = v2
    v20 = v20.updated(0, v6)
    v3 = v3.updated(0, v24)
    var v17: Double = v9
    v3 = v3.updated(0, v2)
    v20 = v20.updated(0, v24)
    v20 = v20.updated(0, v2)
    v20 = v20.updated(0, v17)
    var v10: Vector[Double] = v20
    val v29: Double = v10(0)
    v10 = v10.updated(0, v6)
    val v14: Double = v3(0)
    v20 = v20.updated(0, v14)
    v20 = v20.updated(0, v2)
    v20 = v20.updated(0, v24)
    var v99: Double = v2
    val v230: Double = f34(v24)
    v3 = v3.updated(0, v17)
    v3 = v3.updated(0, v9)
    v20 = v20.updated(0, v230)
    val v128: Double = v29 + v99
    v128
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[Double]] = Vector(Vector(0.0), Vector(1.0), Vector(2.0))
    val v1: Vector[Double] = Vector(3.0)
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