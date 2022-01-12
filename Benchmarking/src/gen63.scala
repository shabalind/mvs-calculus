import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  def f69(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    v0
  }
  def f63(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v2: Vector[Vector[Double]] = f69(v0)
    val v7: Vector[Vector[Double]] = f69(v0)
    var v4: Vector[Vector[Double]] = v0
    val v5: Vector[Double] = v7(0)
    val v11: Vector[Vector[Double]] = f69(v2)
    val v20: Vector[Vector[Double]] = f69(v11)
    var v12: Vector[Double] = v5
    val v24: Vector[Double] = v2(0)
    val v45: Vector[Vector[Double]] = f69(v4)
    val v31: Double = v24(0)
    val v25: Vector[Vector[Double]] = f69(v20)
    val v37: Vector[Vector[Double]] = f69(v45)
    val v49: Vector[Double] = v25(0)
    val v96: Double = v49(0)
    var v65: Double = v96
    var v114: Vector[Double] = v12
    v12 = v12.updated(0, v96)
    var v93: Double = v31
    val v78: Vector[Double] = v37(0)
    var v97: Vector[Double] = v114
    v114 = v114.updated(0, v65)
    var v100: Vector[Vector[Double]] = v7
    var v95: Vector[Double] = v78
    v114 = v95
    v65 = v93
    v100 = v100.updated(0, v97)
    v100
  }
  def f39(v0: Vector[Double], v1: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v2: Vector[Vector[Vector[Double]]] = Vector(v1, v1, v1)
    var v6: Vector[Vector[Vector[Double]]] = v2
    v6 = v2
    val v3: Vector[Vector[Double]] = v6(0)
    val v16: Vector[Vector[Double]] = f63(v3)
    val v32: Vector[Vector[Double]] = f63(v1)
    v6 = v6.updated(0, v32)
    v16
  }
  def f13(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    var v7: Vector[Vector[Double]] = v0
    var v8: Vector[Vector[Double]] = v0
    val v9: Vector[Double] = v8(0)
    val v4: Vector[Vector[Double]] = Vector(v9, v9, v9, v9, v9, v9)
    var v11: Vector[Vector[Double]] = v4
    val v16: Vector[Vector[Double]] = f39(v9, v7)
    var v26: Vector[Vector[Double]] = v11
    v7 = v0
    var v10: Vector[Double] = v9
    val v27: Double = v9(0)
    var v18: Double = v27
    var v30: Vector[Double] = v10
    val v25: Vector[Double] = v4(0)
    val v22: Vector[Double] = v26(4)
    val v24: Vector[Vector[Double]] = f63(v8)
    val v29: Vector[Vector[Double]] = f39(v22, v16)
    v8 = v8.updated(0, v30)
    v11 = v11.updated(0, v30)
    v30 = v30.updated(0, v18)
    v7 = v24
    v11 = v11.updated(2, v25)
    v29
  }
  @noinline
  def f0(v0: Vector[Vector[Double]], v1: Vector[Vector[Double]], v2: Vector[Vector[Double]], v3: Double): Double = {
    val v4: Vector[Double] = v2(0)
    val v13: Vector[Vector[Double]] = f13(v2)
    val v23: Vector[Double] = v13(0)
    var v14: Vector[Double] = v4
    v14 = v23
    v14 = v14.updated(0, v3)
    val v118: Double = v14(0)
    var v54: Double = v118
    var v90: Double = v54
    v14 = v14.updated(0, v54)
    v90
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[Double]] = Vector(Vector(0.0))
    val v1: Vector[Vector[Double]] = Vector(Vector(1.0), Vector(2.0))
    val v2: Vector[Vector[Double]] = Vector(Vector(3.0))
    val v3: Double = 4.0
    val start = nanoTime()
    var result: Double = 4.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}