import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  def f39(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v9: Vector[Double] = v0(0)
    var v16: Vector[Double] = v9
    var v33: Vector[Vector[Double]] = v0
    v33 = v33.updated(1, v16)
    var v20: Vector[Vector[Double]] = v33
    v20
  }
  def f35(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v3: Vector[Double] = v0(0)
    var v7: Vector[Vector[Double]] = v0
    var v4: Vector[Double] = v3
    var v9: Vector[Vector[Double]] = v7
    val v22: Vector[Double] = v0(0)
    v9 = v9.updated(0, v22)
    v9 = v9.updated(0, v4)
    var v10: Vector[Vector[Double]] = v9
    v7 = v7.updated(0, v22)
    var v23: Vector[Vector[Double]] = v10
    var v20: Vector[Double] = v3
    v7 = v7.updated(0, v20)
    v23
  }
  def f34(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v7: Vector[Double] = v0(0)
    val v3: Vector[Vector[Double]] = f35(v0)
    val v4: Vector[Double] = v3(0)
    var v6: Vector[Vector[Double]] = v0
    val v11: Vector[Vector[Double]] = f35(v6)
    val v1: Double = v4(0)
    v6 = v6.updated(0, v4)
    v6 = v6.updated(0, v7)
    var v10: Vector[Vector[Double]] = v11
    val v39: Vector[Double] = v0(0)
    val v14: Vector[Double] = Vector(v1)
    var v20: Vector[Double] = v39
    v6 = v6.updated(0, v20)
    v10 = v10.updated(0, v14)
    val v41: Vector[Vector[Double]] = f35(v10)
    v41
  }
  def f33(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v5: Vector[Double] = v0(1)
    val v4: Vector[Vector[Double]] = f39(v0)
    val v8: Vector[Vector[Double]] = f39(v4)
    val v11: Vector[Double] = v4(1)
    val v23: Vector[Vector[Double]] = f39(v0)
    var v9: Vector[Vector[Double]] = v23
    val v34: Vector[Vector[Double]] = f39(v8)
    val v22: Vector[Vector[Double]] = f39(v34)
    v9 = v22
    v9 = v9.updated(1, v5)
    v9 = v9.updated(1, v11)
    v9
  }
  def f31(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v6: Vector[Vector[Double]] = f39(v0)
    val v1: Vector[Vector[Double]] = f39(v6)
    var v3: Vector[Vector[Double]] = v0
    val v7: Vector[Vector[Double]] = f39(v3)
    val v11: Vector[Vector[Double]] = f33(v1)
    val v13: Vector[Double] = v6(0)
    val v2: Vector[Vector[Double]] = f39(v7)
    val v9: Vector[Vector[Double]] = f39(v11)
    v3 = v3.updated(1, v13)
    val v17: Vector[Double] = v2(0)
    val v12: Vector[Double] = v9(0)
    val v18: Vector[Vector[Double]] = f39(v11)
    var v72: Vector[Vector[Double]] = v18
    v72 = v72.updated(0, v17)
    var v38: Vector[Vector[Double]] = v72
    v38 = v38.updated(0, v13)
    val v83: Vector[Vector[Double]] = f33(v38)
    v38 = v38.updated(1, v12)
    v83
  }
  def f30(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v2: Vector[Vector[Double]] = f34(v0)
    val v6: Vector[Vector[Double]] = f34(v2)
    val v5: Vector[Vector[Double]] = f34(v6)
    var v1: Vector[Vector[Double]] = v6
    val v3: Vector[Vector[Double]] = f34(v0)
    val v7: Vector[Vector[Double]] = f34(v1)
    val v8: Vector[Double] = v5(0)
    v1 = v1.updated(0, v8)
    val v18: Vector[Double] = v0(0)
    val v11: Double = v18(0)
    val v16: Vector[Vector[Double]] = f35(v2)
    val v12: Vector[Double] = v1(0)
    val v20: Vector[Vector[Double]] = f34(v16)
    val v35: Vector[Vector[Double]] = f34(v16)
    var v22: Double = v11
    var v25: Vector[Double] = v12
    var v41: Vector[Vector[Double]] = v7
    val v21: Double = v22 + v11
    v25 = v25.updated(0, v21)
    val v32: Vector[Vector[Double]] = f35(v41)
    val v29: Vector[Vector[Double]] = f35(v20)
    var v138: Vector[Double] = v18
    val v49: Vector[Vector[Double]] = f34(v6)
    var v44: Vector[Double] = v8
    var v57: Vector[Double] = v138
    val v61: Vector[Vector[Double]] = f34(v29)
    val v46: Vector[Vector[Double]] = f35(v35)
    val v53: Vector[Vector[Double]] = f35(v3)
    v44 = v57
    val v104: Vector[Vector[Vector[Double]]] = Vector(v49, v3, v53, v49, v46, v20, v32)
    v41 = v41.updated(0, v25)
    var v128: Vector[Vector[Double]] = v53
    var v115: Vector[Vector[Double]] = v41
    val v97: Vector[Vector[Double]] = v104(0)
    v115 = v115.updated(0, v44)
    val v140: Vector[Vector[Double]] = v104(4)
    v1 = v1.updated(0, v57)
    val v118: Vector[Vector[Double]] = f34(v140)
    val v172: Vector[Vector[Vector[Double]]] = Vector(v128, v61, v41, v118, v32, v115)
    val v226: Vector[Vector[Double]] = v172(2)
    v1 = v97
    v226
  }
  def f15(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    var v6: Vector[Vector[Double]] = v0
    v6
  }
  def f9(v0: Vector[Vector[Double]], v1: Vector[Vector[Double]], v2: Vector[Vector[Double]], v3: Vector[Vector[Double]], v4: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v9: Vector[Vector[Double]] = f15(v2)
    val v11: Vector[Vector[Double]] = f15(v2)
    var v8: Vector[Vector[Double]] = v2
    var v21: Vector[Vector[Double]] = v11
    val v6: Vector[Vector[Double]] = f15(v11)
    val v18: Vector[Double] = v9(0)
    val v15: Vector[Vector[Double]] = f30(v2)
    val v23: Vector[Vector[Double]] = f15(v15)
    v8 = v8.updated(0, v18)
    v8 = v8.updated(0, v18)
    val v13: Vector[Double] = v21(0)
    val v34: Vector[Vector[Vector[Double]]] = Vector(v11, v11, v2, v6, v23, v8)
    val v33: Vector[Vector[Vector[Vector[Double]]]] = Vector(v34, v34, v34, v34, v34, v34)
    var v78: Vector[Vector[Vector[Vector[Double]]]] = v33
    val v27: Vector[Vector[Double]] = f34(v8)
    val v58: Vector[Vector[Vector[Double]]] = v78(0)
    val v52: Vector[Vector[Double]] = v58(5)
    val v46: Vector[Double] = v27(0)
    v8 = v8.updated(0, v46)
    val v168: Vector[Vector[Double]] = f35(v52)
    var v143: Vector[Vector[Double]] = v168
    v143 = v143.updated(0, v13)
    val v212: Vector[Vector[Double]] = f34(v143)
    v212
  }
  def f7(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    var v1: Vector[Vector[Double]] = v0
    val v4: Vector[Double] = v0(0)
    var v3: Vector[Vector[Double]] = v1
    val v5: Vector[Vector[Double]] = f39(v3)
    val v2: Vector[Double] = v5(1)
    val v10: Vector[Vector[Double]] = f31(v3)
    var v15: Vector[Vector[Double]] = v10
    v1 = v1.updated(0, v4)
    v3 = v3.updated(0, v2)
    v15
  }
  def f2(v0: Vector[Vector[Double]], v1: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v7: Vector[Vector[Double]] = f15(v1)
    val v9: Vector[Vector[Double]] = f34(v7)
    val v15: Vector[Vector[Vector[Double]]] = Vector(v9)
    var v16: Vector[Vector[Vector[Double]]] = v15
    v16 = v16.updated(0, v1)
    val v43: Vector[Vector[Vector[Vector[Double]]]] = Vector(v16, v16, v16, v16, v15, v16)
    var v38: Vector[Vector[Vector[Vector[Double]]]] = v43
    v38 = v43
    val v62: Vector[Vector[Vector[Double]]] = v38(0)
    val v113: Vector[Vector[Double]] = v62(0)
    var v94: Vector[Vector[Double]] = v113
    v94
  }
  @noinline
  def f0(v0: Vector[Double], v1: Vector[Double], v2: Vector[Vector[Double]], v3: Vector[Vector[Double]], v4: Double): Double = {
    val v5: Vector[Vector[Double]] = f33(v3)
    val v10: Vector[Vector[Double]] = f2(v5, v2)
    val v12: Vector[Vector[Double]] = f7(v3)
    val v19: Vector[Vector[Double]] = f34(v10)
    val v13: Vector[Vector[Double]] = f9(v2, v12, v19, v12, v12)
    val v20: Vector[Double] = v13(0)
    val v52: Double = v20(0)
    v52
  }
  def benchmark(): Unit = {
    val v0: Vector[Double] = Vector(0.0, 1.0, 2.0)
    val v1: Vector[Double] = Vector(3.0, 4.0, 5.0)
    val v2: Vector[Vector[Double]] = Vector(Vector(6.0))
    val v3: Vector[Vector[Double]] = Vector(Vector(7.0), Vector(8.0))
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