import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  def f103(v0: Vector[Vector[Double]], v1: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v4: Vector[Double] = v0(0)
    var v3: Vector[Vector[Double]] = v1
    val v2: Vector[Double] = v3(0)
    var v7: Vector[Double] = v2
    v3 = v3.updated(0, v7)
    val v6: Double = v4(0)
    v7 = v7.updated(0, v6)
    var v9: Vector[Vector[Double]] = v3
    val v20: Vector[Vector[Vector[Double]]] = Vector(v9, v9, v0, v3, v1, v9, v0)
    v9 = v9.updated(0, v4)
    val v13: Double = v4(0)
    v7 = v7.updated(0, v13)
    v3 = v1
    val v32: Double = v2(0)
    var v21: Vector[Vector[Vector[Double]]] = v20
    var v29: Vector[Vector[Vector[Double]]] = v21
    var v41: Vector[Vector[Vector[Double]]] = v29
    val v67: Vector[Vector[Double]] = v41(3)
    v7 = v7.updated(0, v13)
    v7 = v7.updated(0, v32)
    v67
  }
  def f97(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v2: Vector[Double] = v0(0)
    val v5: Vector[Vector[Double]] = f103(v0, v0)
    var v7: Vector[Vector[Double]] = v0
    var v8: Vector[Vector[Double]] = v7
    var v1: Vector[Vector[Double]] = v0
    var v4: Vector[Vector[Double]] = v0
    v4 = v4.updated(0, v2)
    val v10: Vector[Vector[Double]] = f103(v7, v0)
    val v36: Vector[Double] = v4(0)
    val v18: Vector[Vector[Double]] = f103(v5, v0)
    val v31: Vector[Vector[Vector[Double]]] = Vector(v18, v18)
    val v15: Vector[Vector[Double]] = f103(v8, v10)
    var v92: Vector[Vector[Vector[Double]]] = v31
    v92 = v92.updated(1, v18)
    val v14: Vector[Double] = v18(0)
    var v26: Vector[Vector[Vector[Double]]] = v92
    val v29: Vector[Vector[Double]] = f103(v8, v8)
    v8 = v8.updated(0, v2)
    val v55: Vector[Vector[Double]] = f103(v8, v1)
    val v35: Vector[Vector[Double]] = v26(0)
    v7 = v7.updated(0, v14)
    var v47: Vector[Vector[Vector[Double]]] = v31
    val v60: Vector[Vector[Double]] = f103(v0, v7)
    v4 = v4.updated(0, v36)
    val v50: Vector[Vector[Double]] = f103(v29, v35)
    v4 = v4.updated(0, v2)
    val v65: Vector[Vector[Double]] = f103(v50, v60)
    val v37: Vector[Vector[Double]] = f103(v50, v4)
    val v84: Vector[Vector[Double]] = v47(0)
    v1 = v65
    val v54: Vector[Vector[Vector[Double]]] = Vector(v55, v37, v84)
    var v134: Vector[Vector[Vector[Double]]] = v54
    val v155: Vector[Vector[Double]] = v134(2)
    v92 = v92.updated(1, v15)
    v155
  }
  def f96(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v6: Vector[Vector[Double]] = f103(v0, v0)
    val v8: Vector[Vector[Double]] = f103(v0, v6)
    val v1: Vector[Vector[Double]] = f103(v8, v6)
    val v4: Vector[Vector[Double]] = f103(v8, v1)
    val v28: Vector[Vector[Double]] = f97(v1)
    val v12: Vector[Vector[Double]] = f103(v0, v1)
    val v11: Vector[Vector[Double]] = f103(v12, v28)
    val v30: Vector[Vector[Double]] = f103(v8, v4)
    val v38: Vector[Vector[Double]] = f97(v12)
    val v46: Vector[Vector[Double]] = f103(v8, v38)
    val v27: Vector[Vector[Double]] = f103(v30, v46)
    val v61: Vector[Vector[Double]] = f103(v6, v11)
    val v48: Vector[Vector[Double]] = f103(v27, v61)
    v48
  }
  def f85(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v6: Vector[Vector[Double]] = f96(v0)
    val v3: Vector[Vector[Double]] = f103(v6, v6)
    var v4: Vector[Vector[Double]] = v6
    val v2: Vector[Vector[Vector[Double]]] = Vector(v0, v0, v4, v4, v4, v3, v3)
    var v1: Vector[Vector[Vector[Double]]] = v2
    var v8: Vector[Vector[Vector[Double]]] = v2
    val v17: Vector[Vector[Double]] = f96(v6)
    v1 = v8
    var v11: Vector[Vector[Vector[Double]]] = v1
    val v10: Vector[Vector[Double]] = v2(0)
    v4 = v10
    val v20: Vector[Vector[Vector[Vector[Double]]]] = Vector(v8, v8, v11, v2, v11, v8)
    var v33: Vector[Vector[Vector[Double]]] = v11
    var v42: Vector[Vector[Vector[Vector[Double]]]] = v20
    var v28: Vector[Vector[Vector[Vector[Double]]]] = v20
    v28 = v28.updated(2, v2)
    val v32: Vector[Vector[Vector[Double]]] = v42(5)
    var v49: Vector[Vector[Vector[Double]]] = v33
    v28 = v28.updated(2, v33)
    var v98: Vector[Vector[Vector[Vector[Double]]]] = v28
    var v38: Vector[Vector[Vector[Double]]] = v49
    v42 = v42.updated(1, v38)
    v28 = v98
    val v53: Vector[Vector[Vector[Double]]] = v98(3)
    val v70: Vector[Vector[Double]] = v32(3)
    v28 = v28.updated(4, v8)
    v8 = v8.updated(5, v6)
    val v104: Vector[Vector[Double]] = f103(v70, v17)
    v42 = v42.updated(4, v53)
    v104
  }
  @noinline
  def f0(v0: Vector[Vector[Double]], v1: Vector[Vector[Double]], v2: Vector[Vector[Double]], v3: Double): Double = {
    val v7: Vector[Vector[Double]] = f85(v1)
    val v10: Vector[Double] = v7(0)
    val v13: Double = v10(0)
    v13
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[Double]] = Vector(Vector(0.0))
    val v1: Vector[Vector[Double]] = Vector(Vector(1.0))
    val v2: Vector[Vector[Double]] = Vector(Vector(2.0), Vector(3.0), Vector(4.0))
    val v3: Double = 5.0
    val start = nanoTime()
    var result: Double = 5.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}