import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  def f72(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v2: Vector[Double] = v0(2)
    var v3: Vector[Vector[Double]] = v0
    v3 = v3.updated(2, v2)
    v3 = v3.updated(0, v2)
    val v12: Vector[Double] = v3(1)
    var v1: Vector[Vector[Double]] = v0
    v3 = v3.updated(2, v2)
    var v5: Vector[Vector[Double]] = v3
    val v7: Vector[Double] = v5(2)
    var v6: Vector[Double] = v2
    var v4: Vector[Double] = v12
    var v9: Vector[Double] = v7
    val v11: Vector[Double] = v1(1)
    val v10: Vector[Double] = v3(0)
    v4 = v7
    v3 = v3.updated(2, v12)
    val v18: Vector[Double] = v0(0)
    v5 = v5.updated(2, v12)
    var v20: Vector[Double] = v11
    val v24: Double = v10(0)
    v4 = v7
    v20 = v20.updated(0, v24)
    var v15: Vector[Vector[Double]] = v1
    val v19: Vector[Vector[Vector[Double]]] = Vector(v3, v0, v15)
    v15 = v15.updated(1, v9)
    var v17: Double = v24
    v15 = v15.updated(1, v6)
    val v30: Vector[Vector[Double]] = v19(0)
    val v16: Vector[Vector[Double]] = v19(0)
    v3 = v3.updated(1, v20)
    v3 = v3.updated(0, v6)
    var v31: Vector[Vector[Vector[Double]]] = v19
    val v22: Double = v18(0)
    v31 = v31.updated(2, v5)
    v4 = v4.updated(0, v17)
    v20 = v20.updated(0, v22)
    var v36: Vector[Vector[Vector[Double]]] = v31
    v36 = v36.updated(2, v16)
    v1 = v1.updated(0, v12)
    v36 = v36.updated(2, v30)
    v3 = v3.updated(0, v20)
    v9 = v9.updated(0, v22)
    v15 = v15.updated(0, v4)
    val v46: Vector[Vector[Double]] = v36(0)
    v46
  }
  def f67(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v2: Vector[Double] = v0(0)
    var v4: Vector[Double] = v2
    v4 = v2
    var v3: Vector[Vector[Double]] = v0
    val v5: Double = v2(0)
    var v1: Vector[Double] = v2
    v3 = v3.updated(0, v4)
    var v8: Vector[Vector[Double]] = v0
    v8 = v8.updated(0, v1)
    val v7: Double = v4(0)
    v1 = v1.updated(0, v5)
    var v9: Vector[Vector[Double]] = v3
    val v12: Vector[Double] = v8(1)
    val v15: Double = v2(0)
    v3 = v3.updated(0, v12)
    v1 = v1.updated(0, v15)
    v4 = v4.updated(0, v15)
    v4 = v4.updated(0, v5)
    v4 = v4.updated(0, v7)
    var v34: Vector[Vector[Double]] = v9
    v9 = v9.updated(1, v12)
    v34
  }
  def f63(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v2: Vector[Vector[Double]] = f72(v0)
    var v1: Vector[Vector[Double]] = v2
    val v6: Vector[Vector[Double]] = f72(v1)
    val v3: Vector[Vector[Double]] = f72(v1)
    val v9: Vector[Vector[Double]] = f72(v0)
    val v5: Vector[Vector[Double]] = f72(v3)
    val v11: Vector[Vector[Double]] = f72(v5)
    val v12: Vector[Double] = v3(1)
    val v21: Vector[Vector[Double]] = f72(v5)
    val v8: Vector[Vector[Double]] = f72(v1)
    var v36: Vector[Double] = v12
    var v20: Vector[Double] = v12
    val v10: Double = v12(0)
    v36 = v36.updated(0, v10)
    val v18: Vector[Vector[Double]] = f72(v0)
    val v24: Vector[Vector[Double]] = f72(v9)
    val v44: Double = v36(0)
    var v28: Double = v44
    v1 = v1.updated(1, v20)
    val v43: Vector[Vector[Vector[Double]]] = Vector(v6, v21, v1, v11, v18, v21, v8)
    var v101: Vector[Vector[Vector[Double]]] = v43
    val v121: Vector[Vector[Double]] = v101(4)
    v20 = v20.updated(0, v28)
    v101 = v101.updated(6, v24)
    v121
  }
  def f50(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v7: Vector[Vector[Double]] = f67(v0)
    var v2: Vector[Vector[Double]] = v7
    val v5: Vector[Vector[Double]] = f67(v7)
    val v1: Vector[Double] = v7(0)
    val v8: Vector[Vector[Double]] = f67(v2)
    v2 = v2.updated(0, v1)
    val v9: Vector[Vector[Double]] = f67(v8)
    val v11: Vector[Double] = v5(1)
    val v17: Vector[Double] = v5(0)
    val v10: Double = v1(0)
    var v15: Double = v10
    val v18: Double = v10 * v15
    v2 = v2.updated(0, v1)
    v2 = v2.updated(0, v17)
    v2 = v2.updated(0, v11)
    val v21: Vector[Vector[Double]] = f67(v8)
    var v32: Vector[Double] = v17
    v2 = v2.updated(0, v17)
    v2 = v2.updated(0, v17)
    var v40: Vector[Vector[Double]] = v9
    v40 = v40.updated(0, v32)
    v32 = v32.updated(0, v18)
    v2 = v2.updated(0, v32)
    val v57: Vector[Double] = v21(1)
    v40 = v40.updated(1, v57)
    v40
  }
  def f43(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v4: Vector[Double] = v0(0)
    var v1: Vector[Vector[Double]] = v0
    val v8: Vector[Double] = v1(0)
    var v7: Vector[Double] = v4
    var v6: Vector[Vector[Double]] = v1
    val v3: Vector[Double] = v6(0)
    v6 = v6.updated(0, v3)
    v1 = v1.updated(0, v7)
    v1 = v1.updated(0, v8)
    v6 = v6.updated(1, v8)
    val v10: Vector[Double] = v0(0)
    v6 = v6.updated(1, v10)
    val v16: Vector[Vector[Double]] = f67(v6)
    val v17: Vector[Double] = v6(1)
    val v20: Vector[Vector[Double]] = f67(v1)
    v1 = v1.updated(1, v17)
    val v15: Vector[Vector[Double]] = f67(v1)
    val v42: Vector[Vector[Double]] = f67(v16)
    val v32: Vector[Vector[Double]] = f67(v15)
    val v29: Vector[Vector[Double]] = f67(v42)
    val v34: Vector[Vector[Vector[Double]]] = Vector(v29, v32, v20)
    val v92: Vector[Vector[Double]] = v34(0)
    val v104: Vector[Vector[Double]] = f67(v92)
    v7 = v8
    v104
  }
  def f38(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v6: Vector[Vector[Double]] = f43(v0)
    val v3: Vector[Vector[Double]] = f43(v6)
    v3
  }
  def f33(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v5: Vector[Vector[Double]] = f38(v0)
    val v4: Vector[Vector[Double]] = f38(v5)
    val v6: Vector[Double] = v5(0)
    var v10: Vector[Vector[Double]] = v4
    val v7: Vector[Vector[Double]] = f38(v10)
    val v11: Vector[Vector[Double]] = f50(v7)
    val v3: Vector[Vector[Double]] = f43(v7)
    v10 = v10.updated(0, v6)
    v10 = v10.updated(0, v6)
    val v18: Vector[Vector[Vector[Double]]] = Vector(v10, v5, v11, v4, v4, v3, v11)
    val v17: Vector[Vector[Double]] = v18(1)
    var v31: Vector[Vector[Vector[Double]]] = v18
    v31 = v31.updated(2, v17)
    val v148: Vector[Vector[Double]] = v31(4)
    v148
  }
  def f2(v0: Vector[Vector[Double]], v1: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v2: Vector[Vector[Double]] = f33(v1)
    val v21: Vector[Vector[Double]] = f67(v1)
    val v38: Vector[Vector[Vector[Double]]] = Vector(v1, v2, v21)
    var v31: Vector[Vector[Vector[Double]]] = v38
    var v15: Vector[Vector[Vector[Double]]] = v31
    val v57: Vector[Vector[Vector[Vector[Double]]]] = Vector(v38, v15, v31, v38, v31, v15)
    val v54: Vector[Vector[Vector[Double]]] = v57(3)
    v15 = v15.updated(1, v21)
    val v74: Vector[Vector[Double]] = v54(1)
    v74
  }
  @noinline
  def f0(v0: Vector[Vector[Double]], v1: Vector[Vector[Double]], v2: Double): Double = {
    val v3: Vector[Double] = v1(1)
    val v10: Vector[Vector[Double]] = f2(v0, v1)
    var v8: Vector[Double] = v3
    val v11: Vector[Double] = v10(1)
    var v19: Vector[Vector[Double]] = v0
    val v16: Double = v11(0)
    v19 = v19.updated(2, v8)
    var v21: Vector[Double] = v11
    var v18: Vector[Vector[Double]] = v19
    var v35: Double = v2
    val v32: Vector[Vector[Double]] = f50(v1)
    val v38: Vector[Double] = v32(1)
    var v49: Vector[Double] = v38
    val v46: Double = v21(0)
    v49 = v49.updated(0, v46)
    v18 = v18.updated(1, v3)
    val v74: Double = v49(0)
    val v63: Vector[Double] = Vector(v16, v35, v74, v74)
    val v73: Vector[Vector[Double]] = f63(v18)
    var v50: Vector[Double] = v63
    val v66: Vector[Double] = v73(2)
    v21 = v49
    val v91: Double = v50(0)
    val v108: Double = v91 * v16
    v49 = v49.updated(0, v35)
    v21 = v66
    v108
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[Double]] = Vector(Vector(0.0), Vector(1.0), Vector(2.0))
    val v1: Vector[Vector[Double]] = Vector(Vector(3.0), Vector(4.0))
    val v2: Double = 5.0
    val start = nanoTime()
    var result: Double = 5.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}