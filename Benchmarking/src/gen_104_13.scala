import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  def f116(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v5: Vector[Vector[Vector[Double]]] = Vector(v0, v0, v0, v0, v0, v0, v0)
    val v1: Vector[Double] = v0(0)
    var v6: Vector[Double] = v1
    var v8: Vector[Double] = v6
    val v3: Double = v8(0)
    val v2: Vector[Vector[Double]] = v5(3)
    val v7: Vector[Vector[Double]] = v5(2)
    var v4: Vector[Vector[Vector[Double]]] = v5
    v6 = v6.updated(0, v3)
    v8 = v8.updated(0, v3)
    val v9: Vector[Double] = v7(0)
    var v13: Vector[Vector[Double]] = v2
    val v10: Double = v6(0)
    var v14: Vector[Double] = v1
    v4 = v5
    val v18: Double = v9(0)
    var v16: Double = v10
    val v21: Vector[Vector[Double]] = v4(0)
    var v27: Vector[Vector[Double]] = v21
    v8 = v8.updated(0, v16)
    var v25: Double = v18
    var v41: Vector[Vector[Double]] = v2
    v41 = v41.updated(0, v6)
    var v24: Vector[Vector[Double]] = v41
    v27 = v27.updated(0, v1)
    var v28: Vector[Vector[Vector[Double]]] = v4
    v4 = v28
    val v19: Vector[Double] = v21(0)
    var v26: Vector[Vector[Vector[Double]]] = v4
    v26 = v26.updated(3, v13)
    v8 = v8.updated(0, v18)
    var v34: Vector[Double] = v9
    val v31: Double = v1(0)
    v41 = v41.updated(0, v9)
    val v60: Double = v10 - v16
    val v22: Double = v34(0)
    var v43: Vector[Vector[Vector[Double]]] = v28
    v34 = v8
    var v45: Vector[Vector[Vector[Double]]] = v5
    var v32: Vector[Vector[Vector[Double]]] = v4
    val v37: Double = v1(0)
    var v36: Vector[Vector[Double]] = v24
    var v56: Vector[Vector[Vector[Double]]] = v43
    v27 = v27.updated(0, v14)
    var v62: Vector[Vector[Vector[Double]]] = v56
    v34 = v1
    v41 = v2
    var v169: Vector[Double] = v19
    var v80: Vector[Vector[Double]] = v27
    val v66: Vector[Double] = v80(0)
    var v53: Double = v18
    var v69: Vector[Vector[Vector[Double]]] = v45
    val v92: Double = v66(0)
    var v68: Vector[Double] = v34
    v34 = v34.updated(0, v92)
    val v64: Vector[Double] = Vector(v60, v53, v25, v31)
    v56 = v56.updated(4, v36)
    val v46: Double = v16 + v37
    val v65: Double = v64(0)
    val v57: Double = v64(1)
    v27 = v7
    v24 = v24.updated(0, v1)
    val v86: Vector[Vector[Vector[Vector[Double]]]] = Vector(v69, v32, v4, v45, v62, v45)
    v56 = v56.updated(2, v0)
    v169 = v169.updated(0, v46)
    v80 = v80.updated(0, v14)
    var v75: Double = v65
    v13 = v13.updated(0, v34)
    v53 = v57
    val v81: Vector[Vector[Vector[Double]]] = v86(5)
    v43 = v62
    v34 = v34.updated(0, v75)
    v34 = v19
    val v95: Vector[Vector[Double]] = v81(1)
    v169 = v169.updated(0, v22)
    v25 = v16
    v28 = v28.updated(4, v0)
    v4 = v4.updated(0, v21)
    v27 = v27.updated(0, v169)
    v41 = v41.updated(0, v68)
    v45 = v26
    v45 = v45.updated(5, v95)
    v95
  }
  def f110(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v5: Vector[Vector[Double]] = f116(v0)
    var v1: Vector[Vector[Double]] = v5
    var v7: Vector[Vector[Double]] = v1
    val v12: Vector[Vector[Double]] = f116(v7)
    val v4: Vector[Vector[Double]] = f116(v12)
    v1 = v4
    val v2: Vector[Vector[Double]] = f116(v0)
    val v3: Vector[Vector[Double]] = f116(v4)
    var v8: Vector[Vector[Double]] = v0
    var v9: Vector[Vector[Double]] = v12
    val v10: Vector[Double] = v4(0)
    val v23: Vector[Double] = v2(0)
    val v24: Vector[Vector[Double]] = f116(v5)
    var v11: Vector[Double] = v10
    v9 = v9.updated(0, v23)
    val v33: Vector[Double] = v1(0)
    val v49: Vector[Vector[Double]] = f116(v9)
    val v35: Double = v23(0)
    val v40: Vector[Vector[Double]] = f116(v49)
    var v34: Double = v35
    val v48: Double = v10(0)
    var v27: Double = v48
    val v51: Double = v23(0)
    v1 = v1.updated(0, v33)
    val v45: Vector[Double] = v4(0)
    var v75: Vector[Vector[Double]] = v3
    val v30: Vector[Vector[Double]] = f116(v75)
    val v54: Vector[Double] = v8(0)
    v11 = v11.updated(0, v27)
    val v87: Vector[Double] = v8(0)
    val v73: Vector[Vector[Double]] = f116(v4)
    v27 = v34
    var v114: Vector[Vector[Double]] = v73
    val v118: Vector[Vector[Double]] = f116(v30)
    val v65: Vector[Double] = v4(0)
    v27 = v51
    var v77: Vector[Vector[Double]] = v114
    val v91: Vector[Vector[Double]] = Vector(v11, v65, v87, v23, v45)
    v1 = v1.updated(0, v54)
    val v96: Vector[Vector[Vector[Double]]] = Vector(v9, v24, v40, v77, v118)
    val v81: Vector[Double] = v91(3)
    var v94: Vector[Double] = v81
    v11 = v11.updated(0, v34)
    v27 = v35
    v114 = v114.updated(0, v94)
    val v143: Vector[Vector[Double]] = v96(1)
    v1 = v1.updated(0, v33)
    v143
  }
  def f105(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v9: Vector[Vector[Double]] = f116(v0)
    val v14: Vector[Vector[Double]] = f110(v9)
    val v21: Vector[Vector[Double]] = f116(v14)
    val v29: Vector[Vector[Double]] = f116(v21)
    val v46: Vector[Vector[Double]] = f110(v29)
    val v98: Vector[Vector[Double]] = f116(v46)
    val v66: Vector[Vector[Double]] = f116(v98)
    val v69: Vector[Vector[Double]] = f116(v66)
    val v93: Vector[Vector[Double]] = f116(v69)
    v93
  }
  def f39(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v5: Vector[Vector[Vector[Double]]] = Vector(v0, v0, v0, v0)
    val v7: Vector[Vector[Double]] = f105(v0)
    var v15: Vector[Vector[Vector[Double]]] = v5
    v15 = v15.updated(3, v7)
    val v11: Vector[Vector[Double]] = v5(1)
    val v22: Vector[Double] = v7(0)
    var v42: Vector[Vector[Double]] = v11
    var v36: Vector[Vector[Vector[Double]]] = v15
    v36 = v36.updated(1, v42)
    val v121: Vector[Vector[Double]] = v36(3)
    v42 = v42.updated(0, v22)
    v121
  }
  @noinline
  def f0(v0: Vector[Vector[Double]], v1: Vector[Vector[Double]], v2: Vector[Vector[Double]], v3: Vector[Vector[Double]], v4: Double): Double = {
    val v6: Vector[Vector[Double]] = f39(v2)
    val v11: Vector[Double] = v6(0)
    val v12: Double = v11(0)
    var v15: Double = v12
    val v75: Double = v12 - v15
    v75
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[Double]] = Vector(Vector(0.0), Vector(1.0), Vector(2.0))
    val v1: Vector[Vector[Double]] = Vector(Vector(3.0))
    val v2: Vector[Vector[Double]] = Vector(Vector(4.0))
    val v3: Vector[Vector[Double]] = Vector(Vector(5.0), Vector(6.0), Vector(7.0))
    val v4: Double = 8.0
    val start = nanoTime()
    var result: Double = 8.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}