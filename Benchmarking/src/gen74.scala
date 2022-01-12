import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  def f28(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    var v7: Vector[Vector[Double]] = v0
    var v4: Vector[Vector[Double]] = v0
    var v5: Vector[Vector[Double]] = v7
    val v2: Vector[Double] = v5(0)
    v5 = v5.updated(1, v2)
    var v9: Vector[Vector[Double]] = v5
    val v10: Vector[Double] = v0(1)
    v9 = v7
    val v8: Vector[Double] = v4(0)
    var v6: Vector[Vector[Double]] = v9
    v4 = v4.updated(1, v8)
    val v17: Vector[Double] = v5(0)
    val v15: Vector[Double] = v9(0)
    v9 = v9.updated(0, v10)
    val v24: Vector[Vector[Double]] = Vector(v10)
    val v59: Vector[Double] = v7(0)
    val v16: Vector[Double] = v7(0)
    v6 = v6.updated(0, v17)
    val v25: Vector[Double] = v5(1)
    var v29: Vector[Vector[Double]] = v24
    var v28: Vector[Vector[Double]] = v5
    v28 = v28.updated(1, v59)
    val v45: Vector[Double] = v29(0)
    var v27: Vector[Double] = v10
    v6 = v6.updated(0, v25)
    val v98: Double = v8(0)
    var v49: Vector[Vector[Double]] = v0
    val v51: Vector[Vector[Vector[Double]]] = Vector(v6, v5, v6, v28, v4, v49)
    v27 = v27.updated(0, v98)
    val v70: Vector[Vector[Double]] = v51(5)
    v4 = v4.updated(1, v15)
    v5 = v5.updated(0, v16)
    v49 = v49.updated(1, v45)
    v49 = v49.updated(1, v27)
    var v132: Vector[Double] = v15
    v49 = v49.updated(1, v132)
    v70
  }
  def f26(v0: Vector[Vector[Double]], v1: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v5: Vector[Vector[Double]] = f28(v0)
    val v3: Vector[Double] = v1(0)
    val v7: Vector[Vector[Double]] = f28(v5)
    val v6: Vector[Vector[Double]] = f28(v7)
    val v4: Vector[Double] = v7(1)
    var v2: Vector[Double] = v4
    val v10: Double = v3(0)
    var v8: Vector[Vector[Double]] = v7
    var v15: Double = v10
    v2 = v2.updated(0, v15)
    val v21: Vector[Vector[Double]] = f28(v7)
    var v47: Vector[Double] = v2
    v8 = v8.updated(0, v47)
    var v19: Vector[Double] = v3
    val v66: Vector[Double] = v6(0)
    val v36: Vector[Double] = v21(0)
    v2 = v19
    v8 = v8.updated(0, v66)
    val v56: Vector[Double] = v8(1)
    var v43: Vector[Vector[Double]] = v1
    v8 = v8.updated(1, v36)
    v43 = v43.updated(0, v2)
    v43 = v43.updated(1, v56)
    v43
  }
  def f23(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v6: Vector[Double] = v0(1)
    val v4: Vector[Double] = v0(0)
    val v1: Vector[Vector[Double]] = Vector(v4, v4, v6, v6, v4, v4)
    var v5: Vector[Vector[Double]] = v1
    v5 = v5.updated(1, v4)
    val v9: Vector[Double] = v1(5)
    v5 = v5.updated(5, v6)
    val v10: Vector[Vector[Double]] = f26(v0, v0)
    val v21: Vector[Vector[Double]] = f26(v10, v10)
    val v18: Vector[Vector[Double]] = f26(v10, v21)
    var v15: Vector[Vector[Double]] = v0
    var v17: Vector[Double] = v9
    val v19: Vector[Double] = v0(1)
    var v27: Vector[Vector[Double]] = v15
    var v14: Vector[Vector[Double]] = v0
    var v20: Vector[Vector[Double]] = v14
    val v28: Vector[Vector[Vector[Double]]] = Vector(v27, v18, v27, v0, v27)
    var v34: Vector[Vector[Double]] = v21
    val v23: Vector[Double] = v1(4)
    var v44: Vector[Vector[Vector[Double]]] = v28
    val v25: Vector[Vector[Double]] = f28(v34)
    v44 = v44.updated(2, v21)
    var v29: Vector[Vector[Vector[Double]]] = v44
    var v60: Vector[Vector[Double]] = v5
    val v46: Vector[Vector[Double]] = v28(3)
    val v47: Vector[Vector[Double]] = v29(0)
    v29 = v29.updated(3, v46)
    v5 = v5.updated(1, v17)
    v15 = v47
    val v102: Vector[Vector[Double]] = f26(v25, v46)
    v34 = v34.updated(1, v23)
    val v87: Vector[Double] = v60(5)
    v34 = v34.updated(1, v19)
    val v113: Vector[Double] = v5(5)
    v60 = v60.updated(3, v113)
    val v83: Vector[Vector[Double]] = f26(v34, v102)
    v29 = v29.updated(4, v20)
    v15 = v15.updated(1, v17)
    v14 = v14.updated(1, v87)
    val v179: Vector[Vector[Double]] = f26(v102, v83)
    v179
  }
  def f19(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    var v7: Vector[Vector[Double]] = v0
    val v1: Vector[Vector[Double]] = f28(v0)
    val v18: Vector[Vector[Double]] = f28(v1)
    val v8: Vector[Vector[Double]] = f26(v0, v0)
    val v24: Vector[Vector[Double]] = f23(v8)
    val v15: Vector[Vector[Double]] = f28(v7)
    val v17: Vector[Vector[Vector[Double]]] = Vector(v0, v7, v15, v18, v24, v7)
    var v100: Vector[Vector[Vector[Double]]] = v17
    val v52: Vector[Vector[Double]] = v100(2)
    val v114: Vector[Vector[Double]] = f28(v52)
    var v70: Vector[Vector[Double]] = v114
    v70
  }
  def f15(v0: Double): Double = {
    val v3: Double = v0 * v0
    var v7: Double = v0
    val v6: Vector[Double] = Vector(v3)
    var v5: Double = v0
    var v4: Vector[Double] = v6
    val v1: Double = v6(0)
    val v8: Double = v4(0)
    var v2: Vector[Double] = v6
    var v13: Double = v1
    val v9: Double = v5 / v13
    v2 = v2.updated(0, v9)
    v2 = v2.updated(0, v8)
    v2 = v2.updated(0, v8)
    var v10: Double = v13
    v4 = v4.updated(0, v9)
    val v12: Double = v2(0)
    val v20: Double = v4(0)
    v4 = v4.updated(0, v8)
    var v28: Vector[Double] = v6
    var v27: Double = v7
    val v36: Double = v2(0)
    var v19: Double = v12
    val v59: Double = v6(0)
    var v16: Vector[Double] = v28
    val v43: Double = v16(0)
    var v26: Double = v7
    var v34: Double = v27
    val v15: Double = v16(0)
    v16 = v16.updated(0, v43)
    v28 = v28.updated(0, v15)
    v2 = v2.updated(0, v36)
    v4 = v4.updated(0, v43)
    val v45: Double = v36 - v36
    val v40: Double = v6(0)
    v10 = v27
    val v42: Vector[Vector[Double]] = Vector(v16, v6)
    val v31: Vector[Vector[Double]] = f28(v42)
    val v25: Vector[Vector[Double]] = f19(v42)
    val v41: Vector[Double] = Vector(v10, v20, v19, v45, v59, v40)
    val v21: Vector[Vector[Double]] = f19(v31)
    v16 = v16.updated(0, v9)
    v2 = v2.updated(0, v20)
    var v58: Double = v45
    val v44: Vector[Vector[Double]] = f26(v21, v25)
    val v80: Vector[Double] = Vector(v8, v43, v26, v36, v34, v13)
    val v50: Vector[Double] = v44(1)
    val v82: Double = v80(3)
    var v81: Vector[Double] = v41
    v7 = v58
    val v64: Double = v50(0)
    v16 = v16.updated(0, v64)
    var v143: Vector[Double] = v81
    v4 = v4.updated(0, v82)
    val v138: Double = v143(0)
    v138
  }
  @noinline
  def f0(v0: Vector[Vector[Double]], v1: Vector[Vector[Double]], v2: Vector[Vector[Double]], v3: Double): Double = {
    val v5: Vector[Double] = v2(1)
    var v6: Vector[Vector[Double]] = v1
    var v18: Vector[Vector[Double]] = v6
    val v8: Vector[Double] = v2(1)
    v18 = v18.updated(0, v5)
    var v13: Double = v3
    val v7: Vector[Double] = v18(0)
    val v14: Double = v5(0)
    val v16: Double = v7(0)
    v18 = v18.updated(0, v7)
    val v26: Vector[Vector[Double]] = f23(v2)
    var v9: Double = v13
    v6 = v6.updated(0, v7)
    val v69: Vector[Double] = Vector(v14, v16, v3, v9, v14, v16)
    val v28: Vector[Double] = v26(1)
    v18 = v18.updated(0, v8)
    v18 = v18.updated(0, v28)
    val v33: Double = v69(1)
    v13 = v9
    val v100: Double = f15(v33)
    var v62: Vector[Double] = v69
    v18 = v1
    val v54: Double = v62(5)
    var v65: Double = v54
    v62 = v62.updated(0, v100)
    v65
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[Double]] = Vector(Vector(0.0), Vector(1.0))
    val v1: Vector[Vector[Double]] = Vector(Vector(2.0))
    val v2: Vector[Vector[Double]] = Vector(Vector(3.0), Vector(4.0))
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