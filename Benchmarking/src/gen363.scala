import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  def f21(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    v0
  }
  def f19(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v1: Vector[Double] = v0(1)
    var v3: Vector[Vector[Double]] = v0
    v3 = v3.updated(0, v1)
    val v6: Vector[Double] = v3(0)
    val v8: Vector[Double] = v3(0)
    val v5: Vector[Vector[Double]] = f21(v0)
    val v13: Vector[Vector[Double]] = Vector(v1, v8)
    v3 = v3.updated(1, v6)
    val v14: Vector[Vector[Double]] = f21(v5)
    v3 = v3.updated(1, v6)
    var v100: Vector[Vector[Double]] = v13
    val v60: Vector[Double] = v14(0)
    v3 = v3.updated(0, v60)
    v100
  }
  def f18(v0: Vector[Vector[Double]], v1: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v7: Vector[Vector[Vector[Double]]] = Vector(v1, v0, v1)
    var v5: Vector[Vector[Double]] = v0
    var v4: Vector[Vector[Double]] = v1
    val v3: Vector[Vector[Double]] = f19(v4)
    val v6: Vector[Vector[Vector[Double]]] = Vector(v3)
    val v2: Vector[Vector[Double]] = f21(v5)
    var v11: Vector[Vector[Double]] = v3
    val v15: Vector[Vector[Double]] = f21(v4)
    var v8: Vector[Vector[Vector[Double]]] = v7
    val v9: Vector[Double] = v0(0)
    var v24: Vector[Double] = v9
    v5 = v5.updated(0, v24)
    v8 = v8.updated(0, v11)
    val v10: Double = v24(0)
    val v23: Vector[Double] = v15(0)
    v11 = v11.updated(0, v23)
    var v34: Vector[Double] = v23
    var v19: Vector[Vector[Vector[Double]]] = v8
    val v41: Double = v10 + v10
    v5 = v5.updated(1, v34)
    var v28: Double = v41
    v8 = v8.updated(1, v2)
    val v22: Vector[Vector[Double]] = f21(v2)
    v24 = v24.updated(0, v10)
    var v81: Vector[Vector[Vector[Double]]] = v6
    val v50: Vector[Vector[Double]] = v81(0)
    val v52: Vector[Double] = v22(0)
    v4 = v4.updated(1, v23)
    val v49: Vector[Double] = v50(0)
    v4 = v4.updated(0, v9)
    v11 = v11.updated(0, v34)
    v24 = v24.updated(0, v28)
    var v76: Vector[Vector[Vector[Double]]] = v19
    val v101: Vector[Vector[Vector[Vector[Double]]]] = Vector(v76, v19, v76, v8, v76, v8, v7)
    val v75: Vector[Vector[Vector[Double]]] = v101(5)
    v76 = v76.updated(1, v11)
    v81 = v6
    v5 = v5.updated(1, v52)
    val v149: Vector[Vector[Double]] = v75(0)
    v5 = v5.updated(1, v49)
    v149
  }
  def f16(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    var v4: Vector[Vector[Double]] = v0
    val v7: Vector[Double] = v0(1)
    var v6: Vector[Vector[Double]] = v4
    var v5: Vector[Vector[Double]] = v6
    val v1: Vector[Vector[Double]] = f18(v5, v5)
    v4 = v4.updated(1, v7)
    val v2: Vector[Vector[Double]] = f19(v6)
    val v13: Vector[Vector[Double]] = f19(v4)
    val v22: Vector[Vector[Double]] = f19(v6)
    val v35: Vector[Vector[Double]] = f18(v13, v2)
    v5 = v5.updated(0, v7)
    val v41: Vector[Vector[Double]] = f21(v13)
    val v34: Vector[Double] = v41(1)
    val v36: Vector[Vector[Double]] = f18(v22, v1)
    val v30: Vector[Vector[Double]] = f19(v5)
    val v19: Vector[Vector[Double]] = f19(v13)
    val v32: Vector[Vector[Vector[Double]]] = Vector(v35, v35, v19, v36, v6, v19, v5)
    val v37: Vector[Vector[Double]] = v32(4)
    var v92: Vector[Vector[Vector[Double]]] = v32
    v92 = v92.updated(3, v37)
    var v121: Vector[Vector[Vector[Double]]] = v32
    var v210: Vector[Vector[Vector[Double]]] = v121
    var v97: Vector[Vector[Vector[Double]]] = v92
    val v86: Vector[Vector[Vector[Vector[Double]]]] = Vector(v97, v92, v210, v97, v92, v210, v97)
    v210 = v210.updated(0, v6)
    val v131: Vector[Vector[Vector[Double]]] = v86(1)
    val v212: Vector[Vector[Double]] = v131(0)
    v6 = v6.updated(0, v34)
    v210 = v210.updated(2, v30)
    v212
  }
  @noinline
  def f0(v0: Vector[Vector[Double]], v1: Double): Double = {
    val v6: Vector[Vector[Double]] = f16(v0)
    val v5: Vector[Double] = v0(0)
    var v4: Double = v1
    val v7: Vector[Double] = v6(1)
    var v2: Vector[Double] = v5
    val v10: Double = v5(0)
    val v8: Double = v5(0)
    v2 = v2.updated(0, v8)
    v2 = v2.updated(0, v10)
    v2 = v2.updated(0, v10)
    var v21: Vector[Vector[Double]] = v0
    val v28: Vector[Vector[Double]] = f16(v21)
    v2 = v5
    var v26: Vector[Vector[Double]] = v28
    v2 = v2.updated(0, v4)
    v21 = v21.updated(0, v7)
    val v56: Vector[Double] = v26(1)
    val v41: Double = v56(0)
    v26 = v26.updated(1, v2)
    var v114: Vector[Vector[Double]] = v28
    v26 = v114
    v41
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