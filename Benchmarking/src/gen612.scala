import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  def f7(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    var v6: Vector[Vector[Double]] = v0
    val v4: Vector[Vector[Vector[Double]]] = Vector(v0, v6, v6, v0, v6, v0, v6)
    val v3: Vector[Vector[Double]] = v4(3)
    val v7: Vector[Vector[Double]] = v4(2)
    var v1: Vector[Vector[Vector[Double]]] = v4
    val v5: Vector[Vector[Double]] = v4(4)
    val v2: Vector[Vector[Double]] = v4(2)
    var v15: Vector[Vector[Vector[Double]]] = v1
    val v10: Vector[Vector[Double]] = v4(6)
    var v14: Vector[Vector[Vector[Double]]] = v1
    val v20: Vector[Double] = v6(1)
    var v12: Vector[Vector[Double]] = v6
    var v19: Vector[Vector[Vector[Double]]] = v1
    var v29: Vector[Vector[Double]] = v3
    var v28: Vector[Vector[Vector[Double]]] = v15
    v12 = v12.updated(2, v20)
    val v42: Vector[Vector[Double]] = v19(4)
    val v27: Vector[Vector[Double]] = v4(4)
    val v50: Vector[Double] = v10(1)
    v1 = v1.updated(3, v29)
    v12 = v12.updated(1, v50)
    val v34: Double = v50(0)
    val v57: Vector[Vector[Double]] = v4(2)
    var v43: Vector[Double] = v50
    v1 = v1.updated(5, v5)
    v19 = v19.updated(0, v2)
    v15 = v15.updated(6, v7)
    v14 = v14.updated(6, v57)
    val v93: Vector[Double] = v10(0)
    val v83: Vector[Vector[Double]] = v19(6)
    var v56: Vector[Double] = v93
    val v74: Vector[Vector[Vector[Vector[Double]]]] = Vector(v14, v14, v1, v28, v15)
    v15 = v15.updated(4, v12)
    v12 = v12.updated(1, v93)
    val v98: Vector[Vector[Vector[Double]]] = v74(3)
    v14 = v14.updated(0, v42)
    v12 = v12.updated(0, v56)
    v43 = v50
    v19 = v19.updated(4, v83)
    v56 = v56.updated(0, v34)
    val v181: Vector[Vector[Double]] = v98(1)
    v12 = v12.updated(2, v43)
    v6 = v27
    v14 = v14.updated(4, v57)
    v181
  }
  def f4(v0: Vector[Vector[Double]], v1: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v8: Vector[Double] = v0(2)
    var v13: Vector[Vector[Double]] = v0
    var v10: Vector[Vector[Double]] = v13
    val v11: Vector[Vector[Double]] = f7(v1)
    val v20: Vector[Vector[Double]] = f7(v11)
    var v34: Vector[Vector[Double]] = v13
    val v66: Vector[Vector[Vector[Double]]] = Vector(v10, v20, v20, v1, v13)
    var v30: Vector[Vector[Vector[Double]]] = v66
    v30 = v30.updated(4, v34)
    val v64: Vector[Vector[Double]] = v30(1)
    v34 = v34.updated(0, v8)
    v64
  }
  def f2(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    var v4: Vector[Vector[Double]] = v0
    val v10: Vector[Vector[Double]] = f7(v4)
    val v11: Vector[Vector[Double]] = f4(v4, v10)
    val v1: Vector[Vector[Double]] = f7(v11)
    val v20: Vector[Vector[Double]] = f4(v1, v11)
    val v13: Vector[Vector[Double]] = f4(v10, v0)
    val v21: Vector[Vector[Double]] = f7(v0)
    val v34: Vector[Vector[Double]] = f7(v13)
    val v23: Vector[Vector[Vector[Double]]] = Vector(v10, v21, v1, v20)
    var v30: Vector[Vector[Vector[Double]]] = v23
    v30 = v30.updated(0, v10)
    val v47: Vector[Vector[Double]] = v30(3)
    v4 = v34
    v47
  }
  @noinline
  def f0(v0: Vector[Vector[Double]], v1: Vector[Vector[Double]], v2: Vector[Vector[Double]], v3: Vector[Vector[Double]], v4: Double): Double = {
    val v5: Vector[Vector[Double]] = f2(v0)
    val v14: Vector[Double] = v5(0)
    val v51: Double = v14(0)
    var v77: Double = v51
    v77
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[Double]] = Vector(Vector(0.0), Vector(1.0), Vector(2.0))
    val v1: Vector[Vector[Double]] = Vector(Vector(3.0), Vector(4.0))
    val v2: Vector[Vector[Double]] = Vector(Vector(5.0), Vector(6.0), Vector(7.0))
    val v3: Vector[Vector[Double]] = Vector(Vector(8.0))
    val v4: Double = 9.0
    val start = nanoTime()
    var result: Double = 9.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}