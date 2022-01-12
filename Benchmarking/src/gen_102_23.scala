import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  def f25(v0: Vector[Vector[Double]], v1: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    var v4: Vector[Vector[Double]] = v1
    var v2: Vector[Vector[Double]] = v1
    val v3: Vector[Double] = v1(1)
    var v5: Vector[Vector[Double]] = v2
    v4 = v4.updated(1, v3)
    v5 = v5.updated(1, v3)
    v5 = v5.updated(0, v3)
    v5 = v5.updated(1, v3)
    v4 = v4.updated(0, v3)
    var v6: Vector[Double] = v3
    v2 = v2.updated(1, v3)
    v5 = v5.updated(0, v6)
    var v9: Vector[Double] = v6
    val v7: Double = v3(0)
    v9 = v9.updated(0, v7)
    v2 = v2.updated(0, v6)
    v5 = v5.updated(1, v6)
    v5 = v4
    val v16: Double = v6(0)
    var v13: Vector[Vector[Double]] = v5
    val v22: Vector[Double] = v13(0)
    v5 = v5.updated(1, v9)
    v4 = v4.updated(1, v22)
    val v24: Double = v9(0)
    val v37: Vector[Double] = v1(1)
    v2 = v2.updated(1, v3)
    v2 = v2.updated(0, v22)
    val v28: Vector[Vector[Double]] = Vector(v22, v6, v6, v3)
    v4 = v4.updated(0, v6)
    v9 = v9.updated(0, v16)
    v4 = v4.updated(1, v37)
    v9 = v9.updated(0, v24)
    v13 = v13.updated(0, v6)
    val v52: Vector[Double] = v28(2)
    v5 = v5.updated(1, v22)
    val v41: Vector[Vector[Vector[Double]]] = Vector(v13, v0)
    v2 = v2.updated(1, v52)
    var v81: Vector[Vector[Vector[Double]]] = v41
    var v186: Vector[Vector[Vector[Double]]] = v81
    v186 = v186.updated(0, v0)
    val v115: Vector[Vector[Double]] = v186(1)
    v115
  }
  def f17(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v5: Vector[Vector[Double]] = f25(v0, v0)
    var v9: Vector[Vector[Double]] = v0
    val v1: Vector[Vector[Double]] = f25(v5, v5)
    val v14: Vector[Vector[Double]] = f25(v1, v9)
    val v16: Vector[Vector[Double]] = f25(v14, v5)
    v16
  }
  def f16(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    var v5: Vector[Vector[Double]] = v0
    val v1: Vector[Vector[Double]] = f25(v5, v0)
    val v6: Vector[Double] = v0(0)
    var v4: Vector[Double] = v6
    var v3: Vector[Double] = v6
    var v13: Vector[Vector[Double]] = v1
    v5 = v5.updated(1, v4)
    val v22: Vector[Vector[Double]] = f25(v5, v13)
    val v31: Vector[Vector[Double]] = f17(v22)
    v5 = v5.updated(0, v3)
    v5 = v5.updated(0, v6)
    v31
  }
  def f15(v0: Vector[Vector[Double]], v1: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v3: Vector[Vector[Double]] = f25(v0, v1)
    var v2: Vector[Vector[Double]] = v0
    v2 = v3
    val v5: Vector[Double] = v2(1)
    v2 = v2.updated(1, v5)
    val v8: Vector[Vector[Double]] = f17(v2)
    val v11: Double = v5(0)
    v2 = v2.updated(1, v5)
    var v21: Vector[Double] = v5
    v21 = v21.updated(0, v11)
    v2 = v2.updated(0, v21)
    val v32: Vector[Vector[Double]] = f17(v8)
    var v28: Vector[Vector[Double]] = v32
    v28 = v28.updated(1, v21)
    v28
  }
  def f14(v0: Double): Double = {
    var v3: Double = v0
    var v7: Double = v0
    var v6: Double = v7
    var v4: Double = v0
    var v2: Double = v7
    var v11: Double = v4
    var v5: Double = v7
    var v1: Double = v11
    var v9: Double = v5
    val v8: Double = v5 / v9
    v3 = v9
    var v10: Double = v9
    val v13: Double = v1 / v10
    var v20: Double = v10
    val v30: Vector[Double] = Vector(v6, v9, v8)
    val v19: Double = v30(2)
    var v17: Vector[Double] = v30
    val v14: Double = v17(2)
    val v12: Double = v2 / v13
    val v26: Double = v30(0)
    var v24: Vector[Double] = v17
    var v27: Vector[Double] = v30
    val v22: Double = v14 + v19
    var v29: Vector[Double] = v30
    v29 = v27
    val v52: Double = v29(0)
    var v31: Double = v10
    v27 = v27.updated(1, v14)
    var v33: Vector[Double] = v30
    val v43: Vector[Double] = Vector(v0, v31, v22, v20, v13)
    v24 = v24.updated(2, v9)
    var v44: Double = v12
    var v45: Vector[Double] = v43
    v29 = v29.updated(2, v44)
    v11 = v22
    var v54: Vector[Double] = v24
    val v64: Double = v54(0)
    var v51: Vector[Double] = v45
    val v28: Vector[Double] = Vector(v3, v64, v52, v64)
    v45 = v51
    val v32: Double = v51(4)
    val v60: Double = v28(2)
    val v57: Vector[Double] = Vector(v10, v1, v32, v4, v52, v13, v26)
    v45 = v43
    var v79: Vector[Double] = v28
    var v100: Vector[Double] = v79
    val v85: Double = v28(0)
    val v94: Double = v100(1)
    var v56: Vector[Double] = v57
    var v55: Vector[Double] = v56
    v51 = v51.updated(4, v85)
    var v116: Vector[Double] = v100
    var v103: Vector[Double] = v116
    v54 = v33
    v29 = v29.updated(0, v10)
    val v130: Double = v55(3)
    v116 = v116.updated(0, v130)
    val v174: Double = v103(0)
    v27 = v27.updated(2, v174)
    val v155: Double = v57(2)
    var v72: Double = v94
    val v148: Double = v155 - v60
    v33 = v33.updated(2, v72)
    v148
  }
  def f8(v0: Vector[Vector[Double]], v1: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v6: Vector[Double] = v1(1)
    var v3: Vector[Double] = v6
    val v7: Double = v6(0)
    val v2: Vector[Double] = v1(1)
    val v5: Vector[Vector[Double]] = f15(v0, v1)
    val v14: Double = v3(0)
    val v12: Vector[Vector[Double]] = f16(v1)
    var v8: Vector[Double] = v2
    val v9: Double = f14(v7)
    var v10: Vector[Vector[Double]] = v12
    val v29: Vector[Vector[Vector[Double]]] = Vector(v5, v0, v5, v10, v12)
    var v13: Vector[Vector[Vector[Double]]] = v29
    var v15: Double = v14
    v3 = v3.updated(0, v9)
    var v24: Vector[Double] = v8
    v3 = v3.updated(0, v7)
    var v36: Double = v9
    val v25: Vector[Double] = Vector(v7, v36, v36, v15, v9)
    val v22: Double = v25(3)
    var v35: Vector[Double] = v25
    var v21: Vector[Vector[Double]] = v0
    val v37: Vector[Vector[Double]] = v13(2)
    val v39: Vector[Double] = v21(1)
    v21 = v21.updated(1, v2)
    val v30: Vector[Vector[Vector[Double]]] = Vector(v12, v12, v37)
    val v56: Vector[Vector[Vector[Vector[Double]]]] = Vector(v30, v30, v30, v30, v30, v30)
    var v84: Vector[Vector[Vector[Vector[Double]]]] = v56
    val v121: Double = v25(0)
    val v75: Double = v35(3)
    val v130: Vector[Vector[Double]] = v30(1)
    var v68: Vector[Vector[Vector[Vector[Double]]]] = v84
    v8 = v8.updated(0, v22)
    var v212: Vector[Vector[Vector[Vector[Double]]]] = v68
    v10 = v10.updated(0, v39)
    var v146: Vector[Vector[Double]] = v130
    var v74: Vector[Vector[Vector[Vector[Double]]]] = v212
    val v383: Vector[Vector[Vector[Double]]] = v74(5)
    v8 = v8.updated(0, v75)
    v10 = v146
    v10 = v10.updated(0, v24)
    v35 = v35.updated(1, v121)
    val v190: Vector[Vector[Double]] = v383(1)
    v190
  }
  @noinline
  def f0(v0: Vector[Vector[Double]], v1: Double): Double = {
    val v2: Vector[Vector[Double]] = f8(v0, v0)
    val v4: Vector[Double] = v2(1)
    val v8: Vector[Vector[Double]] = f16(v2)
    var v5: Vector[Vector[Double]] = v2
    val v29: Vector[Double] = v5(1)
    val v25: Double = f14(v1)
    val v11: Vector[Double] = v8(1)
    var v10: Double = v25
    val v40: Double = f14(v10)
    val v35: Double = v4(0)
    v5 = v5.updated(1, v4)
    var v65: Vector[Double] = v29
    val v36: Double = v65(0)
    v65 = v11
    val v244: Vector[Double] = Vector(v35, v40, v36, v1)
    var v90: Vector[Double] = v244
    val v209: Double = v90(1)
    v209
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